package com.p046p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p149l.djj;
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVDraweeView extends VDraweeView {
    public FeedVDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX INFO: renamed from: u */
    public void m65785u(User user) {
        if (user.onlineMatchLocked()) {
            qib0.f154691G.m102336O(this, user.m60124fp().profileSmall().formatted(), 4, 5);
        } else {
            qib0.f154691G.m102331L0(this, user.m60124fp().profileSmall().formatted());
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
