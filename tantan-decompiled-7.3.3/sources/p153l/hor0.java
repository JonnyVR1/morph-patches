package p153l;

import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class hor0 extends lor0 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f110946o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f110947p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f110948n;

    /* JADX INFO: renamed from: j */
    public static boolean m136455j(bgw0 bgw0Var) {
        return m136456k(bgw0Var, f110946o);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m136456k(bgw0 bgw0Var, byte[] bArr) {
        if (bgw0Var.m104275q() < 8) {
            return false;
        }
        int iM104277s = bgw0Var.m104277s();
        byte[] bArr2 = new byte[8];
        bgw0Var.m104265g(bArr2, 0, 8);
        bgw0Var.m104269k(iM104277s);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: a */
    public final long mo136457a(bgw0 bgw0Var) {
        return m155098f(xfr0.m210818d(bgw0Var.m104271m()));
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: b */
    public final void mo136458b(boolean z) {
        super.mo136458b(z);
        if (z) {
            this.f110948n = false;
        }
    }

    @Override // p153l.lor0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo136459c(bgw0 bgw0Var, long j, ior0 ior0Var) throws zzcc {
        if (m136456k(bgw0Var, f110946o)) {
            byte[] bArrCopyOf = Arrays.copyOf(bgw0Var.m104271m(), bgw0Var.m104278t());
            int i = bArrCopyOf[9] & 255;
            List listM210819e = xfr0.m210819e(bArrCopyOf);
            if (ior0Var.f116196a == null) {
                znr0 znr0Var = new znr0();
                znr0Var.m220672w("audio/opus");
                znr0Var.m220659k0(i);
                znr0Var.m220673x(48000);
                znr0Var.m220660l(listM210819e);
                ior0Var.f116196a = znr0Var.m220645D();
                return true;
            }
        } else {
            if (!m136456k(bgw0Var, f110947p)) {
                lev0.m153954b(ior0Var.f116196a);
                return false;
            }
            lev0.m153954b(ior0Var.f116196a);
            if (!this.f110948n) {
                this.f110948n = true;
                bgw0Var.m104270l(8);
                zzby zzbyVarM215874b = ygr0.m215874b(zzgaa.zzk(ygr0.m215875c(bgw0Var, false, false).f184059b));
                if (zzbyVarM215874b != null) {
                    znr0 znr0VarM187559b = ior0Var.f116196a.m187559b();
                    znr0VarM187559b.m220665p(zzbyVarM215874b.m13608d(ior0Var.f116196a.f170249j));
                    ior0Var.f116196a = znr0VarM187559b.m220645D();
                }
            }
        }
        return true;
    }
}
