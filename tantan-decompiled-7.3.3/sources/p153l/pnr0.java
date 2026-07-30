package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class pnr0 extends lor0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public ofr0 f153325n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public onr0 f153326o;

    /* JADX INFO: renamed from: j */
    public static boolean m173078j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: a */
    public final long mo136457a(bgw0 bgw0Var) {
        if (!m173078j(bgw0Var.m104271m())) {
            return -1L;
        }
        int i = (bgw0Var.m104271m()[2] & 255) >> 4;
        if (i == 6) {
            bgw0Var.m104270l(4);
            bgw0Var.m104255L();
        } else if (i == 7) {
            i = 7;
            bgw0Var.m104270l(4);
            bgw0Var.m104255L();
        }
        int iM149622a = kfr0.m149622a(bgw0Var, i);
        bgw0Var.m104269k(0);
        return iM149622a;
    }

    @Override // p153l.lor0
    /* JADX INFO: renamed from: b */
    public final void mo136458b(boolean z) {
        super.mo136458b(z);
        if (z) {
            this.f153325n = null;
            this.f153326o = null;
        }
    }

    @Override // p153l.lor0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo136459c(bgw0 bgw0Var, long j, ior0 ior0Var) {
        byte[] bArrM104271m = bgw0Var.m104271m();
        ofr0 ofr0Var = this.f153325n;
        if (ofr0Var == null) {
            ofr0 ofr0Var2 = new ofr0(bArrM104271m, 17);
            this.f153325n = ofr0Var2;
            ior0Var.f116196a = ofr0Var2.m167510c(Arrays.copyOfRange(bArrM104271m, 9, bgw0Var.m104278t()), null);
            return true;
        }
        if ((bArrM104271m[0] & 127) == 3) {
            nfr0 nfr0VarM154037b = lfr0.m154037b(bgw0Var);
            ofr0 ofr0VarM167513f = ofr0Var.m167513f(nfr0VarM154037b);
            this.f153325n = ofr0VarM167513f;
            this.f153326o = new onr0(ofr0VarM167513f, nfr0VarM154037b);
            return true;
        }
        if (!m173078j(bArrM104271m)) {
            return true;
        }
        onr0 onr0Var = this.f153326o;
        if (onr0Var != null) {
            onr0Var.m168348c(j);
            ior0Var.f116197b = this.f153326o;
        }
        ior0Var.f116196a.getClass();
        return false;
    }
}
