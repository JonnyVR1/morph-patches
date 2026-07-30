package p007l;

import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface xsl extends btl {
    /* JADX INFO: renamed from: f */
    void mo9091f(OnPlayerStateCallback onPlayerStateCallback);

    long getCurrentPosition();

    long getDuration();

    /* JADX INFO: renamed from: n */
    void mo9092n(int i);

    /* JADX INFO: renamed from: p */
    void mo9093p(int i, int i2, int i3);

    void pause();

    void resume();

    void seek(long j);

    void setVolume(float f);

    /* JADX INFO: renamed from: t */
    void mo9094t(boolean z);

    /* JADX INFO: renamed from: y */
    void mo9095y(InterfaceC0021a interfaceC0021a);
}
