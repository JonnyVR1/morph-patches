package com.p051p1.mobile.putong.core.p058ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p153l.C16401d0;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatViewAdviceItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f32596a;

    /* JADX INFO: renamed from: b */
    public ImageView f32597b;

    public AIChatViewAdviceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50217a(View view) {
        C16401d0.m113362a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50217a(this);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
