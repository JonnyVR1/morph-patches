package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.H5Merchandise;
import com.p046p1.mobile.putong.core.data.H5PayOrderData;
import com.p046p1.mobile.putong.core.data.H5PaymentChannels;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
import com.p046p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J7\u0010+\u001a\u00020\f2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0$2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b3\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010F\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010P\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010:\u001a\u0004\bN\u0010<\"\u0004\bO\u0010>R\"\u0010S\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010:\u001a\u0004\bQ\u0010<\"\u0004\bR\u0010>R\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bT\u0010V\"\u0004\bW\u0010XR\"\u0010\\\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010H\u001a\u0004\bZ\u0010J\"\u0004\b[\u0010LR\"\u0010`\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R\"\u0010c\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R\"\u0010i\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010l\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010U\u001a\u0004\bj\u0010V\"\u0004\bk\u0010XR\"\u0010n\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\b]\u0010V\"\u0004\bm\u0010XR\u0017\u0010r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\be\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010o\u001a\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010uR\u0016\u0010x\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010w¨\u0006y"}, m87232d2 = {"Ll/hc60;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lv/VButton;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/H5Merchandise;", Merchandise.TYPE, "", "title", "", "u", "(Lv/VButton;Lcom/p1/mobile/putong/core/data/H5Merchandise;Ljava/lang/String;)V", "Landroid/view/View;", "rootView", "Ll/l5j0;", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", FirebaseAnalytics.Param.CURRENCY, "tracker", "itemId", "platform", "pname", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.QUANTITY, "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "data", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/H5PayOrderData;", "orderData", "Lcom/p1/mobile/putong/core/data/H5PaymentChannels;", "paymentChannels", ResourceDirection.f38808v, "(Ljava/util/List;Ljava/util/ArrayList;Lcom/p1/mobile/putong/core/data/H5PaymentChannels;)V", "r", "()V", "q", "eid", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)V", Constants.KEY_T, "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "k", "set_desc", "_desc", BLiveStormDanmakuGiftResourceType.f44444l, "set_price", "_price", "Lv/VRelative;", "Lv/VRelative;", "g", "()Lv/VRelative;", "set_bill", "(Lv/VRelative;)V", "_bill", "get_bill_category", "set_bill_category", "_bill_category", RXScreenCaptureService.KEY_INDEX, "set_bill_pending", "_bill_pending", "h", "Lv/VButton;", "()Lv/VButton;", "set_bill_bill_bt", "(Lv/VButton;)V", "_bill_bill_bt", "m", "set_qr", "_qr", "j", "get_qr_qr_category", "set_qr_qr_category", "_qr_qr_category", "p", "set_qr_qr_pending", "_qr_qr_pending", "Landroid/view/View;", "o", "()Landroid/view/View;", "set_qr_qr_icon", "(Landroid/view/View;)V", "_qr_qr_icon", "n", "set_qr_qr_bt", "_qr_qr_bt", "set_close", "_close", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "getP", "Ll/cwf0;", "Ll/cwf0;", "pageHelper", "Ll/l5j0;", OMSTemplateType.dialog, "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hc60 {

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
    public final cwf0 pageHelper;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: l.hc60$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/hc60$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17273a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f107030a;

        public C17273a(l5j0 l5j0Var) {
            this.f107030a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f107030a.getBehavior().setState(3);
            }
        }
    }

    public hc60(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.url = "https://intlweb.tantanapp.com/paycools/createOrRes";
        this.p = "p_intl_premium_wallet_purchase_popup";
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_premium_wallet_purchase_popup", hc60.class.getName());
        cwf0VarM133794c.getClass();
        this.pageHelper = cwf0VarM133794c;
    }

    /* JADX INFO: renamed from: a */
    public static void m130392a(hc60 hc60Var, View view) {
        l5j0 l5j0Var = hc60Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m130393b(VButton vButton, hc60 hc60Var, H5Merchandise h5Merchandise, String str, View view) {
        if (Intrinsics.m87488d(vButton, hc60Var.m130399h())) {
            hc60Var.m130410s("e_intl_premium_wallet_purchase_bills_payment");
        } else if (Intrinsics.m87488d(vButton, hc60Var.m130405n())) {
            hc60Var.m130410s("e_intl_premium_wallet_purchase_gcash");
        }
        Act act = hc60Var.act;
        String str2 = h5Merchandise.tracker;
        str2.getClass();
        String str3 = h5Merchandise.defaultStockKeepUnit.f20411id;
        str3.getClass();
        String string = h5Merchandise.category.toString();
        string.getClass();
        String strM130397f = hc60Var.m130397f("PHP", str2, str3, string, str, String.valueOf(h5Merchandise.defaultStockKeepUnit.prices.price), h5Merchandise.quantity);
        l5j0 l5j0Var = null;
        Intent intentM80164Z1 = WebViewAct.m80164Z1(act, null, strM130397f);
        intentM80164Z1.putExtra("hideNavigationBar", true);
        hc60Var.act.startActivity(intentM80164Z1);
        l5j0 l5j0Var2 = hc60Var.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            l5j0Var = l5j0Var2;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m130394c(hc60 hc60Var, DialogInterface dialogInterface) {
        hc60Var.m130408q();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m130395d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM135349b = ic60.m135349b(this, inflater, parent);
        viewM135349b.getClass();
        return viewM135349b;
    }

    /* JADX INFO: renamed from: e */
    public final l5j0 m130396e(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, y7c0.f196694d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().addBottomSheetCallback(new C17273a(l5j0Var));
        return l5j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r2 = r2.m78865q();
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m130397f(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            com.tantanapp.common.data.JsonAdapter<com.p1.mobile.putong.core.data.H5PayOrderConfigData> r1 = com.p046p1.mobile.putong.core.data.H5PayOrderConfigData.JSON_ADAPTER     // Catch: java.lang.Exception -> Lf
            com.tantanapp.common.data.JsonAdapter r1 = r1.ARRAY_ADAPTER()     // Catch: java.lang.Exception -> Lf
            java.util.ArrayList<com.p1.mobile.putong.core.data.H5PayOrderConfigData> r2 = com.p046p1.mobile.putong.core.api.C4745k.f20046V     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.serialize(r2)     // Catch: java.lang.Exception -> Lf
            goto L10
        Lf:
            r1 = r0
        L10:
            com.p1.mobile.putong.location.a r2 = p149l.qib0.f154687E
            if (r2 == 0) goto L39
            com.p1.mobile.putong.location.Location r2 = r2.m78865q()
            if (r2 == 0) goto L39
            java.lang.String r3 = com.p046p1.mobile.putong.api.api.Network.formatLocation(r2)     // Catch: java.lang.Exception -> L31
            com.p1.mobile.putong.api.api.Network r4 = p149l.qib0.f154693H     // Catch: java.lang.Exception -> L31
            long r4 = r4.guessedCurrentServerTime()     // Catch: java.lang.Exception -> L31
            long r4 = com.p046p1.mobile.putong.api.api.TimeConverter.switchTime(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = p149l.b0f.m99756f(r3, r4)     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            java.lang.String r2 = com.p046p1.mobile.putong.api.api.Network.formatLocation(r2)
        L35:
            if (r2 != 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            java.lang.String r6 = r6.url
            java.lang.String r2 = p149l.rb20.m178555d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = "?currency="
            r3.append(r6)
            r3.append(r7)
            java.lang.String r6 = "&tracker="
            r3.append(r6)
            r3.append(r8)
            java.lang.String r6 = "&itemId="
            r3.append(r6)
            r3.append(r9)
            java.lang.String r6 = "&platform="
            r3.append(r6)
            r3.append(r10)
            java.lang.String r6 = "&pname="
            r3.append(r6)
            r3.append(r11)
            java.lang.String r6 = "&price="
            r3.append(r6)
            r3.append(r12)
            java.lang.String r6 = "&quantity="
            r3.append(r6)
            r3.append(r13)
            java.lang.String r6 = "&orderConfig="
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = "&geolocation="
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = "&user-agent="
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.hc60.m130397f(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):java.lang.String");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final VRelative m130398g() {
        VRelative vRelative = this._bill;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_bill");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VButton m130399h() {
        VButton vButton = this._bill_bill_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_bill_bill_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VText m130400i() {
        VText vText = this._bill_pending;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_bill_pending");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m130401j() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m130402k() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m130403l() {
        VText vText = this._price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_price");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VRelative m130404m() {
        VRelative vRelative = this._qr;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_qr");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VButton m130405n() {
        VButton vButton = this._qr_qr_bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_qr_qr_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m130406o() {
        View view = this._qr_qr_icon;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_qr_qr_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VText m130407p() {
        VText vText = this._qr_qr_pending;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_qr_qr_pending");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m130408q() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m130409r() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m130410s(@NotNull String eid) {
        eid.getClass();
        zvf0.m220396r(eid, this.p);
    }

    /* JADX INFO: renamed from: t */
    public final void m130411t(@NotNull String eid) {
        eid.getClass();
        zvf0.m220402x(eid, this.p);
    }

    /* JADX INFO: renamed from: u */
    public final void m130412u(final VButton view, final H5Merchandise merchandise, final String title) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.gc60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hc60.m130393b(view, this, merchandise, title, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m130413v(@NotNull List<? extends H5Merchandise> data, @Nullable ArrayList<H5PayOrderData> orderData, @Nullable H5PaymentChannels paymentChannels) {
        List<String> list;
        List<String> list2;
        Prices prices;
        data.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        l5j0 l5j0Var = null;
        this.dialog = m130396e(this.act, m130395d(layoutInflaterFrom, null));
        for (H5Merchandise h5Merchandise : data) {
            String string = this.act.getString(R$string.f27663y6, h5Merchandise.quantity + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            string.getClass();
            m130402k().setText(this.act.getString(R$string.f27652x6, h5Merchandise.quantity + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
            H5StockKeepUnit h5StockKeepUnit = h5Merchandise.defaultStockKeepUnit;
            if (h5StockKeepUnit != null && (prices = h5StockKeepUnit.prices) != null) {
                m130403l().setText(((int) prices.price) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + prices.currencyCode);
            }
            ProductCategory productCategory = h5Merchandise.category;
            if (Intrinsics.m87488d(productCategory, ProductCategory.get(ProductCategory.intlPayCoolsBill))) {
                if (Intrinsics.m87488d((paymentChannels == null || (list = paymentChannels.categories) == null) ? null : Boolean.valueOf(list.contains(ProductCategory.intlPayCoolsBill)), Boolean.TRUE)) {
                    xdl0.m208344M(m130398g(), true);
                    m130411t("e_intl_premium_wallet_purchase_bills_payment");
                    m130412u(m130399h(), h5Merchandise, string);
                }
            } else if (Intrinsics.m87488d(productCategory, ProductCategory.get(ProductCategory.intlPayCoolsGCash))) {
                if (Intrinsics.m87488d((paymentChannels == null || (list2 = paymentChannels.categories) == null) ? null : Boolean.valueOf(list2.contains(ProductCategory.intlPayCoolsGCash)), Boolean.TRUE)) {
                    xdl0.m208344M(m130404m(), true);
                    m130411t("e_intl_premium_wallet_purchase_gcash");
                    m130412u(m130405n(), h5Merchandise, string);
                }
            }
        }
        if (orderData != null) {
            for (H5PayOrderData h5PayOrderData : orderData) {
                if (Intrinsics.m87488d(h5PayOrderData.orderStatus, H5PaymentOrderStatus.get(H5PaymentOrderStatus.PENDING))) {
                    ProductCategory productCategory2 = h5PayOrderData.platform;
                    if (Intrinsics.m87488d(productCategory2, ProductCategory.get(ProductCategory.intlPayCoolsBill))) {
                        xdl0.m208344M(m130400i(), true);
                    } else if (Intrinsics.m87488d(productCategory2, ProductCategory.get(ProductCategory.intlPayCoolsGCash))) {
                        xdl0.m208344M(m130407p(), true);
                        xdl0.m208344M(m130406o(), false);
                    }
                }
            }
        }
        xdl0.m208329E0(m130401j(), new View.OnClickListener() { // from class: l.ec60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hc60.m130392a(this.f90472a, view);
            }
        });
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var2 = null;
        }
        l5j0Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fc60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hc60.m130394c(this.f96773a, dialogInterface);
            }
        });
        l5j0 l5j0Var3 = this.dialog;
        if (l5j0Var3 == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
        } else {
            l5j0Var = l5j0Var3;
        }
        l5j0Var.show();
        m130409r();
    }
}
