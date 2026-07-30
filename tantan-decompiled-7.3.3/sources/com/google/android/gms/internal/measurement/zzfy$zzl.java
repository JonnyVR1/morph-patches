package com.google.android.gms.internal.measurement;

import p153l.i4y0;
import p153l.l710;
import p153l.r2y0;
import p153l.v9y0;
import p153l.w2y0;
import p153l.yay0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfy$zzl extends AbstractC2372u0<zzfy$zzl, C2390a> implements v9y0 {
    private static final zzfy$zzl zzc;
    private static volatile yay0<zzfy$zzl> zzd;
    private int zze;
    private int zzf = 1;
    private i4y0<C2381z> zzg = AbstractC2372u0.m14406x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfy$zzl$a */
    public static final class C2390a extends AbstractC2372u0.b<zzfy$zzl, C2390a> implements v9y0 {
        public C2390a() {
            super(zzfy$zzl.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final C2390a m14674v(C2381z.a aVar) {
            m14432r();
            zzfy$zzl.m14672C((zzfy$zzl) this.f10299b, (C2381z) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }
    }

    static {
        zzfy$zzl zzfy_zzl = new zzfy$zzl();
        zzc = zzfy_zzl;
        AbstractC2372u0.m14402p(zzfy$zzl.class, zzfy_zzl);
    }

    /* JADX INFO: renamed from: B */
    public static C2390a m14671B() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14672C(zzfy$zzl zzfy_zzl, C2381z c2381z) {
        c2381z.getClass();
        i4y0<C2381z> i4y0Var = zzfy_zzl.zzg;
        if (!i4y0Var.zzc()) {
            zzfy_zzl.zzg = AbstractC2372u0.m14401o(i4y0Var);
        }
        zzfy_zzl.zzg.add(c2381z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new zzfy$zzl();
            case 2:
                return new C2390a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", C2381z.class});
            case 4:
                return zzc;
            case 5:
                yay0<zzfy$zzl> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (zzfy$zzl.class) {
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
        RADS(1),
        PROVISIONING(2);

        private final int zzd;

        zzb(int i) {
            this.zzd = i;
        }

        public static zzb zza(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static r2y0 zzb() {
            return C2346h0.f10282a;
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
