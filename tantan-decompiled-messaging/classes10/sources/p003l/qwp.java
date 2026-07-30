package p003l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.JailedGroupChat;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserState;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cwf0;
import l.dd80;
import l.e30;
import l.f6c0;
import l.i0e;
import l.ic50;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.tvf;
import l.u4c0;
import l.wwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qwp {

    /* JADX INFO: renamed from: c */
    public static volatile qwp f7101c;

    /* JADX INFO: renamed from: a */
    public CountDownTimer f7102a;

    /* JADX INFO: renamed from: b */
    public c4g0 f7103b;

    /* JADX INFO: renamed from: l.qwp$a */
    public class CountDownTimerC3413a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText_Bold f7104a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f7105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC3413a(long j, long j2, VText_Bold vText_Bold, Act act) {
            super(j, j2);
            this.f7104a = vText_Bold;
            this.f7105b = act;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f7104a.setText(R.string.D5);
            this.f7104a.setClickable(true);
            this.f7104a.setBackgroundResource(x2c0.t);
            this.f7104a.setTextColor(Color.parseColor("#FFFFFF"));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int iCeil = (int) Math.ceil(j / 1000.0d);
            this.f7104a.setText(this.f7105b.getResources().getString(R.string.D5) + String.format(Locale.getDefault(), "（%ds）", Integer.valueOf(iCeil)));
            this.f7104a.setBackgroundColor(Color.parseColor("#0D000000"));
            this.f7104a.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9042a(dd80 dd80Var, View view) {
        zvf0.r("e_intl_ban_alert_ok_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9044c(dd80 dd80Var, View view) {
        zvf0.r("e_intl_ban_alert_cancel_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9047f(Act act, dd80 dd80Var, View view) {
        tvf.h(act, "dialog");
        zvf0.r("e_intl_ban_alert_verify_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static qwp m9049i() {
        if (f7101c == null) {
            synchronized (qwp.class) {
                try {
                    if (f7101c == null) {
                        f7101c = new qwp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7101c;
    }

    /* JADX INFO: renamed from: h */
    public final String m9050h(long j) {
        long jO = j - mqi0.o();
        int i = (int) (jO / 86400000);
        if (jO <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(App.e.getString(i > 1 ? R.string.L3 : R.string.K3));
        String string = sb.toString();
        if (i > 0) {
            jO -= ((long) i) * 86400000;
        }
        String strB = qqi0.b(jO);
        StringBuilder sb2 = new StringBuilder(" ");
        if (i > 0) {
            strB = string + " " + strB;
        }
        sb2.append(strB);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m9051j(JailedGroupChat jailedGroupChat, VText vText, Long l2) {
        String strM9050h = m9050h((long) jailedGroupChat.expireTime);
        if (TextUtils.isEmpty(strM9050h)) {
            return;
        }
        vText.setText(strM9050h);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9052k(cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.z(this.f7103b);
        this.f7103b = null;
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9053l(cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.a(this.f7102a)) {
            this.f7102a.cancel();
            this.f7102a = null;
        }
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m9054m(@NonNull final Act act, boolean z) {
        final JailedGroupChat jailedGroupChat;
        User userMe_ = CoreModule.K().me_();
        if (userMe_ == null) {
            return;
        }
        if (NullChecker.a(userMe_.state) && NullChecker.a(userMe_.state.jailedBusiness)) {
            UserState userState = userMe_.state;
            jailedGroupChat = z ? userState.jailedBusiness.swipe : userState.jailedBusiness.chat;
        } else {
            jailedGroupChat = null;
        }
        if (jailedGroupChat == null) {
            return;
        }
        boolean z2 = !wwb.a(userMe_.status) && userMe_.status.contains(UserStatus.get("RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL"));
        final cwf0 cwf0VarC = i0e.c("p_intl_ban_chatorswipe_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ban_alert_verify_or_appeal", z2 ? "verify" : "appeal");
            cwf0VarC.o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.d6, (ViewGroup) null);
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(false).O();
        dd80VarO.setCanceledOnTouchOutside(false);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        VText vTextFindViewById3 = viewInflate.findViewById(u4c0.H0);
        VText vTextFindViewById4 = viewInflate.findViewById(u4c0.G0);
        final VText vTextFindViewById5 = viewInflate.findViewById(u4c0.Yd);
        if (z) {
            vTextFindViewById.setText(R.string.q0);
            vTextFindViewById2.setText(z2 ? R.string.o0 : R.string.p0);
        } else {
            vTextFindViewById.setText(R.string.l0);
            vTextFindViewById2.setText(z2 ? R.string.j0 : R.string.k0);
        }
        if (z2) {
            xdl0.E0(vTextFindViewById3, new View.OnClickListener() { // from class: l.jwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m9047f(act, dd80VarO, view);
                }
            });
            xdl0.E0(vTextFindViewById4, new View.OnClickListener() { // from class: l.kwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m9044c(dd80VarO, view);
                }
            });
        } else {
            vTextFindViewById3.setText(App.e.getString(R.string.xr));
            xdl0.M(vTextFindViewById4, false);
            xdl0.E0(vTextFindViewById3, new View.OnClickListener() { // from class: l.lwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m9042a(dd80VarO, view);
                }
            });
        }
        String strM9050h = m9050h((long) jailedGroupChat.expireTime);
        if (!TextUtils.isEmpty(strM9050h)) {
            vTextFindViewById5.setText(strM9050h);
        }
        mkd0.z(this.f7103b);
        this.f7103b = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.mwp
            public final void call(Object obj) {
                this.f6439a.m9051j(jailedGroupChat, vTextFindViewById5, (Long) obj);
            }
        }));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6566a.m9052k(cwf0VarC, dialogInterface);
            }
        });
        if (c30.m5841f(act)) {
            dd80VarO.show();
            i0e.f(cwf0VarC);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9055n(@NonNull Act act, boolean z) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            ic50.j().f().s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m9054m(act, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m9056o(Act act, String str, String str2) {
        final cwf0 cwf0VarC = i0e.c("p_risk_user_warn_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_risk_type", str);
            cwf0VarC.o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.c6, (ViewGroup) null);
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(false).O();
        dd80VarO.setCanceledOnTouchOutside(false);
        viewInflate.findViewById(u4c0.P1).setText(Html.fromHtml(str2));
        VText_Bold vText_BoldFindViewById = viewInflate.findViewById(u4c0.L0);
        xdl0.E0(vText_BoldFindViewById, new View.OnClickListener() { // from class: l.owp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarO.dismiss();
            }
        });
        vText_BoldFindViewById.setClickable(false);
        if (NullChecker.a(this.f7102a)) {
            this.f7102a.cancel();
        }
        this.f7102a = new CountDownTimerC3413a(3000L, 1000L, vText_BoldFindViewById, act).start();
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6931a.m9053l(cwf0VarC, dialogInterface);
            }
        });
        if (c30.m5841f(act)) {
            dd80VarO.show();
            i0e.f(cwf0VarC);
        }
    }
}
