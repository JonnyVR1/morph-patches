package p149l;

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
public final class lcr0 implements j5r0 {

    /* JADX INFO: renamed from: q */
    public static final c6r0 f127447q = new c6r0() { // from class: l.jcr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new lcr0(0)};
        }
    };

    /* JADX INFO: renamed from: r */
    public static final mar0 f127448r = new mar0() { // from class: l.kcr0
    };

    /* JADX INFO: renamed from: a */
    public final v6w0 f127449a;

    /* JADX INFO: renamed from: b */
    public final p6r0 f127450b;

    /* JADX INFO: renamed from: c */
    public final l6r0 f127451c;

    /* JADX INFO: renamed from: d */
    public final n6r0 f127452d;

    /* JADX INFO: renamed from: e */
    public final m7r0 f127453e;

    /* JADX INFO: renamed from: f */
    public m5r0 f127454f;

    /* JADX INFO: renamed from: g */
    public m7r0 f127455g;

    /* JADX INFO: renamed from: h */
    public m7r0 f127456h;

    /* JADX INFO: renamed from: i */
    public int f127457i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public zzby f127458j;

    /* JADX INFO: renamed from: k */
    public long f127459k;

    /* JADX INFO: renamed from: l */
    public long f127460l;

    /* JADX INFO: renamed from: m */
    public long f127461m;

    /* JADX INFO: renamed from: n */
    public int f127462n;

    /* JADX INFO: renamed from: o */
    public ncr0 f127463o;

    /* JADX INFO: renamed from: p */
    public boolean f127464p;

    public lcr0(int i) {
        this.f127449a = new v6w0(10);
        this.f127450b = new p6r0();
        this.f127451c = new l6r0();
        this.f127459k = -9223372036854775807L;
        this.f127452d = new n6r0();
        i5r0 i5r0Var = new i5r0();
        this.f127453e = i5r0Var;
        this.f127456h = i5r0Var;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m149344i(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: renamed from: a */
    public final void m149345a() {
        this.f127464p = true;
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
    public final int m149346b(k5r0 k5r0Var) throws IOException {
        long j;
        int iM197273v;
        l6r0 l6r0Var;
        qcr0 qcr0VarM173924c;
        ncr0 ncr0VarM149348h;
        int i;
        int i2;
        icr0 icr0VarM135363c;
        long jM126049F;
        if (this.f127457i == 0) {
            try {
                m149350k(k5r0Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f127463o == null) {
            v6w0 v6w0Var = new v6w0(this.f127450b.f147431c);
            ((z4r0) k5r0Var).mo140051c(v6w0Var.m197264m(), 0, this.f127450b.f147431c, false);
            p6r0 p6r0Var = this.f127450b;
            int i3 = p6r0Var.f147429a & 1;
            int i4 = p6r0Var.f147433e;
            int i5 = 21;
            if (i3 != 0) {
                if (i4 != 1) {
                    i5 = 36;
                }
            } else if (i4 == 1) {
                i5 = 13;
            }
            if (v6w0Var.m197271t() >= i5 + 4) {
                v6w0Var.m197262k(i5);
                iM197273v = v6w0Var.m197273v();
                if (iM197273v != 1483304551) {
                    if (iM197273v == 1231971951) {
                        iM197273v = 1231971951;
                    } else if (v6w0Var.m197271t() >= 40) {
                        v6w0Var.m197262k(36);
                        if (v6w0Var.m197273v() == 1447187017) {
                            iM197273v = 1447187017;
                        } else {
                            iM197273v = 0;
                        }
                    } else {
                        iM197273v = 0;
                    }
                }
            } else if (v6w0Var.m197271t() >= 40) {
                v6w0Var.m197262k(36);
                if (v6w0Var.m197273v() == 1447187017) {
                    iM197273v = 1447187017;
                } else {
                    iM197273v = 0;
                }
            } else {
                iM197273v = 0;
            }
            if (iM197273v == 1231971951) {
                pcr0 pcr0VarM168370a = pcr0.m168370a(this.f127450b, v6w0Var);
                l6r0Var = this.f127451c;
                if (!l6r0Var.m148754a() && (i = pcr0VarM168370a.f148226d) != -1 && (i2 = pcr0VarM168370a.f148227e) != -1) {
                    l6r0Var.f126657a = i;
                    l6r0Var.f126658b = i2;
                }
                qcr0VarM173924c = qcr0.m173924c(k5r0Var.zzd(), pcr0VarM168370a, k5r0Var.zzf());
                ((z4r0) k5r0Var).m217119k(this.f127450b.f147431c, false);
                if (qcr0VarM173924c.zzh() && iM197273v == 1231971951) {
                    ncr0VarM149348h = m149348h(k5r0Var, false);
                } else {
                    ncr0VarM149348h = qcr0VarM173924c;
                }
            } else if (iM197273v == 1447187017) {
                ncr0VarM149348h = ocr0.m163556c(k5r0Var.zzd(), k5r0Var.zzf(), this.f127450b, v6w0Var);
                ((z4r0) k5r0Var).m217119k(this.f127450b.f147431c, false);
            } else if (iM197273v != 1483304551) {
                k5r0Var.zzj();
                ncr0VarM149348h = null;
            } else {
                pcr0 pcr0VarM168370a2 = pcr0.m168370a(this.f127450b, v6w0Var);
                l6r0Var = this.f127451c;
                if (!l6r0Var.m148754a()) {
                    l6r0Var.f126657a = i;
                    l6r0Var.f126658b = i2;
                }
                qcr0VarM173924c = qcr0.m173924c(k5r0Var.zzd(), pcr0VarM168370a2, k5r0Var.zzf());
                ((z4r0) k5r0Var).m217119k(this.f127450b.f147431c, false);
                if (qcr0VarM173924c.zzh()) {
                    ncr0VarM149348h = qcr0VarM173924c;
                } else {
                    ncr0VarM149348h = qcr0VarM173924c;
                }
            }
            zzby zzbyVar = this.f127458j;
            long jZzf = k5r0Var.zzf();
            if (zzbyVar == null) {
                j = -9223372036854775807L;
                icr0VarM135363c = null;
                break;
            }
            int iM13551a = zzbyVar.m13551a();
            int i6 = 0;
            while (true) {
                if (i6 >= iM13551a) {
                    j = -9223372036854775807L;
                    icr0VarM135363c = null;
                    break;
                }
                zzbx zzbxVarM13552b = zzbyVar.m13552b(i6);
                if (zzbxVarM13552b instanceof zzagv) {
                    zzagv zzagvVar = (zzagv) zzbxVarM13552b;
                    int iM13551a2 = zzbyVar.m13551a();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iM13551a2) {
                            j = -9223372036854775807L;
                            jM126049F = -9223372036854775807L;
                            break;
                        }
                        zzbx zzbxVarM13552b2 = zzbyVar.m13552b(i7);
                        j = -9223372036854775807L;
                        if (zzbxVarM13552b2 instanceof zzagz) {
                            zzagz zzagzVar = (zzagz) zzbxVarM13552b2;
                            if (zzagzVar.zzf.equals("TLEN")) {
                                jM126049F = ggw0.m126049F(Long.parseLong((String) zzagzVar.zzc.get(0)));
                                break;
                            }
                        }
                        i7++;
                    }
                    icr0VarM135363c = icr0.m135363c(jZzf, zzagvVar, jM126049F);
                    break;
                }
                i6++;
            }
            if (this.f127464p) {
                ncr0VarM149348h = new mcr0();
            } else {
                if (icr0VarM135363c != null) {
                    ncr0VarM149348h = icr0VarM135363c;
                } else if (ncr0VarM149348h == null) {
                    ncr0VarM149348h = null;
                }
                if (ncr0VarM149348h != null) {
                    ncr0VarM149348h.zzh();
                } else {
                    ncr0VarM149348h = m149348h(k5r0Var, false);
                }
            }
            this.f127463o = ncr0VarM149348h;
            this.f127454f.mo129455j(ncr0VarM149348h);
            m7r0 m7r0Var = this.f127456h;
            ter0 ter0Var = new ter0();
            ter0Var.m188618w(this.f127450b.f147430b);
            ter0Var.m188610o(4096);
            ter0Var.m188605k0(this.f127450b.f147433e);
            ter0Var.m188619x(this.f127450b.f147432d);
            ter0Var.m188597f(this.f127451c.f126657a);
            ter0Var.m188598g(this.f127451c.f126658b);
            ter0Var.m188611p(this.f127458j);
            m7r0Var.mo134531d(ter0Var.m188591D());
            this.f127461m = k5r0Var.zzf();
        } else {
            j = -9223372036854775807L;
            long j2 = this.f127461m;
            if (j2 != 0) {
                long jZzf2 = k5r0Var.zzf();
                if (jZzf2 < j2) {
                    ((z4r0) k5r0Var).m217119k((int) (j2 - jZzf2), false);
                }
            }
        }
        int i8 = this.f127462n;
        if (i8 == 0) {
            k5r0Var.zzj();
            if (m149349j(k5r0Var)) {
                return -1;
            }
            this.f127449a.m197262k(0);
            int iM197273v2 = this.f127449a.m197273v();
            if (!m149344i(iM197273v2, this.f127457i) || q6r0.m173160b(iM197273v2) == -1) {
                ((z4r0) k5r0Var).m217119k(1, false);
                this.f127457i = 0;
                return 0;
            }
            this.f127450b.m167689a(iM197273v2);
            if (this.f127459k == j) {
                this.f127459k = this.f127463o.mo125519b(k5r0Var.zzf());
            }
            p6r0 p6r0Var2 = this.f127450b;
            int i9 = p6r0Var2.f147431c;
            this.f127462n = i9;
            if (this.f127463o instanceof hcr0) {
                m149347g(this.f127460l + ((long) p6r0Var2.f147435g));
                throw null;
            }
            i8 = i9;
        }
        int iMo134532e = this.f127456h.mo134532e(k5r0Var, i8, true);
        if (iMo134532e == -1) {
            return -1;
        }
        int i10 = this.f127462n - iMo134532e;
        this.f127462n = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f127456h.mo134530c(m149347g(this.f127460l), 1, this.f127450b.f147431c, 0, null);
        this.f127460l += (long) this.f127450b.f147435g;
        this.f127462n = 0;
        return 0;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f127457i = 0;
        this.f127459k = -9223372036854775807L;
        this.f127460l = 0L;
        this.f127462n = 0;
        if (this.f127463o instanceof hcr0) {
            throw null;
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return m149350k(k5r0Var, true);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f127454f = m5r0Var;
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(0, 1);
        this.f127455g = m7r0VarMo129454i;
        this.f127456h = m7r0VarMo129454i;
        this.f127454f.mo129453c();
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        f5v0.m119531b(this.f127455g);
        int i = ggw0.f102568a;
        int iM149346b = m149346b(k5r0Var);
        if (iM149346b == -1 && (this.f127463o instanceof hcr0)) {
            if (this.f127463o.zza() != m149347g(this.f127460l)) {
                throw null;
            }
        }
        return iM149346b;
    }

    /* JADX INFO: renamed from: g */
    public final long m149347g(long j) {
        return this.f127459k + ((j * 1000000) / ((long) this.f127450b.f147432d));
    }

    /* JADX INFO: renamed from: h */
    public final ncr0 m149348h(k5r0 k5r0Var, boolean z) throws IOException {
        ((z4r0) k5r0Var).mo140051c(this.f127449a.m197264m(), 0, 4, false);
        this.f127449a.m197262k(0);
        this.f127450b.m167689a(this.f127449a.m197273v());
        return new gcr0(k5r0Var.zzd(), k5r0Var.zzf(), this.f127450b, false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m149349j(k5r0 k5r0Var) throws IOException {
        ncr0 ncr0Var = this.f127463o;
        if (ncr0Var != null) {
            long jZzc = ncr0Var.zzc();
            if (jZzc != -1 && k5r0Var.zze() > jZzc - 4) {
                return true;
            }
        }
        try {
            return !k5r0Var.mo140051c(this.f127449a.m197264m(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m149350k(k5r0 k5r0Var, boolean z) throws IOException {
        int iZze;
        int i;
        int iM173160b;
        k5r0Var.zzj();
        if (k5r0Var.zzf() == 0) {
            zzby zzbyVarM158067a = this.f127452d.m158067a(k5r0Var, null);
            this.f127458j = zzbyVarM158067a;
            if (zzbyVarM158067a != null) {
                this.f127451c.m148755b(zzbyVarM158067a);
            }
            iZze = (int) k5r0Var.zze();
            if (!z) {
                ((z4r0) k5r0Var).m217119k(iZze, false);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (m149349j(k5r0Var)) {
                if (i2 > 0) {
                    break;
                }
                hg3.m130807a();
                return false;
            }
            this.f127449a.m197262k(0);
            int iM197273v = this.f127449a.m197273v();
            if ((i == 0 || m149344i(iM197273v, i)) && (iM173160b = q6r0.m173160b(iM197273v)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.f127450b.m167689a(iM197273v);
                    i = iM197273v;
                }
                ((z4r0) k5r0Var).m217118j(iM173160b - 4, false);
            } else {
                int i4 = i3 + 1;
                if (i3 == (true != z ? 131072 : 32768)) {
                    if (z) {
                        return false;
                    }
                    throw zzcc.zza("Searched too many bytes.", null);
                }
                if (z) {
                    k5r0Var.zzj();
                    ((z4r0) k5r0Var).m217118j(iZze + i4, false);
                } else {
                    ((z4r0) k5r0Var).m217119k(1, false);
                }
                i = 0;
                i3 = i4;
                i2 = 0;
            }
        }
        if (z) {
            ((z4r0) k5r0Var).m217119k(iZze + i3, false);
        } else {
            k5r0Var.zzj();
        }
        this.f127457i = i;
        return true;
    }

    public lcr0() {
        this(0);
    }
}
