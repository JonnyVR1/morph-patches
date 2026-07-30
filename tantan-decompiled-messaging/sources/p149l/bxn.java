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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareTabView;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bxn implements s7m<qwn> {

    /* JADX INFO: renamed from: a */
    public qwn f77804a;

    /* JADX INFO: renamed from: b */
    public ViewPager f77805b;

    /* JADX INFO: renamed from: c */
    public TabLayout f77806c;

    /* JADX INFO: renamed from: d */
    public n3o f77807d;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f77809f;

    /* JADX INFO: renamed from: h */
    public d30 f77811h;

    /* JADX INFO: renamed from: i */
    public d30 f77812i;

    /* JADX INFO: renamed from: j */
    public d30 f77813j;

    /* JADX INFO: renamed from: e */
    public boolean f77808e = false;

    /* JADX INFO: renamed from: g */
    public final TabLayout.OnTabSelectedListener f77810g = new C16008a();

    public bxn(ViewPager viewPager, TabLayout tabLayout) {
        this.f77805b = viewPager;
        this.f77806c = tabLayout;
        m104336q();
    }

    /* JADX INFO: renamed from: U */
    private void m104321U(final TextView textView, int i) {
        if (NullChecker.m81303a(textView)) {
            mji0.m154821o(textView, i);
            w8u.m202211n(this.f77809f, new e30() { // from class: l.zwn
                @Override // p149l.e30
                public final void call(Object obj) {
                    textView.setTextColor(uep0.m193307B((String) obj));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m104322Y(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                zvf0.m220396r("e_live_top_tab", "p_audio_explore_recommend");
                m104347K(str, false);
            } else if ("square-multi-call".equals(tag)) {
                zvf0.m220396r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m104336q() {
        this.f77806c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16009b());
    }

    /* JADX INFO: renamed from: v */
    public static void m104337v(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(str)) {
            s9s.f163232f.m134389v(false);
        } else {
            s9s.f163232f.m134383p(false);
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m104338A(@NonNull List<BLiveSquareTab> list, @Nullable String str) {
        if (list.size() > 1 && isd.f114751b.get().booleanValue()) {
            if (!TEnum.equals(qib0.f154719h0, "unknown_")) {
                isd.f114750a.put("");
                isd.f114751b.put(Boolean.FALSE);
            }
            str = "2";
        }
        final String str2 = TextUtils.isEmpty(str) ? "2" : str;
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.axn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareTab) obj).f44441id.equals(str2));
            }
        });
        return iM200293G < 0 ? this.f77805b.getCurrentItem() : iM200293G;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m104339B(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public void m104340C(String str) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag(str);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m70372q();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m104341E() {
        View viewFindViewWithTag = this.f77806c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m70373z();
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m104342F() {
        return this.f77808e;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m104343G(List list, String str, List list2, final e30 e30Var) {
        int iM104338A = m104338A(list, str);
        if (this.f77804a.m151643H2().f135531b.isAdded()) {
            if (!w5s.m201681r0(list, list2) || this.f77807d == null) {
                FragmentManager childFragmentManager = this.f77804a.m151643H2().f135531b.getChildFragmentManager();
                x4u.m207017c(childFragmentManager);
                this.f77807d = new n3o(childFragmentManager, list, iM104338A, this.f77805b.getCurrentItem(), this.f77804a.m151642F2());
                this.f77805b.setOffscreenPageLimit(list.size());
                this.f77805b.setAdapter(this.f77807d);
                this.f77806c.setupWithViewPager(this.f77805b);
                final int i = 0;
                while (i < this.f77806c.getTabCount()) {
                    BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) list.get(i);
                    TabLayout.Tab tabAt = this.f77806c.getTabAt(i);
                    View viewM197383b = v7o.m197383b(getAct(), bLiveSquareTab);
                    xdl0.m208329E0(viewM197383b, new View.OnClickListener() { // from class: l.xwn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            e30Var.call(Integer.valueOf(i));
                        }
                    });
                    if (tabAt != null) {
                        tabAt.setCustomView(viewM197383b);
                    }
                    TextView textView = (TextView) viewM197383b.findViewById(f5c0.f95111k2);
                    m104321U(textView, i == iM104338A ? c8c0.f79743h : c8c0.f79745j);
                    textView.setAllCaps(false);
                    i++;
                }
                d30 d30Var = this.f77811h;
                if (d30Var != null) {
                    d30Var.call();
                }
                d30 d30Var2 = this.f77812i;
                if (d30Var2 != null) {
                    d30Var2.call();
                }
                d30 d30Var3 = this.f77813j;
                if (d30Var3 != null) {
                    d30Var3.call();
                }
                m104350N(list);
            }
            if (iM104338A != this.f77805b.getCurrentItem()) {
                this.f77805b.setCurrentItem(iM104338A);
            }
            m104362s();
            this.f77808e = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m104344H(int i) {
        this.f77805b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: K */
    public void m104347K(String str, boolean z) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m70368H(str, z);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m104348L(String str) {
        if (this.f77808e && l9s.m149038A(getAct())) {
            m104337v(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m104349M(boolean z) {
        this.f77806c.removeOnTabSelectedListener(this.f77810g);
    }

    /* JADX INFO: renamed from: N */
    public final void m104350N(@NonNull List<BLiveSquareTab> list) {
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(list, new w9j() { // from class: l.ywn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("square-intlGame".equals(((BLiveSquareTab) obj).name));
            }
        });
        if (bLiveSquareTab != null) {
            m104354R(bLiveSquareTab.hasRedDot || !((gl3) s9s.m182763m(gld0.f103315e)).f103290k.get().booleanValue(), list);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m104351O(final List<BLiveSquareTab> list, @NonNull final List<BLiveSquareTab> list2, @Nullable final String str, @NonNull final e30<Integer> e30Var) {
        ViewPager viewPager = this.f77805b;
        if (viewPager == null || this.f77806c == null) {
            return;
        }
        viewPager.post(new Runnable() { // from class: l.wwn
            @Override // java.lang.Runnable
            public final void run() {
                this.f188389a.m104343G(list2, str, list, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m104352P(final int i) {
        if (i >= 0) {
            e51.m114741F(this.f77804a.getAct(), new Runnable() { // from class: l.twn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172413a.m104344H(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m104353Q(int i) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag("square-intlFollowing");
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).setLiveRedDotNum(i);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m104354R(boolean z, List<BLiveSquareTab> list) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag("square-intlGame");
        if (viewFindViewWithTag == null) {
            return;
        }
        xdl0.m208344M(viewFindViewWithTag.findViewById(f5c0.f95118m1), z);
        ((hl3) s9s.m182763m(gld0.f103313c)).m131635i(Boolean.valueOf(z));
        if (z) {
            ((gl3) s9s.m182763m(gld0.f103315e)).f103290k.put(Boolean.TRUE);
            return;
        }
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(list, new w9j() { // from class: l.rwn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("square-intlGame".equals(((BLiveSquareTab) obj).name));
            }
        });
        if (bLiveSquareTab != null) {
            bLiveSquareTab.hasRedDot = false;
        }
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m104345I(final int i) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f77812i = new d30() { // from class: l.swn
                @Override // p149l.d30
                public final void call() {
                    this.f166704a.m104345I(i);
                }
            };
            return;
        }
        this.f77812i = null;
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).setLiveRedDotNum(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m104356T(int i, int i2) {
        return i | i2;
    }

    /* JADX INFO: renamed from: V */
    public void m104357V(@Nullable String str) {
        this.f77809f = str;
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m104346J(final String str, final String str2) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag == null) {
            this.f77811h = new d30() { // from class: l.uwn
                @Override // p149l.d30
                public final void call() {
                    this.f178661a.m104346J(str, str2);
                }
            };
            return;
        }
        this.f77811h = null;
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m70369M(str, str2);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m104359X(List<BLiveSquareTab> list, final String str) {
        int iM200293G;
        if (this.f77805b == null || this.f77806c == null || (iM200293G = vwb.m200293G(list, new w9j() { // from class: l.vwn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).f44441id, str));
            }
        })) < 0) {
            return;
        }
        this.f77805b.setCurrentItem(iM200293G);
    }

    /* JADX INFO: renamed from: Z */
    public void m104360Z(String str) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m70370P(str);
        }
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f77804a.getAct();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m104361r() {
        this.f77806c.addOnTabSelectedListener(this.f77810g);
        this.f77806c.setTabRippleColorResource(f1c0.f94077n);
        this.f77806c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: s */
    public void m104362s() {
        if (qib0.f154713b0.f139231b.mo30833w8(getAct())) {
            int iM104367z = m104367z();
            if (NullChecker.m81303a(s9s.f163232f)) {
                if (BLiveAbsData.VOICE_LIVE.equals(this.f77804a.m176867n3(iM104367z))) {
                    s9s.f163232f.m134389v(false);
                } else {
                    s9s.f163232f.m134383p(false);
                }
            }
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qwn qwnVar) {
        this.f77804a = qwnVar;
    }

    /* JADX INFO: renamed from: w */
    public final String m104364w(String str) {
        View viewFindViewWithTag = this.f77806c.findViewWithTag(str);
        return viewFindViewWithTag instanceof IntlLiveSquareTabView ? ((IntlLiveSquareTabView) viewFindViewWithTag).getTabID() : "";
    }

    /* JADX INFO: renamed from: x */
    public String m104365x() {
        int tabCount = this.f77806c.getTabCount();
        User userById = l9s.m149076g().getUserById(l9s.m149093o0());
        int iM104356T = 0;
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = this.f77806c.getTabAt(i);
            if (tabAt != null) {
                View customView = tabAt.getCustomView();
                if (customView instanceof IntlLiveSquareTabView) {
                    IntlLiveSquareTabView intlLiveSquareTabView = (IntlLiveSquareTabView) customView;
                    if (intlLiveSquareTabView.m70367B()) {
                        iM104356T = m104356T(iM104356T, intlLiveSquareTabView.f45858i);
                    }
                }
            }
        }
        if (userById.isFemale()) {
            if (m104339B(iM104356T, 2)) {
                return m104364w(BLiveAbsData.VOICE_LIVE);
            }
            return m104339B(iM104356T, 1) ? m104364w("square-suggested") : "";
        }
        if (m104339B(iM104356T, 1)) {
            return m104364w("square-suggested");
        }
        return m104339B(iM104356T, 2) ? m104364w(BLiveAbsData.VOICE_LIVE) : "";
    }

    /* JADX INFO: renamed from: y */
    public Frag m104366y() {
        n3o n3oVar = this.f77807d;
        if (n3oVar == null || this.f77805b == null || n3oVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f77807d.getItem(this.f77805b.getCurrentItem());
        if (item instanceof IntlLiveSquareMainSubFrag) {
            item = ((IntlLiveSquareMainSubFrag) item).m70134A5();
        }
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public int m104367z() {
        return this.f77805b.getCurrentItem();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bxn$a */
    public class C16008a implements TabLayout.OnTabSelectedListener {
        public C16008a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM176867n3 = bxn.this.f77804a.m176867n3(tab.getPosition());
            bxn.this.m104348L(strM176867n3);
            bxn.this.m104322Y(tab, strM176867n3);
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, b8c0.f74090g);
                textView.setAllCaps(false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, b8c0.f74092i);
                textView.setAllCaps(false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.bxn$b */
    public class C16009b implements TabLayout.OnTabSelectedListener {
        public C16009b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            bxn.this.f77804a.m176862H3(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
