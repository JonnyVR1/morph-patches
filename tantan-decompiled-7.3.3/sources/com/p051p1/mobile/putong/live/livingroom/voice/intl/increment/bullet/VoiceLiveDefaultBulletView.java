package com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.i5o0;
import p153l.izs;
import p153l.swn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveDefaultBulletView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceLiveDefaultBulletView f54062d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f54063e;

    /* JADX INFO: renamed from: f */
    public VText f54064f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f54065g;

    /* JADX INFO: renamed from: h */
    public VImage f54066h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54067i;

    public VoiceLiveDefaultBulletView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79392h0(View view) {
        swn0.m188332a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79393i0(i5o0 i5o0Var) {
        izs.m142868s("context_single_room", this.f54067i, i5o0Var.m138759i());
        bnl0.m105524M(this.f54066h, i5o0Var.m138761k());
        this.f54063e.setBackground(i5o0Var.m138755e());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79392h0(this);
    }

    public VoiceLiveDefaultBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
