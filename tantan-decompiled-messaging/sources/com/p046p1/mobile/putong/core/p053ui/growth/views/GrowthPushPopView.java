package com.p046p1.mobile.putong.core.p053ui.growth.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.hrk;

/* JADX INFO: loaded from: classes10.dex */
public class GrowthPushPopView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public GrowthPushPopView f29557d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f29558e;

    /* JADX INFO: renamed from: f */
    public VImage f29559f;

    /* JADX INFO: renamed from: g */
    public VText f29560g;

    /* JADX INFO: renamed from: h */
    public VText f29561h;

    /* JADX INFO: renamed from: i */
    public VButton f29562i;

    /* JADX INFO: renamed from: j */
    public VFrame f29563j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f29564k;

    /* JADX INFO: renamed from: l */
    public VImage f29565l;

    public GrowthPushPopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m46000a0() {
        return this.f29557d == null || this.f29558e == null || this.f29559f == null || this.f29560g == null || this.f29561h == null || this.f29562i == null || this.f29563j == null || this.f29564k == null || this.f29565l == null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m46001h0(View view) {
        hrk.m132689a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46001h0(this);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthPushPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
