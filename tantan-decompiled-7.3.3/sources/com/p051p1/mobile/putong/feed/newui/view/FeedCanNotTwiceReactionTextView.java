package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCanNotTwiceReactionTextView extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f44213i;

    public FeedCanNotTwiceReactionTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public boolean m67487l() {
        return !this.f44213i;
    }

    /* JADX INFO: renamed from: o */
    public void m67488o() {
        if (this.f44213i) {
            return;
        }
        this.f44213i = true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!m67487l()) {
            return false;
        }
        m67488o();
        return super.performClick();
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
