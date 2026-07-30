package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class a5z {
    /* JADX INFO: renamed from: a */
    public static String m2746a(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.W2))) {
            return CoreModule.b.getString(R.string.W2);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.r5))) {
            return "";
        }
        TextUtils.equals(str, CoreModule.b.getString(R.string.q5));
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m2747b(User user) {
        List list = (NullChecker.a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        String strM2746a = !vwb.J(list) ? m2746a((String) list.get(0)) : "";
        if (TextUtils.equals(strM2746a, CoreModule.b.getString(R.string.W2))) {
            return strM2746a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m2748c(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m2762q(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX INFO: renamed from: d */
    public static String m2749d(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合喝酒");
        map.put("fan", "酒精爱好者");
        map.put("sometime", "小酌怡情");
        map.put("quit_drink", "戒酒");
        map.put("never", "滴酒不沾");
        String str2 = "";
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.drink)) {
            String str3 = (String) user.profile.extensions.physical.drink.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.a(user2.profile) && NullChecker.a(user2.profile.extensions) && NullChecker.a(user2.profile.extensions.physical) && !vwb.J(user2.profile.extensions.physical.drink)) {
            String str4 = (String) user2.profile.extensions.physical.drink.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m2762q(str) && !TextUtils.isEmpty(str2) && m2762q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX INFO: renamed from: e */
    public static String m2750e(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("habit", "有健身习惯");
        map.put("occasionally", "偶尔健身");
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.fitness)) {
            String str2 = (String) user.profile.extensions.physical.fitness.get(0);
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str2);
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !m2762q(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static String m2751f(User user, User user2) {
        Purpose purpose = (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.basic) && !vwb.J(user.profile.extensions.basic.friendPurpose)) ? (Purpose) user.profile.extensions.basic.friendPurpose.get(0) : null;
        Purpose purpose2 = (NullChecker.a(user2.profile) && NullChecker.a(user2.profile.extensions) && NullChecker.a(user2.profile.extensions.basic) && !vwb.J(user2.profile.extensions.basic.friendPurpose)) ? (Purpose) user2.profile.extensions.basic.friendPurpose.get(0) : null;
        HashMap map = new HashMap();
        map.put("friend", "交个朋友");
        map.put("date", "想约会");
        map.put("relationship", "谈个恋爱");
        map.put("marriage", "想结婚");
        if (NullChecker.a(purpose) && TEnum.equals(purpose, purpose2) && !TEnum.equals(purpose, "thinking") && map.containsKey(purpose.toString())) {
            return (String) map.get(purpose.toString());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m2752g(User user, User user2) {
        String str = user.profile.hometown;
        if (!TextUtils.isEmpty(str) && m2762q(str) && !TextUtils.isEmpty(str) && m2762q(str) && TextUtils.equals(str, str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m2753h(User user) {
        List list;
        List list2;
        List list3;
        String strM2761p;
        String str;
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.house;
            list3 = userWealth.houseRegion;
            list = userWealth.houseSubRegion;
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (vwb.J(list2) || !user.isMe()) {
            strM2761p = null;
        } else {
            if (vwb.J(list) || TextUtils.isEmpty((CharSequence) list.get(0))) {
                str = (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) ? "" : (String) list3.get(0);
            } else {
                str = (String) list.get(0);
            }
            strM2761p = m2761p((String) list2.get(0), str);
        }
        if (TextUtils.isEmpty(strM2761p) || !m2762q(strM2761p)) {
            return null;
        }
        return strM2761p;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX INFO: renamed from: i */
    public static String m2754i(User user) {
        List list;
        List list2;
        String string;
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (vwb.J(list) && vwb.J(list2)) {
            string = "";
        } else {
            if (!vwb.J(list) && TextUtils.equals((CharSequence) list.get(0), "1000000")) {
                return CoreModule.b.getString(R.string.p);
            }
            if (!vwb.J(list) && TextUtils.equals((CharSequence) list.get(0), CoreModule.b.getString(R.string.q5))) {
                return null;
            }
            if (vwb.J(list2) || TextUtils.equals((CharSequence) list2.get(0), "50000") || TextUtils.equals((CharSequence) list2.get(0), "100000") || TextUtils.equals((CharSequence) list2.get(0), "200000")) {
                string = "";
            } else if (TextUtils.equals((CharSequence) list2.get(0), "300000")) {
                string = CoreModule.b.getString(R.string.m);
            } else if (TextUtils.equals((CharSequence) list2.get(0), "600000")) {
                string = CoreModule.b.getString(R.string.n);
            } else if (TextUtils.equals((CharSequence) list2.get(0), "1000000")) {
                string = CoreModule.b.getString(R.string.o);
            } else {
                string = "";
            }
        }
        if (TextUtils.isEmpty(string) || !m2762q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static String m2755j(User user) {
        Profile profile = user.profile;
        String string = profile.studies.active ? CoreModule.b.getString(R.string.J5) : profile.work.industry;
        if (TextUtils.isEmpty(string) || !m2762q(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static String m2756k(User user) {
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.J(profileExtensionBasic.mbti) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.mbti.get(0))) {
            return null;
        }
        return (String) user.profile.extensions.basic.mbti.get(0);
    }

    /* JADX INFO: renamed from: l */
    public static String m2757l(User user) {
        if (!NullChecker.a(user) || !NullChecker.a(user.profile) || !NullChecker.a(user.profile.extensions) || !NullChecker.a(user.profile.extensions.wealth) || vwb.J(user.profile.extensions.wealth.pet) || vwb.J(user.profile.extensions.wealth.petImg) || !TextUtils.equals((CharSequence) user.profile.extensions.wealth.pet.get(0), "已有宠物")) {
            return null;
        }
        Iterator it = user.profile.extensions.wealth.petImg.iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty((String) it.next())) {
                return "已有宠物";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static String m2758m(User user) {
        String qualificationText = user.getQualificationText();
        String strM2763r = !TextUtils.equals(qualificationText, CoreModule.b.getString(R.string.q5)) ? m2763r(qualificationText) : "";
        if (TextUtils.isEmpty(strM2763r) || !m2762q(strM2763r)) {
            return null;
        }
        return strM2763r;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX INFO: renamed from: n */
    public static String m2759n(User user, User user2) {
        String str;
        HashMap map = new HashMap();
        map.put("social", "仅在社交场合吸烟");
        map.put("often", "经常吸烟");
        map.put("quit_smoke", "戒烟");
        map.put("never", "不吸烟");
        String str2 = "";
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.smoke)) {
            String str3 = (String) user.profile.extensions.physical.smoke.get(0);
            if (TextUtils.isEmpty(str3) || TextUtils.equals(str3, "not_reveal")) {
                str = "";
            } else {
                str = (String) map.get(str3);
            }
        } else {
            str = "";
        }
        if (NullChecker.a(user2.profile) && NullChecker.a(user2.profile.extensions) && NullChecker.a(user2.profile.extensions.physical) && !vwb.J(user2.profile.extensions.physical.smoke)) {
            String str4 = (String) user2.profile.extensions.physical.smoke.get(0);
            if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, "not_reveal")) {
                str2 = (String) map.get(str4);
            }
        }
        if (!TextUtils.isEmpty(str) && m2762q(str) && !TextUtils.isEmpty(str2) && m2762q(str2) && TextUtils.equals(str, str2)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m2760o(User user) {
        int i;
        String userHeight = user.getUserHeight();
        if (TextUtils.isEmpty(userHeight) || !m2762q(userHeight)) {
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
        return userHeight + "cm";
    }

    /* JADX INFO: renamed from: p */
    public static String m2761p(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.b.getString(R.string.X2))) {
            TextUtils.equals(str, CoreModule.b.getString(R.string.s5));
            return "";
        }
        return str2 + CoreModule.b.getString(R.string.X2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2762q(String str) {
        return (TextUtils.equals(str, CoreModule.b.getString(R.string.q5)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public static String m2763r(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.w2)) || TextUtils.equals(str, CoreModule.b.getString(R.string.v2))) {
            return "";
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.z2))) {
            return CoreModule.b.getString(R.string.z2);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.y2))) {
            return CoreModule.b.getString(R.string.y2);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.x2))) {
            return CoreModule.b.getString(R.string.x2);
        }
        TextUtils.equals(str, CoreModule.b.getString(R.string.q5));
        return "";
    }
}
