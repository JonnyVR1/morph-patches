package com.tantanapp.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;

/* JADX INFO: loaded from: classes13.dex */
public class AndroidTrackInfo implements ITrackInfo {
    private final MediaPlayer.TrackInfo mTrackInfo;

    private AndroidTrackInfo(MediaPlayer.TrackInfo trackInfo) {
        this.mTrackInfo = trackInfo;
    }

    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        return fromTrackInfo(mediaPlayer.getTrackInfo());
    }

    private static AndroidTrackInfo[] fromTrackInfo(MediaPlayer.TrackInfo[] trackInfoArr) {
        if (trackInfoArr == null) {
            return null;
        }
        AndroidTrackInfo[] androidTrackInfoArr = new AndroidTrackInfo[trackInfoArr.length];
        for (int i = 0; i < trackInfoArr.length; i++) {
            androidTrackInfoArr[i] = new AndroidTrackInfo(trackInfoArr[i]);
        }
        return androidTrackInfoArr;
    }

    @Override // com.tantanapp.ijk.media.player.misc.ITrackInfo
    @TargetApi(19)
    public IMediaFormat getFormat() {
        MediaFormat format;
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null || (format = trackInfo.getFormat()) == null) {
            return null;
        }
        return new AndroidMediaFormat(format);
    }

    @Override // com.tantanapp.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getInfoInline() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        return trackInfo != null ? trackInfo.toString() : "null";
    }

    @Override // com.tantanapp.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getLanguage() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        return trackInfo == null ? LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG : trackInfo.getLanguage();
    }

    @Override // com.tantanapp.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public int getTrackType() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null) {
            return 0;
        }
        return trackInfo.getTrackType();
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo != null) {
            sb.append(trackInfo.toString());
        } else {
            sb.append("null");
        }
        sb.append('}');
        return sb.toString();
    }
}
