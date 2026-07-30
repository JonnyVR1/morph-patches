package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.cmg;
import p153l.qeh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMediaRepeatHintView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f43263c;

    /* JADX INFO: renamed from: d */
    public VText f43264d;

    public FeedMediaRepeatHintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66324P(View view) {
        qeh.m176239a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m66325Q() {
        this.f43264d.setText(cmg.m111172B0());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66324P(this);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMediaRepeatHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
