package com.p000p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.hxs;
import l.xdl0;
import p002l.pld;
import p002l.sgh0;
import v.VDraweeView;
import v.VImage;
import v.VMarqueeText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DefaultBulletView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public DefaultBulletView f5500d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5501e;

    /* JADX INFO: renamed from: f */
    public VText f5502f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f5503g;

    /* JADX INFO: renamed from: h */
    public VImage f5504h;

    public DefaultBulletView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6915h0(View view) {
        pld.m20425a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m6916i0(sgh0 sgh0Var) {
        hxs.s("context_single_room", this.f5501e, sgh0Var.m22462j());
        xdl0.M(this.f5504h, sgh0Var.m22464l());
        this.f5500d.setBackground(sgh0Var.m22457e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6915h0(this);
    }

    public DefaultBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
