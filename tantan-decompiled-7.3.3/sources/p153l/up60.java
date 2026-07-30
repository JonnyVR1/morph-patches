package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/up60;", "Ll/r4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fq60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/fq60;)Z", "Ll/gq60;", "response", "", "b", "(Ll/fq60;Ll/gq60;)V", "h", "()Ljava/lang/String;", "j", "()V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/ArrayList;", "k", "(Ljava/util/ArrayList;)V", "stickerList", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class up60 extends AbstractC19757r4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ArrayList<String> stickerList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: b */
    public void mo99414b(@NotNull fq60 request, @NotNull gq60 response) {
        request.getClass();
        response.getClass();
        response.m131355n(m197049h());
        response.m131352k(null);
        response.m131353l(true);
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: e */
    public boolean mo99415e(@NotNull fq60 request) {
        request.getClass();
        C8928d.a aVarM179724g = m179724g(request.getPurchaseSection());
        if (s7a.m184991t()) {
            return v5b0.m199790p(aVarM179724g.m54784s(), ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP) || v5b0.m199790p(aVarM179724g.m54784s(), ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m197049h() {
        m197051j();
        if (m197050i().isEmpty()) {
            return "新客优惠";
        }
        String str = m197050i().get(new Random().nextInt(m197050i().size()));
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ArrayList<String> m197050i() {
        ArrayList<String> arrayList = this.stickerList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.m88391r("stickerList");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m197051j() {
        if (this.stickerList == null) {
            m197052k(new ArrayList<>());
            try {
                String strM80485F = RemoteConfig.m80481x().m80485F("new_customer_promotion_ui_config");
                strM80485F.getClass();
                JSONArray jSONArray = new JSONObject(strM80485F).getJSONArray("purchaseLabels");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    obj.getClass();
                    m197050i().add((String) obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m197052k(@NotNull ArrayList<String> arrayList) {
        arrayList.getClass();
        this.stickerList = arrayList;
    }
}
