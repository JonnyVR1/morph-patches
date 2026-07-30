package p006l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.i0e;
import l.ic50;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.p4c0;
import l.rc2;
import l.roj0;
import l.t100;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xh0;
import l.zvf0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class p420 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21017a(Act act, c cVar) {
        if (((Boolean) CoreModule.f1534c.f3541B0.f3735T.get()).booleanValue()) {
            CoreModule.f1534c.f3541B0.f3735T.put(Boolean.FALSE);
            m21040x(act, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21019c(Runnable runnable, roj0 roj0Var) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21023g(Act act, View view) {
        zvf0.u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", new j760[]{vwb.Y("id_verification_age_check_button", "update")});
        m21031o(act);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21024h(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", new j760[]{vwb.Y("id_verification_age_check_button", "make_sure")});
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m21027k(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m21030n(Boolean bool) {
    }

    /* JADX INFO: renamed from: o */
    public static void m21031o(Act act) {
        rc2.e().d();
        CoreDlg.I1(act, new v9j() { // from class: l.l420
            public final Object call() {
                return CoreModule.m1851K().me_().settings.birthdate;
            }
        }, new e30() { // from class: l.m420
            public final void call(Object obj) {
                p420.m21039w((Double) obj, null);
            }
        }, new e30() { // from class: l.n420
            public final void call(Object obj) {
                p420.m21030n((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21032p(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 15) {
            try {
                int i = Integer.parseInt(str.substring(6, 10));
                int i2 = Integer.parseInt(str.substring(10, 12));
                int i3 = Integer.parseInt(str.substring(12, 14));
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(mqi0.o());
                int i4 = calendar.get(1);
                int i5 = calendar.get(2) + 1;
                return ((i2 < i5 || (i2 == i5 && i3 <= calendar.get(5))) ? i4 - i : (i4 - i) - 1) >= 18;
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static String m21033q(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 15) ? "empty" : str.substring(6, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static void m21034r(Act act, Throwable th, final d30 d30Var) {
        if (!(th instanceof TantanException.Client.CoreService) || ((TantanException.Client.CoreService) th).code != 40009) {
            bx6.m13015a(th);
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_id_verification_age_check_update_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        xh0.a aVar = new xh0.a(act);
        aVar.j(act.string(R$string.f2103S7)).e(R$string.f2163U7).c(new View.OnClickListener() { // from class: l.i420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", new j760[]{vwb.Y("id_verification_age_check_button", "not_update")});
            }
        }).q(R$string.f2133T7).m(new DialogInterface.OnDismissListener() { // from class: l.j420
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).o(new View.OnClickListener() { // from class: l.k420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p420.m21024h(d30Var, view);
            }
        });
        aVar.a().g();
        i0e.f(cwf0VarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m21035s(Act act, Throwable th, String str, String str2, String str3) {
        String strSubstring;
        int iLastIndexOf;
        if (th instanceof ApiExcep.Server) {
            lsi0.h(R$string.f2538gh);
            o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_result_code", String.valueOf(((ApiExcep) ((ApiExcep.Server) th)).response.q())), o6j0.a.h("verification_type", str3)});
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", str2), o6j0.a.h("verification_result_code", String.valueOf(i)), o6j0.a.h("verification_type", str3)});
            String str4 = coreService.metaMessage;
            if (i == 40001) {
                lsi0.j("已经认证完成");
                return;
            }
            if (i == 40004) {
                lsi0.h(R$string.f2591i8);
                return;
            }
            if (i == 40005) {
                lsi0.j(act.getString(R$string.f2620j8, "5", "24"));
                return;
            }
            if (i == 40006) {
                m21041y(act, act.string(R$string.f2013P7));
                return;
            }
            if (i == 40007) {
                if (TextUtils.isEmpty(str4) || (iLastIndexOf = str4.lastIndexOf(":")) <= 0) {
                    strSubstring = "";
                } else {
                    try {
                        strSubstring = str4.substring(iLastIndexOf + 1);
                    } catch (Exception e) {
                        CrashHelper.c(e);
                        strSubstring = "";
                    }
                }
                new Dialog.e(act).F(act.getString(R$string.f2682l8, strSubstring)).s0(R$string.f2866r8).B(false).z0();
                return;
            }
            if (i == 40008) {
                new Dialog.e(act).D(R$string.f2713m8).s0(R$string.f2866r8).B(false).z0();
                return;
            } else if (i == 40010) {
                lsi0.h(R$string.f2182Uq);
                o6j0.n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", new o6j0.a[]{o6j0.a.h("idverifivation_teenager_user_id", qib0.f19805c0.userId()), o6j0.a.h("idverifivation_teenager_user_birthday", m21033q(str))});
                return;
            } else if (i == 40012) {
                m21041y(act, act.string(R$string.f2764ns));
                return;
            }
        }
        lsi0.h(R$string.f2538gh);
    }

    /* JADX INFO: renamed from: t */
    public static void m21036t(final Act act) {
        act.creates(new e30() { // from class: l.b420
            public final void call(Object obj) {
                CoreModule.f1534c.f3541B0.f3735T.put(Boolean.FALSE);
            }
        });
        act.lifecycle().filter(new w9j() { // from class: l.g420
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.h420
            public final void call(Object obj) {
                p420.m21017a(act, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m21037u(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        boolean zMatches = str.matches("(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)");
        if (!zMatches || str.length() != 18) {
            return zMatches;
        }
        try {
            char[] charArray = str.toCharArray();
            int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            String[] strArr = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
            int i = 0;
            for (int i2 = 0; i2 < 17; i2++) {
                i += Integer.parseInt(String.valueOf(charArray[i2])) * iArr[i2];
            }
            return strArr[i % 11].toUpperCase().equals(String.valueOf(charArray[17]).toUpperCase());
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m21038v(dd80 dd80Var, int i) {
        View decorView;
        if (dd80Var == null || !dd80Var.isShowing() || (decorView = dd80Var.getWindow().getDecorView()) == null) {
            return;
        }
        TextView textView = (TextView) decorView.findViewById(p4c0.B0);
        if (NullChecker.a(textView)) {
            textView.setTextColor(decorView.getResources().getColor(w0c0.f24709n));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin += t100.c;
            textView.setLayoutParams(layoutParams);
        }
        TextView textView2 = (TextView) decorView.findViewById(p4c0.A0);
        if (NullChecker.a(textView2)) {
            textView2.setLineSpacing(t100.d(1.7f), 1.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.topMargin += t100.e;
            textView2.setLayoutParams(layoutParams2);
        }
        VButton vButtonFindViewById = decorView.findViewById(p4c0.w0);
        if (NullChecker.a(vButtonFindViewById)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) vButtonFindViewById.getLayoutParams();
            if (i == 16) {
                layoutParams3.topMargin += t100.d(1.7f);
            } else {
                layoutParams3.topMargin -= t100.d(6.5f);
            }
            vButtonFindViewById.setLayoutParams(layoutParams3);
        }
        if (i == 16) {
            VText vTextFindViewById = decorView.findViewById(p4c0.s0);
            if (NullChecker.a(vTextFindViewById)) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) vTextFindViewById.getLayoutParams();
                layoutParams4.topMargin -= t100.d(2.0f);
                vTextFindViewById.setLayoutParams(layoutParams4);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m21039w(Double d, final Runnable runnable) {
        User userClone = CoreModule.m1851K().me_().clone();
        Settings settings = new Settings();
        userClone.settings = settings;
        settings.birthdate = d;
        User userSubtract = userClone.subtract(CoreModule.m1851K().me_());
        if (NullChecker.a(userSubtract)) {
            CoreModule.f1534c.f3628e0.m21510u9(userSubtract).subscribe(mkd0.H(new e30() { // from class: l.o420
                public final void call(Object obj) {
                    p420.m21019c(runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.c420
                public final void call(Object obj) {
                    p420.m21027k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m21040x(Act act, d30 d30Var) {
        ic50.j().f().s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: y */
    public static void m21041y(final Act act, String str) {
        final cwf0 cwf0VarC = i0e.c("p_id_verification_age_check_input_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive")});
        xh0.a aVar = new xh0.a(act);
        aVar.j(str).e(R$string.f2043Q7).c(new View.OnClickListener() { // from class: l.d420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", new j760[]{vwb.Y("id_verification_age_check_button", "give_up")});
            }
        }).q(R$string.f2073R7).m(new DialogInterface.OnDismissListener() { // from class: l.e420
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).o(new View.OnClickListener() { // from class: l.f420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p420.m21023g(act, view);
            }
        });
        aVar.a().g();
        i0e.f(cwf0VarC);
    }
}
