package p149l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 14)
public class hdm extends rkw implements SurfaceTexture.OnFrameAvailableListener, i3m, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnVideoMediacodecChangedListener, IMediaPlayer.OnVideoSizeChangedListener, IjkMediaPlayer.MediaDateCallback {

    /* JADX INFO: renamed from: A */
    private IjkMediaPlayer.MediaDateCallback f107253A;

    /* JADX INFO: renamed from: B */
    private WeakReference<Context> f107254B;

    /* JADX INFO: renamed from: E */
    long f107257E;

    /* JADX INFO: renamed from: I */
    private boolean f107261I;

    /* JADX INFO: renamed from: J */
    private InterfaceC4109a f107262J;

    /* JADX INFO: renamed from: L */
    private C17289b f107264L;

    /* JADX INFO: renamed from: P */
    private eix f107268P;

    /* JADX INFO: renamed from: v */
    private yw00 f107269v;

    /* JADX INFO: renamed from: x */
    protected IjkMediaPlayer f107270x;

    /* JADX INFO: renamed from: y */
    String f107271y;

    /* JADX INFO: renamed from: z */
    private Surface f107272z;

    /* JADX INFO: renamed from: C */
    int f107255C = 480;

    /* JADX INFO: renamed from: D */
    int f107256D = 480;

    /* JADX INFO: renamed from: F */
    private float f107258F = 1.0f;

    /* JADX INFO: renamed from: G */
    boolean f107259G = false;

    /* JADX INFO: renamed from: H */
    int f107260H = 15;

    /* JADX INFO: renamed from: K */
    protected boolean f107263K = false;

    /* JADX INFO: renamed from: M */
    private int f107265M = 44100;

    /* JADX INFO: renamed from: N */
    private int f107266N = 1;

    /* JADX INFO: renamed from: O */
    private int f107267O = 1;

    /* JADX INFO: renamed from: l.hdm$a */
    public class RunnableC17288a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IjkMediaPlayer f107273a;

        public RunnableC17288a(IjkMediaPlayer ijkMediaPlayer) {
            this.f107273a = ijkMediaPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "stopAndReleasePlayer" + this.f107273a.isPlaying());
            IjkMediaPlayer ijkMediaPlayer = this.f107273a;
            if (ijkMediaPlayer != null) {
                try {
                    ijkMediaPlayer.stop();
                } catch (Exception unused) {
                }
            }
            this.f107273a.release();
        }
    }

    /* JADX INFO: renamed from: l.hdm$b */
    public class C17289b extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f107275a;

        /* JADX INFO: renamed from: b */
        private boolean f107276b;

        public C17289b(String str) {
            super(str);
            this.f107275a = false;
            this.f107276b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m130604a() {
            this.f107275a = true;
            interrupt();
            try {
                join(3000L);
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f107275a) {
                try {
                    if (hdm.this.f107269v != null && !this.f107276b) {
                        hdm.this.f107269v.m216289z(null);
                    }
                    Thread.sleep(1000 / hdm.this.f107260H);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public hdm(Context context, String str, boolean z, eix eixVar) {
        this.f107268P = eixVar;
        this.f107261I = z;
        this.f107254B = new WeakReference<>(context);
        this.f107271y = str;
        start();
    }

    private void stopAndReleasePlayer() {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer == null) {
            return;
        }
        synchronized (ijkMediaPlayer) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = this.f107270x;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.setMediaDataCallback(null);
                    this.f107270x.setOnErrorListener(null);
                    this.f107270x.setOnCompletionListener(null);
                    this.f107270x.setOnPreparedListener(null);
                    this.f107270x.setOnVideoSizeChangedListener(null);
                    this.f107270x.setSurfaceH(null);
                    this.f107270x.setMediaDataCallback(null);
                    IjkMediaPlayer ijkMediaPlayer3 = this.f107270x;
                    this.f107270x = null;
                    new Thread(new RunnableC17288a(ijkMediaPlayer3), "live-media-IikInput").run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.i3m
    /* JADX INFO: renamed from: K */
    public void mo100323K(yw00 yw00Var) {
        this.f107269v = yw00Var;
    }

    /* JADX INFO: renamed from: R1 */
    public Context m130596R1() {
        WeakReference<Context> weakReference = this.f107254B;
        if (weakReference == null) {
            return g16.f100119a;
        }
        return weakReference.get() == null ? g16.f100119a : this.f107254B.get();
    }

    /* JADX INFO: renamed from: S1 */
    public long m130597S1() {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: T1 */
    public void m130598T1(boolean z) {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.openAudioTracks(z);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m130599U1() {
        WeakReference<Context> weakReference = this.f107254B;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public void mo130600V1(InterfaceC4109a interfaceC4109a) {
        this.f107262J = interfaceC4109a;
        interfaceC4109a.mo20104a1();
        this.f107262J.mo20119l(1);
        this.f107262J.mo20101W1(this.f107258F);
    }

    /* JADX INFO: renamed from: W1 */
    public void mo130601W1(int i, int i2, int i3) {
        this.f107265M = i;
        this.f107266N = i2;
        this.f107267O = i3;
    }

    /* JADX INFO: renamed from: X1 */
    public void m130602X1(int i) {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void mo130603Y1(float f) {
        this.f107258F = f;
        InterfaceC4109a interfaceC4109a = this.f107262J;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20101W1(f);
        }
        eyx.m118802c().m118808g("ijkPlayerInput setVolume", "level:" + f + ",mOnlyVideo:" + this.f107261I);
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null) {
            if (this.f107261I) {
                ijkMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                float f2 = this.f107258F;
                ijkMediaPlayer.setVolume(f2, f2);
            }
        }
    }

    @Override // p149l.rkw, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
    }

    public long getDuration() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "----ijkPlayerInput:getDuration:mMediaPlayer=" + this.f107270x);
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    public int getInputHeight() {
        return this.f107256D;
    }

    public int getInputWidth() {
        return this.f107255C;
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
    @RequiresApi(api = 15)
    public void initWithGLContext() {
        super.initWithGLContext();
        if (this.f107270x != null) {
            getScreenTexture();
            this.f107272z = new Surface(this.f159894b);
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "initWithGLContext(), @@@@@@@@@@ mText=" + this.f159894b + "; mSurface=" + this.f107272z + ";inputWidth=" + this.f107255C + ";inputHeight=" + this.f107256D + ";texture_in=" + this.texture_in);
            this.f159894b.setDefaultBufferSize(this.f107255C, this.f107256D);
            this.f107270x.setSurfaceH(this.f107272z);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.f107259G = false;
    }

    @Override // p149l.ccj
    @RequiresApi(api = 15)
    public void onDrawFrame() {
        loadTexture(this.texture_in, this.f159894b);
        super.onDrawFrame();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "IMediaPlayer Error" + (System.currentTimeMillis() - this.f107257E) + "mswhat" + i + "extra" + i2);
        this.f107259G = false;
        return true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
        if (this.f107269v != null) {
            ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", "onFrameAvailable");
            this.f107269v.m216289z(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        IjkMediaPlayer.MediaDateCallback mediaDateCallback = this.f107253A;
        if (mediaDateCallback != null) {
            mediaDateCallback.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
        }
        InterfaceC4109a interfaceC4109a = this.f107262J;
        if (interfaceC4109a == null || this.f107261I) {
            return;
        }
        interfaceC4109a.m20140G0(bArr, i, i2, ijkMediaPlayer, this.f107266N);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.f107259G = true;
        this.f107255C = iMediaPlayer.getVideoWidth();
        this.f107256D = iMediaPlayer.getVideoHeight();
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <onPrepared> cost time:" + (System.currentTimeMillis() - this.f107257E) + "ms height" + this.f107255C + "height" + this.f107256D);
        if (this.f159894b != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "onPrepared, @@@@@@@@@@ mText=" + this.f159894b + "; mSurface=" + this.f107272z + ";inputWidth=" + this.f107255C + ";inputHeight=" + this.f107256D + ";texture_in=" + this.texture_in);
            this.f159894b.setDefaultBufferSize(this.f107255C, this.f107256D);
        }
        yw00 yw00Var = this.f107269v;
        if (yw00Var != null) {
            yw00Var.m216289z(null);
        }
        iMediaPlayer.start();
    }

    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer != null && this.f107259G) {
            ijkMediaPlayer.pause();
        }
        InterfaceC4109a interfaceC4109a = this.f107262J;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20104a1();
        }
    }

    public void resume() {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer == null || !this.f107259G) {
            return;
        }
        ijkMediaPlayer.start();
    }

    public void seek(long j) {
        IjkMediaPlayer ijkMediaPlayer = this.f107270x;
        if (ijkMediaPlayer == null || !this.f107259G) {
            return;
        }
        ijkMediaPlayer.seekTo(j);
    }

    @Override // p149l.i3m
    public void setFps(int i) {
        this.f107260H = i;
    }

    @RequiresApi(api = 14)
    public void start() {
        this.f107257E = System.currentTimeMillis();
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, start");
        if (this.f107270x != null) {
            stopAndReleasePlayer();
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, <release> cost time:" + (System.currentTimeMillis() - this.f107257E) + "ms");
        }
        try {
            if (this.f159894b == null) {
                this.f159894b = getScreenTexture();
                this.f107272z = new Surface(this.f159894b);
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, @@@@@@@@@@ mText=" + this.f159894b + "; mSurface=" + this.f107272z + ";texture_in=" + this.texture_in + ";texture_in=" + this.texture_in);
            }
            IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(m130596R1(), this.f107268P);
            this.f107270x = ijkMediaPlayer;
            ijkMediaPlayer.setOnPreparedListener(this);
            this.f107270x.setMediaCodecEnabled(false);
            this.f107270x.setOnCompletionListener(this);
            this.f107270x.setOnVideoSizeChangedListener(this);
            this.f107270x.setOnErrorListener(this);
            this.f107270x.setOnSeekCompleteListener(this);
            this.f107270x.setOnInfoListener(this);
            this.f107270x.setOnBufferingUpdateListener(this);
            this.f107270x.setOnVideoMediacodecChangedListener(this);
            this.f107270x.setOnVideoSizeChangedListener(this);
            boolean z = this.f107261I;
            IjkMediaPlayer ijkMediaPlayer2 = this.f107270x;
            if (z) {
                ijkMediaPlayer2.setMediaDataCallback(null);
                this.f107270x.setMediaDateCallbackFlags(0);
            } else {
                ijkMediaPlayer2.setMediaDataCallback(this);
                this.f107270x.setMediaDateCallbackFlags(1);
                this.f107270x.setPropertyLong(20024, this.f107265M);
                this.f107270x.setPropertyLong(20022, this.f107266N);
                this.f107270x.setPropertyLong(20023, this.f107267O);
            }
            this.f107270x.setSurfaceH(this.f107272z);
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "openPublishHelp(setSurfaceH), @@@@@@@@@@ mText=" + this.f159894b + "; mSurface=" + this.f107272z + ";texture_in=" + this.texture_in);
            this.f107270x.setDataSource(this.f107271y.toString());
            this.f107270x.prepareAsync();
            eyx eyxVarM118802c = eyx.m118802c();
            StringBuilder sb = new StringBuilder("OnlyVideo:");
            sb.append(this.f107261I);
            eyxVarM118802c.m118808g("ijkPlayerInput", sb.toString());
            boolean z2 = this.f107261I;
            IjkMediaPlayer ijkMediaPlayer3 = this.f107270x;
            if (z2) {
                ijkMediaPlayer3.setVolume(0.0f, 0.0f);
            } else {
                float f = this.f107258F;
                ijkMediaPlayer3.setVolume(f, f);
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp, end, cost time:" + (System.currentTimeMillis() - this.f107257E) + "ms");
            if (this.f107264L == null) {
                C17289b c17289b = new C17289b("live-media-ijkRender");
                this.f107264L = c17289b;
                c17289b.start();
            }
        } catch (IOException unused) {
            stopAndReleasePlayer();
            catchErrorLog0();
        } catch (IllegalArgumentException unused2) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "openPublishHelp Unable to open content: " + this.f107271y);
            stopAndReleasePlayer();
            catchErrorLog1();
        }
    }

    public void stop() {
        this.f107259G = false;
        stopAndReleasePlayer();
        C17289b c17289b = this.f107264L;
        if (c17289b != null) {
            c17289b.m130604a();
            this.f107264L = null;
        }
        m130599U1();
    }

    public void catchErrorLog0() {
    }

    public void catchErrorLog1() {
    }

    @Override // p149l.i3m
    public mcj getInput() {
        return this;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
    }
}
