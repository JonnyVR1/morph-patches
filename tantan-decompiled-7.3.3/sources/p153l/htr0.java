package p153l;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class htr0 implements per0 {

    /* JADX INFO: renamed from: l */
    public static final ifr0 f111583l = new ifr0() { // from class: l.ftr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new htr0()};
        }
    };

    /* JADX INFO: renamed from: e */
    public boolean f111588e;

    /* JADX INFO: renamed from: f */
    public boolean f111589f;

    /* JADX INFO: renamed from: g */
    public boolean f111590g;

    /* JADX INFO: renamed from: h */
    public long f111591h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public dtr0 f111592i;

    /* JADX INFO: renamed from: j */
    public ser0 f111593j;

    /* JADX INFO: renamed from: k */
    public boolean f111594k;

    /* JADX INFO: renamed from: a */
    public final nnw0 f111584a = new nnw0(0);

    /* JADX INFO: renamed from: c */
    public final bgw0 f111586c = new bgw0(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f111585b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final etr0 f111587d = new etr0();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        nnw0 nnw0Var = this.f111584a;
        if (nnw0Var.m164003f() != -9223372036854775807L) {
            long jM164001d = nnw0Var.m164001d();
            if (jM164001d != -9223372036854775807L && jM164001d != 0 && jM164001d != j2) {
                nnw0Var.m164004i(j2);
            }
        } else {
            nnw0Var.m164004i(j2);
        }
        dtr0 dtr0Var = this.f111592i;
        if (dtr0Var != null) {
            dtr0Var.m103780d(j2);
        }
        for (int i = 0; i < this.f111585b.size(); i++) {
            ((gtr0) this.f111585b.valueAt(i)).m132257b();
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        byte[] bArr = new byte[14];
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fer0Var.m125318j(bArr[13] & 7, false);
        fer0Var.mo125313c(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f111593j = ser0Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        yrr0 lsr0Var;
        lev0.m153954b(this.f111593j);
        long jZzd = qer0Var.zzd();
        if (jZzd != -1) {
            etr0 etr0Var = this.f111587d;
            if (!etr0Var.m122501e()) {
                return etr0Var.m122498a(qer0Var, yfr0Var);
            }
        }
        if (!this.f111594k) {
            this.f111594k = true;
            etr0 etr0Var2 = this.f111587d;
            if (etr0Var2.m122499b() != -9223372036854775807L) {
                dtr0 dtr0Var = new dtr0(etr0Var2.m122500d(), etr0Var2.m122499b(), jZzd);
                this.f111592i = dtr0Var;
                this.f111593j.mo101551j(dtr0Var.m103778b());
            } else {
                this.f111593j.mo101551j(new agr0(etr0Var2.m122499b(), 0L));
            }
        }
        dtr0 dtr0Var2 = this.f111592i;
        if (dtr0Var2 != null && dtr0Var2.m103781e()) {
            return dtr0Var2.m103777a(qer0Var, yfr0Var);
        }
        qer0Var.zzj();
        long jZze = jZzd != -1 ? jZzd - qer0Var.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !qer0Var.mo125313c(this.f111586c.m104271m(), 0, 4, true)) {
            return -1;
        }
        this.f111586c.m104269k(0);
        int iM104280v = this.f111586c.m104280v();
        if (iM104280v == 441) {
            return -1;
        }
        if (iM104280v == 442) {
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(this.f111586c.m104271m(), 0, 10, false);
            this.f111586c.m104269k(9);
            fer0Var.m125319k((this.f111586c.m104245B() & 7) + 14, false);
            return 0;
        }
        if (iM104280v == 443) {
            fer0 fer0Var2 = (fer0) qer0Var;
            fer0Var2.mo125313c(this.f111586c.m104271m(), 0, 2, false);
            this.f111586c.m104269k(0);
            fer0Var2.m125319k(this.f111586c.m104249F() + 6, false);
            return 0;
        }
        if ((iM104280v >> 8) != 1) {
            ((fer0) qer0Var).m125319k(1, false);
            return 0;
        }
        int i = iM104280v & 255;
        gtr0 gtr0Var = (gtr0) this.f111585b.get(i);
        if (!this.f111588e) {
            if (gtr0Var == null) {
                yrr0 yrr0Var = null;
                if (i == 189) {
                    lsr0Var = new orr0(null);
                    this.f111589f = true;
                    this.f111591h = qer0Var.zzf();
                } else if ((iM104280v & 224) == 192) {
                    lsr0Var = new xsr0(null);
                    this.f111589f = true;
                    this.f111591h = qer0Var.zzf();
                } else if ((iM104280v & 240) == 224) {
                    lsr0Var = new lsr0(null);
                    this.f111590g = true;
                    this.f111591h = qer0Var.zzf();
                } else if (yrr0Var != null) {
                    yrr0Var.mo155731d(this.f111593j, new gur0(Integer.MIN_VALUE, i, 256));
                    gtr0Var = new gtr0(yrr0Var, this.f111584a);
                    this.f111585b.put(i, gtr0Var);
                }
                yrr0Var = lsr0Var;
                if (yrr0Var != null) {
                    yrr0Var.mo155731d(this.f111593j, new gur0(Integer.MIN_VALUE, i, 256));
                    gtr0Var = new gtr0(yrr0Var, this.f111584a);
                    this.f111585b.put(i, gtr0Var);
                }
            }
            boolean z = this.f111589f;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.f111590g) {
                j = this.f111591h + 8192;
            }
            if (qer0Var.zzf() > j) {
                this.f111588e = true;
                this.f111593j.mo101544c();
            }
        }
        fer0 fer0Var3 = (fer0) qer0Var;
        fer0Var3.mo125313c(this.f111586c.m104271m(), 0, 2, false);
        this.f111586c.m104269k(0);
        int iM104249F = this.f111586c.m104249F() + 6;
        if (gtr0Var == null) {
            fer0Var3.m125319k(iM104249F, false);
        } else {
            this.f111586c.m104266h(iM104249F);
            fer0Var3.mo125312b(this.f111586c.m104271m(), 0, iM104249F, false);
            this.f111586c.m104269k(6);
            gtr0Var.m132256a(this.f111586c);
            bgw0 bgw0Var = this.f111586c;
            bgw0Var.m104268j(bgw0Var.m104276r());
        }
        return 0;
    }
}
