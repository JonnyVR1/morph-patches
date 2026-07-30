package p006l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.SubGender;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.cwf0;
import l.e51;
import l.er2;
import l.i0e;
import l.l5j0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VCheckBox;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002!&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u00107\u001a\u0004\bX\u00109\"\u0004\bY\u0010;R\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010eR\u0016\u0010h\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010gR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010lR\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010p¨\u0006q"}, d2 = {"Ll/glo;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "data", "Lcom/p1/mobile/putong/data/SubGender;", "option", "", "profileShowGender", "", "q", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;Z)V", "p", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/glo$b;", "dismissListener", "r", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;ZLl/glo$b;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_root_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root_layout", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "l", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "Lv/VText;", "d", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", "n", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "f", "Landroid/view/View;", "get_bottom_monolayer_1", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "get_bottom_monolayer_2", "set_bottom_monolayer_2", "_bottom_monolayer_2", "Lv/VCheckBox;", "h", "Lv/VCheckBox;", "o", "()Lv/VCheckBox;", "set_show_profile_check", "(Lv/VCheckBox;)V", "_show_profile_check", "i", "get_show_profile_text", "set_show_profile_text", "_show_profile_text", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_continue_", "(Lv/VButton;)V", "_continue_", "Ll/cwf0;", "k", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "Ll/l5j0;", "dialog", "Ll/xko;", "Ll/xko;", "_adapter", "Lcom/p1/mobile/putong/data/SubGender;", "_currentSubGender", "Z", "_isChanged", "Ll/glo$b;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class glo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _root_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _bt_close;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _bottom_monolayer_1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _bottom_monolayer_2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VCheckBox _show_profile_check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _show_profile_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VButton _continue_;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public xko _adapter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public SubGender _currentSubGender;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public InterfaceC0767b dismissListener;

    /* JADX INFO: renamed from: l.glo$a */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/glo$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0766a extends RecyclerView.n {
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(0, 0, 0, t100.j);
        }
    }

    /* JADX INFO: renamed from: l.glo$b */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ll/glo$b;", "", "Lcom/p1/mobile/putong/data/SubGender;", "option", "", "showProfile", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;Z)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0767b {
        /* JADX INFO: renamed from: a */
        void mo11808a(@Nullable SubGender option, boolean showProfile);
    }

    /* JADX INFO: renamed from: l.glo$c */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/glo$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0768c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f13377a;

        public C0768c(l5j0 l5j0Var) {
            this.f13377a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f13377a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.glo$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/glo$d", "Ll/xko$a;", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0769d implements xko.InterfaceC1442a {
        public C0769d() {
        }

        @Override // p006l.xko.InterfaceC1442a
        /* JADX INFO: renamed from: a */
        public void mo15865a(SubGender optionId) {
            glo gloVar = glo.this;
            if (optionId != null) {
                gloVar._currentSubGender = optionId;
                glo.this._isChanged = true;
            } else {
                gloVar._currentSubGender = null;
                glo.this._isChanged = false;
            }
        }
    }

    /* JADX INFO: renamed from: l.glo$e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/glo$e", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0770e extends er2 {
        public String pageId() {
            return "p_clone_signup_add_more_detail";
        }
    }

    public glo(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.dlo
            public final Object invoke() {
                return glo.m15851e();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m15847a(glo gloVar, int i) {
        gloVar.m15860n().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m15848b(SubGender subGender, IntlGenderItem intlGenderItem) {
        return Boolean.valueOf(Intrinsics.d(intlGenderItem.id, subGender));
    }

    /* JADX INFO: renamed from: c */
    public static void m15849c(glo gloVar, DialogInterface dialogInterface) {
        i0e.e(gloVar.m15857k());
        xko xkoVar = gloVar._adapter;
        if (xkoVar == null) {
            Intrinsics.r("_adapter");
            xkoVar = null;
        }
        xkoVar.m27278L();
    }

    /* JADX INFO: renamed from: d */
    public static void m15850d(glo gloVar, View view) {
        ilo.INSTANCE.m16742m();
        InterfaceC0767b interfaceC0767b = gloVar.dismissListener;
        if (interfaceC0767b != null) {
            interfaceC0767b.mo11808a(gloVar._currentSubGender, gloVar.m15861o().isChecked());
        }
        l5j0 l5j0Var = gloVar.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static cwf0 m15851e() {
        return new cwf0(new C0770e());
    }

    /* JADX INFO: renamed from: f */
    public static void m15852f(glo gloVar, View view) {
        l5j0 l5j0Var = gloVar.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m15855g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM16241b = hlo.m16241b(this, inflater, parent);
        viewM16241b.getClass();
        return viewM16241b;
    }

    /* JADX INFO: renamed from: j */
    public final l5j0 m15856j(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, o8c0.f18070a);
        Window window = l5j0Var.getWindow();
        if (window != null) {
            window.setFlags(512, 512);
        }
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C0768c(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public final cwf0 m15857k() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ImageView m15858l() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m15859m() {
        VButton vButton = this._continue_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_continue_");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VPullUpRecyclerView m15860n() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VCheckBox m15861o() {
        VCheckBox vCheckBox = this._show_profile_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_show_profile_check");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m15862p(List<? extends IntlGenderItem> data, final SubGender option) {
        this._adapter = new xko(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM15860n = m15860n();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(1);
        vPullUpRecyclerViewM15860n.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = this._adapter;
        xko xkoVar = null;
        if (adapter == null) {
            Intrinsics.r("_adapter");
            adapter = null;
        }
        vPullUpRecyclerViewM15860n.setAdapter(adapter);
        vPullUpRecyclerViewM15860n.addItemDecoration(new C0766a());
        xko xkoVar2 = this._adapter;
        if (xkoVar2 == null) {
            Intrinsics.r("_adapter");
            xkoVar2 = null;
        }
        xkoVar2.m27279M(data, option);
        xko xkoVar3 = this._adapter;
        if (xkoVar3 == null) {
            Intrinsics.r("_adapter");
        } else {
            xkoVar = xkoVar3;
        }
        xkoVar.m27280N(new C0769d());
        final int iG = vwb.G(data, new w9j() { // from class: l.elo
            public final Object call(Object obj) {
                return glo.m15848b(option, (IntlGenderItem) obj);
            }
        });
        if (iG > 0) {
            e51.G(new Runnable() { // from class: l.flo
                @Override // java.lang.Runnable
                public final void run() {
                    glo.m15847a(this.f12767a, iG);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m15863q(List<? extends IntlGenderItem> data, SubGender option, boolean profileShowGender) {
        try {
            ilo.INSTANCE.m16743n();
            m15861o().setChecked(profileShowGender);
            this._currentSubGender = option;
            xdl0.E0(m15859m(), new View.OnClickListener() { // from class: l.alo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    glo.m15850d(this.f8346a, view);
                }
            });
            xdl0.E0(m15858l(), new View.OnClickListener() { // from class: l.blo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    glo.m15852f(this.f8976a, view);
                }
            });
            m15862p(data, option);
            i0e.f(m15857k());
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.r("dialog");
                dialog = null;
            }
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.clo
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    glo.m15849c(this.f9718a, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15864r(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option, boolean profileShowGender, @Nullable InterfaceC0767b dismissListener) {
        data.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        Dialog dialog = null;
        this.dialog = m15856j(this.act, m15855g(layoutInflaterFrom, null));
        this.dismissListener = dismissListener;
        m15863q(data, option, profileShowGender);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
