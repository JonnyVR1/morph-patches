package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class phg0 implements ueg0 {

    /* JADX INFO: renamed from: b */
    public final int f152433b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f152434c = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: a */
    public boolean f152432a = true;

    /* JADX INFO: renamed from: d */
    public boolean f152435d = false;

    /* JADX INFO: renamed from: e */
    public boolean f152436e = false;

    /* JADX INFO: renamed from: f */
    public boolean f152437f = false;

    /* JADX INFO: renamed from: g */
    public boolean f152438g = false;

    public phg0(int i) {
        this.f152433b = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo122951a();

    /* JADX INFO: renamed from: b */
    public void mo172323b(ByteBuffer byteBuffer) {
        this.f152434c = byteBuffer;
    }

    @Override // p153l.ueg0
    /* JADX INFO: renamed from: d */
    public ByteBuffer mo172324d() {
        return this.f152434c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            phg0 phg0Var = (phg0) obj;
            if (this.f152432a != phg0Var.f152432a || this.f152435d != phg0Var.f152435d || this.f152436e != phg0Var.f152436e || this.f152437f != phg0Var.f152437f || this.f152438g != phg0Var.f152438g || this.f152433b != phg0Var.f152433b) {
                return false;
            }
            ByteBuffer byteBuffer = this.f152434c;
            ByteBuffer byteBuffer2 = phg0Var.f152434c;
            if (byteBuffer != null) {
                return byteBuffer.equals(byteBuffer2);
            }
            if (byteBuffer2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM174221a = (pxg0.m174221a(this.f152433b) + ((this.f152432a ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.f152434c;
        return ((((((((iM174221a + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f152435d ? 1 : 0)) * 31) + (this.f152436e ? 1 : 0)) * 31) + (this.f152437f ? 1 : 0)) * 31) + (this.f152438g ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Framedata{ optcode:");
        switch (this.f152433b) {
            case 1:
                str = "CONTINUOUS";
                break;
            case 2:
                str = "TEXT";
                break;
            case 3:
                str = "BINARY";
                break;
            case 4:
                str = "PING";
                break;
            case 5:
                str = "PONG";
                break;
            case 6:
                str = "CLOSING";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", fin:");
        sb.append(this.f152432a);
        sb.append(", rsv1:");
        sb.append(this.f152436e);
        sb.append(", rsv2:");
        sb.append(this.f152437f);
        sb.append(", rsv3:");
        sb.append(this.f152438g);
        sb.append(", payloadlength:[pos:");
        sb.append(this.f152434c.position());
        sb.append(", len:");
        sb.append(this.f152434c.remaining());
        sb.append("], payload:");
        sb.append(this.f152434c.remaining() > 1000 ? "(too big to display)" : new String(this.f152434c.array()));
        sb.append('}');
        return sb.toString();
    }
}
