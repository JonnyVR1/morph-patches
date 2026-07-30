package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import l.w19;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreImEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f6507a;

    /* JADX INFO: renamed from: b */
    public TextView f6508b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f6509c;

    /* JADX INFO: renamed from: d */
    public TextView f6510d;

    /* JADX INFO: renamed from: e */
    public TextView f6511e;

    /* JADX INFO: renamed from: f */
    public TextView f6512f;

    public CoreImEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9533a(View view) {
        w19.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9533a(this);
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
