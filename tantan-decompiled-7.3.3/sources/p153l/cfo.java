package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2TabView;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00021,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010\rJ\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010\rJ\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\tJ\u0015\u0010+\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001f\u0010F\u001a\u00060AR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006b"}, m88121d2 = {"Ll/cfo;", "Ll/iam;", "Ll/yeo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "", "position", ResourceDirection.f39656v, "(I)V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "q", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/yeo;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "u", "count", "w", Constants.INAPP_POSITION, "A", BaseSei.f14624X, "D1", "x1", c4s.C_ZONE, "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "n", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "p", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", Constants.INAPP_DATA_TAG, "Ll/yeo;", "Ll/cfo$a;", "e", "Lkotlin/Lazy;", "j", "()Ll/cfo$a;", "adapter", "f", "I", "lastSelectedPosition", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "h", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "k", "()Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", BaseSei.f14625Y, "(Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;)V", "iLikeFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "m", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "B", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "visitorFrag", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cfo implements iam<yeo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag2 frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public yeo presenter;

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

    /* JADX INFO: renamed from: l.cfo$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/cfo$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Ll/cfo;Landroidx/fragment/app/Fragment;)V", "", "position", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C16244a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ cfo f81542j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16244a(@NotNull cfo cfoVar, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f81542j = cfoVar;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            if (position == 1) {
                IntlILikeFrag intlILikeFrag = new IntlILikeFrag();
                this.f81542j.m109572y(intlILikeFrag);
                return intlILikeFrag;
            }
            if (position != 2) {
                IntlMeetLikersFrag intlMeetLikersFrag = new IntlMeetLikersFrag();
                this.f81542j.m109573z(intlMeetLikersFrag);
                return intlMeetLikersFrag;
            }
            IntlMeetVisitorFrag intlMeetVisitorFrag = new IntlMeetVisitorFrag();
            this.f81542j.m109556B(intlMeetVisitorFrag);
            return intlMeetVisitorFrag;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: l.cfo$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/cfo$c", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16246c implements TabLayout.OnTabSelectedListener {
        public C16246c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String str;
            tab.getClass();
            if (tab.getPosition() == cfo.this.lastSelectedPosition) {
                return;
            }
            cfo.this.lastSelectedPosition = tab.getPosition();
            int position = tab.getPosition();
            if (position != 1) {
                str = position != 2 ? "e_intl_meet_tab_see" : "e_intl_meet_tab_visitor";
            } else {
                str = "e_intl_meet_like_i_sent_tab_click";
            }
            i4g0.m138520r(str, "p_intl_meet_view");
            cfo.this.m109568v(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public cfo(@NotNull IntlMeetFrag2 intlMeetFrag2) {
        intlMeetFrag2.getClass();
        this.frag = intlMeetFrag2;
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.afo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cfo.m109548a(this.f71027a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C16244a m109548a(cfo cfoVar) {
        return new C16244a(cfoVar, cfoVar.frag);
    }

    /* JADX INFO: renamed from: b */
    public static void m109549b(cfo cfoVar, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            String string = cfoVar.frag.getString(R$string.f21433v0);
            string.getClass();
            cfoVar.m109553q(string, tab);
        } else if (i == 1) {
            String string2 = cfoVar.frag.getString(R$string.f21365Y);
            string2.getClass();
            cfoVar.m109553q(string2, tab);
        } else {
            if (i != 2) {
                return;
            }
            String string3 = cfoVar.frag.getString(R$string.f21370a0);
            string3.getClass();
            cfoVar.m109553q(string3, tab);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m109553q(String tabText, TabLayout.Tab tab) {
        tab.setCustomView(pec0.f152052x);
        View customView = tab.getCustomView();
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m40443k0(tabText);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m109554s() {
        new TabLayoutMediator(m109565n(), m109566p(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.bfo
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                cfo.m109549b(this.f76527a, tab, i);
            }
        }).attach();
        m109565n().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16246c());
        if (IntlCountryCodeController.m29114k()) {
            bnl0.m105524M(m109565n(), false);
        } else {
            bnl0.m105524M(m109565n(), true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m109555A(int pos) {
        if (pos == m109566p().getCurrentItem()) {
            return;
        }
        this.lastSelectedPosition = pos;
        m109566p().m4252j(pos, false);
        m109568v(pos);
    }

    /* JADX INFO: renamed from: B */
    public final void m109556B(@Nullable IntlMeetVisitorFrag intlMeetVisitorFrag) {
        this.visitorFrag = intlMeetVisitorFrag;
    }

    /* JADX INFO: renamed from: C */
    public final void m109557C(int count) {
        TabLayout.Tab tabAt = m109565n().getTabAt(2);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m40442j0(count);
        }
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m109559c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM115529b = dfo.m115529b(this, inflater, parent);
        viewM115529b.getClass();
        return viewM115529b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull yeo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m109559c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final C16244a m109561j() {
        return (C16244a) this.adapter.getValue();
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
    public final TabLayout m109565n() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final ViewPager2 m109566p() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m109567u() {
        m109566p().setAdapter(m109561j());
        m109566p().setUserInputEnabled(true);
        m109554s();
    }

    /* JADX INFO: renamed from: v */
    public final void m109568v(int position) {
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
            CoreModule.f18264c.f20304E1.m109151G3();
        }
        int tabCount = m109565n().getTabCount();
        int i = 0;
        while (i < tabCount) {
            TabLayout.Tab tabAt = m109565n().getTabAt(i);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
            if (intlMeetFrag2TabView != null) {
                intlMeetFrag2TabView.m40441i0(i == position);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m109569w(int count) {
        String string;
        TabLayout.Tab tabAt = m109565n().getTabAt(0);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        IntlMeetFrag2TabView intlMeetFrag2TabView = customView instanceof IntlMeetFrag2TabView ? (IntlMeetFrag2TabView) customView : null;
        if (count == 0) {
            string = this.frag.act().getString(R$string.f21428t1);
            string.getClass();
        } else if (count == 1) {
            string = this.frag.act().getString(R$string.f21425s1, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            string.getClass();
        } else {
            IntlMeetFrag2 intlMeetFrag2 = this.frag;
            if (count < 100) {
                string = intlMeetFrag2.act().getString(R$string.f21425s1, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + count + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                string.getClass();
            } else {
                string = intlMeetFrag2.act().getString(R$string.f21425s1, " 99+ ");
                string.getClass();
            }
        }
        if (intlMeetFrag2TabView != null) {
            intlMeetFrag2TabView.m40443k0(string);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m109570x() {
        m109555A(0);
    }

    /* JADX INFO: renamed from: y */
    public final void m109572y(@Nullable IntlILikeFrag intlILikeFrag) {
        this.iLikeFrag = intlILikeFrag;
    }

    /* JADX INFO: renamed from: z */
    public final void m109573z(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m109558D1() {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: x1 */
    public final void m109571x1() {
    }
}
