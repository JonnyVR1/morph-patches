package p006l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qed0;
import l.qqi0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tae0 {

    /* JADX INFO: renamed from: c */
    public static tae0 f21976c;

    /* JADX INFO: renamed from: a */
    public boolean f21977a = false;

    /* JADX INFO: renamed from: b */
    public boolean f21978b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24540a(e30 e30Var, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            lsi0.h(R.string.G);
            return;
        }
        int iM5573zc = CoreModule.m1854P().m11706a().m5573zc(relationship);
        if (NullChecker.a(e30Var)) {
            e30Var.call(Integer.valueOf(iM5573zc));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24541b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24542c() {
        return !m24552m() || CoreModule.f1535d.m11767g().seeMatchThenPay.groupA.matchPageEnabled;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24543d() {
        return !m24552m() || CoreModule.f1535d.m11767g().seeMatchThenPay.groupA.seeListEnabled;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24544e() {
        return m24552m() && m24554p() && m24550k() >= m24549j() && !m24553n();
    }

    /* JADX INFO: renamed from: f */
    public static String m24545f(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m5f()) {
            int iK = (int) i0g0.K(i);
            if (iK <= 1) {
                string = CoreModule.f1533b.getString(R.string.M0);
                strValueOf = "1";
            } else if (iK > 10) {
                string = CoreModule.f1533b.getString(R.string.L0);
            } else {
                strValueOf = String.valueOf(iK);
                string = CoreModule.f1533b.getString(R.string.L0);
            }
        } else {
            String string2 = CoreModule.f1533b.getString(R.string.B0);
            if (i < 1000) {
                string = string2;
                strValueOf = "1";
            } else {
                strValueOf = i <= 10000 ? String.valueOf(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) : "10+";
                string = string2;
            }
        }
        return TextUtils.concat(strValueOf, string).toString();
    }

    /* JADX INFO: renamed from: g */
    public static j760<String, String> m24546g(int i) {
        String string;
        String strValueOf = "10+";
        if (IntlCountryCodeController.m5f()) {
            int iK = (int) i0g0.K(i);
            if (iK <= 1) {
                string = CoreModule.f1533b.getString(R.string.M0);
                strValueOf = "1";
            } else if (iK > 10) {
                string = CoreModule.f1533b.getString(R.string.L0);
            } else {
                strValueOf = String.valueOf(iK);
                string = CoreModule.f1533b.getString(R.string.L0);
            }
        } else {
            String string2 = CoreModule.f1533b.getString(R.string.B0);
            if (i < 1000) {
                string = string2;
                strValueOf = "1";
            } else {
                strValueOf = i <= 10000 ? String.valueOf(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) : "10+";
                string = string2;
            }
        }
        return j760.a(strValueOf, string);
    }

    /* JADX INFO: renamed from: h */
    public static tae0 m24547h() {
        if (f21976c == null) {
            synchronized (tae0.class) {
                try {
                    if (f21976c == null) {
                        f21976c = new tae0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21976c;
    }

    /* JADX INFO: renamed from: i */
    public static String m24548i(User user, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.d1, user.age.intValue() > 30 ? "30+" : user.age));
        sb.append(",");
        sb.append(m24545f(user.location.distance));
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static int m24549j() {
        if (m24552m()) {
            return CoreModule.f1535d.m11767g().seeMatchThenPay.groupA.seeNum;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public static int m24550k() {
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        if (c0145aM2399r5 != null) {
            return c0145aM2399r5.f3259b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m24551l(Act act, String str) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m24552m() {
        if (NullChecker.a(CoreModule.f1535d.m11767g())) {
            return true;
        }
        CoreModule.f1535d.m11771k();
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m24553n() {
        return CoreModule.f1534c.f3628e0.m21490p9().isJailed();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m24554p() {
        int iM24559v = m24559v();
        if (iM24559v <= 0) {
            return true;
        }
        if (!qib0.f19804b0.f17706a.signedIn_()) {
            return false;
        }
        return qqi0.h(mqi0.o(), (long) qib0.f19804b0.f17707b.me_().createdTime, iM24559v);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m24555q(User user) {
        return NullChecker.a(user.location) && ((double) mqi0.o()) - user.location.updatedTime <= 600000.0d;
    }

    /* JADX INFO: renamed from: r */
    public static void m24556r() {
        f21976c = null;
    }

    /* JADX INFO: renamed from: s */
    public static void m24557s(SpannableString spannableString, String str, String str2, int i, int i2, int i3, int i4) {
        int i5 = t100.g;
        int color = Color.parseColor("#d59d24");
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        qed0 qed0VarA = new qed0(i5, i4, color, new qed0.a[]{CoreModule.m1854P().m11706a().m5388Yf(i + iIndexOf, i2), CoreModule.m1854P().m11706a().m5572za(-1, i3)}).a(false);
        qed0VarA.d(t100.d(2.0f));
        spannableString.setSpan(qed0VarA, iIndexOf, length + iIndexOf, 18);
    }

    /* JADX INFO: renamed from: t */
    public static void m24558t(Act act, User user, final e30<Integer> e30Var) {
        act.duringCreated(CoreModule.f1534c.f3652m0.m2987U7(true, false, null, user, null, LikeFrom.get("fakeMatch"))).subscribe(mkd0.H(new e30() { // from class: l.rae0
            public final void call(Object obj) {
                tae0.m24540a(e30Var, (Relationship) obj);
            }
        }, new e30() { // from class: l.sae0
            public final void call(Object obj) {
                tae0.m24541b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public static int m24559v() {
        if (m24552m()) {
            return CoreModule.f1535d.m11767g().seeMatchThenPay.groupA.signUpDays;
        }
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m24560o() {
        return this.f21978b;
    }

    /* JADX INFO: renamed from: u */
    public void m24561u(boolean z) {
        this.f21978b = z;
    }
}
