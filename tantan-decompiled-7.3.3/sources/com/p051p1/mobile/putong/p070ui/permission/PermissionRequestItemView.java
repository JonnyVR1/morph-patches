package com.p051p1.mobile.putong.p070ui.permission;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText;
import p153l.ks60;

/* JADX INFO: loaded from: classes10.dex */
public class PermissionRequestItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f55502a;

    /* JADX INFO: renamed from: b */
    public VText f55503b;

    /* JADX INFO: renamed from: c */
    public VText f55504c;

    public PermissionRequestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m81117a(View view) {
        ks60.m151148a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m81118b(int i, CharSequence charSequence, int i2) {
        this.f55502a.setImageResource(i);
        this.f55503b.setText(charSequence);
        this.f55504c.setText(i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m81117a(this);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PermissionRequestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
