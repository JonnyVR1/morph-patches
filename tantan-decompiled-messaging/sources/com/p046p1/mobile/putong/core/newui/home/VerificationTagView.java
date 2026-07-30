package com.p046p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.gvk0;

/* JADX INFO: loaded from: classes11.dex */
public class VerificationTagView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Space f21840a;

    /* JADX INFO: renamed from: b */
    public VText f21841b;

    /* JADX INFO: renamed from: c */
    public VImage f21842c;

    public VerificationTagView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36965p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m36965p(View view) {
        gvk0.m128258a(this, view);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerificationTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
