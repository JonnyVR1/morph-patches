package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/rn60;", "Ll/j2m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Ll/jn60;", "paymentHandlerData", "Ll/l5;", "paymentComponent", "", "a", "(Ll/jn60;Ll/l5;)Z", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ll/ndb0;", "getMediator", "()Ll/ndb0;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rn60 implements j2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ndb0 mediator;

    public rn60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    @Override // p153l.j2m
    /* JADX INFO: renamed from: a */
    public boolean mo117054a(@NotNull jn60 paymentHandlerData, @NotNull AbstractC18347l5 paymentComponent) {
        lib0 purchaseTrack;
        String purchaseTrackId;
        lib0 purchaseTrack2;
        String purchaseTrackId2;
        paymentHandlerData.getClass();
        paymentComponent.getClass();
        C8928d currentPurchaseSection = paymentHandlerData.getCurrentPurchaseSection();
        C8928d.a aVarM54703b = currentPurchaseSection.m54715n() ? currentPurchaseSection.m54703b() : currentPurchaseSection.m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        double d = merchandiseM54784s.defaultStockKeepUnit.prices.price;
        if (merchandiseM54784s.yearly() || !TEnum.equals(aVarM54703b.m54762f(), "svip") || d > paymentHandlerData.getRefundAmount()) {
            return false;
        }
        o1j0.m165649w(R$string.f28473v1);
        boolean zEquals = TEnum.equals(paymentHandlerData.getCurrentPayMethod(), "wechat");
        ndb0 ndb0Var = this.mediator;
        if (zEquals) {
            if (ndb0Var == null || (purchaseTrack2 = ndb0Var.getPurchaseTrack()) == null || (purchaseTrackId2 = purchaseTrack2.getPurchaseTrackId()) == null) {
                return true;
            }
            lib0.Companion companion = lib0.INSTANCE;
            String str = merchandiseM54784s.defaultStockKeepUnit.f21249id;
            str.getClass();
            companion.m154355g(purchaseTrackId2, str, "refund more");
            return true;
        }
        if (ndb0Var == null || (purchaseTrack = ndb0Var.getPurchaseTrack()) == null || (purchaseTrackId = purchaseTrack.getPurchaseTrackId()) == null) {
            return true;
        }
        lib0.Companion companion2 = lib0.INSTANCE;
        String str2 = merchandiseM54784s.defaultStockKeepUnit.f21249id;
        str2.getClass();
        companion2.m154349a(purchaseTrackId, str2, "refund more");
        return true;
    }
}
