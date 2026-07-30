package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbjb {
    public static final zzbjb zza;
    public static final zzbjb zzb;
    public static final zzbjb zzc;
    public static final zzbjb zzd;
    public static final zzbjb zze;
    public static final zzbjb zzf;
    public static final zzbjb zzg;
    public static final zzbjb zzh;
    public static final zzbjb zzi;
    public static final zzbjb zzj;
    public static final zzbjb zzk;
    public static final zzbjb zzl;
    public static final zzbjb zzm;
    public static final zzbjb zzn;
    private static final zzbjb[] zzo;
    private static final /* synthetic */ zzbjb[] zzp;
    private final int zzq;
    private final zzbdo zzr;

    static {
        zzbdo zzbdoVar = zzbdo.zzp;
        zzbjb zzbjbVar = new zzbjb("NO_ERROR", 0, 0, zzbdoVar);
        zza = zzbjbVar;
        zzbdo zzbdoVar2 = zzbdo.zzo;
        zzbjb zzbjbVar2 = new zzbjb("PROTOCOL_ERROR", 1, 1, zzbdoVar2);
        zzb = zzbjbVar2;
        zzbjb zzbjbVar3 = new zzbjb("INTERNAL_ERROR", 2, 2, zzbdoVar2);
        zzc = zzbjbVar3;
        zzbjb zzbjbVar4 = new zzbjb("FLOW_CONTROL_ERROR", 3, 3, zzbdoVar2);
        zzd = zzbjbVar4;
        zzbjb zzbjbVar5 = new zzbjb("SETTINGS_TIMEOUT", 4, 4, zzbdoVar2);
        zze = zzbjbVar5;
        zzbjb zzbjbVar6 = new zzbjb("STREAM_CLOSED", 5, 5, zzbdoVar2);
        zzf = zzbjbVar6;
        zzbjb zzbjbVar7 = new zzbjb("FRAME_SIZE_ERROR", 6, 6, zzbdoVar2);
        zzg = zzbjbVar7;
        zzbjb zzbjbVar8 = new zzbjb("REFUSED_STREAM", 7, 7, zzbdoVar);
        zzh = zzbjbVar8;
        zzbjb zzbjbVar9 = new zzbjb("CANCEL", 8, 8, zzbdo.zzb);
        zzi = zzbjbVar9;
        zzbjb zzbjbVar10 = new zzbjb("COMPRESSION_ERROR", 9, 9, zzbdoVar2);
        zzj = zzbjbVar10;
        zzbjb zzbjbVar11 = new zzbjb("CONNECT_ERROR", 10, 10, zzbdoVar2);
        zzk = zzbjbVar11;
        zzbjb zzbjbVar12 = new zzbjb("ENHANCE_YOUR_CALM", 11, 11, zzbdo.zzj.zzg("Bandwidth exhausted"));
        zzl = zzbjbVar12;
        zzbjb zzbjbVar13 = new zzbjb("INADEQUATE_SECURITY", 12, 12, zzbdo.zzh.zzg("Permission denied as protocol is not secure enough to call"));
        zzm = zzbjbVar13;
        zzbjb zzbjbVar14 = new zzbjb("HTTP_1_1_REQUIRED", 13, 13, zzbdo.zzc);
        zzn = zzbjbVar14;
        zzp = new zzbjb[]{zzbjbVar, zzbjbVar2, zzbjbVar3, zzbjbVar4, zzbjbVar5, zzbjbVar6, zzbjbVar7, zzbjbVar8, zzbjbVar9, zzbjbVar10, zzbjbVar11, zzbjbVar12, zzbjbVar13, zzbjbVar14};
        zzbjb[] zzbjbVarArrValues = values();
        zzbjb[] zzbjbVarArr = new zzbjb[zzbjbVarArrValues[zzbjbVarArrValues.length - 1].zzq + 1];
        for (zzbjb zzbjbVar15 : zzbjbVarArrValues) {
            zzbjbVarArr[zzbjbVar15.zzq] = zzbjbVar15;
        }
        zzo = zzbjbVarArr;
    }

    private zzbjb(String str, int i, int i2, zzbdo zzbdoVar) {
        super(str, i);
        this.zzq = i2;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (zzbdoVar.zzi() != null) {
            strConcat = strConcat + " (" + zzbdoVar.zzi() + ")";
        }
        this.zzr = zzbdoVar.zzg(strConcat);
    }

    public static zzbjb[] values() {
        return (zzbjb[]) zzp.clone();
    }

    public static zzbdo zza(long j) {
        zzbjb[] zzbjbVarArr = zzo;
        zzbjb zzbjbVar = null;
        if (j < zzbjbVarArr.length && j >= 0) {
            zzbjbVar = zzbjbVarArr[(int) j];
        }
        if (zzbjbVar != null) {
            return zzbjbVar.zzr;
        }
        return zzbdo.zzd(zzc.zzr.zza().zza()).zzg("Unrecognized HTTP/2 error code: " + j);
    }
}
