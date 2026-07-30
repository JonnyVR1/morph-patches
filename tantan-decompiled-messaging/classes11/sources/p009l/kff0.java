package p009l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.LikeMindedData;
import com.p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p1.mobile.putong.core.data.SimilarInterestsConfigData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData;
import com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundButton;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundView;
import com.p1.mobile.putong.core.ui.toppicks.OffsetGridLayoutManager;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.er2;
import l.l5j0;
import l.lff0;
import l.lsi0;
import l.qib0;
import l.t100;
import l.v7c0;
import l.w0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0013\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010%\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010]R\u0016\u0010a\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010fR\u001b\u0010k\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010i\u001a\u0004\bb\u0010j¨\u0006l"}, d2 = {"Ll/kff0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "", "mccData", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "baseData", "", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemData;", "listData", "language", MiniWidgetProvider.KEY_TYPE, "", "s", "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "r", "Landroid/view/View;", "rootView", "Ll/l5j0;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "Lcom/p1/mobile/putong/core/data/LikeMindedData;", "likeMindedData", "", "source", "u", "(Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;Lcom/p1/mobile/putong/core/data/LikeMindedData;I)V", "a", "Lcom/p1/mobile/android/app/Act;", "i", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "b", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "q", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_top", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "l", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "p", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "f", "Landroid/view/View;", "m", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "g", "n", "set_bottom_monolayer_2", "_bottom_monolayer_2", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "h", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/l5j0;", "dialog", "Ll/dff0;", "Ll/dff0;", "_adapter", "k", "Ljava/lang/String;", "_currentType", "", "Z", "_isChanged", "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kff0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RoundConstraintLayout _root_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundView _top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _bottom_monolayer_1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _bottom_monolayer_2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public RoundButton _bt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public dff0 _adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public String _currentType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.kff0$a */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/kff0$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0991a extends RecyclerView.n {
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, 0, 0, t100.i);
            } else if ((childAdapterPosition - 1) % 2 == 0) {
                outRect.set(0, 0, t100.g, t100.l);
            } else {
                outRect.set(t100.g, 0, 0, t100.l);
            }
        }
    }

    /* JADX INFO: renamed from: l.kff0$b */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/kff0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0992b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f15642a;

        public C0992b(l5j0 l5j0Var) {
            this.f15642a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f15642a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.kff0$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/kff0$c", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0993c extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f15644b;

        public C0993c(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f15644b = offsetGridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m17481f(int position) {
            dff0 dff0Var = kff0.this._adapter;
            if (dff0Var == null) {
                Intrinsics.r("_adapter");
                dff0Var = null;
            }
            if (dff0Var.getItemViewType(position) == 0) {
                return this.f15644b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.kff0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/kff0$d", "Ll/dff0$b;", "", "selectedType", "", "onClick", "(Ljava/lang/String;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0994d implements dff0.InterfaceC0847b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimilarInterestsBaseData f15646b;

        public C0994d(SimilarInterestsBaseData similarInterestsBaseData) {
            this.f15646b = similarInterestsBaseData;
        }

        @Override // p009l.dff0.InterfaceC0847b
        public void onClick(String selectedType) {
            selectedType.getClass();
            kff0.this.m17475o().setBackgroundColor(Color.parseColor(this.f15646b.bottomButtonBg));
            kff0.this._currentType = selectedType;
            kff0.this.m17475o().setText(kff0.this.getAct().getString(R.string.I8));
            kff0.this._isChanged = true;
        }
    }

    /* JADX INFO: renamed from: l.kff0$e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/kff0$e", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0995e extends er2 {
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public kff0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.iff0
            public final Object invoke() {
                return kff0.m17460a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static cwf0 m17460a() {
        return new cwf0(new C0995e());
    }

    /* JADX INFO: renamed from: b */
    public static void m17461b(final kff0 kff0Var, View view) {
        if (kff0Var._isChanged) {
            qff0.INSTANCE.m20954s();
            final LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
            likeMindedRequestParams.mcc = String.valueOf(qib0.f0);
            String str = kff0Var._currentType;
            if (str == null) {
                str = "";
            }
            likeMindedRequestParams.type = str;
            CoreModule.c.B1.e3(kff0Var.act, likeMindedRequestParams, new Function1() { // from class: l.jff0
                public final Object invoke(Object obj) {
                    return kff0.m17467t(likeMindedRequestParams, kff0Var, (LikeMindedEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17463d(kff0 kff0Var, List list, DialogInterface dialogInterface) {
        i0e.m16064e(kff0Var.m17471k());
        int size = list.size();
        int i = 0;
        while (i < size) {
            dff0 dff0Var = kff0Var._adapter;
            if (dff0Var == null) {
                Intrinsics.r("_adapter");
                dff0Var = null;
            }
            i++;
            SimilarInterestsItemStatusData item = dff0Var.getItem(i);
            if (item != null) {
                item.isSelected = false;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m17467t(LikeMindedRequestParams likeMindedRequestParams, kff0 kff0Var, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        qff0 qff0Var = qff0.INSTANCE;
        qff0Var.m20948m().put(Boolean.TRUE);
        String str = likeMindedRequestParams.type;
        str.getClass();
        qff0Var.m20955t(str);
        l5j0 l5j0Var = kff0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
        lsi0.w(R.string.O1);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m17468e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = lff0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: j */
    public final l5j0 m17470j(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new C0992b(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: k */
    public final cwf0 m17471k() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VDraweeView m17472l() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m17473m() {
        View view = this._bottom_monolayer_1;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_monolayer_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m17474n() {
        View view = this._bottom_monolayer_2;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_monolayer_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundButton m17475o() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VPullUpRecyclerView m17476p() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundConstraintLayout m17477q() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m17478r(List<String> mccData, SimilarInterestsBaseData baseData, Map<String, SimilarInterestsItemData> listData, String language, String type) {
        dff0 dff0Var;
        this._adapter = new dff0(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM17476p = m17476p();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(this.act, 2, 1, false);
        offsetGridLayoutManager.v(new C0993c(offsetGridLayoutManager));
        vPullUpRecyclerViewM17476p.setLayoutManager(offsetGridLayoutManager);
        RecyclerView.Adapter adapter = this._adapter;
        dff0 dff0Var2 = null;
        if (adapter == null) {
            Intrinsics.r("_adapter");
            adapter = null;
        }
        vPullUpRecyclerViewM17476p.setAdapter(adapter);
        vPullUpRecyclerViewM17476p.addItemDecoration(new C0991a());
        dff0 dff0Var3 = this._adapter;
        if (dff0Var3 == null) {
            Intrinsics.r("_adapter");
            dff0Var = null;
        } else {
            dff0Var = dff0Var3;
        }
        dff0Var.m13313M(mccData, listData, language, baseData, type);
        dff0 dff0Var4 = this._adapter;
        if (dff0Var4 == null) {
            Intrinsics.r("_adapter");
        } else {
            dff0Var2 = dff0Var4;
        }
        dff0Var2.m13314N(new C0994d(baseData));
    }

    /* JADX INFO: renamed from: s */
    public final void m17479s(final List<String> mccData, SimilarInterestsBaseData baseData, Map<String, SimilarInterestsItemData> listData, String language, String type) {
        SimilarInterestsItemData similarInterestsItemData;
        Map map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        SimilarInterestsItemStatusData similarInterestsItemStatusData;
        Map map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        SimilarInterestsItemStatusData similarInterestsItemStatusData2;
        this._currentType = type;
        try {
            qib0.G.L0(m17472l(), baseData.background.img);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            m17477q().setBackground(new GradientDrawable(orientation, new int[]{Color.parseColor(baseData.background.startColor), Color.parseColor(baseData.background.endColor)}));
            Dialog dialog = null;
            if (TextUtils.isEmpty(type)) {
                m17475o().setBackgroundColor(this.act.getResources().getColor(w0c0.L0));
                m17475o().setText(this.act.getString(R.string.K8));
            } else {
                m17475o().setBackgroundColor(Color.parseColor(baseData.bottomButtonSelectedBg));
                SimilarInterestsItemData similarInterestsItemData2 = listData.get(type);
                String str = (similarInterestsItemData2 == null || (map2 = similarInterestsItemData2.multiLanguage) == null || (similarInterestsItemLanguagesData2 = (SimilarInterestsItemLanguagesData) map2.get(language)) == null || (similarInterestsItemStatusData2 = similarInterestsItemLanguagesData2.status) == null) ? null : similarInterestsItemStatusData2.title;
                RoundButton roundButtonM17475o = m17475o();
                Act act = this.act;
                int i = R.string.J8;
                if (str == null && ((similarInterestsItemData = listData.get(type)) == null || (map = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData = (SimilarInterestsItemLanguagesData) map.get("en-US")) == null || (similarInterestsItemStatusData = similarInterestsItemLanguagesData.status) == null || (str = similarInterestsItemStatusData.title) == null)) {
                    str = "";
                }
                roundButtonM17475o.setText(act.getString(i, str));
            }
            m17475o().setTextColor(Color.parseColor(baseData.bottomButtonTextColor));
            m17473m().setBackground(new GradientDrawable(orientation, new int[]{Color.parseColor(baseData.bottomMonolayer.startColor), Color.parseColor(baseData.bottomMonolayer.endColor)}));
            m17474n().setBackgroundColor(Color.parseColor(baseData.bottomMonolayer.endColor));
            xdl0.E0(m17475o(), new View.OnClickListener() { // from class: l.gff0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kff0.m17461b(this.f13506a, view);
                }
            });
            m17478r(mccData, baseData, listData, language, type);
            i0e.m16065f(m17471k());
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                Intrinsics.r("dialog");
            } else {
                dialog = dialog2;
            }
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hff0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    kff0.m17463d(this.f14056a, mccData, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m17480u(@Nullable SimilarInterestsConfigData data, @Nullable LikeMindedData likeMindedData, int source) {
        SimilarInterestsMccConfigData similarInterestsMccConfigData;
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
            layoutInflaterFrom.getClass();
            Dialog dialog = null;
            this.dialog = m17470j(this.act, m17468e(layoutInflaterFrom, null));
            if (!data.mcc.containsKey(String.valueOf(qib0.f0)) || (similarInterestsMccConfigData = (SimilarInterestsMccConfigData) data.mcc.get(String.valueOf(qib0.f0))) == null) {
                return;
            }
            List<String> list = similarInterestsMccConfigData.items;
            list.getClass();
            SimilarInterestsBaseData similarInterestsBaseData = data.baseData;
            similarInterestsBaseData.getClass();
            Map<String, SimilarInterestsItemData> map = data.listData;
            map.getClass();
            qff0 qff0Var = qff0.INSTANCE;
            m17479s(list, similarInterestsBaseData, map, qff0Var.m20942g(), likeMindedData != null ? likeMindedData.type : null);
            qff0Var.m20939d(source);
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                Intrinsics.r("dialog");
            } else {
                dialog = dialog2;
            }
            dialog.show();
        }
    }
}
