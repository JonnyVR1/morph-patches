package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p007l.bdh;
import p007l.nkg;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMediaRepeatHintView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f3876c;

    /* JADX INFO: renamed from: d */
    public VText f3877d;

    public FeedMediaRepeatHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m6242P(View view) {
        bdh.m8799a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m6243Q() {
        this.f3877d.setText(nkg.m12202B0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6242P(this);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
