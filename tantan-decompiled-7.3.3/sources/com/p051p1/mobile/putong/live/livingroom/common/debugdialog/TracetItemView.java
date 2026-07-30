package com.p051p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import p153l.aej0;
import p153l.wej0;

/* JADX INFO: loaded from: classes4.dex */
public class TracetItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TracetItemView f49826a;

    /* JADX INFO: renamed from: b */
    public View f49827b;

    /* JADX INFO: renamed from: c */
    public TextView f49828c;

    /* JADX INFO: renamed from: d */
    public TraceView f49829d;

    public TracetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73995a(View view) {
        wej0.m205995a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73996b(aej0 aej0Var) {
        this.f49828c.setText(aej0Var.getKey());
        this.f49829d.m73992a(aej0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73995a(this);
    }

    public TracetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TracetItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
