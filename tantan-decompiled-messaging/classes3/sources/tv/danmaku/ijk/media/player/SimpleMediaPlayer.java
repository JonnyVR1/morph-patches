package tv.danmaku.ijk.media.player;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class SimpleMediaPlayer extends BaseMediaPlayer implements IMediaPlayer {
    private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IMediaPlayer.OnVideoMediacodecChangedListener mOnVideoMediacodecChangedListener;
    private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public void attachListeners(IMediaPlayer iMediaPlayer) {
        iMediaPlayer.setOnPreparedListener(this.mOnPreparedListener);
        iMediaPlayer.setOnBufferingUpdateListener(this.mOnBufferingUpdateListener);
        iMediaPlayer.setOnCompletionListener(this.mOnCompletionListener);
        iMediaPlayer.setOnSeekCompleteListener(this.mOnSeekCompleteListener);
        iMediaPlayer.setOnVideoSizeChangedListener(this.mOnVideoSizeChangedListener);
        iMediaPlayer.setOnVideoMediacodecChangedListener(this.mOnVideoMediacodecChangedListener);
        iMediaPlayer.setOnErrorListener(this.mOnErrorListener);
        iMediaPlayer.setOnInfoListener(this.mOnInfoListener);
    }

    public final void notifyOnBufferingUpdate(int i) {
        IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener = this.mOnBufferingUpdateListener;
        if (onBufferingUpdateListener != null) {
            onBufferingUpdateListener.onBufferingUpdate(this, i);
        }
    }

    public final void notifyOnCompletion() {
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this);
        }
    }

    public final boolean notifyOnError(int i, int i2) {
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        if (onErrorListener != null) {
            return onErrorListener.onError(this, i, i2);
        }
        return false;
    }

    public final boolean notifyOnInfo(int i, int i2) {
        IMediaPlayer.OnInfoListener onInfoListener = this.mOnInfoListener;
        if (onInfoListener != null) {
            return onInfoListener.onInfo(this, i, i2);
        }
        return false;
    }

    public final void notifyOnPrepared() {
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this);
        }
    }

    public final void notifyOnSeekComplete() {
        IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.mOnSeekCompleteListener;
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.onSeekComplete(this);
        }
    }

    public final void notifyOnVideoMediacodecChanged(int i) {
        IMediaPlayer.OnVideoMediacodecChangedListener onVideoMediacodecChangedListener = this.mOnVideoMediacodecChangedListener;
        if (onVideoMediacodecChangedListener != null) {
            onVideoMediacodecChangedListener.onVideoMediacodecChanged(this, i);
        }
    }

    public final void notifyOnVideoSizeChanged(int i, int i2, int i3, int i4) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, i3, i4);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnVideoMediacodecChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnVideoMediacodecChangedListener(IMediaPlayer.OnVideoMediacodecChangedListener onVideoMediacodecChangedListener) {
        this.mOnVideoMediacodecChangedListener = onVideoMediacodecChangedListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void updateScreenSize(int i, int i2) {
    }
}
