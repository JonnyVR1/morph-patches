package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.top;

/* JADX INFO: loaded from: classes12.dex */
public class IntlVisitorLookUpView extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f39424a;

    /* JADX INFO: renamed from: b */
    public int f39425b;

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39425b = -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60723p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m60723p(View view) {
        top.m192078a(this, view);
    }

    public void setText(String str) {
        if (NullChecker.m82486a(this.f39424a)) {
            this.f39424a.setText(str);
        }
    }

    public IntlVisitorLookUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorLookUpView(Context context) {
        this(context, null);
    }
}
