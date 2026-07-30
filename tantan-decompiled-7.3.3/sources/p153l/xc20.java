package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.Calendar;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xc20 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m210089a(Act act, C4470c c4470c) {
        if (CoreModule.f18264c.f20294B0.f20488T.get().booleanValue()) {
            CoreModule.f18264c.f20294B0.f20488T.put(Boolean.FALSE);
            m210112x(act, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m210091c(Runnable runnable, uxj0 uxj0Var) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m210095g(Act act, View view) {
        i4g0.m138523u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", jyb.m147494Y("id_verification_age_check_button", "update"));
        m210103o(act);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m210096h(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
        i4g0.m138523u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", jyb.m147494Y("id_verification_age_check_button", "make_sure"));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m210099k(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m210102n(Boolean bool) {
    }

    /* JADX INFO: renamed from: o */
    public static void m210103o(Act act) {
        yc2.m215118e().m215122d();
        CoreDlg.m46176I1(act, new pcj() { // from class: l.tc20
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.m30930K().me_().settings.birthdate;
            }
        }, new y20() { // from class: l.uc20
            @Override // p153l.y20
            public final void call(Object obj) {
                xc20.m210111w((Double) obj, null);
            }
        }, new y20() { // from class: l.vc20
            @Override // p153l.y20
            public final void call(Object obj) {
                xc20.m210102n((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static boolean m210104p(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 15) {
            try {
                int i = Integer.parseInt(str.substring(6, 10));
                int i2 = Integer.parseInt(str.substring(10, 12));
                int i3 = Integer.parseInt(str.substring(12, 14));
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(pzi0.m174454o());
                int i4 = calendar.get(1);
                int i5 = calendar.get(2) + 1;
                return ((i2 < i5 || (i2 == i5 && i3 <= calendar.get(5))) ? i4 - i : (i4 - i) - 1) >= 18;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static String m210105q(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 15) ? "empty" : str.substring(6, 14);
    }

    /* JADX INFO: renamed from: r */
    public static void m210106r(Act act, Throwable th, final x20 x20Var) {
        if (!(th instanceof TantanException.Client.CoreService) || ((TantanException.Client.CoreService) th).code != 40009) {
            ey6.m123173a(th);
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_id_verification_age_check_update_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(act.string(R$string.f18904U7)).m191146e(R$string.f18964W7).m191144c(new View.OnClickListener() { // from class: l.qc20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138523u("e_id_verification_age_check_update", "p_id_verification_age_check_update_popup", jyb.m147494Y("id_verification_age_check_button", "not_update"));
            }
        }).m191158q(R$string.f18934V7).m191154m(new DialogInterface.OnDismissListener() { // from class: l.rc20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.sc20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xc20.m210096h(x20Var, view);
            }
        });
        c20312a.m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: s */
    public static void m210107s(Act act, Throwable th, String str, String str2, String str3) {
        String strSubstring;
        int iLastIndexOf;
        if (th instanceof ApiExcep.Server) {
            o1j0.m165634h(R$string.f18334Bh);
            sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_result_code", String.valueOf(((ApiExcep.Server) th).response.m138673q())), sfj0.C20032a.m185615h("verification_type", str3));
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", str2), sfj0.C20032a.m185615h("verification_result_code", String.valueOf(i)), sfj0.C20032a.m185615h("verification_type", str3));
            String str4 = coreService.metaMessage;
            if (i == 40001) {
                o1j0.m165636j("已经认证完成");
                return;
            }
            if (i == 40004) {
                o1j0.m165634h(R$string.f19392k8);
                return;
            }
            if (i == 40005) {
                o1j0.m165636j(act.getString(R$string.f19423l8, "5", Constants.VIA_REPORT_TYPE_CHAT_AIO));
                return;
            }
            if (i == 40006) {
                m210113y(act, act.string(R$string.f18814R7));
                return;
            }
            if (i == 40007) {
                if (TextUtils.isEmpty(str4) || (iLastIndexOf = str4.lastIndexOf(":")) <= 0) {
                    strSubstring = "";
                } else {
                    try {
                        strSubstring = str4.substring(iLastIndexOf + 1);
                    } catch (Exception e) {
                        CrashHelper.m82479c(e);
                        strSubstring = "";
                    }
                }
                new Dialog.C4460e(act).m21503F(act.getString(R$string.f19485n8, strSubstring)).m21553s0(R$string.f19671t8).m21495B(false).m21567z0();
                return;
            }
            if (i == 40008) {
                new Dialog.C4460e(act).m21499D(R$string.f19516o8).m21553s0(R$string.f19671t8).m21495B(false).m21567z0();
                return;
            } else if (i == 40010) {
                o1j0.m165634h(R$string.f19566pr);
                sfj0.m185607n("e_id_verification_info_teenager_input", "p_id_verification_info_input_view", sfj0.C20032a.m185615h("idverifivation_teenager_user_id", uqb0.f180397c0.userId()), sfj0.C20032a.m185615h("idverifivation_teenager_user_birthday", m210105q(str)));
                return;
            } else if (i == 40012) {
                m210113y(act, act.string(R$string.f18593Js));
                return;
            }
        }
        o1j0.m165634h(R$string.f18334Bh);
    }

    /* JADX INFO: renamed from: t */
    public static void m210108t(final Act act) {
        act.creates(new y20() { // from class: l.jc20
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20294B0.f20488T.put(Boolean.FALSE);
            }
        });
        act.lifecycle().filter(new qcj() { // from class: l.oc20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.pc20
            @Override // p153l.y20
            public final void call(Object obj) {
                xc20.m210089a(act, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m210109u(String str) {
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
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m210110v(jl80 jl80Var, int i) {
        View decorView;
        if (jl80Var == null || !jl80Var.isShowing() || (decorView = jl80Var.getWindow().getDecorView()) == null) {
            return;
        }
        TextView textView = (TextView) decorView.findViewById(vcc0.f183358B0);
        if (NullChecker.m82486a(textView)) {
            textView.setTextColor(decorView.getResources().getColor(c9c0.f80439n));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.topMargin += qa00.f156316c;
            textView.setLayoutParams(layoutParams);
        }
        TextView textView2 = (TextView) decorView.findViewById(vcc0.f183356A0);
        if (NullChecker.m82486a(textView2)) {
            textView2.setLineSpacing(qa00.m175859d(1.7f), 1.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.topMargin += qa00.f156318e;
            textView2.setLayoutParams(layoutParams2);
        }
        VButton vButton = (VButton) decorView.findViewById(vcc0.f183449w0);
        if (NullChecker.m82486a(vButton)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) vButton.getLayoutParams();
            if (i == 16) {
                layoutParams3.topMargin += qa00.m175859d(1.7f);
            } else {
                layoutParams3.topMargin -= qa00.m175859d(6.5f);
            }
            vButton.setLayoutParams(layoutParams3);
        }
        if (i == 16) {
            VText vText = (VText) decorView.findViewById(vcc0.f183441s0);
            if (NullChecker.m82486a(vText)) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) vText.getLayoutParams();
                layoutParams4.topMargin -= qa00.m175859d(2.0f);
                vText.setLayoutParams(layoutParams4);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m210111w(Double d, final Runnable runnable) {
        User userMo225055clone = CoreModule.m30930K().me_().mo225055clone();
        Settings settings = new Settings();
        userMo225055clone.settings = settings;
        settings.birthdate = d;
        User userSubtract = userMo225055clone.subtract(CoreModule.m30930K().me_());
        if (NullChecker.m82486a(userSubtract)) {
            CoreModule.f18264c.f20381e0.m116620u9(userSubtract).subscribe(psd0.m173597H(new y20() { // from class: l.wc20
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc20.m210091c(runnable, (uxj0) obj);
                }
            }, new y20() { // from class: l.kc20
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc20.m210099k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m210112x(Act act, x20 x20Var) {
        pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: y */
    public static void m210113y(final Act act, String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_id_verification_age_check_input_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"));
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(str).m191146e(R$string.f18844S7).m191144c(new View.OnClickListener() { // from class: l.lc20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138523u("e_id_verification_age_check_input", "p_id_verification_age_check_input_popup", jyb.m147494Y("id_verification_age_check_button", "give_up"));
            }
        }).m191158q(R$string.f18874T7).m191154m(new DialogInterface.OnDismissListener() { // from class: l.mc20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.nc20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xc20.m210095g(act, view);
            }
        });
        c20312a.m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }
}
