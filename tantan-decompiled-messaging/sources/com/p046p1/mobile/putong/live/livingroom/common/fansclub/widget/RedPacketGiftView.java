package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import p147v.VDraweeView;
import p147v.VText;
import p149l.nkc0;
import p149l.t100;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f49175d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49176e;

    /* JADX INFO: renamed from: f */
    public VText f49177f;

    /* JADX INFO: renamed from: g */
    public VText f49178g;

    public RedPacketGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m73010h0(View view) {
        nkc0.m159825a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m73011i0(BLiveFanBaseGift bLiveFanBaseGift) {
        this.f49176e.setImageURI(bLiveFanBaseGift.giftUrl);
        this.f49177f.setText(bLiveFanBaseGift.giftName);
        this.f49178g.setText(BaseSei.f13930X + bLiveFanBaseGift.num);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73010h0(this);
        this.f49175d.setBackground(yb2.m213880e(new int[]{-2477312, 14299904}, GradientDrawable.Orientation.TOP_BOTTOM, t100.f167258g, false));
        this.f49175d.setAlpha(0.2f);
    }
}
