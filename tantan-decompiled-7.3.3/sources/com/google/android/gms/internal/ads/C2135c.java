package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.kyr0;
import p153l.lyr0;
import p153l.nyr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2135c extends AbstractC2245p5 implements gkx0 {
    private static final C2135c zzb;
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
    private fjx0 zzp = AbstractC2245p5.m13226w();

    static {
        C2135c c2135c = new C2135c();
        zzb = c2135c;
        AbstractC2245p5.m13213C(C2135c.class, c2135c);
    }

    /* JADX INFO: renamed from: L */
    public static lyr0 m12664L() {
        return (lyr0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12666N(C2135c c2135c, long j) {
        c2135c.zzd |= 2;
        c2135c.zzf = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12667O(C2135c c2135c, String str) {
        str.getClass();
        c2135c.zzd |= 4;
        c2135c.zzg = str;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12668P(C2135c c2135c, String str) {
        str.getClass();
        c2135c.zzd |= 8;
        c2135c.zzh = str;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12669Q(C2135c c2135c, String str) {
        c2135c.zzd |= 16;
        c2135c.zzi = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12670R(C2135c c2135c, String str) {
        c2135c.zzd |= 1024;
        c2135c.zzo = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12671S(C2135c c2135c, String str) {
        str.getClass();
        c2135c.zzd |= 1;
        c2135c.zze = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12672T(C2135c c2135c, int i) {
        c2135c.zzq = i - 1;
        c2135c.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C2126b.class, "zzq", nyr0.f144353a});
        }
        if (i2 == 3) {
            return new C2135c();
        }
        kyr0 kyr0Var = null;
        if (i2 == 4) {
            return new lyr0(kyr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
