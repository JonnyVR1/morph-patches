package com.p046p1.mobile.putong.live.livingroom.increment.gift.suit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttribute;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetProcesses;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.cwj;
import p149l.hxs;
import p149l.owj;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftSuitItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f49963a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49964b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49965c;

    /* JADX INFO: renamed from: d */
    public VText f49966d;

    /* JADX INFO: renamed from: e */
    public VText f49967e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49968f;

    /* JADX INFO: renamed from: g */
    public VText f49969g;

    public GiftSuitItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m74016b(View view) {
        cwj.m109049a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74017c(final owj owjVar, BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        final BLiveGiftItem bLiveGiftItemM166400b4 = owjVar.m166400b4(bLiveGiftSetProcesses.f44381id);
        xdl0.m208329E0(this.f49969g, new View.OnClickListener() { // from class: l.bwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                owjVar.m166420v4(bLiveGiftItemM166400b4);
            }
        });
        hxs.m133406s("context_single_room", this.f49965c, bLiveGiftItemM166400b4.url);
        this.f49966d.setText(String.format("%s/%s", Integer.valueOf(bLiveGiftSetProcesses.accumulatedNum), Integer.valueOf(bLiveGiftSetProcesses.entranceNum)));
        m74019e(bLiveGiftSetProcesses);
        this.f49967e.setText(w8u.m202218u(R$string.f47523se, Long.valueOf(bLiveGiftItemM166400b4.purchasePrice)));
    }

    /* JADX INFO: renamed from: d */
    public void m74018d(owj owjVar, BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute) {
        hxs.m133406s("context_single_room", this.f49964b, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.framePicUrl);
        owjVar.m166418t4(this.f49967e, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.purchasePriceColor);
        owjVar.m166416r4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processFramePicUrl, this.f49966d);
        owjVar.m166418t4(this.f49966d, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.processColor);
        owjVar.m166415q4(bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftIconUrl, this.f49968f);
        owjVar.m166418t4(this.f49969g, bLiveGiftSetDisplayAttribute.giftDisplayAttribute.givenGiftTextColor);
    }

    /* JADX INFO: renamed from: e */
    public final void m74019e(BLiveGiftSetProcesses bLiveGiftSetProcesses) {
        int i = bLiveGiftSetProcesses.entranceNum;
        int i2 = bLiveGiftSetProcesses.accumulatedNum;
        VText vText = this.f49969g;
        if (i == i2) {
            vText.setEnabled(false);
            this.f49969g.setText(w8u.m202217t(R$string.f47448p5));
        } else {
            vText.setEnabled(true);
            this.f49969g.setText(w8u.m202217t(R$string.f47470q5));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74016b(this);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftSuitItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
