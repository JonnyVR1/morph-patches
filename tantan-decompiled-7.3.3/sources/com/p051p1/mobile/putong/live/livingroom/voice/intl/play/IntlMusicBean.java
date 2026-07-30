package com.p051p1.mobile.putong.live.livingroom.voice.intl.play;

import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMusicBean implements Serializable {
    public static String STATUS_IDLE = "idle";
    public static String STATUS_PAUSED = "paused";
    public static String STATUS_PLAYING = "playing";
    public String cover;
    public long duration;
    public String filePath;
    public boolean isSetTop;
    public String title;
    public String author = CardButtonsShowAndHideType.unknow;
    public String playStatus = STATUS_IDLE;

    public boolean isPaused() {
        return STATUS_PAUSED.equals(this.playStatus);
    }

    public boolean isPlaying() {
        return STATUS_PLAYING.equals(this.playStatus);
    }

    public boolean isUsing() {
        return !STATUS_IDLE.equals(this.playStatus);
    }

    public String toString() {
        return "IntlMusicBean{filePath='" + this.filePath + "', cover='" + this.cover + "', duration=" + this.duration + ", author='" + this.author + "', title='" + this.title + "'}";
    }
}
