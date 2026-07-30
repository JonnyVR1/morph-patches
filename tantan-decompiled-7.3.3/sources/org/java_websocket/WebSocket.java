package org.java_websocket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;

/* JADX INFO: loaded from: classes3.dex */
public interface WebSocket {
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_WSS_PORT = 443;

    public enum READYSTATE {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public enum Role {
        CLIENT,
        SERVER
    }

    void close();

    void close(int i);

    void close(int i, String str);

    void closeConnection(int i, String str);

    <T> T getAttachment();

    Draft getDraft();

    InetSocketAddress getLocalSocketAddress();

    READYSTATE getReadyState();

    InetSocketAddress getRemoteSocketAddress();

    String getResourceDescriptor();

    boolean hasBufferedData();

    boolean isClosed();

    boolean isClosing();

    boolean isConnecting();

    boolean isFlushAndClose();

    boolean isOpen();

    void send(String str) throws NotYetConnectedException;

    void send(ByteBuffer byteBuffer) throws NotYetConnectedException, IllegalArgumentException;

    void send(byte[] bArr) throws NotYetConnectedException, IllegalArgumentException;

    void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z);

    void sendFrame(Collection<Framedata> collection);

    void sendFrame(Framedata framedata);

    void sendPing() throws NotYetConnectedException;

    <T> void setAttachment(T t);
}
