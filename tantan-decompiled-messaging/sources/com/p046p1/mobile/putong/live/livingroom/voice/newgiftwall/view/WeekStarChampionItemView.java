package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.yb2;

/* JADX INFO: loaded from: classes11.dex */
public class WeekStarChampionItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f53804c;

    /* JADX INFO: renamed from: d */
    public VText f53805d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53806e;

    /* JADX INFO: renamed from: f */
    public VText f53807f;

    public WeekStarChampionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public void m78703P(GiftBean giftBean) {
        hxs.m133412y(this.f53804c, giftBean.icon);
        this.f53805d.setText(giftBean.name);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean != null) {
            this.f53807f.setText(userBean.name);
            hxs.m133402o("context_single_room", this.f53806e, giftBean.top1ContributorUser.avatar);
        }
        kvc0.m147360i(this.f53804c, !giftBean.isOwned);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(yb2.m213884i(Color.parseColor("#0DD9D9D9"), 16));
        this.f53804c = (VDraweeView) findViewById(g5c0.f100641A2);
        this.f53805d = (VText) findViewById(g5c0.f100985l2);
        this.f53806e = (VDraweeView) findViewById(g5c0.f100745L7);
        this.f53807f = (VText) findViewById(g5c0.f100808S7);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
