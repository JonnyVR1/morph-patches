package org.java_websocket.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.java_websocket.AbstractWebSocket;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;
import p149l.ig3;
import p149l.qhg0;
import p149l.qkq0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebSocketClient extends AbstractWebSocket implements Runnable, WebSocket {
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private int connectTimeout;
    private Draft draft;
    private WebSocketImpl engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    protected URI uri;
    private Thread writeThread;

    public class WebsocketWriteThread implements Runnable {
        private WebsocketWriteThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            while (!Thread.interrupted()) {
                try {
                    try {
                        try {
                            ByteBuffer byteBufferTake = WebSocketClient.this.engine.outQueue.take();
                            WebSocketClient.this.ostream.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                            WebSocketClient.this.ostream.flush();
                        } catch (InterruptedException unused) {
                            for (ByteBuffer byteBuffer : WebSocketClient.this.engine.outQueue) {
                                WebSocketClient.this.ostream.write(byteBuffer.array(), 0, byteBuffer.limit());
                                WebSocketClient.this.ostream.flush();
                            }
                        }
                    } catch (IOException e) {
                        WebSocketClient.this.handleIOException(e);
                    }
                } catch (Throwable th) {
                    WebSocketClient.this.closeSocket();
                    WebSocketClient.this.writeThread = null;
                    throw th;
                }
            }
            WebSocketClient.this.closeSocket();
            WebSocketClient.this.writeThread = null;
        }
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        if (uri == null) {
            x9g0.m207497a();
            throw null;
        }
        if (draft == null) {
            ig3.m135964a("null as draft is permitted for `WebSocketServer` only!");
            throw null;
        }
        this.uri = uri;
        this.draft = draft;
        this.headers = map;
        this.connectTimeout = i;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.engine = new WebSocketImpl(this, draft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSocket() {
        try {
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
    }

    private int getPort() {
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        qhg0.m174539a("unknown scheme: ", scheme);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIOException(IOException iOException) {
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.engine.eot();
    }

    private void reset() {
        try {
            closeBlocking();
            Thread thread = this.writeThread;
            if (thread != null) {
                thread.interrupt();
                this.writeThread = null;
            }
            this.draft.reset();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
                this.socket = null;
            }
            this.connectLatch = new CountDownLatch(1);
            this.closeLatch = new CountDownLatch(1);
            this.engine = new WebSocketImpl(this, this.draft);
        } catch (Exception e) {
            onError(e);
            this.engine.closeConnection(1006, e.getMessage());
        }
    }

    private void sendHandshake() throws InvalidHandshakeException {
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        sb.append(port != 80 ? ":" + port : "");
        String string = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(rawPath);
        handshakeImpl1Client.put("Host", string);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                handshakeImpl1Client.put(entry.getKey(), entry.getValue());
            }
        }
        this.engine.startHandshake(handshakeImpl1Client);
    }

    @Override // org.java_websocket.WebSocket
    public void close() {
        if (this.writeThread != null) {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.closeLatch.await();
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        this.engine.closeConnection(i, str);
    }

    public void connect() {
        if (this.writeThread != null) {
            qkq0.m175383a("WebSocketClient objects are not reuseable");
            return;
        }
        Thread thread = new Thread(this);
        this.writeThread = thread;
        thread.setName("WebSocketConnectReadThread-" + this.writeThread.getId());
        this.writeThread.start();
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    @Override // org.java_websocket.WebSocket
    public <T> T getAttachment() {
        return (T) this.engine.getAttachment();
    }

    public WebSocket getConnection() {
        return this.engine;
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<WebSocket> getConnections() {
        return Collections.singletonList(this.engine);
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.draft;
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        return this.engine.getReadyState();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // org.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public Socket getSocket() {
        return this.socket;
    }

    public URI getURI() {
        return this.uri;
    }

    @Override // org.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return this.engine.hasBufferedData();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        return this.engine.isClosed();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        return this.engine.isClosing();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isConnecting() {
        return this.engine.isConnecting();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.engine.isFlushAndClose();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        return this.engine.isOpen();
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public abstract void onError(Exception exc);

    @Deprecated
    public void onFragment(Framedata framedata) {
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(exc);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(str);
    }

    @Override // org.java_websocket.WebSocketAdapter, org.java_websocket.WebSocketListener
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        onFragment(framedata);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        startConnectionLostTimer();
        onOpen((ServerHandshake) handshakedata);
        this.connectLatch.countDown();
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
    }

    public void reconnect() {
        reset();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        reset();
        return connectBlocking();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int i;
        try {
            Socket socket = this.socket;
            if (socket == null) {
                this.socket = new Socket(this.proxy);
                z = true;
            } else {
                if (socket.isClosed()) {
                    throw new IOException();
                }
                z = false;
            }
            this.socket.setTcpNoDelay(isTcpNoDelay());
            this.socket.setReuseAddress(isReuseAddr());
            if (!this.socket.isBound()) {
                this.socket.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.connectTimeout);
            }
            if (z && "wss".equals(this.uri.getScheme())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.socket = sSLContext.getSocketFactory().createSocket(this.socket, this.uri.getHost(), getPort(), true);
            }
            InputStream inputStream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            sendHandshake();
            Thread thread = new Thread(new WebsocketWriteThread());
            this.writeThread = thread;
            thread.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosing() && !isClosed() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.engine.decode(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    handleIOException(e);
                    return;
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.engine.closeConnection(1006, e2.getMessage());
                    return;
                }
            }
            this.engine.eot();
        } catch (Exception e3) {
            onWebsocketError(this.engine, e3);
            this.engine.closeConnection(-1, e3.getMessage());
        }
    }

    public void send(String str) throws NotYetConnectedException {
        this.engine.send(str);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        this.engine.sendFragmentedFrame(opcode, byteBuffer, z);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        this.engine.sendFrame(framedata);
    }

    @Override // org.java_websocket.WebSocket
    public void sendPing() throws NotYetConnectedException {
        this.engine.sendPing();
    }

    @Override // org.java_websocket.WebSocket
    public <T> void setAttachment(T t) {
        this.engine.setAttachment(t);
    }

    public void setProxy(Proxy proxy) {
        if (proxy != null) {
            this.proxy = proxy;
        } else {
            x9g0.m207497a();
        }
    }

    public void setSocket(Socket socket) {
        if (this.socket == null) {
            this.socket = socket;
        } else {
            qkq0.m175383a("socket has already been set");
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    public void send(byte[] bArr) throws NotYetConnectedException {
        this.engine.send(bArr);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        this.engine.sendFrame(collection);
    }

    @Override // org.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) throws NotYetConnectedException, IllegalArgumentException {
        this.engine.send(byteBuffer);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        this.engine.close();
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i, String str) {
        this.engine.close(i, str);
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.engine.getLocalSocketAddress();
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.engine.getRemoteSocketAddress();
    }

    public WebSocketClient(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    public WebSocketClient(URI uri, Map<String, String> map) {
        this(uri, new Draft_6455(), map);
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map) {
        this(uri, draft, map, 0);
    }

    public WebSocketClient(URI uri) {
        this(uri, new Draft_6455());
    }
}
