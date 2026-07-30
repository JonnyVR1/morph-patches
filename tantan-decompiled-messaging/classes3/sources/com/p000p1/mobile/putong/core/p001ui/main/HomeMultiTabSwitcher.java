package com.p000p1.mobile.putong.core.p001ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.main.HomeMultiTabSwitcher;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e16;
import l.g6a;
import l.gr9;
import l.hpd0;
import l.j760;
import l.jtk;
import l.mji0;
import l.nwi0;
import l.rvi0;
import l.rxg0;
import l.tpd0;
import l.u4c0;
import l.ua40;
import l.upa;
import l.va40;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import l.zz6;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HomeMultiTabSwitcher extends TitleSwitcher {

    /* JADX INFO: renamed from: p */
    public static String f232p = "PlayTogetherTitleBubbleKey";

    /* JADX INFO: renamed from: q */
    public static String f233q = "SupremePartnerTitleBubbleKey";

    /* JADX INFO: renamed from: r */
    public static String f234r = "OnlineZoneBubbleKey";

    /* JADX INFO: renamed from: s */
    public static String f235s = "PrivateCustomTitleBubbleKey";

    /* JADX INFO: renamed from: f */
    public final zpd0 f236f;

    /* JADX INFO: renamed from: g */
    public final tpd0 f237g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f238h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f239i;

    /* JADX INFO: renamed from: j */
    public final tpd0 f240j;

    /* JADX INFO: renamed from: k */
    public boolean f241k;

    /* JADX INFO: renamed from: l */
    public boolean f242l;

    /* JADX INFO: renamed from: m */
    public boolean f243m;

    /* JADX INFO: renamed from: n */
    public boolean f244n;

    /* JADX INFO: renamed from: o */
    public boolean f245o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$a */
    public static /* synthetic */ class C0022a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f246a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f246a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f246a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f246a[NewTanFragTag.PLAY_TOGETHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f246a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f246a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f246a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f246a[NewTanFragTag.YOUTH_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f246a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$b */
    public interface InterfaceC0023b {
    }

    public HomeMultiTabSwitcher(Context context) {
        super(context);
        this.f236f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f237g = new tpd0("love_buzz_show_count_" + CoreModule.H().userId(), 0);
        this.f238h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f239i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.H().userId(), Boolean.FALSE);
        this.f240j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.H().userId(), 0);
        this.f241k = false;
        this.f242l = false;
        this.f243m = false;
        this.f244n = false;
        this.f245o = false;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m366j(String str) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m367k(String str) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m368l(String str) {
    }

    /* JADX INFO: renamed from: A */
    public void m369A() {
        if (m383t()) {
            m386w();
        } else if (m382s()) {
            m385v();
        } else if (m384u()) {
            m387x();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m370B(boolean z) {
        View viewFindViewById;
        View viewM377n = m377n(NewTanFragTag.WEBVIEW_CONFIG);
        if (viewM377n == null || (viewFindViewById = viewM377n.findViewById(u4c0.qb)) == null) {
            return;
        }
        xdl0.M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: C */
    public void m371C(boolean z) {
        View viewFindViewById;
        View viewM377n = m377n(NewTanFragTag.YOUTH_VIP);
        if (viewM377n == null || (viewFindViewById = viewM377n.findViewById(u4c0.qb)) == null) {
            return;
        }
        this.f243m = z;
        xdl0.M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: D */
    public void m372D() {
        ImageView imageView;
        for (int i = 0; i < this.f251a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f251a.getTabAt(i);
            ua40 ua40VarB = va40.b(this.f255e);
            if (ua40VarB == null) {
                return;
            }
            Object tag = tabAt.getCustomView().getTag();
            if (!NewTanFragTag.HOME.equals(tag) || (imageView = (ImageView) tabAt.getCustomView().findViewById(u4c0.Dd)) == null) {
                AppCompatTextView appCompatTextView = (VText) tabAt.getCustomView().findViewById(u4c0.Cd);
                if (this.f255e.equals(tag)) {
                    mji0.o(appCompatTextView, ua40VarB.e);
                    appCompatTextView.setTextColor(getResources().getColor(ua40VarB.c));
                    if (NullChecker.a(ua40VarB.g)) {
                        appCompatTextView.setTypeface(ua40VarB.g);
                    }
                    if (NewTanFragTag.TOP_PICKS.equals(this.f255e)) {
                        tabAt.getCustomView().setAlpha(1.0f);
                    }
                } else {
                    mji0.o(appCompatTextView, ua40VarB.f);
                    appCompatTextView.setTextColor(getResources().getColor(ua40VarB.d));
                    if (NewTanFragTag.TOP_PICKS.equals(tag)) {
                        tabAt.getCustomView().setAlpha(0.3f);
                    }
                }
                if (upa.z()) {
                    appCompatTextView.setTextSize(20.0f);
                }
            } else if (this.f255e.equals(tag)) {
                imageView.setImageResource(x2c0.h8);
            } else {
                imageView.setImageResource(x2c0.i8);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.main.TitleSwitcher
    /* JADX INFO: renamed from: f */
    public void mo373f() {
        m379p();
        m378o();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.main.TitleSwitcher
    /* JADX INFO: renamed from: h */
    public void mo374h(NewTanFragTag newTanFragTag) {
        super.mo374h(newTanFragTag);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.main.TitleSwitcher
    /* JADX INFO: renamed from: i */
    public void mo375i(NewTanFragTag newTanFragTag) {
        super.mo375i(newTanFragTag);
        if (newTanFragTag == NewTanFragTag.TOP_PICKS) {
            nwi0.INSTANCE.e();
            return;
        }
        if (newTanFragTag == NewTanFragTag.PLAY_TOGETHER) {
            zvf0.x("e_suggest_offline_party", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.MOMENT_THEME_CARD) {
            zvf0.x("e_activity_momentcard", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.ALREADY_AUTH) {
            zvf0.A("e_suggest_verified_tab", "p_suggest_users_home_view", new j760[]{vwb.Y("from_top_tab", "verified")});
            return;
        }
        if (newTanFragTag == NewTanFragTag.WEBVIEW_CONFIG) {
            zvf0.A("e_choose", "p_suggest_users_home_view", new j760[]{vwb.Y("source", "homepage"), vwb.Y("title_name", upa.h0().title), vwb.Y("red_dot", rvi0.f() ? "1" : "0")});
            if (rvi0.f()) {
                zvf0.A("e_second_red_dot", "p_suggest_users_home_view", new j760[]{vwb.Y("tab_name", upa.h0().title)});
                return;
            }
            return;
        }
        if (newTanFragTag == NewTanFragTag.SUPREME_PARTNER) {
            zvf0.x("e_nearby_tab", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.YOUTH_VIP) {
            zvf0.x("e_youthvip_entrance", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.PRIVATE_CUSTOM) {
            zvf0.x("e_customized_tab", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m376m() {
        d.l().k(f235s);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final View m377n(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f251a.getTabCount(); i++) {
            if (NullChecker.a(this.f251a.getTabAt(i).getCustomView()) && newTanFragTag == this.f251a.getTabAt(i).getCustomView().getTag()) {
                return this.f251a.getTabAt(i).getCustomView();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m378o() {
        if (CoreModule.c.y2.E3() && CoreModule.c.y2.T3()) {
            m388y(true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.main.TitleSwitcher
    public void onTabSelected(TabLayout.Tab tab) {
        PicVerificationInfo picVerificationInfo;
        super.onTabSelected(tab);
        NewTanFragTag newTanFragTag = (NewTanFragTag) tab.getCustomView().getTag();
        va40.i(newTanFragTag);
        va40.h(getMeasuredWidth());
        m372D();
        boolean z = false;
        switch (C0022a.f246a[newTanFragTag.ordinal()]) {
            case 2:
                zvf0.r("e_activity_momentcard", "p_suggest_users_home_view");
                break;
            case 3:
                d.l().k(f232p);
                break;
            case 4:
                VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
                if (verificationCenterK4 != null && (picVerificationInfo = verificationCenterK4.picVerificationInfo) != null && TEnum.equals(picVerificationInfo.status, "verified")) {
                    z = true;
                }
                zvf0.u("e_suggest_verified_tab", "p_suggest_users_home_view", new j760[]{vwb.Y("from_top_tab", "verified"), vwb.Y("avatar_verified_status", Boolean.valueOf(z))});
                break;
            case 5:
                zvf0.u("e_choose", "p_suggest_users_home_view", new j760[]{vwb.Y("source", "homepage"), vwb.Y("title_name", upa.h0().title), vwb.Y("red_dot", rvi0.f() ? "1" : "0")});
                if (rvi0.f() && !rvi0.c()) {
                    zvf0.u("e_second_red_dot", "p_suggest_users_home_view", new j760[]{vwb.Y("tab_name", upa.h0().title)});
                    break;
                }
                break;
            case 6:
                CoreModule.c.f2.s3();
                m389z(false);
                m381r();
                m380q();
                zvf0.r("e_nearby_tab", "p_suggest_users_home_view");
                break;
            case 7:
                if (this.f243m) {
                    CoreModule.c.g2.o3();
                }
                m371C(false);
                zvf0.r("e_youthvip_entrance", "p_suggest_users_home_view");
                break;
            case 8:
                if (this.f245o) {
                    CoreModule.c.y2.a4();
                }
                rxg0.u();
                m388y(false);
                m376m();
                zvf0.r("e_customized_tab", "p_suggest_users_home_view");
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m379p() {
        if (g6a.z() && CoreModule.c.g2.l3() && !CoreModule.c.g2.m3()) {
            m371C(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m380q() {
        if (gr9.e()) {
            d.l().k(f234r);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m381r() {
        this.f239i.put(Boolean.TRUE);
        d.l().k(f233q);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m382s() {
        return gr9.e() && ((Integer) this.f240j.get()).intValue() < 3 && !this.f244n;
    }

    public void setTabShow(InterfaceC0023b interfaceC0023b) {
    }

    /* JADX INFO: renamed from: t */
    public boolean m383t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m384u() {
        return CoreModule.c.y2.E3() && !this.f242l && CoreModule.c.y2.r3();
    }

    /* JADX INFO: renamed from: v */
    public final void m385v() {
        View viewM377n = m377n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM377n == null) {
            return;
        }
        d.l().u(new a(getContext()).D(String.format("附近的%s上线啦!", zz6.u0() ? "他" : "她")).k(new int[]{e16.c(getContext(), w0c0.I)}).G(w0c0.N).t(true).J(13.0f).e(false).j(new a.c() { // from class: l.m8l
            /* JADX INFO: renamed from: a */
            public final void m6324a(String str) {
                HomeMultiTabSwitcher.m367k(str);
            }
        }).E(false).b(3000L).q(jtk.A | jtk.E), viewM377n, f234r);
        this.f244n = true;
        this.f240j.a(1);
    }

    /* JADX INFO: renamed from: w */
    public final void m386w() {
        View viewM377n = m377n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM377n == null) {
            return;
        }
        d.l().u(new a(getContext()).D("点击开启全新定制社交体验").k(new int[]{e16.c(getContext(), w0c0.I)}).G(w0c0.N).t(true).J(13.0f).e(false).j(new a.c() { // from class: l.n8l
            /* JADX INFO: renamed from: a */
            public final void m6528a(String str) {
                HomeMultiTabSwitcher.m368l(str);
            }
        }).E(false).b(3000L).q(jtk.A | jtk.E), viewM377n, f233q);
        this.f241k = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m387x() {
        View viewM377n = m377n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM377n == null) {
            return;
        }
        d.l().u(new a(getContext()).D("点击开启全新定制社交体验").k(new int[]{e16.c(getContext(), w0c0.I)}).G(w0c0.N).t(true).J(13.0f).e(false).j(new a.c() { // from class: l.o8l
            /* JADX INFO: renamed from: a */
            public final void m6597a(String str) {
                HomeMultiTabSwitcher.m366j(str);
            }
        }).E(false).b(3000L).q(jtk.A | jtk.E), viewM377n, f235s);
        this.f242l = true;
        CoreModule.c.y2.C3();
        zvf0.x("e_customized_bubble", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y */
    public void m388y(boolean z) {
        View viewFindViewById;
        View viewM377n = m377n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM377n == null || (viewFindViewById = viewM377n.findViewById(u4c0.qb)) == null) {
            return;
        }
        this.f245o = z;
        xdl0.M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: z */
    public void m389z(boolean z) {
        View viewFindViewById;
        View viewM377n = m377n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM377n == null || (viewFindViewById = viewM377n.findViewById(u4c0.qb)) == null) {
            return;
        }
        xdl0.M(viewFindViewById, z);
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f236f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f237g = new tpd0("love_buzz_show_count_" + CoreModule.H().userId(), 0);
        this.f238h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f239i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.H().userId(), Boolean.FALSE);
        this.f240j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.H().userId(), 0);
        this.f241k = false;
        this.f242l = false;
        this.f243m = false;
        this.f244n = false;
        this.f245o = false;
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f236f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f237g = new tpd0("love_buzz_show_count_" + CoreModule.H().userId(), 0);
        this.f238h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.H().userId(), -1L);
        this.f239i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.H().userId(), Boolean.FALSE);
        this.f240j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.H().userId(), 0);
        this.f241k = false;
        this.f242l = false;
        this.f243m = false;
        this.f244n = false;
        this.f245o = false;
    }
}
