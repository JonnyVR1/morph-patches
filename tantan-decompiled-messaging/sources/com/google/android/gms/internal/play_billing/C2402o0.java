package com.google.android.gms.internal.play_billing;

import p149l.awx0;
import p149l.lvx0;
import p149l.qvx0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2402o0 extends AbstractC2380d0 implements xmx0 {
    private static final C2402o0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C2402o0 c2402o0 = new C2402o0();
        zzb = c2402o0;
        AbstractC2380d0.m14764v(C2402o0.class, c2402o0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14904A(C2402o0 c2402o0, String str) {
        str.getClass();
        c2402o0.zzd |= 2;
        c2402o0.zzf = str;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14905B(C2402o0 c2402o0, int i) {
        c2402o0.zzd |= 1;
        c2402o0.zze = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14906C(C2402o0 c2402o0, int i) {
        c2402o0.zzg = i - 1;
        c2402o0.zzd |= 4;
    }

    /* JADX INFO: renamed from: D */
    public static lvx0 m14907D() {
        return (lvx0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14909z(C2402o0 c2402o0, String str) {
        c2402o0.zzd |= 8;
        c2402o0.zzh = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", qvx0.f156640a, "zzh"});
        }
        if (i2 == 3) {
            return new C2402o0();
        }
        awx0 awx0Var = null;
        if (i2 == 4) {
            return new lvx0(awx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
