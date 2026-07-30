package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import p147v.VDraweeView;
import p149l.bgv;
import p149l.f30;
import p149l.fld0;
import p149l.i0g0;
import p149l.i280;
import p149l.i3c0;
import p149l.x8u;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class PkSuggestItemView extends PkAnchorItemView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51735a;

    /* JADX INFO: renamed from: b */
    public TextView f51736b;

    /* JADX INFO: renamed from: c */
    public TextView f51737c;

    /* JADX INFO: renamed from: d */
    public TextView f51738d;

    /* JADX INFO: renamed from: e */
    public TextView f51739e;

    public PkSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m76221d(View view) {
        i280.m134047a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m76222e(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, f30<BLiveAnchor, PkFriendInfo> f30Var) {
        String strM133876p;
        m76153c(this.f51739e, bLiveAnchor, f30Var, pkFriendInfo);
        m76152b(this.f51735a, this.f51736b, bLiveAnchor, pkFriendInfo);
        User userQueryUserById = pkFriendInfo.queryUserById(bLiveAnchor.f44331id);
        this.f51737c.setText(String.valueOf(userQueryUserById.age));
        this.f51737c.setBackgroundResource(userQueryUserById.isFemale() ? i3c0.f111022h0 : i3c0.f110721H);
        this.f51737c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(userQueryUserById.isFemale() ? i3c0.f110756Ja : i3c0.f110768Ka), (Drawable) null, (Drawable) null, (Drawable) null);
        Location location = userQueryUserById.location;
        int i = location.distance;
        if (i >= 100000) {
            boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
            Location location2 = userQueryUserById.location;
            strM133876p = !zIsEmpty ? location2.region.city : location2.region.country;
        } else {
            strM133876p = i0g0.m133876p(i, false);
        }
        BLive bLiveQueryLiveById = pkFriendInfo.queryLiveById(bLiveAnchor.f44331id);
        StringBuilder sb = new StringBuilder();
        String str = String.format(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? ypv.f199497e.getString(R$string.f47666z3) : ypv.f199497e.getString(R$string.f47644y3), x8u.m207433c(bLiveQueryLiveById.memberCount), x8u.m207433c(bLiveQueryLiveById.rewardPoint));
        sb.append(strM133876p);
        sb.append(", ");
        sb.append(str);
        this.f51738d.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76221d(this);
    }

    public PkSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
