package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xdz {
    /* JADX INFO: renamed from: a */
    public static String m210496a(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21629W2))) {
            return CoreModule.f18263b.getString(R$string.f21629W2);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21816r5))) {
            return "";
        }
        TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21808q5));
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m210497b(User user) {
        List<String> list = (NullChecker.m82486a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        String strM210496a = !jyb.m147479J(list) ? m210496a(list.get(0)) : "";
        if (TextUtils.equals(strM210496a, CoreModule.f18263b.getString(R$string.f21629W2))) {
            return strM210496a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m210498c(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m210512q(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX INFO: renamed from: d */
    public static String m210499d(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合喝酒");
        map.put("fan", "酒精爱好者");
        map.put("sometime", "小酌怡情");
        map.put("quit_drink", "戒酒");
        map.put("never", "滴酒不沾");
        String str2 = "";
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.drink)) {
            String str3 = user.profile.extensions.physical.drink.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.m82486a(user2.profile) && NullChecker.m82486a(user2.profile.extensions) && NullChecker.m82486a(user2.profile.extensions.physical) && !jyb.m147479J(user2.profile.extensions.physical.drink)) {
            String str4 = user2.profile.extensions.physical.drink.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m210512q(str) && !TextUtils.isEmpty(str2) && m210512q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: e */
    public static String m210500e(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("habit", "有健身习惯");
        map.put("occasionally", "偶尔健身");
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.fitness)) {
            String str2 = user.profile.extensions.physical.fitness.get(0);
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str2);
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !m210512q(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static String m210501f(User user, User user2) {
        Purpose purpose = (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.basic) && !jyb.m147479J(user.profile.extensions.basic.friendPurpose)) ? user.profile.extensions.basic.friendPurpose.get(0) : null;
        Purpose purpose2 = (NullChecker.m82486a(user2.profile) && NullChecker.m82486a(user2.profile.extensions) && NullChecker.m82486a(user2.profile.extensions.basic) && !jyb.m147479J(user2.profile.extensions.basic.friendPurpose)) ? user2.profile.extensions.basic.friendPurpose.get(0) : null;
        HashMap map = new HashMap();
        map.put("friend", "交个朋友");
        map.put("date", "想约会");
        map.put("relationship", "谈个恋爱");
        map.put("marriage", "想结婚");
        if (NullChecker.m82486a(purpose) && TEnum.equals(purpose, purpose2) && !TEnum.equals(purpose, Purpose.thinking) && map.containsKey(purpose.toString())) {
            return (String) map.get(purpose.toString());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m210502g(User user, User user2) {
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str) && m210512q(str) && !TextUtils.isEmpty(str) && m210512q(str) && TextUtils.equals(str, str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m210503h(User user) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        String strM210511p;
        String str;
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.house;
            list3 = userWealth.houseRegion;
            list = userWealth.houseSubRegion;
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (jyb.m147479J(list2) || !user.isMe()) {
            strM210511p = null;
        } else {
            if (jyb.m147479J(list) || TextUtils.isEmpty(list.get(0))) {
                str = (jyb.m147479J(list3) || TextUtils.isEmpty(list3.get(0))) ? "" : list3.get(0);
            } else {
                str = list.get(0);
            }
            strM210511p = m210511p(list2.get(0), str);
        }
        if (TextUtils.isEmpty(strM210511p) || !m210512q(strM210511p)) {
            return null;
        }
        return strM210511p;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX INFO: renamed from: i */
    public static String m210504i(User user) {
        List<String> list;
        List<String> list2;
        String string;
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (jyb.m147479J(list) && jyb.m147479J(list2)) {
            string = "";
        } else {
            if (!jyb.m147479J(list) && TextUtils.equals(list.get(0), "1000000")) {
                return CoreModule.f18263b.getString(R$string.f21793p);
            }
            if (!jyb.m147479J(list) && TextUtils.equals(list.get(0), CoreModule.f18263b.getString(R$string.f21808q5))) {
                return null;
            }
            if (jyb.m147479J(list2) || TextUtils.equals(list2.get(0), "50000") || TextUtils.equals(list2.get(0), "100000") || TextUtils.equals(list2.get(0), "200000")) {
                string = "";
            } else if (TextUtils.equals(list2.get(0), "300000")) {
                string = CoreModule.f18263b.getString(R$string.f21766m);
            } else if (TextUtils.equals(list2.get(0), "600000")) {
                string = CoreModule.f18263b.getString(R$string.f21775n);
            } else if (TextUtils.equals(list2.get(0), "1000000")) {
                string = CoreModule.f18263b.getString(R$string.f21784o);
            } else {
                string = "";
            }
        }
        if (TextUtils.isEmpty(string) || !m210512q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static String m210505j(User user) {
        Profile profile = user.profile;
        String string = profile.studies.active ? CoreModule.f18263b.getString(R$string.f21528J5) : profile.work.industry;
        if (TextUtils.isEmpty(string) || !m210512q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static String m210506k(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || jyb.m147479J(profileExtensionBasic.mbti) || TextUtils.isEmpty(user.profile.extensions.basic.mbti.get(0))) {
            return null;
        }
        return user.profile.extensions.basic.mbti.get(0);
    }

    /* JADX INFO: renamed from: l */
    public static String m210507l(User user) {
        if (!NullChecker.m82486a(user) || !NullChecker.m82486a(user.profile) || !NullChecker.m82486a(user.profile.extensions) || !NullChecker.m82486a(user.profile.extensions.wealth) || jyb.m147479J(user.profile.extensions.wealth.pet) || jyb.m147479J(user.profile.extensions.wealth.petImg) || !TextUtils.equals(user.profile.extensions.wealth.pet.get(0), "已有宠物")) {
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
    public static String m210508m(User user) {
        String qualificationText = user.getQualificationText();
        String strM210513r = !TextUtils.equals(qualificationText, CoreModule.f18263b.getString(R$string.f21808q5)) ? m210513r(qualificationText) : "";
        if (TextUtils.isEmpty(strM210513r) || !m210512q(strM210513r)) {
            return null;
        }
        return strM210513r;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX INFO: renamed from: n */
    public static String m210509n(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合吸烟");
        map.put("often", "经常吸烟");
        map.put("quit_smoke", "戒烟");
        map.put("never", "不吸烟");
        String str2 = "";
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.smoke)) {
            String str3 = user.profile.extensions.physical.smoke.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.m82486a(user2.profile) && NullChecker.m82486a(user2.profile.extensions) && NullChecker.m82486a(user2.profile.extensions.physical) && !jyb.m147479J(user2.profile.extensions.physical.smoke)) {
            String str4 = user2.profile.extensions.physical.smoke.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m210512q(str) && !TextUtils.isEmpty(str2) && m210512q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m210510o(User user) {
        int i;
        String userHeight = user.getUserHeight();
        if (TextUtils.isEmpty(userHeight) || !m210512q(userHeight)) {
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
    public static String m210511p(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21637X2))) {
            TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21824s5));
            return "";
        }
        return str2 + CoreModule.f18263b.getString(R$string.f21637X2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m210512q(String str) {
        return (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21808q5)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public static String m210513r(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21853w2)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21845v2))) {
            return "";
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21877z2))) {
            return CoreModule.f18263b.getString(R$string.f21877z2);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21869y2))) {
            return CoreModule.f18263b.getString(R$string.f21869y2);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21861x2))) {
            return CoreModule.f18263b.getString(R$string.f21861x2);
        }
        TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f21808q5));
        return "";
    }
}
