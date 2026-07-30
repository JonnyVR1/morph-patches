package com.p000p1.mobile.putong.feed.newui.mediapicker.chatat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p007l.it4;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ChatAtQuestionItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ChatAtQuestionItemView f2050a;

    /* JADX INFO: renamed from: b */
    public TextView f2051b;

    public ChatAtQuestionItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3634p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3634p(View view) {
        it4.m11036a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m3635s(String str) {
        this.f2051b.setText(str);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatAtQuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
