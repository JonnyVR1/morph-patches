package p153l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class tty0 extends fuu0 {

    /* JADX INFO: renamed from: i */
    public int f176117i;

    /* JADX INFO: renamed from: j */
    public int f176118j;

    /* JADX INFO: renamed from: k */
    public boolean f176119k;

    /* JADX INFO: renamed from: l */
    public int f176120l;

    /* JADX INFO: renamed from: m */
    public byte[] f176121m = mpw0.f137962f;

    /* JADX INFO: renamed from: n */
    public int f176122n;

    /* JADX INFO: renamed from: o */
    public long f176123o;

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f176120l);
        this.f176123o += (long) (iMin / this.f100948b.f138279d);
        this.f176120l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f176120l <= 0) {
            int i2 = i - iMin;
            int length = (this.f176122n + i2) - this.f176121m.length;
            ByteBuffer byteBufferM127543d = m127543d(length);
            int iMax = Math.max(0, Math.min(length, this.f176122n));
            byteBufferM127543d.put(this.f176121m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferM127543d.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iMax2;
            int i4 = this.f176122n - iMax;
            this.f176122n = i4;
            byte[] bArr = this.f176121m;
            System.arraycopy(bArr, iMax, bArr, 0, i4);
            byteBuffer.get(this.f176121m, this.f176122n, i3);
            this.f176122n += i3;
            byteBufferM127543d.flip();
        }
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: c */
    public final mqu0 mo127542c(mqu0 mqu0Var) throws zzds {
        if (mqu0Var.f138278c != 2) {
            throw new zzds("Unhandled input format:", mqu0Var);
        }
        this.f176119k = true;
        return (this.f176117i == 0 && this.f176118j == 0) ? mqu0.f138275e : mqu0Var;
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: e */
    public final void mo127544e() {
        if (this.f176119k) {
            this.f176119k = false;
            int i = this.f176118j;
            int i2 = this.f100948b.f138279d;
            this.f176121m = new byte[i * i2];
            this.f176120l = this.f176117i * i2;
        }
        this.f176122n = 0;
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: f */
    public final void mo127545f() {
        if (this.f176119k) {
            int i = this.f176122n;
            if (i > 0) {
                this.f176123o += (long) (i / this.f100948b.f138279d);
            }
            this.f176122n = 0;
        }
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: g */
    public final void mo127546g() {
        this.f176121m = mpw0.f137962f;
    }

    /* JADX INFO: renamed from: i */
    public final long m192698i() {
        return this.f176123o;
    }

    /* JADX INFO: renamed from: j */
    public final void m192699j() {
        this.f176123o = 0L;
    }

    /* JADX INFO: renamed from: k */
    public final void m192700k(int i, int i2) {
        this.f176117i = i;
        this.f176118j = i2;
    }

    @Override // p153l.fuu0, p153l.wsu0
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.f176122n) > 0) {
            m127543d(i).put(this.f176121m, 0, this.f176122n).flip();
            this.f176122n = 0;
        }
        return super.zzb();
    }

    @Override // p153l.fuu0, p153l.wsu0
    public final boolean zzh() {
        return super.zzh() && this.f176122n == 0;
    }
}
