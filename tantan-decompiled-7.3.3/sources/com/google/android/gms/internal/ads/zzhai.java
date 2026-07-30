package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhai {
    public static final zzhai zza;
    public static final zzhai zzb;
    public static final zzhai zzc;
    public static final zzhai zzd;
    public static final zzhai zze;
    public static final zzhai zzf;
    public static final zzhai zzg;
    public static final zzhai zzh;
    public static final zzhai zzi;
    public static final zzhai zzj;
    private static final /* synthetic */ zzhai[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzhai zzhaiVar = new zzhai("VOID", 0, Void.class, Void.class, null);
        zza = zzhaiVar;
        Class cls = Integer.TYPE;
        zzhai zzhaiVar2 = new zzhai("INT", 1, cls, Integer.class, 0);
        zzb = zzhaiVar2;
        zzhai zzhaiVar3 = new zzhai("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzhaiVar3;
        zzhai zzhaiVar4 = new zzhai("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzhaiVar4;
        zzhai zzhaiVar5 = new zzhai("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        zze = zzhaiVar5;
        zzhai zzhaiVar6 = new zzhai("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzhaiVar6;
        zzhai zzhaiVar7 = new zzhai("STRING", 6, String.class, String.class, "");
        zzg = zzhaiVar7;
        zzhai zzhaiVar8 = new zzhai("BYTE_STRING", 7, zzgyl.class, zzgyl.class, zzgyl.zzb);
        zzh = zzhaiVar8;
        zzhai zzhaiVar9 = new zzhai("ENUM", 8, cls, Integer.class, null);
        zzi = zzhaiVar9;
        zzhai zzhaiVar10 = new zzhai("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzhaiVar10;
        zzk = new zzhai[]{zzhaiVar, zzhaiVar2, zzhaiVar3, zzhaiVar4, zzhaiVar5, zzhaiVar6, zzhaiVar7, zzhaiVar8, zzhaiVar9, zzhaiVar10};
    }

    private zzhai(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzhai[] values() {
        return (zzhai[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
