package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class m2x {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<MarrySeriesType> f130949a = vwb.m200339n(Arrays.asList(MarrySeriesType.values()), new w9j() { // from class: l.l2x
        @Override // p149l.w9j
        public final Object call(Object obj) {
            MarrySeriesType marrySeriesType = (MarrySeriesType) obj;
            return Boolean.valueOf(marrySeriesType.isRequired() && NullChecker.m81303a(marrySeriesType.getFragClass()));
        }
    });

    /* JADX INFO: renamed from: b */
    public static List<String> f130950b = null;

    /* JADX INFO: renamed from: c */
    public static String f130951c = CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;

    /* JADX INFO: renamed from: d */
    public static List<String> f130952d = null;

    /* JADX INFO: renamed from: e */
    public static String f130953e = "kg";

    /* JADX INFO: renamed from: l.m2x$a */
    public static /* synthetic */ class C18370a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f130954a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f130954a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130954a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130954a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130954a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130954a[MarrySeriesType.INCOME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130954a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f130954a[MarrySeriesType.MATE_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f130954a[MarrySeriesType.MONTHLY_COST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f130954a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f130954a[MarrySeriesType.MATE_INCOME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f130954a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f130954a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f130954a[MarrySeriesType.DECLARATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f130954a[MarrySeriesType.FAMILY_BACKGROUND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f130954a[MarrySeriesType.BRIDE_PRICE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f130954a[MarrySeriesType.PROFESSION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f130954a[MarrySeriesType.HOUSE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f130954a[MarrySeriesType.NICK_NAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f130954a[MarrySeriesType.PROLOGUE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f130954a[MarrySeriesType.MATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f130954a[MarrySeriesType.HEIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f130954a[MarrySeriesType.WEIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f130954a[MarrySeriesType.BIRTHDAY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f130954a[MarrySeriesType.ADDRESS_HOMETOWN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f130954a[MarrySeriesType.ADDRESS_LIVE_NOW.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f130954a[MarrySeriesType.MATE_AGE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f130954a[MarrySeriesType.MATE_AGE_EDIT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f130954a[MarrySeriesType.MATE_HEIGHT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f130954a[MarrySeriesType.LIFE_MOMENT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f130954a[MarrySeriesType.BIND_PHONE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m152720b(User user) {
        if (user == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = null;
        String str2 = (vwb.m200296J(user.profile.extensions.basic.address) || user.profile.extensions.basic.address.size() <= 0) ? null : user.profile.extensions.basic.address.get(0);
        if (!TextUtils.isEmpty(str2) && !"中国".equals(str2)) {
            sb.append(str2);
        }
        String str3 = (vwb.m200296J(user.profile.extensions.basic.address) || user.profile.extensions.basic.address.size() <= 1) ? null : user.profile.extensions.basic.address.get(1);
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str3);
        }
        if (!vwb.m200296J(user.profile.extensions.basic.address) && user.profile.extensions.basic.address.size() > 2) {
            str = user.profile.extensions.basic.address.get(2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("·");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m152721c(MarrySeriesType marrySeriesType, User user) {
        if (user == null) {
            return null;
        }
        switch (C18370a.f130954a[marrySeriesType.ordinal()]) {
            case 1:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.status);
            case 2:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.expectedTime);
            case 3:
                return m152724f(user.profile.extensions.wealth.car);
            case 4:
                return m152724f(user.profile.extensions.basic.qualification);
            case 5:
                UserWealth userWealth = user.profile.extensions.wealth;
                return m152730l(userWealth.upperIncome, userWealth.lowIncome);
            case 6:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.babyWilling);
            case 7:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.mateStatus);
            case 8:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.wealth.monthlyCost);
            case 9:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.mateQualification);
            case 10:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.mateIncome);
            case 11:
                return m152736r(m152722d(marrySeriesType), user.profile.extensions.marriage.mateAddress);
            case 12:
            default:
                return null;
            case 13:
                return m152724f(user.profile.extensions.marriage.declaration);
            case 14:
                return m152724f(user.profile.extensions.basic.familyBackground);
            case 15:
                return m152724f(user.profile.extensions.marriage.bridePrice);
            case 16:
                return m152738t(user);
            case 17:
                return m152729k(user);
            case 18:
                return user.name;
            case 19:
                return m152724f(user.profile.extensions.marriage.prologue);
            case 20:
                return m152724f(user.profile.extensions.marriage.mateDescription);
            case 21:
                if (vwb.m200296J(user.profile.extensions.physical.height) || TextUtils.equals("暂不透露", user.profile.extensions.physical.height.get(0))) {
                    return null;
                }
                return String.format("%scm", user.profile.extensions.physical.height.get(0));
            case 22:
                if (vwb.m200296J(user.profile.extensions.physical.weight) || TextUtils.equals("暂不透露", user.profile.extensions.physical.weight.get(0))) {
                    return null;
                }
                return String.format("%skg", user.profile.extensions.physical.weight.get(0));
            case 23:
                return mqi0.f135250b.format(user.settings.birthdate);
            case 24:
                return ura.m195053e().m195057d().mo33790Ym(user.profile);
            case 25:
                return m152720b(user);
            case 26:
            case 27:
                return m152731m(user.profile.extensions.marriage.mateAge, marrySeriesType == MarrySeriesType.MATE_AGE_EDIT);
            case 28:
                return m152733o(user.profile.extensions.marriage.mateHeight);
            case 29:
                return m152724f(user.profile.extensions.marriage.lifeMoment);
            case 30:
                return m152737s(user);
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<Pair<String, String>> m152722d(MarrySeriesType marrySeriesType) {
        switch (C18370a.f130954a[marrySeriesType.ordinal()]) {
            case 1:
                return vwb.m200324f0(Pair.create("未婚未育", "single"), Pair.create("离异无孩子", "divorced_without_child"), Pair.create("离异有孩子", "divorced_with_child"));
            case 2:
                return vwb.m200324f0(Pair.create("希望一年内结婚", "in_one_year"), Pair.create("希望两年内结婚", "in_two_years"), Pair.create("时机成熟就结婚", "at_right_time"));
            case 3:
                return vwb.m200324f0(Pair.create(App.f15369e.getString(R$string.f27791V0), App.f15369e.getString(R$string.f27791V0)), Pair.create(App.f15369e.getString(R$string.f27890m2), App.f15369e.getString(R$string.f27890m2)));
            case 4:
                return vwb.m200324f0(Pair.create(App.f15369e.getString(R$string.f27687B0), App.f15369e.getString(R$string.f27687B0)), Pair.create(App.f15369e.getString(R$string.f27681A0), App.f15369e.getString(R$string.f27681A0)), Pair.create(App.f15369e.getString(R$string.f27705E0), App.f15369e.getString(R$string.f27705E0)), Pair.create(App.f15369e.getString(R$string.f27699D0), App.f15369e.getString(R$string.f27699D0)), Pair.create(App.f15369e.getString(R$string.f27693C0), App.f15369e.getString(R$string.f27693C0)));
            case 5:
                return vwb.m200324f0(Pair.create(App.f15369e.getString(R$string.f27881l), App.f15369e.getString(R$string.f27881l)), Pair.create(App.f15369e.getString(R$string.f27887m), App.f15369e.getString(R$string.f27887m)), Pair.create(App.f15369e.getString(R$string.f27893n), App.f15369e.getString(R$string.f27893n)), Pair.create(App.f15369e.getString(R$string.f27899o), App.f15369e.getString(R$string.f27899o)), Pair.create(App.f15369e.getString(R$string.f27905p), App.f15369e.getString(R$string.f27905p)), Pair.create(App.f15369e.getString(R$string.f27911q), App.f15369e.getString(R$string.f27911q)), Pair.create(App.f15369e.getString(R$string.f27917r), App.f15369e.getString(R$string.f27917r)));
            case 6:
                return vwb.m200324f0(Pair.create("想要孩子", "want"), Pair.create("不要孩子", "not_want"), Pair.create("生孩子随缘", "leave_it_to_fate"));
            case 7:
                return vwb.m200324f0(Pair.create("不限", "unlimited"), Pair.create("未婚", "unmarried"), Pair.create("离异", "divorced"));
            case 8:
                return vwb.m200324f0(Pair.create("1千以下", "1k"), Pair.create("1-2千", "1-2k"), Pair.create("2-3千", "2-3k"), Pair.create("3-4千", "3-4k"), Pair.create("4-5千", "4-5k"), Pair.create("5千-1万", "5-10k"), Pair.create("1万以上", "10k"));
            case 9:
                return vwb.m200324f0(Pair.create("不限", "unlimited"), Pair.create("大专及以上", "associate"), Pair.create("本科及以上", "bachelor"), Pair.create("硕士及以上", "master"), Pair.create("博士", "doctor"));
            case 10:
                return vwb.m200324f0(Pair.create("不限", "unlimited"), Pair.create("5万以下", "5w"), Pair.create("5-10万", "5-10w"), Pair.create("10-20万", "10-20w"), Pair.create("20-30万", "20-30w"), Pair.create("30-60万", "30-60w"), Pair.create("60-100万", "60-100w"), Pair.create("100万以上", "100w"));
            case 11:
                return vwb.m200324f0(Pair.create("可接受异地", "different_city"), Pair.create("不接受异地", "same_city"));
            case 12:
                return m152725g(CoreModule.f17545c.f19639e0.m169520na());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static List<MarryAddressSelectData> m152723e(MarrySeriesType marrySeriesType, User user) {
        return (marrySeriesType == MarrySeriesType.ADDRESS_HOMETOWN || marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW) ? m152728j(user, marrySeriesType) : new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static String m152724f(List<String> list) {
        if (vwb.m200296J(list) || TextUtils.equals(list.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: g */
    public static List<Pair<String, String>> m152725g(User user) {
        ArrayList<LoopSelectFillData> arrayListM59425d = FriendPurposeHelper.m59425d(user);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayListM59425d.size(); i++) {
            arrayList.add(Pair.create(arrayListM59425d.get(i).m51577c(), arrayListM59425d.get(i).m51576b()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m152726h() {
        if (!vwb.m200296J(f130950b)) {
            return f130950b;
        }
        f130950b = new ArrayList();
        for (int i = 140; i <= 210; i++) {
            f130950b.add(i + f130951c);
        }
        return f130950b;
    }

    /* JADX INFO: renamed from: i */
    public static HometownSuggest m152727i() {
        return ura.m195053e().m195057d().mo33723N6();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX INFO: renamed from: j */
    public static ArrayList<MarryAddressSelectData> m152728j(User user, MarrySeriesType marrySeriesType) {
        MarryAddressSelectData marryAddressSelectData;
        ArrayList<MarryAddressSelectData> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(m152727i())) {
            if (marrySeriesType == MarrySeriesType.ADDRESS_HOMETOWN) {
                if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.basic) && !(vwb.m200296J(user.profile.extensions.basic.country) && vwb.m200296J(user.profile.extensions.basic.province) && vwb.m200296J(user.profile.extensions.basic.city))) {
                    StringBuilder sb = new StringBuilder();
                    String str = vwb.m200296J(user.profile.extensions.basic.country) ? "" : user.profile.extensions.basic.country.get(0);
                    if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
                        sb.append(str);
                    }
                    String str2 = vwb.m200296J(user.profile.extensions.basic.province) ? "" : user.profile.extensions.basic.province.get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        if (sb.length() > 0) {
                            sb.append("・");
                        }
                        sb.append(str2);
                    }
                    String str3 = vwb.m200296J(user.profile.extensions.basic.city) ? "" : user.profile.extensions.basic.city.get(0);
                    if (!TextUtils.isEmpty(str3)) {
                        if (sb.length() > 0) {
                            sb.append("・");
                        }
                        sb.append(str3);
                    }
                    marryAddressSelectData = new MarryAddressSelectData(sb.toString(), MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, str, str2, str3);
                    marryAddressSelectData.setSelected(true);
                } else if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && !TextUtils.isEmpty(user.profile.hometown)) {
                    marryAddressSelectData = new MarryAddressSelectData(user.profile.hometown, MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, "", "", "");
                    marryAddressSelectData.setSelected(true);
                } else {
                    marryAddressSelectData = null;
                }
            } else if (marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW && NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.basic) && !vwb.m200296J(user.profile.extensions.basic.address)) {
                List<String> list = user.profile.extensions.basic.address;
                String str4 = list.get(0);
                String str5 = list.size() > 1 ? list.get(1) : "";
                String str6 = list.size() > 2 ? list.get(2) : "";
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(str4) && !"中国".equals(str4)) {
                    arrayList2.add(str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    arrayList2.add(str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    arrayList2.add(str6);
                }
                marryAddressSelectData = new MarryAddressSelectData(et4.m117971a("・", arrayList2), MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, str4, str5, str6);
                marryAddressSelectData.setSelected(true);
            } else {
                marryAddressSelectData = null;
            }
            List<HometownChinaItem> list2 = m152727i().china;
            for (int i = 0; i < list2.size(); i++) {
                HometownChinaItem hometownChinaItem = list2.get(i);
                MarryAddressSelectData marryAddressSelectData2 = new MarryAddressSelectData(hometownChinaItem.region, MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                if (NullChecker.m81303a(marryAddressSelectData) && TextUtils.equals(marryAddressSelectData.getShowText(), marryAddressSelectData2.getShowText())) {
                    marryAddressSelectData2.setSelected(true);
                    marryAddressSelectData = null;
                }
                marryAddressSelectData2.setLevel(1);
                if (vwb.m200296J(hometownChinaItem.subRegion)) {
                    marryAddressSelectData2.setData("", hometownChinaItem.region, "");
                } else {
                    marryAddressSelectData2.setShowArrow();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it = hometownChinaItem.subRegion.iterator();
                    while (it.hasNext()) {
                        MarryAddressSelectData marryAddressSelectData3 = new MarryAddressSelectData(it.next(), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                        marryAddressSelectData3.setLevel(2);
                        arrayList3.add(marryAddressSelectData3);
                    }
                    marryAddressSelectData2.setNextList(arrayList3);
                }
                arrayList.add(marryAddressSelectData2);
            }
            MarryAddressSelectData marryAddressSelectData4 = new MarryAddressSelectData(CoreModule.f17544b.getString(R$string.f27811Z0), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_OVERSEAS);
            marryAddressSelectData4.setSelected(false);
            marryAddressSelectData4.setShowArrow();
            arrayList.add(marryAddressSelectData4);
            List<String> listM51473Q = LoopFragmentFactory.m51473Q(vwb.m200290D(LoopFragmentFactory.m51500u().overseas));
            ArrayList arrayList4 = new ArrayList();
            for (String str7 : listM51473Q) {
                MarryAddressSelectData marryAddressSelectData5 = new MarryAddressSelectData(str7, MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                arrayList4.add(marryAddressSelectData5);
                List<String> list3 = LoopFragmentFactory.m51500u().overseas.get(str7);
                if (!vwb.m200296J(list3)) {
                    marryAddressSelectData5.setShowArrow();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<String> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        MarryAddressSelectData marryAddressSelectData6 = new MarryAddressSelectData(it2.next(), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                        marryAddressSelectData6.setLevel(1);
                        arrayList5.add(marryAddressSelectData6);
                    }
                    marryAddressSelectData5.setNextList(arrayList5);
                }
            }
            marryAddressSelectData4.setNextList(arrayList4);
            if (NullChecker.m81303a(marryAddressSelectData) && !TextUtils.isEmpty(marryAddressSelectData.getShowText())) {
                arrayList.add(0, marryAddressSelectData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static String m152729k(User user) {
        String strM152724f = "";
        if (user == null) {
            return "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(m152724f(user.profile.extensions.wealth.houseSubRegion));
        Profile profile = user.profile;
        if (!zIsEmpty) {
            strM152724f = m152724f(profile.extensions.wealth.houseSubRegion);
        } else if (!TextUtils.isEmpty(m152724f(profile.extensions.wealth.houseRegion))) {
            strM152724f = m152724f(user.profile.extensions.wealth.houseRegion);
        }
        String strM152724f2 = m152724f(user.profile.extensions.wealth.house);
        if (!TextUtils.equals(m152724f(user.profile.extensions.wealth.house), App.f15369e.getString(R$string.f27796W0))) {
            return strM152724f2;
        }
        return strM152724f + strM152724f2;
    }

    /* JADX INFO: renamed from: l */
    public static String m152730l(List<String> list, List<String> list2) {
        if (!vwb.m200296J(list2) && TextUtils.equals(list2.get(0), "1000000")) {
            return CoreModule.f17544b.getString(R$string.f27917r);
        }
        if ((vwb.m200296J(list2) || !TextUtils.equals(list2.get(0), CoreModule.f17544b.getString(R$string.f27884l2))) && !vwb.m200296J(list)) {
            if (TextUtils.equals(list.get(0), "50000")) {
                return CoreModule.f17544b.getString(R$string.f27881l);
            }
            if (TextUtils.equals(list.get(0), "100000")) {
                return CoreModule.f17544b.getString(R$string.f27887m);
            }
            if (TextUtils.equals(list.get(0), "200000")) {
                return CoreModule.f17544b.getString(R$string.f27893n);
            }
            if (TextUtils.equals(list.get(0), "300000")) {
                return CoreModule.f17544b.getString(R$string.f27899o);
            }
            if (TextUtils.equals(list.get(0), "600000")) {
                return CoreModule.f17544b.getString(R$string.f27905p);
            }
            if (TextUtils.equals(list.get(0), "1000000")) {
                return CoreModule.f17544b.getString(R$string.f27911q);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: m */
    public static String m152731m(List<String> list, boolean z) {
        String str = (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) ? "18" : list.get(0);
        String str2 = (vwb.m200296J(list) || list.size() <= 1) ? "unlimited" : list.get(1);
        if (TextUtils.equals(str, "18") && TextUtils.equals(str2, "unlimited") && z) {
            return "不限";
        }
        if (TextUtils.equals(str, "unlimited")) {
            return String.format(Locale.CHINA, "%s岁以下", str2);
        }
        if (TextUtils.equals(str2, "unlimited")) {
            return String.format(Locale.CHINA, "%s岁以上", str);
        }
        return TextUtils.equals(str, str2) ? String.format(Locale.CHINA, "%s岁", str) : String.format(Locale.CHINA, "%s - %s岁", str, str2);
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m152732n(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("不限");
        }
        int i = 18;
        if (Pattern.compile("[0-9]*").matcher(str).matches()) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        while (i <= 50) {
            arrayList.add(String.valueOf(i));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static String m152733o(List<String> list) {
        String str = (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) ? "unlimited" : list.get(0);
        String str2 = (vwb.m200296J(list) || list.size() <= 1) ? "unlimited" : list.get(1);
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

    /* JADX INFO: renamed from: p */
    public static List<String> m152734p(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("不限");
        }
        int i = 140;
        if (Pattern.compile("[0-9]*").matcher(str).matches()) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        while (i <= 210) {
            arrayList.add(String.valueOf(i));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static String m152735q(String str) {
        return TextUtils.equals(str, "不限") ? "unlimited" : str;
    }

    /* JADX INFO: renamed from: r */
    public static String m152736r(List<Pair<String, String>> list, List<String> list2) {
        if (!vwb.m200296J(list) && !vwb.m200296J(list2)) {
            for (Pair<String, String> pair : list) {
                boolean zEquals = TextUtils.equals((CharSequence) pair.first, list2.get(0));
                Object obj = pair.second;
                if (zEquals) {
                    return (String) obj;
                }
                if (TextUtils.equals((CharSequence) obj, list2.get(0))) {
                    return (String) pair.first;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static String m152737s(User user) {
        Settings settings;
        String str = "";
        if (user != null && (settings = user.settings) != null) {
            if (NullChecker.m81303a(settings.phoneNumber) && !TextUtils.isEmpty(user.settings.phoneNumber.number)) {
                str = Marker.ANY_NON_NULL_MARKER + user.settings.phoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(user.settings.phoneNumber.number);
            }
            if (TextUtils.isEmpty(str) && NullChecker.m81303a(user.settings.linkedPhoneNumber) && !TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) {
                return Marker.ANY_NON_NULL_MARKER + user.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(user.settings.linkedPhoneNumber.number);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static String m152738t(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return App.f15369e.getString(R$string.f27768Q2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(profile.work.industry);
        Profile profile2 = user.profile;
        if (zIsEmpty) {
            return profile2.work.department;
        }
        if ((TextUtils.equals(profile2.work.industry, "其他") || TextUtils.equals(user.profile.work.industry, "其它")) && !TextUtils.isEmpty(user.profile.work.department) && (TextUtils.equals(user.profile.work.department, "其他") || TextUtils.equals(user.profile.work.department, "其它"))) {
            return "其他";
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(user.profile.work.department);
        Profile profile3 = user.profile;
        if (zIsEmpty2) {
            return profile3.work.industry;
        }
        return profile3.work.industry + "·" + user.profile.work.department;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList<MarrySeriesType> m152739u(MarrySeriesType marrySeriesType, User user) {
        ArrayList<MarrySeriesType> arrayList = f130949a;
        if (!arrayList.contains(marrySeriesType)) {
            if (marrySeriesType == null) {
                return null;
            }
            return vwb.m200324f0(marrySeriesType);
        }
        ArrayList<MarrySeriesType> arrayList2 = new ArrayList<>();
        for (MarrySeriesType marrySeriesType2 : arrayList) {
            if (TextUtils.isEmpty(m152721c(marrySeriesType2, user))) {
                arrayList2.add(marrySeriesType2);
            }
        }
        if (marrySeriesType == null) {
            return arrayList2;
        }
        if (vwb.m200296J(arrayList2)) {
            return vwb.m200324f0(marrySeriesType);
        }
        ArrayList<MarrySeriesType> arrayList3 = new ArrayList<>();
        if (!arrayList2.contains(marrySeriesType)) {
            arrayList3.add(marrySeriesType);
        }
        int iIndexOf = f130949a.indexOf(marrySeriesType);
        while (true) {
            ArrayList<MarrySeriesType> arrayList4 = f130949a;
            if (iIndexOf >= arrayList4.size()) {
                break;
            }
            if (arrayList2.contains(arrayList4.get(iIndexOf))) {
                arrayList3.add(arrayList4.get(iIndexOf));
            }
            iIndexOf++;
        }
        int i = 0;
        while (true) {
            ArrayList<MarrySeriesType> arrayList5 = f130949a;
            if (i >= arrayList5.indexOf(marrySeriesType)) {
                return arrayList3;
            }
            if (arrayList2.contains(arrayList5.get(i))) {
                arrayList3.add(arrayList5.get(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static List<String> m152740v() {
        if (!vwb.m200296J(f130952d)) {
            return f130952d;
        }
        f130952d = new ArrayList();
        for (int i = 30; i <= 200; i++) {
            f130952d.add(i + f130953e);
        }
        return f130952d;
    }
}
