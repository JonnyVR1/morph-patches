package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p046p1.mobile.putong.core.newui.supreme.hometab.SupremeTabItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0014J%\u0010\u001d\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0014J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K\"\u0004\bL\u0010\u0011R\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, m87232d2 = {"Ll/qs80;", "Ll/s7m;", "Ll/ns80;", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/ns80;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Ljava/util/ArrayList;", "Ll/e1h0;", "Lkotlin/collections/ArrayList;", "list", "p", "(Ljava/util/ArrayList;)V", "", "hidden", "n", "(Z)V", "", "e", "()I", "u", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "Lv/VLinear;", "b", "Lv/VLinear;", "k", "()Lv/VLinear;", "set_root_view", "(Lv/VLinear;)V", "_root_view", "Lv/VImage;", "Lv/VImage;", "j", "()Lv/VImage;", "set_custom_setting", "(Lv/VImage;)V", "_custom_setting", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/google/android/material/tabs/TabLayout;", "set_tabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabs", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", RXScreenCaptureService.KEY_INDEX, "()Landroidx/viewpager2/widget/ViewPager2;", "set_content_pager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_content_pager", "f", "Ll/ns80;", "()Ll/ns80;", "q", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "g", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "getTabSelectedListener", "()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "tabSelectedListener", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "h", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "getAdapter", "()Landroidx/viewpager2/adapter/FragmentStateAdapter;", "adapter", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qs80 implements s7m<ns80> {

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
    public ns80 presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final TabLayout.OnTabSelectedListener tabSelectedListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final FragmentStateAdapter adapter;

    /* JADX INFO: renamed from: l.qs80$a */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/qs80$a", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19564a extends FragmentStateAdapter {
        public C19564a(PrivateCustomTabFrag privateCustomTabFrag) {
            super(privateCustomTabFrag);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: A */
        public Fragment mo4208A(int position) {
            return qs80.this.m176153f().m160765h0().get(position).getFrag();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return qs80.this.m176153f().m160765h0().size();
        }
    }

    /* JADX INFO: renamed from: l.qs80$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"l/qs80$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19565b implements TabLayout.OnTabSelectedListener {
        public C19565b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            qs80.this.m176154i().setCurrentItem(tab.getPosition());
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(qs80.this.m176153f().m160765h0(), tab.getPosition());
            pcl0 frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo36212z3(false, "pager_change");
            }
            e1h0 e1h0Var2 = (e1h0) CollectionsKt.getOrNull(qs80.this.m176153f().m160765h0(), tab.getPosition());
            boolean zEquals = "personalized".equals(e1h0Var2 != null ? e1h0Var2.getType() : null);
            qs80 qs80Var = qs80.this;
            if (zEquals) {
                xdl0.m208344M(qs80Var.m176155j(), true);
                if (qs80.this.m176153f().m160767j0() > 1) {
                    zvf0.m220396r("e_personalized_tab", "p_home_second_page");
                    return;
                }
                return;
            }
            xdl0.m208344M(qs80Var.m176155j(), false);
            if (qs80.this.m176153f().m160767j0() > 1) {
                zvf0.m220396r("e_nearby_tab", "p_home_second_page");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(qs80.this.m176153f().m160765h0(), tab.getPosition());
            Frag frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo36212z3(true, "pager_change");
            }
        }
    }

    public qs80(@NotNull PrivateCustomTabFrag privateCustomTabFrag) {
        privateCustomTabFrag.getClass();
        this.frag = privateCustomTabFrag;
        this.tabSelectedListener = new C19565b();
        this.adapter = new C19564a(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: a */
    public static void m176147a(qs80 qs80Var, View view) {
        final Act act = qs80Var.getAct();
        if (act != null) {
            if (CoreModule.f17545c.f19701y2.m155362y3() == null || !CoreModule.f17545c.f19701y2.m155362y3().hasIdealTypesSelected()) {
                act.startActivity(SupremeCustomAct.INSTANCE.m43602b(act, 2));
            } else {
                CoreModule.f17545c.f19644f2.m148607L3(act, new d30() { // from class: l.ps80
                    @Override // p149l.d30
                    public final void call() {
                        qs80.m176149m(act);
                    }
                });
            }
            zvf0.m220396r("e_personalized_set", "p_personalized_page");
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m176149m(Act act) {
        act.startActivity(SupremeCustomAct.INSTANCE.m43602b(act, 2));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m176150c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM180640b = rs80.m180640b(this, inflater, parent);
        viewM180640b.getClass();
        return viewM180640b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable ns80 presenter) {
        if (presenter != null) {
            m176160q(presenter);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m176152e() {
        if (this._content_pager != null) {
            return m176154i().getCurrentItem();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ns80 m176153f() {
        ns80 ns80Var = this.presenter;
        if (ns80Var != null) {
            return ns80Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ViewPager2 m176154i() {
        ViewPager2 viewPager2 = this._content_pager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m87502r("_content_pager");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m176150c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VImage m176155j() {
        VImage vImage = this._custom_setting;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_custom_setting");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VLinear m176156k() {
        VLinear vLinear = this._root_view;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_root_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TabLayout m176157l() {
        TabLayout tabLayout = this._tabs;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tabs");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m176158n(boolean hidden) {
        if (this._tabs != null) {
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(m176153f().m160765h0(), m176157l().getSelectedTabPosition());
            Frag frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo36212z3(hidden, "supreme_partner_tab_change");
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m176159p(@NotNull ArrayList<e1h0> list) {
        list.getClass();
        xdl0.m208344M(m176157l(), list.size() > 1);
        for (e1h0 e1h0Var : list) {
            View viewInflate = View.inflate(getContext(), k6c0.f121284B1, null);
            viewInflate.getClass();
            SupremeTabItem supremeTabItem = (SupremeTabItem) viewInflate;
            supremeTabItem.setTitle(e1h0Var.getTabName());
            TabLayout.Tab tabNewTab = m176157l().newTab();
            tabNewTab.setCustomView(supremeTabItem);
            m176157l().addTab(tabNewTab);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m176160q(@NotNull ns80 ns80Var) {
        ns80Var.getClass();
        this.presenter = ns80Var;
    }

    /* JADX INFO: renamed from: r */
    public final void m176161r() {
        xdl0.m208360X(m176156k(), xdl0.m208331F0());
        m176154i().setAdapter(this.adapter);
        m176157l().addOnTabSelectedListener(this.tabSelectedListener);
        m176154i().setUserInputEnabled(false);
        xdl0.m208329E0(m176155j(), new View.OnClickListener() { // from class: l.os80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qs80.m176147a(this.f145377a, view);
            }
        });
        m176159p(m176153f().m160765h0());
        if (xma.m210043F3() || xma.m210047L3()) {
            m176162s();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m176162s() {
        if (this._tabs == null || m176157l().getTabCount() <= 1) {
            return;
        }
        m176154i().m4250j(1, false);
        m176157l().selectTab(m176157l().getTabAt(1));
    }

    /* JADX INFO: renamed from: u */
    public final void m176163u() {
        if (this._tabs != null) {
            m176154i().m4250j(0, false);
            m176157l().selectTab(m176157l().getTabAt(0));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
