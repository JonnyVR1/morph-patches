package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener;
import com.immomo.momomediaext.MMLiveEngine;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0012¢\u0006\u0004\b\u001f\u0010\u0014J\u0015\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0012¢\u0006\u0004\b \u0010\u0014J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u0003R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00101\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0006R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Ll/dn3;", "", "<init>", "()V", "", "n", "()Z", "Ll/z3g0;", "subscriber", "", "B", "(Ll/z3g0;)V", "A", "", "fdPath", "faPath", "D", "(Ljava/lang/String;Ljava/lang/String;)V", "Lrx/c;", "w", "()Lrx/c;", Constants.KEY_T, BaseSei.f13930X, "Lcom/immomo/momomediaext/MMLiveEngine;", "engine", b2s.C_ZONE, "(Lcom/immomo/momomediaext/MMLiveEngine;)V", "E", "Lcom/momo/mcamera/mask/MaskModel;", "F", "()Lcom/momo/mcamera/mask/MaskModel;", "m", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/io/File;", "r", "()Ljava/io/File;", "o", "p", "G", "Ljava/util/ArrayList;", "a", "Ljava/util/ArrayList;", "cvModelList", "b", "Lcom/momo/mcamera/mask/MaskModel;", "mask", "c", "Lkotlin/Lazy;", "q", "lowDevice", Constants.INAPP_DATA_TAG, "Z", "stylizeFaceModel", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dn3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ArrayList<String> cvModelList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static MaskModel mask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean stylizeFaceModel;

    @NotNull
    public static final dn3 INSTANCE = new dn3();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy lowDevice = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.rm3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(dn3.m112584g());
        }
    });

    /* JADX INFO: renamed from: a */
    public static Boolean m112578a(Pair pair) {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzCVResHelper", "init, subscribe start");
        if (go3.INSTANCE.m127227e()) {
            File fileM112606r = INSTANCE.m112606r();
            qa2Var.m173681a("BuzzCVResHelper", "init, subscribe code " + pair + " file " + (fileM112606r != null ? fileM112606r.getAbsolutePath() : null));
            if (fileM112606r != null && fileM112606r.exists()) {
                dkw.m112284k(fileM112606r.getAbsolutePath());
                stylizeFaceModel = true;
            }
        }
        return Boolean.valueOf(((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair.getSecond()).booleanValue());
    }

    /* JADX INFO: renamed from: b */
    public static Pair m112579b(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m112581d(final int i, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        if (nw3.m161776e().m161780h(i)) {
            INSTANCE.m112595B(z3g0Var);
        } else {
            qa2.INSTANCE.m173681a("BuzzCVResHelper", "init, CVCenter prepareDetector DETECTOR_TYPE_FACE_222");
            nw3.m161776e().m161781i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.bn3
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo18293a(Map map) {
                    dn3.m112590u(i, z3g0Var, map);
                }
            }, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m112582e(z3g0 z3g0Var) {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzCVResHelper", "async3DSticker mask " + mask);
        MaskModel maskModel = mask;
        if (maskModel != null) {
            z3g0Var.m132487l(maskModel);
            z3g0Var.onCompleted();
            return;
        }
        File file = new File(k9j.m145077I(), "StylizeFace");
        if (file.exists()) {
            qa2Var.m173681a("BuzzCVResHelper", "async3DSticker file " + file);
            MaskModel mask2 = MaskStore.getInstance().getMask(CoreModule.f17544b, file.getAbsolutePath());
            mask = mask2;
            z3g0Var.m132487l(mask2);
            z3g0Var.onCompleted();
            return;
        }
        qa2Var.m173681a("BuzzCVResHelper", "async3DSticker start copyAssets");
        if (jt6.m143086j(CoreModule.f17544b).m143092f("StylizeFace").m143095i(k9j.m145077I().getAbsolutePath()).m143088b() && file.exists()) {
            MaskModel mask3 = MaskStore.getInstance().getMask(CoreModule.f17544b, file.getAbsolutePath());
            mask = mask3;
            z3g0Var.m132487l(mask3);
        } else {
            z3g0Var.m132487l(null);
        }
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m112584g() {
        return j8w.INSTANCE.m140473a().m140471y0() <= 3 || xdl0.m208412y0() < 1080 || INSTANCE.m112602n();
    }

    /* JADX INFO: renamed from: h */
    public static Pair m112585h(boolean z, boolean z2) {
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m112586i(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static void m112588k(final int i, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        if (nw3.m161776e().m161780h(i)) {
            INSTANCE.m112594A(z3g0Var);
        } else {
            qa2.INSTANCE.m173681a("BuzzCVResHelper", "init, CVCenter prepareDetector DETECTOR_TYPE_STYLIZE_FACE");
            nw3.m161776e().m161781i(new DetectorListener$OnDetectorPreparedListener() { // from class: l.cn3
                @Override // com.immomo.cvcenter.interfaces.DetectorListener$OnDetectorPreparedListener
                /* JADX INFO: renamed from: a */
                public final void mo18293a(Map map) {
                    dn3.m112592y(i, z3g0Var, map);
                }
            }, i);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m112590u(int i, final z3g0 z3g0Var, Map map) {
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "init prepareDetector result DETECTOR_TYPE_FACE_222 " + map.get(Integer.valueOf(i)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m87488d(map.get(Integer.valueOf(i)), Boolean.TRUE)) {
            e51.m114774y(new Runnable() { // from class: l.sm3
                @Override // java.lang.Runnable
                public final void run() {
                    dn3.m112591v(z3g0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m112591v(z3g0 z3g0Var) {
        INSTANCE.m112595B(z3g0Var);
    }

    /* JADX INFO: renamed from: y */
    public static final void m112592y(int i, final z3g0 z3g0Var, Map map) {
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "init prepareDetector result DETECTOR_TYPE_STYLIZE_FACE " + map.get(Integer.valueOf(i)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (Intrinsics.m87488d(map.get(Integer.valueOf(i)), Boolean.TRUE)) {
            e51.m114774y(new Runnable() { // from class: l.tm3
                @Override // java.lang.Runnable
                public final void run() {
                    dn3.m112593z(z3g0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m112593z(z3g0 z3g0Var) {
        INSTANCE.m112594A(z3g0Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m112594A(z3g0<? super Boolean> subscriber) {
        File fileM112606r = m112606r();
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzCVResHelper", "onStylizeFacePrepared stylizeFace " + (fileM112606r != null ? fileM112606r.getAbsolutePath() : null));
        if (fileM112606r != null && fileM112606r.exists()) {
            dkw.m112284k(fileM112606r.getAbsolutePath());
            qa2Var.m173681a("BuzzCVResHelper", "onStylizeFacePrepared onCompleted");
            subscriber.m132487l(Boolean.TRUE);
            subscriber.onCompleted();
            return;
        }
        qa2Var.m173682b("BuzzCVResHelper", "onStylizeFacePrepared onError stylizeFace " + (fileM112606r != null ? fileM112606r.getAbsolutePath() : null));
        subscriber.m132487l(Boolean.FALSE);
        subscriber.onCompleted();
    }

    /* JADX INFO: renamed from: B */
    public final void m112595B(z3g0<? super Boolean> subscriber) {
        File fileM112603o = m112603o();
        File fileM112604p = m112604p();
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzCVResHelper", "onTypeFace222Prepared faPath " + (fileM112603o != null ? fileM112603o.getAbsolutePath() : null) + " fdPath " + (fileM112604p != null ? fileM112604p.getAbsolutePath() : null));
        if (fileM112603o != null && fileM112603o.exists() && fileM112604p != null && fileM112604p.exists()) {
            qa2Var.m173681a("BuzzCVResHelper", "onTypeFace222Prepared setMomoCVModelList onCompleted");
            String absolutePath = fileM112604p.getAbsolutePath();
            absolutePath.getClass();
            String absolutePath2 = fileM112603o.getAbsolutePath();
            absolutePath2.getClass();
            m112597D(absolutePath, absolutePath2);
            subscriber.m132487l(Boolean.TRUE);
            subscriber.onCompleted();
            return;
        }
        qa2Var.m173682b("BuzzCVResHelper", "onTypeFace222Prepared setMomoCVModelList error " + (fileM112603o != null ? fileM112603o.getAbsolutePath() : null) + " fdPath " + (fileM112604p != null ? fileM112604p.getAbsolutePath() : null));
        subscriber.m132487l(Boolean.FALSE);
        subscriber.onCompleted();
    }

    /* JADX INFO: renamed from: C */
    public final void m112596C(@Nullable MMLiveEngine engine) {
        if (vwb.m200296J(cvModelList)) {
            qa2.INSTANCE.m173681a("BuzzCVResHelper", "setFaceDetectModelPath, cvModelList is empty");
        }
        dkw.m112282i(cvModelList);
    }

    /* JADX INFO: renamed from: D */
    public final void m112597D(String fdPath, String faPath) {
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
    public final void m112598E(@Nullable MMLiveEngine engine) {
        File fileM112606r = m112606r();
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "setStylizeFaceModelPath, file " + (fileM112606r != null ? fileM112606r.getAbsolutePath() : null));
        if (fileM112606r == null || !fileM112606r.exists()) {
            return;
        }
        stylizeFaceModel = true;
        dkw.m112284k(fileM112606r.getAbsolutePath());
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final MaskModel m112599F() {
        return mask;
    }

    /* JADX INFO: renamed from: G */
    public final void m112600G() {
        if (stylizeFaceModel) {
            return;
        }
        File fileM112606r = m112606r();
        dkw.m112284k(fileM112606r != null ? fileM112606r.getAbsolutePath() : null);
        stylizeFaceModel = true;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C22306c<MaskModel> m112601m() {
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "async3DSticker start");
        C22306c c22306cCompose = m112607s().compose(mkd0.m154965Q());
        c22306cCompose.getClass();
        return c22306cCompose;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m112602n() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final File m112603o() {
        return r600.m177960b().m177963c("mmcv_android_fa_model");
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final File m112604p() {
        return r600.m177960b().m177963c(m112605q() ? "mmcv_android_222_small_fd_model" : "mmcv_android_222_big_fd_model");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m112605q() {
        return ((Boolean) lowDevice.getValue()).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final File m112606r() {
        return r600.m177960b().m177963c(m112605q() ? "mmcv_android_small_stylize_face_model" : "mmcv_android_stylize_face_model");
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final C22306c<MaskModel> m112607s() {
        C22306c<MaskModel> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.um3
            @Override // p149l.e30
            public final void call(Object obj) {
                dn3.m112582e((z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final C22306c<Boolean> m112608t() {
        final int i = m112605q() ? 17 : 16;
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "init, checkFace222Model " + i);
        C22306c<Boolean> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.an3
            @Override // p149l.e30
            public final void call(Object obj) {
                dn3.m112581d(i, (z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final C22306c<Boolean> m112609w() {
        C22306c<Boolean> c22306cM112608t = m112608t();
        C22306c<Boolean> c22306cM112610x = m112610x();
        final Function2 function2 = new Function2() { // from class: l.vm3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return dn3.m112585h(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22306c c22306cM154984r = mkd0.m154984r(c22306cM112608t, c22306cM112610x, new x9j() { // from class: l.wm3
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return dn3.m112579b(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.xm3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dn3.m112578a((Pair) obj);
            }
        };
        C22306c<Boolean> c22306cCompose = c22306cM154984r.map(new w9j() { // from class: l.ym3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dn3.m112586i(function1, obj);
            }
        }).compose(mkd0.m154965Q());
        c22306cCompose.getClass();
        return c22306cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final C22306c<Boolean> m112610x() {
        final int i = m112605q() ? 32 : 31;
        qa2.INSTANCE.m173681a("BuzzCVResHelper", "init, checkStylizeFaceModel " + i);
        C22306c<Boolean> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.zm3
            @Override // p149l.e30
            public final void call(Object obj) {
                dn3.m112588k(i, (z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }
}
