package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

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
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VerificationGuideConfig;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8076t0;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p151v.VText;
import p153l.adc0;
import p153l.agc0;
import p153l.byd0;
import p153l.dmk0;
import p153l.e1b;
import p153l.hxf;
import p153l.i4g0;
import p153l.i6e;
import p153l.jl80;
import p153l.kec0;
import p153l.l4g0;
import p153l.pk50;
import p153l.pzi0;
import p153l.tzi0;
import p153l.uqb0;
import p153l.vwa;
import p153l.vxd0;
import p153l.w1e;
import p153l.wyd0;
import p153l.x20;
import p153l.zwk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8076t0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public vxd0 f22865g;

    /* JADX INFO: renamed from: h */
    public wyd0 f22866h;

    /* JADX INFO: renamed from: i */
    public byd0 f22867i;

    /* JADX INFO: renamed from: j */
    public byd0 f22868j;

    /* JADX INFO: renamed from: k */
    public int f22869k;

    /* JADX INFO: renamed from: l */
    public int f22870l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f22871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f22872b;

        public a(x20 x20Var, jl80 jl80Var) {
            this.f22871a = x20Var;
            this.f22872b = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f22871a)) {
                this.f22871a.call();
            }
            this.f22872b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f22874a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jl80 f22875b;

        public b(x20 x20Var, jl80 jl80Var) {
            this.f22874a = x20Var;
            this.f22875b = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f22874a)) {
                this.f22874a.call();
            }
            this.f22875b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jl80 f22877a;

        public c(jl80 jl80Var) {
            this.f22877a = jl80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22877a.dismiss();
        }
    }

    public C8076t0(String str, boolean z) {
        vwa vwaVar = CoreModule.f18269h;
        this.f22865g = vwaVar.f186113c;
        this.f22866h = vwaVar.f186116f;
        this.f22867i = vwaVar.f186115e;
        this.f22868j = vwaVar.f186114d;
        this.f22869k = 20;
        this.f22870l = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m80481x().m80516v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f22869k = verificationGuideConfig.swipedCard;
            this.f22870l = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m38755A() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4)) {
            return (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38757q(C8049j.a aVar) {
        i4g0.m138520r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        hxf.m137587h(aVar.f22837b.act(), OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: v */
    private boolean m38760v() {
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (!CoreBusinessModule.f18258i && tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(pzi0.m174454o());
        String str = pzi0.f154857d.format(date);
        if (!str.equals(this.f22866h.get())) {
            this.f22867i.put(0L);
            this.f22866h.put(str);
        }
        if (this.f22867i.get().longValue() + 1 < this.f22869k) {
            return false;
        }
        long jM174454o = pzi0.m174454o();
        int iIntValue = this.f22865g.get().intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f22870l) {
                return false;
            }
            if (jM174454o - this.f22868j.get().longValue() < TimeUnit.MILLISECONDS.convert(dmk0.m116965d(iIntValue + 1, Api.BaseClientBuilder.API_PRIORITY_OTHER), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m38755A();
    }

    /* JADX INFO: renamed from: w */
    private void m38761w(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m38762z(Act act, x20 x20Var, x20 x20Var2, final x20 x20Var3) {
        jl80.C17971a c17971aM146021P = new jl80.C17971a(act).m146054w0(agc0.f71138x).m146021P(true);
        View viewInflate = act.inflater().inflate(kec0.f126089ud, (ViewGroup) null);
        jl80 jl80VarM146020O = c17971aM146021P.m146023R(viewInflate).m146020O();
        SpannableStringBuilder spannableStringBuilderM118966y0 = e1b.m118966y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, act.string(R$string.f19361j8), zwk.m221909i());
        VText vText = (VText) viewInflate.findViewById(adc0.f70343ff);
        vText.setText(spannableStringBuilderM118966y0);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(adc0.f70360gf).setOnClickListener(new a(x20Var, jl80VarM146020O));
        viewInflate.findViewById(adc0.f70326ef).setOnClickListener(new b(x20Var2, jl80VarM146020O));
        viewInflate.findViewById(adc0.f70309df).setOnClickListener(new c(jl80VarM146020O));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.alh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                x20Var3.call();
            }
        });
        jl80VarM146020O.show();
        m38761w(jl80VarM146020O.getWindow());
    }

    /* JADX INFO: renamed from: B */
    public final void m38763B(final C8049j.a aVar) {
        hxf.m137593n();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_guide", Dialog.class.getName());
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.real_person_guide.getIdentifier(), i6e.m138810b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        w1e.m204402f(l4g0VarM204399c);
        m38762z(aVar.f22837b.act(), new x20() { // from class: l.xkh0
            @Override // p153l.x20
            public final void call() {
                C8076t0.m38757q(aVar);
            }
        }, new x20() { // from class: l.ykh0
            @Override // p153l.x20
            public final void call() {
                i4g0.m138520r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new x20() { // from class: l.zkh0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        vxd0 vxd0Var = this.f22865g;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f22868j.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return m38765u(aVar);
    }

    /* JADX INFO: renamed from: u */
    public VSwipeStack.OnCardSwipeResult m38765u(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return m38767y(aVar) == SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: y */
    public SwipeDialogOmsLimitStrategy.HandleState m38767y(C8049j.a aVar) {
        if (this.f22870l <= 0) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (aVar.f22842g || !m38760v()) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        aVar.f22842g = true;
        m38763B(aVar);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }
}
