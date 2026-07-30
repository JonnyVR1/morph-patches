package p153l;

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
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class voq extends FaceFilterPipeline implements ILightningRender.StickerListener, ByteDanceHelper.IFaceDetectCompleteListener, ByteDanceHelper.IBeautyErrorListener {

    /* JADX INFO: renamed from: b */
    private BeautyFilterAdapter f185094b;

    /* JADX INFO: renamed from: c */
    private LiveLightningEngineFilter f185095c;

    /* JADX INFO: renamed from: d */
    private StickerAdjustFilter f185096d;

    /* JADX INFO: renamed from: e */
    private qgm f185097e;

    /* JADX INFO: renamed from: f */
    private BeautyFaceWarpFilter f185098f;

    /* JADX INFO: renamed from: g */
    private h5w f185099g;

    /* JADX INFO: renamed from: i */
    private wsi f185100i;

    /* JADX INFO: renamed from: j */
    private MosaicFilter f185101j;

    /* JADX INFO: renamed from: k */
    private dul f185102k;

    /* JADX INFO: renamed from: l */
    private ytl f185103l;

    /* JADX INFO: renamed from: m */
    private aul f185104m;

    /* JADX INFO: renamed from: n */
    private ztl f185105n;

    /* JADX INFO: renamed from: o */
    private l6m.InterfaceC18358a f185106o;

    /* JADX INFO: renamed from: p */
    private Context f185107p;

    /* JADX INFO: renamed from: q */
    protected omw f185108q;

    /* JADX INFO: renamed from: r */
    private s23 f185109r;

    /* JADX INFO: renamed from: t */
    private czd f185111t;

    /* JADX INFO: renamed from: u */
    private s1f f185112u;

    /* JADX INFO: renamed from: v */
    private AudioRecordThread f185113v;

    /* JADX INFO: renamed from: y */
    protected o410 f185115y;

    /* JADX INFO: renamed from: a */
    private List<jt2> f185093a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: s */
    private int f185110s = 1;

    /* JADX INFO: renamed from: x */
    private l30 f185114x = null;

    /* JADX INFO: renamed from: z */
    private final Queue<Runnable> f185116z = new LinkedList();

    /* JADX INFO: renamed from: A */
    private boolean f185092A = false;

    /* JADX INFO: renamed from: l.voq$a */
    public class RunnableC20876a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f185117a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f185118b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f185119c;

        public RunnableC20876a(int i, float f, float f2) {
            this.f185117a = i;
            this.f185118b = f;
            this.f185119c = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            voq.this.m202149e2(this.f185117a, this.f185118b, this.f185119c);
            if (!voq.this.isByteDanceBeautyFilter() || voq.this.f185098f == null) {
                return;
            }
            voq voqVar = voq.this;
            if (voqVar.f185108q != null) {
                voqVar.f185098f.setScaleFactor(voq.this.f185108q.f148003A);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$b */
    public class C20877b implements StickerAdjustFilter.StickerMaskFinishListener {
        public C20877b() {
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.StickerMaskFinishListener
        public void stickerRenderFinished(int i, Sticker sticker) {
            if (voq.this.f185102k != null) {
                voq.this.f185102k.mo118162a(i, sticker);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$c */
    public class C20878c implements StickerAdjustFilter.GestureDetectedListener {
        public C20878c() {
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.GestureDetectedListener
        public void gestureDetected(String str) {
            if (voq.this.f185102k != null) {
                voq.this.f185102k.gestureDetected(str);
            }
        }

        @Override // com.momo.mcamera.mask.StickerAdjustFilter.GestureDetectedListener
        public void onPreGestureAdded(String str) {
            if (voq.this.f185102k != null) {
                voq.this.f185102k.onPreGestureAdded(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$e */
    public class RunnableC20880e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f185124a;

        /* JADX INFO: renamed from: l.voq$e$a */
        public class a implements k33.InterfaceC18079a {
            public a() {
            }
        }

        public RunnableC20880e(String str) {
            this.f185124a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k33.m147996a(this.f185124a, new a());
        }
    }

    /* JADX INFO: renamed from: l.voq$f */
    public class RunnableC20881f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f185127a;

        public RunnableC20881f(String str) {
            this.f185127a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c != null) {
                voq.this.f185095c.setLookup0Path(this.f185127a);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$g */
    public class RunnableC20882g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f185129a;

        public RunnableC20882g(float f) {
            this.f185129a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c != null) {
                voq.this.f185095c.setLookup0Intensity(this.f185129a);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$h */
    public class RunnableC20883h implements Runnable {
        public RunnableC20883h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            voq.this.f185092A = true;
            b7y.m102882c().m102888g("JniEngineAdjustFilter", "engine init callback currentBeautyType === " + voq.this.f185110s);
            voq.this.f185095c.getXEDirector().getLogger().setLogEnable(true);
            LiveLightningEngineFilter liveLightningEngineFilter = voq.this.f185095c;
            voq voqVar = voq.this;
            liveLightningEngineFilter.setFaceWarpType(voqVar.m202154j2(voqVar.f185110s));
            voq voqVar2 = voq.this;
            voqVar2.m202150f2(voqVar2.f185110s);
            if (voq.this.f185095c.getLightningRender() != null && voq.this.f185095c.getLightningRender().getMakeupLevel() != null) {
                voq.this.f185095c.getLightningRender().getMakeupLevel().setEnable(voq.this.f185110s == 3);
            }
            voq.this.f185095c.enableBeautyFace((voq.this.f185110s == 2 || voq.this.f185110s == -1) ? false : true);
            Iterator it = voq.this.f185116z.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (voq.this.f185103l != null) {
                voq.this.f185103l.mo20127b();
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$i */
    public class RunnableC20884i implements Runnable {
        public RunnableC20884i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c == null || voq.this.f185095c.getLightningRender() == null) {
                return;
            }
            voq.this.f185095c.getLightningRender().setCartoonFaceEnable(true);
        }
    }

    /* JADX INFO: renamed from: l.voq$j */
    public class RunnableC20885j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f185133a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Sticker f185134b;

        public RunnableC20885j(MaskModel maskModel, Sticker sticker) {
            this.f185133a = maskModel;
            this.f185134b = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c != null) {
                voq.this.f185095c.addEnginStickerModel(h6x.m133753c(this.f185133a, this.f185134b), voq.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$k */
    public class RunnableC20886k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f185136a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Sticker f185137b;

        public RunnableC20886k(MaskModel maskModel, Sticker sticker) {
            this.f185136a = maskModel;
            this.f185137b = sticker;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c != null) {
                voq.this.f185095c.addEnginStickerModel(h6x.m133754d(this.f185136a, this.f185137b), voq.this);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$l */
    public class C20887l implements XEScriptEngine.XEScriptEngineRegister {
        public C20887l() {
        }

        @Override // com.momo.xeengine.script.XEScriptEngine.XEScriptEngineRegister
        public void register(long j) {
            XEngineLuaPatch.open(j);
        }
    }

    /* JADX INFO: renamed from: l.voq$m */
    public class RunnableC20888m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaskModel f185140a;

        public RunnableC20888m(MaskModel maskModel) {
            this.f185140a = maskModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            voq.this.f185096d.addMaskModel(this.f185140a);
        }
    }

    /* JADX INFO: renamed from: l.voq$n */
    public class RunnableC20889n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f185142a;

        public RunnableC20889n(int i) {
            this.f185142a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c != null) {
                voq.this.f185095c.clearEngineStickerModelWithBussineType(String.valueOf(this.f185142a));
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$o */
    public class RunnableC20890o implements Runnable {
        public RunnableC20890o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185095c == null || voq.this.f185095c.getLightningRender() == null) {
                return;
            }
            voq.this.f185095c.getLightningRender().setCartoonFaceEnable(false);
        }
    }

    /* JADX INFO: renamed from: l.voq$p */
    public class RunnableC20891p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f185145a;

        public RunnableC20891p(String str) {
            this.f185145a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            voq.this.f185096d.removeSticker(this.f185145a);
        }
    }

    /* JADX INFO: renamed from: l.voq$q */
    public class RunnableC20892q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f185147a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f185148b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f185149c;

        public RunnableC20892q(String str, String str2, float f) {
            this.f185147a = str;
            this.f185148b = str2;
            this.f185149c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185112u != null) {
                voq.this.f185112u.m184041h(this.f185147a, this.f185148b, this.f185149c);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$r */
    public class RunnableC20893r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f185151a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f185152b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f185153c;

        public RunnableC20893r(String str, String str2, float f) {
            this.f185151a = str;
            this.f185152b = str2;
            this.f185153c = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185112u != null) {
                voq.this.f185112u.m184042i(this.f185151a, this.f185152b, this.f185153c);
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$s */
    public class RunnableC20894s implements Runnable {
        public RunnableC20894s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (voq.this.f185112u != null) {
                voq.this.f185112u.m184040f();
            }
        }
    }

    public voq(Context context, o410 o410Var, ytl ytlVar) {
        this.f185115y = o410Var;
        this.f185103l = ytlVar;
        m202155k2(context);
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ bul m202141W1(voq voqVar) {
        voqVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: d2 */
    private void m202148d2(MaskModel maskModel) {
        LiveLightningEngineFilter liveLightningEngineFilter;
        LiveLightningEngineFilter liveLightningEngineFilter2;
        MosaicFilter mosaicFilter;
        MosaicFilter mosaicFilter2;
        if (!maskModel.isForbidClone()) {
            maskModel = m202151g2(maskModel);
        }
        if (maskModel == null) {
            return;
        }
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.m113321c(maskModel.getAdditionalInfo());
        }
        if (maskModel.getAdditionalInfo() != null) {
            if (maskModel.getAdditionalInfo().isStylizeFaceEnable()) {
                ztl ztlVar = this.f185105n;
                if (ztlVar != null) {
                    ztlVar.mo202787a(true);
                }
                BeautyFilterAdapter beautyFilterAdapter = this.f185094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.enableDraw(false);
                }
            }
            if (maskModel.getAdditionalInfo().isCartoonFaceEnable()) {
                ztl ztlVar2 = this.f185105n;
                if (ztlVar2 != null) {
                    ztlVar2.mo202787a(true);
                }
                BeautyFilterAdapter beautyFilterAdapter2 = this.f185094b;
                if (beautyFilterAdapter2 != null) {
                    beautyFilterAdapter2.enableDraw(false);
                }
                m202153i2(new RunnableC20884i());
            }
            if (maskModel.getAdditionalInfo().isCoverMosaicWhenNoFace() && (mosaicFilter2 = this.f185101j) != null) {
                mosaicFilter2.setTileSize(2.0f);
            }
            if (maskModel.getAdditionalInfo().getMosaicTriggerAngle() != null && (mosaicFilter = this.f185101j) != null) {
                mosaicFilter.setMosaicTriggerAngle(maskModel.getAdditionalInfo().getMosaicTriggerAngle());
            }
            if (maskModel.getAdditionalInfo().getDetectAction() != null) {
                if (this.f185114x == null) {
                    l30 l30Var = new l30();
                    this.f185114x = l30Var;
                    l30Var.m152661e(cnw.m111545d(2));
                    this.f185114x.m152660d(cnw.m111545d(6));
                    this.f185114x.m152659c(cnw.m111545d(3));
                }
                this.f185114x.m152662f(maskModel.getAdditionalInfo().getDetectAction(), isByteDanceBeautyFilter());
            }
        }
        boolean z = false;
        for (int i = 0; i < maskModel.getStickers().size(); i++) {
            Sticker sticker = maskModel.getStickers().get(i);
            if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("3d") && (liveLightningEngineFilter2 = this.f185095c) != null) {
                if (liveLightningEngineFilter2.getXEDirector() != null && this.f185095c.getXEDirector().getLogger() != null) {
                    this.f185095c.getXEDirector().getLogger().setLogEnable(true);
                }
                if (maskModel.getXengineSearchPath() == null || maskModel.getXengineSearchPath().isEmpty()) {
                    if (sticker.getImagePreName() != null && !sticker.getImagePreName().isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(maskModel.getFolderPath());
                        String str = File.separator;
                        sb.append(str);
                        String string = sb.toString();
                        String str2 = maskModel.getFolderPath() + str + sticker.getImagePreName() + str;
                        this.f185095c.addLibraryPath(string);
                        this.f185095c.addLibraryPath(str2);
                        m202153i2(new RunnableC20886k(maskModel, sticker));
                        maskModel.getStickers().remove(sticker);
                    }
                    this.f185095c.setSegmentType(sticker.getSegmentType());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(maskModel.getXengineEsPath());
                    String str3 = File.separator;
                    sb2.append(str3);
                    sb2.append(maskModel.getXengineSearchPath());
                    sb2.append(str3);
                    String string2 = sb2.toString();
                    String str4 = maskModel.getXengineEsPath() + str3 + maskModel.getXengineSearchPath() + str3 + sticker.getImagePreName() + str3;
                    this.f185095c.addLibraryPath(string2);
                    this.f185095c.addLibraryPath(str4);
                    m202153i2(new RunnableC20885j(maskModel, sticker));
                    maskModel.getStickers().remove(sticker);
                }
                z = true;
                this.f185095c.setSegmentType(sticker.getSegmentType());
            }
        }
        if (z && (liveLightningEngineFilter = this.f185095c) != null && liveLightningEngineFilter.getLightningRender() != null && this.f185095c.getLightningRender().getScriptEngine() != null) {
            this.f185095c.getLightningRender().getScriptEngine().registerModule(new C20887l());
        }
        if (z && (maskModel.getStickers() == null || maskModel.getStickers().isEmpty())) {
            return;
        }
        m202157n2(new RunnableC20888m(maskModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m202149e2(int i, float f, float f2) {
        BeautyFaceWarpFilter beautyFaceWarpFilter = this.f185098f;
        if (beautyFaceWarpFilter != null) {
            if (i == 0) {
                beautyFaceWarpFilter.setEnableWarp(false);
                return;
            }
            beautyFaceWarpFilter.setEnableWarp(true);
            this.f185098f.setWarpType(i);
            this.f185098f.changeFaceBeautyValue(FaceBeautyID.THIN_FACE, f);
            this.f185098f.changeFaceBeautyValue(FaceBeautyID.BIG_EYE, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public void m202150f2(int i) {
        int i2 = 1;
        if (i != 0 && i != 1) {
            i2 = 2;
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setSkinSmoothVersion(i2);
            this.f185095c.setSkinWhiteVersion(i2);
        }
    }

    /* JADX INFO: renamed from: g2 */
    private MaskModel m202151g2(MaskModel maskModel) {
        return (MaskModel) new Gson().fromJson(new Gson().toJson(maskModel), MaskModel.class);
    }

    /* JADX INFO: renamed from: h2 */
    private void m202152h2() {
        DetectManager detectManager = DetectManager.getInstance();
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        detectManager.removeGestureDetectListener(liveLightningEngineFilter == null ? null : liveLightningEngineFilter.getEngineDispather());
        DetectManager.getInstance().stopGestureDetect();
        DetectManager.getInstance().removeObjectDetectListener(this.f185096d);
        DetectManager detectManager2 = DetectManager.getInstance();
        LiveLightningEngineFilter liveLightningEngineFilter2 = this.f185095c;
        detectManager2.removeGestureDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
        DetectManager.getInstance().stopObjectDetect();
    }

    /* JADX INFO: renamed from: i2 */
    private void m202153i2(Runnable runnable) {
        if (runnable == null || this.f185112u == null) {
            return;
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        if (liveLightningEngineFilter == null || liveLightningEngineFilter.getXEDirector() == null || this.f185095c.getXEDirector().getEventDispatcher() != null) {
            runnable.run();
        } else {
            this.f185116z.add(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public int m202154j2(int i) {
        return (i == 0 || i == 1) ? 10 : 104;
    }

    /* JADX INFO: renamed from: k2 */
    private void m202155k2(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f185107p = applicationContext;
        BeautyFilterAdapter beautyFilterAdapter = new BeautyFilterAdapter(applicationContext);
        this.f185094b = beautyFilterAdapter;
        beautyFilterAdapter.useCache = false;
        beautyFilterAdapter.setOnBeautyErrorListener(this);
        try {
            LiveLightningEngineFilter liveLightningEngineFilter = new LiveLightningEngineFilter(context, true, false);
            this.f185095c = liveLightningEngineFilter;
            liveLightningEngineFilter.useCache = false;
            liveLightningEngineFilter.setInitCallback(new RunnableC20883h());
        } catch (Exception e) {
            String message = e.getMessage();
            b7y.m102882c().m102886e("beauty", "momoengine_render", WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL, message, LogLevel.FATAL.value());
            ytl ytlVar = this.f185103l;
            if (ytlVar != null) {
                ytlVar.onBeautyError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL, message);
            }
            this.f185095c = null;
        }
        StickerAdjustFilter stickerAdjustFilter = new StickerAdjustFilter(this.f185107p);
        this.f185096d = stickerAdjustFilter;
        stickerAdjustFilter.useCache = false;
        BeautyFaceWarpFilter beautyFaceWarpFilter = new BeautyFaceWarpFilter();
        this.f185098f = beautyFaceWarpFilter;
        beautyFaceWarpFilter.useCache = false;
        wsi wsiVar = new wsi(FlipType.NONE.ordinal() - 1);
        this.f185100i = wsiVar;
        wsiVar.useCache = false;
        MosaicFilter mosaicFilter = new MosaicFilter();
        this.f185101j = mosaicFilter;
        mosaicFilter.useCache = false;
        mosaicFilter.setTileSize(0.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f185094b);
        LiveLightningEngineFilter liveLightningEngineFilter2 = this.f185095c;
        if (liveLightningEngineFilter2 != null) {
            arrayList.add(liveLightningEngineFilter2);
        }
        arrayList.add(this.f185098f);
        arrayList.add(this.f185096d);
        arrayList.add(this.f185100i);
        arrayList.add(this.f185101j);
        constructGroupFilter(arrayList);
        m202156l2();
        this.f185112u = new s1f(this.f185095c);
        LiveLightningEngineFilter liveLightningEngineFilter3 = this.f185095c;
        this.f185111t = new czd(liveLightningEngineFilter3 != null ? liveLightningEngineFilter3.getLightningRender() : null);
    }

    /* JADX INFO: renamed from: l2 */
    private void m202156l2() {
        this.f185096d.setFinishListener(new C20877b());
        this.f185096d.setGestureDetectedListener(new C20878c());
        this.f185096d.setStickerStateChangeListener(new C20879d());
    }

    /* JADX INFO: renamed from: n2 */
    private void m202157n2(Runnable runnable) {
        o410 o410Var = this.f185115y;
        if (o410Var == null || o410Var.m165929J() == null) {
            runnable.run();
        } else {
            o410 o410Var2 = this.f185115y;
            o410Var2.m165941W(runnable, o410Var2.m165929J().m128994m());
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m202158r2(boolean z, String str) {
        if (z) {
            jg00.m144744a(ThreadType.Normal, new RunnableC20880e(str));
            return;
        }
        h5w h5wVar = this.f185099g;
        if (h5wVar != null) {
            removeDstFilter(h5wVar);
            this.f185093a.add(this.f185099g);
            this.f185099g = null;
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m202159I1() {
        AudioRecordThread audioRecordThread;
        if (this.f185096d != null) {
            if (this.f185113v == null) {
                AudioRecordThread audioRecordThread2 = new AudioRecordThread(null, null, 1024);
                this.f185113v = audioRecordThread2;
                audioRecordThread2.start();
            }
            SoundInputFilter soundInputFilter = this.f185096d.mSoundInput;
            if (soundInputFilter == null || (audioRecordThread = this.f185113v) == null) {
                return;
            }
            audioRecordThread.setSoundInputFilter(soundInputFilter);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m202160X() {
        AudioRecordThread audioRecordThread = this.f185113v;
        if (audioRecordThread != null) {
            try {
                audioRecordThread.stopThread();
                this.f185113v = null;
            } catch (Exception e) {
                t9c.m189745c("JniEngineAdjustFilter", e.toString());
            }
        }
    }

    public boolean addGestureMaskModel(String str, MaskModel maskModel) {
        return this.f185096d.addGestureMaskModel(str, maskModel);
    }

    public void addMaskModel(MaskModel maskModel) {
        m202148d2(maskModel);
    }

    public void addSticker(Sticker sticker) {
        StickerAdjustFilter stickerAdjustFilter = this.f185096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.addSticker(sticker);
        }
    }

    public void changeFaceWarp(int i, float f, float f2) {
        m202157n2(new RunnableC20876a(i, f, f2));
    }

    public void clearMaskWithModelType(int i) {
        m202153i2(new RunnableC20889n(i));
        StickerAdjustFilter stickerAdjustFilter = this.f185096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.clearMaskWithModelType(i);
        }
        h6x.m133751a(String.valueOf(i));
        m202160X();
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        m202152h2();
        m202160X();
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.m113322d();
        }
        if (this.f185109r != null) {
            if (getFilters() != null) {
                getFilters().remove(this.f185109r);
            }
            this.f185109r.destroy();
            this.f185109r = null;
        }
        this.f185106o = null;
        this.f185092A = false;
    }

    @Override // p153l.gfj
    public int getTextOutID() {
        jt2 jt2Var = getTerminalFilters().get(0);
        if (jt2Var != null) {
            return jt2Var.getTextOutID();
        }
        return 0;
    }

    public boolean isByteDanceBeautyFilter() {
        return this.f185110s == 2;
    }

    /* JADX INFO: renamed from: m2 */
    public void m202161m2(MaskModel maskModel) {
        MosaicFilter mosaicFilter;
        for (Sticker sticker : maskModel.getStickers()) {
            if (sticker.getObjectTriggerType() != null && this.f185102k != null) {
                sticker.updateTriggerFlag(sticker.isUseHandGestureDetectNewVersion() ? 16 : 8);
                this.f185102k.mo118162a(1, sticker);
            }
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setAdditionalInfo(maskModel.getName(), null);
        }
        if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isCoverMosaicWhenNoFace() && (mosaicFilter = this.f185101j) != null) {
            mosaicFilter.setTileSize(0.0f);
        }
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.m113319a(maskModel.getAdditionalInfo());
        }
        if (maskModel.getAdditionalInfo() != null) {
            if (maskModel.getAdditionalInfo().isStylizeFaceEnable()) {
                BeautyFilterAdapter beautyFilterAdapter = this.f185094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.enableDraw(isByteDanceBeautyFilter());
                }
                ztl ztlVar = this.f185105n;
                if (ztlVar != null) {
                    ztlVar.mo202787a(!isByteDanceBeautyFilter());
                }
            }
            if (maskModel.getAdditionalInfo().isCartoonFaceEnable()) {
                BeautyFilterAdapter beautyFilterAdapter2 = this.f185094b;
                if (beautyFilterAdapter2 != null) {
                    beautyFilterAdapter2.enableDraw(isByteDanceBeautyFilter());
                }
                ztl ztlVar2 = this.f185105n;
                if (ztlVar2 != null) {
                    ztlVar2.mo202787a(!isByteDanceBeautyFilter());
                }
                m202153i2(new RunnableC20890o());
            }
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (getLockObject()) {
            try {
                super.newTextureReady(i, gfjVar, z);
                Iterator<jt2> it = this.f185093a.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f185093a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        u6y.m194722F().m194763h0(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    /* JADX INFO: renamed from: o2 */
    public void m202162o2(String str) {
        if (TextUtils.isEmpty(str) || qki.m176952a(str)) {
            if (isByteDanceBeautyFilter()) {
                BeautyFilterAdapter beautyFilterAdapter = this.f185094b;
                if (beautyFilterAdapter != null) {
                    beautyFilterAdapter.changeLookupFilter(str);
                    return;
                }
                return;
            }
            if (this.f185095c == null || str == null) {
                return;
            }
            m202153i2(new RunnableC20881f(str));
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.ByteDanceHelper.IBeautyErrorListener
    public void onBeautyError(int i, String str) {
        ytl ytlVar = this.f185103l;
        if (ytlVar != null) {
            ytlVar.onBeautyError(i, str);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.ByteDanceHelper.IFaceDetectCompleteListener
    public void onFaceDetectComplete(omw omwVar) {
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.setMMCVInfo(omwVar);
        }
        int size = getFilters().size();
        for (int i = 0; i < size; i++) {
            if (getFilters().get(i) instanceof suf) {
                BeautyFaceWarpFilter beautyFaceWarpFilter = this.f185098f;
                if (beautyFaceWarpFilter != null && beautyFaceWarpFilter.isWarpFailed() && (getFilters().get(i) instanceof StickerAdjustFilter)) {
                    ((suf) getFilters().get(i)).setMMCVInfo(null);
                } else {
                    ((suf) getFilters().get(i)).setMMCVInfo(omwVar);
                }
            }
        }
        DetectManager.getInstance().setMMCVInfo(omwVar);
        aul aulVar = this.f185104m;
        if (aulVar != null) {
            aulVar.mo20126a(omwVar);
        }
        l30 l30Var = this.f185114x;
        if (l30Var != null) {
            l30Var.setMMCVInfo(omwVar);
        }
        MosaicFilter mosaicFilter = this.f185101j;
        if (mosaicFilter != null) {
            mosaicFilter.setMMCVInfo(omwVar);
        }
        this.f185108q = omwVar;
    }

    @Override // com.momo.xeengine.lightningrender.ILightningRender.StickerListener
    public void onStickerCompleted(StickerModel stickerModel) {
        czd czdVar;
        MaskModel maskModelM133752b = h6x.m133752b(stickerModel);
        if (maskModelM133752b != null && (czdVar = this.f185111t) != null) {
            czdVar.m113319a(maskModelM133752b.getAdditionalInfo());
        }
        h6x.m133751a(stickerModel.getBusinessType());
    }

    /* JADX INFO: renamed from: p2 */
    public void m202163p2(ztl ztlVar) {
        this.f185105n = ztlVar;
    }

    /* JADX INFO: renamed from: q2 */
    public void m202164q2(aul aulVar) {
        this.f185104m = aulVar;
    }

    public void releaseSoundPlayer() {
        StickerAdjustFilter stickerAdjustFilter = this.f185096d;
        if (stickerAdjustFilter != null) {
            stickerAdjustFilter.releaseSoundPlayer();
        }
    }

    public boolean removeMakeupStyle(String str, String str2) {
        int i = this.f185110s;
        if (i == 2) {
            return this.f185094b.removeMakeupStyle(str, str2);
        }
        if (i != 3) {
            return false;
        }
        m202153i2(new RunnableC20894s());
        return true;
    }

    public void removeSticker(String str) {
        if (this.f185096d != null) {
            m202157n2(new RunnableC20891p(str));
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m202165s2() {
        if (csx.m112235R().m112237A0()) {
            setDeblurEnable(true);
            boolean zM112308Y0 = csx.m112235R().m112308Y0();
            float fM112243C0 = csx.m112235R().m112243C0();
            boolean zM112305X0 = csx.m112235R().m112305X0();
            float fM112240B0 = csx.m112235R().m112240B0();
            boolean zM112302W0 = csx.m112235R().m112302W0();
            float fM112403z0 = csx.m112235R().m112403z0();
            if (!zM112308Y0) {
                fM112243C0 = 0.0f;
            }
            if (!zM112305X0) {
                fM112240B0 = 0.0f;
            }
            if (!zM112302W0) {
                fM112403z0 = 0.0f;
            }
            setDeblurParams(fM112243C0, fM112240B0, fM112403z0);
        } else {
            setDeblurEnable(false);
        }
        if (csx.m112235R().m112293T0()) {
            m202158r2(true, csx.m112235R().m112292T());
        } else {
            m202158r2(false, "");
        }
    }

    public void setDeblurEnable(boolean z) {
        jt2 jt2Var = this.f185097e;
        if (!z) {
            if (jt2Var != null) {
                removeDstFilter(jt2Var);
                this.f185093a.add(this.f185097e);
                this.f185097e = null;
                return;
            }
            return;
        }
        if (jt2Var == null) {
            qgm qgmVar = new qgm();
            this.f185097e = qgmVar;
            qgmVar.useCache = false;
            addTerminalFilter(qgmVar);
        }
    }

    public void setDeblurParams(float f, float f2, float f3) {
        qgm qgmVar = this.f185097e;
        if (qgmVar != null) {
            qgmVar.m176499R1(true);
            this.f185097e.m176501T1(f);
            this.f185097e.m176500S1(f2);
            this.f185097e.m176498Q1(f3);
        }
    }

    public void setEnableSound(boolean z) {
        this.f185096d.setEnableSound(z);
    }

    public void setLookupIntensity(float f) {
        if (f > 1.0f) {
            f /= 100.0f;
        }
        if (!isByteDanceBeautyFilter()) {
            m202153i2(new RunnableC20882g(f));
        } else if (this.f185094b != null) {
            this.f185094b.updateLookupFilterIntensity(f * csx.m112235R().m112289S());
        }
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (this.f185094b != null && isByteDanceBeautyFilter() && this.f185094b.isEnableDraw()) {
            this.f185094b.setMMCVInfo(omwVar);
        } else {
            onFaceDetectComplete(omwVar);
        }
    }

    public void setWarpScaleFactor(float f) {
        BeautyFilterAdapter beautyFilterAdapter = this.f185094b;
        if (beautyFilterAdapter != null) {
            beautyFilterAdapter.changeWarpScaleFactor(f);
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        if (liveLightningEngineFilter != null) {
            liveLightningEngineFilter.setWarpScaleFactor(f);
        }
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.m113320b(f);
        }
    }

    public void startGestureDetect(boolean z, int i) {
        if (z) {
            DetectManager detectManager = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
            detectManager.registerGestureDetectListener(liveLightningEngineFilter != null ? liveLightningEngineFilter.getEngineDispather() : null);
            DetectManager.getInstance().setGestureModelPath(cnw.m111545d(7));
            DetectManager.getInstance().setHandGestureType(i);
            DetectManager.getInstance().startGestureDetect();
        } else {
            DetectManager.getInstance().registerObjectDetectListener(this.f185096d);
            DetectManager detectManager2 = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter2 = this.f185095c;
            detectManager2.registerObjectDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
            DetectManager.getInstance().setObjectModelPath(cnw.m111545d(2));
            DetectManager.getInstance().startObjectDetect();
            DetectManager.getInstance().setObjectDetectInterval(500);
        }
        t9c.m189743a("JniEngineAdjustFilter", "statGestureDetect " + z);
    }

    public void stopGestureDetect() {
        m202167u2(false);
        t9c.m189743a("JniEngineAdjustFilter", "stopGestureDetect");
    }

    /* JADX INFO: renamed from: t2 */
    public void m202166t2(dul dulVar) {
        this.f185102k = dulVar;
    }

    /* JADX INFO: renamed from: u2 */
    public void m202167u2(boolean z) {
        if (z) {
            DetectManager detectManager = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
            detectManager.removeGestureDetectListener(liveLightningEngineFilter != null ? liveLightningEngineFilter.getEngineDispather() : null);
            DetectManager.getInstance().stopGestureDetect();
        } else {
            DetectManager.getInstance().removeObjectDetectListener(this.f185096d);
            DetectManager detectManager2 = DetectManager.getInstance();
            LiveLightningEngineFilter liveLightningEngineFilter2 = this.f185095c;
            detectManager2.removeObjectDetectListener(liveLightningEngineFilter2 != null ? liveLightningEngineFilter2.getEngineDispather() : null);
            DetectManager.getInstance().stopObjectDetect();
        }
        t9c.m189743a("JniEngineAdjustFilter", "stopGestureDetect");
    }

    public boolean updateByteDanceFaceBeautyValue(String str, String str2, float f) {
        int i = this.f185110s;
        if (i == 2) {
            return this.f185094b.updateByteDanceFaceBeautyValue(str, str2, f);
        }
        if (i != 3) {
            return false;
        }
        m202153i2(new RunnableC20892q(str, str2, f));
        return true;
    }

    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        int i = this.f185110s;
        if (i == 2) {
            return this.f185094b.updateMakeupStyleValue(str, str2, f);
        }
        if (i != 3) {
            return false;
        }
        m202153i2(new RunnableC20893r(str, str2, f));
        return true;
    }

    /* JADX INFO: renamed from: v2 */
    public void m202168v2(int i) {
        b7y.m102882c().m102888g("JniEngineAdjustFilter", "switchBeautyType beautyType === " + i);
        b7y.m102882c().m102888g("JniEngineAdjustFilter", "switchBeautyType isEngineInit === " + this.f185092A);
        this.f185110s = i;
        m202150f2(i);
        czd czdVar = this.f185111t;
        if (czdVar != null) {
            czdVar.m113323e(i);
        }
        BeautyFilterAdapter beautyFilterAdapter = this.f185094b;
        if (beautyFilterAdapter != null) {
            boolean z = i == 2;
            beautyFilterAdapter.forbidBeauty(false);
            this.f185094b.enableDraw(z);
            this.f185094b.switchBeauty(i);
            this.f185094b.setOnDetectCompleteListener(this);
        }
        LiveLightningEngineFilter liveLightningEngineFilter = this.f185095c;
        if (liveLightningEngineFilter != null) {
            int i2 = this.f185110s;
            boolean z2 = (i2 == 2 || i2 == -1) ? false : true;
            liveLightningEngineFilter.setFaceWarpType(m202154j2(i));
            if (this.f185095c.getLightningRender() != null && this.f185095c.getLightningRender().getMakeupLevel() != null) {
                this.f185095c.getLightningRender().getMakeupLevel().setEnable(this.f185110s == 3);
            }
            this.f185095c.enableBeautyFace(z2);
            int i3 = this.f185110s;
            if ((i3 == 1 || i3 == 0) && this.f185095c.getXEDirector() != null && this.f185095c.getXEDirector().getMakeupLevel() != null && this.f185095c.getXEDirector().getMakeupLevel().isEffectActive()) {
                this.f185112u.m184040f();
            }
        }
    }

    /* JADX INFO: renamed from: l.voq$d */
    public class C20879d implements StickerBlendFilter.StickerStateChangeListener {
        public C20879d() {
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void stickerGestureTypeChanged(String str, boolean z) {
            if (TextUtils.isEmpty(str) || !z) {
                return;
            }
            voq.m202141W1(voq.this);
        }

        @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
        public void stickerStateChanged(int i, int i2) {
            if (i <= 0 || i2 != 0) {
                return;
            }
            voq.m202141W1(voq.this);
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
