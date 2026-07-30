package p153l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class rty0 extends fuu0 {

    /* JADX INFO: renamed from: i */
    public int f164877i;

    /* JADX INFO: renamed from: j */
    public boolean f164878j;

    /* JADX INFO: renamed from: k */
    public byte[] f164879k;

    /* JADX INFO: renamed from: l */
    public byte[] f164880l;

    /* JADX INFO: renamed from: m */
    public int f164881m;

    /* JADX INFO: renamed from: n */
    public int f164882n;

    /* JADX INFO: renamed from: o */
    public int f164883o;

    /* JADX INFO: renamed from: p */
    public boolean f164884p;

    /* JADX INFO: renamed from: q */
    public long f164885q;

    public rty0() {
        byte[] bArr = mpw0.f137962f;
        this.f164879k = bArr;
        this.f164880l = bArr;
    }

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !m127547h()) {
            int i = this.f164881m;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f164879k.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i2 = this.f164877i;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f164881m = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    m127543d(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f164884p = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i != 1) {
                int iLimit3 = byteBuffer.limit();
                int iM183179l = m183179l(byteBuffer);
                byteBuffer.limit(iM183179l);
                this.f164885q += (long) (byteBuffer.remaining() / this.f164877i);
                m183181n(byteBuffer, this.f164880l, this.f164883o);
                if (iM183179l < iLimit3) {
                    m183180m(this.f164880l, this.f164883o);
                    this.f164881m = 0;
                    byteBuffer.limit(iLimit3);
                }
            } else {
                int iLimit4 = byteBuffer.limit();
                int iM183179l2 = m183179l(byteBuffer);
                int iPosition2 = iM183179l2 - byteBuffer.position();
                byte[] bArr = this.f164879k;
                int length = bArr.length;
                int i3 = this.f164882n;
                int i4 = length - i3;
                if (iM183179l2 >= iLimit4 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f164879k, this.f164882n, iMin);
                    int i5 = this.f164882n + iMin;
                    this.f164882n = i5;
                    byte[] bArr2 = this.f164879k;
                    if (i5 == bArr2.length) {
                        if (this.f164884p) {
                            m183180m(bArr2, this.f164883o);
                            long j = this.f164885q;
                            int i6 = this.f164882n;
                            int i7 = this.f164883o;
                            this.f164885q = j + ((long) ((i6 - (i7 + i7)) / this.f164877i));
                            i5 = i6;
                        } else {
                            this.f164885q += (long) ((i5 - this.f164883o) / this.f164877i);
                        }
                        m183181n(byteBuffer, this.f164879k, i5);
                        this.f164882n = 0;
                        this.f164881m = 2;
                    }
                    byteBuffer.limit(iLimit4);
                } else {
                    m183180m(bArr, i3);
                    this.f164882n = 0;
                    this.f164881m = 0;
                }
            }
        }
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: c */
    public final mqu0 mo127542c(mqu0 mqu0Var) throws zzds {
        if (mqu0Var.f138278c == 2) {
            return this.f164878j ? mqu0Var : mqu0.f138275e;
        }
        throw new zzds("Unhandled input format:", mqu0Var);
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: e */
    public final void mo127544e() {
        if (this.f164878j) {
            this.f164877i = this.f100948b.f138279d;
            int iM183178k = m183178k(150000L) * this.f164877i;
            if (this.f164879k.length != iM183178k) {
                this.f164879k = new byte[iM183178k];
            }
            int iM183178k2 = m183178k(20000L) * this.f164877i;
            this.f164883o = iM183178k2;
            if (this.f164880l.length != iM183178k2) {
                this.f164880l = new byte[iM183178k2];
            }
        }
        this.f164881m = 0;
        this.f164885q = 0L;
        this.f164882n = 0;
        this.f164884p = false;
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: f */
    public final void mo127545f() {
        int i = this.f164882n;
        if (i > 0) {
            m183180m(this.f164879k, i);
            this.f164882n = 0;
            this.f164881m = 0;
        }
        if (this.f164884p) {
            return;
        }
        this.f164885q += (long) (this.f164883o / this.f164877i);
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: g */
    public final void mo127546g() {
        this.f164878j = false;
        this.f164883o = 0;
        byte[] bArr = mpw0.f137962f;
        this.f164879k = bArr;
        this.f164880l = bArr;
    }

    /* JADX INFO: renamed from: i */
    public final long m183176i() {
        return this.f164885q;
    }

    /* JADX INFO: renamed from: j */
    public final void m183177j(boolean z) {
        this.f164878j = z;
    }

    /* JADX INFO: renamed from: k */
    public final int m183178k(long j) {
        return (int) ((j * ((long) this.f100948b.f138276a)) / 1000000);
    }

    /* JADX INFO: renamed from: l */
    public final int m183179l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i = this.f164877i;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: m */
    public final void m183180m(byte[] bArr, int i) {
        m127543d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f164884p = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m183181n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f164883o);
        int i2 = this.f164883o - iMin;
        System.arraycopy(bArr, i - i2, this.f164880l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f164880l, i2, iMin);
    }

    @Override // p153l.fuu0, p153l.wsu0
    public final boolean zzg() {
        return this.f164878j;
    }
}
