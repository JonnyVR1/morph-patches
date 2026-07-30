package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.cvx0;
import p149l.ltx0;
import p149l.p0y0;
import p149l.qtx0;
import p149l.s1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfy$zzl extends AbstractC2349u0<zzfy$zzl, C2367a> implements p0y0 {
    private static final zzfy$zzl zzc;
    private static volatile s1y0<zzfy$zzl> zzd;
    private int zze;
    private int zzf = 1;
    private cvx0<C2358z> zzg = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfy$zzl$a */
    public static final class C2367a extends AbstractC2349u0.b<zzfy$zzl, C2367a> implements p0y0 {
        public C2367a() {
            super(zzfy$zzl.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final C2367a m14620v(C2358z.a aVar) {
            m14378r();
            zzfy$zzl.m14618C((zzfy$zzl) this.f10262b, (C2358z) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }
    }

    static {
        zzfy$zzl zzfy_zzl = new zzfy$zzl();
        zzc = zzfy_zzl;
        AbstractC2349u0.m14348p(zzfy$zzl.class, zzfy_zzl);
    }

    /* JADX INFO: renamed from: B */
    public static C2367a m14617B() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14618C(zzfy$zzl zzfy_zzl, C2358z c2358z) {
        c2358z.getClass();
        cvx0<C2358z> cvx0Var = zzfy_zzl.zzg;
        if (!cvx0Var.zzc()) {
            zzfy_zzl.zzg = AbstractC2349u0.m14347o(cvx0Var);
        }
        zzfy_zzl.zzg.add(c2358z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new zzfy$zzl();
            case 2:
                return new C2367a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", C2358z.class});
            case 4:
                return zzc;
            case 5:
                s1y0<zzfy$zzl> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (zzfy$zzl.class) {
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

        public static ltx0 zzb() {
            return C2323h0.f10245a;
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
