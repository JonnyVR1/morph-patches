package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/ph60;", "Ll/t4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/ai60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "h", "()Ljava/lang/String;", "j", "()V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/ArrayList;", "k", "(Ljava/util/ArrayList;)V", "stickerList", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ph60 extends AbstractC20103t4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ArrayList<String> stickerList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: b */
    public void mo136186b(@NotNull ai60 request, @NotNull bi60 response) {
        request.getClass();
        response.getClass();
        response.m101984n(m168928h());
        response.m101981k(null);
        response.m101982l(true);
    }

    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: e */
    public boolean mo136187e(@NotNull ai60 request) {
        request.getClass();
        C8765d.a aVarM187136g = m187136g(request.getPurchaseSection());
        if (g6a.m124571t()) {
            return rxa0.m181495p(aVarM187136g.m53601s(), ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP) || rxa0.m181495p(aVarM187136g.m53601s(), ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final String m168928h() {
        m168930j();
        if (m168929i().isEmpty()) {
            return "新客优惠";
        }
        String str = m168929i().get(new Random().nextInt(m168929i().size()));
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ArrayList<String> m168929i() {
        ArrayList<String> arrayList = this.stickerList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.m87502r("stickerList");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m168930j() {
        if (this.stickerList == null) {
            m168931k(new ArrayList<>());
            try {
                String strM79302F = RemoteConfig.m79298x().m79302F("new_customer_promotion_ui_config");
                strM79302F.getClass();
                JSONArray jSONArray = new JSONObject(strM79302F).getJSONArray("purchaseLabels");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    obj.getClass();
                    m168929i().add((String) obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m168931k(@NotNull ArrayList<String> arrayList) {
        arrayList.getClass();
        this.stickerList = arrayList;
    }
}
