package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;
import p149l.q4s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatSquareBean extends BaseLiveBean {

    @SerializedName("cardList")
    private List<q4s> cardList;

    public List<q4s> getCardList() {
        return this.cardList;
    }

    public void setCardList(List<q4s> list) {
        this.cardList = list;
    }
}
