package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lqf0 extends AbstractC1857c0 {

    /* JADX INFO: renamed from: s */
    public static final Object f133197s = new Object();

    /* JADX INFO: renamed from: t */
    public static final C1944n f133198t = new C1944n.c().m10689c("SinglePeriodTimeline").m10692f(Uri.EMPTY).m10687a();

    /* JADX INFO: renamed from: f */
    public final long f133199f;

    /* JADX INFO: renamed from: g */
    public final long f133200g;

    /* JADX INFO: renamed from: h */
    public final long f133201h;

    /* JADX INFO: renamed from: i */
    public final long f133202i;

    /* JADX INFO: renamed from: j */
    public final long f133203j;

    /* JADX INFO: renamed from: k */
    public final long f133204k;

    /* JADX INFO: renamed from: l */
    public final long f133205l;

    /* JADX INFO: renamed from: m */
    public final boolean f133206m;

    /* JADX INFO: renamed from: n */
    public final boolean f133207n;

    /* JADX INFO: renamed from: o */
    public final boolean f133208o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final Object f133209p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C1944n f133210q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final C1944n.g f133211r;

    public lqf0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1944n c1944n) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, c1944n, z3 ? c1944n.f7999d : null);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: f */
    public int mo9450f(Object obj) {
        return f133197s.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: k */
    public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
        w11.m204367c(i, 0, 1);
        return bVar.m9799v(null, z ? f133197s : null, 0, this.f133202i, -this.f133204k);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: m */
    public int mo9771m() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: q */
    public Object mo9456q(int i) {
        w11.m204367c(i, 0, 1);
        return f133197s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: s */
    public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
        long j2;
        w11.m204367c(i, 0, 1);
        long j3 = this.f133205l;
        boolean z = this.f133207n;
        if (!z || this.f133208o || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f133203j;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return dVar.m9809i(AbstractC1857c0.d.f7356r, this.f133210q, this.f133209p, this.f133199f, this.f133200g, this.f133201h, this.f133206m, z, this.f133211r, j2, this.f133203j, 0, 0, this.f133204k);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: t */
    public int mo9775t() {
        return 1;
    }

    public lqf0(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1944n c1944n) {
        this(j, j, 0L, 0L, z, z2, z3, obj, c1944n);
    }

    public lqf0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, C1944n c1944n, @Nullable C1944n.g gVar) {
        this.f133199f = j;
        this.f133200g = j2;
        this.f133201h = j3;
        this.f133202i = j4;
        this.f133203j = j5;
        this.f133204k = j6;
        this.f133205l = j7;
        this.f133206m = z;
        this.f133207n = z2;
        this.f133208o = z3;
        this.f133209p = obj;
        this.f133210q = (C1944n) w11.m204369e(c1944n);
        this.f133211r = gVar;
    }
}
