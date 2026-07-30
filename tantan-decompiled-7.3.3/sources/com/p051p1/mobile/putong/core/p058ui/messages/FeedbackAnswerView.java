package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import p151v.VLinear;
import p151v.VText;
import p153l.edc0;

/* JADX INFO: loaded from: classes3.dex */
public class FeedbackAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f31557c;

    public FeedbackAnswerView(Context context) {
        super(context);
    }

    public TextPaint getPaint() {
        return this.f31557c.getPaint();
    }

    public String getText() {
        return (String) this.f31557c.getText();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31557c = (VText) findViewById(edc0.f93168A4);
    }

    public void setText(String str) {
        this.f31557c.setText(str);
    }

    public void setTextColor(int i) {
        this.f31557c.setTextColor(i);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
