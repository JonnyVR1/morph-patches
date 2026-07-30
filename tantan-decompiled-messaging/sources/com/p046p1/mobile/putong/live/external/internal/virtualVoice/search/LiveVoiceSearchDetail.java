package com.p046p1.mobile.putong.live.external.internal.virtualVoice.search;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.ArrayList;
import java.util.List;
import p149l.q4s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceSearchDetail extends BaseLiveBean {

    @SerializedName("cards")
    public List<q4s> cards;

    public List<q4s> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<q4s> arrayList) {
        this.cards = arrayList;
    }
}
