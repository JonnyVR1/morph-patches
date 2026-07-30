package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.epr0;
import p149l.fpr0;
import p149l.hpr0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2112c extends AbstractC2222p5 implements abx0 {
    private static final C2112c zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private z9x0 zzp = AbstractC2222p5.m13172w();

    static {
        C2112c c2112c = new C2112c();
        zzb = c2112c;
        AbstractC2222p5.m13159C(C2112c.class, c2112c);
    }

    /* JADX INFO: renamed from: L */
    public static fpr0 m12610L() {
        return (fpr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12612N(C2112c c2112c, long j) {
        c2112c.zzd |= 2;
        c2112c.zzf = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12613O(C2112c c2112c, String str) {
        str.getClass();
        c2112c.zzd |= 4;
        c2112c.zzg = str;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12614P(C2112c c2112c, String str) {
        str.getClass();
        c2112c.zzd |= 8;
        c2112c.zzh = str;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12615Q(C2112c c2112c, String str) {
        c2112c.zzd |= 16;
        c2112c.zzi = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12616R(C2112c c2112c, String str) {
        c2112c.zzd |= 1024;
        c2112c.zzo = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12617S(C2112c c2112c, String str) {
        str.getClass();
        c2112c.zzd |= 1;
        c2112c.zze = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12618T(C2112c c2112c, int i) {
        c2112c.zzq = i - 1;
        c2112c.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C2103b.class, "zzq", hpr0.f108962a});
        }
        if (i2 == 3) {
            return new C2112c();
        }
        epr0 epr0Var = null;
        if (i2 == 4) {
            return new fpr0(epr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
