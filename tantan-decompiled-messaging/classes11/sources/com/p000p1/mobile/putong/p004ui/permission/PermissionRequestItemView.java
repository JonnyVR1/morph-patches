package com.p000p1.mobile.putong.p004ui.permission;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.ek60;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PermissionRequestItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f8260a;

    /* JADX INFO: renamed from: b */
    public VText f8261b;

    /* JADX INFO: renamed from: c */
    public VText f8262c;

    public PermissionRequestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10263a(View view) {
        ek60.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10264b(int i, CharSequence charSequence, int i2) {
        this.f8260a.setImageResource(i);
        this.f8261b.setText(charSequence);
        this.f8262c.setText(i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10263a(this);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
