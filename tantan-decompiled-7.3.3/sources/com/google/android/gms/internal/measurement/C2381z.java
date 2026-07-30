package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2381z extends AbstractC2372u0<C2381z, a> implements v9y0 {
    private static final C2381z zzc;
    private static volatile yay0<C2381z> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z$a */
    public static final class a extends AbstractC2372u0.b<C2381z, a> implements v9y0 {
        public a() {
            super(C2381z.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14601v(long j) {
            m14432r();
            C2381z.m14598C((C2381z) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14602w(String str) {
            m14432r();
            C2381z.m14599D((C2381z) this.f10299b, str);
            return this;
        }
    }

    static {
        C2381z c2381z = new C2381z();
        zzc = c2381z;
        AbstractC2372u0.m14402p(C2381z.class, c2381z);
    }

    /* JADX INFO: renamed from: B */
    public static a m14597B() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14598C(C2381z c2381z, long j) {
        c2381z.zze |= 2;
        c2381z.zzg = j;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14599D(C2381z c2381z, String str) {
        str.getClass();
        c2381z.zze |= 1;
        c2381z.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2381z();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2381z> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2381z.class) {
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
