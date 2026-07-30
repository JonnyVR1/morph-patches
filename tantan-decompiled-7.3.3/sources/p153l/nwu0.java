package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class nwu0 implements wsu0 {

    /* JADX INFO: renamed from: b */
    public int f144033b;

    /* JADX INFO: renamed from: c */
    public float f144034c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f144035d = 1.0f;

    /* JADX INFO: renamed from: e */
    public mqu0 f144036e;

    /* JADX INFO: renamed from: f */
    public mqu0 f144037f;

    /* JADX INFO: renamed from: g */
    public mqu0 f144038g;

    /* JADX INFO: renamed from: h */
    public mqu0 f144039h;

    /* JADX INFO: renamed from: i */
    public boolean f144040i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public hvu0 f144041j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f144042k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f144043l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f144044m;

    /* JADX INFO: renamed from: n */
    public long f144045n;

    /* JADX INFO: renamed from: o */
    public long f144046o;

    /* JADX INFO: renamed from: p */
    public boolean f144047p;

    public nwu0() {
        mqu0 mqu0Var = mqu0.f138275e;
        this.f144036e = mqu0Var;
        this.f144037f = mqu0Var;
        this.f144038g = mqu0Var;
        this.f144039h = mqu0Var;
        ByteBuffer byteBuffer = wsu0.f190695a;
        this.f144042k = byteBuffer;
        this.f144043l = byteBuffer.asShortBuffer();
        this.f144044m = byteBuffer;
        this.f144033b = -1;
    }

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            hvu0 hvu0Var = this.f144041j;
            hvu0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f144045n += (long) iRemaining;
            hvu0Var.m137405f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: b */
    public final mqu0 mo127541b(mqu0 mqu0Var) throws zzds {
        if (mqu0Var.f138278c != 2) {
            throw new zzds("Unhandled input format:", mqu0Var);
        }
        int i = this.f144033b;
        if (i == -1) {
            i = mqu0Var.f138276a;
        }
        this.f144036e = mqu0Var;
        mqu0 mqu0Var2 = new mqu0(i, mqu0Var.f138277b, 2);
        this.f144037f = mqu0Var2;
        this.f144040i = true;
        return mqu0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final long m165048c(long j) {
        long j2 = this.f144046o;
        if (j2 < 1024) {
            return (long) (((double) this.f144034c) * j);
        }
        long j3 = this.f144045n;
        hvu0 hvu0Var = this.f144041j;
        hvu0Var.getClass();
        long jM137401b = j3 - ((long) hvu0Var.m137401b());
        int i = this.f144039h.f138276a;
        int i2 = this.f144038g.f138276a;
        return i == i2 ? mpw0.m159395H(j, jM137401b, j2, RoundingMode.FLOOR) : mpw0.m159395H(j, jM137401b * ((long) i), j2 * ((long) i2), RoundingMode.FLOOR);
    }

    /* JADX INFO: renamed from: d */
    public final void m165049d(float f) {
        if (this.f144035d != f) {
            this.f144035d = f;
            this.f144040i = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m165050e(float f) {
        if (this.f144034c != f) {
            this.f144034c = f;
            this.f144040i = true;
        }
    }

    @Override // p153l.wsu0
    public final ByteBuffer zzb() {
        int iM137400a;
        hvu0 hvu0Var = this.f144041j;
        if (hvu0Var != null && (iM137400a = hvu0Var.m137400a()) > 0) {
            if (this.f144042k.capacity() < iM137400a) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM137400a).order(ByteOrder.nativeOrder());
                this.f144042k = byteBufferOrder;
                this.f144043l = byteBufferOrder.asShortBuffer();
            } else {
                this.f144042k.clear();
                this.f144043l.clear();
            }
            hvu0Var.m137403d(this.f144043l);
            this.f144046o += (long) iM137400a;
            this.f144042k.limit(iM137400a);
            this.f144044m = this.f144042k;
        }
        ByteBuffer byteBuffer = this.f144044m;
        this.f144044m = wsu0.f190695a;
        return byteBuffer;
    }

    @Override // p153l.wsu0
    public final void zzc() {
        if (zzg()) {
            mqu0 mqu0Var = this.f144036e;
            this.f144038g = mqu0Var;
            mqu0 mqu0Var2 = this.f144037f;
            this.f144039h = mqu0Var2;
            if (this.f144040i) {
                this.f144041j = new hvu0(mqu0Var.f138276a, mqu0Var.f138277b, this.f144034c, this.f144035d, mqu0Var2.f138276a);
            } else {
                hvu0 hvu0Var = this.f144041j;
                if (hvu0Var != null) {
                    hvu0Var.m137402c();
                }
            }
        }
        this.f144044m = wsu0.f190695a;
        this.f144045n = 0L;
        this.f144046o = 0L;
        this.f144047p = false;
    }

    @Override // p153l.wsu0
    public final void zzd() {
        hvu0 hvu0Var = this.f144041j;
        if (hvu0Var != null) {
            hvu0Var.m137404e();
        }
        this.f144047p = true;
    }

    @Override // p153l.wsu0
    public final void zzf() {
        this.f144034c = 1.0f;
        this.f144035d = 1.0f;
        mqu0 mqu0Var = mqu0.f138275e;
        this.f144036e = mqu0Var;
        this.f144037f = mqu0Var;
        this.f144038g = mqu0Var;
        this.f144039h = mqu0Var;
        ByteBuffer byteBuffer = wsu0.f190695a;
        this.f144042k = byteBuffer;
        this.f144043l = byteBuffer.asShortBuffer();
        this.f144044m = byteBuffer;
        this.f144033b = -1;
        this.f144040i = false;
        this.f144041j = null;
        this.f144045n = 0L;
        this.f144046o = 0L;
        this.f144047p = false;
    }

    @Override // p153l.wsu0
    public final boolean zzg() {
        if (this.f144037f.f138276a != -1) {
            return Math.abs(this.f144034c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f144035d + (-1.0f)) >= 1.0E-4f || this.f144037f.f138276a != this.f144036e.f138276a;
        }
        return false;
    }

    @Override // p153l.wsu0
    public final boolean zzh() {
        if (!this.f144047p) {
            return false;
        }
        hvu0 hvu0Var = this.f144041j;
        return hvu0Var == null || hvu0Var.m137400a() == 0;
    }
}
