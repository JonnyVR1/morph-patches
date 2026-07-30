package com.p046p1.mobile.putong.core.p053ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.p053ui.main.HomeMultiTabSwitcher;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.e16;
import p149l.g6a;
import p149l.gr9;
import p149l.hpd0;
import p149l.jtk;
import p149l.mji0;
import p149l.nwi0;
import p149l.rvi0;
import p149l.rxg0;
import p149l.tpd0;
import p149l.u4c0;
import p149l.ua40;
import p149l.upa;
import p149l.va40;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zpd0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes3.dex */
public class HomeMultiTabSwitcher extends TitleSwitcher {

    /* JADX INFO: renamed from: p */
    public static String f30341p = "PlayTogetherTitleBubbleKey";

    /* JADX INFO: renamed from: q */
    public static String f30342q = "SupremePartnerTitleBubbleKey";

    /* JADX INFO: renamed from: r */
    public static String f30343r = "OnlineZoneBubbleKey";

    /* JADX INFO: renamed from: s */
    public static String f30344s = "PrivateCustomTitleBubbleKey";

    /* JADX INFO: renamed from: f */
    public final zpd0 f30345f;

    /* JADX INFO: renamed from: g */
    public final tpd0 f30346g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f30347h;

    /* JADX INFO: renamed from: i */
    public final hpd0 f30348i;

    /* JADX INFO: renamed from: j */
    public final tpd0 f30349j;

    /* JADX INFO: renamed from: k */
    public boolean f30350k;

    /* JADX INFO: renamed from: l */
    public boolean f30351l;

    /* JADX INFO: renamed from: m */
    public boolean f30352m;

    /* JADX INFO: renamed from: n */
    public boolean f30353n;

    /* JADX INFO: renamed from: o */
    public boolean f30354o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$a */
    public static /* synthetic */ class C8439a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30355a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f30355a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30355a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30355a[NewTanFragTag.PLAY_TOGETHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30355a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30355a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30355a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30355a[NewTanFragTag.YOUTH_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30355a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$b */
    public interface InterfaceC8440b {
    }

    public HomeMultiTabSwitcher(Context context) {
        super(context);
        this.f30345f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30346g = new tpd0("love_buzz_show_count_" + CoreModule.m29931H().userId(), 0);
        this.f30347h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30348i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f30349j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.m29931H().userId(), 0);
        this.f30350k = false;
        this.f30351l = false;
        this.f30352m = false;
        this.f30353n = false;
        this.f30354o = false;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m47333j(String str) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m47334k(String str) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m47335l(String str) {
    }

    /* JADX INFO: renamed from: A */
    public void m47336A() {
        if (m47350t()) {
            m47353w();
        } else if (m47349s()) {
            m47352v();
        } else if (m47351u()) {
            m47354x();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m47337B(boolean z) {
        View viewFindViewById;
        View viewM47344n = m47344n(NewTanFragTag.WEBVIEW_CONFIG);
        if (viewM47344n == null || (viewFindViewById = viewM47344n.findViewById(u4c0.f174434qb)) == null) {
            return;
        }
        xdl0.m208344M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: C */
    public void m47338C(boolean z) {
        View viewFindViewById;
        View viewM47344n = m47344n(NewTanFragTag.YOUTH_VIP);
        if (viewM47344n == null || (viewFindViewById = viewM47344n.findViewById(u4c0.f174434qb)) == null) {
            return;
        }
        this.f30352m = z;
        xdl0.m208344M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: D */
    public void m47339D() {
        ImageView imageView;
        for (int i = 0; i < this.f30360a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f30360a.getTabAt(i);
            ua40 ua40VarM197620b = va40.m197620b(this.f30364e);
            if (ua40VarM197620b == null) {
                return;
            }
            Object tag = tabAt.getCustomView().getTag();
            if (!NewTanFragTag.HOME.equals(tag) || (imageView = (ImageView) tabAt.getCustomView().findViewById(u4c0.f173781Dd)) == null) {
                VText vText = (VText) tabAt.getCustomView().findViewById(u4c0.f173764Cd);
                if (this.f30364e.equals(tag)) {
                    mji0.m154821o(vText, ua40VarM197620b.f175554e);
                    vText.setTextColor(getResources().getColor(ua40VarM197620b.f175552c));
                    if (NullChecker.m81303a(ua40VarM197620b.f175556g)) {
                        vText.setTypeface(ua40VarM197620b.f175556g);
                    }
                    if (NewTanFragTag.TOP_PICKS.equals(this.f30364e)) {
                        tabAt.getCustomView().setAlpha(1.0f);
                    }
                } else {
                    mji0.m154821o(vText, ua40VarM197620b.f175555f);
                    vText.setTextColor(getResources().getColor(ua40VarM197620b.f175553d));
                    if (NewTanFragTag.TOP_PICKS.equals(tag)) {
                        tabAt.getCustomView().setAlpha(0.3f);
                    }
                }
                if (upa.m194847z()) {
                    vText.setTextSize(20.0f);
                }
            } else if (this.f30364e.equals(tag)) {
                imageView.setImageResource(x2c0.f190197h8);
            } else {
                imageView.setImageResource(x2c0.f190229i8);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher
    /* JADX INFO: renamed from: f */
    public void mo47340f() {
        m47346p();
        m47345o();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher
    /* JADX INFO: renamed from: h */
    public void mo47341h(NewTanFragTag newTanFragTag) {
        super.mo47341h(newTanFragTag);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher
    /* JADX INFO: renamed from: i */
    public void mo47342i(NewTanFragTag newTanFragTag) {
        super.mo47342i(newTanFragTag);
        if (newTanFragTag == NewTanFragTag.TOP_PICKS) {
            nwi0.INSTANCE.m161872e();
            return;
        }
        if (newTanFragTag == NewTanFragTag.PLAY_TOGETHER) {
            zvf0.m220402x("e_suggest_offline_party", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.MOMENT_THEME_CARD) {
            zvf0.m220402x("e_activity_momentcard", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.ALREADY_AUTH) {
            zvf0.m220368A("e_suggest_verified_tab", "p_suggest_users_home_view", vwb.m200311Y("from_top_tab", "verified"));
            return;
        }
        if (newTanFragTag == NewTanFragTag.WEBVIEW_CONFIG) {
            zvf0.m220368A("e_choose", "p_suggest_users_home_view", vwb.m200311Y("source", "homepage"), vwb.m200311Y("title_name", upa.m194758h0().title), vwb.m200311Y("red_dot", rvi0.m181295f() ? "1" : "0"));
            if (rvi0.m181295f()) {
                zvf0.m220368A("e_second_red_dot", "p_suggest_users_home_view", vwb.m200311Y("tab_name", upa.m194758h0().title));
                return;
            }
            return;
        }
        if (newTanFragTag == NewTanFragTag.SUPREME_PARTNER) {
            zvf0.m220402x("e_nearby_tab", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.YOUTH_VIP) {
            zvf0.m220402x("e_youthvip_entrance", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.PRIVATE_CUSTOM) {
            zvf0.m220402x("e_customized_tab", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m47343m() {
        C4348d.m20896l().m20900k(f30344s);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final View m47344n(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f30360a.getTabCount(); i++) {
            if (NullChecker.m81303a(this.f30360a.getTabAt(i).getCustomView()) && newTanFragTag == this.f30360a.getTabAt(i).getCustomView().getTag()) {
                return this.f30360a.getTabAt(i).getCustomView();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m47345o() {
        if (CoreModule.f17545c.f19701y2.m155330E3() && CoreModule.f17545c.f19701y2.m155345T3()) {
            m47355y(true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        PicVerificationInfo picVerificationInfo;
        super.onTabSelected(tab);
        NewTanFragTag newTanFragTag = (NewTanFragTag) tab.getCustomView().getTag();
        va40.m197627i(newTanFragTag);
        va40.m197626h(getMeasuredWidth());
        m47339D();
        boolean z = false;
        switch (C8439a.f30355a[newTanFragTag.ordinal()]) {
            case 2:
                zvf0.m220396r("e_activity_momentcard", "p_suggest_users_home_view");
                break;
            case 3:
                C4348d.m20896l().m20900k(f30341p);
                break;
            case 4:
                VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
                if (verificationCenterM31612k4 != null && (picVerificationInfo = verificationCenterM31612k4.picVerificationInfo) != null && TEnum.equals(picVerificationInfo.status, "verified")) {
                    z = true;
                }
                zvf0.m220399u("e_suggest_verified_tab", "p_suggest_users_home_view", vwb.m200311Y("from_top_tab", "verified"), vwb.m200311Y("avatar_verified_status", Boolean.valueOf(z)));
                break;
            case 5:
                zvf0.m220399u("e_choose", "p_suggest_users_home_view", vwb.m200311Y("source", "homepage"), vwb.m200311Y("title_name", upa.m194758h0().title), vwb.m200311Y("red_dot", rvi0.m181295f() ? "1" : "0"));
                if (rvi0.m181295f() && !rvi0.m181292c()) {
                    zvf0.m220399u("e_second_red_dot", "p_suggest_users_home_view", vwb.m200311Y("tab_name", upa.m194758h0().title));
                    break;
                }
                break;
            case 6:
                CoreModule.f17545c.f19644f2.m148611s3();
                m47356z(false);
                m47348r();
                m47347q();
                zvf0.m220396r("e_nearby_tab", "p_suggest_users_home_view");
                break;
            case 7:
                if (this.f30352m) {
                    CoreModule.f17545c.f19647g2.m122582o3();
                }
                m47338C(false);
                zvf0.m220396r("e_youthvip_entrance", "p_suggest_users_home_view");
                break;
            case 8:
                if (this.f30354o) {
                    CoreModule.f17545c.f19701y2.m155352a4();
                }
                rxg0.m181577u();
                m47355y(false);
                m47343m();
                zvf0.m220396r("e_customized_tab", "p_suggest_users_home_view");
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m47346p() {
        if (g6a.m124577z() && CoreModule.f17545c.f19647g2.m122579l3() && !CoreModule.f17545c.f19647g2.m122580m3()) {
            m47338C(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m47347q() {
        if (gr9.m127680e()) {
            C4348d.m20896l().m20900k(f30343r);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m47348r() {
        this.f30348i.put(Boolean.TRUE);
        C4348d.m20896l().m20900k(f30342q);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m47349s() {
        return gr9.m127680e() && this.f30349j.get().intValue() < 3 && !this.f30353n;
    }

    public void setTabShow(InterfaceC8440b interfaceC8440b) {
    }

    /* JADX INFO: renamed from: t */
    public boolean m47350t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m47351u() {
        return CoreModule.f17545c.f19701y2.m155330E3() && !this.f30351l && CoreModule.f17545c.f19701y2.m155355r3();
    }

    /* JADX INFO: renamed from: v */
    public final void m47352v() {
        View viewM47344n = m47344n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM47344n == null) {
            return;
        }
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D(String.format("附近的%s上线啦!", zz6.m221004u0() ? "他" : "她")).m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(13.0f).m20864e(false).m20869j(new C4345a.c() { // from class: l.m8l
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                HomeMultiTabSwitcher.m47334k(str);
            }
        }).m20850E(false).m20861b(3000L).m20875q(jtk.f119614A | jtk.f119618E), viewM47344n, f30343r);
        this.f30353n = true;
        this.f30349j.m189988a(1);
    }

    /* JADX INFO: renamed from: w */
    public final void m47353w() {
        View viewM47344n = m47344n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM47344n == null) {
            return;
        }
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D("点击开启全新定制社交体验").m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(13.0f).m20864e(false).m20869j(new C4345a.c() { // from class: l.n8l
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                HomeMultiTabSwitcher.m47335l(str);
            }
        }).m20850E(false).m20861b(3000L).m20875q(jtk.f119614A | jtk.f119618E), viewM47344n, f30342q);
        this.f30350k = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m47354x() {
        View viewM47344n = m47344n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM47344n == null) {
            return;
        }
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D("点击开启全新定制社交体验").m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(13.0f).m20864e(false).m20869j(new C4345a.c() { // from class: l.o8l
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                HomeMultiTabSwitcher.m47333j(str);
            }
        }).m20850E(false).m20861b(3000L).m20875q(jtk.f119614A | jtk.f119618E), viewM47344n, f30344s);
        this.f30351l = true;
        CoreModule.f17545c.f19701y2.m155328C3();
        zvf0.m220402x("e_customized_bubble", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y */
    public void m47355y(boolean z) {
        View viewFindViewById;
        View viewM47344n = m47344n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM47344n == null || (viewFindViewById = viewM47344n.findViewById(u4c0.f174434qb)) == null) {
            return;
        }
        this.f30354o = z;
        xdl0.m208344M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: z */
    public void m47356z(boolean z) {
        View viewFindViewById;
        View viewM47344n = m47344n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM47344n == null || (viewFindViewById = viewM47344n.findViewById(u4c0.f174434qb)) == null) {
            return;
        }
        xdl0.m208344M(viewFindViewById, z);
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30345f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30346g = new tpd0("love_buzz_show_count_" + CoreModule.m29931H().userId(), 0);
        this.f30347h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30348i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f30349j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.m29931H().userId(), 0);
        this.f30350k = false;
        this.f30351l = false;
        this.f30352m = false;
        this.f30353n = false;
        this.f30354o = false;
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30345f = new zpd0("last_play_together_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30346g = new tpd0("love_buzz_show_count_" + CoreModule.m29931H().userId(), 0);
        this.f30347h = new zpd0("last_love_buzz_title_guide_show_time_" + CoreModule.m29931H().userId(), -1L);
        this.f30348i = new hpd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f30349j = new tpd0("online_zone_guide_tips_show_time_" + CoreModule.m29931H().userId(), 0);
        this.f30350k = false;
        this.f30351l = false;
        this.f30352m = false;
        this.f30353n = false;
        this.f30354o = false;
    }
}
