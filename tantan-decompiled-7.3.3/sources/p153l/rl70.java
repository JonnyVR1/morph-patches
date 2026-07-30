package p153l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VerificationGuideConfig;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class rl70 extends AbstractC18774n4 {

    /* JADX INFO: renamed from: a */
    public vxd0 f163693a;

    /* JADX INFO: renamed from: b */
    public wyd0 f163694b;

    /* JADX INFO: renamed from: c */
    public byd0 f163695c;

    /* JADX INFO: renamed from: d */
    public byd0 f163696d;

    /* JADX INFO: renamed from: e */
    public int f163697e;

    /* JADX INFO: renamed from: f */
    public int f163698f;

    /* JADX INFO: renamed from: l.rl70$a */
    public class ViewOnClickListenerC19862a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f163699a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f163700b;

        public ViewOnClickListenerC19862a(x20 x20Var, jl80 jl80Var) {
            this.f163699a = x20Var;
            this.f163700b = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f163699a)) {
                this.f163699a.call();
            }
            this.f163700b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.rl70$b */
    public class ViewOnClickListenerC19863b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f163702a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f163703b;

        public ViewOnClickListenerC19863b(x20 x20Var, jl80 jl80Var) {
            this.f163702a = x20Var;
            this.f163703b = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f163702a)) {
                this.f163702a.call();
            }
            this.f163703b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.rl70$c */
    public class ViewOnClickListenerC19864c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jl80 f163705a;

        public ViewOnClickListenerC19864c(jl80 jl80Var) {
            this.f163705a = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f163705a.dismiss();
        }
    }

    public rl70(String str, boolean z) {
        vwa vwaVar = CoreModule.f18269h;
        this.f163693a = vwaVar.f186113c;
        this.f163694b = vwaVar.f186116f;
        this.f163695c = vwaVar.f186115e;
        this.f163696d = vwaVar.f186114d;
        this.f163697e = 20;
        this.f163698f = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m80481x().m80516v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f163697e = verificationGuideConfig.swipedCard;
            this.f163698f = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m181917c(p8l.C19323a c19323a) {
        i4g0.m138520r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        hxf.m137587h(c19323a.f151042c.act(), OMSTemplateType.dialog);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        return Boolean.valueOf(m181922h(c19323a));
    }

    /* JADX INFO: renamed from: h */
    public boolean m181922h(final p8l.C19323a c19323a) {
        hxf.m137593n();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_guide", Dialog.class.getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.real_person_guide.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        w1e.m204402f(l4g0VarM204399c);
        m181927m(c19323a.f151042c.act(), new x20() { // from class: l.nl70
            @Override // p153l.x20
            public final void call() {
                rl70.m181917c(c19323a);
            }
        }, new x20() { // from class: l.ol70
            @Override // p153l.x20
            public final void call() {
                i4g0.m138520r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new x20() { // from class: l.pl70
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        vxd0 vxd0Var = this.f163693a;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f163696d.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m181923i() {
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (!CoreBusinessModule.f18258i && tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(pzi0.m174454o());
        String str = pzi0.f154857d.format(date);
        if (!str.equals(this.f163694b.get())) {
            this.f163695c.put(0L);
            this.f163694b.put(str);
        }
        if (this.f163695c.get().longValue() < this.f163697e) {
            return false;
        }
        long jM174454o = pzi0.m174454o();
        int iIntValue = this.f163693a.get().intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f163698f) {
                return false;
            }
            if (jM174454o - this.f163696d.get().longValue() < TimeUnit.MILLISECONDS.convert(dmk0.m116965d(iIntValue + 1, Api.BaseClientBuilder.API_PRIORITY_OTHER), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m181928n();
    }

    /* JADX INFO: renamed from: j */
    public final void m181924j(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return m181926l(c19323a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m181926l(p8l.C19323a c19323a) {
        if (this.f163698f <= 0) {
            return false;
        }
        return m181923i();
    }

    /* JADX INFO: renamed from: m */
    public final void m181927m(Act act, x20 x20Var, x20 x20Var2, final x20 x20Var3) {
        jl80.C17971a c17971aM146021P = new jl80.C17971a(act).m146054w0(agc0.f71138x).m146021P(true);
        View viewInflate = act.inflater().inflate(kec0.f126089ud, (ViewGroup) null);
        jl80 jl80VarM146020O = c17971aM146021P.m146023R(viewInflate).m146020O();
        SpannableStringBuilder spannableStringBuilderM118966y0 = e1b.m118966y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, act.string(R$string.f19361j8), zwk.m221909i());
        VText vText = (VText) viewInflate.findViewById(adc0.f70343ff);
        vText.setText(spannableStringBuilderM118966y0);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(adc0.f70360gf).setOnClickListener(new ViewOnClickListenerC19862a(x20Var, jl80VarM146020O));
        viewInflate.findViewById(adc0.f70326ef).setOnClickListener(new ViewOnClickListenerC19863b(x20Var2, jl80VarM146020O));
        viewInflate.findViewById(adc0.f70309df).setOnClickListener(new ViewOnClickListenerC19864c(jl80VarM146020O));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ql70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                x20Var3.call();
            }
        });
        jl80VarM146020O.show();
        m181924j(jl80VarM146020O.getWindow());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m181928n() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4)) {
            return (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }
}
