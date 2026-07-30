package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.immomo.mediacore.sink.CongressUtil;
import tv.danmaku.ijk.media.player.IjkConfMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public class sti0 extends qnw implements z5m, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    CongressUtil f170571A;

    /* JADX INFO: renamed from: B */
    IjkConfMediaPlayer f170572B;

    /* JADX INFO: renamed from: C */
    gkl0.InterfaceC17240c f170573C;

    /* JADX INFO: renamed from: D */
    long f170574D;

    /* JADX INFO: renamed from: E */
    Runnable f170575E;

    /* JADX INFO: renamed from: F */
    private Handler f170576F;

    /* JADX INFO: renamed from: v */
    g510 f170577v;

    /* JADX INFO: renamed from: x */
    private C20146b f170578x;

    /* JADX INFO: renamed from: y */
    int f170579y;

    /* JADX INFO: renamed from: z */
    long f170580z;

    /* JADX INFO: renamed from: l.sti0$a */
    public class RunnableC20145a implements Runnable {
        public RunnableC20145a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>2 onFrameAvailable" + sti0.this.f170574D + "《》" + this);
            sti0.this.getClass();
        }
    }

    public sti0(long j, int i, int i2, gkl0.InterfaceC17240c interfaceC17240c) {
        this.f170579y = 15;
        this.f170580z = 10000L;
        this.f170573C = null;
        this.f170575E = null;
        this.f170576F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f170571A = null;
        this.f170574D = j;
        this.f170573C = interfaceC17240c;
    }

    @Override // p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        this.f170577v = g510Var;
    }

    /* JADX INFO: renamed from: Q1 */
    public int m187867Q1() {
        return getHeight();
    }

    /* JADX INFO: renamed from: R1 */
    public int m187868R1() {
        return getWidth();
    }

    @Override // p153l.qnw, p153l.gfj, p153l.wej
    public void destroy() {
        this.f158650b = null;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "destorytextIn:" + this.texture_in);
        super.destroy();
    }

    public SurfaceTexture getScreenTexture() {
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

    @Override // p153l.qnw, p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        Surface surface = new Surface(getScreenTexture());
        this.f158650b.setOnFrameAvailableListener(this);
        IjkConfMediaPlayer ijkConfMediaPlayer = this.f170572B;
        if (ijkConfMediaPlayer != null) {
            ijkConfMediaPlayer.setSurfaceH(surface);
        }
        CongressUtil congressUtil = this.f170571A;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(this.f170574D, surface);
        }
        gkl0.InterfaceC17240c interfaceC17240c = this.f170573C;
        if (interfaceC17240c != null) {
            interfaceC17240c.mo21063a(this.f158650b);
        }
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        loadTexture(this.texture_in, this.f158650b);
        super.onDrawFrame();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>1 onFrameAvailable" + this.f170574D + "《》" + this);
        if (this.f170575E == null) {
            this.f170575E = new RunnableC20145a();
        }
        Handler handler = this.f170576F;
        if (handler != null) {
            handler.removeCallbacks(this.f170575E);
            this.f170576F.postDelayed(this.f170575E, this.f170580z);
        }
    }

    @Override // p153l.qnw, p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    @Override // p153l.z5m
    public void setFps(int i) {
        this.f170579y = i;
    }

    public void start() {
        if (this.f170578x == null) {
            C20146b c20146b = new C20146b(this, null);
            this.f170578x = c20146b;
            c20146b.start();
        }
    }

    public void stop() {
        Runnable runnable;
        C20146b c20146b = this.f170578x;
        if (c20146b != null) {
            c20146b.m187869a();
            this.f170578x = null;
        }
        Handler handler = this.f170576F;
        if (handler != null && (runnable = this.f170575E) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f170571A = null;
        this.f170572B = null;
        this.f170574D = 0L;
    }

    /* JADX INFO: renamed from: l.sti0$b */
    public class C20146b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f170582a;

        /* JADX INFO: renamed from: b */
        private boolean f170583b;

        private C20146b() {
            this.f170582a = false;
            this.f170583b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m187869a() {
            this.f170582a = true;
            interrupt();
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f170582a) {
                try {
                    g510 g510Var = sti0.this.f170577v;
                    if (g510Var != null && !this.f170583b) {
                        g510Var.m129004z(null);
                    }
                    Thread.sleep(1000 / sti0.this.f170579y);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ C20146b(sti0 sti0Var, RunnableC20145a runnableC20145a) {
            this();
        }
    }

    @Override // p153l.z5m
    public gfj getInput() {
        return this;
    }

    public sti0(long j, int i, int i2, CongressUtil congressUtil) {
        this.f170579y = 15;
        this.f170580z = 10000L;
        this.f170573C = null;
        this.f170575E = null;
        this.f170576F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f170571A = congressUtil;
        this.f170574D = j;
    }
}
