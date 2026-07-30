package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jvs implements s7m<aus> {

    /* JADX INFO: renamed from: a */
    public aus f119973a;

    /* JADX INFO: renamed from: b */
    public ViewPager f119974b;

    /* JADX INFO: renamed from: c */
    public TabLayout f119975c;

    /* JADX INFO: renamed from: d */
    public m0u f119976d;

    /* JADX INFO: renamed from: f */
    public final View f119978f;

    /* JADX INFO: renamed from: g */
    public int f119979g;

    /* JADX INFO: renamed from: i */
    public d30 f119981i;

    /* JADX INFO: renamed from: j */
    public d30 f119982j;

    /* JADX INFO: renamed from: k */
    public int f119983k;

    /* JADX INFO: renamed from: e */
    public boolean f119977e = false;

    /* JADX INFO: renamed from: h */
    public final TabLayout.OnTabSelectedListener f119980h = new C17871a();

    public jvs(ViewPager viewPager, TabLayout tabLayout, View view) {
        this.f119974b = viewPager;
        this.f119975c = tabLayout;
        this.f119978f = view;
    }

    /* JADX INFO: renamed from: B */
    private void m143539B(String str, String str2) {
        zvf0.m220399u("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: C */
    private void m143540C(String str, String str2) {
        zvf0.m220368A("e_red_dot_live_icon", rdt.m179008c(str2), vwb.m200311Y("tooltips_type_ui", str));
    }

    /* JADX INFO: renamed from: H */
    private void m143541H(TextView textView, int i) {
        if (NullChecker.m81303a(textView)) {
            mji0.m154821o(textView, i);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m143542I(List<LiveSquareTabBean> list, int i) {
        final int i2 = 0;
        while (i2 < this.f119975c.getTabCount()) {
            LiveSquareTabBean liveSquareTabBean = list.get(i2);
            TabLayout.Tab tabAt = this.f119975c.getTabAt(i2);
            View viewM143557w = m143557w(getAct(), liveSquareTabBean);
            xdl0.m208329E0(viewM143557w, new View.OnClickListener() { // from class: l.ivs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115194a.m143560z(i2, view);
                }
            });
            if (tabAt != null) {
                tabAt.setCustomView(viewM143557w);
            }
            TextView textView = (TextView) viewM143557w.findViewById(f5c0.f95111k2);
            m143541H(textView, i2 == i ? c8c0.f79744i : c8c0.f79746k);
            if (i == this.f119973a.f71856i && i2 != i) {
                textView.setTextColor(Color.parseColor("#B2FFFFFF"));
            }
            viewM143557w.setBackgroundResource(i2 == i ? h3c0.f105687m : h3c0.f105605D1);
            i2++;
        }
    }

    /* JADX INFO: renamed from: L */
    private void m143543L(boolean z, String str, String str2) {
        if (z) {
            m143540C(str, str2);
        } else {
            m143540C(str, str2);
            m143539B(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m143544M(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                zvf0.m220396r("e_live_top_tab", "p_audio_explore_recommend");
                m143561A(str, false);
            } else if ("square-multi-call".equals(tag)) {
                zvf0.m220396r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static View m143557w(Act act, LiveSquareTabBean liveSquareTabBean) {
        View viewInflate = act.inflater().inflate(s6c0.f162792s, (ViewGroup) null);
        viewInflate.setTag(liveSquareTabBean.getPageId());
        VText vText = (VText) viewInflate.findViewById(f5c0.f95111k2);
        View viewFindViewById = viewInflate.findViewById(f5c0.f95118m1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(-15.0f);
        marginLayoutParams.topMargin = t100.m186890d(2.0f);
        marginLayoutParams.height = t100.m186890d(11.0f);
        marginLayoutParams.width = t100.m186890d(11.0f);
        viewFindViewById.setLayoutParams(marginLayoutParams);
        vText.setPadding(t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
        vText.setText(liveSquareTabBean.getName());
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m143560z(int i, View view) {
        this.f119974b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: A */
    public void m143561A(String str, boolean z) {
        View viewFindViewWithTag = this.f119975c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag != null) {
            TextView textView = (TextView) viewFindViewWithTag.findViewById(f5c0.f95122n1);
            View viewFindViewById = viewFindViewWithTag.findViewById(f5c0.f95118m1);
            if (textView != null && xdl0.m208349O0(textView)) {
                m143543L(z, "red_dot_figure", str);
            } else {
                if (viewFindViewById == null || !xdl0.m208349O0(viewFindViewById)) {
                    return;
                }
                m143543L(z, "red_dot_normal", str);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m143562E(List<LiveSquareTabBean> list) {
        if (this.f119974b == null || this.f119975c == null) {
            return;
        }
        int iM200293G = vwb.m200293G(list, new ovs());
        if (((jj3) s9s.m182763m(gld0.f103314d)).m141738c(list)) {
            ((hl3) s9s.m182763m(gld0.f103313c)).f108316i.m132487l(Boolean.TRUE);
            iM200293G = vwb.m200293G(list, new w9j() { // from class: l.hvs
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(x4u.m207026l(((LiveSquareTabBean) obj).getRequestName()));
                }
            });
        } else {
            ((hl3) s9s.m182763m(gld0.f103313c)).f108316i.m132487l(Boolean.FALSE);
        }
        if (this.f119973a.m151643H2().f135531b.isAdded()) {
            if (this.f119976d == null) {
                FragmentManager childFragmentManager = this.f119973a.m151643H2().f135531b.getChildFragmentManager();
                x4u.m207017c(childFragmentManager);
                this.f119976d = new m0u(childFragmentManager, iM200293G, this.f119974b.getCurrentItem(), this.f119973a.m151642F2());
            }
            this.f119976d.m152545m(list);
            this.f119974b.setAdapter(this.f119976d);
            d30 d30Var = this.f119981i;
            if (d30Var != null) {
                d30Var.call();
            }
            this.f119983k = iM200293G;
        }
        this.f119975c.setupWithViewPager(this.f119974b);
        m143542I(list, this.f119983k);
        this.f119974b.setOffscreenPageLimit(list.size());
        if (this.f119983k != this.f119974b.getCurrentItem()) {
            this.f119974b.setCurrentItem(this.f119983k);
        }
        m143568p();
        this.f119977e = true;
        d30 d30Var2 = this.f119982j;
        if (d30Var2 != null) {
            d30Var2.call();
        }
        if (pgi0.m168730l().m168751x()) {
            xdl0.m208344M(this.f119975c, false);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m143558x(final int i) {
        View viewFindViewWithTag = this.f119975c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f119981i = new d30() { // from class: l.dvs
                @Override // p149l.d30
                public final void call() {
                    this.f88099a.m143558x(i);
                }
            };
            return;
        }
        this.f119981i = null;
        TextView textView = (TextView) viewFindViewWithTag.findViewById(f5c0.f95122n1);
        textView.setText(String.valueOf(i));
        xdl0.m208344M(textView, i > 0);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m143559y(final boolean z) {
        View viewFindViewWithTag = this.f119975c.findViewWithTag("p_live_curated_recommend");
        if (viewFindViewWithTag == null) {
            this.f119982j = new d30() { // from class: l.gvs
                @Override // p149l.d30
                public final void call() {
                    this.f104603a.m143559y(z);
                }
            };
        } else {
            this.f119982j = null;
            xdl0.m208344M(viewFindViewWithTag.findViewById(f5c0.f95118m1), z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m143565J(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        View view = this.f119978f;
        if (zBooleanValue) {
            view.setTranslationX(xdl0.m208412y0());
        } else {
            view.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m143566K(List<LiveSquareTabBean> list, final String str) {
        if (this.f119974b == null || this.f119975c == null) {
            return;
        }
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.evs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), str));
            }
        });
        if (iM200293G >= 0) {
            this.f119974b.setCurrentItem(iM200293G);
            return;
        }
        int iM200293G2 = vwb.m200293G(list, new w9j() { // from class: l.fvs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveSquareTabBean) obj).getTabId(), "2"));
            }
        });
        if (iM200293G2 >= 0) {
            this.f119974b.setCurrentItem(iM200293G2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m143567N() {
        boolean z = false;
        for (int i = 0; i < this.f119975c.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f119975c.getTabAt(i);
            TextView textView = (TextView) tabAt.view.findViewById(f5c0.f95111k2);
            if (tabAt.isSelected()) {
                z = tabAt.getPosition() == this.f119973a.f71856i;
                if (NullChecker.m81303a(textView)) {
                    mji0.m154821o(textView, b8c0.f74091h);
                    tabAt.getCustomView().setBackgroundResource(h3c0.f105687m);
                }
            } else if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, b8c0.f74093j);
                tabAt.getCustomView().setBackgroundResource(h3c0.f105605D1);
                if (z) {
                    textView.setTextColor(Color.parseColor("#B2FFFFFF"));
                }
            }
        }
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f119973a.getAct();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(aus ausVar) {
        this.f119973a = ausVar;
    }

    /* JADX INFO: renamed from: r */
    public void m143570r() {
        this.f119975c.addOnTabSelectedListener(this.f119980h);
        this.f119975c.setTabRippleColorResource(f1c0.f94077n);
        this.f119975c.setSelectedTabIndicator(new ColorDrawable(0));
        this.f119974b.m4185d(new C17872b());
    }

    /* JADX INFO: renamed from: s */
    public LiveSquareBaseFrag m143571s() {
        m0u m0uVar = this.f119976d;
        if (m0uVar == null || this.f119974b == null || m0uVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f119976d.getItem(this.f119974b.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public Frag m143572u(int i) {
        m0u m0uVar = this.f119976d;
        if (m0uVar == null || this.f119974b == null || i >= m0uVar.getCount()) {
            return null;
        }
        Fragment item = this.f119976d.getItem(i);
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public String m143573v(int i) {
        List<LiveSquareTabBean> listM152544l = this.f119976d.m152544l();
        return (i < 0 || i >= listM152544l.size()) ? "NA" : listM152544l.get(i).getRequestName();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: p */
    public void m143568p() {
    }

    /* JADX INFO: renamed from: l.jvs$a */
    public class C17871a implements TabLayout.OnTabSelectedListener {
        public C17871a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM143573v = jvs.this.m143573v(tab.getPosition());
            if (strM143573v == null) {
                return;
            }
            jvs.this.f119973a.m99075I3(tab.getPosition());
            jvs.this.m143544M(tab, strM143573v);
            jvs.this.m143567N();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.jvs$b */
    public class C17872b implements ViewPager.InterfaceC0716j {
        public C17872b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            if (jvs.this.f119973a.m99078q3(i)) {
                jvs.this.f119978f.setTranslationX((1.0f - f) * xdl0.m208412y0());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            boolean zM99078q3 = jvs.this.f119973a.m99078q3(i);
            jvs jvsVar = jvs.this;
            if (zM99078q3) {
                jvsVar.m143565J(Boolean.TRUE);
            } else if (jvsVar.f119973a.m99078q3(jvs.this.f119979g)) {
                jvs.this.m143565J(Boolean.FALSE);
            }
            jvs.this.f119979g = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }
    }
}
