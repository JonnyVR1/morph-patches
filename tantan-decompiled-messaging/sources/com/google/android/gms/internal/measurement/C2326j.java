package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2326j extends AbstractC2349u0<C2326j, a> implements p0y0 {
    private static final C2326j zzc;
    private static volatile s1y0<C2326j> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private zzfr$zza zzr;
    private C2330l zzs;
    private C2336o zzt;
    private C2332m zzu;
    private C2328k zzv;
    private String zzg = "";
    private cvx0<C2334n> zzi = AbstractC2349u0.m14352x();
    private cvx0<C2324i> zzj = AbstractC2349u0.m14352x();
    private cvx0<C2310b> zzk = AbstractC2349u0.m14352x();
    private String zzl = "";
    private cvx0<C2329k0> zzn = AbstractC2349u0.m14352x();
    private cvx0<C2322h> zzo = AbstractC2349u0.m14352x();
    private String zzp = "";
    private String zzq = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j$a */
    public static final class a extends AbstractC2349u0.b<C2326j, a> implements p0y0 {
        public a() {
            super(C2326j.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final List<C2310b> m14225A() {
            return Collections.unmodifiableList(((C2326j) this.f10262b).m14216V());
        }

        /* JADX INFO: renamed from: B */
        public final List<C2322h> m14226B() {
            return Collections.unmodifiableList(((C2326j) this.f10262b).m14217W());
        }

        /* JADX INFO: renamed from: v */
        public final int m14227v() {
            return ((C2326j) this.f10262b).m14210E();
        }

        /* JADX INFO: renamed from: w */
        public final C2324i m14228w(int i) {
            return ((C2326j) this.f10262b).m14209B(i);
        }

        /* JADX INFO: renamed from: x */
        public final a m14229x(int i, C2324i.a aVar) {
            m14378r();
            C2326j.m14205D((C2326j) this.f10262b, i, (C2324i) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14230y() {
            m14378r();
            C2326j.m14204C((C2326j) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final String m14231z() {
            return ((C2326j) this.f10262b).m14215U();
        }
    }

    static {
        C2326j c2326j = new C2326j();
        zzc = c2326j;
        AbstractC2349u0.m14348p(C2326j.class, c2326j);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14204C(C2326j c2326j) {
        c2326j.zzk = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14205D(C2326j c2326j, int i, C2324i c2324i) {
        c2324i.getClass();
        cvx0<C2324i> cvx0Var = c2326j.zzj;
        if (!cvx0Var.zzc()) {
            c2326j.zzj = AbstractC2349u0.m14347o(cvx0Var);
        }
        c2326j.zzj.set(i, c2324i);
    }

    /* JADX INFO: renamed from: K */
    public static a m14206K() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: M */
    public static C2326j m14208M() {
        return zzc;
    }

    /* JADX INFO: renamed from: B */
    public final C2324i m14209B(int i) {
        return this.zzj.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m14210E() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: G */
    public final long m14211G() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: I */
    public final zzfr$zza m14212I() {
        zzfr$zza zzfr_zza = this.zzr;
        return zzfr_zza == null ? zzfr$zza.m14577C() : zzfr_zza;
    }

    /* JADX INFO: renamed from: N */
    public final C2336o m14213N() {
        C2336o c2336o = this.zzt;
        return c2336o == null ? C2336o.m14245C() : c2336o;
    }

    /* JADX INFO: renamed from: T */
    public final String m14214T() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: U */
    public final String m14215U() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: V */
    public final List<C2310b> m14216V() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: W */
    public final List<C2322h> m14217W() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: X */
    public final List<C2329k0> m14218X() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: Y */
    public final List<C2334n> m14219Y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14220Z() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14221a0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14222b0() {
        return (this.zze & 512) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m14223c0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14224h() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        switch (C2338p.f10249a[i - 1]) {
            case 1:
                return new C2326j();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2334n.class, "zzj", C2324i.class, "zzk", C2310b.class, "zzl", "zzm", "zzn", C2329k0.class, "zzo", C2322h.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2326j> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2326j.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2349u0.a(zzc);
                            zzd = aVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return aVar;
            case 6:
                return (byte) 1;
            default:
                bz00.m104536a();
            case 7:
                return null;
        }
    }
}
