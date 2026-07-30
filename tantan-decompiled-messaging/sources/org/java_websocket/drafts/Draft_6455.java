package org.java_websocket.drafts;

import com.tencent.connect.common.Constants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpTokens;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.exceptions.NotSendableException;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.framing.BinaryFrame;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.FramedataImpl1;
import org.java_websocket.framing.TextFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.HandshakeBuilder;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;
import org.java_websocket.protocols.IProtocol;
import org.java_websocket.protocols.Protocol;
import org.java_websocket.util.Base64;
import org.java_websocket.util.Charsetfunctions;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.C21016x1;
import p149l.phg0;
import p149l.upk0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public class Draft_6455 extends Draft {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<ByteBuffer> byteBufferList;
    private Framedata current_continuous_frame;
    private IExtension extension;
    private ByteBuffer incompleteframe;
    private List<IExtension> knownExtensions;
    private List<IProtocol> knownProtocols;
    private IProtocol protocol;
    private final Random reuseableRandom;

    public Draft_6455(List<IExtension> list, List<IProtocol> list2) {
        this.extension = new DefaultExtension();
        this.reuseableRandom = new Random();
        if (list == null || list2 == null) {
            x9g0.m207497a();
            throw null;
        }
        this.knownExtensions = new ArrayList(list.size());
        this.knownProtocols = new ArrayList(list2.size());
        this.byteBufferList = new ArrayList();
        Iterator<IExtension> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getClass().equals(DefaultExtension.class)) {
                z = true;
            }
        }
        this.knownExtensions.addAll(list);
        if (!z) {
            List<IExtension> list3 = this.knownExtensions;
            list3.add(list3.size(), this.extension);
        }
        this.knownProtocols.addAll(list2);
    }

    private ByteBuffer createByteBufferFromFramedata(Framedata framedata) {
        int i;
        ByteBuffer payloadData = framedata.getPayloadData();
        int i2 = 0;
        boolean z = this.role == WebSocket.Role.CLIENT;
        if (payloadData.remaining() <= 125) {
            i = 1;
        } else {
            i = payloadData.remaining() <= 65535 ? 2 : 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0) + payloadData.remaining());
        byteBufferAllocate.put((byte) (((byte) (framedata.isFin() ? -128 : 0)) | fromOpcode(framedata.getOpcode())));
        byte[] byteArray = toByteArray(payloadData.remaining(), i);
        if (i == 1) {
            byteBufferAllocate.put((byte) (byteArray[0] | (z ? (byte) -128 : (byte) 0)));
        } else if (i == 2) {
            byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 126));
            byteBufferAllocate.put(byteArray);
        } else {
            if (i != 8) {
                upk0.m194883a("Size representation not supported/specified");
                return null;
            }
            byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 127));
            byteBufferAllocate.put(byteArray);
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.reuseableRandom.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (payloadData.hasRemaining()) {
                byteBufferAllocate.put((byte) (payloadData.get() ^ byteBufferAllocate2.get(i2 % 4)));
                i2++;
            }
        } else {
            byteBufferAllocate.put(payloadData);
            payloadData.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte fromOpcode(Framedata.Opcode opcode) {
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return (byte) 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return (byte) 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return (byte) 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return (byte) 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return (byte) 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return (byte) 10;
        }
        C21016x1.m206655a("Don't know how to handle ", opcode);
        return (byte) 0;
    }

    private String generateFinalKey(String str) {
        try {
            return Base64.encodeBytes(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    private ByteBuffer getPayloadFromByteBufferList() throws LimitExedeedException {
        Iterator<ByteBuffer> it = this.byteBufferList.iterator();
        long jLimit = 0;
        while (it.hasNext()) {
            jLimit += (long) it.next().limit();
        }
        if (jLimit > 2147483647L) {
            throw new LimitExedeedException("Payloadsize is to big...");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
        Iterator<ByteBuffer> it2 = this.byteBufferList.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private String getServerTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private byte[] toByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private Framedata.Opcode toOpcode(byte b) throws InvalidFrameException {
        if (b == 0) {
            return Framedata.Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Framedata.Opcode.TEXT;
        }
        if (b == 2) {
            return Framedata.Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Framedata.Opcode.CLOSING;
            case 9:
                return Framedata.Opcode.PING;
            case 10:
                return Framedata.Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((int) b));
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidHandshakeException {
        if (!basicAccept(serverHandshake)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (!clientHandshake.hasFieldValue("Sec-WebSocket-Key") || !serverHandshake.hasFieldValue("Sec-WebSocket-Accept")) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (!generateFinalKey(clientHandshake.getFieldValue("Sec-WebSocket-Key")).equals(serverHandshake.getFieldValue("Sec-WebSocket-Accept"))) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue = serverHandshake.getFieldValue("Sec-WebSocket-Extensions");
        for (IExtension iExtension : this.knownExtensions) {
            if (iExtension.acceptProvidedExtensionAsClient(fieldValue)) {
                this.extension = iExtension;
                handshakeState = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue2 = serverHandshake.getFieldValue("Sec-WebSocket-Protocol");
        for (IProtocol iProtocol : this.knownProtocols) {
            if (iProtocol.acceptProvidedProtocol(fieldValue2)) {
                this.protocol = iProtocol;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
        return (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) ? handshakeState3 : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) throws InvalidHandshakeException {
        if (readVersion(clientHandshake) != 13) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Extensions");
        for (IExtension iExtension : this.knownExtensions) {
            if (iExtension.acceptProvidedExtensionAsServer(fieldValue)) {
                this.extension = iExtension;
                handshakeState = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue2 = clientHandshake.getFieldValue("Sec-WebSocket-Protocol");
        for (IProtocol iProtocol : this.knownProtocols) {
            if (iProtocol.acceptProvidedProtocol(fieldValue2)) {
                this.protocol = iProtocol;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
        return (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) ? handshakeState3 : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft copyInstance() {
        ArrayList arrayList = new ArrayList();
        Iterator<IExtension> it = getKnownExtensions().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().copyInstance());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<IProtocol> it2 = getKnownProtocols().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().copyInstance());
        }
        return new Draft_6455(arrayList, arrayList2);
    }

    @Override // org.java_websocket.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        getExtension().encodeFrame(framedata);
        if (WebSocketImpl.DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("afterEnconding(");
            sb.append(framedata.getPayloadData().remaining());
            sb.append("): {");
            sb.append(framedata.getPayloadData().remaining() > 1000 ? "too big to display" : new String(framedata.getPayloadData().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        return createByteBufferFromFramedata(framedata);
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> createFrames(String str, boolean z) {
        TextFrame textFrame = new TextFrame();
        textFrame.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
        textFrame.setTransferemasked(z);
        try {
            textFrame.isValid();
            return Collections.singletonList(textFrame);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Draft_6455 draft_6455 = (Draft_6455) obj;
            IExtension iExtension = this.extension;
            IExtension iExtension2 = draft_6455.extension;
            if (iExtension == null ? iExtension2 != null : !iExtension.equals(iExtension2)) {
                return false;
            }
            IProtocol iProtocol = this.protocol;
            IProtocol iProtocol2 = draft_6455.protocol;
            if (iProtocol != null) {
                return iProtocol.equals(iProtocol2);
            }
            if (iProtocol2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        return Draft.CloseHandshakeType.TWOWAY;
    }

    public IExtension getExtension() {
        return this.extension;
    }

    public List<IExtension> getKnownExtensions() {
        return this.knownExtensions;
    }

    public List<IProtocol> getKnownProtocols() {
        return this.knownProtocols;
    }

    public IProtocol getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        IExtension iExtension = this.extension;
        int iHashCode = (iExtension != null ? iExtension.hashCode() : 0) * 31;
        IProtocol iProtocol = this.protocol;
        return iHashCode + (iProtocol != null ? iProtocol.hashCode() : 0);
    }

    @Override // org.java_websocket.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        clientHandshakeBuilder.put("Upgrade", "websocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.reuseableRandom.nextBytes(bArr);
        clientHandshakeBuilder.put("Sec-WebSocket-Key", Base64.encodeBytes(bArr));
        clientHandshakeBuilder.put("Sec-WebSocket-Version", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
        StringBuilder sb = new StringBuilder();
        for (IExtension iExtension : this.knownExtensions) {
            if (iExtension.getProvidedExtensionAsClient() != null && iExtension.getProvidedExtensionAsClient().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(iExtension.getProvidedExtensionAsClient());
            }
        }
        if (sb.length() != 0) {
            clientHandshakeBuilder.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (IProtocol iProtocol : this.knownProtocols) {
            if (iProtocol.getProvidedProtocol().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(iProtocol.getProvidedProtocol());
            }
        }
        if (sb2.length() != 0) {
            clientHandshakeBuilder.put("Sec-WebSocket-Protocol", sb2.toString());
        }
        return clientHandshakeBuilder;
    }

    @Override // org.java_websocket.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) throws InvalidHandshakeException {
        serverHandshakeBuilder.put("Upgrade", "websocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key");
        if (fieldValue == null) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        serverHandshakeBuilder.put("Sec-WebSocket-Accept", generateFinalKey(fieldValue));
        if (getExtension().getProvidedExtensionAsServer().length() != 0) {
            serverHandshakeBuilder.put("Sec-WebSocket-Extensions", getExtension().getProvidedExtensionAsServer());
        }
        if (getProtocol() != null && getProtocol().getProvidedProtocol().length() != 0) {
            serverHandshakeBuilder.put("Sec-WebSocket-Protocol", getProtocol().getProvidedProtocol());
        }
        serverHandshakeBuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverHandshakeBuilder.put(HttpHeaders.SERVER, "TooTallNate Java-WebSocket");
        serverHandshakeBuilder.put("Date", getServerTime());
        return serverHandshakeBuilder;
    }

    @Override // org.java_websocket.drafts.Draft
    public void processFrame(WebSocketImpl webSocketImpl, Framedata framedata) throws InvalidDataException {
        int closeCode;
        String message;
        Framedata.Opcode opcode = framedata.getOpcode();
        if (opcode == Framedata.Opcode.CLOSING) {
            if (framedata instanceof CloseFrame) {
                CloseFrame closeFrame = (CloseFrame) framedata;
                closeCode = closeFrame.getCloseCode();
                message = closeFrame.getMessage();
            } else {
                closeCode = 1005;
                message = "";
            }
            if (webSocketImpl.getReadyState() == WebSocket.READYSTATE.CLOSING) {
                webSocketImpl.closeConnection(closeCode, message, true);
                return;
            } else if (getCloseHandshakeType() == Draft.CloseHandshakeType.TWOWAY) {
                webSocketImpl.close(closeCode, message, true);
                return;
            } else {
                webSocketImpl.flushAndClose(closeCode, message, false);
                return;
            }
        }
        if (opcode == Framedata.Opcode.PING) {
            webSocketImpl.getWebSocketListener().onWebsocketPing(webSocketImpl, framedata);
            return;
        }
        if (opcode == Framedata.Opcode.PONG) {
            webSocketImpl.updateLastPong();
            webSocketImpl.getWebSocketListener().onWebsocketPong(webSocketImpl, framedata);
            return;
        }
        if (framedata.isFin() && opcode != Framedata.Opcode.CONTINUOUS) {
            if (this.current_continuous_frame != null) {
                throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
            }
            if (opcode == Framedata.Opcode.TEXT) {
                try {
                    webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
                    return;
                } catch (RuntimeException e) {
                    webSocketImpl.getWebSocketListener().onWebsocketError(webSocketImpl, e);
                    return;
                }
            }
            if (opcode != Framedata.Opcode.BINARY) {
                throw new InvalidDataException(1002, "non control or continious frame expected");
            }
            try {
                webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, framedata.getPayloadData());
                return;
            } catch (RuntimeException e2) {
                webSocketImpl.getWebSocketListener().onWebsocketError(webSocketImpl, e2);
                return;
            }
        }
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            boolean zIsFin = framedata.isFin();
            Framedata framedata2 = this.current_continuous_frame;
            if (zIsFin) {
                if (framedata2 == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                this.byteBufferList.add(framedata.getPayloadData());
                Framedata.Opcode opcode2 = this.current_continuous_frame.getOpcode();
                Framedata.Opcode opcode3 = Framedata.Opcode.TEXT;
                Framedata framedata3 = this.current_continuous_frame;
                if (opcode2 == opcode3) {
                    ((FramedataImpl1) framedata3).setPayload(getPayloadFromByteBufferList());
                    ((FramedataImpl1) this.current_continuous_frame).isValid();
                    try {
                        webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, Charsetfunctions.stringUtf8(this.current_continuous_frame.getPayloadData()));
                    } catch (RuntimeException e3) {
                        webSocketImpl.getWebSocketListener().onWebsocketError(webSocketImpl, e3);
                    }
                } else if (framedata3.getOpcode() == Framedata.Opcode.BINARY) {
                    ((FramedataImpl1) this.current_continuous_frame).setPayload(getPayloadFromByteBufferList());
                    ((FramedataImpl1) this.current_continuous_frame).isValid();
                    try {
                        webSocketImpl.getWebSocketListener().onWebsocketMessage(webSocketImpl, this.current_continuous_frame.getPayloadData());
                    } catch (RuntimeException e4) {
                        webSocketImpl.getWebSocketListener().onWebsocketError(webSocketImpl, e4);
                    }
                }
                this.current_continuous_frame = null;
                this.byteBufferList.clear();
            } else if (framedata2 == null) {
                throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
            }
        } else {
            if (this.current_continuous_frame != null) {
                throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
            }
            this.current_continuous_frame = framedata;
            this.byteBufferList.add(framedata.getPayloadData());
        }
        if (opcode == Framedata.Opcode.TEXT && !Charsetfunctions.isValidUTF8(framedata.getPayloadData())) {
            throw new InvalidDataException(1007);
        }
        if (opcode != Framedata.Opcode.CONTINUOUS || this.current_continuous_frame == null) {
            return;
        }
        this.byteBufferList.add(framedata.getPayloadData());
    }

    @Override // org.java_websocket.drafts.Draft
    public void reset() {
        this.incompleteframe = null;
        IExtension iExtension = this.extension;
        if (iExtension != null) {
            iExtension.reset();
        }
        this.extension = new DefaultExtension();
        this.protocol = null;
    }

    @Override // org.java_websocket.drafts.Draft
    public String toString() {
        String string = super.toString();
        if (getExtension() != null) {
            string = string + " extension: " + getExtension().toString();
        }
        if (getProtocol() == null) {
            return string;
        }
        return string + " protocol: " + getProtocol().toString();
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.incompleteframe == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.incompleteframe.remaining();
                ByteBuffer byteBuffer2 = this.incompleteframe;
                if (iRemaining2 <= iRemaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(translateSingleFrame((ByteBuffer) this.incompleteframe.duplicate().position(0)));
                    this.incompleteframe = null;
                    break;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.EMPTY_LIST;
            } catch (IncompleteException e) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(e.getPreferredSize()));
                this.incompleteframe.rewind();
                byteBufferAllocate.put(this.incompleteframe);
                this.incompleteframe = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(translateSingleFrame(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferredSize()));
                this.incompleteframe = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public Framedata translateSingleFrame(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        int iIntValue;
        int iRemaining = byteBuffer.remaining();
        int i = 2;
        if (iRemaining < 2) {
            throw new IncompleteException(2);
        }
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & HttpTokens.SPACE) != 0;
        boolean z4 = (b & Tnaf.POW_2_WIDTH) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & (-128)) != 0;
        byte b3 = (byte) (b2 & 127);
        Framedata.Opcode opcode = toOpcode((byte) (b & 15));
        if (b3 >= 0 && b3 <= 125) {
            iIntValue = b3;
        } else {
            if (opcode == Framedata.Opcode.PING || opcode == Framedata.Opcode.PONG || opcode == Framedata.Opcode.CLOSING) {
                throw new InvalidFrameException("more than 125 octets");
            }
            if (b3 != 126) {
                i = 10;
                if (iRemaining < 10) {
                    throw new IncompleteException(10);
                }
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = byteBuffer.get();
                }
                long jLongValue = new BigInteger(bArr).longValue();
                if (jLongValue > 2147483647L) {
                    throw new LimitExedeedException("Payloadsize is to big...");
                }
                iIntValue = (int) jLongValue;
            } else {
                if (iRemaining < 4) {
                    throw new IncompleteException(4);
                }
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
            }
        }
        int i3 = i + (z5 ? 4 : 0) + iIntValue;
        if (iRemaining < i3) {
            throw new IncompleteException(i3);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(checkAlloc(iIntValue));
        if (z5) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i4 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        FramedataImpl1 framedataImpl1 = FramedataImpl1.get(opcode);
        framedataImpl1.setFin(z);
        framedataImpl1.setRSV1(z2);
        framedataImpl1.setRSV2(z3);
        framedataImpl1.setRSV3(z4);
        byteBufferAllocate.flip();
        framedataImpl1.setPayload(byteBufferAllocate);
        getExtension().isFrameValid(framedataImpl1);
        getExtension().decodeFrame(framedataImpl1);
        if (WebSocketImpl.DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("afterDecoding(");
            sb.append(framedataImpl1.getPayloadData().remaining());
            sb.append("): {");
            sb.append(framedataImpl1.getPayloadData().remaining() > 1000 ? "too big to display" : new String(framedataImpl1.getPayloadData().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        framedataImpl1.isValid();
        return framedataImpl1;
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        BinaryFrame binaryFrame = new BinaryFrame();
        binaryFrame.setPayload(byteBuffer);
        binaryFrame.setTransferemasked(z);
        try {
            binaryFrame.isValid();
            return Collections.singletonList(binaryFrame);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public Draft_6455(IExtension iExtension) {
        this((List<IExtension>) Collections.singletonList(iExtension));
    }

    public Draft_6455(List<IExtension> list) {
        this(list, Collections.singletonList(new Protocol("")));
    }

    public Draft_6455() {
        this((List<IExtension>) Collections.EMPTY_LIST);
    }
}
