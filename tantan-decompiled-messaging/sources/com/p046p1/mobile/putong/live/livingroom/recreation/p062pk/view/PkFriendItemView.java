package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import p147v.VDraweeView;
import p149l.f30;
import p149l.kn70;

/* JADX INFO: loaded from: classes5.dex */
public class PkFriendItemView extends PkAnchorItemView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51691a;

    /* JADX INFO: renamed from: b */
    public TextView f51692b;

    /* JADX INFO: renamed from: c */
    public TextView f51693c;

    public PkFriendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m76169d(View view) {
        kn70.m146560a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m76170e(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, f30<BLiveAnchor, PkFriendInfo> f30Var) {
        m76152b(this.f51691a, this.f51692b, bLiveAnchor, pkFriendInfo);
        m76153c(this.f51693c, bLiveAnchor, f30Var, pkFriendInfo);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76169d(this);
    }

    public PkFriendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
