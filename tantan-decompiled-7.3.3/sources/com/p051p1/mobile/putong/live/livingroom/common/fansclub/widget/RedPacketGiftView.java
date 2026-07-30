package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import p151v.VDraweeView;
import p151v.VText;
import p153l.fc2;
import p153l.qa00;
import p153l.usc0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f50023d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50024e;

    /* JADX INFO: renamed from: f */
    public VText f50025f;

    /* JADX INFO: renamed from: g */
    public VText f50026g;

    public RedPacketGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74193h0(View view) {
        usc0.m197860a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74194i0(BLiveFanBaseGift bLiveFanBaseGift) {
        this.f50024e.setImageURI(bLiveFanBaseGift.giftUrl);
        this.f50025f.setText(bLiveFanBaseGift.giftName);
        this.f50026g.setText(BaseSei.f14624X + bLiveFanBaseGift.num);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74193h0(this);
        this.f50023d.setBackground(fc2.m124975e(new int[]{-2477312, 14299904}, GradientDrawable.Orientation.TOP_BOTTOM, qa00.f156320g, false));
        this.f50023d.setAlpha(0.2f);
    }
}
