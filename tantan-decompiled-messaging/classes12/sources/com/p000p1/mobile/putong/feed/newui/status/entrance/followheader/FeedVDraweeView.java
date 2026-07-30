package com.p000p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.data.User;
import l.djj;
import l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVDraweeView extends VDraweeView {
    public FeedVDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX INFO: renamed from: u */
    public void m6931u(User user) {
        if (user.onlineMatchLocked()) {
            qib0.G.O(this, user.m1042fp().profileSmall().formatted(), 4, 5);
        } else {
            qib0.G.L0(this, user.m1042fp().profileSmall().formatted());
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
