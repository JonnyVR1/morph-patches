package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p149l.eze;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f44653a;

    /* JADX INFO: renamed from: b */
    public TextView f44654b;

    public EmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m68716a(View view) {
        eze.m118943a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public EmptyView m68717b(int i) {
        this.f44653a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public EmptyView m68718c(int i, int i2) {
        xdl0.m208327D0(i2, this.f44653a);
        xdl0.m208325C0(this.f44653a, i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public EmptyView m68719d(@ColorInt int i) {
        this.f44654b.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public EmptyView m68720e(@StringRes int i) {
        this.f44654b.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68716a(this);
    }

    public void setTextMargin(int i) {
        xdl0.m208360X(this.f44654b, i);
    }

    public EmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
