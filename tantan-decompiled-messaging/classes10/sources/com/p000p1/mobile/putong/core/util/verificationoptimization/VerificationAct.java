package com.p000p1.mobile.putong.core.util.verificationoptimization;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import com.google.common.collect.Lists;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p1.mobile.putong.core.ui.verification.VerificationSelectAct;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.dd80;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.myf;
import l.o7r;
import l.osi0;
import l.p420;
import l.puk0;
import l.tvf;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.yk5;
import p003l.ark;
import p003l.o6j0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VerificationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public int f2328e;

    /* JADX INFO: renamed from: c */
    public dd80 f2326c = null;

    /* JADX INFO: renamed from: d */
    public c4g0 f2327d = null;

    /* JADX INFO: renamed from: f */
    public boolean f2329f = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$a */
    public class C3248a implements FakeHoldFragment.a {
        public C3248a() {
        }

        /* JADX INFO: renamed from: a */
        public void m4895a(ArrayList<Media> arrayList, String str) {
            VerificationAct.this.f2329f = false;
            VerificationAct.this.m4887o2();
            ark.m5540L0(VerificationAct.this.m4888p2(), arrayList);
        }

        public void onError() {
            super.onError();
            VerificationAct.this.f2329f = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$b */
    public class C3249b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f2331a;

        public C3249b(Act act) {
            this.f2331a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m4883I2(this.f2331a, 5);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f2331a.getResources().getColor(w0c0.t0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$c */
    public class C3250c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f2333a;

        public C3250c(Act act) {
            this.f2333a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m4883I2(this.f2333a, 1);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f2333a.getResources().getColor(w0c0.t0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m4872m2(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationAct.class);
        intent.addFlags(268435456);
        intent.putExtra("type", i);
        intent.putExtra("verification", str);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m4873n2(c4g0 c4g0Var) {
        if (!NullChecker.a(c4g0Var) || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m4874s2(c cVar) {
        if (cVar == c.i) {
            this.f2329f = false;
            return;
        }
        if (cVar != c.k) {
            if (cVar == c.m) {
                puk0.e().i(false);
            }
        } else {
            if (this.f2329f || m4890r2() || !ConnectivityReceiver.g()) {
                return;
            }
            m4873n2(this.f2327d);
            act().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m4875v2() {
        if (NullChecker.a(this.f2326c) && this.f2326c.isShowing()) {
            return;
        }
        dd80 dd80VarR0 = m4889q2(this.f2328e).l0(new DialogInterface.OnCancelListener() { // from class: l.xsk0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f8568a.m4891u2(dialogInterface);
            }
        }).r0();
        this.f2326c = dd80VarR0;
        int i = this.f2328e;
        if (i == 2) {
            p420.v(dd80VarR0, i);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m4876A2(CheckBox checkBox, VerificationAct verificationAct, View view) {
        o6j0.m8403c("e_prevention_verify_click", "p_prevention_verify", o6j0.C3390a.m8423i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            osi0.g(verificationAct.getResources().getString(R.string.fs));
            return;
        }
        if (NullChecker.a(m4888p2())) {
            final Act actM4888p2 = m4888p2();
            e51.H(actM4888p2, new Runnable() { // from class: l.usk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.h(actM4888p2, "fromPicVerificationDlg");
                }
            }, 200L);
        }
        m4887o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m4877B2(VerificationAct verificationAct) {
        verificationAct.startActivity(VerificationSelectAct.Z1(verificationAct, "fromNameVerificationDlg"));
        o6j0.m8403c("e_prevention_verify_click", "p_prevention_verify", new o6j0.C3390a[0]);
        m4887o2();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m4878C2(String str) {
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            o6j0.m8403c("e_verification_review_avatar_popup_confirm", "p_verification_review_avatar_popup", new o6j0.C3390a[0]);
        } else {
            o6j0.m8403c("e_verification_review_id_popup_confirm", "p_verification_review_id_popup", new o6j0.C3390a[0]);
        }
        m4887o2();
    }

    /* JADX INFO: renamed from: D2 */
    public final void m4879D2(Act act, View view) {
        VText vTextFindViewById = view.findViewById(u4c0.sb);
        String string = act.getString(R.string.ds);
        String str = act.getString(R.string.cs) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.b0(str, vwb.M(string), act.getResources().getColor(w0c0.t0), eqh0.c(3)));
        spannableStringBuilder.setSpan(new C3249b(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vTextFindViewById.setText(spannableStringBuilder);
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
        vTextFindViewById.setHighlightColor(act.getResources().getColor(w0c0.U1));
    }

    /* JADX INFO: renamed from: E2 */
    public final void m4880E2(Act act, View view) {
        VText vTextFindViewById = view.findViewById(u4c0.sb);
        String string = act.getString(R.string.ds);
        String str = act.getString(R.string.cs) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.b0(str, vwb.M(string), act.getResources().getColor(w0c0.t0), eqh0.c(3)));
        spannableStringBuilder.setSpan(new C3250c(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vTextFindViewById.setText(spannableStringBuilder);
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
        vTextFindViewById.setHighlightColor(act.getResources().getColor(w0c0.U1));
    }

    /* JADX INFO: renamed from: F2 */
    public final dd80.a m4881F2(final Act act) {
        String string = act.getString(R.string.js);
        String string2 = act.getString(R.string.is);
        View viewInflate = o7r.a(act).inflate(f6c0.w8, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ua);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.va);
        VText vTextFindViewById3 = viewInflate.findViewById(u4c0.sb);
        vTextFindViewById2.getPaint().setFakeBoldText(true);
        vTextFindViewById3.getPaint().setFakeBoldText(true);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.ta);
        VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.ra);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f1);
        vTextFindViewById.getPaint().setFakeBoldText(true);
        if (CoreModule.c.e0.na().isFakeUser()) {
            vButtonFindViewById.setEnabled(false);
            vButtonFindViewById.setBackgroundResource(x2c0.r);
            vButtonFindViewById.setTextColor(getResources().getColor(w0c0.E));
        }
        vTextFindViewById.setText(i0g0.b0(string + string2, vwb.M(string2), getResources().getColor(w0c0.W0), eqh0.c(3)));
        m4879D2(act, viewInflate);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.atk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2888a.m4892w2(checkBox, act, view);
            }
        });
        xdl0.E0(vButtonFindViewById2, new View.OnClickListener() { // from class: l.btk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3474a.m4893y2(view);
            }
        });
        return new dd80.a(act).R(viewInflate).P(true);
    }

    /* JADX INFO: renamed from: H2 */
    public final dd80.a m4882H2() {
        return m4886M2(this, "fromPicVerificationDlg");
    }

    /* JADX INFO: renamed from: I2 */
    public void m4883I2(Act act, final int i) {
        if (i == 5 && CoreModule.c.e0.na().isFakeUser()) {
            return;
        }
        final yk5 yk5Var = new yk5(act, i == 5 ? 1 : 3);
        yk5Var.D(new View.OnClickListener() { // from class: l.dtk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4228a.m4894z2(i, yk5Var, view);
            }
        });
        yk5Var.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K2 */
    public final dd80.a m4884K2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R.string.js);
        String string2 = verificationAct.getString(R.string.is);
        View viewInflate = o7r.a(verificationAct).inflate(f6c0.v8, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ua);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.va);
        VText vTextFindViewById3 = viewInflate.findViewById(u4c0.sb);
        vTextFindViewById2.getPaint().setFakeBoldText(true);
        vTextFindViewById3.getPaint().setFakeBoldText(true);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.ta);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f1);
        vTextFindViewById.getPaint().setFakeBoldText(true);
        vTextFindViewById.setText(i0g0.b0(string + string2, vwb.M(string2), getResources().getColor(w0c0.W0), eqh0.c(3)));
        m4880E2(verificationAct, viewInflate);
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.ctk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4080a.m4876A2(checkBox, verificationAct, view);
            }
        });
        return new dd80.a(verificationAct).R(viewInflate).P(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L2 */
    public final dd80.a m4885L2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R.string.qr);
        return new dd80.a(verificationAct).x0(R.string.ks, new Object[0]).t0(i0g0.b0(verificationAct.getString(R.string.js) + string, vwb.M(string), getResources().getColor(w0c0.W0), eqh0.c(3))).P(true).c0(verificationAct.getString(R.string.sr), new Runnable() { // from class: l.zsk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9321a.m4877B2(verificationAct);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M2 */
    public final dd80.a m4886M2(VerificationAct verificationAct, final String str) {
        return new dd80.a(verificationAct).S(x2c0.Hq).x0(R.string.Jr, new Object[0]).s0(R.string.Ir, new Object[0]).P(true).a0(R.string.xr, new Runnable() { // from class: l.ysk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9120a.m4878C2(str);
            }
        });
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super.initSubscription();
        this.f2328e = getIntent().getIntExtra("type", 1);
        ((PutongAct) this).pageHelper.q(pageId());
        int i = this.f2328e;
        if (i == 1 || i == 2) {
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("verification_type", getIntent().getStringExtra("verification"))});
        }
        puk0.e().i(true);
        this.f2327d = lifecycle().subscribe(mkd0.G(new e30() { // from class: l.tsk0
            public final void call(Object obj) {
                this.f7621a.m4874s2((c) obj);
            }
        }));
        e51.H(this, new Runnable() { // from class: l.wsk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8234a.m4875v2();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: o2 */
    public void m4887o2() {
        if (NullChecker.a(this.f2326c) && this.f2326c.isShowing()) {
            this.f2326c.dismiss();
        }
        puk0.e().i(false);
        finish();
    }

    /* JADX INFO: renamed from: p2 */
    public final Act m4888p2() {
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(((Act) this).act.getTaskId()));
        if (vwb.J(arrayList)) {
            return null;
        }
        for (Act.r rVar : Lists.q(arrayList)) {
            if (NullChecker.a(rVar.a) && NullChecker.a(rVar.a.get())) {
                Act act = (Activity) rVar.a.get();
                if ((act instanceof PutongAct) && !(act instanceof VerificationAct)) {
                    return act;
                }
            }
        }
        return null;
    }

    public String pageId() {
        int i = this.f2328e;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return "p_verification_review_avatar_popup";
            }
            if (i == 4) {
                return "p_verification_review_id_popup";
            }
        }
        return "p_prevention_verify";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q2 */
    public final dd80.a m4889q2(int i) {
        switch (i) {
            case 1:
                return m4884K2(this);
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                return m4885L2(this);
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                return m4886M2(this, "fromPicVerificationDlg");
            case 4:
                return m4886M2(this, "fromNameVerificationDlg");
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                return m4881F2(((Act) this).act);
            case 6:
                return m4882H2();
            default:
                return new dd80.a(this);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public boolean m4890r2() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        List list = (List) Act.globalLifeCycle_().values().iterator().next();
        return !vwb.J(list) && (((Activity) ((Act.r) list.get(list.size() - 1)).a.get()) instanceof VerificationAct);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m4891u2(DialogInterface dialogInterface) {
        m4887o2();
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m4892w2(CheckBox checkBox, Act act, View view) {
        o6j0.m8403c("e_prevention_verify_click", "p_prevention_verify", o6j0.C3390a.m8423i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            osi0.g(act.getResources().getString(R.string.fs));
            return;
        }
        if (NullChecker.a(m4888p2())) {
            final Act actM4888p2 = m4888p2();
            e51.H(actM4888p2, new Runnable() { // from class: l.etk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.h(actM4888p2, "verification_center");
                }
            }, 200L);
        }
        m4887o2();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m4893y2(View view) {
        this.f2329f = true;
        FakeHoldFragment.z4(21862, myf.E(this), new C3248a()).A4(getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m4894z2(final int i, yk5 yk5Var, View view) {
        if (NullChecker.a(m4888p2())) {
            final Act actM4888p2 = m4888p2();
            e51.H(actM4888p2, new Runnable() { // from class: l.vsk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.h(actM4888p2, i == 5 ? "verification_center" : "fromPicVerificationDlg");
                }
            }, 200L);
        }
        yk5Var.dismiss();
        m4887o2();
    }
}
