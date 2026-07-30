package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.data.MarryConfig;
import com.p046p1.mobile.putong.core.data.MarryGuideConfig;
import com.p046p1.mobile.putong.core.data.MarryRedDot;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class o0x {

    /* JADX INFO: renamed from: l.o0x$a */
    public class C18812a implements w9j<LabelData, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f141389a;

        public C18812a(String str) {
            this.f141389a = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(LabelData labelData) {
            return Boolean.valueOf(TextUtils.equals(labelData.name, this.f141389a));
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m162187A(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = mqi0.f135250b.format(Long.valueOf(mqi0.m155944o()));
        if (!TextUtils.equals(CoreModule.f17545c.f19663m0.f19443q1.get(), str2)) {
            CoreModule.f17545c.f19663m0.f19443q1.put(str2);
            CoreModule.f17545c.f19663m0.f19446r1.clear();
            CoreModule.f17545c.f19663m0.f19446r1.put(str);
            return;
        }
        String str3 = CoreModule.f17545c.f19663m0.f19446r1.get();
        if (TextUtils.isEmpty(str3)) {
            CoreModule.f17545c.f19663m0.f19446r1.put(str);
            return;
        }
        CoreModule.f17545c.f19663m0.f19446r1.put(str3 + "#" + str);
    }

    /* JADX INFO: renamed from: B */
    public static void m162188B(Act act, boolean z) {
        if (z && !CoreModule.f17545c.f19639e0.m169472b8(false)) {
            act.startActivity(MarryInfoAuditStatusAct.m47401Z1(act, "mode_switching"));
        } else {
            CoreModule.f17545c.f19639e0.f149321Z3.put(z ? UserHomeMode.marryMode : UserHomeMode.loveMode);
            CoreModule.f17545c.f19639e0.f149170F1.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m162189C(@NonNull List<LabelData> list, @NonNull User user, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || vwb.m200296J(userWealth.car)) {
            return;
        }
        String str = user.profile.extensions.wealth.car.get(0);
        if (m162212u(str)) {
            LabelData labelData = new LabelData();
            labelData.name = str;
            labelData.iconDrawableRes = x2c0.f189602O8;
            labelData.highlight = z;
            list.add(labelData);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m162190D(@NonNull List<LabelData> list, @NonNull User user) {
        m162191E(list, user, true);
    }

    /* JADX INFO: renamed from: E */
    public static void m162191E(@NonNull List<LabelData> list, @NonNull User user, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || vwb.m200296J(userWealth.house) || TextUtils.isEmpty(user.profile.extensions.wealth.house.get(0))) {
            return;
        }
        String str = user.profile.extensions.wealth.house.get(0);
        if (m162212u(str)) {
            UserWealth userWealth2 = user.profile.extensions.wealth;
            List<String> list2 = userWealth2.houseRegion;
            List<String> list3 = userWealth2.houseSubRegion;
            String str2 = "";
            if (!vwb.m200296J(list3)) {
                String str3 = list3.get(0);
                if (!TextUtils.equals("", str3)) {
                    str2 = "" + str3;
                }
            }
            if (TextUtils.isEmpty(str2) && !vwb.m200296J(list2)) {
                str2 = list2.get(0);
            }
            LabelData labelData = new LabelData();
            labelData.name = str2 + str;
            labelData.iconDrawableRes = x2c0.f189757T8;
            labelData.highlight = z;
            list.add(labelData);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<LabelData> m162192a(User user) {
        List<LabelData> listM162195d = m162195d(user);
        List<LabelData> listM162211t = m162211t(user);
        if (vwb.m200296J(listM162211t) && listM162211t.size() > 6) {
            listM162211t = listM162211t.subList(0, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (LabelData labelData : listM162195d) {
            if (vwb.m200296J(vwb.m200339n(listM162211t, new C18812a(labelData.name)))) {
                arrayList.add(labelData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m162193b(User user, List<LabelData> list, boolean z) {
        Extensions extensions;
        Physical physical;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (physical = extensions.physical) == null || vwb.m200296J(physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
            return;
        }
        String str = user.profile.extensions.physical.height.get(0);
        if (m162212u(str) && Pattern.compile("[0-9]*").matcher(str).matches()) {
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
    public static void m162194c(User user, List<LabelData> list, boolean z) {
        Extensions extensions;
        UserWealth userWealth;
        Profile profile = user.profile;
        if (profile == null || (extensions = profile.extensions) == null || (userWealth = extensions.wealth) == null || vwb.m200296J(userWealth.lowIncome) || TextUtils.isEmpty(user.profile.extensions.wealth.lowIncome.get(0))) {
            return;
        }
        String str = user.profile.extensions.wealth.lowIncome.get(0);
        try {
            String str2 = user.profile.extensions.wealth.upperIncome.get(0);
            if (m162212u(str)) {
                if ((!user.isFemale() || Integer.parseInt(str) < 200000) && (user.isFemale() || Integer.parseInt(str) < 300000)) {
                    return;
                }
                String string = "";
                if (TextUtils.equals(str, "200000") && TextUtils.equals(str2, "300000")) {
                    string = CoreModule.f17544b.getString(R$string.f18286Y);
                } else if (TextUtils.equals(str, "300000") && TextUtils.equals(str2, "600000")) {
                    string = CoreModule.f17544b.getString(R$string.f18316Z);
                } else if (TextUtils.equals(str, "600000") && TextUtils.equals(str2, "1000000")) {
                    string = CoreModule.f17544b.getString(R$string.f18347a0);
                } else if (TextUtils.equals(str, "1000000")) {
                    string = CoreModule.f17544b.getString(R$string.f18378b0);
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
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<LabelData> m162195d(User user) {
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
            if (profile != null && (extensions6 = profile.extensions) != null && (profileExtensionMarriage2 = extensions6.marriage) != null && !vwb.m200296J(profileExtensionMarriage2.status) && !TextUtils.isEmpty(user.profile.extensions.marriage.status.get(0))) {
                String str = user.profile.extensions.marriage.status.get(0);
                if (m162212u(str)) {
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
                        labelData.iconDrawableRes = x2c0.f189731Sd;
                        arrayList.add(labelData);
                    }
                }
            }
            Profile profile2 = user.profile;
            if (profile2 != null && (extensions5 = profile2.extensions) != null && (profileExtensionMarriage = extensions5.marriage) != null && !vwb.m200296J(profileExtensionMarriage.babyWilling) && !TextUtils.isEmpty(user.profile.extensions.marriage.babyWilling.get(0))) {
                String str2 = user.profile.extensions.marriage.babyWilling.get(0);
                if (m162212u(str2)) {
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
                        labelData2.iconDrawableRes = x2c0.f189514Ld;
                        arrayList.add(labelData2);
                    }
                }
            }
            Profile profile3 = user.profile;
            if (profile3 != null && (extensions4 = profile3.extensions) != null && (physical = extensions4.physical) != null && !vwb.m200296J(physical.height)) {
                String str3 = user.profile.extensions.physical.height.get(0);
                if (m162212u(str3)) {
                    LabelData labelData3 = new LabelData();
                    labelData3.name = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
                    labelData3.iconDrawableRes = x2c0.f190309kq;
                    arrayList.add(labelData3);
                }
            }
            String strM152721c = m2x.m152721c(MarrySeriesType.WEIGHT, user);
            if (m162212u(strM152721c)) {
                LabelData labelData4 = new LabelData();
                labelData4.name = strM152721c;
                labelData4.iconDrawableRes = x2c0.f190373mq;
                arrayList.add(labelData4);
            }
            Profile profile4 = user.profile;
            if (profile4 != null && (extensions3 = profile4.extensions) != null && (profileExtensionBasic2 = extensions3.basic) != null && !vwb.m200296J(profileExtensionBasic2.qualification)) {
                String str4 = user.profile.extensions.basic.qualification.get(0);
                if (m162212u(str4)) {
                    LabelData labelData5 = new LabelData();
                    labelData5.name = str4;
                    labelData5.iconDrawableRes = x2c0.f189850W8;
                    arrayList.add(labelData5);
                }
            }
            String strM152721c2 = m2x.m152721c(MarrySeriesType.INCOME, user);
            if (m162212u(strM152721c2)) {
                LabelData labelData6 = new LabelData();
                labelData6.name = "年收入" + strM152721c2;
                labelData6.iconDrawableRes = x2c0.f189788U8;
                arrayList.add(labelData6);
            }
            m162190D(arrayList, user);
            m162189C(arrayList, user, true);
            Profile profile5 = user.profile;
            if (profile5 != null && (extensions2 = profile5.extensions) != null && (profileExtensionBasic = extensions2.basic) != null && !vwb.m200296J(profileExtensionBasic.address)) {
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
                labelData7.iconDrawableRes = x2c0.f190405nq;
                arrayList.add(labelData7);
            }
            String strM152721c3 = m2x.m152721c(MarrySeriesType.PROFESSION, user);
            if (m162212u(strM152721c3)) {
                LabelData labelData8 = new LabelData();
                labelData8.name = strM152721c3;
                labelData8.iconDrawableRes = x2c0.f190501qq;
                arrayList.add(labelData8);
            }
            String strM152721c4 = m2x.m152721c(MarrySeriesType.MONTHLY_COST, user);
            if (m162212u(strM152721c4)) {
                LabelData labelData9 = new LabelData();
                labelData9.name = "月消费" + strM152721c4;
                labelData9.iconDrawableRes = x2c0.f190341lq;
                arrayList.add(labelData9);
            }
            Profile profile6 = user.profile;
            if (profile6 != null && (extensions = profile6.extensions) != null && extensions.basic != null) {
                StringBuilder sb = new StringBuilder();
                String str8 = vwb.m200296J(profile6.extensions.basic.country) ? "" : profile6.extensions.basic.country.get(0);
                if (!TextUtils.isEmpty(str8) && !"中国".equals(str8)) {
                    sb.append(str8);
                }
                String str9 = vwb.m200296J(profile6.extensions.basic.province) ? "" : profile6.extensions.basic.province.get(0);
                if (!TextUtils.isEmpty(str9)) {
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb.append("·");
                    }
                    sb.append(str9);
                }
                String str10 = vwb.m200296J(profile6.extensions.basic.city) ? "" : profile6.extensions.basic.city.get(0);
                if (!TextUtils.equals(str9, str10) && !TextUtils.isEmpty(str10)) {
                    sb.append("·");
                    sb.append(str10);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    LabelData labelData10 = new LabelData();
                    labelData10.name = "来自 " + ((Object) sb);
                    labelData10.iconDrawableRes = x2c0.f190277jq;
                    arrayList.add(labelData10);
                }
            }
            Profile profile7 = user.profile;
            if (profile7 != null && (profileZodiac = profile7.zodiac) != null) {
                j760<Integer, String> j760VarM133873m0 = i0g0.m133873m0(profileZodiac);
                LabelData labelData11 = new LabelData();
                labelData11.name = j760VarM133873m0.f116565b;
                labelData11.iconDrawableRes = j760VarM133873m0.f116564a.intValue();
                arrayList.add(labelData11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m162196e() {
        MarryRedDot marryRedDotM162209r = m162209r();
        if (marryRedDotM162209r == null || !marryRedDotM162209r.enable || ((!TextUtils.equals(marryRedDotM162209r.type, "all") && (!TextUtils.equals(marryRedDotM162209r.type, "part") || CoreModule.f17545c.f19639e0.f149433n4.get().booleanValue())) || TextUtils.isEmpty(marryRedDotM162209r.mark))) {
            return false;
        }
        return !TextUtils.equals(CoreModule.f17545c.f19639e0.f149441o4.get(), marryRedDotM162209r.mark);
    }

    /* JADX INFO: renamed from: f */
    public static List<User> m162197f(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            List<String> listM162210s = m162210s();
            if (vwb.m200296J(listM162210s)) {
                return list;
            }
            for (User user : list) {
                if (!listM162210s.contains(user.f56011id)) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m162198g() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        if (marryConfigM194808r0 == null) {
            return "";
        }
        String str = marryConfigM194808r0.card_border_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m162199h() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        return marryConfigM194808r0 != null ? marryConfigM194808r0.card_head_bg : "";
    }

    /* JADX INFO: renamed from: i */
    public static String m162200i() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        if (marryConfigM194808r0 == null) {
            return "";
        }
        String str = marryConfigM194808r0.card_label_bg_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m162201j() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        if (marryConfigM194808r0 != null) {
            return marryConfigM194808r0.enable_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static String m162202k() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        return marryConfigM194808r0 != null ? marryConfigM194808r0.pre_profile_head_bg : "";
    }

    /* JADX INFO: renamed from: l */
    public static String m162203l() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        return marryConfigM194808r0 != null ? marryConfigM194808r0.profile_head_bg_android : "";
    }

    /* JADX INFO: renamed from: m */
    public static String m162204m() {
        MarryConfig marryConfigM194808r0 = upa.m194808r0();
        if (marryConfigM194808r0 == null) {
            return "";
        }
        String str = marryConfigM194808r0.profile_head_state_color;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m162205n() {
        MarryGuideConfig marryGuideConfigM194813s0 = upa.m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            return marryGuideConfigM194813s0.scroll_pay_wall;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static List<LabelData> m162206o(User user) {
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
            if (profile != null && (extensions3 = profile.extensions) != null && (profileExtensionMarriage3 = extensions3.marriage) != null && !vwb.m200296J(profileExtensionMarriage3.mateAge)) {
                String strM152721c = m2x.m152721c(MarrySeriesType.MATE_AGE_EDIT, user);
                if (m162212u(strM152721c)) {
                    LabelData labelData = new LabelData();
                    labelData.name = strM152721c;
                    arrayList.add(labelData);
                }
            }
            Profile profile2 = user.profile;
            if (profile2 != null && (extensions2 = profile2.extensions) != null && (profileExtensionMarriage2 = extensions2.marriage) != null && !vwb.m200296J(profileExtensionMarriage2.mateQualification) && !TextUtils.isEmpty(user.profile.extensions.marriage.mateQualification.get(0))) {
                String str = user.profile.extensions.marriage.mateQualification.get(0);
                if (m162212u(str)) {
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
            String strM152721c2 = m2x.m152721c(MarrySeriesType.MATE_INCOME, user);
            if (m162212u(strM152721c2)) {
                LabelData labelData3 = new LabelData();
                labelData3.name = "年收入" + strM152721c2;
                arrayList.add(labelData3);
            }
            Profile profile3 = user.profile;
            if (profile3 != null && (extensions = profile3.extensions) != null && (profileExtensionMarriage = extensions.marriage) != null && (list = profileExtensionMarriage.mateHeight) != null && list.size() == 2) {
                String strM162208q = m162208q(user.profile.extensions.marriage.mateHeight);
                if (m162212u(strM162208q)) {
                    LabelData labelData4 = new LabelData();
                    labelData4.name = strM162208q;
                    arrayList.add(labelData4);
                }
            }
            m162216y(arrayList, user);
            if (arrayList.size() > 5) {
                return arrayList.subList(0, 5);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static String m162207p(User user) {
        String[] strArr = new String[3];
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "";
        if (vwb.m200296J(user.profile.extensions.basic.address)) {
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
    public static String m162208q(List<String> list) {
        String str = vwb.m200296J(list) ? "unlimited" : list.get(0);
        String str2 = vwb.m200296J(list) ? "unlimited" : list.get(1);
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
    public static MarryRedDot m162209r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static List<String> m162210s() {
        ArrayList arrayList = new ArrayList();
        String str = mqi0.f135250b.format(Long.valueOf(mqi0.m155944o()));
        if (!TextUtils.equals(CoreModule.f17545c.f19663m0.f19443q1.get(), str)) {
            CoreModule.f17545c.f19663m0.f19443q1.put(str);
            CoreModule.f17545c.f19663m0.f19446r1.clear();
            return arrayList;
        }
        String str2 = CoreModule.f17545c.f19663m0.f19446r1.get();
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
    public static List<LabelData> m162211t(User user) {
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
        String strM152721c;
        Extensions extensions5;
        ProfileExtensionMarriage profileExtensionMarriage3;
        Extensions extensions6;
        ProfileExtensionMarriage profileExtensionMarriage4;
        Extensions extensions7;
        ProfileExtensionMarriage profileExtensionMarriage5;
        ArrayList arrayList = new ArrayList();
        User userMe_ = CoreModule.m29932K().me_();
        Profile profile = user.profile;
        String str = null;
        String str2 = (profile == null || (extensions7 = profile.extensions) == null || (profileExtensionMarriage5 = extensions7.marriage) == null || vwb.m200296J(profileExtensionMarriage5.status) || TextUtils.isEmpty(user.profile.extensions.marriage.status.get(0))) ? null : user.profile.extensions.marriage.status.get(0);
        Profile profile2 = userMe_.profile;
        String str3 = (profile2 == null || (extensions6 = profile2.extensions) == null || (profileExtensionMarriage4 = extensions6.marriage) == null || vwb.m200296J(profileExtensionMarriage4.mateStatus) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateStatus.get(0))) ? null : userMe_.profile.extensions.marriage.mateStatus.get(0);
        boolean z4 = true;
        if (m162212u(str2)) {
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
        ArrayList arrayListM200324f0 = vwb.m200324f0("大专以下", "大专", "本科", "硕士", "博士");
        Profile profile3 = userMe_.profile;
        String str4 = (profile3 == null || (extensions5 = profile3.extensions) == null || (profileExtensionMarriage3 = extensions5.marriage) == null || vwb.m200296J(profileExtensionMarriage3.mateQualification) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateQualification.get(0))) ? "unlimited" : userMe_.profile.extensions.marriage.mateQualification.get(0);
        if (NullChecker.m81303a(user.profile.extensions.basic.qualification) && !vwb.m200296J(user.profile.extensions.basic.qualification)) {
            str = user.profile.extensions.basic.qualification.get(0);
        }
        if (m162212u(str)) {
            LabelData labelData2 = new LabelData();
            str4.getClass();
            switch (str4) {
                case "doctor":
                    if (m162215x(arrayListM200324f0, str, 3) >= 4) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "master":
                    if (m162215x(arrayListM200324f0, str, 2) >= 3) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "associate":
                    if (m162215x(arrayListM200324f0, str, 0) >= 1) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "unlimited":
                    if (m162215x(arrayListM200324f0, str, 0) >= 0) {
                        labelData2.name = str;
                        break;
                    }
                    break;
                case "bachelor":
                    if (m162215x(arrayListM200324f0, str, 1) >= 2) {
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
        String str5 = (!NullChecker.m81303a(userMe_.profile.extensions.marriage) || vwb.m200296J(userMe_.profile.extensions.marriage.mateIncome) || TextUtils.isEmpty(userMe_.profile.extensions.marriage.mateIncome.get(0))) ? "unlimited" : userMe_.profile.extensions.marriage.mateIncome.get(0);
        ArrayList arrayListM200324f1 = vwb.m200324f0("unlimited", "5w", "5-10w", "10-20w", "20-30w", "30-60w", "60-100w", "100w");
        ArrayList arrayListM200324f2 = vwb.m200324f0("-50000", "50000-100000", "100000-200000", "200000-300000", "300000-600000", "600000-1000000", "1000000-");
        Profile profile4 = user.profile;
        if (profile4 == null || (extensions4 = profile4.extensions) == null || (userWealth = extensions4.wealth) == null || vwb.m200296J(userWealth.lowIncome) || vwb.m200296J(user.profile.extensions.wealth.upperIncome)) {
            z2 = false;
        } else {
            String str6 = user.profile.extensions.wealth.lowIncome.get(0);
            try {
                String str7 = user.profile.extensions.wealth.upperIncome.get(0);
                if (m162213v(str6) && m162213v(str7)) {
                    int i = 0;
                    while (true) {
                        if (i >= arrayListM200324f1.size()) {
                            i = -1;
                        } else if (!TextUtils.equals(str5, (CharSequence) arrayListM200324f1.get(i))) {
                            i++;
                        }
                    }
                    if (i == 0) {
                        strM152721c = m2x.m152721c(MarrySeriesType.INCOME, user);
                        if (TextUtils.isEmpty(strM152721c)) {
                            z2 = false;
                        } else {
                            try {
                                LabelData labelData3 = new LabelData();
                                labelData3.name = "年收入" + strM152721c;
                                arrayList.add(labelData3);
                                z2 = true;
                            } catch (Exception e) {
                                e = e;
                                z3 = true;
                                CrashHelper.m81296c(e);
                                z2 = z3;
                            }
                        }
                    } else {
                        if (i > 0) {
                            int i2 = i - 1;
                            if (m162215x(arrayListM200324f2, str6 + "-" + str7, i2) == i2) {
                                strM152721c = m2x.m152721c(MarrySeriesType.INCOME, user);
                                if (TextUtils.isEmpty(strM152721c)) {
                                    LabelData labelData4 = new LabelData();
                                    labelData4.name = "年收入" + strM152721c;
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
        if (profile5 != null && (extensions3 = profile5.extensions) != null && (profileExtensionMarriage2 = extensions3.marriage) != null && (list2 = profileExtensionMarriage2.mateAge) != null && !vwb.m200296J(list2)) {
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
        if (profile6 == null || (extensions2 = profile6.extensions) == null || (physical = extensions2.physical) == null || vwb.m200296J(physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0))) {
            z4 = false;
        } else {
            String str8 = user.profile.extensions.physical.height.get(0);
            if (m162212u(str8) && Pattern.compile("[0-9]*").matcher(str8).matches()) {
                try {
                    int i5 = Integer.parseInt(str8);
                    List<String> list3 = userMe_.profile.extensions.marriage.mateHeight;
                    int i6 = 140;
                    int i7 = 210;
                    if (!vwb.m200296J(list3)) {
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
                String strM162207p = m162207p(userMe_);
                String strM162207p2 = m162207p(user);
                if (!TextUtils.isEmpty(strM162207p) && TextUtils.equals(strM162207p, strM162207p2)) {
                    labelData7.name = strM162207p;
                }
                if (!TextUtils.isEmpty(labelData7.name)) {
                    arrayList.add(labelData7);
                }
            }
        }
        if (!z && m162212u(str) && m162215x(arrayListM200324f0, str, 0) >= 2) {
            LabelData labelData8 = new LabelData();
            labelData8.highlight = false;
            labelData8.name = str;
            arrayList.add(labelData8);
        }
        if (!z2) {
            m162194c(user, arrayList, false);
        }
        String strM152721c2 = m2x.m152721c(MarrySeriesType.PROFESSION, user);
        if (!TextUtils.isEmpty(strM152721c2) && (strM152721c2.contains("事业编") || strM152721c2.contains("公务员"))) {
            LabelData labelData9 = new LabelData();
            labelData9.highlight = false;
            labelData9.name = strM152721c2;
            arrayList.add(labelData9);
        }
        m162189C(arrayList, user, false);
        m162191E(arrayList, user, false);
        if (!z4) {
            m162193b(user, arrayList, false);
        }
        return arrayList.size() > 6 ? arrayList.subList(0, 6) : arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m162212u(String str) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m162213v(String str) {
        return (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public static void m162214w(Act act, String str) {
        CoreModule.f17545c.f19639e0.f149448p4.put(l9b.m149012U());
        StringBuilder sb = new StringBuilder();
        sb.append(juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/marriage-activity-2024/index.html?speed=true&_bid=1004591&hideNavigationBar=1&hideNotch=1&from=");
        sb.append(str);
        act.startActivity(MkWebViewAct.m80240e2(act, "", sb.toString(), true, true, true, true, null));
    }

    /* JADX INFO: renamed from: x */
    public static int m162215x(List<String> list, String str, int i) {
        if (vwb.m200296J(list) || TextUtils.isEmpty(str) || i > list.size()) {
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
    public static void m162216y(@NonNull List<LabelData> list, @NonNull User user) {
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
    public static void m162217z(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m220215n(media);
        } else if (media instanceof Video) {
            qib0.f154691G.m102377x0(media.url);
        }
    }
}
