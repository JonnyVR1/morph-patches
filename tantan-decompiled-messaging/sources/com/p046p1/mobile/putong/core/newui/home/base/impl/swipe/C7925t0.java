package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

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
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VerificationGuideConfig;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7925t0;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p147v.VText;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.f6c0;
import p149l.i0e;
import p149l.ic50;
import p149l.juk;
import p149l.jva;
import p149l.mqi0;
import p149l.qib0;
import p149l.qqi0;
import p149l.rza;
import p149l.tpd0;
import p149l.tvf;
import p149l.u4c0;
import p149l.u4e;
import p149l.uqd0;
import p149l.v7c0;
import p149l.xck0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7925t0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public tpd0 f22123g;

    /* JADX INFO: renamed from: h */
    public uqd0 f22124h;

    /* JADX INFO: renamed from: i */
    public zpd0 f22125i;

    /* JADX INFO: renamed from: j */
    public zpd0 f22126j;

    /* JADX INFO: renamed from: k */
    public int f22127k;

    /* JADX INFO: renamed from: l */
    public int f22128l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f22129a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f22130b;

        public a(d30 d30Var, dd80 dd80Var) {
            this.f22129a = d30Var;
            this.f22130b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f22129a)) {
                this.f22129a.call();
            }
            this.f22130b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f22132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f22133b;

        public b(d30 d30Var, dd80 dd80Var) {
            this.f22132a = d30Var;
            this.f22133b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f22132a)) {
                this.f22132a.call();
            }
            this.f22133b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f22135a;

        public c(dd80 dd80Var) {
            this.f22135a = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f22135a.dismiss();
        }
    }

    public C7925t0(String str, boolean z) {
        jva jvaVar = CoreModule.f17550h;
        this.f22123g = jvaVar.f119920c;
        this.f22124h = jvaVar.f119923f;
        this.f22125i = jvaVar.f119922e;
        this.f22126j = jvaVar.f119921d;
        this.f22127k = 20;
        this.f22128l = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m79298x().m79333v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f22127k = verificationGuideConfig.swipedCard;
            this.f22128l = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m37752A() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4)) {
            return (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37754q(C7898j.a aVar) {
        zvf0.m220396r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        tvf.m190730h(aVar.f22095b.act(), OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: v */
    private boolean m37757v() {
        User userMe_ = qib0.f154713b0.f139231b.me_();
        if (!CoreBusinessModule.f17539i && qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(mqi0.m155944o());
        String str = mqi0.f135252d.format(date);
        if (!str.equals(this.f22124h.get())) {
            this.f22125i.put(0L);
            this.f22124h.put(str);
        }
        if (this.f22125i.get().longValue() + 1 < this.f22127k) {
            return false;
        }
        long jM155944o = mqi0.m155944o();
        int iIntValue = this.f22123g.get().intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f22128l) {
                return false;
            }
            if (jM155944o - this.f22126j.get().longValue() < TimeUnit.MILLISECONDS.convert(xck0.m208123d(iIntValue + 1, Api.BaseClientBuilder.API_PRIORITY_OTHER), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m37752A();
    }

    /* JADX INFO: renamed from: w */
    private void m37758w(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m37759z(Act act, d30 d30Var, d30 d30Var2, final d30 d30Var3) {
        dd80.C16336a c16336aM110961P = new dd80.C16336a(act).m110994w0(v7c0.f180377x).m110961P(true);
        View viewInflate = act.inflater().inflate(f6c0.f95916nd, (ViewGroup) null);
        dd80 dd80VarM110960O = c16336aM110961P.m110963R(viewInflate).m110960O();
        SpannableStringBuilder spannableStringBuilderM181744y0 = rza.m181744y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, act.string(R$string.f18571h8), juk.m143327i());
        VText vText = (VText) viewInflate.findViewById(u4c0.f174201cf);
        vText.setText(spannableStringBuilderM181744y0);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(u4c0.f174218df).setOnClickListener(new a(d30Var, dd80VarM110960O));
        viewInflate.findViewById(u4c0.f174184bf).setOnClickListener(new b(d30Var2, dd80VarM110960O));
        viewInflate.findViewById(u4c0.f174167af).setOnClickListener(new c(dd80VarM110960O));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sch0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d30Var3.call();
            }
        });
        dd80VarM110960O.show();
        m37758w(dd80VarM110960O.getWindow());
    }

    /* JADX INFO: renamed from: B */
    public final void m37760B(final C7898j.a aVar) {
        tvf.m190736n();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_guide", Dialog.class.getName());
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.real_person_guide.getIdentifier(), u4e.m191727b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        i0e.m133797f(cwf0VarM133794c);
        m37759z(aVar.f22095b.act(), new d30() { // from class: l.pch0
            @Override // p149l.d30
            public final void call() {
                C7925t0.m37754q(aVar);
            }
        }, new d30() { // from class: l.qch0
            @Override // p149l.d30
            public final void call() {
                zvf0.m220396r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new d30() { // from class: l.rch0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        tpd0 tpd0Var = this.f22123g;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f22126j.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return m37762u(aVar);
    }

    /* JADX INFO: renamed from: u */
    public VSwipeStack.OnCardSwipeResult m37762u(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return m37764y(aVar) == SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: y */
    public SwipeDialogOmsLimitStrategy.HandleState m37764y(C7898j.a aVar) {
        if (this.f22128l <= 0) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (aVar.f22100g || !m37757v()) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        aVar.f22100g = true;
        m37760B(aVar);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }
}
