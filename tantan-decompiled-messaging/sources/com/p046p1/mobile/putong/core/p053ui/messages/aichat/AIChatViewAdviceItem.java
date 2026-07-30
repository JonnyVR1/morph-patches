package com.p046p1.mobile.putong.core.p053ui.messages.aichat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p149l.C16282d0;

/* JADX INFO: loaded from: classes3.dex */
public class AIChatViewAdviceItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f31748a;

    /* JADX INFO: renamed from: b */
    public ImageView f31749b;

    public AIChatViewAdviceItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49034a(View view) {
        C16282d0.m109451a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49034a(this);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AIChatViewAdviceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
