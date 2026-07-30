package com.p046p1.mobile.putong.p065ui.permission;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText;
import p149l.ek60;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionRequestItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f54654a;

    /* JADX INFO: renamed from: b */
    public VText f54655b;

    /* JADX INFO: renamed from: c */
    public VText f54656c;

    public PermissionRequestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79934a(View view) {
        ek60.m116926a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79935b(int i, CharSequence charSequence, int i2) {
        this.f54654a.setImageResource(i);
        this.f54655b.setText(charSequence);
        this.f54656c.setText(i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79934a(this);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
