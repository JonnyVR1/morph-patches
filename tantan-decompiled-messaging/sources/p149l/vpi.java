package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseData;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p046p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p046p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p046p1.mobile.putong.core.data.IntlMarketTransitSummaryData;
import com.p046p1.mobile.putong.core.p053ui.intloperation.flash.C8384a;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.core.view.banner.Banner;
import com.p046p1.mobile.putong.core.view.banner.IndicatorView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010$J\u0017\u0010*\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010>R\"\u0010_\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010F\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\"\u0010b\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010f\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010F\u001a\u0004\bd\u0010H\"\u0004\be\u0010JR\"\u0010i\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010F\u001a\u0004\bg\u0010H\"\u0004\bh\u0010JR\"\u0010p\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010{\u001a\u0005\b\u0082\u0001\u0010}\"\u0005\b\u0083\u0001\u0010\u007fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b(\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010gR\u001a\u0010\u0015\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b;\u0010\u008e\u0001¨\u0006\u0090\u0001"}, m87232d2 = {"Ll/vpi;", "Ll/s7m;", "Ll/npi;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;", BaseSei.INFO, "", "m", "(Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;)V", "", "endTime", "q", "(J)V", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "N", "(Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;", "data", "M", "(Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/npi;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "L", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "B", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "u", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", Constants.INAPP_DATA_TAG, ResourceDirection.f38808v, "set_finding_layout", "_finding_layout", "Lv/VText;", "e", "Lv/VText;", BaseSei.f13932Z, "()Lv/VText;", "set_finding_layout_finding_title", "(Lv/VText;)V", "_finding_layout_finding_title", "f", BaseSei.f13931Y, "set_finding_layout_finding_time", "_finding_layout_finding_time", "Lv/VProgress;", "g", "Lv/VProgress;", "A", "()Lv/VProgress;", "set_finding_layout_progress", "(Lv/VProgress;)V", "_finding_layout_progress", "h", BaseSei.f13930X, "set_finding_layout_finding_img", "_finding_layout_finding_img", RXScreenCaptureService.KEY_INDEX, "w", "set_finding_layout_finding_bottom_title", "_finding_layout_finding_bottom_title", b2s.C_ZONE, "set_setting_layout", "_setting_layout", "k", "J", "set_setting_layout_title", "_setting_layout_title", "I", "set_setting_layout_sub_title", "_setting_layout_sub_title", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "E", "()Lcom/p1/mobile/putong/core/view/banner/Banner;", "set_setting_layout_banner", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "n", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "F", "()Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "set_setting_layout_indicator", "(Lcom/p1/mobile/putong/core/view/banner/IndicatorView;)V", "_setting_layout_indicator", "Lv/VButton;", "o", "Lv/VButton;", "H", "()Lv/VButton;", "set_setting_layout_start_btn", "(Lv/VButton;)V", "_setting_layout_start_btn", "p", "G", "set_setting_layout_later_btn", "_setting_layout_later_btn", "Ll/npi;", "Ll/epi;", "Ll/epi;", "adapter", "", "currentPosition", Constants.KEY_T, "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vpi implements s7m<npi> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _bg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _finding_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _finding_layout_finding_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _finding_layout_finding_time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VProgress _finding_layout_progress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _finding_layout_finding_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _finding_layout_finding_bottom_title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ConstraintLayout _setting_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _setting_layout_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _setting_layout_sub_title;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public Banner _setting_layout_banner;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public IndicatorView _setting_layout_indicator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VButton _setting_layout_start_btn;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VButton _setting_layout_later_btn;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public npi presenter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public epi adapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public IntlMarketConfigData data;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public c4g0 countDown;

    /* JADX INFO: renamed from: l.vpi$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/vpi$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20714a extends ViewPager2.AbstractC0740i {
        public C20714a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            vpi.this.currentPosition = position;
        }
    }

    public vpi(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m199241K(vpi vpiVar, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        if (intlMarketResponseEnvelope.meta.code == 200) {
            C8384a.INSTANCE.m46306d().put(Boolean.TRUE);
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            intlMarketResponseData.getClass();
            vpiVar.m199266m(intlMarketResponseData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m199242a(vpi vpiVar, long j, Long l2) {
        vpiVar.m199269s(j);
    }

    /* JADX INFO: renamed from: d */
    public static void m199245d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m199246e(vpi vpiVar, View view) {
        vpiVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public static void m199247f(final vpi vpiVar, View view) {
        IntlMarketStickerData intlMarketStickerData;
        List<IntlMarketStickerOptionsData> list;
        IntlMarketStickerData intlMarketStickerData2;
        List<IntlMarketStickerOptionsData> list2;
        IntlMarketStickerOptionsData intlMarketStickerOptionsData;
        C8384a c8384a = C8384a.INSTANCE;
        IntlMarketConfigData intlMarketConfigData = vpiVar.data;
        c8384a.m46307e((intlMarketConfigData == null || (intlMarketStickerData2 = intlMarketConfigData.regular_sticker) == null || (list2 = intlMarketStickerData2.options) == null || (intlMarketStickerOptionsData = list2.get(vpiVar.currentPosition)) == null) ? 0 : intlMarketStickerOptionsData.f20426id);
        if (!Network.isConnected(vpiVar.act)) {
            lsi0.m151578h(R$string.f18813p4);
            return;
        }
        IntlMarketConfigData intlMarketConfigData2 = vpiVar.data;
        if (intlMarketConfigData2 == null || (intlMarketStickerData = intlMarketConfigData2.regular_sticker) == null || (list = intlMarketStickerData.options) == null) {
            return;
        }
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.flash_option = list.get(vpiVar.currentPosition).f20426id;
        intlMarketRequestParams.mcc = String.valueOf(qib0.f154717f0);
        s69 s69Var = CoreModule.f17545c.f19550A1;
        s69Var.getClass();
        s69.m182432s3(s69Var, vpiVar.act, intlMarketRequestParams, null, new Function1() { // from class: l.qpi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vpi.m199241K(this.f155766a, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m199250n(vpi vpiVar) {
        if (NullChecker.m81303a(vpiVar.act) && !vpiVar.act.isFinishing()) {
            vpiVar.act.lambda$debugItems$19();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m199251p(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VProgress m199252A() {
        VProgress vProgress = this._finding_layout_progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m87502r("_finding_layout_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ConstraintLayout m199253B() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final ConstraintLayout m199254C() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_setting_layout");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Banner m199255E() {
        Banner banner = this._setting_layout_banner;
        if (banner != null) {
            return banner;
        }
        Intrinsics.m87502r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final IndicatorView m199256F() {
        IndicatorView indicatorView = this._setting_layout_indicator;
        if (indicatorView != null) {
            return indicatorView;
        }
        Intrinsics.m87502r("_setting_layout_indicator");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VButton m199257G() {
        VButton vButton = this._setting_layout_later_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_setting_layout_later_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m199258H() {
        VButton vButton = this._setting_layout_start_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_setting_layout_start_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m199259I() {
        VText vText = this._setting_layout_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_layout_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m199260J() {
        VText vText = this._setting_layout_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_layout_title");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m199261L(@Nullable IntlMarketConfigData data) {
        if (data != null) {
            this.data = data;
            try {
                m199263N(data.regular_summary);
                epi epiVar = this.adapter;
                epi epiVar2 = null;
                if (epiVar == null) {
                    Intrinsics.m87502r("adapter");
                    epiVar = null;
                }
                IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
                intlMarketStickerData.getClass();
                epiVar.m117635L(intlMarketStickerData);
                Banner bannerM199255E = m199255E();
                epi epiVar3 = this.adapter;
                if (epiVar3 == null) {
                    Intrinsics.m87502r("adapter");
                } else {
                    epiVar2 = epiVar3;
                }
                bannerM199255E.m59598o(epiVar2, 0);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m199262M(IntlMarketTransitSummaryData data) {
        m199253B().setBackground(null);
        m199270u().setImageURI("");
        if (data != null) {
            if (!TextUtils.isEmpty(data.bg_color)) {
                m199253B().setBackgroundColor(Color.parseColor(data.bg_color));
            }
            if (!TextUtils.isEmpty(data.bg_url)) {
                qib0.f154691G.m102331L0(m199270u(), data.bg_url);
            }
            C8384a c8384a = C8384a.INSTANCE;
            c8384a.m46311i(m199275z(), data.main_title, data.main_title_font_color);
            m199274y().setTextColor(Color.parseColor(data.count_down_font_color));
            m199272w().setTextColor(Color.parseColor(data.bottom_font_color));
            c8384a.m46310h(m199252A(), Color.parseColor(data.passed_progress_bar_color), Color.parseColor(data.remain_progress_bar_color));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m199263N(IntlMarketSummaryData info) {
        if (info == null) {
            return;
        }
        if (!TextUtils.isEmpty(info.bg_color)) {
            m199253B().setBackgroundColor(Color.parseColor(info.bg_color));
        }
        if (!TextUtils.isEmpty(info.bg_url)) {
            qib0.f154691G.m102331L0(m199270u(), info.bg_url);
        }
        m199256F().m59622m(Color.parseColor(info.unselected_circle_color)).m59625p(Color.parseColor(info.selected_circle_color));
        if (!TextUtils.isEmpty(info.confirm_btn_color)) {
            m199258H().setBackground(C8384a.INSTANCE.m46304b(Color.parseColor(info.confirm_btn_color), t100.f167260i, true));
        }
        C8384a c8384a = C8384a.INSTANCE;
        c8384a.m46311i(m199258H(), info.confirm_btn_desc, info.confirm_btn_font_color);
        c8384a.m46311i(m199257G(), info.sub_confirm_button_desc, info.sub_confirm_button_font_color);
        c8384a.m46311i(m199260J(), info.main_title, info.main_title_font_color);
        c8384a.m46311i(m199259I(), info.sub_title, info.sub_title_font_color);
    }

    @Override // p149l.s7m
    public void destroy() {
        c4g0 c4g0Var = this.countDown;
        if (c4g0Var == null) {
            Intrinsics.m87502r("countDown");
            c4g0Var = null;
        }
        mkd0.m154992z(c4g0Var);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m199264j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m199264j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM204916b = wpi.m204916b(this, inflater, parent);
        viewM204916b.getClass();
        return viewM204916b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable npi presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m199266m(IntlMarketResponseData info) {
        IntlMarketSummaryData intlMarketSummaryData;
        IntlFlashStickerOptionData intlFlashStickerOptionData = info.flash_option;
        if (intlFlashStickerOptionData != null) {
            IntlMarketConfigData intlMarketConfigData = this.data;
            m199262M((intlMarketConfigData == null || (intlMarketSummaryData = intlMarketConfigData.regular_summary) == null) ? null : intlMarketSummaryData.transit_summary);
            m199254C().setVisibility(8);
            m199271v().setVisibility(0);
            qib0.f154691G.m102331L0(m199273x(), intlFlashStickerOptionData.option_data.img_url);
            m199267q(mqi0.m155944o() + intlFlashStickerOptionData.remain);
            final Function0 function0 = new Function0() { // from class: l.rpi
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vpi.m199250n(this.f160503a);
                }
            };
            this.act.postDelayed(new Runnable() { // from class: l.spi
                @Override // java.lang.Runnable
                public final void run() {
                    vpi.m199251p(function0);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m199267q(final long endTime) {
        c4g0 c4g0VarSubscribe = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.tpi
            @Override // p149l.e30
            public final void call(Object obj) {
                vpi.m199242a(this.f171480a, endTime, (Long) obj);
            }
        }, new e30() { // from class: l.upi
            @Override // p149l.e30
            public final void call(Object obj) {
                vpi.m199245d((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: r */
    public final void m199268r() {
        m199254C().setVisibility(0);
        m199271v().setVisibility(8);
        int iM208407w = xdl0.m208407w(24.0f);
        this.adapter = new epi(this.act);
        m199255E().m59600q(m199256F().m59622m(-1).m59623n(3.0f).m59624o(3.3f).m59626q(0.0f).m59627r(IndicatorView.InterfaceC9170a.INSTANCE.m59631d()).m59625p(Color.parseColor("#FF8817")), false).m59603t(iM208407w, iM208407w, xdl0.m208407w(20.0f)).m59597n(new ssd0()).m59602s(new C20714a()).m59604u(false);
        xdl0.m208329E0(m199258H(), new View.OnClickListener() { // from class: l.opi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vpi.m199247f(this.f145001a, view);
            }
        });
        xdl0.m208329E0(m199257G(), new View.OnClickListener() { // from class: l.ppi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vpi.m199246e(this.f150650a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m199269s(long endTime) {
        VText vTextM199274y;
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(Math.max(0L, endTime - jM155944o));
        if (this._finding_layout_finding_time == null || (vTextM199274y = m199274y()) == null) {
            return;
        }
        vTextM199274y.setText(C8411a.INSTANCE.m46892m(date));
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m199270u() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m199271v() {
        ConstraintLayout constraintLayout = this._finding_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_finding_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VText m199272w() {
        VText vText = this._finding_layout_finding_bottom_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_finding_layout_finding_bottom_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VDraweeView m199273x() {
        VDraweeView vDraweeView = this._finding_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_finding_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText m199274y() {
        VText vText = this._finding_layout_finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_finding_layout_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m199275z() {
        VText vText = this._finding_layout_finding_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_finding_layout_finding_title");
        return null;
    }
}
