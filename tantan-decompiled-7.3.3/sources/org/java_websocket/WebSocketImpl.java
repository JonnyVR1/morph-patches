package org.java_websocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.util.Charsetfunctions;
import p153l.fig0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class WebSocketImpl implements WebSocket {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static boolean DEBUG = false;
    public static int RCVBUF = 16384;
    private static final Object synchronizeWriteObject = new Object();
    private Object attachment;
    public ByteChannel channel;
    private Integer closecode;
    private Boolean closedremotely;
    private String closemessage;
    private Draft draft;
    private volatile boolean flushandclosestate;
    private ClientHandshake handshakerequest;
    public final BlockingQueue<ByteBuffer> inQueue;
    public SelectionKey key;
    private List<Draft> knownDrafts;
    private long lastPong;
    public final BlockingQueue<ByteBuffer> outQueue;
    private PingFrame pingFrame;
    private WebSocket.READYSTATE readystate;
    private String resourceDescriptor;
    private WebSocket.Role role;
    private ByteBuffer tmpHandshakeBytes;
    public volatile WebSocketServer.WebSocketWorker workerThread;
    private final WebSocketListener wsl;

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft) {
        this.flushandclosestate = false;
        this.readystate = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.draft = null;
        this.tmpHandshakeBytes = ByteBuffer.allocate(0);
        this.handshakerequest = null;
        this.closemessage = null;
        this.closecode = null;
        this.closedremotely = null;
        this.resourceDescriptor = null;
        this.lastPong = System.currentTimeMillis();
        if (webSocketListener == null || (draft == null && this.role == WebSocket.Role.SERVER)) {
            wg3.m206174a("parameters must not be null");
            throw null;
        }
        this.outQueue = new LinkedBlockingQueue();
        this.inQueue = new LinkedBlockingQueue();
        this.wsl = webSocketListener;
        this.role = WebSocket.Role.CLIENT;
        if (draft != null) {
            this.draft = draft.copyInstance();
        }
    }

    private void closeConnectionDueToInternalServerError(RuntimeException runtimeException) {
        write(generateHttpResponseDueToError(500));
        flushAndClose(-1, runtimeException.getMessage(), false);
    }

    private void closeConnectionDueToWrongHandshake(InvalidDataException invalidDataException) {
        write(generateHttpResponseDueToError(404));
        flushAndClose(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    private void decodeFrames(ByteBuffer byteBuffer) {
        try {
            for (Framedata framedata : this.draft.translateFrame(byteBuffer)) {
                if (DEBUG) {
                    System.out.println("matched frame: " + framedata);
                }
                this.draft.processFrame(this, framedata);
            }
        } catch (InvalidDataException e) {
            this.wsl.onWebsocketError(this, e);
            close(e);
        }
    }

    private boolean decodeHandshake(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.tmpHandshakeBytes.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.tmpHandshakeBytes.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.tmpHandshakeBytes.capacity() + byteBuffer.remaining());
                this.tmpHandshakeBytes.flip();
                byteBufferAllocate.put(this.tmpHandshakeBytes);
                this.tmpHandshakeBytes = byteBufferAllocate;
            }
            this.tmpHandshakeBytes.put(byteBuffer);
            this.tmpHandshakeBytes.flip();
            byteBuffer2 = this.tmpHandshakeBytes;
        }
        byteBuffer2.mark();
        try {
            try {
                WebSocket.Role role = this.role;
                if (role != WebSocket.Role.SERVER) {
                    if (role == WebSocket.Role.CLIENT) {
                        this.draft.setParseMode(role);
                        Handshakedata handshakedataTranslateHandshake = this.draft.translateHandshake(byteBuffer2);
                        if (!(handshakedataTranslateHandshake instanceof ServerHandshake)) {
                            flushAndClose(1002, "wrong http function", false);
                            return false;
                        }
                        ServerHandshake serverHandshake = (ServerHandshake) handshakedataTranslateHandshake;
                        if (this.draft.acceptHandshakeAsClient(this.handshakerequest, serverHandshake) == Draft.HandshakeState.MATCHED) {
                            try {
                                this.wsl.onWebsocketHandshakeReceivedAsClient(this, this.handshakerequest, serverHandshake);
                                open(serverHandshake);
                                return true;
                            } catch (RuntimeException e) {
                                this.wsl.onWebsocketError(this, e);
                                flushAndClose(-1, e.getMessage(), false);
                                return false;
                            } catch (InvalidDataException e2) {
                                flushAndClose(e2.getCloseCode(), e2.getMessage(), false);
                                return false;
                            }
                        }
                        close(1002, "draft " + this.draft + " refuses handshake");
                    }
                    return false;
                }
                Draft draft = this.draft;
                if (draft != null) {
                    Handshakedata handshakedataTranslateHandshake2 = draft.translateHandshake(byteBuffer2);
                    if (!(handshakedataTranslateHandshake2 instanceof ClientHandshake)) {
                        flushAndClose(1002, "wrong http function", false);
                        return false;
                    }
                    ClientHandshake clientHandshake = (ClientHandshake) handshakedataTranslateHandshake2;
                    if (this.draft.acceptHandshakeAsServer(clientHandshake) == Draft.HandshakeState.MATCHED) {
                        open(clientHandshake);
                        return true;
                    }
                    close(1002, "the handshake did finaly not match");
                    return false;
                }
                Iterator<Draft> it = this.knownDrafts.iterator();
                while (it.hasNext()) {
                    Draft draftCopyInstance = it.next().copyInstance();
                    try {
                        draftCopyInstance.setParseMode(this.role);
                        byteBuffer2.reset();
                        Handshakedata handshakedataTranslateHandshake3 = draftCopyInstance.translateHandshake(byteBuffer2);
                        if (!(handshakedataTranslateHandshake3 instanceof ClientHandshake)) {
                            closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "wrong http function"));
                            return false;
                        }
                        ClientHandshake clientHandshake2 = (ClientHandshake) handshakedataTranslateHandshake3;
                        if (draftCopyInstance.acceptHandshakeAsServer(clientHandshake2) == Draft.HandshakeState.MATCHED) {
                            this.resourceDescriptor = clientHandshake2.getResourceDescriptor();
                            try {
                                write(draftCopyInstance.createHandshake(draftCopyInstance.postProcessHandshakeResponseAsServer(clientHandshake2, this.wsl.onWebsocketHandshakeReceivedAsServer(this, draftCopyInstance, clientHandshake2)), this.role));
                                this.draft = draftCopyInstance;
                                open(clientHandshake2);
                                return true;
                            } catch (RuntimeException e3) {
                                this.wsl.onWebsocketError(this, e3);
                                closeConnectionDueToInternalServerError(e3);
                                return false;
                            } catch (InvalidDataException e4) {
                                closeConnectionDueToWrongHandshake(e4);
                                return false;
                            }
                        }
                    } catch (InvalidHandshakeException unused) {
                    }
                }
                if (this.draft == null) {
                    closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "no draft matches"));
                }
                return false;
            } catch (InvalidHandshakeException e5) {
                close(e5);
            }
        } catch (IncompleteHandshakeException e6) {
            if (this.tmpHandshakeBytes.capacity() == 0) {
                byteBuffer2.reset();
                int preferedSize = e6.getPreferedSize();
                if (preferedSize == 0) {
                    preferedSize = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(preferedSize);
                this.tmpHandshakeBytes = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.tmpHandshakeBytes;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.tmpHandshakeBytes;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
    }

    private ByteBuffer generateHttpResponseDueToError(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(Charsetfunctions.asciiBytes("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    private void open(Handshakedata handshakedata) {
        if (DEBUG) {
            System.out.println("open using draft: " + this.draft);
        }
        setReadyState(WebSocket.READYSTATE.OPEN);
        try {
            this.wsl.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.wsl.onWebsocketError(this, e);
        }
    }

    private void send(Collection<Framedata> collection) {
        if (!isOpen()) {
            throw new WebsocketNotConnectedException();
        }
        if (collection == null) {
            fig0.m125680a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Framedata framedata : collection) {
            if (DEBUG) {
                System.out.println("send frame: " + framedata);
            }
            arrayList.add(this.draft.createBinaryFrame(framedata));
        }
        write(arrayList);
    }

    private void setReadyState(WebSocket.READYSTATE readystate) {
        this.readystate = readystate;
    }

    private void write(ByteBuffer byteBuffer) {
        if (DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        this.outQueue.add(byteBuffer);
        this.wsl.onWriteDemand(this);
    }

    public synchronized void close(int i, String str, boolean z) {
        WebSocket.READYSTATE readyState = getReadyState();
        WebSocket.READYSTATE readystate = WebSocket.READYSTATE.CLOSING;
        if (readyState == readystate || this.readystate == WebSocket.READYSTATE.CLOSED) {
            return;
        }
        if (getReadyState() == WebSocket.READYSTATE.OPEN) {
            if (i == 1006) {
                setReadyState(readystate);
                flushAndClose(i, str, false);
                return;
            }
            if (this.draft.getCloseHandshakeType() != Draft.CloseHandshakeType.NONE) {
                try {
                    if (!z) {
                        try {
                            this.wsl.onWebsocketCloseInitiated(this, i, str);
                        } catch (RuntimeException e) {
                            this.wsl.onWebsocketError(this, e);
                        }
                    }
                    if (isOpen()) {
                        CloseFrame closeFrame = new CloseFrame();
                        closeFrame.setReason(str);
                        closeFrame.setCode(i);
                        closeFrame.isValid();
                        sendFrame(closeFrame);
                    }
                } catch (InvalidDataException e2) {
                    this.wsl.onWebsocketError(this, e2);
                    flushAndClose(1006, "generated frame is invalid", false);
                }
            }
            flushAndClose(i, str, z);
        } else if (i == -3) {
            flushAndClose(-3, str, true);
        } else if (i == 1002) {
            flushAndClose(i, str, z);
        } else {
            flushAndClose(-1, str, false);
        }
        setReadyState(WebSocket.READYSTATE.CLOSING);
        this.tmpHandshakeBytes = null;
    }

    public synchronized void closeConnection(int i, String str, boolean z) {
        try {
            if (getReadyState() == WebSocket.READYSTATE.CLOSED) {
                return;
            }
            if (getReadyState() == WebSocket.READYSTATE.OPEN && i == 1006) {
                setReadyState(WebSocket.READYSTATE.CLOSING);
            }
            SelectionKey selectionKey = this.key;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.channel;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (!e.getMessage().equals("Broken pipe")) {
                        this.wsl.onWebsocketError(this, e);
                    } else if (DEBUG) {
                        System.out.println("Caught IOException: Broken pipe during closeConnection()");
                    }
                }
            }
            try {
                this.wsl.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.wsl.onWebsocketError(this, e2);
            }
            Draft draft = this.draft;
            if (draft != null) {
                draft.reset();
            }
            this.handshakerequest = null;
            setReadyState(WebSocket.READYSTATE.CLOSED);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void decode(ByteBuffer byteBuffer) {
        if (DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        if (getReadyState() != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            if (getReadyState() == WebSocket.READYSTATE.OPEN) {
                decodeFrames(byteBuffer);
            }
        } else {
            if (!decodeHandshake(byteBuffer) || isClosing() || isClosed()) {
                return;
            }
            if (byteBuffer.hasRemaining()) {
                decodeFrames(byteBuffer);
            } else if (this.tmpHandshakeBytes.hasRemaining()) {
                decodeFrames(this.tmpHandshakeBytes);
            }
        }
    }

    public void eot() {
        if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            closeConnection(-1, true);
            return;
        }
        if (this.flushandclosestate) {
            closeConnection(this.closecode.intValue(), this.closemessage, this.closedremotely.booleanValue());
            return;
        }
        if (this.draft.getCloseHandshakeType() == Draft.CloseHandshakeType.NONE) {
            closeConnection(1000, true);
            return;
        }
        if (this.draft.getCloseHandshakeType() != Draft.CloseHandshakeType.ONEWAY) {
            closeConnection(1006, true);
        } else if (this.role == WebSocket.Role.SERVER) {
            closeConnection(1006, true);
        } else {
            closeConnection(1000, true);
        }
    }

    public synchronized void flushAndClose(int i, String str, boolean z) {
        if (this.flushandclosestate) {
            return;
        }
        this.closecode = Integer.valueOf(i);
        this.closemessage = str;
        this.closedremotely = Boolean.valueOf(z);
        this.flushandclosestate = true;
        this.wsl.onWriteDemand(this);
        try {
            this.wsl.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.wsl.onWebsocketError(this, e);
        }
        Draft draft = this.draft;
        if (draft != null) {
            draft.reset();
        }
        this.handshakerequest = null;
    }

    @Override // org.java_websocket.WebSocket
    public <T> T getAttachment() {
        return (T) this.attachment;
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.draft;
    }

    public long getLastPong() {
        return this.lastPong;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.wsl.getLocalSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        return this.readystate;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.wsl.getRemoteSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public String getResourceDescriptor() {
        return this.resourceDescriptor;
    }

    public WebSocketListener getWebSocketListener() {
        return this.wsl;
    }

    @Override // org.java_websocket.WebSocket
    public boolean hasBufferedData() {
        return !this.outQueue.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        return getReadyState() == WebSocket.READYSTATE.CLOSED;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        return getReadyState() == WebSocket.READYSTATE.CLOSING;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isConnecting() {
        return getReadyState() == WebSocket.READYSTATE.CONNECTING;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isFlushAndClose() {
        return this.flushandclosestate;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        return getReadyState() == WebSocket.READYSTATE.OPEN;
    }

    @Override // org.java_websocket.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        send(this.draft.continuousFrame(opcode, byteBuffer, z));
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        send(Collections.singletonList(framedata));
    }

    @Override // org.java_websocket.WebSocket
    public void sendPing() throws NotYetConnectedException {
        if (this.pingFrame == null) {
            this.pingFrame = new PingFrame();
        }
        sendFrame(this.pingFrame);
    }

    @Override // org.java_websocket.WebSocket
    public <T> void setAttachment(T t) {
        this.attachment = t;
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) throws InvalidHandshakeException {
        this.handshakerequest = this.draft.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
        this.resourceDescriptor = clientHandshakeBuilder.getResourceDescriptor();
        try {
            this.wsl.onWebsocketHandshakeSentAsClient(this, this.handshakerequest);
            write(this.draft.createHandshake(this.handshakerequest, this.role));
        } catch (RuntimeException e) {
            this.wsl.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of" + e);
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    public String toString() {
        return super.toString();
    }

    public void updateLastPong() {
        this.lastPong = System.currentTimeMillis();
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        send(collection);
    }

    private void write(List<ByteBuffer> list) {
        synchronized (synchronizeWriteObject) {
            try {
                Iterator<ByteBuffer> it = list.iterator();
                while (it.hasNext()) {
                    write(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.java_websocket.WebSocket
    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        if (byteBuffer != null) {
            send(this.draft.createFrames(byteBuffer, this.role == WebSocket.Role.CLIENT));
        } else {
            wg3.m206174a("Cannot send 'null' data to a WebSocketImpl.");
        }
    }

    @Override // org.java_websocket.WebSocket
    public void send(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        send(ByteBuffer.wrap(bArr));
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) throws WebsocketNotConnectedException {
        if (str != null) {
            send(this.draft.createFrames(str, this.role == WebSocket.Role.CLIENT));
        } else {
            wg3.m206174a("Cannot send 'null' data to a WebSocketImpl.");
        }
    }

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.role = WebSocket.Role.SERVER;
        if (list != null && !list.isEmpty()) {
            this.knownDrafts = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.knownDrafts = arrayList;
        arrayList.add(new Draft_6455());
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft, Socket socket) {
        this(webSocketListener, draft);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list, Socket socket) {
        this(webSocketListener, list);
    }

    public void closeConnection(int i, boolean z) {
        closeConnection(i, "", z);
    }

    public void closeConnection() {
        if (this.closedremotely != null) {
            closeConnection(this.closecode.intValue(), this.closemessage, this.closedremotely.booleanValue());
        } else {
            wtq0.m207906a("this method must be used in conjuction with flushAndClose");
        }
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        closeConnection(i, str, false);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i, String str) {
        close(i, str, false);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        close(i, "", false);
    }

    public void close(InvalidDataException invalidDataException) {
        close(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    @Override // org.java_websocket.WebSocket
    public void close() {
        close(1000);
    }
}
