package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import p151v.VDraweeView;
import p153l.qv70;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class PkFriendItemView extends PkAnchorItemView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52539a;

    /* JADX INFO: renamed from: b */
    public TextView f52540b;

    /* JADX INFO: renamed from: c */
    public TextView f52541c;

    public PkFriendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m77352d(View view) {
        qv70.m178253a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m77353e(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, z20<BLiveAnchor, PkFriendInfo> z20Var) {
        m77335b(this.f52539a, this.f52540b, bLiveAnchor, pkFriendInfo);
        m77336c(this.f52541c, bLiveAnchor, z20Var, pkFriendInfo);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77352d(this);
    }

    public PkFriendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
