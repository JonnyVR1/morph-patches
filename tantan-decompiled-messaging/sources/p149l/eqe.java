package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.immomo.velib.player.C3985a;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(15)
public class eqe extends skw implements SurfaceTexture.OnFrameAvailableListener, hwl, yul, zul, avl, cvl {

    /* JADX INFO: renamed from: G0 */
    long f92779G0;

    /* JADX INFO: renamed from: I0 */
    hwl.InterfaceC17419c f92781I0;

    /* JADX INFO: renamed from: J0 */
    hwl.InterfaceC17417a f92782J0;

    /* JADX INFO: renamed from: K0 */
    hwl.InterfaceC17420d f92783K0;

    /* JADX INFO: renamed from: L0 */
    hwl.InterfaceC17418b f92784L0;

    /* JADX INFO: renamed from: P0 */
    private C3985a f92788P0;

    /* JADX INFO: renamed from: X */
    private iqe f92789X;

    /* JADX INFO: renamed from: Y */
    protected bvl f92790Y;

    /* JADX INFO: renamed from: Z */
    String f92791Z;

    /* JADX INFO: renamed from: k0 */
    private Surface f92792k0;

    /* JADX INFO: renamed from: p0 */
    private Context f92793p0;

    /* JADX INFO: renamed from: E0 */
    int f92777E0 = 480;

    /* JADX INFO: renamed from: F0 */
    int f92778F0 = 480;

    /* JADX INFO: renamed from: H0 */
    boolean f92780H0 = false;

    /* JADX INFO: renamed from: M0 */
    int f92785M0 = 30;

    /* JADX INFO: renamed from: N0 */
    protected boolean f92786N0 = false;

    /* JADX INFO: renamed from: O0 */
    private boolean f92787O0 = false;

    public eqe(Context context, String str) {
        this.f92793p0 = context;
        this.f92791Z = str;
    }

    /* JADX INFO: renamed from: T */
    private void m117723T() {
        if (this.f74928h > 0) {
            GLES20.glDeleteTextures(1, new int[1], 0);
            this.f74928h = 0;
        }
    }

    /* JADX INFO: renamed from: V */
    private void m117724V() throws Exception {
        C3985a c3985a = this.f92788P0;
        if (c3985a != null) {
            this.f92790Y = c3985a.f14172m;
        }
        if (this.f92790Y == null) {
            this.f92790Y = wxb.m205977b();
        }
        try {
            this.f92790Y.init(this.f92793p0);
            this.f92790Y.mo104056c(this);
            this.f92790Y.mo104055b(this);
            this.f92790Y.mo104054a(this);
            this.f92790Y.mo104057d(this);
            this.f92790Y.setLooping(this.f92787O0);
            this.f92790Y.setDataSource(this.f92791Z);
            bvl bvlVar = this.f92790Y;
            if (bvlVar != null) {
                bvlVar.prepareAsync();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (this.f92790Y instanceof shh0) {
                m117738e0();
            } else {
                this.f92790Y = new shh0();
                m117724V();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private synchronized void m117725f0() {
        bvl bvlVar = this.f92790Y;
        if (bvlVar == null) {
            return;
        }
        bvlVar.release();
        Surface surface = this.f92792k0;
        if (surface != null) {
            surface.release();
            this.f92792k0 = null;
        }
    }

    /* JADX INFO: renamed from: U */
    public SurfaceTexture m117727U() {
        m117723T();
        if (this.f165023E == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.f74928h = iArr[0];
            this.f165023E = new SurfaceTexture(this.f74928h);
            vpe.m199230a("zk", "zk init ijk texture");
        }
        return this.f165023E;
    }

    /* JADX INFO: renamed from: W */
    public void m117728W(C3985a c3985a) {
        this.f92788P0 = c3985a;
    }

    /* JADX INFO: renamed from: X */
    public void m117729X(boolean z) {
        this.f92787O0 = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m117730Y(iqe iqeVar) {
        this.f92789X = iqeVar;
    }

    /* JADX INFO: renamed from: Z */
    public void m117731Z(hwl.InterfaceC17417a interfaceC17417a) {
        this.f92782J0 = interfaceC17417a;
    }

    @Override // p149l.yul
    /* JADX INFO: renamed from: a */
    public void mo117732a(bvl bvlVar) {
        hwl.InterfaceC17417a interfaceC17417a = this.f92782J0;
        if (interfaceC17417a != null) {
            interfaceC17417a.mo19578h(null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m117733a0(hwl.InterfaceC17418b interfaceC17418b) {
        this.f92784L0 = interfaceC17418b;
    }

    /* JADX INFO: renamed from: b0 */
    public void m117734b0(hwl.InterfaceC17419c interfaceC17419c) {
        this.f92781I0 = interfaceC17419c;
    }

    @Override // p149l.zul
    /* JADX INFO: renamed from: c */
    public boolean mo117735c(bvl bvlVar, int i, String str) {
        hwl.InterfaceC17418b interfaceC17418b = this.f92784L0;
        return interfaceC17418b != null && interfaceC17418b.mo19572b(this, i, str);
    }

    /* JADX INFO: renamed from: c0 */
    public void m117736c0(hwl.InterfaceC17420d interfaceC17420d) {
        this.f92783K0 = interfaceC17420d;
    }

    /* JADX INFO: renamed from: d0 */
    public synchronized void m117737d0() {
        this.f92779G0 = System.currentTimeMillis();
        vpe.m199230a("EffectPlayerInput", "openPublishHelp, start");
        if (this.f92790Y != null) {
            m117725f0();
            vpe.m199230a("EffectPlayerInput", "openPublishHelp, <release> cost time:" + (System.currentTimeMillis() - this.f92779G0) + "ms");
        }
        try {
            if (this.f165023E == null) {
                this.f165023E = m117727U();
                this.f92792k0 = new Surface(this.f165023E);
            }
            m117724V();
            vpe.m199230a("EffectPlayerInput", "openPublishHelp, end, cost time:" + (System.currentTimeMillis() - this.f92779G0) + "ms");
        } catch (Exception unused) {
            vpe.m199230a("EffectPlayerInput", "openPublishHelp Unable to open content: " + this.f92791Z);
            m117738e0();
            m117726S();
        }
    }

    @Override // p149l.cvl
    /* JADX INFO: renamed from: e */
    public void mo108878e(bvl bvlVar, int i, int i2) {
        int videoWidth = bvlVar.getVideoWidth();
        int videoHeight = bvlVar.getVideoHeight();
        this.f92777E0 = videoWidth;
        this.f92778F0 = videoHeight;
        SurfaceTexture surfaceTexture = this.f165023E;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(videoWidth, videoHeight);
        }
        mo101075E(videoWidth, videoHeight);
        this.f92786N0 = true;
        hwl.InterfaceC17419c interfaceC17419c = this.f92781I0;
        if (interfaceC17419c != null) {
            interfaceC17419c.mo19571a(this, videoWidth, videoHeight, i, i2);
        }
        vpe.m199230a("zk", "openPublishHelp onVideoSizeChanged:w=" + this.f74932l + ",h=" + this.f74933m + Constants.SEPARATOR_COMMA + videoWidth + Constants.SEPARATOR_COMMA + videoHeight);
    }

    /* JADX INFO: renamed from: e0 */
    public void m117738e0() {
        this.f92780H0 = false;
        m117725f0();
    }

    @Override // p149l.avl
    /* JADX INFO: renamed from: g */
    public void mo99203g(bvl bvlVar) {
        this.f92780H0 = true;
        this.f92777E0 = bvlVar.getVideoWidth();
        this.f92778F0 = bvlVar.getVideoHeight();
        vpe.m199230a("zk", "openPublishHelp, <onPrepared> cost time:" + (System.currentTimeMillis() - this.f92779G0) + "ms height" + this.f92777E0 + "height" + this.f92778F0);
        if (this.f165023E == null) {
            m117727U();
        }
        this.f165023E.setDefaultBufferSize(this.f92777E0, this.f92778F0);
        this.f165023E.setOnFrameAvailableListener(this);
        this.f92790Y.setSurface(this.f92792k0);
        bvlVar.start();
    }

    @Override // p149l.skw, p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        SurfaceTexture surfaceTexture = this.f165023E;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f165023E = null;
        }
        m117723T();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        vpe.m199230a("EffectPlayerInput", "onFrameAvailable");
        this.f92789X.m137752m();
    }

    @Override // p149l.skw, p149l.bcj
    @RequiresApi(api = 15)
    /* JADX INFO: renamed from: v */
    public void mo101087v() {
        super.mo101087v();
        if (this.f92790Y != null) {
            if (this.f165023E == null) {
                this.f165023E = m117727U();
            }
            if (this.f92792k0 == null) {
                this.f92792k0 = new Surface(this.f165023E);
            }
            this.f165023E.setDefaultBufferSize(this.f92777E0, this.f92778F0);
            this.f165023E.setOnFrameAvailableListener(this);
            this.f92790Y.setSurface(this.f92792k0);
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: w */
    public void mo101088w() {
        bvl bvlVar;
        hwl.InterfaceC17420d interfaceC17420d = this.f92783K0;
        if (interfaceC17420d != null && (bvlVar = this.f92790Y) != null) {
            interfaceC17420d.onRenderTimestampChanged(bvlVar.getCurrentPosition());
        }
        m184621R(this.f74928h, this.f165023E);
        super.mo101088w();
    }

    /* JADX INFO: renamed from: S */
    public void m117726S() {
    }
}
