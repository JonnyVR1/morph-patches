package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseData;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p051p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p051p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p051p1.mobile.putong.core.data.IntlMarketTransitSummaryData;
import com.p051p1.mobile.putong.core.p058ui.intloperation.flash.C8547a;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.view.banner.Banner;
import com.p051p1.mobile.putong.core.view.banner.IndicatorView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010$J\u0017\u0010*\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010>R\"\u0010_\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010F\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\"\u0010b\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010f\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010F\u001a\u0004\bd\u0010H\"\u0004\be\u0010JR\"\u0010i\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010F\u001a\u0004\bg\u0010H\"\u0004\bh\u0010JR\"\u0010p\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010{\u001a\u0005\b\u0082\u0001\u0010}\"\u0005\b\u0083\u0001\u0010\u007fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b(\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010gR\u001a\u0010\u0015\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b;\u0010\u008e\u0001¨\u0006\u0090\u0001"}, m88121d2 = {"Ll/rsi;", "Ll/iam;", "Ll/jsi;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;", BaseSei.INFO, "", "m", "(Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;)V", "", "endTime", "q", "(J)V", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "N", "(Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;", "data", "M", "(Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/jsi;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "L", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "B", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "u", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", Constants.INAPP_DATA_TAG, ResourceDirection.f39656v, "set_finding_layout", "_finding_layout", "Lv/VText;", "e", "Lv/VText;", BaseSei.f14626Z, "()Lv/VText;", "set_finding_layout_finding_title", "(Lv/VText;)V", "_finding_layout_finding_title", "f", BaseSei.f14625Y, "set_finding_layout_finding_time", "_finding_layout_finding_time", "Lv/VProgress;", "g", "Lv/VProgress;", "A", "()Lv/VProgress;", "set_finding_layout_progress", "(Lv/VProgress;)V", "_finding_layout_progress", "h", BaseSei.f14624X, "set_finding_layout_finding_img", "_finding_layout_finding_img", RXScreenCaptureService.KEY_INDEX, "w", "set_finding_layout_finding_bottom_title", "_finding_layout_finding_bottom_title", c4s.C_ZONE, "set_setting_layout", "_setting_layout", "k", "J", "set_setting_layout_title", "_setting_layout_title", "I", "set_setting_layout_sub_title", "_setting_layout_sub_title", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "E", "()Lcom/p1/mobile/putong/core/view/banner/Banner;", "set_setting_layout_banner", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "n", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "F", "()Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "set_setting_layout_indicator", "(Lcom/p1/mobile/putong/core/view/banner/IndicatorView;)V", "_setting_layout_indicator", "Lv/VButton;", "o", "Lv/VButton;", "H", "()Lv/VButton;", "set_setting_layout_start_btn", "(Lv/VButton;)V", "_setting_layout_start_btn", "p", "G", "set_setting_layout_later_btn", "_setting_layout_later_btn", "Ll/jsi;", "Ll/asi;", "Ll/asi;", "adapter", "", "currentPosition", Constants.KEY_T, "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "Ll/kcg0;", "Ll/kcg0;", "countDown", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rsi implements iam<jsi> {

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
    public jsi presenter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public asi adapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public IntlMarketConfigData data;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public kcg0 countDown;

    /* JADX INFO: renamed from: l.rsi$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/rsi$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19906a extends ViewPager2.AbstractC0742i {
        public C19906a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            rsi.this.currentPosition = position;
        }
    }

    public rsi(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m182982K(rsi rsiVar, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        if (intlMarketResponseEnvelope.meta.code == 200) {
            C8547a.INSTANCE.m47489d().put(Boolean.TRUE);
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            intlMarketResponseData.getClass();
            rsiVar.m183007m(intlMarketResponseData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m182983a(rsi rsiVar, long j, Long l2) {
        rsiVar.m183010s(j);
    }

    /* JADX INFO: renamed from: d */
    public static void m182986d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m182987e(rsi rsiVar, View view) {
        rsiVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public static void m182988f(final rsi rsiVar, View view) {
        IntlMarketStickerData intlMarketStickerData;
        List<IntlMarketStickerOptionsData> list;
        IntlMarketStickerData intlMarketStickerData2;
        List<IntlMarketStickerOptionsData> list2;
        IntlMarketStickerOptionsData intlMarketStickerOptionsData;
        C8547a c8547a = C8547a.INSTANCE;
        IntlMarketConfigData intlMarketConfigData = rsiVar.data;
        c8547a.m47490e((intlMarketConfigData == null || (intlMarketStickerData2 = intlMarketConfigData.regular_sticker) == null || (list2 = intlMarketStickerData2.options) == null || (intlMarketStickerOptionsData = list2.get(rsiVar.currentPosition)) == null) ? 0 : intlMarketStickerOptionsData.f21168id);
        if (!Network.isConnected(rsiVar.act)) {
            o1j0.m165634h(R$string.f19605r4);
            return;
        }
        IntlMarketConfigData intlMarketConfigData2 = rsiVar.data;
        if (intlMarketConfigData2 == null || (intlMarketStickerData = intlMarketConfigData2.regular_sticker) == null || (list = intlMarketStickerData.options) == null) {
            return;
        }
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.flash_option = list.get(rsiVar.currentPosition).f21168id;
        intlMarketRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        b89 b89Var = CoreModule.f18264c.f20292A1;
        b89Var.getClass();
        b89.m102928s3(b89Var, rsiVar.act, intlMarketRequestParams, null, new Function1() { // from class: l.msi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rsi.m182982K(this.f138487a, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m182991n(rsi rsiVar) {
        if (NullChecker.m82486a(rsiVar.act) && !rsiVar.act.isFinishing()) {
            rsiVar.act.lambda$debugItems$19();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m182992p(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VProgress m182993A() {
        VProgress vProgress = this._finding_layout_progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.m88391r("_finding_layout_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ConstraintLayout m182994B() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final ConstraintLayout m182995C() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_setting_layout");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Banner m182996E() {
        Banner banner = this._setting_layout_banner;
        if (banner != null) {
            return banner;
        }
        Intrinsics.m88391r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final IndicatorView m182997F() {
        IndicatorView indicatorView = this._setting_layout_indicator;
        if (indicatorView != null) {
            return indicatorView;
        }
        Intrinsics.m88391r("_setting_layout_indicator");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VButton m182998G() {
        VButton vButton = this._setting_layout_later_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_setting_layout_later_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m182999H() {
        VButton vButton = this._setting_layout_start_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_setting_layout_start_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m183000I() {
        VText vText = this._setting_layout_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_layout_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m183001J() {
        VText vText = this._setting_layout_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_layout_title");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m183002L(@Nullable IntlMarketConfigData data) {
        if (data != null) {
            this.data = data;
            try {
                m183004N(data.regular_summary);
                asi asiVar = this.adapter;
                asi asiVar2 = null;
                if (asiVar == null) {
                    Intrinsics.m88391r("adapter");
                    asiVar = null;
                }
                IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
                intlMarketStickerData.getClass();
                asiVar.m99925L(intlMarketStickerData);
                Banner bannerM182996E = m182996E();
                asi asiVar3 = this.adapter;
                if (asiVar3 == null) {
                    Intrinsics.m88391r("adapter");
                } else {
                    asiVar2 = asiVar3;
                }
                bannerM182996E.m60782o(asiVar2, 0);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m183003M(IntlMarketTransitSummaryData data) {
        m182994B().setBackground(null);
        m183011u().setImageURI("");
        if (data != null) {
            if (!TextUtils.isEmpty(data.bg_color)) {
                m182994B().setBackgroundColor(Color.parseColor(data.bg_color));
            }
            if (!TextUtils.isEmpty(data.bg_url)) {
                uqb0.f180374G.m127115L0(m183011u(), data.bg_url);
            }
            C8547a c8547a = C8547a.INSTANCE;
            c8547a.m47494i(m183016z(), data.main_title, data.main_title_font_color);
            m183015y().setTextColor(Color.parseColor(data.count_down_font_color));
            m183013w().setTextColor(Color.parseColor(data.bottom_font_color));
            c8547a.m47493h(m182993A(), Color.parseColor(data.passed_progress_bar_color), Color.parseColor(data.remain_progress_bar_color));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m183004N(IntlMarketSummaryData info) {
        if (info == null) {
            return;
        }
        if (!TextUtils.isEmpty(info.bg_color)) {
            m182994B().setBackgroundColor(Color.parseColor(info.bg_color));
        }
        if (!TextUtils.isEmpty(info.bg_url)) {
            uqb0.f180374G.m127115L0(m183011u(), info.bg_url);
        }
        m182997F().m60806m(Color.parseColor(info.unselected_circle_color)).m60809p(Color.parseColor(info.selected_circle_color));
        if (!TextUtils.isEmpty(info.confirm_btn_color)) {
            m182999H().setBackground(C8547a.INSTANCE.m47487b(Color.parseColor(info.confirm_btn_color), qa00.f156322i, true));
        }
        C8547a c8547a = C8547a.INSTANCE;
        c8547a.m47494i(m182999H(), info.confirm_btn_desc, info.confirm_btn_font_color);
        c8547a.m47494i(m182998G(), info.sub_confirm_button_desc, info.sub_confirm_button_font_color);
        c8547a.m47494i(m183001J(), info.main_title, info.main_title_font_color);
        c8547a.m47494i(m183000I(), info.sub_title, info.sub_title_font_color);
    }

    @Override // p153l.iam
    public void destroy() {
        kcg0 kcg0Var = this.countDown;
        if (kcg0Var == null) {
            Intrinsics.m88391r("countDown");
            kcg0Var = null;
        }
        psd0.m173633z(kcg0Var);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m183005j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m183005j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM187713b = ssi.m187713b(this, inflater, parent);
        viewM187713b.getClass();
        return viewM187713b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable jsi presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m183007m(IntlMarketResponseData info) {
        IntlMarketSummaryData intlMarketSummaryData;
        IntlFlashStickerOptionData intlFlashStickerOptionData = info.flash_option;
        if (intlFlashStickerOptionData != null) {
            IntlMarketConfigData intlMarketConfigData = this.data;
            m183003M((intlMarketConfigData == null || (intlMarketSummaryData = intlMarketConfigData.regular_summary) == null) ? null : intlMarketSummaryData.transit_summary);
            m182995C().setVisibility(8);
            m183012v().setVisibility(0);
            uqb0.f180374G.m127115L0(m183014x(), intlFlashStickerOptionData.option_data.img_url);
            m183008q(pzi0.m174454o() + intlFlashStickerOptionData.remain);
            final Function0 function0 = new Function0() { // from class: l.nsi
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return rsi.m182991n(this.f143504a);
                }
            };
            this.act.postDelayed(new Runnable() { // from class: l.osi
                @Override // java.lang.Runnable
                public final void run() {
                    rsi.m182992p(function0);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m183008q(final long endTime) {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.psi
            @Override // p153l.y20
            public final void call(Object obj) {
                rsi.m182983a(this.f153905a, endTime, (Long) obj);
            }
        }, new y20() { // from class: l.qsi
            @Override // p153l.y20
            public final void call(Object obj) {
                rsi.m182986d((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.countDown = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: r */
    public final void m183009r() {
        m182995C().setVisibility(0);
        m183012v().setVisibility(8);
        int iM105587w = bnl0.m105587w(24.0f);
        this.adapter = new asi(this.act);
        m182996E().m60784q(m182997F().m60806m(-1).m60807n(3.0f).m60808o(3.3f).m60810q(0.0f).m60811r(IndicatorView.InterfaceC9333a.INSTANCE.m60815d()).m60809p(Color.parseColor("#FF8817")), false).m60787t(iM105587w, iM105587w, bnl0.m105587w(20.0f)).m60781n(new u0e0()).m60786s(new C19906a()).m60788u(false);
        bnl0.m105509E0(m182999H(), new View.OnClickListener() { // from class: l.ksi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rsi.m182988f(this.f128575a, view);
            }
        });
        bnl0.m105509E0(m182998G(), new View.OnClickListener() { // from class: l.lsi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rsi.m182987e(this.f133429a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m183010s(long endTime) {
        VText vTextM183015y;
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(Math.max(0L, endTime - jM174454o));
        if (this._finding_layout_finding_time == null || (vTextM183015y = m183015y()) == null) {
            return;
        }
        vTextM183015y.setText(C8574a.INSTANCE.m48075m(date));
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m183011u() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m183012v() {
        ConstraintLayout constraintLayout = this._finding_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_finding_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VText m183013w() {
        VText vText = this._finding_layout_finding_bottom_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_finding_layout_finding_bottom_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VDraweeView m183014x() {
        VDraweeView vDraweeView = this._finding_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_finding_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText m183015y() {
        VText vText = this._finding_layout_finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_finding_layout_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m183016z() {
        VText vText = this._finding_layout_finding_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_finding_layout_finding_title");
        return null;
    }
}
