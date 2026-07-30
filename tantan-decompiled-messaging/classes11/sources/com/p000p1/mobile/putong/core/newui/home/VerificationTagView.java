package com.p000p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import l.gvk0;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VerificationTagView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Space f618a;

    /* JADX INFO: renamed from: b */
    public VText f619b;

    /* JADX INFO: renamed from: c */
    public VImage f620c;

    public VerificationTagView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m932p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m932p(View view) {
        gvk0.a(this, view);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
