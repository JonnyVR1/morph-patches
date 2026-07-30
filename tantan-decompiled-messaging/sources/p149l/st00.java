package p149l;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class st00 extends d8s implements zwl {

    /* JADX INFO: renamed from: a */
    public final q0f f166275a;

    /* JADX INFO: renamed from: b */
    public boolean f166276b;

    /* JADX INFO: renamed from: c */
    public long f166277c;

    /* JADX INFO: renamed from: e */
    public f4m f166279e;

    /* JADX INFO: renamed from: f */
    public BLiveVideoQuality f166280f;

    /* JADX INFO: renamed from: g */
    public boolean f166281g;

    /* JADX INFO: renamed from: h */
    public j760<Integer, Integer> f166282h;

    /* JADX INFO: renamed from: k */
    public f30<String, String> f166285k;

    /* JADX INFO: renamed from: m */
    public c4g0 f166287m;

    /* JADX INFO: renamed from: d */
    public int f166278d = -1;

    /* JADX INFO: renamed from: i */
    public e30<CoreEngineAction> f166283i = new C20023b();

    /* JADX INFO: renamed from: j */
    public ArrayList<e30<CoreEngineAction>> f166284j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public final Context f166286l = App.f15369e;

    /* JADX INFO: renamed from: l.st00$b */
    public class C20023b implements e30<CoreEngineAction> {
        public C20023b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final CoreEngineAction coreEngineAction) {
            vwb.m200354z(st00.this.f166284j, new e30() { // from class: l.pt00
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((e30) obj).call(coreEngineAction);
                }
            });
        }
    }

    public st00(q0f q0fVar) {
        this.f166275a = q0fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m185815d1(akw akwVar) {
        m185836o1(new aqh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), akwVar);
    }

    /* JADX INFO: renamed from: C */
    public void m185816C(int i, int i2) {
        this.f166279e.mo68530C(i, i2);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: T */
    public void mo110351T(String str, String str2) {
        super.mo110351T(str, str2);
        f30<String, String> f30Var = this.f166285k;
        if (f30Var != null) {
            f30Var.call(str, str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public akw m185817Y0(int i, SurfaceView surfaceView) {
        int i2;
        final akw akwVar = new akw(i, 0, 0, 0, surfaceView);
        cu00.m108718a(new d30() { // from class: l.it00
            @Override // p149l.d30
            public final void call() {
                this.f114815a.m185815d1(akwVar);
            }
        }, new d30() { // from class: l.kt00
            @Override // p149l.d30
            public final void call() {
                this.f124561a.m185823e1(akwVar);
            }
        });
        cu00.m108718a(new d30() { // from class: l.mt00
            @Override // p149l.d30
            public final void call() {
                this.f135547a.m185825f1(akwVar);
            }
        }, new d30() { // from class: l.nt00
            @Override // p149l.d30
            public final void call() {
                this.f140307a.m185827g1(akwVar);
            }
        });
        BLiveVideoQuality bLiveVideoQualityM185820a1 = m185820a1();
        if (bLiveVideoQualityM185820a1 == null || !bLiveVideoQualityM185820a1.isValid()) {
            i2 = 15;
        } else {
            i2 = bLiveVideoQualityM185820a1.captureFps;
            m185836o1(new aqh0(bLiveVideoQualityM185820a1.captureWidth, bLiveVideoQualityM185820a1.captureHeight), akwVar);
        }
        akwVar.m97219y(i2);
        return akwVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public j760<Integer, Integer> m185818Z0() {
        return this.f166282h;
    }

    @Override // p149l.zwl
    /* JADX INFO: renamed from: a */
    public void mo185819a() {
        f4m f4mVar = this.f166279e;
        if (f4mVar != null) {
            f4mVar.mo68554a();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public BLiveVideoQuality m185820a1() {
        if (this.f166280f == null) {
            fld0<idv> fld0Var = fld0.f98147b;
            BLiveVideoQuality bLiveVideoQualityM135638j = ((idv) ypv.m215673l(fld0Var)).m135638j() != null ? ((idv) ypv.m215673l(fld0Var)).m135638j() : ypv.m215672k().m195713Q5();
            this.f166280f = bLiveVideoQualityM135638j;
            if (bLiveVideoQualityM135638j != null) {
                hfw.m130790a("live_sdk", "video quality:" + this.f166280f.toJson());
            }
        }
        return this.f166280f;
    }

    /* JADX INFO: renamed from: b1 */
    public void m185821b1() {
        this.f166279e = this.f166275a.f152050b;
        this.f166276b = cu00.m108720c();
        this.f166279e.mo68555a0(true);
        this.f166287m = ConnectivityReceiver.m81290m().subscribe(mkd0.m154955G(new e30() { // from class: l.ot00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145532a.m185828h1((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m185822c1() {
        return this.f166279e.mo68562e();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m185823e1(akw akwVar) {
        m185836o1(new aqh0(480, 640), akwVar);
    }

    @Override // p149l.zwl
    /* JADX INFO: renamed from: f */
    public void mo185824f() {
        if (SystemClock.uptimeMillis() - this.f166277c > 1000) {
            if (!m185822c1() && !this.f166276b) {
                lsi0.m151578h(R$string.f47648y7);
                return;
            }
            this.f166279e.mo68564f();
            int i = 0;
            if (this.f166276b && this.f166278d != 1) {
                i = 1;
            }
            this.f166278d = i;
            this.f166283i.call(CoreEngineAction.ACTION_SWITCH_CAMERA);
            this.f166277c = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m185825f1(akw akwVar) {
        m185836o1(new aqh0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), akwVar);
    }

    @Override // p149l.zwl
    /* JADX INFO: renamed from: g */
    public igb0 mo185826g() {
        return this.f166279e.mo68566g();
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m185827g1(akw akwVar) {
        m185836o1(new aqh0(480, 640), akwVar);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m185828h1(NetworkInfo networkInfo) {
        hb20.m130275f().m130294x(this.f166286l);
    }

    /* JADX INFO: renamed from: i1 */
    public void m185829i1() {
        this.f166279e.mo68554a();
    }

    /* JADX INFO: renamed from: j1 */
    public void m185830j1() {
        this.f166279e.mo68589z(false);
        this.f166279e.mo68582s(ypv.f199493a.m199370s());
    }

    /* JADX INFO: renamed from: k1 */
    public void m185831k1() {
        mkd0.m154992z(this.f166287m);
        this.f166279e = null;
    }

    /* JADX INFO: renamed from: l1 */
    public void m185832l1(e30<CoreEngineAction> e30Var) {
        this.f166284j.add(e30Var);
    }

    @Override // p149l.zwl
    /* JADX INFO: renamed from: m0 */
    public void mo185833m0(Context context) {
        m185830j1();
        boolean zM162668F1 = uvr.m196087d().m162668F1();
        f4m f4mVar = this.f166279e;
        if (zM162668F1) {
            f4mVar.mo68542O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE);
            ArrayList<String> arrayList = swr.f166714k;
            if (arrayList != null) {
                this.f166279e.mo68575l(arrayList);
                this.f166275a.f152053e.m71866a1();
                return;
            }
            return;
        }
        f4mVar.mo68542O(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        dkw.m112278e(new File(gli.m126766p()).getAbsolutePath());
        String str = swr.f166715l;
        if (str != null) {
            dkw.m112279f(str);
            this.f166275a.f152053e.m71866a1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m185834m1() {
        hfw.m130790a("[live]sdk_engine", "recorder release");
        f4m f4mVar = this.f166279e;
        if (f4mVar != null) {
            f4mVar.mo68554a();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m185835n1() {
        this.f166278d = -1;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m185836o1(aqh0 aqh0Var, akw akwVar) {
        aqh0 aqh0VarM137142c = inh0.m137142c(this.f166286l, aqh0Var, 0, aqh0Var.f71162b / aqh0Var.f71161a);
        if (aqh0VarM137142c != null) {
            aqh0Var = aqh0VarM137142c;
        }
        akwVar.m97220z(aqh0Var.f71162b, aqh0Var.f71161a);
        this.f166282h = new j760<>(Integer.valueOf(aqh0Var.f71162b), Integer.valueOf(aqh0Var.f71161a));
        hfw.m130790a("LivePkConstant", "LiveEngine setCameraSize,with: " + aqh0Var.f71162b + " , height: " + aqh0Var.f71161a);
    }

    /* JADX INFO: renamed from: p1 */
    public void m185837p1(g4m g4mVar) {
        f4m f4mVar = this.f166279e;
        if (f4mVar != null) {
            f4mVar.mo68538K(g4mVar);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m185838q1(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC20022a(surfaceView));
    }

    /* JADX INFO: renamed from: r1 */
    public void m185839r1(akw akwVar) {
        this.f166279e.mo68586w(akwVar);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m185840s1() {
        if (this.f166275a.f152055g.mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            mo185819a();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m185841t1(SurfaceHolder surfaceHolder, SurfaceView surfaceView) {
        if (this.f166278d == -1) {
            this.f166278d = this.f166276b ? 1 : 0;
        }
        if (!this.f166281g) {
            m185840s1();
            this.f166283i.call(CoreEngineAction.ACTION_BEFORE_PREVIEW);
            m185839r1(m185817Y0(this.f166278d, surfaceView));
            hfw.m130790a("[live]sdk_engine", "mediaEngine.startPreview lastPreviewCameraID:" + this.f166278d);
            this.f166283i.call(CoreEngineAction.ACTION_AFTER_PREVIEW);
        }
        this.f166281g = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m185842u1(e30<CoreEngineAction> e30Var) {
        this.f166284j.remove(e30Var);
    }

    @Override // p149l.zwl
    /* JADX INFO: renamed from: y0 */
    public void mo185843y0(f30<String, String> f30Var) {
        this.f166285k = f30Var;
    }

    /* JADX INFO: renamed from: l.st00$a */
    public class SurfaceHolderCallbackC20022a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f166288a;

        public SurfaceHolderCallbackC20022a(SurfaceView surfaceView) {
            this.f166288a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            st00.this.m185816C(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            st00.this.m185841t1(surfaceHolder, this.f166288a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
