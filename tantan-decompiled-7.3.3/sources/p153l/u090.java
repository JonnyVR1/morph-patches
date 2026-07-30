package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremeTabItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0014J%\u0010\u001d\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0014J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K\"\u0004\bL\u0010\u0011R\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, m88121d2 = {"Ll/u090;", "Ll/iam;", "Ll/r090;", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/r090;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Ljava/util/ArrayList;", "Ll/m9h0;", "Lkotlin/collections/ArrayList;", "list", "p", "(Ljava/util/ArrayList;)V", "", "hidden", "n", "(Z)V", "", "e", "()I", "u", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "Lv/VLinear;", "b", "Lv/VLinear;", "k", "()Lv/VLinear;", "set_root_view", "(Lv/VLinear;)V", "_root_view", "Lv/VImage;", "Lv/VImage;", "j", "()Lv/VImage;", "set_custom_setting", "(Lv/VImage;)V", "_custom_setting", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/google/android/material/tabs/TabLayout;", "set_tabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabs", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", RXScreenCaptureService.KEY_INDEX, "()Landroidx/viewpager2/widget/ViewPager2;", "set_content_pager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_content_pager", "f", "Ll/r090;", "()Ll/r090;", "q", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "g", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "getTabSelectedListener", "()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "tabSelectedListener", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "h", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "getAdapter", "()Landroidx/viewpager2/adapter/FragmentStateAdapter;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u090 implements iam<r090> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root_view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _custom_setting;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TabLayout _tabs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ViewPager2 _content_pager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public r090 presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final TabLayout.OnTabSelectedListener tabSelectedListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final FragmentStateAdapter adapter;

    /* JADX INFO: renamed from: l.u090$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/u090$a", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20438a extends FragmentStateAdapter {
        public C20438a(PrivateCustomTabFrag privateCustomTabFrag) {
            super(privateCustomTabFrag);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            return u090.this.m193798f().m179213h0().get(position).getFrag();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return u090.this.m193798f().m179213h0().size();
        }
    }

    /* JADX INFO: renamed from: l.u090$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/u090$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20439b implements TabLayout.OnTabSelectedListener {
        public C20439b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            u090.this.m193799i().setCurrentItem(tab.getPosition());
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(u090.this.m193798f().m179213h0(), tab.getPosition());
            ner frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(false, "pager_change");
            }
            m9h0 m9h0Var2 = (m9h0) CollectionsKt.getOrNull(u090.this.m193798f().m179213h0(), tab.getPosition());
            boolean zEquals = "personalized".equals(m9h0Var2 != null ? m9h0Var2.getType() : null);
            u090 u090Var = u090.this;
            if (zEquals) {
                bnl0.m105524M(u090Var.m193800j(), true);
                if (u090.this.m193798f().m179215j0() > 1) {
                    i4g0.m138520r("e_personalized_tab", "p_home_second_page");
                    return;
                }
                return;
            }
            bnl0.m105524M(u090Var.m193800j(), false);
            if (u090.this.m193798f().m179215j0() > 1) {
                i4g0.m138520r("e_nearby_tab", "p_home_second_page");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(u090.this.m193798f().m179213h0(), tab.getPosition());
            Frag frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(true, "pager_change");
            }
        }
    }

    public u090(@NotNull PrivateCustomTabFrag privateCustomTabFrag) {
        privateCustomTabFrag.getClass();
        this.frag = privateCustomTabFrag;
        this.tabSelectedListener = new C20439b();
        this.adapter = new C20438a(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: a */
    public static void m193792a(u090 u090Var, View view) {
        final Act act = u090Var.getAct();
        if (act != null) {
            if (CoreModule.f18264c.f20443y2.m216831y3() == null || !CoreModule.f18264c.f20443y2.m216831y3().hasIdealTypesSelected()) {
                act.startActivity(SupremeCustomAct.INSTANCE.m44788b(act, 2));
            } else {
                CoreModule.f18264c.f20386f2.m214435L3(act, new x20() { // from class: l.t090
                    @Override // p153l.x20
                    public final void call() {
                        u090.m193794m(act);
                    }
                });
            }
            i4g0.m138520r("e_personalized_set", "p_personalized_page");
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m193794m(Act act) {
        act.startActivity(SupremeCustomAct.INSTANCE.m44788b(act, 2));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m193795c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM198893b = v090.m198893b(this, inflater, parent);
        viewM198893b.getClass();
        return viewM198893b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable r090 presenter) {
        if (presenter != null) {
            m193805q(presenter);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m193797e() {
        if (this._content_pager != null) {
            return m193799i().getCurrentItem();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final r090 m193798f() {
        r090 r090Var = this.presenter;
        if (r090Var != null) {
            return r090Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ViewPager2 m193799i() {
        ViewPager2 viewPager2 = this._content_pager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_content_pager");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m193795c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VImage m193800j() {
        VImage vImage = this._custom_setting;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_custom_setting");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VLinear m193801k() {
        VLinear vLinear = this._root_view;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TabLayout m193802l() {
        TabLayout tabLayout = this._tabs;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabs");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m193803n(boolean hidden) {
        if (this._tabs != null) {
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(m193798f().m179213h0(), m193802l().getSelectedTabPosition());
            Frag frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(hidden, "supreme_partner_tab_change");
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m193804p(@NotNull ArrayList<m9h0> list) {
        list.getClass();
        bnl0.m105524M(m193802l(), list.size() > 1);
        for (m9h0 m9h0Var : list) {
            View viewInflate = View.inflate(getContext(), pec0.f151892B1, null);
            viewInflate.getClass();
            SupremeTabItem supremeTabItem = (SupremeTabItem) viewInflate;
            supremeTabItem.setTitle(m9h0Var.getTabName());
            TabLayout.Tab tabNewTab = m193802l().newTab();
            tabNewTab.setCustomView(supremeTabItem);
            m193802l().addTab(tabNewTab);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m193805q(@NotNull r090 r090Var) {
        r090Var.getClass();
        this.presenter = r090Var;
    }

    /* JADX INFO: renamed from: r */
    public final void m193806r() {
        bnl0.m105540X(m193801k(), bnl0.m105511F0());
        m193799i().setAdapter(this.adapter);
        m193802l().addOnTabSelectedListener(this.tabSelectedListener);
        m193799i().setUserInputEnabled(false);
        bnl0.m105509E0(m193800j(), new View.OnClickListener() { // from class: l.s090
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u090.m193792a(this.f165672a, view);
            }
        });
        m193804p(m193798f().m179213h0());
        if (joa.m146357G3() || joa.m146361M3()) {
            m193807s();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m193807s() {
        if (this._tabs == null || m193802l().getTabCount() <= 1) {
            return;
        }
        m193799i().m4252j(1, false);
        m193802l().selectTab(m193802l().getTabAt(1));
    }

    /* JADX INFO: renamed from: u */
    public final void m193808u() {
        if (this._tabs != null) {
            m193799i().m4252j(0, false);
            m193802l().selectTab(m193802l().getTabAt(0));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
