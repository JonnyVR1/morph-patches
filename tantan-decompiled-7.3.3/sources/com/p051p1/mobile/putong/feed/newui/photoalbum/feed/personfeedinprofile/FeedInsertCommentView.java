package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VText;
import p153l.n9h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInsertCommentView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f42565a;

    /* JADX INFO: renamed from: b */
    public VText f42566b;

    /* JADX INFO: renamed from: c */
    public VEditText f42567c;

    /* JADX INFO: renamed from: d */
    public VText f42568d;

    /* JADX INFO: renamed from: e */
    public VText f42569e;

    /* JADX INFO: renamed from: f */
    public VText f42570f;

    /* JADX INFO: renamed from: g */
    public VText f42571g;

    public FeedInsertCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65662s(context, true);
    }

    /* JADX INFO: renamed from: p */
    public View m65661p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n9h.m161979b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public final void m65662s(Context context, boolean z) {
        addView(m65661p(LayoutInflater.from(context), this));
        setInInputMode(z);
        this.f42571g.getPaint().setFakeBoldText(true);
    }

    public void setInInputMode(boolean z) {
        if (z) {
            this.f42566b.setVisibility(8);
        } else {
            this.f42567c.setVisibility(8);
            this.f42571g.setVisibility(8);
        }
    }

    public FeedInsertCommentView(Context context, boolean z) {
        super(context);
        m65662s(context, z);
    }

    public FeedInsertCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65662s(context, true);
    }
}
