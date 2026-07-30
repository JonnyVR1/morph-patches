package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.fc2;
import p153l.izs;
import p153l.mdc0;
import p153l.n3d0;

/* JADX INFO: loaded from: classes10.dex */
public class WeekStarChampionItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f54652c;

    /* JADX INFO: renamed from: d */
    public VText f54653d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54654e;

    /* JADX INFO: renamed from: f */
    public VText f54655f;

    public WeekStarChampionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public void m79886P(GiftBean giftBean) {
        izs.m142874y(this.f54652c, giftBean.icon);
        this.f54653d.setText(giftBean.name);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean != null) {
            this.f54655f.setText(userBean.name);
            izs.m142864o("context_single_room", this.f54654e, giftBean.top1ContributorUser.avatar);
        }
        n3d0.m161285i(this.f54652c, !giftBean.isOwned);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(fc2.m124979i(Color.parseColor("#0DD9D9D9"), 16));
        this.f54652c = (VDraweeView) findViewById(mdc0.f135886A2);
        this.f54653d = (VText) findViewById(mdc0.f136230l2);
        this.f54654e = (VDraweeView) findViewById(mdc0.f135990L7);
        this.f54655f = (VText) findViewById(mdc0.f136053S7);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
