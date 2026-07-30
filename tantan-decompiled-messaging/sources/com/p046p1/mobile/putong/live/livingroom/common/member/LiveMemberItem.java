package com.p046p1.mobile.putong.live.livingroom.common.member;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.agv;
import p149l.bgv;
import p149l.bt0;
import p149l.c4g0;
import p149l.d1t;
import p149l.e30;
import p149l.fce;
import p149l.ffw;
import p149l.fld0;
import p149l.gar;
import p149l.ggv;
import p149l.gm0;
import p149l.h1c0;
import p149l.hcc0;
import p149l.i0g0;
import p149l.i3c0;
import p149l.jo0;
import p149l.kvc0;
import p149l.mkd0;
import p149l.mqv;
import p149l.ney;
import p149l.p2t;
import p149l.sxj;
import p149l.t100;
import p149l.uvr;
import p149l.vdt;
import p149l.w1t;
import p149l.w220;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public RelativeLayout f49194A;

    /* JADX INFO: renamed from: B */
    public VText f49195B;

    /* JADX INFO: renamed from: C */
    public VImage f49196C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f49197D;

    /* JADX INFO: renamed from: E */
    public c4g0 f49198E;

    /* JADX INFO: renamed from: F */
    public w1t f49199F;

    /* JADX INFO: renamed from: a */
    public LiveMemberItem f49200a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49201b;

    /* JADX INFO: renamed from: c */
    public VText f49202c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f49203d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f49204e;

    /* JADX INFO: renamed from: f */
    public VText f49205f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f49206g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f49207h;

    /* JADX INFO: renamed from: i */
    public VImage f49208i;

    /* JADX INFO: renamed from: j */
    public VText f49209j;

    /* JADX INFO: renamed from: k */
    public TextView f49210k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f49211l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f49212m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f49213n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f49214o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f49215p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f49216q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f49217r;

    /* JADX INFO: renamed from: s */
    public VImage f49218s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f49219t;

    /* JADX INFO: renamed from: u */
    public VText f49220u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f49221v;

    /* JADX INFO: renamed from: w */
    public VText f49222w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f49223x;

    /* JADX INFO: renamed from: y */
    public VText f49224y;

    /* JADX INFO: renamed from: z */
    public CommonMedalView f49225z;

    public LiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73057c(View view, View view2) {
        xdl0.m208344M(view, true);
        xdl0.m208344M(view2, false);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m73058d(View view, View view2) {
        xdl0.m208344M(view, true);
        xdl0.m208344M(view2, true);
        view.setAlpha(0.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m73062h(View view) {
        p2t.m167222a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m73063i(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + gar.m125008b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + gar.m125008b(j2) + "人气";
        }
        return "落后" + gar.m125008b(j2) + "人气";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73064j(Long l2) {
        if (l2.longValue() <= 0 || l2.longValue() % 2 != 0) {
            m73078x(this.f49223x, this.f49222w);
        } else {
            m73078x(this.f49222w, this.f49223x);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m73065k() {
        xdl0.m208344M(this.f49207h, false);
        xdl0.m208344M(this.f49220u, false);
        xdl0.m208344M(this.f49211l, false);
        xdl0.m208344M(this.f49212m, false);
        xdl0.m208344M(this.f49213n, false);
        xdl0.m208344M(this.f49214o, false);
        xdl0.m208344M(this.f49215p, false);
        xdl0.m208344M(this.f49216q, false);
        xdl0.m208344M(this.f49217r, false);
        xdl0.m208344M(this.f49210k, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m73066l(int i) {
        hcc0.m130420e(getContext(), this.f49201b, this.f49202c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m */
    public final void m73067m(double d) {
        xdl0.m208344M(this.f49220u, uvr.m196087d().m162719u0());
        this.f49220u.setTextColor(kvc0.m147352a(h1c0.f105305E0));
        int i = uvr.m196087d().m162715s0() ? R$string.f46608C7 : R$string.f47035W5;
        fld0<bgv> fld0Var = fld0.f98151f;
        if (((bgv) ypv.m215673l(fld0Var)).m101734n()) {
            i = R$string.f46980Td;
        }
        boolean zM202204B = w8u.m202204B();
        VText vText = this.f49220u;
        if (zM202204B) {
            vText.setText(x8u.m207433c(d) + kvc0.m147355d(i));
            return;
        }
        vText.setText(x8u.m207433c(d));
        int i2 = uvr.m196087d().m162715s0() ? i3c0.f110785M3 : i3c0.f111093n;
        if (((bgv) ypv.m215673l(fld0Var)).m101734n()) {
            i2 = i3c0.f111061k3;
        }
        xdl0.m208383k(this.f49220u, getResources().getDrawable(i2));
        this.f49220u.setCompoundDrawablePadding(t100.f167254c);
    }

    /* JADX INFO: renamed from: n */
    public final void m73068n(String str, int i) {
        xdl0.m208344M(this.f49207h, true);
        this.f49208i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f49207h.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f49209j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f49209j.setText(String.valueOf(i));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o */
    public void m73069o(e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var) {
        m73070p(e30Var, mqvVar, gm0Var, "", false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73062h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m73070p(final e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var, String str, boolean z) {
        mkd0.m154992z(this.f49198E);
        xdl0.m208344M(this.f49221v, false);
        xdl0.m208344M(this.f49197D, false);
        xdl0.m208344M(this.f49212m, false);
        xdl0.m208344M(this.f49201b, true);
        xdl0.m208344M(this.f49202c, true);
        xdl0.m208344M(this.f49194A, !TextUtils.isEmpty(str));
        xdl0.m208358V(this.f49203d, t100.m186890d(53.0f));
        xdl0.m208358V(this.f49204e, t100.m186890d(121.0f));
        xdl0.m208359W(this.f49204e, t100.m186890d(95.0f));
        xdl0.m208359W(this.f49219t, t100.f167260i);
        m73066l(mqvVar.f135304a.rank);
        final User user = mqvVar.f135304a.user;
        if (user == null) {
            return;
        }
        agv.m96345c(this.f49203d, t100.f167226A, mqvVar, new w9j() { // from class: l.i2t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return user.m60124fp().profileSmall().formatted();
            }
        }, 1);
        this.f49205f.setText(user.name);
        if (d1t.m109678a(mqvVar).m109681d()) {
            m73065k();
            xdl0.m208344M(this.f49218s, true);
        } else {
            xdl0.m208344M(this.f49218s, false);
            m73068n(user.gender.toString(), user.age.intValue());
            xdl0.m208344M(this.f49207h, (user.isHideAgeFromSVip() || ypv.m215672k().m195802b7() || ypv.m215672k().m195802b7()) ? false : true);
            BLiveLeaderBoards bLiveLeaderBoards = mqvVar.f135304a;
            if (bLiveLeaderBoards.liveUserLevel == null || bLiveLeaderBoards.liveUserLevel.grade <= 0) {
                xdl0.m208344M(this.f49211l, false);
            } else {
                m73076v(bLiveLeaderBoards.liveUserLevel);
            }
            m73073s(user, gm0Var);
        }
        m73067m(mqvVar.f135304a.amount);
        m73077w(str, mqvVar.f135304a, z);
        if (e30Var != null) {
            setOnClickListener(new View.OnClickListener() { // from class: l.j2t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(user.f56011id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m73071q(boolean z, Act act, mqv<BLiveLeaderBoards> mqvVar, BLiveLoveLeaderboard bLiveLoveLeaderboard) {
        mkd0.m154992z(this.f49198E);
        FrameLayout frameLayout = this.f49221v;
        if (!z) {
            xdl0.m208344M(frameLayout, false);
            xdl0.m208344M(this.f49194A, false);
            return;
        }
        xdl0.m208344M(frameLayout, true);
        xdl0.m208344M(this.f49194A, false);
        double d = mqvVar.f135304a.amount;
        double d2 = bLiveLoveLeaderboard.baseAmount;
        BLiveMedal bLiveMedalM126034t = ((ggv) ypv.m215673l(fld0.f98148c)).m126034t(bLiveLoveLeaderboard.medalId + "", "live", "");
        boolean zM201015b = w220.m201015b();
        if (bLiveMedalM126034t != null) {
            this.f49225z.setBackground(null);
            agv.m96352j(this.f49225z, bLiveMedalM126034t.getStaticUrl(), bLiveMedalM126034t.getDynamicUrl());
        }
        this.f49222w.setAlpha(1.0f);
        this.f49222w.setTranslationY(0.0f);
        xdl0.m208344M(this.f49222w, true);
        this.f49223x.setAlpha(1.0f);
        this.f49223x.setTranslationY(0.0f);
        xdl0.m208344M(this.f49223x, false);
        if (d < d2) {
            VText vText = this.f49222w;
            vText.setText("差" + ((int) (d2 - ((double) ((int) d)))) + "人气荣登宠爱榜");
            this.f49224y.setText("荣登宠爱榜得");
            xdl0.m208344M(this.f49222w, true);
            xdl0.m208344M(this.f49223x, false);
            if (!zM201015b) {
                this.f49198E = act.duringCreated(C22306c.interval(3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.m2t
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f130941a.m73064j((Long) obj);
                    }
                }));
            }
        } else if (zM201015b) {
            this.f49222w.setText("恭喜荣登宠爱榜");
            xdl0.m208344M(this.f49222w, true);
            xdl0.m208344M(this.f49223x, false);
        } else {
            this.f49224y.setText("荣登宠爱榜,已得");
            xdl0.m208344M(this.f49223x, true);
            xdl0.m208344M(this.f49222w, false);
        }
        xdl0.m208359W(this.f49204e, t100.m186890d(Math.max(this.f49222w.getText().length(), this.f49224y.getText().length() + 4) * 12));
    }

    /* JADX INFO: renamed from: r */
    public void m73072r(boolean z) {
        xdl0.m208344M(this.f49197D, z);
    }

    /* JADX INFO: renamed from: s */
    public final void m73073s(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.m208344M(this.f49213n, true);
        xdl0.m208344M(this.f49214o, true);
        xdl0.m208344M(this.f49215p, true);
        if (this.f49199F == null) {
            w1t w1tVar = new w1t(false);
            this.f49199F = w1tVar;
            w1tVar.m200965E(gm0Var);
            this.f49199F.m200963C((Act) xdl0.m208328E(this));
        }
        this.f49199F.m200967l();
        boolean zM198092b = vdt.m198092b(2);
        w1t w1tVar2 = this.f49199F;
        if (zM198092b) {
            w1tVar2.m200966k(getContext(), this.f49213n, this.f49214o, this.f49215p, this.f49216q, this.f49217r);
        } else {
            w1tVar2.m200966k(getContext(), this.f49213n, this.f49214o, this.f49215p, this.f49216q);
        }
        this.f49199F.m200979y(user);
    }

    /* JADX INFO: renamed from: t */
    public void m73074t(final e30<String> e30Var, mqv<BLiveMember> mqvVar, gm0 gm0Var, boolean z) {
        final User userM156005h = mqvVar.m156005h();
        if (userM156005h == null) {
            return;
        }
        agv.m96345c(this.f49203d, t100.f167229D, mqvVar, new w9j() { // from class: l.k2t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return userM156005h.m60124fp().profileSmall().formatted();
            }
        }, 1);
        boolean zM109681d = d1t.m109678a(mqvVar).m109681d();
        VText vText = this.f49205f;
        if (zM109681d) {
            vText.setText(d1t.m109678a(mqvVar).f83297a.name);
            m73065k();
            xdl0.m208344M(this.f49218s, true);
        } else {
            vText.setText(userM156005h.name);
            xdl0.m208344M(this.f49218s, false);
            m73068n(userM156005h.gender.toString(), userM156005h.age.intValue());
            xdl0.m208344M(this.f49207h, (userM156005h.isHideAgeFromSVip() || ypv.m215672k().m195802b7()) ? false : true);
            m73075u(userM156005h, z);
            BLiveMember bLiveMember = mqvVar.f135304a;
            if (bLiveMember.liveUserLevel == null || bLiveMember.liveUserLevel.grade <= 0 || z) {
                xdl0.m208344M(this.f49211l, false);
            } else {
                m73076v(bLiveMember.liveUserLevel);
            }
            xdl0.m208344M(this.f49212m, false);
            m73073s(userM156005h, gm0Var);
            TextView textView = this.f49210k;
            if (z) {
                xdl0.m208344M(textView, true);
                this.f49210k.setText(i0g0.m133869j0(userM156005h.profile.zodiac));
                this.f49210k.setBackground(fce.m120425b(i0g0.m133871l0(userM156005h.profile.zodiac), t100.m186890d(2.0f)));
            } else {
                xdl0.m208344M(textView, false);
            }
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.l2t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(userM156005h.f56011id);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m73075u(User user, boolean z) {
        String str;
        xdl0.m208344M(this.f49220u, true);
        String strM133876p = i0g0.m133876p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str = location.region.country;
            } else {
                str = location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM133876p;
            }
            strM133876p = str;
        }
        this.f49220u.setText(strM133876p);
        xdl0.m208344M(this.f49220u, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: v */
    public final void m73076v(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f49211l, false);
        } else {
            xdl0.m208344M(this.f49211l, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f49211l, ney.m159134a(bLiveUserLevel.grade) ? sxj.f166798b : sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m73077w(String str, BLiveLeaderBoards bLiveLeaderBoards, boolean z) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f49194A, false);
            return;
        }
        if (!TextUtils.equals(str, "currentWeek")) {
            if (TextUtils.equals(str, "lastWeek")) {
                xdl0.m208345M0(this.f49194A, false);
                return;
            }
            return;
        }
        if (z) {
            boolean zM201015b = w220.m201015b();
            RelativeLayout relativeLayout = this.f49194A;
            if (zM201015b) {
                xdl0.m208344M(relativeLayout, false);
                this.f49220u.setText("神秘人身份无法上榜");
                this.f49220u.setTextColor(kvc0.m147352a(h1c0.f105383l1));
                return;
            } else {
                xdl0.m208344M(relativeLayout, true);
                xdl0.m208344M(this.f49196C, false);
                this.f49195B.setText(m73063i(bLiveLeaderBoards.rank, (long) bLiveLeaderBoards.gap));
                this.f49195B.setTextColor(kvc0.m147352a(h1c0.f105383l1));
                return;
            }
        }
        boolean z2 = bLiveLeaderBoards.isNewUser;
        VImage vImage = this.f49196C;
        if (z2) {
            xdl0.m208344M(vImage, false);
            xdl0.m208335H0(this.f49195B, "NEW");
            this.f49195B.setTextColor(Color.parseColor("#FF603D"));
            return;
        }
        xdl0.m208344M(vImage, true);
        this.f49195B.setTextColor(kvc0.m147352a(h1c0.f105383l1));
        VText vText = this.f49195B;
        StringBuilder sb = new StringBuilder("本周排名");
        int i = bLiveLeaderBoards.rankDiff;
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        xdl0.m208335H0(vText, sb.toString());
        int i2 = bLiveLeaderBoards.rankDiff;
        if (i2 > 0) {
            xdl0.m208346N(this.f49196C, i3c0.f110932Z5);
            return;
        }
        VImage vImage2 = this.f49196C;
        if (i2 < 0) {
            xdl0.m208346N(vImage2, i3c0.f110910X5);
        } else {
            xdl0.m208346N(vImage2, i3c0.f110921Y5);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m73078x(final View view, final View view2) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int i = t100.f167260i;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(view, "translationY", 0L, 500L, linearInterpolator, i, 0.0f), bt0.m103743p(view2, "translationY", 0L, 500L, linearInterpolator, 0.0f, -i), bt0.m103743p(view, "alpha", 166L, 333L, linearInterpolator, 0.0f, 1.0f), bt0.m103743p(view2, "alpha", 0L, 333L, linearInterpolator, 1.0f, 0.0f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.n2t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m73058d(view, view2);
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.o2t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m73057c(view, view2);
            }
        });
        animatorM103753z.start();
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
