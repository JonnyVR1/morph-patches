package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzds;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class hnu0 implements qju0 {

    /* JADX INFO: renamed from: b */
    public int f108705b;

    /* JADX INFO: renamed from: c */
    public float f108706c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f108707d = 1.0f;

    /* JADX INFO: renamed from: e */
    public ghu0 f108708e;

    /* JADX INFO: renamed from: f */
    public ghu0 f108709f;

    /* JADX INFO: renamed from: g */
    public ghu0 f108710g;

    /* JADX INFO: renamed from: h */
    public ghu0 f108711h;

    /* JADX INFO: renamed from: i */
    public boolean f108712i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public bmu0 f108713j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f108714k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f108715l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f108716m;

    /* JADX INFO: renamed from: n */
    public long f108717n;

    /* JADX INFO: renamed from: o */
    public long f108718o;

    /* JADX INFO: renamed from: p */
    public boolean f108719p;

    public hnu0() {
        ghu0 ghu0Var = ghu0.f102815e;
        this.f108708e = ghu0Var;
        this.f108709f = ghu0Var;
        this.f108710g = ghu0Var;
        this.f108711h = ghu0Var;
        ByteBuffer byteBuffer = qju0.f154991a;
        this.f108714k = byteBuffer;
        this.f108715l = byteBuffer.asShortBuffer();
        this.f108716m = byteBuffer;
        this.f108705b = -1;
    }

    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            bmu0 bmu0Var = this.f108713j;
            bmu0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f108717n += (long) iRemaining;
            bmu0Var.m102705f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p149l.qju0
    /* JADX INFO: renamed from: b */
    public final ghu0 mo132015b(ghu0 ghu0Var) throws zzds {
        if (ghu0Var.f102818c != 2) {
            throw new zzds("Unhandled input format:", ghu0Var);
        }
        int i = this.f108705b;
        if (i == -1) {
            i = ghu0Var.f102816a;
        }
        this.f108708e = ghu0Var;
        ghu0 ghu0Var2 = new ghu0(i, ghu0Var.f102817b, 2);
        this.f108709f = ghu0Var2;
        this.f108712i = true;
        return ghu0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final long m132016c(long j) {
        long j2 = this.f108718o;
        if (j2 < 1024) {
            return (long) (((double) this.f108706c) * j);
        }
        long j3 = this.f108717n;
        bmu0 bmu0Var = this.f108713j;
        bmu0Var.getClass();
        long jM102701b = j3 - ((long) bmu0Var.m102701b());
        int i = this.f108711h.f102816a;
        int i2 = this.f108710g.f102816a;
        return i == i2 ? ggw0.m126051H(j, jM102701b, j2, RoundingMode.FLOOR) : ggw0.m126051H(j, jM102701b * ((long) i), j2 * ((long) i2), RoundingMode.FLOOR);
    }

    /* JADX INFO: renamed from: d */
    public final void m132017d(float f) {
        if (this.f108707d != f) {
            this.f108707d = f;
            this.f108712i = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m132018e(float f) {
        if (this.f108706c != f) {
            this.f108706c = f;
            this.f108712i = true;
        }
    }

    @Override // p149l.qju0
    public final ByteBuffer zzb() {
        int iM102700a;
        bmu0 bmu0Var = this.f108713j;
        if (bmu0Var != null && (iM102700a = bmu0Var.m102700a()) > 0) {
            if (this.f108714k.capacity() < iM102700a) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM102700a).order(ByteOrder.nativeOrder());
                this.f108714k = byteBufferOrder;
                this.f108715l = byteBufferOrder.asShortBuffer();
            } else {
                this.f108714k.clear();
                this.f108715l.clear();
            }
            bmu0Var.m102703d(this.f108715l);
            this.f108718o += (long) iM102700a;
            this.f108714k.limit(iM102700a);
            this.f108716m = this.f108714k;
        }
        ByteBuffer byteBuffer = this.f108716m;
        this.f108716m = qju0.f154991a;
        return byteBuffer;
    }

    @Override // p149l.qju0
    public final void zzc() {
        if (zzg()) {
            ghu0 ghu0Var = this.f108708e;
            this.f108710g = ghu0Var;
            ghu0 ghu0Var2 = this.f108709f;
            this.f108711h = ghu0Var2;
            if (this.f108712i) {
                this.f108713j = new bmu0(ghu0Var.f102816a, ghu0Var.f102817b, this.f108706c, this.f108707d, ghu0Var2.f102816a);
            } else {
                bmu0 bmu0Var = this.f108713j;
                if (bmu0Var != null) {
                    bmu0Var.m102702c();
                }
            }
        }
        this.f108716m = qju0.f154991a;
        this.f108717n = 0L;
        this.f108718o = 0L;
        this.f108719p = false;
    }

    @Override // p149l.qju0
    public final void zzd() {
        bmu0 bmu0Var = this.f108713j;
        if (bmu0Var != null) {
            bmu0Var.m102704e();
        }
        this.f108719p = true;
    }

    @Override // p149l.qju0
    public final void zzf() {
        this.f108706c = 1.0f;
        this.f108707d = 1.0f;
        ghu0 ghu0Var = ghu0.f102815e;
        this.f108708e = ghu0Var;
        this.f108709f = ghu0Var;
        this.f108710g = ghu0Var;
        this.f108711h = ghu0Var;
        ByteBuffer byteBuffer = qju0.f154991a;
        this.f108714k = byteBuffer;
        this.f108715l = byteBuffer.asShortBuffer();
        this.f108716m = byteBuffer;
        this.f108705b = -1;
        this.f108712i = false;
        this.f108713j = null;
        this.f108717n = 0L;
        this.f108718o = 0L;
        this.f108719p = false;
    }

    @Override // p149l.qju0
    public final boolean zzg() {
        if (this.f108709f.f102816a != -1) {
            return Math.abs(this.f108706c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f108707d + (-1.0f)) >= 1.0E-4f || this.f108709f.f102816a != this.f108708e.f102816a;
        }
        return false;
    }

    @Override // p149l.qju0
    public final boolean zzh() {
        if (!this.f108719p) {
            return false;
        }
        bmu0 bmu0Var = this.f108713j;
        return bmu0Var == null || bmu0Var.m102700a() == 0;
    }
}
