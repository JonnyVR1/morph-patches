package com.p051p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.m4l0;

/* JADX INFO: loaded from: classes11.dex */
public class VerificationTagView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Space f22582a;

    /* JADX INFO: renamed from: b */
    public VText f22583b;

    /* JADX INFO: renamed from: c */
    public VImage f22584c;

    public VerificationTagView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37968p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m37968p(View view) {
        m4l0.m157043a(this, view);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
