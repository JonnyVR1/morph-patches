package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class jer0 extends ffr0 {

    /* JADX INFO: renamed from: n */
    @Nullable
    public i6r0 f117602n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public ier0 f117603o;

    /* JADX INFO: renamed from: j */
    public static boolean m141160j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: a */
    public final long mo101562a(v6w0 v6w0Var) {
        if (!m141160j(v6w0Var.m197264m())) {
            return -1L;
        }
        int i = (v6w0Var.m197264m()[2] & 255) >> 4;
        if (i == 6) {
            v6w0Var.m197263l(4);
            v6w0Var.m197248L();
        } else if (i == 7) {
            i = 7;
            v6w0Var.m197263l(4);
            v6w0Var.m197248L();
        }
        int iM115108a = e6r0.m115108a(v6w0Var, i);
        v6w0Var.m197262k(0);
        return iM115108a;
    }

    @Override // p149l.ffr0
    /* JADX INFO: renamed from: b */
    public final void mo101563b(boolean z) {
        super.mo101563b(z);
        if (z) {
            this.f117602n = null;
            this.f117603o = null;
        }
    }

    @Override // p149l.ffr0
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo101564c(v6w0 v6w0Var, long j, cfr0 cfr0Var) {
        byte[] bArrM197264m = v6w0Var.m197264m();
        i6r0 i6r0Var = this.f117602n;
        if (i6r0Var == null) {
            i6r0 i6r0Var2 = new i6r0(bArrM197264m, 17);
            this.f117602n = i6r0Var2;
            cfr0Var.f80650a = i6r0Var2.m134638c(Arrays.copyOfRange(bArrM197264m, 9, v6w0Var.m197271t()), null);
            return true;
        }
        if ((bArrM197264m[0] & 127) == 3) {
            h6r0 h6r0VarM119635b = f6r0.m119635b(v6w0Var);
            i6r0 i6r0VarM134641f = i6r0Var.m134641f(h6r0VarM119635b);
            this.f117602n = i6r0VarM134641f;
            this.f117603o = new ier0(i6r0VarM134641f, h6r0VarM119635b);
            return true;
        }
        if (!m141160j(bArrM197264m)) {
            return true;
        }
        ier0 ier0Var = this.f117603o;
        if (ier0Var != null) {
            ier0Var.m135716c(j);
            cfr0Var.f80651b = this.f117603o;
        }
        cfr0Var.f80650a.getClass();
        return false;
    }
}
