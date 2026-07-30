package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p000p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p000p1.mobile.putong.core.newui.intlmeet.IntlMeetTabView;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.putong.core.member.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.k6c0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.xho;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u001f\u0010F\u001a\u00060BR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b@\u0010ER$\u0010M\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bC\u0010J\"\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006V"}, d2 = {"Ll/who;", "Ll/s7m;", "Ll/xgo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/IntlMeetAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/IntlMeetAct;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "d", "(Ll/xgo;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", "", "count", "q", "(I)V", "pos", "u", "n", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "m", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/IntlMeetAct;", "getAct", "()Lcom/p1/mobile/putong/core/newui/intlmeet/IntlMeetAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "j", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "k", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "l", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Ll/xgo;", "Ll/who$a;", "f", "Lkotlin/Lazy;", "()Ll/who$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "g", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "()Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "s", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "h", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "i", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "v", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "visitorFrag", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class who implements s7m<xgo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public xgo presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlMeetLikersFrag meetFrag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlMeetVisitorFrag visitorFrag;

    /* JADX INFO: renamed from: l.who$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/who$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/who;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1292a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ who f22127j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1292a(@NotNull who whoVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f22127j = whoVar;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m24222A(int position) {
            who whoVar = this.f22127j;
            if (position == 1) {
                whoVar.m24221v(new IntlMeetVisitorFrag());
                IntlMeetVisitorFrag visitorFrag = this.f22127j.getVisitorFrag();
                visitorFrag.getClass();
                return visitorFrag;
            }
            whoVar.m24219s(new IntlMeetLikersFrag());
            IntlMeetLikersFrag meetFrag = this.f22127j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.who$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"l/who$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1293b implements TabLayout.OnTabSelectedListener {
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            zvf0.r(tab.getPosition() == 1 ? "e_intl_meet_tab_visitor" : "e_intl_meet_tab_see", "p_intl_meet_view");
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public who(@NotNull IntlMeetAct intlMeetAct) {
        intlMeetAct.getClass();
        this.act = intlMeetAct;
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.uho
            public final Object invoke() {
                return who.m24204b(this.f21195a);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static void m24203a(who whoVar, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            whoVar.m24215m("", tab);
        } else {
            if (i != 1) {
                return;
            }
            String string = whoVar.act.getString(R.string.a0);
            string.getClass();
            whoVar.m24215m(string, tab);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1292a m24204b(who whoVar) {
        return new C1292a(whoVar, whoVar.act);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m24205C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m24206c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = xho.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m24211i1(@NotNull xgo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C1292a m24208e() {
        return (C1292a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final IntlMeetLikersFrag getMeetFrag() {
        return this.meetFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final IntlMeetVisitorFrag getVisitorFrag() {
        return this.visitorFrag;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m24206c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VNavigationBar m24212j() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TabLayout m24213k() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ViewPager2 m24214l() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m24215m(String tabText, TabLayout.Tab tab) {
        tab.setCustomView(k6c0.E);
        Object customView = tab.getCustomView();
        IntlMeetTabView intlMeetTabView = customView instanceof IntlMeetTabView ? (IntlMeetTabView) customView : null;
        if (intlMeetTabView != null) {
            intlMeetTabView.m3391i0(tabText);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m24216n() {
        xdl0.M(m24213k(), true);
        new TabLayoutMediator(m24213k(), m24214l(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.vho
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                who.m24203a(this.f21585a, tab, i);
            }
        }).attach();
        m24213k().addOnTabSelectedListener(new C1293b());
    }

    /* JADX INFO: renamed from: p */
    public final void m24217p() {
        m24212j().setLeftIconAsBack(this.act);
        xdl0.C0(m24212j().getRightIconContainer(), t100.d(44.0f));
        m24214l().setAdapter(m24208e());
        m24214l().setUserInputEnabled(false);
        m24216n();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public final void m24218q(int count) {
        TabLayout.Tab tabAt = m24213k().getTabAt(0);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        IntlMeetTabView intlMeetTabView = customView instanceof IntlMeetTabView ? (IntlMeetTabView) customView : null;
        String string = this.act.getString(R.string.Z, count > 99 ? "99+" : String.valueOf(count));
        string.getClass();
        if (intlMeetTabView != null) {
            intlMeetTabView.m3391i0(string);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24219s(@Nullable IntlMeetLikersFrag intlMeetLikersFrag) {
        this.meetFrag = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: u */
    public final void m24220u(int pos) {
        m24214l().j(pos, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m24221v(@Nullable IntlMeetVisitorFrag intlMeetVisitorFrag) {
        this.visitorFrag = intlMeetVisitorFrag;
    }

    public void destroy() {
    }
}
