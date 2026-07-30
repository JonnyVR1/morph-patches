package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.tmp;

/* JADX INFO: loaded from: classes10.dex */
public class IntlVisitorLookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f38576a;

    /* JADX INFO: renamed from: b */
    public int f38577b;

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38577b = -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59539p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m59539p(View view) {
        tmp.m189715a(this, view);
    }

    public void setText(String str) {
        if (NullChecker.m81303a(this.f38576a)) {
            this.f38576a.setText(str);
        }
    }

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorLookUpView(Context context) {
        this(context, null);
    }
}
