package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class lp2 extends fix {

    /* JADX INFO: renamed from: k */
    public final long f129154k;

    /* JADX INFO: renamed from: l */
    public final long f129155l;

    /* JADX INFO: renamed from: m */
    public np2 f129156m;

    /* JADX INFO: renamed from: n */
    public int[] f129157n;

    public lp2(a5c a5cVar, C2047a c2047a, C1871k c1871k, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        super(a5cVar, c2047a, c1871k, i, obj, j, j2, j5);
        this.f129154k = j3;
        this.f129155l = j4;
    }

    /* JADX INFO: renamed from: i */
    public final int m150818i(int i) {
        return ((int[]) p11.m167015i(this.f129157n))[i];
    }

    /* JADX INFO: renamed from: j */
    public final np2 m150819j() {
        return (np2) p11.m167015i(this.f129156m);
    }

    /* JADX INFO: renamed from: k */
    public void m150820k(np2 np2Var) {
        this.f129156m = np2Var;
        this.f129157n = np2Var.m160442a();
    }
}
