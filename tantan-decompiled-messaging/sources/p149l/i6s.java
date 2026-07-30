package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ+\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u0016\u00105\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R(\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00109R(\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109¨\u0006<"}, m87232d2 = {"Ll/i6s;", "Ll/etf;", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "lightningRender", "<init>", "(Lcom/momo/xeengine/lightningrender/ILightningRender;)V", "Lcom/immomo/momomediaext/filter/DetectorType;", "detectorType", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/immomo/momomediaext/filter/DetectorType;)V", "j", BLiveStormDanmakuGiftResourceType.f44444l, "()V", Constants.INAPP_DATA_TAG, "p", "h", "q", RXScreenCaptureService.KEY_INDEX, "n", "f", "m", "e", "Ll/pjw;", "mmcvInfo", "", BaseSei.INFO, "r", "(Ll/pjw;Lcom/immomo/momomediaext/filter/DetectorType;Ljava/lang/Object;)V", "detector", "o", "g", "", "beautyType", Constants.KEY_T, "(I)V", "", "scaleFactor", "k", "(F)V", "setMMCVInfo", "(Ll/pjw;)V", "c", "a", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "Ll/mxd;", "b", "Ll/mxd;", "detectorCounter", "Ll/p0f;", "Ll/p0f;", "engineBridge", "I", "faceProcessType", "F", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/momo/mcamera/liveprocessor/IProcessor;", "Ljava/util/concurrent/ConcurrentHashMap;", "workingDetector", "freeingDetector", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class i6s implements etf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ILightningRender lightningRender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final mxd detectorCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final p0f engineBridge;

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

    /* JADX INFO: renamed from: l.i6s$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/i6s$a", "Ll/nxd;", "Lcom/immomo/momomediaext/filter/DetectorType;", "detector", "", "a", "(Lcom/immomo/momomediaext/filter/DetectorType;)V", "b", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17495a implements nxd {
        public C17495a() {
        }

        @Override // p149l.nxd
        /* JADX INFO: renamed from: a */
        public void mo134663a(@NotNull DetectorType detector) {
            detector.getClass();
            i6s.this.m134657s(detector);
        }

        @Override // p149l.nxd
        /* JADX INFO: renamed from: b */
        public void mo134664b(@NotNull DetectorType detector) {
            detector.getClass();
            i6s.this.m134650j(detector);
        }
    }

    /* JADX INFO: renamed from: l.i6s$b */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C17496b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111779a;

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
            f111779a = iArr;
        }
    }

    public i6s(@Nullable ILightningRender iLightningRender) {
        this.lightningRender = iLightningRender;
        mxd mxdVar = new mxd();
        this.detectorCounter = mxdVar;
        this.engineBridge = new p0f(iLightningRender);
        this.faceProcessType = 1;
        this.scaleFactor = -1.0f;
        this.workingDetector = new ConcurrentHashMap<>();
        this.freeingDetector = new ConcurrentHashMap<>();
        mxdVar.m156881h(new C17495a());
    }

    /* JADX INFO: renamed from: d */
    private final void m134645d() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.ANIMOJI_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            this.freeingDetector.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m134646e() {
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
    private final void m134647f() {
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
    private final void m134648h() {
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.SEGMENT_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            IProcessor<? extends Object> iProcessorRemove = this.workingDetector.remove(detectorType);
            iProcessorRemove.getClass();
            this.freeingDetector.put(detectorType, iProcessorRemove);
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m134649i() {
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
    public final void m134650j(DetectorType detectorType) {
        int i = C17496b.f111779a[detectorType.ordinal()];
        if (i == 1) {
            m134645d();
            return;
        }
        if (i == 2) {
            m134648h();
            return;
        }
        if (i == 3) {
            m134649i();
        } else if (i == 4) {
            m134647f();
        } else {
            if (i != 5) {
                return;
            }
            m134646e();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m134651l() {
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
        String strM112277d = dkw.m112277d(8);
        strM112277d.getClass();
        arrayList.add(strM112277d);
        animojiProcessor.setModelPath(arrayList);
        ((AnimojiProcessor) animojiProcessor).setFaceProcessType(this.faceProcessType);
        this.workingDetector.put(detectorType, animojiProcessor);
    }

    /* JADX INFO: renamed from: m */
    private final void m134652m() {
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
        String strM112277d = dkw.m112277d(3);
        strM112277d.getClass();
        arrayList.add(strM112277d);
        bodyProcessor.setModelPath(arrayList);
        this.workingDetector.put(detectorType, bodyProcessor);
    }

    /* JADX INFO: renamed from: n */
    private final void m134653n() {
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
        String strM112277d = dkw.m112277d(22);
        strM112277d.getClass();
        arrayList.add(strM112277d);
        cartoonFaceProcessor.setModelPath(arrayList);
        this.workingDetector.put(detectorType, cartoonFaceProcessor);
    }

    /* JADX INFO: renamed from: p */
    private final void m134654p() {
        IProcessor<? extends Object> momoSegmentProcessor;
        IProcessor<? extends Object> byteDanceSegmentProcessor;
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap = this.workingDetector;
        DetectorType detectorType = DetectorType.SEGMENT_DETECTOR;
        if (concurrentHashMap.containsKey(detectorType)) {
            return;
        }
        boolean zM138351a = iu2.INSTANCE.m138351a();
        ConcurrentHashMap<DetectorType, IProcessor<? extends Object>> concurrentHashMap2 = this.freeingDetector;
        if (!zM138351a) {
            if (concurrentHashMap2.containsKey(detectorType)) {
                IProcessor<? extends Object> iProcessorRemove = this.freeingDetector.remove(detectorType);
                iProcessorRemove.getClass();
                iProcessorRemove.getClass();
                momoSegmentProcessor = iProcessorRemove;
            } else {
                momoSegmentProcessor = new MomoSegmentProcessor();
            }
            ArrayList arrayList = new ArrayList();
            String strM112277d = dkw.m112277d(4);
            strM112277d.getClass();
            arrayList.add(strM112277d);
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
        String strM112277d2 = dkw.m112277d(10);
        strM112277d2.getClass();
        arrayList2.add(strM112277d2);
        String strM112277d3 = dkw.m112277d(9);
        strM112277d3.getClass();
        arrayList2.add(strM112277d3);
        byteDanceSegmentProcessor.setModelPath(arrayList2);
        this.workingDetector.put(detectorType, byteDanceSegmentProcessor);
    }

    /* JADX INFO: renamed from: q */
    private final void m134655q() {
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
        String strM112277d = dkw.m112277d(21);
        strM112277d.getClass();
        arrayList.add(strM112277d);
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
    private final void m134656r(pjw mmcvInfo, DetectorType detectorType, Object info) {
        int i = C17496b.f111779a[detectorType.ordinal()];
        if (i == 1) {
            if (mmcvInfo != null) {
                mmcvInfo.m169938D(info instanceof qtf ? (qtf) info : null);
                return;
            }
            return;
        }
        if (i == 2) {
            boolean zM138351a = iu2.INSTANCE.m138351a();
            p0f p0fVar = this.engineBridge;
            if (zM138351a) {
                p0fVar.m166984b(info instanceof PortraitMatting.MattingMask ? (PortraitMatting.MattingMask) info : null);
                return;
            } else {
                p0fVar.m166986d(info instanceof SegmentationInfo ? (SegmentationInfo) info : null);
                return;
            }
        }
        if (i == 3) {
            this.engineBridge.m166987e(mmcvInfo, info instanceof StylizefaceInfo ? (StylizefaceInfo) info : null);
        } else if (i == 4) {
            this.engineBridge.m166985c(mmcvInfo, info instanceof CartoonfaceInfo ? (CartoonfaceInfo) info : null);
        } else {
            if (i != 5) {
                return;
            }
            this.engineBridge.m166983a(info instanceof BodyLandmarkPostInfo ? (BodyLandmarkPostInfo) info : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m134657s(DetectorType detectorType) {
        int i = C17496b.f111779a[detectorType.ordinal()];
        if (i == 1) {
            m134651l();
            return;
        }
        if (i == 2) {
            m134654p();
            return;
        }
        if (i == 3) {
            m134655q();
        } else if (i == 4) {
            m134653n();
        } else {
            if (i != 5) {
                return;
            }
            m134652m();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m134658c() {
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
        this.detectorCounter.m156880g();
    }

    /* JADX INFO: renamed from: g */
    public final void m134659g(@NotNull DetectorType detector) {
        detector.getClass();
        this.detectorCounter.m156878c(detector);
    }

    /* JADX INFO: renamed from: k */
    public final void m134660k(float scaleFactor) {
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
    public final void m134661o(@NotNull DetectorType detector) {
        detector.getClass();
        this.detectorCounter.m156879d(detector);
    }

    @Override // p149l.etf
    public void setMMCVInfo(@Nullable pjw mmcvInfo) {
        for (Map.Entry<DetectorType, IProcessor<? extends Object>> entry : this.workingDetector.entrySet()) {
            m134656r(mmcvInfo, entry.getKey(), entry.getValue().process(mmcvInfo));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m134662t(int beautyType) {
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
