package p153l;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.putong.live.base.data.BLiveCapture;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class a210 extends eas implements tzl {

    /* JADX INFO: renamed from: a */
    public final v1f f67917a;

    /* JADX INFO: renamed from: b */
    public boolean f67918b;

    /* JADX INFO: renamed from: d */
    public v6m f67920d;

    /* JADX INFO: renamed from: e */
    public boolean f67921e;

    /* JADX INFO: renamed from: h */
    public Context f67924h;

    /* JADX INFO: renamed from: i */
    public BLiveVideoQualityConf f67925i;

    /* JADX INFO: renamed from: c */
    public int f67919c = -1;

    /* JADX INFO: renamed from: f */
    public y20<CoreEngineAction> f67922f = new C15623a();

    /* JADX INFO: renamed from: g */
    public ArrayList<y20<CoreEngineAction>> f67923g = new ArrayList<>();

    /* JADX INFO: renamed from: l.a210$a */
    public class C15623a implements y20<CoreEngineAction> {
        public C15623a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final CoreEngineAction coreEngineAction) {
            jyb.m147537z(a210.this.f67923g, new y20() { // from class: l.z110
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((y20) obj).call(coreEngineAction);
                }
            });
        }
    }

    public a210(v1f v1fVar) {
        this.f67917a = v1fVar;
    }

    @Override // p153l.tzl
    /* JADX INFO: renamed from: C */
    public void mo95594C(int i, int i2) {
        this.f67920d.mo69713C(i, i2);
    }

    @Override // p153l.tzl
    /* JADX INFO: renamed from: F0 */
    public void mo95595F0(Context context, BLiveVideoQualityConf bLiveVideoQualityConf) {
        m95603b1(context, bLiveVideoQualityConf);
        this.f67920d.mo69725O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        cnw.m111546e(new File(coi.m111655p()).getAbsolutePath());
        String str = tyr.f176696l;
        if (str != null) {
            cnw.m111547f(str);
            this.f67917a.f181965e.m143176a1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public zmw m95596V0(int i, SurfaceView surfaceView) {
        int i2;
        final zmw zmwVar = new zmw(i, 0, 0, 0, surfaceView);
        m210.m156737a(new x20() { // from class: l.s110
            @Override // p153l.x20
            public final void call() {
                this.f165753a.m95599Y0(zmwVar);
            }
        }, new x20() { // from class: l.u110
            @Override // p153l.x20
            public final void call() {
                this.f176963a.m95600Z0(zmwVar);
            }
        });
        BLiveVideoQualityConf bLiveVideoQualityConf = this.f67925i;
        if (bLiveVideoQualityConf == null || !bLiveVideoQualityConf.capture.isValid()) {
            BLiveVideoQuality bLiveVideoQualityM95597W0 = m95597W0();
            if (bLiveVideoQualityM95597W0 == null || !bLiveVideoQualityM95597W0.isValid()) {
                i2 = 15;
            } else {
                i2 = bLiveVideoQualityM95597W0.captureFps;
                m95607f1(this.f67924h, new hyh0(bLiveVideoQualityM95597W0.captureWidth, bLiveVideoQualityM95597W0.captureHeight), zmwVar);
            }
        } else {
            BLiveVideoQualityConf bLiveVideoQualityConf2 = this.f67925i;
            i2 = bLiveVideoQualityConf2.encode.fps;
            Context context = this.f67924h;
            BLiveCapture bLiveCapture = bLiveVideoQualityConf2.capture;
            m95607f1(context, new hyh0(bLiveCapture.width, bLiveCapture.height), zmwVar);
        }
        zmwVar.m220524y(i2);
        return zmwVar;
    }

    /* JADX INFO: renamed from: W0 */
    public BLiveVideoQuality m95597W0() {
        htd0<jfv> htd0Var = htd0.f111520b;
        return ((jfv) zrv.m221194l(htd0Var)).m144723j() != null ? ((jfv) zrv.m221194l(htd0Var)).m144723j() : zrv.m221193k().m203500Q5();
    }

    /* JADX INFO: renamed from: X0 */
    public void m95598X0() {
        this.f67920d = this.f67917a.f181962b;
        this.f67918b = m210.m156739c();
        this.f67920d.mo69738a0(true);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m95599Y0(zmw zmwVar) {
        m95607f1(this.f67924h, new hyh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), zmwVar);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m95600Z0(zmw zmwVar) {
        m95607f1(this.f67924h, new hyh0(480, 640), zmwVar);
    }

    @Override // p153l.tzl
    /* JADX INFO: renamed from: a */
    public void mo95601a() {
        v6m v6mVar = this.f67920d;
        if (v6mVar != null) {
            v6mVar.mo69737a();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public void m95602a1() {
        this.f67920d.mo69737a();
    }

    /* JADX INFO: renamed from: b1 */
    public void m95603b1(Context context, BLiveVideoQualityConf bLiveVideoQualityConf) {
        this.f67924h = context;
        this.f67925i = bLiveVideoQualityConf;
        this.f67920d.mo69772z(false);
        this.f67920d.mo69765s(zrv.f205799a.m207692s());
    }

    /* JADX INFO: renamed from: c1 */
    public void m95604c1() {
        this.f67920d = null;
    }

    /* JADX INFO: renamed from: d1 */
    public void m95605d1(y20<CoreEngineAction> y20Var) {
        this.f67923g.add(y20Var);
    }

    /* JADX INFO: renamed from: e1 */
    public void m95606e1() {
        nsh0.m164608j("videoChat", "recorder release");
        v6m v6mVar = this.f67920d;
        if (v6mVar != null) {
            v6mVar.mo69737a();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m95607f1(Context context, hyh0 hyh0Var, zmw zmwVar) {
        hyh0 hyh0VarM173964c = pvh0.m173964c(context, hyh0Var, 0, hyh0Var.f112118b / hyh0Var.f112117a);
        if (hyh0VarM173964c != null) {
            hyh0Var = hyh0VarM173964c;
        }
        zmwVar.m220525z(hyh0Var.f112118b, hyh0Var.f112117a);
        nsh0.m164608j("videoChat", "with: " + hyh0Var.f112118b + " , height: " + hyh0Var.f112117a);
    }

    /* JADX INFO: renamed from: g1 */
    public void m95608g1(w6m w6mVar) {
        v6m v6mVar = this.f67920d;
        if (v6mVar != null) {
            v6mVar.mo69721K(w6mVar);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m95609h1(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC15624b(surfaceView));
    }

    /* JADX INFO: renamed from: i1 */
    public void m95610i1(zmw zmwVar) {
        this.f67920d.mo69769w(zmwVar);
    }

    /* JADX INFO: renamed from: j1 */
    public void m95611j1(SurfaceHolder surfaceHolder, SurfaceView surfaceView) {
        if (this.f67919c == -1) {
            this.f67919c = this.f67918b ? 1 : 0;
        }
        if (!this.f67921e) {
            this.f67922f.call(CoreEngineAction.ACTION_BEFORE_PREVIEW);
            m95610i1(m95596V0(this.f67919c, surfaceView));
            nsh0.m164608j("videoChat", "mediaEngine.startPreview lastPreviewCameraID:" + this.f67919c);
            this.f67922f.call(CoreEngineAction.ACTION_AFTER_PREVIEW);
        }
        this.f67921e = false;
    }

    /* JADX INFO: renamed from: k1 */
    public void m95612k1(y20<CoreEngineAction> y20Var) {
        this.f67923g.remove(y20Var);
    }

    /* JADX INFO: renamed from: l.a210$b */
    public class SurfaceHolderCallbackC15624b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f67927a;

        public SurfaceHolderCallbackC15624b(SurfaceView surfaceView) {
            this.f67927a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            a210.this.mo95594C(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            a210.this.m95611j1(surfaceHolder, this.f67927a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
