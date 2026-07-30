package com.p069ss.bytertc.ktv;

import androidx.annotation.NonNull;
import com.p069ss.bytertc.ktv.data.AudioPlayType;
import com.p069ss.bytertc.ktv.data.AudioTrackType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IKTVPlayer {
    public abstract void pauseMusic(@NonNull String str);

    public abstract void playMusic(@NonNull String str, @NonNull AudioTrackType audioTrackType, @NonNull AudioPlayType audioPlayType);

    public abstract void resumeMusic(@NonNull String str);

    public abstract void seekMusic(@NonNull String str, int i);

    public abstract void setMusicPitch(@NonNull String str, int i);

    public abstract void setMusicVolume(@NonNull String str, int i);

    public abstract void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler);

    public abstract void stopMusic(@NonNull String str);

    public abstract void switchAudioTrackType(@NonNull String str);
}
