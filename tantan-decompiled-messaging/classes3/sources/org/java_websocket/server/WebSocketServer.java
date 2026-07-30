package org.java_websocket.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.ig3;
import l.qkq0;
import l.x9g0;
import org.java_websocket.AbstractWebSocket;
import org.java_websocket.SocketChannelIOHelper;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketAdapter;
import org.java_websocket.WebSocketFactory;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.WebSocketServerFactory;
import org.java_websocket.WrappedByteChannel;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshakeBuilder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class WebSocketServer extends AbstractWebSocket implements Runnable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static int DECODERS = Runtime.getRuntime().availableProcessors();
    private final InetSocketAddress address;
    private BlockingQueue<ByteBuffer> buffers;
    private final Collection<WebSocket> connections;
    protected List<WebSocketWorker> decoders;
    private List<Draft> drafts;
    private List<WebSocketImpl> iqueue;
    private final AtomicBoolean isclosed;
    private int queueinvokes;
    private final AtomicInteger queuesize;
    private Selector selector;
    private Thread selectorthread;
    private ServerSocketChannel server;
    private WebSocketServerFactory wsf;

    public class WebSocketWorker extends Thread {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private BlockingQueue<WebSocketImpl> iqueue = new LinkedBlockingQueue();

        public WebSocketWorker() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.java_websocket.server.WebSocketServer.WebSocketWorker.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    System.err.print("Uncaught exception in thread \"" + thread.getName() + "\":");
                    th.printStackTrace(System.err);
                }
            });
        }

        public void put(WebSocketImpl webSocketImpl) throws InterruptedException {
            this.iqueue.put(webSocketImpl);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WebSocketImpl webSocketImplTake;
            RuntimeException e;
            WebSocketImpl webSocketImpl = null;
            while (true) {
                try {
                    try {
                        webSocketImplTake = this.iqueue.take();
                        try {
                            ByteBuffer byteBufferPoll = webSocketImplTake.inQueue.poll();
                            try {
                                try {
                                    webSocketImplTake.decode(byteBufferPoll);
                                } catch (Exception e2) {
                                    System.err.println("Error while reading from remote connection: " + e2);
                                    e2.printStackTrace();
                                }
                                WebSocketServer.this.pushBuffer(byteBufferPoll);
                                webSocketImpl = webSocketImplTake;
                            } catch (Throwable th) {
                                WebSocketServer.this.pushBuffer(byteBufferPoll);
                                throw th;
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                            WebSocketServer.this.handleFatal(webSocketImplTake, e);
                            return;
                        }
                    } catch (RuntimeException e4) {
                        webSocketImplTake = webSocketImpl;
                        e = e4;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<WebSocket> collection) {
        this.isclosed = new AtomicBoolean(false);
        this.queueinvokes = 0;
        this.queuesize = new AtomicInteger(0);
        this.wsf = new DefaultWebSocketServerFactory();
        if (inetSocketAddress == null || i < 1 || collection == null) {
            ig3.a("address and connectionscontainer must not be null and you need at least 1 decoder");
            throw null;
        }
        if (list == null) {
            this.drafts = Collections.EMPTY_LIST;
        } else {
            this.drafts = list;
        }
        this.address = inetSocketAddress;
        this.connections = collection;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.iqueue = new LinkedList();
        this.decoders = new ArrayList(i);
        this.buffers = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            WebSocketWorker webSocketWorker = new WebSocketWorker();
            this.decoders.add(webSocketWorker);
            webSocketWorker.start();
        }
    }

    private Socket getSocket(WebSocket webSocket) {
        return ((SocketChannel) ((WebSocketImpl) webSocket).key.channel()).socket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFatal(WebSocket webSocket, Exception exc) {
        onError(webSocket, exc);
        List<WebSocketWorker> list = this.decoders;
        if (list != null) {
            Iterator<WebSocketWorker> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.selectorthread;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            stop();
        } catch (IOException e) {
            onError(null, e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            onError(null, e2);
        }
    }

    private void handleIOException(SelectionKey selectionKey, WebSocket webSocket, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (webSocket != null) {
            webSocket.closeConnection(CloseFrame.ABNORMAL_CLOSE, iOException.getMessage());
            return;
        }
        if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
            return;
        }
        try {
            selectableChannelChannel.close();
        } catch (IOException unused) {
        }
        if (WebSocketImpl.DEBUG) {
            System.out.println("Connection closed because of " + iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushBuffer(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.buffers.size() > this.queuesize.intValue()) {
            return;
        }
        this.buffers.put(byteBuffer);
    }

    private ByteBuffer takeBuffer() throws InterruptedException {
        return this.buffers.take();
    }

    public boolean addConnection(WebSocket webSocket) {
        boolean zAdd;
        if (this.isclosed.get()) {
            webSocket.close(1001);
            return true;
        }
        synchronized (this.connections) {
            zAdd = this.connections.add(webSocket);
        }
        return zAdd;
    }

    public void allocateBuffers(WebSocket webSocket) throws InterruptedException {
        if (this.queuesize.get() >= (this.decoders.size() * 2) + 1) {
            return;
        }
        this.queuesize.incrementAndGet();
        this.buffers.put(createBuffer());
    }

    public void broadcast(byte[] bArr, Collection<WebSocket> collection) {
        if (bArr == null || collection == null) {
            x9g0.a();
            return;
        }
        HashMap map = new HashMap();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        synchronized (collection) {
            for (WebSocket webSocket : collection) {
                if (webSocket != null) {
                    Draft draft = webSocket.getDraft();
                    if (!map.containsKey(draft)) {
                        map.put(draft, draft.createFrames(byteBufferWrap, false));
                    }
                    try {
                        webSocket.sendFrame((Collection<Framedata>) map.get(draft));
                    } catch (WebsocketNotConnectedException unused) {
                    }
                }
            }
        }
    }

    @Deprecated
    public Collection<WebSocket> connections() {
        return getConnections();
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(WebSocketImpl.RCVBUF);
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<WebSocket> getConnections() {
        return Collections.unmodifiableCollection(new ArrayList(this.connections));
    }

    public List<Draft> getDraft() {
        return Collections.unmodifiableList(this.drafts);
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) getSocket(webSocket).getLocalSocketAddress();
    }

    public int getPort() {
        ServerSocketChannel serverSocketChannel;
        int port = getAddress().getPort();
        return (port != 0 || (serverSocketChannel = this.server) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    @Override // org.java_websocket.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        return (InetSocketAddress) getSocket(webSocket).getRemoteSocketAddress();
    }

    public final WebSocketFactory getWebSocketFactory() {
        return this.wsf;
    }

    public abstract void onClose(WebSocket webSocket, int i, String str, boolean z);

    public void onCloseInitiated(WebSocket webSocket, int i, String str) {
    }

    public void onClosing(WebSocket webSocket, int i, String str, boolean z) {
    }

    public boolean onConnect(SelectionKey selectionKey) {
        return true;
    }

    public abstract void onError(WebSocket webSocket, Exception exc);

    @Deprecated
    public void onFragment(WebSocket webSocket, Framedata framedata) {
    }

    public abstract void onMessage(WebSocket webSocket, String str);

    public void onMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(WebSocket webSocket, ClientHandshake clientHandshake);

    public abstract void onStart();

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        this.selector.wakeup();
        try {
            if (removeConnection(webSocket)) {
                onClose(webSocket, i, str, z);
            }
        } finally {
            try {
                releaseBuffers(webSocket);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(webSocket, i, str);
    }

    @Override // org.java_websocket.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(webSocket, i, str, z);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(webSocket, exc);
    }

    @Override // org.java_websocket.WebSocketAdapter, org.java_websocket.WebSocketListener
    public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, ClientHandshake clientHandshake) throws InvalidDataException {
        return super.onWebsocketHandshakeReceivedAsServer(webSocket, draft, clientHandshake);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(webSocket, str);
    }

    @Override // org.java_websocket.WebSocketAdapter, org.java_websocket.WebSocketListener
    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        onFragment(webSocket, framedata);
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        if (addConnection(webSocket)) {
            onOpen(webSocket, (ClientHandshake) handshakedata);
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
        WebSocketImpl webSocketImpl = (WebSocketImpl) webSocket;
        try {
            webSocketImpl.key.interestOps(5);
        } catch (CancelledKeyException unused) {
            webSocketImpl.outQueue.clear();
        }
        this.selector.wakeup();
    }

    public void queue(WebSocketImpl webSocketImpl) throws InterruptedException {
        if (webSocketImpl.workerThread == null) {
            List<WebSocketWorker> list = this.decoders;
            webSocketImpl.workerThread = list.get(this.queueinvokes % list.size());
            this.queueinvokes++;
        }
        webSocketImpl.workerThread.put(webSocketImpl);
    }

    public void releaseBuffers(WebSocket webSocket) throws InterruptedException {
    }

    public boolean removeConnection(WebSocket webSocket) {
        boolean zRemove;
        synchronized (this.connections) {
            try {
                if (this.connections.contains(webSocket)) {
                    zRemove = this.connections.remove(webSocket);
                } else {
                    if (WebSocketImpl.DEBUG) {
                        System.out.println("Removing connection which is not in the connections collection! Possible no handshake recieved! " + webSocket);
                    }
                    zRemove = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.isclosed.get() && this.connections.size() == 0) {
            this.selectorthread.interrupt();
        }
        return zRemove;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0221 A[Catch: all -> 0x0095, RuntimeException -> 0x0098, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x0098, blocks: (B:16:0x006e, B:19:0x0078, B:22:0x0081, B:24:0x008a, B:26:0x0092, B:33:0x00a0, B:35:0x00ac, B:37:0x00b2, B:38:0x00b8, B:41:0x00bf, B:43:0x00c6, B:45:0x00cc, B:49:0x00d5, B:52:0x00de, B:53:0x00ff, B:56:0x010f, B:58:0x0113, B:59:0x0116, B:62:0x011e, B:64:0x0124, B:65:0x012a, B:67:0x0132, B:71:0x0142, B:73:0x0148, B:75:0x014e, B:77:0x015f, B:79:0x0167, B:88:0x017c, B:90:0x0182, B:91:0x0188, B:93:0x0190, B:95:0x0196, B:139:0x0221, B:140:0x0224, B:82:0x016f, B:83:0x0173, B:85:0x0177, B:86:0x017a, B:102:0x01a6, B:104:0x01ae, B:105:0x01b6, B:106:0x01be, B:108:0x01c4, B:111:0x01cc, B:113:0x01d2, B:114:0x01db, B:116:0x01e0, B:117:0x01e3), top: B:220:0x006e, outer: #15 }] */
    @Override // java.lang.Runnable
    public void run() {
        ServerSocketChannel serverSocketChannel;
        SelectionKey next;
        WebSocket webSocket;
        WebSocketImpl webSocketImpl;
        synchronized (this) {
            try {
                if (this.selectorthread != null) {
                    throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
                }
                this.selectorthread = Thread.currentThread();
                if (this.isclosed.get()) {
                    return;
                }
                this.selectorthread.setName("WebSocketSelector-" + this.selectorthread.getId());
                try {
                    ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                    this.server = serverSocketChannelOpen;
                    serverSocketChannelOpen.configureBlocking(false);
                    ServerSocket serverSocketSocket = this.server.socket();
                    serverSocketSocket.setReceiveBufferSize(WebSocketImpl.RCVBUF);
                    serverSocketSocket.setReuseAddress(isReuseAddr());
                    serverSocketSocket.bind(this.address);
                    Selector selectorOpen = Selector.open();
                    this.selector = selectorOpen;
                    ServerSocketChannel serverSocketChannel2 = this.server;
                    serverSocketChannel2.register(selectorOpen, serverSocketChannel2.validOps());
                    startConnectionLostTimer();
                    onStart();
                    int i = 5;
                    int i2 = 0;
                    while (!this.selectorthread.isInterrupted() && i != 0) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.isclosed.get()) {
                                                i2 = 5;
                                            }
                                            if (this.selector.select(i2) == 0 && this.isclosed.get()) {
                                                i--;
                                            }
                                            Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                                            next = null;
                                            webSocket = null;
                                            while (it.hasNext()) {
                                                try {
                                                    next = it.next();
                                                    try {
                                                        if (next.isValid()) {
                                                            if (!next.isAcceptable()) {
                                                                if (next.isReadable()) {
                                                                    webSocketImpl = (WebSocketImpl) next.attachment();
                                                                    try {
                                                                        ByteBuffer byteBufferTakeBuffer = takeBuffer();
                                                                        ByteChannel byteChannel = webSocketImpl.channel;
                                                                        if (byteChannel == null) {
                                                                            next.cancel();
                                                                            handleIOException(next, webSocketImpl, new IOException());
                                                                        } else {
                                                                            try {
                                                                                if (SocketChannelIOHelper.read(byteBufferTakeBuffer, webSocketImpl, byteChannel) && byteBufferTakeBuffer.hasRemaining()) {
                                                                                    webSocketImpl.inQueue.put(byteBufferTakeBuffer);
                                                                                    queue(webSocketImpl);
                                                                                    it.remove();
                                                                                    ByteChannel byteChannel2 = webSocketImpl.channel;
                                                                                    if ((byteChannel2 instanceof WrappedByteChannel) && ((WrappedByteChannel) byteChannel2).isNeedRead()) {
                                                                                        this.iqueue.add(webSocketImpl);
                                                                                    }
                                                                                } else {
                                                                                    pushBuffer(byteBufferTakeBuffer);
                                                                                }
                                                                            } catch (IOException e) {
                                                                                pushBuffer(byteBufferTakeBuffer);
                                                                                throw e;
                                                                            }
                                                                        }
                                                                        webSocket = webSocketImpl;
                                                                    } catch (IOException e2) {
                                                                        e = e2;
                                                                        webSocket = webSocketImpl;
                                                                        next = next;
                                                                        if (next != null) {
                                                                            next.cancel();
                                                                        }
                                                                        handleIOException(next, webSocket, e);
                                                                    }
                                                                } else {
                                                                    webSocketImpl = null;
                                                                }
                                                                if (next.isWritable()) {
                                                                    WebSocketImpl webSocketImpl2 = (WebSocketImpl) next.attachment();
                                                                    try {
                                                                        if (SocketChannelIOHelper.batch(webSocketImpl2, webSocketImpl2.channel) && next.isValid()) {
                                                                            next.interestOps(1);
                                                                        }
                                                                        webSocket = webSocketImpl2;
                                                                    } catch (IOException e3) {
                                                                        e = e3;
                                                                        next = next;
                                                                        webSocket = webSocketImpl2;
                                                                        if (next != null) {
                                                                            next.cancel();
                                                                        }
                                                                        handleIOException(next, webSocket, e);
                                                                    }
                                                                } else {
                                                                    webSocket = webSocketImpl;
                                                                }
                                                            } else if (onConnect(next)) {
                                                                SocketChannel socketChannelAccept = this.server.accept();
                                                                if (socketChannelAccept != null) {
                                                                    socketChannelAccept.configureBlocking(false);
                                                                    Socket socket = socketChannelAccept.socket();
                                                                    socket.setTcpNoDelay(isTcpNoDelay());
                                                                    socket.setKeepAlive(true);
                                                                    WebSocketImpl webSocketImplCreateWebSocket = this.wsf.createWebSocket((WebSocketAdapter) this, this.drafts);
                                                                    SelectionKey selectionKeyRegister = socketChannelAccept.register(this.selector, 1, webSocketImplCreateWebSocket);
                                                                    webSocketImplCreateWebSocket.key = selectionKeyRegister;
                                                                    try {
                                                                        webSocketImplCreateWebSocket.channel = this.wsf.wrapChannel(socketChannelAccept, selectionKeyRegister);
                                                                        it.remove();
                                                                        allocateBuffers(webSocketImplCreateWebSocket);
                                                                    } catch (IOException e4) {
                                                                        SelectionKey selectionKey = webSocketImplCreateWebSocket.key;
                                                                        if (selectionKey != null) {
                                                                            selectionKey.cancel();
                                                                        }
                                                                        handleIOException(webSocketImplCreateWebSocket.key, null, e4);
                                                                    }
                                                                }
                                                            } else {
                                                                next.cancel();
                                                            }
                                                        }
                                                        webSocket = null;
                                                    } catch (IOException e5) {
                                                        e = e5;
                                                        webSocket = null;
                                                    }
                                                } catch (IOException e6) {
                                                    e = e6;
                                                }
                                            }
                                            while (!this.iqueue.isEmpty()) {
                                                WebSocketImpl webSocketImplRemove = this.iqueue.remove(0);
                                                try {
                                                    WrappedByteChannel wrappedByteChannel = (WrappedByteChannel) webSocketImplRemove.channel;
                                                    ByteBuffer byteBufferTakeBuffer2 = takeBuffer();
                                                    try {
                                                        if (SocketChannelIOHelper.readMore(byteBufferTakeBuffer2, webSocketImplRemove, wrappedByteChannel)) {
                                                            this.iqueue.add(webSocketImplRemove);
                                                        }
                                                        if (byteBufferTakeBuffer2.hasRemaining()) {
                                                            webSocketImplRemove.inQueue.put(byteBufferTakeBuffer2);
                                                            queue(webSocketImplRemove);
                                                        } else {
                                                            pushBuffer(byteBufferTakeBuffer2);
                                                        }
                                                    } catch (IOException e7) {
                                                        pushBuffer(byteBufferTakeBuffer2);
                                                        throw e7;
                                                    }
                                                } catch (IOException e8) {
                                                    webSocket = webSocketImplRemove;
                                                    e = e8;
                                                    if (next != null) {
                                                        next.cancel();
                                                    }
                                                    handleIOException(next, webSocket, e);
                                                }
                                            }
                                        } catch (ClosedByInterruptException unused) {
                                            stopConnectionLostTimer();
                                            List<WebSocketWorker> list = this.decoders;
                                            if (list != null) {
                                                Iterator<WebSocketWorker> it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    it2.next().interrupt();
                                                }
                                            }
                                            Selector selector = this.selector;
                                            if (selector != null) {
                                                try {
                                                    selector.close();
                                                } catch (IOException e9) {
                                                    onError(null, e9);
                                                }
                                            }
                                            serverSocketChannel = this.server;
                                            if (serverSocketChannel == null) {
                                                return;
                                            }
                                        }
                                    } catch (IOException e10) {
                                        e = e10;
                                        next = null;
                                        webSocket = null;
                                    }
                                } catch (InterruptedException unused2) {
                                    stopConnectionLostTimer();
                                    List<WebSocketWorker> list2 = this.decoders;
                                    if (list2 != null) {
                                        Iterator<WebSocketWorker> it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            it3.next().interrupt();
                                        }
                                    }
                                    Selector selector2 = this.selector;
                                    if (selector2 != null) {
                                        try {
                                            selector2.close();
                                        } catch (IOException e11) {
                                            onError(null, e11);
                                        }
                                    }
                                    serverSocketChannel = this.server;
                                    if (serverSocketChannel == null) {
                                        return;
                                    }
                                } catch (CancelledKeyException unused3) {
                                }
                            } catch (RuntimeException e12) {
                                handleFatal(null, e12);
                                stopConnectionLostTimer();
                                List<WebSocketWorker> list3 = this.decoders;
                                if (list3 != null) {
                                    Iterator<WebSocketWorker> it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        it4.next().interrupt();
                                    }
                                }
                                Selector selector3 = this.selector;
                                if (selector3 != null) {
                                    try {
                                        selector3.close();
                                    } catch (IOException e13) {
                                        onError(null, e13);
                                    }
                                }
                                serverSocketChannel = this.server;
                                if (serverSocketChannel == null) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            stopConnectionLostTimer();
                            List<WebSocketWorker> list4 = this.decoders;
                            if (list4 != null) {
                                Iterator<WebSocketWorker> it5 = list4.iterator();
                                while (it5.hasNext()) {
                                    it5.next().interrupt();
                                }
                            }
                            Selector selector4 = this.selector;
                            if (selector4 != null) {
                                try {
                                    selector4.close();
                                } catch (IOException e14) {
                                    onError(null, e14);
                                }
                            }
                            ServerSocketChannel serverSocketChannel3 = this.server;
                            if (serverSocketChannel3 == null) {
                                throw th;
                            }
                            try {
                                serverSocketChannel3.close();
                                throw th;
                            } catch (IOException e15) {
                                onError(null, e15);
                                throw th;
                            }
                        }
                    }
                    stopConnectionLostTimer();
                    List<WebSocketWorker> list5 = this.decoders;
                    if (list5 != null) {
                        Iterator<WebSocketWorker> it6 = list5.iterator();
                        while (it6.hasNext()) {
                            it6.next().interrupt();
                        }
                    }
                    Selector selector5 = this.selector;
                    if (selector5 != null) {
                        try {
                            selector5.close();
                        } catch (IOException e16) {
                            onError(null, e16);
                        }
                    }
                    serverSocketChannel = this.server;
                    if (serverSocketChannel == null) {
                        return;
                    }
                    try {
                        serverSocketChannel.close();
                    } catch (IOException e17) {
                        onError(null, e17);
                    }
                } catch (IOException e18) {
                    handleFatal(null, e18);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setWebSocketFactory(WebSocketServerFactory webSocketServerFactory) {
        this.wsf = webSocketServerFactory;
    }

    public void start() {
        if (this.selectorthread == null) {
            new Thread(this).start();
        } else {
            qkq0.a(getClass().getName().concat(" can only be started once."));
        }
    }

    public void stop(int i) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.isclosed.compareAndSet(false, true)) {
            synchronized (this.connections) {
                arrayList = new ArrayList(this.connections);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((WebSocket) it.next()).close(1001);
            }
            this.wsf.close();
            synchronized (this) {
                try {
                    if (this.selectorthread != null && (selector = this.selector) != null) {
                        selector.wakeup();
                        this.selectorthread.join(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.java_websocket.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(webSocket, byteBuffer);
    }

    public void broadcast(byte[] bArr) {
        broadcast(bArr, this.connections);
    }

    public void broadcast(String str) {
        broadcast(str, this.connections);
    }

    public void broadcast(String str, Collection<WebSocket> collection) {
        if (str != null && collection != null) {
            HashMap map = new HashMap();
            synchronized (collection) {
                for (WebSocket webSocket : collection) {
                    if (webSocket != null) {
                        Draft draft = webSocket.getDraft();
                        if (!map.containsKey(draft)) {
                            map.put(draft, draft.createFrames(str, false));
                        }
                        try {
                            webSocket.sendFrame((Collection<Framedata>) map.get(draft));
                        } catch (WebsocketNotConnectedException unused) {
                        }
                    }
                }
            }
            return;
        }
        x9g0.a();
    }

    public void stop() throws InterruptedException, IOException {
        stop(0);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, DECODERS, null);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, DECODERS, list);
    }

    public WebSocketServer(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public WebSocketServer() {
        this(new InetSocketAddress(80), DECODERS, null);
    }
}
