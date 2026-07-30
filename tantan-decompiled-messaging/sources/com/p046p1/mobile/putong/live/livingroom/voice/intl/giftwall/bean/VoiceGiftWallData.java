package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallData {
    private BLiveVoiceGiftWallBrief voiceGiftWallBrief;
    private List<BLiveVoiceGiftWallBookInfo> voiceGiftWallList;

    public VoiceGiftWallData(List<BLiveVoiceGiftWallBookInfo> list, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.voiceGiftWallList = list;
        this.voiceGiftWallBrief = bLiveVoiceGiftWallBrief;
    }

    public BLiveVoiceGiftWallBrief getVoiceGiftWallBrief() {
        return this.voiceGiftWallBrief;
    }

    public List<BLiveVoiceGiftWallBookInfo> getVoiceGiftWallList() {
        return this.voiceGiftWallList;
    }
}
