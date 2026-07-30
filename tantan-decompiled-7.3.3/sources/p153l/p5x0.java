package p153l;

import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p5x0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f150705a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f150706b;

    static {
        int[] iArr = new int[zzgus.values().length];
        f150706b = iArr;
        try {
            iArr[zzgus.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f150706b[zzgus.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzgvz.values().length];
        f150705a = iArr2;
        try {
            iArr2[zzgvz.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f150705a[zzgvz.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f150705a[zzgvz.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f150705a[zzgvz.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
