package com.p051p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.vmd;
import p153l.zoh0;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultBulletView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public DefaultBulletView f50306d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50307e;

    /* JADX INFO: renamed from: f */
    public VText f50308f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f50309g;

    /* JADX INFO: renamed from: h */
    public VImage f50310h;

    public DefaultBulletView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74560h0(View view) {
        vmd.m201728a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74561i0(zoh0 zoh0Var) {
        izs.m142868s("context_single_room", this.f50307e, zoh0Var.m220774j());
        bnl0.m105524M(this.f50310h, zoh0Var.m220776l());
        this.f50306d.setBackground(zoh0Var.m220769e());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74560h0(this);
    }

    public DefaultBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
