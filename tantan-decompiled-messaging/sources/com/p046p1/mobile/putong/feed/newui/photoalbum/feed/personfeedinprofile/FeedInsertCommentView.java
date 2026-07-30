package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VText;
import p149l.y7h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInsertCommentView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41717a;

    /* JADX INFO: renamed from: b */
    public VText f41718b;

    /* JADX INFO: renamed from: c */
    public VEditText f41719c;

    /* JADX INFO: renamed from: d */
    public VText f41720d;

    /* JADX INFO: renamed from: e */
    public VText f41721e;

    /* JADX INFO: renamed from: f */
    public VText f41722f;

    /* JADX INFO: renamed from: g */
    public VText f41723g;

    public FeedInsertCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64479s(context, true);
    }

    /* JADX INFO: renamed from: p */
    public View m64478p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y7h.m213315b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public final void m64479s(Context context, boolean z) {
        addView(m64478p(LayoutInflater.from(context), this));
        setInInputMode(z);
        this.f41723g.getPaint().setFakeBoldText(true);
    }

    public void setInInputMode(boolean z) {
        if (z) {
            this.f41718b.setVisibility(8);
        } else {
            this.f41719c.setVisibility(8);
            this.f41723g.setVisibility(8);
        }
    }

    public FeedInsertCommentView(Context context, boolean z) {
        super(context);
        m64479s(context, z);
    }

    public FeedInsertCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64479s(context, true);
    }
}
