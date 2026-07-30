package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import p147v.VLinear;
import p147v.VText;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class FeedbackAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f30709c;

    public FeedbackAnswerView(Context context) {
        super(context);
    }

    public TextPaint getPaint() {
        return this.f30709c.getPaint();
    }

    public String getText() {
        return (String) this.f30709c.getText();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30709c = (VText) findViewById(y4c0.f195933A4);
    }

    public void setText(String str) {
        this.f30709c.setText(str);
    }

    public void setTextColor(int i) {
        this.f30709c.setTextColor(i);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
