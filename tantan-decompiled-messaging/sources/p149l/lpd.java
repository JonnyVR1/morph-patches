package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lpd implements f850 {

    /* JADX INFO: renamed from: a */
    public final e850 f129191a;

    /* JADX INFO: renamed from: b */
    public final long f129192b;

    /* JADX INFO: renamed from: c */
    public final long f129193c;

    /* JADX INFO: renamed from: d */
    public final ozf0 f129194d;

    /* JADX INFO: renamed from: e */
    public int f129195e;

    /* JADX INFO: renamed from: f */
    public long f129196f;

    /* JADX INFO: renamed from: g */
    public long f129197g;

    /* JADX INFO: renamed from: h */
    public long f129198h;

    /* JADX INFO: renamed from: i */
    public long f129199i;

    /* JADX INFO: renamed from: j */
    public long f129200j;

    /* JADX INFO: renamed from: k */
    public long f129201k;

    /* JADX INFO: renamed from: l */
    public long f129202l;

    /* JADX INFO: renamed from: l.lpd$b */
    public final class C18278b implements hce0 {
        public C18278b() {
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: d */
        public hce0.C17274a mo98121d(long j) {
            return new hce0.C17274a(new jce0(j, vck0.m197886r((lpd.this.f129192b + BigInteger.valueOf(lpd.this.f129194d.m166760c(j)).multiply(BigInteger.valueOf(lpd.this.f129193c - lpd.this.f129192b)).divide(BigInteger.valueOf(lpd.this.f129196f)).longValue()) - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, lpd.this.f129192b, lpd.this.f129193c - 1)));
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: e */
        public boolean mo98122e() {
            return true;
        }

        @Override // p149l.hce0
        /* JADX INFO: renamed from: i */
        public long mo98123i() {
            return lpd.this.f129194d.m166759b(lpd.this.f129196f);
        }
    }

    public lpd(ozf0 ozf0Var, long j, long j2, long j3, long j4, boolean z) {
        p11.m167007a(j >= 0 && j2 > j);
        this.f129194d = ozf0Var;
        this.f129192b = j;
        this.f129193c = j2;
        if (j3 == j2 - j || z) {
            this.f129196f = j4;
            this.f129195e = 4;
        } else {
            this.f129195e = 0;
        }
        this.f129191a = new e850();
    }

    @Override // p149l.f850
    /* JADX INFO: renamed from: a */
    public long mo119869a(tqf tqfVar) throws IOException {
        int i = this.f129195e;
        if (i == 0) {
            long position = tqfVar.getPosition();
            this.f129197g = position;
            this.f129195e = 1;
            long j = this.f129193c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jM150840i = m150840i(tqfVar);
                if (jM150840i != -1) {
                    return jM150840i;
                }
                this.f129195e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                ohg0.m164364a();
                return 0L;
            }
            m150842k(tqfVar);
            this.f129195e = 4;
            return -(this.f129201k + 2);
        }
        this.f129196f = m150841j(tqfVar);
        this.f129195e = 4;
        return this.f129197g;
    }

    @Override // p149l.f850
    /* JADX INFO: renamed from: c */
    public void mo119871c(long j) {
        this.f129198h = vck0.m197886r(j, 0L, this.f129196f - 1);
        this.f129195e = 2;
        this.f129199i = this.f129192b;
        this.f129200j = this.f129193c;
        this.f129201k = 0L;
        this.f129202l = this.f129196f;
    }

    @Override // p149l.f850
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C18278b mo119870b() {
        if (this.f129196f != 0) {
            return new C18278b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final long m150840i(tqf tqfVar) throws IOException {
        if (this.f129199i == this.f129200j) {
            return -1L;
        }
        long position = tqfVar.getPosition();
        if (!this.f129191a.m115242d(tqfVar, this.f129200j)) {
            long j = this.f129199i;
            if (j != position) {
                return j;
            }
            rhg0.m179353a("No ogg page can be found.");
            return 0L;
        }
        this.f129191a.m115239a(tqfVar, false);
        tqfVar.mo150657h();
        long j2 = this.f129198h;
        e850 e850Var = this.f129191a;
        long j3 = e850Var.f89796c;
        long j4 = j2 - j3;
        int i = e850Var.f89801h + e850Var.f89802i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f129200j = position;
            this.f129202l = j3;
        } else {
            this.f129199i = tqfVar.getPosition() + ((long) i);
            this.f129201k = this.f129191a.f89796c;
        }
        long j5 = this.f129200j;
        long j6 = this.f129199i;
        if (j5 - j6 < 100000) {
            this.f129200j = j6;
            return j6;
        }
        long position2 = tqfVar.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f129200j;
        long j8 = this.f129199i;
        return vck0.m197886r(position2 + ((j4 * (j7 - j8)) / (this.f129202l - this.f129201k)), j8, j7 - 1);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public long m150841j(tqf tqfVar) throws IOException {
        this.f129191a.m115240b();
        if (!this.f129191a.m115241c(tqfVar)) {
            hg3.m130807a();
            return 0L;
        }
        this.f129191a.m115239a(tqfVar, false);
        e850 e850Var = this.f129191a;
        tqfVar.mo150661o(e850Var.f89801h + e850Var.f89802i);
        long j = this.f129191a.f89796c;
        while (true) {
            e850 e850Var2 = this.f129191a;
            if ((e850Var2.f89795b & 4) == 4 || !e850Var2.m115241c(tqfVar) || tqfVar.getPosition() >= this.f129193c || !this.f129191a.m115239a(tqfVar, true)) {
                break;
            }
            e850 e850Var3 = this.f129191a;
            if (!vqf.m199486e(tqfVar, e850Var3.f89801h + e850Var3.f89802i)) {
                break;
            }
            j = this.f129191a.f89796c;
        }
        return j;
    }

    /* JADX INFO: renamed from: k */
    public final void m150842k(tqf tqfVar) throws IOException {
        while (true) {
            this.f129191a.m115241c(tqfVar);
            this.f129191a.m115239a(tqfVar, false);
            e850 e850Var = this.f129191a;
            if (e850Var.f89796c > this.f129198h) {
                tqfVar.mo150657h();
                return;
            } else {
                tqfVar.mo150661o(e850Var.f89801h + e850Var.f89802i);
                this.f129199i = tqfVar.getPosition();
                this.f129201k = this.f129191a.f89796c;
            }
        }
    }
}
