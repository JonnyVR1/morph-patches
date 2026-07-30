package com.p000p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.w4j0;
import p002l.s5j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TracetItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TracetItemView f5020a;

    /* JADX INFO: renamed from: b */
    public View f5021b;

    /* JADX INFO: renamed from: c */
    public TextView f5022c;

    /* JADX INFO: renamed from: d */
    public TraceView f5023d;

    public TracetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6323a(View view) {
        s5j0.m22209a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6324b(w4j0 w4j0Var) {
        this.f5022c.setText(w4j0Var.b());
        this.f5023d.m6320a(w4j0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6323a(this);
    }

    public TracetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TracetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
