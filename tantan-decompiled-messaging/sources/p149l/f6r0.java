package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class f6r0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzby m119634a(k5r0 k5r0Var, boolean z) throws IOException {
        zzby zzbyVarM158067a = new n6r0().m158067a(k5r0Var, z ? null : oar0.f142861a);
        if (zzbyVarM158067a == null || zzbyVarM158067a.m13551a() == 0) {
            return null;
        }
        return zzbyVarM158067a;
    }

    /* JADX INFO: renamed from: b */
    public static h6r0 m119635b(v6w0 v6w0Var) {
        v6w0Var.m197263l(1);
        int iM197240D = v6w0Var.m197240D();
        long jM197270s = v6w0Var.m197270s();
        long j = iM197240D;
        int i = iM197240D / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM197245I = v6w0Var.m197245I();
            if (jM197245I == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM197245I;
            jArrCopyOf2[i2] = v6w0Var.m197245I();
            v6w0Var.m197263l(2);
        }
        v6w0Var.m197263l((int) ((jM197270s + j) - ((long) v6w0Var.m197270s())));
        return new h6r0(jArrCopyOf, jArrCopyOf2);
    }
}
