package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.IntlNewUIFilterBaseSetting;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterTagItem;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Settings;
import java.util.Arrays;
import l.e30;
import l.e3c0;
import l.joo;
import l.mqa;
import l.s7m;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VImage;
import v.VListCell;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ioo implements s7m<eoo> {

    /* JADX INFO: renamed from: a */
    public VImage f14593a;

    /* JADX INFO: renamed from: b */
    public VText f14594b;

    /* JADX INFO: renamed from: c */
    public VText f14595c;

    /* JADX INFO: renamed from: d */
    public VScroll f14596d;

    /* JADX INFO: renamed from: e */
    public IntlNewUIFilterBaseSetting f14597e;

    /* JADX INFO: renamed from: f */
    public VText f14598f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f14599g;

    /* JADX INFO: renamed from: h */
    public TagContainerLayout f14600h;

    /* JADX INFO: renamed from: i */
    public VListCell f14601i;

    /* JADX INFO: renamed from: j */
    public Act f14602j;

    /* JADX INFO: renamed from: k */
    public eoo f14603k;

    /* JADX INFO: renamed from: l */
    public ja40 f14604l;

    /* JADX INFO: renamed from: l.ioo$a */
    public class C0849a implements w9j<NewFilterTagItem, Boolean> {
        public C0849a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == 0 || newFilterTagItem.isSelected() || !xma.m27379e4() || !xma.m27389j4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f9552a == 1) {
                CoreModule.m1854P().m11706a().m5502pr(ioo.this.act(), "p_intl_swipe_setting,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m1854P().m11706a().m5502pr(ioo.this.act(), "p_intl_swipe_setting,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.ioo$b */
    public class C0850b implements e30<NewFilterTagItem> {
        public C0850b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == 0 || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f9552a == 1) {
                zvf0.r("e_intl_select_long_term_fun", "p_intl_swipe_setting");
            } else {
                zvf0.r("e_intl_select_short_term_fun", "p_intl_swipe_setting");
            }
        }
    }

    public ioo(Act act) {
        this.f14602j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m16753m(View view) {
        this.f14603k.m14734D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m16754n(View view) {
        this.f14603k.m14746Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m16755p(View view) {
        if (!yij0.u(this.f14601i) && xma.m27379e4() && xma.m27389j4()) {
            CoreModule.m1854P().m11706a().m5502pr(act(), "p_intl_swipe_setting,e_intl_show_verified_switch,click", Privilege.intl_advanced_filter);
            return;
        }
        if (!yij0.u(this.f14601i)) {
            zvf0.r("e_intl_show_verified_switch", "p_intl_swipe_setting");
        }
        yij0.T(this.f14601i);
    }

    /* JADX INFO: renamed from: r */
    private void m16756r() {
        boolean zM5874ve = CoreModule.f1546o.m25559d().m5874ve(CoreModule.f1534c.f3628e0.m21483na());
        VText vText = this.f14598f;
        if (zM5874ve) {
            mqa.a(vText, vText.getContext().getResources().getDrawable(e3c0.S1));
        } else {
            mqa.a(vText, vText.getContext().getResources().getDrawable(e3c0.R1));
        }
        xdl0.E0(this.f14593a, new View.OnClickListener() { // from class: l.foo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12823a.m16753m(view);
            }
        });
        xdl0.E0(this.f14595c, new View.OnClickListener() { // from class: l.goo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13419a.m16754n(view);
            }
        });
        m16765l();
        this.f14601i.setOnClickListener(new View.OnClickListener() { // from class: l.hoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13990a.m16755p(view);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public Context m16757C0() {
        return this.f14602j;
    }

    /* JADX INFO: renamed from: d */
    public View m16758d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return joo.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public void m16759e(String str, String str2) {
        this.f14597e.m8775Z(str, str2);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m16762i1(eoo eooVar) {
        this.f14603k = eooVar;
    }

    /* JADX INFO: renamed from: i */
    public void m16761i(Settings settings) {
        this.f14597e.m8778c0(settings);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16758d = m16758d(layoutInflater, viewGroup);
        m16756r();
        return viewM16758d;
    }

    /* JADX INFO: renamed from: j */
    public void m16763j(AdvancedSettings advancedSettings) {
        yij0.t(this.f14601i, advancedSettings.realFace.booleanValue());
        this.f14604l.m15984g();
        for (ca40 ca40Var : this.f14604l.f15083g) {
            if (TextUtils.equals(ca40Var.f9555d, advancedSettings.intlFriendPurpose)) {
                this.f14604l.m15989o(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16764k(Settings settings) {
        this.f14597e.m8784k0(this.f14602j, settings);
    }

    /* JADX INFO: renamed from: l */
    public final void m16765l() {
        ja40 ja40Var = new ja40();
        this.f14604l = ja40Var;
        ja40Var.m15987m(new C0849a());
        this.f14604l.m15988n(new C0850b());
        this.f14600h.setCanAdjustChildHeight(false);
        this.f14600h.setAdapter(this.f14604l);
        this.f14604l.m17409r(Arrays.asList(qne0.f19942i));
    }

    /* JADX INFO: renamed from: q */
    public void m16766q(AdvancedSettings advancedSettings) {
        NewFilterTagItem newFilterTagItemM15985i = this.f14604l.m15985i();
        advancedSettings.intlFriendPurpose = newFilterTagItemM15985i != null ? newFilterTagItemM15985i.getBindViewData().f9555d : "";
        advancedSettings.realFace = Boolean.valueOf(yij0.u(this.f14601i));
    }

    /* JADX INFO: renamed from: s */
    public void m16767s(boolean z) {
        LinearLayout linearLayout = this.f14597e.f5875g;
        if (linearLayout != null) {
            xdl0.M(linearLayout, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16768u(String str) {
        this.f14597e.m8786m0(str);
    }

    public void destroy() {
    }
}
