package com.p000p1.mobile.putong.core.p001ui.pricerecall;

import android.text.TextPaint;
import android.text.style.SubscriptSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MarginBottomSubscriptSpan extends SubscriptSpan {
    private int marginBottom;

    public MarginBottomSubscriptSpan(int i) {
        this.marginBottom = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m904a(TextPaint textPaint) {
        textPaint.baselineShift += this.marginBottom;
    }

    @Override // android.text.style.SubscriptSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m904a(textPaint);
    }

    @Override // android.text.style.SubscriptSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m904a(textPaint);
    }
}
