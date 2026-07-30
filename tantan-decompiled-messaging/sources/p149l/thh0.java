package p149l;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class thh0 implements iwl {

    /* JADX INFO: renamed from: b */
    public boolean f170250b = false;

    /* JADX INFO: renamed from: a */
    public MediaPlayer f170249a = new MediaPlayer();

    public thh0() {
        i620.m134564a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m188907f(e30 e30Var, MediaPlayer mediaPlayer) {
        e30Var.call(mediaPlayer);
        bix.m102127b().m102130e(1, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m188908g(g30 g30Var, MediaPlayer mediaPlayer, int i, int i2) {
        g30Var.mo36055a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        bix.m102127b().m102130e(1, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m188910i(g30 g30Var, MediaPlayer mediaPlayer, int i, int i2) {
        if (g30Var == null) {
            return true;
        }
        g30Var.mo36055a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: a */
    public void mo138750a(final g30<Object, Integer, Integer> g30Var) {
        this.f170249a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.phh0
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return thh0.m188910i(g30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: b */
    public void mo138751b(final e30<Object> e30Var) {
        this.f170249a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.qhh0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                e30Var.call(mediaPlayer);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: c */
    public void mo138752c(final g30<Object, Integer, Integer> g30Var) {
        this.f170249a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.ohh0
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return thh0.m188908g(g30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: d */
    public void mo138753d(final e30<Object> e30Var) {
        this.f170249a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.rhh0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                thh0.m188907f(e30Var, mediaPlayer);
            }
        });
    }

    @Override // p149l.iwl
    /* JADX INFO: renamed from: e */
    public void mo138754e() {
        this.f170249a.setOnPreparedListener(null);
        this.f170249a.setOnInfoListener(null);
        this.f170249a.setOnErrorListener(null);
        this.f170249a.setOnCompletionListener(null);
    }

    @Override // p149l.iwl
    public float getCurrentPosition() {
        return this.f170249a.getCurrentPosition();
    }

    @Override // p149l.iwl
    public boolean isPlaying() {
        return this.f170249a.isPlaying();
    }

    @Override // p149l.iwl
    public void pause() {
        this.f170249a.pause();
        bix.m102127b().m102130e(1, 1, null);
    }

    @Override // p149l.iwl
    public void prepareAsync() {
        this.f170249a.prepareAsync();
    }

    @Override // p149l.iwl
    public void release() {
        this.f170249a.release();
        i620.m134565b(this);
        this.f170250b = true;
        bix.m102127b().m102130e(1, 3, null);
    }

    @Override // p149l.iwl
    public void reset() {
        if (this.f170250b) {
            return;
        }
        this.f170249a.reset();
        bix.m102127b().m102130e(1, 2, null);
    }

    @Override // p149l.iwl
    public void seekTo(long j) {
        this.f170249a.seekTo(0);
    }

    @Override // p149l.iwl
    public void setDataSource(String str) throws IOException {
        this.f170249a.setDataSource(str);
    }

    @Override // p149l.iwl
    public void setLooping(boolean z) {
        this.f170249a.setLooping(z);
    }

    @Override // p149l.iwl
    public void setSurface(Surface surface) {
        this.f170249a.setSurface(surface);
    }

    @Override // p149l.iwl
    public void setVolume(float f) {
        this.f170249a.setVolume(f, f);
    }

    @Override // p149l.iwl
    public void start() {
        this.f170249a.start();
        bix.m102127b().m102130e(1, 0, null);
    }

    @Override // p149l.iwl
    public void stop() {
        this.f170249a.stop();
        bix.m102127b().m102130e(1, 6, null);
    }
}
