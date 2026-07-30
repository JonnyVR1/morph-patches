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
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserFrag;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001f\u0010P\u001a\u00060LR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bA\u0010OR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020$0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, m87232d2 = {"Ll/yj30;", "Ll/s7m;", "Ll/ck30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "n", "()V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "m", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", Constants.INAPP_DATA_TAG, "(Ll/ck30;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", Constants.INAPP_POSITION, "q", "(I)V", "Ll/xu10;", "f", "()Ll/xu10;", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "j", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "k", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Ll/ck30;", "getPresenter", "()Ll/ck30;", "p", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "Ll/yj30$a;", "g", "Lkotlin/Lazy;", "()Ll/yj30$a;", "adapter", "", "h", "Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "fragmentList", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/yj30$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/yj30;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C21416a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ yj30 f198588j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21416a(@NotNull yj30 yj30Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f198588j = yj30Var;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4208A(int position) {
            Object obj = this.f198588j.m215038i().get(position);
            obj.getClass();
            return (Fragment) obj;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f198588j.m215038i().size();
        }
    }

    public yj30(@NotNull NewMyLikedUsersAct newMyLikedUsersAct) {
        newMyLikedUsersAct.getClass();
        this.act = newMyLikedUsersAct;
        this.from = "";
        this.adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.wj30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yj30.m215031b(this.f186597a);
            }
        });
        this.fragmentList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m215030a(yj30 yj30Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            yj30Var.m215032m("喜欢的人", tab);
        } else {
            yj30Var.m215032m("无感的人", tab);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C21416a m215031b(yj30 yj30Var) {
        return new C21416a(yj30Var, yj30Var.act);
    }

    /* JADX INFO: renamed from: m */
    private final void m215032m(String tabText, TabLayout.Tab tab) {
        View viewInflate = o7r.m163037a(this.act).inflate(k6c0.f121313L0, (ViewGroup) null);
        viewInflate.getClass();
        NewMyLikedUsersItemView newMyLikedUsersItemView = (NewMyLikedUsersItemView) viewInflate;
        newMyLikedUsersItemView.m46825b(tabText);
        tab.setCustomView(newMyLikedUsersItemView);
    }

    /* JADX INFO: renamed from: n */
    private final void m215033n() {
        xdl0.m208344M(m215040k(), true);
        new TabLayoutMediator(m215040k(), m215041l(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.xj30
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                yj30.m215030a(this.f193175a, tab, i);
            }
        }).attach();
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m215034c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM219085b = zj30.m219085b(this, inflater, parent);
        viewM219085b.getClass();
        return viewM219085b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull ck30 presenter) {
        presenter.getClass();
        m215042p(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C21416a m215036e() {
        return (C21416a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final xu10 m215037f() {
        return this.fragmentList.get(m215041l().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<xu10> m215038i() {
        return this.fragmentList;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m215034c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VNavigationBar m215039j() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TabLayout m215040k() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m87502r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ViewPager2 m215041l() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m215042p(@NotNull ck30 ck30Var) {
        ck30Var.getClass();
        this.presenter = ck30Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m215043q(int pos) {
        m215041l().setCurrentItem(pos);
    }

    /* JADX INFO: renamed from: r */
    public final void m215044r() {
        List<xu10> list = this.fragmentList;
        LikedUserFrag likedUserFragM46777N4 = LikedUserFrag.m46777N4(true);
        likedUserFragM46777N4.getClass();
        list.add(likedUserFragM46777N4);
        this.fragmentList.add(new UnDoLikedUserFrag());
        m215039j().setLeftIconAsBack(this.act);
        xdl0.m208325C0(m215039j().getRightIconContainer(), t100.m186890d(44.0f));
        m215041l().m4247g(new C21417b());
        m215041l().setAdapter(m215036e());
        m215041l().setUserInputEnabled(false);
        m215033n();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.yj30$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/yj30$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21417b extends ViewPager2.AbstractC0740i {
        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
        }
    }
}
