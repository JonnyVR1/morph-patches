package com.p046p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import p149l.s5j0;
import p149l.w4j0;

/* JADX INFO: loaded from: classes4.dex */
public class TracetItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TracetItemView f48978a;

    /* JADX INFO: renamed from: b */
    public View f48979b;

    /* JADX INFO: renamed from: c */
    public TextView f48980c;

    /* JADX INFO: renamed from: d */
    public TraceView f48981d;

    public TracetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72812a(View view) {
        s5j0.m182351a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72813b(w4j0 w4j0Var) {
        this.f48980c.setText(w4j0Var.getKey());
        this.f48981d.m72809a(w4j0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72812a(this);
    }

    public TracetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TracetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
