package p149l;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.putong.live.base.data.BLiveCapture;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class rt00 extends d8s implements axl {

    /* JADX INFO: renamed from: a */
    public final r0f f160925a;

    /* JADX INFO: renamed from: b */
    public boolean f160926b;

    /* JADX INFO: renamed from: d */
    public f4m f160928d;

    /* JADX INFO: renamed from: e */
    public boolean f160929e;

    /* JADX INFO: renamed from: h */
    public Context f160932h;

    /* JADX INFO: renamed from: i */
    public BLiveVideoQualityConf f160933i;

    /* JADX INFO: renamed from: c */
    public int f160927c = -1;

    /* JADX INFO: renamed from: f */
    public e30<CoreEngineAction> f160930f = new C19778a();

    /* JADX INFO: renamed from: g */
    public ArrayList<e30<CoreEngineAction>> f160931g = new ArrayList<>();

    /* JADX INFO: renamed from: l.rt00$a */
    public class C19778a implements e30<CoreEngineAction> {
        public C19778a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final CoreEngineAction coreEngineAction) {
            vwb.m200354z(rt00.this.f160931g, new e30() { // from class: l.qt00
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((e30) obj).call(coreEngineAction);
                }
            });
        }
    }

    public rt00(r0f r0fVar) {
        this.f160925a = r0fVar;
    }

    @Override // p149l.axl
    /* JADX INFO: renamed from: C */
    public void mo99451C(int i, int i2) {
        this.f160928d.mo68530C(i, i2);
    }

    @Override // p149l.axl
    /* JADX INFO: renamed from: F0 */
    public void mo99452F0(Context context, BLiveVideoQualityConf bLiveVideoQualityConf) {
        m180763b1(context, bLiveVideoQualityConf);
        this.f160928d.mo68542O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        dkw.m112278e(new File(gli.m126766p()).getAbsolutePath());
        String str = swr.f166715l;
        if (str != null) {
            dkw.m112279f(str);
            this.f160925a.f157170e.m98899a1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public akw m180757V0(int i, SurfaceView surfaceView) {
        int i2;
        final akw akwVar = new akw(i, 0, 0, 0, surfaceView);
        du00.m113660a(new d30() { // from class: l.jt00
            @Override // p149l.d30
            public final void call() {
                this.f119564a.m180760Y0(akwVar);
            }
        }, new d30() { // from class: l.lt00
            @Override // p149l.d30
            public final void call() {
                this.f129921a.m180761Z0(akwVar);
            }
        });
        BLiveVideoQualityConf bLiveVideoQualityConf = this.f160933i;
        if (bLiveVideoQualityConf == null || !bLiveVideoQualityConf.capture.isValid()) {
            BLiveVideoQuality bLiveVideoQualityM180758W0 = m180758W0();
            if (bLiveVideoQualityM180758W0 == null || !bLiveVideoQualityM180758W0.isValid()) {
                i2 = 15;
            } else {
                i2 = bLiveVideoQualityM180758W0.captureFps;
                m180767f1(this.f160932h, new aqh0(bLiveVideoQualityM180758W0.captureWidth, bLiveVideoQualityM180758W0.captureHeight), akwVar);
            }
        } else {
            BLiveVideoQualityConf bLiveVideoQualityConf2 = this.f160933i;
            i2 = bLiveVideoQualityConf2.encode.fps;
            Context context = this.f160932h;
            BLiveCapture bLiveCapture = bLiveVideoQualityConf2.capture;
            m180767f1(context, new aqh0(bLiveCapture.width, bLiveCapture.height), akwVar);
        }
        akwVar.m97219y(i2);
        return akwVar;
    }

    /* JADX INFO: renamed from: W0 */
    public BLiveVideoQuality m180758W0() {
        fld0<idv> fld0Var = fld0.f98147b;
        return ((idv) ypv.m215673l(fld0Var)).m135638j() != null ? ((idv) ypv.m215673l(fld0Var)).m135638j() : ypv.m215672k().m195713Q5();
    }

    /* JADX INFO: renamed from: X0 */
    public void m180759X0() {
        this.f160928d = this.f160925a.f157167b;
        this.f160926b = du00.m113662c();
        this.f160928d.mo68555a0(true);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m180760Y0(akw akwVar) {
        m180767f1(this.f160932h, new aqh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), akwVar);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m180761Z0(akw akwVar) {
        m180767f1(this.f160932h, new aqh0(480, 640), akwVar);
    }

    @Override // p149l.axl
    /* JADX INFO: renamed from: a */
    public void mo99453a() {
        f4m f4mVar = this.f160928d;
        if (f4mVar != null) {
            f4mVar.mo68554a();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m180762a1() {
        this.f160928d.mo68554a();
    }

    /* JADX INFO: renamed from: b1 */
    public void m180763b1(Context context, BLiveVideoQualityConf bLiveVideoQualityConf) {
        this.f160932h = context;
        this.f160933i = bLiveVideoQualityConf;
        this.f160928d.mo68589z(false);
        this.f160928d.mo68582s(ypv.f199493a.m199370s());
    }

    /* JADX INFO: renamed from: c1 */
    public void m180764c1() {
        this.f160928d = null;
    }

    /* JADX INFO: renamed from: d1 */
    public void m180765d1(e30<CoreEngineAction> e30Var) {
        this.f160931g.add(e30Var);
    }

    /* JADX INFO: renamed from: e1 */
    public void m180766e1() {
        gkh0.m126627j("videoChat", "recorder release");
        f4m f4mVar = this.f160928d;
        if (f4mVar != null) {
            f4mVar.mo68554a();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m180767f1(Context context, aqh0 aqh0Var, akw akwVar) {
        aqh0 aqh0VarM137142c = inh0.m137142c(context, aqh0Var, 0, aqh0Var.f71162b / aqh0Var.f71161a);
        if (aqh0VarM137142c != null) {
            aqh0Var = aqh0VarM137142c;
        }
        akwVar.m97220z(aqh0Var.f71162b, aqh0Var.f71161a);
        gkh0.m126627j("videoChat", "with: " + aqh0Var.f71162b + " , height: " + aqh0Var.f71161a);
    }

    /* JADX INFO: renamed from: g1 */
    public void m180768g1(g4m g4mVar) {
        f4m f4mVar = this.f160928d;
        if (f4mVar != null) {
            f4mVar.mo68538K(g4mVar);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m180769h1(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC19779b(surfaceView));
    }

    /* JADX INFO: renamed from: i1 */
    public void m180770i1(akw akwVar) {
        this.f160928d.mo68586w(akwVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m180771j1(SurfaceHolder surfaceHolder, SurfaceView surfaceView) {
        if (this.f160927c == -1) {
            this.f160927c = this.f160926b ? 1 : 0;
        }
        if (!this.f160929e) {
            this.f160930f.call(CoreEngineAction.ACTION_BEFORE_PREVIEW);
            m180770i1(m180757V0(this.f160927c, surfaceView));
            gkh0.m126627j("videoChat", "mediaEngine.startPreview lastPreviewCameraID:" + this.f160927c);
            this.f160930f.call(CoreEngineAction.ACTION_AFTER_PREVIEW);
        }
        this.f160929e = false;
    }

    /* JADX INFO: renamed from: k1 */
    public void m180772k1(e30<CoreEngineAction> e30Var) {
        this.f160931g.remove(e30Var);
    }

    /* JADX INFO: renamed from: l.rt00$b */
    public class SurfaceHolderCallbackC19779b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f160935a;

        public SurfaceHolderCallbackC19779b(SurfaceView surfaceView) {
            this.f160935a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            rt00.this.mo99451C(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            rt00.this.m180771j1(surfaceHolder, this.f160935a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
