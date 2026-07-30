package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin.ToolBarSkinView;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class rvs implements s7m<cvs> {

    /* JADX INFO: renamed from: a */
    public final ToolBarSkinView f161253a;

    /* JADX INFO: renamed from: b */
    public cvs f161254b;

    /* JADX INFO: renamed from: c */
    public ViewPager f161255c;

    /* JADX INFO: renamed from: d */
    public TabLayout f161256d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f161257e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f161258f;

    /* JADX INFO: renamed from: g */
    public m0u f161259g;

    /* JADX INFO: renamed from: i */
    public boolean f161261i;

    /* JADX INFO: renamed from: j */
    public int f161262j;

    /* JADX INFO: renamed from: l */
    public d30 f161264l;

    /* JADX INFO: renamed from: m */
    public d30 f161265m;

    /* JADX INFO: renamed from: n */
    public d30 f161266n;

    /* JADX INFO: renamed from: o */
    public int f161267o;

    /* JADX INFO: renamed from: h */
    public boolean f161260h = false;

    /* JADX INFO: renamed from: k */
    public final TabLayout.OnTabSelectedListener f161263k = new C19800a();

    public rvs(ViewPager viewPager, TabLayout tabLayout, ToolBarSkinView toolBarSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f161255c = viewPager;
        this.f161256d = tabLayout;
        this.f161253a = toolBarSkinView;
        this.f161257e = vDraweeView;
        this.f161258f = vDraweeView2;
    }

    /* JADX INFO: renamed from: w */
    public static View m181340w(Act act, LiveSquareTabBean liveSquareTabBean) {
        View viewInflate = act.inflater().inflate(s6c0.f162792s, (ViewGroup) null);
        viewInflate.setTag(liveSquareTabBean.getPageId());
        VText vText = (VText) viewInflate.findViewById(f5c0.f95111k2);
        vText.setText(liveSquareTabBean.getName());
        vText.setBackgroundColor(0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: A */
    public void m181341A(String str, boolean z) {
        View viewFindViewWithTag = this.f161256d.findViewWithTag("square-suggested");
        if (viewFindViewWithTag != null) {
            TextView textView = (TextView) viewFindViewWithTag.findViewById(f5c0.f95122n1);
            View viewFindViewById = viewFindViewWithTag.findViewById(f5c0.f95118m1);
            if (textView != null && xdl0.m208349O0(textView)) {
                m181353N(z, "red_dot_figure", str);
            } else {
                if (viewFindViewById == null || !xdl0.m208349O0(viewFindViewById)) {
                    return;
                }
                m181353N(z, "red_dot_normal", str);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m181342B(String str, String str2) {
        zvf0.m220399u("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: C */
    public final void m181343C(String str, String str2) {
        zvf0.m220368A("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m181344E(List<LiveSquareTabBean> list) {
        if (this.f161255c == null || this.f161256d == null) {
            return;
        }
        int iM200293G = vwb.m200293G(list, new ovs());
        if (((jj3) s9s.m182763m(gld0.f103314d)).m141738c(list)) {
            ((hl3) s9s.m182763m(gld0.f103313c)).f108316i.m132487l(Boolean.TRUE);
            iM200293G = vwb.m200293G(list, new w9j() { // from class: l.pvs
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(x4u.m207026l(((LiveSquareTabBean) obj).getRequestName()));
                }
            });
        } else {
            ((hl3) s9s.m182763m(gld0.f103313c)).f108316i.m132487l(Boolean.FALSE);
        }
        if (this.f161254b.m151643H2().f135531b.isAdded()) {
            if (this.f161259g == null) {
                FragmentManager childFragmentManager = this.f161254b.m151643H2().f135531b.getChildFragmentManager();
                x4u.m207017c(childFragmentManager);
                this.f161259g = new m0u(childFragmentManager, iM200293G, this.f161255c.getCurrentItem(), this.f161254b.m151642F2());
            }
            this.f161259g.m152545m(list);
            this.f161255c.setAdapter(this.f161259g);
            d30 d30Var = this.f161264l;
            if (d30Var != null) {
                d30Var.call();
            }
            d30 d30Var2 = this.f161265m;
            if (d30Var2 != null) {
                d30Var2.call();
            }
            this.f161267o = iM200293G;
        }
        this.f161256d.setupWithViewPager(this.f161255c);
        m181350K(list, this.f161267o);
        this.f161255c.setOffscreenPageLimit(list.size());
        if (this.f161267o != this.f161255c.getCurrentItem()) {
            this.f161255c.setCurrentItem(this.f161267o);
        }
        m181355p();
        this.f161260h = true;
        d30 d30Var3 = this.f161266n;
        if (d30Var3 != null) {
            d30Var3.call();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m181345F(Boolean bool) {
        if ("p_live_featured".equals((String) this.f161254b.m151646N2(new dts())) || l9s.m149076g().mo30692I4()) {
            boolean zBooleanValue = bool.booleanValue();
            ToolBarSkinView toolBarSkinView = this.f161253a;
            if (zBooleanValue) {
                toolBarSkinView.setBackgroundResource(h3c0.f105608E1);
            } else {
                toolBarSkinView.setBackgroundResource(h3c0.f105605D1);
            }
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m181361x(final int i) {
        View viewFindViewWithTag = this.f161256d.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f161264l = new d30() { // from class: l.kvs
                @Override // p149l.d30
                public final void call() {
                    this.f124790a.m181361x(i);
                }
            };
            return;
        }
        this.f161264l = null;
        TextView textView = (TextView) viewFindViewWithTag.findViewById(f5c0.f95122n1);
        textView.setText(String.valueOf(i));
        xdl0.m208344M(textView, i > 0);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m181362y(final boolean z) {
        View viewFindViewWithTag = this.f161256d.findViewWithTag("p_live_curated_recommend");
        if (viewFindViewWithTag == null) {
            this.f161266n = new d30() { // from class: l.nvs
                @Override // p149l.d30
                public final void call() {
                    this.f140813a.m181362y(z);
                }
            };
        } else {
            this.f161266n = null;
            xdl0.m208344M(viewFindViewWithTag.findViewById(f5c0.f95118m1), z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m181348I(Boolean bool) {
        this.f161261i = bool.booleanValue();
        for (int i = 0; i < this.f161256d.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f161256d.getTabAt(i);
            if (tabAt != null) {
                TextView textView = (TextView) tabAt.view.findViewById(f5c0.f95111k2);
                if (i == this.f161256d.getSelectedTabPosition()) {
                    mji0.m154821o(textView, b8c0.f74090g);
                    if (bool.booleanValue()) {
                        textView.setTextColor(uep0.m193307B("#FFFFFF"));
                    }
                } else {
                    mji0.m154821o(textView, b8c0.f74092i);
                    if (bool.booleanValue()) {
                        textView.setTextColor(uep0.m193307B("#66FFFFFF"));
                    }
                }
                if (l9s.m149076g().mo30692I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m181349J(TextView textView, int i) {
        if (NullChecker.m81303a(textView)) {
            mji0.m154821o(textView, i);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m181350K(List<LiveSquareTabBean> list, int i) {
        final int i2 = 0;
        while (i2 < this.f161256d.getTabCount()) {
            LiveSquareTabBean liveSquareTabBean = list.get(i2);
            TabLayout.Tab tabAt = this.f161256d.getTabAt(i2);
            View viewM181340w = m181340w(getAct(), liveSquareTabBean);
            xdl0.m208329E0(viewM181340w, new View.OnClickListener() { // from class: l.qvs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156622a.m181363z(i2, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM181340w);
            }
            VText vText = (VText) viewM181340w.findViewById(f5c0.f95111k2);
            m181349J(vText, i2 == i ? c8c0.f79743h : c8c0.f79745j);
            if (l9s.m149076g().mo30692I4()) {
                vText.setTextSize(20.0f);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m181351L(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ToolBarSkinView toolBarSkinView = this.f161253a;
        if (zBooleanValue) {
            toolBarSkinView.setTranslationX(xdl0.m208412y0());
        } else {
            toolBarSkinView.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m181352M(List<LiveSquareTabBean> list, final String str) {
        if (this.f161255c == null || this.f161256d == null) {
            return;
        }
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.lvs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), str));
            }
        });
        if (iM200293G >= 0) {
            this.f161255c.setCurrentItem(iM200293G);
            return;
        }
        int iM200293G2 = vwb.m200293G(list, new w9j() { // from class: l.mvs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), "2"));
            }
        });
        if (iM200293G2 >= 0) {
            this.f161255c.setCurrentItem(iM200293G2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m181353N(boolean z, String str, String str2) {
        if (z) {
            m181343C(str, str2);
        } else {
            m181343C(str, str2);
            m181342B(str, str2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m181354O(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                zvf0.m220396r("e_live_top_tab", "p_audio_explore_recommend");
                m181341A(str, false);
            } else if ("square-multi-call".equals(tag)) {
                zvf0.m220396r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f161254b.getAct();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cvs cvsVar) {
        this.f161254b = cvsVar;
    }

    /* JADX INFO: renamed from: r */
    public void m181357r() {
        this.f161256d.addOnTabSelectedListener(this.f161263k);
        this.f161256d.setTabRippleColorResource(f1c0.f94077n);
        this.f161256d.setSelectedTabIndicator(new ColorDrawable(0));
        this.f161255c.m4185d(new C19801b());
    }

    /* JADX INFO: renamed from: s */
    public LiveSquareBaseFrag m181358s() {
        m0u m0uVar = this.f161259g;
        if (m0uVar == null || this.f161255c == null || m0uVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f161259g.getItem(this.f161255c.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public Frag m181359u(int i) {
        m0u m0uVar = this.f161259g;
        if (m0uVar == null || this.f161255c == null || i >= m0uVar.getCount()) {
            return null;
        }
        Fragment item = this.f161259g.getItem(i);
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public String m181360v(int i) {
        List<LiveSquareTabBean> listM152544l = this.f161259g.m152544l();
        return (i < 0 || i >= listM152544l.size()) ? "NA" : listM152544l.get(i).getRequestName();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m181363z(int i, View view) {
        this.f161255c.setCurrentItem(i);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: p */
    public void m181355p() {
    }

    /* JADX INFO: renamed from: l.rvs$a */
    public class C19800a implements TabLayout.OnTabSelectedListener {
        public C19800a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM181360v = rvs.this.m181360v(tab.getPosition());
            if (strM181360v == null) {
                return;
            }
            rvs.this.f161254b.m108936R3(tab.getPosition());
            rvs.this.m181354O(tab, strM181360v);
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, b8c0.f74090g);
                if (rvs.this.f161261i) {
                    textView.setTextColor(-1);
                }
                if ("fakeLiveSquare".equals(strM181360v)) {
                    textView.setTextColor(-1);
                }
                if (l9s.m149076g().mo30692I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, b8c0.f74092i);
                if (rvs.this.f161261i) {
                    textView.setTextColor(uep0.m193307B("#66FFFFFF"));
                }
                String strM181360v = rvs.this.m181360v(tab.getPosition());
                if (((Boolean) rvs.this.f161254b.m151646N2(new ias())).booleanValue() && !"fakeLiveSquare".equals(strM181360v)) {
                    textView.setTextColor(rvs.this.getAct().color(g1c0.f100138B));
                }
                if (l9s.m149076g().mo30692I4()) {
                    textView.setTextSize(20.0f);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.rvs$b */
    public class C19801b implements ViewPager.InterfaceC0716j {
        public C19801b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            if (rvs.this.f161254b.m108951v3(i)) {
                rvs.this.f161253a.setTranslationX((1.0f - f) * xdl0.m208412y0());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            boolean zM108951v3 = rvs.this.f161254b.m108951v3(i);
            rvs rvsVar = rvs.this;
            if (zM108951v3) {
                rvsVar.f161254b.m108943Y3(true);
            } else if (rvsVar.f161254b.m108951v3(rvs.this.f161262j)) {
                rvs.this.f161254b.m108943Y3(false);
            }
            rvs.this.f161262j = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }
    }
}
