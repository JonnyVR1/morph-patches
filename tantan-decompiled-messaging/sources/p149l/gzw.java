package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class gzw {
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX INFO: renamed from: a */
    public static String m128917a(User user) {
        String str;
        String strMo158407m;
        String str2;
        String str3;
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        if (user == null) {
            return "";
        }
        int iNextInt = new Random().nextInt(5);
        String strValueOf = user.isHideAgeFromSVip() ? "xx" : String.valueOf(user.age);
        List<String> list = user.profile.extensions.physical.height;
        if (vwb.m200296J(list)) {
            str = "xx";
        } else {
            str = list.get(0);
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f27884l2))) {
                str = "xx";
            }
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        List<String> list2 = userWealth.upperIncome;
        List<String> list3 = userWealth.lowIncome;
        if (vwb.m200296J(list3) && vwb.m200296J(list2)) {
            strMo158407m = "xx";
        } else {
            strMo158407m = CoreModule.m29935P().m94651a().mo158407m(list2, list3);
            if (TextUtils.isEmpty(strMo158407m) || TextUtils.equals(strMo158407m, CoreModule.f17544b.getString(R$string.f27884l2))) {
                strMo158407m = "xx";
            }
        }
        String strM128918b = m128918b(user);
        String strM128919c = m128919c(user);
        String hometown = user.getHometown();
        if (TextUtils.isEmpty(hometown)) {
            hometown = "xx";
        }
        String marryPosition = user.getMarryPosition();
        if (TextUtils.isEmpty(marryPosition)) {
            marryPosition = "xx";
        }
        String str4 = user.name;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionBasic = extensions.basic) == null || vwb.m200296J(profileExtensionBasic.qualification)) {
            str2 = "xx";
        } else {
            str2 = user.profile.extensions.basic.qualification.get(0);
            if (!m128920d(str2)) {
                str2 = "xx";
            }
        }
        StringBuilder sb = new StringBuilder();
        if (iNextInt == 0) {
            sb.append("Hi～我");
            if (!TextUtils.equals(strValueOf, "xx")) {
                sb.append("今年");
                sb.append(strValueOf);
                sb.append("岁，");
            }
            if (!TextUtils.equals(str, "xx")) {
                sb.append("身高");
                sb.append(str);
                sb.append("、");
            }
            if (!TextUtils.equals(strMo158407m, "xx")) {
                sb.append("年收入");
                sb.append(strMo158407m);
                sb.append("、");
            }
            if (!TextUtils.equals(strM128918b, "xx")) {
                sb.append("做");
                sb.append(strM128918b);
                sb.append("工作，");
            }
            if (!TextUtils.equals(strM128919c, "xx")) {
                sb.append(strM128919c);
                sb.append("、");
            }
            sb.append("喜欢旅游、刷剧、健身。希望对方情绪稳定，三观一致，相互信任，能一起成长");
            return sb.toString();
        }
        String str5 = str2;
        if (iNextInt == 1) {
            sb.append("你好哇！我是一个热情、自信、直来直去的人，");
            if (!TextUtils.equals(hometown, "xx")) {
                sb.append("老家");
                sb.append(hometown);
                sb.append("，");
            }
            if (!TextUtils.equals(marryPosition, "xx")) {
                sb.append("现在在");
                sb.append(marryPosition);
            }
            if (!TextUtils.equals(strM128918b, "xx")) {
                sb.append("从事");
                sb.append(strM128918b);
                sb.append("，");
            }
            if (!TextUtils.equals(strMo158407m, "xx")) {
                sb.append("年收入");
                sb.append(strMo158407m);
                sb.append("，");
            }
            sb.append("很想和你一起分享美好生活，对我有兴趣请真诚介绍自己哦");
            return sb.toString();
        }
        String str6 = strMo158407m;
        if (iNextInt == 2) {
            sb.append("你好，");
            if (!TextUtils.equals(hometown, "xx") && !TextUtils.equals(marryPosition, "xx")) {
                sb.append(hometown);
                sb.append("人在");
                sb.append(marryPosition);
                sb.append("，");
            }
            if (!TextUtils.equals(str5, "xx")) {
                sb.append("学历是");
                sb.append(str5);
                sb.append("，");
            }
            if (TextUtils.equals(strM128918b, "xx")) {
                str3 = "从事";
            } else {
                str3 = "从事";
                sb.append(str3);
                sb.append(strM128918b);
                sb.append("，");
            }
            if (!TextUtils.equals(strM128918b, "xx")) {
                sb.append(str3);
                sb.append(strM128918b);
                sb.append("工作。");
            }
            if (!TextUtils.equals(strM128919c, "xx")) {
                sb.append("我是标准的");
                sb.append(strM128919c);
                sb.append("性格，");
            }
            sb.append("自由浪漫，感性大于理性。我的兴趣爱好很多，希望可以和对的人结婚");
            return sb.toString();
        }
        if (iNextInt == 3) {
            sb.append("觉得你很不错，简单介绍一下自己：");
            if (!TextUtils.equals(strValueOf, "xx")) {
                sb.append(strValueOf);
                sb.append("岁，");
            }
            if (!TextUtils.equals(str, "xx")) {
                sb.append("身高");
                sb.append(str);
                sb.append("，");
            }
            if (!TextUtils.equals(strM128918b, "xx")) {
                sb.append("工作是");
                sb.append(strM128918b);
                sb.append("，");
            }
            if (!TextUtils.equals(str6, "xx")) {
                sb.append("一年大概");
                sb.append(str6);
                sb.append("的收入！");
            }
            sb.append("有房有车，生活简简单单，朝九晚六，两点一线，圈子比较小，宁缺毋滥，所以一直单着");
            return sb.toString();
        }
        if (iNextInt != 4) {
            return "";
        }
        sb.append("你好，");
        if (!TextUtils.equals(str4, "xx")) {
            sb.append("我叫");
            sb.append(str4);
            sb.append("，");
        }
        if (!TextUtils.equals(strValueOf, "xx")) {
            sb.append("我今年");
            sb.append(strValueOf);
            sb.append("岁，");
        }
        if (!TextUtils.equals(marryPosition, "xx")) {
            sb.append("现在在");
            sb.append(marryPosition);
            sb.append("工作，");
        }
        if (!TextUtils.equals(hometown, "xx")) {
            sb.append("老家是");
            sb.append(hometown);
            sb.append("，");
        }
        sb.append("我希望遇到真心待我善解人意的另一半，组建一个温馨的家庭，如果你对我的第一印象还不错，我们继续聊聊？");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m128918b(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return "学生";
        }
        return (TextUtils.isEmpty(profile.work.department) || TextUtils.equals(user.profile.work.department, "其他") || TextUtils.equals(user.profile.work.department, "其它") || TextUtils.equals(user.profile.work.department, "学生")) ? "xx" : user.profile.work.department;
    }

    /* JADX INFO: renamed from: c */
    public static String m128919c(User user) {
        return !TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? i0g0.m133869j0(user.profile.zodiac) : "xx";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m128920d(String str) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f27884l2)) || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }
}
