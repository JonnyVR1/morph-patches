package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.nqh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiLocationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f43294a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43295b;

    /* JADX INFO: renamed from: c */
    public TextView f43296c;

    /* JADX INFO: renamed from: d */
    public VImage f43297d;

    public FeedPoiLocationView(Context context) {
        super(context);
        init();
    }

    private void init() {
        addView(m66360p(LayoutInflater.from(getContext()), this));
    }

    /* JADX INFO: renamed from: p */
    public View m66360p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nqh.m164307b(this, layoutInflater, viewGroup);
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
