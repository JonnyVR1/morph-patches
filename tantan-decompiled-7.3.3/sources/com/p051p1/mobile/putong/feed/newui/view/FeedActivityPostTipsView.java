package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.feed.data.ExplorePostBubble;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;
import p153l.ang;
import p153l.bnl0;
import p153l.fsb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedActivityPostTipsView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f44175d;

    /* JADX INFO: renamed from: e */
    public VText f44176e;

    public FeedActivityPostTipsView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67427p(this);
        this.f44176e.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: p */
    public final void m67427p(View view) {
        ang.m98962a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m67428q(ExplorePostBubble explorePostBubble) {
        this.f44176e.setText(explorePostBubble.title);
        boolean zIsEmpty = TextUtils.isEmpty(explorePostBubble.picture);
        VDraweeView vDraweeView = this.f44175d;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105538V(this.f44176e, qa00.f156322i);
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView2 = this.f44175d;
        String str = explorePostBubble.picture;
        int i = qa00.f156332s;
        fsb0Var.m127109I0(vDraweeView2, str, i, i);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedActivityPostTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
