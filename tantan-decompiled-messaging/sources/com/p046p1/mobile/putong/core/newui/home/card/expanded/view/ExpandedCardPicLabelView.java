package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p149l.wlf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardPicLabelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ExpandedCardPicLabelView f22577a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f22578b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f22579c;

    public ExpandedCardPicLabelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m38305a(View view) {
        wlf.m203807a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38305a(this);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
