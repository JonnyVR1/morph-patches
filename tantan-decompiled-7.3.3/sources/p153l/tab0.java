package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SkuConfigs;
import com.p051p1.mobile.putong.core.data.TriggerDialogFromListBean;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tab0 {

    /* JADX INFO: renamed from: c */
    public static tab0 f172709c;

    /* JADX INFO: renamed from: a */
    public boolean f172710a = false;

    /* JADX INFO: renamed from: b */
    public boolean f172711b = true;

    /* JADX INFO: renamed from: h */
    public static tab0 m189811h() {
        if (f172709c == null) {
            synchronized (tab0.class) {
                try {
                    if (f172709c == null) {
                        f172709c = new tab0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172709c;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m189812A(ProductCategory productCategory) {
        return TEnum.equals(productCategory, ProductCategory.tttSvipGoogleplay) || TEnum.equals(productCategory, ProductCategory.tttUltraPremium);
    }

    /* JADX INFO: renamed from: B */
    public List<String> m189813B(PurchaseType purchaseType) {
        if (m189835z()) {
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.tttVip)) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return jyb.m147507f0("1", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return jyb.m147507f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return jyb.m147507f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "femaleVip")) {
                return s7a.m184980i() ? jyb.m147507f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : jyb.m147507f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "youthVip")) {
                return s7a.m184996y() ? jyb.m147507f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : jyb.m147507f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.oDiamondPrivateCustom)) {
                return jyb.m147507f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
        } else {
            if (TEnum.equals(purchaseType.productCategory(), ProductCategory.tttVip)) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svip")) {
                return jyb.m147507f0("1", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "oDiamond")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "platinum")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "svipPicksMembership")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "picksMembership")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(purchaseType.productCategory(), "privateCustom") || TEnum.equals(purchaseType.productCategory(), ProductCategory.oDiamondPrivateCustom)) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public boolean m189814d(ProductCategory productCategory) {
        return NullChecker.m82486a(m189826q(productCategory));
    }

    /* JADX INFO: renamed from: e */
    public void m189815e() {
        this.f172710a = false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<PayMethod> m189816f(@NonNull Merchandise merchandise) {
        if (!merchandise.autoRenewable()) {
            if (merchandise.noneRenewable()) {
                return (merchandise.yearly() && TEnum.equals(merchandise.category, ProductCategory.oDiamondPrivateCustom)) ? jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat")) : jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
            }
            return jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PayMethod.get("alipay"));
        if ((!TEnum.equals(merchandise.category, "svip") || (!merchandise.weekly() && !merchandise.semiAnnual() && !merchandise.yearly())) && ((!TEnum.equals(merchandise.category, ProductCategory.tttVip) || !merchandise.weekly()) && !TEnum.equals(merchandise.category, "oDiamond") && !TEnum.equals(merchandise.category, "platinum") && !TEnum.equals(merchandise.category, "svipPicksMembership") && !TEnum.equals(merchandise.category, "picksMembership") && !TEnum.equals(merchandise.category, "privateCustom") && !TEnum.equals(merchandise.category, ProductCategory.oDiamondPrivateCustom) && !TEnum.equals(merchandise.category, "femaleVip"))) {
            arrayList.add(PayMethod.get("wechat"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public ProductCategory m189817g(String str) {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM189827r = m189827r(str);
        if (!NullChecker.m82486a(purchaseDialogConfigTriggerM189827r) || TEnum.equals(purchaseDialogConfigTriggerM189827r.defaultCategory, "unknown_")) {
            return TextUtils.equals("vip", str) ? ProductCategory.get(ProductCategory.tttVip) : ProductCategory.get("svip");
        }
        return purchaseDialogConfigTriggerM189827r.defaultCategory;
    }

    /* JADX INFO: renamed from: i */
    public PurchaseDialogConfigTriggerShowType m189818i(String str, String str2) {
        TriggerDialogFromListBean triggerDialogFromListBean;
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM189827r = m189827r(str);
        if (!NullChecker.m82486a(purchaseDialogConfigTriggerM189827r) || TEnum.equals(purchaseDialogConfigTriggerM189827r.defaultCategory, "unknown_")) {
            return PurchaseDialogConfigTriggerShowType.get("vip");
        }
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        if (NullChecker.m82486a(purchaseDialogConfigsM31591I4) && !TextUtils.isEmpty(str2) && (triggerDialogFromListBean = purchaseDialogConfigsM31591I4.triggerDialogFromList) != null) {
            if (triggerDialogFromListBean.svipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("svip");
            }
            if (purchaseDialogConfigsM31591I4.triggerDialogFromList.vipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get("vip");
            }
            if (purchaseDialogConfigsM31591I4.triggerDialogFromList.vipSVipShowTypeFromList.contains(str2)) {
                return PurchaseDialogConfigTriggerShowType.get(PurchaseDialogConfigTriggerShowType.vip_svip);
            }
        }
        return purchaseDialogConfigTriggerM189827r.showType;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m189819j(List<String> list, List<String> list2, List<String> list3) {
        for (int i = 0; i < list.size(); i++) {
            list3.add(list.get(i) + m189834y(i, list2));
        }
        return list3;
    }

    /* JADX INFO: renamed from: k */
    public String m189820k(Merchandise merchandise) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM197856w3 = CoreModule.f18264c.f20376c1.m197856w3(merchandise.localCoupons.get(0).couponID);
        return (!NullChecker.m82486a(newCustomerPromotionConfigM197856w3) || TextUtils.isEmpty(newCustomerPromotionConfigM197856w3.purchaseButtonText)) ? "限时优惠" : newCustomerPromotionConfigM197856w3.purchaseButtonText;
    }

    /* JADX INFO: renamed from: l */
    public String m189821l(Merchandise merchandise, int i) {
        if (jyb.m147479J(merchandise.localCoupons)) {
            return "限时优惠";
        }
        NewCustomerPromotionConfig newCustomerPromotionConfigM197856w3 = CoreModule.f18264c.f20376c1.m197856w3(merchandise.localCoupons.get(0).couponID);
        if (NullChecker.m82486a(newCustomerPromotionConfigM197856w3) && !TextUtils.isEmpty(newCustomerPromotionConfigM197856w3.privilegeBannerText)) {
            return newCustomerPromotionConfigM197856w3.privilegeBannerText;
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
    public String m189822m(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM189826q = m189826q(productCategory);
        if (NullChecker.m82486a(purchaseDialogConfigMerchandiseM189826q)) {
            if (m189812A(productCategory)) {
                StringBuilder sb = new StringBuilder();
                sb.append(purchaseDialogConfigMerchandiseM189826q.defaultQuantity);
                sb.append(TextUtils.equals(purchaseDialogConfigMerchandiseM189826q.defaultUnit, "w") ? "w" : "");
                return sb.toString();
            }
            int iAbs = m189835z() ? Math.abs(purchaseDialogConfigMerchandiseM189826q.defaultQuantity) : purchaseDialogConfigMerchandiseM189826q.defaultQuantity;
            if (iAbs == 1 || iAbs == 3 || iAbs == 6 || iAbs == 12) {
                return String.valueOf(purchaseDialogConfigMerchandiseM189826q.defaultQuantity);
            }
        }
        if (TEnum.equals(productCategory, "femaleVip")) {
            return s7a.m184980i() ? "1w" : "-1w";
        }
        if (TEnum.equals(productCategory, "youthVip")) {
            return s7a.m184996y() ? "1w" : "-1w";
        }
        return TEnum.equals(productCategory, "limitedTrialSee") ? "-1d" : "3";
    }

    /* JADX INFO: renamed from: n */
    public int m189823n(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM189826q = m189826q(productCategory);
        if (NullChecker.m82486a(purchaseDialogConfigMerchandiseM189826q) && ((i = purchaseDialogConfigMerchandiseM189826q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public int m189824o(ProductCategory productCategory) {
        int i;
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM189826q = m189826q(productCategory);
        if (NullChecker.m82486a(purchaseDialogConfigMerchandiseM189826q) && ((i = purchaseDialogConfigMerchandiseM189826q.defaultQuantity) == 1 || i == 5 || i == 10)) {
            return i;
        }
        return 5;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public String m189825p(ProductCategory productCategory) {
        String strM189822m = m189822m(productCategory);
        if (TextUtils.isDigitsOnly(strM189822m)) {
            return String.format("%sm", strM189822m);
        }
        return strM189822m.endsWith("w") ? "7d" : strM189822m;
    }

    /* JADX INFO: renamed from: q */
    public final PurchaseDialogConfigMerchandise m189826q(final ProductCategory productCategory) {
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        if (!NullChecker.m82486a(purchaseDialogConfigsM31591I4) || jyb.m147479J(purchaseDialogConfigsM31591I4.merchandises)) {
            return null;
        }
        return (PurchaseDialogConfigMerchandise) jyb.m147529r(purchaseDialogConfigsM31591I4.merchandises, new qcj() { // from class: l.rab0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((PurchaseDialogConfigMerchandise) obj).category, productCategory));
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final PurchaseDialogConfigTrigger m189827r(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        if (!NullChecker.m82486a(purchaseDialogConfigsM31591I4) || jyb.m147479J(purchaseDialogConfigsM31591I4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) jyb.m147529r(purchaseDialogConfigsM31591I4.triggerDialog, new qcj() { // from class: l.qab0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m189828s(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM197856w3 = CoreModule.f18264c.f20376c1.m197856w3(merchandise.localCoupons.get(0).couponID);
        return (NullChecker.m82486a(newCustomerPromotionConfigM197856w3) && NullChecker.m82486a(newCustomerPromotionConfigM197856w3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigM197856w3.purchaseItem.label)) ? newCustomerPromotionConfigM197856w3.purchaseItem.label : "限时优惠";
    }

    /* JADX INFO: renamed from: t */
    public String m189829t(Merchandise merchandise, int i) {
        NewCustomerPromotionConfig newCustomerPromotionConfigM197856w3 = CoreModule.f18264c.f20376c1.m197856w3(merchandise.localCoupons.get(0).couponID);
        if (NullChecker.m82486a(newCustomerPromotionConfigM197856w3) && NullChecker.m82486a(newCustomerPromotionConfigM197856w3.purchaseItem) && !TextUtils.isEmpty(newCustomerPromotionConfigM197856w3.purchaseItem.unitText)) {
            return newCustomerPromotionConfigM197856w3.purchaseItem.unitText;
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
    public List<String> m189830u(PurchaseType purchaseType) {
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        ArrayList arrayList = new ArrayList();
        if (!NullChecker.m82486a(purchaseDialogConfigsM31591I4) || jyb.m147479J(purchaseDialogConfigsM31591I4.skuConfigs)) {
            arrayList.addAll(m189813B(purchaseType));
            return arrayList;
        }
        for (int i = 0; i < purchaseDialogConfigsM31591I4.skuConfigs.size(); i++) {
            SkuConfigs skuConfigs = purchaseDialogConfigsM31591I4.skuConfigs.get(i);
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
        if (jyb.m147479J(arrayList)) {
            arrayList.addAll(m189813B(purchaseType));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public List<String> m189831v(ProductCategory productCategory) {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandiseM189826q = m189826q(productCategory);
        if (!NullChecker.m82486a(purchaseDialogConfigMerchandiseM189826q) || jyb.m147479J(purchaseDialogConfigMerchandiseM189826q.order)) {
            if (!m189835z()) {
                return jyb.m147507f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR);
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                return s7a.m184980i() ? jyb.m147507f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : jyb.m147507f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                return s7a.m184996y() ? jyb.m147507f0("1w", "1", Constants.VIA_SHARE_TYPE_INFO) : jyb.m147507f0("-1w", User.ID_TEAM_ACCOUNT);
            }
            if (TEnum.equals(productCategory, "privateCustom")) {
                return jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT);
            }
            return TEnum.equals(productCategory, ProductCategory.oDiamondPrivateCustom) ? jyb.m147507f0("1", "3", "-12", "-3", User.ID_TEAM_ACCOUNT) : jyb.m147507f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", "-3", User.ID_TEAM_ACCOUNT);
        }
        List<String> list = purchaseDialogConfigMerchandiseM189826q.order;
        ArrayList arrayList = new ArrayList();
        if (m189812A(productCategory)) {
            return m189819j(list, purchaseDialogConfigMerchandiseM189826q.orderUnit, arrayList);
        }
        if (productCategory == ProductCategory.get("boost") || productCategory == ProductCategory.get("acceleratePairing")) {
            for (String str : list) {
                int i = Integer.parseInt(str);
                if (i == 1 || i == 5 || i == 10) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 3) {
                return jyb.m147507f0("1", "5", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            }
        } else {
            for (String str2 : list) {
                int i2 = Integer.parseInt(str2);
                if (i2 == 6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (m189835z() && i2 == -6 && TEnum.equals(productCategory, "svip")) {
                    arrayList.add(str2);
                } else if (i2 == 1 || i2 == 3 || i2 == 12) {
                    arrayList.add(str2);
                } else if (m189835z() && (i2 == -1 || i2 == -3 || i2 == -12)) {
                    arrayList.add(str2);
                }
            }
            if (m189835z() && list.size() < 8 && TEnum.equals(productCategory, "svip")) {
                for (String str3 : jyb.m147507f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-6", "-3", User.ID_TEAM_ACCOUNT)) {
                    if (!arrayList.contains(str3)) {
                        arrayList.add(str3);
                    }
                }
            } else if (m189835z() && list.size() < 6) {
                for (String str4 : jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR, "-12", "-3", User.ID_TEAM_ACCOUNT)) {
                    if (!arrayList.contains(str4)) {
                        arrayList.add(str4);
                    }
                }
            } else if (list.size() < 4 && TEnum.equals(productCategory, "svip")) {
                for (String str5 : jyb.m147507f0("1", "3", Constants.VIA_SHARE_TYPE_INFO, Constants.VIA_REPORT_TYPE_SET_AVATAR)) {
                    if (!arrayList.contains(str5)) {
                        arrayList.add(str5);
                    }
                }
            } else if (list.size() < 4) {
                for (String str6 : jyb.m147507f0("1", "3", Constants.VIA_REPORT_TYPE_SET_AVATAR)) {
                    if (!arrayList.contains(str6)) {
                        arrayList.add(str6);
                    }
                }
            }
            if (TEnum.equals(productCategory, "femaleVip")) {
                if (s7a.m184980i()) {
                    if (!arrayList.contains("1w")) {
                        arrayList.add(0, "1w");
                    }
                } else if (!arrayList.contains("-1w")) {
                    arrayList.add(0, "-1w");
                }
            }
            if (TEnum.equals(productCategory, "youthVip")) {
                if (s7a.m184996y()) {
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
    public SkuConfigs m189832w(final Merchandise merchandise) {
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        if (!NullChecker.m82486a(purchaseDialogConfigsM31591I4) || jyb.m147479J(purchaseDialogConfigsM31591I4.skuConfigs)) {
            return null;
        }
        return (SkuConfigs) jyb.m147529r(purchaseDialogConfigsM31591I4.skuConfigs, new qcj() { // from class: l.sab0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = merchandise;
                SkuConfigs skuConfigs = (SkuConfigs) obj;
                return Boolean.valueOf(TEnum.equals(skuConfigs.category, merchandise2.category) && skuConfigs.times == merchandise2.quantity && ((merchandise2.monthType() && TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.month)) || (merchandise2.weekly() && TextUtils.equals(skuConfigs.timeType, MerchandiseTimeUnit.week))) && TEnum.equals(skuConfigs.renewType, merchandise2.productType));
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public List<PayMethod> m189833x(@NonNull Merchandise merchandise) {
        SkuConfigs skuConfigsM189832w = m189832w(merchandise);
        if (!NullChecker.m82486a(skuConfigsM189832w) || jyb.m147479J(skuConfigsM189832w.supportsChannels)) {
            return m189816f(merchandise);
        }
        ArrayList arrayList = new ArrayList(skuConfigsM189832w.supportsChannels);
        Iterator it = arrayList.iterator();
        while (merchandise.autoRenewable() && it.hasNext()) {
            if (TEnum.equals((PayMethod) it.next(), PayMethod.jingdong)) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final String m189834y(int i, List<String> list) {
        if (jyb.m147479J(list) || i < 0 || i >= list.size()) {
            return "";
        }
        String str = list.get(i);
        return TextUtils.equals(str, "w") ? str : "";
    }

    /* JADX INFO: renamed from: z */
    public boolean m189835z() {
        if (!this.f172710a) {
            this.f172710a = true;
            PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
            if (NullChecker.m82486a(purchaseDialogConfigsM31591I4) && NullChecker.m82486a(purchaseDialogConfigsM31591I4.isShowCheckPopup)) {
                this.f172711b = purchaseDialogConfigsM31591I4.isShowCheckPopup.booleanValue();
            } else {
                this.f172711b = CoreModule.f18264c.f20396j0.m31597L4();
            }
        }
        return this.f172711b;
    }
}
