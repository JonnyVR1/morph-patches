package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import l.uo8;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5665a;

    /* JADX INFO: renamed from: b */
    public TextView f5666b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5667c;

    /* JADX INFO: renamed from: d */
    public TextView f5668d;

    /* JADX INFO: renamed from: e */
    public TextView f5669e;

    /* JADX INFO: renamed from: f */
    public TextView f5670f;

    public CoreEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7961a(View view) {
        uo8.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7961a(this);
    }

    public CoreEmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreEmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CoreEmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
