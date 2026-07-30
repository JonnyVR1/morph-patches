package p006l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0155a0;
import com.p1.mobile.putong.core.data.AnonymityAsset;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.GraduateActivity;
import com.p1.mobile.putong.core.data.LetterMultilingual;
import com.p1.mobile.putong.core.data.MissMatch;
import com.p1.mobile.putong.core.data.ShowLiveForIntlAdUser;
import com.p1.mobile.putong.core.data.SpecialCard;
import com.p1.mobile.putong.core.data.ThirdPartySticker;
import com.p1.mobile.putong.core.data.UserScrapeReporting;
import com.p1.mobile.putong.data.Anonymity;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.LetterWrapper;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.knb0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vx6 extends a700<CoreAssetsSettings> {

    /* JADX INFO: renamed from: d */
    public static ConcurrentHashMap<String, knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String>> f24511d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public volatile boolean f24512c = false;

    static {
        m25963M();
    }

    /* JADX INFO: renamed from: H */
    public static void m25960H(SpecialCard specialCard) {
        C0155a0.m3317j().m3325m(specialCard);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m25961J(List<String> list, final String str) {
        return (TextUtils.isEmpty(str) || list == null || list.size() == 0 || (yij0.x(str).size() <= 0 && vwb.r(list, new w9j() { // from class: l.ux6
            public final Object call(Object obj) {
                return Boolean.valueOf(str.toLowerCase().contains(((String) obj).toLowerCase()));
            }
        }) == null)) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    public static void m25962L(MissMatch missMatch) {
        CoreModule.f1534c.f3652m0.m3083v8(missMatch);
    }

    /* JADX INFO: renamed from: M */
    public static void m25963M() {
        f24511d.clear();
        f24511d.put("christmas", vwb.Z(new px6(), vwb.f0(new String[]{"christmas", "圣诞"}), "animations/christmas/config.xml", "animations/christmas/pic"));
        f24511d.put("hi", vwb.Z(new qx6(), vwb.f0(new String[]{"hi", "你好", "hello"}), "animations/hi/config.xml", "animations/hi/pic"));
        f24511d.put("no", vwb.Z(new qx6(), vwb.f0(new String[]{"no", "不是"}), "animations/no/config.xml", "animations/no/pic"));
        f24511d.put("singleDog", vwb.Z(new px6(), vwb.f0(new String[]{"单身狗"}), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f24511d.put("what", vwb.Z(new rx6(), vwb.f0(new String[]{"什么", "什么？", "什么呢？", "什么呢"}), "animations/what/config.xml", "animations/what/pic"));
        f24511d.put("smile", vwb.Z(new px6(), vwb.f0(new String[]{"[大笑]", "[laugh]"}), "animations/smile/config.xml", "animations/smile/pic"));
        f24511d.put("cry", vwb.Z(new px6(), vwb.f0(new String[]{"[crying]", "[哭]", "[失望]", "[disappointed]"}), "animations/cry/config.xml", "animations/cry/pic"));
        f24511d.put("yeah", vwb.Z(new px6(), vwb.f0(new String[]{"[调皮]", "[naughty]", "[吐舌]", "[tongue]"}), "animations/yeah/config.xml", "animations/yeah/pic"));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m25969q(CoreAssetsSettings coreAssetsSettings) {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
        return Boolean.valueOf(showLiveForIntlAdUser != null && showLiveForIntlAdUser.android);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Anonymity m25970r(AnonymityAsset anonymityAsset) {
        Anonymity anonymity = new Anonymity();
        anonymity.id = vwb.M(anonymityAsset.id);
        anonymity.identifier = vwb.M(anonymityAsset.identifier);
        return anonymity;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m25971s(x9j x9jVar, String str, String str2) {
        return (Boolean) x9jVar.call(str.toLowerCase(), str2);
    }

    /* JADX INFO: renamed from: u */
    public static String m25972u(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : f24511d.keySet()) {
            knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String> knb0Var = f24511d.get(str2);
            if (NullChecker.a(knb0Var)) {
                final x9j x9jVar = (x9j) knb0Var.a;
                if (vwb.m((ArrayList) knb0Var.b, new w9j() { // from class: l.lx6
                    public final Object call(Object obj) {
                        return vx6.m25971s(x9jVar, str, (String) obj);
                    }
                })) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static void m25973v(ThirdPartySticker thirdPartySticker) {
        List list = thirdPartySticker.whiteList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            thirdPartySticker.whiteMap.put(((String) thirdPartySticker.whiteList.get(i)).toLowerCase(), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: A */
    public long m25974A() {
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        if (coreAssetsSettingsM11767g == null) {
            return 60000L;
        }
        long j = coreAssetsSettingsM11767g.counterPollingSeconds;
        if (j <= 0) {
            return 60000L;
        }
        return j * 1000;
    }

    /* JADX INFO: renamed from: B */
    public List<LetterWrapper> m25975B(Gender gender, String str) {
        return m25976C(gender, str, false);
    }

    /* JADX INFO: renamed from: C */
    public List<LetterWrapper> m25976C(Gender gender, String str, boolean z) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM11767g = z ? CoreModule.f1534c.f3568K0.f20132U : m11767g();
        if (coreAssetsSettingsM11767g == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM11767g.intlLetterContent;
            list = zEquals6 ? letterMultilingual6.enUS.female : letterMultilingual6.enUS.male;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            LetterWrapper letterWrapperNew_ = LetterWrapper.new_();
            letterWrapperNew_.letter = str2;
            arrayList.add(letterWrapperNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public List<LetterWrapper> m25977D(Gender gender, String str) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        if (coreAssetsSettingsM11767g == null || coreAssetsSettingsM11767g.letterContent == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM11767g.letterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM11767g.letterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM11767g.letterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM11767g.letterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM11767g.letterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM11767g.letterContent;
            list = zEquals6 ? letterMultilingual6.enUS.female : letterMultilingual6.enUS.male;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            LetterWrapper letterWrapperNew_ = LetterWrapper.new_();
            letterWrapperNew_.letter = str2;
            arrayList.add(letterWrapperNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public MissMatch m25978E() {
        return (MissMatch) m11766f(new w9j() { // from class: l.tx6
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).missMatch;
            }
        }, null);
    }

    /* JADX INFO: renamed from: F */
    public String m25979F() {
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        return (NullChecker.a(coreAssetsSettingsM11767g) && NullChecker.a(coreAssetsSettingsM11767g.appUpdateVersionData)) ? coreAssetsSettingsM11767g.appUpdateVersionData.androidReleaseVersion : "";
    }

    /* JADX INFO: renamed from: G */
    public SpecialCard m25980G() {
        return (SpecialCard) m11766f(new w9j() { // from class: l.sx6
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).specialCard;
            }
        }, null);
    }

    /* JADX INFO: renamed from: I */
    public boolean m25981I() {
        return ((Boolean) m11766f(new w9j() { // from class: l.kx6
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreAssetsSettings) obj).enableVoiceCall >= 1);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public boolean m25982K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("验证码");
    }

    /* JADX INFO: renamed from: N */
    public boolean m25983N() {
        return ((Boolean) m11766f(new w9j() { // from class: l.ox6
            public final Object call(Object obj) {
                return vx6.m25969q((CoreAssetsSettings) obj);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public boolean m25984O() {
        GraduateActivity graduateActivity;
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        if (coreAssetsSettingsM11767g != null && (graduateActivity = coreAssetsSettingsM11767g.graduateActivity) != null && !TextUtils.isEmpty(graduateActivity.name) && !TextUtils.isEmpty(graduateActivity.startTime) && !TextUtils.isEmpty(graduateActivity.endTime) && !TextUtils.isEmpty(graduateActivity.entranceUrl)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                long time = simpleDateFormat.parse(graduateActivity.startTime).getTime();
                long time2 = simpleDateFormat.parse(graduateActivity.endTime).getTime();
                long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
                return jGuessedCurrentServerTime >= time && jGuessedCurrentServerTime <= time2;
            } catch (ParseException e) {
                CrashHelper.c(e);
            }
        }
        return false;
    }

    @Override // p006l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CoreAssetsSettings> mo11769i() {
        return CoreAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m25985t() {
        UserScrapeReporting userScrapeReporting;
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        if (coreAssetsSettingsM11767g == null || (userScrapeReporting = coreAssetsSettingsM11767g.userScrapeReporting) == null) {
            return null;
        }
        return userScrapeReporting.keywords;
    }

    @Override // p006l.a700
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo11768h(@NonNull CoreAssetsSettings coreAssetsSettings) {
        MissMatch missMatch;
        ThirdPartySticker thirdPartySticker;
        super.mo11768h(coreAssetsSettings);
        if (NullChecker.a(CoreModule.f1534c) && coreAssetsSettings != null && (thirdPartySticker = coreAssetsSettings.thirdPartySticker) != null) {
            m25973v(thirdPartySticker);
        }
        if (NullChecker.a(CoreModule.f1534c) && coreAssetsSettings != null && (missMatch = coreAssetsSettings.missMatch) != null) {
            m25962L(missMatch);
        }
        if (NullChecker.a(CoreModule.f1534c) && NullChecker.a(coreAssetsSettings) && NullChecker.a(coreAssetsSettings.specialCard)) {
            m25960H(coreAssetsSettings.specialCard);
        }
        if (!NullChecker.a(CoreModule.f1534c) || coreAssetsSettings == null) {
            return;
        }
        ura.m25555e().m25559d().m5666Nq(coreAssetsSettings.autoPayEnable);
    }

    /* JADX INFO: renamed from: x */
    public List<Anonymity> m25987x(final boolean z) {
        return vwb.Q((List) m11766f(new w9j() { // from class: l.mx6
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return (z ? coreAssetsSettings.anonymityImg.female : coreAssetsSettings.anonymityImg.male).items;
            }
        }, null), new w9j() { // from class: l.nx6
            public final Object call(Object obj) {
                return vx6.m25970r((AnonymityAsset) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public boolean m25988y() {
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        if (NullChecker.a(coreAssetsSettingsM11767g) && NullChecker.a(coreAssetsSettingsM11767g.appUpdateVersionData)) {
            return coreAssetsSettingsM11767g.appUpdateVersionData.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public String m25989z() {
        CoreAssetsSettings coreAssetsSettingsM11767g = m11767g();
        return (NullChecker.a(coreAssetsSettingsM11767g) && NullChecker.a(coreAssetsSettingsM11767g.appUpdateVersionData)) ? coreAssetsSettingsM11767g.appUpdateVersionData.androidBaseVersion : "";
    }
}
