package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.data.MarryConfig;
import com.p051p1.mobile.putong.core.data.MarryGuideConfig;
import com.p051p1.mobile.putong.core.data.MarryRedDot;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class n3x {

    /* JADX INFO: renamed from: l.n3x$a */
    public class C18773a implements qcj<LabelData, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f140041a;

        public C18773a(String str) {
            this.f140041a = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(LabelData labelData) {
            return Boolean.valueOf(TextUtils.equals(labelData.name, this.f140041a));
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m161355A(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = pzi0.f154855b.format(Long.valueOf(pzi0.m174454o()));
        if (!TextUtils.equals(CoreModule.f18264c.f20405m0.f20185q1.get(), str2)) {
            CoreModule.f18264c.f20405m0.f20185q1.put(str2);
            CoreModule.f18264c.f20405m0.f20188r1.clear();
            CoreModule.f18264c.f20405m0.f20188r1.put(str);
            return;
        }
        String str3 = CoreModule.f18264c.f20405m0.f20188r1.get();
        if (TextUtils.isEmpty(str3)) {
            CoreModule.f18264c.f20405m0.f20188r1.put(str);
            return;
        }
        CoreModule.f18264c.f20405m0.f20188r1.put(str3 + "#" + str);
    }

    /* JADX INFO: renamed from: B */
    public static void m161356B(Act act, boolean z) {
        if (z && !CoreModule.f18264c.f20381e0.m116545b8(false)) {
            act.startActivity(MarryInfoAuditStatusAct.m48584a2(act, "mode_switching"));
        } else {
            CoreModule.f18264c.f20381e0.f89178Z3.put(z ? UserHomeMode.marryMode : UserHomeMode.loveMode);
            CoreModule.f18264c.f20381e0.f89027F1.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m161357C(@NonNull List<LabelData> list, @NonNull User user, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || jyb.m147479J(userWealth.car)) {
            return;
        }
        String str = user.profile.extensions.wealth.car.get(0);
        if (m161380u(str)) {
            LabelData labelData = new LabelData();
            labelData.name = str;
            labelData.iconDrawableRes = dbc0.f86465P8;
            labelData.highlight = z;
            list.add(labelData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m161358D(@NonNull List<LabelData> list, @NonNull User user) {
        m161359E(list, user, true);
    }

    /* JADX INFO: renamed from: E */
    public static void m161359E(@NonNull List<LabelData> list, @NonNull User user, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || jyb.m147479J(userWealth.house) || TextUtils.isEmpty(user.profile.extensions.wealth.house.get(0))) {
            return;
        }
        String str = user.profile.extensions.wealth.house.get(0);
        if (m161380u(str)) {
            UserWealth userWealth2 = user.profile.extensions.wealth;
            List<String> list2 = userWealth2.houseRegion;
            List<String> list3 = userWealth2.houseSubRegion;
            String str2 = "";
            if (!jyb.m147479J(list3)) {
                String str3 = list3.get(0);
                if (!TextUtils.equals("", str3)) {
                    str2 = "" + str3;
                }
            }
            if (TextUtils.isEmpty(str2) && !jyb.m147479J(list2)) {
                str2 = list2.get(0);
            }
            LabelData labelData = new LabelData();
            labelData.name = str2 + str;
            labelData.iconDrawableRes = dbc0.f86625U8;
            labelData.highlight = z;
            list.add(labelData);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<LabelData> m161360a(User user) {
        List<LabelData> listM161363d = m161363d(user);
        List<LabelData> listM161379t = m161379t(user);
        if (jyb.m147479J(listM161379t) && listM161379t.size() > 6) {
            listM161379t = listM161379t.subList(0, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (LabelData labelData : listM161363d) {
            if (jyb.m147479J(jyb.m147522n(listM161379t, new C18773a(labelData.name)))) {
                arrayList.add(labelData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m161361b(User user, List<LabelData> list, boolean z) {
        Extensions extensions;
        Physical physical;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (physical = extensions.physical) == null || jyb.m147479J(physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
            return;
        }
        String str = user.profile.extensions.physical.height.get(0);
        if (m161380u(str) && Pattern.compile("[0-9]*").matcher(str).matches()) {
            try {
                int i = Integer.parseInt(str);
                LabelData labelData = new LabelData();
                if (user.isFemale() && i >= 160) {
                    labelData.name = str + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
                } else if (!user.isFemale() && i >= 175) {
                    labelData.name = str + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
                }
                labelData.highlight = z;
                if (TextUtils.isEmpty(labelData.name)) {
                    return;
                }
                list.add(labelData);
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m161362c(User user, List<LabelData> list, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || jyb.m147479J(userWealth.lowIncome) || TextUtils.isEmpty(user.profile.extensions.wealth.lowIncome.get(0))) {
            return;
        }
        String str = user.profile.extensions.wealth.lowIncome.get(0);
        try {
            String str2 = user.profile.extensions.wealth.upperIncome.get(0);
            if (m161380u(str)) {
                if ((!user.isFemale() || Integer.parseInt(str) < 200000) && (user.isFemale() || Integer.parseInt(str) < 300000)) {
                    return;
                }
                String string = "";
                if (TextUtils.equals(str, "200000") && TextUtils.equals(str2, "300000")) {
                    string = CoreModule.f18263b.getString(R$string.f19016Y);
                } else if (TextUtils.equals(str, "300000") && TextUtils.equals(str2, "600000")) {
                    string = CoreModule.f18263b.getString(R$string.f19046Z);
                } else if (TextUtils.equals(str, "600000") && TextUtils.equals(str2, "1000000")) {
                    string = CoreModule.f18263b.getString(R$string.f19077a0);
                } else if (TextUtils.equals(str, "1000000")) {
                    string = CoreModule.f18263b.getString(R$string.f19108b0);
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                LabelData labelData = new LabelData();
                labelData.highlight = z;
                labelData.name = "年收入" + string;
                list.add(labelData);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<LabelData> m161363d(User user) {
        ProfileZodiac profileZodiac;
        Extensions extensions;
        Extensions extensions2;
        ProfileExtensionBasic profileExtensionBasic;
        Extensions extensions3;
        ProfileExtensionBasic profileExtensionBasic2;
        Extensions extensions4;
        Physical physical;
        Extensions extensions5;
        ProfileExtensionMarriage profileExtensionMarriage;
        Extensions extensions6;
        ProfileExtensionMarriage profileExtensionMarriage2;
        ArrayList arrayList = new ArrayList();
        if (user != null) {
            Profile profile = user.profile;
            if (profile != null && (extensions6 = profile.extensions) != null && (profileExtensionMarriage2 = extensions6.marriage) != null && !jyb.m147479J(profileExtensionMarriage2.status) && !TextUtils.isEmpty(user.profile.extensions.marriage.status.get(0))) {
                String str = user.profile.extensions.marriage.status.get(0);
                if (m161380u(str)) {
                    LabelData labelData = new LabelData();
                    str.getClass();
                    switch (str) {
                        case "single":
                            labelData.name = "未婚未育";
                            break;
                        case "single_since_birth":
                            labelData.name = "母胎单身";
                            break;
                        case "divorced_with_child":
                            labelData.name = "离异有孩子";
                            break;
                        case "divorced_without_child":
                            labelData.name = "离异无孩子";
                            break;
                    }
                    if (!TextUtils.isEmpty(labelData.name)) {
                        labelData.iconDrawableRes = dbc0.f86598Td;
                        arrayList.add(labelData);
                    }
                }
            }
            Profile profile2 = user.profile;
            if (profile2 != null && (extensions5 = profile2.extensions) != null && (profileExtensionMarriage = extensions5.marriage) != null && !jyb.m147479J(profileExtensionMarriage.babyWilling) && !TextUtils.isEmpty(user.profile.extensions.marriage.babyWilling.get(0))) {
                String str2 = user.profile.extensions.marriage.babyWilling.get(0);
                if (m161380u(str2)) {
                    LabelData labelData2 = new LabelData();
                    str2.getClass();
                    switch (str2) {
                        case "want":
                            labelData2.name = "想要孩子";
                            break;
                        case "leave_it_to_fate":
                            labelData2.name = "生孩子随缘";
                            break;
                        case "not_want":
                            labelData2.name = "不要孩子";
                            break;
                    }
                    if (!TextUtils.isEmpty(labelData2.name)) {
                        labelData2.iconDrawableRes = dbc0.f86374Md;
                        arrayList.add(labelData2);
                    }
                }
            }
            Profile profile3 = user.profile;
            if (profile3 != null && (extensions4 = profile3.extensions) != null && (physical = extensions4.physical) != null && !jyb.m147479J(physical.height)) {
                String str3 = user.profile.extensions.physical.height.get(0);
                if (m161380u(str3)) {
                    LabelData labelData3 = new LabelData();
                    labelData3.name = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
                    labelData3.iconDrawableRes = dbc0.f86771Yq;
                    arrayList.add(labelData3);
                }
            }
            String strM153006c = l5x.m153006c(MarrySeriesType.WEIGHT, user);
            if (m161380u(strM153006c)) {
                LabelData labelData4 = new LabelData();
                labelData4.name = strM153006c;
                labelData4.iconDrawableRes = dbc0.f86836ar;
                arrayList.add(labelData4);
            }
            Profile profile4 = user.profile;
            if (profile4 != null && (extensions3 = profile4.extensions) != null && (profileExtensionBasic2 = extensions3.basic) != null && !jyb.m147479J(profileExtensionBasic2.qualification)) {
                String str4 = user.profile.extensions.basic.qualification.get(0);
                if (m161380u(str4)) {
                    LabelData labelData5 = new LabelData();
                    labelData5.name = str4;
                    labelData5.iconDrawableRes = dbc0.f86721X8;
                    arrayList.add(labelData5);
                }
            }
            String strM153006c2 = l5x.m153006c(MarrySeriesType.INCOME, user);
            if (m161380u(strM153006c2)) {
                LabelData labelData6 = new LabelData();
                labelData6.name = "年收入" + strM153006c2;
                labelData6.iconDrawableRes = dbc0.f86657V8;
                arrayList.add(labelData6);
            }
            m161358D(arrayList, user);
            m161357C(arrayList, user, true);
            Profile profile5 = user.profile;
            if (profile5 != null && (extensions2 = profile5.extensions) != null && (profileExtensionBasic = extensions2.basic) != null && !jyb.m147479J(profileExtensionBasic.address)) {
                List<String> list = user.profile.extensions.basic.address;
                ArrayList<String> arrayList2 = new ArrayList();
                for (String str5 : list) {
                    if (!TextUtils.equals("中国", str5) && !arrayList2.contains(str5)) {
                        arrayList2.add(str5);
                    }
                }
                String str6 = "";
                for (String str7 : arrayList2) {
                    str6 = (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) ? str6 + str7 : str6 + "·" + str7;
                }
                LabelData labelData7 = new LabelData();
                labelData7.name = "现居".concat(str6);
                labelData7.iconDrawableRes = dbc0.f86869br;
                arrayList.add(labelData7);
            }
            String strM153006c3 = l5x.m153006c(MarrySeriesType.PROFESSION, user);
            if (m161380u(strM153006c3)) {
                LabelData labelData8 = new LabelData();
                labelData8.name = strM153006c3;
                labelData8.iconDrawableRes = dbc0.f86967er;
                arrayList.add(labelData8);
            }
            String strM153006c4 = l5x.m153006c(MarrySeriesType.MONTHLY_COST, user);
            if (m161380u(strM153006c4)) {
                LabelData labelData9 = new LabelData();
                labelData9.name = "月消费" + strM153006c4;
                labelData9.iconDrawableRes = dbc0.f86803Zq;
                arrayList.add(labelData9);
            }
            Profile profile6 = user.profile;
            if (profile6 != null && (extensions = profile6.extensions) != null && extensions.basic != null) {
                StringBuilder sb = new StringBuilder();
                String str8 = jyb.m147479J(profile6.extensions.basic.country) ? "" : profile6.extensions.basic.country.get(0);
                if (!TextUtils.isEmpty(str8) && !"中国".equals(str8)) {
                    sb.append(str8);
                }
                String str9 = jyb.m147479J(profile6.extensions.basic.province) ? "" : profile6.extensions.basic.province.get(0);
                if (!TextUtils.isEmpty(str9)) {
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb.append("·");
                    }
                    sb.append(str9);
                }
                String str10 = jyb.m147479J(profile6.extensions.basic.city) ? "" : profile6.extensions.basic.city.get(0);
                if (!TextUtils.equals(str9, str10) && !TextUtils.isEmpty(str10)) {
                    sb.append("·");
                    sb.append(str10);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    LabelData labelData10 = new LabelData();
                    labelData10.name = "来自 " + ((Object) sb);
                    labelData10.iconDrawableRes = dbc0.f86739Xq;
                    arrayList.add(labelData10);
                }
            }
            Profile profile7 = user.profile;
            if (profile7 != null && (profileZodiac = profile7.zodiac) != null) {
                pf60<Integer, String> pf60VarM175808m0 = q8g0.m175808m0(profileZodiac);
                LabelData labelData11 = new LabelData();
                labelData11.name = pf60VarM175808m0.f152157b;
                labelData11.iconDrawableRes = pf60VarM175808m0.f152156a.intValue();
                arrayList.add(labelData11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m161364e() {
        MarryRedDot marryRedDotM161377r = m161377r();
        if (marryRedDotM161377r == null || !marryRedDotM161377r.enable || ((!TextUtils.equals(marryRedDotM161377r.type, "all") && (!TextUtils.equals(marryRedDotM161377r.type, "part") || CoreModule.f18264c.f20381e0.f89290n4.get().booleanValue())) || TextUtils.isEmpty(marryRedDotM161377r.mark))) {
            return false;
        }
        return !TextUtils.equals(CoreModule.f18264c.f20381e0.f89298o4.get(), marryRedDotM161377r.mark);
    }

    /* JADX INFO: renamed from: f */
    public static List<User> m161365f(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            List<String> listM161378s = m161378s();
            if (jyb.m147479J(listM161378s)) {
                return list;
            }
            for (User user : list) {
                if (!listM161378s.contains(user.f56859id)) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m161366g() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        if (marryConfigM131739r0 == null) {
            return "";
        }
        String str = marryConfigM131739r0.card_border_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m161367h() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        return marryConfigM131739r0 != null ? marryConfigM131739r0.card_head_bg : "";
    }

    /* JADX INFO: renamed from: i */
    public static String m161368i() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        if (marryConfigM131739r0 == null) {
            return "";
        }
        String str = marryConfigM131739r0.card_label_bg_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m161369j() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        if (marryConfigM131739r0 != null) {
            return marryConfigM131739r0.enable_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static String m161370k() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        return marryConfigM131739r0 != null ? marryConfigM131739r0.pre_profile_head_bg : "";
    }

    /* JADX INFO: renamed from: l */
    public static String m161371l() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        return marryConfigM131739r0 != null ? marryConfigM131739r0.profile_head_bg_android : "";
    }

    /* JADX INFO: renamed from: m */
    public static String m161372m() {
        MarryConfig marryConfigM131739r0 = gra.m131739r0();
        if (marryConfigM131739r0 == null) {
            return "";
        }
        String str = marryConfigM131739r0.profile_head_state_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m161373n() {
        MarryGuideConfig marryGuideConfigM131744s0 = gra.m131744s0();
        if (NullChecker.m82486a(marryGuideConfigM131744s0)) {
            return marryGuideConfigM131744s0.scroll_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static List<LabelData> m161374o(User user) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List<String> list;
        Extensions extensions2;
        ProfileExtensionMarriage profileExtensionMarriage2;
        Extensions extensions3;
        ProfileExtensionMarriage profileExtensionMarriage3;
        ArrayList arrayList = new ArrayList();
        if (user != null) {
            Profile profile = user.profile;
            if (profile != null && (extensions3 = profile.extensions) != null && (profileExtensionMarriage3 = extensions3.marriage) != null && !jyb.m147479J(profileExtensionMarriage3.mateAge)) {
                String strM153006c = l5x.m153006c(MarrySeriesType.MATE_AGE_EDIT, user);
                if (m161380u(strM153006c)) {
                    LabelData labelData = new LabelData();
                    labelData.name = strM153006c;
                    arrayList.add(labelData);
                }
            }
            Profile profile2 = user.profile;
            if (profile2 != null && (extensions2 = profile2.extensions) != null && (profileExtensionMarriage2 = extensions2.marriage) != null && !jyb.m147479J(profileExtensionMarriage2.mateQualification) && !TextUtils.isEmpty(user.profile.extensions.marriage.mateQualification.get(0))) {
                String str = user.profile.extensions.marriage.mateQualification.get(0);
                if (m161380u(str)) {
                    LabelData labelData2 = new LabelData();
                    str.getClass();
                    switch (str) {
                        case "doctor":
                            labelData2.name = "博士";
                            break;
                        case "master":
                            labelData2.name = "硕士及以上";
                            break;
                        case "associate":
                            labelData2.name = "大专及以上";
                            break;
                        case "bachelor":
                            labelData2.name = "本科及以上";
                            break;
                    }
                    if (!TextUtils.isEmpty(labelData2.name)) {
                        arrayList.add(labelData2);
                    }
                }
            }
            String strM153006c2 = l5x.m153006c(MarrySeriesType.MATE_INCOME, user);
            if (m161380u(strM153006c2)) {
                LabelData labelData3 = new LabelData();
                labelData3.name = "年收入" + strM153006c2;
                arrayList.add(labelData3);
            }
            Profile profile3 = user.profile;
            if (profile3 != null && (extensions = profile3.extensions) != null && (profileExtensionMarriage = extensions.marriage) != null && (list = profileExtensionMarriage.mateHeight) != null && list.size() == 2) {
                String strM161376q = m161376q(user.profile.extensions.marriage.mateHeight);
                if (m161380u(strM161376q)) {
                    LabelData labelData4 = new LabelData();
                    labelData4.name = strM161376q;
                    arrayList.add(labelData4);
                }
            }
            m161384y(arrayList, user);
            if (arrayList.size() > 5) {
                return arrayList.subList(0, 5);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static String m161375p(User user) {
        String[] strArr = new String[3];
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "";
        if (jyb.m147479J(user.profile.extensions.basic.address)) {
            return "";
        }
        for (int i = 0; i < 3; i++) {
            if (user.profile.extensions.basic.address.size() > i) {
                strArr[i] = user.profile.extensions.basic.address.get(i);
            }
        }
        return !TextUtils.isEmpty(strArr[2]) ? strArr[2] : strArr[1];
    }

    /* JADX INFO: renamed from: q */
    public static String m161376q(List<String> list) {
        String str = jyb.m147479J(list) ? "unlimited" : list.get(0);
        String str2 = jyb.m147479J(list) ? "unlimited" : list.get(1);
        if (TextUtils.equals(str, "unlimited") && TextUtils.equals(str2, "unlimited")) {
            return "不限";
        }
        if (TextUtils.equals(str, "unlimited")) {
            return String.format(Locale.CHINA, "%scm以下", str2);
        }
        if (TextUtils.equals(str2, "unlimited")) {
            return String.format(Locale.CHINA, "%scm以上", str);
        }
        return TextUtils.equals(str, str2) ? String.format(Locale.CHINA, "%scm", str) : String.format(Locale.CHINA, "%s - %scm", str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static MarryRedDot m161377r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static List<String> m161378s() {
        ArrayList arrayList = new ArrayList();
        String str = pzi0.f154855b.format(Long.valueOf(pzi0.m174454o()));
        if (!TextUtils.equals(CoreModule.f18264c.f20405m0.f20185q1.get(), str)) {
            CoreModule.f18264c.f20405m0.f20185q1.put(str);
            CoreModule.f18264c.f20405m0.f20188r1.clear();
            return arrayList;
        }
        String str2 = CoreModule.f18264c.f20405m0.f20188r1.get();
        if (!TextUtils.isEmpty(str2)) {
            for (String str3 : str2.split("#")) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e8 A[Catch: Exception -> 0x02c5, TRY_LEAVE, TryCatch #5 {Exception -> 0x02c5, blocks: (B:143:0x0294, B:145:0x02a8, B:148:0x02af, B:150:0x02b5, B:159:0x02cd, B:161:0x02e8, B:153:0x02c2), top: B:278:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:218:0x0457  */
    /* JADX WARN: Code duplicated, block: B:280:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX INFO: renamed from: t */
    public static List<LabelData> m161379t(User user) {
        boolean z;
        boolean z2;
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List<String> list;
        Extensions extensions2;
        Physical physical;
        Extensions extensions3;
        ProfileExtensionMarriage profileExtensionMarriage2;
        List<String> list2;
        Extensions extensions4;
        UserWealth userWealth;
        boolean z3;
        String strM153006c;
        Extensions extensions5;
        ProfileExtensionMarriage profileExtensionMarriage3;
        Extensions extensions6;
        ProfileExtensionMarriage profileExtensionMarriage4;
        Extensions extensions7;
        ProfileExtensionMarriage profileExtensionMarriage5;
        ArrayList arrayList = new ArrayList();
        User userMe_ = CoreModule.m30930K().me_();
        Profile profile = user.profile;
        String str = null;
        String str2 = (profile == null || (extensions7 = profile.extensions) == null || (profileExtensionMarriage5 = extensions7.marriage) == null || jyb.m147479J(profileExtensionMarriage5.status) || TextUtils.isEmpty(user.profile.extensions.marriage.status.get(0))) ? null : user.profile.extensions.marriage.status.get(0);
        Profile profile2 = userMe_.profile;
        String str3 = (profile2 == null || (extensions6 = profile2.extensions) == null || (profileExtensionMarriage4 = extensions6.marriage) == null || jyb.m147479J(profileExtensionMarriage4.mateStatus) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateStatus.get(0))) ? null : userMe_.profile.extensions.marriage.mateStatus.get(0);
        boolean z4 = true;
        if (m161380u(str2)) {
            LabelData labelData = new LabelData();
            str2.getClass();
            switch (str2) {
                case "single":
                    labelData.name = "未婚未育";
                    break;
                case "divorced_with_child":
                    labelData.name = "离异有孩子";
                    break;
                case "divorced_without_child":
                    labelData.name = "离异无孩子";
                    break;
            }
            if (TextUtils.equals(str3, "unlimited") || ((TextUtils.equals(str3, "unmarried") && TextUtils.equals(str2, "single")) || (TextUtils.equals(str3, "divorced") && (TextUtils.equals(str2, "divorced_without_child") || TextUtils.equals(str2, "divorced_with_child"))))) {
                arrayList.add(labelData);
            }
        }
        ArrayList arrayListM147507f0 = jyb.m147507f0("大专以下", "大专", "本科", "硕士", "博士");
        Profile profile3 = userMe_.profile;
        String str4 = (profile3 == null || (extensions5 = profile3.extensions) == null || (profileExtensionMarriage3 = extensions5.marriage) == null || jyb.m147479J(profileExtensionMarriage3.mateQualification) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateQualification.get(0))) ? "unlimited" : userMe_.profile.extensions.marriage.mateQualification.get(0);
        if (NullChecker.m82486a(user.profile.extensions.basic.qualification) && !jyb.m147479J(user.profile.extensions.basic.qualification)) {
            str = user.profile.extensions.basic.qualification.get(0);
        }
        if (m161380u(str)) {
            LabelData labelData2 = new LabelData();
            str4.getClass();
            switch (str4) {
                case "doctor":
                    if (m161383x(arrayListM147507f0, str, 3) >= 4) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "master":
                    if (m161383x(arrayListM147507f0, str, 2) >= 3) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "associate":
                    if (m161383x(arrayListM147507f0, str, 0) >= 1) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "unlimited":
                    if (m161383x(arrayListM147507f0, str, 0) >= 0) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "bachelor":
                    if (m161383x(arrayListM147507f0, str, 1) >= 2) {
                        labelData2.name = str;
                        break;
                    }
                    break;
            }
            if (TextUtils.isEmpty(labelData2.name)) {
                z = false;
            } else {
                arrayList.add(labelData2);
                z = true;
            }
        } else {
            z = false;
        }
        String str5 = (!NullChecker.m82486a(userMe_.profile.extensions.marriage) || jyb.m147479J(userMe_.profile.extensions.marriage.mateIncome) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateIncome.get(0))) ? "unlimited" : userMe_.profile.extensions.marriage.mateIncome.get(0);
        ArrayList arrayListM147507f1 = jyb.m147507f0("unlimited", "5w", "5-10w", "10-20w", "20-30w", "30-60w", "60-100w", "100w");
        ArrayList arrayListM147507f2 = jyb.m147507f0("-50000", "50000-100000", "100000-200000", "200000-300000", "300000-600000", "600000-1000000", "1000000-");
        Profile profile4 = user.profile;
        if (profile4 == null || (extensions4 = profile4.extensions) == null || (userWealth = extensions4.wealth) == null || jyb.m147479J(userWealth.lowIncome) || jyb.m147479J(user.profile.extensions.wealth.upperIncome)) {
            z2 = false;
        } else {
            String str6 = user.profile.extensions.wealth.lowIncome.get(0);
            try {
                String str7 = user.profile.extensions.wealth.upperIncome.get(0);
                if (m161381v(str6) && m161381v(str7)) {
                    int i = 0;
                    while (true) {
                        if (i >= arrayListM147507f1.size()) {
                            i = -1;
                        } else if (!TextUtils.equals(str5, (CharSequence) arrayListM147507f1.get(i))) {
                            i++;
                        }
                    }
                    if (i == 0) {
                        strM153006c = l5x.m153006c(MarrySeriesType.INCOME, user);
                        if (TextUtils.isEmpty(strM153006c)) {
                            z2 = false;
                        } else {
                            try {
                                LabelData labelData3 = new LabelData();
                                labelData3.name = "年收入" + strM153006c;
                                arrayList.add(labelData3);
                                z2 = true;
                            } catch (Exception e) {
                                e = e;
                                z3 = true;
                                CrashHelper.m82479c(e);
                                z2 = z3;
                            }
                        }
                    } else {
                        if (i > 0) {
                            int i2 = i - 1;
                            if (m161383x(arrayListM147507f2, str6 + "-" + str7, i2) == i2) {
                                strM153006c = l5x.m153006c(MarrySeriesType.INCOME, user);
                                if (TextUtils.isEmpty(strM153006c)) {
                                    LabelData labelData4 = new LabelData();
                                    labelData4.name = "年收入" + strM153006c;
                                    arrayList.add(labelData4);
                                    z2 = true;
                                }
                            }
                        }
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } catch (Exception e2) {
                e = e2;
                z3 = false;
            }
        }
        Profile profile5 = userMe_.profile;
        int i3 = 18;
        int i4 = 200;
        if (profile5 != null && (extensions3 = profile5.extensions) != null && (profileExtensionMarriage2 = extensions3.marriage) != null && (list2 = profileExtensionMarriage2.mateAge) != null && !jyb.m147479J(list2)) {
            try {
                i3 = Integer.parseInt(userMe_.profile.extensions.marriage.mateAge.get(0));
            } catch (Exception unused) {
            }
            if (userMe_.profile.extensions.marriage.mateAge.size() > 1) {
                try {
                    if (!TextUtils.equals(userMe_.profile.extensions.marriage.mateAge.get(1), "unlimited") && !TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateAge.get(1))) {
                        i4 = Integer.parseInt(userMe_.profile.extensions.marriage.mateAge.get(1));
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (user.age.intValue() >= i3 && user.age.intValue() <= i4) {
            LabelData labelData5 = new LabelData();
            labelData5.name = user.age + "岁";
            arrayList.add(labelData5);
        }
        Profile profile6 = user.profile;
        if (profile6 == null || (extensions2 = profile6.extensions) == null || (physical = extensions2.physical) == null || jyb.m147479J(physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
            z4 = false;
        } else {
            String str8 = user.profile.extensions.physical.height.get(0);
            if (m161380u(str8) && Pattern.compile("[0-9]*").matcher(str8).matches()) {
                try {
                    int i5 = Integer.parseInt(str8);
                    List<String> list3 = userMe_.profile.extensions.marriage.mateHeight;
                    int i6 = 140;
                    int i7 = 210;
                    if (!jyb.m147479J(list3)) {
                        try {
                            i6 = Integer.parseInt(list3.get(0));
                        } catch (Exception unused3) {
                        }
                        try {
                            if (list3.size() > 1) {
                                i7 = Integer.parseInt(list3.get(1));
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    if (i5 < i6 || i5 > i7) {
                        z4 = false;
                    } else {
                        LabelData labelData6 = new LabelData();
                        labelData6.name = str8 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
                        arrayList.add(labelData6);
                    }
                } catch (Exception unused5) {
                }
            } else {
                z4 = false;
            }
        }
        Profile profile7 = userMe_.profile;
        if (profile7 != null && (extensions = profile7.extensions) != null && (profileExtensionMarriage = extensions.marriage) != null && (list = profileExtensionMarriage.mateAddress) != null && list.size() > 0 && !TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateAddress.get(0))) {
            String str9 = userMe_.profile.extensions.marriage.mateAddress.get(0);
            LabelData labelData7 = new LabelData();
            if (TextUtils.equals(str9, "same_city")) {
                String strM161375p = m161375p(userMe_);
                String strM161375p2 = m161375p(user);
                if (!TextUtils.isEmpty(strM161375p) && TextUtils.equals(strM161375p, strM161375p2)) {
                    labelData7.name = strM161375p;
                }
                if (!TextUtils.isEmpty(labelData7.name)) {
                    arrayList.add(labelData7);
                }
            }
        }
        if (!z && m161380u(str) && m161383x(arrayListM147507f0, str, 0) >= 2) {
            LabelData labelData8 = new LabelData();
            labelData8.highlight = false;
            labelData8.name = str;
            arrayList.add(labelData8);
        }
        if (!z2) {
            m161362c(user, arrayList, false);
        }
        String strM153006c2 = l5x.m153006c(MarrySeriesType.PROFESSION, user);
        if (!TextUtils.isEmpty(strM153006c2) && (strM153006c2.contains("事业编") || strM153006c2.contains("公务员"))) {
            LabelData labelData9 = new LabelData();
            labelData9.highlight = false;
            labelData9.name = strM153006c2;
            arrayList.add(labelData9);
        }
        m161357C(arrayList, user, false);
        m161359E(arrayList, user, false);
        if (!z4) {
            m161361b(user, arrayList, false);
        }
        return arrayList.size() > 6 ? arrayList.subList(0, 6) : arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m161380u(String str) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m161381v(String str) {
        return (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public static void m161382w(Act act, String str) {
        CoreModule.f18264c.f20381e0.f89305p4.put(yab.m214864U());
        StringBuilder sb = new StringBuilder();
        sb.append(zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/marriage-activity-2024/index.html?speed=true&_bid=1004591&hideNavigationBar=1&hideNotch=1&from=");
        sb.append(str);
        act.startActivity(MkWebViewAct.m81423g2(act, "", sb.toString(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: x */
    public static int m161383x(List<String> list, String str, int i) {
        if (jyb.m147479J(list) || TextUtils.isEmpty(str) || i > list.size()) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < list.size()) {
            if (TextUtils.equals(str, list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static void m161384y(@NonNull List<LabelData> list, @NonNull User user) {
        Extensions extensions;
        ProfileExtensionMarriage profileExtensionMarriage;
        List<String> list2;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (profileExtensionMarriage = extensions.marriage) == null || (list2 = profileExtensionMarriage.mateAddress) == null || list2.size() <= 0 || TextUtils.isEmpty(user.profile.extensions.marriage.mateAddress.get(0))) {
            return;
        }
        String str = user.profile.extensions.marriage.mateAddress.get(0);
        LabelData labelData = new LabelData();
        if (TextUtils.equals(str, "same_city")) {
            labelData.name = "不接受异地";
        } else if (TextUtils.equals(str, "different_city")) {
            labelData.name = "可接受异地";
        }
        if (TextUtils.isEmpty(labelData.name)) {
            return;
        }
        list.add(labelData);
    }

    /* JADX INFO: renamed from: z */
    public static void m161385z(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            nwb.m164976n(media);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127160x0(media.url);
        }
    }
}
