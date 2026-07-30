package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.bs5;
import p149l.qti;

/* JADX INFO: loaded from: classes12.dex */
public class FollowActionPopupView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f40893a;

    /* JADX INFO: renamed from: b */
    public VFrame f40894b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f40895c;

    /* JADX INFO: renamed from: d */
    public TextView f40896d;

    /* JADX INFO: renamed from: e */
    public TextView f40897e;

    /* JADX INFO: renamed from: f */
    public VButton f40898f;

    /* JADX INFO: renamed from: g */
    public bs5 f40899g;

    public FollowActionPopupView(Context context) {
        super(context);
        this.f40899g = new bs5();
    }

    /* JADX INFO: renamed from: a */
    public final void m63130a(View view) {
        qti.m176462a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40899g.m103657c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63130a(this);
        this.f40898f.getPaint().setFakeBoldText(true);
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40899g = new bs5();
    }

    public FollowActionPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40899g = new bs5();
    }
}
