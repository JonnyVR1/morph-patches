package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterAct;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class mo20 implements s7m<co20>, eth0.InterfaceC16677a {

    /* JADX INFO: renamed from: a */
    public VImage f134823a;

    /* JADX INFO: renamed from: b */
    public VText f134824b;

    /* JADX INFO: renamed from: c */
    public View f134825c;

    /* JADX INFO: renamed from: d */
    public VText f134826d;

    /* JADX INFO: renamed from: e */
    public VScroll f134827e;

    /* JADX INFO: renamed from: f */
    public NewUIAbFilterBaseSetting f134828f;

    /* JADX INFO: renamed from: g */
    public VText f134829g;

    /* JADX INFO: renamed from: h */
    public VLinear f134830h;

    /* JADX INFO: renamed from: i */
    public VText f134831i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f134832j;

    /* JADX INFO: renamed from: k */
    public TagContainerLayout f134833k;

    /* JADX INFO: renamed from: l */
    public VText f134834l;

    /* JADX INFO: renamed from: m */
    public VText f134835m;

    /* JADX INFO: renamed from: n */
    public VLinear f134836n;

    /* JADX INFO: renamed from: o */
    public NewFilterAct f134837o;

    /* JADX INFO: renamed from: p */
    public co20 f134838p;

    /* JADX INFO: renamed from: q */
    public br20 f134839q;

    /* JADX INFO: renamed from: r */
    public Comparator<NewFilterZodiacsItem> f134840r = new Comparator() { // from class: l.jo20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f130062a, ((NewFilterZodiacsItem) obj2).getBindViewData().f130062a);
        }
    };

    /* JADX INFO: renamed from: l.mo20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC18516a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f134841a;

        public ViewTreeObserverOnGlobalLayoutListenerC18516a(View view) {
            this.f134841a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = (this.f134841a.getRight() + this.f134841a.getLeft()) / 2;
            float top = this.f134841a.getTop() + t100.m186890d(17.0f);
            mo20.this.f134834l.setX(right);
            mo20.this.f134834l.setY(top);
            xdl0.m208345M0(mo20.this.f134834l, true);
            this.f134841a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public mo20(NewFilterAct newFilterAct) {
        this.f134837o = newFilterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m155586B(View view) {
        this.f134837o.lambda$debugItems$19();
        this.f134838p.m107925k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m155587C(View view) {
        this.f134837o.lambda$debugItems$19();
        this.f134838p.m107925k1();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m155589d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m155594k(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m155597r() {
        xdl0.m208329E0(this.f134823a, new View.OnClickListener() { // from class: l.ho20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108770a.m155586B(view);
            }
        });
        xdl0.m208329E0(this.f134826d, new View.OnClickListener() { // from class: l.io20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114097a.m155587C(view);
            }
        });
        m155598A();
        VText vText = this.f134826d;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f134824b.setTypeface(this.f134826d.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: A */
    public final void m155598A() {
        br20 br20Var = new br20();
        this.f134839q = br20Var;
        br20Var.m118106l(this);
        this.f134833k.setCanAdjustChildHeight(false);
        this.f134833k.setIsSquare(true);
        this.f134833k.setAdapter(this.f134839q);
        this.f134839q.m103442p(Arrays.asList(qne0.f155425e));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134837o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m155599E() {
        this.f134827e.scrollTo(0, this.f134829g.getTop());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m155600F() {
        this.f134827e.scrollTo(0, this.f134835m.getTop());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m155601G(View view) {
        this.f134827e.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m155602H() {
        if (!CoreModule.f17545c.f19598Q1.m34742g3() || CoreModule.f17545c.f19598Q1.m34743h3()) {
            return;
        }
        CoreModule.f17545c.f19598Q1.m34747l3(true);
        new dd80.C16336a(this.f134837o).m110996y0("服务更新").m110991t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").m110958M(true).m110974c0("知道了", new Runnable() { // from class: l.ko20
            @Override // java.lang.Runnable
            public final void run() {
                mo20.m155589d();
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: I */
    public void m155603I(boolean z) {
        this.f134828f.m55545t0(z);
    }

    /* JADX INFO: renamed from: J */
    public void m155604J(int i) {
        if (i == 1) {
            m155614s(new Runnable() { // from class: l.eo20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92418a.m155599E();
                }
            });
            return;
        }
        if (i == 2) {
            m155614s(new Runnable() { // from class: l.fo20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98501a.m155600F();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f134828f.getLocationTitle().getParent();
            if (NullChecker.m81303a(view)) {
                m155614s(new Runnable() { // from class: l.go20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f103648a.m155601G(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m155605K(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM118103h = this.f134839q.m118103h();
        Collections.sort(listM118103h, this.f134840r);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM118103h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f130063b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f130064c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f130063b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m155606L(HiddenNearByView hiddenNearByView) {
        this.f134828f.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: M */
    public void m155607M(j760<List<ProfileZodiac>, ProfileZodiac> j760Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : j760Var.f116564a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f134839q.m118104j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f130063b = profileZodiac;
            }
        }
        this.f134839q.m118107m(arrayList);
        ProfileZodiac profileZodiac2 = j760Var.f116565b;
        if (!NullChecker.m81303a(profileZodiac2)) {
            xdl0.m208345M0(this.f134834l, false);
            return;
        }
        boolean zM155879b = mqa.m155879b();
        VText vText = this.f134834l;
        if (zM155879b) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f134839q.m118104j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18516a(newFilterZodiacsItem2));
    }

    /* JADX INFO: renamed from: N */
    public final void m155608N() {
        CoreModule.f17557o.m195057d().mo33850id(this.f134837o);
    }

    /* JADX INFO: renamed from: O */
    public void m155609O() {
        e51.m114743H(this.f134837o, new Runnable() { // from class: l.do20
            @Override // java.lang.Runnable
            public final void run() {
                this.f87125a.m155602H();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: P */
    public void m155610P(String str) {
        this.f134828f.m55539R0(str);
    }

    @Override // p149l.eth0.InterfaceC16677a
    /* JADX INFO: renamed from: a */
    public boolean mo118108a(View view) {
        if (this.f134838p.m107924h1() || xma.m210097y3()) {
            zvf0.m220399u("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.valueOf(!view.isSelected())));
            return false;
        }
        zvf0.m220399u("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.valueOf(view.isSelected())));
        m155608N();
        return true;
    }

    @Override // p149l.eth0.InterfaceC16677a
    /* JADX INFO: renamed from: b */
    public void mo118109b() {
        if (this.f134839q.m118103h().size() > 0) {
            zvf0.m220400v("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.TRUE));
        } else if (this.f134838p.m107924h1()) {
            zvf0.m220400v("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.FALSE));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM155611n = m155611n(layoutInflater, viewGroup);
        m155597r();
        return viewM155611n;
    }

    /* JADX INFO: renamed from: n */
    public View m155611n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return no20.m160400b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m155612p(String str, String str2) {
        this.f134828f.m55541l0(str, str2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(co20 co20Var) {
        this.f134838p = co20Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m155614s(final Runnable runnable) {
        e51.m114742G(new Runnable() { // from class: l.lo20
            @Override // java.lang.Runnable
            public final void run() {
                mo20.m155594k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m155615u() {
        return this.f134830h;
    }

    /* JADX INFO: renamed from: v */
    public View m155616v() {
        return this.f134836n;
    }

    /* JADX INFO: renamed from: w */
    public boolean m155617w() {
        return yij0.m214965u(this.f134828f.f36206c);
    }

    /* JADX INFO: renamed from: x */
    public void m155618x(AdvancedSettings advancedSettings) {
        m155607M(CoreModule.f17545c.f19564F0.m99253t3(advancedSettings));
    }

    /* JADX INFO: renamed from: y */
    public void m155619y(Settings settings) {
        this.f134828f.m55537O0(this.f134837o, settings, this.f134838p.m107921O0());
    }

    /* JADX INFO: renamed from: z */
    public void m155620z(Settings settings) {
        this.f134828f.m55546u0(this.f134837o, settings);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
