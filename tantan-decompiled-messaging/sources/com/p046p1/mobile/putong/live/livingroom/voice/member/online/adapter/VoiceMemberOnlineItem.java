package com.p046p1.mobile.putong.live.livingroom.voice.member.online.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.d1t;
import p149l.e30;
import p149l.fce;
import p149l.gm0;
import p149l.i0g0;
import p149l.i3c0;
import p149l.mqv;
import p149l.ney;
import p149l.ozn0;
import p149l.rfd0;
import p149l.sxj;
import p149l.t100;
import p149l.w9j;
import p149l.wtn0;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceMemberOnlineItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberOnlineItem f53654a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53655b;

    /* JADX INFO: renamed from: c */
    public VText f53656c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f53657d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53658e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f53659f;

    /* JADX INFO: renamed from: g */
    public VLinear f53660g;

    /* JADX INFO: renamed from: h */
    public VLinear f53661h;

    /* JADX INFO: renamed from: i */
    public VImage f53662i;

    /* JADX INFO: renamed from: j */
    public VText f53663j;

    /* JADX INFO: renamed from: k */
    public TextView f53664k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f53665l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f53666m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f53667n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f53668o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f53669p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f53670q;

    /* JADX INFO: renamed from: r */
    public VImage f53671r;

    /* JADX INFO: renamed from: s */
    public VText f53672s;

    /* JADX INFO: renamed from: t */
    public wtn0 f53673t;

    public VoiceMemberOnlineItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m78603c(View view) {
        ozn0.m166889a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m78604d() {
        xdl0.m208344M(this.f53661h, false);
        xdl0.m208344M(this.f53672s, false);
        xdl0.m208344M(this.f53665l, false);
        xdl0.m208344M(this.f53666m, false);
        xdl0.m208344M(this.f53667n, false);
        xdl0.m208344M(this.f53668o, false);
        xdl0.m208344M(this.f53669p, false);
        xdl0.m208344M(this.f53670q, false);
        xdl0.m208344M(this.f53664k, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m78605e(String str, int i) {
        xdl0.m208344M(this.f53661h, true);
        this.f53662i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f53661h.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f53663j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53663j.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m78606f(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.m208344M(this.f53667n, true);
        xdl0.m208344M(this.f53668o, true);
        xdl0.m208344M(this.f53669p, true);
        if (this.f53673t == null) {
            wtn0 wtn0Var = new wtn0(false);
            this.f53673t = wtn0Var;
            wtn0Var.m205575v(gm0Var);
            this.f53673t.m205573t((Act) xdl0.m208328E(this));
        }
        this.f53673t.m205562i();
        this.f53673t.m205561h(getContext(), this.f53667n, this.f53668o, this.f53669p, this.f53670q);
        this.f53673t.m205572s(user);
    }

    /* JADX INFO: renamed from: g */
    public void m78607g(final e30<String> e30Var, mqv<BLiveMember> mqvVar, gm0 gm0Var, boolean z, String str) {
        final User userM156005h = mqvVar.m156005h();
        if (userM156005h == null) {
            return;
        }
        agv.m96344b(this.f53657d, t100.f167229D, mqvVar, new w9j() { // from class: l.mzn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return userM156005h.m60124fp().profileSmall().formatted();
            }
        });
        d1t d1tVarM109678a = d1t.m109678a(mqvVar);
        boolean zM109681d = d1tVarM109678a.m109681d();
        LiveGradientTextView liveGradientTextView = this.f53659f;
        if (zM109681d) {
            rfd0.m179126b(liveGradientTextView, d1tVarM109678a.f83297a.name, Color.parseColor("#e6ffffff"), d1tVarM109678a.f83297a.userNameGradientColors);
            m78604d();
            xdl0.m208344M(this.f53671r, true);
        } else {
            rfd0.m179126b(liveGradientTextView, userM156005h.name, Color.parseColor("#e6ffffff"), mqvVar.f135304a.userNameGradientColors);
            xdl0.m208344M(this.f53671r, false);
            m78605e(userM156005h.gender.toString(), userM156005h.age.intValue());
            xdl0.m208344M(this.f53663j, (userM156005h.isHideAgeFromSVip() || x4s.m207012b(str)) ? false : true);
            m78608h(userM156005h, z, str);
            BLiveMember bLiveMember = mqvVar.f135304a;
            if (bLiveMember.liveUserLevel == null || bLiveMember.liveUserLevel.grade <= 0) {
                xdl0.m208344M(this.f53665l, false);
            } else {
                m78609i(bLiveMember.liveUserLevel);
            }
            xdl0.m208344M(this.f53666m, false);
            m78606f(userM156005h, gm0Var);
            xdl0.m208344M(this.f53664k, false);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.nzn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(userM156005h.f56011id);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m78608h(User user, boolean z, String str) {
        String str2;
        boolean zM207012b = x4s.m207012b(str);
        VText vText = this.f53672s;
        if (zM207012b) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        String strM133876p = i0g0.m133876p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str2 = location.region.country;
            } else {
                str2 = location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM133876p;
            }
            strM133876p = str2;
        }
        this.f53672s.setText(strM133876p);
        xdl0.m208344M(this.f53672s, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: i */
    public final void m78609i(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f53665l, false);
        } else {
            xdl0.m208344M(this.f53665l, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f53665l, ney.m159134a(bLiveUserLevel.grade) ? sxj.f166798b : sxj.f166797a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78603c(this);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
