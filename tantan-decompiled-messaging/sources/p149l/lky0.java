package p149l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class lky0 extends zku0 {

    /* JADX INFO: renamed from: i */
    public int f128618i;

    /* JADX INFO: renamed from: j */
    public boolean f128619j;

    /* JADX INFO: renamed from: k */
    public byte[] f128620k;

    /* JADX INFO: renamed from: l */
    public byte[] f128621l;

    /* JADX INFO: renamed from: m */
    public int f128622m;

    /* JADX INFO: renamed from: n */
    public int f128623n;

    /* JADX INFO: renamed from: o */
    public int f128624o;

    /* JADX INFO: renamed from: p */
    public boolean f128625p;

    /* JADX INFO: renamed from: q */
    public long f128626q;

    public lky0() {
        byte[] bArr = ggw0.f102573f;
        this.f128620k = bArr;
        this.f128621l = bArr;
    }

    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !m219207h()) {
            int i = this.f128622m;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f128620k.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i2 = this.f128618i;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f128622m = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    m219206d(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f128625p = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i != 1) {
                int iLimit3 = byteBuffer.limit();
                int iM150398l = m150398l(byteBuffer);
                byteBuffer.limit(iM150398l);
                this.f128626q += (long) (byteBuffer.remaining() / this.f128618i);
                m150400n(byteBuffer, this.f128621l, this.f128624o);
                if (iM150398l < iLimit3) {
                    m150399m(this.f128621l, this.f128624o);
                    this.f128622m = 0;
                    byteBuffer.limit(iLimit3);
                }
            } else {
                int iLimit4 = byteBuffer.limit();
                int iM150398l2 = m150398l(byteBuffer);
                int iPosition2 = iM150398l2 - byteBuffer.position();
                byte[] bArr = this.f128620k;
                int length = bArr.length;
                int i3 = this.f128623n;
                int i4 = length - i3;
                if (iM150398l2 >= iLimit4 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f128620k, this.f128623n, iMin);
                    int i5 = this.f128623n + iMin;
                    this.f128623n = i5;
                    byte[] bArr2 = this.f128620k;
                    if (i5 == bArr2.length) {
                        if (this.f128625p) {
                            m150399m(bArr2, this.f128624o);
                            long j = this.f128626q;
                            int i6 = this.f128623n;
                            int i7 = this.f128624o;
                            this.f128626q = j + ((long) ((i6 - (i7 + i7)) / this.f128618i));
                            i5 = i6;
                        } else {
                            this.f128626q += (long) ((i5 - this.f128624o) / this.f128618i);
                        }
                        m150400n(byteBuffer, this.f128620k, i5);
                        this.f128623n = 0;
                        this.f128622m = 2;
                    }
                    byteBuffer.limit(iLimit4);
                } else {
                    m150399m(bArr, i3);
                    this.f128623n = 0;
                    this.f128622m = 0;
                }
            }
        }
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: c */
    public final ghu0 mo150391c(ghu0 ghu0Var) throws zzds {
        if (ghu0Var.f102818c == 2) {
            return this.f128619j ? ghu0Var : ghu0.f102815e;
        }
        throw new zzds("Unhandled input format:", ghu0Var);
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: e */
    public final void mo150392e() {
        if (this.f128619j) {
            this.f128618i = this.f203569b.f102819d;
            int iM150397k = m150397k(150000L) * this.f128618i;
            if (this.f128620k.length != iM150397k) {
                this.f128620k = new byte[iM150397k];
            }
            int iM150397k2 = m150397k(20000L) * this.f128618i;
            this.f128624o = iM150397k2;
            if (this.f128621l.length != iM150397k2) {
                this.f128621l = new byte[iM150397k2];
            }
        }
        this.f128622m = 0;
        this.f128626q = 0L;
        this.f128623n = 0;
        this.f128625p = false;
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: f */
    public final void mo150393f() {
        int i = this.f128623n;
        if (i > 0) {
            m150399m(this.f128620k, i);
            this.f128623n = 0;
            this.f128622m = 0;
        }
        if (this.f128625p) {
            return;
        }
        this.f128626q += (long) (this.f128624o / this.f128618i);
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: g */
    public final void mo150394g() {
        this.f128619j = false;
        this.f128624o = 0;
        byte[] bArr = ggw0.f102573f;
        this.f128620k = bArr;
        this.f128621l = bArr;
    }

    /* JADX INFO: renamed from: i */
    public final long m150395i() {
        return this.f128626q;
    }

    /* JADX INFO: renamed from: j */
    public final void m150396j(boolean z) {
        this.f128619j = z;
    }

    /* JADX INFO: renamed from: k */
    public final int m150397k(long j) {
        return (int) ((j * ((long) this.f203569b.f102816a)) / 1000000);
    }

    /* JADX INFO: renamed from: l */
    public final int m150398l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i = this.f128618i;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: m */
    public final void m150399m(byte[] bArr, int i) {
        m219206d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f128625p = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m150400n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f128624o);
        int i2 = this.f128624o - iMin;
        System.arraycopy(bArr, i - i2, this.f128621l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f128621l, i2, iMin);
    }

    @Override // p149l.zku0, p149l.qju0
    public final boolean zzg() {
        return this.f128619j;
    }
}
