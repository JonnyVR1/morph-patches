package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import l.xdl0;
import l.xvh0;
import v.VOnlineIndicator;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinHeadItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public ImageView f8013d;

    /* JADX INFO: renamed from: e */
    public VText f8014e;

    /* JADX INFO: renamed from: f */
    public ImageView f8015f;

    /* JADX INFO: renamed from: g */
    public VText f8016g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f8017h;

    public TanTanCoinHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public TanTanCoinHeadItem m11628B(String str) {
        this.f8016g.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public TanTanCoinHeadItem m11629H(int i) {
        this.f8014e.setText(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m11630p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m11630p(View view) {
        xvh0.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public TanTanCoinHeadItem m11631q(int i) {
        this.f8013d.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public TanTanCoinHeadItem m11632z(boolean z) {
        xdl0.M(this.f8015f, z);
        return this;
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
