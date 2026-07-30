package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p149l.t7s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f44656a;

    /* JADX INFO: renamed from: b */
    public TextView f44657b;

    public LiveEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m68721a(View view) {
        t7s.m187500a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public LiveEmptyView m68722b(int i) {
        this.f44656a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public LiveEmptyView m68723c(@ColorInt int i) {
        this.f44657b.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public LiveEmptyView m68724d(@StringRes int i) {
        this.f44657b.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f44657b == null) {
            m68721a(this);
        }
    }

    public LiveEmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
