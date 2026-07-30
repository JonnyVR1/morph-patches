package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.e7y0;
import p153l.j7y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2431r0 extends AbstractC2403d0 implements dwx0 {
    private static final C2431r0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        C2431r0 c2431r0 = new C2431r0();
        zzb = c2431r0;
        AbstractC2403d0.m14818v(C2431r0.class, c2431r0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14983A(C2431r0 c2431r0, long j) {
        c2431r0.zzd |= 8;
        c2431r0.zzh = j;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14984B(C2431r0 c2431r0, String str) {
        str.getClass();
        c2431r0.zzd |= 2;
        c2431r0.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14985C(C2431r0 c2431r0, String str) {
        str.getClass();
        c2431r0.zzd |= 1;
        c2431r0.zze = str;
    }

    /* JADX INFO: renamed from: D */
    public static e7y0 m14986D() {
        return (e7y0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14988z(C2431r0 c2431r0, int i) {
        c2431r0.zzd |= 4;
        c2431r0.zzg = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2431r0();
        }
        j7y0 j7y0Var = null;
        if (i2 == 4) {
            return new e7y0(j7y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
