package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b*\b&\u0018\u0000 ]2\u00020\u0001:\u0001IB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J-\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010!JG\u0010-\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020$¢\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020$¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b2\u0010!J%\u00106\u001a\u00020\b2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020*H&¢\u0006\u0004\b8\u00109J1\u0010:\u001a\u00020*2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H$¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020*2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bA\u0010BJ)\u0010C\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010*H$¢\u0006\u0004\bE\u0010FJ1\u0010G\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bG\u0010HJI\u0010I\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010&\u001a\u00020$2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bI\u0010JJ1\u0010K\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020$H&¢\u0006\u0004\bK\u0010HJ\u001f\u0010L\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH$¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020*2\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u0010\u001f\u001a\u00020\u001eH$¢\u0006\u0004\bN\u0010OR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u0005R\"\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010P\u001a\u0004\bT\u0010R\"\u0004\bU\u0010\u0005R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bW\u0010Y\"\u0004\bZ\u0010\nR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\\¨\u0006^"}, m88121d2 = {"Ll/lib0;", "", "", "purchaseTrackId", "<init>", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/core/data/ProductCategory;)V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", c4s.C_ZONE, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", "defaultSelect", "D", "(Ljava/util/List;I)V", Merchandise.TYPE, "A", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "section", "B", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", BaseSei.f14624X, "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "", "showTotalPrice", "autoPay", "w", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZ)V", BLiveStormDanmakuGiftResourceType.f45294s, "Lorg/json/JSONObject;", "pageShowParam", "isDefaultButtonType", "r", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;Lcom/p1/mobile/putong/core/data/PurchaseType;Z)V", "buttonType", Constants.KEY_T, "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;Z)V", BaseSei.f14625Y, "currentPurchaseSection", "Ll/gq60;", "paymentTextResponseData", BaseSei.f14626Z, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/gq60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "e", "()Lorg/json/JSONObject;", "m", "(Ljava/util/List;Lorg/json/JSONObject;I)Lorg/json/JSONObject;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "purchaseSection", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "j", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;)Lorg/json/JSONObject;", "b", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;ZLcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/data/Merchandise;ZZ)Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "h", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/gq60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "q", "getPageID", "p", "pageID", "c", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "()Lcom/p1/mobile/putong/core/data/ProductCategory;", "o", "currentProductCategory", "Lorg/json/JSONObject;", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class lib0 {

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

    public lib0(@NotNull String str) {
        str.getClass();
        this.purchaseTrackId = str;
        this.pageID = "p_purchase_page";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m154331u(lib0 lib0Var, jn60 jn60Var, PurchaseType purchaseType, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: trackNoneRenewableRetainMC");
            return;
        }
        if ((i & 4) != 0) {
            Integer numM146219e = jn60Var.getPaymentTrackSource();
            z = numM146219e != null && numM146219e.intValue() == 2;
        }
        lib0Var.m154343t(jn60Var, purchaseType, z);
    }

    /* JADX INFO: renamed from: A */
    public final void m154332A(@NotNull Merchandise merchandise) {
        merchandise.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138522t("e_purchase_price_module", this.pageID, mo103697j(merchandise, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m154333B(@NotNull C8928d section) {
        section.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138522t("e_purchase_price_module", this.pageID, mo103698k(section, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m154334C(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138528z("e_purchase_price_module", this.pageID, mo103699l(sections, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m154335D(@NotNull List<? extends Merchandise> merchandises, int defaultSelect) {
        merchandises.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138528z("e_purchase_price_module", this.pageID, mo103700m(merchandises, this.pageShowParam, defaultSelect));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract JSONObject mo103689a(@NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean showTotalPrice, @NotNull PayMethod curPayMethod, @NotNull Merchandise merchandise, boolean autoPay, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract JSONObject mo103690b(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ProductCategory m154336c() {
        ProductCategory productCategory = this.currentProductCategory;
        if (productCategory != null) {
            return productCategory;
        }
        Intrinsics.m88391r("currentProductCategory");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract JSONObject mo103691d(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType);

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract JSONObject mo103692e();

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract JSONObject mo103693f(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract JSONObject mo103694g(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract JSONObject mo103695h(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType);

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract JSONObject mo103696i(@NotNull C8928d currentPurchaseSection, @NotNull gq60 paymentTextResponseData, @NotNull PurchaseType purchaseType);

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract JSONObject mo103697j(@NotNull Merchandise merchandise, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract JSONObject mo103698k(@NotNull C8928d purchaseSection, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract JSONObject mo103699l(@NotNull List<? extends C8928d> sections, @Nullable JSONObject pageShowParam);

    @NotNull
    /* JADX INFO: renamed from: m */
    public abstract JSONObject mo103700m(@NotNull List<? extends Merchandise> merchandises, @Nullable JSONObject pageShowParam, int defaultSelect);

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPurchaseTrackId() {
        return this.purchaseTrackId;
    }

    /* JADX INFO: renamed from: o */
    public final void m154338o(@NotNull ProductCategory productCategory) {
        productCategory.getClass();
        this.currentProductCategory = productCategory;
    }

    /* JADX INFO: renamed from: p */
    public final void m154339p(@NotNull String str) {
        str.getClass();
        this.pageID = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m154340q(@NotNull String str) {
        str.getClass();
        this.purchaseTrackId = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m154341r(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam, @NotNull PurchaseType purchaseType, boolean isDefaultButtonType) {
        merchandise.getClass();
        curPayMethod.getClass();
        purchaseType.getClass();
        if (NullChecker.m82486a(pageShowParam)) {
            i4g0.m138522t("e_purchase_confirm_button", "p_purchase_confirm_pop", mo103689a(purchaseType, pageShowParam, showTotalPrice, curPayMethod, merchandise, autoPay, isDefaultButtonType));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m154342s(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            Integer numM146219e = paymentHandlerData.getPaymentTrackSource();
            i4g0.m138522t("e_purchase_confirm_button", "p_purchase_confirm_pop", mo103690b(paymentHandlerData, purchaseType, this.pageShowParam, numM146219e != null && numM146219e.intValue() == 3));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m154343t(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, boolean buttonType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138522t("e_purchase_autoguide_button", "p_purchase_autoguide_pop", mo103691d(paymentHandlerData, purchaseType, this.pageShowParam, buttonType));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m154344v(@NotNull ProductCategory productCategory) {
        productCategory.getClass();
        m154338o(productCategory);
        JSONObject jSONObjectMo103692e = mo103692e();
        this.pageShowParam = jSONObjectMo103692e;
        i4g0.m138528z("e_purchase_product_module", this.pageID, jSONObjectMo103692e);
    }

    /* JADX INFO: renamed from: w */
    public final void m154345w(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay) {
        merchandise.getClass();
        curPayMethod.getClass();
        if (this.pageShowParam == null) {
            JSONObject jSONObject = new JSONObject();
            this.pageShowParam = jSONObject;
            try {
                jSONObject.put("purchase_id", this.purchaseTrackId);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        i4g0.m138522t("e_purchase_buy_button", this.pageID, mo103693f(merchandise, curPayMethod, showTotalPrice, autoPay, this.pageShowParam));
    }

    /* JADX INFO: renamed from: x */
    public final void m154346x(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        if (NullChecker.m82486a(this.pageShowParam)) {
            i4g0.m138522t("e_purchase_buy_button", this.pageID, mo103694g(paymentHandlerData, purchaseType, this.pageShowParam));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m154347y(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        paymentHandlerData.getClass();
        purchaseType.getClass();
        i4g0.m138522t("e_purchase_buy_button_tag", this.pageID, mo103695h(paymentHandlerData, purchaseType));
    }

    /* JADX INFO: renamed from: z */
    public final void m154348z(@NotNull C8928d currentPurchaseSection, @NotNull gq60 paymentTextResponseData, @NotNull PurchaseType purchaseType) {
        currentPurchaseSection.getClass();
        paymentTextResponseData.getClass();
        purchaseType.getClass();
        i4g0.m138528z("e_purchase_buy_button_tag", this.pageID, mo103696i(currentPurchaseSection, paymentTextResponseData, purchaseType));
    }

    /* JADX INFO: renamed from: l.lib0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\nJ'\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\nJA\u0010\u0013\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006\""}, m88121d2 = {"Ll/lib0$a;", "", "<init>", "()V", "", "purchaseTrackId", "itemId", "errorMessage", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "platform", "c", "e", "orderId", "", "code", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "contractId", "f", "PAYMENT_TRACK_SOURCE_DEFAULT", "I", "PAYMENT_TRACK_SOURCE_NONE_RENEWABLE_RETAIN_CONFIRM", "PAYMENT_TRACK_SOURCE_CONFIRM_DEFAULT", "PAYMENT_TRACK_SOURCE_CONFIRM_REFUSE", "ABNORMAL_MESSAGE_WX_NOT_INSTALL", "Ljava/lang/String;", "ABNORMAL_MESSAGE_ALI_NOT_INSTALL", "ABNORMAL_MESSAGE_USER_BLOCK", "ABNORMAL_MESSAGE_REFUND_MORE", "ABNORMAL_MESSAGE_COUPON_EXPIRED", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m154349a(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            i4g0.m138495D("e_purchase_pay_request_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", "alipay"), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: b */
        public final void m154350b(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            i4g0.m138495D("e_purchase_pay_request_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", PayMethod.jingdong), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: c */
        public final void m154351c(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform) {
            itemId.getClass();
            platform.getClass();
            i4g0.m138495D("e_purchase_pay_request_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", platform), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", ""));
        }

        /* JADX INFO: renamed from: d */
        public final void m154352d(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform, @NotNull String orderId, int code, @Nullable String errorMessage) {
            itemId.getClass();
            platform.getClass();
            orderId.getClass();
            i4g0.m138495D("e_purchase_pay_response_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", platform), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("order_id", orderId), jyb.m147494Y("code", Integer.valueOf(code)), jyb.m147494Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: e */
        public final void m154353e(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform) {
            itemId.getClass();
            platform.getClass();
            i4g0.m138495D("e_purchase_pay_request_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", platform), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("error_message", ""));
        }

        /* JADX INFO: renamed from: f */
        public final void m154354f(@Nullable String purchaseTrackId, @NotNull String itemId, @NotNull String platform, @NotNull String contractId, int code, @Nullable String errorMessage) {
            itemId.getClass();
            platform.getClass();
            contractId.getClass();
            i4g0.m138495D("e_purchase_pay_response_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", platform), jyb.m147494Y("order_type", "contract"), jyb.m147494Y("contract_id", contractId), jyb.m147494Y("code", Integer.valueOf(code)), jyb.m147494Y("error_message", errorMessage));
        }

        /* JADX INFO: renamed from: g */
        public final void m154355g(@Nullable String purchaseTrackId, @NotNull String itemId, @Nullable String errorMessage) {
            itemId.getClass();
            i4g0.m138495D("e_purchase_pay_request_adr", "p_purchase_page", jyb.m147494Y("purchase_id", mib0.m158472a(purchaseTrackId)), jyb.m147494Y("skuID", itemId), jyb.m147494Y("platform", "wechat"), jyb.m147494Y("order_type", "pay"), jyb.m147494Y("error_message", errorMessage));
        }

        public Companion() {
        }
    }
}
