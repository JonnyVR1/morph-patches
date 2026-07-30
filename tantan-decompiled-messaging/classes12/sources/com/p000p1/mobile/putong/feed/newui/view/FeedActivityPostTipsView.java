package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.ExplorePostBubble;
import l.bkb0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.llg;
import v.VDraweeView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedActivityPostTipsView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f4788d;

    /* JADX INFO: renamed from: e */
    public VText f4789e;

    public FeedActivityPostTipsView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7404p(this);
        this.f4789e.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: p */
    public final void m7404p(View view) {
        llg.m11642a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m7405q(ExplorePostBubble explorePostBubble) {
        this.f4789e.setText(explorePostBubble.title);
        boolean zIsEmpty = TextUtils.isEmpty(explorePostBubble.picture);
        VDraweeView vDraweeView = this.f4788d;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
            xdl0.V(this.f4789e, t100.i);
            return;
        }
        xdl0.M(vDraweeView, true);
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView2 = this.f4788d;
        String str = explorePostBubble.picture;
        int i = t100.s;
        bkb0Var.I0(vDraweeView2, str, i, i);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
