package com.p046p1.mobile.putong.feed.newui.status.entrance.followheader;

import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class MineAskPostState extends BubbleInfo {
    public MineAskPostState() {
        Owner owner = new Owner();
        this.owner = owner;
        owner.f38803id = FeedModule.m60222H().me_().f56011id;
    }

    public String getShowName(User user) {
        return FeedModule.f38852a.getString(R$string.f39041d2);
    }
}
