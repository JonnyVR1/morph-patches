package p153l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class tnr0 {

    /* JADX INFO: renamed from: a */
    public int f175309a;

    /* JADX INFO: renamed from: b */
    public long f175310b;

    /* JADX INFO: renamed from: c */
    public int f175311c;

    /* JADX INFO: renamed from: d */
    public int f175312d;

    /* JADX INFO: renamed from: e */
    public int f175313e;

    /* JADX INFO: renamed from: f */
    public final int[] f175314f = new int[255];

    /* JADX INFO: renamed from: g */
    public final bgw0 f175315g = new bgw0(255);

    /* JADX INFO: renamed from: a */
    public final void m191961a() {
        this.f175309a = 0;
        this.f175310b = 0L;
        this.f175311c = 0;
        this.f175312d = 0;
        this.f175313e = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m191962b(qer0 qer0Var, boolean z) throws IOException {
        m191961a();
        this.f175315g.m104266h(27);
        if (ter0.m190893c(qer0Var, this.f175315g.m104271m(), 0, 27, z) && this.f175315g.m104253J() == 1332176723) {
            if (this.f175315g.m104245B() != 0) {
                if (z) {
                    return false;
                }
                throw zzcc.zzc("unsupported bit stream revision");
            }
            this.f175309a = this.f175315g.m104245B();
            this.f175310b = this.f175315g.m104250G();
            this.f175315g.m104251H();
            this.f175315g.m104251H();
            this.f175315g.m104251H();
            int iM104245B = this.f175315g.m104245B();
            this.f175311c = iM104245B;
            this.f175312d = iM104245B + 27;
            this.f175315g.m104266h(iM104245B);
            if (ter0.m190893c(qer0Var, this.f175315g.m104271m(), 0, this.f175311c, z)) {
                for (int i = 0; i < this.f175311c; i++) {
                    this.f175314f[i] = this.f175315g.m104245B();
                    this.f175313e += this.f175314f[i];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m191963c(qer0 qer0Var, long j) throws IOException {
        lev0.m153956d(qer0Var.zzf() == qer0Var.zze());
        this.f175315g.m104266h(4);
        while (true) {
            if ((j != -1 && qer0Var.zzf() + 4 >= j) || !ter0.m190893c(qer0Var, this.f175315g.m104271m(), 0, 4, true)) {
                break;
            }
            this.f175315g.m104269k(0);
            if (this.f175315g.m104253J() == 1332176723) {
                qer0Var.zzj();
                return true;
            }
            ((fer0) qer0Var).m125319k(1, false);
        }
        do {
            if (j != -1 && qer0Var.zzf() >= j) {
                break;
            }
        } while (qer0Var.zzc(1) != -1);
        return false;
    }
}
