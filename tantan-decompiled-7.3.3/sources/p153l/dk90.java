package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class dk90 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static Privilege m116223b(String str) {
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
    public static String m116224c(SummarizedPrivilegesId summarizedPrivilegesId) {
        long vipExpireTime;
        if (TEnum.equals(summarizedPrivilegesId, "platinum")) {
            UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(summarizedPrivilegesId);
            vipExpireTime = NullChecker.m82486a(userPrivilegeM146426x4) ? userPrivilegeM146426x4.content.expiredTime : 0L;
        } else {
            vipExpireTime = CoreModule.f18264c.f20381e0.m116600p9().getVipExpireTime();
        }
        return String.format(Locale.getDefault(), "%s 到期", pzi0.f154857d.format(new Date(vipExpireTime)));
    }

    /* JADX INFO: renamed from: d */
    public static String m116225d(SummarizedPrivilegesId summarizedPrivilegesId) {
        return CoreModule.f18263b.getString(R$string.f28428r0, String.format(Locale.getDefault(), "%d%s", Long.valueOf(xzc0.m213720r().m213749x(summarizedPrivilegesId)), CoreModule.f18263b.getString(R$string.f28061L1)));
    }

    /* JADX INFO: renamed from: e */
    public static String m116226e(ProductCategory productCategory) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(productCategory), new qcj() { // from class: l.ck90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.autoRenewable());
            }
        });
        if (!NullChecker.m82486a(merchandise)) {
            return "";
        }
        double firstCouponPrice = v5b0.m199788n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return String.format("￥%s/月", numberInstance.format(firstCouponPrice));
    }

    /* JADX INFO: renamed from: f */
    public static String m116227f() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        long vipToExpireTimeInMill = userM116600p9.getVipToExpireTimeInMill();
        if (userM116600p9.isVIP()) {
            return m116225d(SummarizedPrivilegesId.get("vip"));
        }
        return !userM116600p9.isVIPUsed() ? "" : CoreModule.f18263b.getString(R$string.f27994F0, Long.toString(m116231j(-vipToExpireTimeInMill)));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m116228g() {
        return m116232k() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m116229h() {
        return joa.m146361M3();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m116230i() {
        try {
            return CoreModule.f18264c.f20381e0.m116593na().isVIP();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m116231j(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: k */
    public static double m116232k() {
        Optional<RefundDetail> optionalM222761e = CoreModule.f18264c.f20396j0.m31595K4().m222761e();
        if (NullChecker.m82486a(optionalM222761e) && optionalM222761e.isPresent()) {
            return optionalM222761e.get().totalRefundAmount;
        }
        return -1.0d;
    }
}
