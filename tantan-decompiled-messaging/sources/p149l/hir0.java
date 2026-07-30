package p149l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hir0 implements j5r0 {

    /* JADX INFO: renamed from: d */
    public static final c6r0 f107963d = new c6r0() { // from class: l.gir0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new hir0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final iir0 f107964a = new iir0(null);

    /* JADX INFO: renamed from: b */
    public final v6w0 f107965b = new v6w0(2786);

    /* JADX INFO: renamed from: c */
    public boolean f107966c;

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f107966c = false;
        this.f107964a.zze();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        v6w0 v6w0Var = new v6w0(10);
        int i = 0;
        while (true) {
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(v6w0Var.m197264m(), 0, 10, false);
            v6w0Var.m197262k(0);
            if (v6w0Var.m197240D() != 4801587) {
                break;
            }
            v6w0Var.m197263l(3);
            int iM197237A = v6w0Var.m197237A();
            i += iM197237A + 10;
            z4r0Var.m217118j(iM197237A, false);
        }
        k5r0Var.zzj();
        z4r0 z4r0Var2 = (z4r0) k5r0Var;
        z4r0Var2.m217118j(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            z4r0Var2.mo140051c(v6w0Var.m197264m(), 0, 6, false);
            v6w0Var.m197262k(0);
            if (v6w0Var.m197242F() != 2935) {
                k5r0Var.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                z4r0Var2.m217118j(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM217055b = z3r0.m217055b(v6w0Var.m197264m());
                if (iM217055b == -1) {
                    return false;
                }
                z4r0Var2.m217118j(iM217055b - 6, false);
            }
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f107964a.mo121628d(m5r0Var, new alr0(Integer.MIN_VALUE, 0, 1));
        m5r0Var.mo129453c();
        m5r0Var.mo129455j(new u6r0(-9223372036854775807L, 0L));
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        int iMo12727a = k5r0Var.mo12727a(this.f107965b.m197264m(), 0, 2786);
        if (iMo12727a == -1) {
            return -1;
        }
        this.f107965b.m197262k(0);
        this.f107965b.m197261j(iMo12727a);
        if (!this.f107966c) {
            this.f107964a.mo121627c(0L, 4);
            this.f107966c = true;
        }
        this.f107964a.mo121626b(this.f107965b);
        return 0;
    }
}
