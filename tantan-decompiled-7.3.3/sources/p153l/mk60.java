package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TimeConverter;
import com.p051p1.mobile.putong.core.api.C4896k;
import com.p051p1.mobile.putong.core.data.H5Merchandise;
import com.p051p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p051p1.mobile.putong.core.data.H5PayOrderData;
import com.p051p1.mobile.putong.core.data.H5PaymentChannels;
import com.p051p1.mobile.putong.core.data.H5PaymentOrderStatus;
import com.p051p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J7\u0010+\u001a\u00020\f2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0$2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b3\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010F\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010P\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010:\u001a\u0004\bN\u0010<\"\u0004\bO\u0010>R\"\u0010S\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010>R\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bT\u0010V\"\u0004\bW\u0010XR\"\u0010\\\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010H\u001a\u0004\bZ\u0010J\"\u0004\b[\u0010LR\"\u0010`\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R\"\u0010c\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R\"\u0010i\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010l\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010U\u001a\u0004\bj\u0010V\"\u0004\bk\u0010XR\"\u0010n\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\b]\u0010V\"\u0004\bm\u0010XR\u0017\u0010r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\be\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010o\u001a\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010uR\u0016\u0010x\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010w¨\u0006y"}, m88121d2 = {"Ll/mk60;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lv/VButton;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/H5Merchandise;", Merchandise.TYPE, "", "title", "", "u", "(Lv/VButton;Lcom/p1/mobile/putong/core/data/H5Merchandise;Ljava/lang/String;)V", "Landroid/view/View;", "rootView", "Ll/pej0;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", FirebaseAnalytics.Param.CURRENCY, "tracker", "itemId", "platform", "pname", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.QUANTITY, "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "data", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/H5PayOrderData;", "orderData", "Lcom/p1/mobile/putong/core/data/H5PaymentChannels;", "paymentChannels", ResourceDirection.f39656v, "(Ljava/util/List;Ljava/util/ArrayList;Lcom/p1/mobile/putong/core/data/H5PaymentChannels;)V", "r", "()V", "q", "eid", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)V", Constants.KEY_T, "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "k", "set_desc", "_desc", BLiveStormDanmakuGiftResourceType.f45292l, "set_price", "_price", "Lv/VRelative;", "Lv/VRelative;", "g", "()Lv/VRelative;", "set_bill", "(Lv/VRelative;)V", "_bill", "get_bill_category", "set_bill_category", "_bill_category", RXScreenCaptureService.KEY_INDEX, "set_bill_pending", "_bill_pending", "h", "Lv/VButton;", "()Lv/VButton;", "set_bill_bill_bt", "(Lv/VButton;)V", "_bill_bill_bt", "m", "set_qr", "_qr", "j", "get_qr_qr_category", "set_qr_qr_category", "_qr_qr_category", "p", "set_qr_qr_pending", "_qr_qr_pending", "Landroid/view/View;", "o", "()Landroid/view/View;", "set_qr_qr_icon", "(Landroid/view/View;)V", "_qr_qr_icon", "n", "set_qr_qr_bt", "_qr_qr_bt", "set_close", "_close", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "getP", "Ll/l4g0;", "Ll/l4g0;", "pageHelper", "Ll/pej0;", OMSTemplateType.dialog, "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mk60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _price;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VRelative _bill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _bill_category;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _bill_pending;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VButton _bill_bill_bt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VRelative _qr;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _qr_qr_category;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _qr_qr_pending;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _qr_qr_icon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VButton _qr_qr_bt;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String url;

    @NotNull
    public final String p;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final l4g0 pageHelper;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public pej0 dialog;

    /* JADX INFO: renamed from: l.mk60$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/mk60$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18637a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f137245a;

        public C18637a(pej0 pej0Var) {
            this.f137245a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f137245a.getBehavior().setState(3);
            }
        }
    }

    public mk60(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.url = "https://intlweb.tantanapp.com/paycools/createOrRes";
        this.p = "p_intl_premium_wallet_purchase_popup";
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_premium_wallet_purchase_popup", mk60.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
    }

    /* JADX INFO: renamed from: a */
    public static void m158704a(mk60 mk60Var, View view) {
        pej0 pej0Var = mk60Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m158705b(VButton vButton, mk60 mk60Var, H5Merchandise h5Merchandise, String str, View view) {
        if (Intrinsics.m88377d(vButton, mk60Var.m158711h())) {
            mk60Var.m158722s("e_intl_premium_wallet_purchase_bills_payment");
        } else if (Intrinsics.m88377d(vButton, mk60Var.m158717n())) {
            mk60Var.m158722s("e_intl_premium_wallet_purchase_gcash");
        }
        Act act = mk60Var.act;
        String str2 = h5Merchandise.tracker;
        str2.getClass();
        String str3 = h5Merchandise.defaultStockKeepUnit.f21153id;
        str3.getClass();
        String string = h5Merchandise.category.toString();
        string.getClass();
        String strM158709f = mk60Var.m158709f("PHP", str2, str3, string, str, String.valueOf(h5Merchandise.defaultStockKeepUnit.prices.price), h5Merchandise.quantity);
        pej0 pej0Var = null;
        Intent intentM81347a2 = WebViewAct.m81347a2(act, null, strM158709f);
        intentM81347a2.putExtra("hideNavigationBar", true);
        mk60Var.act.startActivity(intentM81347a2);
        pej0 pej0Var2 = mk60Var.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var2;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m158706c(mk60 mk60Var, DialogInterface dialogInterface) {
        mk60Var.m158720q();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m158707d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM163590b = nk60.m163590b(this, inflater, parent);
        viewM163590b.getClass();
        return viewM163590b;
    }

    /* JADX INFO: renamed from: e */
    public final pej0 m158708e(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, dgc0.f88279d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().addBottomSheetCallback(new C18637a(pej0Var));
        return pej0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r2 = r2.m80048q();
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m158709f(String currency, String tracker, String itemId, String platform, String pname, String price, int quantity) {
        String strSerialize;
        Location locationM80048q;
        String location;
        String str = "";
        try {
            strSerialize = H5PayOrderConfigData.JSON_ADAPTER.ARRAY_ADAPTER().serialize(C4896k.f20788V);
        } catch (Exception unused) {
            strSerialize = "";
        }
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        if (abstractC13226a != null && locationM80048q != null) {
            try {
                location = f1f.m123563f(Network.formatLocation(locationM80048q), String.valueOf(TimeConverter.switchTime(uqb0.f180376H.guessedCurrentServerTime())));
            } catch (Exception unused2) {
                location = Network.formatLocation(locationM80048q);
            }
            if (location != null) {
                str = location;
            }
        }
        return this.url + "?currency=" + currency + "&tracker=" + tracker + "&itemId=" + itemId + "&platform=" + platform + "&pname=" + pname + "&price=" + price + "&quantity=" + quantity + "&orderConfig=" + strSerialize + "&geolocation=" + str + "&user-agent=" + ak20.m98544d();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VRelative m158710g() {
        VRelative vRelative = this._bill;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_bill");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VButton m158711h() {
        VButton vButton = this._bill_bill_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bill_bill_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VText m158712i() {
        VText vText = this._bill_pending;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_bill_pending");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m158713j() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m158714k() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m158715l() {
        VText vText = this._price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_price");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VRelative m158716m() {
        VRelative vRelative = this._qr;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_qr");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VButton m158717n() {
        VButton vButton = this._qr_qr_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_qr_qr_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m158718o() {
        View view = this._qr_qr_icon;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_qr_qr_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VText m158719p() {
        VText vText = this._qr_qr_pending;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_qr_qr_pending");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m158720q() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m158721r() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m158722s(@NotNull String eid) {
        eid.getClass();
        i4g0.m138520r(eid, this.p);
    }

    /* JADX INFO: renamed from: t */
    public final void m158723t(@NotNull String eid) {
        eid.getClass();
        i4g0.m138526x(eid, this.p);
    }

    /* JADX INFO: renamed from: u */
    public final void m158724u(final VButton view, final H5Merchandise merchandise, final String title) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.lk60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mk60.m158705b(view, this, merchandise, title, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m158725v(@NotNull List<? extends H5Merchandise> data, @Nullable ArrayList<H5PayOrderData> orderData, @Nullable H5PaymentChannels paymentChannels) {
        List<String> list;
        List<String> list2;
        Prices prices;
        data.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        pej0 pej0Var = null;
        this.dialog = m158708e(this.act, m158707d(layoutInflaterFrom, null));
        for (H5Merchandise h5Merchandise : data) {
            String string = this.act.getString(R$string.f28511y6, h5Merchandise.quantity + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            string.getClass();
            m158714k().setText(this.act.getString(R$string.f28500x6, h5Merchandise.quantity + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null && (prices = h5StockKeepUnit.prices) != null) {
                m158715l().setText(((int) prices.price) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + prices.currencyCode);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (Intrinsics.m88377d(productCategory, ProductCategory.get(ProductCategory.intlPayCoolsBill))) {
                if (Intrinsics.m88377d((paymentChannels == null || (list = paymentChannels.categories) == null) ? null : Boolean.valueOf(list.contains(ProductCategory.intlPayCoolsBill)), Boolean.TRUE)) {
                    bnl0.m105524M(m158710g(), true);
                    m158723t("e_intl_premium_wallet_purchase_bills_payment");
                    m158724u(m158711h(), h5Merchandise, string);
                }
            } else if (Intrinsics.m88377d(productCategory, ProductCategory.get(ProductCategory.intlPayCoolsGCash))) {
                if (Intrinsics.m88377d((paymentChannels == null || (list2 = paymentChannels.categories) == null) ? null : Boolean.valueOf(list2.contains(ProductCategory.intlPayCoolsGCash)), Boolean.TRUE)) {
                    bnl0.m105524M(m158716m(), true);
                    m158723t("e_intl_premium_wallet_purchase_gcash");
                    m158724u(m158717n(), h5Merchandise, string);
                }
            }
        }
        if (orderData != null) {
            for (H5PayOrderData h5PayOrderData : orderData) {
                if (Intrinsics.m88377d(h5PayOrderData.orderStatus, H5PaymentOrderStatus.get(H5PaymentOrderStatus.PENDING))) {
                    ProductCategory productCategory2 = h5PayOrderData.platform;
                    if (Intrinsics.m88377d(productCategory2, ProductCategory.get(ProductCategory.intlPayCoolsBill))) {
                        bnl0.m105524M(m158712i(), true);
                    } else if (Intrinsics.m88377d(productCategory2, ProductCategory.get(ProductCategory.intlPayCoolsGCash))) {
                        bnl0.m105524M(m158719p(), true);
                        bnl0.m105524M(m158718o(), false);
                    }
                }
            }
        }
        bnl0.m105509E0(m158713j(), new View.OnClickListener() { // from class: l.jk60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mk60.m158704a(this.f121278a, view);
            }
        });
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var2 = null;
        }
        pej0Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kk60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                mk60.m158706c(this.f127171a, dialogInterface);
            }
        });
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var3;
        }
        pej0Var.show();
        m158721r();
    }
}
