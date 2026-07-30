package p153l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class nrr0 implements per0 {

    /* JADX INFO: renamed from: d */
    public static final ifr0 f143426d = new ifr0() { // from class: l.mrr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new nrr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final orr0 f143427a = new orr0(null);

    /* JADX INFO: renamed from: b */
    public final bgw0 f143428b = new bgw0(2786);

    /* JADX INFO: renamed from: c */
    public boolean f143429c;

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f143429c = false;
        this.f143427a.zze();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        bgw0 bgw0Var = new bgw0(10);
        int i = 0;
        while (true) {
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(bgw0Var.m104271m(), 0, 10, false);
            bgw0Var.m104269k(0);
            if (bgw0Var.m104247D() != 4801587) {
                break;
            }
            bgw0Var.m104270l(3);
            int iM104244A = bgw0Var.m104244A();
            i += iM104244A + 10;
            fer0Var.m125318j(iM104244A, false);
        }
        qer0Var.zzj();
        fer0 fer0Var2 = (fer0) qer0Var;
        fer0Var2.m125318j(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            fer0Var2.mo125313c(bgw0Var.m104271m(), 0, 6, false);
            bgw0Var.m104269k(0);
            if (bgw0Var.m104249F() != 2935) {
                qer0Var.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                fer0Var2.m125318j(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iM125130b = fdr0.m125130b(bgw0Var.m104271m());
                if (iM125130b == -1) {
                    return false;
                }
                fer0Var2.m125318j(iM125130b - 6, false);
            }
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f143427a.mo155731d(ser0Var, new gur0(Integer.MIN_VALUE, 0, 1));
        ser0Var.mo101544c();
        ser0Var.mo101551j(new agr0(-9223372036854775807L, 0L));
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        int iMo12781a = qer0Var.mo12781a(this.f143428b.m104271m(), 0, 2786);
        if (iMo12781a == -1) {
            return -1;
        }
        this.f143428b.m104269k(0);
        this.f143428b.m104268j(iMo12781a);
        if (!this.f143429c) {
            this.f143427a.mo155730c(0L, 4);
            this.f143429c = true;
        }
        this.f143427a.mo155729b(this.f143428b);
        return 0;
    }
}
