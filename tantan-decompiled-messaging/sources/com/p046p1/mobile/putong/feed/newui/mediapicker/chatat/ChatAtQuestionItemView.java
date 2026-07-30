package com.p046p1.mobile.putong.feed.newui.mediapicker.chatat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p147v.VFrame;
import p149l.it4;

/* JADX INFO: loaded from: classes12.dex */
public class ChatAtQuestionItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ChatAtQuestionItemView f40589a;

    /* JADX INFO: renamed from: b */
    public TextView f40590b;

    public ChatAtQuestionItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62629p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m62629p(View view) {
        it4.m138099a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m62630s(String str) {
        this.f40590b.setText(str);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
