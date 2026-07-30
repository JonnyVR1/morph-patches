package com.p000p1.mobile.putong.live.livingroom.voice.member.online.adapter;

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
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.tantanapp.common.data.DbObject;
import l.agv;
import l.d1t;
import l.e30;
import l.fce;
import l.gm0;
import l.i3c0;
import l.mqv;
import l.ney;
import l.ozn0;
import l.rfd0;
import l.sxj;
import l.t100;
import l.w9j;
import l.x4s;
import l.xdl0;
import p009l.i0g0;
import p009l.wtn0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceMemberOnlineItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMemberOnlineItem f7260a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f7261b;

    /* JADX INFO: renamed from: c */
    public VText f7262c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f7263d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f7264e;

    /* JADX INFO: renamed from: f */
    public LiveGradientTextView f7265f;

    /* JADX INFO: renamed from: g */
    public VLinear f7266g;

    /* JADX INFO: renamed from: h */
    public VLinear f7267h;

    /* JADX INFO: renamed from: i */
    public VImage f7268i;

    /* JADX INFO: renamed from: j */
    public VText f7269j;

    /* JADX INFO: renamed from: k */
    public TextView f7270k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f7271l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f7272m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f7273n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f7274o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f7275p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f7276q;

    /* JADX INFO: renamed from: r */
    public VImage f7277r;

    /* JADX INFO: renamed from: s */
    public VText f7278s;

    /* JADX INFO: renamed from: t */
    public wtn0 f7279t;

    public VoiceMemberOnlineItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m8819c(View view) {
        ozn0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m8820d() {
        xdl0.M(this.f7267h, false);
        xdl0.M(this.f7278s, false);
        xdl0.M(this.f7271l, false);
        xdl0.M(this.f7272m, false);
        xdl0.M(this.f7273n, false);
        xdl0.M(this.f7274o, false);
        xdl0.M(this.f7275p, false);
        xdl0.M(this.f7276q, false);
        xdl0.M(this.f7270k, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m8821e(String str, int i) {
        xdl0.M(this.f7267h, true);
        this.f7268i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.V5 : i3c0.T5);
        this.f7267h.setBackground(fce.b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.d(5.0f)));
        this.f7269j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7269j.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m8822f(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.M(this.f7273n, true);
        xdl0.M(this.f7274o, true);
        xdl0.M(this.f7275p, true);
        if (this.f7279t == null) {
            wtn0 wtn0Var = new wtn0(false);
            this.f7279t = wtn0Var;
            wtn0Var.m24563v(gm0Var);
            this.f7279t.m24561t(xdl0.E(this));
        }
        this.f7279t.m24550i();
        this.f7279t.m24549h(getContext(), this.f7273n, this.f7274o, this.f7275p, this.f7276q);
        this.f7279t.m24560s(user);
    }

    /* JADX INFO: renamed from: g */
    public void m8823g(final e30<String> e30Var, mqv<BLiveMember> mqvVar, gm0 gm0Var, boolean z, String str) {
        final User userH = mqvVar.h();
        if (userH == null) {
            return;
        }
        agv.b(this.f7263d, t100.D, mqvVar, new w9j() { // from class: l.mzn0
            public final Object call(Object obj) {
                return userH.fp().profileSmall().formatted();
            }
        });
        d1t d1tVarA = d1t.a(mqvVar);
        boolean zD = d1tVarA.d();
        LiveGradientTextView liveGradientTextView = this.f7265f;
        if (zD) {
            rfd0.b(liveGradientTextView, d1tVarA.a.name, Color.parseColor("#e6ffffff"), d1tVarA.a.userNameGradientColors);
            m8820d();
            xdl0.M(this.f7277r, true);
        } else {
            rfd0.b(liveGradientTextView, userH.name, Color.parseColor("#e6ffffff"), ((BLiveMember) mqvVar.a).userNameGradientColors);
            xdl0.M(this.f7277r, false);
            m8821e(userH.gender.toString(), userH.age.intValue());
            xdl0.M(this.f7269j, (userH.isHideAgeFromSVip() || x4s.b(str)) ? false : true);
            m8824h(userH, z, str);
            Object obj = mqvVar.a;
            if (((BLiveMember) obj).liveUserLevel == null || ((BLiveMember) obj).liveUserLevel.grade <= 0) {
                xdl0.M(this.f7271l, false);
            } else {
                m8825i(((BLiveMember) obj).liveUserLevel);
            }
            xdl0.M(this.f7272m, false);
            m8822f(userH, gm0Var);
            xdl0.M(this.f7270k, false);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.nzn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(((DbObject) userH).id);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m8824h(User user, boolean z, String str) {
        String str2;
        boolean zB = x4s.b(str);
        VText vText = this.f7278s;
        if (zB) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        String strM16144p = i0g0.m16144p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str2 = location.region.country;
            } else {
                str2 = location.region.city + " " + strM16144p;
            }
            strM16144p = str2;
        }
        this.f7278s.setText(strM16144p);
        xdl0.M(this.f7278s, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: i */
    public final void m8825i(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.M(this.f7271l, false);
        } else {
            xdl0.M(this.f7271l, true);
            sxj.c(bLiveUserLevel.backendUrl, this.f7271l, ney.a(bLiveUserLevel.grade) ? sxj.b : sxj.a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8819c(this);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMemberOnlineItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
