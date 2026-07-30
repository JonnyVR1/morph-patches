package com.p051p1.mobile.putong.live.livingroom.increment.gift.suit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttribute;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetProcesses;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.ezj;
import p153l.izs;
import p153l.syj;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class GiftSuitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f50811a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50812b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50813c;

    /* JADX INFO: renamed from: d */
    public VText f50814d;

    /* JADX INFO: renamed from: e */
    public VText f50815e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50816f;

    /* JADX INFO: renamed from: g */
    public VText f50817g;

    public GiftSuitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m75199b(View view) {
        syj.m188572a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m75200c(final ezj ezjVar, BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        final BLiveGiftItem bLiveGiftItemM123365b4 = ezjVar.m123365b4(bLiveGiftSetProcesses.f45229id);
        bnl0.m105509E0(this.f50817g, new View.OnClickListener() { // from class: l.ryj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ezjVar.m123384v4(bLiveGiftItemM123365b4);
            }
        });
        izs.m142868s("context_single_room", this.f50813c, bLiveGiftItemM123365b4.url);
        this.f50814d.setText(String.format("%s/%s", Integer.valueOf(bLiveGiftSetProcesses.accumulatedNum), Integer.valueOf(bLiveGiftSetProcesses.entranceNum)));
        m75202e(bLiveGiftSetProcesses);
        this.f50815e.setText(xau.m209911u(R$string.f48371se, Long.valueOf(bLiveGiftItemM123365b4.purchasePrice)));
    }

    /* JADX INFO: renamed from: d */
    public void m75201d(ezj ezjVar, BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute) {
        izs.m142868s("context_single_room", this.f50812b, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.framePicUrl);
        ezjVar.m123382t4(this.f50815e, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.purchasePriceColor);
        ezjVar.m123380r4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processFramePicUrl, this.f50814d);
        ezjVar.m123382t4(this.f50814d, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processColor);
        ezjVar.m123379q4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftIconUrl, this.f50816f);
        ezjVar.m123382t4(this.f50817g, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftTextColor);
    }

    /* JADX INFO: renamed from: e */
    public final void m75202e(BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        int i = bLiveGiftSetProcesses.entranceNum;
        int i2 = bLiveGiftSetProcesses.accumulatedNum;
        VText vText = this.f50817g;
        if (i == i2) {
            vText.setEnabled(false);
            this.f50817g.setText(xau.m209910t(R$string.f48296p5));
        } else {
            vText.setEnabled(true);
            this.f50817g.setText(xau.m209910t(R$string.f48318q5));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75199b(this);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
