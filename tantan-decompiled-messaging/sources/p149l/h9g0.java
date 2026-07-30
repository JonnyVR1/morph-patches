package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class h9g0 implements m6g0 {

    /* JADX INFO: renamed from: b */
    public final int f106581b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f106582c = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: a */
    public boolean f106580a = true;

    /* JADX INFO: renamed from: d */
    public boolean f106583d = false;

    /* JADX INFO: renamed from: e */
    public boolean f106584e = false;

    /* JADX INFO: renamed from: f */
    public boolean f106585f = false;

    /* JADX INFO: renamed from: g */
    public boolean f106586g = false;

    public h9g0(int i) {
        this.f106581b = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo127138a();

    /* JADX INFO: renamed from: b */
    public void mo130004b(ByteBuffer byteBuffer) {
        this.f106582c = byteBuffer;
    }

    @Override // p149l.m6g0
    /* JADX INFO: renamed from: d */
    public ByteBuffer mo130005d() {
        return this.f106582c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h9g0 h9g0Var = (h9g0) obj;
            if (this.f106580a != h9g0Var.f106580a || this.f106583d != h9g0Var.f106583d || this.f106584e != h9g0Var.f106584e || this.f106585f != h9g0Var.f106585f || this.f106586g != h9g0Var.f106586g || this.f106581b != h9g0Var.f106581b) {
                return false;
            }
            ByteBuffer byteBuffer = this.f106582c;
            ByteBuffer byteBuffer2 = h9g0Var.f106582c;
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
        int iM132337a = (hpg0.m132337a(this.f106581b) + ((this.f106580a ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.f106582c;
        return ((((((((iM132337a + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f106583d ? 1 : 0)) * 31) + (this.f106584e ? 1 : 0)) * 31) + (this.f106585f ? 1 : 0)) * 31) + (this.f106586g ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Framedata{ optcode:");
        switch (this.f106581b) {
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
        sb.append(this.f106580a);
        sb.append(", rsv1:");
        sb.append(this.f106584e);
        sb.append(", rsv2:");
        sb.append(this.f106585f);
        sb.append(", rsv3:");
        sb.append(this.f106586g);
        sb.append(", payloadlength:[pos:");
        sb.append(this.f106582c.position());
        sb.append(", len:");
        sb.append(this.f106582c.remaining());
        sb.append("], payload:");
        sb.append(this.f106582c.remaining() > 1000 ? "(too big to display)" : new String(this.f106582c.array()));
        sb.append('}');
        return sb.toString();
    }
}
