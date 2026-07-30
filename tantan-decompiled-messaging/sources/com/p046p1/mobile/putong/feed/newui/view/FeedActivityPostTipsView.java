package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.feed.data.ExplorePostBubble;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;
import p149l.bkb0;
import p149l.llg;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedActivityPostTipsView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f43327d;

    /* JADX INFO: renamed from: e */
    public VText f43328e;

    public FeedActivityPostTipsView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66244p(this);
        this.f43328e.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: p */
    public final void m66244p(View view) {
        llg.m150479a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m66245q(ExplorePostBubble explorePostBubble) {
        this.f43328e.setText(explorePostBubble.title);
        boolean zIsEmpty = TextUtils.isEmpty(explorePostBubble.picture);
        VDraweeView vDraweeView = this.f43327d;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208358V(this.f43328e, t100.f167260i);
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView2 = this.f43327d;
        String str = explorePostBubble.picture;
        int i = t100.f167270s;
        bkb0Var.m102325I0(vDraweeView2, str, i, i);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
