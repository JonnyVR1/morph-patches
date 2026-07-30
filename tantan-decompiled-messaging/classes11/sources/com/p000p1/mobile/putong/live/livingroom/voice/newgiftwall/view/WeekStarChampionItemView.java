package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import l.g5c0;
import l.hxs;
import l.kvc0;
import l.yb2;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeekStarChampionItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f7410c;

    /* JADX INFO: renamed from: d */
    public VText f7411d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7412e;

    /* JADX INFO: renamed from: f */
    public VText f7413f;

    public WeekStarChampionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public void m8919P(GiftBean giftBean) {
        hxs.y(this.f7410c, giftBean.icon);
        this.f7411d.setText(giftBean.name);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean != null) {
            this.f7413f.setText(userBean.name);
            hxs.o("context_single_room", this.f7412e, giftBean.top1ContributorUser.avatar);
        }
        kvc0.i(this.f7410c, !giftBean.isOwned);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setBackground(yb2.i(Color.parseColor("#0DD9D9D9"), 16));
        this.f7410c = findViewById(g5c0.A2);
        this.f7411d = findViewById(g5c0.l2);
        this.f7412e = findViewById(g5c0.L7);
        this.f7413f = findViewById(g5c0.S7);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
