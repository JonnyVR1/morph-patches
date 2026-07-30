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
import com.p000p1.mobile.putong.core.newui.newmeet.NewMeetAct;
import com.p000p1.mobile.putong.core.newui.newmeet.NewMeetTabItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFrag;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.e51;
import l.ew40;
import l.k6c0;
import l.rj30;
import l.s7m;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\tJ\u001d\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020$¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0019R\"\u0010U\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\"R\"\u0010Y\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010\"R\"\u0010]\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010Q\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010\"R\"\u0010d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001f\u0010i\u001a\u00060eR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bP\u0010hR$\u0010o\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010k\u001a\u0004\b^\u0010l\"\u0004\bm\u0010nR$\u0010u\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010q\u001a\u0004\bf\u0010r\"\u0004\bs\u0010t¨\u0006v"}, d2 = {"Ll/oj30;", "Ll/s7m;", "Ll/kj30;", "Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;)V", "", "u", "()V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "s", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "d", "(Ll/kj30;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "open", "A", "(Z)V", "v", "", "tabIndex", "show", "G", "(IZ)V", "w", "(I)Z", "totalCount", "newCount", "x", "(II)V", "pos", "F", "(I)V", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", "e", "()Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "n", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "p", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "q", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "Ll/kj30;", "getPresenter", "()Ll/kj30;", "B", "f", "Z", "l", "()Z", "C", "showPurchaseFirst", "g", "m", "E", "showPurchasePage", "h", "k", "setODiamondWeeklyReportOpenState", "oDiamondWeeklyReportOpenState", "i", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "Ll/oj30$a;", "j", "Lkotlin/Lazy;", "()Ll/oj30$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "y", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "z", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "oDiamondFrag", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oj30 implements s7m<kj30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewMeetAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public kj30 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showPurchaseFirst;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean showPurchasePage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean oDiamondWeeklyReportOpenState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String from;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public NewMeetFrag meetFrag;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ODiamondFrag oDiamondFrag;

    /* JADX INFO: renamed from: l.oj30$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/oj30$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/oj30;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1080a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ oj30 f18098j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1080a(@NotNull oj30 oj30Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f18098j = oj30Var;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m19849A(int position) {
            oj30 oj30Var = this.f18098j;
            if (position == 1) {
                oj30Var.m19848z(ODiamondFrag.Companion.m7232b(ODiamondFrag.INSTANCE, oj30Var.getODiamondWeeklyReportOpenState(), null, 2, null));
                ODiamondFrag oDiamondFrag = this.f18098j.getODiamondFrag();
                oDiamondFrag.getClass();
                return oDiamondFrag;
            }
            oj30Var.m19847y(NewMeetFrag.INSTANCE.m7166a(oj30Var.getAct().getIntent()));
            NewMeetFrag meetFrag = this.f18098j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.oj30$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/oj30$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1081b extends ViewPager2.i {
        public C1081b() {
        }

        /* JADX INFO: renamed from: a */
        public static void m19850a(oj30 oj30Var) {
            oj30Var.m19830G(1, false);
        }

        /* JADX INFO: renamed from: b */
        public static void m19851b(oj30 oj30Var) {
            oj30Var.m19830G(1, false);
        }

        public void onPageSelected(int position) {
            if (!oj30.this.getShowPurchaseFirst()) {
                oj30.this.m19826C(true);
                return;
            }
            if (position == 0 && !CoreModule.P().g().Fs()) {
                CoreModule.P().a().Gd(oj30.this.act(), "p_meet_view,e_popup,click", Privilege.see_who_likes_me, (PurchaseType) null, (e30) null, -1, (d30) null, (d30) null, (String) null, (Object) null, oj30.this.getShowPurchasePage());
                oj30.this.m19828E(false);
            } else if (position == 1 && !ew40.j()) {
                CoreModule.P().a().wh(oj30.this.getAct(), "p_diamond_tab,e_popup,click", (e30) null, (d30) null, (d30) null, Privilege.oDiamondVisitor);
                PutongMvpAct act = oj30.this.getAct();
                final oj30 oj30Var = oj30.this;
                e51.H(act, new Runnable() { // from class: l.pj30
                    @Override // java.lang.Runnable
                    public final void run() {
                        oj30.C1081b.m19851b(oj30Var);
                    }
                }, 1000L);
            } else if (position == 1) {
                PutongMvpAct act2 = oj30.this.getAct();
                final oj30 oj30Var2 = oj30.this;
                e51.H(act2, new Runnable() { // from class: l.qj30
                    @Override // java.lang.Runnable
                    public final void run() {
                        oj30.C1081b.m19850a(oj30Var2);
                    }
                }, 1000L);
            }
            if (position == 1) {
                CoreModule.c.m1.M5();
            }
        }
    }

    public oj30(@NotNull NewMeetAct newMeetAct) {
        newMeetAct.getClass();
        this.act = newMeetAct;
        this.showPurchaseFirst = true;
        this.showPurchasePage = true;
        this.from = "";
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.mj30
            public final Object invoke() {
                return oj30.m19820a(this.f16965a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C1080a m19820a(oj30 oj30Var) {
        return new C1080a(oj30Var, oj30Var.act);
    }

    /* JADX INFO: renamed from: b */
    public static void m19821b(oj30 oj30Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            oj30Var.m19822s("喜欢的人", tab);
        } else {
            oj30Var.m19822s("谁看过我", tab);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m19822s(String tabText, TabLayout.Tab tab) {
        View viewInflate = o7r.m19649a(this.act).inflate(k6c0.F0, (ViewGroup) null);
        viewInflate.getClass();
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) viewInflate;
        newMeetTabItemView.m6933e(tabText);
        tab.setCustomView(newMeetTabItemView);
    }

    /* JADX INFO: renamed from: u */
    private final void m19823u() {
        xdl0.M(m19842p(), true);
        new TabLayoutMediator(m19842p(), m19843q(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.nj30
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                oj30.m19821b(this.f17498a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: A */
    public final void m19824A(boolean open) {
        this.oDiamondWeeklyReportOpenState = open;
    }

    /* JADX INFO: renamed from: B */
    public final void m19825B(@NotNull kj30 kj30Var) {
        kj30Var.getClass();
        this.presenter = kj30Var;
    }

    /* JADX INFO: renamed from: C */
    public final void m19826C(boolean z) {
        this.showPurchaseFirst = z;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m19827C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m19828E(boolean z) {
        this.showPurchasePage = z;
    }

    /* JADX INFO: renamed from: F */
    public final void m19829F(int pos) {
        m19843q().setCurrentItem(pos);
    }

    /* JADX INFO: renamed from: G */
    public final void m19830G(int tabIndex, boolean show) {
        TabLayout.Tab tabAt = m19842p().getTabAt(tabIndex);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            newMeetTabItemView.m6934f(show);
            if (show) {
                return;
            }
            newMeetTabItemView.m6930b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m19831c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = rj30.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m19836i1(@NotNull kj30 presenter) {
        presenter.getClass();
        m19825B(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final NewMeetAct getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C1080a m19834f() {
        return (C1080a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final NewMeetFrag getMeetFrag() {
        return this.meetFrag;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m19831c(inflater, parent);
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ODiamondFrag getODiamondFrag() {
        return this.oDiamondFrag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getODiamondWeeklyReportOpenState() {
        return this.oDiamondWeeklyReportOpenState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowPurchaseFirst() {
        return this.showPurchaseFirst;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowPurchasePage() {
        return this.showPurchasePage;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VNavigationBar m19841n() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TabLayout m19842p() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ViewPager2 m19843q() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m19844v() {
        m19841n().setLeftIconAsBack(this.act);
        xdl0.C0(m19841n().getRightIconContainer(), t100.d(44.0f));
        Act act = act();
        act.getClass();
        this.showPurchaseFirst = act.getIntent().getBooleanExtra("preferred_show_purchase", true);
        Act act2 = act();
        act2.getClass();
        this.from = String.valueOf(act2.getIntent().getStringExtra("from"));
        m19843q().g(new C1081b());
        m19843q().setAdapter(m19834f());
        m19843q().setUserInputEnabled(false);
        m19823u();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m19845w(int tabIndex) {
        TabLayout.Tab tabAt = m19842p().getTabAt(tabIndex);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            return newMeetTabItemView.m6931c();
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m19846x(int totalCount, int newCount) {
        if (m19843q().getCurrentItem() == 1) {
            return;
        }
        TabLayout.Tab tabAt = m19842p().getTabAt(1);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            newMeetTabItemView.m6930b();
            if (newCount > 0) {
                if (ew40.k()) {
                    newMeetTabItemView.m6932d(String.valueOf(Math.min(999, newCount)));
                    return;
                } else {
                    newMeetTabItemView.m6934f(true);
                    return;
                }
            }
            if (totalCount <= 0 || !CoreModule.c.m1.j4()) {
                newMeetTabItemView.m6934f(false);
            } else {
                newMeetTabItemView.m6934f(true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m19847y(@Nullable NewMeetFrag newMeetFrag) {
        this.meetFrag = newMeetFrag;
    }

    /* JADX INFO: renamed from: z */
    public final void m19848z(@Nullable ODiamondFrag oDiamondFrag) {
        this.oDiamondFrag = oDiamondFrag;
    }

    public void destroy() {
    }
}
