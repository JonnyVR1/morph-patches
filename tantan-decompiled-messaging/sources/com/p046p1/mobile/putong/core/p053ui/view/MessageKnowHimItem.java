package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import p147v.AutoVDraweeView;
import p149l.a1c0;
import p149l.eqh0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class MessageKnowHimItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f36788a;

    /* JADX INFO: renamed from: b */
    public TextView f36789b;

    /* JADX INFO: renamed from: c */
    public TextView f36790c;

    public MessageKnowHimItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56137a() {
        this.f36788a = new AutoVDraweeView(getContext());
        int i = t100.f167274w;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        int i2 = t100.f167266o;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = t100.f167254c;
        addView(this.f36788a, layoutParams);
        TextView textView = new TextView(getContext());
        this.f36789b = textView;
        textView.setTextSize(1, 14.0f);
        this.f36789b.setTypeface(eqh0.m117752c(3), 1);
        this.f36789b.setTextColor(getResources().getColor(a1c0.f67151e));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f192404f, i2);
        layoutParams2.leftMargin = t100.m186890d(62.0f);
        int i3 = t100.f167260i;
        layoutParams2.rightMargin = i3;
        addView(this.f36789b, layoutParams2);
        TextView textView2 = new TextView(getContext());
        this.f36790c = textView2;
        textView2.setTextSize(1, 12.0f);
        this.f36790c.setTextColor(getResources().getColor(a1c0.f67149c));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(xdl0.f192404f, t100.m186890d(17.0f));
        layoutParams3.leftMargin = t100.m186890d(62.0f);
        layoutParams3.rightMargin = i3;
        layoutParams3.gravity = 80;
        addView(this.f36790c, layoutParams3);
    }

    /* JADX INFO: renamed from: b */
    public void m56138b(String str, String str2, String str3) {
        this.f36788a.m222887x(str, 1);
        this.f36789b.setText(str2);
        this.f36790c.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56137a();
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f36790c.setTextColor(i);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageKnowHimItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
