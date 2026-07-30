package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p046p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.toppicks.OffsetGridLayoutManager;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, m87232d2 = {"Ll/boc0;", "Ll/tvl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "sticker", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "", Option.TYPE, "", BaseSei.f13931Y, "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;I)V", BaseSei.f13930X, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "data", "source", "A", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;II)V", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "w", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "p", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", ResourceDirection.f38808v, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "g", "Landroid/view/View;", "r", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "h", BLiveStormDanmakuGiftResourceType.f44446s, "set_bottom_monolayer_2", "_bottom_monolayer_2", RXScreenCaptureService.KEY_INDEX, "q", "set_bottom_monolayer", "_bottom_monolayer", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "j", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/l5j0;", "k", "Ll/l5j0;", OMSTemplateType.dialog, "Ll/snc0;", "Ll/snc0;", "_adapter", "m", "Ljava/lang/Integer;", "_currentType", "", "n", "Z", "_isChanged", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/boc0$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "columns", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "a", "I", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15915a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int columns;

        public C15915a(int i) {
            this.columns = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, t100.f167256e, 0, t100.f167273v);
            } else if ((childAdapterPosition - 1) % this.columns == 0) {
                outRect.set(0, 0, t100.f167256e, t100.f167259h);
            } else {
                outRect.set(t100.f167256e, 0, 0, t100.f167259h);
            }
        }
    }

    /* JADX INFO: renamed from: l.boc0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"l/boc0$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15916b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f76510b;

        public C15916b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f76510b = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            snc0 snc0Var = boc0.this._adapter;
            if (snc0Var == null) {
                Intrinsics.m87502r("_adapter");
                snc0Var = null;
            }
            if (snc0Var.getItemViewType(position) == 0) {
                return this.f76510b.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.boc0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/boc0$c", "Ll/snc0$b;", "", "optionId", "", "a", "(I)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15917c implements snc0.InterfaceC19996b {
        public C15917c() {
        }

        @Override // p149l.snc0.InterfaceC19996b
        /* JADX INFO: renamed from: a */
        public void mo102937a(int optionId) {
            boc0.this.m102931t().setAlpha(1.0f);
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
    public static final void m102913B(boc0 boc0Var) {
        boc0Var.m102927p().getLayoutParams().height = boc0Var.m102934w().getHeight();
        boc0Var.m102927p().setLayoutParams(boc0Var.m102927p().getLayoutParams());
    }

    /* JADX INFO: renamed from: e */
    public static void m102914e(boc0 boc0Var, IntlMarketStickerData intlMarketStickerData, DialogInterface dialogInterface) {
        snc0 snc0Var;
        i0e.m133796e(boc0Var.m190754d());
        int size = intlMarketStickerData.options.size();
        int i = 0;
        while (true) {
            snc0Var = boc0Var._adapter;
            if (i >= size) {
                break;
            }
            if (snc0Var == null) {
                Intrinsics.m87502r("_adapter");
                snc0Var = null;
            }
            i++;
            IntlMarketStickerOptionsData item = snc0Var.getItem(i);
            if (item != null) {
                item.isSelected = false;
            }
        }
        if (snc0Var == null) {
            Intrinsics.m87502r("_adapter");
            snc0Var = null;
        }
        snc0Var.m185053M();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m102915f(int i, IntlMarketStickerOptionsData intlMarketStickerOptionsData) {
        return Boolean.valueOf(intlMarketStickerOptionsData.f20426id == i);
    }

    /* JADX INFO: renamed from: g */
    public static void m102916g(boc0 boc0Var, int i) {
        boc0Var.m102933v().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m102917h(final boc0 boc0Var, View view) {
        foc0.INSTANCE.m122435g();
        if (boc0Var.m102931t().getAlpha() == 1.0f) {
            IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
            Integer num = boc0Var._currentType;
            intlMarketRequestParams.regular_option = num != null ? num.intValue() : 0;
            intlMarketRequestParams.mcc = String.valueOf(qib0.f154717f0);
            s69 s69Var = CoreModule.f17545c.f19550A1;
            s69Var.getClass();
            s69.m182432s3(s69Var, boc0Var.getAct(), intlMarketRequestParams, null, new Function1() { // from class: l.ync0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return boc0.m102924z(this.f199153a, (IntlMarketResponseEnvelope) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m102919j(boc0 boc0Var, View view) {
        l5j0 l5j0Var = boc0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m102924z(boc0 boc0Var, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        foc0.INSTANCE.m122431c().put(Boolean.TRUE);
        l5j0 l5j0Var = boc0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
        lsi0.m151593w(R$string.f17988O1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m102925A(@Nullable IntlMarketConfigData data, int option, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getAct());
            layoutInflaterFrom.getClass();
            l5j0 l5j0Var = null;
            this.dialog = m190753c(getAct(), m102926l(layoutInflaterFrom, null));
            IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
            intlMarketStickerData.getClass();
            IntlMarketSummaryData intlMarketSummaryData = data.regular_summary;
            intlMarketSummaryData.getClass();
            m102936y(intlMarketStickerData, intlMarketSummaryData, option);
            l5j0 l5j0Var2 = this.dialog;
            if (l5j0Var2 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                l5j0Var = l5j0Var2;
            }
            l5j0Var.show();
            m102934w().post(new Runnable() { // from class: l.unc0
                @Override // java.lang.Runnable
                public final void run() {
                    boc0.m102913B(this.f177350a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m102926l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM108008b = coc0.m108008b(this, inflater, parent);
        viewM108008b.getClass();
        return viewM108008b;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m102927p() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VDraweeView m102928q() {
        VDraweeView vDraweeView = this._bottom_monolayer;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bottom_monolayer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final View m102929r() {
        View view = this._bottom_monolayer_1;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bottom_monolayer_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final View m102930s() {
        View view = this._bottom_monolayer_2;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bottom_monolayer_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final RoundButton m102931t() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m87502r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m102932u() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m102933v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundConstraintLayout m102934w() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m87502r("_root_layout");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m102935x(IntlMarketStickerData sticker, IntlMarketSummaryData summary, final int option) {
        this._adapter = new snc0(getAct());
        VPullUpRecyclerView vPullUpRecyclerViewM102933v = m102933v();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(getAct(), sticker.columns, 1, false);
        offsetGridLayoutManager.m3326v(new C15916b(offsetGridLayoutManager));
        vPullUpRecyclerViewM102933v.setLayoutManager(offsetGridLayoutManager);
        snc0 snc0Var = this._adapter;
        snc0 snc0Var2 = null;
        if (snc0Var == null) {
            Intrinsics.m87502r("_adapter");
            snc0Var = null;
        }
        vPullUpRecyclerViewM102933v.setAdapter(snc0Var);
        vPullUpRecyclerViewM102933v.addItemDecoration(new C15915a(sticker.columns));
        snc0 snc0Var3 = this._adapter;
        if (snc0Var3 == null) {
            Intrinsics.m87502r("_adapter");
            snc0Var3 = null;
        }
        snc0Var3.m185054N(sticker, summary, option);
        snc0 snc0Var4 = this._adapter;
        if (snc0Var4 == null) {
            Intrinsics.m87502r("_adapter");
        } else {
            snc0Var2 = snc0Var4;
        }
        snc0Var2.m185055O(new C15917c());
        final int iM200293G = vwb.m200293G(sticker.options, new w9j() { // from class: l.znc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return boc0.m102915f(option, (IntlMarketStickerOptionsData) obj);
            }
        });
        if (iM200293G > sticker.columns - 1) {
            e51.m114742G(new Runnable() { // from class: l.aoc0
                @Override // java.lang.Runnable
                public final void run() {
                    boc0.m102916g(this.f70837a, iM200293G);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m102936y(final IntlMarketStickerData sticker, IntlMarketSummaryData summary, int option) {
        this._currentType = Integer.valueOf(option);
        try {
            if (!TextUtils.isEmpty(summary.bg_color)) {
                m102934w().setBackgroundColor(Color.parseColor(summary.bg_color));
            }
            qib0.f154691G.m102337O0(m102927p(), summary.bg_url, true, false, null, null);
            if (!TextUtils.isEmpty(summary.confirm_btn_bg_url)) {
                xdl0.m208344M(m102929r(), false);
                xdl0.m208344M(m102930s(), false);
                qib0.f154691G.m102337O0(m102928q(), summary.confirm_btn_bg_url, true, false, null, null);
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_color)) {
                m102931t().setBackgroundColor(Color.parseColor(summary.confirm_btn_color));
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_font_color)) {
                m102931t().setTextColor(Color.parseColor(summary.confirm_btn_font_color));
            }
            m102931t().setText(summary.confirm_btn_desc);
            if (option < 1) {
                m102931t().setAlpha(0.3f);
            } else {
                m102931t().setAlpha(1.0f);
            }
            foc0.INSTANCE.m122436h();
            xdl0.m208329E0(m102931t(), new View.OnClickListener() { // from class: l.vnc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boc0.m102917h(this.f182224a, view);
                }
            });
            xdl0.m208329E0(m102932u(), new View.OnClickListener() { // from class: l.wnc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boc0.m102919j(this.f187290a, view);
                }
            });
            m102935x(sticker, summary, option);
            m190754d().m109040p(vwb.m200311Y("intl_mkt_regular_popup_type", String.valueOf(sticker != null ? sticker.columns : 0)));
            i0e.m133797f(m190754d());
            l5j0 l5j0Var = this.dialog;
            if (l5j0Var == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                l5j0Var = null;
            }
            l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xnc0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    boc0.m102914e(this.f193653a, sticker, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
