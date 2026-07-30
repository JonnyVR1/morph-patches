package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.ltx0;
import p149l.p0y0;
import p149l.qtx0;
import p149l.s1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfr$zza extends AbstractC2349u0<zzfr$zza, C2363b> implements p0y0 {
    private static final zzfr$zza zzc;
    private static volatile s1y0<zzfr$zza> zzd;
    private int zze;
    private boolean zzi;
    private cvx0<C2362a> zzf = AbstractC2349u0.m14352x();
    private cvx0<C2364c> zzg = AbstractC2349u0.m14352x();
    private cvx0<C2365d> zzh = AbstractC2349u0.m14352x();
    private cvx0<C2362a> zzj = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$a */
    public static final class C2362a extends AbstractC2349u0<C2362a, a> implements p0y0 {
        private static final C2362a zzc;
        private static volatile s1y0<C2362a> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$a$a */
        public static final class a extends AbstractC2349u0.b<C2362a, a> implements p0y0 {
            public a() {
                super(C2362a.zzc);
            }
        }

        static {
            C2362a c2362a = new C2362a();
            zzc = c2362a;
            AbstractC2349u0.m14348p(C2362a.class, c2362a);
        }

        /* JADX INFO: renamed from: C */
        public final zzd m14585C() {
            zzd zzdVarZza = zzd.zza(this.zzg);
            return zzdVarZza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zzdVarZza;
        }

        /* JADX INFO: renamed from: D */
        public final zze m14586D() {
            zze zzeVarZza = zze.zza(this.zzf);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
        /* JADX INFO: renamed from: k */
        public final Object mo13794k(int i, Object obj, Object obj2) {
            s1y0 aVar;
            int i2 = C2338p.f10249a[i - 1];
            switch (i2) {
                case 1:
                    return new C2362a();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
                case 4:
                    return zzc;
                case 5:
                    s1y0<C2362a> s1y0Var = zzd;
                    if (s1y0Var != null) {
                        return s1y0Var;
                    }
                    synchronized (C2362a.class) {
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

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$b */
    public static final class C2363b extends AbstractC2349u0.b<zzfr$zza, C2363b> implements p0y0 {
        public C2363b() {
            super(zzfr$zza.zzc);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$c */
    public static final class C2364c extends AbstractC2349u0<C2364c, a> implements p0y0 {
        private static final C2364c zzc;
        private static volatile s1y0<C2364c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$c$a */
        public static final class a extends AbstractC2349u0.b<C2364c, a> implements p0y0 {
            public a() {
                super(C2364c.zzc);
            }
        }

        static {
            C2364c c2364c = new C2364c();
            zzc = c2364c;
            AbstractC2349u0.m14348p(C2364c.class, c2364c);
        }

        /* JADX INFO: renamed from: C */
        public final zze m14588C() {
            zze zzeVarZza = zze.zza(this.zzg);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        /* JADX INFO: renamed from: D */
        public final zze m14589D() {
            zze zzeVarZza = zze.zza(this.zzf);
            return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
        /* JADX INFO: renamed from: k */
        public final Object mo13794k(int i, Object obj, Object obj2) {
            s1y0 aVar;
            int i2 = C2338p.f10249a[i - 1];
            switch (i2) {
                case 1:
                    return new C2364c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
                case 4:
                    return zzc;
                case 5:
                    s1y0<C2364c> s1y0Var = zzd;
                    if (s1y0Var != null) {
                        return s1y0Var;
                    }
                    synchronized (C2364c.class) {
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

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$d */
    public static final class C2365d extends AbstractC2349u0<C2365d, a> implements p0y0 {
        private static final C2365d zzc;
        private static volatile s1y0<C2365d> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfr$zza$d$a */
        public static final class a extends AbstractC2349u0.b<C2365d, a> implements p0y0 {
            public a() {
                super(C2365d.zzc);
            }
        }

        static {
            C2365d c2365d = new C2365d();
            zzc = c2365d;
            AbstractC2349u0.m14348p(C2365d.class, c2365d);
        }

        /* JADX INFO: renamed from: C */
        public final String m14591C() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
        /* JADX INFO: renamed from: k */
        public final Object mo13794k(int i, Object obj, Object obj2) {
            s1y0 aVar;
            int i2 = C2338p.f10249a[i - 1];
            switch (i2) {
                case 1:
                    return new C2365d();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    s1y0<C2365d> s1y0Var = zzd;
                    if (s1y0Var != null) {
                        return s1y0Var;
                    }
                    synchronized (C2365d.class) {
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

    static {
        zzfr$zza zzfr_zza = new zzfr$zza();
        zzc = zzfr_zza;
        AbstractC2349u0.m14348p(zzfr$zza.class, zzfr_zza);
    }

    /* JADX INFO: renamed from: C */
    public static zzfr$zza m14577C() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final List<C2365d> m14578D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final List<C2362a> m14579E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: G */
    public final List<C2364c> m14580G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final List<C2362a> m14581I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14582K() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14583L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new zzfr$zza();
            case 2:
                return new C2363b();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C2362a.class, "zzg", C2364c.class, "zzh", C2365d.class, "zzi", "zzj", C2362a.class});
            case 4:
                return zzc;
            case 5:
                s1y0<zzfr$zza> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (zzfr$zza.class) {
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

    public enum zzd implements qtx0 {
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

        public static ltx0 zzb() {
            return C2340q.f10251a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        @Override // p149l.qtx0
        public final int zza() {
            return this.zze;
        }
    }

    public enum zze implements qtx0 {
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

        public static ltx0 zzb() {
            return C2342r.f10254a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // p149l.qtx0
        public final int zza() {
            return this.zzg;
        }
    }
}
