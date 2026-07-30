package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftRecord;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGift;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.kdu;
import p153l.mdc0;
import p153l.y20;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class GiftRecordDetailItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53999d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54000e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54001f;

    /* JADX INFO: renamed from: g */
    public VText f54002g;

    /* JADX INFO: renamed from: h */
    public VText f54003h;

    /* JADX INFO: renamed from: i */
    public VText f54004i;

    public GiftRecordDetailItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public void m79343j0(final BLiveBossGift bLiveBossGift, final y20<String> y20Var) {
        izs.m142864o("context_single_room", this.f54001f, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFPMjdGTTdFWFBYMjJUS1g0UEhMMk1RM0lEWFBDVzEyIiwidyI6MzYsImgiOjM2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzYxODQxMjU1MDQ2MjI0ODI3MH0.webp");
        izs.m142864o("context_single_room", this.f53999d, bLiveBossGift.giftUrl);
        izs.m142864o("context_single_room", this.f54000e, bLiveBossGift.userAvatar);
        this.f54002g.setText(bLiveBossGift.giftName + " x" + bLiveBossGift.giftNum);
        this.f54003h.setText(kdu.m149274S(bLiveBossGift.createdTime * 1000));
        this.f54004i.setText(yau.m214940h((long) bLiveBossGift.popularityValue));
        bnl0.m105509E0(this.f54000e, new View.OnClickListener() { // from class: l.axj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveBossGift.userId);
            }
        });
        bnl0.m105509E0(this.f53999d, new View.OnClickListener() { // from class: l.bxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveBossGift.userId);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53999d = (VDraweeView) findViewById(mdc0.f135886A2);
        this.f54000e = (VDraweeView) findViewById(mdc0.f136299t);
        this.f54001f = (VDraweeView) findViewById(mdc0.f135939G1);
        this.f54002g = (VText) findViewById(mdc0.f136130b2);
        this.f54003h = (VText) findViewById(mdc0.f136266p2);
        this.f54004i = (VText) findViewById(mdc0.f135933F4);
    }

    public GiftRecordDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftRecordDetailItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
