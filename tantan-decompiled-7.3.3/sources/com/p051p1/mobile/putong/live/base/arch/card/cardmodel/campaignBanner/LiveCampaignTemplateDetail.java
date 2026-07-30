package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.ArrayList;
import java.util.List;
import p153l.r6s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCampaignTemplateDetail extends BaseLiveBean {

    @SerializedName("cards")
    public List<r6s> cards;

    public List<r6s> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<r6s> arrayList) {
        this.cards = arrayList;
    }
}
