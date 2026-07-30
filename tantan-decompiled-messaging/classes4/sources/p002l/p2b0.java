package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SkuConfigs;
import com.p1.mobile.putong.core.data.TriggerDialogFromListBean;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.g6a;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p2b0 {

    /* JADX INFO: renamed from: c */
    public static p2b0 f16987c;

    /* JADX INFO: renamed from: a */
    public boolean f16988a = false;

    /* JADX INFO: renamed from: b */
    public boolean f16989b = true;

    /* JADX INFO: renamed from: h */
    public static p2b0 m19990h() {
        if (f16987c == null) {
            synchronized (p2b0.class) {
                try {
                    if (f16987c == null) {
                        f16987c = new p2b0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16987c;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m19991A(ProductCategory productCategory) {
        return TEnum.equals(productCategory, "tttSvipGoogleplay") || TEnum.equals(productCategory, "tttUltraPremium");
    }

    /* JADX INFO: renamed from: B */
    public List<String> m19992B(PurchaseType purchaseType) {
        if (m20014z()) {
            if (TEnum.equals(purchaseType.productCategory(), "tttVip")) {
                return vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return vwb.f0(new String[]{"1", "6", "12", "-12", "-6", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return vwb.f0(new String[]{"1", "3", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return vwb.f0(new String[]{"1", "3", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "femaleVip")) {
                return g6a.i() ? vwb.f0(new String[]{"1w", "1", "6"}) : vwb.f0(new String[]{"-1w", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "youthVip")) {
                return g6a.y() ? vwb.f0(new String[]{"1w", "1", "6"}) : vwb.f0(new String[]{"-1w", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom")) {
                return vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamondPrivateCustom")) {
                return vwb.f0(new String[]{"1", "3", "-12", "-3", "-1"});
            }
        } else {
            if (TEnum.equals(purchaseType.productCategory(), "tttVip")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return vwb.f0(new String[]{"1", "6", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom") || TEnum.equals(purchaseType.productCategory(), "oDiamondPrivateCustom")) {
                return vwb.f0(new String[]{"1", "3", "12"});
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m19993d(ProductCategory productCategory) {
        return NullChecker.a(m20005q(productCategory));
    }

    /* JADX INFO: renamed from: e */
    public void m19994e() {
        this.f16988a = false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<PayMethod> m19995f(@NonNull Merchandise merchandise) {
        if (!merchandise.autoRenewable()) {
            if (merchandise.noneRenewable()) {
                return (merchandise.yearly() && TEnum.equals(merchandise.category, "oDiamondPrivateCustom")) ? vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat")}) : vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get("jingdong")});
            }
            return vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get("jingdong")});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PayMethod.get("alipay"));
        if ((!TEnum.equals(merchandise.category, "svip") || (!merchandise.weekly() && !merchandise.semiAnnual() && !merchandise.yearly())) && ((!TEnum.equals(merchandise.category, "tttVip") || !merchandise.weekly()) && !TEnum.equals(merchandise.category, "oDiamond") && !TEnum.equals(merchandise.category, "platinum") && !TEnum.equals(merchandise.category, "svipPicksMembership") && !TEnum.equals(merchandise.category, "picksMembership") && !TEnum.equals(merchandise.category, "privateCustom") && !TEnum.equals(merchandise.category, "oDiamondPrivateCustom") && !TEnum.equals(merchandise.category, "femaleVip"))) {
            arrayList.add(PayMethod.get("wechat"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public ProductCategory m19996g(String str) {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM20006r = m20006r(str);
        if (!NullChecker.a(purchaseDialogConfigTriggerM20006r) || TEnum.equals(purchaseDialogConfigTriggerM20006r.defaultCategory, "unknown_")) {
            return TextUtils.equals("vip", str) ? ProductCategory.get("tttVip") : ProductCategory.get("svip");
        }
        return purchaseDialogConfigTriggerM20006r.defaultCategory;
    }

    /* JADX INFO: renamed from: i */
    public PurchaseDialogConfigTriggerShowType m19997i(String str, String str2) {
        TriggerDialogFromListBean triggerDialogFromListBean;
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM20006r = m20006r(str);
        if (!NullChecker.a(purchaseDialogConfigTriggerM20006r) || TEnum.equals(purchaseDialogConfigTriggerM20006r.defaultCategory, "unknown_")) {
            return PurchaseDialogConfigTriggerShowType.get("vip");
        }
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        if (NullChecker.a(purchaseDialogConfigsI4) && !TextUtils.isEmpty(str2) && (triggerDialogFromListBean = purchaseDialogConfigsI4.triggerDialogFromList) != null) {
            if (triggerDialogFromListBean.svipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("svip");
            }
            if (purchaseDialogConfigsI4.triggerDialogFromList.vipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("vip");
            }
            if (purchaseDialogConfigsI4.triggerDialogFromList.vipSVipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("vip-svip");
            }
        }
        return purchaseDialogConfigTriggerM20006r.showType;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m19998j(List<String> list, List<String> list2, List<String> list3) {
        for (int i = 0; i < list.size(); i++) {
            list3.add(list.get(i) + m20013y(i, list2));
        }
        return list3;
    }

    /* JADX INFO: renamed from: k */
    public String m19999k(Merchandise merchandise) {
        NewCustomerPromotionConfig newCustomerPromotionConfigW3 = CoreModule.c.c1.w3(((Coupon) merchandise.localCoupons.get(0)).couponID);
        return (!NullChecker.a(newCustomerPromotionConfigW3) || TextUtils.isEmpty(newCustomerPromotionConfigW3.purchaseButtonText)) ? "限时优惠" : newCustomerPromotionConfigW3.purchaseButtonText;
    }

    /* JADX INFO: renamed from: l */
    public String m20000l(Merchandise merchandise, int i) {
        if (vwb.J(merchandise.localCoupons)) {
            return "限时优惠";
        }
        NewCustomerPromotionConfig newCustomerPromotionConfigW3 = CoreModule.c.c1.w3(((Coupon) merchandise.localCoupons.get(0)).couponID);
        if (NullChecker.a(newCustomerPromotionConfigW3) && !TextUtils.isEmpty(newCustomerPromotionConfigW3.privilegeBannerText)) {
            return newCustomerPromotionConfigW3.privilegeBannerText;
        }
        if (i == 12) {
            return "限时优惠，首年低价";
        }
        if (i == 3) {
            return "限时优惠，首季低价";
        }
        if (merchandise.isBelongPromotion("giftDurationSVIP")) {
            return "双11大促，订阅6个月会员立送3个月";
        }
        if (merchandise.isBelongPromotion("lowPriceCustomerVIP")) {
            return "限时优惠，首月低价1元";
        }
        return merchandise.isBelongPromotion("lowPrice3Month") ? "限时优惠，前3月¥1/月" : "限时优惠，首月低价";
    }

    /* JADX INFO: renamed from: m */
    public String m20001m(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM20005q = m20005q(productCategory);
        if (NullChecker.a(purchaseDialogConfigMerchandiseM20005q)) {
            if (m19991A(productCategory)) {
                StringBuilder sb = new StringBuilder();
                sb.append(purchaseDialogConfigMerchandiseM20005q.defaultQuantity);
                sb.append(TextUtils.equals(purchaseDialogConfigMerchandiseM20005q.defaultUnit, "w") ? "w" : "");
                return sb.toString();
            }
            int iAbs = m20014z() ? Math.abs(purchaseDialogConfigMerchandiseM20005q.defaultQuantity) : purchaseDialogConfigMerchandiseM20005q.defaultQuantity;
            if (iAbs == 1 || iAbs == 3 || iAbs == 6 || iAbs == 12) {
                return String.valueOf(purchaseDialogConfigMerchandiseM20005q.defaultQuantity);
            }
        }
        if (TEnum.equals(productCategory, "femaleVip")) {
            return g6a.i() ? "1w" : "-1w";
        }
        if (TEnum.equals(productCategory, "youthVip")) {
            return g6a.y() ? "1w" : "-1w";
        }
        return TEnum.equals(productCategory, "limitedTrialSee") ? "-1d" : "3";
    }

    /* JADX INFO: renamed from: n */
    public int m20002n(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM20005q = m20005q(productCategory);
        if (NullChecker.a(purchaseDialogConfigMerchandiseM20005q) && ((i = purchaseDialogConfigMerchandiseM20005q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public int m20003o(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM20005q = m20005q(productCategory);
        if (NullChecker.a(purchaseDialogConfigMerchandiseM20005q) && ((i = purchaseDialogConfigMerchandiseM20005q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public String m20004p(ProductCategory productCategory) {
        String strM20001m = m20001m(productCategory);
        if (TextUtils.isDigitsOnly(strM20001m)) {
            return String.format("%sm", strM20001m);
        }
        return strM20001m.endsWith("w") ? "7d" : strM20001m;
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseDialogConfigMerchandise m20005q(final ProductCategory productCategory) {
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        if (!NullChecker.a(purchaseDialogConfigsI4) || vwb.J(purchaseDialogConfigsI4.merchandises)) {
            return null;
        }
        return (PurchaseDialogConfigMerchandise) vwb.r(purchaseDialogConfigsI4.merchandises, new w9j() { // from class: l.n2b0
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PurchaseDialogConfigMerchandise) obj).category, productCategory));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final PurchaseDialogConfigTrigger m20006r(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        if (!NullChecker.a(purchaseDialogConfigsI4) || vwb.J(purchaseDialogConfigsI4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) vwb.r(purchaseDialogConfigsI4.triggerDialog, new w9j() { // from class: l.m2b0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m20007s(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigW3 = CoreModule.c.c1.w3(((Coupon) merchandise.localCoupons.get(0)).couponID);
        return (NullChecker.a(newCustomerPromotionConfigW3) && NullChecker.a(newCustomerPromotionConfigW3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigW3.purchaseItem.label)) ? newCustomerPromotionConfigW3.purchaseItem.label : "限时优惠";
    }

    /* JADX INFO: renamed from: t */
    public String m20008t(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigW3 = CoreModule.c.c1.w3(((Coupon) merchandise.localCoupons.get(0)).couponID);
        if (NullChecker.a(newCustomerPromotionConfigW3) && NullChecker.a(newCustomerPromotionConfigW3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigW3.purchaseItem.unitText)) {
            return newCustomerPromotionConfigW3.purchaseItem.unitText;
        }
        if (i == 12) {
            return "首年优惠";
        }
        if (i == 3) {
            return "首季优惠";
        }
        if (merchandise.isBelongPromotion("lowPriceCustomerVIP")) {
            return "首月1元";
        }
        return merchandise.isBelongPromotion("lowPrice3Month") ? "每月仅需" : "首月优惠";
    }

    /* JADX INFO: renamed from: u */
    public List<String> m20009u(PurchaseType purchaseType) {
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        ArrayList arrayList = new ArrayList();
        if (!NullChecker.a(purchaseDialogConfigsI4) || vwb.J(purchaseDialogConfigsI4.skuConfigs)) {
            arrayList.addAll(m19992B(purchaseType));
            return arrayList;
        }
        for (int i = 0; i < purchaseDialogConfigsI4.skuConfigs.size(); i++) {
            SkuConfigs skuConfigs = (SkuConfigs) purchaseDialogConfigsI4.skuConfigs.get(i);
            if (TEnum.equals(skuConfigs.category, purchaseType.productCategory())) {
                if (TextUtils.equals(skuConfigs.timeType, "week") && TEnum.equals(skuConfigs.renewType, "auto-renewable")) {
                    arrayList.add("1w");
                } else if (TextUtils.equals(skuConfigs.timeType, "month") && TEnum.equals(skuConfigs.renewType, "auto-renewable")) {
                    arrayList.add(String.valueOf(skuConfigs.times));
                } else if (TextUtils.equals(skuConfigs.timeType, "month") && TEnum.equals(skuConfigs.renewType, "none-renewing")) {
                    arrayList.add(String.valueOf(skuConfigs.times * (-1)));
                }
            }
        }
        if (vwb.J(arrayList)) {
            arrayList.addAll(m19992B(purchaseType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<String> m20010v(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM20005q = m20005q(productCategory);
        if (!NullChecker.a(purchaseDialogConfigMerchandiseM20005q) || vwb.J(purchaseDialogConfigMerchandiseM20005q.order)) {
            if (!m20014z()) {
                return vwb.f0(new String[]{"1", "3", "6", "12"});
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                return g6a.i() ? vwb.f0(new String[]{"1w", "1", "6"}) : vwb.f0(new String[]{"-1w", "-1"});
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                return g6a.y() ? vwb.f0(new String[]{"1w", "1", "6"}) : vwb.f0(new String[]{"-1w", "-1"});
            }
            if (TEnum.equals(productCategory, "privateCustom")) {
                return vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"});
            }
            return TEnum.equals(productCategory, "oDiamondPrivateCustom") ? vwb.f0(new String[]{"1", "3", "-12", "-3", "-1"}) : vwb.f0(new String[]{"1", "3", "6", "12", "-12", "-6", "-3", "-1"});
        }
        List<String> list = purchaseDialogConfigMerchandiseM20005q.order;
        ArrayList arrayList = new ArrayList();
        if (m19991A(productCategory)) {
            return m19998j(list, purchaseDialogConfigMerchandiseM20005q.orderUnit, arrayList);
        }
        if (productCategory == ProductCategory.get("boost") || productCategory == ProductCategory.get("acceleratePairing")) {
            for (String str : list) {
                int i = Integer.parseInt(str);
                if (i == 1 || i == 5 || i == 10) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 3) {
                return vwb.f0(new String[]{"1", "5", "10"});
            }
        } else {
            for (String str2 : list) {
                int i2 = Integer.parseInt(str2);
                if (i2 == 6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (m20014z() && i2 == -6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (i2 == 1 || i2 == 3 || i2 == 12) {
                    arrayList.add(str2);
                } else if (m20014z() && (i2 == -1 || i2 == -3 || i2 == -12)) {
                    arrayList.add(str2);
                }
            }
            if (m20014z() && list.size() < 8 && TEnum.equals(productCategory, "svip")) {
                for (String str3 : vwb.f0(new String[]{"1", "3", "6", "12", "-12", "-6", "-3", "-1"})) {
                    if (!arrayList.contains(str3)) {
                        arrayList.add(str3);
                    }
                }
            } else if (m20014z() && list.size() < 6) {
                for (String str4 : vwb.f0(new String[]{"1", "3", "12", "-12", "-3", "-1"})) {
                    if (!arrayList.contains(str4)) {
                        arrayList.add(str4);
                    }
                }
            } else if (list.size() < 4 && TEnum.equals(productCategory, "svip")) {
                for (String str5 : vwb.f0(new String[]{"1", "3", "6", "12"})) {
                    if (!arrayList.contains(str5)) {
                        arrayList.add(str5);
                    }
                }
            } else if (list.size() < 4) {
                for (String str6 : vwb.f0(new String[]{"1", "3", "12"})) {
                    if (!arrayList.contains(str6)) {
                        arrayList.add(str6);
                    }
                }
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                if (g6a.i()) {
                    if (!arrayList.contains("1w")) {
                        arrayList.add(0, "1w");
                    }
                } else if (!arrayList.contains("-1w")) {
                    arrayList.add(0, "-1w");
                }
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                if (g6a.y()) {
                    if (!arrayList.contains("1w")) {
                        arrayList.add(0, "1w");
                        return arrayList;
                    }
                } else if (!arrayList.contains("-1w")) {
                    arrayList.add(0, "-1w");
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public SkuConfigs m20011w(final Merchandise merchandise) {
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        if (!NullChecker.a(purchaseDialogConfigsI4) || vwb.J(purchaseDialogConfigsI4.skuConfigs)) {
            return null;
        }
        return (SkuConfigs) vwb.r(purchaseDialogConfigsI4.skuConfigs, new w9j() { // from class: l.o2b0
            public final Object call(Object obj) {
                Merchandise merchandise2 = merchandise;
                SkuConfigs skuConfigs = (SkuConfigs) obj;
                return Boolean.valueOf(TEnum.equals(skuConfigs.category, merchandise2.category) && skuConfigs.times == merchandise2.quantity && ((merchandise2.monthType() && TextUtils.equals(skuConfigs.timeType, "month")) || (merchandise2.weekly() && TextUtils.equals(skuConfigs.timeType, "week"))) && TEnum.equals(skuConfigs.renewType, merchandise2.productType));
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public List<PayMethod> m20012x(@NonNull Merchandise merchandise) {
        SkuConfigs skuConfigsM20011w = m20011w(merchandise);
        if (!NullChecker.a(skuConfigsM20011w) || vwb.J(skuConfigsM20011w.supportsChannels)) {
            return m19995f(merchandise);
        }
        ArrayList arrayList = new ArrayList(skuConfigsM20011w.supportsChannels);
        Iterator it = arrayList.iterator();
        while (merchandise.autoRenewable() && it.hasNext()) {
            if (TEnum.equals((PayMethod) it.next(), "jingdong")) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final String m20013y(int i, List<String> list) {
        if (vwb.J(list) || i < 0 || i >= list.size()) {
            return "";
        }
        String str = list.get(i);
        return TextUtils.equals(str, "w") ? str : "";
    }

    /* JADX INFO: renamed from: z */
    public boolean m20014z() {
        if (!this.f16988a) {
            this.f16988a = true;
            PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
            if (NullChecker.a(purchaseDialogConfigsI4) && NullChecker.a(purchaseDialogConfigsI4.isShowCheckPopup)) {
                this.f16989b = purchaseDialogConfigsI4.isShowCheckPopup.booleanValue();
            } else {
                this.f16989b = CoreModule.c.j0.L4();
            }
        }
        return this.f16989b;
    }
}
