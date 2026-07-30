package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class rlr0 implements per0 {

    /* JADX INFO: renamed from: q */
    public static final ifr0 f163781q = new ifr0() { // from class: l.plr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new rlr0(0)};
        }
    };

    /* JADX INFO: renamed from: r */
    public static final sjr0 f163782r = new sjr0() { // from class: l.qlr0
    };

    /* JADX INFO: renamed from: a */
    public final bgw0 f163783a;

    /* JADX INFO: renamed from: b */
    public final vfr0 f163784b;

    /* JADX INFO: renamed from: c */
    public final rfr0 f163785c;

    /* JADX INFO: renamed from: d */
    public final tfr0 f163786d;

    /* JADX INFO: renamed from: e */
    public final sgr0 f163787e;

    /* JADX INFO: renamed from: f */
    public ser0 f163788f;

    /* JADX INFO: renamed from: g */
    public sgr0 f163789g;

    /* JADX INFO: renamed from: h */
    public sgr0 f163790h;

    /* JADX INFO: renamed from: i */
    public int f163791i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public zzby f163792j;

    /* JADX INFO: renamed from: k */
    public long f163793k;

    /* JADX INFO: renamed from: l */
    public long f163794l;

    /* JADX INFO: renamed from: m */
    public long f163795m;

    /* JADX INFO: renamed from: n */
    public int f163796n;

    /* JADX INFO: renamed from: o */
    public tlr0 f163797o;

    /* JADX INFO: renamed from: p */
    public boolean f163798p;

    public rlr0(int i) {
        this.f163783a = new bgw0(10);
        this.f163784b = new vfr0();
        this.f163785c = new rfr0();
        this.f163793k = -9223372036854775807L;
        this.f163786d = new tfr0();
        oer0 oer0Var = new oer0();
        this.f163787e = oer0Var;
        this.f163790h = oer0Var;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m182024i(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: renamed from: a */
    public final void m182025a() {
        this.f163798p = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* JADX INFO: renamed from: b */
    public final int m182026b(qer0 qer0Var) throws IOException {
        long j;
        int iM104280v;
        rfr0 rfr0Var;
        wlr0 wlr0VarM207071c;
        tlr0 tlr0VarM182028h;
        int i;
        int i2;
        olr0 olr0VarM168163c;
        long jM159393F;
        if (this.f163791i == 0) {
            try {
                m182030k(qer0Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f163797o == null) {
            bgw0 bgw0Var = new bgw0(this.f163784b.f183968c);
            ((fer0) qer0Var).mo125313c(bgw0Var.m104271m(), 0, this.f163784b.f183968c, false);
            vfr0 vfr0Var = this.f163784b;
            int i3 = vfr0Var.f183966a & 1;
            int i4 = vfr0Var.f183970e;
            int i5 = 21;
            if (i3 != 0) {
                if (i4 != 1) {
                    i5 = 36;
                }
            } else if (i4 == 1) {
                i5 = 13;
            }
            if (bgw0Var.m104278t() >= i5 + 4) {
                bgw0Var.m104269k(i5);
                iM104280v = bgw0Var.m104280v();
                if (iM104280v != 1483304551) {
                    if (iM104280v == 1231971951) {
                        iM104280v = 1231971951;
                    } else if (bgw0Var.m104278t() >= 40) {
                        bgw0Var.m104269k(36);
                        if (bgw0Var.m104280v() == 1447187017) {
                            iM104280v = 1447187017;
                        } else {
                            iM104280v = 0;
                        }
                    } else {
                        iM104280v = 0;
                    }
                }
            } else if (bgw0Var.m104278t() >= 40) {
                bgw0Var.m104269k(36);
                if (bgw0Var.m104280v() == 1447187017) {
                    iM104280v = 1447187017;
                } else {
                    iM104280v = 0;
                }
            } else {
                iM104280v = 0;
            }
            if (iM104280v == 1231971951) {
                vlr0 vlr0VarM201658a = vlr0.m201658a(this.f163784b, bgw0Var);
                rfr0Var = this.f163785c;
                if (!rfr0Var.m181279a() && (i = vlr0VarM201658a.f184631d) != -1 && (i2 = vlr0VarM201658a.f184632e) != -1) {
                    rfr0Var.f162860a = i;
                    rfr0Var.f162861b = i2;
                }
                wlr0VarM207071c = wlr0.m207071c(qer0Var.zzd(), vlr0VarM201658a, qer0Var.zzf());
                ((fer0) qer0Var).m125319k(this.f163784b.f183968c, false);
                if (wlr0VarM207071c.zzh() && iM104280v == 1231971951) {
                    tlr0VarM182028h = m182028h(qer0Var, false);
                } else {
                    tlr0VarM182028h = wlr0VarM207071c;
                }
            } else if (iM104280v == 1447187017) {
                tlr0VarM182028h = ulr0.m196563c(qer0Var.zzd(), qer0Var.zzf(), this.f163784b, bgw0Var);
                ((fer0) qer0Var).m125319k(this.f163784b.f183968c, false);
            } else if (iM104280v != 1483304551) {
                qer0Var.zzj();
                tlr0VarM182028h = null;
            } else {
                vlr0 vlr0VarM201658a2 = vlr0.m201658a(this.f163784b, bgw0Var);
                rfr0Var = this.f163785c;
                if (!rfr0Var.m181279a()) {
                    rfr0Var.f162860a = i;
                    rfr0Var.f162861b = i2;
                }
                wlr0VarM207071c = wlr0.m207071c(qer0Var.zzd(), vlr0VarM201658a2, qer0Var.zzf());
                ((fer0) qer0Var).m125319k(this.f163784b.f183968c, false);
                if (wlr0VarM207071c.zzh()) {
                    tlr0VarM182028h = wlr0VarM207071c;
                } else {
                    tlr0VarM182028h = wlr0VarM207071c;
                }
            }
            zzby zzbyVar = this.f163792j;
            long jZzf = qer0Var.zzf();
            if (zzbyVar == null) {
                j = -9223372036854775807L;
                olr0VarM168163c = null;
                break;
            }
            int iM13605a = zzbyVar.m13605a();
            int i6 = 0;
            while (true) {
                if (i6 >= iM13605a) {
                    j = -9223372036854775807L;
                    olr0VarM168163c = null;
                    break;
                }
                zzbx zzbxVarM13606b = zzbyVar.m13606b(i6);
                if (zzbxVarM13606b instanceof zzagv) {
                    zzagv zzagvVar = (zzagv) zzbxVarM13606b;
                    int iM13605a2 = zzbyVar.m13605a();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iM13605a2) {
                            j = -9223372036854775807L;
                            jM159393F = -9223372036854775807L;
                            break;
                        }
                        zzbx zzbxVarM13606b2 = zzbyVar.m13606b(i7);
                        j = -9223372036854775807L;
                        if (zzbxVarM13606b2 instanceof zzagz) {
                            zzagz zzagzVar = (zzagz) zzbxVarM13606b2;
                            if (zzagzVar.zzf.equals("TLEN")) {
                                jM159393F = mpw0.m159393F(Long.parseLong((String) zzagzVar.zzc.get(0)));
                                break;
                            }
                        }
                        i7++;
                    }
                    olr0VarM168163c = olr0.m168163c(jZzf, zzagvVar, jM159393F);
                    break;
                }
                i6++;
            }
            if (this.f163798p) {
                tlr0VarM182028h = new slr0();
            } else {
                if (olr0VarM168163c != null) {
                    tlr0VarM182028h = olr0VarM168163c;
                } else if (tlr0VarM182028h == null) {
                    tlr0VarM182028h = null;
                }
                if (tlr0VarM182028h != null) {
                    tlr0VarM182028h.zzh();
                } else {
                    tlr0VarM182028h = m182028h(qer0Var, false);
                }
            }
            this.f163797o = tlr0VarM182028h;
            this.f163788f.mo101551j(tlr0VarM182028h);
            sgr0 sgr0Var = this.f163790h;
            znr0 znr0Var = new znr0();
            znr0Var.m220672w(this.f163784b.f183967b);
            znr0Var.m220664o(4096);
            znr0Var.m220659k0(this.f163784b.f183970e);
            znr0Var.m220673x(this.f163784b.f183969d);
            znr0Var.m220651f(this.f163785c.f162860a);
            znr0Var.m220652g(this.f163785c.f162861b);
            znr0Var.m220665p(this.f163792j);
            sgr0Var.mo99373d(znr0Var.m220645D());
            this.f163795m = qer0Var.zzf();
        } else {
            j = -9223372036854775807L;
            long j2 = this.f163795m;
            if (j2 != 0) {
                long jZzf2 = qer0Var.zzf();
                if (jZzf2 < j2) {
                    ((fer0) qer0Var).m125319k((int) (j2 - jZzf2), false);
                }
            }
        }
        int i8 = this.f163796n;
        if (i8 == 0) {
            qer0Var.zzj();
            if (m182029j(qer0Var)) {
                return -1;
            }
            this.f163783a.m104269k(0);
            int iM104280v2 = this.f163783a.m104280v();
            if (!m182024i(iM104280v2, this.f163791i) || wfr0.m206146b(iM104280v2) == -1) {
                ((fer0) qer0Var).m125319k(1, false);
                this.f163791i = 0;
                return 0;
            }
            this.f163784b.m201179a(iM104280v2);
            if (this.f163793k == j) {
                this.f163793k = this.f163797o.mo158947b(qer0Var.zzf());
            }
            vfr0 vfr0Var2 = this.f163784b;
            int i9 = vfr0Var2.f183968c;
            this.f163796n = i9;
            if (this.f163797o instanceof nlr0) {
                m182027g(this.f163794l + ((long) vfr0Var2.f183972g));
                throw null;
            }
            i8 = i9;
        }
        int iMo99374e = this.f163790h.mo99374e(qer0Var, i8, true);
        if (iMo99374e == -1) {
            return -1;
        }
        int i10 = this.f163796n - iMo99374e;
        this.f163796n = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f163790h.mo99372c(m182027g(this.f163794l), 1, this.f163784b.f183968c, 0, null);
        this.f163794l += (long) this.f163784b.f183972g;
        this.f163796n = 0;
        return 0;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f163791i = 0;
        this.f163793k = -9223372036854775807L;
        this.f163794l = 0L;
        this.f163796n = 0;
        if (this.f163797o instanceof nlr0) {
            throw null;
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return m182030k(qer0Var, true);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f163788f = ser0Var;
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(0, 1);
        this.f163789g = sgr0VarMo101550i;
        this.f163790h = sgr0VarMo101550i;
        this.f163788f.mo101544c();
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        lev0.m153954b(this.f163789g);
        int i = mpw0.f137957a;
        int iM182026b = m182026b(qer0Var);
        if (iM182026b == -1 && (this.f163797o instanceof nlr0)) {
            if (this.f163797o.zza() != m182027g(this.f163794l)) {
                throw null;
            }
        }
        return iM182026b;
    }

    /* JADX INFO: renamed from: g */
    public final long m182027g(long j) {
        return this.f163793k + ((j * 1000000) / ((long) this.f163784b.f183969d));
    }

    /* JADX INFO: renamed from: h */
    public final tlr0 m182028h(qer0 qer0Var, boolean z) throws IOException {
        ((fer0) qer0Var).mo125313c(this.f163783a.m104271m(), 0, 4, false);
        this.f163783a.m104269k(0);
        this.f163784b.m201179a(this.f163783a.m104280v());
        return new mlr0(qer0Var.zzd(), qer0Var.zzf(), this.f163784b, false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m182029j(qer0 qer0Var) throws IOException {
        tlr0 tlr0Var = this.f163797o;
        if (tlr0Var != null) {
            long jZzc = tlr0Var.zzc();
            if (jZzc != -1 && qer0Var.zze() > jZzc - 4) {
                return true;
            }
        }
        try {
            return !qer0Var.mo125313c(this.f163783a.m104271m(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m182030k(qer0 qer0Var, boolean z) throws IOException {
        int iZze;
        int i;
        int iM206146b;
        qer0Var.zzj();
        if (qer0Var.zzf() == 0) {
            zzby zzbyVarM190959a = this.f163786d.m190959a(qer0Var, null);
            this.f163792j = zzbyVarM190959a;
            if (zzbyVarM190959a != null) {
                this.f163785c.m181280b(zzbyVarM190959a);
            }
            iZze = (int) qer0Var.zze();
            if (!z) {
                ((fer0) qer0Var).m125319k(iZze, false);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (m182029j(qer0Var)) {
                if (i2 > 0) {
                    break;
                }
                vg3.m201207a();
                return false;
            }
            this.f163783a.m104269k(0);
            int iM104280v = this.f163783a.m104280v();
            if ((i == 0 || m182024i(iM104280v, i)) && (iM206146b = wfr0.m206146b(iM104280v)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.f163784b.m201179a(iM104280v);
                    i = iM104280v;
                }
                ((fer0) qer0Var).m125318j(iM206146b - 4, false);
            } else {
                int i4 = i3 + 1;
                if (i3 == (true != z ? 131072 : 32768)) {
                    if (z) {
                        return false;
                    }
                    throw zzcc.zza("Searched too many bytes.", null);
                }
                if (z) {
                    qer0Var.zzj();
                    ((fer0) qer0Var).m125318j(iZze + i4, false);
                } else {
                    ((fer0) qer0Var).m125319k(1, false);
                }
                i = 0;
                i3 = i4;
                i2 = 0;
            }
        }
        if (z) {
            ((fer0) qer0Var).m125319k(iZze + i3, false);
        } else {
            qer0Var.zzj();
        }
        this.f163791i = i;
        return true;
    }

    public rlr0() {
        this(0);
    }
}
