package p149l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R#\u0010.\u001a\n )*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m87232d2 = {"Ll/ygq0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", b2s.C_ZONE, "()V", BaseSei.f13932Z, "E", "D", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "show", "onStart", SysnotifListener.ACTION_DISMISS, "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "root", "Ll/hhq0;", "h", "Ll/hhq0;", "viewModel", "Ll/bhq0;", RXScreenCaptureService.KEY_INDEX, "Ll/bhq0;", "presenter", "", "j", "Z", "showMatchFilter", "Ll/cwf0;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "A", "()Ll/cwf0;", "pageHelper", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ygq0 extends l5j0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ViewGroup root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public hhq0 viewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public bhq0 presenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean showMatchFilter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelper;

    /* JADX INFO: renamed from: l.ygq0$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/ygq0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21399b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f198222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ygq0 f198223b;

        public C21399b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, ygq0 ygq0Var) {
            this.f198222a = bottomSheetBehavior;
            this.f198223b = ygq0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            bottomSheet.getClass();
            if (newState == 1 || newState == 4) {
                this.f198222a.setState(3);
            } else {
                if (newState != 5) {
                    return;
                }
                this.f198223b.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygq0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
        this.showMatchFilter = true;
        this.pageHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.xgq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ygq0.m214745x(this.f192784a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final cwf0 m214741A() {
        return (cwf0) this.pageHelper.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final void m214742C() {
        this.presenter = new bhq0(this, this);
        hhq0 hhq0Var = new hhq0(this.act);
        this.viewModel = hhq0Var;
        hhq0Var.m131106C(this.showMatchFilter);
        bhq0 bhq0Var = this.presenter;
        hhq0 hhq0Var2 = null;
        if (bhq0Var == null) {
            Intrinsics.m87502r("presenter");
            bhq0Var = null;
        }
        hhq0 hhq0Var3 = this.viewModel;
        if (hhq0Var3 == null) {
            Intrinsics.m87502r("viewModel");
        } else {
            hhq0Var2 = hhq0Var3;
        }
        bhq0Var.mo51532C(hhq0Var2);
    }

    /* JADX INFO: renamed from: D */
    private final void m214743D() {
        bhq0 bhq0Var = this.presenter;
        if (bhq0Var == null) {
            Intrinsics.m87502r("presenter");
            bhq0Var = null;
        }
        bhq0Var.m101914e();
    }

    /* JADX INFO: renamed from: E */
    private final void m214744E() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: renamed from: x */
    public static cwf0 m214745x(ygq0 ygq0Var) {
        return i0e.m133794c("p_advanced_filter_page", ygq0Var.getClass().getName());
    }

    /* JADX INFO: renamed from: z */
    private final void m214747z() {
        Window window = getWindow();
        if (NullChecker.m81303a(window)) {
            window.getClass();
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.f190997h);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(n3c0.f136959X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C21399b(bottomSheetBehaviorFrom, this));
        }
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m214741A().m109035k();
        m214741A().m109034j();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        cancel();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m214742C();
        hhq0 hhq0Var = this.viewModel;
        View view = null;
        if (hhq0Var == null) {
            Intrinsics.m87502r("viewModel");
            hhq0Var = null;
        }
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewInflateView = hhq0Var.inflateView(layoutInflater, null);
        viewInflateView.getClass();
        this.root = (ViewGroup) viewInflateView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view2 = this.root;
        if (view2 == null) {
            Intrinsics.m87502r("root");
        } else {
            view = view2;
        }
        setContentView(view, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.m186890d(10.0f);
        m214744E();
        setCancelable(false);
        m214741A().m109040p(vwb.m200311Y("filter_page", "p_see_who_likes_me_view_membership"));
        m214741A().m109027c();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        m214741A().m109042r();
        m214743D();
        ViewGroup viewGroup = this.root;
        if (viewGroup == null) {
            Intrinsics.m87502r("root");
            viewGroup = null;
        }
        ViewParent parent = viewGroup.getParent();
        parent.getClass();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((ViewGroup) parent);
        bottomSheetBehaviorFrom.getClass();
        if (bottomSheetBehaviorFrom.getState() != 3) {
            bottomSheetBehaviorFrom.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m214747z();
    }

    /* JADX INFO: renamed from: l.ygq0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/ygq0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "showMatch", "", "a", "(Lcom/p1/mobile/android/app/Act;Z)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: a */
        public final void m214748a(@NotNull Act act, boolean showMatch) {
            act.getClass();
            ygq0 ygq0Var = new ygq0(act);
            ygq0Var.showMatchFilter = showMatch;
            ygq0Var.show();
        }

        public Companion() {
        }
    }
}
