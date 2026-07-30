package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC0476e;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class xj0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<pej0> f194529a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m211185a(Act act, View view) {
        m211190f();
        i4g0.m138520r("e_go_verify", "p_suggest_verified_not_certified_alert");
        pq4.m173309q(act);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m211186b(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        m211190f();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m211187c(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        m211190f();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211188d(View view) {
        m211190f();
        i4g0.m138520r("e_cancel_btn", "p_suggest_verified_not_certified_alert");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m211189e(Act act, View view) {
        m211190f();
        InterfaceC0476e interfaceC0476eM2558i0 = act.fragmentManager().m2558i0(TabName.Card.toString());
        if (NullChecker.m82486a(interfaceC0476eM2558i0) && (interfaceC0476eM2558i0 instanceof cvl)) {
            ((cvl) interfaceC0476eM2558i0).mo39543C1(NewTanFragTag.HOME, null);
        }
        i4g0.m138520r("e_verified_under_review_see_other", "p_suggest_verified_under_review");
    }

    /* JADX INFO: renamed from: f */
    public static void m211190f() {
        if (NullChecker.m82486a(f194529a)) {
            pej0 pej0Var = f194529a.get();
            if (NullChecker.m82486a(pej0Var)) {
                pej0Var.m176562T();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m211191g(@NonNull Act act) {
        if (!joa.m146386f4() || joa.m146357G3()) {
            return false;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 == null) {
            m211192h(act);
            return true;
        }
        PicVerificationInfo picVerificationInfo = verificationCenterM32615k4.picVerificationInfo;
        if (picVerificationInfo == null) {
            m211192h(act);
            return true;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            return false;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m211192h(act);
            return true;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            m211193i(act);
            return true;
        }
        m211192h(act);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m211192h(final Act act) {
        pej0 pej0Var = new pej0(act, agc0.f71122h);
        f194529a = new WeakReference<>(pej0Var);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setContentView(kec0.f125401F0);
        VImage vImage = (VImage) pej0Var.findViewById(adc0.f70385i6);
        TextView textView = (TextView) pej0Var.findViewById(adc0.f70477ne);
        TextView textView2 = (TextView) pej0Var.findViewById(adc0.f70354g9);
        TextView textView3 = (TextView) pej0Var.findViewById(adc0.f69804A);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82486a(userM116600p9.settings) && !jyb.m147479J(userM116600p9.settings.settingGroups) && NullChecker.m82486a(userM116600p9.settings.settingGroups.get(0).search) && TEnum.equals(userM116600p9.settings.settingGroups.get(0).search.lookingForGender, "female")) {
            vImage.setImageResource(dbc0.f87386rj);
            textView.setText(String.format("完成头像认证，即刻与她们邂逅", new Object[0]));
        } else {
            vImage.setImageResource(dbc0.f87419sj);
            textView.setText(String.format("完成头像认证，即刻与他们邂逅", new Object[0]));
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_suggest_verified_not_certified_alert", pej0.class.getName());
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.sj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xj0.m211185a(act, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.tj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xj0.m211188d(view);
            }
        });
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                xj0.m211187c(l4g0VarM204399c, dialogInterface);
            }
        });
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.HOME_AUTH_TAB, act, pej0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(pej0Var));
        }
        i4g0.m138526x("e_go_verify", "p_suggest_verified_not_certified_alert");
        i4g0.m138526x("e_cancel_btn", "p_suggest_verified_not_certified_alert");
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: i */
    public static void m211193i(final Act act) {
        pej0 pej0Var = new pej0(act, agc0.f71122h);
        f194529a = new WeakReference<>(pej0Var);
        pej0Var.setCanceledOnTouchOutside(false);
        pej0Var.setContentView(kec0.f125417G0);
        TextView textView = (TextView) pej0Var.findViewById(adc0.f70371h9);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_suggest_verified_under_review", pej0.class.getName());
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.vj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xj0.m211189e(act, view);
            }
        });
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                xj0.m211186b(l4g0VarM204399c, dialogInterface);
            }
        });
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.HOME_AUTH_TAB, act, pej0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(pej0Var));
        }
        i4g0.m138526x("e_verified_under_review_see_other", "p_suggest_verified_under_review");
        w1e.m204402f(l4g0VarM204399c);
    }
}
