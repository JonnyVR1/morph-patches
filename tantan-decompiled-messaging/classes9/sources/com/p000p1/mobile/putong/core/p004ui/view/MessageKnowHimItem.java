package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import l.a1c0;
import l.eqh0;
import l.t100;
import l.xdl0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MessageKnowHimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f6569a;

    /* JADX INFO: renamed from: b */
    public TextView f6570b;

    /* JADX INFO: renamed from: c */
    public TextView f6571c;

    public MessageKnowHimItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9564a() {
        this.f6569a = new AutoVDraweeView(getContext());
        int i = t100.w;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        int i2 = t100.o;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = t100.c;
        addView(this.f6569a, layoutParams);
        TextView textView = new TextView(getContext());
        this.f6570b = textView;
        textView.setTextSize(1, 14.0f);
        this.f6570b.setTypeface(eqh0.c(3), 1);
        this.f6570b.setTextColor(getResources().getColor(a1c0.e));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f, i2);
        layoutParams2.leftMargin = t100.d(62.0f);
        int i3 = t100.i;
        layoutParams2.rightMargin = i3;
        addView(this.f6570b, layoutParams2);
        TextView textView2 = new TextView(getContext());
        this.f6571c = textView2;
        textView2.setTextSize(1, 12.0f);
        this.f6571c.setTextColor(getResources().getColor(a1c0.c));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(xdl0.f, t100.d(17.0f));
        layoutParams3.leftMargin = t100.d(62.0f);
        layoutParams3.rightMargin = i3;
        layoutParams3.gravity = 80;
        addView(this.f6571c, layoutParams3);
    }

    /* JADX INFO: renamed from: b */
    public void m9565b(String str, String str2, String str3) {
        this.f6569a.x(str, 1);
        this.f6570b.setText(str2);
        this.f6571c.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9564a();
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f6571c.setTextColor(i);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
