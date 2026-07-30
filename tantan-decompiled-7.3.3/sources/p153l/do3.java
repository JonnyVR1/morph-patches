package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.immomo.momomediaext.MMLiveEngine;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0012¢\u0006\u0004\b\u001f\u0010\u0014J\u0015\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0012¢\u0006\u0004\b \u0010\u0014J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u0003R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00101\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0006R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Ll/do3;", "", "<init>", "()V", "", "n", "()Z", "Ll/gcg0;", "subscriber", "", "B", "(Ll/gcg0;)V", "A", "", "fdPath", "faPath", "D", "(Ljava/lang/String;Ljava/lang/String;)V", "Lrx/c;", "w", "()Lrx/c;", Constants.KEY_T, BaseSei.f14624X, "Lcom/immomo/momomediaext/MMLiveEngine;", "engine", c4s.C_ZONE, "(Lcom/immomo/momomediaext/MMLiveEngine;)V", "E", "Lcom/momo/mcamera/mask/MaskModel;", "F", "()Lcom/momo/mcamera/mask/MaskModel;", "m", BLiveStormDanmakuGiftResourceType.f45294s, "Ljava/io/File;", "r", "()Ljava/io/File;", "o", "p", "G", "Ljava/util/ArrayList;", "a", "Ljava/util/ArrayList;", "cvModelList", "b", "Lcom/momo/mcamera/mask/MaskModel;", "mask", "c", "Lkotlin/Lazy;", "q", "lowDevice", Constants.INAPP_DATA_TAG, "Z", "stylizeFaceModel", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class do3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ArrayList<String> cvModelList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static MaskModel mask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean stylizeFaceModel;

    @NotNull
    public static final do3 INSTANCE = new do3();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy lowDevice = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.rn3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(do3.m117136g());
        }
    });

    /* JADX INFO: renamed from: a */
    public static Boolean m117130a(Pair pair) {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzCVResHelper", "init, subscribe start");
        if (gp3.INSTANCE.m131201e()) {
            File fileM117158r = INSTANCE.m117158r();
            xa2Var.m209830a("BuzzCVResHelper", "init, subscribe code " + pair + " file " + (fileM117158r != null ? fileM117158r.getAbsolutePath() : null));
            if (fileM117158r != null && fileM117158r.exists()) {
                cnw.m111552k(fileM117158r.getAbsolutePath());
                stylizeFaceModel = true;
            }
        }
        return Boolean.valueOf(((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair.getSecond()).booleanValue());
    }

    /* JADX INFO: renamed from: b */
    public static Pair m117131b(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m117133d(final int i, final gcg0 gcg0Var) {
        gcg0Var.getClass();
        if (mx3.m160626e().m160630h(i)) {
            INSTANCE.m117147B(gcg0Var);
        } else {
            xa2.INSTANCE.m209830a("BuzzCVResHelper", "init, CVCenter prepareDetector DETECTOR_TYPE_FACE_222");
            mx3.m160626e().m160631i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.bo3
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo19370a(Map map) {
                    do3.m117142u(i, gcg0Var, map);
                }
            }, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m117134e(gcg0 gcg0Var) {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzCVResHelper", "async3DSticker mask " + mask);
        MaskModel maskModel = mask;
        if (maskModel != null) {
            gcg0Var.m137019l(maskModel);
            gcg0Var.onCompleted();
            return;
        }
        File file = new File(ecj.m120375I(), "StylizeFace");
        if (file.exists()) {
            xa2Var.m209830a("BuzzCVResHelper", "async3DSticker file " + file);
            MaskModel mask2 = MaskStore.getInstance().getMask(CoreModule.f18263b, file.getAbsolutePath());
            mask = mask2;
            gcg0Var.m137019l(mask2);
            gcg0Var.onCompleted();
            return;
        }
        xa2Var.m209830a("BuzzCVResHelper", "async3DSticker start copyAssets");
        if (mu6.m160128j(CoreModule.f18263b).m160134f("StylizeFace").m160137i(ecj.m120375I().getAbsolutePath()).m160130b() && file.exists()) {
            MaskModel mask3 = MaskStore.getInstance().getMask(CoreModule.f18263b, file.getAbsolutePath());
            mask = mask3;
            gcg0Var.m137019l(mask3);
        } else {
            gcg0Var.m137019l(null);
        }
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m117136g() {
        return haw.INSTANCE.m134320a().m134318y0() <= 3 || bnl0.m105592y0() < 1080 || INSTANCE.m117154n();
    }

    /* JADX INFO: renamed from: h */
    public static Pair m117137h(boolean z, boolean z2) {
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m117138i(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m117140k(final int i, final gcg0 gcg0Var) {
        gcg0Var.getClass();
        if (mx3.m160626e().m160630h(i)) {
            INSTANCE.m117146A(gcg0Var);
        } else {
            xa2.INSTANCE.m209830a("BuzzCVResHelper", "init, CVCenter prepareDetector DETECTOR_TYPE_STYLIZE_FACE");
            mx3.m160626e().m160631i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.co3
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo19370a(Map map) {
                    do3.m117144y(i, gcg0Var, map);
                }
            }, i);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m117142u(int i, final gcg0 gcg0Var, Map map) {
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "init prepareDetector result DETECTOR_TYPE_FACE_222 " + map.get(Integer.valueOf(i)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m88377d(map.get(Integer.valueOf(i)), Boolean.TRUE)) {
            l51.m152919y(new Runnable() { // from class: l.sn3
                @Override // java.lang.Runnable
                public final void run() {
                    do3.m117143v(gcg0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m117143v(gcg0 gcg0Var) {
        INSTANCE.m117147B(gcg0Var);
    }

    /* JADX INFO: renamed from: y */
    public static final void m117144y(int i, final gcg0 gcg0Var, Map map) {
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "init prepareDetector result DETECTOR_TYPE_STYLIZE_FACE " + map.get(Integer.valueOf(i)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m88377d(map.get(Integer.valueOf(i)), Boolean.TRUE)) {
            l51.m152919y(new Runnable() { // from class: l.tn3
                @Override // java.lang.Runnable
                public final void run() {
                    do3.m117145z(gcg0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m117145z(gcg0 gcg0Var) {
        INSTANCE.m117146A(gcg0Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m117146A(gcg0<? super Boolean> subscriber) {
        File fileM117158r = m117158r();
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzCVResHelper", "onStylizeFacePrepared stylizeFace " + (fileM117158r != null ? fileM117158r.getAbsolutePath() : null));
        if (fileM117158r != null && fileM117158r.exists()) {
            cnw.m111552k(fileM117158r.getAbsolutePath());
            xa2Var.m209830a("BuzzCVResHelper", "onStylizeFacePrepared onCompleted");
            subscriber.m137019l(Boolean.TRUE);
            subscriber.onCompleted();
            return;
        }
        xa2Var.m209831b("BuzzCVResHelper", "onStylizeFacePrepared onError stylizeFace " + (fileM117158r != null ? fileM117158r.getAbsolutePath() : null));
        subscriber.m137019l(Boolean.FALSE);
        subscriber.onCompleted();
    }

    /* JADX INFO: renamed from: B */
    public final void m117147B(gcg0<? super Boolean> subscriber) {
        File fileM117155o = m117155o();
        File fileM117156p = m117156p();
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzCVResHelper", "onTypeFace222Prepared faPath " + (fileM117155o != null ? fileM117155o.getAbsolutePath() : null) + " fdPath " + (fileM117156p != null ? fileM117156p.getAbsolutePath() : null));
        if (fileM117155o != null && fileM117155o.exists() && fileM117156p != null && fileM117156p.exists()) {
            xa2Var.m209830a("BuzzCVResHelper", "onTypeFace222Prepared setMomoCVModelList onCompleted");
            String absolutePath = fileM117156p.getAbsolutePath();
            absolutePath.getClass();
            String absolutePath2 = fileM117155o.getAbsolutePath();
            absolutePath2.getClass();
            m117149D(absolutePath, absolutePath2);
            subscriber.m137019l(Boolean.TRUE);
            subscriber.onCompleted();
            return;
        }
        xa2Var.m209831b("BuzzCVResHelper", "onTypeFace222Prepared setMomoCVModelList error " + (fileM117155o != null ? fileM117155o.getAbsolutePath() : null) + " fdPath " + (fileM117156p != null ? fileM117156p.getAbsolutePath() : null));
        subscriber.m137019l(Boolean.FALSE);
        subscriber.onCompleted();
    }

    /* JADX INFO: renamed from: C */
    public final void m117148C(@Nullable MMLiveEngine engine) {
        if (jyb.m147479J(cvModelList)) {
            xa2.INSTANCE.m209830a("BuzzCVResHelper", "setFaceDetectModelPath, cvModelList is empty");
        }
        cnw.m111550i(cvModelList);
    }

    /* JADX INFO: renamed from: D */
    public final void m117149D(String fdPath, String faPath) {
        if (cvModelList == null) {
            cvModelList = new ArrayList<>();
        }
        ArrayList<String> arrayList = cvModelList;
        if (arrayList != null) {
            arrayList.clear();
            arrayList.add(fdPath);
            arrayList.add(faPath);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m117150E(@Nullable MMLiveEngine engine) {
        File fileM117158r = m117158r();
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "setStylizeFaceModelPath, file " + (fileM117158r != null ? fileM117158r.getAbsolutePath() : null));
        if (fileM117158r == null || !fileM117158r.exists()) {
            return;
        }
        stylizeFaceModel = true;
        cnw.m111552k(fileM117158r.getAbsolutePath());
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final MaskModel m117151F() {
        return mask;
    }

    /* JADX INFO: renamed from: G */
    public final void m117152G() {
        if (stylizeFaceModel) {
            return;
        }
        File fileM117158r = m117158r();
        cnw.m111552k(fileM117158r != null ? fileM117158r.getAbsolutePath() : null);
        stylizeFaceModel = true;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C22421c<MaskModel> m117153m() {
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "async3DSticker start");
        C22421c c22421cCompose = m117159s().compose(psd0.m173606Q());
        c22421cCompose.getClass();
        return c22421cCompose;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m117154n() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final File m117155o() {
        return af00.m97267b().m97270c("mmcv_android_fa_model");
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final File m117156p() {
        return af00.m97267b().m97270c(m117157q() ? "mmcv_android_222_small_fd_model" : "mmcv_android_222_big_fd_model");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m117157q() {
        return ((Boolean) lowDevice.getValue()).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final File m117158r() {
        return af00.m97267b().m97270c(m117157q() ? "mmcv_android_small_stylize_face_model" : "mmcv_android_stylize_face_model");
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final C22421c<MaskModel> m117159s() {
        C22421c<MaskModel> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.un3
            @Override // p153l.y20
            public final void call(Object obj) {
                do3.m117134e((gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final C22421c<Boolean> m117160t() {
        final int i = m117157q() ? 17 : 16;
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "init, checkFace222Model " + i);
        C22421c<Boolean> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.ao3
            @Override // p153l.y20
            public final void call(Object obj) {
                do3.m117133d(i, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final C22421c<Boolean> m117161w() {
        C22421c<Boolean> c22421cM117160t = m117160t();
        C22421c<Boolean> c22421cM117162x = m117162x();
        final Function2 function2 = new Function2() { // from class: l.vn3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return do3.m117137h(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22421c c22421cM173625r = psd0.m173625r(c22421cM117160t, c22421cM117162x, new rcj() { // from class: l.wn3
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return do3.m117131b(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.xn3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return do3.m117130a((Pair) obj);
            }
        };
        C22421c<Boolean> c22421cCompose = c22421cM173625r.map(new qcj() { // from class: l.yn3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return do3.m117138i(function1, obj);
            }
        }).compose(psd0.m173606Q());
        c22421cCompose.getClass();
        return c22421cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final C22421c<Boolean> m117162x() {
        final int i = m117157q() ? 32 : 31;
        xa2.INSTANCE.m209830a("BuzzCVResHelper", "init, checkStylizeFaceModel " + i);
        C22421c<Boolean> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.zn3
            @Override // p153l.y20
            public final void call(Object obj) {
                do3.m117140k(i, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }
}
