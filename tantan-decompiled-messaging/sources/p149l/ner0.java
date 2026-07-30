package p149l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ner0 {

    /* JADX INFO: renamed from: a */
    public int f138645a;

    /* JADX INFO: renamed from: b */
    public long f138646b;

    /* JADX INFO: renamed from: c */
    public int f138647c;

    /* JADX INFO: renamed from: d */
    public int f138648d;

    /* JADX INFO: renamed from: e */
    public int f138649e;

    /* JADX INFO: renamed from: f */
    public final int[] f138650f = new int[255];

    /* JADX INFO: renamed from: g */
    public final v6w0 f138651g = new v6w0(255);

    /* JADX INFO: renamed from: a */
    public final void m159121a() {
        this.f138645a = 0;
        this.f138646b = 0L;
        this.f138647c = 0;
        this.f138648d = 0;
        this.f138649e = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m159122b(k5r0 k5r0Var, boolean z) throws IOException {
        m159121a();
        this.f138651g.m197259h(27);
        if (n5r0.m157997c(k5r0Var, this.f138651g.m197264m(), 0, 27, z) && this.f138651g.m197246J() == 1332176723) {
            if (this.f138651g.m197238B() != 0) {
                if (z) {
                    return false;
                }
                throw zzcc.zzc("unsupported bit stream revision");
            }
            this.f138645a = this.f138651g.m197238B();
            this.f138646b = this.f138651g.m197243G();
            this.f138651g.m197244H();
            this.f138651g.m197244H();
            this.f138651g.m197244H();
            int iM197238B = this.f138651g.m197238B();
            this.f138647c = iM197238B;
            this.f138648d = iM197238B + 27;
            this.f138651g.m197259h(iM197238B);
            if (n5r0.m157997c(k5r0Var, this.f138651g.m197264m(), 0, this.f138647c, z)) {
                for (int i = 0; i < this.f138647c; i++) {
                    this.f138650f[i] = this.f138651g.m197238B();
                    this.f138649e += this.f138650f[i];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m159123c(k5r0 k5r0Var, long j) throws IOException {
        f5v0.m119533d(k5r0Var.zzf() == k5r0Var.zze());
        this.f138651g.m197259h(4);
        while (true) {
            if ((j != -1 && k5r0Var.zzf() + 4 >= j) || !n5r0.m157997c(k5r0Var, this.f138651g.m197264m(), 0, 4, true)) {
                break;
            }
            this.f138651g.m197262k(0);
            if (this.f138651g.m197246J() == 1332176723) {
                k5r0Var.zzj();
                return true;
            }
            ((z4r0) k5r0Var).m217119k(1, false);
        }
        do {
            if (j != -1 && k5r0Var.zzf() >= j) {
                break;
            }
        } while (k5r0Var.zzc(1) != -1);
        return false;
    }
}
