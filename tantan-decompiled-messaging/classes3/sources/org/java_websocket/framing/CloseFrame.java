package org.java_websocket.framing;

import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.util.ByteBufferUtils;
import org.java_websocket.util.Charsetfunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CloseFrame extends ControlFrame {
    public static final int ABNORMAL_CLOSE = 1006;
    public static final int BAD_GATEWAY = 1014;
    public static final int BUGGYCLOSE = -2;
    public static final int EXTENSION = 1010;
    public static final int FLASHPOLICY = -3;
    public static final int GOING_AWAY = 1001;
    public static final int NEVER_CONNECTED = -1;
    public static final int NOCODE = 1005;
    public static final int NORMAL = 1000;
    public static final int NO_UTF8 = 1007;
    public static final int POLICY_VALIDATION = 1008;
    public static final int PROTOCOL_ERROR = 1002;
    public static final int REFUSE = 1003;
    public static final int SERVICE_RESTART = 1012;
    public static final int TLS_ERROR = 1015;
    public static final int TOOBIG = 1009;
    public static final int TRY_AGAIN_LATER = 1013;
    public static final int UNEXPECTED_CONDITION = 1011;
    private int code;
    private String reason;

    public CloseFrame() {
        super(Framedata.Opcode.CLOSING);
        setReason("");
        setCode(1000);
    }

    private void updatePayload() {
        byte[] bArrUtf8Bytes = Charsetfunctions.utf8Bytes(this.reason);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.code);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrUtf8Bytes.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrUtf8Bytes);
        byteBufferAllocate2.rewind();
        super.setPayload(byteBufferAllocate2);
    }

    public int getCloseCode() {
        return this.code;
    }

    public String getMessage() {
        return this.reason;
    }

    @Override // org.java_websocket.framing.FramedataImpl1, org.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        return this.code == 1005 ? ByteBufferUtils.getEmptyByteBuffer() : super.getPayloadData();
    }

    @Override // org.java_websocket.framing.ControlFrame, org.java_websocket.framing.FramedataImpl1
    public void isValid() throws InvalidDataException {
        super.isValid();
        int i = this.code;
        if (i == 1007 && this.reason == null) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
        if (i == 1005 && this.reason.length() > 0) {
            throw new InvalidDataException(PROTOCOL_ERROR, "A close frame must have a closecode if it has a reason");
        }
        int i2 = this.code;
        if (i2 > 1015 && i2 < 3000) {
            throw new InvalidDataException(PROTOCOL_ERROR, "Trying to send an illegal close code!");
        }
        if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
            throw new InvalidFrameException("closecode must not be sent over the wire: " + this.code);
        }
    }

    public void setCode(int i) {
        this.code = i;
        if (i == 1015) {
            this.code = NOCODE;
            this.reason = "";
        }
        updatePayload();
    }

    @Override // org.java_websocket.framing.FramedataImpl1
    public void setPayload(ByteBuffer byteBuffer) {
        this.code = NOCODE;
        this.reason = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.code = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.code = PROTOCOL_ERROR;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.code = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.reason = Charsetfunctions.stringUtf8(byteBuffer);
                    byteBuffer.position(iPosition);
                } catch (IllegalArgumentException unused) {
                    throw new InvalidDataException(1007);
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        } catch (InvalidDataException unused2) {
            this.code = 1007;
            this.reason = null;
        }
    }

    public void setReason(String str) {
        if (str == null) {
            str = "";
        }
        this.reason = str;
        updatePayload();
    }

    @Override // org.java_websocket.framing.FramedataImpl1
    public String toString() {
        return super.toString() + "code: " + this.code;
    }
}
