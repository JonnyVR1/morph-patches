package p153l;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class aqh0 implements azl {

    /* JADX INFO: renamed from: b */
    public boolean f72818b = false;

    /* JADX INFO: renamed from: a */
    public MediaPlayer f72817a = new MediaPlayer();

    public aqh0() {
        qe20.m176220a(this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m99479f(y20 y20Var, MediaPlayer mediaPlayer) {
        y20Var.call(mediaPlayer);
        yqx.m217138b().m217141e(1, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m99480g(a30 a30Var, MediaPlayer mediaPlayer, int i, int i2) {
        a30Var.mo37058a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = new Bundle();
        bundle.putInt("what", i);
        bundle.putInt("extra", i2);
        yqx.m217138b().m217141e(1, 5, bundle);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m99482i(a30 a30Var, MediaPlayer mediaPlayer, int i, int i2) {
        if (a30Var == null) {
            return true;
        }
        a30Var.mo37058a(mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
        return true;
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: a */
    public void mo99483a(final a30<Object, Integer, Integer> a30Var) {
        this.f72817a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.wph0
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return aqh0.m99482i(a30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: b */
    public void mo99484b(final y20<Object> y20Var) {
        this.f72817a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.xph0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                y20Var.call(mediaPlayer);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: c */
    public void mo99485c(final a30<Object, Integer, Integer> a30Var) {
        this.f72817a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.vph0
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return aqh0.m99480g(a30Var, mediaPlayer, i, i2);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: d */
    public void mo99486d(final y20<Object> y20Var) {
        this.f72817a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.yph0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                aqh0.m99479f(y20Var, mediaPlayer);
            }
        });
    }

    @Override // p153l.azl
    /* JADX INFO: renamed from: e */
    public void mo99487e() {
        this.f72817a.setOnPreparedListener(null);
        this.f72817a.setOnInfoListener(null);
        this.f72817a.setOnErrorListener(null);
        this.f72817a.setOnCompletionListener(null);
    }

    @Override // p153l.azl
    public float getCurrentPosition() {
        return this.f72817a.getCurrentPosition();
    }

    @Override // p153l.azl
    public boolean isPlaying() {
        return this.f72817a.isPlaying();
    }

    @Override // p153l.azl
    public void pause() {
        this.f72817a.pause();
        yqx.m217138b().m217141e(1, 1, null);
    }

    @Override // p153l.azl
    public void prepareAsync() {
        this.f72817a.prepareAsync();
    }

    @Override // p153l.azl
    public void release() {
        this.f72817a.release();
        qe20.m176221b(this);
        this.f72818b = true;
        yqx.m217138b().m217141e(1, 3, null);
    }

    @Override // p153l.azl
    public void reset() {
        if (this.f72818b) {
            return;
        }
        this.f72817a.reset();
        yqx.m217138b().m217141e(1, 2, null);
    }

    @Override // p153l.azl
    public void seekTo(long j) {
        this.f72817a.seekTo(0);
    }

    @Override // p153l.azl
    public void setDataSource(String str) throws IOException {
        this.f72817a.setDataSource(str);
    }

    @Override // p153l.azl
    public void setLooping(boolean z) {
        this.f72817a.setLooping(z);
    }

    @Override // p153l.azl
    public void setSurface(Surface surface) {
        this.f72817a.setSurface(surface);
    }

    @Override // p153l.azl
    public void setVolume(float f) {
        this.f72817a.setVolume(f, f);
    }

    @Override // p153l.azl
    public void start() {
        this.f72817a.start();
        yqx.m217138b().m217141e(1, 0, null);
    }

    @Override // p153l.azl
    public void stop() {
        this.f72817a.stop();
        yqx.m217138b().m217141e(1, 6, null);
    }
}
