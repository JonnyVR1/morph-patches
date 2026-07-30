package com.p051p1.mobile.putong.feed.newui.status.improve;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.c5i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStatusPostGuidePopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f43789d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f43790e;

    /* JADX INFO: renamed from: f */
    public VImage f43791f;

    /* JADX INFO: renamed from: g */
    public VText f43792g;

    /* JADX INFO: renamed from: h */
    public VLinear f43793h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f43794i;

    /* JADX INFO: renamed from: j */
    public VText f43795j;

    /* JADX INFO: renamed from: k */
    public VLinear f43796k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f43797l;

    /* JADX INFO: renamed from: m */
    public VText f43798m;

    /* JADX INFO: renamed from: n */
    public VText f43799n;

    /* JADX INFO: renamed from: o */
    public VFrame f43800o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f43801p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43802q;

    public FeedStatusPostGuidePopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m66969a0() {
        return this.f43789d == null || this.f43790e == null || this.f43791f == null || this.f43792g == null || this.f43793h == null || this.f43795j == null || this.f43796k == null || this.f43798m == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m66970h0(View view) {
        c5i.m108055a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66970h0(this);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
