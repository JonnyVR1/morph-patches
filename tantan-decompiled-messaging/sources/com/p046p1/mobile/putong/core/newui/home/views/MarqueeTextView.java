package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes11.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f23981a;

    public MarqueeTextView(Context context) {
        super(context);
        this.f23981a = -1;
        m39188h();
    }

    /* JADX INFO: renamed from: h */
    public final void m39188h() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(this.f23981a);
        setSingleLine(true);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public void setMarqueeNum(int i) {
        this.f23981a = i;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23981a = -1;
        m39188h();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23981a = -1;
        m39188h();
    }
}
