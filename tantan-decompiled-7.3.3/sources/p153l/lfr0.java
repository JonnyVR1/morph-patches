package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class lfr0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzby m154036a(qer0 qer0Var, boolean z) throws IOException {
        zzby zzbyVarM190959a = new tfr0().m190959a(qer0Var, z ? null : ujr0.f179328a);
        if (zzbyVarM190959a == null || zzbyVarM190959a.m13605a() == 0) {
            return null;
        }
        return zzbyVarM190959a;
    }

    /* JADX INFO: renamed from: b */
    public static nfr0 m154037b(bgw0 bgw0Var) {
        bgw0Var.m104270l(1);
        int iM104247D = bgw0Var.m104247D();
        long jM104277s = bgw0Var.m104277s();
        long j = iM104247D;
        int i = iM104247D / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM104252I = bgw0Var.m104252I();
            if (jM104252I == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM104252I;
            jArrCopyOf2[i2] = bgw0Var.m104252I();
            bgw0Var.m104270l(2);
        }
        bgw0Var.m104270l((int) ((jM104277s + j) - ((long) bgw0Var.m104277s())));
        return new nfr0(jArrCopyOf, jArrCopyOf2);
    }
}
