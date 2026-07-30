package p153l;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class e4u0 {

    /* JADX INFO: renamed from: e */
    public static final e4u0 f92149e = new e4u0(null, new p5t0[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: f */
    public static final p5t0 f92150f = new p5t0(0).m170681b(0);

    /* JADX INFO: renamed from: g */
    public static final String f92151g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    public static final String f92152h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i */
    public static final String f92153i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j */
    public static final String f92154j = Integer.toString(4, 36);

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final mhy0 f92155k = new mhy0() { // from class: l.f9r0
    };

    /* JADX INFO: renamed from: d */
    public final p5t0[] f92159d;

    /* JADX INFO: renamed from: b */
    public final long f92157b = 0;

    /* JADX INFO: renamed from: a */
    public final int f92156a = 0;

    /* JADX INFO: renamed from: c */
    public final int f92158c = 0;

    public e4u0(@Nullable Object obj, p5t0[] p5t0VarArr, long j, long j2, int i) {
        this.f92159d = p5t0VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final p5t0 m119483a(@IntRange(from = 0) int i) {
        return i < 0 ? f92150f : this.f92159d[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m119484b(int i) {
        m119483a(-1);
        String str = p5t0.f150675i;
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e4u0.class == obj.getClass()) {
            e4u0 e4u0Var = (e4u0) obj;
            if (mpw0.m159408f(null, null) && Arrays.equals(this.f92159d, e4u0Var.f92159d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.f92159d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
