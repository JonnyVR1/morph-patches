package com.p051p1.mobile.putong.live.livingroom.common.member;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.civ;
import p153l.cm0;
import p153l.dhw;
import p153l.e3t;
import p153l.eb20;
import p153l.fo0;
import p153l.gt0;
import p153l.hiv;
import p153l.htd0;
import p153l.i0k;
import p153l.icr;
import p153l.jde;
import p153l.kcg0;
import p153l.kny;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.okc0;
import p153l.psd0;
import p153l.q4t;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.vxr;
import p153l.wft;
import p153l.x3t;
import p153l.xau;
import p153l.y20;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMemberItem extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public RelativeLayout f50042A;

    /* JADX INFO: renamed from: B */
    public VText f50043B;

    /* JADX INFO: renamed from: C */
    public VImage f50044C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f50045D;

    /* JADX INFO: renamed from: E */
    public kcg0 f50046E;

    /* JADX INFO: renamed from: F */
    public x3t f50047F;

    /* JADX INFO: renamed from: a */
    public LiveMemberItem f50048a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50049b;

    /* JADX INFO: renamed from: c */
    public VText f50050c;

    /* JADX INFO: renamed from: d */
    public CommonMaskAvatarView f50051d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f50052e;

    /* JADX INFO: renamed from: f */
    public VText f50053f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f50054g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f50055h;

    /* JADX INFO: renamed from: i */
    public VImage f50056i;

    /* JADX INFO: renamed from: j */
    public VText f50057j;

    /* JADX INFO: renamed from: k */
    public TextView f50058k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50059l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f50060m;

    /* JADX INFO: renamed from: n */
    public CommonMedalView f50061n;

    /* JADX INFO: renamed from: o */
    public CommonMedalView f50062o;

    /* JADX INFO: renamed from: p */
    public CommonMedalView f50063p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f50064q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f50065r;

    /* JADX INFO: renamed from: s */
    public VImage f50066s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f50067t;

    /* JADX INFO: renamed from: u */
    public VText f50068u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f50069v;

    /* JADX INFO: renamed from: w */
    public VText f50070w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f50071x;

    /* JADX INFO: renamed from: y */
    public VText f50072y;

    /* JADX INFO: renamed from: z */
    public CommonMedalView f50073z;

    public LiveMemberItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m74240c(View view, View view2) {
        bnl0.m105524M(view, true);
        bnl0.m105524M(view2, false);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m74241d(View view, View view2) {
        bnl0.m105524M(view, true);
        bnl0.m105524M(view2, true);
        view.setAlpha(0.0f);
        view2.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m74245h(View view) {
        q4t.m175257a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final String m74246i(long j, long j2) {
        if (j == -1) {
            return "上榜还需" + icr.m139459b(j2) + "人气";
        }
        if (j == 1) {
            return "领先" + icr.m139459b(j2) + "人气";
        }
        return "落后" + icr.m139459b(j2) + "人气";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74247j(Long l2) {
        if (l2.longValue() <= 0 || l2.longValue() % 2 != 0) {
            m74261x(this.f50071x, this.f50070w);
        } else {
            m74261x(this.f50070w, this.f50071x);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m74248k() {
        bnl0.m105524M(this.f50055h, false);
        bnl0.m105524M(this.f50068u, false);
        bnl0.m105524M(this.f50059l, false);
        bnl0.m105524M(this.f50060m, false);
        bnl0.m105524M(this.f50061n, false);
        bnl0.m105524M(this.f50062o, false);
        bnl0.m105524M(this.f50063p, false);
        bnl0.m105524M(this.f50064q, false);
        bnl0.m105524M(this.f50065r, false);
        bnl0.m105524M(this.f50058k, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m74249l(int i) {
        okc0.m168005e(getContext(), this.f50049b, this.f50050c, i);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m */
    public final void m74250m(double d) {
        bnl0.m105524M(this.f50068u, vxr.m203876d().m171026u0());
        this.f50068u.setTextColor(n3d0.m161277a(n9c0.f140766E0));
        int i = vxr.m203876d().m171022s0() ? R$string.f47456C7 : R$string.f47883W5;
        htd0<civ> htd0Var = htd0.f111524f;
        if (((civ) zrv.m221194l(htd0Var)).m109970n()) {
            i = R$string.f47828Td;
        }
        boolean zM209897B = xau.m209897B();
        VText vText = this.f50068u;
        if (zM209897B) {
            vText.setText(yau.m214935c(d) + n3d0.m161280d(i));
            return;
        }
        vText.setText(yau.m214935c(d));
        int i2 = vxr.m203876d().m171022s0() ? obc0.f146113M3 : obc0.f146421n;
        if (((civ) zrv.m221194l(htd0Var)).m109970n()) {
            i2 = obc0.f146389k3;
        }
        bnl0.m105563k(this.f50068u, getResources().getDrawable(i2));
        this.f50068u.setCompoundDrawablePadding(qa00.f156316c);
    }

    /* JADX INFO: renamed from: n */
    public final void m74251n(String str, int i) {
        bnl0.m105524M(this.f50055h, true);
        this.f50056i.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f50055h.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f50057j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f50057j.setText(String.valueOf(i));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o */
    public void m74252o(y20<String> y20Var, nsv<BLiveLeaderBoards> nsvVar, cm0 cm0Var) {
        m74253p(y20Var, nsvVar, cm0Var, "", false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74245h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m74253p(final y20<String> y20Var, nsv<BLiveLeaderBoards> nsvVar, cm0 cm0Var, String str, boolean z) {
        psd0.m173633z(this.f50046E);
        bnl0.m105524M(this.f50069v, false);
        bnl0.m105524M(this.f50045D, false);
        bnl0.m105524M(this.f50060m, false);
        bnl0.m105524M(this.f50049b, true);
        bnl0.m105524M(this.f50050c, true);
        bnl0.m105524M(this.f50042A, !TextUtils.isEmpty(str));
        bnl0.m105538V(this.f50051d, qa00.m175859d(53.0f));
        bnl0.m105538V(this.f50052e, qa00.m175859d(121.0f));
        bnl0.m105539W(this.f50052e, qa00.m175859d(95.0f));
        bnl0.m105539W(this.f50067t, qa00.f156322i);
        m74249l(nsvVar.f143542a.rank);
        final User user = nsvVar.f143542a.user;
        if (user == null) {
            return;
        }
        biv.m104518c(this.f50051d, qa00.f156288A, nsvVar, new qcj() { // from class: l.j4t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return user.m61308fp().profileSmall().formatted();
            }
        }, 1);
        this.f50053f.setText(user.name);
        if (e3t.m119319a(nsvVar).m119322d()) {
            m74248k();
            bnl0.m105524M(this.f50066s, true);
        } else {
            bnl0.m105524M(this.f50066s, false);
            m74251n(user.gender.toString(), user.age.intValue());
            bnl0.m105524M(this.f50055h, (user.isHideAgeFromSVip() || zrv.m221193k().m203589b7() || zrv.m221193k().m203589b7()) ? false : true);
            BLiveLeaderBoards bLiveLeaderBoards = nsvVar.f143542a;
            if (bLiveLeaderBoards.liveUserLevel == null || bLiveLeaderBoards.liveUserLevel.grade <= 0) {
                bnl0.m105524M(this.f50059l, false);
            } else {
                m74259v(bLiveLeaderBoards.liveUserLevel);
            }
            m74256s(user, cm0Var);
        }
        m74250m(nsvVar.f143542a.amount);
        m74260w(str, nsvVar.f143542a, z);
        if (y20Var != null) {
            setOnClickListener(new View.OnClickListener() { // from class: l.k4t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(user.f56859id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m74254q(boolean z, Act act, nsv<BLiveLeaderBoards> nsvVar, BLiveLoveLeaderboard bLiveLoveLeaderboard) {
        psd0.m173633z(this.f50046E);
        FrameLayout frameLayout = this.f50069v;
        if (!z) {
            bnl0.m105524M(frameLayout, false);
            bnl0.m105524M(this.f50042A, false);
            return;
        }
        bnl0.m105524M(frameLayout, true);
        bnl0.m105524M(this.f50042A, false);
        double d = nsvVar.f143542a.amount;
        double d2 = bLiveLoveLeaderboard.baseAmount;
        BLiveMedal bLiveMedalM135168t = ((hiv) zrv.m221194l(htd0.f111521c)).m135168t(bLiveLoveLeaderboard.medalId + "", "live", "");
        boolean zM120149b = eb20.m120149b();
        if (bLiveMedalM135168t != null) {
            this.f50073z.setBackground(null);
            biv.m104525j(this.f50073z, bLiveMedalM135168t.getStaticUrl(), bLiveMedalM135168t.getDynamicUrl());
        }
        this.f50070w.setAlpha(1.0f);
        this.f50070w.setTranslationY(0.0f);
        bnl0.m105524M(this.f50070w, true);
        this.f50071x.setAlpha(1.0f);
        this.f50071x.setTranslationY(0.0f);
        bnl0.m105524M(this.f50071x, false);
        if (d < d2) {
            VText vText = this.f50070w;
            vText.setText("差" + ((int) (d2 - ((double) ((int) d)))) + "人气荣登宠爱榜");
            this.f50072y.setText("荣登宠爱榜得");
            bnl0.m105524M(this.f50070w, true);
            bnl0.m105524M(this.f50071x, false);
            if (!zM120149b) {
                this.f50046E = act.duringCreated(C22421c.interval(3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.n4t
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f140255a.m74247j((Long) obj);
                    }
                }));
            }
        } else if (zM120149b) {
            this.f50070w.setText("恭喜荣登宠爱榜");
            bnl0.m105524M(this.f50070w, true);
            bnl0.m105524M(this.f50071x, false);
        } else {
            this.f50072y.setText("荣登宠爱榜,已得");
            bnl0.m105524M(this.f50071x, true);
            bnl0.m105524M(this.f50070w, false);
        }
        bnl0.m105539W(this.f50052e, qa00.m175859d(Math.max(this.f50070w.getText().length(), this.f50072y.getText().length() + 4) * 12));
    }

    /* JADX INFO: renamed from: r */
    public void m74255r(boolean z) {
        bnl0.m105524M(this.f50045D, z);
    }

    /* JADX INFO: renamed from: s */
    public final void m74256s(@NonNull User user, @Nullable cm0 cm0Var) {
        bnl0.m105524M(this.f50061n, true);
        bnl0.m105524M(this.f50062o, true);
        bnl0.m105524M(this.f50063p, true);
        if (this.f50047F == null) {
            x3t x3tVar = new x3t(false);
            this.f50047F = x3tVar;
            x3tVar.m209277E(cm0Var);
            this.f50047F.m209275C((Act) bnl0.m105508E(this));
        }
        this.f50047F.m209279l();
        boolean zM206159b = wft.m206159b(2);
        x3t x3tVar2 = this.f50047F;
        if (zM206159b) {
            x3tVar2.m209278k(getContext(), this.f50061n, this.f50062o, this.f50063p, this.f50064q, this.f50065r);
        } else {
            x3tVar2.m209278k(getContext(), this.f50061n, this.f50062o, this.f50063p, this.f50064q);
        }
        this.f50047F.m209291y(user);
    }

    /* JADX INFO: renamed from: t */
    public void m74257t(final y20<String> y20Var, nsv<BLiveMember> nsvVar, cm0 cm0Var, boolean z) {
        final User userM164643h = nsvVar.m164643h();
        if (userM164643h == null) {
            return;
        }
        biv.m104518c(this.f50051d, qa00.f156291D, nsvVar, new qcj() { // from class: l.l4t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return userM164643h.m61308fp().profileSmall().formatted();
            }
        }, 1);
        boolean zM119322d = e3t.m119319a(nsvVar).m119322d();
        VText vText = this.f50053f;
        if (zM119322d) {
            vText.setText(e3t.m119319a(nsvVar).f91997a.name);
            m74248k();
            bnl0.m105524M(this.f50066s, true);
        } else {
            vText.setText(userM164643h.name);
            bnl0.m105524M(this.f50066s, false);
            m74251n(userM164643h.gender.toString(), userM164643h.age.intValue());
            bnl0.m105524M(this.f50055h, (userM164643h.isHideAgeFromSVip() || zrv.m221193k().m203589b7()) ? false : true);
            m74258u(userM164643h, z);
            BLiveMember bLiveMember = nsvVar.f143542a;
            if (bLiveMember.liveUserLevel == null || bLiveMember.liveUserLevel.grade <= 0 || z) {
                bnl0.m105524M(this.f50059l, false);
            } else {
                m74259v(bLiveMember.liveUserLevel);
            }
            bnl0.m105524M(this.f50060m, false);
            m74256s(userM164643h, cm0Var);
            TextView textView = this.f50058k;
            if (z) {
                bnl0.m105524M(textView, true);
                this.f50058k.setText(q8g0.m175804j0(userM164643h.profile.zodiac));
                this.f50058k.setBackground(jde.m144406b(q8g0.m175806l0(userM164643h.profile.zodiac), qa00.m175859d(2.0f)));
            } else {
                bnl0.m105524M(textView, false);
            }
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.m4t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(userM164643h.f56859id);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m74258u(User user, boolean z) {
        String str;
        bnl0.m105524M(this.f50068u, true);
        String strM175811p = q8g0.m175811p(user.location.distance, true);
        if (z && !TextUtils.isEmpty(user.location.region.country)) {
            boolean zIsEmpty = TextUtils.isEmpty(user.location.region.city);
            Location location = user.location;
            if (zIsEmpty) {
                str = location.region.country;
            } else {
                str = location.region.city + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM175811p;
            }
            strM175811p = str;
        }
        this.f50068u.setText(strM175811p);
        bnl0.m105524M(this.f50068u, !user.isHideLocationFromSVip());
    }

    /* JADX INFO: renamed from: v */
    public final void m74259v(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f50059l, false);
        } else {
            bnl0.m105524M(this.f50059l, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f50059l, kny.m150553a(bLiveUserLevel.grade) ? i0k.f112379b : i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m74260w(String str, BLiveLeaderBoards bLiveLeaderBoards, boolean z) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f50042A, false);
            return;
        }
        if (!TextUtils.equals(str, "currentWeek")) {
            if (TextUtils.equals(str, "lastWeek")) {
                bnl0.m105525M0(this.f50042A, false);
                return;
            }
            return;
        }
        if (z) {
            boolean zM120149b = eb20.m120149b();
            RelativeLayout relativeLayout = this.f50042A;
            if (zM120149b) {
                bnl0.m105524M(relativeLayout, false);
                this.f50068u.setText("神秘人身份无法上榜");
                this.f50068u.setTextColor(n3d0.m161277a(n9c0.f140844l1));
                return;
            } else {
                bnl0.m105524M(relativeLayout, true);
                bnl0.m105524M(this.f50044C, false);
                this.f50043B.setText(m74246i(bLiveLeaderBoards.rank, (long) bLiveLeaderBoards.gap));
                this.f50043B.setTextColor(n3d0.m161277a(n9c0.f140844l1));
                return;
            }
        }
        boolean z2 = bLiveLeaderBoards.isNewUser;
        VImage vImage = this.f50044C;
        if (z2) {
            bnl0.m105524M(vImage, false);
            bnl0.m105515H0(this.f50043B, "NEW");
            this.f50043B.setTextColor(Color.parseColor("#FF603D"));
            return;
        }
        bnl0.m105524M(vImage, true);
        this.f50043B.setTextColor(n3d0.m161277a(n9c0.f140844l1));
        VText vText = this.f50043B;
        StringBuilder sb = new StringBuilder("本周排名");
        int i = bLiveLeaderBoards.rankDiff;
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        bnl0.m105515H0(vText, sb.toString());
        int i2 = bLiveLeaderBoards.rankDiff;
        if (i2 > 0) {
            bnl0.m105526N(this.f50044C, obc0.f146260Z5);
            return;
        }
        VImage vImage2 = this.f50044C;
        if (i2 < 0) {
            bnl0.m105526N(vImage2, obc0.f146238X5);
        } else {
            bnl0.m105526N(vImage2, obc0.f146249Y5);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m74261x(final View view, final View view2) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int i = qa00.f156322i;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(view, "translationY", 0L, 500L, linearInterpolator, i, 0.0f), gt0.m132170p(view2, "translationY", 0L, 500L, linearInterpolator, 0.0f, -i), gt0.m132170p(view, "alpha", 166L, 333L, linearInterpolator, 0.0f, 1.0f), gt0.m132170p(view2, "alpha", 0L, 333L, linearInterpolator, 1.0f, 0.0f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.o4t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m74241d(view, view2);
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.p4t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMemberItem.m74240c(view, view2);
            }
        });
        animatorM132180z.start();
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMemberItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
