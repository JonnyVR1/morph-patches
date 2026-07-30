package com.p051p1.mobile.putong.feed.newui.status.entrance.followheader;

import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class MineAskPostState extends BubbleInfo {
    public MineAskPostState() {
        Owner owner = new Owner();
        this.owner = owner;
        owner.f39651id = FeedModule.m61406H().me_().f56859id;
    }

    public String getShowName(User user) {
        return FeedModule.f39700a.getString(R$string.f39889d2);
    }
}
