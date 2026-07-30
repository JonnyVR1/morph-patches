package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomAct;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremeTabItem;
import com.p051p1.mobile.putong.data.ResourceDirection;
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
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ%\u0010\"\u001a\u00020\u00072\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bK\u0010\\\"\u0004\b]\u0010\u0017R\"\u0010b\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010'R\"\u0010c\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010'R\u0017\u0010i\u001a\u00020e8\u0006¢\u0006\f\n\u0004\b>\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010n\u001a\u00020j8\u0006¢\u0006\f\n\u0004\b/\u0010k\u001a\u0004\bl\u0010m¨\u0006o"}, m88121d2 = {"Ll/r9h0;", "Ll/iam;", "Ll/t9h0;", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;)V", "", "p", "()V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "u", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "e", "(Ll/t9h0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Ljava/util/ArrayList;", "Ll/m9h0;", "Lkotlin/collections/ArrayList;", "list", ResourceDirection.f39656v, "(Ljava/util/ArrayList;)V", "", "hidden", BLiveStormDanmakuGiftResourceType.f45294s, "(Z)V", "a", "Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "Lv/VLinear;", "m", "()Lv/VLinear;", "set_root_view", "(Lv/VLinear;)V", "_root_view", "Landroid/widget/FrameLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/FrameLayout;", "k", "()Landroid/widget/FrameLayout;", "set_custom_setting_layout", "(Landroid/widget/FrameLayout;)V", "_custom_setting_layout", "Lv/VImage;", "Lv/VImage;", "j", "()Lv/VImage;", "set_custom_setting", "(Lv/VImage;)V", "_custom_setting", "Lcom/google/android/material/tabs/TabLayout;", "f", "Lcom/google/android/material/tabs/TabLayout;", "n", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabs", "Landroidx/viewpager2/widget/ViewPager2;", "g", "Landroidx/viewpager2/widget/ViewPager2;", RXScreenCaptureService.KEY_INDEX, "()Landroidx/viewpager2/widget/ViewPager2;", "set_content_pager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_content_pager", "h", "Ll/t9h0;", "()Ll/t9h0;", "w", "Z", "getShowNavigation", "()Z", BaseSei.f14624X, "showNavigation", "isFirstInit", "setFirstInit", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "getTabSelectedListener", "()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "tabSelectedListener", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "getAdapter", "()Landroidx/viewpager2/adapter/FragmentStateAdapter;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class r9h0 implements iam<t9h0> {

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
    public t9h0 presenter;

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

    /* JADX INFO: renamed from: l.r9h0$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/r9h0$a", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19793a extends FragmentStateAdapter {
        public C19793a(SupremePartnerTabFrag supremePartnerTabFrag) {
            super(supremePartnerTabFrag);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            return r9h0.this.m180583f().m189754e0().get(position).getFrag();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return r9h0.this.m180583f().m189754e0().size();
        }
    }

    /* JADX INFO: renamed from: l.r9h0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/r9h0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19794b implements TabLayout.OnTabSelectedListener {
        public C19794b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            r9h0.this.m180584i().setCurrentItem(tab.getPosition());
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(r9h0.this.m180583f().m189754e0(), tab.getPosition());
            ner frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(false, "pager_change");
            }
            m9h0 m9h0Var2 = (m9h0) CollectionsKt.getOrNull(r9h0.this.m180583f().m189754e0(), tab.getPosition());
            boolean zEquals = "personalized".equals(m9h0Var2 != null ? m9h0Var2.getType() : null);
            r9h0 r9h0Var = r9h0.this;
            if (zEquals) {
                bnl0.m105524M(r9h0Var.m180585j(), true);
            } else {
                bnl0.m105524M(r9h0Var.m180585j(), false);
            }
            r9h0.this.m180592u(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(r9h0.this.m180583f().m189754e0(), tab.getPosition());
            Frag frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(true, "pager_change");
            }
        }
    }

    public r9h0(@NotNull SupremePartnerTabFrag supremePartnerTabFrag) {
        supremePartnerTabFrag.getClass();
        this.frag = supremePartnerTabFrag;
        this.isFirstInit = true;
        this.tabSelectedListener = new C19794b();
        this.adapter = new C19793a(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: a */
    public static void m180576a(r9h0 r9h0Var, View view) {
        final Act act = r9h0Var.getAct();
        if (act != null) {
            if (CoreModule.f18264c.f20386f2.m214441u3() == null || !CoreModule.f18264c.f20386f2.m214441u3().hasIdealTypesSelected()) {
                act.startActivity(SupremeCustomAct.Companion.m44786c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
            } else {
                CoreModule.f18264c.f20386f2.m214435L3(act, new x20() { // from class: l.q9h0
                    @Override // p153l.x20
                    public final void call() {
                        r9h0.m180580q(act);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m180579p() {
        if (!this.showNavigation) {
            bnl0.m105524M(m180586k(), true);
            bnl0.m105524M(m180587l(), false);
            return;
        }
        bnl0.m105524M(m180586k(), false);
        bnl0.m105524M(m180587l(), true);
        m180587l().setTitle("附近的人");
        Act act = getAct();
        if (act != null) {
            m180587l().setLeftIconAsBack(act);
        }
        m180587l().setLeftIconResource(gbc0.f103261b);
        m180587l().setRightIconClip(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m180580q(Act act) {
        act.startActivity(SupremeCustomAct.Companion.m44786c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m180581c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185179b = s9h0.m185179b(this, inflater, parent);
        viewM185179b.getClass();
        return viewM185179b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable t9h0 presenter) {
        if (presenter != null) {
            m180594w(presenter);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final t9h0 m180583f() {
        t9h0 t9h0Var = this.presenter;
        if (t9h0Var != null) {
            return t9h0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ViewPager2 m180584i() {
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
        return m180581c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VImage m180585j() {
        VImage vImage = this._custom_setting;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_custom_setting");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final FrameLayout m180586k() {
        FrameLayout frameLayout = this._custom_setting_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_custom_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VNavigationBar m180587l() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VLinear m180588m() {
        VLinear vLinear = this._root_view;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TabLayout m180589n() {
        TabLayout tabLayout = this._tabs;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabs");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m180590r() {
        m180579p();
        if (CoreModule.m30933P().m143410g().mo36020Ki() && !rs9.INSTANCE.m182943c()) {
            bnl0.m105524M(m180589n(), false);
        }
        bnl0.m105540X(m180588m(), bnl0.m105511F0());
        m180584i().setAdapter(this.adapter);
        m180589n().addOnTabSelectedListener(this.tabSelectedListener);
        m180584i().setUserInputEnabled(false);
        bnl0.m105509E0(m180585j(), new View.OnClickListener() { // from class: l.p9h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9h0.m180576a(this.f151159a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m180591s(boolean hidden) {
        if (this._tabs != null) {
            m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(m180583f().m189754e0(), m180589n().getSelectedTabPosition());
            Frag frag = m9h0Var != null ? m9h0Var.getFrag() : null;
            k6m k6mVar = frag instanceof k6m ? (k6m) frag : null;
            if (k6mVar != null) {
                k6mVar.mo37215z3(hidden, "supreme_partner_tab_change");
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m180592u(TabLayout.Tab tab) {
        m9h0 m9h0Var = (m9h0) CollectionsKt.getOrNull(m180583f().m189754e0(), tab.getPosition());
        if (!Intrinsics.m88377d("nearby", m9h0Var != null ? m9h0Var.getType() : null)) {
            m9h0 m9h0Var2 = (m9h0) CollectionsKt.getOrNull(m180583f().m189754e0(), tab.getPosition());
            if (Intrinsics.m88377d("online_zone", m9h0Var2 != null ? m9h0Var2.getType() : null)) {
                i4g0.m138520r("e_nearby_tab_online", "p_suggest_nearby");
                return;
            }
            return;
        }
        if (!Intrinsics.m88377d("from_nearby_act", this.frag.getFrom())) {
            i4g0.m138520r("e_nearby_tab_distance", "p_suggest_nearby");
        } else if (this.isFirstInit) {
            this.isFirstInit = false;
        } else {
            i4g0.m138520r("e_nearby_tab_distance", "p_suggest_nearby");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m180593v(@NotNull ArrayList<m9h0> list) {
        list.getClass();
        for (m9h0 m9h0Var : list) {
            View viewInflate = View.inflate(getContext(), pec0.f151892B1, null);
            viewInflate.getClass();
            SupremeTabItem supremeTabItem = (SupremeTabItem) viewInflate;
            supremeTabItem.setTitle(m9h0Var.getTabName());
            TabLayout.Tab tabNewTab = m180589n().newTab();
            tabNewTab.setCustomView(supremeTabItem);
            m180589n().addTab(tabNewTab);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m180594w(@NotNull t9h0 t9h0Var) {
        t9h0Var.getClass();
        this.presenter = t9h0Var;
    }

    /* JADX INFO: renamed from: x */
    public final void m180595x(boolean z) {
        this.showNavigation = z;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
