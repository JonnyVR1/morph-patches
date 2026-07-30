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
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareTabView;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class bzn implements iam<qyn> {

    /* JADX INFO: renamed from: a */
    public qyn f79157a;

    /* JADX INFO: renamed from: b */
    public ViewPager f79158b;

    /* JADX INFO: renamed from: c */
    public TabLayout f79159c;

    /* JADX INFO: renamed from: d */
    public n5o f79160d;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f79162f;

    /* JADX INFO: renamed from: h */
    public x20 f79164h;

    /* JADX INFO: renamed from: i */
    public x20 f79165i;

    /* JADX INFO: renamed from: j */
    public x20 f79166j;

    /* JADX INFO: renamed from: e */
    public boolean f79161e = false;

    /* JADX INFO: renamed from: g */
    public final TabLayout.OnTabSelectedListener f79163g = new C16144a();

    public bzn(ViewPager viewPager, TabLayout tabLayout) {
        this.f79158b = viewPager;
        this.f79159c = tabLayout;
        m107205q();
    }

    /* JADX INFO: renamed from: U */
    private void m107190U(final TextView textView, int i) {
        if (NullChecker.m82486a(textView)) {
            msi0.m159817o(textView, i);
            xau.m209904n(this.f79162f, new y20() { // from class: l.zyn
                @Override // p153l.y20
                public final void call(Object obj) {
                    textView.setTextColor(ynp0.m216917B((String) obj));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m107191Y(TabLayout.Tab tab, String str) {
        if (tab.getCustomView() != null) {
            Object tag = tab.getCustomView().getTag();
            if ("square-suggested".equals(tag)) {
                i4g0.m138520r("e_live_top_tab", "p_audio_explore_recommend");
                m107216K(str, false);
            } else if ("square-multi-call".equals(tag)) {
                i4g0.m138520r("e_video_room_top_tab", "p_audio_explore_recommend");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m107205q() {
        this.f79159c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16145b());
    }

    /* JADX INFO: renamed from: v */
    public static void m107206v(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(str)) {
            tbs.f172993f.m143720v(false);
        } else {
            tbs.f172993f.m143714p(false);
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m107207A(@NonNull List<BLiveSquareTab> list, @Nullable String str) {
        if (list.size() > 1 && wtd.f190739b.get().booleanValue()) {
            if (!TEnum.equals(uqb0.f180402h0, "unknown_")) {
                wtd.f190738a.put("");
                wtd.f190739b.put(Boolean.FALSE);
            }
            str = "2";
        }
        final String str2 = TextUtils.isEmpty(str) ? "2" : str;
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.azn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareTab) obj).f45289id.equals(str2));
            }
        });
        return iM147476G < 0 ? this.f79158b.getCurrentItem() : iM147476G;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m107208B(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public void m107209C(String str) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag(str);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m71555q();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m107210E() {
        View viewFindViewWithTag = this.f79159c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m71556z();
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m107211F() {
        return this.f79161e;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m107212G(List list, String str, List list2, final y20 y20Var) {
        int iM107207A = m107207A(list, str);
        if (this.f79157a.m160239H2().f143738b.isAdded()) {
            if (!x7s.m209645r0(list, list2) || this.f79160d == null) {
                FragmentManager childFragmentManager = this.f79157a.m160239H2().f143738b.getChildFragmentManager();
                y6u.m214499c(childFragmentManager);
                this.f79160d = new n5o(childFragmentManager, list, iM107207A, this.f79158b.getCurrentItem(), this.f79157a.m160238F2());
                this.f79158b.setOffscreenPageLimit(list.size());
                this.f79158b.setAdapter(this.f79160d);
                this.f79159c.setupWithViewPager(this.f79158b);
                final int i = 0;
                while (i < this.f79159c.getTabCount()) {
                    BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) list.get(i);
                    TabLayout.Tab tabAt = this.f79159c.getTabAt(i);
                    View viewM200452b = v9o.m200452b(getAct(), bLiveSquareTab);
                    bnl0.m105509E0(viewM200452b, new View.OnClickListener() { // from class: l.xyn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            y20Var.call(Integer.valueOf(i));
                        }
                    });
                    if (tabAt != null) {
                        tabAt.setCustomView(viewM200452b);
                    }
                    TextView textView = (TextView) viewM200452b.findViewById(ldc0.f131568k2);
                    m107190U(textView, i == iM107207A ? hgc0.f109391h : hgc0.f109393j);
                    textView.setAllCaps(false);
                    i++;
                }
                x20 x20Var = this.f79164h;
                if (x20Var != null) {
                    x20Var.call();
                }
                x20 x20Var2 = this.f79165i;
                if (x20Var2 != null) {
                    x20Var2.call();
                }
                x20 x20Var3 = this.f79166j;
                if (x20Var3 != null) {
                    x20Var3.call();
                }
                m107219N(list);
            }
            if (iM107207A != this.f79158b.getCurrentItem()) {
                this.f79158b.setCurrentItem(iM107207A);
            }
            m107231s();
            this.f79161e = true;
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m107213H(int i) {
        this.f79158b.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: K */
    public void m107216K(String str, boolean z) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m71551H(str, z);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m107217L(String str) {
        if (this.f79161e && mbs.m157815A(getAct())) {
            m107206v(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m107218M(boolean z) {
        this.f79159c.removeOnTabSelectedListener(this.f79163g);
    }

    /* JADX INFO: renamed from: N */
    public final void m107219N(@NonNull List<BLiveSquareTab> list) {
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(list, new qcj() { // from class: l.yyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("square-intlGame".equals(((BLiveSquareTab) obj).name));
            }
        });
        if (bLiveSquareTab != null) {
            m107223R(bLiveSquareTab.hasRedDot || !((fm3) tbs.m190077m(itd0.f116823e)).f99721k.get().booleanValue(), list);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m107220O(final List<BLiveSquareTab> list, @NonNull final List<BLiveSquareTab> list2, @Nullable final String str, @NonNull final y20<Integer> y20Var) {
        ViewPager viewPager = this.f79158b;
        if (viewPager == null || this.f79159c == null) {
            return;
        }
        viewPager.post(new Runnable() { // from class: l.wyn
            @Override // java.lang.Runnable
            public final void run() {
                this.f191665a.m107212G(list2, str, list, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m107221P(final int i) {
        if (i >= 0) {
            l51.m152886F(this.f79157a.getAct(), new Runnable() { // from class: l.tyn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176688a.m107213H(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m107222Q(int i) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag("square-intlFollowing");
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).setLiveRedDotNum(i);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m107223R(boolean z, List<BLiveSquareTab> list) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag("square-intlGame");
        if (viewFindViewWithTag == null) {
            return;
        }
        bnl0.m105524M(viewFindViewWithTag.findViewById(ldc0.f131575m1), z);
        ((gm3) tbs.m190077m(itd0.f116821c)).m130734i(Boolean.valueOf(z));
        if (z) {
            ((fm3) tbs.m190077m(itd0.f116823e)).f99721k.put(Boolean.TRUE);
            return;
        }
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(list, new qcj() { // from class: l.ryn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("square-intlGame".equals(((BLiveSquareTab) obj).name));
            }
        });
        if (bLiveSquareTab != null) {
            bLiveSquareTab.hasRedDot = false;
        }
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m107214I(final int i) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag("square-suggested");
        if (viewFindViewWithTag == null) {
            this.f79165i = new x20() { // from class: l.syn
                @Override // p153l.x20
                public final void call() {
                    this.f171277a.m107214I(i);
                }
            };
            return;
        }
        this.f79165i = null;
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).setLiveRedDotNum(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m107225T(int i, int i2) {
        return i | i2;
    }

    /* JADX INFO: renamed from: V */
    public void m107226V(@Nullable String str) {
        this.f79162f = str;
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m107215J(final String str, final String str2) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag == null) {
            this.f79164h = new x20() { // from class: l.uyn
                @Override // p153l.x20
                public final void call() {
                    this.f181645a.m107215J(str, str2);
                }
            };
            return;
        }
        this.f79164h = null;
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m71552M(str, str2);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m107228X(List<BLiveSquareTab> list, final String str) {
        int iM147476G;
        if (this.f79158b == null || this.f79159c == null || (iM147476G = jyb.m147476G(list, new qcj() { // from class: l.vyn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).f45289id, str));
            }
        })) < 0) {
            return;
        }
        this.f79158b.setCurrentItem(iM147476G);
    }

    /* JADX INFO: renamed from: Z */
    public void m107229Z(String str) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag(BLiveAbsData.VOICE_LIVE);
        if (viewFindViewWithTag instanceof IntlLiveSquareTabView) {
            ((IntlLiveSquareTabView) viewFindViewWithTag).m71553P(str);
        }
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f79157a.getAct();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m107230r() {
        this.f79159c.addOnTabSelectedListener(this.f79163g);
        this.f79159c.setTabRippleColorResource(l9c0.f130601n);
        this.f79159c.setSelectedTabIndicator(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: s */
    public void m107231s() {
        if (uqb0.f180396b0.f170325b.mo31836w8(getAct())) {
            int iM107236z = m107236z();
            if (NullChecker.m82486a(tbs.f172993f)) {
                if (BLiveAbsData.VOICE_LIVE.equals(this.f79157a.m178709n3(iM107236z))) {
                    tbs.f172993f.m143720v(false);
                } else {
                    tbs.f172993f.m143714p(false);
                }
            }
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qyn qynVar) {
        this.f79157a = qynVar;
    }

    /* JADX INFO: renamed from: w */
    public final String m107233w(String str) {
        View viewFindViewWithTag = this.f79159c.findViewWithTag(str);
        return viewFindViewWithTag instanceof IntlLiveSquareTabView ? ((IntlLiveSquareTabView) viewFindViewWithTag).getTabID() : "";
    }

    /* JADX INFO: renamed from: x */
    public String m107234x() {
        int tabCount = this.f79159c.getTabCount();
        User userById = mbs.m157853g().getUserById(mbs.m157870o0());
        int iM107225T = 0;
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = this.f79159c.getTabAt(i);
            if (tabAt != null) {
                View customView = tabAt.getCustomView();
                if (customView instanceof IntlLiveSquareTabView) {
                    IntlLiveSquareTabView intlLiveSquareTabView = (IntlLiveSquareTabView) customView;
                    if (intlLiveSquareTabView.m71550B()) {
                        iM107225T = m107225T(iM107225T, intlLiveSquareTabView.f46706i);
                    }
                }
            }
        }
        if (userById.isFemale()) {
            if (m107208B(iM107225T, 2)) {
                return m107233w(BLiveAbsData.VOICE_LIVE);
            }
            return m107208B(iM107225T, 1) ? m107233w("square-suggested") : "";
        }
        if (m107208B(iM107225T, 1)) {
            return m107233w("square-suggested");
        }
        return m107208B(iM107225T, 2) ? m107233w(BLiveAbsData.VOICE_LIVE) : "";
    }

    /* JADX INFO: renamed from: y */
    public Frag m107235y() {
        n5o n5oVar = this.f79160d;
        if (n5oVar == null || this.f79158b == null || n5oVar.getCount() < 1) {
            return null;
        }
        Fragment item = this.f79160d.getItem(this.f79158b.getCurrentItem());
        if (item instanceof IntlLiveSquareMainSubFrag) {
            item = ((IntlLiveSquareMainSubFrag) item).m71317A5();
        }
        if (item instanceof LiveSquareBaseFrag) {
            return (LiveSquareBaseFrag) item;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public int m107236z() {
        return this.f79158b.getCurrentItem();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bzn$a */
    public class C16144a implements TabLayout.OnTabSelectedListener {
        public C16144a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String strM178709n3 = bzn.this.f79157a.m178709n3(tab.getPosition());
            bzn.this.m107217L(strM178709n3);
            bzn.this.m107191Y(tab, strM178709n3);
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, ggc0.f104009g);
                textView.setAllCaps(false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, ggc0.f104011i);
                textView.setAllCaps(false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.bzn$b */
    public class C16145b implements TabLayout.OnTabSelectedListener {
        public C16145b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            bzn.this.f79157a.m178704H3(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
