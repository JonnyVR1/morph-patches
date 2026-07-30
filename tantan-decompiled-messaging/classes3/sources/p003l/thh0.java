package p003l;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class thh0 implements iwl {

    /* JADX INFO: renamed from: b */
    public boolean f7491b = false;

    /* JADX INFO: renamed from: a */
    public MediaPlayer f7490a = new MediaPlayer();

    public thh0() {
        i620.m5068a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7749f(e30 e30Var, MediaPlayer mediaPlayer) {
        e30Var.call(mediaPlayer);
        bix.m2953b().m2956e(1, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m7750g(g30 g30Var, MediaPlayer mediaPlayer, int i, int i2) {
        g30Var.mo4389a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        bix.m2953b().m2956e(1, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m7752i(g30 g30Var, MediaPlayer mediaPlayer, int i, int i2) {
        if (g30Var == null) {
            return true;
        }
        g30Var.mo4389a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: a */
    public void mo5248a(final g30<Object, Integer, Integer> g30Var) {
        this.f7490a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.phh0
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return thh0.m7752i(g30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: b */
    public void mo5249b(final e30<Object> e30Var) {
        this.f7490a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.qhh0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                e30Var.call(mediaPlayer);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: c */
    public void mo5250c(final g30<Object, Integer, Integer> g30Var) {
        this.f7490a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.ohh0
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return thh0.m7750g(g30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: d */
    public void mo5251d(final e30<Object> e30Var) {
        this.f7490a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.rhh0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                thh0.m7749f(e30Var, mediaPlayer);
            }
        });
    }

    @Override // p003l.iwl
    /* JADX INFO: renamed from: e */
    public void mo5252e() {
        this.f7490a.setOnPreparedListener(null);
        this.f7490a.setOnInfoListener(null);
        this.f7490a.setOnErrorListener(null);
        this.f7490a.setOnCompletionListener(null);
    }

    @Override // p003l.iwl
    public float getCurrentPosition() {
        return this.f7490a.getCurrentPosition();
    }

    @Override // p003l.iwl
    public boolean isPlaying() {
        return this.f7490a.isPlaying();
    }

    @Override // p003l.iwl
    public void pause() {
        this.f7490a.pause();
        bix.m2953b().m2956e(1, 1, null);
    }

    @Override // p003l.iwl
    public void prepareAsync() {
        this.f7490a.prepareAsync();
    }

    @Override // p003l.iwl
    public void release() {
        this.f7490a.release();
        i620.m5069b(this);
        this.f7491b = true;
        bix.m2953b().m2956e(1, 3, null);
    }

    @Override // p003l.iwl
    public void reset() {
        if (this.f7491b) {
            return;
        }
        this.f7490a.reset();
        bix.m2953b().m2956e(1, 2, null);
    }

    @Override // p003l.iwl
    public void seekTo(long j) {
        this.f7490a.seekTo(0);
    }

    @Override // p003l.iwl
    public void setDataSource(String str) throws IOException {
        this.f7490a.setDataSource(str);
    }

    @Override // p003l.iwl
    public void setLooping(boolean z) {
        this.f7490a.setLooping(z);
    }

    @Override // p003l.iwl
    public void setSurface(Surface surface) {
        this.f7490a.setSurface(surface);
    }

    @Override // p003l.iwl
    public void setVolume(float f) {
        this.f7490a.setVolume(f, f);
    }

    @Override // p003l.iwl
    public void start() {
        this.f7490a.start();
        bix.m2953b().m2956e(1, 0, null);
    }

    @Override // p003l.iwl
    public void stop() {
        this.f7490a.stop();
        bix.m2953b().m2956e(1, 6, null);
    }
}
