package com.p051p1.mobile.putong.live.external.internal.virtualVoice.search;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.ArrayList;
import java.util.List;
import p153l.r6s;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceSearchDetail extends BaseLiveBean {

    @SerializedName("cards")
    public List<r6s> cards;

    public List<r6s> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<r6s> arrayList) {
        this.cards = arrayList;
    }
}
