package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p153l.bnl0;
import p153l.i0f;

/* JADX INFO: loaded from: classes13.dex */
public class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f45501a;

    /* JADX INFO: renamed from: b */
    public TextView f45502b;

    public EmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m69899a(View view) {
        i0f.m137958a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public EmptyView m69900b(int i) {
        this.f45501a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public EmptyView m69901c(int i, int i2) {
        bnl0.m105507D0(i2, this.f45501a);
        bnl0.m105505C0(this.f45501a, i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public EmptyView m69902d(@ColorInt int i) {
        this.f45502b.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public EmptyView m69903e(@StringRes int i) {
        this.f45502b.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69899a(this);
    }

    public void setTextMargin(int i) {
        bnl0.m105540X(this.f45502b, i);
    }

    public EmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
