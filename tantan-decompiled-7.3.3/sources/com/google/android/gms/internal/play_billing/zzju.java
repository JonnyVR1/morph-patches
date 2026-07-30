package com.google.android.gms.internal.play_billing;

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
public final class zzju {
    public static final zzju zza;
    public static final zzju zzb;
    public static final zzju zzc;
    public static final zzju zzd;
    public static final zzju zze;
    public static final zzju zzf;
    public static final zzju zzg;
    public static final zzju zzh;
    public static final zzju zzi;
    public static final zzju zzj;
    public static final zzju zzk;
    public static final zzju zzl;
    public static final zzju zzm;
    public static final zzju zzn;
    public static final zzju zzo;
    public static final zzju zzp;
    public static final zzju zzq;
    public static final zzju zzr;
    private static final /* synthetic */ zzju[] zzs;
    private final zzjv zzt;

    static {
        zzju zzjuVar = new zzju("DOUBLE", 0, zzjv.DOUBLE, 1);
        zza = zzjuVar;
        zzju zzjuVar2 = new zzju("FLOAT", 1, zzjv.FLOAT, 5);
        zzb = zzjuVar2;
        zzjv zzjvVar = zzjv.LONG;
        zzju zzjuVar3 = new zzju("INT64", 2, zzjvVar, 0);
        zzc = zzjuVar3;
        zzju zzjuVar4 = new zzju("UINT64", 3, zzjvVar, 0);
        zzd = zzjuVar4;
        zzjv zzjvVar2 = zzjv.INT;
        zzju zzjuVar5 = new zzju("INT32", 4, zzjvVar2, 0);
        zze = zzjuVar5;
        zzju zzjuVar6 = new zzju("FIXED64", 5, zzjvVar, 1);
        zzf = zzjuVar6;
        zzju zzjuVar7 = new zzju("FIXED32", 6, zzjvVar2, 5);
        zzg = zzjuVar7;
        zzju zzjuVar8 = new zzju("BOOL", 7, zzjv.BOOLEAN, 0);
        zzh = zzjuVar8;
        zzju zzjuVar9 = new zzju("STRING", 8, zzjv.STRING, 2);
        zzi = zzjuVar9;
        zzjv zzjvVar3 = zzjv.MESSAGE;
        zzju zzjuVar10 = new zzju("GROUP", 9, zzjvVar3, 3);
        zzj = zzjuVar10;
        zzju zzjuVar11 = new zzju("MESSAGE", 10, zzjvVar3, 2);
        zzk = zzjuVar11;
        zzju zzjuVar12 = new zzju("BYTES", 11, zzjv.BYTE_STRING, 2);
        zzl = zzjuVar12;
        zzju zzjuVar13 = new zzju("UINT32", 12, zzjvVar2, 0);
        zzm = zzjuVar13;
        zzju zzjuVar14 = new zzju("ENUM", 13, zzjv.ENUM, 0);
        zzn = zzjuVar14;
        zzju zzjuVar15 = new zzju("SFIXED32", 14, zzjvVar2, 5);
        zzo = zzjuVar15;
        zzju zzjuVar16 = new zzju("SFIXED64", 15, zzjvVar, 1);
        zzp = zzjuVar16;
        zzju zzjuVar17 = new zzju("SINT32", 16, zzjvVar2, 0);
        zzq = zzjuVar17;
        zzju zzjuVar18 = new zzju("SINT64", 17, zzjvVar, 0);
        zzr = zzjuVar18;
        zzs = new zzju[]{zzjuVar, zzjuVar2, zzjuVar3, zzjuVar4, zzjuVar5, zzjuVar6, zzjuVar7, zzjuVar8, zzjuVar9, zzjuVar10, zzjuVar11, zzjuVar12, zzjuVar13, zzjuVar14, zzjuVar15, zzjuVar16, zzjuVar17, zzjuVar18};
    }

    private zzju(String str, int i, zzjv zzjvVar, int i2) {
        super(str, i);
        this.zzt = zzjvVar;
    }

    public static zzju[] values() {
        return (zzju[]) zzs.clone();
    }

    public final zzjv zza() {
        return this.zzt;
    }
}
