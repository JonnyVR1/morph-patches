package p003l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import l.et4;
import l.mqi0;
import l.qy;
import l.ura;
import l.vwb;
import org.eclipse.jetty.http.HttpHeaders;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class m2x {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<MarrySeriesType> f5492a = vwb.n(Arrays.asList(MarrySeriesType.values()), new w9j() { // from class: l.l2x
        @Override // p003l.w9j
        public final Object call(Object obj) {
            MarrySeriesType marrySeriesType = (MarrySeriesType) obj;
            return Boolean.valueOf(marrySeriesType.isRequired() && NullChecker.a(marrySeriesType.getFragClass()));
        }
    });

    /* JADX INFO: renamed from: b */
    public static List<String> f5493b = null;

    /* JADX INFO: renamed from: c */
    public static String f5494c = "cm";

    /* JADX INFO: renamed from: d */
    public static List<String> f5495d = null;

    /* JADX INFO: renamed from: e */
    public static String f5496e = "kg";

    /* JADX INFO: renamed from: l.m2x$a */
    public static /* synthetic */ class C0418a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5497a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f5497a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5497a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5497a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5497a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5497a[MarrySeriesType.INCOME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5497a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5497a[MarrySeriesType.MATE_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5497a[MarrySeriesType.MONTHLY_COST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5497a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5497a[MarrySeriesType.MATE_INCOME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5497a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5497a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5497a[MarrySeriesType.DECLARATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5497a[MarrySeriesType.FAMILY_BACKGROUND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5497a[MarrySeriesType.BRIDE_PRICE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5497a[MarrySeriesType.PROFESSION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5497a[MarrySeriesType.HOUSE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5497a[MarrySeriesType.NICK_NAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f5497a[MarrySeriesType.PROLOGUE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f5497a[MarrySeriesType.MATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5497a[MarrySeriesType.HEIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f5497a[MarrySeriesType.WEIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f5497a[MarrySeriesType.BIRTHDAY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f5497a[MarrySeriesType.ADDRESS_HOMETOWN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f5497a[MarrySeriesType.ADDRESS_LIVE_NOW.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f5497a[MarrySeriesType.MATE_AGE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f5497a[MarrySeriesType.MATE_AGE_EDIT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f5497a[MarrySeriesType.MATE_HEIGHT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f5497a[MarrySeriesType.LIFE_MOMENT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f5497a[MarrySeriesType.BIND_PHONE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6195b(User user) {
        if (user == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = null;
        String str2 = (vwb.J(user.profile.extensions.basic.address) || user.profile.extensions.basic.address.size() <= 0) ? null : (String) user.profile.extensions.basic.address.get(0);
        if (!TextUtils.isEmpty(str2) && !"中国".equals(str2)) {
            sb.append(str2);
        }
        String str3 = (vwb.J(user.profile.extensions.basic.address) || user.profile.extensions.basic.address.size() <= 1) ? null : (String) user.profile.extensions.basic.address.get(1);
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(str3);
        }
        if (!vwb.J(user.profile.extensions.basic.address) && user.profile.extensions.basic.address.size() > 2) {
            str = (String) user.profile.extensions.basic.address.get(2);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("·");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m6196c(MarrySeriesType marrySeriesType, User user) {
        if (user == null) {
            return null;
        }
        switch (C0418a.f5497a[marrySeriesType.ordinal()]) {
            case 1:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.status);
            case 2:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.expectedTime);
            case 3:
                return m6199f(user.profile.extensions.wealth.car);
            case 4:
                return m6199f(user.profile.extensions.basic.qualification);
            case 5:
                UserWealth userWealth = user.profile.extensions.wealth;
                return m6205l(userWealth.upperIncome, userWealth.lowIncome);
            case 6:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.babyWilling);
            case 7:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.mateStatus);
            case 8:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.wealth.monthlyCost);
            case 9:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.mateQualification);
            case 10:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.mateIncome);
            case 11:
                return m6211r(m6197d(marrySeriesType), user.profile.extensions.marriage.mateAddress);
            case 12:
            default:
                return null;
            case 13:
                return m6199f(user.profile.extensions.marriage.declaration);
            case 14:
                return m6199f(user.profile.extensions.basic.familyBackground);
            case 15:
                return m6199f(user.profile.extensions.marriage.bridePrice);
            case 16:
                return m6213t(user);
            case 17:
                return m6204k(user);
            case 18:
                return user.name;
            case 19:
                return m6199f(user.profile.extensions.marriage.prologue);
            case 20:
                return m6199f(user.profile.extensions.marriage.mateDescription);
            case 21:
                if (vwb.J(user.profile.extensions.physical.height) || TextUtils.equals("暂不透露", (CharSequence) user.profile.extensions.physical.height.get(0))) {
                    return null;
                }
                return String.format("%scm", user.profile.extensions.physical.height.get(0));
            case 22:
                if (vwb.J(user.profile.extensions.physical.weight) || TextUtils.equals("暂不透露", (CharSequence) user.profile.extensions.physical.weight.get(0))) {
                    return null;
                }
                return String.format("%skg", user.profile.extensions.physical.weight.get(0));
            case 23:
                return mqi0.b.format(user.settings.birthdate);
            case 24:
                return ura.e().d().Ym(user.profile);
            case 25:
                return m6195b(user);
            case 26:
            case 27:
                return m6206m(user.profile.extensions.marriage.mateAge, marrySeriesType == MarrySeriesType.MATE_AGE_EDIT);
            case 28:
                return m6208o(user.profile.extensions.marriage.mateHeight);
            case HttpHeaders.IF_MODIFIED_SINCE_ORDINAL /* 29 */:
                return m6199f(user.profile.extensions.marriage.lifeMoment);
            case 30:
                return m6212s(user);
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<Pair<String, String>> m6197d(MarrySeriesType marrySeriesType) {
        switch (C0418a.f5497a[marrySeriesType.ordinal()]) {
            case 1:
                return vwb.f0(new Pair[]{Pair.create("未婚未育", "single"), Pair.create("离异无孩子", "divorced_without_child"), Pair.create("离异有孩子", "divorced_with_child")});
            case 2:
                return vwb.f0(new Pair[]{Pair.create("希望一年内结婚", "in_one_year"), Pair.create("希望两年内结婚", "in_two_years"), Pair.create("时机成熟就结婚", "at_right_time")});
            case 3:
                return vwb.f0(new Pair[]{Pair.create(App.e.getString(R.string.V0), App.e.getString(R.string.V0)), Pair.create(App.e.getString(R.string.m2), App.e.getString(R.string.m2))});
            case 4:
                return vwb.f0(new Pair[]{Pair.create(App.e.getString(R.string.B0), App.e.getString(R.string.B0)), Pair.create(App.e.getString(R.string.A0), App.e.getString(R.string.A0)), Pair.create(App.e.getString(R.string.E0), App.e.getString(R.string.E0)), Pair.create(App.e.getString(R.string.D0), App.e.getString(R.string.D0)), Pair.create(App.e.getString(R.string.C0), App.e.getString(R.string.C0))});
            case 5:
                return vwb.f0(new Pair[]{Pair.create(App.e.getString(R.string.l), App.e.getString(R.string.l)), Pair.create(App.e.getString(R.string.m), App.e.getString(R.string.m)), Pair.create(App.e.getString(R.string.n), App.e.getString(R.string.n)), Pair.create(App.e.getString(R.string.o), App.e.getString(R.string.o)), Pair.create(App.e.getString(R.string.p), App.e.getString(R.string.p)), Pair.create(App.e.getString(R.string.q), App.e.getString(R.string.q)), Pair.create(App.e.getString(R.string.r), App.e.getString(R.string.r))});
            case 6:
                return vwb.f0(new Pair[]{Pair.create("想要孩子", "want"), Pair.create("不要孩子", "not_want"), Pair.create("生孩子随缘", "leave_it_to_fate")});
            case 7:
                return vwb.f0(new Pair[]{Pair.create("不限", "unlimited"), Pair.create("未婚", "unmarried"), Pair.create("离异", "divorced")});
            case 8:
                return vwb.f0(new Pair[]{Pair.create("1千以下", "1k"), Pair.create("1-2千", "1-2k"), Pair.create("2-3千", "2-3k"), Pair.create("3-4千", "3-4k"), Pair.create("4-5千", "4-5k"), Pair.create("5千-1万", "5-10k"), Pair.create("1万以上", "10k")});
            case 9:
                return vwb.f0(new Pair[]{Pair.create("不限", "unlimited"), Pair.create("大专及以上", "associate"), Pair.create("本科及以上", "bachelor"), Pair.create("硕士及以上", "master"), Pair.create("博士", "doctor")});
            case 10:
                return vwb.f0(new Pair[]{Pair.create("不限", "unlimited"), Pair.create("5万以下", "5w"), Pair.create("5-10万", "5-10w"), Pair.create("10-20万", "10-20w"), Pair.create("20-30万", "20-30w"), Pair.create("30-60万", "30-60w"), Pair.create("60-100万", "60-100w"), Pair.create("100万以上", "100w")});
            case 11:
                return vwb.f0(new Pair[]{Pair.create("可接受异地", "different_city"), Pair.create("不接受异地", "same_city")});
            case 12:
                return m6200g(CoreModule.c.e0.na());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static List<MarryAddressSelectData> m6198e(MarrySeriesType marrySeriesType, User user) {
        return (marrySeriesType == MarrySeriesType.ADDRESS_HOMETOWN || marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW) ? m6203j(user, marrySeriesType) : new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static String m6199f(List<String> list) {
        if (vwb.J(list) || TextUtils.equals(list.get(0), CoreModule.b.getString(R.string.l2))) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: g */
    public static List<Pair<String, String>> m6200g(User user) {
        ArrayList arrayListD = FriendPurposeHelper.d(user);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrayListD.size(); i++) {
            arrayList.add(Pair.create(((LoopSelectFillData) arrayListD.get(i)).c(), ((LoopSelectFillData) arrayListD.get(i)).b()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m6201h() {
        if (!vwb.J(f5493b)) {
            return f5493b;
        }
        f5493b = new ArrayList();
        for (int i = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA; i <= 210; i++) {
            f5493b.add(i + f5494c);
        }
        return f5493b;
    }

    /* JADX INFO: renamed from: i */
    public static HometownSuggest m6202i() {
        return ura.e().d().N6();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX INFO: renamed from: j */
    public static ArrayList<MarryAddressSelectData> m6203j(User user, MarrySeriesType marrySeriesType) {
        MarryAddressSelectData marryAddressSelectData;
        ArrayList<MarryAddressSelectData> arrayList = new ArrayList<>();
        if (NullChecker.a(m6202i())) {
            if (marrySeriesType == MarrySeriesType.ADDRESS_HOMETOWN) {
                if (NullChecker.a(user) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.basic) && !(vwb.J(user.profile.extensions.basic.country) && vwb.J(user.profile.extensions.basic.province) && vwb.J(user.profile.extensions.basic.city))) {
                    StringBuilder sb = new StringBuilder();
                    String str = vwb.J(user.profile.extensions.basic.country) ? "" : (String) user.profile.extensions.basic.country.get(0);
                    if (!TextUtils.isEmpty(str) && !"中国".equals(str)) {
                        sb.append(str);
                    }
                    String str2 = vwb.J(user.profile.extensions.basic.province) ? "" : (String) user.profile.extensions.basic.province.get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        if (sb.length() > 0) {
                            sb.append("・");
                        }
                        sb.append(str2);
                    }
                    String str3 = vwb.J(user.profile.extensions.basic.city) ? "" : (String) user.profile.extensions.basic.city.get(0);
                    if (!TextUtils.isEmpty(str3)) {
                        if (sb.length() > 0) {
                            sb.append("・");
                        }
                        sb.append(str3);
                    }
                    marryAddressSelectData = new MarryAddressSelectData(sb.toString(), MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, str, str2, str3);
                    marryAddressSelectData.setSelected(true);
                } else if (NullChecker.a(user) && NullChecker.a(user.profile) && !TextUtils.isEmpty(user.profile.hometown)) {
                    marryAddressSelectData = new MarryAddressSelectData(user.profile.hometown, MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, "", "", "");
                    marryAddressSelectData.setSelected(true);
                } else {
                    marryAddressSelectData = null;
                }
            } else if (marrySeriesType == MarrySeriesType.ADDRESS_LIVE_NOW && NullChecker.a(user) && NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.basic) && !vwb.J(user.profile.extensions.basic.address)) {
                List list = user.profile.extensions.basic.address;
                String str4 = (String) list.get(0);
                String str5 = list.size() > 1 ? (String) list.get(1) : "";
                String str6 = list.size() > 2 ? (String) list.get(2) : "";
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
                marryAddressSelectData = new MarryAddressSelectData(et4.a("・", arrayList2), MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA, str4, str5, str6);
                marryAddressSelectData.setSelected(true);
            } else {
                marryAddressSelectData = null;
            }
            List list2 = m6202i().china;
            for (int i = 0; i < list2.size(); i++) {
                HometownChinaItem hometownChinaItem = (HometownChinaItem) list2.get(i);
                MarryAddressSelectData marryAddressSelectData2 = new MarryAddressSelectData(hometownChinaItem.region, MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                if (NullChecker.a(marryAddressSelectData) && TextUtils.equals(marryAddressSelectData.getShowText(), marryAddressSelectData2.getShowText())) {
                    marryAddressSelectData2.setSelected(true);
                    marryAddressSelectData = null;
                }
                marryAddressSelectData2.setLevel(1);
                if (vwb.J(hometownChinaItem.subRegion)) {
                    marryAddressSelectData2.setData("", hometownChinaItem.region, "");
                } else {
                    marryAddressSelectData2.setShowArrow();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hometownChinaItem.subRegion.iterator();
                    while (it.hasNext()) {
                        MarryAddressSelectData marryAddressSelectData3 = new MarryAddressSelectData((String) it.next(), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                        marryAddressSelectData3.setLevel(2);
                        arrayList3.add(marryAddressSelectData3);
                    }
                    marryAddressSelectData2.setNextList(arrayList3);
                }
                arrayList.add(marryAddressSelectData2);
            }
            MarryAddressSelectData marryAddressSelectData4 = new MarryAddressSelectData(CoreModule.b.getString(R.string.Z0), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_OVERSEAS);
            marryAddressSelectData4.setSelected(false);
            marryAddressSelectData4.setShowArrow();
            arrayList.add(marryAddressSelectData4);
            List<String> listQ = LoopFragmentFactory.Q(vwb.D(LoopFragmentFactory.u().overseas));
            ArrayList arrayList4 = new ArrayList();
            for (String str7 : listQ) {
                MarryAddressSelectData marryAddressSelectData5 = new MarryAddressSelectData(str7, MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                arrayList4.add(marryAddressSelectData5);
                List list3 = (List) LoopFragmentFactory.u().overseas.get(str7);
                if (!vwb.J(list3)) {
                    marryAddressSelectData5.setShowArrow();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        MarryAddressSelectData marryAddressSelectData6 = new MarryAddressSelectData((String) it2.next(), MarryAddressSelectData.MarryAddressDataSelectType.SELECT_INFO);
                        marryAddressSelectData6.setLevel(1);
                        arrayList5.add(marryAddressSelectData6);
                    }
                    marryAddressSelectData5.setNextList(arrayList5);
                }
            }
            marryAddressSelectData4.setNextList(arrayList4);
            if (NullChecker.a(marryAddressSelectData) && !TextUtils.isEmpty(marryAddressSelectData.getShowText())) {
                arrayList.add(0, marryAddressSelectData);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static String m6204k(User user) {
        String strM6199f = "";
        if (user == null) {
            return "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(m6199f(user.profile.extensions.wealth.houseSubRegion));
        Profile profile = user.profile;
        if (!zIsEmpty) {
            strM6199f = m6199f(profile.extensions.wealth.houseSubRegion);
        } else if (!TextUtils.isEmpty(m6199f(profile.extensions.wealth.houseRegion))) {
            strM6199f = m6199f(user.profile.extensions.wealth.houseRegion);
        }
        String strM6199f2 = m6199f(user.profile.extensions.wealth.house);
        if (!TextUtils.equals(m6199f(user.profile.extensions.wealth.house), App.e.getString(R.string.W0))) {
            return strM6199f2;
        }
        return strM6199f + strM6199f2;
    }

    /* JADX INFO: renamed from: l */
    public static String m6205l(List<String> list, List<String> list2) {
        if (!vwb.J(list2) && TextUtils.equals(list2.get(0), "1000000")) {
            return CoreModule.b.getString(R.string.r);
        }
        if ((vwb.J(list2) || !TextUtils.equals(list2.get(0), CoreModule.b.getString(R.string.l2))) && !vwb.J(list)) {
            if (TextUtils.equals(list.get(0), "50000")) {
                return CoreModule.b.getString(R.string.l);
            }
            if (TextUtils.equals(list.get(0), "100000")) {
                return CoreModule.b.getString(R.string.m);
            }
            if (TextUtils.equals(list.get(0), "200000")) {
                return CoreModule.b.getString(R.string.n);
            }
            if (TextUtils.equals(list.get(0), "300000")) {
                return CoreModule.b.getString(R.string.o);
            }
            if (TextUtils.equals(list.get(0), "600000")) {
                return CoreModule.b.getString(R.string.p);
            }
            if (TextUtils.equals(list.get(0), "1000000")) {
                return CoreModule.b.getString(R.string.q);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: m */
    public static String m6206m(List<String> list, boolean z) {
        String str = (vwb.J(list) || TextUtils.isEmpty(list.get(0))) ? "18" : list.get(0);
        String str2 = (vwb.J(list) || list.size() <= 1) ? "unlimited" : list.get(1);
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
    public static List<String> m6207n(String str, boolean z) {
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
    public static String m6208o(List<String> list) {
        String str = (vwb.J(list) || TextUtils.isEmpty(list.get(0))) ? "unlimited" : list.get(0);
        String str2 = (vwb.J(list) || list.size() <= 1) ? "unlimited" : list.get(1);
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
    public static List<String> m6209p(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("不限");
        }
        boolean zMatches = Pattern.compile("[0-9]*").matcher(str).matches();
        int i = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        if (zMatches) {
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
    public static String m6210q(String str) {
        return TextUtils.equals(str, "不限") ? "unlimited" : str;
    }

    /* JADX INFO: renamed from: r */
    public static String m6211r(List<Pair<String, String>> list, List<String> list2) {
        if (!vwb.J(list) && !vwb.J(list2)) {
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
    public static String m6212s(User user) {
        Settings settings;
        String str = "";
        if (user != null && (settings = user.settings) != null) {
            if (NullChecker.a(settings.phoneNumber) && !TextUtils.isEmpty(user.settings.phoneNumber.number)) {
                str = Marker.ANY_NON_NULL_MARKER + user.settings.phoneNumber.countryCode + " " + qy.a(user.settings.phoneNumber.number);
            }
            if (TextUtils.isEmpty(str) && NullChecker.a(user.settings.linkedPhoneNumber) && !TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) {
                return Marker.ANY_NON_NULL_MARKER + user.settings.linkedPhoneNumber.countryCode + " " + qy.a(user.settings.linkedPhoneNumber.number);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static String m6213t(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return App.e.getString(R.string.Q2);
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
    public static ArrayList<MarrySeriesType> m6214u(MarrySeriesType marrySeriesType, User user) {
        ArrayList<MarrySeriesType> arrayList = f5492a;
        if (!arrayList.contains(marrySeriesType)) {
            if (marrySeriesType == null) {
                return null;
            }
            return vwb.f0(new MarrySeriesType[]{marrySeriesType});
        }
        ArrayList<MarrySeriesType> arrayList2 = new ArrayList<>();
        for (MarrySeriesType marrySeriesType2 : arrayList) {
            if (TextUtils.isEmpty(m6196c(marrySeriesType2, user))) {
                arrayList2.add(marrySeriesType2);
            }
        }
        if (marrySeriesType == null) {
            return arrayList2;
        }
        if (vwb.J(arrayList2)) {
            return vwb.f0(new MarrySeriesType[]{marrySeriesType});
        }
        ArrayList<MarrySeriesType> arrayList3 = new ArrayList<>();
        if (!arrayList2.contains(marrySeriesType)) {
            arrayList3.add(marrySeriesType);
        }
        int iIndexOf = f5492a.indexOf(marrySeriesType);
        while (true) {
            ArrayList<MarrySeriesType> arrayList4 = f5492a;
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
            ArrayList<MarrySeriesType> arrayList5 = f5492a;
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
    public static List<String> m6215v() {
        if (!vwb.J(f5495d)) {
            return f5495d;
        }
        f5495d = new ArrayList();
        for (int i = 30; i <= 200; i++) {
            f5495d.add(i + f5496e);
        }
        return f5495d;
    }
}
