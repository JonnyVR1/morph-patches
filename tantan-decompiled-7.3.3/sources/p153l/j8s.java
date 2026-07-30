package p153l;

import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.immomo.momomediaext.filter.DetectorType;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.mcamera.liveprocessor.AnimojiProcessor;
import com.momo.mcamera.liveprocessor.BodyProcessor;
import com.momo.mcamera.liveprocessor.ByteDanceSegmentProcessor;
import com.momo.mcamera.liveprocessor.CartoonFaceProcessor;
import com.momo.mcamera.liveprocessor.IProcessor;
import com.momo.mcamera.liveprocessor.MomoSegmentProcessor;
import com.momo.mcamera.liveprocessor.StylizeFaceProcessor;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.stylizeface.StylizefaceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ+\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u0016\u00105\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R(\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00109R(\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109¨\u0006<"}, m88121d2 = {"Ll/j8s;", "Ll/suf;", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "lightningRender", "<init>", "(Lcom/momo/xeengine/lightningrender/ILightningRender;)V", "Lcom/immomo/momomediaext/filter/DetectorType;", "detectorType", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/immomo/momomediaext/filter/DetectorType;)V", "j", BLiveStormDanmakuGiftResourceType.f45292l, "()V", Constants.INAPP_DATA_TAG, "p", "h", "q", RXScreenCaptureService.KEY_INDEX, "n", "f", "m", "e", "Ll/omw;", "mmcvInfo", "", BaseSei.INFO, "r", "(Ll/omw;Lcom/immomo/momomediaext/filter/DetectorType;Ljava/lang/Object;)V", "detector", "o", "g", "", "beautyType", Constants.KEY_T, "(I)V", "", "scaleFactor", "k", "(F)V", "setMMCVInfo", "(Ll/omw;)V", "c", "a", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "Ll/azd;", "b", "Ll/azd;", "detectorCounter", "Ll/t1f;", "Ll/t1f;", "engineBridge", "I", "faceProcessType", "F", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/momo/mcamera/liveprocessor/IProcessor;", "Ljava/util/concurrent/ConcurrentHashMap;", "workingDetector", "freeingDetector", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class j8s implements suf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ILightningRender lightningRender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final azd detectorCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final t1f engineBridge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int faceProcessType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float scaleFactor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> workingDetector;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> freeingDetector;

    /* JADX INFO: renamed from: l.j8s$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/j8s$a", "Ll/bzd;", "Lcom/immomo/momomediaext/filter/DetectorType;", "detector", "", "a", "(Lcom/immomo/momomediaext/filter/DetectorType;)V", "b", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C17895a implements bzd {
        public C17895a() {
        }

        @Override // p153l.bzd
        /* JADX INFO: renamed from: a */
        public void mo107141a(@NotNull DetectorType detector) {
            detector.getClass();
            j8s.this.m143897s(detector);
        }

        @Override // p153l.bzd
        /* JADX INFO: renamed from: b */
        public void mo107142b(@NotNull DetectorType detector) {
            detector.getClass();
            j8s.this.m143890j(detector);
        }
    }

    /* JADX INFO: renamed from: l.j8s$b */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class C17896b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118812a;

        static {
            int[] iArr = new int[DetectorType.values().length];
            try {
                iArr[DetectorType.ANIMOJI_DETECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DetectorType.SEGMENT_DETECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DetectorType.STYLIZE_FACE_DETECTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DetectorType.CARTOON_FACE_DETECTOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DetectorType.BODY_LANDMARK_DETECTOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f118812a = iArr;
        }
    }

    public j8s(@Nullable ILightningRender iLightningRender) {
        this.lightningRender = iLightningRender;
        azd azdVar = new azd();
        this.detectorCounter = azdVar;
        this.engineBridge = new t1f(iLightningRender);
        this.faceProcessType = 1;
        this.scaleFactor = -1.0f;
        this.workingDetector = new ConcurrentHashMap<>();
        this.freeingDetector = new ConcurrentHashMap<>();
        azdVar.m101069h(new C17895a());
    }

    /* JADX INFO: renamed from: d */
    private final void m143885d() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.ANIMOJI_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            this.freeingDetector.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m143886e() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.BODY_LANDMARK_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap2 = this.freeingDetector;
            iProcessorRemove.getClass();
            concurrentHashMap2.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m143887f() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.CARTOON_FACE_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap2 = this.freeingDetector;
            iProcessorRemove.getClass();
            concurrentHashMap2.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m143888h() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.SEGMENT_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            this.freeingDetector.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m143889i() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.STYLIZE_FACE_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap2 = this.freeingDetector;
            iProcessorRemove.getClass();
            concurrentHashMap2.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m143890j(DetectorType detectorType) {
        int i = C17896b.f118812a[detectorType.ordinal()];
        if (i == 1) {
            m143885d();
            return;
        }
        if (i == 2) {
            m143888h();
            return;
        }
        if (i == 3) {
            m143889i();
        } else if (i == 4) {
            m143887f();
        } else {
            if (i != 5) {
                return;
            }
            m143886e();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m143891l() {
        IProcessor<? extends Object> animojiProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.ANIMOJI_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            iProcessorRemove.getClass();
            animojiProcessor = iProcessorRemove;
        } else {
            animojiProcessor = new AnimojiProcessor();
        }
        ArrayList arrayList = new ArrayList();
        String strM111545d = cnw.m111545d(8);
        strM111545d.getClass();
        arrayList.add(strM111545d);
        animojiProcessor.setModelPath(arrayList);
        ((AnimojiProcessor) animojiProcessor).setFaceProcessType(this.faceProcessType);
        this.workingDetector.put(detectorType, animojiProcessor);
    }

    /* JADX INFO: renamed from: m */
    private final void m143892m() {
        IProcessor<? extends Object> bodyProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.BODY_LANDMARK_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            iProcessorRemove.getClass();
            bodyProcessor = iProcessorRemove;
        } else {
            bodyProcessor = new BodyProcessor();
        }
        ArrayList arrayList = new ArrayList();
        String strM111545d = cnw.m111545d(3);
        strM111545d.getClass();
        arrayList.add(strM111545d);
        bodyProcessor.setModelPath(arrayList);
        this.workingDetector.put(detectorType, bodyProcessor);
    }

    /* JADX INFO: renamed from: n */
    private final void m143893n() {
        IProcessor<? extends Object> cartoonFaceProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.CARTOON_FACE_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            iProcessorRemove.getClass();
            cartoonFaceProcessor = iProcessorRemove;
        } else {
            cartoonFaceProcessor = new CartoonFaceProcessor();
        }
        ArrayList arrayList = new ArrayList();
        String strM111545d = cnw.m111545d(22);
        strM111545d.getClass();
        arrayList.add(strM111545d);
        cartoonFaceProcessor.setModelPath(arrayList);
        this.workingDetector.put(detectorType, cartoonFaceProcessor);
    }

    /* JADX INFO: renamed from: p */
    private final void m143894p() {
        IProcessor<? extends Object> momoSegmentProcessor;
        IProcessor<? extends Object> byteDanceSegmentProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.SEGMENT_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        boolean zM217354a = yu2.INSTANCE.m217354a();
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap2 = this.freeingDetector;
        if (!zM217354a) {
            if (concurrentHashMap2.containsKey(detectorType)) {
                IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
                iProcessorRemove.getClass();
                iProcessorRemove.getClass();
                momoSegmentProcessor = iProcessorRemove;
            } else {
                momoSegmentProcessor = new MomoSegmentProcessor();
            }
            ArrayList arrayList = new ArrayList();
            String strM111545d = cnw.m111545d(4);
            strM111545d.getClass();
            arrayList.add(strM111545d);
            momoSegmentProcessor.setModelPath(arrayList);
            this.workingDetector.put(detectorType, momoSegmentProcessor);
            return;
        }
        if (concurrentHashMap2.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove2 = this.freeingDetector.remove(detectorType);
            iProcessorRemove2.getClass();
            iProcessorRemove2.getClass();
            byteDanceSegmentProcessor = iProcessorRemove2;
        } else {
            byteDanceSegmentProcessor = new ByteDanceSegmentProcessor();
        }
        ArrayList arrayList2 = new ArrayList();
        String strM111545d2 = cnw.m111545d(10);
        strM111545d2.getClass();
        arrayList2.add(strM111545d2);
        String strM111545d3 = cnw.m111545d(9);
        strM111545d3.getClass();
        arrayList2.add(strM111545d3);
        byteDanceSegmentProcessor.setModelPath(arrayList2);
        this.workingDetector.put(detectorType, byteDanceSegmentProcessor);
    }

    /* JADX INFO: renamed from: q */
    private final void m143895q() {
        IProcessor<? extends Object> stylizeFaceProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.STYLIZE_FACE_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            iProcessorRemove.getClass();
            stylizeFaceProcessor = iProcessorRemove;
        } else {
            stylizeFaceProcessor = new StylizeFaceProcessor();
        }
        ArrayList arrayList = new ArrayList();
        String strM111545d = cnw.m111545d(21);
        strM111545d.getClass();
        arrayList.add(strM111545d);
        stylizeFaceProcessor.setModelPath(arrayList);
        ((StylizeFaceProcessor) stylizeFaceProcessor).setScaleFactor(this.scaleFactor);
        this.workingDetector.put(detectorType, stylizeFaceProcessor);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    private final void m143896r(omw mmcvInfo, DetectorType detectorType, Object info) {
        int i = C17896b.f118812a[detectorType.ordinal()];
        if (i == 1) {
            if (mmcvInfo != null) {
                mmcvInfo.m168287D(info instanceof evf ? (evf) info : null);
                return;
            }
            return;
        }
        if (i == 2) {
            boolean zM217354a = yu2.INSTANCE.m217354a();
            t1f t1fVar = this.engineBridge;
            if (zM217354a) {
                t1fVar.m188904b(info instanceof PortraitMatting.MattingMask ? (PortraitMatting.MattingMask) info : null);
                return;
            } else {
                t1fVar.m188906d(info instanceof SegmentationInfo ? (SegmentationInfo) info : null);
                return;
            }
        }
        if (i == 3) {
            this.engineBridge.m188907e(mmcvInfo, info instanceof StylizefaceInfo ? (StylizefaceInfo) info : null);
        } else if (i == 4) {
            this.engineBridge.m188905c(mmcvInfo, info instanceof CartoonfaceInfo ? (CartoonfaceInfo) info : null);
        } else {
            if (i != 5) {
                return;
            }
            this.engineBridge.m188903a(info instanceof BodyLandmarkPostInfo ? (BodyLandmarkPostInfo) info : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m143897s(DetectorType detectorType) {
        int i = C17896b.f118812a[detectorType.ordinal()];
        if (i == 1) {
            m143891l();
            return;
        }
        if (i == 2) {
            m143894p();
            return;
        }
        if (i == 3) {
            m143895q();
        } else if (i == 4) {
            m143893n();
        } else {
            if (i != 5) {
                return;
            }
            m143892m();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m143898c() {
        Iterator<Map.Entry<DetectorType, IProcessor<? extends Object>>> it = this.workingDetector.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
        }
        this.workingDetector.clear();
        Iterator<Map.Entry<DetectorType, IProcessor<? extends Object>>> it2 = this.freeingDetector.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().release();
        }
        this.freeingDetector.clear();
        this.detectorCounter.m101068g();
    }

    /* JADX INFO: renamed from: g */
    public final void m143899g(@NotNull DetectorType detector) {
        detector.getClass();
        this.detectorCounter.m101066c(detector);
    }

    /* JADX INFO: renamed from: k */
    public final void m143900k(float scaleFactor) {
        this.scaleFactor = scaleFactor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.STYLIZE_FACE_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessor = this.workingDetector.get(detectorType);
            iProcessor.getClass();
            ((StylizeFaceProcessor) iProcessor).setScaleFactor(scaleFactor);
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessor2 = this.freeingDetector.get(detectorType);
            iProcessor2.getClass();
            ((StylizeFaceProcessor) iProcessor2).setScaleFactor(scaleFactor);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m143901o(@NotNull DetectorType detector) {
        detector.getClass();
        this.detectorCounter.m101067d(detector);
    }

    @Override // p153l.suf
    public void setMMCVInfo(@Nullable omw mmcvInfo) {
        for (Map.Entry<DetectorType, IProcessor<? extends Object>> entry : this.workingDetector.entrySet()) {
            m143896r(mmcvInfo, entry.getKey(), entry.getValue().process(mmcvInfo));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m143902t(int beautyType) {
        this.faceProcessType = beautyType == 2 ? 0 : 1;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.ANIMOJI_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessor = this.workingDetector.get(detectorType);
            iProcessor.getClass();
            ((AnimojiProcessor) iProcessor).setFaceProcessType(this.faceProcessType);
        }
        if (this.freeingDetector.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessor2 = this.freeingDetector.get(detectorType);
            iProcessor2.getClass();
            ((AnimojiProcessor) iProcessor2).setFaceProcessType(this.faceProcessType);
        }
    }
}
