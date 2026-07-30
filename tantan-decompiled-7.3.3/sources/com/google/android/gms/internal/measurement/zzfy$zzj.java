package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.r2y0;
import p153l.v9y0;
import p153l.w2y0;
import p153l.yay0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfy$zzj extends AbstractC2372u0<zzfy$zzj, C2389a> implements v9y0 {
    private static final zzfy$zzj zzc;
    private static volatile yay0<zzfy$zzj> zzd;
    private int zze;
    private i4y0<C2336c0> zzf = AbstractC2372u0.m14406x();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfy$zzj$a */
    public static final class C2389a extends AbstractC2372u0.b<zzfy$zzj, C2389a> implements v9y0 {
        public C2389a() {
            super(zzfy$zzj.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final C2389a m14662A() {
            m14432r();
            zzfy$zzj.m14651K((zzfy$zzj) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final C2389a m14663B(String str) {
            m14432r();
            zzfy$zzj.m14652L((zzfy$zzj) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final String m14664C() {
            return ((zzfy$zzj) this.f10299b).m14655N();
        }

        /* JADX INFO: renamed from: D */
        public final List<C2336c0> m14665D() {
            return Collections.unmodifiableList(((zzfy$zzj) this.f10299b).m14657U());
        }

        /* JADX INFO: renamed from: v */
        public final int m14666v() {
            return ((zzfy$zzj) this.f10299b).m14661h();
        }

        /* JADX INFO: renamed from: w */
        public final C2389a m14667w(C2336c0.a aVar) {
            m14432r();
            zzfy$zzj.m14647D((zzfy$zzj) this.f10299b, (C2336c0) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final C2389a m14668x(Iterable<? extends C2336c0> iterable) {
            m14432r();
            zzfy$zzj.m14648E((zzfy$zzj) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2389a m14669y(String str) {
            m14432r();
            zzfy$zzj.m14649G((zzfy$zzj) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final C2336c0 m14670z(int i) {
            return ((zzfy$zzj) this.f10299b).m14654C(0);
        }
    }

    static {
        zzfy$zzj zzfy_zzj = new zzfy$zzj();
        zzc = zzfy_zzj;
        AbstractC2372u0.m14402p(zzfy$zzj.class, zzfy_zzj);
    }

    /* JADX INFO: renamed from: B */
    public static C2389a m14646B(zzfy$zzj zzfy_zzj) {
        return zzc.m14414i(zzfy_zzj);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14647D(zzfy$zzj zzfy_zzj, C2336c0 c2336c0) {
        c2336c0.getClass();
        zzfy_zzj.m14660X();
        zzfy_zzj.zzf.add(c2336c0);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14648E(zzfy$zzj zzfy_zzj, Iterable iterable) {
        zzfy_zzj.m14660X();
        AbstractC2360o0.m14303d(iterable, zzfy_zzj.zzf);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14649G(zzfy$zzj zzfy_zzj, String str) {
        str.getClass();
        zzfy_zzj.zze |= 1;
        zzfy_zzj.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public static C2389a m14650I() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14651K(zzfy$zzj zzfy_zzj) {
        zzfy_zzj.zzf = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14652L(zzfy$zzj zzfy_zzj, String str) {
        str.getClass();
        zzfy_zzj.zze |= 2;
        zzfy_zzj.zzh = str;
    }

    /* JADX INFO: renamed from: C */
    public final C2336c0 m14654C(int i) {
        return this.zzf.get(0);
    }

    /* JADX INFO: renamed from: N */
    public final String m14655N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: T */
    public final String m14656T() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: U */
    public final List<C2336c0> m14657U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m14658V() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m14659W() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final void m14660X() {
        i4y0<C2336c0> i4y0Var = this.zzf;
        if (i4y0Var.zzc()) {
            return;
        }
        this.zzf = AbstractC2372u0.m14401o(i4y0Var);
    }

    /* JADX INFO: renamed from: h */
    public final int m14661h() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new zzfy$zzj();
            case 2:
                return new C2389a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C2336c0.class, "zzg", "zzh", "zzi", zzb.zzb()});
            case 4:
                return zzc;
            case 5:
                yay0<zzfy$zzj> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (zzfy$zzj.class) {
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

    public enum zzb implements w2y0 {
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

        public static r2y0 zzb() {
            return C2344g0.f10281a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // p153l.w2y0
        public final int zza() {
            return this.zzd;
        }
    }
}
