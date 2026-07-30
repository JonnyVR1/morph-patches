package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bdh;
import p149l.nkg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMediaRepeatHintView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f42415c;

    /* JADX INFO: renamed from: d */
    public VText f42416d;

    public FeedMediaRepeatHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65141P(View view) {
        bdh.m101176a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m65142Q() {
        this.f42416d.setText(nkg.m159843B0());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65141P(this);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
