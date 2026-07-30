package com.p051p1.mobile.putong.feed.newui.mediapicker.chatat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p151v.VFrame;
import p153l.hu4;

/* JADX INFO: loaded from: classes13.dex */
public class ChatAtQuestionItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ChatAtQuestionItemView f41437a;

    /* JADX INFO: renamed from: b */
    public TextView f41438b;

    public ChatAtQuestionItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63812p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m63812p(View view) {
        hu4.m137108a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m63813s(String str) {
        this.f41438b.setText(str);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
