package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.bs5;
import p007l.qti;
import v.VButton;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FollowActionPopupView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f2354a;

    /* JADX INFO: renamed from: b */
    public VFrame f2355b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f2356c;

    /* JADX INFO: renamed from: d */
    public TextView f2357d;

    /* JADX INFO: renamed from: e */
    public TextView f2358e;

    /* JADX INFO: renamed from: f */
    public VButton f2359f;

    /* JADX INFO: renamed from: g */
    public bs5 f2360g;

    public FollowActionPopupView(Context context) {
        super(context);
        this.f2360g = new bs5();
    }

    /* JADX INFO: renamed from: a */
    public final void m4146a(View view) {
        qti.m13729a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2360g.c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4146a(this);
        this.f2359f.getPaint().setFakeBoldText(true);
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2360g = new bs5();
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2360g = new bs5();
    }
}
