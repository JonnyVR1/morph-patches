package p149l;

import com.google.android.gms.internal.measurement.zzfr$zza;
import com.google.android.gms.internal.measurement.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cjx0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f81256a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f81257b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f81258c;

    static {
        int[] iArr = new int[zzfr$zza.zzd.values().length];
        f81258c = iArr;
        try {
            iArr[zzfr$zza.zzd.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f81258c[zzfr$zza.zzd.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzfr$zza.zze.values().length];
        f81257b = iArr2;
        try {
            iArr2[zzfr$zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f81257b[zzfr$zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f81257b[zzfr$zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f81257b[zzfr$zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzs.values().length];
        f81256a = iArr3;
        try {
            iArr3[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f81256a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f81256a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f81256a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
