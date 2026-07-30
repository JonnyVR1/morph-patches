package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseMediaPlayer implements IMediaPlayer {
    private boolean mIsLogEnabled;

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioTrackNum() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPts() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public float getRate() {
        return 0.0f;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoDarDen() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoDarNum() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 1;
    }

    public boolean isLogEnabled() {
        return this.mIsLogEnabled;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z) {
        this.mIsLogEnabled = z;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayback(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setRate(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @Deprecated
    public void setWakeMode(Context context, int i) {
    }
}
