package com.p000p1.mobile.putong.live.livingroom.increment.gift.suit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttribute;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetProcesses;
import l.hxs;
import l.w8u;
import l.xdl0;
import p002l.cwj;
import p002l.owj;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftSuitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f6005a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6006b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6007c;

    /* JADX INFO: renamed from: d */
    public VText f6008d;

    /* JADX INFO: renamed from: e */
    public VText f6009e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6010f;

    /* JADX INFO: renamed from: g */
    public VText f6011g;

    public GiftSuitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m7577b(View view) {
        cwj.m11397a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m7578c(final owj owjVar, BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        final BLiveGiftItem bLiveGiftItemM19779b4 = owjVar.m19779b4(bLiveGiftSetProcesses.id);
        xdl0.E0(this.f6011g, new View.OnClickListener() { // from class: l.bwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owjVar.m19800v4(bLiveGiftItemM19779b4);
            }
        });
        hxs.s("context_single_room", this.f6007c, bLiveGiftItemM19779b4.url);
        this.f6008d.setText(String.format("%s/%s", Integer.valueOf(bLiveGiftSetProcesses.accumulatedNum), Integer.valueOf(bLiveGiftSetProcesses.entranceNum)));
        m7580e(bLiveGiftSetProcesses);
        this.f6009e.setText(w8u.u(R$string.f3565se, Long.valueOf(bLiveGiftItemM19779b4.purchasePrice)));
    }

    /* JADX INFO: renamed from: d */
    public void m7579d(owj owjVar, BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute) {
        hxs.s("context_single_room", this.f6006b, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.framePicUrl);
        owjVar.m19798t4(this.f6009e, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.purchasePriceColor);
        owjVar.m19795r4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processFramePicUrl, this.f6008d);
        owjVar.m19798t4(this.f6008d, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processColor);
        owjVar.m19794q4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftIconUrl, this.f6010f);
        owjVar.m19798t4(this.f6011g, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftTextColor);
    }

    /* JADX INFO: renamed from: e */
    public final void m7580e(BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        int i = bLiveGiftSetProcesses.entranceNum;
        int i2 = bLiveGiftSetProcesses.accumulatedNum;
        VText vText = this.f6011g;
        if (i == i2) {
            vText.setEnabled(false);
            this.f6011g.setText(w8u.t(R$string.f3490p5));
        } else {
            vText.setEnabled(true);
            this.f6011g.setText(w8u.t(R$string.f3512q5));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7577b(this);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
