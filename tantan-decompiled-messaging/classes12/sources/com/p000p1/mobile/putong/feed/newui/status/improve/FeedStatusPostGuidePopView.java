package com.p000p1.mobile.putong.feed.newui.status.improve;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p007l.n3i;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStatusPostGuidePopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f4402d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f4403e;

    /* JADX INFO: renamed from: f */
    public VImage f4404f;

    /* JADX INFO: renamed from: g */
    public VText f4405g;

    /* JADX INFO: renamed from: h */
    public VLinear f4406h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4407i;

    /* JADX INFO: renamed from: j */
    public VText f4408j;

    /* JADX INFO: renamed from: k */
    public VLinear f4409k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f4410l;

    /* JADX INFO: renamed from: m */
    public VText f4411m;

    /* JADX INFO: renamed from: n */
    public VText f4412n;

    /* JADX INFO: renamed from: o */
    public VFrame f4413o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f4414p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f4415q;

    public FeedStatusPostGuidePopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m6932a0() {
        return this.f4402d == null || this.f4403e == null || this.f4404f == null || this.f4405g == null || this.f4406h == null || this.f4408j == null || this.f4409k == null || this.f4411m == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6933h0(View view) {
        n3i.m12066a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6933h0(this);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStatusPostGuidePopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
