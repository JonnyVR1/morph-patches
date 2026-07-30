package com.p000p1.mobile.putong.feed.newui.status.entrance.followheader;

import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MineAskPostState extends BubbleInfo {
    public MineAskPostState() {
        Owner owner = new Owner();
        this.owner = owner;
        owner.f264id = ((DbObject) FeedModule.m1140H().me_()).id;
    }

    public String getShowName(User user) {
        return FeedModule.f313a.getString(R$string.f502d2);
    }
}
