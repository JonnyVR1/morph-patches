package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.C2370a;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.momo.mcamera.mask.Sticker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class lx50 {

    /* JADX INFO: renamed from: A */
    public static final zzai f130359A;

    /* JADX INFO: renamed from: B */
    public static final zzai f130360B;

    /* JADX INFO: renamed from: a */
    @NonNull
    @KeepForSdk
    public static final Feature[] f130361a = new Feature[0];

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final Feature f130362b;

    /* JADX INFO: renamed from: c */
    @NonNull
    @KeepForSdk
    public static final Feature f130363c;

    /* JADX INFO: renamed from: d */
    @NonNull
    @KeepForSdk
    public static final Feature f130364d;

    /* JADX INFO: renamed from: e */
    @NonNull
    @KeepForSdk
    public static final Feature f130365e;

    /* JADX INFO: renamed from: f */
    @NonNull
    @KeepForSdk
    public static final Feature f130366f;

    /* JADX INFO: renamed from: g */
    @NonNull
    @KeepForSdk
    public static final Feature f130367g;

    /* JADX INFO: renamed from: h */
    @NonNull
    @KeepForSdk
    public static final Feature f130368h;

    /* JADX INFO: renamed from: i */
    @NonNull
    @KeepForSdk
    public static final Feature f130369i;

    /* JADX INFO: renamed from: j */
    @NonNull
    @KeepForSdk
    public static final Feature f130370j;

    /* JADX INFO: renamed from: k */
    @NonNull
    @KeepForSdk
    public static final Feature f130371k;

    /* JADX INFO: renamed from: l */
    @NonNull
    @KeepForSdk
    public static final Feature f130372l;

    /* JADX INFO: renamed from: m */
    @NonNull
    @KeepForSdk
    public static final Feature f130373m;

    /* JADX INFO: renamed from: n */
    @NonNull
    @KeepForSdk
    public static final Feature f130374n;

    /* JADX INFO: renamed from: o */
    @NonNull
    @KeepForSdk
    public static final Feature f130375o;

    /* JADX INFO: renamed from: p */
    @NonNull
    @KeepForSdk
    public static final Feature f130376p;

    /* JADX INFO: renamed from: q */
    @NonNull
    @KeepForSdk
    public static final Feature f130377q;

    /* JADX INFO: renamed from: r */
    @NonNull
    @KeepForSdk
    public static final Feature f130378r;

    /* JADX INFO: renamed from: s */
    @NonNull
    @KeepForSdk
    public static final Feature f130379s;

    /* JADX INFO: renamed from: t */
    @NonNull
    @KeepForSdk
    public static final Feature f130380t;

    /* JADX INFO: renamed from: u */
    @NonNull
    @KeepForSdk
    public static final Feature f130381u;

    /* JADX INFO: renamed from: v */
    @NonNull
    @KeepForSdk
    public static final Feature f130382v;

    /* JADX INFO: renamed from: w */
    @NonNull
    @KeepForSdk
    public static final Feature f130383w;

    /* JADX INFO: renamed from: x */
    @NonNull
    @KeepForSdk
    public static final Feature f130384x;

    /* JADX INFO: renamed from: y */
    @NonNull
    @KeepForSdk
    public static final Feature f130385y;

    /* JADX INFO: renamed from: z */
    @NonNull
    @KeepForSdk
    public static final Feature f130386z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f130362b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f130363c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f130364d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f130365e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f130366f = feature5;
        f130367g = new Feature("mlkit.ocr.chinese", 1L);
        f130368h = new Feature("mlkit.ocr.common", 1L);
        f130369i = new Feature("mlkit.ocr.devanagari", 1L);
        f130370j = new Feature("mlkit.ocr.japanese", 1L);
        f130371k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f130372l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f130373m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f130374n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f130375o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f130376p = feature10;
        f130377q = new Feature("mlkit.image.caption", 1L);
        f130378r = new Feature("mlkit.docscan.detect", 1L);
        f130379s = new Feature("mlkit.docscan.crop", 1L);
        f130380t = new Feature("mlkit.docscan.enhance", 1L);
        f130381u = new Feature("mlkit.docscan.ui", 1L);
        f130382v = new Feature("mlkit.docscan.stain", 1L);
        f130383w = new Feature("mlkit.docscan.shadow", 1L);
        f130384x = new Feature("mlkit.quality.aesthetic", 1L);
        f130385y = new Feature("mlkit.quality.technical", 1L);
        f130386z = new Feature("mlkit.segmentation.subject", 1L);
        C2370a c2370a = new C2370a();
        c2370a.m14714a("barcode", feature);
        c2370a.m14714a("custom_ica", feature2);
        c2370a.m14714a(Sticker.LAYER_TYPE_FACE, feature3);
        c2370a.m14714a("ica", feature4);
        c2370a.m14714a(CommonUtils.SERVICE, feature5);
        c2370a.m14714a("langid", feature6);
        c2370a.m14714a("nlclassifier", feature7);
        c2370a.m14714a("tflite_dynamite", feature8);
        c2370a.m14714a("barcode_ui", feature9);
        c2370a.m14714a("smart_reply", feature10);
        f130359A = c2370a.m14715b();
        C2370a c2370a2 = new C2370a();
        c2370a2.m14714a("com.google.android.gms.vision.barcode", feature);
        c2370a2.m14714a("com.google.android.gms.vision.custom.ica", feature2);
        c2370a2.m14714a("com.google.android.gms.vision.face", feature3);
        c2370a2.m14714a("com.google.android.gms.vision.ica", feature4);
        c2370a2.m14714a("com.google.android.gms.vision.ocr", feature5);
        c2370a2.m14714a("com.google.android.gms.mlkit.langid", feature6);
        c2370a2.m14714a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c2370a2.m14714a("com.google.android.gms.tflite_dynamite", feature8);
        c2370a2.m14714a("com.google.android.gms.mlkit_smartreply", feature10);
        f130360B = c2370a2.m14715b();
    }
}
