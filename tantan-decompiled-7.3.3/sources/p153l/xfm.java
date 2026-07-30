package p153l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 14)
public class xfm extends qnw implements SurfaceTexture.OnFrameAvailableListener, z5m, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnVideoMediacodecChangedListener, IMediaPlayer.OnVideoSizeChangedListener, IjkMediaPlayer.MediaDateCallback {

    /* JADX INFO: renamed from: A */
    private IjkMediaPlayer.MediaDateCallback f194048A;

    /* JADX INFO: renamed from: B */
    private WeakReference<Context> f194049B;

    /* JADX INFO: renamed from: E */
    long f194052E;

    /* JADX INFO: renamed from: I */
    private boolean f194056I;

    /* JADX INFO: renamed from: J */
    private InterfaceC4260a f194057J;

    /* JADX INFO: renamed from: L */
    private C21313b f194059L;

    /* JADX INFO: renamed from: P */
    private brx f194063P;

    /* JADX INFO: renamed from: v */
    private g510 f194064v;

    /* JADX INFO: renamed from: x */
    protected IjkMediaPlayer f194065x;

    /* JADX INFO: renamed from: y */
    String f194066y;

    /* JADX INFO: renamed from: z */
    private Surface f194067z;

    /* JADX INFO: renamed from: C */
    int f194050C = 480;

    /* JADX INFO: renamed from: D */
    int f194051D = 480;

    /* JADX INFO: renamed from: F */
    private float f194053F = 1.0f;

    /* JADX INFO: renamed from: G */
    boolean f194054G = false;

    /* JADX INFO: renamed from: H */
    int f194055H = 15;

    /* JADX INFO: renamed from: K */
    protected boolean f194058K = false;

    /* JADX INFO: renamed from: M */
    private int f194060M = 44100;

    /* JADX INFO: renamed from: N */
    private int f194061N = 1;

    /* JADX INFO: renamed from: O */
    private int f194062O = 1;

    /* JADX INFO: renamed from: l.xfm$a */
    public class RunnableC21312a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IjkMediaPlayer f194068a;

        public RunnableC21312a(IjkMediaPlayer ijkMediaPlayer) {
            this.f194068a = ijkMediaPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "stopAndReleasePlayer" + this.f194068a.isPlaying());
            IjkMediaPlayer ijkMediaPlayer = this.f194068a;
            if (ijkMediaPlayer != null) {
                try {
                    ijkMediaPlayer.stop();
                } catch (Exception unused) {
                }
            }
            this.f194068a.release();
        }
    }

    /* JADX INFO: renamed from: l.xfm$b */
    public class C21313b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f194070a;

        /* JADX INFO: renamed from: b */
        private boolean f194071b;

        public C21313b(String str) {
            super(str);
            this.f194070a = false;
            this.f194071b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m210813a() {
            this.f194070a = true;
            interrupt();
            try {
                join(3000L);
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f194070a) {
                try {
                    if (xfm.this.f194064v != null && !this.f194071b) {
                        xfm.this.f194064v.m129004z(null);
                    }
                    Thread.sleep(1000 / xfm.this.f194055H);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public xfm(Context context, String str, boolean z, brx brxVar) {
        this.f194063P = brxVar;
        this.f194056I = z;
        this.f194049B = new WeakReference<>(context);
        this.f194066y = str;
        start();
    }

    private void stopAndReleasePlayer() {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer == null) {
            return;
        }
        synchronized (ijkMediaPlayer) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = this.f194065x;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.setMediaDataCallback(null);
                    this.f194065x.setOnErrorListener(null);
                    this.f194065x.setOnCompletionListener(null);
                    this.f194065x.setOnPreparedListener(null);
                    this.f194065x.setOnVideoSizeChangedListener(null);
                    this.f194065x.setSurfaceH(null);
                    this.f194065x.setMediaDataCallback(null);
                    IjkMediaPlayer ijkMediaPlayer3 = this.f194065x;
                    this.f194065x = null;
                    new Thread(new RunnableC21312a(ijkMediaPlayer3), "live-media-IikInput").run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.z5m
    /* JADX INFO: renamed from: K */
    public void mo99495K(g510 g510Var) {
        this.f194064v = g510Var;
    }

    /* JADX INFO: renamed from: R1 */
    public Context m210808R1() {
        WeakReference<Context> weakReference = this.f194049B;
        if (weakReference == null) {
            return l26.f129743a;
        }
        return weakReference.get() == null ? l26.f129743a : this.f194049B.get();
    }

    /* JADX INFO: renamed from: S1 */
    public long m210809S1() {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: T1 */
    public void m210810T1(boolean z) {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.openAudioTracks(z);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m210811U1() {
        WeakReference<Context> weakReference = this.f194049B;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public void mo120831V1(InterfaceC4260a interfaceC4260a) {
        this.f194057J = interfaceC4260a;
        interfaceC4260a.mo21103a1();
        this.f194057J.mo21118l(1);
        this.f194057J.mo21100W1(this.f194053F);
    }

    /* JADX INFO: renamed from: W1 */
    public void mo120832W1(int i, int i2, int i3) {
        this.f194060M = i;
        this.f194061N = i2;
        this.f194062O = i3;
    }

    /* JADX INFO: renamed from: X1 */
    public void m210812X1(int i) {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void mo120833Y1(float f) {
        this.f194053F = f;
        InterfaceC4260a interfaceC4260a = this.f194057J;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21100W1(f);
        }
        b7y.m102882c().m102888g("ijkPlayerInput setVolume", "level:" + f + ",mOnlyVideo:" + this.f194056I);
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null) {
            if (this.f194056I) {
                ijkMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                float f2 = this.f194053F;
                ijkMediaPlayer.setVolume(f2, f2);
            }
        }
    }

    @Override // p153l.qnw, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
    }

    public long getDuration() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "----ijkPlayerInput:getDuration:mMediaPlayer=" + this.f194065x);
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    public int getInputHeight() {
        return this.f194051D;
    }

    public int getInputWidth() {
        return this.f194050C;
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
    @RequiresApi(api = 15)
    public void initWithGLContext() {
        super.initWithGLContext();
        if (this.f194065x != null) {
            getScreenTexture();
            this.f194067z = new Surface(this.f158650b);
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "initWithGLContext(), @@@@@@@@@@ mText=" + this.f158650b + "; mSurface=" + this.f194067z + ";inputWidth=" + this.f194050C + ";inputHeight=" + this.f194051D + ";texture_in=" + this.texture_in);
            this.f158650b.setDefaultBufferSize(this.f194050C, this.f194051D);
            this.f194065x.setSurfaceH(this.f194067z);
        }
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.f194054G = false;
    }

    @Override // p153l.wej
    @RequiresApi(api = 15)
    public void onDrawFrame() {
        loadTexture(this.texture_in, this.f158650b);
        super.onDrawFrame();
    }

    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "IMediaPlayer Error" + (System.currentTimeMillis() - this.f194052E) + "mswhat" + i + "extra" + i2);
        this.f194054G = false;
        return true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
        if (this.f194064v != null) {
            oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
            this.f194064v.m129004z(null);
        }
    }

    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        return false;
    }

    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        IjkMediaPlayer.MediaDateCallback mediaDateCallback = this.f194048A;
        if (mediaDateCallback != null) {
            mediaDateCallback.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
        }
        InterfaceC4260a interfaceC4260a = this.f194057J;
        if (interfaceC4260a == null || this.f194056I) {
            return;
        }
        interfaceC4260a.m21139G0(bArr, i, i2, ijkMediaPlayer, this.f194061N);
    }

    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f194054G = true;
        this.f194050C = iMediaPlayer.getVideoWidth();
        this.f194051D = iMediaPlayer.getVideoHeight();
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <onPrepared> cost time:" + (System.currentTimeMillis() - this.f194052E) + "ms height" + this.f194050C + "height" + this.f194051D);
        if (this.f158650b != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "onPrepared, @@@@@@@@@@ mText=" + this.f158650b + "; mSurface=" + this.f194067z + ";inputWidth=" + this.f194050C + ";inputHeight=" + this.f194051D + ";texture_in=" + this.texture_in);
            this.f158650b.setDefaultBufferSize(this.f194050C, this.f194051D);
        }
        g510 g510Var = this.f194064v;
        if (g510Var != null) {
            g510Var.m129004z(null);
        }
        iMediaPlayer.start();
    }

    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer != null && this.f194054G) {
            ijkMediaPlayer.pause();
        }
        InterfaceC4260a interfaceC4260a = this.f194057J;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21103a1();
        }
    }

    public void resume() {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer == null || !this.f194054G) {
            return;
        }
        ijkMediaPlayer.start();
    }

    public void seek(long j) {
        IjkMediaPlayer ijkMediaPlayer = this.f194065x;
        if (ijkMediaPlayer == null || !this.f194054G) {
            return;
        }
        ijkMediaPlayer.seekTo(j);
    }

    @Override // p153l.z5m
    public void setFps(int i) {
        this.f194055H = i;
    }

    @RequiresApi(api = 14)
    public void start() {
        this.f194052E = System.currentTimeMillis();
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, start");
        if (this.f194065x != null) {
            stopAndReleasePlayer();
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <release> cost time:" + (System.currentTimeMillis() - this.f194052E) + "ms");
        }
        try {
            if (this.f158650b == null) {
                this.f158650b = getScreenTexture();
                this.f194067z = new Surface(this.f158650b);
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, @@@@@@@@@@ mText=" + this.f158650b + "; mSurface=" + this.f194067z + ";texture_in=" + this.texture_in + ";texture_in=" + this.texture_in);
            }
            IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(m210808R1(), this.f194063P);
            this.f194065x = ijkMediaPlayer;
            ijkMediaPlayer.setOnPreparedListener(this);
            this.f194065x.setMediaCodecEnabled(false);
            this.f194065x.setOnCompletionListener(this);
            this.f194065x.setOnVideoSizeChangedListener(this);
            this.f194065x.setOnErrorListener(this);
            this.f194065x.setOnSeekCompleteListener(this);
            this.f194065x.setOnInfoListener(this);
            this.f194065x.setOnBufferingUpdateListener(this);
            this.f194065x.setOnVideoMediacodecChangedListener(this);
            this.f194065x.setOnVideoSizeChangedListener(this);
            boolean z = this.f194056I;
            IjkMediaPlayer ijkMediaPlayer2 = this.f194065x;
            if (z) {
                ijkMediaPlayer2.setMediaDataCallback(null);
                this.f194065x.setMediaDateCallbackFlags(0);
            } else {
                ijkMediaPlayer2.setMediaDataCallback(this);
                this.f194065x.setMediaDateCallbackFlags(1);
                this.f194065x.setPropertyLong(20024, this.f194060M);
                this.f194065x.setPropertyLong(20022, this.f194061N);
                this.f194065x.setPropertyLong(20023, this.f194062O);
            }
            this.f194065x.setSurfaceH(this.f194067z);
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp(setSurfaceH), @@@@@@@@@@ mText=" + this.f158650b + "; mSurface=" + this.f194067z + ";texture_in=" + this.texture_in);
            this.f194065x.setDataSource(this.f194066y.toString());
            this.f194065x.prepareAsync();
            b7y b7yVarM102882c = b7y.m102882c();
            StringBuilder sb = new StringBuilder("OnlyVideo:");
            sb.append(this.f194056I);
            b7yVarM102882c.m102888g("ijkPlayerInput", sb.toString());
            boolean z2 = this.f194056I;
            IjkMediaPlayer ijkMediaPlayer3 = this.f194065x;
            if (z2) {
                ijkMediaPlayer3.setVolume(0.0f, 0.0f);
            } else {
                float f = this.f194053F;
                ijkMediaPlayer3.setVolume(f, f);
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, end, cost time:" + (System.currentTimeMillis() - this.f194052E) + "ms");
            if (this.f194059L == null) {
                C21313b c21313b = new C21313b("live-media-ijkRender");
                this.f194059L = c21313b;
                c21313b.start();
            }
        } catch (IOException unused) {
            stopAndReleasePlayer();
            catchErrorLog0();
        } catch (IllegalArgumentException unused2) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp Unable to open content: " + this.f194066y);
            stopAndReleasePlayer();
            catchErrorLog1();
        }
    }

    public void stop() {
        this.f194054G = false;
        stopAndReleasePlayer();
        C21313b c21313b = this.f194059L;
        if (c21313b != null) {
            c21313b.m210813a();
            this.f194059L = null;
        }
        m210811U1();
    }

    public void catchErrorLog0() {
    }

    public void catchErrorLog1() {
    }

    @Override // p153l.z5m
    public gfj getInput() {
        return this;
    }

    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
    }

    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
    }

    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
    }
}
