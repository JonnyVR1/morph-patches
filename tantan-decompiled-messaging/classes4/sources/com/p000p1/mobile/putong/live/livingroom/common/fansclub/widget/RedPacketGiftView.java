package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import l.t100;
import l.yb2;
import p002l.nkc0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RedPacketGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f5217d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5218e;

    /* JADX INFO: renamed from: f */
    public VText f5219f;

    /* JADX INFO: renamed from: g */
    public VText f5220g;

    public RedPacketGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6533h0(View view) {
        nkc0.m18830a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m6534i0(BLiveFanBaseGift bLiveFanBaseGift) {
        this.f5218e.setImageURI(bLiveFanBaseGift.giftUrl);
        this.f5219f.setText(bLiveFanBaseGift.giftName);
        this.f5220g.setText("x" + bLiveFanBaseGift.num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6533h0(this);
        this.f5217d.setBackground(yb2.e(new int[]{-2477312, 14299904}, GradientDrawable.Orientation.TOP_BOTTOM, t100.g, false));
        this.f5217d.setAlpha(0.2f);
    }
}
