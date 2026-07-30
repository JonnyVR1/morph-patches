package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class tae0 {

    /* JADX INFO: renamed from: c */
    public static tae0 f169113c;

    /* JADX INFO: renamed from: a */
    public boolean f169114a = false;

    /* JADX INFO: renamed from: b */
    public boolean f169115b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m187698a(e30 e30Var, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            lsi0.m151578h(R$string.f20581G);
            return;
        }
        int iMo33636zc = CoreModule.m29935P().m94651a().mo33636zc(relationship);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Integer.valueOf(iMo33636zc));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m187699b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m187700c() {
        return !m187710m() || CoreModule.f17546d.m95177g().seeMatchThenPay.groupA.matchPageEnabled;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m187701d() {
        return !m187710m() || CoreModule.f17546d.m95177g().seeMatchThenPay.groupA.seeListEnabled;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m187702e() {
        return m187710m() && m187712p() && m187708k() >= m187707j() && !m187711n();
    }

    /* JADX INFO: renamed from: f */
    public static String m187703f(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m28110f()) {
            int iM133844K = (int) i0g0.m133844K(i);
            if (iM133844K <= 1) {
                string = CoreModule.f17544b.getString(R$string.f20600M0);
                strValueOf = "1";
            } else if (iM133844K > 10) {
                string = CoreModule.f17544b.getString(R$string.f20597L0);
            } else {
                strValueOf = String.valueOf(iM133844K);
                string = CoreModule.f17544b.getString(R$string.f20597L0);
            }
        } else {
            String string2 = CoreModule.f17544b.getString(R$string.f20567B0);
            if (i < 1000) {
                string = string2;
                strValueOf = "1";
            } else {
                strValueOf = i <= 10000 ? String.valueOf(i / 1000) : "10+";
                string = string2;
            }
        }
        return TextUtils.concat(strValueOf, string).toString();
    }

    /* JADX INFO: renamed from: g */
    public static j760<String, String> m187704g(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m28110f()) {
            int iM133844K = (int) i0g0.m133844K(i);
            if (iM133844K <= 1) {
                string = CoreModule.f17544b.getString(R$string.f20600M0);
                strValueOf = "1";
            } else if (iM133844K > 10) {
                string = CoreModule.f17544b.getString(R$string.f20597L0);
            } else {
                strValueOf = String.valueOf(iM133844K);
                string = CoreModule.f17544b.getString(R$string.f20597L0);
            }
        } else {
            String string2 = CoreModule.f17544b.getString(R$string.f20567B0);
            if (i < 1000) {
                string = string2;
                strValueOf = "1";
            } else {
                strValueOf = i <= 10000 ? String.valueOf(i / 1000) : "10+";
                string = string2;
            }
        }
        return j760.m140076a(strValueOf, string);
    }

    /* JADX INFO: renamed from: h */
    public static tae0 m187705h() {
        if (f169113c == null) {
            synchronized (tae0.class) {
                try {
                    if (f169113c == null) {
                        f169113c = new tae0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f169113c;
    }

    /* JADX INFO: renamed from: i */
    public static String m187706i(User user, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R$string.f20638d1, user.age.intValue() > 30 ? "30+" : user.age));
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m187703f(user.location.distance));
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static int m187707j() {
        if (m187710m()) {
            return CoreModule.f17546d.m95177g().seeMatchThenPay.groupA.seeNum;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public static int m187708k() {
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        if (c4719aM30471r5 != null) {
            return c4719aM30471r5.f19270b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m187709l(Act act, String str) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m187710m() {
        if (NullChecker.m81303a(CoreModule.f17546d.m95177g())) {
            return true;
        }
        CoreModule.f17546d.m95181k();
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m187711n() {
        return CoreModule.f17545c.f19639e0.m169527p9().isJailed();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m187712p() {
        int iM187717v = m187717v();
        if (iM187717v <= 0) {
            return true;
        }
        if (!qib0.f154713b0.f139230a.signedIn_()) {
            return false;
        }
        return qqi0.m175940h(mqi0.m155944o(), (long) qib0.f154713b0.f139231b.me_().createdTime, iM187717v);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m187713q(User user) {
        return NullChecker.m81303a(user.location) && ((double) mqi0.m155944o()) - user.location.updatedTime <= 600000.0d;
    }

    /* JADX INFO: renamed from: r */
    public static void m187714r() {
        f169113c = null;
    }

    /* JADX INFO: renamed from: s */
    public static void m187715s(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        int i5 = t100.f167258g;
        int color = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        qed0 qed0VarM174188a = new qed0(i5, i4, color, CoreModule.m29935P().m94651a().mo33451Yf(i + iIndexOf, i2), CoreModule.m29935P().m94651a().mo33635za(-1, i3)).m174188a(false);
        qed0VarM174188a.m174191d(t100.m186890d(2.0f));
        spannableString.setSpan(qed0VarM174188a, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: t */
    public static void m187716t(Act act, User user, final e30<Integer> e30Var) {
        act.duringCreated(CoreModule.f17545c.f19663m0.m31057U7(true, false, null, user, null, LikeFrom.get(LikeFrom.fakeMatch))).subscribe(mkd0.m154956H(new e30() { // from class: l.rae0
            @Override // p149l.e30
            public final void call(Object obj) {
                tae0.m187698a(e30Var, (Relationship) obj);
            }
        }, new e30() { // from class: l.sae0
            @Override // p149l.e30
            public final void call(Object obj) {
                tae0.m187699b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static int m187717v() {
        if (m187710m()) {
            return CoreModule.f17546d.m95177g().seeMatchThenPay.groupA.signUpDays;
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m187718o() {
        return this.f169115b;
    }

    /* JADX INFO: renamed from: u */
    public void m187719u(boolean z) {
        this.f169115b = z;
    }
}
