package p153l;

import android.os.Bundle;
import android.view.Surface;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class cyh0 implements azl {

    /* JADX INFO: renamed from: a */
    public dyh0 f84377a = fyh0.m128089d().m128092e();

    /* JADX INFO: renamed from: b */
    public Surface f84378b;

    public cyh0() {
        qe20.m176220a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m113164f(a30 a30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        a30Var.mo37058a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        yqx.m217138b().m217141e(0, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m113165g(y20 y20Var, IMediaPlayer iMediaPlayer) {
        y20Var.call(iMediaPlayer);
        yqx.m217138b().m217141e(0, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m113167i(a30 a30Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        if (a30Var == null) {
            return true;
        }
        a30Var.mo37058a(iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: a */
    public void mo99483a(final a30<Object, Integer, Integer> a30Var) {
        this.f84377a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.byh0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return cyh0.m113167i(a30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: b */
    public void mo99484b(final y20<Object> y20Var) {
        this.f84377a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.yxh0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                y20Var.call(iMediaPlayer);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: c */
    public void mo99485c(final a30<Object, Integer, Integer> a30Var) {
        this.f84377a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.zxh0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return cyh0.m113164f(a30Var, iMediaPlayer, i, i2);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: d */
    public void mo99486d(final y20<Object> y20Var) {
        this.f84377a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.ayh0
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                cyh0.m113165g(y20Var, iMediaPlayer);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: e */
    public void mo99487e() {
        if (this.f84377a.m118696b() instanceof IjkMediaPlayer) {
            ((IjkMediaPlayer) this.f84377a.m118696b()).resetListeners();
        }
    }

    @Override // p153l.azl
    public float getCurrentPosition() {
        return this.f84377a.getCurrentPosition();
    }

    @Override // p153l.azl
    public boolean isPlaying() {
        return this.f84377a.isPlaying();
    }

    /* JADX INFO: renamed from: j */
    public void m113168j() {
        this.f84377a.m118695a();
    }

    @Override // p153l.azl
    public void pause() {
        this.f84377a.pause();
        yqx.m217138b().m217141e(0, 1, null);
    }

    @Override // p153l.azl
    public void prepareAsync() {
        Surface surface = this.f84378b;
        if (surface != null && surface.isValid()) {
            this.f84377a.setSurface(this.f84378b);
        }
        this.f84377a.prepareAsync();
    }

    @Override // p153l.azl
    public void release() {
        this.f84377a.release();
        qe20.m176221b(this);
        yqx.m217138b().m217141e(0, 3, null);
    }

    @Override // p153l.azl
    public void reset() {
        this.f84377a.reset();
        yqx.m217138b().m217141e(0, 2, null);
    }

    @Override // p153l.azl
    public void seekTo(long j) {
        this.f84377a.seekTo(0L);
    }

    @Override // p153l.azl
    public void setDataSource(String str) throws IOException {
        this.f84377a.setDataSource(str);
    }

    @Override // p153l.azl
    public void setLooping(boolean z) {
        this.f84377a.setLooping(z);
    }

    @Override // p153l.azl
    public void setSurface(Surface surface) {
        this.f84378b = surface;
        this.f84377a.setSurface(surface);
    }

    @Override // p153l.azl
    public void setVolume(float f) {
        this.f84377a.setVolume(f, f);
    }

    @Override // p153l.azl
    public void start() {
        this.f84377a.start();
        yqx.m217138b().m217141e(0, 0, null);
    }

    @Override // p153l.azl
    public void stop() {
        this.f84377a.stop();
        yqx.m217138b().m217141e(0, 6, null);
    }
}
