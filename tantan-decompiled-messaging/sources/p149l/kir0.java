package p149l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class kir0 implements j5r0 {

    /* JADX INFO: renamed from: d */
    public static final c6r0 f123383d = new c6r0() { // from class: l.jir0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new kir0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final lir0 f123384a = new lir0(null);

    /* JADX INFO: renamed from: b */
    public final v6w0 f123385b = new v6w0(16384);

    /* JADX INFO: renamed from: c */
    public boolean f123386c;

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f123386c = false;
        this.f123384a.zze();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        int i;
        v6w0 v6w0Var = new v6w0(10);
        int i2 = 0;
        while (true) {
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(v6w0Var.m197264m(), 0, 10, false);
            v6w0Var.m197262k(0);
            if (v6w0Var.m197240D() != 4801587) {
                break;
            }
            v6w0Var.m197263l(3);
            int iM197237A = v6w0Var.m197237A();
            i2 += iM197237A + 10;
            z4r0Var.m217118j(iM197237A, false);
        }
        k5r0Var.zzj();
        z4r0 z4r0Var2 = (z4r0) k5r0Var;
        z4r0Var2.m217118j(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            z4r0Var2.mo140051c(v6w0Var.m197264m(), 0, 7, false);
            v6w0Var.m197262k(0);
            int iM197242F = v6w0Var.m197242F();
            if (iM197242F == 44096 || iM197242F == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrM197264m = v6w0Var.m197264m();
                int[] iArr = c4r0.f79291a;
                if (bArrM197264m.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArrM197264m[2] & 255) << 8) | (bArrM197264m[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArrM197264m[4] & 255) << 16) | ((bArrM197264m[5] & 255) << 8) | (bArrM197264m[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM197242F == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                z4r0Var2.m217118j(i - 7, false);
            } else {
                k5r0Var.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                z4r0Var2.m217118j(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f123384a.mo121628d(m5r0Var, new alr0(Integer.MIN_VALUE, 0, 1));
        m5r0Var.mo129453c();
        m5r0Var.mo129455j(new u6r0(-9223372036854775807L, 0L));
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        int iMo12727a = k5r0Var.mo12727a(this.f123385b.m197264m(), 0, 16384);
        if (iMo12727a == -1) {
            return -1;
        }
        this.f123385b.m197262k(0);
        this.f123385b.m197261j(iMo12727a);
        if (!this.f123386c) {
            this.f123384a.mo121627c(0L, 4);
            this.f123386c = true;
        }
        this.f123384a.mo121626b(this.f123385b);
        return 0;
    }
}
