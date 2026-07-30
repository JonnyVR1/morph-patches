package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2349j extends AbstractC2372u0<C2349j, a> implements v9y0 {
    private static final C2349j zzc;
    private static volatile yay0<C2349j> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private zzfr$zza zzr;
    private C2353l zzs;
    private C2359o zzt;
    private C2355m zzu;
    private C2351k zzv;
    private String zzg = "";
    private i4y0<C2357n> zzi = AbstractC2372u0.m14406x();
    private i4y0<C2347i> zzj = AbstractC2372u0.m14406x();
    private i4y0<C2333b> zzk = AbstractC2372u0.m14406x();
    private String zzl = "";
    private i4y0<C2352k0> zzn = AbstractC2372u0.m14406x();
    private i4y0<C2345h> zzo = AbstractC2372u0.m14406x();
    private String zzp = "";
    private String zzq = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j$a */
    public static final class a extends AbstractC2372u0.b<C2349j, a> implements v9y0 {
        public a() {
            super(C2349j.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final List<C2333b> m14279A() {
            return Collections.unmodifiableList(((C2349j) this.f10299b).m14270V());
        }

        /* JADX INFO: renamed from: B */
        public final List<C2345h> m14280B() {
            return Collections.unmodifiableList(((C2349j) this.f10299b).m14271W());
        }

        /* JADX INFO: renamed from: v */
        public final int m14281v() {
            return ((C2349j) this.f10299b).m14264E();
        }

        /* JADX INFO: renamed from: w */
        public final C2347i m14282w(int i) {
            return ((C2349j) this.f10299b).m14263B(i);
        }

        /* JADX INFO: renamed from: x */
        public final a m14283x(int i, C2347i.a aVar) {
            m14432r();
            C2349j.m14259D((C2349j) this.f10299b, i, (C2347i) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14284y() {
            m14432r();
            C2349j.m14258C((C2349j) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final String m14285z() {
            return ((C2349j) this.f10299b).m14269U();
        }
    }

    static {
        C2349j c2349j = new C2349j();
        zzc = c2349j;
        AbstractC2372u0.m14402p(C2349j.class, c2349j);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14258C(C2349j c2349j) {
        c2349j.zzk = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14259D(C2349j c2349j, int i, C2347i c2347i) {
        c2347i.getClass();
        i4y0<C2347i> i4y0Var = c2349j.zzj;
        if (!i4y0Var.zzc()) {
            c2349j.zzj = AbstractC2372u0.m14401o(i4y0Var);
        }
        c2349j.zzj.set(i, c2347i);
    }

    /* JADX INFO: renamed from: K */
    public static a m14260K() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: M */
    public static C2349j m14262M() {
        return zzc;
    }

    /* JADX INFO: renamed from: B */
    public final C2347i m14263B(int i) {
        return this.zzj.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m14264E() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: G */
    public final long m14265G() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: I */
    public final zzfr$zza m14266I() {
        zzfr$zza zzfr_zza = this.zzr;
        return zzfr_zza == null ? zzfr$zza.m14631C() : zzfr_zza;
    }

    /* JADX INFO: renamed from: N */
    public final C2359o m14267N() {
        C2359o c2359o = this.zzt;
        return c2359o == null ? C2359o.m14299C() : c2359o;
    }

    /* JADX INFO: renamed from: T */
    public final String m14268T() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: U */
    public final String m14269U() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: V */
    public final List<C2333b> m14270V() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: W */
    public final List<C2345h> m14271W() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: X */
    public final List<C2352k0> m14272X() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: Y */
    public final List<C2357n> m14273Y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14274Z() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14275a0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14276b0() {
        return (this.zze & 512) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m14277c0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14278h() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        switch (C2361p.f10286a[i - 1]) {
            case 1:
                return new C2349j();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2357n.class, "zzj", C2347i.class, "zzk", C2333b.class, "zzl", "zzm", "zzn", C2352k0.class, "zzo", C2345h.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                yay0<C2349j> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2349j.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2372u0.a(zzc);
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
                l710.m153113a();
            case 7:
                return null;
        }
    }
}
