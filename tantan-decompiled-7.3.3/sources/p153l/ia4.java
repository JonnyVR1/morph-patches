package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class ia4 implements ypl.InterfaceC21656a, ypl.InterfaceC21658c, ypl.InterfaceC21657b, ypl.InterfaceC21659d {

    /* JADX INFO: renamed from: b */
    private InterfaceC17676b f113548b;

    /* JADX INFO: renamed from: c */
    private ypl f113549c;

    /* JADX INFO: renamed from: a */
    final int f113547a = 303;

    /* JADX INFO: renamed from: d */
    int f113550d = 60;

    /* JADX INFO: renamed from: e */
    private Rect f113551e = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    private Rect f113552f = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: g */
    private SurfaceTexture f113553g = null;

    /* JADX INFO: renamed from: h */
    private spw f113554h = null;

    /* JADX INFO: renamed from: l.ia4$a */
    public class C17675a implements ypl.InterfaceC21660e {
        public C17675a() {
        }

        @Override // p153l.ypl.InterfaceC21660e
        public void onFail(int i, String str) {
            ia4.this.f113554h.onFail(i, str);
        }
    }

    /* JADX INFO: renamed from: l.ia4$b */
    public interface InterfaceC17676b {
        /* JADX INFO: renamed from: D */
        void mo139179D(byte[] bArr);

        /* JADX INFO: renamed from: E */
        void mo139180E(byte[] bArr);
    }

    public ia4(sow sowVar) {
        m139163e(sowVar);
    }

    @Override // p153l.ypl.InterfaceC21658c
    /* JADX INFO: renamed from: a */
    public void mo139160a(byte[] bArr) {
        InterfaceC17676b interfaceC17676b = this.f113548b;
        if (interfaceC17676b != null) {
            interfaceC17676b.mo139180E(bArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m139161c(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f113549c != null) {
            if (ad4.m97012d(this.f113551e, rect, this.f113550d) || !m139165g()) {
                this.f113551e.set(rect);
                this.f113549c.mo98195k(this.f113551e, autoFocusCallback);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public ypl m139162d() {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            return yplVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m139163e(sow sowVar) {
        try {
            if (this.f113549c != null) {
                m139167i();
            }
            if (sowVar.f169946T) {
                this.f113549c = new diw(sowVar);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraType(2);
            } else {
                sowVar.f169968h0 = true;
                this.f113549c = new aiw(sowVar);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraType(1);
            }
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "cameraType is camera1 ".concat(sowVar.f169946T ? "false" : "true"));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ypl.InterfaceC21657b
    /* JADX INFO: renamed from: f */
    public void mo139164f(int i, int i2, Rect rect, boolean z) {
        if (this.f113549c == null || !ad4.m97012d(this.f113552f, rect, this.f113550d)) {
            return;
        }
        this.f113552f.set(rect);
        this.f113549c.mo98192f(i, i2, rect, z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m139165g() {
        ypl yplVar = this.f113549c;
        if (yplVar == null) {
            return false;
        }
        return yplVar.mo98193i();
    }

    /* JADX INFO: renamed from: h */
    public boolean m139166h(int i, qow qowVar) {
        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager prepare !!!");
        ypl yplVar = this.f113549c;
        if (yplVar == null) {
            return false;
        }
        if (!yplVar.mo98182C(i, qowVar)) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera prepare Failed !!!");
            return false;
        }
        this.f113549c.mo98207w(this);
        this.f113549c.mo98201q(this);
        this.f113549c.mo98202r(this);
        this.f113551e = new Rect();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m139167i() {
        if (this.f113549c != null) {
            MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager release !!!");
            this.f113549c.mo98191e(null);
            this.f113549c.mo98187a();
            this.f113549c.mo98207w(null);
            this.f113553g = null;
            this.f113549c = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m139168j(int i, qow qowVar) {
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager resetCamera !!!");
        ypl yplVar = this.f113549c;
        if (yplVar == null) {
            return false;
        }
        yplVar.mo98205u(i, qowVar);
        return this.f113549c.mo98194j(this.f113553g);
    }

    /* JADX INFO: renamed from: k */
    public void m139169k(Context context) {
        ypl yplVar = this.f113549c;
        if (yplVar == null || !(yplVar instanceof diw)) {
            return;
        }
        ((diw) yplVar).m116000p0(context);
    }

    /* JADX INFO: renamed from: l */
    public void m139170l(InterfaceC17676b interfaceC17676b) {
        this.f113548b = interfaceC17676b;
    }

    /* JADX INFO: renamed from: m */
    public void m139171m(spw spwVar) {
        this.f113554h = spwVar;
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            yplVar.mo98200p(new C17675a());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m139172n(diw.InterfaceC16546h interfaceC16546h) {
        ypl yplVar = this.f113549c;
        if (yplVar == null || !(yplVar instanceof diw)) {
            return;
        }
        ((diw) yplVar).m116001q0(interfaceC16546h);
    }

    /* JADX INFO: renamed from: o */
    public void m139173o(Camera.ErrorCallback errorCallback) {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            yplVar.mo98191e(errorCallback);
        }
    }

    @Override // p153l.ypl.InterfaceC21656a
    public void onData(byte[] bArr) {
        InterfaceC17676b interfaceC17676b = this.f113548b;
        if (interfaceC17676b != null) {
            interfaceC17676b.mo139179D(bArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m139174p(ypl.InterfaceC21661f interfaceC21661f) {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            yplVar.mo98196l(interfaceC21661f);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m139175q(SurfaceTexture surfaceTexture) {
        ypl yplVar = this.f113549c;
        if (yplVar == null) {
            return false;
        }
        this.f113553g = surfaceTexture;
        return yplVar.mo98194j(surfaceTexture);
    }

    /* JADX INFO: renamed from: r */
    public void m139176r() {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            yplVar.mo98187a();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m139177s(int i, qow qowVar) {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            yplVar.mo98181A(i, qowVar);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m139178t(int i) {
        ypl yplVar = this.f113549c;
        if (yplVar != null) {
            return yplVar.mo98203s(i);
        }
        return false;
    }
}
