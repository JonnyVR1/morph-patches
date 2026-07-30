package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsFrag;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsFrag;
import com.p051p1.mobile.putong.core.p058ui.visitor.visitorsme.VisitorsMeFrag;
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
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\tJ\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010m\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010nR\u001f\u0010s\u001a\u00060oR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bp\u0010r¨\u0006t"}, m88121d2 = {"Ll/sjm0;", "Ll/iam;", "Ll/fjm0;", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;)V", "", BaseSei.f14625Y, "()V", "B", BaseSei.f14624X, c4s.C_ZONE, "A", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", BaseSei.f14626Z, "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/fjm0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "hasPermission", "E", "(Z)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "k", "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "m", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "n", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lcom/google/android/material/tabs/TabLayout;", Constants.INAPP_DATA_TAG, "Lcom/google/android/material/tabs/TabLayout;", ResourceDirection.f39656v, "()Lcom/google/android/material/tabs/TabLayout;", "set_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tab_layout", "Landroidx/viewpager2/widget/ViewPager2;", "e", "Landroidx/viewpager2/widget/ViewPager2;", "w", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "Lv/VRelative;", "Lv/VRelative;", "p", "()Lv/VRelative;", "set_no_permission", "(Lv/VRelative;)V", "_no_permission", "Lv/VImage;", "g", "Lv/VImage;", "get_permission_img", "()Lv/VImage;", "set_permission_img", "(Lv/VImage;)V", "_permission_img", "Lv/VText;", "h", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VText;", "set_permission_subtitle", "(Lv/VText;)V", "_permission_subtitle", RXScreenCaptureService.KEY_INDEX, "u", "set_permission_tv", "_permission_tv", "Lv/VButton;", "Lv/VButton;", "q", "()Lv/VButton;", "set_permission_btn", "(Lv/VButton;)V", "_permission_btn", "Ll/fjm0;", "Ll/sjm0$a;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "()Ll/sjm0$a;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sjm0 implements iam<fjm0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TabLayout _tab_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ViewPager2 _viewpager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRelative _no_permission;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _permission_img;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _permission_subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _permission_tv;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VButton _permission_btn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public fjm0 presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l.sjm0$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/sjm0$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/sjm0;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C20061a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ sjm0 f169124j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20061a(@NotNull sjm0 sjm0Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f169124j = sjm0Var;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int position) {
            if (position == 1) {
                return MyVisitorsFrag.Companion.m59222b(MyVisitorsFrag.INSTANCE, null, 1, null);
            }
            if (rs9.INSTANCE.m182948h()) {
                return VisitorsMeFrag.INSTANCE.m59258a(this.f169124j.getAct().getIntent().getStringExtra("from"), this.f169124j.getAct().getIntent().getBooleanExtra("fromDeeplink", false), this.f169124j.getAct().getIntent().getBooleanExtra("hideNavigation", false));
            }
            MomentVisitorsFrag momentVisitorsFrag = new MomentVisitorsFrag();
            Bundle bundle = new Bundle();
            String stringExtra = this.f169124j.getAct().getIntent().getStringExtra("from");
            boolean booleanExtra = this.f169124j.getAct().getIntent().getBooleanExtra("fromDeeplink", false);
            fjm0 fjm0Var = this.f169124j.presenter;
            boolean z = fjm0Var != null && fjm0Var.getHasPermission();
            boolean booleanExtra2 = this.f169124j.getAct().getIntent().getBooleanExtra("hideNavigation", false);
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("from", stringExtra);
            }
            bundle.putBoolean("fromDeeplink", booleanExtra);
            bundle.putBoolean("hasPermission", z);
            bundle.putBoolean("hideNavigation", booleanExtra2);
            momentVisitorsFrag.setArguments(bundle);
            return momentVisitorsFrag;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.sjm0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"l/sjm0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20062b implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public sjm0(@NotNull VisitorsAct visitorsAct) {
        visitorsAct.getClass();
        this.act = visitorsAct;
        this.adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.njm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sjm0.m186273b(this.f142321a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final void m186269A() {
        m186293v().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20062b());
        new TabLayoutMediator(m186293v(), m186294w(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.ojm0
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                sjm0.m186274c(this.f147683a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: B */
    private final void m186270B() {
        m186294w().m4249g(new C20063c());
        m186294w().setAdapter(m186285l());
        m186294w().setUserInputEnabled(false);
    }

    /* JADX INFO: renamed from: C */
    private final void m186271C() {
        final l4g0 l4g0Var = new l4g0("p_my_visitor_setting", Dialog.class.getName());
        new kfm0(this.act, bgc0.f76584e, true).m149572t(new y20() { // from class: l.rjm0
            @Override // p153l.y20
            public final void call(Object obj) {
                sjm0.m186275d(l4g0Var, this, ((Boolean) obj).booleanValue());
            }
        }).show();
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m186272a(sjm0 sjm0Var, View view) {
        i4g0.m138520r("e_moment_visitor_set_on", "p_moment_visitor_set");
        fjm0 fjm0Var = sjm0Var.presenter;
        if (fjm0Var != null) {
            fjm0Var.m125833o0(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C20061a m186273b(sjm0 sjm0Var) {
        return new C20061a(sjm0Var, sjm0Var.act);
    }

    /* JADX INFO: renamed from: c */
    public static void m186274c(sjm0 sjm0Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            sjm0Var.m186280z("谁看过我", tab);
        } else {
            sjm0Var.m186280z("我看过谁", tab);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m186275d(l4g0 l4g0Var, sjm0 sjm0Var, boolean z) {
        w1e.m204401e(l4g0Var);
        fjm0 fjm0Var = sjm0Var.presenter;
        if (fjm0Var != null) {
            fjm0Var.m125833o0(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m186276e(sjm0 sjm0Var, View view) {
        i4g0.m138520r("e_my_visitor_setting", "p_my_visitor_isee");
        sjm0Var.m186271C();
    }

    /* JADX INFO: renamed from: x */
    private final void m186278x() {
        m186286m().setLeftIconAsBack(this.act);
        fjm0 fjm0Var = this.presenter;
        boolean z = false;
        if (fjm0Var != null && fjm0Var.getHasPermission()) {
            z = true;
        }
        m186281E(z);
    }

    /* JADX INFO: renamed from: y */
    private final void m186279y() {
        m186291s().setTypeface(null, 1);
        m186289q().setTypeface(null, 1);
        m186291s().setText("开启后可查看谁看过我");
        if (CoreModule.m30933P().m143405a().mo180463f()) {
            m186292u().setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        } else {
            m186292u().setText("·记录仅展示同样已开启的用户\n·你查看他人动态也将留下记录");
        }
        bnl0.m105509E0(m186289q(), new View.OnClickListener() { // from class: l.pjm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sjm0.m186272a(this.f152715a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private final void m186280z(String tabText, TabLayout.Tab tab) {
        View viewInflate = p9r.m171370a(this.act).inflate(pec0.f151964Z1, (ViewGroup) null);
        viewInflate.getClass();
        VText vText = (VText) viewInflate;
        vText.setText(tabText);
        vText.setTypeface(lyh0.m156283c(3), 1);
        tab.setCustomView(vText);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m186281E(boolean hasPermission) {
        if (!hasPermission) {
            m186286m().m224830B();
            bnl0.m105524M(m186288p(), true);
            bnl0.m105524M(m186287n(), false);
            return;
        }
        m186286m().m224830B();
        ImageView imageView = new ImageView(this.act);
        imageView.setImageResource(gbc0.f103182P5);
        m186286m().m224835z(imageView);
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.qjm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sjm0.m186276e(this.f158000a, view);
            }
        });
        bnl0.m105524M(m186288p(), false);
        bnl0.m105524M(m186287n(), true);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m186282f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191447b = tjm0.m191447b(this, inflater, parent);
        viewM191447b.getClass();
        return viewM191447b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m186282f(inflater, parent);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull fjm0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final VisitorsAct getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C20061a m186285l() {
        return (C20061a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VNavigationBar m186286m() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VLinear m186287n() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VRelative m186288p() {
        VRelative vRelative = this._no_permission;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_no_permission");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VButton m186289q() {
        VButton vButton = this._permission_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_permission_btn");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m186290r() {
        m186278x();
        m186279y();
        m186270B();
        m186269A();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m186291s() {
        VText vText = this._permission_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_permission_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VText m186292u() {
        VText vText = this._permission_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_permission_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final TabLayout m186293v() {
        TabLayout tabLayout = this._tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ViewPager2 m186294w() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.sjm0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/sjm0$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20063c extends ViewPager2.AbstractC0742i {
        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
        }
    }
}
