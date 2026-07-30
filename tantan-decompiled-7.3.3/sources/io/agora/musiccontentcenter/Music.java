package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Music {
    public ClimaxSegment[] climaxSegments;
    public int durationS;
    public int[] lyricTypes;
    public MvProperty[] mvProperties;
    public String name;
    public int pitchType;
    public String poster;
    public String releaseTime;
    public String singer;
    public long songCode;
    public int type;

    @CalledByNative
    public Music(long j, String str, String str2, String str3, String str4, int i, int i2, int i3, int[] iArr, MvProperty[] mvPropertyArr, ClimaxSegment[] climaxSegmentArr) {
        this.songCode = j;
        this.name = str;
        this.singer = str2;
        this.poster = str3;
        this.releaseTime = str4;
        this.type = i;
        this.pitchType = i2;
        this.durationS = i3;
        this.lyricTypes = iArr;
        this.mvProperties = mvPropertyArr;
        this.climaxSegments = climaxSegmentArr;
    }

    @CalledByNative
    public ClimaxSegment[] getClimaxSegments() {
        return this.climaxSegments;
    }

    @CalledByNative
    public int getDurationS() {
        return this.durationS;
    }

    @CalledByNative
    public int[] getLyricTypes() {
        return this.lyricTypes;
    }

    @CalledByNative
    public MvProperty[] getMvProperties() {
        return this.mvProperties;
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    @CalledByNative
    public int getPitchType() {
        return this.pitchType;
    }

    @CalledByNative
    public String getPoster() {
        return this.poster;
    }

    @CalledByNative
    public String getReleaseTime() {
        return this.releaseTime;
    }

    @CalledByNative
    public String getSinger() {
        return this.singer;
    }

    @CalledByNative
    public long getSongCode() {
        return this.songCode;
    }

    @CalledByNative
    public int getType() {
        return this.type;
    }

    public String toString() {
        return "Music{songCode=" + this.songCode + ", name='" + this.name + "', singer='" + this.singer + "', poster='" + this.poster + "', releaseTime='" + this.releaseTime + "', type=" + this.type + ", pitchType=" + this.pitchType + ", durationS=" + this.durationS + ", lyricTypes=" + Arrays.toString(this.lyricTypes) + ", mvProperties=" + Arrays.toString(this.mvProperties) + ", climaxSegments=" + Arrays.toString(this.climaxSegments) + '}';
    }

    public Music() {
    }
}
