package p002l;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.immomo.momomediaext.MomoMediaConstants;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.File;
import java.util.ArrayList;
import l.akw;
import l.aqh0;
import l.c4g0;
import l.d30;
import l.d8s;
import l.dkw;
import l.e30;
import l.f30;
import l.f4m;
import l.fld0;
import l.g4m;
import l.hb20;
import l.hfw;
import l.idv;
import l.igb0;
import l.inh0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.uvr;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class st00 extends d8s implements zwl {

    /* JADX INFO: renamed from: a */
    public final q0f f19265a;

    /* JADX INFO: renamed from: b */
    public boolean f19266b;

    /* JADX INFO: renamed from: c */
    public long f19267c;

    /* JADX INFO: renamed from: e */
    public f4m f19269e;

    /* JADX INFO: renamed from: f */
    public BLiveVideoQuality f19270f;

    /* JADX INFO: renamed from: g */
    public boolean f19271g;

    /* JADX INFO: renamed from: h */
    public j760<Integer, Integer> f19272h;

    /* JADX INFO: renamed from: k */
    public f30<String, String> f19275k;

    /* JADX INFO: renamed from: m */
    public c4g0 f19277m;

    /* JADX INFO: renamed from: d */
    public int f19268d = -1;

    /* JADX INFO: renamed from: i */
    public e30<CoreEngineAction> f19273i = new C0828b();

    /* JADX INFO: renamed from: j */
    public ArrayList<e30<CoreEngineAction>> f19274j = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public final Context f19276l = App.e;

    /* JADX INFO: renamed from: l.st00$b */
    public class C0828b implements e30<CoreEngineAction> {
        public C0828b() {
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(final CoreEngineAction coreEngineAction) {
            vwb.z(st00.this.f19274j, new e30() { // from class: l.pt00
                public final void call(Object obj) {
                    ((e30) obj).call(coreEngineAction);
                }
            });
        }
    }

    public st00(q0f q0fVar) {
        this.f19265a = q0fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m22644d1(akw akwVar) {
        m22666o1(new aqh0(720, 1280), akwVar);
    }

    /* JADX INFO: renamed from: C */
    public void m22645C(int i, int i2) {
        this.f19269e.C(i, i2);
    }

    /* JADX INFO: renamed from: T */
    public void m22646T(String str, String str2) {
        super.T(str, str2);
        f30<String, String> f30Var = this.f19275k;
        if (f30Var != null) {
            f30Var.call(str, str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public akw m22647Y0(int i, SurfaceView surfaceView) {
        int i2;
        final akw akwVar = new akw(i, 0, 0, 0, surfaceView);
        cu00.m11349a(new d30() { // from class: l.it00
            public final void call() {
                this.f13402a.m22644d1(akwVar);
            }
        }, new d30() { // from class: l.kt00
            public final void call() {
                this.f14504a.m22653e1(akwVar);
            }
        });
        cu00.m11349a(new d30() { // from class: l.mt00
            public final void call() {
                this.f15620a.m22655f1(akwVar);
            }
        }, new d30() { // from class: l.nt00
            public final void call() {
                this.f16183a.m22657g1(akwVar);
            }
        });
        BLiveVideoQuality bLiveVideoQualityM22650a1 = m22650a1();
        if (bLiveVideoQualityM22650a1 == null || !bLiveVideoQualityM22650a1.isValid()) {
            i2 = 15;
        } else {
            i2 = bLiveVideoQualityM22650a1.captureFps;
            m22666o1(new aqh0(bLiveVideoQualityM22650a1.captureWidth, bLiveVideoQualityM22650a1.captureHeight), akwVar);
        }
        akwVar.y(i2);
        return akwVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public j760<Integer, Integer> m22648Z0() {
        return this.f19272h;
    }

    @Override // p002l.zwl
    /* JADX INFO: renamed from: a */
    public void mo22649a() {
        f4m f4mVar = this.f19269e;
        if (f4mVar != null) {
            f4mVar.a();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public BLiveVideoQuality m22650a1() {
        if (this.f19270f == null) {
            fld0 fld0Var = fld0.b;
            BLiveVideoQuality bLiveVideoQualityJ = ((idv) ypv.l(fld0Var)).j() != null ? ((idv) ypv.l(fld0Var)).j() : ypv.k().Q5();
            this.f19270f = bLiveVideoQualityJ;
            if (bLiveVideoQualityJ != null) {
                hfw.a("live_sdk", "video quality:" + this.f19270f.toJson());
            }
        }
        return this.f19270f;
    }

    /* JADX INFO: renamed from: b1 */
    public void m22651b1() {
        this.f19269e = this.f19265a.f17743b;
        this.f19266b = cu00.m11351c();
        this.f19269e.a0(true);
        this.f19277m = ConnectivityReceiver.m().subscribe(mkd0.G(new e30() { // from class: l.ot00
            public final void call(Object obj) {
                this.f16776a.m22658h1((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m22652c1() {
        return this.f19269e.e();
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m22653e1(akw akwVar) {
        m22666o1(new aqh0(480, 640), akwVar);
    }

    @Override // p002l.zwl
    /* JADX INFO: renamed from: f */
    public void mo22654f() {
        if (SystemClock.uptimeMillis() - this.f19267c > 1000) {
            if (!m22652c1() && !this.f19266b) {
                lsi0.h(R$string.f3690y7);
                return;
            }
            this.f19269e.f();
            int i = 0;
            if (this.f19266b && this.f19268d != 1) {
                i = 1;
            }
            this.f19268d = i;
            this.f19273i.call(CoreEngineAction.ACTION_SWITCH_CAMERA);
            this.f19267c = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m22655f1(akw akwVar) {
        m22666o1(new aqh0(720, 1280), akwVar);
    }

    @Override // p002l.zwl
    /* JADX INFO: renamed from: g */
    public igb0 mo22656g() {
        return this.f19269e.g();
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m22657g1(akw akwVar) {
        m22666o1(new aqh0(480, 640), akwVar);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m22658h1(NetworkInfo networkInfo) {
        hb20.f().x(this.f19276l);
    }

    /* JADX INFO: renamed from: i1 */
    public void m22659i1() {
        this.f19269e.a();
    }

    /* JADX INFO: renamed from: j1 */
    public void m22660j1() {
        this.f19269e.z(false);
        this.f19269e.s(ypv.a.s());
    }

    /* JADX INFO: renamed from: k1 */
    public void m22661k1() {
        mkd0.z(this.f19277m);
        this.f19269e = null;
    }

    /* JADX INFO: renamed from: l1 */
    public void m22662l1(e30<CoreEngineAction> e30Var) {
        this.f19274j.add(e30Var);
    }

    @Override // p002l.zwl
    /* JADX INFO: renamed from: m0 */
    public void mo22663m0(Context context) {
        m22660j1();
        boolean zF1 = uvr.d().F1();
        f4m f4mVar = this.f19269e;
        if (zF1) {
            f4mVar.O(MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_ENGINE);
            ArrayList<String> arrayList = swr.f19311k;
            if (arrayList != null) {
                this.f19269e.l(arrayList);
                this.f19265a.f17746e.m5244a1();
                return;
            }
            return;
        }
        f4mVar.O(MomoMediaConstants.BEAUTY_TYPE.BEAUTY_TYPE_BYTE);
        dkw.e(new File(gli.m13893p()).getAbsolutePath());
        String str = swr.f19312l;
        if (str != null) {
            dkw.f(str);
            this.f19265a.f17746e.m5244a1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m22664m1() {
        hfw.a("[live]sdk_engine", "recorder release");
        f4m f4mVar = this.f19269e;
        if (f4mVar != null) {
            f4mVar.a();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m22665n1() {
        this.f19268d = -1;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m22666o1(aqh0 aqh0Var, akw akwVar) {
        aqh0 aqh0VarC = inh0.c(this.f19276l, aqh0Var, 0, aqh0Var.b / aqh0Var.a);
        if (aqh0VarC != null) {
            aqh0Var = aqh0VarC;
        }
        akwVar.z(aqh0Var.b, aqh0Var.a);
        this.f19272h = new j760<>(Integer.valueOf(aqh0Var.b), Integer.valueOf(aqh0Var.a));
        hfw.a("LivePkConstant", "LiveEngine setCameraSize,with: " + aqh0Var.b + " , height: " + aqh0Var.a);
    }

    /* JADX INFO: renamed from: p1 */
    public void m22667p1(g4m g4mVar) {
        f4m f4mVar = this.f19269e;
        if (f4mVar != null) {
            f4mVar.K(g4mVar);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m22668q1(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC0827a(surfaceView));
    }

    /* JADX INFO: renamed from: r1 */
    public void m22669r1(akw akwVar) {
        this.f19269e.w(akwVar);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m22670s1() {
        if (this.f19265a.f17748g.mo14924a().m5278c1(MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE)) {
            mo22649a();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m22671t1(SurfaceHolder surfaceHolder, SurfaceView surfaceView) {
        if (this.f19268d == -1) {
            this.f19268d = this.f19266b ? 1 : 0;
        }
        if (!this.f19271g) {
            m22670s1();
            this.f19273i.call(CoreEngineAction.ACTION_BEFORE_PREVIEW);
            m22669r1(m22647Y0(this.f19268d, surfaceView));
            hfw.a("[live]sdk_engine", "mediaEngine.startPreview lastPreviewCameraID:" + this.f19268d);
            this.f19273i.call(CoreEngineAction.ACTION_AFTER_PREVIEW);
        }
        this.f19271g = false;
    }

    /* JADX INFO: renamed from: u1 */
    public void m22672u1(e30<CoreEngineAction> e30Var) {
        this.f19274j.remove(e30Var);
    }

    @Override // p002l.zwl
    /* JADX INFO: renamed from: y0 */
    public void mo22673y0(f30<String, String> f30Var) {
        this.f19275k = f30Var;
    }

    /* JADX INFO: renamed from: l.st00$a */
    public class SurfaceHolderCallbackC0827a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SurfaceView f19278a;

        public SurfaceHolderCallbackC0827a(SurfaceView surfaceView) {
            this.f19278a = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            st00.this.m22645C(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            st00.this.m22671t1(surfaceHolder, this.f19278a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
