package p149l;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class yut0 {

    /* JADX INFO: renamed from: e */
    public static final yut0 f200123e = new yut0(null, new jws0[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: f */
    public static final jws0 f200124f = new jws0(0).m143667b(0);

    /* JADX INFO: renamed from: g */
    public static final String f200125g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h */
    public static final String f200126h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i */
    public static final String f200127i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j */
    public static final String f200128j = Integer.toString(4, 36);

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final g8y0 f200129k = new g8y0() { // from class: l.zzq0
    };

    /* JADX INFO: renamed from: d */
    public final jws0[] f200133d;

    /* JADX INFO: renamed from: b */
    public final long f200131b = 0;

    /* JADX INFO: renamed from: a */
    public final int f200130a = 0;

    /* JADX INFO: renamed from: c */
    public final int f200132c = 0;

    public yut0(@Nullable Object obj, jws0[] jws0VarArr, long j, long j2, int i) {
        this.f200133d = jws0VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final jws0 m216160a(@IntRange(from = 0) int i) {
        return i < 0 ? f200124f : this.f200133d[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m216161b(int i) {
        m216160a(-1);
        String str = jws0.f120109i;
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yut0.class == obj.getClass()) {
            yut0 yut0Var = (yut0) obj;
            if (ggw0.m126064f(null, null) && Arrays.equals(this.f200133d, yut0Var.f200133d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.f200133d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
