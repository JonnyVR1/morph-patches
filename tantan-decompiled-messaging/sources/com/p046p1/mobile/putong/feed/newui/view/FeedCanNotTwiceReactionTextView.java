package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCanNotTwiceReactionTextView extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f43365i;

    public FeedCanNotTwiceReactionTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public boolean m66304l() {
        return !this.f43365i;
    }

    /* JADX INFO: renamed from: o */
    public void m66305o() {
        if (this.f43365i) {
            return;
        }
        this.f43365i = true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!m66304l()) {
            return false;
        }
        m66305o();
        return super.performClick();
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
