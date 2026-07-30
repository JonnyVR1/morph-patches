package p153l;

import android.content.Context;
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
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class sxs implements iam<dxs> {

    /* JADX INFO: renamed from: a */
    public final ToolBarSkinView f171173a;

    /* JADX INFO: renamed from: b */
    public dxs f171174b;

    /* JADX INFO: renamed from: c */
    public ViewPager f171175c;

    /* JADX INFO: renamed from: d */
    public TabLayout f171176d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f171177e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f171178f;

    /* JADX INFO: renamed from: g */
    public n2u f171179g;

    /* JADX INFO: renamed from: i */
    public boolean f171181i;

    /* JADX INFO: renamed from: j */
    public int f171182j;

    /* JADX INFO: renamed from: l */
    public x20 f171184l;

    /* JADX INFO: renamed from: m */
    public x20 f171185m;

    /* JADX INFO: renamed from: n */
    public x20 f171186n;

    /* JADX INFO: renamed from: o */
    public int f171187o;

    /* JADX INFO: renamed from: h */
    public boolean f171180h = false;

    /* JADX INFO: renamed from: k */
    public final TabLayout.OnTabSelectedListener f171183k = new C20182a();

    public sxs(ViewPager viewPager, TabLayout tabLayout, ToolBarSkinView toolBarSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f171175c = viewPager;
        this.f171176d = tabLayout;
        this.f171173a = toolBarSkinView;
        this.f171177e = vDraweeView;
        this.f171178f = vDraweeView2;
    }

    /* JADX INFO: renamed from: w */
    public static View m188497w(Act act, LiveSquareTabBean liveSquareTabBean) {
        View viewInflate = act.inflater().inflate(xec0.f193906s, (ViewGroup) null);
        viewInflate.setTag(liveSquareTabBean.getPageId());
        VText vText = (VText) viewInflate.findViewById(ldc0.f131568k2);
        vText.setText(liveSquareTabBean.getName());
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: A */
    public void m188498A(String str, boolean z) {
        View viewFindViewWithTag = this.f171176d.findViewWithTag("square-suggested");
        if (viewFindViewWithTag != null) {
            TextView textView = (TextView) viewFindViewWithTag.findViewById(ldc0.f131579n1);
            View viewFindViewById = viewFindViewWithTag.findViewById(ldc0.f131575m1);
            if (textView != null && bnl0.m105529O0(textView)) {
                m188510N(z, "red_dot_figure", str);
            } else {
                if (viewFindViewById == null || !bnl0.m105529O0(viewFindViewById)) {
                    return;
                }
                m188510N(z, "red_dot_normal", str);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m188499B(String str, String str2) {
        i4g0.m138523u("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: C */
    public final void m188500C(String str, String str2) {
        i4g0.m138492A("e_red_dot_live_icon", sft.m185665c(str2), jyb.m147494Y("tooltips_type_ui", str));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m188501E(List<LiveSquareTabBean> list) {
        if (this.f171175c == null || this.f171176d == null) {
            return;
        }
        int iM147476G = jyb.m147476G(list, new pxs());
        if (((bk3) tbs.m190077m(itd0.f116822d)).m104789c(list)) {
            ((gm3) tbs.m190077m(itd0.f116821c)).f104919i.m137019l(Boolean.TRUE);
            iM147476G = jyb.m147476G(list, new qcj() { // from class: l.qxs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(y6u.m214508l(((LiveSquareTabBean) obj).getRequestName()));
                }
            });
        } else {
            ((gm3) tbs.m190077m(itd0.f116821c)).f104919i.m137019l(Boolean.FALSE);
        }
        if (this.f171174b.m160239H2().f143738b.isAdded()) {
            if (this.f171179g == null) {
                FragmentManager childFragmentManager = this.f171174b.m160239H2().f143738b.getChildFragmentManager();
                y6u.m214499c(childFragmentManager);
                this.f171179g = new n2u(childFragmentManager, iM147476G, this.f171175c.getCurrentItem(), this.f171174b.m160238F2());
            }
            this.f171179g.m161257m(list);
            this.f171175c.setAdapter(this.f171179g);
            x20 x20Var = this.f171184l;
            if (x20Var != null) {
                x20Var.call();
            }
            x20 x20Var2 = this.f171185m;
            if (x20Var2 != null) {
                x20Var2.call();
            }
            this.f171187o = iM147476G;
        }
        this.f171176d.setupWithViewPager(this.f171175c);
        m188507K(list, this.f171187o);
        this.f171175c.setOffscreenPageLimit(list.size());
        if (this.f171187o != this.f171175c.getCurrentItem()) {
            this.f171175c.setCurrentItem(this.f171187o);
        }
        m188512p();
        this.f171180h = true;
        x20 x20Var3 = this.f171186n;
        if (x20Var3 != null) {
            x20Var3.call();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m188502F(Boolean bool) {
        if ("p_live_featured".equals((String) this.f171174b.m160243N2(new evs())) || mbs.m157853g().mo31695I4()) {
            boolean zBooleanValue = bool.booleanValue();
            ToolBarSkinView toolBarSkinView = this.f171173a;
            if (zBooleanValue) {
                toolBarSkinView.setBackgroundResource(nbc0.f141099E1);
            } else {
                toolBarSkinView.setBackgroundResource(nbc0.f141096D1);
            }
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m188518x(final int i) {
        View viewFindViewWithTag = this.f171176d.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f171184l = new x20() { // from class: l.lxs
                @Override // p153l.x20
                public final void call() {
                    this.f134000a.m188518x(i);
                }
            };
            return;
        }
        this.f171184l = null;
        TextView textView = (TextView) viewFindViewWithTag.findViewById(ldc0.f131579n1);
        textView.setText(String.valueOf(i));
        bnl0.m105524M(textView, i > 0);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m188519y(final boolean z) {
        View viewFindViewWithTag = this.f171176d.findViewWithTag("p_live_curated_recommend");
        if (viewFindViewWithTag == null) {
            this.f171186n = new x20() { // from class: l.oxs
                @Override // p153l.x20
                public final void call() {
                    this.f149681a.m188519y(z);
                }
            };
        } else {
            this.f171186n = null;
            bnl0.m105524M(viewFindViewWithTag.findViewById(ldc0.f131575m1), z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m188505I(Boolean bool) {
        this.f171181i = bool.booleanValue();
        for (int i = 0; i < this.f171176d.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f171176d.getTabAt(i);
            if (tabAt != null) {
                TextView textView = (TextView) tabAt.view.findViewById(ldc0.f131568k2);
                if (i == this.f171176d.getSelectedTabPosition()) {
                    msi0.m159817o(textView, ggc0.f104009g);
                    if (bool.booleanValue()) {
                        textView.setTextColor(ynp0.m216917B("#FFFFFF"));
                    }
                } else {
                    msi0.m159817o(textView, ggc0.f104011i);
                    if (bool.booleanValue()) {
                        textView.setTextColor(ynp0.m216917B("#66FFFFFF"));
                    }
                }
                if (mbs.m157853g().mo31695I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m188506J(TextView textView, int i) {
        if (NullChecker.m82486a(textView)) {
            msi0.m159817o(textView, i);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m188507K(List<LiveSquareTabBean> list, int i) {
        final int i2 = 0;
        while (i2 < this.f171176d.getTabCount()) {
            LiveSquareTabBean liveSquareTabBean = list.get(i2);
            TabLayout.Tab tabAt = this.f171176d.getTabAt(i2);
            View viewM188497w = m188497w(getAct(), liveSquareTabBean);
            bnl0.m105509E0(viewM188497w, new View.OnClickListener() { // from class: l.rxs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165375a.m188520z(i2, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM188497w);
            }
            VText vText = (VText) viewM188497w.findViewById(ldc0.f131568k2);
            m188506J(vText, i2 == i ? hgc0.f109391h : hgc0.f109393j);
            if (mbs.m157853g().mo31695I4()) {
                vText.setTextSize(20.0f);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m188508L(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ToolBarSkinView toolBarSkinView = this.f171173a;
        if (zBooleanValue) {
            toolBarSkinView.setTranslationX(bnl0.m105592y0());
        } else {
            toolBarSkinView.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m188509M(List<LiveSquareTabBean> list, final String str) {
        if (this.f171175c == null || this.f171176d == null) {
            return;
        }
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.mxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), str));
            }
        });
        if (iM147476G >= 0) {
            this.f171175c.setCurrentItem(iM147476G);
            return;
        }
        int iM147476G2 = jyb.m147476G(list, new qcj() { // from class: l.nxs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), "2"));
            }
        });
        if (iM147476G2 >= 0) {
            this.f171175c.setCurrentItem(iM147476G2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m188510N(boolean z, String str, String str2) {
        if (z) {
            m188500C(str, str2);
        } else {
            m188500C(str, str2);
            m188499B(str, str2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m188511O(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                i4g0.m138520r("e_live_top_tab", "p_audio_explore_recommend");
                m188498A(str, false);
            } else if ("square-multi-call".equals(tag)) {
                i4g0.m138520r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f171174b.getAct();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dxs dxsVar) {
        this.f171174b = dxsVar;
    }

    /* JADX INFO: renamed from: r */
    public void m188514r() {
        this.f171176d.addOnTabSelectedListener(this.f171183k);
        this.f171176d.setTabRippleColorResource(l9c0.f130601n);
        this.f171176d.setSelectedTabIndicator(new ColorDrawable(0));
        this.f171175c.m4187d(new C20183b());
    }

    /* JADX INFO: renamed from: s */
    public LiveSquareBaseFrag m188515s() {
        n2u n2uVar = this.f171179g;
        if (n2uVar == null || this.f171175c == null || n2uVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f171179g.getItem(this.f171175c.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public Frag m188516u(int i) {
        n2u n2uVar = this.f171179g;
        if (n2uVar == null || this.f171175c == null || i >= n2uVar.getCount()) {
            return null;
        }
        Fragment item = this.f171179g.getItem(i);
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public String m188517v(int i) {
        List<LiveSquareTabBean> listM161256l = this.f171179g.m161256l();
        return (i < 0 || i >= listM161256l.size()) ? "NA" : listM161256l.get(i).getRequestName();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m188520z(int i, View view) {
        this.f171175c.setCurrentItem(i);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: p */
    public void m188512p() {
    }

    /* JADX INFO: renamed from: l.sxs$a */
    public class C20182a implements TabLayout.OnTabSelectedListener {
        public C20182a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM188517v = sxs.this.m188517v(tab.getPosition());
            if (strM188517v == null) {
                return;
            }
            sxs.this.f171174b.m118552R3(tab.getPosition());
            sxs.this.m188511O(tab, strM188517v);
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, ggc0.f104009g);
                if (sxs.this.f171181i) {
                    textView.setTextColor(-1);
                }
                if ("fakeLiveSquare".equals(strM188517v)) {
                    textView.setTextColor(-1);
                }
                if (mbs.m157853g().mo31695I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, ggc0.f104011i);
                if (sxs.this.f171181i) {
                    textView.setTextColor(ynp0.m216917B("#66FFFFFF"));
                }
                String strM188517v = sxs.this.m188517v(tab.getPosition());
                if (((Boolean) sxs.this.f171174b.m160243N2(new jcs())).booleanValue() && !"fakeLiveSquare".equals(strM188517v)) {
                    textView.setTextColor(sxs.this.getAct().color(m9c0.f135368B));
                }
                if (mbs.m157853g().mo31695I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.sxs$b */
    public class C20183b implements ViewPager.InterfaceC0718j {
        public C20183b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            if (sxs.this.f171174b.m118567v3(i)) {
                sxs.this.f171173a.setTranslationX((1.0f - f) * bnl0.m105592y0());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            boolean zM118567v3 = sxs.this.f171174b.m118567v3(i);
            sxs sxsVar = sxs.this;
            if (zM118567v3) {
                sxsVar.f171174b.m118559Y3(true);
            } else if (sxsVar.f171174b.m118567v3(sxs.this.f171182j)) {
                sxs.this.f171174b.m118559Y3(false);
            }
            sxs.this.f171182j = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }
    }
}
