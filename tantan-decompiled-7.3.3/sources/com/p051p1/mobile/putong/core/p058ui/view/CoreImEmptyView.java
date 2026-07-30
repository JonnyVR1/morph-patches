package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.f39;

/* JADX INFO: loaded from: classes12.dex */
public class CoreImEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f37574a;

    /* JADX INFO: renamed from: b */
    public TextView f37575b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f37576c;

    /* JADX INFO: renamed from: d */
    public TextView f37577d;

    /* JADX INFO: renamed from: e */
    public TextView f37578e;

    /* JADX INFO: renamed from: f */
    public TextView f37579f;

    public CoreImEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57291a(View view) {
        f39.m123720a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57291a(this);
    }

    public CoreImEmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreImEmptyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CoreImEmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
