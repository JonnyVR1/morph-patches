package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.r2y0;
import p153l.v9y0;
import p153l.w2y0;
import p153l.yay0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfr$zza extends AbstractC2372u0<zzfr$zza, C2386b> implements v9y0 {
    private static final zzfr$zza zzc;
    private static volatile yay0<zzfr$zza> zzd;
    private int zze;
    private boolean zzi;
    private i4y0<C2385a> zzf = AbstractC2372u0.m14406x();
    private i4y0<C2387c> zzg = AbstractC2372u0.m14406x();
    private i4y0<C2388d> zzh = AbstractC2372u0.m14406x();
    private i4y0<C2385a> zzj = AbstractC2372u0.m14406x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$a */
    public static final class C2385a extends AbstractC2372u0<C2385a, a> implements v9y0 {
        private static final C2385a zzc;
        private static volatile yay0<C2385a> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$a$a */
        public static final class a extends AbstractC2372u0.b<C2385a, a> implements v9y0 {
            public a() {
                super(C2385a.zzc);
            }
        }

        static {
            C2385a c2385a = new C2385a();
            zzc = c2385a;
            AbstractC2372u0.m14402p(C2385a.class, c2385a);
        }

        /* JADX INFO: renamed from: C */
        public final zzd m14639C() {
            zzd zzdVarZza = zzd.zza(this.zzg);
            return zzdVarZza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zzdVarZza;
        }

        /* JADX INFO: renamed from: D */
        public final zze m14640D() {
            zze zzeVarZza = zze.zza(this.zzf);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
        /* JADX INFO: renamed from: k */
        public final Object mo13848k(int i, Object obj, Object obj2) {
            yay0 aVar;
            int i2 = C2361p.f10286a[i - 1];
            switch (i2) {
                case 1:
                    return new C2385a();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
                case 4:
                    return zzc;
                case 5:
                    yay0<C2385a> yay0Var = zzd;
                    if (yay0Var != null) {
                        return yay0Var;
                    }
                    synchronized (C2385a.class) {
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

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$b */
    public static final class C2386b extends AbstractC2372u0.b<zzfr$zza, C2386b> implements v9y0 {
        public C2386b() {
            super(zzfr$zza.zzc);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$c */
    public static final class C2387c extends AbstractC2372u0<C2387c, a> implements v9y0 {
        private static final C2387c zzc;
        private static volatile yay0<C2387c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$c$a */
        public static final class a extends AbstractC2372u0.b<C2387c, a> implements v9y0 {
            public a() {
                super(C2387c.zzc);
            }
        }

        static {
            C2387c c2387c = new C2387c();
            zzc = c2387c;
            AbstractC2372u0.m14402p(C2387c.class, c2387c);
        }

        /* JADX INFO: renamed from: C */
        public final zze m14642C() {
            zze zzeVarZza = zze.zza(this.zzg);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        /* JADX INFO: renamed from: D */
        public final zze m14643D() {
            zze zzeVarZza = zze.zza(this.zzf);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
        /* JADX INFO: renamed from: k */
        public final Object mo13848k(int i, Object obj, Object obj2) {
            yay0 aVar;
            int i2 = C2361p.f10286a[i - 1];
            switch (i2) {
                case 1:
                    return new C2387c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
                case 4:
                    return zzc;
                case 5:
                    yay0<C2387c> yay0Var = zzd;
                    if (yay0Var != null) {
                        return yay0Var;
                    }
                    synchronized (C2387c.class) {
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

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$d */
    public static final class C2388d extends AbstractC2372u0<C2388d, a> implements v9y0 {
        private static final C2388d zzc;
        private static volatile yay0<C2388d> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$d$a */
        public static final class a extends AbstractC2372u0.b<C2388d, a> implements v9y0 {
            public a() {
                super(C2388d.zzc);
            }
        }

        static {
            C2388d c2388d = new C2388d();
            zzc = c2388d;
            AbstractC2372u0.m14402p(C2388d.class, c2388d);
        }

        /* JADX INFO: renamed from: C */
        public final String m14645C() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
        /* JADX INFO: renamed from: k */
        public final Object mo13848k(int i, Object obj, Object obj2) {
            yay0 aVar;
            int i2 = C2361p.f10286a[i - 1];
            switch (i2) {
                case 1:
                    return new C2388d();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    yay0<C2388d> yay0Var = zzd;
                    if (yay0Var != null) {
                        return yay0Var;
                    }
                    synchronized (C2388d.class) {
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

    static {
        zzfr$zza zzfr_zza = new zzfr$zza();
        zzc = zzfr_zza;
        AbstractC2372u0.m14402p(zzfr$zza.class, zzfr_zza);
    }

    /* JADX INFO: renamed from: C */
    public static zzfr$zza m14631C() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final List<C2388d> m14632D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final List<C2385a> m14633E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: G */
    public final List<C2387c> m14634G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final List<C2385a> m14635I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14636K() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14637L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new zzfr$zza();
            case 2:
                return new C2386b();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C2385a.class, "zzg", C2387c.class, "zzh", C2388d.class, "zzi", "zzj", C2385a.class});
            case 4:
                return zzc;
            case 5:
                yay0<zzfr$zza> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (zzfr$zza.class) {
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

    public enum zzd implements w2y0 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);

        private final int zze;

        zzd(int i) {
            this.zze = i;
        }

        public static zzd zza(int i) {
            if (i == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return GRANTED;
            }
            if (i != 2) {
                return null;
            }
            return DENIED;
        }

        public static r2y0 zzb() {
            return C2363q.f10288a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        @Override // p153l.w2y0
        public final int zza() {
            return this.zze;
        }
    }

    public enum zze implements w2y0 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);

        private final int zzg;

        zze(int i) {
            this.zzg = i;
        }

        public static zze zza(int i) {
            if (i == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_STORAGE;
            }
            if (i == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i == 3) {
                return AD_USER_DATA;
            }
            if (i != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static r2y0 zzb() {
            return C2365r.f10291a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // p153l.w2y0
        public final int zza() {
            return this.zzg;
        }
    }
}
