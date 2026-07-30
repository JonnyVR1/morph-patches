package p153l;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class zph0 implements txl {

    /* JADX INFO: renamed from: a */
    MediaPlayer f205463a;

    /* JADX INFO: renamed from: l.zph0$a */
    public class C21851a implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ sxl f205464a;

        public C21851a(sxl sxlVar) {
            this.f205464a = sxlVar;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f205464a.mo141808g(zph0.this);
        }
    }

    /* JADX INFO: renamed from: l.zph0$b */
    public class C21852b implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qxl f205466a;

        public C21852b(qxl qxlVar) {
            this.f205466a = qxlVar;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f205466a.mo141800a(zph0.this);
        }
    }

    /* JADX INFO: renamed from: l.zph0$c */
    public class C21853c implements MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ uxl f205468a;

        public C21853c(uxl uxlVar) {
            this.f205468a = uxlVar;
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f205468a.mo141806e(zph0.this, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.zph0$d */
    public class C21854d implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ rxl f205470a;

        public C21854d(rxl rxlVar) {
            this.f205470a = rxlVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f205470a.mo141803c(zph0.this, i, String.valueOf(i2));
        }
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: a */
    public void mo130837a(uxl uxlVar) {
        this.f205463a.setOnVideoSizeChangedListener(new C21853c(uxlVar));
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: b */
    public void mo130838b(qxl qxlVar) {
        this.f205463a.setOnCompletionListener(new C21852b(qxlVar));
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: c */
    public void mo130839c(sxl sxlVar) {
        this.f205463a.setOnPreparedListener(new C21851a(sxlVar));
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: d */
    public void mo130840d(rxl rxlVar) {
        this.f205463a.setOnErrorListener(new C21854d(rxlVar));
    }

    @Override // p153l.txl
    public long getCurrentPosition() {
        return this.f205463a.getCurrentPosition();
    }

    @Override // p153l.txl
    public int getVideoHeight() {
        return this.f205463a.getVideoHeight();
    }

    @Override // p153l.txl
    public int getVideoWidth() {
        return this.f205463a.getVideoWidth();
    }

    @Override // p153l.txl
    public void init(Context context) {
        this.f205463a = new MediaPlayer();
    }

    @Override // p153l.txl
    public void prepareAsync() throws IllegalStateException {
        this.f205463a.prepareAsync();
    }

    @Override // p153l.txl
    public void release() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f205463a;
        if (mediaPlayer == null) {
            return;
        }
        synchronized (mediaPlayer) {
            try {
                MediaPlayer mediaPlayer2 = this.f205463a;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnErrorListener(null);
                    this.f205463a.setOnCompletionListener(null);
                    this.f205463a.setOnPreparedListener(null);
                    this.f205463a.setOnVideoSizeChangedListener(null);
                    this.f205463a.setSurface(null);
                    this.f205463a.stop();
                    this.f205463a.reset();
                    this.f205463a.release();
                    this.f205463a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.txl
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f205463a.setDataSource(str);
    }

    @Override // p153l.txl
    public void setLooping(boolean z) {
        this.f205463a.setLooping(z);
    }

    @Override // p153l.txl
    public void setSurface(Surface surface) {
        this.f205463a.setSurface(surface);
    }

    @Override // p153l.txl
    public void start() throws IllegalStateException {
        this.f205463a.start();
    }
}
