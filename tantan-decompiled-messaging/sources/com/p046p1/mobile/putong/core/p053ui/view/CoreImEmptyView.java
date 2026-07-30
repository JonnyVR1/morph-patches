package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.w19;

/* JADX INFO: loaded from: classes9.dex */
public class CoreImEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36726a;

    /* JADX INFO: renamed from: b */
    public TextView f36727b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f36728c;

    /* JADX INFO: renamed from: d */
    public TextView f36729d;

    /* JADX INFO: renamed from: e */
    public TextView f36730e;

    /* JADX INFO: renamed from: f */
    public TextView f36731f;

    public CoreImEmptyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56108a(View view) {
        w19.m200919a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56108a(this);
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
