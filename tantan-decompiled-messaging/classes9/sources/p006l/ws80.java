package p006l;

import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ws80 {
    /* JADX INFO: renamed from: a */
    public static kq2 m26764a(MonetizationPromotionsId monetizationPromotionsId, Merchandise merchandise) {
        String string = monetizationPromotionsId.toString();
        string.getClass();
        switch (string) {
            case "lowPriceCallback3SVIP":
                return new xnd0(merchandise);
            case "lowPriceCustomerUpliftSVIP":
                return new cm20(merchandise);
            case "lowPriceFirstTime12MSVIP":
                return new q6h0(merchandise);
            case "lowPriceCallback3VIP":
                return new qjl0(merchandise);
            case "lowPrice3Month":
                return new rjl0(merchandise);
            case "lowPriceCustomerVIP":
                return new lzb(merchandise);
            case "lowPriceODiamond":
                return new tw40(merchandise);
            case "trial7DSVIP":
                return new cod0(merchandise);
            case "giftDurationSVIP":
                return null;
            case "lowPriceCustomerSVIP":
                return new kzb(merchandise);
            default:
                CrashHelper.c(new Exception("unknow Promotion== " + monetizationPromotionsId));
                return null;
        }
    }
}
