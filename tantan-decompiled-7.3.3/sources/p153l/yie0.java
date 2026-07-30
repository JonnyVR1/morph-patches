package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class yie0 {

    /* JADX INFO: renamed from: c */
    public static yie0 f200079c;

    /* JADX INFO: renamed from: a */
    public boolean f200080a = false;

    /* JADX INFO: renamed from: b */
    public boolean f200081b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216069a(y20 y20Var, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            o1j0.m165634h(R$string.f21323G);
            return;
        }
        int iMo34639zc = CoreModule.m30933P().m143405a().mo34639zc(relationship);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Integer.valueOf(iMo34639zc));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m216070b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216071c() {
        return !m216081m() || CoreModule.f18265d.m144645g().seeMatchThenPay.groupA.matchPageEnabled;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m216072d() {
        return !m216081m() || CoreModule.f18265d.m144645g().seeMatchThenPay.groupA.seeListEnabled;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m216073e() {
        return m216081m() && m216083p() && m216079k() >= m216078j() && !m216082n();
    }

    /* JADX INFO: renamed from: f */
    public static String m216074f(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m29109f()) {
            int iM175779K = (int) q8g0.m175779K(i);
            if (iM175779K <= 1) {
                string = CoreModule.f18263b.getString(R$string.f21342M0);
                strValueOf = "1";
            } else if (iM175779K > 10) {
                string = CoreModule.f18263b.getString(R$string.f21339L0);
            } else {
                strValueOf = String.valueOf(iM175779K);
                string = CoreModule.f18263b.getString(R$string.f21339L0);
            }
        } else {
            String string2 = CoreModule.f18263b.getString(R$string.f21309B0);
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
    public static pf60<String, String> m216075g(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m29109f()) {
            int iM175779K = (int) q8g0.m175779K(i);
            if (iM175779K <= 1) {
                string = CoreModule.f18263b.getString(R$string.f21342M0);
                strValueOf = "1";
            } else if (iM175779K > 10) {
                string = CoreModule.f18263b.getString(R$string.f21339L0);
            } else {
                strValueOf = String.valueOf(iM175779K);
                string = CoreModule.f18263b.getString(R$string.f21339L0);
            }
        } else {
            String string2 = CoreModule.f18263b.getString(R$string.f21309B0);
            if (i < 1000) {
                string = string2;
                strValueOf = "1";
            } else {
                strValueOf = i <= 10000 ? String.valueOf(i / 1000) : "10+";
                string = string2;
            }
        }
        return pf60.m172085a(strValueOf, string);
    }

    /* JADX INFO: renamed from: h */
    public static yie0 m216076h() {
        if (f200079c == null) {
            synchronized (yie0.class) {
                try {
                    if (f200079c == null) {
                        f200079c = new yie0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200079c;
    }

    /* JADX INFO: renamed from: i */
    public static String m216077i(User user, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R$string.f21380d1, user.age.intValue() > 30 ? "30+" : user.age));
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(m216074f(user.location.distance));
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static int m216078j() {
        if (m216081m()) {
            return CoreModule.f18265d.m144645g().seeMatchThenPay.groupA.seeNum;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public static int m216079k() {
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        if (c4870aM31479t5 != null) {
            return c4870aM31479t5.f20012b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m216080l(Act act, String str) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m216081m() {
        if (NullChecker.m82486a(CoreModule.f18265d.m144645g())) {
            return true;
        }
        CoreModule.f18265d.m144648k();
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m216082n() {
        return CoreModule.f18264c.f20381e0.m116600p9().isJailed();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m216083p() {
        int iM216088v = m216088v();
        if (iM216088v <= 0) {
            return true;
        }
        if (!uqb0.f180396b0.f170324a.signedIn_()) {
            return false;
        }
        return tzi0.m193670h(pzi0.m174454o(), (long) uqb0.f180396b0.f170325b.me_().createdTime, iM216088v);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m216084q(User user) {
        return NullChecker.m82486a(user.location) && ((double) pzi0.m174454o()) - user.location.updatedTime <= 600000.0d;
    }

    /* JADX INFO: renamed from: r */
    public static void m216085r() {
        f200079c = null;
    }

    /* JADX INFO: renamed from: s */
    public static void m216086s(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        int i5 = qa00.f156320g;
        int color = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        smd0 smd0VarM186804a = new smd0(i5, i4, color, CoreModule.m30933P().m143405a().mo34454Yf(i + iIndexOf, i2), CoreModule.m30933P().m143405a().mo34638za(-1, i3)).m186804a(false);
        smd0VarM186804a.m186807d(qa00.m175859d(2.0f));
        spannableString.setSpan(smd0VarM186804a, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: t */
    public static void m216087t(Act act, User user, final y20<Integer> y20Var) {
        act.duringCreated(CoreModule.f18264c.f20405m0.m32060U7(true, false, null, user, null, LikeFrom.get(LikeFrom.fakeMatch))).subscribe(psd0.m173597H(new y20() { // from class: l.wie0
            @Override // p153l.y20
            public final void call(Object obj) {
                yie0.m216069a(y20Var, (Relationship) obj);
            }
        }, new y20() { // from class: l.xie0
            @Override // p153l.y20
            public final void call(Object obj) {
                yie0.m216070b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static int m216088v() {
        if (m216081m()) {
            return CoreModule.f18265d.m144645g().seeMatchThenPay.groupA.signUpDays;
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m216089o() {
        return this.f200081b;
    }

    /* JADX INFO: renamed from: u */
    public void m216090u(boolean z) {
        this.f200081b = z;
    }
}
