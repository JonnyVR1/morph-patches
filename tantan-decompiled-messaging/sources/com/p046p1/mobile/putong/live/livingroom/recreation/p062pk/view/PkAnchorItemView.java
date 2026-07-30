package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkAnchorItemView;
import p147v.VDraweeView;
import p149l.eat;
import p149l.f30;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.lsi0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class PkAnchorItemView extends RelativeLayout {
    public PkAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76151a(TextView textView, f30 f30Var, BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo, View view) {
        if (TextUtils.equals((String) textView.getTag(), "unacceptPk")) {
            lsi0.m151593w(eat.f90256n);
        } else if (TextUtils.equals((String) textView.getTag(), "pking")) {
            lsi0.m151593w(eat.f90257o);
        } else {
            f30Var.call(bLiveAnchor, pkFriendInfo);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76152b(VDraweeView vDraweeView, TextView textView, BLiveAnchor bLiveAnchor, PkFriendInfo pkFriendInfo) {
        User userQueryUserById = pkFriendInfo.queryUserById(bLiveAnchor.f44331id);
        if (userQueryUserById != null) {
            vDraweeView.setImageResource(i3c0.f110754J8);
            hxs.m133407t("context_single_room", vDraweeView, userQueryUserById.m60124fp().url, t100.m186890d(36.0f));
            textView.setText(userQueryUserById.name);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76153c(final TextView textView, final BLiveAnchor bLiveAnchor, final f30<BLiveAnchor, PkFriendInfo> f30Var, final PkFriendInfo pkFriendInfo) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ki70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PkAnchorItemView.m76151a(textView, f30Var, bLiveAnchor, pkFriendInfo, view);
            }
        });
        if (bLiveAnchor.liveSetting.unacceptPk) {
            textView.setText(R$string.f47081Y9);
            textView.setTextColor(Color.parseColor("#bfbfbf"));
            textView.setBackgroundColor(getResources().getColor(h1c0.f105413v1));
            textView.setTag("unacceptPk");
            return;
        }
        if (bLiveAnchor.isPking) {
            textView.setText(R$string.f46589Ba);
            textView.setTextColor(Color.parseColor("#bfbfbf"));
            textView.setBackgroundResource(i3c0.f111070l0);
            textView.setTag("pking");
            return;
        }
        textView.setText(R$string.f46677Fa);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setBackgroundResource(i3c0.f111125p7);
        textView.setTag("acceptPK");
    }

    public PkAnchorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkAnchorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
