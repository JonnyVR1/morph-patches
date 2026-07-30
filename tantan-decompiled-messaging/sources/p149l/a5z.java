package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a5z {
    /* JADX INFO: renamed from: a */
    public static String m95066a(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f20887W2))) {
            return CoreModule.f17544b.getString(R$string.f20887W2);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21074r5))) {
            return "";
        }
        TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21066q5));
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m95067b(User user) {
        List<String> list = (NullChecker.m81303a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        String strM95066a = !vwb.m200296J(list) ? m95066a(list.get(0)) : "";
        if (TextUtils.equals(strM95066a, CoreModule.f17544b.getString(R$string.f20887W2))) {
            return strM95066a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m95068c(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m95082q(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX INFO: renamed from: d */
    public static String m95069d(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合喝酒");
        map.put("fan", "酒精爱好者");
        map.put("sometime", "小酌怡情");
        map.put("quit_drink", "戒酒");
        map.put("never", "滴酒不沾");
        String str2 = "";
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.drink)) {
            String str3 = user.profile.extensions.physical.drink.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.m81303a(user2.profile) && NullChecker.m81303a(user2.profile.extensions) && NullChecker.m81303a(user2.profile.extensions.physical) && !vwb.m200296J(user2.profile.extensions.physical.drink)) {
            String str4 = user2.profile.extensions.physical.drink.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m95082q(str) && !TextUtils.isEmpty(str2) && m95082q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: e */
    public static String m95070e(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("habit", "有健身习惯");
        map.put("occasionally", "偶尔健身");
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.fitness)) {
            String str2 = user.profile.extensions.physical.fitness.get(0);
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str2);
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !m95082q(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static String m95071f(User user, User user2) {
        Purpose purpose = (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.basic) && !vwb.m200296J(user.profile.extensions.basic.friendPurpose)) ? user.profile.extensions.basic.friendPurpose.get(0) : null;
        Purpose purpose2 = (NullChecker.m81303a(user2.profile) && NullChecker.m81303a(user2.profile.extensions) && NullChecker.m81303a(user2.profile.extensions.basic) && !vwb.m200296J(user2.profile.extensions.basic.friendPurpose)) ? user2.profile.extensions.basic.friendPurpose.get(0) : null;
        HashMap map = new HashMap();
        map.put("friend", "交个朋友");
        map.put("date", "想约会");
        map.put("relationship", "谈个恋爱");
        map.put("marriage", "想结婚");
        if (NullChecker.m81303a(purpose) && TEnum.equals(purpose, purpose2) && !TEnum.equals(purpose, Purpose.thinking) && map.containsKey(purpose.toString())) {
            return (String) map.get(purpose.toString());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m95072g(User user, User user2) {
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str) && m95082q(str) && !TextUtils.isEmpty(str) && m95082q(str) && TextUtils.equals(str, str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m95073h(User user) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        String strM95081p;
        String str;
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.house;
            list3 = userWealth.houseRegion;
            list = userWealth.houseSubRegion;
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (vwb.m200296J(list2) || !user.isMe()) {
            strM95081p = null;
        } else {
            if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) {
                str = (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) ? "" : list3.get(0);
            } else {
                str = list.get(0);
            }
            strM95081p = m95081p(list2.get(0), str);
        }
        if (TextUtils.isEmpty(strM95081p) || !m95082q(strM95081p)) {
            return null;
        }
        return strM95081p;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX INFO: renamed from: i */
    public static String m95074i(User user) {
        List<String> list;
        List<String> list2;
        String string;
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (vwb.m200296J(list) && vwb.m200296J(list2)) {
            string = "";
        } else {
            if (!vwb.m200296J(list) && TextUtils.equals(list.get(0), "1000000")) {
                return CoreModule.f17544b.getString(R$string.f21051p);
            }
            if (!vwb.m200296J(list) && TextUtils.equals(list.get(0), CoreModule.f17544b.getString(R$string.f21066q5))) {
                return null;
            }
            if (vwb.m200296J(list2) || TextUtils.equals(list2.get(0), "50000") || TextUtils.equals(list2.get(0), "100000") || TextUtils.equals(list2.get(0), "200000")) {
                string = "";
            } else if (TextUtils.equals(list2.get(0), "300000")) {
                string = CoreModule.f17544b.getString(R$string.f21024m);
            } else if (TextUtils.equals(list2.get(0), "600000")) {
                string = CoreModule.f17544b.getString(R$string.f21033n);
            } else if (TextUtils.equals(list2.get(0), "1000000")) {
                string = CoreModule.f17544b.getString(R$string.f21042o);
            } else {
                string = "";
            }
        }
        if (TextUtils.isEmpty(string) || !m95082q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static String m95075j(User user) {
        Profile profile = user.profile;
        String string = profile.studies.active ? CoreModule.f17544b.getString(R$string.f20786J5) : profile.work.industry;
        if (TextUtils.isEmpty(string) || !m95082q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static String m95076k(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.m200296J(profileExtensionBasic.mbti) || TextUtils.isEmpty(user.profile.extensions.basic.mbti.get(0))) {
            return null;
        }
        return user.profile.extensions.basic.mbti.get(0);
    }

    /* JADX INFO: renamed from: l */
    public static String m95077l(User user) {
        if (!NullChecker.m81303a(user) || !NullChecker.m81303a(user.profile) || !NullChecker.m81303a(user.profile.extensions) || !NullChecker.m81303a(user.profile.extensions.wealth) || vwb.m200296J(user.profile.extensions.wealth.pet) || vwb.m200296J(user.profile.extensions.wealth.petImg) || !TextUtils.equals(user.profile.extensions.wealth.pet.get(0), "已有宠物")) {
            return null;
        }
        Iterator<String> it = user.profile.extensions.wealth.petImg.iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty(it.next())) {
                return "已有宠物";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static String m95078m(User user) {
        String qualificationText = user.getQualificationText();
        String strM95083r = !TextUtils.equals(qualificationText, CoreModule.f17544b.getString(R$string.f21066q5)) ? m95083r(qualificationText) : "";
        if (TextUtils.isEmpty(strM95083r) || !m95082q(strM95083r)) {
            return null;
        }
        return strM95083r;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX INFO: renamed from: n */
    public static String m95079n(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合吸烟");
        map.put("often", "经常吸烟");
        map.put("quit_smoke", "戒烟");
        map.put("never", "不吸烟");
        String str2 = "";
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.smoke)) {
            String str3 = user.profile.extensions.physical.smoke.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.m81303a(user2.profile) && NullChecker.m81303a(user2.profile.extensions) && NullChecker.m81303a(user2.profile.extensions.physical) && !vwb.m200296J(user2.profile.extensions.physical.smoke)) {
            String str4 = user2.profile.extensions.physical.smoke.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m95082q(str) && !TextUtils.isEmpty(str2) && m95082q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m95080o(User user) {
        int i;
        String userHeight = user.getUserHeight();
        if (TextUtils.isEmpty(userHeight) || !m95082q(userHeight)) {
            return null;
        }
        try {
            i = Integer.parseInt(userHeight);
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            return null;
        }
        if (!user.isFemale() && i < 175) {
            return null;
        }
        return userHeight + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
    }

    /* JADX INFO: renamed from: p */
    public static String m95081p(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f20895X2))) {
            TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21082s5));
            return "";
        }
        return str2 + CoreModule.f17544b.getString(R$string.f20895X2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m95082q(String str) {
        return (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21066q5)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public static String m95083r(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21111w2)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21103v2))) {
            return "";
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21135z2))) {
            return CoreModule.f17544b.getString(R$string.f21135z2);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21127y2))) {
            return CoreModule.f17544b.getString(R$string.f21127y2);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21119x2))) {
            return CoreModule.f17544b.getString(R$string.f21119x2);
        }
        TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f21066q5));
        return "";
    }
}
