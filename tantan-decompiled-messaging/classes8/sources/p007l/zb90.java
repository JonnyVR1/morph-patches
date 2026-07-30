package p007l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import l.mqi0;
import l.rxa0;
import l.src0;
import l.vwb;
import l.w9j;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zb90 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static Privilege m11996b(String str) {
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
    public static String m11997c(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        if (TEnum.equals(summarizedPrivilegesId, "platinum")) {
            UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(summarizedPrivilegesId);
            vipExpireTime = NullChecker.a(userPrivilegeW4) ? userPrivilegeW4.content.expiredTime : 0L;
        } else {
            vipExpireTime = CoreModule.c.e0.p9().getVipExpireTime();
        }
        return String.format(Locale.getDefault(), "%s 到期", mqi0.d.format(new Date(vipExpireTime)));
    }

    /* JADX INFO: renamed from: d */
    public static String m11998d(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.b.getString(R.string.r0, String.format(Locale.getDefault(), "%d%s", Long.valueOf(src0.r().x(summarizedPrivilegesId)), CoreModule.b.getString(R.string.L1)));
    }

    /* JADX INFO: renamed from: e */
    public static String m11999e(ProductCategory productCategory) {
        Merchandise merchandise = (Merchandise) vwb.r(CoreModule.c.j0.D5(productCategory), new w9j() { // from class: l.yb90
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (!NullChecker.a(merchandise)) {
            return "";
        }
        double firstCouponPrice = rxa0.n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format("￥%s/月", numberInstance.format(firstCouponPrice));
    }

    /* JADX INFO: renamed from: f */
    public static String m12000f() {
        User userP9 = CoreModule.c.e0.p9();
        long vipToExpireTimeInMill = userP9.getVipToExpireTimeInMill();
        if (userP9.isVIP()) {
            return m11998d(SummarizedPrivilegesId.get("vip"));
        }
        return !userP9.isVIPUsed() ? "" : CoreModule.b.getString(R.string.F0, Long.toString(m12004j(-vipToExpireTimeInMill)));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12001g() {
        return m12005k() > 0.0d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12002h() {
        return xma.L3();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12003i() {
        try {
            return CoreModule.c.e0.na().isVIP();
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m12004j(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: k */
    public static double m12005k() {
        Optional optional = (Optional) CoreModule.c.j0.K4().e();
        if (NullChecker.a(optional) && optional.isPresent()) {
            return ((RefundDetail) optional.get()).totalRefundAmount;
        }
        return -1.0d;
    }
}
