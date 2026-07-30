package org.java_websocket.drafts;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpVersions;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.BinaryFrame;
import org.java_websocket.framing.ContinuousFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.FramedataImpl1;
import org.java_websocket.framing.TextFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.HandshakeBuilder;
import org.java_websocket.handshake.HandshakeImpl1Client;
import org.java_websocket.handshake.HandshakeImpl1Server;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;
import org.java_websocket.util.Charsetfunctions;
import p153l.tg3;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Draft {
    public static int INITIAL_FAMESIZE = 64;
    public static int MAX_FAME_SIZE = 1000;
    protected WebSocket.Role role = null;
    protected Framedata.Opcode continuousFrameType = null;

    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public static ByteBuffer readLine(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public static String readStringLine(ByteBuffer byteBuffer) {
        ByteBuffer line = readLine(byteBuffer);
        if (line == null) {
            return null;
        }
        return Charsetfunctions.stringAscii(line.array(), 0, line.limit());
    }

    public static HandshakeBuilder translateHandshakeHttp(ByteBuffer byteBuffer, WebSocket.Role role) throws IncompleteHandshakeException, InvalidHandshakeException {
        HandshakeBuilder handshakeBuilder;
        String stringLine = readStringLine(byteBuffer);
        if (stringLine == null) {
            throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = stringLine.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
        if (strArrSplit.length != 3) {
            throw new InvalidHandshakeException();
        }
        if (role == WebSocket.Role.CLIENT) {
            if (!"101".equals(strArrSplit[1])) {
                throw new InvalidHandshakeException("Invalid status code received: " + strArrSplit[1] + " Status line: " + stringLine);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[0])) {
                throw new InvalidHandshakeException("Invalid status line received: " + strArrSplit[0] + " Status line: " + stringLine);
            }
            HandshakeImpl1Server handshakeImpl1Server = new HandshakeImpl1Server();
            handshakeImpl1Server.setHttpStatus(Short.parseShort(strArrSplit[1]));
            handshakeImpl1Server.setHttpStatusMessage(strArrSplit[2]);
            handshakeBuilder = handshakeImpl1Server;
        } else {
            if (!"GET".equalsIgnoreCase(strArrSplit[0])) {
                throw new InvalidHandshakeException("Invalid request method received: " + strArrSplit[0] + " Status line: " + stringLine);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[2])) {
                throw new InvalidHandshakeException("Invalid status line received: " + strArrSplit[2] + " Status line: " + stringLine);
            }
            HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
            handshakeImpl1Client.setResourceDescriptor(strArrSplit[1]);
            handshakeBuilder = handshakeImpl1Client;
        }
        String stringLine2 = readStringLine(byteBuffer);
        while (stringLine2 != null && stringLine2.length() > 0) {
            String[] strArrSplit2 = stringLine2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            if (handshakeBuilder.hasFieldValue(strArrSplit2[0])) {
                handshakeBuilder.put(strArrSplit2[0], handshakeBuilder.getFieldValue(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                handshakeBuilder.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            stringLine2 = readStringLine(byteBuffer);
        }
        if (stringLine2 != null) {
            return handshakeBuilder;
        }
        throw new IncompleteHandshakeException();
    }

    public abstract HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) throws InvalidHandshakeException;

    public abstract HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) throws InvalidHandshakeException;

    public boolean basicAccept(Handshakedata handshakedata) {
        return handshakedata.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && handshakedata.getFieldValue(HttpHeaders.CONNECTION).toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public int checkAlloc(int i) throws InvalidDataException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public List<Framedata> continuousFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        FramedataImpl1 textFrame;
        Framedata.Opcode opcode2 = Framedata.Opcode.BINARY;
        if (opcode != opcode2 && opcode != Framedata.Opcode.TEXT) {
            wg3.m206174a("Only Opcode.BINARY or  Opcode.TEXT are allowed");
            return null;
        }
        if (this.continuousFrameType != null) {
            textFrame = new ContinuousFrame();
        } else {
            this.continuousFrameType = opcode;
            if (opcode == opcode2) {
                textFrame = new BinaryFrame();
            } else {
                textFrame = opcode == Framedata.Opcode.TEXT ? new TextFrame() : null;
            }
        }
        textFrame.setPayload(byteBuffer);
        textFrame.setFin(z);
        try {
            textFrame.isValid();
            if (z) {
                this.continuousFrameType = null;
            } else {
                this.continuousFrameType = opcode;
            }
            return Collections.singletonList(textFrame);
        } catch (InvalidDataException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    public abstract Draft copyInstance();

    public abstract ByteBuffer createBinaryFrame(Framedata framedata);

    public abstract List<Framedata> createFrames(String str, boolean z);

    public abstract List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z);

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role, boolean z) {
        StringBuilder sb = new StringBuilder(100);
        if (handshakedata instanceof ClientHandshake) {
            sb.append("GET ");
            sb.append(((ClientHandshake) handshakedata).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else {
            if (!(handshakedata instanceof ServerHandshake)) {
                wg3.m206174a("unknown role");
                return null;
            }
            sb.append("HTTP/1.1 101 ");
            sb.append(((ServerHandshake) handshakedata).getHttpStatusMessage());
        }
        sb.append("\r\n");
        Iterator<String> itIterateHttpFields = handshakedata.iterateHttpFields();
        while (itIterateHttpFields.hasNext()) {
            String next = itIterateHttpFields.next();
            String fieldValue = handshakedata.getFieldValue(next);
            sb.append(next);
            sb.append(": ");
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] bArrAsciiBytes = Charsetfunctions.asciiBytes(sb.toString());
        byte[] content = z ? handshakedata.getContent() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((content == null ? 0 : content.length) + bArrAsciiBytes.length);
        byteBufferAllocate.put(bArrAsciiBytes);
        if (content != null) {
            byteBufferAllocate.put(content);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    public abstract CloseHandshakeType getCloseHandshakeType();

    public WebSocket.Role getRole() {
        return this.role;
    }

    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) throws InvalidHandshakeException;

    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) throws InvalidHandshakeException;

    public abstract void processFrame(WebSocketImpl webSocketImpl, Framedata framedata) throws InvalidDataException;

    public int readVersion(Handshakedata handshakedata) {
        String fieldValue = handshakedata.getFieldValue("Sec-WebSocket-Version");
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract void reset();

    public void setParseMode(WebSocket.Role role) {
        this.role = role;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public abstract List<Framedata> translateFrame(ByteBuffer byteBuffer) throws InvalidDataException;

    public Handshakedata translateHandshake(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return translateHandshakeHttp(byteBuffer, this.role);
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role) {
        return createHandshake(handshakedata, role, true);
    }
}
