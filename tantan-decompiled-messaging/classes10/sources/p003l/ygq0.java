package p003l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.i0e;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.t100;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R#\u0010.\u001a\n )*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Ll/ygq0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "C", "()V", "z", "E", "D", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "show", "onStart", "dismiss", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "root", "Ll/hhq0;", "h", "Ll/hhq0;", "viewModel", "Ll/bhq0;", "i", "Ll/bhq0;", "presenter", "", "j", "Z", "showMatchFilter", "Ll/cwf0;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "A", "()Ll/cwf0;", "pageHelper", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/ygq0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class C3493b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f9064a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ygq0 f9065b;

        public C3493b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior, ygq0 ygq0Var) {
            this.f9064a = bottomSheetBehavior;
            this.f9065b = ygq0Var;
        }

        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

        public void onStateChanged(View bottomSheet, int newState) {
            bottomSheet.getClass();
            if (newState == 1 || newState == 4) {
                this.f9064a.setState(3);
            } else {
                if (newState != 5) {
                    return;
                }
                this.f9065b.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygq0(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
        this.showMatchFilter = true;
        this.pageHelper = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.xgq0
            public final Object invoke() {
                return ygq0.m11247x(this.f8459a);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final cwf0 m11243A() {
        return (cwf0) this.pageHelper.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final void m11244C() {
        this.presenter = new bhq0(this, this);
        hhq0 hhq0Var = new hhq0(this.act);
        this.viewModel = hhq0Var;
        hhq0Var.m6970C(this.showMatchFilter);
        bhq0 bhq0Var = this.presenter;
        hhq0 hhq0Var2 = null;
        if (bhq0Var == null) {
            Intrinsics.r("presenter");
            bhq0Var = null;
        }
        hhq0 hhq0Var3 = this.viewModel;
        if (hhq0Var3 == null) {
            Intrinsics.r("viewModel");
        } else {
            hhq0Var2 = hhq0Var3;
        }
        bhq0Var.C(hhq0Var2);
    }

    /* JADX INFO: renamed from: D */
    private final void m11245D() {
        bhq0 bhq0Var = this.presenter;
        if (bhq0Var == null) {
            Intrinsics.r("presenter");
            bhq0Var = null;
        }
        bhq0Var.m5720e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private final void m11246E() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX INFO: renamed from: x */
    public static cwf0 m11247x(ygq0 ygq0Var) {
        return i0e.c("p_advanced_filter_page", ygq0Var.getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private final void m11249z() {
        Window window = getWindow();
        if (NullChecker.a(window)) {
            window.getClass();
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.f8338h);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(n3c0.X);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3493b(bottomSheetBehaviorFrom, this));
        }
    }

    public void dismiss() {
        m11243A().k();
        m11243A().j();
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        super/*android.app.Dialog*/.onBackPressed();
        cancel();
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(savedInstanceState);
        m11244C();
        hhq0 hhq0Var = this.viewModel;
        ViewGroup viewGroup = null;
        if (hhq0Var == null) {
            Intrinsics.r("viewModel");
            hhq0Var = null;
        }
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewInflateView = hhq0Var.inflateView(layoutInflater, null);
        viewInflateView.getClass();
        this.root = (ViewGroup) viewInflateView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup2 = this.root;
        if (viewGroup2 == null) {
            Intrinsics.r("root");
        } else {
            viewGroup = viewGroup2;
        }
        setContentView(viewGroup, layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.d(10.0f);
        m11246E();
        setCancelable(false);
        m11243A().p(new j760[]{vwb.Y("filter_page", "p_see_who_likes_me_view_membership")});
        m11243A().c();
    }

    public void onStart() {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onStart();
        m11243A().r();
        m11245D();
        ViewGroup viewGroup = this.root;
        if (viewGroup == null) {
            Intrinsics.r("root");
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

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m11249z();
    }

    /* JADX INFO: renamed from: l.ygq0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/ygq0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "showMatch", "", "a", "(Lcom/p1/mobile/android/app/Act;Z)V", "member_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: a */
        public final void m11250a(@NotNull Act act, boolean showMatch) {
            act.getClass();
            ygq0 ygq0Var = new ygq0(act);
            ygq0Var.showMatchFilter = showMatch;
            ygq0Var.show();
        }

        public Companion() {
        }
    }
}
