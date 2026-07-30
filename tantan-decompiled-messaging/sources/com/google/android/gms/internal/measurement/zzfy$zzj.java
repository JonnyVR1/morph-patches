package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.ltx0;
import p149l.p0y0;
import p149l.qtx0;
import p149l.s1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfy$zzj extends AbstractC2349u0<zzfy$zzj, C2366a> implements p0y0 {
    private static final zzfy$zzj zzc;
    private static volatile s1y0<zzfy$zzj> zzd;
    private int zze;
    private cvx0<C2313c0> zzf = AbstractC2349u0.m14352x();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfy$zzj$a */
    public static final class C2366a extends AbstractC2349u0.b<zzfy$zzj, C2366a> implements p0y0 {
        public C2366a() {
            super(zzfy$zzj.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final C2366a m14608A() {
            m14378r();
            zzfy$zzj.m14597K((zzfy$zzj) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final C2366a m14609B(String str) {
            m14378r();
            zzfy$zzj.m14598L((zzfy$zzj) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final String m14610C() {
            return ((zzfy$zzj) this.f10262b).m14601N();
        }

        /* JADX INFO: renamed from: D */
        public final List<C2313c0> m14611D() {
            return Collections.unmodifiableList(((zzfy$zzj) this.f10262b).m14603U());
        }

        /* JADX INFO: renamed from: v */
        public final int m14612v() {
            return ((zzfy$zzj) this.f10262b).m14607h();
        }

        /* JADX INFO: renamed from: w */
        public final C2366a m14613w(C2313c0.a aVar) {
            m14378r();
            zzfy$zzj.m14593D((zzfy$zzj) this.f10262b, (C2313c0) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final C2366a m14614x(Iterable<? extends C2313c0> iterable) {
            m14378r();
            zzfy$zzj.m14594E((zzfy$zzj) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2366a m14615y(String str) {
            m14378r();
            zzfy$zzj.m14595G((zzfy$zzj) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final C2313c0 m14616z(int i) {
            return ((zzfy$zzj) this.f10262b).m14600C(0);
        }
    }

    static {
        zzfy$zzj zzfy_zzj = new zzfy$zzj();
        zzc = zzfy_zzj;
        AbstractC2349u0.m14348p(zzfy$zzj.class, zzfy_zzj);
    }

    /* JADX INFO: renamed from: B */
    public static C2366a m14592B(zzfy$zzj zzfy_zzj) {
        return zzc.m14360i(zzfy_zzj);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14593D(zzfy$zzj zzfy_zzj, C2313c0 c2313c0) {
        c2313c0.getClass();
        zzfy_zzj.m14606X();
        zzfy_zzj.zzf.add(c2313c0);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14594E(zzfy$zzj zzfy_zzj, Iterable iterable) {
        zzfy_zzj.m14606X();
        AbstractC2337o0.m14249d(iterable, zzfy_zzj.zzf);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14595G(zzfy$zzj zzfy_zzj, String str) {
        str.getClass();
        zzfy_zzj.zze |= 1;
        zzfy_zzj.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public static C2366a m14596I() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14597K(zzfy$zzj zzfy_zzj) {
        zzfy_zzj.zzf = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14598L(zzfy$zzj zzfy_zzj, String str) {
        str.getClass();
        zzfy_zzj.zze |= 2;
        zzfy_zzj.zzh = str;
    }

    /* JADX INFO: renamed from: C */
    public final C2313c0 m14600C(int i) {
        return this.zzf.get(0);
    }

    /* JADX INFO: renamed from: N */
    public final String m14601N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: T */
    public final String m14602T() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: U */
    public final List<C2313c0> m14603U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m14604V() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m14605W() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final void m14606X() {
        cvx0<C2313c0> cvx0Var = this.zzf;
        if (cvx0Var.zzc()) {
            return;
        }
        this.zzf = AbstractC2349u0.m14347o(cvx0Var);
    }

    /* JADX INFO: renamed from: h */
    public final int m14607h() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new zzfy$zzj();
            case 2:
                return new C2366a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C2313c0.class, "zzg", "zzh", "zzi", zzb.zzb()});
            case 4:
                return zzc;
            case 5:
                s1y0<zzfy$zzj> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (zzfy$zzj.class) {
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

    public enum zzb implements qtx0 {
        SDK(0),
        SGTM(1);

        private final int zzd;

        zzb(int i) {
            this.zzd = i;
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return SDK;
            }
            if (i != 1) {
                return null;
            }
            return SGTM;
        }

        public static ltx0 zzb() {
            return C2321g0.f10244a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // p149l.qtx0
        public final int zza() {
            return this.zzd;
        }
    }
}
