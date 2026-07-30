package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.immomo.medialog.LogLevel;
import com.immomo.medialog.thread.ThreadType;
import com.immomo.momomediaext.filter.FlipType;
import com.immomo.momomediaext.filter.beauty.BeautyFilterAdapter;
import com.immomo.momomediaext.filter.beauty.ByteDanceHelper;
import com.momo.mcamera.mask.FaceFilterPipeline;
import com.momo.mcamera.mask.LiveLightningEngineFilter;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MosaicFilter;
import com.momo.mcamera.mask.SoundInputFilter;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.StickerAdjustFilter;
import com.momo.mcamera.mask.StickerBlendFilter;
import com.momo.mcamera.mask.detect.DetectManager;
import com.momo.mcamera.mask.facewarp.BeautyFaceWarpFilter;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.mcamera.util.fft.AudioRecordThread;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momo.xeengine.lightningrender.StickerModel;
import com.momo.xeengine.script.XEScriptEngine;
import com.momo.xengine.XEngineLuaPatch;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class wmq extends FaceFilterPipeline implements ILightningRender.StickerListener, ByteDanceHelper.IFaceDetectCompleteListener, ByteDanceHelper.IBeautyErrorListener {

    /* JADX INFO: renamed from: b */
    private BeautyFilterAdapter f187094b;

    /* JADX INFO: renamed from: c */
    private LiveLightningEngineFilter f187095c;

    /* JADX INFO: renamed from: d */
    private StickerAdjustFilter f187096d;

    /* JADX INFO: renamed from: e */
    private aem f187097e;

    /* JADX INFO: renamed from: f */
    private BeautyFaceWarpFilter f187098f;

    /* JADX INFO: renamed from: g */
    private j3w f187099g;

    /* JADX INFO: renamed from: i */
    private aqi f187100i;

    /* JADX INFO: renamed from: j */
    private MosaicFilter f187101j;

    /* JADX INFO: renamed from: k */
    private qrl f187102k;

    /* JADX INFO: renamed from: l */
    private lrl f187103l;

    /* JADX INFO: renamed from: m */
    private nrl f187104m;

    /* JADX INFO: renamed from: n */
    private mrl f187105n;

    /* JADX INFO: renamed from: o */
    private u3m.InterfaceC20352a f187106o;

    /* JADX INFO: renamed from: p */
    private Context f187107p;

    /* JADX INFO: renamed from: q */
    protected pjw f187108q;

    /* JADX INFO: renamed from: r */
    private c23 f187109r;

    /* JADX INFO: renamed from: t */
    private oxd f187111t;

    /* JADX INFO: renamed from: u */
    private o0f f187112u;

    /* JADX INFO: renamed from: v */
    private AudioRecordThread f187113v;

    /* JADX INFO: renamed from: y */
    protected gw00 f187115y;

    /* JADX INFO: renamed from: a */
    private List<ts2> f187093a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: s */
    private int f187110s = 1;

    /* JADX INFO: renamed from: x */
    private r30 f187114x = null;

    /* JADX INFO: renamed from: z */
    private final Queue<Runnable> f187116z = new LinkedList();

    /* JADX INFO: renamed from: A */
    private boolean f187092A = false;

    /* JADX INFO: renamed from: l.wmq$a */
    public class RunnableC20894a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f187117a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f187118b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f187119c;

        public RunnableC20894a(int i, float f, float f2) {
            this.f187117a = i;
            this.f187118b = f;
            this.f187119c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            wmq.this.m204027e2(this.f187117a, this.f187118b, this.f187119c);
            if (!wmq.this.isByteDanceBeautyFilter() || wmq.this.f187098f == null) {
                return;
            }
            wmq wmqVar = wmq.this;
            if (wmqVar.f187108q != null) {
                wmqVar.f187098f.setScaleFactor(wmq.this.f187108q.f149883A);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$b */
    public class C20895b implements StickerAdjustFilter.StickerMaskFinishListener {
        public C20895b() {
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.StickerMaskFinishListener
        public void stickerRenderFinished(int i, Sticker sticker) {
            if (wmq.this.f187102k != null) {
                wmq.this.f187102k.mo138198a(i, sticker);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$c */
    public class C20896c implements StickerAdjustFilter.GestureDetectedListener {
        public C20896c() {
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.GestureDetectedListener
        public void gestureDetected(String str) {
            if (wmq.this.f187102k != null) {
                wmq.this.f187102k.gestureDetected(str);
            }
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.GestureDetectedListener
        public void onPreGestureAdded(String str) {
            if (wmq.this.f187102k != null) {
                wmq.this.f187102k.onPreGestureAdded(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$e */
    public class RunnableC20898e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f187124a;

        /* JADX INFO: renamed from: l.wmq$e$a */
        public class a implements u23.InterfaceC20340a {
            public a() {
            }
        }

        public RunnableC20898e(String str) {
            this.f187124a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u23.m191440a(this.f187124a, new a());
        }
    }

    /* JADX INFO: renamed from: l.wmq$f */
    public class RunnableC20899f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f187127a;

        public RunnableC20899f(String str) {
            this.f187127a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c != null) {
                wmq.this.f187095c.setLookup0Path(this.f187127a);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$g */
    public class RunnableC20900g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f187129a;

        public RunnableC20900g(float f) {
            this.f187129a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c != null) {
                wmq.this.f187095c.setLookup0Intensity(this.f187129a);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$h */
    public class RunnableC20901h implements Runnable {
        public RunnableC20901h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wmq.this.f187092A = true;
            eyx.m118802c().m118808g("JniEngineAdjustFilter", "engine init callback currentBeautyType === " + wmq.this.f187110s);
            wmq.this.f187095c.getXEDirector().getLogger().setLogEnable(true);
            LiveLightningEngineFilter liveLightningEngineFilter = wmq.this.f187095c;
            wmq wmqVar = wmq.this;
            liveLightningEngineFilter.setFaceWarpType(wmqVar.m204032j2(wmqVar.f187110s));
            wmq wmqVar2 = wmq.this;
            wmqVar2.m204028f2(wmqVar2.f187110s);
            if (wmq.this.f187095c.getLightningRender() != null && wmq.this.f187095c.getLightningRender().getMakeupLevel() != null) {
                wmq.this.f187095c.getLightningRender().getMakeupLevel().setEnable(wmq.this.f187110s == 3);
            }
            wmq.this.f187095c.enableBeautyFace((wmq.this.f187110s == 2 || wmq.this.f187110s == -1) ? false : true);
            Iterator it = wmq.this.f187116z.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (wmq.this.f187103l != null) {
                wmq.this.f187103l.mo19147b();
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$i */
    public class RunnableC20902i implements Runnable {
        public RunnableC20902i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c == null || wmq.this.f187095c.getLightningRender() == null) {
                return;
            }
            wmq.this.f187095c.getLightningRender().setCartoonFaceEnable(true);
        }
    }

    /* JADX INFO: renamed from: l.wmq$j */
    public class RunnableC20903j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f187133a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Sticker f187134b;

        public RunnableC20903j(MaskModel maskModel, Sticker sticker) {
            this.f187133a = maskModel;
            this.f187134b = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c != null) {
                wmq.this.f187095c.addEnginStickerModel(i3x.m134307c(this.f187133a, this.f187134b), wmq.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$k */
    public class RunnableC20904k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f187136a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Sticker f187137b;

        public RunnableC20904k(MaskModel maskModel, Sticker sticker) {
            this.f187136a = maskModel;
            this.f187137b = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c != null) {
                wmq.this.f187095c.addEnginStickerModel(i3x.m134308d(this.f187136a, this.f187137b), wmq.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$l */
    public class C20905l implements XEScriptEngine.XEScriptEngineRegister {
        public C20905l() {
        }

        @Override // com.momo.xeengine.script.XEScriptEngine.XEScriptEngineRegister
        public void register(long j) {
            XEngineLuaPatch.open(j);
        }
    }

    /* JADX INFO: renamed from: l.wmq$m */
    public class RunnableC20906m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f187140a;

        public RunnableC20906m(MaskModel maskModel) {
            this.f187140a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            wmq.this.f187096d.addMaskModel(this.f187140a);
        }
    }

    /* JADX INFO: renamed from: l.wmq$n */
    public class RunnableC20907n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f187142a;

        public RunnableC20907n(int i) {
            this.f187142a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c != null) {
                wmq.this.f187095c.clearEngineStickerModelWithBussineType(String.valueOf(this.f187142a));
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$o */
    public class RunnableC20908o implements Runnable {
        public RunnableC20908o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187095c == null || wmq.this.f187095c.getLightningRender() == null) {
                return;
            }
            wmq.this.f187095c.getLightningRender().setCartoonFaceEnable(false);
        }
    }

    /* JADX INFO: renamed from: l.wmq$p */
    public class RunnableC20909p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f187145a;

        public RunnableC20909p(String str) {
            this.f187145a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wmq.this.f187096d.removeSticker(this.f187145a);
        }
    }

    /* JADX INFO: renamed from: l.wmq$q */
    public class RunnableC20910q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f187147a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f187148b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f187149c;

        public RunnableC20910q(String str, String str2, float f) {
            this.f187147a = str;
            this.f187148b = str2;
            this.f187149c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187112u != null) {
                wmq.this.f187112u.m162144h(this.f187147a, this.f187148b, this.f187149c);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$r */
    public class RunnableC20911r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f187151a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f187152b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f187153c;

        public RunnableC20911r(String str, String str2, float f) {
            this.f187151a = str;
            this.f187152b = str2;
            this.f187153c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187112u != null) {
                wmq.this.f187112u.m162145i(this.f187151a, this.f187152b, this.f187153c);
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$s */
    public class RunnableC20912s implements Runnable {
        public RunnableC20912s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wmq.this.f187112u != null) {
                wmq.this.f187112u.m162143f();
            }
        }
    }

    public wmq(Context context, gw00 gw00Var, lrl lrlVar) {
        this.f187115y = gw00Var;
        this.f187103l = lrlVar;
        m204033k2(context);
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ orl m204019W1(wmq wmqVar) {
        wmqVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: d2 */
    private void m204026d2(MaskModel maskModel) {
        LiveLightningEngineFilter liveLightningEngineFilter;
        LiveLightningEngineFilter liveLightningEngineFilter2;
        MosaicFilter mosaicFilter;
        MosaicFilter mosaicFilter2;
        if (!maskModel.isForbidClone()) {
            maskModel = m204029g2(maskModel);
        }
        if (maskModel == null) {
            return;
        }
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.m166537c(maskModel.getAdditionalInfo());
        }
        if (maskModel.getAdditionalInfo() != null) {
            if (maskModel.getAdditionalInfo().isStylizeFaceEnable()) {
                mrl mrlVar = this.f187105n;
                if (mrlVar != null) {
                    mrlVar.mo132864a(true);
                }
                BeautyFilterAdapter beautyFilterAdapter = this.f187094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.enableDraw(false);
                }
            }
            if (maskModel.getAdditionalInfo().isCartoonFaceEnable()) {
                mrl mrlVar2 = this.f187105n;
                if (mrlVar2 != null) {
                    mrlVar2.mo132864a(true);
                }
                BeautyFilterAdapter beautyFilterAdapter2 = this.f187094b;
                if (beautyFilterAdapter2 != null) {
                    beautyFilterAdapter2.enableDraw(false);
                }
                m204031i2(new RunnableC20902i());
            }
            if (maskModel.getAdditionalInfo().isCoverMosaicWhenNoFace() && (mosaicFilter2 = this.f187101j) != null) {
                mosaicFilter2.setTileSize(2.0f);
            }
            if (maskModel.getAdditionalInfo().getMosaicTriggerAngle() != null && (mosaicFilter = this.f187101j) != null) {
                mosaicFilter.setMosaicTriggerAngle(maskModel.getAdditionalInfo().getMosaicTriggerAngle());
            }
            if (maskModel.getAdditionalInfo().getDetectAction() != null) {
                if (this.f187114x == null) {
                    r30 r30Var = new r30();
                    this.f187114x = r30Var;
                    r30Var.m177632e(dkw.m112277d(2));
                    this.f187114x.m177631d(dkw.m112277d(6));
                    this.f187114x.m177630c(dkw.m112277d(3));
                }
                this.f187114x.m177633f(maskModel.getAdditionalInfo().getDetectAction(), isByteDanceBeautyFilter());
            }
        }
        boolean z = false;
        for (int i = 0; i < maskModel.getStickers().size(); i++) {
            Sticker sticker = maskModel.getStickers().get(i);
            if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("3d") && (liveLightningEngineFilter2 = this.f187095c) != null) {
                if (liveLightningEngineFilter2.getXEDirector() != null && this.f187095c.getXEDirector().getLogger() != null) {
                    this.f187095c.getXEDirector().getLogger().setLogEnable(true);
                }
                if (maskModel.getXengineSearchPath() == null || maskModel.getXengineSearchPath().isEmpty()) {
                    if (sticker.getImagePreName() != null && !sticker.getImagePreName().isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(maskModel.getFolderPath());
                        String str = File.separator;
                        sb.append(str);
                        String string = sb.toString();
                        String str2 = maskModel.getFolderPath() + str + sticker.getImagePreName() + str;
                        this.f187095c.addLibraryPath(string);
                        this.f187095c.addLibraryPath(str2);
                        m204031i2(new RunnableC20904k(maskModel, sticker));
                        maskModel.getStickers().remove(sticker);
                    }
                    this.f187095c.setSegmentType(sticker.getSegmentType());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(maskModel.getXengineEsPath());
                    String str3 = File.separator;
                    sb2.append(str3);
                    sb2.append(maskModel.getXengineSearchPath());
                    sb2.append(str3);
                    String string2 = sb2.toString();
                    String str4 = maskModel.getXengineEsPath() + str3 + maskModel.getXengineSearchPath() + str3 + sticker.getImagePreName() + str3;
                    this.f187095c.addLibraryPath(string2);
                    this.f187095c.addLibraryPath(str4);
                    m204031i2(new RunnableC20903j(maskModel, sticker));
                    maskModel.getStickers().remove(sticker);
                }
                z = true;
                this.f187095c.setSegmentType(sticker.getSegmentType());
            }
        }
        if (z && (liveLightningEngineFilter = this.f187095c) != null && liveLightningEngineFilter.getLightningRender() != null && this.f187095c.getLightningRender().getScriptEngine() != null) {
            this.f187095c.getLightningRender().getScriptEngine().registerModule(new C20905l());
        }
        if (z && (maskModel.getStickers() == null || maskModel.getStickers().isEmpty())) {
            return;
        }
        m204035n2(new RunnableC20906m(maskModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m204027e2(int i, float f, float f2) {
        BeautyFaceWarpFilter beautyFaceWarpFilter = this.f187098f;
        if (beautyFaceWarpFilter != null) {
            if (i == 0) {
                beautyFaceWarpFilter.setEnableWarp(false);
                return;
            }
            beautyFaceWarpFilter.setEnableWarp(true);
            this.f187098f.setWarpType(i);
            this.f187098f.changeFaceBeautyValue(FaceBeautyID.THIN_FACE, f);
            this.f187098f.changeFaceBeautyValue(FaceBeautyID.BIG_EYE, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public void m204028f2(int i) {
        int i2 = 1;
        if (i != 0 && i != 1) {
            i2 = 2;
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setSkinSmoothVersion(i2);
            this.f187095c.setSkinWhiteVersion(i2);
        }
    }

    /* JADX INFO: renamed from: g2 */
    private MaskModel m204029g2(MaskModel maskModel) {
        return (MaskModel) new Gson().fromJson(new Gson().toJson(maskModel), MaskModel.class);
    }

    /* JADX INFO: renamed from: h2 */
    private void m204030h2() {
        DetectManager detectManager = DetectManager.getInstance();
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        detectManager.removeGestureDetectListener(liveLightningEngineFilter == null ? null : liveLightningEngineFilter.getEngineDispather());
        DetectManager.getInstance().stopGestureDetect();
        DetectManager.getInstance().removeObjectDetectListener(this.f187096d);
        DetectManager detectManager2 = DetectManager.getInstance();
        LiveLightningEngineFilter liveLightningEngineFilter2 = this.f187095c;
        detectManager2.removeGestureDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
        DetectManager.getInstance().stopObjectDetect();
    }

    /* JADX INFO: renamed from: i2 */
    private void m204031i2(Runnable runnable) {
        if (runnable == null || this.f187112u == null) {
            return;
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        if (liveLightningEngineFilter == null || liveLightningEngineFilter.getXEDirector() == null || this.f187095c.getXEDirector().getEventDispatcher() != null) {
            runnable.run();
        } else {
            this.f187116z.add(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public int m204032j2(int i) {
        return (i == 0 || i == 1) ? 10 : 104;
    }

    /* JADX INFO: renamed from: k2 */
    private void m204033k2(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f187107p = applicationContext;
        BeautyFilterAdapter beautyFilterAdapter = new BeautyFilterAdapter(applicationContext);
        this.f187094b = beautyFilterAdapter;
        beautyFilterAdapter.useCache = false;
        beautyFilterAdapter.setOnBeautyErrorListener(this);
        try {
            LiveLightningEngineFilter liveLightningEngineFilter = new LiveLightningEngineFilter(context, true, false);
            this.f187095c = liveLightningEngineFilter;
            liveLightningEngineFilter.useCache = false;
            liveLightningEngineFilter.setInitCallback(new RunnableC20901h());
        } catch (Exception e) {
            String message = e.getMessage();
            eyx.m118802c().m118806e("beauty", "momoengine_render", WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL, message, LogLevel.FATAL.value());
            lrl lrlVar = this.f187103l;
            if (lrlVar != null) {
                lrlVar.onBeautyError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL, message);
            }
            this.f187095c = null;
        }
        StickerAdjustFilter stickerAdjustFilter = new StickerAdjustFilter(this.f187107p);
        this.f187096d = stickerAdjustFilter;
        stickerAdjustFilter.useCache = false;
        BeautyFaceWarpFilter beautyFaceWarpFilter = new BeautyFaceWarpFilter();
        this.f187098f = beautyFaceWarpFilter;
        beautyFaceWarpFilter.useCache = false;
        aqi aqiVar = new aqi(FlipType.NONE.ordinal() - 1);
        this.f187100i = aqiVar;
        aqiVar.useCache = false;
        MosaicFilter mosaicFilter = new MosaicFilter();
        this.f187101j = mosaicFilter;
        mosaicFilter.useCache = false;
        mosaicFilter.setTileSize(0.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f187094b);
        LiveLightningEngineFilter liveLightningEngineFilter2 = this.f187095c;
        if (liveLightningEngineFilter2 != null) {
            arrayList.add(liveLightningEngineFilter2);
        }
        arrayList.add(this.f187098f);
        arrayList.add(this.f187096d);
        arrayList.add(this.f187100i);
        arrayList.add(this.f187101j);
        constructGroupFilter(arrayList);
        m204034l2();
        this.f187112u = new o0f(this.f187095c);
        LiveLightningEngineFilter liveLightningEngineFilter3 = this.f187095c;
        this.f187111t = new oxd(liveLightningEngineFilter3 != null ? liveLightningEngineFilter3.getLightningRender() : null);
    }

    /* JADX INFO: renamed from: l2 */
    private void m204034l2() {
        this.f187096d.setFinishListener(new C20895b());
        this.f187096d.setGestureDetectedListener(new C20896c());
        this.f187096d.setStickerStateChangeListener(new C20897d());
    }

    /* JADX INFO: renamed from: n2 */
    private void m204035n2(Runnable runnable) {
        gw00 gw00Var = this.f187115y;
        if (gw00Var == null || gw00Var.m128322J() == null) {
            runnable.run();
        } else {
            gw00 gw00Var2 = this.f187115y;
            gw00Var2.m128334W(runnable, gw00Var2.m128322J().m216279m());
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m204036r2(boolean z, String str) {
        if (z) {
            a800.m95324a(ThreadType.Normal, new RunnableC20898e(str));
            return;
        }
        j3w j3wVar = this.f187099g;
        if (j3wVar != null) {
            removeDstFilter(j3wVar);
            this.f187093a.add(this.f187099g);
            this.f187099g = null;
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m204037I1() {
        AudioRecordThread audioRecordThread;
        if (this.f187096d != null) {
            if (this.f187113v == null) {
                AudioRecordThread audioRecordThread2 = new AudioRecordThread(null, null, 1024);
                this.f187113v = audioRecordThread2;
                audioRecordThread2.start();
            }
            SoundInputFilter soundInputFilter = this.f187096d.mSoundInput;
            if (soundInputFilter == null || (audioRecordThread = this.f187113v) == null) {
                return;
            }
            audioRecordThread.setSoundInputFilter(soundInputFilter);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m204038X() {
        AudioRecordThread audioRecordThread = this.f187113v;
        if (audioRecordThread != null) {
            try {
                audioRecordThread.stopThread();
                this.f187113v = null;
            } catch (Exception e) {
                n8c.m158485c("JniEngineAdjustFilter", e.toString());
            }
        }
    }

    public boolean addGestureMaskModel(String str, MaskModel maskModel) {
        return this.f187096d.addGestureMaskModel(str, maskModel);
    }

    public void addMaskModel(MaskModel maskModel) {
        m204026d2(maskModel);
    }

    public void addSticker(Sticker sticker) {
        StickerAdjustFilter stickerAdjustFilter = this.f187096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.addSticker(sticker);
        }
    }

    public void changeFaceWarp(int i, float f, float f2) {
        m204035n2(new RunnableC20894a(i, f, f2));
    }

    public void clearMaskWithModelType(int i) {
        m204031i2(new RunnableC20907n(i));
        StickerAdjustFilter stickerAdjustFilter = this.f187096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.clearMaskWithModelType(i);
        }
        i3x.m134305a(String.valueOf(i));
        m204038X();
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        m204030h2();
        m204038X();
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.m166538d();
        }
        if (this.f187109r != null) {
            if (getFilters() != null) {
                getFilters().remove(this.f187109r);
            }
            this.f187109r.destroy();
            this.f187109r = null;
        }
        this.f187106o = null;
        this.f187092A = false;
    }

    @Override // p149l.mcj
    public int getTextOutID() {
        ts2 ts2Var = getTerminalFilters().get(0);
        if (ts2Var != null) {
            return ts2Var.getTextOutID();
        }
        return 0;
    }

    public boolean isByteDanceBeautyFilter() {
        return this.f187110s == 2;
    }

    /* JADX INFO: renamed from: m2 */
    public void m204039m2(MaskModel maskModel) {
        MosaicFilter mosaicFilter;
        for (Sticker sticker : maskModel.getStickers()) {
            if (sticker.getObjectTriggerType() != null && this.f187102k != null) {
                sticker.updateTriggerFlag(sticker.isUseHandGestureDetectNewVersion() ? 16 : 8);
                this.f187102k.mo138198a(1, sticker);
            }
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setAdditionalInfo(maskModel.getName(), null);
        }
        if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isCoverMosaicWhenNoFace() && (mosaicFilter = this.f187101j) != null) {
            mosaicFilter.setTileSize(0.0f);
        }
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.m166535a(maskModel.getAdditionalInfo());
        }
        if (maskModel.getAdditionalInfo() != null) {
            if (maskModel.getAdditionalInfo().isStylizeFaceEnable()) {
                BeautyFilterAdapter beautyFilterAdapter = this.f187094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.enableDraw(isByteDanceBeautyFilter());
                }
                mrl mrlVar = this.f187105n;
                if (mrlVar != null) {
                    mrlVar.mo132864a(!isByteDanceBeautyFilter());
                }
            }
            if (maskModel.getAdditionalInfo().isCartoonFaceEnable()) {
                BeautyFilterAdapter beautyFilterAdapter2 = this.f187094b;
                if (beautyFilterAdapter2 != null) {
                    beautyFilterAdapter2.enableDraw(isByteDanceBeautyFilter());
                }
                mrl mrlVar2 = this.f187105n;
                if (mrlVar2 != null) {
                    mrlVar2.mo132864a(!isByteDanceBeautyFilter());
                }
                m204031i2(new RunnableC20908o());
            }
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (getLockObject()) {
            try {
                super.newTextureReady(i, mcjVar, z);
                Iterator<ts2> it = this.f187093a.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f187093a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        xxx.m211572F().m211613h0(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    /* JADX INFO: renamed from: o2 */
    public void m204040o2(String str) {
        if (TextUtils.isEmpty(str) || thi.m188911a(str)) {
            if (isByteDanceBeautyFilter()) {
                BeautyFilterAdapter beautyFilterAdapter = this.f187094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.changeLookupFilter(str);
                    return;
                }
                return;
            }
            if (this.f187095c == null || str == null) {
                return;
            }
            m204031i2(new RunnableC20899f(str));
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.ByteDanceHelper.IBeautyErrorListener
    public void onBeautyError(int i, String str) {
        lrl lrlVar = this.f187103l;
        if (lrlVar != null) {
            lrlVar.onBeautyError(i, str);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.ByteDanceHelper.IFaceDetectCompleteListener
    public void onFaceDetectComplete(pjw pjwVar) {
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.setMMCVInfo(pjwVar);
        }
        int size = getFilters().size();
        for (int i = 0; i < size; i++) {
            if (getFilters().get(i) instanceof etf) {
                BeautyFaceWarpFilter beautyFaceWarpFilter = this.f187098f;
                if (beautyFaceWarpFilter != null && beautyFaceWarpFilter.isWarpFailed() && (getFilters().get(i) instanceof StickerAdjustFilter)) {
                    ((etf) getFilters().get(i)).setMMCVInfo(null);
                } else {
                    ((etf) getFilters().get(i)).setMMCVInfo(pjwVar);
                }
            }
        }
        DetectManager.getInstance().setMMCVInfo(pjwVar);
        nrl nrlVar = this.f187104m;
        if (nrlVar != null) {
            nrlVar.mo19146a(pjwVar);
        }
        r30 r30Var = this.f187114x;
        if (r30Var != null) {
            r30Var.setMMCVInfo(pjwVar);
        }
        MosaicFilter mosaicFilter = this.f187101j;
        if (mosaicFilter != null) {
            mosaicFilter.setMMCVInfo(pjwVar);
        }
        this.f187108q = pjwVar;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender.StickerListener
    public void onStickerCompleted(StickerModel stickerModel) {
        oxd oxdVar;
        MaskModel maskModelM134306b = i3x.m134306b(stickerModel);
        if (maskModelM134306b != null && (oxdVar = this.f187111t) != null) {
            oxdVar.m166535a(maskModelM134306b.getAdditionalInfo());
        }
        i3x.m134305a(stickerModel.getBusinessType());
    }

    /* JADX INFO: renamed from: p2 */
    public void m204041p2(mrl mrlVar) {
        this.f187105n = mrlVar;
    }

    /* JADX INFO: renamed from: q2 */
    public void m204042q2(nrl nrlVar) {
        this.f187104m = nrlVar;
    }

    public void releaseSoundPlayer() {
        StickerAdjustFilter stickerAdjustFilter = this.f187096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.releaseSoundPlayer();
        }
    }

    public boolean removeMakeupStyle(String str, String str2) {
        int i = this.f187110s;
        if (i == 2) {
            return this.f187094b.removeMakeupStyle(str, str2);
        }
        if (i != 3) {
            return false;
        }
        m204031i2(new RunnableC20912s());
        return true;
    }

    public void removeSticker(String str) {
        if (this.f187096d != null) {
            m204035n2(new RunnableC20909p(str));
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m204043s2() {
        if (fjx.m121638R().m121640A0()) {
            setDeblurEnable(true);
            boolean zM121711Y0 = fjx.m121638R().m121711Y0();
            float fM121646C0 = fjx.m121638R().m121646C0();
            boolean zM121708X0 = fjx.m121638R().m121708X0();
            float fM121643B0 = fjx.m121638R().m121643B0();
            boolean zM121705W0 = fjx.m121638R().m121705W0();
            float fM121806z0 = fjx.m121638R().m121806z0();
            if (!zM121711Y0) {
                fM121646C0 = 0.0f;
            }
            if (!zM121708X0) {
                fM121643B0 = 0.0f;
            }
            if (!zM121705W0) {
                fM121806z0 = 0.0f;
            }
            setDeblurParams(fM121646C0, fM121643B0, fM121806z0);
        } else {
            setDeblurEnable(false);
        }
        if (fjx.m121638R().m121696T0()) {
            m204036r2(true, fjx.m121638R().m121695T());
        } else {
            m204036r2(false, "");
        }
    }

    public void setDeblurEnable(boolean z) {
        ts2 ts2Var = this.f187097e;
        if (!z) {
            if (ts2Var != null) {
                removeDstFilter(ts2Var);
                this.f187093a.add(this.f187097e);
                this.f187097e = null;
                return;
            }
            return;
        }
        if (ts2Var == null) {
            aem aemVar = new aem();
            this.f187097e = aemVar;
            aemVar.useCache = false;
            addTerminalFilter(aemVar);
        }
    }

    public void setDeblurParams(float f, float f2, float f3) {
        aem aemVar = this.f187097e;
        if (aemVar != null) {
            aemVar.m96118R1(true);
            this.f187097e.m96120T1(f);
            this.f187097e.m96119S1(f2);
            this.f187097e.m96117Q1(f3);
        }
    }

    public void setEnableSound(boolean z) {
        this.f187096d.setEnableSound(z);
    }

    public void setLookupIntensity(float f) {
        if (f > 1.0f) {
            f /= 100.0f;
        }
        if (!isByteDanceBeautyFilter()) {
            m204031i2(new RunnableC20900g(f));
        } else if (this.f187094b != null) {
            this.f187094b.updateLookupFilterIntensity(f * fjx.m121638R().m121692S());
        }
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (this.f187094b != null && isByteDanceBeautyFilter() && this.f187094b.isEnableDraw()) {
            this.f187094b.setMMCVInfo(pjwVar);
        } else {
            onFaceDetectComplete(pjwVar);
        }
    }

    public void setWarpScaleFactor(float f) {
        BeautyFilterAdapter beautyFilterAdapter = this.f187094b;
        if (beautyFilterAdapter != null) {
            beautyFilterAdapter.changeWarpScaleFactor(f);
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setWarpScaleFactor(f);
        }
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.m166536b(f);
        }
    }

    public void startGestureDetect(boolean z, int i) {
        if (z) {
            DetectManager detectManager = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
            detectManager.registerGestureDetectListener(liveLightningEngineFilter != null ? liveLightningEngineFilter.getEngineDispather() : null);
            DetectManager.getInstance().setGestureModelPath(dkw.m112277d(7));
            DetectManager.getInstance().setHandGestureType(i);
            DetectManager.getInstance().startGestureDetect();
        } else {
            DetectManager.getInstance().registerObjectDetectListener(this.f187096d);
            DetectManager detectManager2 = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter2 = this.f187095c;
            detectManager2.registerObjectDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
            DetectManager.getInstance().setObjectModelPath(dkw.m112277d(2));
            DetectManager.getInstance().startObjectDetect();
            DetectManager.getInstance().setObjectDetectInterval(500);
        }
        n8c.m158483a("JniEngineAdjustFilter", "statGestureDetect " + z);
    }

    public void stopGestureDetect() {
        m204045u2(false);
        n8c.m158483a("JniEngineAdjustFilter", "stopGestureDetect");
    }

    /* JADX INFO: renamed from: t2 */
    public void m204044t2(qrl qrlVar) {
        this.f187102k = qrlVar;
    }

    /* JADX INFO: renamed from: u2 */
    public void m204045u2(boolean z) {
        if (z) {
            DetectManager detectManager = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
            detectManager.removeGestureDetectListener(liveLightningEngineFilter != null ? liveLightningEngineFilter.getEngineDispather() : null);
            DetectManager.getInstance().stopGestureDetect();
        } else {
            DetectManager.getInstance().removeObjectDetectListener(this.f187096d);
            DetectManager detectManager2 = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter2 = this.f187095c;
            detectManager2.removeObjectDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
            DetectManager.getInstance().stopObjectDetect();
        }
        n8c.m158483a("JniEngineAdjustFilter", "stopGestureDetect");
    }

    public boolean updateByteDanceFaceBeautyValue(String str, String str2, float f) {
        int i = this.f187110s;
        if (i == 2) {
            return this.f187094b.updateByteDanceFaceBeautyValue(str, str2, f);
        }
        if (i != 3) {
            return false;
        }
        m204031i2(new RunnableC20910q(str, str2, f));
        return true;
    }

    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        int i = this.f187110s;
        if (i == 2) {
            return this.f187094b.updateMakeupStyleValue(str, str2, f);
        }
        if (i != 3) {
            return false;
        }
        m204031i2(new RunnableC20911r(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: v2 */
    public void m204046v2(int i) {
        eyx.m118802c().m118808g("JniEngineAdjustFilter", "switchBeautyType beautyType === " + i);
        eyx.m118802c().m118808g("JniEngineAdjustFilter", "switchBeautyType isEngineInit === " + this.f187092A);
        this.f187110s = i;
        m204028f2(i);
        oxd oxdVar = this.f187111t;
        if (oxdVar != null) {
            oxdVar.m166539e(i);
        }
        BeautyFilterAdapter beautyFilterAdapter = this.f187094b;
        if (beautyFilterAdapter != null) {
            boolean z = i == 2;
            beautyFilterAdapter.forbidBeauty(false);
            this.f187094b.enableDraw(z);
            this.f187094b.switchBeauty(i);
            this.f187094b.setOnDetectCompleteListener(this);
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f187095c;
        if (liveLightningEngineFilter != null) {
            int i2 = this.f187110s;
            boolean z2 = (i2 == 2 || i2 == -1) ? false : true;
            liveLightningEngineFilter.setFaceWarpType(m204032j2(i));
            if (this.f187095c.getLightningRender() != null && this.f187095c.getLightningRender().getMakeupLevel() != null) {
                this.f187095c.getLightningRender().getMakeupLevel().setEnable(this.f187110s == 3);
            }
            this.f187095c.enableBeautyFace(z2);
            int i3 = this.f187110s;
            if ((i3 == 1 || i3 == 0) && this.f187095c.getXEDirector() != null && this.f187095c.getXEDirector().getMakeupLevel() != null && this.f187095c.getXEDirector().getMakeupLevel().isEffectActive()) {
                this.f187112u.m162143f();
            }
        }
    }

    /* JADX INFO: renamed from: l.wmq$d */
    public class C20897d implements StickerBlendFilter.StickerStateChangeListener {
        public C20897d() {
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void stickerGestureTypeChanged(String str, boolean z) {
            if (TextUtils.isEmpty(str) || !z) {
                return;
            }
            wmq.m204019W1(wmq.this);
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void stickerStateChanged(int i, int i2) {
            if (i <= 0 || i2 != 0) {
                return;
            }
            wmq.m204019W1(wmq.this);
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void faceDetected(boolean z) {
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void playStateChanged(int i, boolean z) {
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void distortionStateChanged(boolean z, float f, float f2, float f3, float f4) {
        }
    }

    public void startGestureDetect() {
        startGestureDetect(false, 0);
    }
}
