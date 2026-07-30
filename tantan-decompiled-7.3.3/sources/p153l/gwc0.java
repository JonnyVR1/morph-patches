package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p051p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p051p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.toppicks.OffsetGridLayoutManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, m88121d2 = {"Ll/gwc0;", "Ll/lyl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "sticker", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "", Option.TYPE, "", BaseSei.f14625Y, "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;I)V", BaseSei.f14624X, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "data", "source", "A", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;II)V", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "w", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "p", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/VPullUpRecyclerView;", "e", "Lv/VPullUpRecyclerView;", ResourceDirection.f39656v, "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "g", "Landroid/view/View;", "r", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "h", BLiveStormDanmakuGiftResourceType.f45294s, "set_bottom_monolayer_2", "_bottom_monolayer_2", RXScreenCaptureService.KEY_INDEX, "q", "set_bottom_monolayer", "_bottom_monolayer", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "j", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/pej0;", "k", "Ll/pej0;", OMSTemplateType.dialog, "Ll/xvc0;", "Ll/xvc0;", "_adapter", "m", "Ljava/lang/Integer;", "_currentType", "", "n", "Z", "_isChanged", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gwc0 extends lyl {

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
    public pej0 dialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public xvc0 _adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Integer _currentType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: l.gwc0$a */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/gwc0$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "columns", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "a", "I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17327a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int columns;

        public C17327a(int i) {
            this.columns = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, qa00.f156318e, 0, qa00.f156335v);
            } else if ((childAdapterPosition - 1) % this.columns == 0) {
                outRect.set(0, 0, qa00.f156318e, qa00.f156321h);
            } else {
                outRect.set(qa00.f156318e, 0, 0, qa00.f156321h);
            }
        }
    }

    /* JADX INFO: renamed from: l.gwc0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/gwc0$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17328b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f106832b;

        public C17328b(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f106832b = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            xvc0 xvc0Var = gwc0.this._adapter;
            if (xvc0Var == null) {
                Intrinsics.m88391r("_adapter");
                xvc0Var = null;
            }
            if (xvc0Var.getItemViewType(position) == 0) {
                return this.f106832b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.gwc0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/gwc0$c", "Ll/xvc0$b;", "", "optionId", "", "a", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17329c implements xvc0.InterfaceC21455b {
        public C17329c() {
        }

        @Override // p153l.xvc0.InterfaceC21455b
        /* JADX INFO: renamed from: a */
        public void mo132680a(int optionId) {
            gwc0.this.m132674t().setAlpha(1.0f);
            gwc0.this._currentType = Integer.valueOf(optionId);
            gwc0.this._isChanged = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwc0(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static final void m132656B(gwc0 gwc0Var) {
        gwc0Var.m132670p().getLayoutParams().height = gwc0Var.m132677w().getHeight();
        gwc0Var.m132670p().setLayoutParams(gwc0Var.m132670p().getLayoutParams());
    }

    /* JADX INFO: renamed from: e */
    public static void m132657e(gwc0 gwc0Var, IntlMarketStickerData intlMarketStickerData, DialogInterface dialogInterface) {
        xvc0 xvc0Var;
        w1e.m204401e(gwc0Var.m156367d());
        int size = intlMarketStickerData.options.size();
        int i = 0;
        while (true) {
            xvc0Var = gwc0Var._adapter;
            if (i >= size) {
                break;
            }
            if (xvc0Var == null) {
                Intrinsics.m88391r("_adapter");
                xvc0Var = null;
            }
            i++;
            IntlMarketStickerOptionsData item = xvc0Var.getItem(i);
            if (item != null) {
                item.isSelected = false;
            }
        }
        if (xvc0Var == null) {
            Intrinsics.m88391r("_adapter");
            xvc0Var = null;
        }
        xvc0Var.m213224M();
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m132658f(int i, IntlMarketStickerOptionsData intlMarketStickerOptionsData) {
        return Boolean.valueOf(intlMarketStickerOptionsData.f21168id == i);
    }

    /* JADX INFO: renamed from: g */
    public static void m132659g(gwc0 gwc0Var, int i) {
        gwc0Var.m132676v().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m132660h(final gwc0 gwc0Var, View view) {
        kwc0.INSTANCE.m151688g();
        if (gwc0Var.m132674t().getAlpha() == 1.0f) {
            IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
            Integer num = gwc0Var._currentType;
            intlMarketRequestParams.regular_option = num != null ? num.intValue() : 0;
            intlMarketRequestParams.mcc = String.valueOf(uqb0.f180400f0);
            b89 b89Var = CoreModule.f18264c.f20292A1;
            b89Var.getClass();
            b89.m102928s3(b89Var, gwc0Var.getAct(), intlMarketRequestParams, null, new Function1() { // from class: l.dwc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gwc0.m132667z(this.f91013a, (IntlMarketResponseEnvelope) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m132662j(gwc0 gwc0Var, View view) {
        pej0 pej0Var = gwc0Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m132667z(gwc0 gwc0Var, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        kwc0.INSTANCE.m151684c().put(Boolean.TRUE);
        pej0 pej0Var = gwc0Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
        o1j0.m165649w(R$string.f18718O1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m132668A(@Nullable IntlMarketConfigData data, int option, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getAct());
            layoutInflaterFrom.getClass();
            pej0 pej0Var = null;
            this.dialog = m156366c(getAct(), m132669l(layoutInflaterFrom, null));
            IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
            intlMarketStickerData.getClass();
            IntlMarketSummaryData intlMarketSummaryData = data.regular_summary;
            intlMarketSummaryData.getClass();
            m132679y(intlMarketStickerData, intlMarketSummaryData, option);
            pej0 pej0Var2 = this.dialog;
            if (pej0Var2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var = pej0Var2;
            }
            pej0Var.show();
            m132677w().post(new Runnable() { // from class: l.zvc0
                @Override // java.lang.Runnable
                public final void run() {
                    gwc0.m132656B(this.f206210a);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m132669l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM137472b = hwc0.m137472b(this, inflater, parent);
        viewM137472b.getClass();
        return viewM137472b;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m132670p() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VDraweeView m132671q() {
        VDraweeView vDraweeView = this._bottom_monolayer;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bottom_monolayer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final View m132672r() {
        View view = this._bottom_monolayer_1;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_monolayer_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final View m132673s() {
        View view = this._bottom_monolayer_2;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_monolayer_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final RoundButton m132674t() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m132675u() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VPullUpRecyclerView m132676v() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundConstraintLayout m132677w() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m132678x(IntlMarketStickerData sticker, IntlMarketSummaryData summary, final int option) {
        this._adapter = new xvc0(getAct());
        VPullUpRecyclerView vPullUpRecyclerViewM132676v = m132676v();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(getAct(), sticker.columns, 1, false);
        offsetGridLayoutManager.m3327v(new C17328b(offsetGridLayoutManager));
        vPullUpRecyclerViewM132676v.setLayoutManager(offsetGridLayoutManager);
        xvc0 xvc0Var = this._adapter;
        xvc0 xvc0Var2 = null;
        if (xvc0Var == null) {
            Intrinsics.m88391r("_adapter");
            xvc0Var = null;
        }
        vPullUpRecyclerViewM132676v.setAdapter(xvc0Var);
        vPullUpRecyclerViewM132676v.addItemDecoration(new C17327a(sticker.columns));
        xvc0 xvc0Var3 = this._adapter;
        if (xvc0Var3 == null) {
            Intrinsics.m88391r("_adapter");
            xvc0Var3 = null;
        }
        xvc0Var3.m213225N(sticker, summary, option);
        xvc0 xvc0Var4 = this._adapter;
        if (xvc0Var4 == null) {
            Intrinsics.m88391r("_adapter");
        } else {
            xvc0Var2 = xvc0Var4;
        }
        xvc0Var2.m213226O(new C17329c());
        final int iM147476G = jyb.m147476G(sticker.options, new qcj() { // from class: l.ewc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gwc0.m132658f(option, (IntlMarketStickerOptionsData) obj);
            }
        });
        if (iM147476G > sticker.columns - 1) {
            l51.m152887G(new Runnable() { // from class: l.fwc0
                @Override // java.lang.Runnable
                public final void run() {
                    gwc0.m132659g(this.f101151a, iM147476G);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m132679y(final IntlMarketStickerData sticker, IntlMarketSummaryData summary, int option) {
        this._currentType = Integer.valueOf(option);
        try {
            if (!TextUtils.isEmpty(summary.bg_color)) {
                m132677w().setBackgroundColor(Color.parseColor(summary.bg_color));
            }
            uqb0.f180374G.m127121O0(m132670p(), summary.bg_url, true, false, null, null);
            if (!TextUtils.isEmpty(summary.confirm_btn_bg_url)) {
                bnl0.m105524M(m132672r(), false);
                bnl0.m105524M(m132673s(), false);
                uqb0.f180374G.m127121O0(m132671q(), summary.confirm_btn_bg_url, true, false, null, null);
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_color)) {
                m132674t().setBackgroundColor(Color.parseColor(summary.confirm_btn_color));
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_font_color)) {
                m132674t().setTextColor(Color.parseColor(summary.confirm_btn_font_color));
            }
            m132674t().setText(summary.confirm_btn_desc);
            if (option < 1) {
                m132674t().setAlpha(0.3f);
            } else {
                m132674t().setAlpha(1.0f);
            }
            kwc0.INSTANCE.m151689h();
            bnl0.m105509E0(m132674t(), new View.OnClickListener() { // from class: l.awc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gwc0.m132660h(this.f73724a, view);
                }
            });
            bnl0.m105509E0(m132675u(), new View.OnClickListener() { // from class: l.bwc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gwc0.m132662j(this.f78719a, view);
                }
            });
            m132678x(sticker, summary, option);
            m156367d().m152781p(jyb.m147494Y("intl_mkt_regular_popup_type", String.valueOf(sticker != null ? sticker.columns : 0)));
            w1e.m204402f(m156367d());
            pej0 pej0Var = this.dialog;
            if (pej0Var == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var = null;
            }
            pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cwc0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gwc0.m132657e(this.f84114a, sticker, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
