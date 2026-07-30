package tv.danmaku.ijk.media.player;

/* JADX INFO: loaded from: classes3.dex */
public interface OnPlayerStateCallback {
    void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i);

    void onCompletion(IMediaPlayer iMediaPlayer);

    boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2);

    void onPrepared(IMediaPlayer iMediaPlayer);

    void onSeekComplete(IMediaPlayer iMediaPlayer);

    void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i);

    void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4);
}
