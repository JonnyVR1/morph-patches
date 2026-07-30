package p009l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.cwf0;
import l.f6c0;
import l.l5j0;
import l.qp4;
import l.u4c0;
import l.uc80;
import l.v7c0;
import l.vwb;
import l.wc80;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bk0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<l5j0> f10145a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12056a(Act act, View view) {
        m12061f();
        zvf0.r("e_go_verify", "p_suggest_verified_not_certified_alert");
        qp4.q(act);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12057b(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m16064e(cwf0Var);
        m12061f();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12058c(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m16064e(cwf0Var);
        m12061f();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12059d(View view) {
        m12061f();
        zvf0.r("e_cancel_btn", "p_suggest_verified_not_certified_alert");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12060e(Act act, View view) {
        m12061f();
        psl pslVarI0 = act.fragmentManager().i0(TabName.Card.toString());
        if (NullChecker.a(pslVarI0) && (pslVarI0 instanceof psl)) {
            pslVarI0.mo2520C1(NewTanFragTag.HOME, null);
        }
        zvf0.r("e_verified_under_review_see_other", "p_suggest_verified_under_review");
    }

    /* JADX INFO: renamed from: f */
    public static void m12061f() {
        if (NullChecker.a(f10145a)) {
            l5j0 l5j0Var = f10145a.get();
            if (NullChecker.a(l5j0Var)) {
                l5j0Var.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12062g(@NonNull Act act) {
        if (!xma.e4() || xma.F3()) {
            return false;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (verificationCenterK4 == null) {
            m12063h(act);
            return true;
        }
        PicVerificationInfo picVerificationInfo = verificationCenterK4.picVerificationInfo;
        if (picVerificationInfo == null) {
            m12063h(act);
            return true;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            return false;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m12063h(act);
            return true;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            m12064i(act);
            return true;
        }
        m12063h(act);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m12063h(final Act act) {
        l5j0 l5j0Var = new l5j0(act, v7c0.h);
        f10145a = new WeakReference<>(l5j0Var);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(f6c0.F0);
        VImage vImageFindViewById = l5j0Var.findViewById(u4c0.g6);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.ke);
        TextView textView2 = (TextView) l5j0Var.findViewById(u4c0.e9);
        TextView textView3 = (TextView) l5j0Var.findViewById(u4c0.A);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9.settings) && NullChecker.a(userP9.settings) && !vwb.J(userP9.settings.settingGroups) && NullChecker.a(((SettingGroups) userP9.settings.settingGroups.get(0)).search) && TEnum.equals(((SettingGroups) userP9.settings.settingGroups.get(0)).search.lookingForGender, "female")) {
            vImageFindViewById.setImageResource(x2c0.Di);
            textView.setText(String.format("完成头像认证，即刻与她们邂逅", new Object[0]));
        } else {
            vImageFindViewById.setImageResource(x2c0.Ei);
            textView.setText(String.format("完成头像认证，即刻与他们邂逅", new Object[0]));
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_suggest_verified_not_certified_alert", l5j0.class.getName());
        xdl0.E0(textView2, new View.OnClickListener() { // from class: l.wj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m12056a(act, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.xj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m12059d(view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bk0.m12058c(cwf0VarM16062c, dialogInterface);
            }
        });
        if (a.p().I()) {
            a.p().C(CorePopLevel.HOME_AUTH_TAB, act, l5j0Var, 20000);
        } else {
            wc80.e().q(uc80.a(l5j0Var));
        }
        zvf0.x("e_go_verify", "p_suggest_verified_not_certified_alert");
        zvf0.x("e_cancel_btn", "p_suggest_verified_not_certified_alert");
        i0e.m16065f(cwf0VarM16062c);
    }

    /* JADX INFO: renamed from: i */
    public static void m12064i(final Act act) {
        l5j0 l5j0Var = new l5j0(act, v7c0.h);
        f10145a = new WeakReference<>(l5j0Var);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(f6c0.G0);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f9);
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_suggest_verified_under_review", l5j0.class.getName());
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.zj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m12060e(act, view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ak0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bk0.m12057b(cwf0VarM16062c, dialogInterface);
            }
        });
        if (a.p().I()) {
            a.p().C(CorePopLevel.HOME_AUTH_TAB, act, l5j0Var, 20000);
        } else {
            wc80.e().q(uc80.a(l5j0Var));
        }
        zvf0.x("e_verified_under_review_see_other", "p_suggest_verified_under_review");
        i0e.m16065f(cwf0VarM16062c);
    }
}
