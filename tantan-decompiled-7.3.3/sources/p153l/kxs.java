package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class kxs implements iam<bws> {

    /* JADX INFO: renamed from: a */
    public bws f129232a;

    /* JADX INFO: renamed from: b */
    public ViewPager f129233b;

    /* JADX INFO: renamed from: c */
    public TabLayout f129234c;

    /* JADX INFO: renamed from: d */
    public n2u f129235d;

    /* JADX INFO: renamed from: f */
    public final View f129237f;

    /* JADX INFO: renamed from: g */
    public int f129238g;

    /* JADX INFO: renamed from: i */
    public x20 f129240i;

    /* JADX INFO: renamed from: j */
    public x20 f129241j;

    /* JADX INFO: renamed from: k */
    public int f129242k;

    /* JADX INFO: renamed from: e */
    public boolean f129236e = false;

    /* JADX INFO: renamed from: h */
    public final TabLayout.OnTabSelectedListener f129239h = new C18294a();

    public kxs(ViewPager viewPager, TabLayout tabLayout, View view) {
        this.f129233b = viewPager;
        this.f129234c = tabLayout;
        this.f129237f = view;
    }

    /* JADX INFO: renamed from: B */
    private void m151857B(String str, String str2) {
        i4g0.m138523u("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: C */
    private void m151858C(String str, String str2) {
        i4g0.m138492A("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: H */
    private void m151859H(TextView textView, int i) {
        if (NullChecker.m82486a(textView)) {
            msi0.m159817o(textView, i);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m151860I(List<LiveSquareTabBean> list, int i) {
        final int i2 = 0;
        while (i2 < this.f129234c.getTabCount()) {
            LiveSquareTabBean liveSquareTabBean = list.get(i2);
            TabLayout.Tab tabAt = this.f129234c.getTabAt(i2);
            View viewM151875w = m151875w(getAct(), liveSquareTabBean);
            bnl0.m105509E0(viewM151875w, new View.OnClickListener() { // from class: l.jxs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123076a.m151878z(i2, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM151875w);
            }
            TextView textView = (TextView) viewM151875w.findViewById(ldc0.f131568k2);
            m151859H(textView, i2 == i ? hgc0.f109392i : hgc0.f109394k);
            if (i == this.f129232a.f78778i && i2 != i) {
                textView.setTextColor(Color.parseColor("#B2FFFFFF"));
            }
            viewM151875w.setBackgroundResource(i2 == i ? nbc0.f141178m : nbc0.f141096D1);
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    private void m151861L(boolean z, String str, String str2) {
        if (z) {
            m151858C(str, str2);
        } else {
            m151858C(str, str2);
            m151857B(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m151862M(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                i4g0.m138520r("e_live_top_tab", "p_audio_explore_recommend");
                m151879A(str, false);
            } else if ("square-multi-call".equals(tag)) {
                i4g0.m138520r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static View m151875w(Act act, LiveSquareTabBean liveSquareTabBean) {
        View viewInflate = act.inflater().inflate(xec0.f193906s, (ViewGroup) null);
        viewInflate.setTag(liveSquareTabBean.getPageId());
        VText vText = (VText) viewInflate.findViewById(ldc0.f131568k2);
        View viewFindViewById = viewInflate.findViewById(ldc0.f131575m1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(-15.0f);
        marginLayoutParams.topMargin = qa00.m175859d(2.0f);
        marginLayoutParams.height = qa00.m175859d(11.0f);
        marginLayoutParams.width = qa00.m175859d(11.0f);
        viewFindViewById.setLayoutParams(marginLayoutParams);
        vText.setPadding(qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
        vText.setText(liveSquareTabBean.getName());
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m151878z(int i, View view) {
        this.f129233b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: A */
    public void m151879A(String str, boolean z) {
        View viewFindViewWithTag = this.f129234c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag != null) {
            TextView textView = (TextView) viewFindViewWithTag.findViewById(ldc0.f131579n1);
            View viewFindViewById = viewFindViewWithTag.findViewById(ldc0.f131575m1);
            if (textView != null && bnl0.m105529O0(textView)) {
                m151861L(z, "red_dot_figure", str);
            } else {
                if (viewFindViewById == null || !bnl0.m105529O0(viewFindViewById)) {
                    return;
                }
                m151861L(z, "red_dot_normal", str);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m151880E(List<LiveSquareTabBean> list) {
        if (this.f129233b == null || this.f129234c == null) {
            return;
        }
        int iM147476G = jyb.m147476G(list, new pxs());
        if (((bk3) tbs.m190077m(itd0.f116822d)).m104789c(list)) {
            ((gm3) tbs.m190077m(itd0.f116821c)).f104919i.m137019l(Boolean.TRUE);
            iM147476G = jyb.m147476G(list, new qcj() { // from class: l.ixs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(y6u.m214508l(((LiveSquareTabBean) obj).getRequestName()));
                }
            });
        } else {
            ((gm3) tbs.m190077m(itd0.f116821c)).f104919i.m137019l(Boolean.FALSE);
        }
        if (this.f129232a.m160239H2().f143738b.isAdded()) {
            if (this.f129235d == null) {
                FragmentManager childFragmentManager = this.f129232a.m160239H2().f143738b.getChildFragmentManager();
                y6u.m214499c(childFragmentManager);
                this.f129235d = new n2u(childFragmentManager, iM147476G, this.f129233b.getCurrentItem(), this.f129232a.m160238F2());
            }
            this.f129235d.m161257m(list);
            this.f129233b.setAdapter(this.f129235d);
            x20 x20Var = this.f129240i;
            if (x20Var != null) {
                x20Var.call();
            }
            this.f129242k = iM147476G;
        }
        this.f129234c.setupWithViewPager(this.f129233b);
        m151860I(list, this.f129242k);
        this.f129233b.setOffscreenPageLimit(list.size());
        if (this.f129242k != this.f129233b.getCurrentItem()) {
            this.f129233b.setCurrentItem(this.f129242k);
        }
        m151886p();
        this.f129236e = true;
        x20 x20Var2 = this.f129241j;
        if (x20Var2 != null) {
            x20Var2.call();
        }
        if (ppi0.m173207l().m173228x()) {
            bnl0.m105524M(this.f129234c, false);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m151876x(final int i) {
        View viewFindViewWithTag = this.f129234c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f129240i = new x20() { // from class: l.exs
                @Override // p153l.x20
                public final void call() {
                    this.f96331a.m151876x(i);
                }
            };
            return;
        }
        this.f129240i = null;
        TextView textView = (TextView) viewFindViewWithTag.findViewById(ldc0.f131579n1);
        textView.setText(String.valueOf(i));
        bnl0.m105524M(textView, i > 0);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m151877y(final boolean z) {
        View viewFindViewWithTag = this.f129234c.findViewWithTag("p_live_curated_recommend");
        if (viewFindViewWithTag == null) {
            this.f129241j = new x20() { // from class: l.hxs
                @Override // p153l.x20
                public final void call() {
                    this.f112044a.m151877y(z);
                }
            };
        } else {
            this.f129241j = null;
            bnl0.m105524M(viewFindViewWithTag.findViewById(ldc0.f131575m1), z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m151883J(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        View view = this.f129237f;
        if (zBooleanValue) {
            view.setTranslationX(bnl0.m105592y0());
        } else {
            view.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m151884K(List<LiveSquareTabBean> list, final String str) {
        if (this.f129233b == null || this.f129234c == null) {
            return;
        }
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.fxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), str));
            }
        });
        if (iM147476G >= 0) {
            this.f129233b.setCurrentItem(iM147476G);
            return;
        }
        int iM147476G2 = jyb.m147476G(list, new qcj() { // from class: l.gxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), "2"));
            }
        });
        if (iM147476G2 >= 0) {
            this.f129233b.setCurrentItem(iM147476G2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m151885N() {
        boolean z = false;
        for (int i = 0; i < this.f129234c.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f129234c.getTabAt(i);
            TextView textView = (TextView) tabAt.view.findViewById(ldc0.f131568k2);
            if (tabAt.isSelected()) {
                z = tabAt.getPosition() == this.f129232a.f78778i;
                if (NullChecker.m82486a(textView)) {
                    msi0.m159817o(textView, ggc0.f104010h);
                    tabAt.getCustomView().setBackgroundResource(nbc0.f141178m);
                }
            } else if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, ggc0.f104012j);
                tabAt.getCustomView().setBackgroundResource(nbc0.f141096D1);
                if (z) {
                    textView.setTextColor(Color.parseColor("#B2FFFFFF"));
                }
            }
        }
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f129232a.getAct();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bws bwsVar) {
        this.f129232a = bwsVar;
    }

    /* JADX INFO: renamed from: r */
    public void m151888r() {
        this.f129234c.addOnTabSelectedListener(this.f129239h);
        this.f129234c.setTabRippleColorResource(l9c0.f130601n);
        this.f129234c.setSelectedTabIndicator(new ColorDrawable(0));
        this.f129233b.m4187d(new C18295b());
    }

    /* JADX INFO: renamed from: s */
    public LiveSquareBaseFrag m151889s() {
        n2u n2uVar = this.f129235d;
        if (n2uVar == null || this.f129233b == null || n2uVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f129235d.getItem(this.f129233b.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public Frag m151890u(int i) {
        n2u n2uVar = this.f129235d;
        if (n2uVar == null || this.f129233b == null || i >= n2uVar.getCount()) {
            return null;
        }
        Fragment item = this.f129235d.getItem(i);
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public String m151891v(int i) {
        List<LiveSquareTabBean> listM161256l = this.f129235d.m161256l();
        return (i < 0 || i >= listM161256l.size()) ? "NA" : listM161256l.get(i).getRequestName();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: p */
    public void m151886p() {
    }

    /* JADX INFO: renamed from: l.kxs$a */
    public class C18294a implements TabLayout.OnTabSelectedListener {
        public C18294a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM151891v = kxs.this.m151891v(tab.getPosition());
            if (strM151891v == null) {
                return;
            }
            kxs.this.f129232a.m106795I3(tab.getPosition());
            kxs.this.m151862M(tab, strM151891v);
            kxs.this.m151885N();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.kxs$b */
    public class C18295b implements ViewPager.InterfaceC0718j {
        public C18295b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            if (kxs.this.f129232a.m106798q3(i)) {
                kxs.this.f129237f.setTranslationX((1.0f - f) * bnl0.m105592y0());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            boolean zM106798q3 = kxs.this.f129232a.m106798q3(i);
            kxs kxsVar = kxs.this;
            if (zM106798q3) {
                kxsVar.m151883J(Boolean.TRUE);
            } else if (kxsVar.f129232a.m106798q3(kxs.this.f129238g)) {
                kxs.this.m151883J(Boolean.FALSE);
            }
            kxs.this.f129238g = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }
    }
}
