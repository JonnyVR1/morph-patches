package p149l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class llr0 {
    /* JADX INFO: renamed from: a */
    public static Pair m150547a(k5r0 k5r0Var) throws IOException {
        k5r0Var.zzj();
        klr0 klr0VarM150550d = m150550d(1684108385, k5r0Var, new v6w0(8));
        ((z4r0) k5r0Var).m217119k(8, false);
        return Pair.create(Long.valueOf(k5r0Var.zzf()), Long.valueOf(klr0VarM150550d.f123691b));
    }

    /* JADX INFO: renamed from: b */
    public static jlr0 m150548b(k5r0 k5r0Var) throws IOException {
        byte[] bArr;
        v6w0 v6w0Var = new v6w0(16);
        klr0 klr0VarM150550d = m150550d(1718449184, k5r0Var, v6w0Var);
        f5v0.m119535f(klr0VarM150550d.f123691b >= 16);
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(v6w0Var.m197264m(), 0, 16, false);
        v6w0Var.m197262k(0);
        int iM197277z = v6w0Var.m197277z();
        int iM197277z2 = v6w0Var.m197277z();
        int iM197276y = v6w0Var.m197276y();
        int iM197276y2 = v6w0Var.m197276y();
        int iM197277z3 = v6w0Var.m197277z();
        int iM197277z4 = v6w0Var.m197277z();
        int i = ((int) klr0VarM150550d.f123691b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            z4r0Var.mo140051c(bArr, 0, i, false);
        } else {
            bArr = ggw0.f102573f;
        }
        byte[] bArr2 = bArr;
        ((z4r0) k5r0Var).m217119k((int) (k5r0Var.zze() - k5r0Var.zzf()), false);
        return new jlr0(iM197277z, iM197277z2, iM197276y, iM197276y2, iM197277z3, iM197277z4, bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m150549c(k5r0 k5r0Var) throws IOException {
        v6w0 v6w0Var = new v6w0(8);
        int i = klr0.m146437a(k5r0Var, v6w0Var).f123690a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((z4r0) k5r0Var).mo140051c(v6w0Var.m197264m(), 0, 4, false);
        v6w0Var.m197262k(0);
        int iM197273v = v6w0Var.m197273v();
        if (iM197273v == 1463899717) {
            return true;
        }
        svv0.m186108c("WavHeaderReader", "Unsupported form type: " + iM197273v);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static klr0 m150550d(int i, k5r0 k5r0Var, v6w0 v6w0Var) throws IOException {
        klr0 klr0VarM146437a = klr0.m146437a(k5r0Var, v6w0Var);
        while (true) {
            int i2 = klr0VarM146437a.f123690a;
            if (i2 == i) {
                return klr0VarM146437a;
            }
            svv0.m186111f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = klr0VarM146437a.f123691b + 8;
            if (j > 2147483647L) {
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + klr0VarM146437a.f123690a);
            }
            ((z4r0) k5r0Var).m217119k((int) j, false);
            klr0VarM146437a = klr0.m146437a(k5r0Var, v6w0Var);
        }
    }
}
