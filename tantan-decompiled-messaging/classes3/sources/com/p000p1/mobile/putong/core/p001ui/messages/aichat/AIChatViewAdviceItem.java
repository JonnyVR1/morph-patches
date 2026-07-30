package com.p000p1.mobile.putong.core.p001ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.d0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AIChatViewAdviceItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1639a;

    /* JADX INFO: renamed from: b */
    public ImageView f1640b;

    public AIChatViewAdviceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2132a(View view) {
        d0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2132a(this);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
