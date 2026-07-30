package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.data.AnonymityAsset;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.GraduateActivity;
import com.p046p1.mobile.putong.core.data.LetterMultilingual;
import com.p046p1.mobile.putong.core.data.MissMatch;
import com.p046p1.mobile.putong.core.data.ShowLiveForIntlAdUser;
import com.p046p1.mobile.putong.core.data.SpecialCard;
import com.p046p1.mobile.putong.core.data.ThirdPartySticker;
import com.p046p1.mobile.putong.core.data.UserScrapeReporting;
import com.p046p1.mobile.putong.data.Anonymity;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.LetterWrapper;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class vx6 extends a700<CoreAssetsSettings> {

    /* JADX INFO: renamed from: d */
    public static ConcurrentHashMap<String, knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String>> f183426d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public volatile boolean f183427c = false;

    static {
        m200484M();
    }

    /* JADX INFO: renamed from: H */
    public static void m200481H(SpecialCard specialCard) {
        C4729a0.m31387j().m31395m(specialCard);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m200482J(List<String> list, final String str) {
        return (TextUtils.isEmpty(str) || list == null || list.size() == 0 || (yij0.m214968x(str).size() <= 0 && vwb.m200346r(list, new w9j() { // from class: l.ux6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.toLowerCase().contains(((String) obj).toLowerCase()));
            }
        }) == null)) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    public static void m200483L(MissMatch missMatch) {
        CoreModule.f17545c.f19663m0.m31153v8(missMatch);
    }

    /* JADX INFO: renamed from: M */
    public static void m200484M() {
        f183426d.clear();
        f183426d.put("christmas", vwb.m200312Z(new px6(), vwb.m200324f0("christmas", "圣诞"), "animations/christmas/config.xml", "animations/christmas/pic"));
        f183426d.put("hi", vwb.m200312Z(new qx6(), vwb.m200324f0("hi", "你好", "hello"), "animations/hi/config.xml", "animations/hi/pic"));
        f183426d.put("no", vwb.m200312Z(new qx6(), vwb.m200324f0("no", "不是"), "animations/no/config.xml", "animations/no/pic"));
        f183426d.put("singleDog", vwb.m200312Z(new px6(), vwb.m200324f0("单身狗"), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f183426d.put("what", vwb.m200312Z(new rx6(), vwb.m200324f0("什么", "什么？", "什么呢？", "什么呢"), "animations/what/config.xml", "animations/what/pic"));
        f183426d.put("smile", vwb.m200312Z(new px6(), vwb.m200324f0("[大笑]", "[laugh]"), "animations/smile/config.xml", "animations/smile/pic"));
        f183426d.put("cry", vwb.m200312Z(new px6(), vwb.m200324f0("[crying]", "[哭]", "[失望]", "[disappointed]"), "animations/cry/config.xml", "animations/cry/pic"));
        f183426d.put("yeah", vwb.m200312Z(new px6(), vwb.m200324f0("[调皮]", "[naughty]", "[吐舌]", "[tongue]"), "animations/yeah/config.xml", "animations/yeah/pic"));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m200490q(CoreAssetsSettings coreAssetsSettings) {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
        return Boolean.valueOf(showLiveForIntlAdUser != null && showLiveForIntlAdUser.f210117android);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Anonymity m200491r(AnonymityAsset anonymityAsset) {
        Anonymity anonymity = new Anonymity();
        anonymity.f38720id = vwb.m200299M(anonymityAsset.f20344id);
        anonymity.identifier = vwb.m200299M(anonymityAsset.identifier);
        return anonymity;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m200492s(x9j x9jVar, String str, String str2) {
        return (Boolean) x9jVar.call(str.toLowerCase(), str2);
    }

    /* JADX INFO: renamed from: u */
    public static String m200493u(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : f183426d.keySet()) {
            knb0<x9j<String, String, Boolean>, ArrayList<String>, String, String> knb0Var = f183426d.get(str2);
            if (NullChecker.m81303a(knb0Var)) {
                final x9j<String, String, Boolean> x9jVar = knb0Var.f123873a;
                if (vwb.m200337m(knb0Var.f123874b, new w9j() { // from class: l.lx6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return vx6.m200492s(x9jVar, str, (String) obj);
                    }
                })) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static void m200494v(ThirdPartySticker thirdPartySticker) {
        List<String> list = thirdPartySticker.whiteList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            thirdPartySticker.whiteMap.put(thirdPartySticker.whiteList.get(i).toLowerCase(), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: A */
    public long m200495A() {
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        if (coreAssetsSettingsM95177g == null) {
            return Constants.ONE_MIN_IN_MILLIS;
        }
        long j = coreAssetsSettingsM95177g.counterPollingSeconds;
        return j <= 0 ? Constants.ONE_MIN_IN_MILLIS : j * 1000;
    }

    /* JADX INFO: renamed from: B */
    public List<LetterWrapper> m200496B(Gender gender, String str) {
        return m200497C(gender, str, false);
    }

    /* JADX INFO: renamed from: C */
    public List<LetterWrapper> m200497C(Gender gender, String str, boolean z) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM95177g = z ? CoreModule.f17545c.f19579K0.f156828U : m95177g();
        if (coreAssetsSettingsM95177g == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM95177g.intlLetterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM95177g.intlLetterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM95177g.intlLetterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM95177g.intlLetterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM95177g.intlLetterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM95177g.intlLetterContent;
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
    public List<LetterWrapper> m200498D(Gender gender, String str) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        if (coreAssetsSettingsM95177g == null || coreAssetsSettingsM95177g.letterContent == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM95177g.letterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM95177g.letterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM95177g.letterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM95177g.letterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM95177g.letterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM95177g.letterContent;
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
    public MissMatch m200499E() {
        return (MissMatch) m95176f(new w9j() { // from class: l.tx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).missMatch;
            }
        }, null);
    }

    /* JADX INFO: renamed from: F */
    public String m200500F() {
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        return (NullChecker.m81303a(coreAssetsSettingsM95177g) && NullChecker.m81303a(coreAssetsSettingsM95177g.appUpdateVersionData)) ? coreAssetsSettingsM95177g.appUpdateVersionData.androidReleaseVersion : "";
    }

    /* JADX INFO: renamed from: G */
    public SpecialCard m200501G() {
        return (SpecialCard) m95176f(new w9j() { // from class: l.sx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).specialCard;
            }
        }, null);
    }

    /* JADX INFO: renamed from: I */
    public boolean m200502I() {
        return ((Boolean) m95176f(new w9j() { // from class: l.kx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreAssetsSettings) obj).enableVoiceCall >= 1);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public boolean m200503K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("验证码");
    }

    /* JADX INFO: renamed from: N */
    public boolean m200504N() {
        return ((Boolean) m95176f(new w9j() { // from class: l.ox6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vx6.m200490q((CoreAssetsSettings) obj);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public boolean m200505O() {
        GraduateActivity graduateActivity;
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        if (coreAssetsSettingsM95177g != null && (graduateActivity = coreAssetsSettingsM95177g.graduateActivity) != null && !TextUtils.isEmpty(graduateActivity.name) && !TextUtils.isEmpty(graduateActivity.startTime) && !TextUtils.isEmpty(graduateActivity.endTime) && !TextUtils.isEmpty(graduateActivity.entranceUrl)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                long time = simpleDateFormat.parse(graduateActivity.startTime).getTime();
                long time2 = simpleDateFormat.parse(graduateActivity.endTime).getTime();
                long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
                return jGuessedCurrentServerTime >= time && jGuessedCurrentServerTime <= time2;
            } catch (ParseException e) {
                CrashHelper.m81296c(e);
            }
        }
        return false;
    }

    @Override // p149l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CoreAssetsSettings> mo95179i() {
        return CoreAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m200506t() {
        UserScrapeReporting userScrapeReporting;
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        if (coreAssetsSettingsM95177g == null || (userScrapeReporting = coreAssetsSettingsM95177g.userScrapeReporting) == null) {
            return null;
        }
        return userScrapeReporting.keywords;
    }

    @Override // p149l.a700
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo95178h(@NonNull CoreAssetsSettings coreAssetsSettings) {
        MissMatch missMatch;
        ThirdPartySticker thirdPartySticker;
        super.mo95178h(coreAssetsSettings);
        if (NullChecker.m81303a(CoreModule.f17545c) && coreAssetsSettings != null && (thirdPartySticker = coreAssetsSettings.thirdPartySticker) != null) {
            m200494v(thirdPartySticker);
        }
        if (NullChecker.m81303a(CoreModule.f17545c) && coreAssetsSettings != null && (missMatch = coreAssetsSettings.missMatch) != null) {
            m200483L(missMatch);
        }
        if (NullChecker.m81303a(CoreModule.f17545c) && NullChecker.m81303a(coreAssetsSettings) && NullChecker.m81303a(coreAssetsSettings.specialCard)) {
            m200481H(coreAssetsSettings.specialCard);
        }
        if (!NullChecker.m81303a(CoreModule.f17545c) || coreAssetsSettings == null) {
            return;
        }
        ura.m195053e().m195057d().mo33729Nq(coreAssetsSettings.autoPayEnable);
    }

    /* JADX INFO: renamed from: x */
    public List<Anonymity> m200508x(final boolean z) {
        return vwb.m200303Q((List) m95176f(new w9j() { // from class: l.mx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return (z ? coreAssetsSettings.anonymityImg.female : coreAssetsSettings.anonymityImg.male).items;
            }
        }, null), new w9j() { // from class: l.nx6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vx6.m200491r((AnonymityAsset) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public boolean m200509y() {
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        if (NullChecker.m81303a(coreAssetsSettingsM95177g) && NullChecker.m81303a(coreAssetsSettingsM95177g.appUpdateVersionData)) {
            return coreAssetsSettingsM95177g.appUpdateVersionData.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public String m200510z() {
        CoreAssetsSettings coreAssetsSettingsM95177g = m95177g();
        return (NullChecker.m81303a(coreAssetsSettingsM95177g) && NullChecker.m81303a(coreAssetsSettingsM95177g.appUpdateVersionData)) ? coreAssetsSettingsM95177g.appUpdateVersionData.androidBaseVersion : "";
    }
}
