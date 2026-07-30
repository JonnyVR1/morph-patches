package com.p046p1.mobile.putong.feed.newui.status.improve;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.n3i;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStatusPostGuidePopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f42941d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42942e;

    /* JADX INFO: renamed from: f */
    public VImage f42943f;

    /* JADX INFO: renamed from: g */
    public VText f42944g;

    /* JADX INFO: renamed from: h */
    public VLinear f42945h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f42946i;

    /* JADX INFO: renamed from: j */
    public VText f42947j;

    /* JADX INFO: renamed from: k */
    public VLinear f42948k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f42949l;

    /* JADX INFO: renamed from: m */
    public VText f42950m;

    /* JADX INFO: renamed from: n */
    public VText f42951n;

    /* JADX INFO: renamed from: o */
    public VFrame f42952o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f42953p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f42954q;

    public FeedStatusPostGuidePopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m65786a0() {
        return this.f42941d == null || this.f42942e == null || this.f42943f == null || this.f42944g == null || this.f42945h == null || this.f42947j == null || this.f42948k == null || this.f42950m == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m65787h0(View view) {
        n3i.m157758a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65787h0(this);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
