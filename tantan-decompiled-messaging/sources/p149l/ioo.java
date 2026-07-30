package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.IntlNewUIFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterTagItem;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.data.Settings;
import java.util.Arrays;
import p147v.VImage;
import p147v.VListCell;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ioo implements s7m<eoo> {

    /* JADX INFO: renamed from: a */
    public VImage f114178a;

    /* JADX INFO: renamed from: b */
    public VText f114179b;

    /* JADX INFO: renamed from: c */
    public VText f114180c;

    /* JADX INFO: renamed from: d */
    public VScroll f114181d;

    /* JADX INFO: renamed from: e */
    public IntlNewUIFilterBaseSetting f114182e;

    /* JADX INFO: renamed from: f */
    public VText f114183f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f114184g;

    /* JADX INFO: renamed from: h */
    public TagContainerLayout f114185h;

    /* JADX INFO: renamed from: i */
    public VListCell f114186i;

    /* JADX INFO: renamed from: j */
    public Act f114187j;

    /* JADX INFO: renamed from: k */
    public eoo f114188k;

    /* JADX INFO: renamed from: l */
    public ja40 f114189l;

    /* JADX INFO: renamed from: l.ioo$a */
    public class C17590a implements w9j<NewFilterTagItem, Boolean> {
        public C17590a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || newFilterTagItem.isSelected() || !xma.m210071e4() || !xma.m210081j4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f80001a == 1) {
                CoreModule.m29935P().m94651a().mo33565pr(ioo.this.getAct(), "p_intl_swipe_setting,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m29935P().m94651a().mo33565pr(ioo.this.getAct(), "p_intl_swipe_setting,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.ioo$b */
    public class C17591b implements e30<NewFilterTagItem> {
        public C17591b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f80001a == 1) {
                zvf0.m220396r("e_intl_select_long_term_fun", "p_intl_swipe_setting");
            } else {
                zvf0.m220396r("e_intl_select_short_term_fun", "p_intl_swipe_setting");
            }
        }
    }

    public ioo(Act act) {
        this.f114187j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m137351m(View view) {
        this.f114188k.m117442D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m137352n(View view) {
        this.f114188k.m117454Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m137353p(View view) {
        if (!yij0.m214965u(this.f114186i) && xma.m210071e4() && xma.m210081j4()) {
            CoreModule.m29935P().m94651a().mo33565pr(getAct(), "p_intl_swipe_setting,e_intl_show_verified_switch,click", Privilege.intl_advanced_filter);
            return;
        }
        if (!yij0.m214965u(this.f114186i)) {
            zvf0.m220396r("e_intl_show_verified_switch", "p_intl_swipe_setting");
        }
        yij0.m214942T(this.f114186i);
    }

    /* JADX INFO: renamed from: r */
    private void m137354r() {
        boolean zMo33937ve = CoreModule.f17557o.m195057d().mo33937ve(CoreModule.f17545c.f19639e0.m169520na());
        VText vText = this.f114183f;
        if (zMo33937ve) {
            mqa.m155878a(vText, vText.getContext().getResources().getDrawable(e3c0.f89061S1));
        } else {
            mqa.m155878a(vText, vText.getContext().getResources().getDrawable(e3c0.f89058R1));
        }
        xdl0.m208329E0(this.f114178a, new View.OnClickListener() { // from class: l.foo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98593a.m137351m(view);
            }
        });
        xdl0.m208329E0(this.f114180c, new View.OnClickListener() { // from class: l.goo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103697a.m137352n(view);
            }
        });
        m137361l();
        this.f114186i.setOnClickListener(new View.OnClickListener() { // from class: l.hoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108835a.m137353p(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114187j;
    }

    /* JADX INFO: renamed from: d */
    public View m137355d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return joo.m142524b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public void m137356e(String str, String str2) {
        this.f114182e.m55402Z(str, str2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(eoo eooVar) {
        this.f114188k = eooVar;
    }

    /* JADX INFO: renamed from: i */
    public void m137358i(Settings settings) {
        this.f114182e.m55405c0(settings);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM137355d = m137355d(layoutInflater, viewGroup);
        m137354r();
        return viewM137355d;
    }

    /* JADX INFO: renamed from: j */
    public void m137359j(AdvancedSettings advancedSettings) {
        yij0.m214964t(this.f114186i, advancedSettings.realFace.booleanValue());
        this.f114189l.m127946g();
        for (ca40 ca40Var : this.f114189l.f117065g) {
            if (TextUtils.equals(ca40Var.f80004d, advancedSettings.intlFriendPurpose)) {
                this.f114189l.m127951o(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m137360k(Settings settings) {
        this.f114182e.m55411k0(this.f114187j, settings);
    }

    /* JADX INFO: renamed from: l */
    public final void m137361l() {
        ja40 ja40Var = new ja40();
        this.f114189l = ja40Var;
        ja40Var.m127949m(new C17590a());
        this.f114189l.m127950n(new C17591b());
        this.f114185h.setCanAdjustChildHeight(false);
        this.f114185h.setAdapter(this.f114189l);
        this.f114189l.m140687r(Arrays.asList(qne0.f155429i));
    }

    /* JADX INFO: renamed from: q */
    public void m137362q(AdvancedSettings advancedSettings) {
        NewFilterTagItem newFilterTagItemM127947i = this.f114189l.m127947i();
        advancedSettings.intlFriendPurpose = newFilterTagItemM127947i != null ? newFilterTagItemM127947i.getBindViewData().f80004d : "";
        advancedSettings.realFace = Boolean.valueOf(yij0.m214965u(this.f114186i));
    }

    /* JADX INFO: renamed from: s */
    public void m137363s(boolean z) {
        LinearLayout linearLayout = this.f114182e.f36094g;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m137364u(String str) {
        this.f114182e.m55413m0(str);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
