package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b*\b&\u0018\u0000 ]2\u00020\u0001:\u0001IB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J-\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010!JG\u0010-\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020$¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b2\u0010!J%\u00106\u001a\u00020\b2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020*H&¢\u0006\u0004\b8\u00109J1\u0010:\u001a\u00020*2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H$¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020*2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bA\u0010BJ)\u0010C\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bE\u0010FJ1\u0010G\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bG\u0010HJI\u0010I\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010&\u001a\u00020$2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bI\u0010JJ1\u0010K\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bK\u0010HJ\u001f\u0010L\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH$¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020*2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u0010\u001f\u001a\u00020\u001eH$¢\u0006\u0004\bN\u0010OR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u0005R\"\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010P\u001a\u0004\bT\u0010R\"\u0004\bU\u0010\u0005R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bW\u0010Y\"\u0004\bZ\u0010\nR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\\¨\u0006^"}, m87232d2 = {"Ll/hab0;", "", "", "purchaseTrackId", "<init>", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/core/data/ProductCategory;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", b2s.C_ZONE, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", "defaultSelect", "D", "(Ljava/util/List;I)V", Merchandise.TYPE, "A", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "section", "B", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", BaseSei.f13930X, "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "", "showTotalPrice", "autoPay", "w", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZ)V", BLiveStormDanmakuGiftResourceType.f44446s, "Lorg/json/JSONObject;", "pageShowParam", "isDefaultButtonType", "r", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;Lcom/p1/mobile/putong/core/data/PurchaseType;Z)V", "buttonType", Constants.KEY_T, "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Z)V", BaseSei.f13931Y, "currentPurchaseSection", "Ll/bi60;", "paymentTextResponseData", BaseSei.f13932Z, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/bi60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "e", "()Lorg/json/JSONObject;", "m", "(Ljava/util/List;Lorg/json/JSONObject;I)Lorg/json/JSONObject;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "purchaseSection", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "j", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;)Lorg/json/JSONObject;", "b", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;ZLcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/data/Merchandise;ZZ)Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "h", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/bi60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "q", "getPageID", "p", "pageID", "c", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "()Lcom/p1/mobile/putong/core/data/ProductCategory;", "o", "currentProductCategory", "Lorg/json/JSONObject;", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class hab0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String purchaseTrackId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String pageID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ProductCategory currentProductCategory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public JSONObject pageShowParam;

    public hab0(@NotNull String str) {
        str.getClass();
        this.purchaseTrackId = str;
        this.pageID = "p_purchase_page";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m130097u(hab0 hab0Var, ef60 ef60Var, PurchaseType purchaseType, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: trackNoneRenewableRetainMC");
            return;
        }
        if ((i & 4) != 0) {
            Integer numM116024e = ef60Var.getPaymentTrackSource();
            z = numM116024e != null && numM116024e.intValue() == 2;
        }
        hab0Var.m130121t(ef60Var, purchaseType, z);
    }

    /* JADX INFO: renamed from: A */
    public final void m130098A(@NotNull Merchandise merchandise) {
        merchandise.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220398t("e_purchase_price_module", this.pageID, mo130111j(merchandise, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m130099B(@NotNull C8765d section) {
        section.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220398t("e_purchase_price_module", this.pageID, mo130112k(section, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m130100C(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220404z("e_purchase_price_module", this.pageID, mo130113l(sections, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m130101D(@NotNull List<? extends Merchandise> merchandises, int defaultSelect) {
        merchandises.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220404z("e_purchase_price_module", this.pageID, mo130114m(merchandises, this.pageShowParam, defaultSelect));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract JSONObject mo130102a(@NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean showTotalPrice, @NotNull PayMethod curPayMethod, @NotNull Merchandise merchandise, boolean autoPay, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract JSONObject mo130103b(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ProductCategory m130104c() {
        ProductCategory productCategory = this.currentProductCategory;
        if (productCategory != null) {
            return productCategory;
        }
        Intrinsics.m87502r("currentProductCategory");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract JSONObject mo130105d(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract JSONObject mo130106e();

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract JSONObject mo130107f(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract JSONObject mo130108g(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract JSONObject mo130109h(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType);

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract JSONObject mo130110i(@NotNull C8765d currentPurchaseSection, @NotNull bi60 paymentTextResponseData, @NotNull PurchaseType purchaseType);

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract JSONObject mo130111j(@NotNull Merchandise merchandise, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract JSONObject mo130112k(@NotNull C8765d purchaseSection, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract JSONObject mo130113l(@NotNull List<? extends C8765d> sections, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: m */
    public abstract JSONObject mo130114m(@NotNull List<? extends Merchandise> merchandises, @Nullable JSONObject pageShowParam, int defaultSelect);

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPurchaseTrackId() {
        return this.purchaseTrackId;
    }

    /* JADX INFO: renamed from: o */
    public final void m130116o(@NotNull ProductCategory productCategory) {
        productCategory.getClass();
        this.currentProductCategory = productCategory;
    }

    /* JADX INFO: renamed from: p */
    public final void m130117p(@NotNull String str) {
        str.getClass();
        this.pageID = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m130118q(@NotNull String str) {
        str.getClass();
        this.purchaseTrackId = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m130119r(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam, @NotNull PurchaseType purchaseType, boolean isDefaultButtonType) {
        merchandise.getClass();
        curPayMethod.getClass();
        purchaseType.getClass();
        if (NullChecker.m81303a(pageShowParam)) {
            zvf0.m220398t("e_purchase_confirm_button", "p_purchase_confirm_pop", mo130102a(purchaseType, pageShowParam, showTotalPrice, curPayMethod, merchandise, autoPay, isDefaultButtonType));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m130120s(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            Integer numM116024e = paymentHandlerData.getPaymentTrackSource();
            zvf0.m220398t("e_purchase_confirm_button", "p_purchase_confirm_pop", mo130103b(paymentHandlerData, purchaseType, this.pageShowParam, numM116024e != null && numM116024e.intValue() == 3));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m130121t(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, boolean buttonType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220398t("e_purchase_autoguide_button", "p_purchase_autoguide_pop", mo130105d(paymentHandlerData, purchaseType, this.pageShowParam, buttonType));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m130122v(@NotNull ProductCategory productCategory) {
        productCategory.getClass();
        m130116o(productCategory);
        JSONObject jSONObjectMo130106e = mo130106e();
        this.pageShowParam = jSONObjectMo130106e;
        zvf0.m220404z("e_purchase_product_module", this.pageID, jSONObjectMo130106e);
    }

    /* JADX INFO: renamed from: w */
    public final void m130123w(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay) {
        merchandise.getClass();
        curPayMethod.getClass();
        if (this.pageShowParam == null) {
            JSONObject jSONObject = new JSONObject();
            this.pageShowParam = jSONObject;
            try {
                jSONObject.put("purchase_id", this.purchaseTrackId);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        zvf0.m220398t("e_purchase_buy_button", this.pageID, mo130107f(merchandise, curPayMethod, showTotalPrice, autoPay, this.pageShowParam));
    }

    /* JADX INFO: renamed from: x */
    public final void m130124x(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m81303a(this.pageShowParam)) {
            zvf0.m220398t("e_purchase_buy_button", this.pageID, mo130108g(paymentHandlerData, purchaseType, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m130125y(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        zvf0.m220398t("e_purchase_buy_button_tag", this.pageID, mo130109h(paymentHandlerData, purchaseType));
    }

    /* JADX INFO: renamed from: z */
    public final void m130126z(@NotNull C8765d currentPurchaseSection, @NotNull bi60 paymentTextResponseData, @NotNull PurchaseType purchaseType) {
        currentPurchaseSection.getClass();
        paymentTextResponseData.getClass();
        purchaseType.getClass();
        zvf0.m220404z("e_purchase_buy_button_tag", this.pageID, mo130110i(currentPurchaseSection, paymentTextResponseData, purchaseType));
    }

    /* JADX INFO: renamed from: l.hab0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\nJ'\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\nJA\u0010\u0013\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006\""}, m87232d2 = {"Ll/hab0$a;", "", "<init>", "()V", "", "purchaseTrackId", "itemId", "errorMessage", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "platform", "c", "e", "orderId", "", "code", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "contractId", "f", "PAYMENT_TRACK_SOURCE_DEFAULT", "I", "PAYMENT_TRACK_SOURCE_NONE_RENEWABLE_RETAIN_CONFIRM", "PAYMENT_TRACK_SOURCE_CONFIRM_DEFAULT", "PAYMENT_TRACK_SOURCE_CONFIRM_REFUSE", "ABNORMAL_MESSAGE_WX_NOT_INSTALL", "Ljava/lang/String;", "ABNORMAL_MESSAGE_ALI_NOT_INSTALL", "ABNORMAL_MESSAGE_USER_BLOCK", "ABNORMAL_MESSAGE_REFUND_MORE", "ABNORMAL_MESSAGE_COUPON_EXPIRED", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m130127a(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            zvf0.m220371D("e_purchase_pay_request_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", "alipay"), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: b */
        public final void m130128b(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            zvf0.m220371D("e_purchase_pay_request_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", PayMethod.jingdong), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: c */
        public final void m130129c(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform) {
            itemId.getClass();
            platform.getClass();
            zvf0.m220371D("e_purchase_pay_request_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", platform), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", ""));
        }

        /* JADX INFO: renamed from: d */
        public final void m130130d(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform, @NotNull String orderId, int code, @Nullable String errorMessage) {
            itemId.getClass();
            platform.getClass();
            orderId.getClass();
            zvf0.m220371D("e_purchase_pay_response_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", platform), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("order_id", orderId), vwb.m200311Y("code", Integer.valueOf(code)), vwb.m200311Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: e */
        public final void m130131e(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform) {
            itemId.getClass();
            platform.getClass();
            zvf0.m220371D("e_purchase_pay_request_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", platform), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("error_message", ""));
        }

        /* JADX INFO: renamed from: f */
        public final void m130132f(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform, @NotNull String contractId, int code, @Nullable String errorMessage) {
            itemId.getClass();
            platform.getClass();
            contractId.getClass();
            zvf0.m220371D("e_purchase_pay_response_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", platform), vwb.m200311Y("order_type", "contract"), vwb.m200311Y("contract_id", contractId), vwb.m200311Y("code", Integer.valueOf(code)), vwb.m200311Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: g */
        public final void m130133g(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            zvf0.m220371D("e_purchase_pay_request_adr", "p_purchase_page", vwb.m200311Y("purchase_id", iab0.m135140a(purchaseTrackId)), vwb.m200311Y("skuID", itemId), vwb.m200311Y("platform", "wechat"), vwb.m200311Y("order_type", "pay"), vwb.m200311Y("error_message", errorMessage));
        }

        public Companion() {
        }
    }
}
