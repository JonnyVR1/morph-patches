package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFrag;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R\"\u0010K\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001f\u0010P\u001a\u00060LR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bA\u0010OR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020$0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, m88121d2 = {"Ll/ms30;", "Ll/iam;", "Ll/qs30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "n", "()V", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "m", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", Constants.INAPP_DATA_TAG, "(Ll/qs30;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", Constants.INAPP_POSITION, "q", "(I)V", "Ll/f320;", "f", "()Ll/f320;", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "j", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "k", "()Lcom/google/android/material/tabs/TabLayout;", "set_tablayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tablayout", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "e", "Ll/qs30;", "getPresenter", "()Ll/qs30;", "p", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "from", "Ll/ms30$a;", "g", "Lkotlin/Lazy;", "()Ll/ms30$a;", "adapter", "", "h", "Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "fragmentList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ms30 implements iam<qs30> {

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
    public qs30 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String from;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<f320> fragmentList;

    /* JADX INFO: renamed from: l.ms30$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/ms30$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/ms30;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C18694a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ms30 f138450j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18694a(@NotNull ms30 ms30Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f138450j = ms30Var;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            Object obj = this.f138450j.m159745i().get(position);
            obj.getClass();
            return (Fragment) obj;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f138450j.m159745i().size();
        }
    }

    public ms30(@NotNull NewMyLikedUsersAct newMyLikedUsersAct) {
        newMyLikedUsersAct.getClass();
        this.act = newMyLikedUsersAct;
        this.from = "";
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ks30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ms30.m159738b(this.f128526a);
            }
        });
        this.fragmentList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m159737a(ms30 ms30Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            ms30Var.m159739m("喜欢的人", tab);
        } else {
            ms30Var.m159739m("无感的人", tab);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18694a m159738b(ms30 ms30Var) {
        return new C18694a(ms30Var, ms30Var.act);
    }

    /* JADX INFO: renamed from: m */
    private final void m159739m(String tabText, TabLayout.Tab tab) {
        View viewInflate = p9r.m171370a(this.act).inflate(pec0.f151921L0, (ViewGroup) null);
        viewInflate.getClass();
        NewMyLikedUsersItemView newMyLikedUsersItemView = (NewMyLikedUsersItemView) viewInflate;
        newMyLikedUsersItemView.m48008b(tabText);
        tab.setCustomView(newMyLikedUsersItemView);
    }

    /* JADX INFO: renamed from: n */
    private final void m159740n() {
        bnl0.m105524M(m159747k(), true);
        new TabLayoutMediator(m159747k(), m159748l(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.ls30
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ms30.m159737a(this.f133388a, tab, i);
            }
        }).attach();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m159741c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM164554b = ns30.m164554b(this, inflater, parent);
        viewM164554b.getClass();
        return viewM164554b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull qs30 presenter) {
        presenter.getClass();
        m159749p(presenter);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C18694a m159743e() {
        return (C18694a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final f320 m159744f() {
        return this.fragmentList.get(m159748l().getCurrentItem());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<f320> m159745i() {
        return this.fragmentList;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m159741c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VNavigationBar m159746j() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TabLayout m159747k() {
        TabLayout tabLayout = this._tablayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tablayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ViewPager2 m159748l() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m159749p(@NotNull qs30 qs30Var) {
        qs30Var.getClass();
        this.presenter = qs30Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m159750q(int pos) {
        m159748l().setCurrentItem(pos);
    }

    /* JADX INFO: renamed from: r */
    public final void m159751r() {
        List<f320> list = this.fragmentList;
        LikedUserFrag likedUserFragM47960N4 = LikedUserFrag.m47960N4(true);
        likedUserFragM47960N4.getClass();
        list.add(likedUserFragM47960N4);
        this.fragmentList.add(new UnDoLikedUserFrag());
        m159746j().setLeftIconAsBack(this.act);
        bnl0.m105505C0(m159746j().getRightIconContainer(), qa00.m175859d(44.0f));
        m159748l().m4249g(new C18695b());
        m159748l().setAdapter(m159743e());
        m159748l().setUserInputEnabled(false);
        m159740n();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ms30$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/ms30$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18695b extends ViewPager2.AbstractC0742i {
        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
        }
    }
}
