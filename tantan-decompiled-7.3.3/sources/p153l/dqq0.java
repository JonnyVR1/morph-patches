package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R#\u0010.\u001a\n )*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m88121d2 = {"Ll/dqq0;", "Ll/pej0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", c4s.C_ZONE, "()V", BaseSei.f14626Z, "E", "D", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "show", "onStart", SysnotifListener.ACTION_DISMISS, "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "root", "Ll/mqq0;", "h", "Ll/mqq0;", "viewModel", "Ll/gqq0;", RXScreenCaptureService.KEY_INDEX, "Ll/gqq0;", "presenter", "", "j", "Z", "showMatchFilter", "Ll/l4g0;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "A", "()Ll/l4g0;", "pageHelper", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dqq0 extends pej0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ViewGroup root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public mqq0 viewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public gqq0 presenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean showMatchFilter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelper;

    /* JADX INFO: renamed from: l.dqq0$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/dqq0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16605b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f90278a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dqq0 f90279b;

        public C16605b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, dqq0 dqq0Var) {
            this.f90278a = bottomSheetBehavior;
            this.f90279b = dqq0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            bottomSheet.getClass();
            if (newState == 1 || newState == 4) {
                this.f90278a.setState(3);
            } else {
                if (newState != 5) {
                    return;
                }
                this.f90279b.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqq0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
        this.showMatchFilter = true;
        this.pageHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.cqq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return dqq0.m117563x(this.f83113a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final l4g0 m117559A() {
        return (l4g0) this.pageHelper.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final void m117560C() {
        this.presenter = new gqq0(this, this);
        mqq0 mqq0Var = new mqq0(this.act);
        this.viewModel = mqq0Var;
        mqq0Var.m159559C(this.showMatchFilter);
        gqq0 gqq0Var = this.presenter;
        mqq0 mqq0Var2 = null;
        if (gqq0Var == null) {
            Intrinsics.m88391r("presenter");
            gqq0Var = null;
        }
        mqq0 mqq0Var3 = this.viewModel;
        if (mqq0Var3 == null) {
            Intrinsics.m88391r("viewModel");
        } else {
            mqq0Var2 = mqq0Var3;
        }
        gqq0Var.mo52715C(mqq0Var2);
    }

    /* JADX INFO: renamed from: D */
    private final void m117561D() {
        gqq0 gqq0Var = this.presenter;
        if (gqq0Var == null) {
            Intrinsics.m88391r("presenter");
            gqq0Var = null;
        }
        gqq0Var.m131422e();
    }

    /* JADX INFO: renamed from: E */
    private final void m117562E() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: renamed from: x */
    public static l4g0 m117563x(dqq0 dqq0Var) {
        return w1e.m204399c("p_advanced_filter_page", dqq0Var.getClass().getName());
    }

    /* JADX INFO: renamed from: z */
    private final void m117565z() {
        Window window = getWindow();
        if (NullChecker.m82486a(window)) {
            window.getClass();
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(ddc0.f87902h);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(tbc0.f172874X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C16605b(bottomSheetBehaviorFrom, this));
        }
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m117559A().m152776k();
        m117559A().m152775j();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        cancel();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m117560C();
        mqq0 mqq0Var = this.viewModel;
        View view = null;
        if (mqq0Var == null) {
            Intrinsics.m88391r("viewModel");
            mqq0Var = null;
        }
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewInflateView = mqq0Var.inflateView(layoutInflater, null);
        viewInflateView.getClass();
        this.root = (ViewGroup) viewInflateView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view2 = this.root;
        if (view2 == null) {
            Intrinsics.m88391r("root");
        } else {
            view = view2;
        }
        setContentView(view, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = qa00.m175859d(10.0f);
        m117562E();
        setCancelable(false);
        m117559A().m152781p(jyb.m147494Y("filter_page", "p_see_who_likes_me_view_membership"));
        m117559A().m152768c();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        m117559A().m152783r();
        m117561D();
        ViewGroup viewGroup = this.root;
        if (viewGroup == null) {
            Intrinsics.m88391r("root");
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
        m117565z();
    }

    /* JADX INFO: renamed from: l.dqq0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/dqq0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "showMatch", "", "a", "(Lcom/p1/mobile/android/app/Act;Z)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: a */
        public final void m117566a(@NotNull Act act, boolean showMatch) {
            act.getClass();
            dqq0 dqq0Var = new dqq0(act);
            dqq0Var.showMatchFilter = showMatch;
            dqq0Var.show();
        }

        public Companion() {
        }
    }
}
