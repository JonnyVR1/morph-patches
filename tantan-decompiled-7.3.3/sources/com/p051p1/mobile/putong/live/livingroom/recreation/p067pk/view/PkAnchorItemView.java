package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkAnchorItemView;
import p151v.VDraweeView;
import p153l.fct;
import p153l.izs;
import p153l.n9c0;
import p153l.o1j0;
import p153l.obc0;
import p153l.qa00;
import p153l.z20;

/* JADX INFO: loaded from: classes5.dex */
public class PkAnchorItemView extends RelativeLayout {
    public PkAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77334a(TextView textView, z20 z20Var, BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, View view) {
        if (TextUtils.equals((String) textView.getTag(), "unacceptPk")) {
            o1j0.m165649w(fct.f98274n);
        } else if (TextUtils.equals((String) textView.getTag(), "pking")) {
            o1j0.m165649w(fct.f98275o);
        } else {
            z20Var.call(bLiveAnchor, pkFriendInfo);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77335b(VDraweeView vDraweeView, TextView textView, BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        User userQueryUserById = pkFriendInfo.queryUserById(bLiveAnchor.f45179id);
        if (userQueryUserById != null) {
            vDraweeView.setImageResource(obc0.f146082J8);
            izs.m142869t("context_single_room", vDraweeView, userQueryUserById.m61308fp().url, qa00.m175859d(36.0f));
            textView.setText(userQueryUserById.name);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77336c(final TextView textView, final BLiveAnchor bLiveAnchor, final z20<BLiveAnchor, PkFriendInfo> z20Var, final PkFriendInfo pkFriendInfo) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.qq70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkAnchorItemView.m77334a(textView, z20Var, bLiveAnchor, pkFriendInfo, view);
            }
        });
        if (bLiveAnchor.liveSetting.unacceptPk) {
            textView.setText(R$string.f47929Y9);
            textView.setTextColor(Color.parseColor("#bfbfbf"));
            textView.setBackgroundColor(getResources().getColor(n9c0.f140874v1));
            textView.setTag("unacceptPk");
            return;
        }
        if (bLiveAnchor.isPking) {
            textView.setText(R$string.f47437Ba);
            textView.setTextColor(Color.parseColor("#bfbfbf"));
            textView.setBackgroundResource(obc0.f146398l0);
            textView.setTag("pking");
            return;
        }
        textView.setText(R$string.f47525Fa);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setBackgroundResource(obc0.f146453p7);
        textView.setTag("acceptPK");
    }

    public PkAnchorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkAnchorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
