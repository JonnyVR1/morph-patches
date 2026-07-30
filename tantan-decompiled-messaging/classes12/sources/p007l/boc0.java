package p007l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.BloodType;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.data.OMSTemplateType;
import com.p000p1.mobile.putong.data.Position;
import com.p000p1.mobile.putong.data.ResourceDirection;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundButton;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import com.p1.mobile.putong.core.ui.toppicks.OffsetGridLayoutManager;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.coc0;
import l.e51;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.nvc0;
import l.qib0;
import l.s69;
import l.t100;
import l.tvl;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, d2 = {"Ll/boc0;", "Ll/tvl;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "sticker", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "", "option", "", "y", "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;I)V", "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "l", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", Data.TYPE, "source", BloodType.f186A, "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;II)V", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", RXScreenCaptureService.KEY_WIDTH, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "p", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", ResourceDirection.f269v, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "g", "Landroid/view/View;", "r", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "h", "s", "set_bottom_monolayer_2", "_bottom_monolayer_2", RXScreenCaptureService.KEY_INDEX, "q", "set_bottom_monolayer", "_bottom_monolayer", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "j", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "t", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/l5j0;", "k", "Ll/l5j0;", OMSTemplateType.dialog, "Ll/snc0;", "Ll/snc0;", "_adapter", "m", "Ljava/lang/Integer;", "_currentType", "", "n", "Z", "_isChanged", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class boc0 extends tvl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundConstraintLayout _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _bt_close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _bottom_monolayer_1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _bottom_monolayer_2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _bottom_monolayer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public RoundButton _bt;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public snc0 _adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Integer _currentType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: l.boc0$a */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll/boc0$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "columns", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", Channel.state, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "a", "I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2342a extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int columns;

        public C2342a(int i) {
            this.columns = i;
        }

        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, t100.e, 0, t100.v);
            } else if ((childAdapterPosition - 1) % this.columns == 0) {
                outRect.set(0, 0, t100.e, t100.h);
            } else {
                outRect.set(t100.e, 0, 0, t100.h);
            }
        }
    }

    /* JADX INFO: renamed from: l.boc0$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/boc0$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", Position.TYPE, "f", "(I)I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2343b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f6395b;

        public C2343b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f6395b = offsetGridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m8970f(int position) {
            snc0 snc0Var = boc0.this._adapter;
            if (snc0Var == null) {
                Intrinsics.r("_adapter");
                snc0Var = null;
            }
            if (snc0Var.getItemViewType(position) == 0) {
                return this.f6395b.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.boc0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/boc0$c", "Ll/snc0$b;", "", "optionId", "", "a", "(I)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2344c implements snc0.InterfaceC2491b {
        public C2344c() {
        }

        @Override // p007l.snc0.InterfaceC2491b
        /* JADX INFO: renamed from: a */
        public void mo8971a(int optionId) {
            boc0.this.m8964t().setAlpha(1.0f);
            boc0.this._currentType = Integer.valueOf(optionId);
            boc0.this._isChanged = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc0(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static final void m8946B(boc0 boc0Var) {
        boc0Var.m8960p().getLayoutParams().height = boc0Var.m8967w().getHeight();
        boc0Var.m8960p().setLayoutParams(boc0Var.m8960p().getLayoutParams());
    }

    /* JADX INFO: renamed from: e */
    public static void m8947e(boc0 boc0Var, IntlMarketStickerData intlMarketStickerData, DialogInterface dialogInterface) {
        snc0 snc0Var;
        i0e.e(boc0Var.d());
        int size = intlMarketStickerData.options.size();
        int i = 0;
        while (true) {
            snc0Var = boc0Var._adapter;
            if (i >= size) {
                break;
            }
            if (snc0Var == null) {
                Intrinsics.r("_adapter");
                snc0Var = null;
            }
            i++;
            IntlMarketStickerOptionsData intlMarketStickerOptionsDataM14272K = snc0Var.getItem(i);
            if (intlMarketStickerOptionsDataM14272K != null) {
                intlMarketStickerOptionsDataM14272K.isSelected = false;
            }
        }
        if (snc0Var == null) {
            Intrinsics.r("_adapter");
            snc0Var = null;
        }
        snc0Var.m14274M();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m8948f(int i, IntlMarketStickerOptionsData intlMarketStickerOptionsData) {
        return Boolean.valueOf(intlMarketStickerOptionsData.id == i);
    }

    /* JADX INFO: renamed from: g */
    public static void m8949g(boc0 boc0Var, int i) {
        boc0Var.m8966v().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m8950h(final boc0 boc0Var, View view) {
        foc0.INSTANCE.m10253g();
        if (boc0Var.m8964t().getAlpha() == 1.0f) {
            IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
            Integer num = boc0Var._currentType;
            intlMarketRequestParams.regular_option = num != null ? num.intValue() : 0;
            intlMarketRequestParams.mcc = String.valueOf(qib0.f0);
            s69 s69Var = CoreModule.c.A1;
            s69Var.getClass();
            s69.s3(s69Var, boc0Var.b(), intlMarketRequestParams, (Function0) null, new Function1() { // from class: l.ync0
                public final Object invoke(Object obj) {
                    return boc0.m8957z(this.f15478a, (IntlMarketResponseEnvelope) obj);
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8952j(boc0 boc0Var, View view) {
        l5j0 l5j0Var = boc0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m8957z(boc0 boc0Var, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        foc0.INSTANCE.m10249c().put(Boolean.TRUE);
        l5j0 l5j0Var = boc0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
        lsi0.w(R.string.O1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m8958A(@Nullable IntlMarketConfigData data, int option, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(b());
            layoutInflaterFrom.getClass();
            Dialog dialog = null;
            this.dialog = c(b(), m8959l(layoutInflaterFrom, null));
            IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
            intlMarketStickerData.getClass();
            IntlMarketSummaryData intlMarketSummaryData = data.regular_summary;
            intlMarketSummaryData.getClass();
            m8969y(intlMarketStickerData, intlMarketSummaryData, option);
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                Intrinsics.r(OMSTemplateType.dialog);
            } else {
                dialog = dialog2;
            }
            dialog.show();
            m8967w().post(new Runnable() { // from class: l.unc0
                @Override // java.lang.Runnable
                public final void run() {
                    boc0.m8946B(this.f13891a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m8959l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = coc0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m8960p() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VDraweeView m8961q() {
        VDraweeView vDraweeView = this._bottom_monolayer;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bottom_monolayer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final View m8962r() {
        View view = this._bottom_monolayer_1;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_monolayer_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final View m8963s() {
        View view = this._bottom_monolayer_2;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bottom_monolayer_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final RoundButton m8964t() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m8965u() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m8966v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundConstraintLayout m8967w() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m8968x(IntlMarketStickerData sticker, IntlMarketSummaryData summary, final int option) {
        this._adapter = new snc0(b());
        VPullUpRecyclerView vPullUpRecyclerViewM8966v = m8966v();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(b(), sticker.columns, 1, false);
        offsetGridLayoutManager.v(new C2343b(offsetGridLayoutManager));
        vPullUpRecyclerViewM8966v.setLayoutManager(offsetGridLayoutManager);
        RecyclerView.Adapter adapter = this._adapter;
        snc0 snc0Var = null;
        if (adapter == null) {
            Intrinsics.r("_adapter");
            adapter = null;
        }
        vPullUpRecyclerViewM8966v.setAdapter(adapter);
        vPullUpRecyclerViewM8966v.addItemDecoration(new C2342a(sticker.columns));
        snc0 snc0Var2 = this._adapter;
        if (snc0Var2 == null) {
            Intrinsics.r("_adapter");
            snc0Var2 = null;
        }
        snc0Var2.m14275N(sticker, summary, option);
        snc0 snc0Var3 = this._adapter;
        if (snc0Var3 == null) {
            Intrinsics.r("_adapter");
        } else {
            snc0Var = snc0Var3;
        }
        snc0Var.m14276O(new C2344c());
        final int iG = vwb.G(sticker.options, new w9j() { // from class: l.znc0
            public final Object call(Object obj) {
                return boc0.m8948f(option, (IntlMarketStickerOptionsData) obj);
            }
        });
        if (iG > sticker.columns - 1) {
            e51.G(new Runnable() { // from class: l.aoc0
                @Override // java.lang.Runnable
                public final void run() {
                    boc0.m8949g(this.f5792a, iG);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m8969y(final IntlMarketStickerData sticker, IntlMarketSummaryData summary, int option) {
        this._currentType = Integer.valueOf(option);
        try {
            if (!TextUtils.isEmpty(summary.bg_color)) {
                m8967w().setBackgroundColor(Color.parseColor(summary.bg_color));
            }
            qib0.G.O0(m8960p(), summary.bg_url, true, false, (nvc0) null, (ym2) null);
            if (!TextUtils.isEmpty(summary.confirm_btn_bg_url)) {
                xdl0.M(m8962r(), false);
                xdl0.M(m8963s(), false);
                qib0.G.O0(m8961q(), summary.confirm_btn_bg_url, true, false, (nvc0) null, (ym2) null);
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_color)) {
                m8964t().setBackgroundColor(Color.parseColor(summary.confirm_btn_color));
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_font_color)) {
                m8964t().setTextColor(Color.parseColor(summary.confirm_btn_font_color));
            }
            m8964t().setText(summary.confirm_btn_desc);
            if (option < 1) {
                m8964t().setAlpha(0.3f);
            } else {
                m8964t().setAlpha(1.0f);
            }
            foc0.INSTANCE.m10254h();
            xdl0.E0(m8964t(), new View.OnClickListener() { // from class: l.vnc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boc0.m8950h(this.f14251a, view);
                }
            });
            xdl0.E0(m8965u(), new View.OnClickListener() { // from class: l.wnc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boc0.m8952j(this.f14634a, view);
                }
            });
            m8968x(sticker, summary, option);
            d().p(new j760[]{vwb.Y("intl_mkt_regular_popup_type", String.valueOf(sticker != null ? sticker.columns : 0))});
            i0e.f(d());
            Dialog dialog = this.dialog;
            if (dialog == null) {
                Intrinsics.r(OMSTemplateType.dialog);
                dialog = null;
            }
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xnc0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    boc0.m8947e(this.f15048a, sticker, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
