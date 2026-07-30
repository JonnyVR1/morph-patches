package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p153l.cnf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardPicLabelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ExpandedCardPicLabelView f23319a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f23320b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f23321c;

    public ExpandedCardPicLabelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39308a(View view) {
        cnf.m111499a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39308a(this);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardPicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
