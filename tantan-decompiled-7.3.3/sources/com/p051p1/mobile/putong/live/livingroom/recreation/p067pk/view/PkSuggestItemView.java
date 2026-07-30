package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import p151v.VDraweeView;
import p153l.civ;
import p153l.htd0;
import p153l.oa80;
import p153l.obc0;
import p153l.q8g0;
import p153l.yau;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class PkSuggestItemView extends PkAnchorItemView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52583a;

    /* JADX INFO: renamed from: b */
    public TextView f52584b;

    /* JADX INFO: renamed from: c */
    public TextView f52585c;

    /* JADX INFO: renamed from: d */
    public TextView f52586d;

    /* JADX INFO: renamed from: e */
    public TextView f52587e;

    public PkSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m77404d(View view) {
        oa80.m166828a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m77405e(BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, z20<BLiveAnchor, PkFriendInfo> z20Var) {
        String strM175811p;
        m77336c(this.f52587e, bLiveAnchor, z20Var, pkFriendInfo);
        m77335b(this.f52583a, this.f52584b, bLiveAnchor, pkFriendInfo);
        User userQueryUserById = pkFriendInfo.queryUserById(bLiveAnchor.f45179id);
        this.f52585c.setText(String.valueOf(userQueryUserById.age));
        this.f52585c.setBackgroundResource(userQueryUserById.isFemale() ? obc0.f146350h0 : obc0.f146049H);
        this.f52585c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(userQueryUserById.isFemale() ? obc0.f146084Ja : obc0.f146096Ka), (Drawable) null, (Drawable) null, (Drawable) null);
        Location location = userQueryUserById.location;
        int i = location.distance;
        if (i >= 100000) {
            boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
            Location location2 = userQueryUserById.location;
            strM175811p = !zIsEmpty ? location2.region.city : location2.region.country;
        } else {
            strM175811p = q8g0.m175811p(i, false);
        }
        BLive bLiveQueryLiveById = pkFriendInfo.queryLiveById(bLiveAnchor.f45179id);
        StringBuilder sb = new StringBuilder();
        String str = String.format(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? zrv.f205803e.getString(R$string.f48514z3) : zrv.f205803e.getString(R$string.f48492y3), yau.m214935c(bLiveQueryLiveById.memberCount), yau.m214935c(bLiveQueryLiveById.rewardPoint));
        sb.append(strM175811p);
        sb.append(", ");
        sb.append(str);
        this.f52586d.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77404d(this);
    }

    public PkSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
