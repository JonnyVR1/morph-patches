package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.newui.meet.MeetTabView;
import com.p046p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\tJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0000¢\u0006\u0004\b)\u0010\tJ\u0015\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b+\u0010\rJ\u001d\u0010.\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\tJ\u0015\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\n¢\u0006\u0004\b2\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0016\u0010W\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010RR\u0016\u0010Y\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010RR\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001f\u0010a\u001a\u00060]R\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b_\u0010`R$\u0010i\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010p\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\b[\u0010oR$\u0010w\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006x"}, m87232d2 = {"Ll/k7y;", "Ll/s7m;", "Ll/z5y;", "Lcom/p1/mobile/putong/core/newui/meet/MeetAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/newui/meet/MeetAct;)V", "", "A", "()V", "", "position", "L", "(I)V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", BaseSei.f13932Z, "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "tabIndex", BaseSei.f13931Y, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "n", "(Ll/z5y;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "open", "J", "(Z)V", "B", "newLikersCount", b2s.C_ZONE, "totalCount", "newCount", "F", "(II)V", "E", Constants.INAPP_POSITION, "K", "a", "Lcom/p1/mobile/putong/core/newui/meet/MeetAct;", "getAct", "()Lcom/p1/mobile/putong/core/newui/meet/MeetAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", ResourceDirection.f38808v, "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "c", "Lcom/google/android/material/tabs/TabLayout;", "w", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", Constants.INAPP_DATA_TAG, "Landroidx/viewpager2/widget/ViewPager2;", BaseSei.f13930X, "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Ll/z5y;", "f", "Z", "showPurchasePage", "g", "purchaseDialogShowing", "h", "purchaseDialogShowed", RXScreenCaptureService.KEY_INDEX, "oDiamondWeeklyReportOpenState", "j", "I", "newVisitorCount", "Ll/k7y$a;", "Lkotlin/Lazy;", "p", "()Ll/k7y$a;", "adapter", "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "q", "()Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "G", "(Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;)V", "meetFrag", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "m", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "u", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "oDiamondFrag", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "H", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "nearbyFrag", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k7y implements s7m<z5y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MeetAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public z5y presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showPurchasePage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean purchaseDialogShowing;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean purchaseDialogShowed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean oDiamondWeeklyReportOpenState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int newVisitorCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public MeetLikersFrag meetFrag;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ODiamondFrag oDiamondFrag;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public NearbyFrag nearbyFrag;

    /* JADX INFO: renamed from: l.k7y$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/k7y$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/k7y;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C17947a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ k7y f121702j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17947a(@NotNull k7y k7yVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f121702j = k7yVar;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4208A(int position) {
            if (position == 1) {
                k7y k7yVar = this.f121702j;
                k7yVar.m144808I(ODiamondFrag.INSTANCE.m43031a(k7yVar.oDiamondWeeklyReportOpenState, "from_meet"));
                ODiamondFrag oDiamondFrag = this.f121702j.getODiamondFrag();
                oDiamondFrag.getClass();
                return oDiamondFrag;
            }
            k7y k7yVar2 = this.f121702j;
            if (position == 2) {
                k7yVar2.m144807H(NearbyFrag.INSTANCE.m42709a("nearby_meet"));
                NearbyFrag nearbyFrag = this.f121702j.getNearbyFrag();
                nearbyFrag.getClass();
                return nearbyFrag;
            }
            k7yVar2.m144806G(new MeetLikersFrag());
            MeetLikersFrag meetFrag = this.f121702j.getMeetFrag();
            meetFrag.getClass();
            return meetFrag;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: l.k7y$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"l/k7y$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17948b implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String str;
            tab.getClass();
            int position = tab.getPosition();
            if (position != 1) {
                str = position != 2 ? "e_meet_tab_see" : "e_meet_tab_nearby";
            } else {
                str = "e_meet_tab_visitor";
            }
            zvf0.m220396r(str, "p_meet");
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    /* JADX INFO: renamed from: l.k7y$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/k7y$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17949c extends ViewPager2.AbstractC0740i {
        public C17949c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            k7y.this.m144811L(position);
        }
    }

    public k7y(@NotNull MeetAct meetAct) {
        meetAct.getClass();
        this.act = meetAct;
        this.showPurchasePage = true;
        this.adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.c7y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k7y.m144797i(this.f79665a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final void m144790A() {
        xdl0.m208344M(m144819w(), true);
        new TabLayoutMediator(m144819w(), m144820x(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.d7y
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                k7y.m144794d(this.f84803a, tab, i);
            }
        }).attach();
        m144819w().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17948b());
    }

    /* JADX INFO: renamed from: a */
    public static void m144791a(k7y k7yVar) {
        k7yVar.purchaseDialogShowing = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m144792b(k7y k7yVar) {
        k7yVar.m144821y(0);
    }

    /* JADX INFO: renamed from: c */
    public static void m144793c(k7y k7yVar) {
        k7yVar.newVisitorCount = 0;
        k7yVar.m144821y(1);
    }

    /* JADX INFO: renamed from: d */
    public static void m144794d(k7y k7yVar, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            k7yVar.m144801z("喜欢我的人", tab);
        } else if (i == 1) {
            k7yVar.m144801z("谁看过我", tab);
        } else {
            if (i != 2) {
                return;
            }
            k7yVar.m144801z("附近的人", tab);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m144795e(k7y k7yVar) {
        k7yVar.m144821y(2);
    }

    /* JADX INFO: renamed from: f */
    public static void m144796f(k7y k7yVar) {
        k7yVar.purchaseDialogShowing = false;
    }

    /* JADX INFO: renamed from: i */
    public static C17947a m144797i(k7y k7yVar) {
        return new C17947a(k7yVar, k7yVar.act);
    }

    /* JADX INFO: renamed from: j */
    public static void m144798j(k7y k7yVar) {
        k7yVar.purchaseDialogShowing = false;
    }

    /* JADX INFO: renamed from: z */
    private final void m144801z(String tabText, TabLayout.Tab tab) {
        tab.setCustomView(k6c0.f121298G0);
        View customView = tab.getCustomView();
        MeetTabView meetTabView = customView instanceof MeetTabView ? (MeetTabView) customView : null;
        if (meetTabView != null) {
            meetTabView.m40500k0(tabText);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m144802B() {
        m144818v().setLeftIconAsBack(this.act);
        xdl0.m208325C0(m144818v().getRightIconContainer(), t100.m186890d(44.0f));
        m144820x().m4247g(new C17949c());
        m144820x().setAdapter(m144814p());
        m144820x().setUserInputEnabled(false);
        m144790A();
    }

    /* JADX INFO: renamed from: C */
    public final void m144803C(int newLikersCount) {
        if (m144820x().getCurrentItem() == 0) {
            return;
        }
        TabLayout.Tab tabAt = m144819w().getTabAt(0);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        MeetTabView meetTabView = customView instanceof MeetTabView ? (MeetTabView) customView : null;
        if (meetTabView != null) {
            meetTabView.m40499j0(newLikersCount);
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m144804E() {
        if (m144820x().getCurrentItem() == 2) {
            return;
        }
        TabLayout.Tab tabAt = m144819w().getTabAt(2);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        MeetTabView meetTabView = customView instanceof MeetTabView ? (MeetTabView) customView : null;
        if (meetTabView != null) {
            meetTabView.m40498i0();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m144805F(int totalCount, int newCount) {
        if (m144820x().getCurrentItem() == 1) {
            return;
        }
        TabLayout.Tab tabAt = m144819w().getTabAt(1);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        MeetTabView meetTabView = customView instanceof MeetTabView ? (MeetTabView) customView : null;
        if (meetTabView == null || newCount < this.newVisitorCount) {
            return;
        }
        this.newVisitorCount = newCount;
        meetTabView.m40501l0(totalCount, newCount);
    }

    /* JADX INFO: renamed from: G */
    public final void m144806G(@Nullable MeetLikersFrag meetLikersFrag) {
        this.meetFrag = meetLikersFrag;
    }

    /* JADX INFO: renamed from: H */
    public final void m144807H(@Nullable NearbyFrag nearbyFrag) {
        this.nearbyFrag = nearbyFrag;
    }

    /* JADX INFO: renamed from: I */
    public final void m144808I(@Nullable ODiamondFrag oDiamondFrag) {
        this.oDiamondFrag = oDiamondFrag;
    }

    /* JADX INFO: renamed from: J */
    public final void m144809J(boolean open) {
        this.oDiamondWeeklyReportOpenState = open;
    }

    /* JADX INFO: renamed from: K */
    public final void m144810K(int pos) {
        m144820x().m4250j(pos, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m144811L(int position) {
        if (position == 0) {
            if (!CoreModule.m29935P().m94656g().mo35011Fs()) {
                if (this.purchaseDialogShowing) {
                    return;
                }
                this.purchaseDialogShowing = true;
                CoreModule.m29935P().m94651a().mo33323Gd(getAct(), "p_meet_see,default", Privilege.see_who_likes_me, null, null, -1, new d30() { // from class: l.e7y
                    @Override // p149l.d30
                    public final void call() {
                        k7y.m144798j(this.f89769a);
                    }
                }, null, null, null, this.showPurchasePage);
                this.purchaseDialogShowed = true;
                this.showPurchasePage = false;
            }
            e51.m114743H(this.act, new Runnable() { // from class: l.f7y
                @Override // java.lang.Runnable
                public final void run() {
                    k7y.m144792b(this.f96303a);
                }
            }, 1000L);
            return;
        }
        if (position != 1) {
            if (!CoreModule.m29935P().m94656g().mo35011Fs()) {
                if (this.purchaseDialogShowing) {
                    return;
                }
                this.purchaseDialogShowing = true;
                CoreModule.m29935P().m94651a().mo33323Gd(getAct(), "p_meet_nearby,default", Privilege.nearby_people, null, null, -1, new d30() { // from class: l.i7y
                    @Override // p149l.d30
                    public final void call() {
                        k7y.m144791a(this.f111961a);
                    }
                }, null, null, null, this.showPurchasePage);
                this.showPurchasePage = false;
                this.purchaseDialogShowed = true;
            }
            e51.m114743H(this.act, new Runnable() { // from class: l.j7y
                @Override // java.lang.Runnable
                public final void run() {
                    k7y.m144795e(this.f116662a);
                }
            }, 1000L);
            return;
        }
        if (!ew40.m118398j()) {
            if (this.purchaseDialogShowing) {
                return;
            }
            this.purchaseDialogShowing = true;
            CoreModule.m29935P().m94651a().mo33618wh(this.act, "p_meet_visit,default", null, new d30() { // from class: l.g7y
                @Override // p149l.d30
                public final void call() {
                    k7y.m144796f(this.f101459a);
                }
            }, null, Privilege.oDiamondVisitor);
            this.purchaseDialogShowed = true;
        }
        e51.m114743H(this.act, new Runnable() { // from class: l.h7y
            @Override // java.lang.Runnable
            public final void run() {
                k7y.m144793c(this.f106357a);
            }
        }, 1000L);
        CoreModule.f17545c.f19664m1.m34699M5();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m144812k(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m144812k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM148832b = l7y.m148832b(this, inflater, parent);
        viewM148832b.getClass();
        return viewM148832b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull z5y presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C17947a m144814p() {
        return (C17947a) this.adapter.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final MeetLikersFrag getMeetFrag() {
        return this.meetFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final NearbyFrag getNearbyFrag() {
        return this.nearbyFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final ODiamondFrag getODiamondFrag() {
        return this.oDiamondFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VNavigationBar m144818v() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final TabLayout m144819w() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ViewPager2 m144820x() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final void m144821y(int tabIndex) {
        TabLayout.Tab tabAt = m144819w().getTabAt(tabIndex);
        View customView = tabAt != null ? tabAt.getCustomView() : null;
        MeetTabView meetTabView = customView instanceof MeetTabView ? (MeetTabView) customView : null;
        if (meetTabView != null) {
            meetTabView.m40498i0();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
