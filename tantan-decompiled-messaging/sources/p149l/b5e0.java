package p149l;

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

/* JADX INFO: loaded from: classes6.dex */
public class b5e0 extends rkw implements SurfaceTexture.OnFrameAvailableListener, u2m {

    /* JADX INFO: renamed from: A */
    private vlw f73636A;

    /* JADX INFO: renamed from: E */
    private MediaProjection f73640E;

    /* JADX INFO: renamed from: v */
    private VirtualDisplay f73643v;

    /* JADX INFO: renamed from: x */
    private Surface f73644x;

    /* JADX INFO: renamed from: y */
    private yw00 f73645y;

    /* JADX INFO: renamed from: z */
    private C15811c f73646z;

    /* JADX INFO: renamed from: B */
    private int f73637B = 15;

    /* JADX INFO: renamed from: C */
    private int f73638C = 0;

    /* JADX INFO: renamed from: F */
    private boolean f73641F = false;

    /* JADX INFO: renamed from: D */
    private float[] f73639D = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: G */
    private MediaProjection.Callback f73642G = new C15809a();

    /* JADX INFO: renamed from: l.b5e0$a */
    public class C15809a extends MediaProjection.Callback {
        public C15809a() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "MediaProjection stopped by user");
            b5e0.this.m100322V1();
        }
    }

    /* JADX INFO: renamed from: l.b5e0$b */
    public class C15810b extends MediaProjection.Callback {
        public C15810b() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            b5e0.this.m100322V1();
        }
    }

    /* JADX INFO: renamed from: l.b5e0$c */
    public class C15811c extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f73649a;

        /* JADX INFO: renamed from: b */
        private boolean f73650b;

        public C15811c(String str) {
            super(str);
            this.f73649a = false;
            this.f73650b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m100327a() {
            this.f73649a = true;
            interrupt();
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f73649a) {
                try {
                    Thread.sleep(1000 / b5e0.this.f73637B);
                    if (b5e0.this.f73645y != null && !this.f73650b) {
                        b5e0.this.f73645y.m216289z(null);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m100320T1() {
        vlw vlwVar = this.f73636A;
        int[] iArr = vlwVar.f182033V0;
        int i = iArr[1];
        int i2 = iArr[2];
        int i3 = iArr[3];
        int i4 = iArr[4];
        int i5 = i + i3;
        int i6 = i2 + i4;
        int i7 = vlwVar.f182046y0;
        if (i5 > i7) {
            i5 = i7;
        }
        int i8 = vlwVar.f182047z0;
        if (i6 > i8) {
            i6 = i8;
        }
        float f = (i / i7) + 0.0f;
        float f2 = i5 / i7;
        float f3 = i6 / i8;
        float f4 = (i2 / i8) + 0.0f;
        float[] fArr = {f, f3, f2, f3, f, f4, f2, f4};
        this.f73639D = fArr;
        this.textureVertices[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(this.f73639D).position(0);
        this.width = i3;
        this.height = i4;
    }

    @RequiresApi(api = 34)
    /* JADX INFO: renamed from: U1 */
    private void m100321U1(int i, int i2) {
        try {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Handling configuration change: " + i + BaseSei.f13930X + i2);
            SurfaceTexture surfaceTexture = this.f159894b;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            Surface surface = this.f73644x;
            if (surface != null) {
                surface.release();
            }
            this.f73644x = new Surface(this.f159894b);
            VirtualDisplay virtualDisplay = this.f73643v;
            if (virtualDisplay != null) {
                virtualDisplay.resize(i, i2, 1);
                this.f73643v.setSurface(this.f73644x);
            }
            setRenderSize(i, i2);
        } catch (Exception e) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Failed to handle configuration change: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m100322V1() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "MediaProjection stopped, cleaning up resources");
        this.f73641F = false;
        VirtualDisplay virtualDisplay = this.f73643v;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.f73643v.release();
            this.f73643v = null;
        }
        Surface surface = this.f73644x;
        if (surface != null) {
            surface.release();
            this.f73644x = null;
        }
        C15811c c15811c = this.f73646z;
        if (c15811c != null) {
            c15811c.m100327a();
            this.f73646z = null;
        }
        this.f73640E = null;
    }

    private SurfaceTexture getScreenTexture() {
        if (this.f159894b == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.texture_in = iArr[0];
            this.f159894b = new SurfaceTexture(this.texture_in);
        }
        return this.f159894b;
    }

    @Override // p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        this.f73645y = yw00Var;
    }

    @Override // p149l.u2m
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: P1 */
    public void mo100324P1() {
        MediaProjection.Callback callback;
        ii70.m136344d();
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "stopScreenRecord");
        this.f73641F = false;
        VirtualDisplay virtualDisplay = this.f73643v;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.f73643v.release();
            this.f73643v = null;
        }
        C15811c c15811c = this.f73646z;
        if (c15811c != null) {
            c15811c.m100327a();
            this.f73646z = null;
        }
        Surface surface = this.f73644x;
        if (surface != null) {
            surface.release();
            this.f73644x = null;
        }
        MediaProjection mediaProjection = this.f73640E;
        if (mediaProjection == null || (callback = this.f73642G) == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                mediaProjection.unregisterCallback(callback);
            }
        } catch (Exception e) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Failed to unregister MediaProjection callback: " + e.getMessage());
        }
        this.f73640E = null;
    }

    @Override // p149l.u2m
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: U0 */
    public void mo100325U0(vlw vlwVar, MediaProjection mediaProjection) throws Exception {
        MediaProjection.Callback callback;
        try {
            if (this.f73641F) {
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Cannot reuse MediaProjection - active session exists");
                throw new IllegalStateException("MediaProjection is already in use. For Android 14+, each MediaProjection can only be used once.");
            }
            this.f73636A = vlwVar;
            this.f73640E = mediaProjection;
            if (Build.VERSION.SDK_INT >= 34 && (callback = this.f73642G) != null) {
                mediaProjection.registerCallback(callback, null);
            }
            this.f73641F = true;
            m100326W1(0, mediaProjection);
            if (this.f73646z == null) {
                C15811c c15811c = new C15811c("live-media-SInput");
                this.f73646z = c15811c;
                c15811c.start();
            }
            this.f73645y.m216289z(null);
        } catch (Exception e) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Failed to start screen record: " + e.getMessage());
            e.printStackTrace();
            this.f73641F = false;
            this.f73640E = null;
            throw e;
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: W1 */
    public void m100326W1(int i, MediaProjection mediaProjection) {
        int i2;
        int i3;
        synchronized (getLockObject()) {
            try {
                vlw vlwVar = this.f73636A;
                int i4 = vlwVar.f182046y0;
                int i5 = vlwVar.f182047z0;
                if (i == 90 || i == 270) {
                    i2 = i5;
                    i3 = i4;
                } else {
                    i3 = i5;
                    i2 = i4;
                }
                VirtualDisplay virtualDisplay = this.f73643v;
                if (virtualDisplay != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        m100321U1(i2, i3);
                        return;
                    } else {
                        virtualDisplay.setSurface(null);
                        this.f73643v.release();
                        this.f73643v = null;
                    }
                }
                if (this.f159894b == null) {
                    this.f159894b = getScreenTexture();
                    this.f73644x = new Surface(this.f159894b);
                }
                this.f159894b.setDefaultBufferSize(i2, i3);
                this.f159894b.setOnFrameAvailableListener(this);
                try {
                    this.f73643v = mediaProjection.createVirtualDisplay("MainScreen", i2, i3, 1, 19, this.f73644x, null, null);
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "VirtualDisplay created successfully: " + i2 + BaseSei.f13930X + i3);
                    if (Build.VERSION.SDK_INT < 34) {
                        mediaProjection.registerCallback(new C15810b(), null);
                    }
                    if (i == 90 || i == 270) {
                        changeCurRotation(i);
                    } else {
                        changeCurRotation(0);
                    }
                    setRenderSize(i2, i3);
                    flipPosition(2);
                    flipPosition(1);
                    int[] iArr = this.f73636A.f182033V0;
                    if (iArr != null && iArr[0] == 1) {
                        m100320T1();
                    }
                } catch (SecurityException e) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SecurityException: MediaProjection cannot be reused for Android 14+");
                    this.f73641F = false;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.rkw, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        mo100324P1();
        C15811c c15811c = this.f73646z;
        if (c15811c != null) {
            c15811c.m100327a();
            this.f73646z = null;
        }
        Surface surface = this.f73644x;
        if (surface != null) {
            surface.release();
            this.f73644x = null;
        }
        this.f73642G = null;
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "onDrawFrame");
        loadTexture(this.texture_in, this.f159894b);
        super.onDrawFrame();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
    }

    @Override // p149l.i3m
    public void setFps(int i) {
        this.f73637B = i;
    }

    @Override // p149l.i3m
    public mcj getInput() {
        return this;
    }
}
