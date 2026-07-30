package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public class upl0 {

    /* JADX INFO: renamed from: a */
    public static long f180283a = 432000000;

    /* JADX INFO: renamed from: a */
    public static long m197100a(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: b */
    public static String m197101b(Act act) {
        int i = R$string.f18770Pn;
        int i2 = R$string.f18830Rn;
        int i3 = R$string.f18860Sn;
        int i4 = R$string.f18800Qn;
        int i5 = R$string.f18710Nn;
        int i6 = R$string.f18740On;
        if (d79.m114685j0()) {
            i = R$string.f19151cc;
            i2 = R$string.f19212ec;
            i4 = R$string.f19182dc;
            i5 = R$string.f19243fc;
            i3 = i2;
            i6 = i5;
        }
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        long jM180735g = rbb0.m180735g();
        if (jM180735g == 0) {
            return act.getString(i);
        }
        long j = jM180735g - jGuessedCurrentServerTime;
        if (j < 0) {
            long jM197100a = m197100a(jGuessedCurrentServerTime - jM180735g);
            if (jM197100a > 1) {
                i5 = i6;
            }
            return act.getString(i5, Long.valueOf(jM197100a));
        }
        if (CoreModule.m30930K().me_().isSVIP() || f180283a <= j) {
            return act.getString(i4, pzi0.f154857d.format(new Date(jM180735g)));
        }
        long jM197100a2 = m197100a(j);
        if (jM197100a2 > 1) {
            i2 = i3;
        }
        return act.getString(i2, "" + jM197100a2);
    }

    /* JADX INFO: renamed from: c */
    public static String m197102c(Act act) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        long vipToExpireTimeInMill = userM116600p9.getVipToExpireTimeInMill();
        if (userM116600p9.isVIP()) {
            return CoreModule.f18263b.getString(R$string.f19291gt, pzi0.f154857d.format(new Date(userM116600p9.getMembershipExpireTime(MembershipType.get("vip")))));
        }
        if (!userM116600p9.isVIPUsed()) {
            return CoreModule.f18263b.getString(R$string.f19413kt);
        }
        long jM197100a = m197100a(-vipToExpireTimeInMill);
        return act.getString(jM197100a > 1 ? R$string.f19382jt : R$string.f19322ht, Long.valueOf(jM197100a));
    }

    /* JADX INFO: renamed from: d */
    public static String m197103d(UserPrivilege userPrivilege) {
        if (!NullChecker.m82486a(userPrivilege)) {
            return "";
        }
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        long j = userPrivilege.content.expiredTime;
        if (j == 0) {
            if ("svip".equals(userPrivilege.f56859id)) {
                return CoreModule.f18263b.getString(R$string.f18350C2);
            }
            if ("oDiamond".equals(userPrivilege.f56859id)) {
                return "暂未激活黑金会员";
            }
            if ("platinum".equals(userPrivilege.f56859id)) {
                return "暂未激活白金会员";
            }
            if ("femaleVip".equals(userPrivilege.f56859id)) {
                return "暂未激活她专享会员";
            }
            if ("youthVip".equals(userPrivilege.f56859id)) {
                return "暂未激活青春专享会员";
            }
            if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56859id)) {
                return CoreModule.f18263b.getString(R$string.f18519Hg);
            }
        }
        long j2 = j - jGuessedCurrentServerTime;
        String str = userPrivilege.f56859id;
        String string = null;
        if (j2 >= 0) {
            if ("svip".equals(str)) {
                CoreModule.f18263b.getString(R$string.f19697u3);
                string = CoreModule.f18263b.getString(R$string.f18381D2);
            } else if ("oDiamond".equals(userPrivilege.f56859id)) {
                string = "黑金会员(%s到期)";
            } else if ("platinum".equals(userPrivilege.f56859id)) {
                string = "白金会员(%s到期)";
            } else if ("femaleVip".equals(userPrivilege.f56859id)) {
                string = "她专享会员(%s到期)";
            } else if ("youthVip".equals(userPrivilege.f56859id)) {
                string = "青春专享会员(%s到期)";
            } else if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56859id)) {
                string = CoreModule.f18263b.getString(R$string.f18457Fg);
            }
            return !TextUtils.isEmpty(string) ? String.format(string, pzi0.f154857d.format(new Date(j))) : "";
        }
        if ("svip".equals(str)) {
            CoreModule.f18263b.getString(R$string.f19666t3);
            string = CoreModule.f18263b.getString(R$string.f18319B2);
        } else if ("oDiamond".equals(userPrivilege.f56859id)) {
            string = "黑金会员已过期%s天";
        } else if ("platinum".equals(userPrivilege.f56859id)) {
            string = "白金会员已过期%s天";
        } else if ("femaleVip".equals(userPrivilege.f56859id)) {
            string = "她专享会员已过期%s天";
        } else if ("youthVip".equals(userPrivilege.f56859id)) {
            string = "青春专享会员已过期%s天";
        } else if (SummarizedPrivilegesId.ultraPremium.equals(userPrivilege.f56859id)) {
            string = CoreModule.f18263b.getString(R$string.f18488Gg);
        }
        return !TextUtils.isEmpty(string) ? String.format(string, Long.valueOf(m197100a(jGuessedCurrentServerTime - j))) : "";
    }
}
