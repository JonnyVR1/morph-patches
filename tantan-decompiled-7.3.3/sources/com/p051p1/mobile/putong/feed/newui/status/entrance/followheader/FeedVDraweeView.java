package com.p051p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p153l.uqb0;
import p153l.wlj;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVDraweeView extends VDraweeView {
    public FeedVDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    /* JADX INFO: renamed from: u */
    public void m66968u(User user) {
        if (user.onlineMatchLocked()) {
            uqb0.f180374G.m127120O(this, user.m61308fp().profileSmall().formatted(), 4, 5);
        } else {
            uqb0.f180374G.m127115L0(this, user.m61308fp().profileSmall().formatted());
        }
    }

    public FeedVDraweeView(Context context) {
        super(context);
    }

    public FeedVDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedVDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedVDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
