package p153l;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class our0 implements per0 {

    /* JADX INFO: renamed from: h */
    public static final ifr0 f149200h = new ifr0() { // from class: l.kur0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new our0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public ser0 f149201a;

    /* JADX INFO: renamed from: b */
    public sgr0 f149202b;

    /* JADX INFO: renamed from: e */
    public mur0 f149205e;

    /* JADX INFO: renamed from: c */
    public int f149203c = 0;

    /* JADX INFO: renamed from: d */
    public long f149204d = -1;

    /* JADX INFO: renamed from: f */
    public int f149206f = -1;

    /* JADX INFO: renamed from: g */
    public long f149207g = -1;

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f149203c = j == 0 ? 0 : 4;
        mur0 mur0Var = this.f149205e;
        if (mur0Var != null) {
            mur0Var.mo155962a(j2);
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return rur0.m183219c(qer0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f149201a = ser0Var;
        this.f149202b = ser0Var.mo101550i(0, 1);
        ser0Var.mo101544c();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        int i;
        lev0.m153954b(this.f149202b);
        int i2 = mpw0.f137957a;
        int i3 = this.f149203c;
        int iM159428z = 4;
        if (i3 == 0) {
            lev0.m153958f(qer0Var.zzf() == 0);
            int i4 = this.f149206f;
            if (i4 != -1) {
                ((fer0) qer0Var).m125319k(i4, false);
                this.f149203c = 4;
            } else {
                if (!rur0.m183219c(qer0Var)) {
                    throw zzcc.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((fer0) qer0Var).m125319k((int) (qer0Var.zze() - qer0Var.zzf()), false);
                this.f149203c = 1;
            }
            return 0;
        }
        long jM104250G = -1;
        if (i3 == 1) {
            bgw0 bgw0Var = new bgw0(8);
            qur0 qur0VarM178224a = qur0.m178224a(qer0Var, bgw0Var);
            if (qur0VarM178224a.f159616a != 1685272116) {
                qer0Var.zzj();
            } else {
                fer0 fer0Var = (fer0) qer0Var;
                fer0Var.m125318j(8, false);
                bgw0Var.m104269k(0);
                fer0Var.mo125313c(bgw0Var.m104271m(), 0, 8, false);
                jM104250G = bgw0Var.m104250G();
                fer0Var.m125319k(((int) qur0VarM178224a.f159617b) + 8, false);
            }
            this.f149204d = jM104250G;
            this.f149203c = 2;
            return 0;
        }
        if (i3 == 2) {
            pur0 pur0VarM183218b = rur0.m183218b(qer0Var);
            int i5 = pur0VarM183218b.f154216a;
            if (i5 == 17) {
                this.f149205e = new lur0(this.f149201a, this.f149202b, pur0VarM183218b);
            } else if (i5 == 6) {
                this.f149205e = new nur0(this.f149201a, this.f149202b, pur0VarM183218b, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.f149205e = new nur0(this.f149201a, this.f149202b, pur0VarM183218b, "audio/g711-mlaw", -1);
            } else {
                int i6 = pur0VarM183218b.f154220e;
                if (i5 == 1) {
                    iM159428z = mpw0.m159428z(i6);
                    i = iM159428z;
                } else {
                    if (i5 != 3) {
                        if (i5 == 65534) {
                            iM159428z = mpw0.m159428z(i6);
                            i = iM159428z;
                        }
                    } else if (i6 == 32) {
                        i = iM159428z;
                    }
                    i = 0;
                }
                if (i == 0) {
                    throw zzcc.zzc("Unsupported WAV format type: " + i5);
                }
                this.f149205e = new nur0(this.f149201a, this.f149202b, pur0VarM183218b, "audio/raw", i);
            }
            this.f149203c = 3;
            return 0;
        }
        if (i3 != 3) {
            lev0.m153958f(this.f149207g != -1);
            long jZzf = this.f149207g - qer0Var.zzf();
            mur0 mur0Var = this.f149205e;
            mur0Var.getClass();
            return mur0Var.mo155964c(qer0Var, jZzf) ? -1 : 0;
        }
        Pair pairM183217a = rur0.m183217a(qer0Var);
        this.f149206f = ((Long) pairM183217a.first).intValue();
        long jLongValue = ((Long) pairM183217a.second).longValue();
        long j = this.f149204d;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.f149206f) + jLongValue;
        this.f149207g = j2;
        long jZzd = qer0Var.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            y4w0.m214278f("WavExtractor", "Data exceeds input length: " + j2 + ", " + jZzd);
            this.f149207g = jZzd;
            j2 = jZzd;
        }
        mur0 mur0Var2 = this.f149205e;
        mur0Var2.getClass();
        mur0Var2.mo155963b(this.f149206f, j2);
        this.f149203c = 4;
        return 0;
    }
}
