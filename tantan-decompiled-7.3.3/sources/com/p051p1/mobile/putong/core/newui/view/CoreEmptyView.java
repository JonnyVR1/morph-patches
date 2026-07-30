package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.zp8;

/* JADX INFO: loaded from: classes11.dex */
public class CoreEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f27735a;

    /* JADX INFO: renamed from: b */
    public TextView f27736b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f27737c;

    /* JADX INFO: renamed from: d */
    public TextView f27738d;

    /* JADX INFO: renamed from: e */
    public TextView f27739e;

    /* JADX INFO: renamed from: f */
    public TextView f27740f;

    public CoreEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44883a(View view) {
        zp8.m220822a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44883a(this);
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
