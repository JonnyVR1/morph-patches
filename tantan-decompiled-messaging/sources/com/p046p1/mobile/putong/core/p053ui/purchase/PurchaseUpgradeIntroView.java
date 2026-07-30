package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAutoPay;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseUpgradeIntroView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.bbb0;
import p149l.d30;
import p149l.d3c0;
import p149l.dsa;
import p149l.i0g0;
import p149l.sab0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010\u001eR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Merchandise;", "noneRenewableMerchandise", "autoRenewableMerchandise", "", FirebaseAnalytics.Event.REFUND, "k0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/Long;)V", "Ll/d30;", "close", "j0", "(Ll/d30;)V", "l0", "", "checked", "n0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "m0", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_decorate", "()Lv/VImage;", "set_decorate", "(Lv/VImage;)V", "_decorate", "e", "get_image", "set_image", "_image", "f", "get_close", "set_close", "_close", "Lv/VText;", "g", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "h", "get_subtitle", "set_subtitle", "_subtitle", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/core/data/Merchandise;", BLiveStormDanmakuGiftResourceType.f44444l, "m", "Ljava/lang/Long;", "refundAmount", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchaseUpgradeIntroView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _decorate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Merchandise noneRenewableMerchandise;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Merchandise autoRenewableMerchandise;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Long refundAmount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchaseUpgradeIntroView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m53131h0(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final VImage get_decorate() {
        VImage vImage = this._decorate;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_decorate");
        return null;
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m53132i0(View view) {
        bbb0.m100955a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m53133j0(@Nullable final d30 close) {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182891i(purchaseType)) {
            get_decorate().setImageResource(d3c0.f84032n8);
            get_image().setImageResource(d3c0.f84046o8);
            get_close().setImageResource(d3c0.f84004l8);
            get_title().setTextColor(Color.parseColor("#EDD7A3"));
            get_subtitle().setTextColor(Color.parseColor("#7FEDD7A3"));
        } else {
            get_decorate().setImageResource(0);
            get_image().setImageResource(d3c0.f83929g3);
            get_close().setImageResource(d3c0.f83786V9);
            get_title().setTextColor(Color.parseColor("#323232"));
            get_subtitle().setTextColor(Color.parseColor("#757575"));
        }
        xdl0.m208329E0(get_close(), new View.OnClickListener() { // from class: l.abb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseUpgradeIntroView.m53131h0(close, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m53134k0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Merchandise noneRenewableMerchandise, @Nullable Merchandise autoRenewableMerchandise, @Nullable Long refund) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.noneRenewableMerchandise = noneRenewableMerchandise;
        this.autoRenewableMerchandise = autoRenewableMerchandise;
        this.refundAmount = refund;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m53135l0() {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182891i(purchaseType)) {
            get_title().setText("恭喜你");
            get_subtitle().setText("你已获得黑金升级换购资格，现在开通即可尊享全平台权益");
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        VText vText = get_title();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Act act = this.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        String strString = act.string(R$string.f27202K1);
        strString.getClass();
        vText.setText(String.format(strString, Arrays.copyOf(new Object[]{userM169527p9.name}, 1)));
        CoreAutoPay coreAutoPay = CoreModule.f17545c.f19591O0;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        m53136m0(!coreAutoPay.m30086u3(purchaseType2));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m53136m0(boolean checked) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        String str;
        StockKeepUnit stockKeepUnit2;
        Prices prices2;
        StockKeepUnit stockKeepUnit3;
        Prices prices3;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        Act act = null;
        if (checked || dsa.m113447t(null, 1, null)) {
            Merchandise merchandise = this.autoRenewableMerchandise;
            if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (prices = stockKeepUnit.prices) != null) {
                d = prices.price;
            }
        } else {
            Merchandise merchandise2 = this.noneRenewableMerchandise;
            if (merchandise2 != null && (stockKeepUnit3 = merchandise2.defaultStockKeepUnit) != null && (prices3 = stockKeepUnit3.prices) != null) {
                d = prices3.price;
            }
        }
        Long l2 = this.refundAmount;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        long j = (long) (d - jLongValue);
        Merchandise merchandise3 = this.noneRenewableMerchandise;
        if (merchandise3 == null || (stockKeepUnit2 = merchandise3.defaultStockKeepUnit) == null || (prices2 = stockKeepUnit2.prices) == null || (str = prices2.currencySymbol) == null) {
            str = "¥";
        }
        String str2 = str + jLongValue;
        String str3 = str + j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Act act2 = this.act;
        if (act2 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act2 = null;
        }
        String strString = act2.string(R$string.f27191J1);
        strString.getClass();
        String str4 = String.format(strString, Arrays.copyOf(new Object[]{str2, str3}, 2));
        Act act3 = this.act;
        if (act3 == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
        } else {
            act = act3;
        }
        String strString2 = act.string(R$string.f27180I1);
        strString2.getClass();
        get_subtitle().setText(i0g0.m133861b0(String.format("%1$s，%2$s", Arrays.copyOf(new Object[]{str4, String.format(strString2, Arrays.copyOf(new Object[]{str2}, 1))}, 2)), vwb.m200324f0(str2, str3), Color.parseColor("#FE7E1D"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m53137n0(boolean checked) {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182891i(purchaseType)) {
            return;
        }
        m53136m0(checked);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53132i0(this);
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_decorate(@NotNull VImage vImage) {
        vImage.getClass();
        this._decorate = vImage;
    }

    public final void set_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._image = vImage;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseUpgradeIntroView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchaseUpgradeIntroView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
