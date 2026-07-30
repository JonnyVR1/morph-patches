package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.mqi0;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qgl0 {

    /* JADX INFO: renamed from: a */
    public static long f19741a = 432000000;

    /* JADX INFO: renamed from: a */
    public static long m22043a(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: b */
    public static String m22044b(Act act) {
        int i = R$string.f2941tn;
        int i2 = R$string.f3001vn;
        int i3 = R$string.f3031wn;
        int i4 = R$string.f2971un;
        int i5 = R$string.f2881rn;
        int i6 = R$string.f2911sn;
        if (u59.m24998f0()) {
            i = R$string.f1957Nb;
            i2 = R$string.f2017Pb;
            i4 = R$string.f1987Ob;
            i5 = R$string.f2047Qb;
            i3 = i2;
            i6 = i5;
        }
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        long jG = n3b0.g();
        if (jG == 0) {
            return act.getString(i);
        }
        long j = jG - jGuessedCurrentServerTime;
        if (j < 0) {
            long jM22043a = m22043a(jGuessedCurrentServerTime - jG);
            if (jM22043a > 1) {
                i5 = i6;
            }
            return act.getString(i5, Long.valueOf(jM22043a));
        }
        if (CoreModule.m1851K().me_().isSVIP() || f19741a <= j) {
            return act.getString(i4, mqi0.d.format(new Date(jG)));
        }
        long jM22043a2 = m22043a(j);
        if (jM22043a2 > 1) {
            i2 = i3;
        }
        return act.getString(i2, "" + jM22043a2);
    }

    /* JADX INFO: renamed from: c */
    public static String m22045c(Act act) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        long vipToExpireTimeInMill = userM21490p9.getVipToExpireTimeInMill();
        if (userM21490p9.isVIP()) {
            return CoreModule.f1533b.getString(R$string.f1884Ks, mqi0.d.format(new Date(userM21490p9.getMembershipExpireTime(MembershipType.get("vip")))));
        }
        if (!userM21490p9.isVIPUsed()) {
            return CoreModule.f1533b.getString(R$string.f1974Ns);
        }
        long jM22043a = m22043a(-vipToExpireTimeInMill);
        return act.getString(jM22043a > 1 ? R$string.f1944Ms : R$string.f1914Ls, Long.valueOf(jM22043a));
    }

    /* JADX INFO: renamed from: d */
    public static String m22046d(UserPrivilege userPrivilege) {
        if (!NullChecker.a(userPrivilege)) {
            return "";
        }
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        long j = userPrivilege.content.expiredTime;
        if (j == 0) {
            if ("svip".equals(((DbObject) userPrivilege).id)) {
                return CoreModule.f1533b.getString(R$string.f1558A2);
            }
            if ("oDiamond".equals(((DbObject) userPrivilege).id)) {
                return "暂未激活黑金会员";
            }
            if ("platinum".equals(((DbObject) userPrivilege).id)) {
                return "暂未激活白金会员";
            }
            if ("femaleVip".equals(((DbObject) userPrivilege).id)) {
                return "暂未激活她专享会员";
            }
            if ("youthVip".equals(((DbObject) userPrivilege).id)) {
                return "暂未激活青春专享会员";
            }
            if ("ultraPremium".equals(((DbObject) userPrivilege).id)) {
                return CoreModule.f1533b.getString(R$string.f2783og);
            }
        }
        long j2 = j - jGuessedCurrentServerTime;
        String str = ((DbObject) userPrivilege).id;
        String string = null;
        if (j2 >= 0) {
            if ("svip".equals(str)) {
                CoreModule.f1533b.getString(R$string.f2891s3);
                string = CoreModule.f1533b.getString(R$string.f1588B2);
            } else if ("oDiamond".equals(((DbObject) userPrivilege).id)) {
                string = "黑金会员(%s到期)";
            } else if ("platinum".equals(((DbObject) userPrivilege).id)) {
                string = "白金会员(%s到期)";
            } else if ("femaleVip".equals(((DbObject) userPrivilege).id)) {
                string = "她专享会员(%s到期)";
            } else if ("youthVip".equals(((DbObject) userPrivilege).id)) {
                string = "青春专享会员(%s到期)";
            } else if ("ultraPremium".equals(((DbObject) userPrivilege).id)) {
                string = CoreModule.f1533b.getString(R$string.f2721mg);
            }
            return !TextUtils.isEmpty(string) ? String.format(string, mqi0.d.format(new Date(j))) : "";
        }
        if ("svip".equals(str)) {
            CoreModule.f1533b.getString(R$string.f2861r3);
            string = CoreModule.f1533b.getString(R$string.f3100z2);
        } else if ("oDiamond".equals(((DbObject) userPrivilege).id)) {
            string = "黑金会员已过期%s天";
        } else if ("platinum".equals(((DbObject) userPrivilege).id)) {
            string = "白金会员已过期%s天";
        } else if ("femaleVip".equals(((DbObject) userPrivilege).id)) {
            string = "她专享会员已过期%s天";
        } else if ("youthVip".equals(((DbObject) userPrivilege).id)) {
            string = "青春专享会员已过期%s天";
        } else if ("ultraPremium".equals(((DbObject) userPrivilege).id)) {
            string = CoreModule.f1533b.getString(R$string.f2752ng);
        }
        return !TextUtils.isEmpty(string) ? String.format(string, Long.valueOf(m22043a(jGuessedCurrentServerTime - j))) : "";
    }
}
