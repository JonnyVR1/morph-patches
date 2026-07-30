package p153l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qrr0 implements per0 {

    /* JADX INFO: renamed from: d */
    public static final ifr0 f159162d = new ifr0() { // from class: l.prr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new qrr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public final rrr0 f159163a = new rrr0(null);

    /* JADX INFO: renamed from: b */
    public final bgw0 f159164b = new bgw0(16384);

    /* JADX INFO: renamed from: c */
    public boolean f159165c;

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f159165c = false;
        this.f159163a.zze();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        int i;
        bgw0 bgw0Var = new bgw0(10);
        int i2 = 0;
        while (true) {
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(bgw0Var.m104271m(), 0, 10, false);
            bgw0Var.m104269k(0);
            if (bgw0Var.m104247D() != 4801587) {
                break;
            }
            bgw0Var.m104270l(3);
            int iM104244A = bgw0Var.m104244A();
            i2 += iM104244A + 10;
            fer0Var.m125318j(iM104244A, false);
        }
        qer0Var.zzj();
        fer0 fer0Var2 = (fer0) qer0Var;
        fer0Var2.m125318j(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            fer0Var2.mo125313c(bgw0Var.m104271m(), 0, 7, false);
            bgw0Var.m104269k(0);
            int iM104249F = bgw0Var.m104249F();
            if (iM104249F == 44096 || iM104249F == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrM104271m = bgw0Var.m104271m();
                int[] iArr = idr0.f114520a;
                if (bArrM104271m.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArrM104271m[2] & 255) << 8) | (bArrM104271m[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArrM104271m[4] & 255) << 16) | ((bArrM104271m[5] & 255) << 8) | (bArrM104271m[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM104249F == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                fer0Var2.m125318j(i - 7, false);
            } else {
                qer0Var.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                fer0Var2.m125318j(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f159163a.mo155731d(ser0Var, new gur0(Integer.MIN_VALUE, 0, 1));
        ser0Var.mo101544c();
        ser0Var.mo101551j(new agr0(-9223372036854775807L, 0L));
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        int iMo12781a = qer0Var.mo12781a(this.f159164b.m104271m(), 0, 16384);
        if (iMo12781a == -1) {
            return -1;
        }
        this.f159164b.m104269k(0);
        this.f159164b.m104268j(iMo12781a);
        if (!this.f159165c) {
            this.f159163a.mo155730c(0L, 4);
            this.f159165c = true;
        }
        this.f159163a.mo155729b(this.f159164b);
        return 0;
    }
}
