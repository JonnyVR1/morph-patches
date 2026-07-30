package p006l;

import android.content.Context;
import android.graphics.Typeface;
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
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.MomentVisitorsFrag;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsAct;
import com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors.MyVisitorsFrag;
import com.p000p1.mobile.putong.core.p004ui.visitor.visitorsme.VisitorsMeFrag;
import com.p1.mobile.android.app.Dialog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.cwf0;
import l.e30;
import l.eqh0;
import l.i0e;
import l.k6c0;
import l.o7r;
import l.pam0;
import l.s7m;
import l.w7c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\tJ\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010m\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010nR\u001f\u0010s\u001a\u00060oR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bp\u0010r¨\u0006t"}, d2 = {"Ll/oam0;", "Ll/s7m;", "Ll/bam0;", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;)V", "", "y", "()V", "B", "x", "C", "A", "", "tabText", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "z", "(Ljava/lang/String;Lcom/google/android/material/tabs/TabLayout$Tab;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/bam0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "hasPermission", "E", "(Z)V", "a", "Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "k", "()Lcom/p1/mobile/putong/core/ui/visitor/VisitorsAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "m", "()Lv/navigationbar/VNavigationBar;", "set_bar", "(Lv/navigationbar/VNavigationBar;)V", "_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "n", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lcom/google/android/material/tabs/TabLayout;", "d", "Lcom/google/android/material/tabs/TabLayout;", "v", "()Lcom/google/android/material/tabs/TabLayout;", "set_tab_layout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tab_layout", "Landroidx/viewpager2/widget/ViewPager2;", "e", "Landroidx/viewpager2/widget/ViewPager2;", "w", "()Landroidx/viewpager2/widget/ViewPager2;", "set_viewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_viewpager", "Lv/VRelative;", "Lv/VRelative;", "p", "()Lv/VRelative;", "set_no_permission", "(Lv/VRelative;)V", "_no_permission", "Lv/VImage;", "g", "Lv/VImage;", "get_permission_img", "()Lv/VImage;", "set_permission_img", "(Lv/VImage;)V", "_permission_img", "Lv/VText;", "h", "Lv/VText;", "s", "()Lv/VText;", "set_permission_subtitle", "(Lv/VText;)V", "_permission_subtitle", "i", "u", "set_permission_tv", "_permission_tv", "Lv/VButton;", "Lv/VButton;", "q", "()Lv/VButton;", "set_permission_btn", "(Lv/VButton;)V", "_permission_btn", "Ll/bam0;", "Ll/oam0$a;", "l", "Lkotlin/Lazy;", "()Ll/oam0$a;", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oam0 implements s7m<bam0> {

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
    public bam0 presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: l.oam0$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/oam0$a;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Ll/oam0;Landroidx/fragment/app/FragmentActivity;)V", "", "position", "Landroidx/fragment/app/Fragment;", "A", "(I)Landroidx/fragment/app/Fragment;", "getItemCount", "()I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C1079a extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ oam0 f18124j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1079a(@NotNull oam0 oam0Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            fragmentActivity.getClass();
            this.f18124j = oam0Var;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public Fragment m20478A(int position) {
            if (position == 1) {
                return MyVisitorsFrag.Companion.m11563b(MyVisitorsFrag.INSTANCE, null, 1, null);
            }
            if (gr9.INSTANCE.m15948h()) {
                return VisitorsMeFrag.INSTANCE.m11600a(this.f18124j.getAct().getIntent().getStringExtra("from"), this.f18124j.getAct().getIntent().getBooleanExtra("fromDeeplink", false), this.f18124j.getAct().getIntent().getBooleanExtra("hideNavigation", false));
            }
            MomentVisitorsFrag momentVisitorsFrag = new MomentVisitorsFrag();
            Bundle bundle = new Bundle();
            String stringExtra = this.f18124j.getAct().getIntent().getStringExtra("from");
            boolean booleanExtra = this.f18124j.getAct().getIntent().getBooleanExtra("fromDeeplink", false);
            bam0 bam0Var = this.f18124j.presenter;
            boolean z = bam0Var != null && bam0Var.getHasPermission();
            boolean booleanExtra2 = this.f18124j.getAct().getIntent().getBooleanExtra("hideNavigation", false);
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("from", stringExtra);
            }
            bundle.putBoolean("fromDeeplink", booleanExtra);
            bundle.putBoolean("hasPermission", z);
            bundle.putBoolean("hideNavigation", booleanExtra2);
            momentVisitorsFrag.setArguments(bundle);
            return momentVisitorsFrag;
        }

        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.oam0$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"l/oam0$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "onTabReselected", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1080b implements TabLayout.OnTabSelectedListener {
        public void onTabReselected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
        }
    }

    public oam0(@NotNull VisitorsAct visitorsAct) {
        visitorsAct.getClass();
        this.act = visitorsAct;
        this.adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.jam0
            public final Object invoke() {
                return oam0.m20454b(this.f15094a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final void m20450A() {
        m20476v().addOnTabSelectedListener(new C1080b());
        new TabLayoutMediator(m20476v(), m20477w(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.kam0
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                oam0.m20455c(this.f15682a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: B */
    private final void m20451B() {
        m20477w().g(new C1081c());
        m20477w().setAdapter(m20468l());
        m20477w().setUserInputEnabled(false);
    }

    /* JADX INFO: renamed from: C */
    private final void m20452C() {
        final cwf0 cwf0Var = new cwf0("p_my_visitor_setting", Dialog.class.getName());
        new g6m0(this.act, w7c0.e, true).m15620t(new e30() { // from class: l.nam0
            public final void call(Object obj) {
                oam0.m20456d(cwf0Var, this, ((Boolean) obj).booleanValue());
            }
        }).show();
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m20453a(oam0 oam0Var, View view) {
        zvf0.r("e_moment_visitor_set_on", "p_moment_visitor_set");
        bam0 bam0Var = oam0Var.presenter;
        if (bam0Var != null) {
            bam0Var.m12595o0(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1079a m20454b(oam0 oam0Var) {
        return new C1079a(oam0Var, oam0Var.act);
    }

    /* JADX INFO: renamed from: c */
    public static void m20455c(oam0 oam0Var, TabLayout.Tab tab, int i) {
        tab.getClass();
        if (i == 0) {
            oam0Var.m20461z("谁看过我", tab);
        } else {
            oam0Var.m20461z("我看过谁", tab);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20456d(cwf0 cwf0Var, oam0 oam0Var, boolean z) {
        i0e.e(cwf0Var);
        bam0 bam0Var = oam0Var.presenter;
        if (bam0Var != null) {
            bam0Var.m12595o0(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20457e(oam0 oam0Var, View view) {
        zvf0.r("e_my_visitor_setting", "p_my_visitor_isee");
        oam0Var.m20452C();
    }

    /* JADX INFO: renamed from: x */
    private final void m20459x() {
        m20469m().setLeftIconAsBack(this.act);
        bam0 bam0Var = this.presenter;
        boolean z = false;
        if (bam0Var != null && bam0Var.getHasPermission()) {
            z = true;
        }
        m20463E(z);
    }

    /* JADX INFO: renamed from: y */
    private final void m20460y() {
        m20474s().setTypeface((Typeface) null, 1);
        m20472q().setTypeface(null, 1);
        m20474s().setText("开启后可查看谁看过我");
        if (CoreModule.m1854P().m11706a().m19879f()) {
            m20475u().setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        } else {
            m20475u().setText("·记录仅展示同样已开启的用户\n·你查看他人动态也将留下记录");
        }
        xdl0.E0(m20472q(), new View.OnClickListener() { // from class: l.lam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oam0.m20453a(this.f16312a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private final void m20461z(String tabText, TabLayout.Tab tab) {
        VText vTextInflate = o7r.a(this.act).inflate(k6c0.Z1, (ViewGroup) null);
        vTextInflate.getClass();
        VText vText = vTextInflate;
        vText.setText(tabText);
        vText.setTypeface(eqh0.c(3), 1);
        tab.setCustomView(vText);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m20462C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m20463E(boolean hasPermission) {
        if (!hasPermission) {
            m20469m().B();
            xdl0.M(m20471p(), true);
            xdl0.M(m20470n(), false);
            return;
        }
        m20469m().B();
        ImageView imageView = new ImageView(this.act);
        imageView.setImageResource(b3c0.P5);
        m20469m().z(new View[]{imageView});
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.mam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oam0.m20457e(this.f16884a, view);
            }
        });
        xdl0.M(m20471p(), false);
        xdl0.M(m20470n(), true);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m20464f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = pam0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m20464f(inflater, parent);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m20465i1(@NotNull bam0 presenter) {
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
    public final C1079a m20468l() {
        return (C1079a) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VNavigationBar m20469m() {
        VNavigationBar vNavigationBar = this._bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VLinear m20470n() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VRelative m20471p() {
        VRelative vRelative = this._no_permission;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_no_permission");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VButton m20472q() {
        VButton vButton = this._permission_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_permission_btn");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m20473r() {
        m20459x();
        m20460y();
        m20451B();
        m20450A();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VText m20474s() {
        VText vText = this._permission_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_permission_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VText m20475u() {
        VText vText = this._permission_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_permission_tv");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final TabLayout m20476v() {
        TabLayout tabLayout = this._tab_layout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tab_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ViewPager2 m20477w() {
        ViewPager2 viewPager2 = this._viewpager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.oam0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/oam0$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1081c extends ViewPager2.i {
        public void onPageSelected(int position) {
        }
    }
}
