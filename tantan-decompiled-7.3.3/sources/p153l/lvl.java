package p153l;

import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
public interface lvl extends pvl {
    /* JADX INFO: renamed from: f */
    void mo155995f(OnPlayerStateCallback onPlayerStateCallback);

    long getCurrentPosition();

    long getDuration();

    /* JADX INFO: renamed from: n */
    void mo155996n(int i);

    /* JADX INFO: renamed from: p */
    void mo155997p(int i, int i2, int i3);

    void pause();

    void resume();

    void seek(long j);

    void setVolume(float f);

    /* JADX INFO: renamed from: t */
    void mo155998t(boolean z);

    /* JADX INFO: renamed from: y */
    void mo155999y(InterfaceC4260a interfaceC4260a);
}
