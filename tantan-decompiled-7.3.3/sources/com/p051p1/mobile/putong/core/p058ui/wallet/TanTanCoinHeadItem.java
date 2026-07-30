package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p151v.VOnlineIndicator;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.f4i0;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinHeadItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public ImageView f39080d;

    /* JADX INFO: renamed from: e */
    public VText f39081e;

    /* JADX INFO: renamed from: f */
    public ImageView f39082f;

    /* JADX INFO: renamed from: g */
    public VText f39083g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f39084h;

    public TanTanCoinHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public TanTanCoinHeadItem m59278B(String str) {
        this.f39083g.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public TanTanCoinHeadItem m59279H(int i) {
        this.f39081e.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59280p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m59280p(View view) {
        f4i0.m123989a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public TanTanCoinHeadItem m59281q(int i) {
        this.f39080d.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public TanTanCoinHeadItem m59282z(boolean z) {
        bnl0.m105524M(this.f39082f, z);
        return this;
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
