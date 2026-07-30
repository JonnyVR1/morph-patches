package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.data.AnonymityAsset;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.GraduateActivity;
import com.p051p1.mobile.putong.core.data.LetterMultilingual;
import com.p051p1.mobile.putong.core.data.MissMatch;
import com.p051p1.mobile.putong.core.data.ShowLiveForIntlAdUser;
import com.p051p1.mobile.putong.core.data.SpecialCard;
import com.p051p1.mobile.putong.core.data.ThirdPartySticker;
import com.p051p1.mobile.putong.core.data.UserScrapeReporting;
import com.p051p1.mobile.putong.data.Anonymity;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.LetterWrapper;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
public class yy6 extends jf00<CoreAssetsSettings> {

    /* JADX INFO: renamed from: d */
    public static ConcurrentHashMap<String, ovb0<rcj<String, String, Boolean>, ArrayList<String>, String, String>> f202082d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public volatile boolean f202083c = false;

    static {
        m217930M();
    }

    /* JADX INFO: renamed from: H */
    public static void m217927H(SpecialCard specialCard) {
        C4880a0.m32390j().m32398m(specialCard);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m217928J(List<String> list, final String str) {
        return (TextUtils.isEmpty(str) || list == null || list.size() == 0 || (bsj0.m106288x(str).size() <= 0 && jyb.m147529r(list, new qcj() { // from class: l.xy6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.toLowerCase().contains(((String) obj).toLowerCase()));
            }
        }) == null)) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    public static void m217929L(MissMatch missMatch) {
        CoreModule.f18264c.f20405m0.m32156v8(missMatch);
    }

    /* JADX INFO: renamed from: M */
    public static void m217930M() {
        f202082d.clear();
        f202082d.put("christmas", jyb.m147495Z(new sy6(), jyb.m147507f0("christmas", "圣诞"), "animations/christmas/config.xml", "animations/christmas/pic"));
        f202082d.put("hi", jyb.m147495Z(new ty6(), jyb.m147507f0("hi", "你好", "hello"), "animations/hi/config.xml", "animations/hi/pic"));
        f202082d.put("no", jyb.m147495Z(new ty6(), jyb.m147507f0("no", "不是"), "animations/no/config.xml", "animations/no/pic"));
        f202082d.put("singleDog", jyb.m147495Z(new sy6(), jyb.m147507f0("单身狗"), "animations/singleDog/config.xml", "animations/singleDog/pic"));
        f202082d.put("what", jyb.m147495Z(new uy6(), jyb.m147507f0("什么", "什么？", "什么呢？", "什么呢"), "animations/what/config.xml", "animations/what/pic"));
        f202082d.put("smile", jyb.m147495Z(new sy6(), jyb.m147507f0("[大笑]", "[laugh]"), "animations/smile/config.xml", "animations/smile/pic"));
        f202082d.put("cry", jyb.m147495Z(new sy6(), jyb.m147507f0("[crying]", "[哭]", "[失望]", "[disappointed]"), "animations/cry/config.xml", "animations/cry/pic"));
        f202082d.put("yeah", jyb.m147495Z(new sy6(), jyb.m147507f0("[调皮]", "[naughty]", "[吐舌]", "[tongue]"), "animations/yeah/config.xml", "animations/yeah/pic"));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m217936q(CoreAssetsSettings coreAssetsSettings) {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = coreAssetsSettings.showLiveForIntlAdUser;
        return Boolean.valueOf(showLiveForIntlAdUser != null && showLiveForIntlAdUser.f211039android);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Anonymity m217937r(AnonymityAsset anonymityAsset) {
        Anonymity anonymity = new Anonymity();
        anonymity.f39568id = jyb.m147482M(anonymityAsset.f21086id);
        anonymity.identifier = jyb.m147482M(anonymityAsset.identifier);
        return anonymity;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m217938s(rcj rcjVar, String str, String str2) {
        return (Boolean) rcjVar.call(str.toLowerCase(), str2);
    }

    /* JADX INFO: renamed from: u */
    public static String m217939u(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : f202082d.keySet()) {
            ovb0<rcj<String, String, Boolean>, ArrayList<String>, String, String> ovb0Var = f202082d.get(str2);
            if (NullChecker.m82486a(ovb0Var)) {
                final rcj<String, String, Boolean> rcjVar = ovb0Var.f149248a;
                if (jyb.m147520m(ovb0Var.f149249b, new qcj() { // from class: l.oy6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return yy6.m217938s(rcjVar, str, (String) obj);
                    }
                })) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static void m217940v(ThirdPartySticker thirdPartySticker) {
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
    public long m217941A() {
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        if (coreAssetsSettingsM144645g == null) {
            return Constants.ONE_MIN_IN_MILLIS;
        }
        long j = coreAssetsSettingsM144645g.counterPollingSeconds;
        return j <= 0 ? Constants.ONE_MIN_IN_MILLIS : j * 1000;
    }

    /* JADX INFO: renamed from: B */
    public List<LetterWrapper> m217942B(Gender gender, String str) {
        return m217943C(gender, str, false);
    }

    /* JADX INFO: renamed from: C */
    public List<LetterWrapper> m217943C(Gender gender, String str, boolean z) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM144645g = z ? CoreModule.f18264c.f20321K0.f84444U : m144645g();
        if (coreAssetsSettingsM144645g == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM144645g.intlLetterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM144645g.intlLetterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM144645g.intlLetterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM144645g.intlLetterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM144645g.intlLetterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM144645g.intlLetterContent;
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
    public List<LetterWrapper> m217944D(Gender gender, String str) {
        List<String> list;
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        if (coreAssetsSettingsM144645g == null || coreAssetsSettingsM144645g.letterContent == null) {
            return Collections.EMPTY_LIST;
        }
        if ("zh-CN".equals(str)) {
            boolean zEquals = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual = coreAssetsSettingsM144645g.letterContent;
            list = zEquals ? letterMultilingual.zhCN.female : letterMultilingual.zhCN.male;
        } else if ("zh-TW".equals(str)) {
            boolean zEquals2 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual2 = coreAssetsSettingsM144645g.letterContent;
            list = zEquals2 ? letterMultilingual2.zhTW.female : letterMultilingual2.zhTW.male;
        } else if ("ja-JP".equals(str)) {
            boolean zEquals3 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual3 = coreAssetsSettingsM144645g.letterContent;
            list = zEquals3 ? letterMultilingual3.jaJP.female : letterMultilingual3.jaJP.male;
        } else if ("ko-KR".equals(str)) {
            boolean zEquals4 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual4 = coreAssetsSettingsM144645g.letterContent;
            list = zEquals4 ? letterMultilingual4.koKR.female : letterMultilingual4.koKR.male;
        } else if ("id-ID".equals(str)) {
            boolean zEquals5 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual5 = coreAssetsSettingsM144645g.letterContent;
            list = zEquals5 ? letterMultilingual5.idID.female : letterMultilingual5.idID.male;
        } else {
            boolean zEquals6 = TEnum.equals(gender, "female");
            LetterMultilingual letterMultilingual6 = coreAssetsSettingsM144645g.letterContent;
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
    public MissMatch m217945E() {
        return (MissMatch) m144644f(new qcj() { // from class: l.wy6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).missMatch;
            }
        }, null);
    }

    /* JADX INFO: renamed from: F */
    public String m217946F() {
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        return (NullChecker.m82486a(coreAssetsSettingsM144645g) && NullChecker.m82486a(coreAssetsSettingsM144645g.appUpdateVersionData)) ? coreAssetsSettingsM144645g.appUpdateVersionData.androidReleaseVersion : "";
    }

    /* JADX INFO: renamed from: G */
    public SpecialCard m217947G() {
        return (SpecialCard) m144644f(new qcj() { // from class: l.vy6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreAssetsSettings) obj).specialCard;
            }
        }, null);
    }

    /* JADX INFO: renamed from: I */
    public boolean m217948I() {
        return ((Boolean) m144644f(new qcj() { // from class: l.ny6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreAssetsSettings) obj).enableVoiceCall >= 1);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public boolean m217949K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("验证码");
    }

    /* JADX INFO: renamed from: N */
    public boolean m217950N() {
        return ((Boolean) m144644f(new qcj() { // from class: l.ry6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yy6.m217936q((CoreAssetsSettings) obj);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public boolean m217951O() {
        GraduateActivity graduateActivity;
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        if (coreAssetsSettingsM144645g != null && (graduateActivity = coreAssetsSettingsM144645g.graduateActivity) != null && !TextUtils.isEmpty(graduateActivity.name) && !TextUtils.isEmpty(graduateActivity.startTime) && !TextUtils.isEmpty(graduateActivity.endTime) && !TextUtils.isEmpty(graduateActivity.entranceUrl)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                long time = simpleDateFormat.parse(graduateActivity.startTime).getTime();
                long time2 = simpleDateFormat.parse(graduateActivity.endTime).getTime();
                long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
                return jGuessedCurrentServerTime >= time && jGuessedCurrentServerTime <= time2;
            } catch (ParseException e) {
                CrashHelper.m82479c(e);
            }
        }
        return false;
    }

    @Override // p153l.jf00
    /* JADX INFO: renamed from: i */
    public JsonAdapter<CoreAssetsSettings> mo135323i() {
        return CoreAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: t */
    public List<String> m217952t() {
        UserScrapeReporting userScrapeReporting;
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        if (coreAssetsSettingsM144645g == null || (userScrapeReporting = coreAssetsSettingsM144645g.userScrapeReporting) == null) {
            return null;
        }
        return userScrapeReporting.keywords;
    }

    @Override // p153l.jf00
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo144646h(@NonNull CoreAssetsSettings coreAssetsSettings) {
        MissMatch missMatch;
        ThirdPartySticker thirdPartySticker;
        super.mo144646h(coreAssetsSettings);
        if (NullChecker.m82486a(CoreModule.f18264c) && coreAssetsSettings != null && (thirdPartySticker = coreAssetsSettings.thirdPartySticker) != null) {
            m217940v(thirdPartySticker);
        }
        if (NullChecker.m82486a(CoreModule.f18264c) && coreAssetsSettings != null && (missMatch = coreAssetsSettings.missMatch) != null) {
            m217929L(missMatch);
        }
        if (NullChecker.m82486a(CoreModule.f18264c) && NullChecker.m82486a(coreAssetsSettings) && NullChecker.m82486a(coreAssetsSettings.specialCard)) {
            m217927H(coreAssetsSettings.specialCard);
        }
        if (!NullChecker.m82486a(CoreModule.f18264c) || coreAssetsSettings == null) {
            return;
        }
        gta.m132210e().m132214d().mo34732Nq(coreAssetsSettings.autoPayEnable);
    }

    /* JADX INFO: renamed from: x */
    public List<Anonymity> m217954x(final boolean z) {
        return jyb.m147486Q((List) m144644f(new qcj() { // from class: l.py6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return (z ? coreAssetsSettings.anonymityImg.female : coreAssetsSettings.anonymityImg.male).items;
            }
        }, null), new qcj() { // from class: l.qy6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yy6.m217937r((AnonymityAsset) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public boolean m217955y() {
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        if (NullChecker.m82486a(coreAssetsSettingsM144645g) && NullChecker.m82486a(coreAssetsSettingsM144645g.appUpdateVersionData)) {
            return coreAssetsSettingsM144645g.appUpdateVersionData.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public String m217956z() {
        CoreAssetsSettings coreAssetsSettingsM144645g = m144645g();
        return (NullChecker.m82486a(coreAssetsSettingsM144645g) && NullChecker.m82486a(coreAssetsSettingsM144645g.appUpdateVersionData)) ? coreAssetsSettingsM144645g.appUpdateVersionData.androidBaseVersion : "";
    }
}
