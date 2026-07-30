package p009l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
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
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ld70 extends AbstractC1065o4 {

    /* JADX INFO: renamed from: a */
    public tpd0 f16085a;

    /* JADX INFO: renamed from: b */
    public uqd0 f16086b;

    /* JADX INFO: renamed from: c */
    public zpd0 f16087c;

    /* JADX INFO: renamed from: d */
    public zpd0 f16088d;

    /* JADX INFO: renamed from: e */
    public int f16089e;

    /* JADX INFO: renamed from: f */
    public int f16090f;

    /* JADX INFO: renamed from: l.ld70$a */
    public class ViewOnClickListenerC1009a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f16091a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f16092b;

        public ViewOnClickListenerC1009a(d30 d30Var, dd80 dd80Var) {
            this.f16091a = d30Var;
            this.f16092b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f16091a)) {
                this.f16091a.call();
            }
            this.f16092b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ld70$b */
    public class ViewOnClickListenerC1010b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f16094a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dd80 f16095b;

        public ViewOnClickListenerC1010b(d30 d30Var, dd80 dd80Var) {
            this.f16094a = d30Var;
            this.f16095b = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f16094a)) {
                this.f16094a.call();
            }
            this.f16095b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.ld70$c */
    public class ViewOnClickListenerC1011c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dd80 f16097a;

        public ViewOnClickListenerC1011c(dd80 dd80Var) {
            this.f16097a = dd80Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16097a.dismiss();
        }
    }

    public ld70(String str, boolean z) {
        jva jvaVar = CoreModule.h;
        this.f16085a = jvaVar.c;
        this.f16086b = jvaVar.f;
        this.f16087c = jvaVar.e;
        this.f16088d = jvaVar.d;
        this.f16089e = 20;
        this.f16090f = 5;
        try {
            VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) RemoteConfig.m9619x().m9654v("ttt_verification_guide_config", VerificationGuideConfig.JSON_ADAPTER);
            this.f16089e = verificationGuideConfig.swipedCard;
            this.f16090f = verificationGuideConfig.displayCount;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17830c(z5l.C1346a c1346a) {
        zvf0.r("e_avatarVerification_guide_click", "p_avatarVerification_guide");
        tvf.h(c1346a.f23489c.act(), "dialog");
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        return Boolean.valueOf(m17835h(c1346a));
    }

    /* JADX INFO: renamed from: h */
    public boolean m17835h(final z5l.C1346a c1346a) {
        tvf.n();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_avatarVerification_guide", Dialog.class.getName());
        cwf0VarM16062c.o(ic50.m16316j().m16322f().m17400U(OmsDialog.real_person_guide.getIdentifier(), u4e.m22745b("passive", "alert", "alert_self_definition_basic", "card", "swipe_page", "swipe")));
        i0e.m16065f(cwf0VarM16062c);
        m17840m(c1346a.f23489c.act(), new d30() { // from class: l.hd70
            public final void call() {
                ld70.m17830c(c1346a);
            }
        }, new d30() { // from class: l.id70
            public final void call() {
                zvf0.r("e_avatarVerification_guide_cancle_click", "p_avatarVerification_guide");
            }
        }, new d30() { // from class: l.jd70
            public final void call() {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
        tpd0 tpd0Var = this.f16085a;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        this.f16088d.put(Long.valueOf(mqi0.m18550o()));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17836i() {
        User userMe_ = qib0.b0.b.me_();
        if (!CoreBusinessModule.i && qqi0.h(mqi0.m18550o(), (long) userMe_.createdTime, 1)) {
            return false;
        }
        Date date = new Date();
        date.setTime(mqi0.m18550o());
        String str = mqi0.f17028d.format(date);
        if (!str.equals(this.f16086b.get())) {
            this.f16087c.put(0L);
            this.f16086b.put(str);
        }
        if (((Long) this.f16087c.get()).longValue() < this.f16089e) {
            return false;
        }
        long jM18550o = mqi0.m18550o();
        int iIntValue = ((Integer) this.f16085a.get()).intValue();
        if (iIntValue != 0) {
            if (iIntValue >= this.f16090f) {
                return false;
            }
            if (jM18550o - ((Long) this.f16088d.get()).longValue() < TimeUnit.MILLISECONDS.convert(xck0.d(iIntValue + 1, Integer.MAX_VALUE), TimeUnit.DAYS)) {
                return false;
            }
        }
        return m17841n();
    }

    /* JADX INFO: renamed from: j */
    public final void m17837j(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return m17839l(c1346a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m17839l(z5l.C1346a c1346a) {
        if (this.f16090f <= 0) {
            return false;
        }
        return m17836i();
    }

    /* JADX INFO: renamed from: m */
    public final void m17840m(Act act, d30 d30Var, d30 d30Var2, final d30 d30Var3) {
        dd80.a aVarP = new dd80.a(act).w0(v7c0.x).P(true);
        View viewInflate = act.inflater().inflate(f6c0.nd, (ViewGroup) null);
        dd80 dd80VarO = aVarP.R(viewInflate).O();
        SpannableStringBuilder spannableStringBuilderY0 = rza.y0(act, new SpannableStringBuilder(), 1291845632, true, true, -98787, new String[]{act.string(R.string.h8), juk.m17225i()});
        VText vTextFindViewById = viewInflate.findViewById(u4c0.cf);
        vTextFindViewById.setText(spannableStringBuilderY0);
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
        viewInflate.findViewById(u4c0.df).setOnClickListener(new ViewOnClickListenerC1009a(d30Var, dd80VarO));
        viewInflate.findViewById(u4c0.bf).setOnClickListener(new ViewOnClickListenerC1010b(d30Var2, dd80VarO));
        viewInflate.findViewById(u4c0.af).setOnClickListener(new ViewOnClickListenerC1011c(dd80VarO));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kd70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d30Var3.call();
            }
        });
        dd80VarO.show();
        m17837j(dd80VarO.getWindow());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17841n() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4)) {
            return (TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return true;
    }
}
