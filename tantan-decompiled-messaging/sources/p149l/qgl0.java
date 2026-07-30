package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class qgl0 {

    /* JADX INFO: renamed from: a */
    public static long f154348a = 432000000;

    /* JADX INFO: renamed from: a */
    public static long m174438a(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: b */
    public static String m174439b(Act act) {
        int i = R$string.f18952tn;
        int i2 = R$string.f19012vn;
        int i3 = R$string.f19042wn;
        int i4 = R$string.f18982un;
        int i5 = R$string.f18892rn;
        int i6 = R$string.f18922sn;
        if (u59.m191827f0()) {
            i = R$string.f17968Nb;
            i2 = R$string.f18028Pb;
            i4 = R$string.f17998Ob;
            i5 = R$string.f18058Qb;
            i3 = i2;
            i6 = i5;
        }
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        long jM157733g = n3b0.m157733g();
        if (jM157733g == 0) {
            return act.getString(i);
        }
        long j = jM157733g - jGuessedCurrentServerTime;
        if (j < 0) {
            long jM174438a = m174438a(jGuessedCurrentServerTime - jM157733g);
            if (jM174438a > 1) {
                i5 = i6;
            }
            return act.getString(i5, Long.valueOf(jM174438a));
        }
        if (CoreModule.m29932K().me_().isSVIP() || f154348a <= j) {
            return act.getString(i4, mqi0.f135252d.format(new Date(jM157733g)));
        }
        long jM174438a2 = m174438a(j);
        if (jM174438a2 > 1) {
            i2 = i3;
        }
        return act.getString(i2, "" + jM174438a2);
    }

    /* JADX INFO: renamed from: c */
    public static String m174440c(Act act) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        long vipToExpireTimeInMill = userM169527p9.getVipToExpireTimeInMill();
        if (userM169527p9.isVIP()) {
            return CoreModule.f17544b.getString(R$string.f17895Ks, mqi0.f135252d.format(new Date(userM169527p9.getMembershipExpireTime(MembershipType.get("vip")))));
        }
        if (!userM169527p9.isVIPUsed()) {
            return CoreModule.f17544b.getString(R$string.f17985Ns);
        }
        long jM174438a = m174438a(-vipToExpireTimeInMill);
        return act.getString(jM174438a > 1 ? R$string.f17955Ms : R$string.f17925Ls, Long.valueOf(jM174438a));
    }

    /* JADX INFO: renamed from: d */
    public static String m174441d(UserPrivilege userPrivilege) {
        if (!NullChecker.m81303a(userPrivilege)) {
            return "";
        }
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        long j = userPrivilege.content.expiredTime;
        if (j == 0) {
            if ("svip".equals(userPrivilege.f56011id)) {
                return CoreModule.f17544b.getString(R$string.f17569A2);
            }
            if ("oDiamond".equals(userPrivilege.f56011id)) {
                return "暂未激活黑金会员";
            }
            if ("platinum".equals(userPrivilege.f56011id)) {
                return "暂未激活白金会员";
            }
            if ("femaleVip".equals(userPrivilege.f56011id)) {
                return "暂未激活她专享会员";
            }
            if ("youthVip".equals(userPrivilege.f56011id)) {
                return "暂未激活青春专享会员";
            }
            if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56011id)) {
                return CoreModule.f17544b.getString(R$string.f18794og);
            }
        }
        long j2 = j - jGuessedCurrentServerTime;
        String str = userPrivilege.f56011id;
        String string = null;
        if (j2 >= 0) {
            if ("svip".equals(str)) {
                CoreModule.f17544b.getString(R$string.f18902s3);
                string = CoreModule.f17544b.getString(R$string.f17599B2);
            } else if ("oDiamond".equals(userPrivilege.f56011id)) {
                string = "黑金会员(%s到期)";
            } else if ("platinum".equals(userPrivilege.f56011id)) {
                string = "白金会员(%s到期)";
            } else if ("femaleVip".equals(userPrivilege.f56011id)) {
                string = "她专享会员(%s到期)";
            } else if ("youthVip".equals(userPrivilege.f56011id)) {
                string = "青春专享会员(%s到期)";
            } else if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56011id)) {
                string = CoreModule.f17544b.getString(R$string.f18732mg);
            }
            return !TextUtils.isEmpty(string) ? String.format(string, mqi0.f135252d.format(new Date(j))) : "";
        }
        if ("svip".equals(str)) {
            CoreModule.f17544b.getString(R$string.f18872r3);
            string = CoreModule.f17544b.getString(R$string.f19111z2);
        } else if ("oDiamond".equals(userPrivilege.f56011id)) {
            string = "黑金会员已过期%s天";
        } else if ("platinum".equals(userPrivilege.f56011id)) {
            string = "白金会员已过期%s天";
        } else if ("femaleVip".equals(userPrivilege.f56011id)) {
            string = "她专享会员已过期%s天";
        } else if ("youthVip".equals(userPrivilege.f56011id)) {
            string = "青春专享会员已过期%s天";
        } else if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56011id)) {
            string = CoreModule.f17544b.getString(R$string.f18763ng);
        }
        return !TextUtils.isEmpty(string) ? String.format(string, Long.valueOf(m174438a(jGuessedCurrentServerTime - j))) : "";
    }
}
