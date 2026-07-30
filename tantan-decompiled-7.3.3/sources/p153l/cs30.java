package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.newmeet.NewMeetAct;
import com.p051p1.mobile.putong.core.newui.newmeet.NewMeetTabItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFrag;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\tJ\u001d\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020$¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0019R\"\u0010U\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\"R\"\u0010Y\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010\"R\"\u0010]\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010Q\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010\"R\"\u0010d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001f\u0010i\u001a\u00060eR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bP\u0010hR$\u0010o\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010k\u001a\u0004\b^\u0010l\"\u0004\bm\u0010nR$\u0010u\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010q\u001a\u0004\bf\u0010r\"\u0004\bs\u0010t¨\u0006v"}, m88121d2 = {"Ll/cs30;", "Ll/iam;", "Ll/yr30;", "Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;)V", "", "u", "()V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", Constants.INAPP_DATA_TAG, "(Ll/yr30;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "open", "A", "(Z)V", ResourceDirection.f39656v, "", "tabIndex", "show", "G", "(IZ)V", "w", "(I)Z", "totalCount", "newCount", BaseSei.f14624X, "(II)V", Constants.INAPP_POSITION, "F", "(I)V", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", "e", "()Lcom/p1/mobile/putong/core/newui/newmeet/NewMeetAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "n", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "p", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "q", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "Ll/yr30;", "getPresenter", "()Ll/yr30;", "B", "f", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", c4s.C_ZONE, "showPurchaseFirst", "g", "m", "E", "showPurchasePage", "h", "k", "setODiamondWeeklyReportOpenState", "oDiamondWeeklyReportOpenState", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "Ll/cs30$a;", "j", "Lkotlin/Lazy;", "()Ll/cs30$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;", BaseSei.f14625Y, "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "oDiamondFrag", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cs30 implements iam<yr30> {

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
    public yr30 presenter;

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

    /* JADX INFO: renamed from: l.cs30$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/cs30$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/cs30;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C16348a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ cs30 f83410j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16348a(@NotNull cs30 cs30Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f83410j = cs30Var;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            cs30 cs30Var = this.f83410j;
            if (position == 1) {
                cs30Var.m112148z(ODiamondFrag.Companion.m44041b(ODiamondFrag.INSTANCE, cs30Var.getODiamondWeeklyReportOpenState(), null, 2, null));
                ODiamondFrag oDiamondFrag = this.f83410j.getODiamondFrag();
                oDiamondFrag.getClass();
                return oDiamondFrag;
            }
            cs30Var.m112147y(NewMeetFrag.INSTANCE.m43979a(cs30Var.getAct().getIntent()));
            NewMeetFrag meetFrag = this.f83410j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.cs30$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/cs30$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16349b extends ViewPager2.AbstractC0742i {
        public C16349b() {
        }

        /* JADX INFO: renamed from: a */
        public static void m112149a(cs30 cs30Var) {
            cs30Var.m112131G(1, false);
        }

        /* JADX INFO: renamed from: b */
        public static void m112150b(cs30 cs30Var) {
            cs30Var.m112131G(1, false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            if (!cs30.this.getShowPurchaseFirst()) {
                cs30.this.m112128C(true);
                return;
            }
            if (position == 0 && !CoreModule.m30933P().m143410g().mo36014Fs()) {
                CoreModule.m30933P().m143405a().mo34326Gd(cs30.this.getAct(), "p_meet_view,e_popup,click", Privilege.see_who_likes_me, null, null, -1, null, null, null, null, cs30.this.getShowPurchasePage());
                cs30.this.m112129E(false);
            } else if (position == 1 && !t450.m189175j()) {
                CoreModule.m30933P().m143405a().mo34621wh(cs30.this.getAct(), "p_diamond_tab,e_popup,click", null, null, null, Privilege.oDiamondVisitor);
                NewMeetAct act = cs30.this.getAct();
                final cs30 cs30Var = cs30.this;
                l51.m152888H(act, new Runnable() { // from class: l.ds30
                    @Override // java.lang.Runnable
                    public final void run() {
                        cs30.C16349b.m112150b(cs30Var);
                    }
                }, 1000L);
            } else if (position == 1) {
                NewMeetAct act2 = cs30.this.getAct();
                final cs30 cs30Var2 = cs30.this;
                l51.m152888H(act2, new Runnable() { // from class: l.es30
                    @Override // java.lang.Runnable
                    public final void run() {
                        cs30.C16349b.m112149a(cs30Var2);
                    }
                }, 1000L);
            }
            if (position == 1) {
                CoreModule.f18264c.f20406m1.m35702M5();
            }
        }
    }

    public cs30(@NotNull NewMeetAct newMeetAct) {
        newMeetAct.getClass();
        this.act = newMeetAct;
        this.showPurchaseFirst = true;
        this.showPurchasePage = true;
        this.from = "";
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.as30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cs30.m112122a(this.f73049a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C16348a m112122a(cs30 cs30Var) {
        return new C16348a(cs30Var, cs30Var.act);
    }

    /* JADX INFO: renamed from: b */
    public static void m112123b(cs30 cs30Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            cs30Var.m112124s("喜欢的人", tab);
        } else {
            cs30Var.m112124s("谁看过我", tab);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m112124s(String tabText, TabLayout.Tab tab) {
        View viewInflate = p9r.m171370a(this.act).inflate(pec0.f151903F0, (ViewGroup) null);
        viewInflate.getClass();
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) viewInflate;
        newMeetTabItemView.m43770e(tabText);
        tab.setCustomView(newMeetTabItemView);
    }

    /* JADX INFO: renamed from: u */
    private final void m112125u() {
        bnl0.m105524M(m112142p(), true);
        new TabLayoutMediator(m112142p(), m112143q(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.bs30
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                cs30.m112123b(this.f78086a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: A */
    public final void m112126A(boolean open) {
        this.oDiamondWeeklyReportOpenState = open;
    }

    /* JADX INFO: renamed from: B */
    public final void m112127B(@NotNull yr30 yr30Var) {
        yr30Var.getClass();
        this.presenter = yr30Var;
    }

    /* JADX INFO: renamed from: C */
    public final void m112128C(boolean z) {
        this.showPurchaseFirst = z;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m112129E(boolean z) {
        this.showPurchasePage = z;
    }

    /* JADX INFO: renamed from: F */
    public final void m112130F(int pos) {
        m112143q().setCurrentItem(pos);
    }

    /* JADX INFO: renamed from: G */
    public final void m112131G(int tabIndex, boolean show) {
        TabLayout.Tab tabAt = m112142p().getTabAt(tabIndex);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            newMeetTabItemView.m43771f(show);
            if (show) {
                return;
            }
            newMeetTabItemView.m43767b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m112132c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM127022b = fs30.m127022b(this, inflater, parent);
        viewM127022b.getClass();
        return viewM127022b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull yr30 presenter) {
        presenter.getClass();
        m112127B(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final NewMeetAct getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C16348a m112135f() {
        return (C16348a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final NewMeetFrag getMeetFrag() {
        return this.meetFrag;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m112132c(inflater, parent);
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
    public final VNavigationBar m112141n() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TabLayout m112142p() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ViewPager2 m112143q() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m112144v() {
        m112141n().setLeftIconAsBack(this.act);
        bnl0.m105505C0(m112141n().getRightIconContainer(), qa00.m175859d(44.0f));
        Act act = getAct();
        act.getClass();
        this.showPurchaseFirst = act.getIntent().getBooleanExtra("preferred_show_purchase", true);
        Act act2 = getAct();
        act2.getClass();
        this.from = String.valueOf(act2.getIntent().getStringExtra("from"));
        m112143q().m4249g(new C16349b());
        m112143q().setAdapter(m112135f());
        m112143q().setUserInputEnabled(false);
        m112125u();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m112145w(int tabIndex) {
        TabLayout.Tab tabAt = m112142p().getTabAt(tabIndex);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            return newMeetTabItemView.m43768c();
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m112146x(int totalCount, int newCount) {
        if (m112143q().getCurrentItem() == 1) {
            return;
        }
        TabLayout.Tab tabAt = m112142p().getTabAt(1);
        NewMeetTabItemView newMeetTabItemView = (NewMeetTabItemView) (tabAt != null ? tabAt.getCustomView() : null);
        if (newMeetTabItemView != null) {
            newMeetTabItemView.m43767b();
            if (newCount > 0) {
                if (t450.m189176k()) {
                    newMeetTabItemView.m43769d(String.valueOf(Math.min(RoomDatabase.MAX_BIND_PARAMETER_CNT, newCount)));
                    return;
                } else {
                    newMeetTabItemView.m43771f(true);
                    return;
                }
            }
            if (totalCount <= 0 || !CoreModule.f18264c.f20406m1.m35719j4()) {
                newMeetTabItemView.m43771f(false);
            } else {
                newMeetTabItemView.m43771f(true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m112147y(@Nullable NewMeetFrag newMeetFrag) {
        this.meetFrag = newMeetFrag;
    }

    /* JADX INFO: renamed from: z */
    public final void m112148z(@Nullable ODiamondFrag oDiamondFrag) {
        this.oDiamondFrag = oDiamondFrag;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
