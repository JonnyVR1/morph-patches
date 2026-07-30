package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SocketChannelIOHelper {
    /* JADX WARN: Code duplicated, block: B:39:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean batch(WebSocketImpl webSocketImpl, ByteChannel byteChannel) throws IOException {
        WrappedByteChannel wrappedByteChannel;
        ByteBuffer byteBufferPeek = webSocketImpl.outQueue.peek();
        if (byteBufferPeek == null) {
            if (byteChannel instanceof WrappedByteChannel) {
                wrappedByteChannel = (WrappedByteChannel) byteChannel;
                if (wrappedByteChannel.isNeedWrite()) {
                    wrappedByteChannel.writeMore();
                }
            }
            if (webSocketImpl.outQueue.isEmpty() && webSocketImpl.isFlushAndClose() && webSocketImpl.getDraft() != null && webSocketImpl.getDraft().getRole() != null && webSocketImpl.getDraft().getRole() == WebSocket.Role.SERVER) {
                synchronized (webSocketImpl) {
                    webSocketImpl.closeConnection();
                }
            }
            return wrappedByteChannel == null || !((WrappedByteChannel) byteChannel).isNeedWrite();
        }
        do {
            byteChannel.write(byteBufferPeek);
            if (byteBufferPeek.remaining() > 0) {
                return false;
            }
            webSocketImpl.outQueue.poll();
            byteBufferPeek = webSocketImpl.outQueue.peek();
        } while (byteBufferPeek != null);
        wrappedByteChannel = null;
        if (webSocketImpl.outQueue.isEmpty()) {
            synchronized (webSocketImpl) {
                webSocketImpl.closeConnection();
            }
        }
        if (wrappedByteChannel == null) {
            return true;
        }
    }

    public static boolean read(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int i = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (i != -1) {
            return i != 0;
        }
        webSocketImpl.eot();
        return false;
    }

    public static boolean readMore(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, WrappedByteChannel wrappedByteChannel) throws IOException {
        byteBuffer.clear();
        int more = wrappedByteChannel.readMore(byteBuffer);
        byteBuffer.flip();
        if (more != -1) {
            return wrappedByteChannel.isNeedRead();
        }
        webSocketImpl.eot();
        return false;
    }
}
