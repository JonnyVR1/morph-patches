package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fhr0 implements per0 {

    /* JADX INFO: renamed from: c */
    public int f99107c;

    /* JADX INFO: renamed from: e */
    public ghr0 f99109e;

    /* JADX INFO: renamed from: h */
    public long f99112h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ihr0 f99113i;

    /* JADX INFO: renamed from: m */
    public int f99117m;

    /* JADX INFO: renamed from: n */
    public boolean f99118n;

    /* JADX INFO: renamed from: a */
    public final bgw0 f99105a = new bgw0(12);

    /* JADX INFO: renamed from: b */
    public final ehr0 f99106b = new ehr0(null);

    /* JADX INFO: renamed from: d */
    public ser0 f99108d = new ner0();

    /* JADX INFO: renamed from: g */
    public ihr0[] f99111g = new ihr0[0];

    /* JADX INFO: renamed from: k */
    public long f99115k = -1;

    /* JADX INFO: renamed from: l */
    public long f99116l = -1;

    /* JADX INFO: renamed from: j */
    public int f99114j = -1;

    /* JADX INFO: renamed from: f */
    public long f99110f = -9223372036854775807L;

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ihr0 m125601b(int i) {
        for (ihr0 ihr0Var : this.f99111g) {
            if (ihr0Var.m140028g(i)) {
                return ihr0Var;
            }
        }
        return null;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f99112h = -1L;
        this.f99113i = null;
        for (ihr0 ihr0Var : this.f99111g) {
            ihr0Var.m140027f(j);
        }
        if (j == 0) {
            this.f99107c = this.f99111g.length != 0 ? 3 : 0;
        } else {
            this.f99107c = 6;
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        ((fer0) qer0Var).mo125313c(this.f99105a.m104271m(), 0, 12, false);
        this.f99105a.m104269k(0);
        if (this.f99105a.m104282x() != 1179011410) {
            return false;
        }
        this.f99105a.m104270l(4);
        return this.f99105a.m104282x() == 541677121;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f99107c = 0;
        this.f99108d = ser0Var;
        this.f99112h = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0300  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        boolean z;
        int i;
        int i2;
        ihr0 ihr0Var;
        long j = this.f99112h;
        int i3 = 0;
        if (j != -1) {
            long jZzf = qer0Var.zzf();
            if (j < jZzf || j > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzf) {
                yfr0Var.f199649a = j;
                z = true;
            } else {
                ((fer0) qer0Var).m125319k((int) (j - jZzf), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.f99112h = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.f99107c;
        ihr0 ihr0Var2 = null;
        if (i4 == 0) {
            if (!mo97907d(qer0Var)) {
                throw zzcc.zza("AVI Header List not found", null);
            }
            ((fer0) qer0Var).m125319k(12, false);
            this.f99107c = 1;
            return 0;
        }
        if (i4 == 1) {
            ((fer0) qer0Var).mo125312b(this.f99105a.m104271m(), 0, 12, false);
            this.f99105a.m104269k(0);
            ehr0 ehr0Var = this.f99106b;
            bgw0 bgw0Var = this.f99105a;
            ehr0Var.m120853a(bgw0Var);
            int i5 = ehr0Var.f94068a;
            if (i5 != 1414744396) {
                throw zzcc.zza("LIST expected, found: " + i5, null);
            }
            ehr0Var.f94070c = bgw0Var.m104282x();
            ehr0 ehr0Var2 = this.f99106b;
            int i6 = ehr0Var2.f94070c;
            if (i6 == 1819436136) {
                this.f99114j = ehr0Var2.f94069b;
                this.f99107c = 2;
                return 0;
            }
            throw zzcc.zza("hdrl expected, found: " + i6, null);
        }
        if (i4 == 2) {
            int i7 = this.f99114j - 4;
            bgw0 bgw0Var2 = new bgw0(i7);
            ((fer0) qer0Var).mo125312b(bgw0Var2.m104271m(), 0, i7, false);
            jhr0 jhr0VarM144929b = jhr0.m144929b(1819436136, bgw0Var2);
            if (jhr0VarM144929b.zza() != 1819436136) {
                throw zzcc.zza("Unexpected header list type " + jhr0VarM144929b.zza(), null);
            }
            ghr0 ghr0Var = (ghr0) jhr0VarM144929b.m144930a(ghr0.class);
            if (ghr0Var == null) {
                throw zzcc.zza("AviHeader not found", null);
            }
            this.f99109e = ghr0Var;
            this.f99110f = ((long) ghr0Var.f104149c) * ((long) ghr0Var.f104147a);
            ArrayList arrayList = new ArrayList();
            zzgaa zzgaaVar = jhr0VarM144929b.f121002a;
            int size = zzgaaVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                bhr0 bhr0Var = (bhr0) zzgaaVar.get(i8);
                if (bhr0Var.zza() == 1819440243) {
                    jhr0 jhr0Var = (jhr0) bhr0Var;
                    int i10 = i9 + 1;
                    hhr0 hhr0Var = (hhr0) jhr0Var.m144930a(hhr0.class);
                    khr0 khr0Var = (khr0) jhr0Var.m144930a(khr0.class);
                    if (hhr0Var == null) {
                        y4w0.m214278f("AviExtractor", "Missing Stream Header");
                    } else {
                        if (khr0Var == null) {
                            y4w0.m214278f("AviExtractor", "Missing Stream Format");
                        } else {
                            i = i10;
                            long jM159395H = mpw0.m159395H(hhr0Var.f109919d, ((long) hhr0Var.f109917b) * 1000000, hhr0Var.f109918c, RoundingMode.FLOOR);
                            sqr0 sqr0Var = khr0Var.f126903a;
                            znr0 znr0VarM187559b = sqr0Var.m187559b();
                            znr0VarM187559b.m220656j(i9);
                            int i11 = hhr0Var.f109920e;
                            if (i11 != 0) {
                                znr0VarM187559b.m220664o(i11);
                            }
                            lhr0 lhr0Var = (lhr0) jhr0Var.m144930a(lhr0.class);
                            if (lhr0Var != null) {
                                znr0VarM187559b.m220662m(lhr0Var.f132134a);
                            }
                            int iM96490b = a8t0.m96490b(sqr0Var.f170251l);
                            if (iM96490b == 1) {
                                i2 = iM96490b;
                            } else if (iM96490b == 2) {
                                i2 = 2;
                            } else {
                                ihr0Var = null;
                            }
                            sgr0 sgr0VarMo101550i = this.f99108d.mo101550i(i9, i2);
                            sgr0VarMo101550i.mo99373d(znr0VarM187559b.m220645D());
                            ihr0Var = new ihr0(i9, i2, jM159395H, hhr0Var.f109919d, sgr0VarMo101550i);
                            this.f99110f = jM159395H;
                        }
                        if (ihr0Var != null) {
                            arrayList.add(ihr0Var);
                        }
                        i9 = i;
                    }
                    ihr0Var = ihr0Var2;
                    i = i10;
                    if (ihr0Var != null) {
                        arrayList.add(ihr0Var);
                    }
                    i9 = i;
                }
                i8++;
                ihr0Var2 = null;
                i3 = 0;
            }
            int i12 = i3;
            this.f99111g = (ihr0[]) arrayList.toArray(new ihr0[i12]);
            this.f99108d.mo101544c();
            this.f99107c = 3;
            return i12;
        }
        long j2 = 0;
        if (i4 == 3) {
            long j3 = this.f99115k;
            if (j3 != -1 && qer0Var.zzf() != j3) {
                this.f99112h = j3;
                return 0;
            }
            ((fer0) qer0Var).mo125313c(this.f99105a.m104271m(), 0, 12, false);
            qer0Var.zzj();
            this.f99105a.m104269k(0);
            this.f99106b.m120853a(this.f99105a);
            bgw0 bgw0Var3 = this.f99105a;
            ehr0 ehr0Var3 = this.f99106b;
            int iM104282x = bgw0Var3.m104282x();
            int i13 = ehr0Var3.f94068a;
            if (i13 == 1179011410) {
                ((fer0) qer0Var).m125319k(12, false);
                return 0;
            }
            if (i13 != 1414744396 || iM104282x != 1769369453) {
                this.f99112h = qer0Var.zzf() + ((long) ehr0Var3.f94069b) + 8;
                return 0;
            }
            long jZzf2 = qer0Var.zzf();
            this.f99115k = jZzf2;
            long j4 = jZzf2 + ((long) ehr0Var3.f94069b) + 8;
            this.f99116l = j4;
            if (!this.f99118n) {
                ghr0 ghr0Var2 = this.f99109e;
                ghr0Var2.getClass();
                if ((ghr0Var2.f104148b & 16) == 16) {
                    this.f99107c = 4;
                    this.f99112h = j4;
                    return 0;
                }
                this.f99108d.mo101551j(new agr0(this.f99110f, 0L));
                this.f99118n = true;
            }
            this.f99112h = qer0Var.zzf() + 12;
            this.f99107c = 6;
            return 0;
        }
        if (i4 == 4) {
            ((fer0) qer0Var).mo125312b(this.f99105a.m104271m(), 0, 8, false);
            this.f99105a.m104269k(0);
            bgw0 bgw0Var4 = this.f99105a;
            int iM104282x2 = bgw0Var4.m104282x();
            int iM104282x3 = bgw0Var4.m104282x();
            if (iM104282x2 == 829973609) {
                this.f99107c = 5;
                this.f99117m = iM104282x3;
            } else {
                this.f99112h = qer0Var.zzf() + ((long) iM104282x3);
            }
            return 0;
        }
        if (i4 == 5) {
            bgw0 bgw0Var5 = new bgw0(this.f99117m);
            ((fer0) qer0Var).mo125312b(bgw0Var5.m104271m(), 0, this.f99117m, false);
            if (bgw0Var5.m104275q() >= 16) {
                int iM104277s = bgw0Var5.m104277s();
                bgw0Var5.m104270l(8);
                long jM104282x = bgw0Var5.m104282x();
                long j5 = this.f99115k;
                j2 = jM104282x <= j5 ? j5 + 8 : 0L;
                bgw0Var5.m104269k(iM104277s);
            }
            while (bgw0Var5.m104275q() >= 16) {
                int iM104282x4 = bgw0Var5.m104282x();
                int iM104282x5 = bgw0Var5.m104282x();
                long jM104282x2 = ((long) bgw0Var5.m104282x()) + j2;
                bgw0Var5.m104282x();
                ihr0 ihr0VarM125601b = m125601b(iM104282x4);
                if (ihr0VarM125601b != null) {
                    if ((iM104282x5 & 16) == 16) {
                        ihr0VarM125601b.m140023b(jM104282x2);
                    }
                    ihr0VarM125601b.m140025d();
                }
            }
            for (ihr0 ihr0Var3 : this.f99111g) {
                ihr0Var3.m140024c();
            }
            this.f99118n = true;
            this.f99108d.mo101551j(new chr0(this, this.f99110f));
            this.f99107c = 6;
            this.f99112h = this.f99115k;
            return 0;
        }
        if (qer0Var.zzf() >= this.f99116l) {
            return -1;
        }
        ihr0 ihr0Var4 = this.f99113i;
        if (ihr0Var4 != null) {
            if (!ihr0Var4.m140029h(qer0Var)) {
                return 0;
            }
            this.f99113i = null;
            return 0;
        }
        if ((qer0Var.zzf() & 1) == 1) {
            ((fer0) qer0Var).m125319k(1, false);
        }
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(this.f99105a.m104271m(), 0, 12, false);
        this.f99105a.m104269k(0);
        int iM104282x6 = this.f99105a.m104282x();
        bgw0 bgw0Var6 = this.f99105a;
        if (iM104282x6 == 1414744396) {
            bgw0Var6.m104269k(8);
            fer0Var.m125319k(this.f99105a.m104282x() != 1769369453 ? 8 : 12, false);
            qer0Var.zzj();
            return 0;
        }
        int iM104282x7 = bgw0Var6.m104282x();
        if (iM104282x6 == 1263424842) {
            this.f99112h = qer0Var.zzf() + ((long) iM104282x7) + 8;
            return 0;
        }
        fer0Var.m125319k(8, false);
        qer0Var.zzj();
        ihr0 ihr0VarM125601b2 = m125601b(iM104282x6);
        if (ihr0VarM125601b2 == null) {
            this.f99112h = qer0Var.zzf() + ((long) iM104282x7);
            return 0;
        }
        ihr0VarM125601b2.m140026e(iM104282x7);
        this.f99113i = ihr0VarM125601b2;
        return 0;
    }
}
