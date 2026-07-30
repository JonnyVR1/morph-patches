package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.immomo.mediacore.sink.CongressUtil;
import tv.danmaku.ijk.media.player.IjkConfMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
public class ski0 extends rkw implements i3m, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    CongressUtil f164975A;

    /* JADX INFO: renamed from: B */
    IjkConfMediaPlayer f164976B;

    /* JADX INFO: renamed from: C */
    cbl0.InterfaceC16103c f164977C;

    /* JADX INFO: renamed from: D */
    long f164978D;

    /* JADX INFO: renamed from: E */
    Runnable f164979E;

    /* JADX INFO: renamed from: F */
    private Handler f164980F;

    /* JADX INFO: renamed from: v */
    yw00 f164981v;

    /* JADX INFO: renamed from: x */
    private C19972b f164982x;

    /* JADX INFO: renamed from: y */
    int f164983y;

    /* JADX INFO: renamed from: z */
    long f164984z;

    /* JADX INFO: renamed from: l.ski0$a */
    public class RunnableC19971a implements Runnable {
        public RunnableC19971a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>2 onFrameAvailable" + ski0.this.f164978D + "《》" + this);
            ski0.this.getClass();
        }
    }

    public ski0(long j, int i, int i2, cbl0.InterfaceC16103c interfaceC16103c) {
        this.f164983y = 15;
        this.f164984z = 10000L;
        this.f164977C = null;
        this.f164979E = null;
        this.f164980F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f164975A = null;
        this.f164978D = j;
        this.f164977C = interfaceC16103c;
    }

    @Override // p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        this.f164981v = yw00Var;
    }

    /* JADX INFO: renamed from: Q1 */
    public int m184597Q1() {
        return getHeight();
    }

    /* JADX INFO: renamed from: R1 */
    public int m184598R1() {
        return getWidth();
    }

    @Override // p149l.rkw, p149l.mcj, p149l.ccj
    public void destroy() {
        this.f159894b = null;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "destorytextIn:" + this.texture_in);
        super.destroy();
    }

    public SurfaceTexture getScreenTexture() {
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

    @Override // p149l.rkw, p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        Surface surface = new Surface(getScreenTexture());
        this.f159894b.setOnFrameAvailableListener(this);
        IjkConfMediaPlayer ijkConfMediaPlayer = this.f164976B;
        if (ijkConfMediaPlayer != null) {
            ijkConfMediaPlayer.setSurfaceH(surface);
        }
        CongressUtil congressUtil = this.f164975A;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(this.f164978D, surface);
        }
        cbl0.InterfaceC16103c interfaceC16103c = this.f164977C;
        if (interfaceC16103c != null) {
            interfaceC16103c.mo20064a(this.f159894b);
        }
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        loadTexture(this.texture_in, this.f159894b);
        super.onDrawFrame();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>1 onFrameAvailable" + this.f164978D + "《》" + this);
        if (this.f164979E == null) {
            this.f164979E = new RunnableC19971a();
        }
        Handler handler = this.f164980F;
        if (handler != null) {
            handler.removeCallbacks(this.f164979E);
            this.f164980F.postDelayed(this.f164979E, this.f164984z);
        }
    }

    @Override // p149l.rkw, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    @Override // p149l.i3m
    public void setFps(int i) {
        this.f164983y = i;
    }

    public void start() {
        if (this.f164982x == null) {
            C19972b c19972b = new C19972b(this, null);
            this.f164982x = c19972b;
            c19972b.start();
        }
    }

    public void stop() {
        Runnable runnable;
        C19972b c19972b = this.f164982x;
        if (c19972b != null) {
            c19972b.m184599a();
            this.f164982x = null;
        }
        Handler handler = this.f164980F;
        if (handler != null && (runnable = this.f164979E) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f164975A = null;
        this.f164976B = null;
        this.f164978D = 0L;
    }

    /* JADX INFO: renamed from: l.ski0$b */
    public class C19972b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f164986a;

        /* JADX INFO: renamed from: b */
        private boolean f164987b;

        private C19972b() {
            this.f164986a = false;
            this.f164987b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m184599a() {
            this.f164986a = true;
            interrupt();
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f164986a) {
                try {
                    yw00 yw00Var = ski0.this.f164981v;
                    if (yw00Var != null && !this.f164987b) {
                        yw00Var.m216289z(null);
                    }
                    Thread.sleep(1000 / ski0.this.f164983y);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ C19972b(ski0 ski0Var, RunnableC19971a runnableC19971a) {
            this();
        }
    }

    @Override // p149l.i3m
    public mcj getInput() {
        return this;
    }

    public ski0(long j, int i, int i2, CongressUtil congressUtil) {
        this.f164983y = 15;
        this.f164984z = 10000L;
        this.f164977C = null;
        this.f164979E = null;
        this.f164980F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f164975A = congressUtil;
        this.f164978D = j;
    }
}
