package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.PurposeItemData;
import com.p046p1.mobile.putong.core.data.PurposeRule;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h7j {

    /* JADX INFO: renamed from: a */
    public static hpd0 f106283a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f106284b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f106285c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f106286d;

    /* JADX INFO: renamed from: e */
    public static hpd0 f106287e;

    /* JADX INFO: renamed from: f */
    public static long f106288f;

    /* JADX INFO: renamed from: g */
    public static long f106289g;

    /* JADX INFO: renamed from: h */
    public static String f106290h;

    /* JADX INFO: renamed from: i */
    public static cje0 f106291i;

    /* JADX INFO: renamed from: j */
    public static ArrayList<LoopInputType> f106292j;

    /* JADX INFO: renamed from: k */
    public static String f106293k;

    /* JADX INFO: renamed from: l */
    public static Pair<String, String> f106294l;

    /* JADX INFO: renamed from: m */
    public static boolean f106295m;

    /* JADX INFO: renamed from: n */
    public static int f106296n;

    /* JADX INFO: renamed from: o */
    public static int f106297o;

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> f106298p;

    /* JADX INFO: renamed from: q */
    public static v0x f106299q;

    /* JADX INFO: renamed from: r */
    public static User f106300r;

    static {
        Boolean bool = Boolean.FALSE;
        f106283a = new hpd0("isDatingPurposeFilterExp", bool);
        f106284b = new hpd0("clearFriendPurpose", bool);
        f106285c = new hpd0("mockOtherFriendPurpose", bool);
        f106286d = new hpd0("isPurposeIgnore", bool);
        f106287e = new hpd0("isDatingPurposeDialog", bool);
        f106288f = 86400000L;
        f106289g = 86400000 * 3;
        f106290h = CoreStaticData.FriendPurposeHelperType.DATING_PURPOSE_FILTER;
        f106291i = null;
        f106292j = new ArrayList<>();
        f106294l = null;
        f106295m = false;
        f106296n = 0;
        f106297o = 0;
        f106298p = new ArrayList<>();
        f106299q = null;
        f106300r = null;
    }

    /* JADX INFO: renamed from: A */
    public static List<String> m129689A(String str) {
        ArrayList arrayList = new ArrayList();
        String strM129707S = m129707S(str);
        if (!TextUtils.isEmpty(strM129707S)) {
            arrayList.add(strM129707S);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopSelectFillData> m129690B(User user) {
        final List<String> list = NullChecker.m81303a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.pet : null;
        f106298p = new ArrayList<>(m129742z());
        if (vwb.m200296J(list)) {
            vwb.m200354z(f106298p, new e30() { // from class: l.w6j
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m51583i(false);
                }
            });
            return f106298p;
        }
        vwb.m200354z(f106298p, new e30() { // from class: l.x6j
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals(loopSelectFillData.m51577c(), (CharSequence) list.get(0)));
            }
        });
        return f106298p;
    }

    /* JADX INFO: renamed from: C */
    public static PurposeRule m129691C() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("new_profile_purpose_dialog")) ? (PurposeRule) RemoteConfig.m79298x().m79333v("new_profile_purpose_dialog", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.m81303a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public static PurposeRule m129692D() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("profile_purpose_filter")) ? (PurposeRule) RemoteConfig.m79298x().m79333v("profile_purpose_filter", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.m81303a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static List<Purpose> m129693E(String str) {
        ArrayList arrayList = new ArrayList();
        String strM129710V = m129710V(str);
        if (!TextUtils.isEmpty(strM129710V)) {
            arrayList.add(Purpose.get(strM129710V));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static List<String> m129694F(String str) {
        ArrayList arrayList = new ArrayList();
        String strM129711W = m129711W(str);
        if (!TextUtils.isEmpty(strM129711W)) {
            arrayList.add(strM129711W);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static ArrayList<LoopSelectFillData> m129695G(User user) {
        final QualificationType qualificationType = user.profile.studies.qualification;
        String string = CoreModule.f17544b.getString(R$string.f18940tb);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        f106298p = new ArrayList<>(Collections.unmodifiableList(vwb.m200324f0(new LoopSelectFillData(string, loopSelectType), new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f18910sb), loopSelectType), new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f18970ub), loopSelectType), new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f19030wb), loopSelectType), new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f19000vb), loopSelectType))));
        if (qualificationType == null || qualificationType.isUnknownType()) {
            vwb.m200354z(f106298p, new e30() { // from class: l.d7j
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m51583i(false);
                }
            });
            return f106298p;
        }
        vwb.m200354z(f106298p, new e30() { // from class: l.e7j
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals(loopSelectFillData.m51577c(), h7j.m129697I(qualificationType)));
            }
        });
        return f106298p;
    }

    /* JADX INFO: renamed from: H */
    public static QualificationType m129696H(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18940tb))) {
            return QualificationType.get(QualificationType.HIGH_SCHOOL);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18910sb))) {
            return QualificationType.get(QualificationType.BACHELOR);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18970ub))) {
            return QualificationType.get(QualificationType.MASTER);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f19030wb))) {
            return QualificationType.get(QualificationType.DOCTOR);
        }
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f19000vb)) ? QualificationType.get(QualificationType.LOWER_PRIMARY) : QualificationType.get(QualificationType.LOWER_PRIMARY);
    }

    /* JADX INFO: renamed from: I */
    public static String m129697I(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return CoreModule.f17544b.getString(R$string.f18970ub);
            case "BACHELOR":
                return CoreModule.f17544b.getString(R$string.f18910sb);
            case "NO_QUALIFICATION":
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return CoreModule.f17544b.getString(R$string.f18940tb);
            case "DOCTOR":
                return CoreModule.f17544b.getString(R$string.f19030wb);
            default:
                return CoreModule.f17544b.getString(R$string.f19000vb);
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m129698J(User user) {
        if (vwb.m200296J(f106292j)) {
            return true;
        }
        Iterator<LoopInputType> it = f106292j.iterator();
        while (it.hasNext()) {
            if (!LoopFragmentFactory.m51466J(it.next(), user, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static String m129699K(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17603B6))) {
            return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17796Hj)) ? CoreModule.f17544b.getString(R$string.f17796Hj) : "";
        }
        return str2 + CoreModule.f17544b.getString(R$string.f17603B6);
    }

    /* JADX INFO: renamed from: L */
    public static String m129700L(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17603B6))) {
            return CoreModule.f17544b.getString(R$string.f17603B6);
        }
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17796Hj)) ? CoreModule.f17544b.getString(R$string.f17796Hj) : "";
    }

    /* JADX INFO: renamed from: M */
    public static String m129701M(List<String> list, List<String> list2) {
        if (!vwb.m200296J(list2) && TextUtils.equals(list2.get(0), "1000000")) {
            return CoreModule.f17544b.getString(R$string.f18378b0);
        }
        if (!vwb.m200296J(list2) && TextUtils.equals(list2.get(0), CoreModule.f17544b.getString(R$string.f17676Dj))) {
            return CoreModule.f17544b.getString(R$string.f17676Dj);
        }
        if (vwb.m200296J(list)) {
            return "";
        }
        if (TextUtils.equals(list.get(0), "50000")) {
            return CoreModule.f17544b.getString(R$string.f18196V);
        }
        if (TextUtils.equals(list.get(0), "100000")) {
            return CoreModule.f17544b.getString(R$string.f18226W);
        }
        if (TextUtils.equals(list.get(0), "200000")) {
            return CoreModule.f17544b.getString(R$string.f18256X);
        }
        if (TextUtils.equals(list.get(0), "300000")) {
            return CoreModule.f17544b.getString(R$string.f18286Y);
        }
        if (TextUtils.equals(list.get(0), "600000")) {
            return CoreModule.f17544b.getString(R$string.f18316Z);
        }
        return TextUtils.equals(list.get(0), "1000000") ? CoreModule.f17544b.getString(R$string.f18347a0) : "";
    }

    /* JADX INFO: renamed from: N */
    public static boolean m129702N(User user, String str) {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m129703O(String str) {
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17573A6)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17706Ej)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m129704P(String str) {
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17603B6)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17796Hj)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m129705Q(List<String> list, List<String> list2) {
        if (vwb.m200296J(list) || !(TextUtils.equals(list.get(0), "50000") || TextUtils.equals(list.get(0), "100000") || TextUtils.equals(list.get(0), "200000") || TextUtils.equals(list.get(0), "300000") || TextUtils.equals(list.get(0), "600000") || TextUtils.equals(list.get(0), "1000000"))) {
            return !vwb.m200296J(list2) && (TextUtils.equals(list2.get(0), "1000000") || TextUtils.equals(list2.get(0), CoreModule.f17544b.getString(R$string.f17676Dj)));
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m129706R(String str) {
        return TextUtils.equals(str, "已有宠物") || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17706Ej)) || TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj));
    }

    /* JADX INFO: renamed from: S */
    public static String m129707S(String str) {
        return m129706R(str) ? str : "";
    }

    /* JADX INFO: renamed from: T */
    public static xaj0<String, String, String> m129708T(String str) {
        PurposeRule purposeRuleM129691C = m129691C();
        if (!TextUtils.isEmpty(str) && NullChecker.m81303a(purposeRuleM129691C) && !vwb.m200296J(purposeRuleM129691C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM129691C.purposeRule) {
                if (TextUtils.equals(purposeItemData.key, str)) {
                    return xaj0.m207578a(purposeItemData.text, purposeItemData.icon1, purposeItemData.icon2);
                }
            }
        }
        return xaj0.m207578a("", "", "");
    }

    /* JADX INFO: renamed from: U */
    public static String m129709U(String str) {
        PurposeRule purposeRuleM129691C = m129691C();
        if (TextUtils.isEmpty(str) || !NullChecker.m81303a(purposeRuleM129691C) || vwb.m200296J(purposeRuleM129691C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM129691C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.purposeReport;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: V */
    public static String m129710V(String str) {
        PurposeRule purposeRuleM129691C = m129691C();
        if (TextUtils.isEmpty(str) || !NullChecker.m81303a(purposeRuleM129691C) || vwb.m200296J(purposeRuleM129691C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM129691C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.key;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: W */
    public static String m129711W(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18413c4))) {
            return CoreModule.f17544b.getString(R$string.f18413c4);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18382b4))) {
            return CoreModule.f17544b.getString(R$string.f18382b4);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18505f4))) {
            return CoreModule.f17544b.getString(R$string.f18505f4);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18474e4))) {
            return CoreModule.f17544b.getString(R$string.f18474e4);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18444d4))) {
            return CoreModule.f17544b.getString(R$string.f18444d4);
        }
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj)) ? CoreModule.f17544b.getString(R$string.f17676Dj) : "";
    }

    /* JADX INFO: renamed from: X */
    public static void m129712X(User user) {
        f106300r = user;
    }

    /* JADX INFO: renamed from: Y */
    public static void m129713Y(String str, User user) {
        f106293k = str;
        f106292j.clear();
        PurposeRule purposeRuleM129692D = m129692D();
        if (!NullChecker.m81303a(purposeRuleM129692D) || vwb.m200296J(purposeRuleM129692D.purposeRule)) {
            return;
        }
        for (PurposeItemData purposeItemData : purposeRuleM129692D.purposeRule) {
            if (TextUtils.equals(purposeItemData.key, str) && !vwb.m200296J(purposeItemData.enableRule)) {
                for (String str2 : purposeItemData.enableRule) {
                    str2.getClass();
                    switch (str2) {
                        case "height":
                            f106292j.add(LoopInputType.HEIGHT);
                            break;
                        case "income":
                            f106292j.add(LoopInputType.INCOME);
                            break;
                        case "qualification":
                            f106292j.add(LoopInputType.QUALIFICATION);
                            break;
                        case "car":
                            f106292j.add(LoopInputType.CAR);
                            break;
                        case "pic":
                            if (user.pictures.size() < purposeRuleM129692D.picNum) {
                                f106292j.add(LoopInputType.PHOTO);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "from":
                            f106292j.add(LoopInputType.HOMETOWN);
                            break;
                        case "house":
                            f106292j.add(LoopInputType.HOUSE);
                            break;
                        case "industry":
                            f106292j.add(LoopInputType.INDUSTRY);
                            break;
                        case "department":
                            f106292j.add(LoopInputType.DEPARTMENT);
                            break;
                        case "signature":
                            f106292j.add(LoopInputType.SIGNATURE);
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m129714Z(final Act act, String str, String str2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_complete_profile_popup", Dialog.class.getName());
        final User userMo223809clone = CoreModule.m29932K().me_().mo223809clone();
        m129712X(userMo223809clone);
        cwf0VarM133794c.m109040p(vwb.m200311Y("dating_purpose", str));
        new dd80.C16336a(act).m110964S(x2c0.f190466pn).m110996y0("资料还不够完善").m110991t0("想认识“" + str2 + "”的人，需要填写更多资料，以更好的了解彼此").m110974c0("完善资料", new Runnable() { // from class: l.g7j
            @Override // java.lang.Runnable
            public final void run() {
                h7j.m129728l(act, userMo223809clone);
            }
        }).m110968W("稍后再说").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.v6j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110961P(false).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m129716a0(User user, Act act, d30 d30Var, String str) {
        if (!NullChecker.m81303a(user) || zch0.m218024a().m218026c()) {
            return;
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        v0x v0xVar = new v0x(act, str);
        f106299q = v0xVar;
        v0xVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f7j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(false, "showProfilePurposeDlg");
            }
        });
        zch0.m218024a().m218033j(true, "showProfilePurposeDlg");
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.datingPurposePopup, act, f106299q, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(f106299q));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m129718b0(Act act) {
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (!NullChecker.m81303a(f106291i)) {
            f106291i = new cje0(act);
        }
        f106291i.show();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m129728l(Act act, User user) {
        zvf0.m220396r("e_complete_profile", "p_complete_profile_popup");
        act.startActivityForResult(ProfileInfoLoopEditAct.m51507Y1(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FILTER_DIALOG, null, user, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG), 3500);
        act.overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
    }

    /* JADX INFO: renamed from: n */
    public static String m129730n(String str) {
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17573A6))) {
            return CoreModule.f17544b.getString(R$string.f17573A6);
        }
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17706Ej))) {
            return CoreModule.f17544b.getString(R$string.f17706Ej);
        }
        return TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj)) ? CoreModule.f17544b.getString(R$string.f17676Dj) : "";
    }

    /* JADX INFO: renamed from: o */
    public static void m129731o() {
        f106296n = 0;
    }

    /* JADX INFO: renamed from: p */
    public static List<LoopSelectFillData> m129732p() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.f17544b.getString(R$string.f17573A6);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData(string, loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f17706Ej), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<String> m129733q(String str) {
        ArrayList arrayList = new ArrayList();
        String strM129730n = m129730n(str);
        if (!TextUtils.isEmpty(strM129730n)) {
            arrayList.add(strM129730n);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m129734r(User user) {
        final List<String> list = NullChecker.m81303a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.car : null;
        f106298p = new ArrayList<>(m129732p());
        if (vwb.m200296J(list)) {
            vwb.m200354z(f106298p, new e30() { // from class: l.b7j
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m51583i(false);
                }
            });
            return f106298p;
        }
        vwb.m200354z(f106298p, new e30() { // from class: l.c7j
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals(loopSelectFillData.m51577c(), (CharSequence) list.get(0)));
            }
        });
        return f106298p;
    }

    /* JADX INFO: renamed from: s */
    public static Pair<String, String> m129735s() {
        return f106294l;
    }

    /* JADX INFO: renamed from: t */
    public static List<LoopSelectFillData> m129736t() {
        PurposeRule purposeRuleM129691C = m129691C();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(purposeRuleM129691C) && !vwb.m200296J(purposeRuleM129691C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM129691C.purposeRule) {
                if (upa.m194745e2()) {
                    String str = purposeItemData.text;
                    str.getClass();
                    switch (str) {
                        case "严肃点":
                            purposeItemData.text = "想结婚";
                            break;
                        case "恋爱吧":
                            purposeItemData.text = "谈个恋爱";
                            break;
                        case "没想好":
                            purposeItemData.text = "随便看看";
                            break;
                        case "破个圈":
                            purposeItemData.text = "交个朋友";
                            break;
                    }
                }
                arrayList.add(new LoopSelectFillData(purposeItemData.key, purposeItemData.text, LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList<LoopSelectFillData> m129737u(User user) {
        final List<Purpose> list = user.profile.extensions.basic.friendPurpose;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>(m129736t());
        f106298p = arrayList;
        Collections.shuffle(arrayList);
        if (vwb.m200296J(list)) {
            vwb.m200354z(f106298p, new e30() { // from class: l.u6j
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m51583i(false);
                }
            });
            return f106298p;
        }
        vwb.m200354z(f106298p, new e30() { // from class: l.y6j
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals(((Purpose) list.get(0)).toString(), loopSelectFillData.m51576b()));
            }
        });
        return f106298p;
    }

    /* JADX INFO: renamed from: v */
    public static List<String> m129738v() {
        ArrayList arrayList = new ArrayList();
        for (int i = 140; i <= 210; i++) {
            arrayList.add(i + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static List<LoopSelectFillData> m129739w() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.f17544b.getString(R$string.f18196V);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("50000", string, loopSelectType));
        arrayList.add(new LoopSelectFillData("100000", CoreModule.f17544b.getString(R$string.f18226W), loopSelectType));
        arrayList.add(new LoopSelectFillData("200000", CoreModule.f17544b.getString(R$string.f18256X), loopSelectType));
        arrayList.add(new LoopSelectFillData("300000", CoreModule.f17544b.getString(R$string.f18286Y), loopSelectType));
        arrayList.add(new LoopSelectFillData("600000", CoreModule.f17544b.getString(R$string.f18316Z), loopSelectType));
        arrayList.add(new LoopSelectFillData("1000000", CoreModule.f17544b.getString(R$string.f18347a0), loopSelectType));
        arrayList.add(new LoopSelectFillData("LOW_1000000", CoreModule.f17544b.getString(R$string.f18378b0), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static Pair<List<String>, List<String>> m129740x(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18196V))) {
            arrayList.add("");
            arrayList2.add("50000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18226W))) {
            arrayList.add("50000");
            arrayList2.add("100000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18256X))) {
            arrayList.add("100000");
            arrayList2.add("200000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18286Y))) {
            arrayList.add("200000");
            arrayList2.add("300000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18316Z))) {
            arrayList.add("300000");
            arrayList2.add("600000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18347a0))) {
            arrayList.add("600000");
            arrayList2.add("1000000");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f18378b0))) {
            arrayList.add("1000000");
            arrayList2.add("");
        } else if (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj))) {
            arrayList.add(CoreModule.f17544b.getString(R$string.f17676Dj));
            arrayList2.add("");
        } else {
            arrayList.add("");
            arrayList2.add("");
        }
        return Pair.create(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m129741y(User user) {
        List<String> list;
        List<String> list2;
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.lowIncome;
            list2 = userWealth.upperIncome;
        } else {
            list = null;
            list2 = null;
        }
        final String strM129701M = m129701M(list2, list);
        f106298p = new ArrayList<>(m129739w());
        if (TextUtils.isEmpty(strM129701M)) {
            vwb.m200354z(f106298p, new e30() { // from class: l.z6j
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m51583i(false);
                }
            });
            return f106298p;
        }
        vwb.m200354z(f106298p, new e30() { // from class: l.a7j
            @Override // p149l.e30
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m51583i(TextUtils.equals(loopSelectFillData.m51577c(), strM129701M));
            }
        });
        return f106298p;
    }

    /* JADX INFO: renamed from: z */
    public static List<LoopSelectFillData> m129742z() {
        ArrayList arrayList = new ArrayList();
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("已有宠物", loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.f17544b.getString(R$string.f17706Ej), loopSelectType));
        return arrayList;
    }
}
