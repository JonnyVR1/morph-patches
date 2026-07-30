package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.datadot.DataDotUtils;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class j94 implements nnl.InterfaceC18736a, nnl.InterfaceC18738c, nnl.InterfaceC18737b, nnl.InterfaceC18739d {

    /* JADX INFO: renamed from: b */
    private InterfaceC17717b f116843b;

    /* JADX INFO: renamed from: c */
    private nnl f116844c;

    /* JADX INFO: renamed from: a */
    final int f116842a = 303;

    /* JADX INFO: renamed from: d */
    int f116845d = 60;

    /* JADX INFO: renamed from: e */
    private Rect f116846e = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    private Rect f116847f = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: g */
    private SurfaceTexture f116848g = null;

    /* JADX INFO: renamed from: h */
    private tmw f116849h = null;

    /* JADX INFO: renamed from: l.j94$a */
    public class C17716a implements nnl.InterfaceC18740e {
        public C17716a() {
        }

        @Override // p149l.nnl.InterfaceC18740e
        public void onFail(int i, String str) {
            j94.this.f116849h.onFail(i, str);
        }
    }

    /* JADX INFO: renamed from: l.j94$b */
    public interface InterfaceC17717b {
        /* JADX INFO: renamed from: D */
        void mo140520D(byte[] bArr);

        /* JADX INFO: renamed from: E */
        void mo140521E(byte[] bArr);
    }

    public j94(tlw tlwVar) {
        m140504e(tlwVar);
    }

    @Override // p149l.nnl.InterfaceC18738c
    /* JADX INFO: renamed from: a */
    public void mo140501a(byte[] bArr) {
        InterfaceC17717b interfaceC17717b = this.f116843b;
        if (interfaceC17717b != null) {
            interfaceC17717b.mo140521E(bArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m140502c(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f116844c != null) {
            if (bc4.m101043d(this.f116846e, rect, this.f116845d) || !m140506g()) {
                this.f116846e.set(rect);
                this.f116844c.mo106824k(this.f116846e, autoFocusCallback);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public nnl m140503d() {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            return nnlVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m140504e(tlw tlwVar) {
        try {
            if (this.f116844c != null) {
                m140508i();
            }
            if (tlwVar.f171076T) {
                this.f116844c = new fgw(tlwVar);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraType(2);
            } else {
                tlwVar.f171098h0 = true;
                this.f116844c = new cgw(tlwVar);
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraType(1);
            }
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "cameraType is camera1 ".concat(tlwVar.f171076T ? "false" : "true"));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.nnl.InterfaceC18737b
    /* JADX INFO: renamed from: f */
    public void mo140505f(int i, int i2, Rect rect, boolean z) {
        if (this.f116844c == null || !bc4.m101043d(this.f116847f, rect, this.f116845d)) {
            return;
        }
        this.f116847f.set(rect);
        this.f116844c.mo106821f(i, i2, rect, z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m140506g() {
        nnl nnlVar = this.f116844c;
        if (nnlVar == null) {
            return false;
        }
        return nnlVar.mo106822i();
    }

    /* JADX INFO: renamed from: h */
    public boolean m140507h(int i, rlw rlwVar) {
        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager prepare !!!");
        nnl nnlVar = this.f116844c;
        if (nnlVar == null) {
            return false;
        }
        if (!nnlVar.mo106811C(i, rlwVar)) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera prepare Failed !!!");
            return false;
        }
        this.f116844c.mo106836w(this);
        this.f116844c.mo106830q(this);
        this.f116844c.mo106831r(this);
        this.f116846e = new Rect();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m140508i() {
        if (this.f116844c != null) {
            MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager release !!!");
            this.f116844c.mo106820e(null);
            this.f116844c.mo106816a();
            this.f116844c.mo106836w(null);
            this.f116848g = null;
            this.f116844c = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m140509j(int i, rlw rlwVar) {
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "CameraMediaSourceManager resetCamera !!!");
        nnl nnlVar = this.f116844c;
        if (nnlVar == null) {
            return false;
        }
        nnlVar.mo106834u(i, rlwVar);
        return this.f116844c.mo106823j(this.f116848g);
    }

    /* JADX INFO: renamed from: k */
    public void m140510k(Context context) {
        nnl nnlVar = this.f116844c;
        if (nnlVar == null || !(nnlVar instanceof fgw)) {
            return;
        }
        ((fgw) nnlVar).m121312p0(context);
    }

    /* JADX INFO: renamed from: l */
    public void m140511l(InterfaceC17717b interfaceC17717b) {
        this.f116843b = interfaceC17717b;
    }

    /* JADX INFO: renamed from: m */
    public void m140512m(tmw tmwVar) {
        this.f116849h = tmwVar;
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            nnlVar.mo106829p(new C17716a());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m140513n(fgw.InterfaceC16828h interfaceC16828h) {
        nnl nnlVar = this.f116844c;
        if (nnlVar == null || !(nnlVar instanceof fgw)) {
            return;
        }
        ((fgw) nnlVar).m121313q0(interfaceC16828h);
    }

    /* JADX INFO: renamed from: o */
    public void m140514o(Camera.ErrorCallback errorCallback) {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            nnlVar.mo106820e(errorCallback);
        }
    }

    @Override // p149l.nnl.InterfaceC18736a
    public void onData(byte[] bArr) {
        InterfaceC17717b interfaceC17717b = this.f116843b;
        if (interfaceC17717b != null) {
            interfaceC17717b.mo140520D(bArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m140515p(nnl.InterfaceC18741f interfaceC18741f) {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            nnlVar.mo106825l(interfaceC18741f);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m140516q(SurfaceTexture surfaceTexture) {
        nnl nnlVar = this.f116844c;
        if (nnlVar == null) {
            return false;
        }
        this.f116848g = surfaceTexture;
        return nnlVar.mo106823j(surfaceTexture);
    }

    /* JADX INFO: renamed from: r */
    public void m140517r() {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            nnlVar.mo106816a();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m140518s(int i, rlw rlwVar) {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            nnlVar.mo106810A(i, rlwVar);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m140519t(int i) {
        nnl nnlVar = this.f116844c;
        if (nnlVar != null) {
            return nnlVar.mo106832s(i);
        }
        return false;
    }
}
