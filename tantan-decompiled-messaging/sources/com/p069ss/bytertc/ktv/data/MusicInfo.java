package com.p069ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class MusicInfo {
    public int climaxEndTime;
    public int climaxStartTime;
    public int duration;
    public boolean enableScore;
    public LyricStatus lyricStatus;
    public String musicId;
    public String musicName;
    public String posterUrl;
    public String singer;
    public long updateTimestamp;
    public String vendorId;
    public String vendorName;

    @CalledByNative
    public MusicInfo(String str, String str2, String str3, String str4, String str5, long j, String str6, LyricStatus lyricStatus, int i, boolean z, int i2, int i3) {
        this.musicId = str;
        this.musicName = str2;
        this.singer = str3;
        this.vendorId = str4;
        this.vendorName = str5;
        this.updateTimestamp = j;
        this.posterUrl = str6;
        this.lyricStatus = lyricStatus;
        this.duration = i;
        this.enableScore = z;
        this.climaxStartTime = i2;
        this.climaxEndTime = i3;
    }

    public String toString() {
        return "Music{musicId='" + this.musicId + "', musicName='" + this.musicName + "', singer='" + this.singer + "', vendorId='" + this.vendorId + "', vendorName='" + this.vendorName + "', updateTimestamp=" + this.updateTimestamp + ", posterUrl='" + this.posterUrl + "', lyricStatus=" + this.lyricStatus + ", duration=" + this.duration + ", enableScore=" + this.enableScore + ", climaxStartTime=" + this.climaxStartTime + ", climaxEndTime=" + this.climaxEndTime + '}';
    }
}
