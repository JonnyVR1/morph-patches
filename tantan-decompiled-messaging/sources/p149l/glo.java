package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.data.IntlGenderItem;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.SubGender;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002!&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u00107\u001a\u0004\bX\u00109\"\u0004\bY\u0010;R\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010eR\u0016\u0010h\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010gR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010lR\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010p¨\u0006q"}, m87232d2 = {"Ll/glo;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "data", "Lcom/p1/mobile/putong/data/SubGender;", Option.TYPE, "", "profileShowGender", "", "q", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;Z)V", "p", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/glo$b;", "dismissListener", "r", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;ZLl/glo$b;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_root_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root_layout", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", "n", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "f", "Landroid/view/View;", "get_bottom_monolayer_1", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "get_bottom_monolayer_2", "set_bottom_monolayer_2", "_bottom_monolayer_2", "Lv/VCheckBox;", "h", "Lv/VCheckBox;", "o", "()Lv/VCheckBox;", "set_show_profile_check", "(Lv/VCheckBox;)V", "_show_profile_check", RXScreenCaptureService.KEY_INDEX, "get_show_profile_text", "set_show_profile_text", "_show_profile_text", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_continue_", "(Lv/VButton;)V", "_continue_", "Ll/cwf0;", "k", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "Ll/l5j0;", OMSTemplateType.dialog, "Ll/xko;", "Ll/xko;", "_adapter", "Lcom/p1/mobile/putong/data/SubGender;", "_currentSubGender", "Z", "_isChanged", "Ll/glo$b;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public InterfaceC17113b dismissListener;

    /* JADX INFO: renamed from: l.glo$a */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/glo$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17112a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(0, 0, 0, t100.f167261j);
        }
    }

    /* JADX INFO: renamed from: l.glo$b */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m87232d2 = {"Ll/glo$b;", "", "Lcom/p1/mobile/putong/data/SubGender;", Option.TYPE, "", "showProfile", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;Z)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC17113b {
        /* JADX INFO: renamed from: a */
        void mo95721a(@Nullable SubGender option, boolean showProfile);
    }

    /* JADX INFO: renamed from: l.glo$c */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/glo$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17114c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f103386a;

        public C17114c(l5j0 l5j0Var) {
            this.f103386a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f103386a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.glo$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/glo$d", "Ll/xko$a;", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17115d implements xko.InterfaceC21166a {
        public C17115d() {
        }

        @Override // p149l.xko.InterfaceC21166a
        /* JADX INFO: renamed from: a */
        public void mo126888a(SubGender optionId) {
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
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/glo$e", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17116e extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_clone_signup_add_more_detail";
        }
    }

    public glo(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.dlo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return glo.m126874e();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m126870a(glo gloVar, int i) {
        gloVar.m126883n().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m126871b(SubGender subGender, IntlGenderItem intlGenderItem) {
        return Boolean.valueOf(Intrinsics.m87488d(intlGenderItem.f38761id, subGender));
    }

    /* JADX INFO: renamed from: c */
    public static void m126872c(glo gloVar, DialogInterface dialogInterface) {
        i0e.m133796e(gloVar.m126880k());
        xko xkoVar = gloVar._adapter;
        if (xkoVar == null) {
            Intrinsics.m87502r("_adapter");
            xkoVar = null;
        }
        xkoVar.m209818L();
    }

    /* JADX INFO: renamed from: d */
    public static void m126873d(glo gloVar, View view) {
        ilo.INSTANCE.m137020m();
        InterfaceC17113b interfaceC17113b = gloVar.dismissListener;
        if (interfaceC17113b != null) {
            interfaceC17113b.mo95721a(gloVar._currentSubGender, gloVar.m126884o().isChecked());
        }
        l5j0 l5j0Var = gloVar.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static cwf0 m126874e() {
        return new cwf0(new C17116e());
    }

    /* JADX INFO: renamed from: f */
    public static void m126875f(glo gloVar, View view) {
        l5j0 l5j0Var = gloVar.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m126878g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM131680b = hlo.m131680b(this, inflater, parent);
        viewM131680b.getClass();
        return viewM131680b;
    }

    /* JADX INFO: renamed from: j */
    public final l5j0 m126879j(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, o8c0.f142607a);
        Window window = l5j0Var.getWindow();
        if (window != null) {
            window.setFlags(512, 512);
        }
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C17114c(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public final cwf0 m126880k() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ImageView m126881l() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m126882m() {
        VButton vButton = this._continue_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_continue_");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VPullUpRecyclerView m126883n() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VCheckBox m126884o() {
        VCheckBox vCheckBox = this._show_profile_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m87502r("_show_profile_check");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m126885p(List<? extends IntlGenderItem> data, final SubGender option) {
        this._adapter = new xko(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM126883n = m126883n();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(1);
        vPullUpRecyclerViewM126883n.setLayoutManager(linearLayoutManager);
        xko xkoVar = this._adapter;
        xko xkoVar2 = null;
        if (xkoVar == null) {
            Intrinsics.m87502r("_adapter");
            xkoVar = null;
        }
        vPullUpRecyclerViewM126883n.setAdapter(xkoVar);
        vPullUpRecyclerViewM126883n.addItemDecoration(new C17112a());
        xko xkoVar3 = this._adapter;
        if (xkoVar3 == null) {
            Intrinsics.m87502r("_adapter");
            xkoVar3 = null;
        }
        xkoVar3.m209819M(data, option);
        xko xkoVar4 = this._adapter;
        if (xkoVar4 == null) {
            Intrinsics.m87502r("_adapter");
        } else {
            xkoVar2 = xkoVar4;
        }
        xkoVar2.m209820N(new C17115d());
        final int iM200293G = vwb.m200293G(data, new w9j() { // from class: l.elo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return glo.m126871b(option, (IntlGenderItem) obj);
            }
        });
        if (iM200293G > 0) {
            e51.m114742G(new Runnable() { // from class: l.flo
                @Override // java.lang.Runnable
                public final void run() {
                    glo.m126870a(this.f98201a, iM200293G);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m126886q(List<? extends IntlGenderItem> data, SubGender option, boolean profileShowGender) {
        try {
            ilo.INSTANCE.m137021n();
            m126884o().setChecked(profileShowGender);
            this._currentSubGender = option;
            xdl0.m208329E0(m126882m(), new View.OnClickListener() { // from class: l.alo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    glo.m126873d(this.f70477a, view);
                }
            });
            xdl0.m208329E0(m126881l(), new View.OnClickListener() { // from class: l.blo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    glo.m126875f(this.f76199a, view);
                }
            });
            m126885p(data, option);
            i0e.m133797f(m126880k());
            l5j0 l5j0Var = this.dialog;
            if (l5j0Var == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                l5j0Var = null;
            }
            l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.clo
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    glo.m126872c(this.f81451a, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m126887r(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option, boolean profileShowGender, @Nullable InterfaceC17113b dismissListener) {
        data.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        l5j0 l5j0Var = null;
        this.dialog = m126879j(this.act, m126878g(layoutInflaterFrom, null));
        this.dismissListener = dismissListener;
        m126886q(data, option, profileShowGender);
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            l5j0Var = l5j0Var2;
        }
        l5j0Var.show();
    }
}
