package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.immomo.velib.player.C4136a;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(15)
public class ire extends rnw implements SurfaceTexture.OnFrameAvailableListener, zyl, qxl, rxl, sxl, uxl {

    /* JADX INFO: renamed from: G0 */
    long f116529G0;

    /* JADX INFO: renamed from: I0 */
    zyl.InterfaceC21934c f116531I0;

    /* JADX INFO: renamed from: J0 */
    zyl.InterfaceC21932a f116532J0;

    /* JADX INFO: renamed from: K0 */
    zyl.InterfaceC21935d f116533K0;

    /* JADX INFO: renamed from: L0 */
    zyl.InterfaceC21933b f116534L0;

    /* JADX INFO: renamed from: P0 */
    private C4136a f116538P0;

    /* JADX INFO: renamed from: X */
    private mre f116539X;

    /* JADX INFO: renamed from: Y */
    protected txl f116540Y;

    /* JADX INFO: renamed from: Z */
    String f116541Z;

    /* JADX INFO: renamed from: k0 */
    private Surface f116542k0;

    /* JADX INFO: renamed from: p0 */
    private Context f116543p0;

    /* JADX INFO: renamed from: E0 */
    int f116527E0 = 480;

    /* JADX INFO: renamed from: F0 */
    int f116528F0 = 480;

    /* JADX INFO: renamed from: H0 */
    boolean f116530H0 = false;

    /* JADX INFO: renamed from: M0 */
    int f116535M0 = 30;

    /* JADX INFO: renamed from: N0 */
    protected boolean f116536N0 = false;

    /* JADX INFO: renamed from: O0 */
    private boolean f116537O0 = false;

    public ire(Context context, String str) {
        this.f116543p0 = context;
        this.f116541Z = str;
    }

    /* JADX INFO: renamed from: T */
    private void m141791T() {
        if (this.f183786h > 0) {
            GLES20.glDeleteTextures(1, new int[1], 0);
            this.f183786h = 0;
        }
    }

    /* JADX INFO: renamed from: V */
    private void m141792V() throws Exception {
        C4136a c4136a = this.f116538P0;
        if (c4136a != null) {
            this.f116540Y = c4136a.f14891m;
        }
        if (this.f116540Y == null) {
            this.f116540Y = kzb.m152164b();
        }
        try {
            this.f116540Y.init(this.f116543p0);
            this.f116540Y.mo130839c(this);
            this.f116540Y.mo130838b(this);
            this.f116540Y.mo130837a(this);
            this.f116540Y.mo130840d(this);
            this.f116540Y.setLooping(this.f116537O0);
            this.f116540Y.setDataSource(this.f116541Z);
            txl txlVar = this.f116540Y;
            if (txlVar != null) {
                txlVar.prepareAsync();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (this.f116540Y instanceof zph0) {
                m141807e0();
            } else {
                this.f116540Y = new zph0();
                m141792V();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private synchronized void m141793f0() {
        txl txlVar = this.f116540Y;
        if (txlVar == null) {
            return;
        }
        txlVar.release();
        Surface surface = this.f116542k0;
        if (surface != null) {
            surface.release();
            this.f116542k0 = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public SurfaceTexture m141795U() {
        m141791T();
        if (this.f164114E == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.f183786h = iArr[0];
            this.f164114E = new SurfaceTexture(this.f183786h);
            zqe.m221010a("zk", "zk init ijk texture");
        }
        return this.f164114E;
    }

    /* JADX INFO: renamed from: W */
    public void m141796W(C4136a c4136a) {
        this.f116538P0 = c4136a;
    }

    /* JADX INFO: renamed from: X */
    public void m141797X(boolean z) {
        this.f116537O0 = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m141798Y(mre mreVar) {
        this.f116539X = mreVar;
    }

    /* JADX INFO: renamed from: Z */
    public void m141799Z(zyl.InterfaceC21932a interfaceC21932a) {
        this.f116532J0 = interfaceC21932a;
    }

    @Override // p153l.qxl
    /* JADX INFO: renamed from: a */
    public void mo141800a(txl txlVar) {
        zyl.InterfaceC21932a interfaceC21932a = this.f116532J0;
        if (interfaceC21932a != null) {
            interfaceC21932a.mo20577h(null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m141801a0(zyl.InterfaceC21933b interfaceC21933b) {
        this.f116534L0 = interfaceC21933b;
    }

    /* JADX INFO: renamed from: b0 */
    public void m141802b0(zyl.InterfaceC21934c interfaceC21934c) {
        this.f116531I0 = interfaceC21934c;
    }

    @Override // p153l.rxl
    /* JADX INFO: renamed from: c */
    public boolean mo141803c(txl txlVar, int i, String str) {
        zyl.InterfaceC21933b interfaceC21933b = this.f116534L0;
        return interfaceC21933b != null && interfaceC21933b.mo20571b(this, i, str);
    }

    /* JADX INFO: renamed from: c0 */
    public void m141804c0(zyl.InterfaceC21935d interfaceC21935d) {
        this.f116533K0 = interfaceC21935d;
    }

    /* JADX INFO: renamed from: d0 */
    public synchronized void m141805d0() {
        this.f116529G0 = System.currentTimeMillis();
        zqe.m221010a("EffectPlayerInput", "openPublishHelp, start");
        if (this.f116540Y != null) {
            m141793f0();
            zqe.m221010a("EffectPlayerInput", "openPublishHelp, <release> cost time:" + (System.currentTimeMillis() - this.f116529G0) + "ms");
        }
        try {
            if (this.f164114E == null) {
                this.f164114E = m141795U();
                this.f116542k0 = new Surface(this.f164114E);
            }
            m141792V();
            zqe.m221010a("EffectPlayerInput", "openPublishHelp, end, cost time:" + (System.currentTimeMillis() - this.f116529G0) + "ms");
        } catch (Exception unused) {
            zqe.m221010a("EffectPlayerInput", "openPublishHelp Unable to open content: " + this.f116541Z);
            m141807e0();
            m141794S();
        }
    }

    @Override // p153l.uxl
    /* JADX INFO: renamed from: e */
    public void mo141806e(txl txlVar, int i, int i2) {
        int videoWidth = txlVar.getVideoWidth();
        int videoHeight = txlVar.getVideoHeight();
        this.f116527E0 = videoWidth;
        this.f116528F0 = videoHeight;
        SurfaceTexture surfaceTexture = this.f164114E;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(videoWidth, videoHeight);
        }
        mo162984E(videoWidth, videoHeight);
        this.f116536N0 = true;
        zyl.InterfaceC21934c interfaceC21934c = this.f116531I0;
        if (interfaceC21934c != null) {
            interfaceC21934c.mo20570a(this, videoWidth, videoHeight, i, i2);
        }
        zqe.m221010a("zk", "openPublishHelp onVideoSizeChanged:w=" + this.f183790l + ",h=" + this.f183791m + Constants.SEPARATOR_COMMA + videoWidth + Constants.SEPARATOR_COMMA + videoHeight);
    }

    /* JADX INFO: renamed from: e0 */
    public void m141807e0() {
        this.f116530H0 = false;
        m141793f0();
    }

    @Override // p153l.sxl
    /* JADX INFO: renamed from: g */
    public void mo141808g(txl txlVar) {
        this.f116530H0 = true;
        this.f116527E0 = txlVar.getVideoWidth();
        this.f116528F0 = txlVar.getVideoHeight();
        zqe.m221010a("zk", "openPublishHelp, <onPrepared> cost time:" + (System.currentTimeMillis() - this.f116529G0) + "ms height" + this.f116527E0 + "height" + this.f116528F0);
        if (this.f164114E == null) {
            m141795U();
        }
        this.f164114E.setDefaultBufferSize(this.f116527E0, this.f116528F0);
        this.f164114E.setOnFrameAvailableListener(this);
        this.f116540Y.setSurface(this.f116542k0);
        txlVar.start();
    }

    @Override // p153l.rnw, p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        SurfaceTexture surfaceTexture = this.f164114E;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f164114E = null;
        }
        m141791T();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        zqe.m221010a("EffectPlayerInput", "onFrameAvailable");
        this.f116539X.m159693m();
    }

    @Override // p153l.rnw, p153l.vej
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: v */
    public void mo141809v() {
        super.mo141809v();
        if (this.f116540Y != null) {
            if (this.f164114E == null) {
                this.f164114E = m141795U();
            }
            if (this.f116542k0 == null) {
                this.f116542k0 = new Surface(this.f164114E);
            }
            this.f164114E.setDefaultBufferSize(this.f116527E0, this.f116528F0);
            this.f164114E.setOnFrameAvailableListener(this);
            this.f116540Y.setSurface(this.f116542k0);
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: w */
    public void mo141810w() {
        txl txlVar;
        zyl.InterfaceC21935d interfaceC21935d = this.f116533K0;
        if (interfaceC21935d != null && (txlVar = this.f116540Y) != null) {
            interfaceC21935d.onRenderTimestampChanged(txlVar.getCurrentPosition());
        }
        m182351R(this.f183786h, this.f164114E);
        super.mo141810w();
    }

    /* JADX INFO: renamed from: S */
    public void m141794S() {
    }
}
