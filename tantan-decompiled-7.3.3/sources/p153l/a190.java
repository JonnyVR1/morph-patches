package p153l;

import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class a190 {
    /* JADX INFO: renamed from: a */
    public static br2 m95467a(MonetizationPromotionsId monetizationPromotionsId, Merchandise merchandise) {
        String string = monetizationPromotionsId.toString();
        string.getClass();
        switch (string) {
            case "lowPriceCallback3SVIP":
                return new zvd0(merchandise);
            case "lowPriceCustomerUpliftSVIP":
                return new mu20(merchandise);
            case "lowPriceFirstTime12MSVIP":
                return new yeh0(merchandise);
            case "lowPriceCallback3VIP":
                return new usl0(merchandise);
            case "lowPrice3Month":
                return new vsl0(merchandise);
            case "lowPriceCustomerVIP":
                return new z0c(merchandise);
            case "lowPriceODiamond":
                return new i550(merchandise);
            case "trial7DSVIP":
                return new ewd0(merchandise);
            case "giftDurationSVIP":
                return null;
            case "lowPriceCustomerSVIP":
                return new y0c(merchandise);
            default:
                CrashHelper.m82479c(new Exception("unknow Promotion== " + monetizationPromotionsId));
                return null;
        }
    }
}
