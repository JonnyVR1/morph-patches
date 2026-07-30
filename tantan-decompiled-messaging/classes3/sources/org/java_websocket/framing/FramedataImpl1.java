package org.java_websocket.framing;

import java.nio.ByteBuffer;
import l.ig3;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.util.ByteBufferUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class FramedataImpl1 implements Framedata {
    private Framedata.Opcode optcode;
    private ByteBuffer unmaskedpayload = ByteBufferUtils.getEmptyByteBuffer();
    private boolean fin = true;
    private boolean transferemasked = false;
    private boolean rsv1 = false;
    private boolean rsv2 = false;
    private boolean rsv3 = false;

    /* JADX INFO: renamed from: org.java_websocket.framing.FramedataImpl1$1 */
    public static /* synthetic */ class C08781 {
        static final /* synthetic */ int[] $SwitchMap$org$java_websocket$framing$Framedata$Opcode;

        static {
            int[] iArr = new int[Framedata.Opcode.values().length];
            $SwitchMap$org$java_websocket$framing$Framedata$Opcode = iArr;
            try {
                iArr[Framedata.Opcode.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public FramedataImpl1(Framedata.Opcode opcode) {
        this.optcode = opcode;
    }

    public static FramedataImpl1 get(Framedata.Opcode opcode) {
        if (opcode == null) {
            ig3.a("Supplied opcode cannot be null");
            return null;
        }
        switch (C08781.$SwitchMap$org$java_websocket$framing$Framedata$Opcode[opcode.ordinal()]) {
            case 1:
                return new PingFrame();
            case 2:
                return new PongFrame();
            case 3:
                return new TextFrame();
            case 4:
                return new BinaryFrame();
            case 5:
                return new CloseFrame();
            case 6:
                return new ContinuousFrame();
            default:
                ig3.a("Supplied opcode is invalid");
                return null;
        }
    }

    @Override // org.java_websocket.framing.Framedata
    public void append(Framedata framedata) {
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.unmaskedpayload == null) {
            this.unmaskedpayload = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.unmaskedpayload.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.unmaskedpayload;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.unmaskedpayload;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.unmaskedpayload.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(payloadData.remaining() + this.unmaskedpayload.capacity());
                this.unmaskedpayload.flip();
                byteBufferAllocate.put(this.unmaskedpayload);
                byteBufferAllocate.put(payloadData);
                this.unmaskedpayload = byteBufferAllocate;
            } else {
                this.unmaskedpayload.put(payloadData);
            }
            this.unmaskedpayload.rewind();
            payloadData.reset();
        }
        this.fin = framedata.isFin();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FramedataImpl1 framedataImpl1 = (FramedataImpl1) obj;
            if (this.fin != framedataImpl1.fin || this.transferemasked != framedataImpl1.transferemasked || this.rsv1 != framedataImpl1.rsv1 || this.rsv2 != framedataImpl1.rsv2 || this.rsv3 != framedataImpl1.rsv3 || this.optcode != framedataImpl1.optcode) {
                return false;
            }
            ByteBuffer byteBuffer = this.unmaskedpayload;
            ByteBuffer byteBuffer2 = framedataImpl1.unmaskedpayload;
            if (byteBuffer != null) {
                return byteBuffer.equals(byteBuffer2);
            }
            if (byteBuffer2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.framing.Framedata
    public Framedata.Opcode getOpcode() {
        return this.optcode;
    }

    @Override // org.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        return this.unmaskedpayload;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean getTransfereMasked() {
        return this.transferemasked;
    }

    public int hashCode() {
        int iHashCode = (((this.fin ? 1 : 0) * 31) + this.optcode.hashCode()) * 31;
        ByteBuffer byteBuffer = this.unmaskedpayload;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.transferemasked ? 1 : 0)) * 31) + (this.rsv1 ? 1 : 0)) * 31) + (this.rsv2 ? 1 : 0)) * 31) + (this.rsv3 ? 1 : 0);
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isFin() {
        return this.fin;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV1() {
        return this.rsv1;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV2() {
        return this.rsv2;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isRSV3() {
        return this.rsv3;
    }

    public abstract void isValid() throws InvalidDataException;

    public void setFin(boolean z) {
        this.fin = z;
    }

    public void setPayload(ByteBuffer byteBuffer) {
        this.unmaskedpayload = byteBuffer;
    }

    public void setRSV1(boolean z) {
        this.rsv1 = z;
    }

    public void setRSV2(boolean z) {
        this.rsv2 = z;
    }

    public void setRSV3(boolean z) {
        this.rsv3 = z;
    }

    public void setTransferemasked(boolean z) {
        this.transferemasked = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Framedata{ optcode:");
        sb.append(getOpcode());
        sb.append(", fin:");
        sb.append(isFin());
        sb.append(", rsv1:");
        sb.append(isRSV1());
        sb.append(", rsv2:");
        sb.append(isRSV2());
        sb.append(", rsv3:");
        sb.append(isRSV3());
        sb.append(", payloadlength:[pos:");
        sb.append(this.unmaskedpayload.position());
        sb.append(", len:");
        sb.append(this.unmaskedpayload.remaining());
        sb.append("], payload:");
        sb.append(this.unmaskedpayload.remaining() > 1000 ? "(too big to display)" : new String(this.unmaskedpayload.array()));
        sb.append('}');
        return sb.toString();
    }
}
