package p153l;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class abh0 extends eli0 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: B */
    private int f69622B;

    /* JADX INFO: renamed from: C */
    private SurfaceTexture f69623C;

    /* JADX INFO: renamed from: D */
    private Surface f69624D;

    /* JADX INFO: renamed from: E */
    private zah0 f69625E;

    /* JADX INFO: renamed from: F */
    private Object f69626F;

    public abh0(String str) {
        super(str);
        this.f69626F = new Object();
        m121210o0(1);
        m177846D(null);
    }

    /* JADX INFO: renamed from: L0 */
    private void m96754L0(int i) {
        MDLog.m7445e("huli", "set Rotation = " + i);
        zah0 zah0Var = this.f69625E;
        if (zah0Var != null) {
            zah0Var.m219124t(i);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m96755G0() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "SurfaceTextureRenderThread clearSurfaceTexture!!!");
        SurfaceTexture surfaceTexture = this.f69623C;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f69623C = null;
        }
        Surface surface = this.f69624D;
        if (surface != null) {
            surface.release();
            this.f69624D = null;
        }
    }

    @Override // p153l.eli0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public SurfaceTexture mo96763j0() {
        return this.f69623C;
    }

    /* JADX INFO: renamed from: I0 */
    public Surface m96757I0() {
        return this.f69624D;
    }

    /* JADX INFO: renamed from: J0 */
    public int m96758J0() {
        return this.f69622B;
    }

    /* JADX INFO: renamed from: K0 */
    public void m96759K0() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.f69622B = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f69622B);
        this.f69623C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f69624D = new Surface(this.f69623C);
    }

    /* JADX INFO: renamed from: M0 */
    public void m96760M0() {
        uje ujeVar;
        if (this.f69623C == null || (ujeVar = this.f94544k) == null) {
            return;
        }
        ujeVar.m196327f();
        this.f69623C.updateTexImage();
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: f */
    public void mo96761f() {
        if (this.f69625E == null) {
            this.f69625E = new zah0();
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: h */
    public void mo96762h() {
        super.mo96762h();
        zah0 zah0Var = this.f69625E;
        if (zah0Var != null) {
            zah0Var.m104823e();
            this.f69625E.m219125u(mo96763j0(), m96758J0());
            m121183C0(this.f69625E);
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: l */
    public void mo96764l(Message message) {
        int i = message.what;
        if (i == 1) {
            m96759K0();
        } else if (i == 2) {
            m96754L0(message.arg1);
        }
        tpr tprVar = this.f94553t;
        if (tprVar != null) {
            tprVar.mo161502a(message);
        }
    }

    @Override // p153l.eli0, p153l.qt2
    @TargetApi(18)
    /* JADX INFO: renamed from: m */
    public void mo96765m() {
        if (this.f94553t != null) {
            Message message = new Message();
            message.what = 265;
            this.f94553t.mo161502a(message);
        }
        super.mo96765m();
        m96755G0();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f69626F) {
            try {
                m121215s0();
                zah0 zah0Var = this.f69625E;
                if (zah0Var != null && surfaceTexture != null) {
                    zah0Var.m219125u(surfaceTexture, m96758J0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: p */
    public void mo96766p() {
        uje ujeVar;
        if (this.f69623C != null && (ujeVar = this.f94544k) != null) {
            ujeVar.m196327f();
            this.f69623C.updateTexImage();
        }
        super.mo96766p();
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: u */
    public void mo96767u() {
        super.mo96767u();
    }

    @Override // p153l.eli0
    /* JADX INFO: renamed from: x0 */
    public void mo96768x0(int i) {
        m121211p0(2, i);
    }

    @Override // p153l.eli0, p153l.qt2
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: y */
    public void mo96769y(crf0 crf0Var) {
        if (this.f69623C != null) {
            MDLog.m7445e("huli", "input render mInputSurfaceTexture " + crf0Var.m112050b());
            this.f69623C.setDefaultBufferSize(crf0Var.m112050b(), crf0Var.m112049a());
        }
        if (this.f69625E != null) {
            MDLog.m7445e("huli", "input render setSize + " + crf0Var.m112050b());
            this.f69625E.mo104832n(crf0Var);
        }
    }
}
