package mina;
//导入包

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class TestHandler extends IoHandlerAdapter {

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		System.out.println("exceptionCaught: " + cause);
	}

	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		System.out.println("recieve : " + (String) message);
		session.write("hello I am server");
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {

	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("sessionClosed");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println("sessionOpen");
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
	}

}

// 作者：Carson_Ho 链接：https:// www.jianshu.com/p/089fb79e308b
// 來源：简书 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。