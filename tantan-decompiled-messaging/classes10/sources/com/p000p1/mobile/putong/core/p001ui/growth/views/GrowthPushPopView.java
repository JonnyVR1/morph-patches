package com.p000p1.mobile.putong.core.p001ui.growth.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p003l.hrk;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GrowthPushPopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public GrowthPushPopView f1951d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f1952e;

    /* JADX INFO: renamed from: f */
    public VImage f1953f;

    /* JADX INFO: renamed from: g */
    public VText f1954g;

    /* JADX INFO: renamed from: h */
    public VText f1955h;

    /* JADX INFO: renamed from: i */
    public VButton f1956i;

    /* JADX INFO: renamed from: j */
    public VFrame f1957j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f1958k;

    /* JADX INFO: renamed from: l */
    public VImage f1959l;

    public GrowthPushPopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m3355a0() {
        return this.f1951d == null || this.f1952e == null || this.f1953f == null || this.f1954g == null || this.f1955h == null || this.f1956i == null || this.f1957j == null || this.f1958k == null || this.f1959l == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3356h0(View view) {
        hrk.m7067a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3356h0(this);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
