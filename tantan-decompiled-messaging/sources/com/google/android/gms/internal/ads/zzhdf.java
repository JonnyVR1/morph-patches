package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhdf {
    public static final zzhdf zza;
    public static final zzhdf zzb;
    public static final zzhdf zzc;
    public static final zzhdf zzd;
    public static final zzhdf zze;
    public static final zzhdf zzf;
    public static final zzhdf zzg;
    public static final zzhdf zzh;
    public static final zzhdf zzi;
    public static final zzhdf zzj;
    public static final zzhdf zzk;
    public static final zzhdf zzl;
    public static final zzhdf zzm;
    public static final zzhdf zzn;
    public static final zzhdf zzo;
    public static final zzhdf zzp;
    public static final zzhdf zzq;
    public static final zzhdf zzr;
    private static final /* synthetic */ zzhdf[] zzs;
    private final zzhdg zzt;

    static {
        zzhdf zzhdfVar = new zzhdf("DOUBLE", 0, zzhdg.DOUBLE, 1);
        zza = zzhdfVar;
        zzhdf zzhdfVar2 = new zzhdf("FLOAT", 1, zzhdg.FLOAT, 5);
        zzb = zzhdfVar2;
        zzhdg zzhdgVar = zzhdg.LONG;
        zzhdf zzhdfVar3 = new zzhdf("INT64", 2, zzhdgVar, 0);
        zzc = zzhdfVar3;
        zzhdf zzhdfVar4 = new zzhdf("UINT64", 3, zzhdgVar, 0);
        zzd = zzhdfVar4;
        zzhdg zzhdgVar2 = zzhdg.INT;
        zzhdf zzhdfVar5 = new zzhdf("INT32", 4, zzhdgVar2, 0);
        zze = zzhdfVar5;
        zzhdf zzhdfVar6 = new zzhdf("FIXED64", 5, zzhdgVar, 1);
        zzf = zzhdfVar6;
        zzhdf zzhdfVar7 = new zzhdf("FIXED32", 6, zzhdgVar2, 5);
        zzg = zzhdfVar7;
        zzhdf zzhdfVar8 = new zzhdf("BOOL", 7, zzhdg.BOOLEAN, 0);
        zzh = zzhdfVar8;
        zzhdf zzhdfVar9 = new zzhdf("STRING", 8, zzhdg.STRING, 2);
        zzi = zzhdfVar9;
        zzhdg zzhdgVar3 = zzhdg.MESSAGE;
        zzhdf zzhdfVar10 = new zzhdf("GROUP", 9, zzhdgVar3, 3);
        zzj = zzhdfVar10;
        zzhdf zzhdfVar11 = new zzhdf("MESSAGE", 10, zzhdgVar3, 2);
        zzk = zzhdfVar11;
        zzhdf zzhdfVar12 = new zzhdf("BYTES", 11, zzhdg.BYTE_STRING, 2);
        zzl = zzhdfVar12;
        zzhdf zzhdfVar13 = new zzhdf("UINT32", 12, zzhdgVar2, 0);
        zzm = zzhdfVar13;
        zzhdf zzhdfVar14 = new zzhdf("ENUM", 13, zzhdg.ENUM, 0);
        zzn = zzhdfVar14;
        zzhdf zzhdfVar15 = new zzhdf("SFIXED32", 14, zzhdgVar2, 5);
        zzo = zzhdfVar15;
        zzhdf zzhdfVar16 = new zzhdf("SFIXED64", 15, zzhdgVar, 1);
        zzp = zzhdfVar16;
        zzhdf zzhdfVar17 = new zzhdf("SINT32", 16, zzhdgVar2, 0);
        zzq = zzhdfVar17;
        zzhdf zzhdfVar18 = new zzhdf("SINT64", 17, zzhdgVar, 0);
        zzr = zzhdfVar18;
        zzs = new zzhdf[]{zzhdfVar, zzhdfVar2, zzhdfVar3, zzhdfVar4, zzhdfVar5, zzhdfVar6, zzhdfVar7, zzhdfVar8, zzhdfVar9, zzhdfVar10, zzhdfVar11, zzhdfVar12, zzhdfVar13, zzhdfVar14, zzhdfVar15, zzhdfVar16, zzhdfVar17, zzhdfVar18};
    }

    private zzhdf(String str, int i, zzhdg zzhdgVar, int i2) {
        super(str, i);
        this.zzt = zzhdgVar;
    }

    public static zzhdf[] values() {
        return (zzhdf[]) zzs.clone();
    }

    public final zzhdg zza() {
        return this.zzt;
    }
}
