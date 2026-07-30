package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wq20 implements s7m<lq20>, eth0.InterfaceC16677a {

    /* JADX INFO: renamed from: a */
    public VImage f187612a;

    /* JADX INFO: renamed from: b */
    public VText f187613b;

    /* JADX INFO: renamed from: c */
    public VText f187614c;

    /* JADX INFO: renamed from: d */
    public VScroll f187615d;

    /* JADX INFO: renamed from: e */
    public NewFilterBaseSetting f187616e;

    /* JADX INFO: renamed from: f */
    public View f187617f;

    /* JADX INFO: renamed from: g */
    public VText f187618g;

    /* JADX INFO: renamed from: h */
    public VText f187619h;

    /* JADX INFO: renamed from: i */
    public VLinear f187620i;

    /* JADX INFO: renamed from: j */
    public VText f187621j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f187622k;

    /* JADX INFO: renamed from: l */
    public TagContainerLayout f187623l;

    /* JADX INFO: renamed from: m */
    public VText f187624m;

    /* JADX INFO: renamed from: n */
    public VText f187625n;

    /* JADX INFO: renamed from: o */
    public VLinear f187626o;

    /* JADX INFO: renamed from: p */
    public VFrame f187627p;

    /* JADX INFO: renamed from: q */
    public VText f187628q;

    /* JADX INFO: renamed from: r */
    public Act f187629r;

    /* JADX INFO: renamed from: s */
    public lq20 f187630s;

    /* JADX INFO: renamed from: t */
    public br20 f187631t;

    /* JADX INFO: renamed from: u */
    public Comparator<NewFilterZodiacsItem> f187632u = new Comparator() { // from class: l.pq20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f130062a, ((NewFilterZodiacsItem) obj2).getBindViewData().f130062a);
        }
    };

    /* JADX INFO: renamed from: l.wq20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC20940a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f187633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f187634b;

        public ViewTreeObserverOnGlobalLayoutListenerC20940a(View view, boolean z) {
            this.f187633a = view;
            this.f187634b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = ((this.f187633a.getRight() + this.f187633a.getLeft()) / 2) - t100.m186890d(10.0f);
            float top = this.f187633a.getTop() + vtd.m199996a(wq20.this.f187629r, 4.0f);
            if (this.f187634b) {
                right = this.f187633a.getLeft() + t100.m186890d(2.0f);
            }
            wq20.this.f187624m.setX(right);
            wq20.this.f187624m.setY(top);
            xdl0.m208345M0(wq20.this.f187624m, true);
            this.f187633a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public wq20(Act act) {
        this.f187629r = act;
    }

    /* JADX INFO: renamed from: C */
    private void m204967C() {
        br20 br20Var = new br20();
        this.f187631t = br20Var;
        br20Var.m118106l(this);
        this.f187623l.setCanAdjustChildHeight(false);
        this.f187623l.setIsSquare(true);
        this.f187623l.setAdapter(this.f187631t);
        this.f187631t.m103442p(Arrays.asList(qne0.f155424d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m204968E(View view) {
        this.f187630s.m150955g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m204969F(View view) {
        this.f187630s.m150955g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m204970G(VScroll vScroll, int i, int i2, int i3, int i4) {
        xdl0.m208344M(this.f187627p, i2 > this.f187618g.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m204971H() {
        this.f187615d.scrollTo(0, this.f187618g.getTop());
    }

    /* JADX INFO: renamed from: Q */
    private void m204972Q() {
        CoreModule.f17557o.m195057d().mo33850id(this.f187629r);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m204974d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m204979k(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m204984r() {
        xdl0.m208329E0(this.f187612a, new View.OnClickListener() { // from class: l.mq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135162a.m204968E(view);
            }
        });
        xdl0.m208329E0(this.f187614c, new View.OnClickListener() { // from class: l.nq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140026a.m204969F(view);
            }
        });
        m204967C();
        this.f187615d.m223193d(new VScroll.InterfaceC22566a() { // from class: l.oq20
            @Override // p147v.VScroll.InterfaceC22566a
            /* JADX INFO: renamed from: a */
            public final void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f145105a.m204970G(vScroll, i, i2, i3, i4);
            }
        });
        VText vText = this.f187614c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f187613b.setTypeface(this.f187614c.getTypeface(), 1);
        Drawable drawable = getAct().drawable(CoreModule.f17557o.m195057d().mo33706J9());
        drawable.setBounds(0, 0, t100.m186890d(39.0f), t100.m186890d(14.0f));
        this.f187618g.setCompoundDrawables(null, null, drawable, null);
        this.f187625n.setCompoundDrawables(null, null, drawable, null);
        this.f187628q.setCompoundDrawables(null, null, drawable, null);
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            xdl0.m208360X(this.f187617f, t100.f167264m);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m204985v(final Runnable runnable) {
        e51.m114742G(new Runnable() { // from class: l.vq20
            @Override // java.lang.Runnable
            public final void run() {
                wq20.m204979k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m204986A(Settings settings) {
        this.f187616e.m55469O0(this.f187629r, settings, this.f187630s.m150938M());
    }

    /* JADX INFO: renamed from: B */
    public void m204987B(Settings settings) {
        this.f187616e.m55480u0(this.f187629r, settings);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187629r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m204988I() {
        this.f187615d.scrollTo(0, this.f187625n.getTop());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m204989J(View view) {
        this.f187615d.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m204990K() {
        if (!CoreModule.f17545c.f19598Q1.m34742g3() || CoreModule.f17545c.f19598Q1.m34743h3()) {
            return;
        }
        CoreModule.f17545c.f19598Q1.m34747l3(true);
        new dd80.C16336a(this.f187629r).m110996y0("服务更新").m110991t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").m110958M(true).m110974c0("知道了", new Runnable() { // from class: l.uq20
            @Override // java.lang.Runnable
            public final void run() {
                wq20.m204974d();
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: L */
    public void m204991L(boolean z) {
        this.f187616e.m55479t0(z);
    }

    /* JADX INFO: renamed from: M */
    public void m204992M(int i) {
        if (i == 1) {
            m204985v(new Runnable() { // from class: l.qq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155861a.m204971H();
                }
            });
            return;
        }
        if (i == 2) {
            m204985v(new Runnable() { // from class: l.rq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160587a.m204988I();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f187616e.getLocationTitle().getParent();
            if (NullChecker.m81303a(view)) {
                m204985v(new Runnable() { // from class: l.sq20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f165925a.m204989J(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m204993N(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM118103h = this.f187631t.m118103h();
        Collections.sort(listM118103h, this.f187632u);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM118103h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f130063b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f130064c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f130063b);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m204994O(HiddenNearByView hiddenNearByView) {
        this.f187616e.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: P */
    public void m204995P(j760<List<ProfileZodiac>, ProfileZodiac> j760Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : j760Var.f116564a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f187631t.m118104j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f130063b = profileZodiac;
            }
        }
        this.f187631t.m118107m(arrayList);
        ProfileZodiac profileZodiac2 = j760Var.f116565b;
        if (!NullChecker.m81303a(profileZodiac2)) {
            xdl0.m208345M0(this.f187624m, false);
            return;
        }
        boolean zM155879b = mqa.m155879b();
        boolean z = !zM155879b;
        VText vText = this.f187624m;
        if (zM155879b) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f187631t.m118104j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20940a(newFilterZodiacsItem2, z));
    }

    /* JADX INFO: renamed from: R */
    public void m204996R() {
        e51.m114743H(this.f187629r, new Runnable() { // from class: l.tq20
            @Override // java.lang.Runnable
            public final void run() {
                this.f171545a.m204990K();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: S */
    public void m204997S(String str) {
        this.f187616e.m55472R0(str);
    }

    @Override // p149l.eth0.InterfaceC16677a
    /* JADX INFO: renamed from: a */
    public boolean mo118108a(View view) {
        if (this.f187630s.m150952d0() || xma.m210097y3()) {
            zvf0.m220399u("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.valueOf(!view.isSelected())));
            return false;
        }
        zvf0.m220399u("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.valueOf(view.isSelected())));
        m204972Q();
        return true;
    }

    @Override // p149l.eth0.InterfaceC16677a
    /* JADX INFO: renamed from: b */
    public void mo118109b() {
        if (this.f187631t.m118103h().size() > 0) {
            zvf0.m220400v("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.TRUE));
        } else if (this.f187630s.m150952d0()) {
            zvf0.m220400v("e_advanced_filter_constellation", "p_advanced_filter_page", vwb.m200311Y("is_selected", Boolean.FALSE));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM204998q = m204998q(layoutInflater, viewGroup);
        m204984r();
        return viewM204998q;
    }

    /* JADX INFO: renamed from: q */
    public View m204998q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xq20.m210542b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public void m204999s(String str, String str2) {
        this.f187616e.m55474l0(str, str2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lq20 lq20Var) {
        this.f187630s = lq20Var;
    }

    /* JADX INFO: renamed from: w */
    public View m205001w() {
        return this.f187620i;
    }

    /* JADX INFO: renamed from: x */
    public View m205002x() {
        return this.f187626o;
    }

    /* JADX INFO: renamed from: y */
    public boolean m205003y() {
        return yij0.m214965u(this.f187616e.f36137c);
    }

    /* JADX INFO: renamed from: z */
    public void m205004z(AdvancedSettings advancedSettings) {
        m204995P(CoreModule.f17545c.f19564F0.m99253t3(advancedSettings));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
