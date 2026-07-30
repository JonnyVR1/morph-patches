package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceLiveHeartBeatInfoMessage {
    public long heartBeat;
    public String liveId;
    public String roomId;
    public long timestamp;

    public VoiceLiveHeartBeatInfoMessage(String str, String str2, long j, long j2) {
        this.heartBeat = j2;
        this.liveId = str;
        this.roomId = str2;
        this.timestamp = j;
    }
}
