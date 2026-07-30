package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0089t0;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VerificationGuideConfig;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import l.cwf0;
import l.d30;
import l.dd80;
import l.f6c0;
import l.jva;
import l.qib0;
import l.qqi0;
import l.rza;
import l.tpd0;
import l.tvf;
import l.u4c0;
import l.uqd0;
import l.v7c0;
import l.xck0;
import l.zpd0;
import l.zvf0;
import p009l.i0e;
import p009l.ic50;
import p009l.juk;
import p009l.mqi0;
import p009l.u4e;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0089t0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public tpd0 f901g;

    /* JADX INFO: renamed from: h */
    public uqd0 f902h;

    /* JADX INFO: renamed from: i */
    public zpd0 f903i;

    /* JADX INFO: renamed from: j */
    public zpd0 f904j;

    /* JADX INFO: renamed from: k */
    public int f905k;

    /* JADX INFO: renamed from: l */
    public int f906l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f907a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f908b;

        public a(d30 d30Var, dd80 dd80Var) {
            this.f907a = d30Var;
            this.f908b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f907a)) {
                this.f907a.call();
            }
            this.f908b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f910a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f911b;

        public b(d30 d30Var, dd80 dd80Var) {
            this.f910a = d30Var;
            this.f911b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f910a)) {
                this.f910a.call();
            }
            this.f911b.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t0$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f913a;

        public c(dd80 dd80Var) {
            this.f913a = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f913a.dismiss();
        }
    }

    public C0089t0(String str, boolean z) {
        jva jvaVar = CoreModule.h;
        this.f901g = jvaVar.c;
        this.f902h = jvaVar.f;
        this.f903i = jvaVar.e;
        this.f904j = jvaVar.d;
        this.f905k = 20;
        this.f906l = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m9619x().m9654v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f905k = verificationGuideConfig.swipedCard;
            this.f906l = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    private boolean m1723A() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4)) {
            return (TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1725q(C0062j.a aVar) {
        zvf0.r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        tvf.h(aVar.f873b.act(), "dialog");
    }

    /* JADX INFO: renamed from: v */
    private boolean m1728v() {
        User userMe_ = qib0.b0.b.me_();
        if (!CoreBusinessModule.i && qqi0.h(mqi0.m18550o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(mqi0.m18550o());
        String str = mqi0.f17028d.format(date);
        if (!str.equals(this.f902h.get())) {
            this.f903i.put(0L);
            this.f902h.put(str);
        }
        if (((Long) this.f903i.get()).longValue() + 1 < this.f905k) {
            return false;
        }
        long jM18550o = mqi0.m18550o();
        int iIntValue = ((Integer) this.f901g.get()).intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f906l) {
                return false;
            }
            if (jM18550o - ((Long) this.f904j.get()).longValue() < TimeUnit.MILLISECONDS.convert(xck0.d(iIntValue + 1, Integer.MAX_VALUE), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m1723A();
    }

    /* JADX INFO: renamed from: w */
    private void m1729w(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m1730z(Act act, d30 d30Var, d30 d30Var2, final d30 d30Var3) {
        dd80.a aVarP = new dd80.a(act).w0(v7c0.x).P(true);
        View viewInflate = act.inflater().inflate(f6c0.nd, (ViewGroup) null);
        dd80 dd80VarO = aVarP.R(viewInflate).O();
        SpannableStringBuilder spannableStringBuilderY0 = rza.y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, new String[]{act.string(R.string.h8), juk.m17225i()});
        VText vTextFindViewById = viewInflate.findViewById(u4c0.cf);
        vTextFindViewById.setText(spannableStringBuilderY0);
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(u4c0.df).setOnClickListener(new a(d30Var, dd80VarO));
        viewInflate.findViewById(u4c0.bf).setOnClickListener(new b(d30Var2, dd80VarO));
        viewInflate.findViewById(u4c0.af).setOnClickListener(new c(dd80VarO));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sch0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d30Var3.call();
            }
        });
        dd80VarO.show();
        m1729w(dd80VarO.getWindow());
    }

    /* JADX INFO: renamed from: B */
    public final void m1731B(final C0062j.a aVar) {
        tvf.n();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_avatarVerification_guide", Dialog.class.getName());
        cwf0VarM16062c.o(ic50.m16316j().m16322f().m17400U(OmsDialog.real_person_guide.getIdentifier(), u4e.m22745b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        i0e.m16065f(cwf0VarM16062c);
        m1730z(aVar.f873b.act(), new d30() { // from class: l.pch0
            public final void call() {
                C0089t0.m1725q(aVar);
            }
        }, new d30() { // from class: l.qch0
            public final void call() {
                zvf0.r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new d30() { // from class: l.rch0
            public final void call() {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
        tpd0 tpd0Var = this.f901g;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        this.f904j.put(Long.valueOf(mqi0.m18550o()));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return m1733u(aVar);
    }

    /* JADX INFO: renamed from: u */
    public VSwipeStack.OnCardSwipeResult m1733u(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return m1735y(aVar) == SwipeDialogOmsLimitStrategy.HandleState.direct;
    }

    /* JADX INFO: renamed from: y */
    public SwipeDialogOmsLimitStrategy.HandleState m1735y(C0062j.a aVar) {
        if (this.f906l <= 0) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        if (aVar.f878g || !m1728v()) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        aVar.f878g = true;
        m1731B(aVar);
        return SwipeDialogOmsLimitStrategy.HandleState.direct;
    }
}
