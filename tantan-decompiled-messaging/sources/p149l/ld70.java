package p149l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VerificationGuideConfig;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ld70 extends AbstractC18834o4 {

    /* JADX INFO: renamed from: a */
    public tpd0 f127510a;

    /* JADX INFO: renamed from: b */
    public uqd0 f127511b;

    /* JADX INFO: renamed from: c */
    public zpd0 f127512c;

    /* JADX INFO: renamed from: d */
    public zpd0 f127513d;

    /* JADX INFO: renamed from: e */
    public int f127514e;

    /* JADX INFO: renamed from: f */
    public int f127515f;

    /* JADX INFO: renamed from: l.ld70$a */
    public class ViewOnClickListenerC18193a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f127516a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f127517b;

        public ViewOnClickListenerC18193a(d30 d30Var, dd80 dd80Var) {
            this.f127516a = d30Var;
            this.f127517b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f127516a)) {
                this.f127516a.call();
            }
            this.f127517b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ld70$b */
    public class ViewOnClickListenerC18194b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f127519a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f127520b;

        public ViewOnClickListenerC18194b(d30 d30Var, dd80 dd80Var) {
            this.f127519a = d30Var;
            this.f127520b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f127519a)) {
                this.f127519a.call();
            }
            this.f127520b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ld70$c */
    public class ViewOnClickListenerC18195c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f127522a;

        public ViewOnClickListenerC18195c(dd80 dd80Var) {
            this.f127522a = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f127522a.dismiss();
        }
    }

    public ld70(String str, boolean z) {
        jva jvaVar = CoreModule.f17550h;
        this.f127510a = jvaVar.f119920c;
        this.f127511b = jvaVar.f119923f;
        this.f127512c = jvaVar.f119922e;
        this.f127513d = jvaVar.f119921d;
        this.f127514e = 20;
        this.f127515f = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m79298x().m79333v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f127514e = verificationGuideConfig.swipedCard;
            this.f127515f = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m149391c(z5l.C21640a c21640a) {
        zvf0.m220396r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        tvf.m190730h(c21640a.f201829c.act(), OMSTemplateType.dialog);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        return Boolean.valueOf(m149396h(c21640a));
    }

    /* JADX INFO: renamed from: h */
    public boolean m149396h(final z5l.C21640a c21640a) {
        tvf.m190736n();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_guide", Dialog.class.getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.real_person_guide.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        i0e.m133797f(cwf0VarM133794c);
        m149401m(c21640a.f201829c.act(), new d30() { // from class: l.hd70
            @Override // p149l.d30
            public final void call() {
                ld70.m149391c(c21640a);
            }
        }, new d30() { // from class: l.id70
            @Override // p149l.d30
            public final void call() {
                zvf0.m220396r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new d30() { // from class: l.jd70
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        tpd0 tpd0Var = this.f127510a;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f127513d.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m149397i() {
        User userMe_ = qib0.f154713b0.f139231b.me_();
        if (!CoreBusinessModule.f17539i && qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(mqi0.m155944o());
        String str = mqi0.f135252d.format(date);
        if (!str.equals(this.f127511b.get())) {
            this.f127512c.put(0L);
            this.f127511b.put(str);
        }
        if (this.f127512c.get().longValue() < this.f127514e) {
            return false;
        }
        long jM155944o = mqi0.m155944o();
        int iIntValue = this.f127510a.get().intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f127515f) {
                return false;
            }
            if (jM155944o - this.f127513d.get().longValue() < TimeUnit.MILLISECONDS.convert(xck0.m208123d(iIntValue + 1, Api.BaseClientBuilder.API_PRIORITY_OTHER), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m149402n();
    }

    /* JADX INFO: renamed from: j */
    public final void m149398j(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return m149400l(c21640a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m149400l(z5l.C21640a c21640a) {
        if (this.f127515f <= 0) {
            return false;
        }
        return m149397i();
    }

    /* JADX INFO: renamed from: m */
    public final void m149401m(Act act, d30 d30Var, d30 d30Var2, final d30 d30Var3) {
        dd80.C16336a c16336aM110961P = new dd80.C16336a(act).m110994w0(v7c0.f180377x).m110961P(true);
        View viewInflate = act.inflater().inflate(f6c0.f95916nd, (ViewGroup) null);
        dd80 dd80VarM110960O = c16336aM110961P.m110963R(viewInflate).m110960O();
        SpannableStringBuilder spannableStringBuilderM181744y0 = rza.m181744y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, act.string(R$string.f18571h8), juk.m143327i());
        VText vText = (VText) viewInflate.findViewById(u4c0.f174201cf);
        vText.setText(spannableStringBuilderM181744y0);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(u4c0.f174218df).setOnClickListener(new ViewOnClickListenerC18193a(d30Var, dd80VarM110960O));
        viewInflate.findViewById(u4c0.f174184bf).setOnClickListener(new ViewOnClickListenerC18194b(d30Var2, dd80VarM110960O));
        viewInflate.findViewById(u4c0.f174167af).setOnClickListener(new ViewOnClickListenerC18195c(dd80VarM110960O));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kd70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d30Var3.call();
            }
        });
        dd80VarM110960O.show();
        m149398j(dd80VarM110960O.getWindow());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m149402n() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4)) {
            return (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }
}
