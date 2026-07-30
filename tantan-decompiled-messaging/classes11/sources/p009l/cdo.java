package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p000p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2TabView;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ddo;
import l.k6c0;
import l.s7m;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00021,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010\rJ\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010\rJ\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\tJ\u0015\u0010+\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001f\u0010F\u001a\u00060AR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006b"}, d2 = {"Ll/cdo;", "Ll/s7m;", "Ll/yco;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "", "s", "()V", "", "position", "v", "(I)V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "q", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "i", "(Ll/yco;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "u", "count", "w", "pos", "A", "x", "D1", "x1", "C", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "n", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "p", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "d", "Ll/yco;", "Ll/cdo$a;", "e", "Lkotlin/Lazy;", "j", "()Ll/cdo$a;", "adapter", "f", "I", "lastSelectedPosition", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "l", "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "z", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "h", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "k", "()Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "y", "(Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;)V", "iLikeFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "m", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "B", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "visitorFrag", "Companion", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class cdo implements s7m<yco> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag2 frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public yco presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int lastSelectedPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlMeetLikersFrag meetFrag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlILikeFrag iLikeFrag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public IntlMeetVisitorFrag visitorFrag;

    /* JADX INFO: renamed from: l.cdo$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/cdo$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Ll/cdo;Landroidx/fragment/app/Fragment;)V", "", "position", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class C0806a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ cdo f10560j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0806a(@NotNull cdo cdoVar, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f10560j = cdoVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m12540A(int position) {
            if (position == 1) {
                IntlILikeFrag intlILikeFrag = new IntlILikeFrag();
                this.f10560j.m12538y(intlILikeFrag);
                return intlILikeFrag;
            }
            if (position != 2) {
                IntlMeetLikersFrag intlMeetLikersFrag = new IntlMeetLikersFrag();
                this.f10560j.m12539z(intlMeetLikersFrag);
                return intlMeetLikersFrag;
            }
            IntlMeetVisitorFrag intlMeetVisitorFrag = new IntlMeetVisitorFrag();
            this.f10560j.m12520B(intlMeetVisitorFrag);
            return intlMeetVisitorFrag;
        }

        public int getItemCount() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: l.cdo$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"l/cdo$c", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0808c implements TabLayout.OnTabSelectedListener {
        public C0808c() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            String str;
            tab.getClass();
            if (tab.getPosition() == cdo.this.lastSelectedPosition) {
                return;
            }
            cdo.this.lastSelectedPosition = tab.getPosition();
            int position = tab.getPosition();
            if (position != 1) {
                str = position != 2 ? "e_intl_meet_tab_see" : "e_intl_meet_tab_visitor";
            } else {
                str = "e_intl_meet_like_i_sent_tab_click";
            }
            zvf0.r(str, "p_intl_meet_view");
            cdo.this.m12534v(tab.getPosition());
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public cdo(@NotNull IntlMeetFrag2 intlMeetFrag2) {
        intlMeetFrag2.getClass();
        this.frag = intlMeetFrag2;
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.ado
            public final Object invoke() {
                return cdo.m12512a(this.f9427a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C0806a m12512a(cdo cdoVar) {
        return new C0806a(cdoVar, cdoVar.frag);
    }

    /* JADX INFO: renamed from: b */
    public static void m12513b(cdo cdoVar, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            String string = cdoVar.frag.getString(R.string.v0);
            string.getClass();
            cdoVar.m12517q(string, tab);
        } else if (i == 1) {
            String string2 = cdoVar.frag.getString(R.string.Y);
            string2.getClass();
            cdoVar.m12517q(string2, tab);
        } else {
            if (i != 2) {
                return;
            }
            String string3 = cdoVar.frag.getString(R.string.a0);
            string3.getClass();
            cdoVar.m12517q(string3, tab);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m12517q(String tabText, TabLayout.Tab tab) {
        tab.setCustomView(k6c0.x);
        Object customView = tab.getCustomView();
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m3491k0(tabText);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m12518s() {
        new TabLayoutMediator(m12531n(), m12532p(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.bdo
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                cdo.m12513b(this.f10026a, tab, i);
            }
        }).attach();
        m12531n().addOnTabSelectedListener(new C0808c());
        if (IntlCountryCodeController.k()) {
            xdl0.M(m12531n(), false);
        } else {
            xdl0.M(m12531n(), true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m12519A(int pos) {
        if (pos == m12532p().getCurrentItem()) {
            return;
        }
        this.lastSelectedPosition = pos;
        m12532p().j(pos, false);
        m12534v(pos);
    }

    /* JADX INFO: renamed from: B */
    public final void m12520B(@Nullable IntlMeetVisitorFrag intlMeetVisitorFrag) {
        this.visitorFrag = intlMeetVisitorFrag;
    }

    /* JADX INFO: renamed from: C */
    public final void m12521C(int count) {
        TabLayout.Tab tabAt = m12531n().getTabAt(2);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m3490j0(count);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m12522C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m12524c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = ddo.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m12526i1(@NotNull yco presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m12524c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final C0806a m12527j() {
        return (C0806a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final IntlILikeFrag getILikeFrag() {
        return this.iLikeFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final IntlMeetLikersFrag getMeetFrag() {
        return this.meetFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final IntlMeetVisitorFrag getVisitorFrag() {
        return this.visitorFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TabLayout m12531n() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ViewPager2 m12532p() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m12533u() {
        m12532p().setAdapter(m12527j());
        m12532p().setUserInputEnabled(true);
        m12518s();
    }

    /* JADX INFO: renamed from: v */
    public final void m12534v(int position) {
        IntlMeetLikersFrag intlMeetLikersFrag = this.meetFrag;
        if (intlMeetLikersFrag != null) {
            if (!intlMeetLikersFrag.isAdded()) {
                intlMeetLikersFrag = null;
            }
            if (intlMeetLikersFrag != null) {
                intlMeetLikersFrag.onHiddenChanged(position != 0);
            }
        }
        IntlILikeFrag intlILikeFrag = this.iLikeFrag;
        if (intlILikeFrag != null) {
            if (!intlILikeFrag.isAdded()) {
                intlILikeFrag = null;
            }
            if (intlILikeFrag != null) {
                intlILikeFrag.onHiddenChanged(position != 1);
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = this.visitorFrag;
        if (intlMeetVisitorFrag != null) {
            if (!intlMeetVisitorFrag.isAdded()) {
                intlMeetVisitorFrag = null;
            }
            if (intlMeetVisitorFrag != null) {
                intlMeetVisitorFrag.onHiddenChanged(position != 2);
            }
        }
        if (position == 0) {
            CoreModule.c.E1.G3();
        }
        int tabCount = m12531n().getTabCount();
        int i = 0;
        while (i < tabCount) {
            TabLayout.Tab tabAt = m12531n().getTabAt(i);
            Object customView = tabAt != null ? tabAt.getCustomView() : null;
            IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
            if (intlMeetFrag2TabView != null) {
                intlMeetFrag2TabView.m3489i0(i == position);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12535w(int count) {
        String string;
        TabLayout.Tab tabAt = m12531n().getTabAt(0);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (count == 0) {
            string = this.frag.act().getString(R.string.t1);
            string.getClass();
        } else if (count == 1) {
            string = this.frag.act().getString(R.string.s1, " " + count + " ");
            string.getClass();
        } else {
            IntlMeetFrag2 intlMeetFrag2 = this.frag;
            if (count < 100) {
                string = intlMeetFrag2.act().getString(R.string.s1, " " + count + " ");
                string.getClass();
            } else {
                string = intlMeetFrag2.act().getString(R.string.s1, " 99+ ");
                string.getClass();
            }
        }
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m3491k0(string);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m12536x() {
        m12519A(0);
    }

    /* JADX INFO: renamed from: y */
    public final void m12538y(@Nullable IntlILikeFrag intlILikeFrag) {
        this.iLikeFrag = intlILikeFrag;
    }

    /* JADX INFO: renamed from: z */
    public final void m12539z(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m12523D1() {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12537x1() {
    }
}
