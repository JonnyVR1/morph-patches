package p007l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.immomo.mediacore.sink.CongressUtil;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import l.cbl0;
import l.ccj;
import l.i3m;
import l.ii70;
import l.mcj;
import l.pjw;
import l.rkw;
import l.yw00;
import tv.danmaku.ijk.media.player.IjkConfMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ski0 extends rkw implements i3m, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    CongressUtil f4139A;

    /* JADX INFO: renamed from: B */
    IjkConfMediaPlayer f4140B;

    /* JADX INFO: renamed from: C */
    cbl0.c f4141C;

    /* JADX INFO: renamed from: D */
    long f4142D;

    /* JADX INFO: renamed from: E */
    Runnable f4143E;

    /* JADX INFO: renamed from: F */
    private Handler f4144F;

    /* JADX INFO: renamed from: v */
    yw00 f4145v;

    /* JADX INFO: renamed from: x */
    private C0693b f4146x;

    /* JADX INFO: renamed from: y */
    int f4147y;

    /* JADX INFO: renamed from: z */
    long f4148z;

    /* JADX INFO: renamed from: l.ski0$a */
    public class RunnableC0692a implements Runnable {
        public RunnableC0692a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ii70.d().f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>2 onFrameAvailable" + ski0.this.f4142D + "《》" + this);
            ski0.this.getClass();
        }
    }

    public ski0(long j, int i, int i2, cbl0.c cVar) {
        this.f4147y = 15;
        this.f4148z = 10000L;
        this.f4141C = null;
        this.f4143E = null;
        this.f4144F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f4139A = null;
        this.f4142D = j;
        this.f4141C = cVar;
    }

    /* JADX INFO: renamed from: K */
    public void m10657K(yw00 yw00Var) {
        this.f4145v = yw00Var;
    }

    /* JADX INFO: renamed from: Q1 */
    public int m10658Q1() {
        return getHeight();
    }

    /* JADX INFO: renamed from: R1 */
    public int m10659R1() {
        return getWidth();
    }

    public void destroy() {
        ((rkw) this).b = null;
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "destorytextIn:" + ((ccj) this).texture_in);
        super.destroy();
    }

    public SurfaceTexture getScreenTexture() {
        if (((rkw) this).b == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            ((ccj) this).texture_in = iArr[0];
            ((rkw) this).b = new SurfaceTexture(((ccj) this).texture_in);
        }
        return ((rkw) this).b;
    }

    public void initWithGLContext() {
        super.initWithGLContext();
        Surface surface = new Surface(getScreenTexture());
        ((rkw) this).b.setOnFrameAvailableListener(this);
        IjkConfMediaPlayer ijkConfMediaPlayer = this.f4140B;
        if (ijkConfMediaPlayer != null) {
            ijkConfMediaPlayer.setSurfaceH(surface);
        }
        CongressUtil congressUtil = this.f4139A;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(this.f4142D, surface);
        }
        cbl0.c cVar = this.f4141C;
        if (cVar != null) {
            cVar.a(((rkw) this).b);
        }
    }

    public void onDrawFrame() {
        loadTexture(((ccj) this).texture_in, ((rkw) this).b);
        super/*l.ccj*/.onDrawFrame();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ii70.d().f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>>>>>>>>>>>1 onFrameAvailable" + this.f4142D + "《》" + this);
        if (this.f4143E == null) {
            this.f4143E = new RunnableC0692a();
        }
        Handler handler = this.f4144F;
        if (handler != null) {
            handler.removeCallbacks(this.f4143E);
            this.f4144F.postDelayed(this.f4143E, this.f4148z);
        }
    }

    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    public void setFps(int i) {
        this.f4147y = i;
    }

    public void start() {
        if (this.f4146x == null) {
            C0693b c0693b = new C0693b(this, null);
            this.f4146x = c0693b;
            c0693b.start();
        }
    }

    public void stop() {
        Runnable runnable;
        C0693b c0693b = this.f4146x;
        if (c0693b != null) {
            c0693b.m10660a();
            this.f4146x = null;
        }
        Handler handler = this.f4144F;
        if (handler != null && (runnable = this.f4143E) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f4139A = null;
        this.f4140B = null;
        this.f4142D = 0L;
    }

    /* JADX INFO: renamed from: l.ski0$b */
    public class C0693b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f4150a;

        /* JADX INFO: renamed from: b */
        private boolean f4151b;

        private C0693b() {
            this.f4150a = false;
            this.f4151b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m10660a() {
            this.f4150a = true;
            interrupt();
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f4150a) {
                try {
                    yw00 yw00Var = ski0.this.f4145v;
                    if (yw00Var != null && !this.f4151b) {
                        yw00Var.z((pjw) null);
                    }
                    Thread.sleep(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE / ski0.this.f4147y);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ C0693b(ski0 ski0Var, RunnableC0692a runnableC0692a) {
            this();
        }
    }

    public mcj getInput() {
        return this;
    }

    public ski0(long j, int i, int i2, CongressUtil congressUtil) {
        this.f4147y = 15;
        this.f4148z = 10000L;
        this.f4141C = null;
        this.f4143E = null;
        this.f4144F = new Handler(Looper.getMainLooper());
        setRenderSize(i, i2);
        this.f4139A = congressUtil;
        this.f4142D = j;
    }
}
