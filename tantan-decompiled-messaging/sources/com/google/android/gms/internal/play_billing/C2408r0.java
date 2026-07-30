package com.google.android.gms.internal.play_billing;

import p149l.dyx0;
import p149l.xmx0;
import p149l.yxx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2408r0 extends AbstractC2380d0 implements xmx0 {
    private static final C2408r0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        C2408r0 c2408r0 = new C2408r0();
        zzb = c2408r0;
        AbstractC2380d0.m14764v(C2408r0.class, c2408r0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14929A(C2408r0 c2408r0, long j) {
        c2408r0.zzd |= 8;
        c2408r0.zzh = j;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14930B(C2408r0 c2408r0, String str) {
        str.getClass();
        c2408r0.zzd |= 2;
        c2408r0.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14931C(C2408r0 c2408r0, String str) {
        str.getClass();
        c2408r0.zzd |= 1;
        c2408r0.zze = str;
    }

    /* JADX INFO: renamed from: D */
    public static yxx0 m14932D() {
        return (yxx0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14934z(C2408r0 c2408r0, int i) {
        c2408r0.zzd |= 4;
        c2408r0.zzg = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2408r0();
        }
        dyx0 dyx0Var = null;
        if (i2 == 4) {
            return new yxx0(dyx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
