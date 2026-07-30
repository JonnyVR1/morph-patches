package com.p046p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.hxs;
import p149l.pld;
import p149l.sgh0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultBulletView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public DefaultBulletView f49458d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49459e;

    /* JADX INFO: renamed from: f */
    public VText f49460f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f49461g;

    /* JADX INFO: renamed from: h */
    public VImage f49462h;

    public DefaultBulletView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m73377h0(View view) {
        pld.m170119a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m73378i0(sgh0 sgh0Var) {
        hxs.m133406s("context_single_room", this.f49459e, sgh0Var.m184079j());
        xdl0.m208344M(this.f49462h, sgh0Var.m184081l());
        this.f49458d.setBackground(sgh0Var.m184074e());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73377h0(this);
    }

    public DefaultBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
