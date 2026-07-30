package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.uo8;

/* JADX INFO: loaded from: classes11.dex */
public class CoreEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f26887a;

    /* JADX INFO: renamed from: b */
    public TextView f26888b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f26889c;

    /* JADX INFO: renamed from: d */
    public TextView f26890d;

    /* JADX INFO: renamed from: e */
    public TextView f26891e;

    /* JADX INFO: renamed from: f */
    public TextView f26892f;

    public CoreEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43697a(View view) {
        uo8.m194543a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43697a(this);
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
