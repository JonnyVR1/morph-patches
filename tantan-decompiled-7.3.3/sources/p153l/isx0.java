package p153l;

import com.google.android.gms.internal.measurement.zzfr$zza;
import com.google.android.gms.internal.measurement.zzs;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class isx0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f116775a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f116776b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f116777c;

    static {
        int[] iArr = new int[zzfr$zza.zzd.values().length];
        f116777c = iArr;
        try {
            iArr[zzfr$zza.zzd.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f116777c[zzfr$zza.zzd.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzfr$zza.zze.values().length];
        f116776b = iArr2;
        try {
            iArr2[zzfr$zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f116776b[zzfr$zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f116776b[zzfr$zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f116776b[zzfr$zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzs.values().length];
        f116775a = iArr3;
        try {
            iArr3[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f116775a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f116775a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f116775a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
