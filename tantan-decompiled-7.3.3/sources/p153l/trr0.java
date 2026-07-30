package p153l;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class trr0 implements per0 {

    /* JADX INFO: renamed from: j */
    public static final ifr0 f175919j = new ifr0() { // from class: l.srr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new trr0(0)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final urr0 f175920a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f175921b;

    /* JADX INFO: renamed from: c */
    public final bgw0 f175922c;

    /* JADX INFO: renamed from: d */
    public final dfw0 f175923d;

    /* JADX INFO: renamed from: e */
    public ser0 f175924e;

    /* JADX INFO: renamed from: f */
    public long f175925f;

    /* JADX INFO: renamed from: g */
    public long f175926g;

    /* JADX INFO: renamed from: h */
    public boolean f175927h;

    /* JADX INFO: renamed from: i */
    public boolean f175928i;

    public trr0(int i) {
        this.f175920a = new urr0(true, null);
        this.f175921b = new bgw0(2048);
        this.f175926g = -1L;
        bgw0 bgw0Var = new bgw0(10);
        this.f175922c = bgw0Var;
        byte[] bArrM104271m = bgw0Var.m104271m();
        this.f175923d = new dfw0(bArrM104271m, bArrM104271m.length);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f175927h = false;
        this.f175920a.zze();
        this.f175925f = j2;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        int i = 0;
        while (true) {
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(this.f175922c.m104271m(), 0, 10, false);
            this.f175922c.m104269k(0);
            if (this.f175922c.m104247D() != 4801587) {
                break;
            }
            this.f175922c.m104270l(3);
            int iM104244A = this.f175922c.m104244A();
            i += iM104244A + 10;
            fer0Var.m125318j(iM104244A, false);
        }
        qer0Var.zzj();
        fer0 fer0Var2 = (fer0) qer0Var;
        fer0Var2.m125318j(i, false);
        if (this.f175926g == -1) {
            this.f175926g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            fer0Var2.mo125313c(this.f175922c.m104271m(), 0, 2, false);
            this.f175922c.m104269k(0);
            if (urr0.m197657e(this.f175922c.m104249F())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                fer0Var2.mo125313c(this.f175922c.m104271m(), 0, 4, false);
                this.f175923d.m115559k(14);
                int iM115552d = this.f175923d.m115552d(13);
                if (iM115552d <= 6) {
                    i4++;
                    qer0Var.zzj();
                    fer0Var2.m125318j(i4, false);
                } else {
                    fer0Var2.m125318j(iM115552d - 6, false);
                    i3 += iM115552d;
                }
            } else {
                i4++;
                qer0Var.zzj();
                fer0Var2.m125318j(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f175924e = ser0Var;
        this.f175920a.mo155731d(ser0Var, new gur0(Integer.MIN_VALUE, 0, 1));
        ser0Var.mo101544c();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        lev0.m153954b(this.f175924e);
        int iMo12781a = qer0Var.mo12781a(this.f175921b.m104271m(), 0, 2048);
        if (!this.f175928i) {
            this.f175924e.mo101551j(new agr0(-9223372036854775807L, 0L));
            this.f175928i = true;
        }
        if (iMo12781a == -1) {
            return -1;
        }
        this.f175921b.m104269k(0);
        this.f175921b.m104268j(iMo12781a);
        if (!this.f175927h) {
            this.f175920a.mo155730c(this.f175925f, 4);
            this.f175927h = true;
        }
        this.f175920a.mo155729b(this.f175921b);
        return 0;
    }

    public trr0() {
        this(0);
    }
}
