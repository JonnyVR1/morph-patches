package p153l;

import android.content.Context;
import android.view.Surface;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class gmw implements txl {

    /* JADX INFO: renamed from: a */
    public IjkMediaPlayer f105038a;

    @Override // p153l.txl
    /* JADX INFO: renamed from: a */
    public void mo130837a(final uxl uxlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f105038a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: l.fmw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                    this.f99857a.m130844l(uxlVar, iMediaPlayer, i, i2, i3, i4);
                }
            });
        }
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: b */
    public void mo130838b(final qxl qxlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f105038a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.cmw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
                public final void onCompletion(IMediaPlayer iMediaPlayer) {
                    this.f82650a.m130841i(qxlVar, iMediaPlayer);
                }
            });
        }
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: c */
    public void mo130839c(final sxl sxlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f105038a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.emw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
                public final void onPrepared(IMediaPlayer iMediaPlayer) {
                    this.f94705a.m130843k(sxlVar, iMediaPlayer);
                }
            });
        }
    }

    @Override // p153l.txl
    /* JADX INFO: renamed from: d */
    public void mo130840d(final rxl rxlVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f105038a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.dmw
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f89739a.m130842j(rxlVar, iMediaPlayer, i, i2);
                }
            });
        }
    }

    @Override // p153l.txl
    public long getCurrentPosition() {
        return this.f105038a.getCurrentPosition();
    }

    @Override // p153l.txl
    public int getVideoHeight() {
        return this.f105038a.getVideoHeight();
    }

    @Override // p153l.txl
    public int getVideoWidth() {
        return this.f105038a.getVideoWidth();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m130841i(qxl qxlVar, IMediaPlayer iMediaPlayer) {
        if (qxlVar != null) {
            qxlVar.mo141800a(this);
        }
    }

    @Override // p153l.txl
    public void init(Context context) {
        this.f105038a = new IjkMediaPlayer();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m130842j(rxl rxlVar, IMediaPlayer iMediaPlayer, int i, int i2) {
        if (rxlVar != null) {
            return rxlVar.mo141803c(this, i, String.valueOf(i2));
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m130843k(sxl sxlVar, IMediaPlayer iMediaPlayer) {
        if (sxlVar != null) {
            sxlVar.mo141808g(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m130844l(uxl uxlVar, IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        if (uxlVar != null) {
            uxlVar.mo141806e(this, i, i2);
        }
    }

    @Override // p153l.txl
    public void prepareAsync() throws IllegalStateException {
        this.f105038a.prepareAsync();
    }

    @Override // p153l.txl
    public void release() throws IllegalStateException {
        IjkMediaPlayer ijkMediaPlayer = this.f105038a;
        if (ijkMediaPlayer == null) {
            return;
        }
        synchronized (ijkMediaPlayer) {
            try {
                IjkMediaPlayer ijkMediaPlayer2 = this.f105038a;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.txl
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f105038a.setDataSource(str);
    }

    @Override // p153l.txl
    public void setLooping(boolean z) {
        this.f105038a.setLooping(z);
    }

    @Override // p153l.txl
    public void setSurface(Surface surface) {
        this.f105038a.setSurface(surface);
    }

    @Override // p153l.txl
    public void start() throws IllegalStateException {
        this.f105038a.start();
    }
}
