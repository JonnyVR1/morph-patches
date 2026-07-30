package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import java.util.ArrayList;
import java.util.List;
import p153l.r6s;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalSquareHeaderBean extends BaseLiveBean {

    @SerializedName("cards")
    private List<r6s> cards;

    @SerializedName("entrys")
    public List<LiveQuickEntryCardData> entrys;

    public List<r6s> getCards() {
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

    public void setCards(List<r6s> list) {
        this.cards = list;
    }

    public void setEntrys(List<LiveQuickEntryCardData> list) {
        this.entrys = list;
    }
}
