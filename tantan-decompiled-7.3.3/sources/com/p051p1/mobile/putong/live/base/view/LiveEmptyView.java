package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p153l.u9s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f45504a;

    /* JADX INFO: renamed from: b */
    public TextView f45505b;

    public LiveEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m69904a(View view) {
        u9s.m195111a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public LiveEmptyView m69905b(int i) {
        this.f45504a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public LiveEmptyView m69906c(@ColorInt int i) {
        this.f45505b.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public LiveEmptyView m69907d(@StringRes int i) {
        this.f45505b.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f45505b == null) {
            m69904a(this);
        }
    }

    public LiveEmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
