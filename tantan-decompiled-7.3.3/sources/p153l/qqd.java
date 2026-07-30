package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qqd implements mg50 {

    /* JADX INFO: renamed from: a */
    public final lg50 f158978a;

    /* JADX INFO: renamed from: b */
    public final long f158979b;

    /* JADX INFO: renamed from: c */
    public final long f158980c;

    /* JADX INFO: renamed from: d */
    public final v7g0 f158981d;

    /* JADX INFO: renamed from: e */
    public int f158982e;

    /* JADX INFO: renamed from: f */
    public long f158983f;

    /* JADX INFO: renamed from: g */
    public long f158984g;

    /* JADX INFO: renamed from: h */
    public long f158985h;

    /* JADX INFO: renamed from: i */
    public long f158986i;

    /* JADX INFO: renamed from: j */
    public long f158987j;

    /* JADX INFO: renamed from: k */
    public long f158988k;

    /* JADX INFO: renamed from: l */
    public long f158989l;

    /* JADX INFO: renamed from: l.qqd$b */
    public final class C19627b implements mke0 {
        public C19627b() {
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: d */
        public mke0.C18640a mo107791d(long j) {
            return new mke0.C18640a(new oke0(j, bmk0.m105164r((qqd.this.f158979b + BigInteger.valueOf(qqd.this.f158981d.m200196c(j)).multiply(BigInteger.valueOf(qqd.this.f158980c - qqd.this.f158979b)).divide(BigInteger.valueOf(qqd.this.f158983f)).longValue()) - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, qqd.this.f158979b, qqd.this.f158980c - 1)));
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: e */
        public boolean mo107792e() {
            return true;
        }

        @Override // p153l.mke0
        /* JADX INFO: renamed from: i */
        public long mo107793i() {
            return qqd.this.f158981d.m200195b(qqd.this.f158983f);
        }
    }

    public qqd(v7g0 v7g0Var, long j, long j2, long j3, long j4, boolean z) {
        w11.m204365a(j >= 0 && j2 > j);
        this.f158981d = v7g0Var;
        this.f158979b = j;
        this.f158980c = j2;
        if (j3 == j2 - j || z) {
            this.f158983f = j4;
            this.f158982e = 4;
        } else {
            this.f158982e = 0;
        }
        this.f158978a = new lg50();
    }

    @Override // p153l.mg50
    /* JADX INFO: renamed from: a */
    public long mo158186a(asf asfVar) throws IOException {
        int i = this.f158982e;
        if (i == 0) {
            long position = asfVar.getPosition();
            this.f158984g = position;
            this.f158982e = 1;
            long j = this.f158980c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jM177497i = m177497i(asfVar);
                if (jM177497i != -1) {
                    return jM177497i;
                }
                this.f158982e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                wpg0.m207458a();
                return 0L;
            }
            m177499k(asfVar);
            this.f158982e = 4;
            return -(this.f158988k + 2);
        }
        this.f158983f = m177498j(asfVar);
        this.f158982e = 4;
        return this.f158984g;
    }

    @Override // p153l.mg50
    /* JADX INFO: renamed from: c */
    public void mo158188c(long j) {
        this.f158985h = bmk0.m105164r(j, 0L, this.f158983f - 1);
        this.f158982e = 2;
        this.f158986i = this.f158979b;
        this.f158987j = this.f158980c;
        this.f158988k = 0L;
        this.f158989l = this.f158983f;
    }

    @Override // p153l.mg50
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C19627b mo158187b() {
        if (this.f158983f != 0) {
            return new C19627b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final long m177497i(asf asfVar) throws IOException {
        if (this.f158986i == this.f158987j) {
            return -1L;
        }
        long position = asfVar.getPosition();
        if (!this.f158978a.m154063d(asfVar, this.f158987j)) {
            long j = this.f158986i;
            if (j != position) {
                return j;
            }
            zpg0.m220844a("No ogg page can be found.");
            return 0L;
        }
        this.f158978a.m154060a(asfVar, false);
        asfVar.mo99902h();
        long j2 = this.f158985h;
        lg50 lg50Var = this.f158978a;
        long j3 = lg50Var.f131933c;
        long j4 = j2 - j3;
        int i = lg50Var.f131938h + lg50Var.f131939i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.f158987j = position;
            this.f158989l = j3;
        } else {
            this.f158986i = asfVar.getPosition() + ((long) i);
            this.f158988k = this.f158978a.f131933c;
        }
        long j5 = this.f158987j;
        long j6 = this.f158986i;
        if (j5 - j6 < 100000) {
            this.f158987j = j6;
            return j6;
        }
        long position2 = asfVar.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.f158987j;
        long j8 = this.f158986i;
        return bmk0.m105164r(position2 + ((j4 * (j7 - j8)) / (this.f158989l - this.f158988k)), j8, j7 - 1);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public long m177498j(asf asfVar) throws IOException {
        this.f158978a.m154061b();
        if (!this.f158978a.m154062c(asfVar)) {
            vg3.m201207a();
            return 0L;
        }
        this.f158978a.m154060a(asfVar, false);
        lg50 lg50Var = this.f158978a;
        asfVar.mo99905o(lg50Var.f131938h + lg50Var.f131939i);
        long j = this.f158978a.f131933c;
        while (true) {
            lg50 lg50Var2 = this.f158978a;
            if ((lg50Var2.f131932b & 4) == 4 || !lg50Var2.m154062c(asfVar) || asfVar.getPosition() >= this.f158980c || !this.f158978a.m154060a(asfVar, true)) {
                break;
            }
            lg50 lg50Var3 = this.f158978a;
            if (!csf.m112180e(asfVar, lg50Var3.f131938h + lg50Var3.f131939i)) {
                break;
            }
            j = this.f158978a.f131933c;
        }
        return j;
    }

    /* JADX INFO: renamed from: k */
    public final void m177499k(asf asfVar) throws IOException {
        while (true) {
            this.f158978a.m154062c(asfVar);
            this.f158978a.m154060a(asfVar, false);
            lg50 lg50Var = this.f158978a;
            if (lg50Var.f131933c > this.f158985h) {
                asfVar.mo99902h();
                return;
            } else {
                asfVar.mo99905o(lg50Var.f131938h + lg50Var.f131939i);
                this.f158986i = asfVar.getPosition();
                this.f158988k = this.f158978a.f131933c;
            }
        }
    }
}
