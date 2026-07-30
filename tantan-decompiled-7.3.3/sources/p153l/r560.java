package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.C2393a;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.momo.mcamera.mask.Sticker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class r560 {

    /* JADX INFO: renamed from: A */
    public static final zzai f161291A;

    /* JADX INFO: renamed from: B */
    public static final zzai f161292B;

    /* JADX INFO: renamed from: a */
    @NonNull
    @KeepForSdk
    public static final Feature[] f161293a = new Feature[0];

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final Feature f161294b;

    /* JADX INFO: renamed from: c */
    @NonNull
    @KeepForSdk
    public static final Feature f161295c;

    /* JADX INFO: renamed from: d */
    @NonNull
    @KeepForSdk
    public static final Feature f161296d;

    /* JADX INFO: renamed from: e */
    @NonNull
    @KeepForSdk
    public static final Feature f161297e;

    /* JADX INFO: renamed from: f */
    @NonNull
    @KeepForSdk
    public static final Feature f161298f;

    /* JADX INFO: renamed from: g */
    @NonNull
    @KeepForSdk
    public static final Feature f161299g;

    /* JADX INFO: renamed from: h */
    @NonNull
    @KeepForSdk
    public static final Feature f161300h;

    /* JADX INFO: renamed from: i */
    @NonNull
    @KeepForSdk
    public static final Feature f161301i;

    /* JADX INFO: renamed from: j */
    @NonNull
    @KeepForSdk
    public static final Feature f161302j;

    /* JADX INFO: renamed from: k */
    @NonNull
    @KeepForSdk
    public static final Feature f161303k;

    /* JADX INFO: renamed from: l */
    @NonNull
    @KeepForSdk
    public static final Feature f161304l;

    /* JADX INFO: renamed from: m */
    @NonNull
    @KeepForSdk
    public static final Feature f161305m;

    /* JADX INFO: renamed from: n */
    @NonNull
    @KeepForSdk
    public static final Feature f161306n;

    /* JADX INFO: renamed from: o */
    @NonNull
    @KeepForSdk
    public static final Feature f161307o;

    /* JADX INFO: renamed from: p */
    @NonNull
    @KeepForSdk
    public static final Feature f161308p;

    /* JADX INFO: renamed from: q */
    @NonNull
    @KeepForSdk
    public static final Feature f161309q;

    /* JADX INFO: renamed from: r */
    @NonNull
    @KeepForSdk
    public static final Feature f161310r;

    /* JADX INFO: renamed from: s */
    @NonNull
    @KeepForSdk
    public static final Feature f161311s;

    /* JADX INFO: renamed from: t */
    @NonNull
    @KeepForSdk
    public static final Feature f161312t;

    /* JADX INFO: renamed from: u */
    @NonNull
    @KeepForSdk
    public static final Feature f161313u;

    /* JADX INFO: renamed from: v */
    @NonNull
    @KeepForSdk
    public static final Feature f161314v;

    /* JADX INFO: renamed from: w */
    @NonNull
    @KeepForSdk
    public static final Feature f161315w;

    /* JADX INFO: renamed from: x */
    @NonNull
    @KeepForSdk
    public static final Feature f161316x;

    /* JADX INFO: renamed from: y */
    @NonNull
    @KeepForSdk
    public static final Feature f161317y;

    /* JADX INFO: renamed from: z */
    @NonNull
    @KeepForSdk
    public static final Feature f161318z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f161294b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f161295c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f161296d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f161297e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f161298f = feature5;
        f161299g = new Feature("mlkit.ocr.chinese", 1L);
        f161300h = new Feature("mlkit.ocr.common", 1L);
        f161301i = new Feature("mlkit.ocr.devanagari", 1L);
        f161302j = new Feature("mlkit.ocr.japanese", 1L);
        f161303k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f161304l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f161305m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f161306n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f161307o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f161308p = feature10;
        f161309q = new Feature("mlkit.image.caption", 1L);
        f161310r = new Feature("mlkit.docscan.detect", 1L);
        f161311s = new Feature("mlkit.docscan.crop", 1L);
        f161312t = new Feature("mlkit.docscan.enhance", 1L);
        f161313u = new Feature("mlkit.docscan.ui", 1L);
        f161314v = new Feature("mlkit.docscan.stain", 1L);
        f161315w = new Feature("mlkit.docscan.shadow", 1L);
        f161316x = new Feature("mlkit.quality.aesthetic", 1L);
        f161317y = new Feature("mlkit.quality.technical", 1L);
        f161318z = new Feature("mlkit.segmentation.subject", 1L);
        C2393a c2393a = new C2393a();
        c2393a.m14768a("barcode", feature);
        c2393a.m14768a("custom_ica", feature2);
        c2393a.m14768a(Sticker.LAYER_TYPE_FACE, feature3);
        c2393a.m14768a("ica", feature4);
        c2393a.m14768a(CommonUtils.SERVICE, feature5);
        c2393a.m14768a("langid", feature6);
        c2393a.m14768a("nlclassifier", feature7);
        c2393a.m14768a("tflite_dynamite", feature8);
        c2393a.m14768a("barcode_ui", feature9);
        c2393a.m14768a("smart_reply", feature10);
        f161291A = c2393a.m14769b();
        C2393a c2393a2 = new C2393a();
        c2393a2.m14768a("com.google.android.gms.vision.barcode", feature);
        c2393a2.m14768a("com.google.android.gms.vision.custom.ica", feature2);
        c2393a2.m14768a("com.google.android.gms.vision.face", feature3);
        c2393a2.m14768a("com.google.android.gms.vision.ica", feature4);
        c2393a2.m14768a("com.google.android.gms.vision.ocr", feature5);
        c2393a2.m14768a("com.google.android.gms.mlkit.langid", feature6);
        c2393a2.m14768a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c2393a2.m14768a("com.google.android.gms.tflite_dynamite", feature8);
        c2393a2.m14768a("com.google.android.gms.mlkit_smartreply", feature10);
        f161292B = c2393a2.m14769b();
    }
}
