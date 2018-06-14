package priv.frame.net.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by zhangkai on 2018/4/26.
 */
public class Server {

    public void start() throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress("127.0.0.1", 9999));

        while (true)
        {
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (null == socketChannel)
            {
                continue;
            }
            System.out.println(socketChannel);
        }
    }

}
