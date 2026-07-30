package p009l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.p002ui.intloperation.flash.C0428a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p1.mobile.putong.core.data.IntlMarketResponseData;
import com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p1.mobile.putong.core.data.IntlMarketTransitSummaryData;
import com.p1.mobile.putong.core.ui.likeminded.a;
import com.p1.mobile.putong.core.view.banner.Banner;
import com.p1.mobile.putong.core.view.banner.IndicatorView;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s69;
import l.s7m;
import l.ssd0;
import l.t100;
import l.wpi;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VProgress;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010$J\u0017\u0010*\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010>R\"\u0010_\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010F\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\"\u0010b\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010f\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010F\u001a\u0004\bd\u0010H\"\u0004\be\u0010JR\"\u0010i\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010F\u001a\u0004\bg\u0010H\"\u0004\bh\u0010JR\"\u0010p\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010{\u001a\u0005\b\u0082\u0001\u0010}\"\u0005\b\u0083\u0001\u0010\u007fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b(\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010gR\u001a\u0010\u0015\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b;\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"Ll/vpi;", "Ll/s7m;", "Ll/npi;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;", "info", "", "m", "(Lcom/p1/mobile/putong/core/data/IntlMarketResponseData;)V", "", "endTime", "q", "(J)V", "s", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "N", "(Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "M", "(Lcom/p1/mobile/putong/core/data/IntlMarketTransitSummaryData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "l", "(Ll/npi;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "L", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "B", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "u", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", "d", "v", "set_finding_layout", "_finding_layout", "Lv/VText;", "e", "Lv/VText;", "z", "()Lv/VText;", "set_finding_layout_finding_title", "(Lv/VText;)V", "_finding_layout_finding_title", "f", "y", "set_finding_layout_finding_time", "_finding_layout_finding_time", "Lv/VProgress;", "g", "Lv/VProgress;", "A", "()Lv/VProgress;", "set_finding_layout_progress", "(Lv/VProgress;)V", "_finding_layout_progress", "h", "x", "set_finding_layout_finding_img", "_finding_layout_finding_img", "i", "w", "set_finding_layout_finding_bottom_title", "_finding_layout_finding_bottom_title", "C", "set_setting_layout", "_setting_layout", "k", "J", "set_setting_layout_title", "_setting_layout_title", "I", "set_setting_layout_sub_title", "_setting_layout_sub_title", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "E", "()Lcom/p1/mobile/putong/core/view/banner/Banner;", "set_setting_layout_banner", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "n", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "F", "()Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "set_setting_layout_indicator", "(Lcom/p1/mobile/putong/core/view/banner/IndicatorView;)V", "_setting_layout_indicator", "Lv/VButton;", "o", "Lv/VButton;", "H", "()Lv/VButton;", "set_setting_layout_start_btn", "(Lv/VButton;)V", "_setting_layout_start_btn", "p", "G", "set_setting_layout_later_btn", "_setting_layout_later_btn", "Ll/npi;", "Ll/epi;", "Ll/epi;", "adapter", "", "currentPosition", "t", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "Ll/c4g0;", "Ll/c4g0;", "countDown", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/vpi$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1273a extends ViewPager2.i {
        public C1273a() {
        }

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
    public static final Unit m23573K(vpi vpiVar, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        intlMarketResponseEnvelope.getClass();
        if (intlMarketResponseEnvelope.meta.code == 200) {
            C0428a.INSTANCE.m8394d().put(Boolean.TRUE);
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            intlMarketResponseData.getClass();
            vpiVar.m23600m(intlMarketResponseData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m23574a(vpi vpiVar, long j, Long l2) {
        vpiVar.m23603s(j);
    }

    /* JADX INFO: renamed from: d */
    public static void m23577d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m23578e(vpi vpiVar, View view) {
        vpiVar.act.finish();
    }

    /* JADX INFO: renamed from: f */
    public static void m23579f(final vpi vpiVar, View view) {
        IntlMarketStickerData intlMarketStickerData;
        List list;
        IntlMarketStickerData intlMarketStickerData2;
        List list2;
        IntlMarketStickerOptionsData intlMarketStickerOptionsData;
        C0428a c0428a = C0428a.INSTANCE;
        IntlMarketConfigData intlMarketConfigData = vpiVar.data;
        c0428a.m8395e((intlMarketConfigData == null || (intlMarketStickerData2 = intlMarketConfigData.regular_sticker) == null || (list2 = intlMarketStickerData2.options) == null || (intlMarketStickerOptionsData = (IntlMarketStickerOptionsData) list2.get(vpiVar.currentPosition)) == null) ? 0 : intlMarketStickerOptionsData.id);
        if (!Network.isConnected(vpiVar.act)) {
            lsi0.h(R.string.p4);
            return;
        }
        IntlMarketConfigData intlMarketConfigData2 = vpiVar.data;
        if (intlMarketConfigData2 == null || (intlMarketStickerData = intlMarketConfigData2.regular_sticker) == null || (list = intlMarketStickerData.options) == null) {
            return;
        }
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.flash_option = ((IntlMarketStickerOptionsData) list.get(vpiVar.currentPosition)).id;
        intlMarketRequestParams.mcc = String.valueOf(qib0.f0);
        s69 s69Var = CoreModule.c.A1;
        s69Var.getClass();
        s69.s3(s69Var, vpiVar.act, intlMarketRequestParams, (Function0) null, new Function1() { // from class: l.qpi
            public final Object invoke(Object obj) {
                return vpi.m23573K(this.f19432a, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, (Object) null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m23582n(vpi vpiVar) {
        if (NullChecker.a(vpiVar.act) && !vpiVar.act.isFinishing()) {
            vpiVar.act.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m23583p(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VProgress m23584A() {
        VProgress vProgress = this._finding_layout_progress;
        if (vProgress != null) {
            return vProgress;
        }
        Intrinsics.r("_finding_layout_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ConstraintLayout m23585B() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final ConstraintLayout m23586C() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m23587C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final Banner m23588E() {
        Banner banner = this._setting_layout_banner;
        if (banner != null) {
            return banner;
        }
        Intrinsics.r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final IndicatorView m23589F() {
        IndicatorView indicatorView = this._setting_layout_indicator;
        if (indicatorView != null) {
            return indicatorView;
        }
        Intrinsics.r("_setting_layout_indicator");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final VButton m23590G() {
        VButton vButton = this._setting_layout_later_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_setting_layout_later_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final VButton m23591H() {
        VButton vButton = this._setting_layout_start_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_setting_layout_start_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VText m23592I() {
        VText vText = this._setting_layout_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_layout_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m23593J() {
        VText vText = this._setting_layout_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_layout_title");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final void m23594L(@Nullable IntlMarketConfigData data) {
        if (data != null) {
            this.data = data;
            try {
                m23596N(data.regular_summary);
                epi epiVar = this.adapter;
                RecyclerView.Adapter adapter = null;
                if (epiVar == null) {
                    Intrinsics.r("adapter");
                    epiVar = null;
                }
                IntlMarketStickerData intlMarketStickerData = data.regular_sticker;
                intlMarketStickerData.getClass();
                epiVar.m14081L(intlMarketStickerData);
                Banner bannerM23588E = m23588E();
                RecyclerView.Adapter adapter2 = this.adapter;
                if (adapter2 == null) {
                    Intrinsics.r("adapter");
                } else {
                    adapter = adapter2;
                }
                bannerM23588E.o(adapter, 0);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m23595M(IntlMarketTransitSummaryData data) {
        m23585B().setBackground(null);
        m23604u().setImageURI("");
        if (data != null) {
            if (!TextUtils.isEmpty(data.bg_color)) {
                m23585B().setBackgroundColor(Color.parseColor(data.bg_color));
            }
            if (!TextUtils.isEmpty(data.bg_url)) {
                qib0.G.L0(m23604u(), data.bg_url);
            }
            C0428a c0428a = C0428a.INSTANCE;
            c0428a.m8399i(m23609z(), data.main_title, data.main_title_font_color);
            m23608y().setTextColor(Color.parseColor(data.count_down_font_color));
            m23606w().setTextColor(Color.parseColor(data.bottom_font_color));
            c0428a.m8398h(m23584A(), Color.parseColor(data.passed_progress_bar_color), Color.parseColor(data.remain_progress_bar_color));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m23596N(IntlMarketSummaryData info) {
        if (info == null) {
            return;
        }
        if (!TextUtils.isEmpty(info.bg_color)) {
            m23585B().setBackgroundColor(Color.parseColor(info.bg_color));
        }
        if (!TextUtils.isEmpty(info.bg_url)) {
            qib0.G.L0(m23604u(), info.bg_url);
        }
        m23589F().m(Color.parseColor(info.unselected_circle_color)).p(Color.parseColor(info.selected_circle_color));
        if (!TextUtils.isEmpty(info.confirm_btn_color)) {
            m23591H().setBackground(C0428a.INSTANCE.m8392b(Color.parseColor(info.confirm_btn_color), t100.i, true));
        }
        C0428a c0428a = C0428a.INSTANCE;
        c0428a.m8399i(m23591H(), info.confirm_btn_desc, info.confirm_btn_font_color);
        c0428a.m8399i(m23590G(), info.sub_confirm_button_desc, info.sub_confirm_button_font_color);
        c0428a.m8399i(m23593J(), info.main_title, info.main_title_font_color);
        c0428a.m8399i(m23592I(), info.sub_title, info.sub_title_font_color);
    }

    public void destroy() {
        c4g0 c4g0Var = this.countDown;
        if (c4g0Var == null) {
            Intrinsics.r("countDown");
            c4g0Var = null;
        }
        mkd0.z(c4g0Var);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m23598j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m23598j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = wpi.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m23597i1(@Nullable npi presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m23600m(IntlMarketResponseData info) {
        IntlMarketSummaryData intlMarketSummaryData;
        IntlFlashStickerOptionData intlFlashStickerOptionData = info.flash_option;
        if (intlFlashStickerOptionData != null) {
            IntlMarketConfigData intlMarketConfigData = this.data;
            m23595M((intlMarketConfigData == null || (intlMarketSummaryData = intlMarketConfigData.regular_summary) == null) ? null : intlMarketSummaryData.transit_summary);
            m23586C().setVisibility(8);
            m23605v().setVisibility(0);
            qib0.G.L0(m23607x(), intlFlashStickerOptionData.option_data.img_url);
            m23601q(mqi0.m18550o() + intlFlashStickerOptionData.remain);
            final Function0 function0 = new Function0() { // from class: l.rpi
                public final Object invoke() {
                    return vpi.m23582n(this.f19941a);
                }
            };
            this.act.postDelayed(new Runnable() { // from class: l.spi
                @Override // java.lang.Runnable
                public final void run() {
                    vpi.m23583p(function0);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m23601q(final long endTime) {
        c4g0 c4g0VarSubscribe = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.tpi
            public final void call(Object obj) {
                vpi.m23574a(this.f20815a, endTime, (Long) obj);
            }
        }, new e30() { // from class: l.upi
            public final void call(Object obj) {
                vpi.m23577d((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: r */
    public final void m23602r() {
        m23586C().setVisibility(0);
        m23605v().setVisibility(8);
        int iW = xdl0.w(24.0f);
        this.adapter = new epi(this.act);
        m23588E().q(m23589F().m(-1).n(3.0f).o(3.3f).q(0.0f).r(IndicatorView.a.Companion.d()).p(Color.parseColor("#FF8817")), false).t(iW, iW, xdl0.w(20.0f)).n(new ssd0()).s(new C1273a()).u(false);
        xdl0.E0(m23591H(), new View.OnClickListener() { // from class: l.opi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vpi.m23579f(this.f18199a, view);
            }
        });
        xdl0.E0(m23590G(), new View.OnClickListener() { // from class: l.ppi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vpi.m23578e(this.f18829a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m23603s(long endTime) {
        VText vTextM23608y;
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(Math.max(0L, endTime - jM18550o));
        if (this._finding_layout_finding_time == null || (vTextM23608y = m23608y()) == null) {
            return;
        }
        vTextM23608y.setText(a.INSTANCE.m(date));
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m23604u() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m23605v() {
        ConstraintLayout constraintLayout = this._finding_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_finding_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VText m23606w() {
        VText vText = this._finding_layout_finding_bottom_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_finding_layout_finding_bottom_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VDraweeView m23607x() {
        VDraweeView vDraweeView = this._finding_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_finding_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText m23608y() {
        VText vText = this._finding_layout_finding_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_finding_layout_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m23609z() {
        VText vText = this._finding_layout_finding_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_finding_layout_finding_title");
        return null;
    }
}
