package p149l;

import android.os.Bundle;
import android.view.Surface;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class vph0 implements iwl {

    /* JADX INFO: renamed from: a */
    public wph0 f182481a = yph0.m215627d().m215630e();

    /* JADX INFO: renamed from: b */
    public Surface f182482b;

    public vph0() {
        i620.m134564a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m199236f(g30 g30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        g30Var.mo36055a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        bix.m102127b().m102130e(0, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m199237g(e30 e30Var, IMediaPlayer iMediaPlayer) {
        e30Var.call(iMediaPlayer);
        bix.m102127b().m102130e(0, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m199239i(g30 g30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        if (g30Var == null) {
            return true;
        }
        g30Var.mo36055a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: a */
    public void mo138750a(final g30<Object, Integer, Integer> g30Var) {
        this.f182481a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.uph0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return vph0.m199239i(g30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: b */
    public void mo138751b(final e30<Object> e30Var) {
        this.f182481a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.rph0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                e30Var.call(iMediaPlayer);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: c */
    public void mo138752c(final g30<Object, Integer, Integer> g30Var) {
        this.f182481a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.sph0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return vph0.m199236f(g30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: d */
    public void mo138753d(final e30<Object> e30Var) {
        this.f182481a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.tph0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                vph0.m199237g(e30Var, iMediaPlayer);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: e */
    public void mo138754e() {
        if (this.f182481a.m204913b() instanceof IjkMediaPlayer) {
            ((IjkMediaPlayer) this.f182481a.m204913b()).resetListeners();
        }
    }

    @Override // p149l.iwl
    public float getCurrentPosition() {
        return this.f182481a.getCurrentPosition();
    }

    @Override // p149l.iwl
    public boolean isPlaying() {
        return this.f182481a.isPlaying();
    }

    /* JADX INFO: renamed from: j */
    public void m199240j() {
        this.f182481a.m204912a();
    }

    @Override // p149l.iwl
    public void pause() {
        this.f182481a.pause();
        bix.m102127b().m102130e(0, 1, null);
    }

    @Override // p149l.iwl
    public void prepareAsync() {
        Surface surface = this.f182482b;
        if (surface != null && surface.isValid()) {
            this.f182481a.setSurface(this.f182482b);
        }
        this.f182481a.prepareAsync();
    }

    @Override // p149l.iwl
    public void release() {
        this.f182481a.release();
        i620.m134565b(this);
        bix.m102127b().m102130e(0, 3, null);
    }

    @Override // p149l.iwl
    public void reset() {
        this.f182481a.reset();
        bix.m102127b().m102130e(0, 2, null);
    }

    @Override // p149l.iwl
    public void seekTo(long j) {
        this.f182481a.seekTo(0L);
    }

    @Override // p149l.iwl
    public void setDataSource(String str) throws IOException {
        this.f182481a.setDataSource(str);
    }

    @Override // p149l.iwl
    public void setLooping(boolean z) {
        this.f182481a.setLooping(z);
    }

    @Override // p149l.iwl
    public void setSurface(Surface surface) {
        this.f182482b = surface;
        this.f182481a.setSurface(surface);
    }

    @Override // p149l.iwl
    public void setVolume(float f) {
        this.f182481a.setVolume(f, f);
    }

    @Override // p149l.iwl
    public void start() {
        this.f182481a.start();
        bix.m102127b().m102130e(0, 0, null);
    }

    @Override // p149l.iwl
    public void stop() {
        this.f182481a.stop();
        bix.m102127b().m102130e(0, 6, null);
    }
}
