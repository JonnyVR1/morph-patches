package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.wlf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardPicLabelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ExpandedCardPicLabelView f1355a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f1356b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f1357c;

    public ExpandedCardPicLabelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2283a(View view) {
        wlf.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2283a(this);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
