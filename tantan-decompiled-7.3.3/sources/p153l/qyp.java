package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.JailedGroupChat;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserState;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class qyp {

    /* JADX INFO: renamed from: c */
    public static volatile qyp f160173c;

    /* JADX INFO: renamed from: a */
    public CountDownTimer f160174a;

    /* JADX INFO: renamed from: b */
    public kcg0 f160175b;

    /* JADX INFO: renamed from: l.qyp$a */
    public class CountDownTimerC19692a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText_Bold f160176a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f160177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC19692a(long j, long j2, VText_Bold vText_Bold, Act act) {
            super(j, j2);
            this.f160176a = vText_Bold;
            this.f160177b = act;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f160176a.setText(R$string.f18446F5);
            this.f160176a.setClickable(true);
            this.f160176a.setBackgroundResource(dbc0.f87465u);
            this.f160176a.setTextColor(Color.parseColor("#FFFFFF"));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int iCeil = (int) Math.ceil(j / 1000.0d);
            this.f160176a.setText(this.f160177b.getResources().getString(R$string.f18446F5) + String.format(Locale.getDefault(), "（%ds）", Integer.valueOf(iCeil)));
            this.f160176a.setBackgroundColor(Color.parseColor("#0D000000"));
            this.f160176a.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178716a(jl80 jl80Var, View view) {
        i4g0.m138520r("e_intl_ban_alert_ok_btn", "p_intl_ban_chatorswipe_alert");
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m178718c(jl80 jl80Var, View view) {
        i4g0.m138520r("e_intl_ban_alert_cancel_btn", "p_intl_ban_chatorswipe_alert");
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m178721f(Act act, jl80 jl80Var, View view) {
        hxf.m137587h(act, OMSTemplateType.dialog);
        i4g0.m138520r("e_intl_ban_alert_verify_btn", "p_intl_ban_chatorswipe_alert");
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static qyp m178723i() {
        if (f160173c == null) {
            synchronized (qyp.class) {
                try {
                    if (f160173c == null) {
                        f160173c = new qyp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f160173c;
    }

    /* JADX INFO: renamed from: h */
    public final String m178724h(long j) {
        long jM174454o = j - pzi0.m174454o();
        int i = (int) (jM174454o / 86400000);
        if (jM174454o <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(App.f16088e.getString(i > 1 ? R$string.f18690N3 : R$string.f18660M3));
        String string = sb.toString();
        if (i > 0) {
            jM174454o -= ((long) i) * 86400000;
        }
        String strM193664b = tzi0.m193664b(jM174454o);
        StringBuilder sb2 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i > 0) {
            strM193664b = string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM193664b;
        }
        sb2.append(strM193664b);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m178725j(JailedGroupChat jailedGroupChat, VText vText, Long l2) {
        String strM178724h = m178724h((long) jailedGroupChat.expireTime);
        if (TextUtils.isEmpty(strM178724h)) {
            return;
        }
        vText.setText(strM178724h);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m178726k(l4g0 l4g0Var, DialogInterface dialogInterface) {
        psd0.m173633z(this.f160175b);
        this.f160175b = null;
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m178727l(l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(this.f160174a)) {
            this.f160174a.cancel();
            this.f160174a = null;
        }
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m178728m(@NonNull final Act act, boolean z) {
        final JailedGroupChat jailedGroupChat;
        User userMe_ = CoreModule.m30930K().me_();
        if (userMe_ == null) {
            return;
        }
        if (NullChecker.m82486a(userMe_.state) && NullChecker.m82486a(userMe_.state.jailedBusiness)) {
            UserState userState = userMe_.state;
            jailedGroupChat = z ? userState.jailedBusiness.swipe : userState.jailedBusiness.chat;
        } else {
            jailedGroupChat = null;
        }
        if (jailedGroupChat == null) {
            return;
        }
        boolean z2 = !kyb.m151952a(userMe_.status) && userMe_.status.contains(UserStatus.get(UserStatus.RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL));
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_ban_chatorswipe_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ban_alert_verify_or_appeal", z2 ? "verify" : "appeal");
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(kec0.f125811e6, (ViewGroup) null);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        VText vText3 = (VText) viewInflate.findViewById(adc0.f69924H0);
        VText vText4 = (VText) viewInflate.findViewById(adc0.f69907G0);
        final VText vText5 = (VText) viewInflate.findViewById(adc0.f70274be);
        if (z) {
            vText.setText(R$string.f19570q0);
            vText2.setText(z2 ? R$string.f19508o0 : R$string.f19539p0);
        } else {
            vText.setText(R$string.f19415l0);
            vText2.setText(z2 ? R$string.f19353j0 : R$string.f19384k0);
        }
        if (z2) {
            bnl0.m105509E0(vText3, new View.OnClickListener() { // from class: l.jyp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qyp.m178721f(act, jl80VarM146020O, view);
                }
            });
            bnl0.m105509E0(vText4, new View.OnClickListener() { // from class: l.kyp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qyp.m178718c(jl80VarM146020O, view);
                }
            });
        } else {
            vText3.setText(App.f16088e.getString(R$string.f18894Tr));
            bnl0.m105524M(vText4, false);
            bnl0.m105509E0(vText3, new View.OnClickListener() { // from class: l.lyp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qyp.m178716a(jl80VarM146020O, view);
                }
            });
        }
        String strM178724h = m178724h((long) jailedGroupChat.expireTime);
        if (!TextUtils.isEmpty(strM178724h)) {
            vText5.setText(strM178724h);
        }
        psd0.m173633z(this.f160175b);
        this.f160175b = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.myp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139423a.m178725j(jailedGroupChat, vText5, (Long) obj);
            }
        }));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nyp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f144345a.m178726k(l4g0VarM204399c, dialogInterface);
            }
        });
        if (w20.m204491f(act)) {
            jl80VarM146020O.show();
            w1e.m204402f(l4g0VarM204399c);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m178729n(@NonNull Act act, boolean z) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m178728m(act, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m178730o(Act act, String str, String str2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_risk_user_warn_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_risk_type", str);
            l4g0VarM204399c.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(kec0.f125794d6, (ViewGroup) null);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        ((VText_Bold) viewInflate.findViewById(adc0.f70061P1)).setText(Html.fromHtml(str2));
        VText_Bold vText_Bold = (VText_Bold) viewInflate.findViewById(adc0.f69992L0);
        bnl0.m105509E0(vText_Bold, new View.OnClickListener() { // from class: l.oyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jl80VarM146020O.dismiss();
            }
        });
        vText_Bold.setClickable(false);
        if (NullChecker.m82486a(this.f160174a)) {
            this.f160174a.cancel();
        }
        this.f160174a = new CountDownTimerC19692a(3000L, 1000L, vText_Bold, act).start();
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pyp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f154682a.m178727l(l4g0VarM204399c, dialogInterface);
            }
        });
        if (w20.m204491f(act)) {
            jl80VarM146020O.show();
            w1e.m204402f(l4g0VarM204399c);
        }
    }
}
