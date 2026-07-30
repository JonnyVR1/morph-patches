package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cif0 extends AbstractC1834c0 {

    /* JADX INFO: renamed from: s */
    public static final Object f81070s = new Object();

    /* JADX INFO: renamed from: t */
    public static final C1921n f81071t = new C1921n.c().m10635c("SinglePeriodTimeline").m10638f(Uri.EMPTY).m10633a();

    /* JADX INFO: renamed from: f */
    public final long f81072f;

    /* JADX INFO: renamed from: g */
    public final long f81073g;

    /* JADX INFO: renamed from: h */
    public final long f81074h;

    /* JADX INFO: renamed from: i */
    public final long f81075i;

    /* JADX INFO: renamed from: j */
    public final long f81076j;

    /* JADX INFO: renamed from: k */
    public final long f81077k;

    /* JADX INFO: renamed from: l */
    public final long f81078l;

    /* JADX INFO: renamed from: m */
    public final boolean f81079m;

    /* JADX INFO: renamed from: n */
    public final boolean f81080n;

    /* JADX INFO: renamed from: o */
    public final boolean f81081o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final Object f81082p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C1921n f81083q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final C1921n.g f81084r;

    public cif0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1921n c1921n) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c1921n, z3 ? c1921n.f7962d : null);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: f */
    public int mo9396f(Object obj) {
        return f81070s.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: k */
    public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
        p11.m167009c(i, 0, 1);
        return bVar.m9745v(null, z ? f81070s : null, 0, this.f81075i, -this.f81077k);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: m */
    public int mo9717m() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: q */
    public Object mo9402q(int i) {
        p11.m167009c(i, 0, 1);
        return f81070s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: s */
    public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
        long j2;
        p11.m167009c(i, 0, 1);
        long j3 = this.f81078l;
        boolean z = this.f81080n;
        if (!z || this.f81081o || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f81076j;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return dVar.m9755i(AbstractC1834c0.d.f7319r, this.f81083q, this.f81082p, this.f81072f, this.f81073g, this.f81074h, this.f81079m, z, this.f81084r, j2, this.f81076j, 0, 0, this.f81077k);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: t */
    public int mo9721t() {
        return 1;
    }

    public cif0(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1921n c1921n) {
        this(j, j, 0L, 0L, z, z2, z3, obj, c1921n);
    }

    public cif0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1921n c1921n, @Nullable C1921n.g gVar) {
        this.f81072f = j;
        this.f81073g = j2;
        this.f81074h = j3;
        this.f81075i = j4;
        this.f81076j = j5;
        this.f81077k = j6;
        this.f81078l = j7;
        this.f81079m = z;
        this.f81080n = z2;
        this.f81081o = z3;
        this.f81082p = obj;
        this.f81083q = (C1921n) p11.m167011e(c1921n);
        this.f81084r = gVar;
    }
}
