package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SkuConfigs;
import com.p046p1.mobile.putong.core.data.TriggerDialogFromListBean;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class p2b0 {

    /* JADX INFO: renamed from: c */
    public static p2b0 f146828c;

    /* JADX INFO: renamed from: a */
    public boolean f146829a = false;

    /* JADX INFO: renamed from: b */
    public boolean f146830b = true;

    /* JADX INFO: renamed from: h */
    public static p2b0 m167133h() {
        if (f146828c == null) {
            synchronized (p2b0.class) {
                try {
                    if (f146828c == null) {
                        f146828c = new p2b0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146828c;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m167134A(ProductCategory productCategory) {
        return TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay) || TEnum.equals(productCategory, ProductCategory.tttUltraPremium);
    }

    /* JADX INFO: renamed from: B */
    public List<String> m167135B(PurchaseType purchaseType) {
        if (m167157z()) {
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.tttVip)) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return vwb.m200324f0("1", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return vwb.m200324f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return vwb.m200324f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "femaleVip")) {
                return g6a.m124560i() ? vwb.m200324f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : vwb.m200324f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "youthVip")) {
                return g6a.m124576y() ? vwb.m200324f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : vwb.m200324f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.oDiamondPrivateCustom)) {
                return vwb.m200324f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
        } else {
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.tttVip)) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return vwb.m200324f0("1", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom") || TEnum.equals(purchaseType.productCategory(), ProductCategory.oDiamondPrivateCustom)) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m167136d(ProductCategory productCategory) {
        return NullChecker.m81303a(m167148q(productCategory));
    }

    /* JADX INFO: renamed from: e */
    public void m167137e() {
        this.f146829a = false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<PayMethod> m167138f(@NonNull Merchandise merchandise) {
        if (!merchandise.autoRenewable()) {
            if (merchandise.noneRenewable()) {
                return (merchandise.yearly() && TEnum.equals(merchandise.category, ProductCategory.oDiamondPrivateCustom)) ? vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat")) : vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
            }
            return vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PayMethod.get("alipay"));
        if ((!TEnum.equals(merchandise.category, "svip") || (!merchandise.weekly() && !merchandise.semiAnnual() && !merchandise.yearly())) && ((!TEnum.equals(merchandise.category, ProductCategory.tttVip) || !merchandise.weekly()) && !TEnum.equals(merchandise.category, "oDiamond") && !TEnum.equals(merchandise.category, "platinum") && !TEnum.equals(merchandise.category, "svipPicksMembership") && !TEnum.equals(merchandise.category, "picksMembership") && !TEnum.equals(merchandise.category, "privateCustom") && !TEnum.equals(merchandise.category, ProductCategory.oDiamondPrivateCustom) && !TEnum.equals(merchandise.category, "femaleVip"))) {
            arrayList.add(PayMethod.get("wechat"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public ProductCategory m167139g(String str) {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM167149r = m167149r(str);
        if (!NullChecker.m81303a(purchaseDialogConfigTriggerM167149r) || TEnum.equals(purchaseDialogConfigTriggerM167149r.defaultCategory, "unknown_")) {
            return TextUtils.equals("vip", str) ? ProductCategory.get(ProductCategory.tttVip) : ProductCategory.get("svip");
        }
        return purchaseDialogConfigTriggerM167149r.defaultCategory;
    }

    /* JADX INFO: renamed from: i */
    public PurchaseDialogConfigTriggerShowType m167140i(String str, String str2) {
        TriggerDialogFromListBean triggerDialogFromListBean;
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM167149r = m167149r(str);
        if (!NullChecker.m81303a(purchaseDialogConfigTriggerM167149r) || TEnum.equals(purchaseDialogConfigTriggerM167149r.defaultCategory, "unknown_")) {
            return PurchaseDialogConfigTriggerShowType.get("vip");
        }
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        if (NullChecker.m81303a(purchaseDialogConfigsM30588I4) && !TextUtils.isEmpty(str2) && (triggerDialogFromListBean = purchaseDialogConfigsM30588I4.triggerDialogFromList) != null) {
            if (triggerDialogFromListBean.svipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("svip");
            }
            if (purchaseDialogConfigsM30588I4.triggerDialogFromList.vipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("vip");
            }
            if (purchaseDialogConfigsM30588I4.triggerDialogFromList.vipSVipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get(PurchaseDialogConfigTriggerShowType.vip_svip);
            }
        }
        return purchaseDialogConfigTriggerM167149r.showType;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m167141j(List<String> list, List<String> list2, List<String> list3) {
        for (int i = 0; i < list.size(); i++) {
            list3.add(list.get(i) + m167156y(i, list2));
        }
        return list3;
    }

    /* JADX INFO: renamed from: k */
    public String m167142k(Merchandise merchandise) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM137869w3 = CoreModule.f17545c.f19634c1.m137869w3(merchandise.localCoupons.get(0).couponID);
        return (!NullChecker.m81303a(newCustomerPromotionConfigM137869w3) || TextUtils.isEmpty(newCustomerPromotionConfigM137869w3.purchaseButtonText)) ? "限时优惠" : newCustomerPromotionConfigM137869w3.purchaseButtonText;
    }

    /* JADX INFO: renamed from: l */
    public String m167143l(Merchandise merchandise, int i) {
        if (vwb.m200296J(merchandise.localCoupons)) {
            return "限时优惠";
        }
        NewCustomerPromotionConfig newCustomerPromotionConfigM137869w3 = CoreModule.f17545c.f19634c1.m137869w3(merchandise.localCoupons.get(0).couponID);
        if (NullChecker.m81303a(newCustomerPromotionConfigM137869w3) && !TextUtils.isEmpty(newCustomerPromotionConfigM137869w3.privilegeBannerText)) {
            return newCustomerPromotionConfigM137869w3.privilegeBannerText;
        }
        if (i == 12) {
            return "限时优惠，首年低价";
        }
        if (i == 3) {
            return "限时优惠，首季低价";
        }
        if (merchandise.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
            return "双11大促，订阅6个月会员立送3个月";
        }
        if (merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            return "限时优惠，首月低价1元";
        }
        return merchandise.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month) ? "限时优惠，前3月¥1/月" : "限时优惠，首月低价";
    }

    /* JADX INFO: renamed from: m */
    public String m167144m(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM167148q = m167148q(productCategory);
        if (NullChecker.m81303a(purchaseDialogConfigMerchandiseM167148q)) {
            if (m167134A(productCategory)) {
                StringBuilder sb = new StringBuilder();
                sb.append(purchaseDialogConfigMerchandiseM167148q.defaultQuantity);
                sb.append(TextUtils.equals(purchaseDialogConfigMerchandiseM167148q.defaultUnit, "w") ? "w" : "");
                return sb.toString();
            }
            int iAbs = m167157z() ? Math.abs(purchaseDialogConfigMerchandiseM167148q.defaultQuantity) : purchaseDialogConfigMerchandiseM167148q.defaultQuantity;
            if (iAbs == 1 || iAbs == 3 || iAbs == 6 || iAbs == 12) {
                return String.valueOf(purchaseDialogConfigMerchandiseM167148q.defaultQuantity);
            }
        }
        if (TEnum.equals(productCategory, "femaleVip")) {
            return g6a.m124560i() ? "1w" : "-1w";
        }
        if (TEnum.equals(productCategory, "youthVip")) {
            return g6a.m124576y() ? "1w" : "-1w";
        }
        return TEnum.equals(productCategory, "limitedTrialSee") ? "-1d" : "3";
    }

    /* JADX INFO: renamed from: n */
    public int m167145n(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM167148q = m167148q(productCategory);
        if (NullChecker.m81303a(purchaseDialogConfigMerchandiseM167148q) && ((i = purchaseDialogConfigMerchandiseM167148q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public int m167146o(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM167148q = m167148q(productCategory);
        if (NullChecker.m81303a(purchaseDialogConfigMerchandiseM167148q) && ((i = purchaseDialogConfigMerchandiseM167148q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public String m167147p(ProductCategory productCategory) {
        String strM167144m = m167144m(productCategory);
        if (TextUtils.isDigitsOnly(strM167144m)) {
            return String.format("%sm", strM167144m);
        }
        return strM167144m.endsWith("w") ? "7d" : strM167144m;
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseDialogConfigMerchandise m167148q(final ProductCategory productCategory) {
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        if (!NullChecker.m81303a(purchaseDialogConfigsM30588I4) || vwb.m200296J(purchaseDialogConfigsM30588I4.merchandises)) {
            return null;
        }
        return (PurchaseDialogConfigMerchandise) vwb.m200346r(purchaseDialogConfigsM30588I4.merchandises, new w9j() { // from class: l.n2b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PurchaseDialogConfigMerchandise) obj).category, productCategory));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final PurchaseDialogConfigTrigger m167149r(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        if (!NullChecker.m81303a(purchaseDialogConfigsM30588I4) || vwb.m200296J(purchaseDialogConfigsM30588I4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) vwb.m200346r(purchaseDialogConfigsM30588I4.triggerDialog, new w9j() { // from class: l.m2b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m167150s(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM137869w3 = CoreModule.f17545c.f19634c1.m137869w3(merchandise.localCoupons.get(0).couponID);
        return (NullChecker.m81303a(newCustomerPromotionConfigM137869w3) && NullChecker.m81303a(newCustomerPromotionConfigM137869w3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigM137869w3.purchaseItem.label)) ? newCustomerPromotionConfigM137869w3.purchaseItem.label : "限时优惠";
    }

    /* JADX INFO: renamed from: t */
    public String m167151t(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM137869w3 = CoreModule.f17545c.f19634c1.m137869w3(merchandise.localCoupons.get(0).couponID);
        if (NullChecker.m81303a(newCustomerPromotionConfigM137869w3) && NullChecker.m81303a(newCustomerPromotionConfigM137869w3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigM137869w3.purchaseItem.unitText)) {
            return newCustomerPromotionConfigM137869w3.purchaseItem.unitText;
        }
        if (i == 12) {
            return "首年优惠";
        }
        if (i == 3) {
            return "首季优惠";
        }
        if (merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            return "首月1元";
        }
        return merchandise.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month) ? "每月仅需" : "首月优惠";
    }

    /* JADX INFO: renamed from: u */
    public List<String> m167152u(PurchaseType purchaseType) {
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        ArrayList arrayList = new ArrayList();
        if (!NullChecker.m81303a(purchaseDialogConfigsM30588I4) || vwb.m200296J(purchaseDialogConfigsM30588I4.skuConfigs)) {
            arrayList.addAll(m167135B(purchaseType));
            return arrayList;
        }
        for (int i = 0; i < purchaseDialogConfigsM30588I4.skuConfigs.size(); i++) {
            SkuConfigs skuConfigs = purchaseDialogConfigsM30588I4.skuConfigs.get(i);
            if (TEnum.equals(skuConfigs.category, purchaseType.productCategory())) {
                if (TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.week) && TEnum.equals(skuConfigs.renewType, "auto-renewable")) {
                    arrayList.add("1w");
                } else if (TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.month) && TEnum.equals(skuConfigs.renewType, "auto-renewable")) {
                    arrayList.add(String.valueOf(skuConfigs.times));
                } else if (TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.month) && TEnum.equals(skuConfigs.renewType, "none-renewing")) {
                    arrayList.add(String.valueOf(skuConfigs.times * (-1)));
                }
            }
        }
        if (vwb.m200296J(arrayList)) {
            arrayList.addAll(m167135B(purchaseType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<String> m167153v(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM167148q = m167148q(productCategory);
        if (!NullChecker.m81303a(purchaseDialogConfigMerchandiseM167148q) || vwb.m200296J(purchaseDialogConfigMerchandiseM167148q.order)) {
            if (!m167157z()) {
                return vwb.m200324f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                return g6a.m124560i() ? vwb.m200324f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : vwb.m200324f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                return g6a.m124576y() ? vwb.m200324f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : vwb.m200324f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(productCategory, "privateCustom")) {
                return vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            return TEnum.equals(productCategory, ProductCategory.oDiamondPrivateCustom) ? vwb.m200324f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT) : vwb.m200324f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", "-3", User.ID_TEAM_ACCOUNT);
        }
        List<String> list = purchaseDialogConfigMerchandiseM167148q.order;
        ArrayList arrayList = new ArrayList();
        if (m167134A(productCategory)) {
            return m167141j(list, purchaseDialogConfigMerchandiseM167148q.orderUnit, arrayList);
        }
        if (productCategory == ProductCategory.get("boost") || productCategory == ProductCategory.get("acceleratePairing")) {
            for (String str : list) {
                int i = Integer.parseInt(str);
                if (i == 1 || i == 5 || i == 10) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 3) {
                return vwb.m200324f0("1", "5", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            }
        } else {
            for (String str2 : list) {
                int i2 = Integer.parseInt(str2);
                if (i2 == 6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (m167157z() && i2 == -6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (i2 == 1 || i2 == 3 || i2 == 12) {
                    arrayList.add(str2);
                } else if (m167157z() && (i2 == -1 || i2 == -3 || i2 == -12)) {
                    arrayList.add(str2);
                }
            }
            if (m167157z() && list.size() < 8 && TEnum.equals(productCategory, "svip")) {
                for (String str3 : vwb.m200324f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", "-3", User.ID_TEAM_ACCOUNT)) {
                    if (!arrayList.contains(str3)) {
                        arrayList.add(str3);
                    }
                }
            } else if (m167157z() && list.size() < 6) {
                for (String str4 : vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT)) {
                    if (!arrayList.contains(str4)) {
                        arrayList.add(str4);
                    }
                }
            } else if (list.size() < 4 && TEnum.equals(productCategory, "svip")) {
                for (String str5 : vwb.m200324f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR)) {
                    if (!arrayList.contains(str5)) {
                        arrayList.add(str5);
                    }
                }
            } else if (list.size() < 4) {
                for (String str6 : vwb.m200324f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR)) {
                    if (!arrayList.contains(str6)) {
                        arrayList.add(str6);
                    }
                }
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                if (g6a.m124560i()) {
                    if (!arrayList.contains("1w")) {
                        arrayList.add(0, "1w");
                    }
                } else if (!arrayList.contains("-1w")) {
                    arrayList.add(0, "-1w");
                }
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                if (g6a.m124576y()) {
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
    public SkuConfigs m167154w(final Merchandise merchandise) {
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        if (!NullChecker.m81303a(purchaseDialogConfigsM30588I4) || vwb.m200296J(purchaseDialogConfigsM30588I4.skuConfigs)) {
            return null;
        }
        return (SkuConfigs) vwb.m200346r(purchaseDialogConfigsM30588I4.skuConfigs, new w9j() { // from class: l.o2b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = merchandise;
                SkuConfigs skuConfigs = (SkuConfigs) obj;
                return Boolean.valueOf(TEnum.equals(skuConfigs.category, merchandise2.category) && skuConfigs.times == merchandise2.quantity && ((merchandise2.monthType() && TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.month)) || (merchandise2.weekly() && TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.week))) && TEnum.equals(skuConfigs.renewType, merchandise2.productType));
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public List<PayMethod> m167155x(@NonNull Merchandise merchandise) {
        SkuConfigs skuConfigsM167154w = m167154w(merchandise);
        if (!NullChecker.m81303a(skuConfigsM167154w) || vwb.m200296J(skuConfigsM167154w.supportsChannels)) {
            return m167138f(merchandise);
        }
        ArrayList arrayList = new ArrayList(skuConfigsM167154w.supportsChannels);
        Iterator it = arrayList.iterator();
        while (merchandise.autoRenewable() && it.hasNext()) {
            if (TEnum.equals((PayMethod) it.next(), PayMethod.jingdong)) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final String m167156y(int i, List<String> list) {
        if (vwb.m200296J(list) || i < 0 || i >= list.size()) {
            return "";
        }
        String str = list.get(i);
        return TextUtils.equals(str, "w") ? str : "";
    }

    /* JADX INFO: renamed from: z */
    public boolean m167157z() {
        if (!this.f146829a) {
            this.f146829a = true;
            PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
            if (NullChecker.m81303a(purchaseDialogConfigsM30588I4) && NullChecker.m81303a(purchaseDialogConfigsM30588I4.isShowCheckPopup)) {
                this.f146830b = purchaseDialogConfigsM30588I4.isShowCheckPopup.booleanValue();
            } else {
                this.f146830b = CoreModule.f17545c.f19654j0.m30594L4();
            }
        }
        return this.f146830b;
    }
}
