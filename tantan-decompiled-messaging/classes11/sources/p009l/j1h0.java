package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p000p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p000p1.mobile.putong.core.newui.supreme.hometab.SupremeTabItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.d30;
import l.gr9;
import l.k1h0;
import l.k6c0;
import l.s7m;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ%\u0010\"\u001a\u00020\u00072\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bK\u0010\\\"\u0004\b]\u0010\u0017R\"\u0010b\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010'R\"\u0010c\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010'R\u0017\u0010i\u001a\u00020e8\u0006¢\u0006\f\n\u0004\b>\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010n\u001a\u00020j8\u0006¢\u0006\f\n\u0004\b/\u0010k\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Ll/j1h0;", "Ll/s7m;", "Ll/l1h0;", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;)V", "", "p", "()V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "u", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "e", "(Ll/l1h0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Ljava/util/ArrayList;", "Ll/e1h0;", "Lkotlin/collections/ArrayList;", "list", "v", "(Ljava/util/ArrayList;)V", "", "hidden", "s", "(Z)V", "a", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "l", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "Lv/VLinear;", "m", "()Lv/VLinear;", "set_root_view", "(Lv/VLinear;)V", "_root_view", "Landroid/widget/FrameLayout;", "d", "Landroid/widget/FrameLayout;", "k", "()Landroid/widget/FrameLayout;", "set_custom_setting_layout", "(Landroid/widget/FrameLayout;)V", "_custom_setting_layout", "Lv/VImage;", "Lv/VImage;", "j", "()Lv/VImage;", "set_custom_setting", "(Lv/VImage;)V", "_custom_setting", "Lcom/google/android/material/tabs/TabLayout;", "f", "Lcom/google/android/material/tabs/TabLayout;", "n", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabs", "Landroidx/viewpager2/widget/ViewPager2;", "g", "Landroidx/viewpager2/widget/ViewPager2;", "i", "()Landroidx/viewpager2/widget/ViewPager2;", "set_content_pager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_content_pager", "h", "Ll/l1h0;", "()Ll/l1h0;", "w", "Z", "getShowNavigation", "()Z", "x", "showNavigation", "isFirstInit", "setFirstInit", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "getTabSelectedListener", "()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "tabSelectedListener", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "getAdapter", "()Landroidx/viewpager2/adapter/FragmentStateAdapter;", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class j1h0 implements s7m<l1h0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremePartnerTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _root_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public FrameLayout _custom_setting_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _custom_setting;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TabLayout _tabs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ViewPager2 _content_pager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public l1h0 presenter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showNavigation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isFirstInit;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TabLayout.OnTabSelectedListener tabSelectedListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final FragmentStateAdapter adapter;

    /* JADX INFO: renamed from: l.j1h0$a */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/j1h0$a", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0967a extends FragmentStateAdapter {
        public C0967a(SupremePartnerTabFrag supremePartnerTabFrag) {
            super(supremePartnerTabFrag);
        }

        /* JADX INFO: renamed from: A */
        public Fragment m16854A(int position) {
            return j1h0.this.m16840f().m17629e0().get(position).getFrag();
        }

        public int getItemCount() {
            return j1h0.this.m16840f().m17629e0().size();
        }
    }

    /* JADX INFO: renamed from: l.j1h0$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"l/j1h0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0968b implements TabLayout.OnTabSelectedListener {
        public C0968b() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            j1h0.this.m16841i().setCurrentItem(tab.getPosition());
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(j1h0.this.m16840f().m17629e0(), tab.getPosition());
            Frag frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo120z3(false, "pager_change");
            }
            e1h0 e1h0Var2 = (e1h0) CollectionsKt.getOrNull(j1h0.this.m16840f().m17629e0(), tab.getPosition());
            boolean zEquals = "personalized".equals(e1h0Var2 != null ? e1h0Var2.getCom.p1.mobile.putong.miniwidget.MiniWidgetProvider.KEY_TYPE java.lang.String() : null);
            j1h0 j1h0Var = j1h0.this;
            if (zEquals) {
                xdl0.M(j1h0Var.m16843j(), true);
            } else {
                xdl0.M(j1h0Var.m16843j(), false);
            }
            j1h0.this.m16850u(tab);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(j1h0.this.m16840f().m17629e0(), tab.getPosition());
            Frag frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo120z3(true, "pager_change");
            }
        }
    }

    public j1h0(@NotNull SupremePartnerTabFrag supremePartnerTabFrag) {
        supremePartnerTabFrag.getClass();
        this.frag = supremePartnerTabFrag;
        this.isFirstInit = true;
        this.tabSelectedListener = new C0968b();
        this.adapter = new C0967a(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: a */
    public static void m16832a(j1h0 j1h0Var, View view) {
        final Act act = j1h0Var.act();
        if (act != null) {
            if (CoreModule.c.f2.u3() == null || !CoreModule.c.f2.u3().hasIdealTypesSelected()) {
                act.startActivity(SupremeCustomAct.Companion.m7850c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
            } else {
                CoreModule.c.f2.L3(act, new d30() { // from class: l.i1h0
                    public final void call() {
                        j1h0.m16836q(act);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m16835p() {
        if (!this.showNavigation) {
            xdl0.M(m16844k(), true);
            xdl0.M(m16845l(), false);
            return;
        }
        xdl0.M(m16844k(), false);
        xdl0.M(m16845l(), true);
        m16845l().setTitle("附近的人");
        Act act = act();
        if (act != null) {
            m16845l().setLeftIconAsBack(act);
        }
        m16845l().setLeftIconResource(b3c0.b);
        m16845l().setRightIconClip(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m16836q(Act act) {
        act.startActivity(SupremeCustomAct.Companion.m7850c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16837C0() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m16838c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = k1h0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m16842i1(@Nullable l1h0 presenter) {
        if (presenter != null) {
            m16852w(presenter);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final l1h0 m16840f() {
        l1h0 l1h0Var = this.presenter;
        if (l1h0Var != null) {
            return l1h0Var;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ViewPager2 m16841i() {
        ViewPager2 viewPager2 = this._content_pager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_content_pager");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m16838c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VImage m16843j() {
        VImage vImage = this._custom_setting;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_custom_setting");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final FrameLayout m16844k() {
        FrameLayout frameLayout = this._custom_setting_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_custom_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VNavigationBar m16845l() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VLinear m16846m() {
        VLinear vLinear = this._root_view;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TabLayout m16847n() {
        TabLayout tabLayout = this._tabs;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tabs");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m16848r() {
        m16835p();
        if (CoreModule.P().g().Ki() && !gr9.Companion.c()) {
            xdl0.M(m16847n(), false);
        }
        xdl0.X(m16846m(), xdl0.F0());
        m16841i().setAdapter(this.adapter);
        m16847n().addOnTabSelectedListener(this.tabSelectedListener);
        m16841i().setUserInputEnabled(false);
        xdl0.E0(m16843j(), new View.OnClickListener() { // from class: l.h1h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j1h0.m16832a(this.f13840a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m16849s(boolean hidden) {
        if (this._tabs != null) {
            e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(m16840f().m17629e0(), m16847n().getSelectedTabPosition());
            Frag frag = e1h0Var != null ? e1h0Var.getFrag() : null;
            t3m t3mVar = frag instanceof t3m ? (t3m) frag : null;
            if (t3mVar != null) {
                t3mVar.mo120z3(hidden, "supreme_partner_tab_change");
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m16850u(TabLayout.Tab tab) {
        e1h0 e1h0Var = (e1h0) CollectionsKt.getOrNull(m16840f().m17629e0(), tab.getPosition());
        if (!Intrinsics.d("nearby", e1h0Var != null ? e1h0Var.getCom.p1.mobile.putong.miniwidget.MiniWidgetProvider.KEY_TYPE java.lang.String() : null)) {
            e1h0 e1h0Var2 = (e1h0) CollectionsKt.getOrNull(m16840f().m17629e0(), tab.getPosition());
            if (Intrinsics.d("online_zone", e1h0Var2 != null ? e1h0Var2.getCom.p1.mobile.putong.miniwidget.MiniWidgetProvider.KEY_TYPE java.lang.String() : null)) {
                zvf0.r("e_nearby_tab_online", "p_suggest_nearby");
                return;
            }
            return;
        }
        if (!Intrinsics.d("from_nearby_act", this.frag.getFrom())) {
            zvf0.r("e_nearby_tab_distance", "p_suggest_nearby");
        } else if (this.isFirstInit) {
            this.isFirstInit = false;
        } else {
            zvf0.r("e_nearby_tab_distance", "p_suggest_nearby");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m16851v(@NotNull ArrayList<e1h0> list) {
        list.getClass();
        for (e1h0 e1h0Var : list) {
            View viewInflate = View.inflate(m16837C0(), k6c0.B1, null);
            viewInflate.getClass();
            SupremeTabItem supremeTabItem = (SupremeTabItem) viewInflate;
            supremeTabItem.setTitle(e1h0Var.getTabName());
            TabLayout.Tab tabNewTab = m16847n().newTab();
            tabNewTab.setCustomView(supremeTabItem);
            m16847n().addTab(tabNewTab);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16852w(@NotNull l1h0 l1h0Var) {
        l1h0Var.getClass();
        this.presenter = l1h0Var;
    }

    /* JADX INFO: renamed from: x */
    public final void m16853x(boolean z) {
        this.showNavigation = z;
    }

    public void destroy() {
    }
}
