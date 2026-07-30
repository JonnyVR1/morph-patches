package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;
import p153l.r6s;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatSquareBean extends BaseLiveBean {

    @SerializedName("cardList")
    private List<r6s> cardList;

    public List<r6s> getCardList() {
        return this.cardList;
    }

    public void setCardList(List<r6s> list) {
        this.cardList = list;
    }
}
