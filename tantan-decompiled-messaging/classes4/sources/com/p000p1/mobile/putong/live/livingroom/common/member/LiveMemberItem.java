package com.p000p1.mobile.putong.live.livingroom.common.member;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveMedal;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.agv;
import l.bgv;
import l.bt0;
import l.c4g0;
import l.d1t;
import l.e30;
import l.fce;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hcc0;
import l.i0g0;
import l.jo0;
import l.kvc0;
import l.mkd0;
import l.mqv;
import l.sxj;
import l.t100;
import l.uvr;
import l.vdt;
import l.w8u;
import l.w9j;
import l.x8u;
import l.xdl0;
import l.ypv;
import p002l.gar;
import p002l.gm0;
import p002l.h1c0;
import p002l.i3c0;
import p002l.ney;
import p002l.p2t;
import p002l.w1t;
import p002l.w220;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public RelativeLayout f5236A;

    /* JADX INFO: renamed from: B */
    public VText f5237B;

    /* JADX INFO: renamed from: C */
    public VImage f5238C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f5239D;

    /* JADX INFO: renamed from: E */
    public c4g0 f5240E;

    /* JADX INFO: renamed from: F */
    public w1t f5241F;

    /* JADX INFO: renamed from: a */
    public LiveMemberItem f5242a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5243b;

    /* JADX INFO: renamed from: c */
    public VText f5244c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f5245d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5246e;

    /* JADX INFO: renamed from: f */
    public VText f5247f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5248g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f5249h;

    /* JADX INFO: renamed from: i */
    public VImage f5250i;

    /* JADX INFO: renamed from: j */
    public VText f5251j;

    /* JADX INFO: renamed from: k */
    public TextView f5252k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f5253l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f5254m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f5255n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f5256o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f5257p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f5258q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f5259r;

    /* JADX INFO: renamed from: s */
    public VImage f5260s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f5261t;

    /* JADX INFO: renamed from: u */
    public VText f5262u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f5263v;

    /* JADX INFO: renamed from: w */
    public VText f5264w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f5265x;

    /* JADX INFO: renamed from: y */
    public VText f5266y;

    /* JADX INFO: renamed from: z */
    public CommonMedalView f5267z;

    public LiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6583c(View view, View view2) {
        xdl0.M(view, true);
        xdl0.M(view2, false);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6584d(View view, View view2) {
        xdl0.M(view, true);
        xdl0.M(view2, true);
        view.setAlpha(0.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m6588h(View view) {
        p2t.m20015a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m6589i(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + gar.m13674b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + gar.m13674b(j2) + "人气";
        }
        return "落后" + gar.m13674b(j2) + "人气";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6590j(Long l2) {
        if (l2.longValue() <= 0 || l2.longValue() % 2 != 0) {
            m6604x(this.f5265x, this.f5264w);
        } else {
            m6604x(this.f5264w, this.f5265x);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6591k() {
        xdl0.M(this.f5249h, false);
        xdl0.M(this.f5262u, false);
        xdl0.M(this.f5253l, false);
        xdl0.M(this.f5254m, false);
        xdl0.M(this.f5255n, false);
        xdl0.M(this.f5256o, false);
        xdl0.M(this.f5257p, false);
        xdl0.M(this.f5258q, false);
        xdl0.M(this.f5259r, false);
        xdl0.M(this.f5252k, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m6592l(int i) {
        hcc0.e(getContext(), this.f5243b, this.f5244c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m */
    public final void m6593m(double d) {
        xdl0.M(this.f5262u, uvr.d().u0());
        this.f5262u.setTextColor(kvc0.a(h1c0.f11725E0));
        int i = uvr.d().s0() ? R$string.f2650C7 : R$string.f3077W5;
        fld0 fld0Var = fld0.f;
        if (((bgv) ypv.l(fld0Var)).n()) {
            i = R$string.f3022Td;
        }
        boolean zB = w8u.B();
        VText vText = this.f5262u;
        if (zB) {
            vText.setText(x8u.c(d) + kvc0.d(i));
            return;
        }
        vText.setText(x8u.c(d));
        int i2 = uvr.d().s0() ? i3c0.f12570M3 : i3c0.f12878n;
        if (((bgv) ypv.l(fld0Var)).n()) {
            i2 = i3c0.f12846k3;
        }
        xdl0.k(this.f5262u, getResources().getDrawable(i2));
        this.f5262u.setCompoundDrawablePadding(t100.c);
    }

    /* JADX INFO: renamed from: n */
    public final void m6594n(String str, int i) {
        xdl0.M(this.f5249h, true);
        this.f5250i.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f12673V5 : i3c0.f12651T5);
        this.f5249h.setBackground(fce.b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.d(5.0f)));
        this.f5251j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5251j.setText(String.valueOf(i));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o */
    public void m6595o(e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var) {
        m6596p(e30Var, mqvVar, gm0Var, "", false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6588h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m6596p(final e30<String> e30Var, mqv<BLiveLeaderBoards> mqvVar, gm0 gm0Var, String str, boolean z) {
        mkd0.z(this.f5240E);
        xdl0.M(this.f5263v, false);
        xdl0.M(this.f5239D, false);
        xdl0.M(this.f5254m, false);
        xdl0.M(this.f5243b, true);
        xdl0.M(this.f5244c, true);
        xdl0.M(this.f5236A, !TextUtils.isEmpty(str));
        xdl0.V(this.f5245d, t100.d(53.0f));
        xdl0.V(this.f5246e, t100.d(121.0f));
        xdl0.W(this.f5246e, t100.d(95.0f));
        xdl0.W(this.f5261t, t100.i);
        m6592l(((BLiveLeaderBoards) mqvVar.a).rank);
        final User user = ((BLiveLeaderBoards) mqvVar.a).user;
        if (user == null) {
            return;
        }
        agv.c(this.f5245d, t100.A, mqvVar, new w9j() { // from class: l.i2t
            public final Object call(Object obj) {
                return user.fp().profileSmall().formatted();
            }
        }, 1);
        this.f5247f.setText(user.name);
        if (d1t.a(mqvVar).d()) {
            m6591k();
            xdl0.M(this.f5260s, true);
        } else {
            xdl0.M(this.f5260s, false);
            m6594n(user.gender.toString(), user.age.intValue());
            xdl0.M(this.f5249h, (user.isHideAgeFromSVip() || ypv.k().b7() || ypv.k().b7()) ? false : true);
            Object obj = mqvVar.a;
            if (((BLiveLeaderBoards) obj).liveUserLevel == null || ((BLiveLeaderBoards) obj).liveUserLevel.grade <= 0) {
                xdl0.M(this.f5253l, false);
            } else {
                m6602v(((BLiveLeaderBoards) obj).liveUserLevel);
            }
            m6599s(user, gm0Var);
        }
        m6593m(((BLiveLeaderBoards) mqvVar.a).amount);
        m6603w(str, (BLiveLeaderBoards) mqvVar.a, z);
        if (e30Var != null) {
            setOnClickListener(new View.OnClickListener() { // from class: l.j2t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(((DbObject) user).id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6597q(boolean z, Act act, mqv<BLiveLeaderBoards> mqvVar, BLiveLoveLeaderboard bLiveLoveLeaderboard) {
        mkd0.z(this.f5240E);
        FrameLayout frameLayout = this.f5263v;
        if (!z) {
            xdl0.M(frameLayout, false);
            xdl0.M(this.f5236A, false);
            return;
        }
        xdl0.M(frameLayout, true);
        xdl0.M(this.f5236A, false);
        double d = ((BLiveLeaderBoards) mqvVar.a).amount;
        double d2 = bLiveLoveLeaderboard.baseAmount;
        BLiveMedal bLiveMedalT = ((ggv) ypv.l(fld0.c)).t(bLiveLoveLeaderboard.medalId + "", "live", "");
        boolean zM24291b = w220.m24291b();
        if (bLiveMedalT != null) {
            this.f5267z.setBackground(null);
            agv.j(this.f5267z, bLiveMedalT.getStaticUrl(), bLiveMedalT.getDynamicUrl());
        }
        this.f5264w.setAlpha(1.0f);
        this.f5264w.setTranslationY(0.0f);
        xdl0.M(this.f5264w, true);
        this.f5265x.setAlpha(1.0f);
        this.f5265x.setTranslationY(0.0f);
        xdl0.M(this.f5265x, false);
        if (d < d2) {
            VText vText = this.f5264w;
            vText.setText("差" + ((int) (d2 - ((double) ((int) d)))) + "人气荣登宠爱榜");
            this.f5266y.setText("荣登宠爱榜得");
            xdl0.M(this.f5264w, true);
            xdl0.M(this.f5265x, false);
            if (!zM24291b) {
                this.f5240E = act.duringCreated(c.interval(3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.m2t
                    public final void call(Object obj) {
                        this.f15221a.m6590j((Long) obj);
                    }
                }));
            }
        } else if (zM24291b) {
            this.f5264w.setText("恭喜荣登宠爱榜");
            xdl0.M(this.f5264w, true);
            xdl0.M(this.f5265x, false);
        } else {
            this.f5266y.setText("荣登宠爱榜,已得");
            xdl0.M(this.f5265x, true);
            xdl0.M(this.f5264w, false);
        }
        xdl0.W(this.f5246e, t100.d(Math.max(this.f5264w.getText().length(), this.f5266y.getText().length() + 4) * 12));
    }

    /* JADX INFO: renamed from: r */
    public void m6598r(boolean z) {
        xdl0.M(this.f5239D, z);
    }

    /* JADX INFO: renamed from: s */
    public final void m6599s(@NonNull User user, @Nullable gm0 gm0Var) {
        xdl0.M(this.f5255n, true);
        xdl0.M(this.f5256o, true);
        xdl0.M(this.f5257p, true);
        if (this.f5241F == null) {
            w1t w1tVar = new w1t(false);
            this.f5241F = w1tVar;
            w1tVar.m24274E(gm0Var);
            this.f5241F.m24272C(xdl0.E(this));
        }
        this.f5241F.m24276l();
        boolean zB = vdt.b(2);
        w1t w1tVar2 = this.f5241F;
        if (zB) {
            w1tVar2.m24275k(getContext(), this.f5255n, this.f5256o, this.f5257p, this.f5258q, this.f5259r);
        } else {
            w1tVar2.m24275k(getContext(), this.f5255n, this.f5256o, this.f5257p, this.f5258q);
        }
        this.f5241F.m24288y(user);
    }

    /* JADX INFO: renamed from: t */
    public void m6600t(final e30<String> e30Var, mqv<BLiveMember> mqvVar, gm0 gm0Var, boolean z) {
        final User userH = mqvVar.h();
        if (userH == null) {
            return;
        }
        agv.c(this.f5245d, t100.D, mqvVar, new w9j() { // from class: l.k2t
            public final Object call(Object obj) {
                return userH.fp().profileSmall().formatted();
            }
        }, 1);
        boolean zD = d1t.a(mqvVar).d();
        VText vText = this.f5247f;
        if (zD) {
            vText.setText(d1t.a(mqvVar).a.name);
            m6591k();
            xdl0.M(this.f5260s, true);
        } else {
            vText.setText(userH.name);
            xdl0.M(this.f5260s, false);
            m6594n(userH.gender.toString(), userH.age.intValue());
            xdl0.M(this.f5249h, (userH.isHideAgeFromSVip() || ypv.k().b7()) ? false : true);
            m6601u(userH, z);
            Object obj = mqvVar.a;
            if (((BLiveMember) obj).liveUserLevel == null || ((BLiveMember) obj).liveUserLevel.grade <= 0 || z) {
                xdl0.M(this.f5253l, false);
            } else {
                m6602v(((BLiveMember) obj).liveUserLevel);
            }
            xdl0.M(this.f5254m, false);
            m6599s(userH, gm0Var);
            TextView textView = this.f5252k;
            if (z) {
                xdl0.M(textView, true);
                this.f5252k.setText(i0g0.j0(userH.profile.zodiac));
                this.f5252k.setBackground(fce.b(i0g0.l0(userH.profile.zodiac), t100.d(2.0f)));
            } else {
                xdl0.M(textView, false);
            }
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.l2t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(((DbObject) userH).id);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m6601u(User user, boolean z) {
        String str;
        xdl0.M(this.f5262u, true);
        String strP = i0g0.p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str = location.region.country;
            } else {
                str = location.region.city + " " + strP;
            }
            strP = str;
        }
        this.f5262u.setText(strP);
        xdl0.M(this.f5262u, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: v */
    public final void m6602v(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.M(this.f5253l, false);
        } else {
            xdl0.M(this.f5253l, true);
            sxj.c(bLiveUserLevel.backendUrl, this.f5253l, ney.m18698a(bLiveUserLevel.grade) ? sxj.b : sxj.a);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6603w(String str, BLiveLeaderBoards bLiveLeaderBoards, boolean z) {
        if (TextUtils.isEmpty(str)) {
            xdl0.M(this.f5236A, false);
            return;
        }
        if (!TextUtils.equals(str, "currentWeek")) {
            if (TextUtils.equals(str, "lastWeek")) {
                xdl0.M0(this.f5236A, false);
                return;
            }
            return;
        }
        if (z) {
            boolean zM24291b = w220.m24291b();
            RelativeLayout relativeLayout = this.f5236A;
            if (zM24291b) {
                xdl0.M(relativeLayout, false);
                this.f5262u.setText("神秘人身份无法上榜");
                this.f5262u.setTextColor(kvc0.a(h1c0.f11803l1));
                return;
            } else {
                xdl0.M(relativeLayout, true);
                xdl0.M(this.f5238C, false);
                this.f5237B.setText(m6589i(bLiveLeaderBoards.rank, (long) bLiveLeaderBoards.gap));
                this.f5237B.setTextColor(kvc0.a(h1c0.f11803l1));
                return;
            }
        }
        boolean z2 = bLiveLeaderBoards.isNewUser;
        VImage vImage = this.f5238C;
        if (z2) {
            xdl0.M(vImage, false);
            xdl0.H0(this.f5237B, "NEW");
            this.f5237B.setTextColor(Color.parseColor("#FF603D"));
            return;
        }
        xdl0.M(vImage, true);
        this.f5237B.setTextColor(kvc0.a(h1c0.f11803l1));
        VText vText = this.f5237B;
        StringBuilder sb = new StringBuilder("本周排名");
        int i = bLiveLeaderBoards.rankDiff;
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        xdl0.H0(vText, sb.toString());
        int i2 = bLiveLeaderBoards.rankDiff;
        if (i2 > 0) {
            xdl0.N(this.f5238C, i3c0.f12717Z5);
            return;
        }
        VImage vImage2 = this.f5238C;
        if (i2 < 0) {
            xdl0.N(vImage2, i3c0.f12695X5);
        } else {
            xdl0.N(vImage2, i3c0.f12706Y5);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6604x(final View view, final View view2) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int i = t100.i;
        Animator animatorZ = bt0.z(new Animator[]{bt0.p(view, "translationY", 0L, 500L, linearInterpolator, new float[]{i, 0.0f}), bt0.p(view2, "translationY", 0L, 500L, linearInterpolator, new float[]{0.0f, -i}), bt0.p(view, "alpha", 166L, 333L, linearInterpolator, new float[]{0.0f, 1.0f}), bt0.p(view2, "alpha", 0L, 333L, linearInterpolator, new float[]{1.0f, 0.0f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.n2t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m6584d(view, view2);
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.o2t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m6583c(view, view2);
            }
        });
        animatorZ.start();
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
