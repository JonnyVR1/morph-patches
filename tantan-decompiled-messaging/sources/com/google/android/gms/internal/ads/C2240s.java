package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.arr0;
import p149l.crr0;
import p149l.frr0;
import p149l.ypr0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C2240s extends AbstractC2222p5 implements abx0 {
    private static final C2240s zzb;
    private int zzd;
    private z9x0 zze = AbstractC2222p5.m13172w();
    private zzgyl zzf = zzgyl.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        C2240s c2240s = new C2240s();
        zzb = c2240s;
        AbstractC2222p5.m13159C(C2240s.class, c2240s);
    }

    /* JADX INFO: renamed from: L */
    public static frr0 m13246L() {
        return (frr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13248N(C2240s c2240s, zzgyl zzgylVar) {
        z9x0 z9x0Var = c2240s.zze;
        if (!z9x0Var.zzc()) {
            c2240s.zze = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2240s.zze.add(zzgylVar);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13249O(C2240s c2240s, zzgyl zzgylVar) {
        c2240s.zzd |= 1;
        c2240s.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13250P(C2240s c2240s, int i) {
        c2240s.zzh = 4;
        c2240s.zzd = 4 | c2240s.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", crr0.f82303a, "zzh", arr0.f71338a});
        }
        if (i2 == 3) {
            return new C2240s();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new frr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
