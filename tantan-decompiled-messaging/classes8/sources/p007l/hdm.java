package p007l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.io.IOException;
import java.lang.ref.WeakReference;
import l.ccj;
import l.eix;
import l.eyx;
import l.g16;
import l.i3m;
import l.ii70;
import l.mcj;
import l.pjw;
import l.rkw;
import l.yw00;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@RequiresApi(api = 14)
public class hdm extends rkw implements SurfaceTexture.OnFrameAvailableListener, i3m, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnVideoMediacodecChangedListener, IMediaPlayer.OnVideoSizeChangedListener, IjkMediaPlayer.MediaDateCallback {

    /* JADX INFO: renamed from: A */
    private IjkMediaPlayer.MediaDateCallback f2817A;

    /* JADX INFO: renamed from: B */
    private WeakReference<Context> f2818B;

    /* JADX INFO: renamed from: E */
    long f2821E;

    /* JADX INFO: renamed from: I */
    private boolean f2825I;

    /* JADX INFO: renamed from: J */
    private InterfaceC0021a f2826J;

    /* JADX INFO: renamed from: L */
    private C0559b f2828L;

    /* JADX INFO: renamed from: P */
    private eix f2832P;

    /* JADX INFO: renamed from: v */
    private yw00 f2833v;

    /* JADX INFO: renamed from: x */
    protected IjkMediaPlayer f2834x;

    /* JADX INFO: renamed from: y */
    String f2835y;

    /* JADX INFO: renamed from: z */
    private Surface f2836z;

    /* JADX INFO: renamed from: C */
    int f2819C = 480;

    /* JADX INFO: renamed from: D */
    int f2820D = 480;

    /* JADX INFO: renamed from: F */
    private float f2822F = 1.0f;

    /* JADX INFO: renamed from: G */
    boolean f2823G = false;

    /* JADX INFO: renamed from: H */
    int f2824H = 15;

    /* JADX INFO: renamed from: K */
    protected boolean f2827K = false;

    /* JADX INFO: renamed from: M */
    private int f2829M = 44100;

    /* JADX INFO: renamed from: N */
    private int f2830N = 1;

    /* JADX INFO: renamed from: O */
    private int f2831O = 1;

    /* JADX INFO: renamed from: l.hdm$a */
    public class RunnableC0558a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IjkMediaPlayer f2837a;

        public RunnableC0558a(IjkMediaPlayer ijkMediaPlayer) {
            this.f2837a = ijkMediaPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "stopAndReleasePlayer" + this.f2837a.isPlaying());
            IjkMediaPlayer ijkMediaPlayer = this.f2837a;
            if (ijkMediaPlayer != null) {
                try {
                    ijkMediaPlayer.stop();
                } catch (Exception unused) {
                }
            }
            this.f2837a.release();
        }
    }

    /* JADX INFO: renamed from: l.hdm$b */
    public class C0559b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f2839a;

        /* JADX INFO: renamed from: b */
        private boolean f2840b;

        public C0559b(String str) {
            super(str);
            this.f2839a = false;
            this.f2840b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m9314a() {
            this.f2839a = true;
            interrupt();
            try {
                join(3000L);
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f2839a) {
                try {
                    if (hdm.this.f2833v != null && !this.f2840b) {
                        hdm.this.f2833v.z((pjw) null);
                    }
                    Thread.sleep(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE / hdm.this.f2824H);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public hdm(Context context, String str, boolean z, eix eixVar) {
        this.f2832P = eixVar;
        this.f2825I = z;
        this.f2818B = new WeakReference<>(context);
        this.f2835y = str;
        start();
    }

    private void stopAndReleasePlayer() {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer == null) {
            return;
        }
        synchronized (ijkMediaPlayer) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = this.f2834x;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.setMediaDataCallback((IjkMediaPlayer.MediaDateCallback) null);
                    this.f2834x.setOnErrorListener((IMediaPlayer.OnErrorListener) null);
                    this.f2834x.setOnCompletionListener((IMediaPlayer.OnCompletionListener) null);
                    this.f2834x.setOnPreparedListener((IMediaPlayer.OnPreparedListener) null);
                    this.f2834x.setOnVideoSizeChangedListener((IMediaPlayer.OnVideoSizeChangedListener) null);
                    this.f2834x.setSurfaceH((Surface) null);
                    this.f2834x.setMediaDataCallback((IjkMediaPlayer.MediaDateCallback) null);
                    IjkMediaPlayer ijkMediaPlayer3 = this.f2834x;
                    this.f2834x = null;
                    new Thread(new RunnableC0558a(ijkMediaPlayer3), "live-media-IikInput").run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m9305K(yw00 yw00Var) {
        this.f2833v = yw00Var;
    }

    /* JADX INFO: renamed from: R1 */
    public Context m9306R1() {
        WeakReference<Context> weakReference = this.f2818B;
        if (weakReference == null) {
            return g16.a;
        }
        return weakReference.get() == null ? g16.a : this.f2818B.get();
    }

    /* JADX INFO: renamed from: S1 */
    public long m9307S1() {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: T1 */
    public void m9308T1(boolean z) {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.openAudioTracks(z);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m9309U1() {
        WeakReference<Context> weakReference = this.f2818B;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public void mo9310V1(InterfaceC0021a interfaceC0021a) {
        this.f2826J = interfaceC0021a;
        interfaceC0021a.mo370a1();
        this.f2826J.mo385l(1);
        this.f2826J.W1(this.f2822F);
    }

    /* JADX INFO: renamed from: W1 */
    public void mo9311W1(int i, int i2, int i3) {
        this.f2829M = i;
        this.f2830N = i2;
        this.f2831O = i3;
    }

    /* JADX INFO: renamed from: X1 */
    public void m9312X1(int i) {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void mo9313Y1(float f) {
        this.f2822F = f;
        InterfaceC0021a interfaceC0021a = this.f2826J;
        if (interfaceC0021a != null) {
            interfaceC0021a.W1(f);
        }
        eyx.c().g(new Object[]{"ijkPlayerInput setVolume", "level:" + f + ",mOnlyVideo:" + this.f2825I});
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null) {
            if (this.f2825I) {
                ijkMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                float f2 = this.f2822F;
                ijkMediaPlayer.setVolume(f2, f2);
            }
        }
    }

    public void destroy() {
        super.destroy();
    }

    public long getDuration() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "----ijkPlayerInput:getDuration:mMediaPlayer=" + this.f2834x);
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    public int getInputHeight() {
        return this.f2820D;
    }

    public int getInputWidth() {
        return this.f2819C;
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

    @RequiresApi(api = 15)
    public void initWithGLContext() {
        super.initWithGLContext();
        if (this.f2834x != null) {
            getScreenTexture();
            this.f2836z = new Surface(((rkw) this).b);
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "initWithGLContext(), @@@@@@@@@@ mText=" + ((rkw) this).b + "; mSurface=" + this.f2836z + ";inputWidth=" + this.f2819C + ";inputHeight=" + this.f2820D + ";texture_in=" + ((ccj) this).texture_in);
            ((rkw) this).b.setDefaultBufferSize(this.f2819C, this.f2820D);
            this.f2834x.setSurfaceH(this.f2836z);
        }
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.f2823G = false;
    }

    @RequiresApi(api = 15)
    public void onDrawFrame() {
        loadTexture(((ccj) this).texture_in, ((rkw) this).b);
        super/*l.ccj*/.onDrawFrame();
    }

    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "IMediaPlayer Error" + (System.currentTimeMillis() - this.f2821E) + "mswhat" + i + "extra" + i2);
        this.f2823G = false;
        return true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
        if (this.f2833v != null) {
            ii70.d().f("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
            this.f2833v.z((pjw) null);
        }
    }

    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        return false;
    }

    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        IjkMediaPlayer.MediaDateCallback mediaDateCallback = this.f2817A;
        if (mediaDateCallback != null) {
            mediaDateCallback.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
        }
        InterfaceC0021a interfaceC0021a = this.f2826J;
        if (interfaceC0021a == null || this.f2825I) {
            return;
        }
        interfaceC0021a.m406G0(bArr, i, i2, ijkMediaPlayer, this.f2830N);
    }

    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f2823G = true;
        this.f2819C = iMediaPlayer.getVideoWidth();
        this.f2820D = iMediaPlayer.getVideoHeight();
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <onPrepared> cost time:" + (System.currentTimeMillis() - this.f2821E) + "ms height" + this.f2819C + "height" + this.f2820D);
        if (((rkw) this).b != null) {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "onPrepared, @@@@@@@@@@ mText=" + ((rkw) this).b + "; mSurface=" + this.f2836z + ";inputWidth=" + this.f2819C + ";inputHeight=" + this.f2820D + ";texture_in=" + ((ccj) this).texture_in);
            ((rkw) this).b.setDefaultBufferSize(this.f2819C, this.f2820D);
        }
        yw00 yw00Var = this.f2833v;
        if (yw00Var != null) {
            yw00Var.z((pjw) null);
        }
        iMediaPlayer.start();
    }

    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer != null && this.f2823G) {
            ijkMediaPlayer.pause();
        }
        InterfaceC0021a interfaceC0021a = this.f2826J;
        if (interfaceC0021a != null) {
            interfaceC0021a.mo370a1();
        }
    }

    public void resume() {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer == null || !this.f2823G) {
            return;
        }
        ijkMediaPlayer.start();
    }

    public void seek(long j) {
        IjkMediaPlayer ijkMediaPlayer = this.f2834x;
        if (ijkMediaPlayer == null || !this.f2823G) {
            return;
        }
        ijkMediaPlayer.seekTo(j);
    }

    public void setFps(int i) {
        this.f2824H = i;
    }

    @RequiresApi(api = 14)
    public void start() {
        this.f2821E = System.currentTimeMillis();
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, start");
        if (this.f2834x != null) {
            stopAndReleasePlayer();
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <release> cost time:" + (System.currentTimeMillis() - this.f2821E) + "ms");
        }
        try {
            if (((rkw) this).b == null) {
                ((rkw) this).b = getScreenTexture();
                this.f2836z = new Surface(((rkw) this).b);
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, @@@@@@@@@@ mText=" + ((rkw) this).b + "; mSurface=" + this.f2836z + ";texture_in=" + ((ccj) this).texture_in + ";texture_in=" + ((ccj) this).texture_in);
            }
            IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(m9306R1(), this.f2832P);
            this.f2834x = ijkMediaPlayer;
            ijkMediaPlayer.setOnPreparedListener(this);
            this.f2834x.setMediaCodecEnabled(false);
            this.f2834x.setOnCompletionListener(this);
            this.f2834x.setOnVideoSizeChangedListener(this);
            this.f2834x.setOnErrorListener(this);
            this.f2834x.setOnSeekCompleteListener(this);
            this.f2834x.setOnInfoListener(this);
            this.f2834x.setOnBufferingUpdateListener(this);
            this.f2834x.setOnVideoMediacodecChangedListener(this);
            this.f2834x.setOnVideoSizeChangedListener(this);
            boolean z = this.f2825I;
            IjkMediaPlayer ijkMediaPlayer2 = this.f2834x;
            if (z) {
                ijkMediaPlayer2.setMediaDataCallback((IjkMediaPlayer.MediaDateCallback) null);
                this.f2834x.setMediaDateCallbackFlags(0);
            } else {
                ijkMediaPlayer2.setMediaDataCallback(this);
                this.f2834x.setMediaDateCallbackFlags(1);
                this.f2834x.setPropertyLong(20024, this.f2829M);
                this.f2834x.setPropertyLong(20022, this.f2830N);
                this.f2834x.setPropertyLong(20023, this.f2831O);
            }
            this.f2834x.setSurfaceH(this.f2836z);
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp(setSurfaceH), @@@@@@@@@@ mText=" + ((rkw) this).b + "; mSurface=" + this.f2836z + ";texture_in=" + ((ccj) this).texture_in);
            this.f2834x.setDataSource(this.f2835y.toString());
            this.f2834x.prepareAsync();
            eyx eyxVarC = eyx.c();
            StringBuilder sb = new StringBuilder("OnlyVideo:");
            sb.append(this.f2825I);
            eyxVarC.g(new Object[]{"ijkPlayerInput", sb.toString()});
            boolean z2 = this.f2825I;
            IjkMediaPlayer ijkMediaPlayer3 = this.f2834x;
            if (z2) {
                ijkMediaPlayer3.setVolume(0.0f, 0.0f);
            } else {
                float f = this.f2822F;
                ijkMediaPlayer3.setVolume(f, f);
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, end, cost time:" + (System.currentTimeMillis() - this.f2821E) + "ms");
            if (this.f2828L == null) {
                C0559b c0559b = new C0559b("live-media-ijkRender");
                this.f2828L = c0559b;
                c0559b.start();
            }
        } catch (IOException unused) {
            stopAndReleasePlayer();
            catchErrorLog0();
        } catch (IllegalArgumentException unused2) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp Unable to open content: " + this.f2835y);
            stopAndReleasePlayer();
            catchErrorLog1();
        }
    }

    public void stop() {
        this.f2823G = false;
        stopAndReleasePlayer();
        C0559b c0559b = this.f2828L;
        if (c0559b != null) {
            c0559b.m9314a();
            this.f2828L = null;
        }
        m9309U1();
    }

    public void catchErrorLog0() {
    }

    public void catchErrorLog1() {
    }

    public mcj getInput() {
        return this;
    }

    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
    }

    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
    }

    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
    }
}
