package p149l;

import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
public interface xsl extends btl {
    /* JADX INFO: renamed from: f */
    void mo120999f(OnPlayerStateCallback onPlayerStateCallback);

    long getCurrentPosition();

    long getDuration();

    /* JADX INFO: renamed from: n */
    void mo121000n(int i);

    /* JADX INFO: renamed from: p */
    void mo121001p(int i, int i2, int i3);

    void pause();

    void resume();

    void seek(long j);

    void setVolume(float f);

    /* JADX INFO: renamed from: t */
    void mo121002t(boolean z);

    /* JADX INFO: renamed from: y */
    void mo121003y(InterfaceC4109a interfaceC4109a);
}
