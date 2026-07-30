package p007l;

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
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserFrag;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.NewMyLikedUsersItemView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p000p1.mobile.putong.data.BloodType;
import com.p000p1.mobile.putong.data.Position;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.k6c0;
import l.o7r;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zj30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001f\u0010P\u001a\u00060LR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bA\u0010OR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020$0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Ll/yj30;", "Ll/s7m;", "Ll/ck30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "n", "()V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "m", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "d", "(Ll/ck30;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "pos", "q", "(I)V", "Ll/xu10;", "f", "()Ll/xu10;", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "j", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "k", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "l", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Ll/ck30;", "getPresenter", "()Ll/ck30;", "p", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "Ll/yj30$a;", "g", "Lkotlin/Lazy;", "()Ll/yj30$a;", "adapter", "", "h", "Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "fragmentList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class yj30 implements s7m<ck30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewMyLikedUsersAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TabLayout _tablayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ck30 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String from;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<xu10> fragmentList;

    /* JADX INFO: renamed from: l.yj30$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/yj30$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/yj30;Landroidx/fragment/app/FragmentActivity;)V", "", Position.TYPE, "Landroidx/fragment/app/Fragment;", BloodType.f186A, "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C2541a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ yj30 f15454j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2541a(@NotNull yj30 yj30Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f15454j = yj30Var;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m17165A(int position) {
            Fragment fragment = this.f15454j.m17157i().get(position);
            fragment.getClass();
            return fragment;
        }

        public int getItemCount() {
            return this.f15454j.m17157i().size();
        }
    }

    public yj30(@NotNull NewMyLikedUsersAct newMyLikedUsersAct) {
        newMyLikedUsersAct.getClass();
        this.act = newMyLikedUsersAct;
        this.from = "";
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.wj30
            public final Object invoke() {
                return yj30.m17149b(this.f14555a);
            }
        });
        this.fragmentList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m17148a(yj30 yj30Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            yj30Var.m17150m("喜欢的人", tab);
        } else {
            yj30Var.m17150m("无感的人", tab);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2541a m17149b(yj30 yj30Var) {
        return new C2541a(yj30Var, yj30Var.act);
    }

    /* JADX INFO: renamed from: m */
    private final void m17150m(String tabText, TabLayout.Tab tab) {
        View viewInflate = o7r.a(this.act).inflate(k6c0.L0, (ViewGroup) null);
        viewInflate.getClass();
        NewMyLikedUsersItemView newMyLikedUsersItemView = (NewMyLikedUsersItemView) viewInflate;
        newMyLikedUsersItemView.m505b(tabText);
        tab.setCustomView(newMyLikedUsersItemView);
    }

    /* JADX INFO: renamed from: n */
    private final void m17151n() {
        xdl0.M(m17160k(), true);
        new TabLayoutMediator(m17160k(), m17161l(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.xj30
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                yj30.m17148a(this.f15020a, tab, i);
            }
        }).attach();
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m17152C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m17153c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = zj30.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m17158i1(@NotNull ck30 presenter) {
        presenter.getClass();
        m17162p(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C2541a m17155e() {
        return (C2541a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final xu10 m17156f() {
        return this.fragmentList.get(m17161l().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<xu10> m17157i() {
        return this.fragmentList;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m17153c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VNavigationBar m17159j() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TabLayout m17160k() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ViewPager2 m17161l() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m17162p(@NotNull ck30 ck30Var) {
        ck30Var.getClass();
        this.presenter = ck30Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m17163q(int pos) {
        m17161l().setCurrentItem(pos);
    }

    /* JADX INFO: renamed from: r */
    public final void m17164r() {
        List<xu10> list = this.fragmentList;
        LikedUserFrag likedUserFragM449N4 = LikedUserFrag.m449N4(true);
        likedUserFragM449N4.getClass();
        list.add(likedUserFragM449N4);
        this.fragmentList.add(new UnDoLikedUserFrag());
        m17159j().setLeftIconAsBack(this.act);
        xdl0.C0(m17159j().getRightIconContainer(), t100.d(44.0f));
        m17161l().g(new C2542b());
        m17161l().setAdapter(m17155e());
        m17161l().setUserInputEnabled(false);
        m17151n();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.yj30$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/yj30$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", Position.TYPE, "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2542b extends ViewPager2.i {
        public void onPageSelected(int position) {
        }
    }
}
