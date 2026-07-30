package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.PurposeItemData;
import com.p051p1.mobile.putong.core.data.PurposeRule;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class baj {

    /* JADX INFO: renamed from: a */
    public static jxd0 f75700a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f75701b;

    /* JADX INFO: renamed from: c */
    public static jxd0 f75702c;

    /* JADX INFO: renamed from: d */
    public static jxd0 f75703d;

    /* JADX INFO: renamed from: e */
    public static jxd0 f75704e;

    /* JADX INFO: renamed from: f */
    public static long f75705f;

    /* JADX INFO: renamed from: g */
    public static long f75706g;

    /* JADX INFO: renamed from: h */
    public static String f75707h;

    /* JADX INFO: renamed from: i */
    public static hre0 f75708i;

    /* JADX INFO: renamed from: j */
    public static ArrayList<LoopInputType> f75709j;

    /* JADX INFO: renamed from: k */
    public static String f75710k;

    /* JADX INFO: renamed from: l */
    public static Pair<String, String> f75711l;

    /* JADX INFO: renamed from: m */
    public static boolean f75712m;

    /* JADX INFO: renamed from: n */
    public static int f75713n;

    /* JADX INFO: renamed from: o */
    public static int f75714o;

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> f75715p;

    /* JADX INFO: renamed from: q */
    public static u3x f75716q;

    /* JADX INFO: renamed from: r */
    public static User f75717r;

    static {
        Boolean bool = Boolean.FALSE;
        f75700a = new jxd0("isDatingPurposeFilterExp", bool);
        f75701b = new jxd0("clearFriendPurpose", bool);
        f75702c = new jxd0("mockOtherFriendPurpose", bool);
        f75703d = new jxd0("isPurposeIgnore", bool);
        f75704e = new jxd0("isDatingPurposeDialog", bool);
        f75705f = 86400000L;
        f75706g = 86400000 * 3;
        f75707h = CoreStaticData.FriendPurposeHelperType.DATING_PURPOSE_FILTER;
        f75708i = null;
        f75709j = new ArrayList<>();
        f75711l = null;
        f75712m = false;
        f75713n = 0;
        f75714o = 0;
        f75715p = new ArrayList<>();
        f75716q = null;
        f75717r = null;
    }

    /* JADX INFO: renamed from: A */
    public static List<String> m103160A(String str) {
        ArrayList arrayList = new ArrayList();
        String strM103178S = m103178S(str);
        if (!TextUtils.isEmpty(strM103178S)) {
            arrayList.add(strM103178S);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopSelectFillData> m103161B(User user) {
        final List<String> list = NullChecker.m82486a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.pet : null;
        f75715p = new ArrayList<>(m103213z());
        if (jyb.m147479J(list)) {
            jyb.m147537z(f75715p, new y20() { // from class: l.q9j
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m52766i(false);
                }
            });
            return f75715p;
        }
        jyb.m147537z(f75715p, new y20() { // from class: l.r9j
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52760c(), (CharSequence) list.get(0)));
            }
        });
        return f75715p;
    }

    /* JADX INFO: renamed from: C */
    public static PurposeRule m103162C() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.m80481x().m80485F("new_profile_purpose_dialog")) ? (PurposeRule) RemoteConfig.m80481x().m80516v("new_profile_purpose_dialog", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.m82486a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public static PurposeRule m103163D() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.m80481x().m80485F("profile_purpose_filter")) ? (PurposeRule) RemoteConfig.m80481x().m80516v("profile_purpose_filter", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.m82486a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static List<Purpose> m103164E(String str) {
        ArrayList arrayList = new ArrayList();
        String strM103181V = m103181V(str);
        if (!TextUtils.isEmpty(strM103181V)) {
            arrayList.add(Purpose.get(strM103181V));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static List<String> m103165F(String str) {
        ArrayList arrayList = new ArrayList();
        String strM103182W = m103182W(str);
        if (!TextUtils.isEmpty(strM103182W)) {
            arrayList.add(strM103182W);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static ArrayList<LoopSelectFillData> m103166G(User user) {
        final QualificationType qualificationType = user.profile.studies.qualification;
        String string = CoreModule.f18263b.getString(R$string.f18545Ib);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        f75715p = new ArrayList<>(Collections.unmodifiableList(jyb.m147507f0(new LoopSelectFillData(string, loopSelectType), new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f18514Hb), loopSelectType), new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f18576Jb), loopSelectType), new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f18638Lb), loopSelectType), new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f18607Kb), loopSelectType))));
        if (qualificationType == null || qualificationType.isUnknownType()) {
            jyb.m147537z(f75715p, new y20() { // from class: l.x9j
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m52766i(false);
                }
            });
            return f75715p;
        }
        jyb.m147537z(f75715p, new y20() { // from class: l.y9j
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52760c(), baj.m103168I(qualificationType)));
            }
        });
        return f75715p;
    }

    /* JADX INFO: renamed from: H */
    public static QualificationType m103167H(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18545Ib))) {
            return QualificationType.get(QualificationType.HIGH_SCHOOL);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18514Hb))) {
            return QualificationType.get(QualificationType.BACHELOR);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18576Jb))) {
            return QualificationType.get(QualificationType.MASTER);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18638Lb))) {
            return QualificationType.get(QualificationType.DOCTOR);
        }
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18607Kb)) ? QualificationType.get(QualificationType.LOWER_PRIMARY) : QualificationType.get(QualificationType.LOWER_PRIMARY);
    }

    /* JADX INFO: renamed from: I */
    public static String m103168I(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return CoreModule.f18263b.getString(R$string.f18576Jb);
            case "BACHELOR":
                return CoreModule.f18263b.getString(R$string.f18514Hb);
            case "NO_QUALIFICATION":
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return CoreModule.f18263b.getString(R$string.f18545Ib);
            case "DOCTOR":
                return CoreModule.f18263b.getString(R$string.f18638Lb);
            default:
                return CoreModule.f18263b.getString(R$string.f18607Kb);
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m103169J(User user) {
        if (jyb.m147479J(f75709j)) {
            return true;
        }
        Iterator<LoopInputType> it = f75709j.iterator();
        while (it.hasNext()) {
            if (!LoopFragmentFactory.m52649J(it.next(), user, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static String m103170K(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18385D6))) {
            return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19190dk)) ? CoreModule.f18263b.getString(R$string.f19190dk) : "";
        }
        return str2 + CoreModule.f18263b.getString(R$string.f18385D6);
    }

    /* JADX INFO: renamed from: L */
    public static String m103171L(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18385D6))) {
            return CoreModule.f18263b.getString(R$string.f18385D6);
        }
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19190dk)) ? CoreModule.f18263b.getString(R$string.f19190dk) : "";
    }

    /* JADX INFO: renamed from: M */
    public static String m103172M(List<String> list, List<String> list2) {
        if (!jyb.m147479J(list2) && TextUtils.equals(list2.get(0), "1000000")) {
            return CoreModule.f18263b.getString(R$string.f19108b0);
        }
        if (!jyb.m147479J(list2) && TextUtils.equals(list2.get(0), CoreModule.f18263b.getString(R$string.f19066Zj))) {
            return CoreModule.f18263b.getString(R$string.f19066Zj);
        }
        if (jyb.m147479J(list)) {
            return "";
        }
        if (TextUtils.equals(list.get(0), "50000")) {
            return CoreModule.f18263b.getString(R$string.f18926V);
        }
        if (TextUtils.equals(list.get(0), "100000")) {
            return CoreModule.f18263b.getString(R$string.f18956W);
        }
        if (TextUtils.equals(list.get(0), "200000")) {
            return CoreModule.f18263b.getString(R$string.f18986X);
        }
        if (TextUtils.equals(list.get(0), "300000")) {
            return CoreModule.f18263b.getString(R$string.f19016Y);
        }
        if (TextUtils.equals(list.get(0), "600000")) {
            return CoreModule.f18263b.getString(R$string.f19046Z);
        }
        return TextUtils.equals(list.get(0), "1000000") ? CoreModule.f18263b.getString(R$string.f19077a0) : "";
    }

    /* JADX INFO: renamed from: N */
    public static boolean m103173N(User user, String str) {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m103174O(String str) {
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18354C6)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19097ak)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m103175P(String str) {
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18385D6)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19190dk)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m103176Q(List<String> list, List<String> list2) {
        if (jyb.m147479J(list) || !(TextUtils.equals(list.get(0), "50000") || TextUtils.equals(list.get(0), "100000") || TextUtils.equals(list.get(0), "200000") || TextUtils.equals(list.get(0), "300000") || TextUtils.equals(list.get(0), "600000") || TextUtils.equals(list.get(0), "1000000"))) {
            return !jyb.m147479J(list2) && (TextUtils.equals(list2.get(0), "1000000") || TextUtils.equals(list2.get(0), CoreModule.f18263b.getString(R$string.f19066Zj)));
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m103177R(String str) {
        return TextUtils.equals(str, "已有宠物") || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19097ak)) || TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj));
    }

    /* JADX INFO: renamed from: S */
    public static String m103178S(String str) {
        return m103177R(str) ? str : "";
    }

    /* JADX INFO: renamed from: T */
    public static bkj0<String, String, String> m103179T(String str) {
        PurposeRule purposeRuleM103162C = m103162C();
        if (!TextUtils.isEmpty(str) && NullChecker.m82486a(purposeRuleM103162C) && !jyb.m147479J(purposeRuleM103162C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM103162C.purposeRule) {
                if (TextUtils.equals(purposeItemData.key, str)) {
                    return bkj0.m104818a(purposeItemData.text, purposeItemData.icon1, purposeItemData.icon2);
                }
            }
        }
        return bkj0.m104818a("", "", "");
    }

    /* JADX INFO: renamed from: U */
    public static String m103180U(String str) {
        PurposeRule purposeRuleM103162C = m103162C();
        if (TextUtils.isEmpty(str) || !NullChecker.m82486a(purposeRuleM103162C) || jyb.m147479J(purposeRuleM103162C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM103162C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.purposeReport;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: V */
    public static String m103181V(String str) {
        PurposeRule purposeRuleM103162C = m103162C();
        if (TextUtils.isEmpty(str) || !NullChecker.m82486a(purposeRuleM103162C) || jyb.m147479J(purposeRuleM103162C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM103162C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.key;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: W */
    public static String m103182W(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19204e4))) {
            return CoreModule.f18263b.getString(R$string.f19204e4);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19174d4))) {
            return CoreModule.f18263b.getString(R$string.f19174d4);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19297h4))) {
            return CoreModule.f18263b.getString(R$string.f19297h4);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19266g4))) {
            return CoreModule.f18263b.getString(R$string.f19266g4);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19235f4))) {
            return CoreModule.f18263b.getString(R$string.f19235f4);
        }
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj)) ? CoreModule.f18263b.getString(R$string.f19066Zj) : "";
    }

    /* JADX INFO: renamed from: X */
    public static void m103183X(User user) {
        f75717r = user;
    }

    /* JADX INFO: renamed from: Y */
    public static void m103184Y(String str, User user) {
        f75710k = str;
        f75709j.clear();
        PurposeRule purposeRuleM103163D = m103163D();
        if (!NullChecker.m82486a(purposeRuleM103163D) || jyb.m147479J(purposeRuleM103163D.purposeRule)) {
            return;
        }
        for (PurposeItemData purposeItemData : purposeRuleM103163D.purposeRule) {
            if (TextUtils.equals(purposeItemData.key, str) && !jyb.m147479J(purposeItemData.enableRule)) {
                for (String str2 : purposeItemData.enableRule) {
                    str2.getClass();
                    switch (str2) {
                        case "height":
                            f75709j.add(LoopInputType.HEIGHT);
                            break;
                        case "income":
                            f75709j.add(LoopInputType.INCOME);
                            break;
                        case "qualification":
                            f75709j.add(LoopInputType.QUALIFICATION);
                            break;
                        case "car":
                            f75709j.add(LoopInputType.CAR);
                            break;
                        case "pic":
                            if (user.pictures.size() < purposeRuleM103163D.picNum) {
                                f75709j.add(LoopInputType.PHOTO);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "from":
                            f75709j.add(LoopInputType.HOMETOWN);
                            break;
                        case "house":
                            f75709j.add(LoopInputType.HOUSE);
                            break;
                        case "industry":
                            f75709j.add(LoopInputType.INDUSTRY);
                            break;
                        case "department":
                            f75709j.add(LoopInputType.DEPARTMENT);
                            break;
                        case "signature":
                            f75709j.add(LoopInputType.SIGNATURE);
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m103185Z(final Act act, String str, String str2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_complete_profile_popup", Dialog.class.getName());
        final User userMo225055clone = CoreModule.m30930K().me_().mo225055clone();
        m103183X(userMo225055clone);
        l4g0VarM204399c.m152781p(jyb.m147494Y("dating_purpose", str));
        new jl80.C17971a(act).m146024S(dbc0.f86964eo).m146056y0("资料还不够完善").m146051t0("想认识“" + str2 + "”的人，需要填写更多资料，以更好的了解彼此").m146034c0("完善资料", new Runnable() { // from class: l.aaj
            @Override // java.lang.Runnable
            public final void run() {
                baj.m103199l(act, userMo225055clone);
            }
        }).m146028W("稍后再说").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.p9j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146021P(false).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m103187a0(User user, Act act, x20 x20Var, String str) {
        if (!NullChecker.m82486a(user) || hlh0.m135741a().m135743c()) {
            return;
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        u3x u3xVar = new u3x(act, str);
        f75716q = u3xVar;
        u3xVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.z9j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(false, "showProfilePurposeDlg");
            }
        });
        hlh0.m135741a().m135750j(true, "showProfilePurposeDlg");
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.datingPurposePopup, act, f75716q, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(f75716q));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m103189b0(Act act) {
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (!NullChecker.m82486a(f75708i)) {
            f75708i = new hre0(act);
        }
        f75708i.show();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m103199l(Act act, User user) {
        i4g0.m138520r("e_complete_profile", "p_complete_profile_popup");
        act.startActivityForResult(ProfileInfoLoopEditAct.m52690Z1(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FILTER_DIALOG, null, user, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG), 3500);
        act.overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
    }

    /* JADX INFO: renamed from: n */
    public static String m103201n(String str) {
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18354C6))) {
            return CoreModule.f18263b.getString(R$string.f18354C6);
        }
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19097ak))) {
            return CoreModule.f18263b.getString(R$string.f19097ak);
        }
        return TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj)) ? CoreModule.f18263b.getString(R$string.f19066Zj) : "";
    }

    /* JADX INFO: renamed from: o */
    public static void m103202o() {
        f75713n = 0;
    }

    /* JADX INFO: renamed from: p */
    public static List<LoopSelectFillData> m103203p() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.f18263b.getString(R$string.f18354C6);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData(string, loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f19097ak), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<String> m103204q(String str) {
        ArrayList arrayList = new ArrayList();
        String strM103201n = m103201n(str);
        if (!TextUtils.isEmpty(strM103201n)) {
            arrayList.add(strM103201n);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m103205r(User user) {
        final List<String> list = NullChecker.m82486a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.car : null;
        f75715p = new ArrayList<>(m103203p());
        if (jyb.m147479J(list)) {
            jyb.m147537z(f75715p, new y20() { // from class: l.v9j
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m52766i(false);
                }
            });
            return f75715p;
        }
        jyb.m147537z(f75715p, new y20() { // from class: l.w9j
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52760c(), (CharSequence) list.get(0)));
            }
        });
        return f75715p;
    }

    /* JADX INFO: renamed from: s */
    public static Pair<String, String> m103206s() {
        return f75711l;
    }

    /* JADX INFO: renamed from: t */
    public static List<LoopSelectFillData> m103207t() {
        PurposeRule purposeRuleM103162C = m103162C();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(purposeRuleM103162C) && !jyb.m147479J(purposeRuleM103162C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM103162C.purposeRule) {
                if (gra.m131676e2()) {
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
    public static ArrayList<LoopSelectFillData> m103208u(User user) {
        final List<Purpose> list = user.profile.extensions.basic.friendPurpose;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>(m103207t());
        f75715p = arrayList;
        Collections.shuffle(arrayList);
        if (jyb.m147479J(list)) {
            jyb.m147537z(f75715p, new y20() { // from class: l.o9j
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m52766i(false);
                }
            });
            return f75715p;
        }
        jyb.m147537z(f75715p, new y20() { // from class: l.s9j
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals(((Purpose) list.get(0)).toString(), loopSelectFillData.m52759b()));
            }
        });
        return f75715p;
    }

    /* JADX INFO: renamed from: v */
    public static List<String> m103209v() {
        ArrayList arrayList = new ArrayList();
        for (int i = 140; i <= 210; i++) {
            arrayList.add(i + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static List<LoopSelectFillData> m103210w() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.f18263b.getString(R$string.f18926V);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("50000", string, loopSelectType));
        arrayList.add(new LoopSelectFillData("100000", CoreModule.f18263b.getString(R$string.f18956W), loopSelectType));
        arrayList.add(new LoopSelectFillData("200000", CoreModule.f18263b.getString(R$string.f18986X), loopSelectType));
        arrayList.add(new LoopSelectFillData("300000", CoreModule.f18263b.getString(R$string.f19016Y), loopSelectType));
        arrayList.add(new LoopSelectFillData("600000", CoreModule.f18263b.getString(R$string.f19046Z), loopSelectType));
        arrayList.add(new LoopSelectFillData("1000000", CoreModule.f18263b.getString(R$string.f19077a0), loopSelectType));
        arrayList.add(new LoopSelectFillData("LOW_1000000", CoreModule.f18263b.getString(R$string.f19108b0), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static Pair<List<String>, List<String>> m103211x(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18926V))) {
            arrayList.add("");
            arrayList2.add("50000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18956W))) {
            arrayList.add("50000");
            arrayList2.add("100000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f18986X))) {
            arrayList.add("100000");
            arrayList2.add("200000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19016Y))) {
            arrayList.add("200000");
            arrayList2.add("300000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19046Z))) {
            arrayList.add("300000");
            arrayList2.add("600000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19077a0))) {
            arrayList.add("600000");
            arrayList2.add("1000000");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19108b0))) {
            arrayList.add("1000000");
            arrayList2.add("");
        } else if (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj))) {
            arrayList.add(CoreModule.f18263b.getString(R$string.f19066Zj));
            arrayList2.add("");
        } else {
            arrayList.add("");
            arrayList2.add("");
        }
        return Pair.create(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m103212y(User user) {
        List<String> list;
        List<String> list2;
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.lowIncome;
            list2 = userWealth.upperIncome;
        } else {
            list = null;
            list2 = null;
        }
        final String strM103172M = m103172M(list2, list);
        f75715p = new ArrayList<>(m103210w());
        if (TextUtils.isEmpty(strM103172M)) {
            jyb.m147537z(f75715p, new y20() { // from class: l.t9j
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m52766i(false);
                }
            });
            return f75715p;
        }
        jyb.m147537z(f75715p, new y20() { // from class: l.u9j
            @Override // p153l.y20
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52760c(), strM103172M));
            }
        });
        return f75715p;
    }

    /* JADX INFO: renamed from: z */
    public static List<LoopSelectFillData> m103213z() {
        ArrayList arrayList = new ArrayList();
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("已有宠物", loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.f18263b.getString(R$string.f19097ak), loopSelectType));
        return arrayList;
    }
}
