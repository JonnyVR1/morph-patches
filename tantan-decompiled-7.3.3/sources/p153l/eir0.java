package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class eir0 implements per0 {

    /* JADX INFO: renamed from: n */
    public static final ifr0 f94191n = new ifr0() { // from class: l.rhr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new eir0(0)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final byte[] f94192a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f94193b;

    /* JADX INFO: renamed from: c */
    public final jfr0 f94194c;

    /* JADX INFO: renamed from: d */
    public ser0 f94195d;

    /* JADX INFO: renamed from: e */
    public sgr0 f94196e;

    /* JADX INFO: renamed from: f */
    public int f94197f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzby f94198g;

    /* JADX INFO: renamed from: h */
    public ofr0 f94199h;

    /* JADX INFO: renamed from: i */
    public int f94200i;

    /* JADX INFO: renamed from: j */
    public int f94201j;

    /* JADX INFO: renamed from: k */
    public qhr0 f94202k;

    /* JADX INFO: renamed from: l */
    public int f94203l;

    /* JADX INFO: renamed from: m */
    public long f94204m;

    public eir0(int i) {
        this.f94192a = new byte[42];
        this.f94193b = new bgw0(new byte[32768], 0);
        this.f94194c = new jfr0();
        this.f94197f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final long m120941a(bgw0 bgw0Var, boolean z) {
        boolean zM149624c;
        this.f94199h.getClass();
        int iM104277s = bgw0Var.m104277s();
        while (iM104277s <= bgw0Var.m104278t() - 16) {
            bgw0Var.m104269k(iM104277s);
            if (kfr0.m149624c(bgw0Var, this.f94199h, this.f94201j, this.f94194c)) {
                bgw0Var.m104269k(iM104277s);
                return this.f94194c.f120617a;
            }
            iM104277s++;
        }
        if (!z) {
            bgw0Var.m104269k(iM104277s);
            return -1L;
        }
        while (iM104277s <= bgw0Var.m104278t() - this.f94200i) {
            bgw0Var.m104269k(iM104277s);
            try {
                zM149624c = kfr0.m149624c(bgw0Var, this.f94199h, this.f94201j, this.f94194c);
            } catch (IndexOutOfBoundsException unused) {
                zM149624c = false;
            }
            if (bgw0Var.m104277s() <= bgw0Var.m104278t() && zM149624c) {
                bgw0Var.m104269k(iM104277s);
                return this.f94194c.f120617a;
            }
            iM104277s++;
        }
        bgw0Var.m104269k(bgw0Var.m104278t());
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public final void m120942b() {
        long j = this.f94204m * 1000000;
        ofr0 ofr0Var = this.f94199h;
        int i = mpw0.f137957a;
        this.f94196e.mo99372c(j / ((long) ofr0Var.f147150e), 1, this.f94203l, 0, null);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        if (j == 0) {
            this.f94197f = 0;
        } else {
            qhr0 qhr0Var = this.f94202k;
            if (qhr0Var != null) {
                qhr0Var.m103780d(j2);
            }
        }
        this.f94204m = j2 != 0 ? -1L : 0L;
        this.f94203l = 0;
        this.f94193b.m104266h(0);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        lfr0.m154036a(qer0Var, false);
        bgw0 bgw0Var = new bgw0(4);
        ((fer0) qer0Var).mo125313c(bgw0Var.m104271m(), 0, 4, false);
        return bgw0Var.m104253J() == 1716281667;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f94195d = ser0Var;
        this.f94196e = ser0Var.mo101550i(0, 1);
        ser0Var.mo101544c();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        boolean zM115563o;
        bgr0 agr0Var;
        boolean z;
        int i = this.f94197f;
        if (i == 0) {
            qer0Var.zzj();
            long jZze = qer0Var.zze();
            zzby zzbyVarM154036a = lfr0.m154036a(qer0Var, true);
            ((fer0) qer0Var).m125319k((int) (qer0Var.zze() - jZze), false);
            this.f94198g = zzbyVarM154036a;
            this.f94197f = 1;
            return 0;
        }
        if (i == 1) {
            ((fer0) qer0Var).mo125313c(this.f94192a, 0, 42, false);
            qer0Var.zzj();
            this.f94197f = 2;
            return 0;
        }
        if (i == 2) {
            bgw0 bgw0Var = new bgw0(4);
            ((fer0) qer0Var).mo125312b(bgw0Var.m104271m(), 0, 4, false);
            if (bgw0Var.m104253J() != 1716281667) {
                throw zzcc.zza("Failed to read FLAC stream marker.", null);
            }
            this.f94197f = 3;
            return 0;
        }
        if (i == 3) {
            ofr0 ofr0VarM167512e = this.f94199h;
            do {
                qer0Var.zzj();
                dfw0 dfw0Var = new dfw0(new byte[4], 4);
                fer0 fer0Var = (fer0) qer0Var;
                fer0Var.mo125313c(dfw0Var.f88231a, 0, 4, false);
                zM115563o = dfw0Var.m115563o();
                int iM115552d = dfw0Var.m115552d(7);
                int iM115552d2 = dfw0Var.m115552d(24) + 4;
                if (iM115552d == 0) {
                    byte[] bArr = new byte[38];
                    fer0Var.mo125312b(bArr, 0, 38, false);
                    ofr0VarM167512e = new ofr0(bArr, 4);
                } else {
                    if (ofr0VarM167512e == null) {
                        fig0.m125680a();
                        return 0;
                    }
                    if (iM115552d == 3) {
                        bgw0 bgw0Var2 = new bgw0(iM115552d2);
                        fer0Var.mo125312b(bgw0Var2.m104271m(), 0, iM115552d2, false);
                        ofr0VarM167512e = ofr0VarM167512e.m167513f(lfr0.m154037b(bgw0Var2));
                    } else if (iM115552d == 4) {
                        bgw0 bgw0Var3 = new bgw0(iM115552d2);
                        fer0Var.mo125312b(bgw0Var3.m104271m(), 0, iM115552d2, false);
                        bgw0Var3.m104270l(4);
                        ofr0VarM167512e = ofr0VarM167512e.m167514g(Arrays.asList(ygr0.m215875c(bgw0Var3, false, false).f184059b));
                    } else if (iM115552d == 6) {
                        bgw0 bgw0Var4 = new bgw0(iM115552d2);
                        fer0Var.mo125312b(bgw0Var4.m104271m(), 0, iM115552d2, false);
                        bgw0Var4.m104270l(4);
                        ofr0VarM167512e = ofr0VarM167512e.m167512e(zzgaa.zzm(zzafw.m13593a(bgw0Var4)));
                    } else {
                        fer0Var.m125319k(iM115552d2, false);
                    }
                }
                int i2 = mpw0.f137957a;
                this.f94199h = ofr0VarM167512e;
            } while (!zM115563o);
            ofr0VarM167512e.getClass();
            this.f94200i = Math.max(ofr0VarM167512e.f147148c, 6);
            this.f94196e.mo99373d(this.f94199h.m167510c(this.f94192a, this.f94198g));
            this.f94197f = 4;
            return 0;
        }
        if (i == 4) {
            qer0Var.zzj();
            bgw0 bgw0Var5 = new bgw0(2);
            ((fer0) qer0Var).mo125313c(bgw0Var5.m104271m(), 0, 2, false);
            int iM104249F = bgw0Var5.m104249F();
            if ((iM104249F >> 2) != 16382) {
                qer0Var.zzj();
                throw zzcc.zza("First frame does not start with sync code.", null);
            }
            qer0Var.zzj();
            this.f94201j = iM104249F;
            ser0 ser0Var = this.f94195d;
            int i3 = mpw0.f137957a;
            long jZzf = qer0Var.zzf();
            long jZzd = qer0Var.zzd();
            ofr0 ofr0Var = this.f94199h;
            ofr0Var.getClass();
            if (ofr0Var.f147156k != null) {
                agr0Var = new mfr0(ofr0Var, jZzf);
            } else if (jZzd == -1 || ofr0Var.f147155j <= 0) {
                agr0Var = new agr0(ofr0Var.m167508a(), 0L);
            } else {
                qhr0 qhr0Var = new qhr0(ofr0Var, this.f94201j, jZzf, jZzd);
                this.f94202k = qhr0Var;
                agr0Var = qhr0Var.m103778b();
            }
            ser0Var.mo101551j(agr0Var);
            this.f94197f = 5;
            return 0;
        }
        this.f94196e.getClass();
        ofr0 ofr0Var2 = this.f94199h;
        ofr0Var2.getClass();
        qhr0 qhr0Var2 = this.f94202k;
        if (qhr0Var2 != null && qhr0Var2.m103781e()) {
            return qhr0Var2.m103777a(qer0Var, yfr0Var);
        }
        if (this.f94204m == -1) {
            this.f94204m = kfr0.m149623b(qer0Var, ofr0Var2);
            return 0;
        }
        bgw0 bgw0Var6 = this.f94193b;
        int iM104278t = bgw0Var6.m104278t();
        if (iM104278t < 32768) {
            int iMo12781a = qer0Var.mo12781a(bgw0Var6.m104271m(), iM104278t, 32768 - iM104278t);
            z = iMo12781a == -1;
            bgw0 bgw0Var7 = this.f94193b;
            if (!z) {
                bgw0Var7.m104268j(iM104278t + iMo12781a);
            } else if (bgw0Var7.m104275q() == 0) {
                m120942b();
                return -1;
            }
        } else {
            z = false;
        }
        bgw0 bgw0Var8 = this.f94193b;
        int iM104277s = bgw0Var8.m104277s();
        int i4 = this.f94203l;
        int i5 = this.f94200i;
        if (i4 < i5) {
            bgw0Var8.m104270l(Math.min(i5 - i4, bgw0Var8.m104275q()));
        }
        long jM120941a = m120941a(this.f94193b, z);
        bgw0 bgw0Var9 = this.f94193b;
        int iM104277s2 = bgw0Var9.m104277s() - iM104277s;
        bgw0Var9.m104269k(iM104277s);
        fgr0.m125515b(this.f94196e, this.f94193b, iM104277s2);
        this.f94203l += iM104277s2;
        if (jM120941a != -1) {
            m120942b();
            this.f94203l = 0;
            this.f94204m = jM120941a;
        }
        bgw0 bgw0Var10 = this.f94193b;
        if (bgw0Var10.m104275q() >= 16) {
            return 0;
        }
        int iM104275q = bgw0Var10.m104275q();
        System.arraycopy(bgw0Var10.m104271m(), bgw0Var10.m104277s(), bgw0Var10.m104271m(), 0, iM104275q);
        this.f94193b.m104269k(0);
        this.f94193b.m104268j(iM104275q);
        return 0;
    }

    public eir0() {
        this(0);
    }
}
