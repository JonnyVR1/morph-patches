package p149l;

import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class bfr0 extends ffr0 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f75349o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f75350p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f75351n;

    /* JADX INFO: renamed from: j */
    public static boolean m101560j(v6w0 v6w0Var) {
        return m101561k(v6w0Var, f75349o);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m101561k(v6w0 v6w0Var, byte[] bArr) {
        if (v6w0Var.m197268q() < 8) {
            return false;
        }
        int iM197270s = v6w0Var.m197270s();
        byte[] bArr2 = new byte[8];
        v6w0Var.m197258g(bArr2, 0, 8);
        v6w0Var.m197262k(iM197270s);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: a */
    public final long mo101562a(v6w0 v6w0Var) {
        return m121185f(r6r0.m178089d(v6w0Var.m197264m()));
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: b */
    public final void mo101563b(boolean z) {
        super.mo101563b(z);
        if (z) {
            this.f75351n = false;
        }
    }

    @Override // p149l.ffr0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo101564c(v6w0 v6w0Var, long j, cfr0 cfr0Var) throws zzcc {
        if (m101561k(v6w0Var, f75349o)) {
            byte[] bArrCopyOf = Arrays.copyOf(v6w0Var.m197264m(), v6w0Var.m197271t());
            int i = bArrCopyOf[9] & 255;
            List listM178090e = r6r0.m178090e(bArrCopyOf);
            if (cfr0Var.f80650a == null) {
                ter0 ter0Var = new ter0();
                ter0Var.m188618w("audio/opus");
                ter0Var.m188605k0(i);
                ter0Var.m188619x(48000);
                ter0Var.m188606l(listM178090e);
                cfr0Var.f80650a = ter0Var.m188591D();
                return true;
            }
        } else {
            if (!m101561k(v6w0Var, f75350p)) {
                f5v0.m119531b(cfr0Var.f80650a);
                return false;
            }
            f5v0.m119531b(cfr0Var.f80650a);
            if (!this.f75351n) {
                this.f75351n = true;
                v6w0Var.m197263l(8);
                zzby zzbyVarM182515b = s7r0.m182515b(zzgaa.zzk(s7r0.m182516c(v6w0Var, false, false).f147538b));
                if (zzbyVarM182515b != null) {
                    ter0 ter0VarM154634b = cfr0Var.f80650a.m154634b();
                    ter0VarM154634b.m188611p(zzbyVarM182515b.m13554d(cfr0Var.f80650a.f133890j));
                    cfr0Var.f80650a = ter0VarM154634b.m188591D();
                }
            }
        }
        return true;
    }
}
