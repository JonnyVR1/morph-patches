package p149l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class nky0 extends zku0 {

    /* JADX INFO: renamed from: i */
    public int f139490i;

    /* JADX INFO: renamed from: j */
    public int f139491j;

    /* JADX INFO: renamed from: k */
    public boolean f139492k;

    /* JADX INFO: renamed from: l */
    public int f139493l;

    /* JADX INFO: renamed from: m */
    public byte[] f139494m = ggw0.f102573f;

    /* JADX INFO: renamed from: n */
    public int f139495n;

    /* JADX INFO: renamed from: o */
    public long f139496o;

    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f139493l);
        this.f139496o += (long) (iMin / this.f203569b.f102819d);
        this.f139493l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f139493l <= 0) {
            int i2 = i - iMin;
            int length = (this.f139495n + i2) - this.f139494m.length;
            ByteBuffer byteBufferM219206d = m219206d(length);
            int iMax = Math.max(0, Math.min(length, this.f139495n));
            byteBufferM219206d.put(this.f139494m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferM219206d.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iMax2;
            int i4 = this.f139495n - iMax;
            this.f139495n = i4;
            byte[] bArr = this.f139494m;
            System.arraycopy(bArr, iMax, bArr, 0, i4);
            byteBuffer.get(this.f139494m, this.f139495n, i3);
            this.f139495n += i3;
            byteBufferM219206d.flip();
        }
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: c */
    public final ghu0 mo150391c(ghu0 ghu0Var) throws zzds {
        if (ghu0Var.f102818c != 2) {
            throw new zzds("Unhandled input format:", ghu0Var);
        }
        this.f139492k = true;
        return (this.f139490i == 0 && this.f139491j == 0) ? ghu0.f102815e : ghu0Var;
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: e */
    public final void mo150392e() {
        if (this.f139492k) {
            this.f139492k = false;
            int i = this.f139491j;
            int i2 = this.f203569b.f102819d;
            this.f139494m = new byte[i * i2];
            this.f139493l = this.f139490i * i2;
        }
        this.f139495n = 0;
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: f */
    public final void mo150393f() {
        if (this.f139492k) {
            int i = this.f139495n;
            if (i > 0) {
                this.f139496o += (long) (i / this.f203569b.f102819d);
            }
            this.f139495n = 0;
        }
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: g */
    public final void mo150394g() {
        this.f139494m = ggw0.f102573f;
    }

    /* JADX INFO: renamed from: i */
    public final long m160010i() {
        return this.f139496o;
    }

    /* JADX INFO: renamed from: j */
    public final void m160011j() {
        this.f139496o = 0L;
    }

    /* JADX INFO: renamed from: k */
    public final void m160012k(int i, int i2) {
        this.f139490i = i;
        this.f139491j = i2;
    }

    @Override // p149l.zku0, p149l.qju0
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.f139495n) > 0) {
            m219206d(i).put(this.f139494m, 0, this.f139495n).flip();
            this.f139495n = 0;
        }
        return super.zzb();
    }

    @Override // p149l.zku0, p149l.qju0
    public final boolean zzh() {
        return super.zzh() && this.f139495n == 0;
    }
}
