package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.yoh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiLocationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f42446a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42447b;

    /* JADX INFO: renamed from: c */
    public TextView f42448c;

    /* JADX INFO: renamed from: d */
    public VImage f42449d;

    public FeedPoiLocationView(Context context) {
        super(context);
        init();
    }

    private void init() {
        addView(m65177p(LayoutInflater.from(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public View m65177p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yoh.m215502b(this, layoutInflater, viewGroup);
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
