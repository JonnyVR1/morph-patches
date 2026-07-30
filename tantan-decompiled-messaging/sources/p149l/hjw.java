package p149l;

import android.content.Context;
import android.view.Surface;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class hjw implements bvl {

    /* JADX INFO: renamed from: a */
    public IjkMediaPlayer f108128a;

    @Override // p149l.bvl
    /* JADX INFO: renamed from: a */
    public void mo104054a(final cvl cvlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f108128a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: l.gjw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                    this.f103108a.m131415l(cvlVar, iMediaPlayer, i, i2, i3, i4);
                }
            });
        }
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: b */
    public void mo104055b(final yul yulVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f108128a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.djw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
                public final void onCompletion(IMediaPlayer iMediaPlayer) {
                    this.f86575a.m131412i(yulVar, iMediaPlayer);
                }
            });
        }
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: c */
    public void mo104056c(final avl avlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f108128a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.fjw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
                public final void onPrepared(IMediaPlayer iMediaPlayer) {
                    this.f97866a.m131414k(avlVar, iMediaPlayer);
                }
            });
        }
    }

    @Override // p149l.bvl
    /* JADX INFO: renamed from: d */
    public void mo104057d(final zul zulVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f108128a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.ejw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f91794a.m131413j(zulVar, iMediaPlayer, i, i2);
                }
            });
        }
    }

    @Override // p149l.bvl
    public long getCurrentPosition() {
        return this.f108128a.getCurrentPosition();
    }

    @Override // p149l.bvl
    public int getVideoHeight() {
        return this.f108128a.getVideoHeight();
    }

    @Override // p149l.bvl
    public int getVideoWidth() {
        return this.f108128a.getVideoWidth();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m131412i(yul yulVar, IMediaPlayer iMediaPlayer) {
        if (yulVar != null) {
            yulVar.mo117732a(this);
        }
    }

    @Override // p149l.bvl
    public void init(Context context) {
        this.f108128a = new IjkMediaPlayer();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m131413j(zul zulVar, IMediaPlayer iMediaPlayer, int i, int i2) {
        if (zulVar != null) {
            return zulVar.mo117735c(this, i, String.valueOf(i2));
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m131414k(avl avlVar, IMediaPlayer iMediaPlayer) {
        if (avlVar != null) {
            avlVar.mo99203g(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m131415l(cvl cvlVar, IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        if (cvlVar != null) {
            cvlVar.mo108878e(this, i, i2);
        }
    }

    @Override // p149l.bvl
    public void prepareAsync() throws IllegalStateException {
        this.f108128a.prepareAsync();
    }

    @Override // p149l.bvl
    public void release() throws IllegalStateException {
        IjkMediaPlayer ijkMediaPlayer = this.f108128a;
        if (ijkMediaPlayer == null) {
            return;
        }
        synchronized (ijkMediaPlayer) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = this.f108128a;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.bvl
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f108128a.setDataSource(str);
    }

    @Override // p149l.bvl
    public void setLooping(boolean z) {
        this.f108128a.setLooping(z);
    }

    @Override // p149l.bvl
    public void setSurface(Surface surface) {
        this.f108128a.setSurface(surface);
    }

    @Override // p149l.bvl
    public void start() throws IllegalStateException {
        this.f108128a.start();
    }
}
