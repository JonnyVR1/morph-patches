package com.p051p1.mobile.putong.core.p058ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.p058ui.main.HomeMultiTabSwitcher;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.byd0;
import p153l.c17;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.ij40;
import p153l.j26;
import p153l.jj40;
import p153l.jxd0;
import p153l.jyb;
import p153l.msi0;
import p153l.r5j0;
import p153l.rs9;
import p153l.s7a;
import p153l.v4j0;
import p153l.vxd0;
import p153l.z5h0;
import p153l.zvk;

/* JADX INFO: loaded from: classes3.dex */
public class HomeMultiTabSwitcher extends TitleSwitcher {

    /* JADX INFO: renamed from: p */
    public static String f31189p = "PlayTogetherTitleBubbleKey";

    /* JADX INFO: renamed from: q */
    public static String f31190q = "SupremePartnerTitleBubbleKey";

    /* JADX INFO: renamed from: r */
    public static String f31191r = "OnlineZoneBubbleKey";

    /* JADX INFO: renamed from: s */
    public static String f31192s = "PrivateCustomTitleBubbleKey";

    /* JADX INFO: renamed from: f */
    public final byd0 f31193f;

    /* JADX INFO: renamed from: g */
    public final vxd0 f31194g;

    /* JADX INFO: renamed from: h */
    public final byd0 f31195h;

    /* JADX INFO: renamed from: i */
    public final jxd0 f31196i;

    /* JADX INFO: renamed from: j */
    public final vxd0 f31197j;

    /* JADX INFO: renamed from: k */
    public boolean f31198k;

    /* JADX INFO: renamed from: l */
    public boolean f31199l;

    /* JADX INFO: renamed from: m */
    public boolean f31200m;

    /* JADX INFO: renamed from: n */
    public boolean f31201n;

    /* JADX INFO: renamed from: o */
    public boolean f31202o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$a */
    public static /* synthetic */ class C8602a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31203a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f31203a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31203a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31203a[NewTanFragTag.PLAY_TOGETHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31203a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31203a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31203a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31203a[NewTanFragTag.YOUTH_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31203a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher$b */
    public interface InterfaceC8603b {
    }

    public HomeMultiTabSwitcher(Context context) {
        super(context);
        this.f31193f = new byd0("last_play_together_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31194g = new vxd0("love_buzz_show_count_" + CoreModule.m30929H().userId(), 0);
        this.f31195h = new byd0("last_love_buzz_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31196i = new jxd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f31197j = new vxd0("online_zone_guide_tips_show_time_" + CoreModule.m30929H().userId(), 0);
        this.f31198k = false;
        this.f31199l = false;
        this.f31200m = false;
        this.f31201n = false;
        this.f31202o = false;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m48516j(String str) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m48517k(String str) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m48518l(String str) {
    }

    /* JADX INFO: renamed from: A */
    public void m48519A() {
        if (m48533t()) {
            m48536w();
        } else if (m48532s()) {
            m48535v();
        } else if (m48534u()) {
            m48537x();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m48520B(boolean z) {
        View viewFindViewById;
        View viewM48527n = m48527n(NewTanFragTag.WEBVIEW_CONFIG);
        if (viewM48527n == null || (viewFindViewById = viewM48527n.findViewById(adc0.f70559sb)) == null) {
            return;
        }
        bnl0.m105524M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: C */
    public void m48521C(boolean z) {
        View viewFindViewById;
        View viewM48527n = m48527n(NewTanFragTag.YOUTH_VIP);
        if (viewM48527n == null || (viewFindViewById = viewM48527n.findViewById(adc0.f70559sb)) == null) {
            return;
        }
        this.f31200m = z;
        bnl0.m105524M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: D */
    public void m48522D() {
        ImageView imageView;
        for (int i = 0; i < this.f31208a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f31208a.getTabAt(i);
            ij40 ij40VarM144999b = jj40.m144999b(this.f31212e);
            if (ij40VarM144999b == null) {
                return;
            }
            Object tag = tabAt.getCustomView().getTag();
            if (!NewTanFragTag.HOME.equals(tag) || (imageView = (ImageView) tabAt.getCustomView().findViewById(adc0.f69903Fd)) == null) {
                VText vText = (VText) tabAt.getCustomView().findViewById(adc0.f69886Ed);
                if (this.f31212e.equals(tag)) {
                    msi0.m159817o(vText, ij40VarM144999b.f115176e);
                    vText.setTextColor(getResources().getColor(ij40VarM144999b.f115174c));
                    if (NullChecker.m82486a(ij40VarM144999b.f115178g)) {
                        vText.setTypeface(ij40VarM144999b.f115178g);
                    }
                    if (NewTanFragTag.TOP_PICKS.equals(this.f31212e)) {
                        tabAt.getCustomView().setAlpha(1.0f);
                    }
                } else {
                    msi0.m159817o(vText, ij40VarM144999b.f115177f);
                    vText.setTextColor(getResources().getColor(ij40VarM144999b.f115175d));
                    if (NewTanFragTag.TOP_PICKS.equals(tag)) {
                        tabAt.getCustomView().setAlpha(0.3f);
                    }
                }
                if (gra.m131778z()) {
                    vText.setTextSize(20.0f);
                }
            } else if (this.f31212e.equals(tag)) {
                imageView.setImageResource(dbc0.f87080i8);
            } else {
                imageView.setImageResource(dbc0.f87111j8);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher
    /* JADX INFO: renamed from: f */
    public void mo48523f() {
        m48529p();
        m48528o();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher
    /* JADX INFO: renamed from: h */
    public void mo48524h(NewTanFragTag newTanFragTag) {
        super.mo48524h(newTanFragTag);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher
    /* JADX INFO: renamed from: i */
    public void mo48525i(NewTanFragTag newTanFragTag) {
        super.mo48525i(newTanFragTag);
        if (newTanFragTag == NewTanFragTag.TOP_PICKS) {
            r5j0.INSTANCE.m179868e();
            return;
        }
        if (newTanFragTag == NewTanFragTag.PLAY_TOGETHER) {
            i4g0.m138526x("e_suggest_offline_party", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.MOMENT_THEME_CARD) {
            i4g0.m138526x("e_activity_momentcard", "p_suggest_users_home_view");
            return;
        }
        if (newTanFragTag == NewTanFragTag.ALREADY_AUTH) {
            i4g0.m138492A("e_suggest_verified_tab", "p_suggest_users_home_view", jyb.m147494Y("from_top_tab", "verified"));
            return;
        }
        if (newTanFragTag == NewTanFragTag.WEBVIEW_CONFIG) {
            i4g0.m138492A("e_choose", "p_suggest_users_home_view", jyb.m147494Y("source", "homepage"), jyb.m147494Y("title_name", gra.m131689h0().title), jyb.m147494Y("red_dot", v4j0.m199708f() ? "1" : "0"));
            if (v4j0.m199708f()) {
                i4g0.m138492A("e_second_red_dot", "p_suggest_users_home_view", jyb.m147494Y("tab_name", gra.m131689h0().title));
                return;
            }
            return;
        }
        if (newTanFragTag == NewTanFragTag.SUPREME_PARTNER) {
            i4g0.m138526x("e_nearby_tab", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.YOUTH_VIP) {
            i4g0.m138526x("e_youthvip_entrance", "p_suggest_users_home_view");
        } else if (newTanFragTag == NewTanFragTag.PRIVATE_CUSTOM) {
            i4g0.m138526x("e_customized_tab", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m48526m() {
        C4499d.m21895l().m21899k(f31192s);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final View m48527n(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f31208a.getTabCount(); i++) {
            if (NullChecker.m82486a(this.f31208a.getTabAt(i).getCustomView()) && newTanFragTag == this.f31208a.getTabAt(i).getCustomView().getTag()) {
                return this.f31208a.getTabAt(i).getCustomView();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m48528o() {
        if (CoreModule.f18264c.f20443y2.m216799E3() && CoreModule.f18264c.f20443y2.m216814T3()) {
            m48538y(true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        PicVerificationInfo picVerificationInfo;
        super.onTabSelected(tab);
        NewTanFragTag newTanFragTag = (NewTanFragTag) tab.getCustomView().getTag();
        jj40.m145006i(newTanFragTag);
        jj40.m145005h(getMeasuredWidth());
        m48522D();
        boolean z = false;
        switch (C8602a.f31203a[newTanFragTag.ordinal()]) {
            case 2:
                i4g0.m138520r("e_activity_momentcard", "p_suggest_users_home_view");
                break;
            case 3:
                C4499d.m21895l().m21899k(f31189p);
                break;
            case 4:
                VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
                if (verificationCenterM32615k4 != null && (picVerificationInfo = verificationCenterM32615k4.picVerificationInfo) != null && TEnum.equals(picVerificationInfo.status, "verified")) {
                    z = true;
                }
                i4g0.m138523u("e_suggest_verified_tab", "p_suggest_users_home_view", jyb.m147494Y("from_top_tab", "verified"), jyb.m147494Y("avatar_verified_status", Boolean.valueOf(z)));
                break;
            case 5:
                i4g0.m138523u("e_choose", "p_suggest_users_home_view", jyb.m147494Y("source", "homepage"), jyb.m147494Y("title_name", gra.m131689h0().title), jyb.m147494Y("red_dot", v4j0.m199708f() ? "1" : "0"));
                if (v4j0.m199708f() && !v4j0.m199705c()) {
                    i4g0.m138523u("e_second_red_dot", "p_suggest_users_home_view", jyb.m147494Y("tab_name", gra.m131689h0().title));
                    break;
                }
                break;
            case 6:
                CoreModule.f18264c.f20386f2.m214439s3();
                m48539z(false);
                m48531r();
                m48530q();
                i4g0.m138520r("e_nearby_tab", "p_suggest_users_home_view");
                break;
            case 7:
                if (this.f31200m) {
                    CoreModule.f18264c.f20389g2.m192272o3();
                }
                m48521C(false);
                i4g0.m138520r("e_youthvip_entrance", "p_suggest_users_home_view");
                break;
            case 8:
                if (this.f31202o) {
                    CoreModule.f18264c.f20443y2.m216821a4();
                }
                z5h0.m218680u();
                m48538y(false);
                m48526m();
                i4g0.m138520r("e_customized_tab", "p_suggest_users_home_view");
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m48529p() {
        if (s7a.m184997z() && CoreModule.f18264c.f20389g2.m192269l3() && !CoreModule.f18264c.f20389g2.m192270m3()) {
            m48521C(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m48530q() {
        if (rs9.m182936e()) {
            C4499d.m21895l().m21899k(f31191r);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m48531r() {
        this.f31196i.put(Boolean.TRUE);
        C4499d.m21895l().m21899k(f31190q);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m48532s() {
        return rs9.m182936e() && this.f31197j.get().intValue() < 3 && !this.f31201n;
    }

    public void setTabShow(InterfaceC8603b interfaceC8603b) {
    }

    /* JADX INFO: renamed from: t */
    public boolean m48533t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m48534u() {
        return CoreModule.f18264c.f20443y2.m216799E3() && !this.f31199l && CoreModule.f18264c.f20443y2.m216824r3();
    }

    /* JADX INFO: renamed from: v */
    public final void m48535v() {
        View viewM48527n = m48527n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM48527n == null) {
            return;
        }
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D(String.format("附近的%s上线啦!", c17.m107528u0() ? "他" : "她")).m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(13.0f).m21863e(false).m21868j(new C4496a.c() { // from class: l.cbl
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                HomeMultiTabSwitcher.m48517k(str);
            }
        }).m21849E(false).m21860b(3000L).m21874q(zvk.f206224A | zvk.f206228E), viewM48527n, f31191r);
        this.f31201n = true;
        this.f31197j.m203841a(1);
    }

    /* JADX INFO: renamed from: w */
    public final void m48536w() {
        View viewM48527n = m48527n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM48527n == null) {
            return;
        }
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D("点击开启全新定制社交体验").m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(13.0f).m21863e(false).m21868j(new C4496a.c() { // from class: l.dbl
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                HomeMultiTabSwitcher.m48518l(str);
            }
        }).m21849E(false).m21860b(3000L).m21874q(zvk.f206224A | zvk.f206228E), viewM48527n, f31190q);
        this.f31198k = true;
    }

    /* JADX INFO: renamed from: x */
    public final void m48537x() {
        View viewM48527n = m48527n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM48527n == null) {
            return;
        }
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D("点击开启全新定制社交体验").m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(13.0f).m21863e(false).m21868j(new C4496a.c() { // from class: l.ebl
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                HomeMultiTabSwitcher.m48516j(str);
            }
        }).m21849E(false).m21860b(3000L).m21874q(zvk.f206224A | zvk.f206228E), viewM48527n, f31192s);
        this.f31199l = true;
        CoreModule.f18264c.f20443y2.m216797C3();
        i4g0.m138526x("e_customized_bubble", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y */
    public void m48538y(boolean z) {
        View viewFindViewById;
        View viewM48527n = m48527n(NewTanFragTag.PRIVATE_CUSTOM);
        if (viewM48527n == null || (viewFindViewById = viewM48527n.findViewById(adc0.f70559sb)) == null) {
            return;
        }
        this.f31202o = z;
        bnl0.m105524M(viewFindViewById, z);
    }

    /* JADX INFO: renamed from: z */
    public void m48539z(boolean z) {
        View viewFindViewById;
        View viewM48527n = m48527n(NewTanFragTag.SUPREME_PARTNER);
        if (viewM48527n == null || (viewFindViewById = viewM48527n.findViewById(adc0.f70559sb)) == null) {
            return;
        }
        bnl0.m105524M(viewFindViewById, z);
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31193f = new byd0("last_play_together_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31194g = new vxd0("love_buzz_show_count_" + CoreModule.m30929H().userId(), 0);
        this.f31195h = new byd0("last_love_buzz_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31196i = new jxd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f31197j = new vxd0("online_zone_guide_tips_show_time_" + CoreModule.m30929H().userId(), 0);
        this.f31198k = false;
        this.f31199l = false;
        this.f31200m = false;
        this.f31201n = false;
        this.f31202o = false;
    }

    public HomeMultiTabSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31193f = new byd0("last_play_together_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31194g = new vxd0("love_buzz_show_count_" + CoreModule.m30929H().userId(), 0);
        this.f31195h = new byd0("last_love_buzz_title_guide_show_time_" + CoreModule.m30929H().userId(), -1L);
        this.f31196i = new jxd0("last_supreme_partner_customize_guide_tips_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f31197j = new vxd0("online_zone_guide_tips_show_time_" + CoreModule.m30929H().userId(), 0);
        this.f31198k = false;
        this.f31199l = false;
        this.f31200m = false;
        this.f31201n = false;
        this.f31202o = false;
    }
}
