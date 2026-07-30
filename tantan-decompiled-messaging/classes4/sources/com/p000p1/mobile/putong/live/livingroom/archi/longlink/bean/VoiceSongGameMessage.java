package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceSongGameMessage {
    public LongLinkLiveMessage.VoiceSongGameStatusNotice statusNotice;
    public String type;
    public LongLinkLiveMessage.VoiceSongGameUserNotice userNotice;

    public VoiceSongGameMessage(LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice) {
        this.userNotice = voiceSongGameUserNotice;
        this.type = "live.game.voiceSongGameUserNotice";
    }

    public String toString() {
        return "VoiceSongGameMessage{userNotice=" + this.userNotice.toString() + ", statusNotice=" + this.statusNotice.toString() + ", type='" + this.type + "'}";
    }

    public VoiceSongGameMessage(LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice) {
        this.statusNotice = voiceSongGameStatusNotice;
        this.type = "live.game.voiceSongGameStatusNotice";
    }
}
