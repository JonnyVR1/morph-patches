package com.p051p1.mobile.putong.core.p058ui.growth.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.xtk;

/* JADX INFO: loaded from: classes3.dex */
public class GrowthPushPopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public GrowthPushPopView f30405d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f30406e;

    /* JADX INFO: renamed from: f */
    public VImage f30407f;

    /* JADX INFO: renamed from: g */
    public VText f30408g;

    /* JADX INFO: renamed from: h */
    public VText f30409h;

    /* JADX INFO: renamed from: i */
    public VButton f30410i;

    /* JADX INFO: renamed from: j */
    public VFrame f30411j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f30412k;

    /* JADX INFO: renamed from: l */
    public VImage f30413l;

    public GrowthPushPopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m47183a0() {
        return this.f30405d == null || this.f30406e == null || this.f30407f == null || this.f30408g == null || this.f30409h == null || this.f30410i == null || this.f30411j == null || this.f30412k == null || this.f30413l == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47184h0(View view) {
        xtk.m213102a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47184h0(this);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
