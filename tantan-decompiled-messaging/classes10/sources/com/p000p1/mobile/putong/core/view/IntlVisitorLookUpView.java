package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p003l.tmp;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlVisitorLookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f2518a;

    /* JADX INFO: renamed from: b */
    public int f2519b;

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2519b = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4948p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m4948p(View view) {
        tmp.m9594a(this, view);
    }

    public void setText(String str) {
        if (NullChecker.a(this.f2518a)) {
            this.f2518a.setText(str);
        }
    }

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorLookUpView(Context context) {
        this(context, null);
    }
}
