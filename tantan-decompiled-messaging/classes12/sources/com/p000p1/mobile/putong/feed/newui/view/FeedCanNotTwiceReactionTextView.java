package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCanNotTwiceReactionTextView extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f4826i;

    public FeedCanNotTwiceReactionTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public boolean m7466l() {
        return !this.f4826i;
    }

    /* JADX INFO: renamed from: o */
    public void m7467o() {
        if (this.f4826i) {
            return;
        }
        this.f4826i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        if (!m7466l()) {
            return false;
        }
        m7467o();
        return super/*android.view.View*/.performClick();
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCanNotTwiceReactionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
