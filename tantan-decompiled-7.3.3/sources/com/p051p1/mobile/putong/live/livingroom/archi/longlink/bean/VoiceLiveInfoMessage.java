package com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p051p1.mobile.putong.live.base.data.VoiceLiveMode;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceLiveInfoMessage {
    public String liveId;
    public VoiceLiveMode liveMode;
    public long rewardPoint;
    public String roomId;
    public String template;

    public VoiceLiveInfoMessage(long j, String str, String str2, VoiceLiveMode voiceLiveMode, String str3) {
        this.rewardPoint = j;
        this.roomId = str;
        this.liveId = str2;
        this.liveMode = voiceLiveMode;
        this.template = str3;
    }
}
