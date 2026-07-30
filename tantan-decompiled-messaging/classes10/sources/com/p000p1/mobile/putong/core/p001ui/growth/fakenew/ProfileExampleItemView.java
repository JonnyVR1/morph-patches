package com.p000p1.mobile.putong.core.p001ui.growth.fakenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p003l.hk90;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProfileExampleItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f1932d;

    /* JADX INFO: renamed from: e */
    public VText f1933e;

    /* JADX INFO: renamed from: f */
    public VText f1934f;

    /* JADX INFO: renamed from: g */
    public VImage f1935g;

    /* JADX INFO: renamed from: h */
    public VImage f1936h;

    public ProfileExampleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3339h0(View view) {
        hk90.m7009a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3339h0(this);
    }

    public ProfileExampleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileExampleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
