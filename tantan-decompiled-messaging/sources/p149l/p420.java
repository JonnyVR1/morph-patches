package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.Calendar;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class p420 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m167335a(Act act, C4319c c4319c) {
        if (CoreModule.f17545c.f19552B0.f19746T.get().booleanValue()) {
            CoreModule.f17545c.f19552B0.f19746T.put(Boolean.FALSE);
            m167358x(act, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m167337c(Runnable runnable, roj0 roj0Var) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m167341g(Act act, View view) {
        zvf0.m220399u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", vwb.m200311Y("id_verification_age_check_button", "update"));
        m167349o(act);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m167342h(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.m220399u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", vwb.m200311Y("id_verification_age_check_button", "make_sure"));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m167345k(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m167348n(Boolean bool) {
    }

    /* JADX INFO: renamed from: o */
    public static void m167349o(Act act) {
        rc2.m178723e().m178727d();
        CoreDlg.m44993I1(act, new v9j() { // from class: l.l420
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.m29932K().me_().settings.birthdate;
            }
        }, new e30() { // from class: l.m420
            @Override // p149l.e30
            public final void call(Object obj) {
                p420.m167357w((Double) obj, null);
            }
        }, new e30() { // from class: l.n420
            @Override // p149l.e30
            public final void call(Object obj) {
                p420.m167348n((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static boolean m167350p(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 15) {
            try {
                int i = Integer.parseInt(str.substring(6, 10));
                int i2 = Integer.parseInt(str.substring(10, 12));
                int i3 = Integer.parseInt(str.substring(12, 14));
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(mqi0.m155944o());
                int i4 = calendar.get(1);
                int i5 = calendar.get(2) + 1;
                return ((i2 < i5 || (i2 == i5 && i3 <= calendar.get(5))) ? i4 - i : (i4 - i) - 1) >= 18;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static String m167351q(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 15) ? "empty" : str.substring(6, 14);
    }

    /* JADX INFO: renamed from: r */
    public static void m167352r(Act act, Throwable th, final d30 d30Var) {
        if (!(th instanceof TantanException.Client.CoreService) || ((TantanException.Client.CoreService) th).code != 40009) {
            bx6.m104282a(th);
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_id_verification_age_check_update_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(act.string(R$string.f18114S7)).m208726e(R$string.f18174U7).m208724c(new View.OnClickListener() { // from class: l.i420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220399u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", vwb.m200311Y("id_verification_age_check_button", "not_update"));
            }
        }).m208738q(R$string.f18144T7).m208734m(new DialogInterface.OnDismissListener() { // from class: l.j420
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.k420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p420.m167342h(d30Var, view);
            }
        });
        c21150a.m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: s */
    public static void m167353s(Act act, Throwable th, String str, String str2, String str3) {
        String strSubstring;
        int iLastIndexOf;
        if (th instanceof ApiExcep.Server) {
            lsi0.m151578h(R$string.f18549gh);
            o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_result_code", String.valueOf(((ApiExcep.Server) th).response.m118609q())), o6j0.C18854a.m162878h("verification_type", str3));
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", str2), o6j0.C18854a.m162878h("verification_result_code", String.valueOf(i)), o6j0.C18854a.m162878h("verification_type", str3));
            String str4 = coreService.metaMessage;
            if (i == 40001) {
                lsi0.m151580j("已经认证完成");
                return;
            }
            if (i == 40004) {
                lsi0.m151578h(R$string.f18602i8);
                return;
            }
            if (i == 40005) {
                lsi0.m151580j(act.getString(R$string.f18631j8, "5", Constants.VIA_REPORT_TYPE_CHAT_AIO));
                return;
            }
            if (i == 40006) {
                m167359y(act, act.string(R$string.f18024P7));
                return;
            }
            if (i == 40007) {
                if (TextUtils.isEmpty(str4) || (iLastIndexOf = str4.lastIndexOf(":")) <= 0) {
                    strSubstring = "";
                } else {
                    try {
                        strSubstring = str4.substring(iLastIndexOf + 1);
                    } catch (Exception e) {
                        CrashHelper.m81296c(e);
                        strSubstring = "";
                    }
                }
                new Dialog.C4309e(act).m20504F(act.getString(R$string.f18693l8, strSubstring)).m20554s0(R$string.f18877r8).m20496B(false).m20568z0();
                return;
            }
            if (i == 40008) {
                new Dialog.C4309e(act).m20500D(R$string.f18724m8).m20554s0(R$string.f18877r8).m20496B(false).m20568z0();
                return;
            } else if (i == 40010) {
                lsi0.m151578h(R$string.f18193Uq);
                o6j0.m162870n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", o6j0.C18854a.m162878h("idverifivation_teenager_user_id", qib0.f154714c0.userId()), o6j0.C18854a.m162878h("idverifivation_teenager_user_birthday", m167351q(str)));
                return;
            } else if (i == 40012) {
                m167359y(act, act.string(R$string.f18775ns));
                return;
            }
        }
        lsi0.m151578h(R$string.f18549gh);
    }

    /* JADX INFO: renamed from: t */
    public static void m167354t(final Act act) {
        act.creates(new e30() { // from class: l.b420
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19552B0.f19746T.put(Boolean.FALSE);
            }
        });
        act.lifecycle().filter(new w9j() { // from class: l.g420
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.h420
            @Override // p149l.e30
            public final void call(Object obj) {
                p420.m167335a(act, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m167355u(String str) {
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
            String[] strArr = {"1", "0", "X", Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, "7", Constants.VIA_SHARE_TYPE_INFO, "5", "4", "3", "2"};
            int i = 0;
            for (int i2 = 0; i2 < 17; i2++) {
                i += Integer.parseInt(String.valueOf(charArray[i2])) * iArr[i2];
            }
            return strArr[i % 11].toUpperCase().equals(String.valueOf(charArray[17]).toUpperCase());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m167356v(dd80 dd80Var, int i) {
        View decorView;
        if (dd80Var == null || !dd80Var.isShowing() || (decorView = dd80Var.getWindow().getDecorView()) == null) {
            return;
        }
        TextView textView = (TextView) decorView.findViewById(p4c0.f147058B0);
        if (NullChecker.m81303a(textView)) {
            textView.setTextColor(decorView.getResources().getColor(w0c0.f183869n));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin += t100.f167254c;
            textView.setLayoutParams(layoutParams);
        }
        TextView textView2 = (TextView) decorView.findViewById(p4c0.f147056A0);
        if (NullChecker.m81303a(textView2)) {
            textView2.setLineSpacing(t100.m186890d(1.7f), 1.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.topMargin += t100.f167256e;
            textView2.setLayoutParams(layoutParams2);
        }
        VButton vButton = (VButton) decorView.findViewById(p4c0.f147149w0);
        if (NullChecker.m81303a(vButton)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) vButton.getLayoutParams();
            if (i == 16) {
                layoutParams3.topMargin += t100.m186890d(1.7f);
            } else {
                layoutParams3.topMargin -= t100.m186890d(6.5f);
            }
            vButton.setLayoutParams(layoutParams3);
        }
        if (i == 16) {
            VText vText = (VText) decorView.findViewById(p4c0.f147141s0);
            if (NullChecker.m81303a(vText)) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) vText.getLayoutParams();
                layoutParams4.topMargin -= t100.m186890d(2.0f);
                vText.setLayoutParams(layoutParams4);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m167357w(Double d, final Runnable runnable) {
        User userMo223809clone = CoreModule.m29932K().me_().mo223809clone();
        Settings settings = new Settings();
        userMo223809clone.settings = settings;
        settings.birthdate = d;
        User userSubtract = userMo223809clone.subtract(CoreModule.m29932K().me_());
        if (NullChecker.m81303a(userSubtract)) {
            CoreModule.f17545c.f19639e0.m169547u9(userSubtract).subscribe(mkd0.m154956H(new e30() { // from class: l.o420
                @Override // p149l.e30
                public final void call(Object obj) {
                    p420.m167337c(runnable, (roj0) obj);
                }
            }, new e30() { // from class: l.c420
                @Override // p149l.e30
                public final void call(Object obj) {
                    p420.m167345k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m167358x(Act act, d30 d30Var) {
        ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: y */
    public static void m167359y(final Act act, String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_id_verification_age_check_input_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"));
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(str).m208726e(R$string.f18054Q7).m208724c(new View.OnClickListener() { // from class: l.d420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220399u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", vwb.m200311Y("id_verification_age_check_button", "give_up"));
            }
        }).m208738q(R$string.f18084R7).m208734m(new DialogInterface.OnDismissListener() { // from class: l.e420
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.f420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p420.m167341g(act, view);
            }
        });
        c21150a.m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }
}
