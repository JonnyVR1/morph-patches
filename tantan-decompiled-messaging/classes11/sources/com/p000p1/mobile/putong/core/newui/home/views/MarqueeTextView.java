package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f2759a;

    public MarqueeTextView(Context context) {
        super(context);
        this.f2759a = -1;
        m3206h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m3206h() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(this.f2759a);
        setSingleLine(true);
    }

    public boolean isFocused() {
        return true;
    }

    public void setMarqueeNum(int i) {
        this.f2759a = i;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2759a = -1;
        m3206h();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2759a = -1;
        m3206h();
    }
}
