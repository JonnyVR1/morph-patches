package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p007l.yoh;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiLocationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f3907a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3908b;

    /* JADX INFO: renamed from: c */
    public TextView f3909c;

    /* JADX INFO: renamed from: d */
    public VImage f3910d;

    public FeedPoiLocationView(Context context) {
        super(context);
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        addView(m6278p(LayoutInflater.from(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public View m6278p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yoh.m17191b(this, layoutInflater, viewGroup);
    }

    public FeedPoiLocationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FeedPoiLocationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
