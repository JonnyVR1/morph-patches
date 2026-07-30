package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.IntlNewUIFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterTagItem;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.data.Settings;
import java.util.Arrays;
import p151v.VImage;
import p151v.VListCell;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class iqo implements iam<eqo> {

    /* JADX INFO: renamed from: a */
    public VImage f116426a;

    /* JADX INFO: renamed from: b */
    public VText f116427b;

    /* JADX INFO: renamed from: c */
    public VText f116428c;

    /* JADX INFO: renamed from: d */
    public VScroll f116429d;

    /* JADX INFO: renamed from: e */
    public IntlNewUIFilterBaseSetting f116430e;

    /* JADX INFO: renamed from: f */
    public VText f116431f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f116432g;

    /* JADX INFO: renamed from: h */
    public TagContainerLayout f116433h;

    /* JADX INFO: renamed from: i */
    public VListCell f116434i;

    /* JADX INFO: renamed from: j */
    public Act f116435j;

    /* JADX INFO: renamed from: k */
    public eqo f116436k;

    /* JADX INFO: renamed from: l */
    public xi40 f116437l;

    /* JADX INFO: renamed from: l.iqo$a */
    public class C17774a implements qcj<NewFilterTagItem, Boolean> {
        public C17774a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || newFilterTagItem.isSelected() || !joa.m146386f4() || !joa.m146396k4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f157798a == 1) {
                CoreModule.m30933P().m143405a().mo34568pr(iqo.this.getAct(), "p_intl_swipe_setting,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m30933P().m143405a().mo34568pr(iqo.this.getAct(), "p_intl_swipe_setting,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.iqo$b */
    public class C17775b implements y20<NewFilterTagItem> {
        public C17775b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f157798a == 1) {
                i4g0.m138520r("e_intl_select_long_term_fun", "p_intl_swipe_setting");
            } else {
                i4g0.m138520r("e_intl_select_short_term_fun", "p_intl_swipe_setting");
            }
        }
    }

    public iqo(Act act) {
        this.f116435j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m141685m(View view) {
        this.f116436k.m121976D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m141686n(View view) {
        this.f116436k.m121988Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m141687p(View view) {
        if (!bsj0.m106285u(this.f116434i) && joa.m146386f4() && joa.m146396k4()) {
            CoreModule.m30933P().m143405a().mo34568pr(getAct(), "p_intl_swipe_setting,e_intl_show_verified_switch,click", Privilege.intl_advanced_filter);
            return;
        }
        if (!bsj0.m106285u(this.f116434i)) {
            i4g0.m138520r("e_intl_show_verified_switch", "p_intl_swipe_setting");
        }
        bsj0.m106262T(this.f116434i);
    }

    /* JADX INFO: renamed from: r */
    private void m141688r() {
        boolean zMo34940ve = CoreModule.f18276o.m132214d().mo34940ve(CoreModule.f18264c.f20381e0.m116593na());
        VText vText = this.f116431f;
        if (zMo34940ve) {
            yra.m217164a(vText, vText.getContext().getResources().getDrawable(kbc0.f124824S1));
        } else {
            yra.m217164a(vText, vText.getContext().getResources().getDrawable(kbc0.f124821R1));
        }
        bnl0.m105509E0(this.f116426a, new View.OnClickListener() { // from class: l.fqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100319a.m141685m(view);
            }
        });
        bnl0.m105509E0(this.f116428c, new View.OnClickListener() { // from class: l.gqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105709a.m141686n(view);
            }
        });
        m141695l();
        this.f116434i.setOnClickListener(new View.OnClickListener() { // from class: l.hqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111158a.m141687p(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116435j;
    }

    /* JADX INFO: renamed from: d */
    public View m141689d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jqo.m146618b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public void m141690e(String str, String str2) {
        this.f116430e.m56585Z(str, str2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eqo eqoVar) {
        this.f116436k = eqoVar;
    }

    /* JADX INFO: renamed from: i */
    public void m141692i(Settings settings) {
        this.f116430e.m56588c0(settings);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM141689d = m141689d(layoutInflater, viewGroup);
        m141688r();
        return viewM141689d;
    }

    /* JADX INFO: renamed from: j */
    public void m141693j(AdvancedSettings advancedSettings) {
        bsj0.m106284t(this.f116434i, advancedSettings.realFace.booleanValue());
        this.f116437l.m165611g();
        for (qi40 qi40Var : this.f116437l.f194432g) {
            if (TextUtils.equals(qi40Var.f157801d, advancedSettings.intlFriendPurpose)) {
                this.f116437l.m165618o(qi40Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m141694k(Settings settings) {
        this.f116430e.m56594k0(this.f116435j, settings);
    }

    /* JADX INFO: renamed from: l */
    public final void m141695l() {
        xi40 xi40Var = new xi40();
        this.f116437l = xi40Var;
        xi40Var.m165616m(new C17774a());
        this.f116437l.m165617n(new C17775b());
        this.f116433h.setCanAdjustChildHeight(false);
        this.f116433h.setAdapter(this.f116437l);
        this.f116437l.m211098r(Arrays.asList(xve0.f196393i));
    }

    /* JADX INFO: renamed from: q */
    public void m141696q(AdvancedSettings advancedSettings) {
        NewFilterTagItem newFilterTagItemM165613i = this.f116437l.m165613i();
        advancedSettings.intlFriendPurpose = newFilterTagItemM165613i != null ? newFilterTagItemM165613i.getBindViewData().f157801d : "";
        advancedSettings.realFace = Boolean.valueOf(bsj0.m106285u(this.f116434i));
    }

    /* JADX INFO: renamed from: s */
    public void m141697s(boolean z) {
        LinearLayout linearLayout = this.f116430e.f36942g;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, z);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m141698u(String str) {
        this.f116430e.m56596m0(str);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
