package p149l;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class s2h0 extends eci0 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: B */
    private int f161980B;

    /* JADX INFO: renamed from: C */
    private SurfaceTexture f161981C;

    /* JADX INFO: renamed from: D */
    private Surface f161982D;

    /* JADX INFO: renamed from: E */
    private r2h0 f161983E;

    /* JADX INFO: renamed from: F */
    private Object f161984F;

    public s2h0(String str) {
        super(str);
        this.f161984F = new Object();
        m115713o0(1);
        m98670D(null);
    }

    /* JADX INFO: renamed from: L0 */
    private void m182059L0(int i) {
        MDLog.m7391e("huli", "set Rotation = " + i);
        r2h0 r2h0Var = this.f161983E;
        if (r2h0Var != null) {
            r2h0Var.m177606t(i);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m182060G0() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "SurfaceTextureRenderThread clearSurfaceTexture!!!");
        SurfaceTexture surfaceTexture = this.f161981C;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f161981C = null;
        }
        Surface surface = this.f161982D;
        if (surface != null) {
            surface.release();
            this.f161982D = null;
        }
    }

    @Override // p149l.eci0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture mo115708j0() {
        return this.f161981C;
    }

    /* JADX INFO: renamed from: I0 */
    public Surface m182062I0() {
        return this.f161982D;
    }

    /* JADX INFO: renamed from: J0 */
    public int m182063J0() {
        return this.f161980B;
    }

    /* JADX INFO: renamed from: K0 */
    public void m182064K0() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.f161980B = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f161980B);
        this.f161981C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f161982D = new Surface(this.f161981C);
    }

    /* JADX INFO: renamed from: M0 */
    public void m182065M0() {
        qie qieVar;
        if (this.f161981C == null || (qieVar = this.f90512k) == null) {
            return;
        }
        qieVar.m174872f();
        this.f161981C.updateTexImage();
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: f */
    public void mo98694f() {
        if (this.f161983E == null) {
            this.f161983E = new r2h0();
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: h */
    public void mo98696h() {
        super.mo98696h();
        r2h0 r2h0Var = this.f161983E;
        if (r2h0Var != null) {
            r2h0Var.m214830e();
            this.f161983E.m177607u(mo115708j0(), m182063J0());
            m115696C0(this.f161983E);
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: l */
    public void mo98700l(Message message) {
        int i = message.what;
        if (i == 1) {
            m182064K0();
        } else if (i == 2) {
            m182059L0(message.arg1);
        }
        snr snrVar = this.f90521t;
        if (snrVar != null) {
            snrVar.mo123489a(message);
        }
    }

    @Override // p149l.eci0, p149l.at2
    @TargetApi(18)
    /* JADX INFO: renamed from: m */
    public void mo98701m() {
        if (this.f90521t != null) {
            Message message = new Message();
            message.what = 265;
            this.f90521t.mo123489a(message);
        }
        super.mo98701m();
        m182060G0();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f161984F) {
            try {
                m115717s0();
                r2h0 r2h0Var = this.f161983E;
                if (r2h0Var != null && surfaceTexture != null) {
                    r2h0Var.m177607u(surfaceTexture, m182063J0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: p */
    public void mo98704p() {
        qie qieVar;
        if (this.f161981C != null && (qieVar = this.f90512k) != null) {
            qieVar.m174872f();
            this.f161981C.updateTexImage();
        }
        super.mo98704p();
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: u */
    public void mo98709u() {
        super.mo98709u();
    }

    @Override // p149l.eci0
    /* JADX INFO: renamed from: x0 */
    public void mo111004x0(int i) {
        m115714p0(2, i);
    }

    @Override // p149l.eci0, p149l.at2
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: y */
    public void mo98713y(tif0 tif0Var) {
        if (this.f161981C != null) {
            MDLog.m7391e("huli", "input render mInputSurfaceTexture " + tif0Var.m189184b());
            this.f161981C.setDefaultBufferSize(tif0Var.m189184b(), tif0Var.m189183a());
        }
        if (this.f161983E != null) {
            MDLog.m7391e("huli", "input render setSize + " + tif0Var.m189184b());
            this.f161983E.mo177605n(tif0Var);
        }
    }
}
