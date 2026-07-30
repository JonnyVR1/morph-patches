package com.p046p1.mobile.putong.core.util.verificationoptimization;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationSelectAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VButton;
import p147v.VText;
import p149l.ark;
import p149l.c4g0;
import p149l.dd80;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.f6c0;
import p149l.i0g0;
import p149l.mkd0;
import p149l.myf;
import p149l.o6j0;
import p149l.o7r;
import p149l.osi0;
import p149l.p420;
import p149l.puk0;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yk5;

/* JADX INFO: loaded from: classes10.dex */
public class VerificationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public int f38386e;

    /* JADX INFO: renamed from: c */
    public dd80 f38384c = null;

    /* JADX INFO: renamed from: d */
    public c4g0 f38385d = null;

    /* JADX INFO: renamed from: f */
    public boolean f38387f = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$a */
    public class C9150a implements FakeHoldFragment.InterfaceC7844a {
        public C9150a() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        /* JADX INFO: renamed from: a */
        public void mo36397a(ArrayList<Media> arrayList, String str) {
            VerificationAct.this.f38387f = false;
            VerificationAct.this.m59479o2();
            ark.m98433L0(VerificationAct.this.m59480p2(), arrayList);
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        public void onError() {
            super.onError();
            VerificationAct.this.f38387f = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$b */
    public class C9151b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f38389a;

        public C9151b(Act act) {
            this.f38389a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m59475I2(this.f38389a, 5);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f38389a.getResources().getColor(w0c0.f183888t0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$c */
    public class C9152c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f38391a;

        public C9152c(Act act) {
            this.f38391a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m59475I2(this.f38391a, 1);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f38391a.getResources().getColor(w0c0.f183888t0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m59464m2(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationAct.class);
        intent.addFlags(268435456);
        intent.putExtra("type", i);
        intent.putExtra("verification", str);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m59465n2(c4g0 c4g0Var) {
        if (!NullChecker.m81303a(c4g0Var) || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m59466s2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f38387f = false;
            return;
        }
        if (c4319c != C4319c.f15550k) {
            if (c4319c == C4319c.f15552m) {
                puk0.m171431e().m171438i(false);
            }
        } else {
            if (this.f38387f || m59482r2() || !ConnectivityReceiver.m81284g()) {
                return;
            }
            m59465n2(this.f38385d);
            act().m66873d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m59467v2() {
        if (NullChecker.m81303a(this.f38384c) && this.f38384c.isShowing()) {
            return;
        }
        dd80 dd80VarM110989r0 = m59481q2(this.f38386e).m110983l0(new DialogInterface.OnCancelListener() { // from class: l.xsk0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f194283a.m59483u2(dialogInterface);
            }
        }).m110989r0();
        this.f38384c = dd80VarM110989r0;
        int i = this.f38386e;
        if (i == 2) {
            p420.m167356v(dd80VarM110989r0, i);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m59468A2(CheckBox checkBox, VerificationAct verificationAct, View view) {
        o6j0.m162859c("e_prevention_verify_click", "p_prevention_verify", o6j0.C18854a.m162879i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            osi0.m165783g(verificationAct.getResources().getString(R$string.f18529fs));
            return;
        }
        if (NullChecker.m81303a(m59480p2())) {
            final Act actM59480p2 = m59480p2();
            e51.m114743H(actM59480p2, new Runnable() { // from class: l.usk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.m190730h(actM59480p2, "fromPicVerificationDlg");
                }
            }, 200L);
        }
        m59479o2();
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m59469B2(VerificationAct verificationAct) {
        verificationAct.startActivity(VerificationSelectAct.m56020Z1(verificationAct, "fromNameVerificationDlg"));
        o6j0.m162859c("e_prevention_verify_click", "p_prevention_verify", new o6j0.C18854a[0]);
        m59479o2();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m59470C2(String str) {
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            o6j0.m162859c("e_verification_review_avatar_popup_confirm", "p_verification_review_avatar_popup", new o6j0.C18854a[0]);
        } else {
            o6j0.m162859c("e_verification_review_id_popup_confirm", "p_verification_review_id_popup", new o6j0.C18854a[0]);
        }
        m59479o2();
    }

    /* JADX INFO: renamed from: D2 */
    public final void m59471D2(Act act, View view) {
        VText vText = (VText) view.findViewById(u4c0.f174468sb);
        String string = act.getString(R$string.f18467ds);
        String str = act.getString(R$string.f18437cs) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.m133861b0(str, vwb.m200299M(string), act.getResources().getColor(w0c0.f183888t0), eqh0.m117752c(3)));
        spannableStringBuilder.setSpan(new C9151b(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(w0c0.f183811U1));
    }

    /* JADX INFO: renamed from: E2 */
    public final void m59472E2(Act act, View view) {
        VText vText = (VText) view.findViewById(u4c0.f174468sb);
        String string = act.getString(R$string.f18467ds);
        String str = act.getString(R$string.f18437cs) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) i0g0.m133861b0(str, vwb.m200299M(string), act.getResources().getColor(w0c0.f183888t0), eqh0.m117752c(3)));
        spannableStringBuilder.setSpan(new C9152c(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(w0c0.f183811U1));
    }

    /* JADX INFO: renamed from: F2 */
    public final dd80.C16336a m59473F2(final Act act) {
        String string = act.getString(R$string.f18651js);
        String string2 = act.getString(R$string.f18621is);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f96064w8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174501ua);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174518va);
        VText vText3 = (VText) viewInflate.findViewById(u4c0.f174468sb);
        vText2.getPaint().setFakeBoldText(true);
        vText3.getPaint().setFakeBoldText(true);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174484ta);
        VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174450ra);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f174238f1);
        vText.getPaint().setFakeBoldText(true);
        if (CoreModule.f17545c.f19639e0.m169520na().isFakeUser()) {
            vButton.setEnabled(false);
            vButton.setBackgroundResource(x2c0.f190506r);
            vButton.setTextColor(getResources().getColor(w0c0.f183761E));
        }
        vText.setText(i0g0.m133861b0(string + string2, vwb.m200299M(string2), getResources().getColor(w0c0.f183816W0), eqh0.m117752c(3)));
        m59471D2(act, viewInflate);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.atk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71630a.m59484w2(checkBox, act, view);
            }
        });
        xdl0.m208329E0(vButton2, new View.OnClickListener() { // from class: l.btk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77243a.m59485y2(view);
            }
        });
        return new dd80.C16336a(act).m110963R(viewInflate).m110961P(true);
    }

    /* JADX INFO: renamed from: H2 */
    public final dd80.C16336a m59474H2() {
        return m59478M2(this, "fromPicVerificationDlg");
    }

    /* JADX INFO: renamed from: I2 */
    public void m59475I2(Act act, final int i) {
        if (i == 5 && CoreModule.f17545c.f19639e0.m169520na().isFakeUser()) {
            return;
        }
        final yk5 yk5Var = new yk5(act, i == 5 ? 1 : 3);
        yk5Var.m215118D(new View.OnClickListener() { // from class: l.dtk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87850a.m59486z2(i, yk5Var, view);
            }
        });
        yk5Var.show();
    }

    /* JADX INFO: renamed from: K2 */
    public final dd80.C16336a m59476K2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R$string.f18651js);
        String string2 = verificationAct.getString(R$string.f18621is);
        View viewInflate = o7r.m163037a(verificationAct).inflate(f6c0.f96047v8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174501ua);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174518va);
        VText vText3 = (VText) viewInflate.findViewById(u4c0.f174468sb);
        vText2.getPaint().setFakeBoldText(true);
        vText3.getPaint().setFakeBoldText(true);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174484ta);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f174238f1);
        vText.getPaint().setFakeBoldText(true);
        vText.setText(i0g0.m133861b0(string + string2, vwb.m200299M(string2), getResources().getColor(w0c0.f183816W0), eqh0.m117752c(3)));
        m59472E2(verificationAct, viewInflate);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.ctk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82485a.m59468A2(checkBox, verificationAct, view);
            }
        });
        return new dd80.C16336a(verificationAct).m110963R(viewInflate).m110961P(true);
    }

    /* JADX INFO: renamed from: L2 */
    public final dd80.C16336a m59477L2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R$string.f18866qr);
        return new dd80.C16336a(verificationAct).m110995x0(R$string.f18682ks, new Object[0]).m110991t0(i0g0.m133861b0(verificationAct.getString(R$string.f18651js) + string, vwb.m200299M(string), getResources().getColor(w0c0.f183816W0), eqh0.m117752c(3))).m110961P(true).m110974c0(verificationAct.getString(R$string.f18926sr), new Runnable() { // from class: l.zsk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204607a.m59469B2(verificationAct);
            }
        });
    }

    /* JADX INFO: renamed from: M2 */
    public final dd80.C16336a m59478M2(VerificationAct verificationAct, final String str) {
        return new dd80.C16336a(verificationAct).m110964S(x2c0.f189403Hq).m110995x0(R$string.f17864Jr, new Object[0]).m110990s0(R$string.f17834Ir, new Object[0]).m110961P(true).m110972a0(R$string.f19076xr, new Runnable() { // from class: l.ysk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199790a.m59470C2(str);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(0, 0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f38386e = getIntent().getIntExtra("type", 1);
        this.pageHelper.m109041q(pageId());
        int i = this.f38386e;
        if (i == 1 || i == 2) {
            this.pageHelper.m109040p(vwb.m200311Y("verification_type", getIntent().getStringExtra("verification")));
        }
        puk0.m171431e().m171438i(true);
        this.f38385d = lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.tsk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171942a.m59466s2((C4319c) obj);
            }
        }));
        e51.m114743H(this, new Runnable() { // from class: l.wsk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187947a.m59467v2();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: o2 */
    public void m59479o2() {
        if (NullChecker.m81303a(this.f38384c) && this.f38384c.isShowing()) {
            this.f38384c.dismiss();
        }
        puk0.m171431e().m171438i(false);
        m66873d2();
    }

    /* JADX INFO: renamed from: p2 */
    public final Act m59480p2() {
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(this.act.getTaskId()));
        if (vwb.m200296J(arrayList)) {
            return null;
        }
        for (Act.C4299r c4299r : Lists.m15930q(arrayList)) {
            if (NullChecker.m81303a(c4299r.f15343a) && NullChecker.m81303a(c4299r.f15343a.get())) {
                Activity activity = c4299r.f15343a.get();
                if ((activity instanceof PutongAct) && !(activity instanceof VerificationAct)) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        int i = this.f38386e;
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

    /* JADX INFO: renamed from: q2 */
    public final dd80.C16336a m59481q2(int i) {
        switch (i) {
            case 1:
                return m59476K2(this);
            case 2:
                return m59477L2(this);
            case 3:
                return m59478M2(this, "fromPicVerificationDlg");
            case 4:
                return m59478M2(this, "fromNameVerificationDlg");
            case 5:
                return m59473F2(this.act);
            case 6:
                return m59474H2();
            default:
                return new dd80.C16336a(this);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public boolean m59482r2() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        return !vwb.m200296J(next) && (next.get(next.size() - 1).f15343a.get() instanceof VerificationAct);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m59483u2(DialogInterface dialogInterface) {
        m59479o2();
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m59484w2(CheckBox checkBox, Act act, View view) {
        o6j0.m162859c("e_prevention_verify_click", "p_prevention_verify", o6j0.C18854a.m162879i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            osi0.m165783g(act.getResources().getString(R$string.f18529fs));
            return;
        }
        if (NullChecker.m81303a(m59480p2())) {
            final Act actM59480p2 = m59480p2();
            e51.m114743H(actM59480p2, new Runnable() { // from class: l.etk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.m190730h(actM59480p2, "verification_center");
                }
            }, 200L);
        }
        m59479o2();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m59485y2(View view) {
        this.f38387f = true;
        FakeHoldFragment.m36395z4(21862, myf.m157025E(this), new C9150a()).m36396A4(getSupportFragmentManager());
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m59486z2(final int i, yk5 yk5Var, View view) {
        if (NullChecker.m81303a(m59480p2())) {
            final Act actM59480p2 = m59480p2();
            e51.m114743H(actM59480p2, new Runnable() { // from class: l.vsk0
                @Override // java.lang.Runnable
                public final void run() {
                    tvf.m190730h(actM59480p2, i == 5 ? "verification_center" : "fromPicVerificationDlg");
                }
            }, 200L);
        }
        yk5Var.dismiss();
        m59479o2();
    }
}
