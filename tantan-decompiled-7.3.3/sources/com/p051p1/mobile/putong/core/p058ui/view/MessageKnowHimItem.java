package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import p151v.AutoVDraweeView;
import p153l.bnl0;
import p153l.g9c0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class MessageKnowHimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f37636a;

    /* JADX INFO: renamed from: b */
    public TextView f37637b;

    /* JADX INFO: renamed from: c */
    public TextView f37638c;

    public MessageKnowHimItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57320a() {
        this.f37636a = new AutoVDraweeView(getContext());
        int i = qa00.f156336w;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        int i2 = qa00.f156328o;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = qa00.f156316c;
        addView(this.f37636a, layoutParams);
        TextView textView = new TextView(getContext());
        this.f37637b = textView;
        textView.setTextSize(1, 14.0f);
        this.f37637b.setTypeface(lyh0.m156283c(3), 1);
        this.f37637b.setTextColor(getResources().getColor(g9c0.f102815e));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(bnl0.f77545f, i2);
        layoutParams2.leftMargin = qa00.m175859d(62.0f);
        int i3 = qa00.f156322i;
        layoutParams2.rightMargin = i3;
        addView(this.f37637b, layoutParams2);
        TextView textView2 = new TextView(getContext());
        this.f37638c = textView2;
        textView2.setTextSize(1, 12.0f);
        this.f37638c.setTextColor(getResources().getColor(g9c0.f102813c));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(17.0f));
        layoutParams3.leftMargin = qa00.m175859d(62.0f);
        layoutParams3.rightMargin = i3;
        layoutParams3.gravity = 80;
        addView(this.f37638c, layoutParams3);
    }

    /* JADX INFO: renamed from: b */
    public void m57321b(String str, String str2, String str3) {
        this.f37636a.m224133x(str, 1);
        this.f37637b.setText(str2);
        this.f37638c.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57320a();
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f37638c.setTextColor(i);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
