package p003l;

import android.os.Bundle;
import android.view.Surface;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import l.wph0;
import l.yph0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vph0 implements iwl {

    /* JADX INFO: renamed from: a */
    public wph0 f8375a = yph0.d().e();

    /* JADX INFO: renamed from: b */
    public Surface f8376b;

    public vph0() {
        i620.m5068a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m8394f(g30 g30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        g30Var.mo4389a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        bix.m2953b().m2956e(0, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8395g(e30 e30Var, IMediaPlayer iMediaPlayer) {
        e30Var.call(iMediaPlayer);
        bix.m2953b().m2956e(0, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m8397i(g30 g30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        if (g30Var == null) {
            return true;
        }
        g30Var.mo4389a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: a */
    public void mo5248a(final g30<Object, Integer, Integer> g30Var) {
        this.f8375a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.uph0
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return vph0.m8397i(g30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: b */
    public void mo5249b(final e30<Object> e30Var) {
        this.f8375a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.rph0
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                e30Var.call(iMediaPlayer);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: c */
    public void mo5250c(final g30<Object, Integer, Integer> g30Var) {
        this.f8375a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.sph0
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return vph0.m8394f(g30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: d */
    public void mo5251d(final e30<Object> e30Var) {
        this.f8375a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.tph0
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                vph0.m8395g(e30Var, iMediaPlayer);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: e */
    public void mo5252e() {
        if (this.f8375a.b() instanceof IjkMediaPlayer) {
            this.f8375a.b().resetListeners();
        }
    }

    @Override // p003l.iwl
    public float getCurrentPosition() {
        return this.f8375a.getCurrentPosition();
    }

    @Override // p003l.iwl
    public boolean isPlaying() {
        return this.f8375a.isPlaying();
    }

    /* JADX INFO: renamed from: j */
    public void m8398j() {
        this.f8375a.a();
    }

    @Override // p003l.iwl
    public void pause() {
        this.f8375a.pause();
        bix.m2953b().m2956e(0, 1, null);
    }

    @Override // p003l.iwl
    public void prepareAsync() {
        Surface surface = this.f8376b;
        if (surface != null && surface.isValid()) {
            this.f8375a.setSurface(this.f8376b);
        }
        this.f8375a.prepareAsync();
    }

    @Override // p003l.iwl
    public void release() {
        this.f8375a.release();
        i620.m5069b(this);
        bix.m2953b().m2956e(0, 3, null);
    }

    @Override // p003l.iwl
    public void reset() {
        this.f8375a.reset();
        bix.m2953b().m2956e(0, 2, null);
    }

    @Override // p003l.iwl
    public void seekTo(long j) {
        this.f8375a.seekTo(0L);
    }

    @Override // p003l.iwl
    public void setDataSource(String str) throws IOException {
        this.f8375a.setDataSource(str);
    }

    @Override // p003l.iwl
    public void setLooping(boolean z) {
        this.f8375a.setLooping(z);
    }

    @Override // p003l.iwl
    public void setSurface(Surface surface) {
        this.f8376b = surface;
        this.f8375a.setSurface(surface);
    }

    @Override // p003l.iwl
    public void setVolume(float f) {
        this.f8375a.setVolume(f, f);
    }

    @Override // p003l.iwl
    public void start() {
        this.f8375a.start();
        bix.m2953b().m2956e(0, 0, null);
    }

    @Override // p003l.iwl
    public void stop() {
        this.f8375a.stop();
        bix.m2953b().m2956e(0, 6, null);
    }
}
