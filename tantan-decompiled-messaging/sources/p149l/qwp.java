package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.JailedGroupChat;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserState;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qwp {

    /* JADX INFO: renamed from: c */
    public static volatile qwp f156747c;

    /* JADX INFO: renamed from: a */
    public CountDownTimer f156748a;

    /* JADX INFO: renamed from: b */
    public c4g0 f156749b;

    /* JADX INFO: renamed from: l.qwp$a */
    public class CountDownTimerC19599a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText_Bold f156750a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f156751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC19599a(long j, long j2, VText_Bold vText_Bold, Act act) {
            super(j, j2);
            this.f156750a = vText_Bold;
            this.f156751b = act;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f156750a.setText(R$string.f17662D5);
            this.f156750a.setClickable(true);
            this.f156750a.setBackgroundResource(x2c0.f190570t);
            this.f156750a.setTextColor(Color.parseColor("#FFFFFF"));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int iCeil = (int) Math.ceil(j / 1000.0d);
            this.f156750a.setText(this.f156751b.getResources().getString(R$string.f17662D5) + String.format(Locale.getDefault(), "（%ds）", Integer.valueOf(iCeil)));
            this.f156750a.setBackgroundColor(Color.parseColor("#0D000000"));
            this.f156750a.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m176875a(dd80 dd80Var, View view) {
        zvf0.m220396r("e_intl_ban_alert_ok_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m176877c(dd80 dd80Var, View view) {
        zvf0.m220396r("e_intl_ban_alert_cancel_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m176880f(Act act, dd80 dd80Var, View view) {
        tvf.m190730h(act, OMSTemplateType.dialog);
        zvf0.m220396r("e_intl_ban_alert_verify_btn", "p_intl_ban_chatorswipe_alert");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static qwp m176882i() {
        if (f156747c == null) {
            synchronized (qwp.class) {
                try {
                    if (f156747c == null) {
                        f156747c = new qwp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f156747c;
    }

    /* JADX INFO: renamed from: h */
    public final String m176883h(long j) {
        long jM155944o = j - mqi0.m155944o();
        int i = (int) (jM155944o / 86400000);
        if (jM155944o <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(App.f15369e.getString(i > 1 ? R$string.f17900L3 : R$string.f17870K3));
        String string = sb.toString();
        if (i > 0) {
            jM155944o -= ((long) i) * 86400000;
        }
        String strM175934b = qqi0.m175934b(jM155944o);
        StringBuilder sb2 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i > 0) {
            strM175934b = string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM175934b;
        }
        sb2.append(strM175934b);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m176884j(JailedGroupChat jailedGroupChat, VText vText, Long l2) {
        String strM176883h = m176883h((long) jailedGroupChat.expireTime);
        if (TextUtils.isEmpty(strM176883h)) {
            return;
        }
        vText.setText(strM176883h);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m176885k(cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(this.f156749b);
        this.f156749b = null;
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m176886l(cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(this.f156748a)) {
            this.f156748a.cancel();
            this.f156748a = null;
        }
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m176887m(@NonNull final Act act, boolean z) {
        final JailedGroupChat jailedGroupChat;
        User userMe_ = CoreModule.m29932K().me_();
        if (userMe_ == null) {
            return;
        }
        if (NullChecker.m81303a(userMe_.state) && NullChecker.m81303a(userMe_.state.jailedBusiness)) {
            UserState userState = userMe_.state;
            jailedGroupChat = z ? userState.jailedBusiness.swipe : userState.jailedBusiness.chat;
        } else {
            jailedGroupChat = null;
        }
        if (jailedGroupChat == null) {
            return;
        }
        boolean z2 = !wwb.m205852a(userMe_.status) && userMe_.status.contains(UserStatus.get(UserStatus.RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL));
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_ban_chatorswipe_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ban_alert_verify_or_appeal", z2 ? "verify" : "appeal");
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95740d6, (ViewGroup) null);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VText vText3 = (VText) viewInflate.findViewById(u4c0.f173836H0);
        VText vText4 = (VText) viewInflate.findViewById(u4c0.f173819G0);
        final VText vText5 = (VText) viewInflate.findViewById(u4c0.f174133Yd);
        if (z) {
            vText.setText(R$string.f18839q0);
            vText2.setText(z2 ? R$string.f18778o0 : R$string.f18809p0);
        } else {
            vText.setText(R$string.f18685l0);
            vText2.setText(z2 ? R$string.f18623j0 : R$string.f18654k0);
        }
        if (z2) {
            xdl0.m208329E0(vText3, new View.OnClickListener() { // from class: l.jwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m176880f(act, dd80VarM110960O, view);
                }
            });
            xdl0.m208329E0(vText4, new View.OnClickListener() { // from class: l.kwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m176877c(dd80VarM110960O, view);
                }
            });
        } else {
            vText3.setText(App.f15369e.getString(R$string.f19076xr));
            xdl0.m208344M(vText4, false);
            xdl0.m208329E0(vText3, new View.OnClickListener() { // from class: l.lwp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qwp.m176875a(dd80VarM110960O, view);
                }
            });
        }
        String strM176883h = m176883h((long) jailedGroupChat.expireTime);
        if (!TextUtils.isEmpty(strM176883h)) {
            vText5.setText(strM176883h);
        }
        mkd0.m154992z(this.f156749b);
        this.f156749b = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.mwp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136077a.m176884j(jailedGroupChat, vText5, (Long) obj);
            }
        }));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f140961a.m176885k(cwf0VarM133794c, dialogInterface);
            }
        });
        if (c30.m104964f(act)) {
            dd80VarM110960O.show();
            i0e.m133797f(cwf0VarM133794c);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m176888n(@NonNull Act act, boolean z) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m176887m(act, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m176889o(Act act, String str, String str2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_risk_user_warn_alert", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_risk_type", str);
            cwf0VarM133794c.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95723c6, (ViewGroup) null);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        ((VText_Bold) viewInflate.findViewById(u4c0.f173973P1)).setText(Html.fromHtml(str2));
        VText_Bold vText_Bold = (VText_Bold) viewInflate.findViewById(u4c0.f173904L0);
        xdl0.m208329E0(vText_Bold, new View.OnClickListener() { // from class: l.owp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dd80VarM110960O.dismiss();
            }
        });
        vText_Bold.setClickable(false);
        if (NullChecker.m81303a(this.f156748a)) {
            this.f156748a.cancel();
        }
        this.f156748a = new CountDownTimerC19599a(3000L, 1000L, vText_Bold, act).start();
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pwp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f151589a.m176886l(cwf0VarM133794c, dialogInterface);
            }
        });
        if (c30.m104964f(act)) {
            dd80VarM110960O.show();
            i0e.m133797f(cwf0VarM133794c);
        }
    }
}
