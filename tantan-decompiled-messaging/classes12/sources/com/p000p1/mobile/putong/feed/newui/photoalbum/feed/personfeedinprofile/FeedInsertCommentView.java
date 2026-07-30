package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p007l.y7h;
import v.VDraweeView;
import v.VEditText;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInsertCommentView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3178a;

    /* JADX INFO: renamed from: b */
    public VText f3179b;

    /* JADX INFO: renamed from: c */
    public VEditText f3180c;

    /* JADX INFO: renamed from: d */
    public VText f3181d;

    /* JADX INFO: renamed from: e */
    public VText f3182e;

    /* JADX INFO: renamed from: f */
    public VText f3183f;

    /* JADX INFO: renamed from: g */
    public VText f3184g;

    public FeedInsertCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5566s(context, true);
    }

    /* JADX INFO: renamed from: p */
    public View m5565p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y7h.m16966b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final void m5566s(Context context, boolean z) {
        addView(m5565p(LayoutInflater.from(context), this));
        setInInputMode(z);
        this.f3184g.getPaint().setFakeBoldText(true);
    }

    public void setInInputMode(boolean z) {
        if (z) {
            this.f3179b.setVisibility(8);
        } else {
            this.f3180c.setVisibility(8);
            this.f3184g.setVisibility(8);
        }
    }

    public FeedInsertCommentView(Context context, boolean z) {
        super(context);
        m5566s(context, z);
    }

    public FeedInsertCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5566s(context, true);
    }
}
