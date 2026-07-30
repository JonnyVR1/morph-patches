package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.poplevel.CorePopLevel;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.PurposeItemData;
import com.p1.mobile.putong.core.data.PurposeRule;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.cje0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.hpd0;
import l.i0e;
import l.j760;
import l.rzb0;
import l.uc80;
import l.upa;
import l.v0x;
import l.vwb;
import l.wc80;
import l.x2c0;
import l.xaj0;
import l.zch0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h7j {

    /* JADX INFO: renamed from: a */
    public static hpd0 f11906a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f11907b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f11908c;

    /* JADX INFO: renamed from: d */
    public static hpd0 f11909d;

    /* JADX INFO: renamed from: e */
    public static hpd0 f11910e;

    /* JADX INFO: renamed from: f */
    public static long f11911f;

    /* JADX INFO: renamed from: g */
    public static long f11912g;

    /* JADX INFO: renamed from: h */
    public static String f11913h;

    /* JADX INFO: renamed from: i */
    public static cje0 f11914i;

    /* JADX INFO: renamed from: j */
    public static ArrayList<LoopInputType> f11915j;

    /* JADX INFO: renamed from: k */
    public static String f11916k;

    /* JADX INFO: renamed from: l */
    public static Pair<String, String> f11917l;

    /* JADX INFO: renamed from: m */
    public static boolean f11918m;

    /* JADX INFO: renamed from: n */
    public static int f11919n;

    /* JADX INFO: renamed from: o */
    public static int f11920o;

    /* JADX INFO: renamed from: p */
    public static ArrayList<LoopSelectFillData> f11921p;

    /* JADX INFO: renamed from: q */
    public static v0x f11922q;

    /* JADX INFO: renamed from: r */
    public static User f11923r;

    static {
        Boolean bool = Boolean.FALSE;
        f11906a = new hpd0("isDatingPurposeFilterExp", bool);
        f11907b = new hpd0("clearFriendPurpose", bool);
        f11908c = new hpd0("mockOtherFriendPurpose", bool);
        f11909d = new hpd0("isPurposeIgnore", bool);
        f11910e = new hpd0("isDatingPurposeDialog", bool);
        f11911f = 86400000L;
        f11912g = 86400000 * 3;
        f11913h = "dating_purpose_filter";
        f11914i = null;
        f11915j = new ArrayList<>();
        f11917l = null;
        f11918m = false;
        f11919n = 0;
        f11920o = 0;
        f11921p = new ArrayList<>();
        f11922q = null;
        f11923r = null;
    }

    /* JADX INFO: renamed from: A */
    public static List<String> m14220A(String str) {
        ArrayList arrayList = new ArrayList();
        String strM14238S = m14238S(str);
        if (!TextUtils.isEmpty(strM14238S)) {
            arrayList.add(strM14238S);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList<LoopSelectFillData> m14221B(User user) {
        final List list = NullChecker.a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.pet : null;
        f11921p = new ArrayList<>(m14273z());
        if (vwb.J(list)) {
            vwb.z(f11921p, new e30() { // from class: l.w6j
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m2069i(false);
                }
            });
            return f11921p;
        }
        vwb.z(f11921p, new e30() { // from class: l.x6j
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals(loopSelectFillData.m2063c(), (CharSequence) list.get(0)));
            }
        });
        return f11921p;
    }

    /* JADX INFO: renamed from: C */
    public static PurposeRule m14222C() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.x().F("new_profile_purpose_dialog")) ? (PurposeRule) RemoteConfig.x().v("new_profile_purpose_dialog", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public static PurposeRule m14223D() {
        try {
            PurposeRule purposeRule = !TextUtils.isEmpty(RemoteConfig.x().F("profile_purpose_filter")) ? (PurposeRule) RemoteConfig.x().v("profile_purpose_filter", PurposeRule.JSON_ADAPTER) : null;
            if (NullChecker.a(purposeRule)) {
                return purposeRule;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static List<Purpose> m14224E(String str) {
        ArrayList arrayList = new ArrayList();
        String strM14241V = m14241V(str);
        if (!TextUtils.isEmpty(strM14241V)) {
            arrayList.add(Purpose.get(strM14241V));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static List<String> m14225F(String str) {
        ArrayList arrayList = new ArrayList();
        String strM14242W = m14242W(str);
        if (!TextUtils.isEmpty(strM14242W)) {
            arrayList.add(strM14242W);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static ArrayList<LoopSelectFillData> m14226G(User user) {
        final QualificationType qualificationType = user.profile.studies.qualification;
        String string = CoreModule.b.getString(R.string.tb);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        f11921p = new ArrayList<>(Collections.unmodifiableList(vwb.f0(new LoopSelectFillData[]{new LoopSelectFillData(string, loopSelectType), new LoopSelectFillData(CoreModule.b.getString(R.string.sb), loopSelectType), new LoopSelectFillData(CoreModule.b.getString(R.string.ub), loopSelectType), new LoopSelectFillData(CoreModule.b.getString(R.string.wb), loopSelectType), new LoopSelectFillData(CoreModule.b.getString(R.string.vb), loopSelectType)})));
        if (qualificationType == null || qualificationType.isUnknownType()) {
            vwb.z(f11921p, new e30() { // from class: l.d7j
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m2069i(false);
                }
            });
            return f11921p;
        }
        vwb.z(f11921p, new e30() { // from class: l.e7j
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals(loopSelectFillData.m2063c(), h7j.m14228I(qualificationType)));
            }
        });
        return f11921p;
    }

    /* JADX INFO: renamed from: H */
    public static QualificationType m14227H(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.tb))) {
            return QualificationType.get("HIGH_SCHOOL");
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.sb))) {
            return QualificationType.get("BACHELOR");
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.ub))) {
            return QualificationType.get("MASTER");
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.wb))) {
            return QualificationType.get("DOCTOR");
        }
        return TextUtils.equals(str, CoreModule.b.getString(R.string.vb)) ? QualificationType.get("LOWER_PRIMARY") : QualificationType.get("LOWER_PRIMARY");
    }

    /* JADX INFO: renamed from: I */
    public static String m14228I(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return CoreModule.b.getString(R.string.ub);
            case "BACHELOR":
                return CoreModule.b.getString(R.string.sb);
            case "NO_QUALIFICATION":
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return CoreModule.b.getString(R.string.tb);
            case "DOCTOR":
                return CoreModule.b.getString(R.string.wb);
            default:
                return CoreModule.b.getString(R.string.vb);
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m14229J(User user) {
        if (vwb.J(f11915j)) {
            return true;
        }
        Iterator<LoopInputType> it = f11915j.iterator();
        while (it.hasNext()) {
            if (!LoopFragmentFactory.m1948J(it.next(), user, "from_filter_purpose_dialog")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public static String m14230K(String str, String str2) {
        if (!TextUtils.equals(str, CoreModule.b.getString(R.string.B6))) {
            return TextUtils.equals(str, CoreModule.b.getString(R.string.Hj)) ? CoreModule.b.getString(R.string.Hj) : "";
        }
        return str2 + CoreModule.b.getString(R.string.B6);
    }

    /* JADX INFO: renamed from: L */
    public static String m14231L(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.B6))) {
            return CoreModule.b.getString(R.string.B6);
        }
        return TextUtils.equals(str, CoreModule.b.getString(R.string.Hj)) ? CoreModule.b.getString(R.string.Hj) : "";
    }

    /* JADX INFO: renamed from: M */
    public static String m14232M(List<String> list, List<String> list2) {
        if (!vwb.J(list2) && TextUtils.equals(list2.get(0), "1000000")) {
            return CoreModule.b.getString(R.string.b0);
        }
        if (!vwb.J(list2) && TextUtils.equals(list2.get(0), CoreModule.b.getString(R.string.Dj))) {
            return CoreModule.b.getString(R.string.Dj);
        }
        if (vwb.J(list)) {
            return "";
        }
        if (TextUtils.equals(list.get(0), "50000")) {
            return CoreModule.b.getString(R.string.V);
        }
        if (TextUtils.equals(list.get(0), "100000")) {
            return CoreModule.b.getString(R.string.W);
        }
        if (TextUtils.equals(list.get(0), "200000")) {
            return CoreModule.b.getString(R.string.X);
        }
        if (TextUtils.equals(list.get(0), "300000")) {
            return CoreModule.b.getString(R.string.Y);
        }
        if (TextUtils.equals(list.get(0), "600000")) {
            return CoreModule.b.getString(R.string.Z);
        }
        return TextUtils.equals(list.get(0), "1000000") ? CoreModule.b.getString(R.string.a0) : "";
    }

    /* JADX INFO: renamed from: N */
    public static boolean m14233N(User user, String str) {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m14234O(String str) {
        return TextUtils.equals(str, CoreModule.b.getString(R.string.A6)) || TextUtils.equals(str, CoreModule.b.getString(R.string.Ej)) || TextUtils.equals(str, CoreModule.b.getString(R.string.Dj));
    }

    /* JADX INFO: renamed from: P */
    public static boolean m14235P(String str) {
        return TextUtils.equals(str, CoreModule.b.getString(R.string.B6)) || TextUtils.equals(str, CoreModule.b.getString(R.string.Hj)) || TextUtils.equals(str, CoreModule.b.getString(R.string.Dj));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m14236Q(List<String> list, List<String> list2) {
        if (vwb.J(list) || !(TextUtils.equals(list.get(0), "50000") || TextUtils.equals(list.get(0), "100000") || TextUtils.equals(list.get(0), "200000") || TextUtils.equals(list.get(0), "300000") || TextUtils.equals(list.get(0), "600000") || TextUtils.equals(list.get(0), "1000000"))) {
            return !vwb.J(list2) && (TextUtils.equals(list2.get(0), "1000000") || TextUtils.equals(list2.get(0), CoreModule.b.getString(R.string.Dj)));
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m14237R(String str) {
        return TextUtils.equals(str, "已有宠物") || TextUtils.equals(str, CoreModule.b.getString(R.string.Ej)) || TextUtils.equals(str, CoreModule.b.getString(R.string.Dj));
    }

    /* JADX INFO: renamed from: S */
    public static String m14238S(String str) {
        return m14237R(str) ? str : "";
    }

    /* JADX INFO: renamed from: T */
    public static xaj0<String, String, String> m14239T(String str) {
        PurposeRule purposeRuleM14222C = m14222C();
        if (!TextUtils.isEmpty(str) && NullChecker.a(purposeRuleM14222C) && !vwb.J(purposeRuleM14222C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM14222C.purposeRule) {
                if (TextUtils.equals(purposeItemData.key, str)) {
                    return xaj0.a(purposeItemData.text, purposeItemData.icon1, purposeItemData.icon2);
                }
            }
        }
        return xaj0.a("", "", "");
    }

    /* JADX INFO: renamed from: U */
    public static String m14240U(String str) {
        PurposeRule purposeRuleM14222C = m14222C();
        if (TextUtils.isEmpty(str) || !NullChecker.a(purposeRuleM14222C) || vwb.J(purposeRuleM14222C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM14222C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.purposeReport;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: V */
    public static String m14241V(String str) {
        PurposeRule purposeRuleM14222C = m14222C();
        if (TextUtils.isEmpty(str) || !NullChecker.a(purposeRuleM14222C) || vwb.J(purposeRuleM14222C.purposeRule)) {
            return "";
        }
        for (PurposeItemData purposeItemData : purposeRuleM14222C.purposeRule) {
            if (TextUtils.equals(purposeItemData.text, str)) {
                return purposeItemData.key;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: W */
    public static String m14242W(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.c4))) {
            return CoreModule.b.getString(R.string.c4);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.b4))) {
            return CoreModule.b.getString(R.string.b4);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.f4))) {
            return CoreModule.b.getString(R.string.f4);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.e4))) {
            return CoreModule.b.getString(R.string.e4);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.d4))) {
            return CoreModule.b.getString(R.string.d4);
        }
        return TextUtils.equals(str, CoreModule.b.getString(R.string.Dj)) ? CoreModule.b.getString(R.string.Dj) : "";
    }

    /* JADX INFO: renamed from: X */
    public static void m14243X(User user) {
        f11923r = user;
    }

    /* JADX INFO: renamed from: Y */
    public static void m14244Y(String str, User user) {
        f11916k = str;
        f11915j.clear();
        PurposeRule purposeRuleM14223D = m14223D();
        if (!NullChecker.a(purposeRuleM14223D) || vwb.J(purposeRuleM14223D.purposeRule)) {
            return;
        }
        for (PurposeItemData purposeItemData : purposeRuleM14223D.purposeRule) {
            if (TextUtils.equals(purposeItemData.key, str) && !vwb.J(purposeItemData.enableRule)) {
                for (String str2 : purposeItemData.enableRule) {
                    str2.getClass();
                    switch (str2) {
                        case "height":
                            f11915j.add(LoopInputType.HEIGHT);
                            break;
                        case "income":
                            f11915j.add(LoopInputType.INCOME);
                            break;
                        case "qualification":
                            f11915j.add(LoopInputType.QUALIFICATION);
                            break;
                        case "car":
                            f11915j.add(LoopInputType.CAR);
                            break;
                        case "pic":
                            if (user.pictures.size() < purposeRuleM14223D.picNum) {
                                f11915j.add(LoopInputType.PHOTO);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "from":
                            f11915j.add(LoopInputType.HOMETOWN);
                            break;
                        case "house":
                            f11915j.add(LoopInputType.HOUSE);
                            break;
                        case "industry":
                            f11915j.add(LoopInputType.INDUSTRY);
                            break;
                        case "department":
                            f11915j.add(LoopInputType.DEPARTMENT);
                            break;
                        case "signature":
                            f11915j.add(LoopInputType.SIGNATURE);
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m14245Z(final Act act, String str, String str2) {
        final cwf0 cwf0VarC = i0e.c("p_complete_profile_popup", Dialog.class.getName());
        final User userClone = CoreModule.K().me_().clone();
        m14243X(userClone);
        cwf0VarC.p(new j760[]{vwb.Y("dating_purpose", str)});
        new dd80.a(act).S(x2c0.pn).y0("资料还不够完善").t0("想认识“" + str2 + "”的人，需要填写更多资料，以更好的了解彼此").c0("完善资料", new Runnable() { // from class: l.g7j
            @Override // java.lang.Runnable
            public final void run() {
                h7j.m14259l(act, userClone);
            }
        }).W("稍后再说").n0(new DialogInterface.OnDismissListener() { // from class: l.v6j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).P(false).r0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m14247a0(User user, Act act, d30 d30Var, String str) {
        if (!NullChecker.a(user) || zch0.a().c()) {
            return;
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        v0x v0xVar = new v0x(act, str);
        f11922q = v0xVar;
        v0xVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f7j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.a().j(false, "showProfilePurposeDlg");
            }
        });
        zch0.a().j(true, "showProfilePurposeDlg");
        if (a.p().I()) {
            a.p().C(CorePopLevel.datingPurposePopup, act, f11922q, 20000);
        } else {
            wc80.e().q(uc80.a(f11922q));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m14249b0(Act act) {
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (!NullChecker.a(f11914i)) {
            f11914i = new cje0(act);
        }
        f11914i.show();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m14259l(Act act, User user) {
        zvf0.r("e_complete_profile", "p_complete_profile_popup");
        act.startActivityForResult(ProfileInfoLoopEditAct.m1989Y1(act, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FILTER_DIALOG, null, user, "from_filter_purpose_dialog"), 3500);
        act.overridePendingTransition(rzb0.y, rzb0.q);
    }

    /* JADX INFO: renamed from: n */
    public static String m14261n(String str) {
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.A6))) {
            return CoreModule.b.getString(R.string.A6);
        }
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.Ej))) {
            return CoreModule.b.getString(R.string.Ej);
        }
        return TextUtils.equals(str, CoreModule.b.getString(R.string.Dj)) ? CoreModule.b.getString(R.string.Dj) : "";
    }

    /* JADX INFO: renamed from: o */
    public static void m14262o() {
        f11919n = 0;
    }

    /* JADX INFO: renamed from: p */
    public static List<LoopSelectFillData> m14263p() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.b.getString(R.string.A6);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData(string, loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.b.getString(R.string.Ej), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<String> m14264q(String str) {
        ArrayList arrayList = new ArrayList();
        String strM14261n = m14261n(str);
        if (!TextUtils.isEmpty(strM14261n)) {
            arrayList.add(strM14261n);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList<LoopSelectFillData> m14265r(User user) {
        final List list = NullChecker.a(user.profile.extensions.wealth) ? user.profile.extensions.wealth.car : null;
        f11921p = new ArrayList<>(m14263p());
        if (vwb.J(list)) {
            vwb.z(f11921p, new e30() { // from class: l.b7j
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m2069i(false);
                }
            });
            return f11921p;
        }
        vwb.z(f11921p, new e30() { // from class: l.c7j
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals(loopSelectFillData.m2063c(), (CharSequence) list.get(0)));
            }
        });
        return f11921p;
    }

    /* JADX INFO: renamed from: s */
    public static Pair<String, String> m14266s() {
        return f11917l;
    }

    /* JADX INFO: renamed from: t */
    public static List<LoopSelectFillData> m14267t() {
        PurposeRule purposeRuleM14222C = m14222C();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(purposeRuleM14222C) && !vwb.J(purposeRuleM14222C.purposeRule)) {
            for (PurposeItemData purposeItemData : purposeRuleM14222C.purposeRule) {
                if (upa.e2()) {
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
    public static ArrayList<LoopSelectFillData> m14268u(User user) {
        final List list = user.profile.extensions.basic.friendPurpose;
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>(m14267t());
        f11921p = arrayList;
        Collections.shuffle(arrayList);
        if (vwb.J(list)) {
            vwb.z(f11921p, new e30() { // from class: l.u6j
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m2069i(false);
                }
            });
            return f11921p;
        }
        vwb.z(f11921p, new e30() { // from class: l.y6j
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals(((Purpose) list.get(0)).toString(), loopSelectFillData.m2062b()));
            }
        });
        return f11921p;
    }

    /* JADX INFO: renamed from: v */
    public static List<String> m14269v() {
        ArrayList arrayList = new ArrayList();
        for (int i = 140; i <= 210; i++) {
            arrayList.add(i + "cm");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static List<LoopSelectFillData> m14270w() {
        ArrayList arrayList = new ArrayList();
        String string = CoreModule.b.getString(R.string.V);
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("50000", string, loopSelectType));
        arrayList.add(new LoopSelectFillData("100000", CoreModule.b.getString(R.string.W), loopSelectType));
        arrayList.add(new LoopSelectFillData("200000", CoreModule.b.getString(R.string.X), loopSelectType));
        arrayList.add(new LoopSelectFillData("300000", CoreModule.b.getString(R.string.Y), loopSelectType));
        arrayList.add(new LoopSelectFillData("600000", CoreModule.b.getString(R.string.Z), loopSelectType));
        arrayList.add(new LoopSelectFillData("1000000", CoreModule.b.getString(R.string.a0), loopSelectType));
        arrayList.add(new LoopSelectFillData("LOW_1000000", CoreModule.b.getString(R.string.b0), loopSelectType));
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static Pair<List<String>, List<String>> m14271x(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.equals(str, CoreModule.b.getString(R.string.V))) {
            arrayList.add("");
            arrayList2.add("50000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.W))) {
            arrayList.add("50000");
            arrayList2.add("100000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.X))) {
            arrayList.add("100000");
            arrayList2.add("200000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.Y))) {
            arrayList.add("200000");
            arrayList2.add("300000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.Z))) {
            arrayList.add("300000");
            arrayList2.add("600000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.a0))) {
            arrayList.add("600000");
            arrayList2.add("1000000");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.b0))) {
            arrayList.add("1000000");
            arrayList2.add("");
        } else if (TextUtils.equals(str, CoreModule.b.getString(R.string.Dj))) {
            arrayList.add(CoreModule.b.getString(R.string.Dj));
            arrayList2.add("");
        } else {
            arrayList.add("");
            arrayList2.add("");
        }
        return Pair.create(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<LoopSelectFillData> m14272y(User user) {
        List list;
        List list2;
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.lowIncome;
            list2 = userWealth.upperIncome;
        } else {
            list = null;
            list2 = null;
        }
        final String strM14232M = m14232M(list2, list);
        f11921p = new ArrayList<>(m14270w());
        if (TextUtils.isEmpty(strM14232M)) {
            vwb.z(f11921p, new e30() { // from class: l.z6j
                public final void call(Object obj) {
                    ((LoopSelectFillData) obj).m2069i(false);
                }
            });
            return f11921p;
        }
        vwb.z(f11921p, new e30() { // from class: l.a7j
            public final void call(Object obj) {
                LoopSelectFillData loopSelectFillData = (LoopSelectFillData) obj;
                loopSelectFillData.m2069i(TextUtils.equals(loopSelectFillData.m2063c(), strM14232M));
            }
        });
        return f11921p;
    }

    /* JADX INFO: renamed from: z */
    public static List<LoopSelectFillData> m14273z() {
        ArrayList arrayList = new ArrayList();
        LoopSelectFillData.LoopSelectType loopSelectType = LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT;
        arrayList.add(new LoopSelectFillData("已有宠物", loopSelectType));
        arrayList.add(new LoopSelectFillData(CoreModule.b.getString(R.string.Ej), loopSelectType));
        return arrayList;
    }
}
