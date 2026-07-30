package p153l;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class b210 extends eas implements szl {

    /* JADX INFO: renamed from: a */
    public final u1f f74453a;

    /* JADX INFO: renamed from: b */
    public boolean f74454b;

    /* JADX INFO: renamed from: c */
    public long f74455c;

    /* JADX INFO: renamed from: e */
    public v6m f74457e;

    /* JADX INFO: renamed from: f */
    public BLiveVideoQuality f74458f;

    /* JADX INFO: renamed from: g */
    public boolean f74459g;

    /* JADX INFO: renamed from: h */
    public pf60<Integer, Integer> f74460h;

    /* JADX INFO: renamed from: k */
    public z20<String, String> f74463k;

    /* JADX INFO: renamed from: m */
    public kcg0 f74465m;

    /* JADX INFO: renamed from: d */
    public int f74456d = -1;

    /* JADX INFO: renamed from: i */
    public y20<CoreEngineAction> f74461i = new C15895b();

    /* JADX INFO: renamed from: j */
    public ArrayList<y20<CoreEngineAction>> f74462j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public final Context f74464l = App.f16088e;

    /* JADX INFO: renamed from: l.b210$b */
    public class C15895b implements y20<CoreEngineAction> {
        public C15895b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final CoreEngineAction coreEngineAction) {
            jyb.m147537z(b210.this.f74462j, new y20() { // from class: l.y110
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((y20) obj).call(coreEngineAction);
                }
            });
        }
    }

    public b210(u1f u1fVar) {
        this.f74453a = u1fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m101577d1(zmw zmwVar) {
        m101599o1(new hyh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), zmwVar);
    }

    /* JADX INFO: renamed from: C */
    public void m101578C(int i, int i2) {
        this.f74457e.mo69713C(i, i2);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: T */
    public void mo101579T(String str, String str2) {
        super.mo101579T(str, str2);
        z20<String, String> z20Var = this.f74463k;
        if (z20Var != null) {
            z20Var.call(str, str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public zmw m101580Y0(int i, SurfaceView surfaceView) {
        int i2;
        final zmw zmwVar = new zmw(i, 0, 0, 0, surfaceView);
        l210.m152547a(new x20() { // from class: l.r110
            @Override // p153l.x20
            public final void call() {
                this.f160750a.m101577d1(zmwVar);
            }
        }, new x20() { // from class: l.t110
            @Override // p153l.x20
            public final void call() {
                this.f171587a.m101586e1(zmwVar);
            }
        });
        l210.m152547a(new x20() { // from class: l.v110
            @Override // p153l.x20
            public final void call() {
                this.f181918a.m101588f1(zmwVar);
            }
        }, new x20() { // from class: l.w110
            @Override // p153l.x20
            public final void call() {
                this.f186755a.m101590g1(zmwVar);
            }
        });
        BLiveVideoQuality bLiveVideoQualityM101583a1 = m101583a1();
        if (bLiveVideoQualityM101583a1 == null || !bLiveVideoQualityM101583a1.isValid()) {
            i2 = 15;
        } else {
            i2 = bLiveVideoQualityM101583a1.captureFps;
            m101599o1(new hyh0(bLiveVideoQualityM101583a1.captureWidth, bLiveVideoQualityM101583a1.captureHeight), zmwVar);
        }
        zmwVar.m220524y(i2);
        return zmwVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public pf60<Integer, Integer> m101581Z0() {
        return this.f74460h;
    }

    @Override // p153l.szl
    /* JADX INFO: renamed from: a */
    public void mo101582a() {
        v6m v6mVar = this.f74457e;
        if (v6mVar != null) {
            v6mVar.mo69737a();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public BLiveVideoQuality m101583a1() {
        if (this.f74458f == null) {
            htd0<jfv> htd0Var = htd0.f111520b;
            BLiveVideoQuality bLiveVideoQualityM144723j = ((jfv) zrv.m221194l(htd0Var)).m144723j() != null ? ((jfv) zrv.m221194l(htd0Var)).m144723j() : zrv.m221193k().m203500Q5();
            this.f74458f = bLiveVideoQualityM144723j;
            if (bLiveVideoQualityM144723j != null) {
                fhw.m125605a("live_sdk", "video quality:" + this.f74458f.toJson());
            }
        }
        return this.f74458f;
    }

    /* JADX INFO: renamed from: b1 */
    public void m101584b1() {
        this.f74457e = this.f74453a.f176993b;
        this.f74454b = l210.m152549c();
        this.f74457e.mo69738a0(true);
        this.f74465m = ConnectivityReceiver.m82473m().subscribe(psd0.m173596G(new y20() { // from class: l.x110
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191954a.m101591h1((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m101585c1() {
        return this.f74457e.mo69745e();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m101586e1(zmw zmwVar) {
        m101599o1(new hyh0(480, 640), zmwVar);
    }

    @Override // p153l.szl
    /* JADX INFO: renamed from: f */
    public void mo101587f() {
        if (SystemClock.uptimeMillis() - this.f74455c > 1000) {
            if (!m101585c1() && !this.f74454b) {
                o1j0.m165634h(R$string.f48496y7);
                return;
            }
            this.f74457e.mo69747f();
            int i = 0;
            if (this.f74454b && this.f74456d != 1) {
                i = 1;
            }
            this.f74456d = i;
            this.f74461i.call(CoreEngineAction.ACTION_SWITCH_CAMERA);
            this.f74455c = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m101588f1(zmw zmwVar) {
        m101599o1(new hyh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), zmwVar);
    }

    @Override // p153l.szl
    /* JADX INFO: renamed from: g */
    public mob0 mo101589g() {
        return this.f74457e.mo69749g();
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m101590g1(zmw zmwVar) {
        m101599o1(new hyh0(480, 640), zmwVar);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m101591h1(NetworkInfo networkInfo) {
        qj20.m176806f().m176825x(this.f74464l);
    }

    /* JADX INFO: renamed from: i1 */
    public void m101592i1() {
        this.f74457e.mo69737a();
    }

    /* JADX INFO: renamed from: j1 */
    public void m101593j1() {
        this.f74457e.mo69772z(false);
        this.f74457e.mo69765s(zrv.f205799a.m207692s());
    }

    /* JADX INFO: renamed from: k1 */
    public void m101594k1() {
        psd0.m173633z(this.f74465m);
        this.f74457e = null;
    }

    /* JADX INFO: renamed from: l1 */
    public void m101595l1(y20<CoreEngineAction> y20Var) {
        this.f74462j.add(y20Var);
    }

    @Override // p153l.szl
    /* JADX INFO: renamed from: m0 */
    public void mo101596m0(Context context) {
        m101593j1();
        boolean zM170975F1 = vxr.m203876d().m170975F1();
        v6m v6mVar = this.f74457e;
        if (zM170975F1) {
            v6mVar.mo69725O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE);
            ArrayList<String> arrayList = tyr.f176695k;
            if (arrayList != null) {
                this.f74457e.mo69758l(arrayList);
                this.f74453a.f176996e.m73049a1();
                return;
            }
            return;
        }
        v6mVar.mo69725O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        cnw.m111546e(new File(coi.m111655p()).getAbsolutePath());
        String str = tyr.f176696l;
        if (str != null) {
            cnw.m111547f(str);
            this.f74453a.f176996e.m73049a1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m101597m1() {
        fhw.m125605a("[live]sdk_engine", "recorder release");
        v6m v6mVar = this.f74457e;
        if (v6mVar != null) {
            v6mVar.mo69737a();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m101598n1() {
        this.f74456d = -1;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m101599o1(hyh0 hyh0Var, zmw zmwVar) {
        hyh0 hyh0VarM173964c = pvh0.m173964c(this.f74464l, hyh0Var, 0, hyh0Var.f112118b / hyh0Var.f112117a);
        if (hyh0VarM173964c != null) {
            hyh0Var = hyh0VarM173964c;
        }
        zmwVar.m220525z(hyh0Var.f112118b, hyh0Var.f112117a);
        this.f74460h = new pf60<>(Integer.valueOf(hyh0Var.f112118b), Integer.valueOf(hyh0Var.f112117a));
        fhw.m125605a("LivePkConstant", "LiveEngine setCameraSize,with: " + hyh0Var.f112118b + " , height: " + hyh0Var.f112117a);
    }

    /* JADX INFO: renamed from: p1 */
    public void m101600p1(w6m w6mVar) {
        v6m v6mVar = this.f74457e;
        if (v6mVar != null) {
            v6mVar.mo69721K(w6mVar);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m101601q1(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC15894a(surfaceView));
    }

    /* JADX INFO: renamed from: r1 */
    public void m101602r1(zmw zmwVar) {
        this.f74457e.mo69769w(zmwVar);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m101603s1() {
        if (this.f74453a.f176998g.mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            mo101582a();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m101604t1(SurfaceHolder surfaceHolder, SurfaceView surfaceView) {
        if (this.f74456d == -1) {
            this.f74456d = this.f74454b ? 1 : 0;
        }
        if (!this.f74459g) {
            m101603s1();
            this.f74461i.call(CoreEngineAction.ACTION_BEFORE_PREVIEW);
            m101602r1(m101580Y0(this.f74456d, surfaceView));
            fhw.m125605a("[live]sdk_engine", "mediaEngine.startPreview lastPreviewCameraID:" + this.f74456d);
            this.f74461i.call(CoreEngineAction.ACTION_AFTER_PREVIEW);
        }
        this.f74459g = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m101605u1(y20<CoreEngineAction> y20Var) {
        this.f74462j.remove(y20Var);
    }

    @Override // p153l.szl
    /* JADX INFO: renamed from: y0 */
    public void mo101606y0(z20<String, String> z20Var) {
        this.f74463k = z20Var;
    }

    /* JADX INFO: renamed from: l.b210$a */
    public class SurfaceHolderCallbackC15894a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f74466a;

        public SurfaceHolderCallbackC15894a(SurfaceView surfaceView) {
            this.f74466a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            b210.this.m101578C(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            b210.this.m101604t1(surfaceHolder, this.f74466a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
