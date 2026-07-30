package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class zb90 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static Privilege m217825b(String str) {
        Privilege privilege = Privilege.online_match_tickets;
        if (TextUtils.equals(privilege.getFunctionType(), str)) {
            return privilege;
        }
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (TextUtils.equals(privilege2.getFunctionType(), str)) {
            return privilege2;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m217826c(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        if (TEnum.equals(summarizedPrivilegesId, "platinum")) {
            UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(summarizedPrivilegesId);
            vipExpireTime = NullChecker.m81303a(userPrivilegeM210113w4) ? userPrivilegeM210113w4.content.expiredTime : 0L;
        } else {
            vipExpireTime = CoreModule.f17545c.f19639e0.m169527p9().getVipExpireTime();
        }
        return String.format(Locale.getDefault(), "%s 到期", mqi0.f135252d.format(new Date(vipExpireTime)));
    }

    /* JADX INFO: renamed from: d */
    public static String m217827d(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.f17544b.getString(R$string.f27580r0, String.format(Locale.getDefault(), "%d%s", Long.valueOf(src0.m185656r().m185685x(summarizedPrivilegesId)), CoreModule.f17544b.getString(R$string.f27213L1)));
    }

    /* JADX INFO: renamed from: e */
    public static String m217828e(ProductCategory productCategory) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(productCategory), new w9j() { // from class: l.yb90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (!NullChecker.m81303a(merchandise)) {
            return "";
        }
        double firstCouponPrice = rxa0.m181493n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format("￥%s/月", numberInstance.format(firstCouponPrice));
    }

    /* JADX INFO: renamed from: f */
    public static String m217829f() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        long vipToExpireTimeInMill = userM169527p9.getVipToExpireTimeInMill();
        if (userM169527p9.isVIP()) {
            return m217827d(SummarizedPrivilegesId.get("vip"));
        }
        return !userM169527p9.isVIPUsed() ? "" : CoreModule.f17544b.getString(R$string.f27146F0, Long.toString(m217833j(-vipToExpireTimeInMill)));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217830g() {
        return m217834k() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m217831h() {
        return xma.m210047L3();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m217832i() {
        try {
            return CoreModule.f17545c.f19639e0.m169520na().isVIP();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m217833j(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: k */
    public static double m217834k() {
        Optional<RefundDetail> optionalM221515e = CoreModule.f17545c.f19654j0.m30592K4().m221515e();
        if (NullChecker.m81303a(optionalM221515e) && optionalM221515e.isPresent()) {
            return optionalM221515e.get().totalRefundAmount;
        }
        return -1.0d;
    }
}
