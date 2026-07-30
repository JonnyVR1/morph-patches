package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import java.util.ArrayList;
import java.util.List;
import p149l.q4s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareHeaderBean extends BaseLiveBean {

    @SerializedName("cards")
    private List<q4s> cards;

    @SerializedName("entrys")
    public List<LiveQuickEntryCardData> entrys;

    public List<q4s> getCards() {
        if (this.cards == null) {
            this.cards = new ArrayList();
        }
        return this.cards;
    }

    public List<LiveQuickEntryCardData> getEntrys() {
        if (this.entrys == null) {
            this.entrys = new ArrayList();
        }
        return this.entrys;
    }

    public void setCards(List<q4s> list) {
        this.cards = list;
    }

    public void setEntrys(List<LiveQuickEntryCardData> list) {
        this.entrys = list;
    }
}
