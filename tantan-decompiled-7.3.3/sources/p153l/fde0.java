package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.immomo.momomediaext.sei.BaseSei;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes8.dex */
public class fde0 extends qnw implements SurfaceTexture.OnFrameAvailableListener, m5m {

    /* JADX INFO: renamed from: A */
    private uow f98455A;

    /* JADX INFO: renamed from: E */
    private MediaProjection f98459E;

    /* JADX INFO: renamed from: v */
    private VirtualDisplay f98462v;

    /* JADX INFO: renamed from: x */
    private Surface f98463x;

    /* JADX INFO: renamed from: y */
    private g510 f98464y;

    /* JADX INFO: renamed from: z */
    private C16955c f98465z;

    /* JADX INFO: renamed from: B */
    private int f98456B = 15;

    /* JADX INFO: renamed from: C */
    private int f98457C = 0;

    /* JADX INFO: renamed from: F */
    private boolean f98460F = false;

    /* JADX INFO: renamed from: D */
    private float[] f98458D = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: G */
    private MediaProjection.Callback f98461G = new C16953a();

    /* JADX INFO: renamed from: l.fde0$a */
    public class C16953a extends MediaProjection.Callback {
        public C16953a() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "MediaProjection stopped by user");
            fde0.this.m125096V1();
        }
    }

    /* JADX INFO: renamed from: l.fde0$b */
    public class C16954b extends MediaProjection.Callback {
        public C16954b() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            fde0.this.m125096V1();
        }
    }

    /* JADX INFO: renamed from: l.fde0$c */
    public class C16955c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f98468a;

        /* JADX INFO: renamed from: b */
        private boolean f98469b;

        public C16955c(String str) {
            super(str);
            this.f98468a = false;
            this.f98469b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m125100a() {
            this.f98468a = true;
            interrupt();
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f98468a) {
                try {
                    Thread.sleep(1000 / fde0.this.f98456B);
                    if (fde0.this.f98464y != null && !this.f98469b) {
                        fde0.this.f98464y.m129004z(null);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m125094T1() {
        uow uowVar = this.f98455A;
        int[] iArr = uowVar.f180177V0;
        int i = iArr[1];
        int i2 = iArr[2];
        int i3 = iArr[3];
        int i4 = iArr[4];
        int i5 = i + i3;
        int i6 = i2 + i4;
        int i7 = uowVar.f180190y0;
        if (i5 > i7) {
            i5 = i7;
        }
        int i8 = uowVar.f180191z0;
        if (i6 > i8) {
            i6 = i8;
        }
        float f = (i / i7) + 0.0f;
        float f2 = i5 / i7;
        float f3 = i6 / i8;
        float f4 = (i2 / i8) + 0.0f;
        float[] fArr = {f, f3, f2, f3, f, f4, f2, f4};
        this.f98458D = fArr;
        this.textureVertices[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(this.f98458D).position(0);
        this.width = i3;
        this.height = i4;
    }

    @RequiresApi(api = 34)
    /* JADX INFO: renamed from: U1 */
    private void m125095U1(int i, int i2) {
        try {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Handling configuration change: " + i + BaseSei.f14624X + i2);
            SurfaceTexture surfaceTexture = this.f158650b;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            Surface surface = this.f98463x;
            if (surface != null) {
                surface.release();
            }
            this.f98463x = new Surface(this.f158650b);
            VirtualDisplay virtualDisplay = this.f98462v;
            if (virtualDisplay != null) {
                virtualDisplay.resize(i, i2, 1);
                this.f98462v.setSurface(this.f98463x);
            }
            setRenderSize(i, i2);
        } catch (Exception e) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Failed to handle configuration change: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m125096V1() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "MediaProjection stopped, cleaning up resources");
        this.f98460F = false;
        VirtualDisplay virtualDisplay = this.f98462v;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.f98462v.release();
            this.f98462v = null;
        }
        Surface surface = this.f98463x;
        if (surface != null) {
            surface.release();
            this.f98463x = null;
        }
        C16955c c16955c = this.f98465z;
        if (c16955c != null) {
            c16955c.m125100a();
            this.f98465z = null;
        }
        this.f98459E = null;
    }

    private SurfaceTexture getScreenTexture() {
        if (this.f158650b == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.texture_in = iArr[0];
            this.f158650b = new SurfaceTexture(this.texture_in);
        }
        return this.f158650b;
    }

    @Override // p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        this.f98464y = g510Var;
    }

    @Override // p153l.m5m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P1 */
    public void mo125097P1() {
        MediaProjection.Callback callback;
        oq70.m168791d();
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "stopScreenRecord");
        this.f98460F = false;
        VirtualDisplay virtualDisplay = this.f98462v;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.f98462v.release();
            this.f98462v = null;
        }
        C16955c c16955c = this.f98465z;
        if (c16955c != null) {
            c16955c.m125100a();
            this.f98465z = null;
        }
        Surface surface = this.f98463x;
        if (surface != null) {
            surface.release();
            this.f98463x = null;
        }
        MediaProjection mediaProjection = this.f98459E;
        if (mediaProjection == null || (callback = this.f98461G) == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                mediaProjection.unregisterCallback(callback);
            }
        } catch (Exception e) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Failed to unregister MediaProjection callback: " + e.getMessage());
        }
        this.f98459E = null;
    }

    @Override // p153l.m5m
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: U0 */
    public void mo125098U0(uow uowVar, MediaProjection mediaProjection) throws Exception {
        MediaProjection.Callback callback;
        try {
            if (this.f98460F) {
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Cannot reuse MediaProjection - active session exists");
                throw new IllegalStateException("MediaProjection is already in use. For Android 14+, each MediaProjection can only be used once.");
            }
            this.f98455A = uowVar;
            this.f98459E = mediaProjection;
            if (Build.VERSION.SDK_INT >= 34 && (callback = this.f98461G) != null) {
                mediaProjection.registerCallback(callback, null);
            }
            this.f98460F = true;
            m125099W1(0, mediaProjection);
            if (this.f98465z == null) {
                C16955c c16955c = new C16955c("live-media-SInput");
                this.f98465z = c16955c;
                c16955c.start();
            }
            this.f98464y.m129004z(null);
        } catch (Exception e) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Failed to start screen record: " + e.getMessage());
            e.printStackTrace();
            this.f98460F = false;
            this.f98459E = null;
            throw e;
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: W1 */
    public void m125099W1(int i, MediaProjection mediaProjection) {
        int i2;
        int i3;
        synchronized (getLockObject()) {
            try {
                uow uowVar = this.f98455A;
                int i4 = uowVar.f180190y0;
                int i5 = uowVar.f180191z0;
                if (i == 90 || i == 270) {
                    i2 = i5;
                    i3 = i4;
                } else {
                    i3 = i5;
                    i2 = i4;
                }
                VirtualDisplay virtualDisplay = this.f98462v;
                if (virtualDisplay != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        m125095U1(i2, i3);
                        return;
                    } else {
                        virtualDisplay.setSurface(null);
                        this.f98462v.release();
                        this.f98462v = null;
                    }
                }
                if (this.f158650b == null) {
                    this.f158650b = getScreenTexture();
                    this.f98463x = new Surface(this.f158650b);
                }
                this.f158650b.setDefaultBufferSize(i2, i3);
                this.f158650b.setOnFrameAvailableListener(this);
                try {
                    this.f98462v = mediaProjection.createVirtualDisplay("MainScreen", i2, i3, 1, 19, this.f98463x, null, null);
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "VirtualDisplay created successfully: " + i2 + BaseSei.f14624X + i3);
                    if (Build.VERSION.SDK_INT < 34) {
                        mediaProjection.registerCallback(new C16954b(), null);
                    }
                    if (i == 90 || i == 270) {
                        changeCurRotation(i);
                    } else {
                        changeCurRotation(0);
                    }
                    setRenderSize(i2, i3);
                    flipPosition(2);
                    flipPosition(1);
                    int[] iArr = this.f98455A.f180177V0;
                    if (iArr != null && iArr[0] == 1) {
                        m125094T1();
                    }
                } catch (SecurityException e) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SecurityException: MediaProjection cannot be reused for Android 14+");
                    this.f98460F = false;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.qnw, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        mo125097P1();
        C16955c c16955c = this.f98465z;
        if (c16955c != null) {
            c16955c.m125100a();
            this.f98465z = null;
        }
        Surface surface = this.f98463x;
        if (surface != null) {
            surface.release();
            this.f98463x = null;
        }
        this.f98461G = null;
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "onDrawFrame");
        loadTexture(this.texture_in, this.f158650b);
        super.onDrawFrame();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
    }

    @Override // p153l.z5m
    public void setFps(int i) {
        this.f98456B = i;
    }

    @Override // p153l.z5m
    public gfj getInput() {
        return this;
    }
}
