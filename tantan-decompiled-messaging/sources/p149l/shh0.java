package p149l;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class shh0 implements bvl {

    /* JADX INFO: renamed from: a */
    MediaPlayer f164565a;

    /* JADX INFO: renamed from: l.shh0$a */
    public class C19946a implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ avl f164566a;

        public C19946a(avl avlVar) {
            this.f164566a = avlVar;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f164566a.mo99203g(shh0.this);
        }
    }

    /* JADX INFO: renamed from: l.shh0$b */
    public class C19947b implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yul f164568a;

        public C19947b(yul yulVar) {
            this.f164568a = yulVar;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f164568a.mo117732a(shh0.this);
        }
    }

    /* JADX INFO: renamed from: l.shh0$c */
    public class C19948c implements MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ cvl f164570a;

        public C19948c(cvl cvlVar) {
            this.f164570a = cvlVar;
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f164570a.mo108878e(shh0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.shh0$d */
    public class C19949d implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ zul f164572a;

        public C19949d(zul zulVar) {
            this.f164572a = zulVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f164572a.mo117735c(shh0.this, i, String.valueOf(i2));
        }
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: a */
    public void mo104054a(cvl cvlVar) {
        this.f164565a.setOnVideoSizeChangedListener(new C19948c(cvlVar));
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: b */
    public void mo104055b(yul yulVar) {
        this.f164565a.setOnCompletionListener(new C19947b(yulVar));
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: c */
    public void mo104056c(avl avlVar) {
        this.f164565a.setOnPreparedListener(new C19946a(avlVar));
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: d */
    public void mo104057d(zul zulVar) {
        this.f164565a.setOnErrorListener(new C19949d(zulVar));
    }

    @Override // p149l.bvl
    public long getCurrentPosition() {
        return this.f164565a.getCurrentPosition();
    }

    @Override // p149l.bvl
    public int getVideoHeight() {
        return this.f164565a.getVideoHeight();
    }

    @Override // p149l.bvl
    public int getVideoWidth() {
        return this.f164565a.getVideoWidth();
    }

    @Override // p149l.bvl
    public void init(Context context) {
        this.f164565a = new MediaPlayer();
    }

    @Override // p149l.bvl
    public void prepareAsync() throws IllegalStateException {
        this.f164565a.prepareAsync();
    }

    @Override // p149l.bvl
    public void release() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f164565a;
        if (mediaPlayer == null) {
            return;
        }
        synchronized (mediaPlayer) {
            try {
                MediaPlayer mediaPlayer2 = this.f164565a;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnErrorListener(null);
                    this.f164565a.setOnCompletionListener(null);
                    this.f164565a.setOnPreparedListener(null);
                    this.f164565a.setOnVideoSizeChangedListener(null);
                    this.f164565a.setSurface(null);
                    this.f164565a.stop();
                    this.f164565a.reset();
                    this.f164565a.release();
                    this.f164565a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.bvl
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f164565a.setDataSource(str);
    }

    @Override // p149l.bvl
    public void setLooping(boolean z) {
        this.f164565a.setLooping(z);
    }

    @Override // p149l.bvl
    public void setSurface(Surface surface) {
        this.f164565a.setSurface(surface);
    }

    @Override // p149l.bvl
    public void start() throws IllegalStateException {
        this.f164565a.start();
    }
}
