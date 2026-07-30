package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class cq2 extends crx {

    /* JADX INFO: renamed from: k */
    public final long f83062k;

    /* JADX INFO: renamed from: l */
    public final long f83063l;

    /* JADX INFO: renamed from: m */
    public eq2 f83064m;

    /* JADX INFO: renamed from: n */
    public int[] f83065n;

    public cq2(g6c g6cVar, C2070a c2070a, C1894k c1894k, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        super(g6cVar, c2070a, c1894k, i, obj, j, j2, j5);
        this.f83062k = j3;
        this.f83063l = j4;
    }

    /* JADX INFO: renamed from: i */
    public final int m111875i(int i) {
        return ((int[]) w11.m204373i(this.f83065n))[i];
    }

    /* JADX INFO: renamed from: j */
    public final eq2 m111876j() {
        return (eq2) w11.m204373i(this.f83064m);
    }

    /* JADX INFO: renamed from: k */
    public void m111877k(eq2 eq2Var) {
        this.f83064m = eq2Var;
        this.f83065n = eq2Var.m121889a();
    }
}
