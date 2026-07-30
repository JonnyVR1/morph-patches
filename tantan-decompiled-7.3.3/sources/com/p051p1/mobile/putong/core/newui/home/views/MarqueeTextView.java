package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes11.dex */
public class MarqueeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f24723a;

    public MarqueeTextView(Context context) {
        super(context);
        this.f24723a = -1;
        m40191h();
    }

    /* JADX INFO: renamed from: h */
    public final void m40191h() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(this.f24723a);
        setSingleLine(true);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public void setMarqueeNum(int i) {
        this.f24723a = i;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24723a = -1;
        m40191h();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24723a = -1;
        m40191h();
    }
}
