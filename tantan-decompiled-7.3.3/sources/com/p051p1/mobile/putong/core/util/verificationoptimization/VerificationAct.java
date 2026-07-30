package com.p051p1.mobile.putong.core.util.verificationoptimization;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationSelectAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import p151v.VButton;
import p151v.VText;
import p153l.a0g;
import p153l.adc0;
import p153l.bm5;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jl80;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.lyh0;
import p153l.p9r;
import p153l.psd0;
import p153l.q8g0;
import p153l.qtk;
import p153l.r1j0;
import p153l.sfj0;
import p153l.v3l0;
import p153l.xc20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public int f39234e;

    /* JADX INFO: renamed from: c */
    public jl80 f39232c = null;

    /* JADX INFO: renamed from: d */
    public kcg0 f39233d = null;

    /* JADX INFO: renamed from: f */
    public boolean f39235f = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$a */
    public class C9313a implements FakeHoldFragment.InterfaceC7995a {
        public C9313a() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        /* JADX INFO: renamed from: a */
        public void mo37400a(ArrayList<Media> arrayList, String str) {
            VerificationAct.this.f39235f = false;
            VerificationAct.this.m60664p2();
            qtk.m177983L0(VerificationAct.this.m60665q2(), arrayList);
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        public void onError() {
            super.onError();
            VerificationAct.this.f39235f = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$b */
    public class C9314b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f39237a;

        public C9314b(Act act) {
            this.f39237a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m60660K2(this.f39237a, 5);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f39237a.getResources().getColor(c9c0.f80461u0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.util.verificationoptimization.VerificationAct$c */
    public class C9315c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f39239a;

        public C9315c(Act act) {
            this.f39239a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            VerificationAct.this.m60660K2(this.f39239a, 1);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f39239a.getResources().getColor(c9c0.f80461u0));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m60648n2(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerificationAct.class);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("type", i);
        intent.putExtra("verification", str);
        return intent;
    }

    /* JADX INFO: renamed from: o2 */
    private void m60649o2(kcg0 kcg0Var) {
        if (!NullChecker.m82486a(kcg0Var) || kcg0Var.isUnsubscribed()) {
            return;
        }
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m60650u2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f39235f = false;
            return;
        }
        if (c4470c != C4470c.f16269k) {
            if (c4470c == C4470c.f16271m) {
                v3l0.m199281e().m199288i(false);
            }
        } else {
            if (this.f39235f || m60667s2() || !ConnectivityReceiver.m82467g()) {
                return;
            }
            m60649o2(this.f39233d);
            act().m68056e2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m60651w2() {
        if (NullChecker.m82486a(this.f39232c) && this.f39232c.isShowing()) {
            return;
        }
        jl80 jl80VarM146049r0 = m60666r2(this.f39234e).m146043l0(new DialogInterface.OnCancelListener() { // from class: l.d2l0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f84798a.m60668v2(dialogInterface);
            }
        }).m146049r0();
        this.f39232c = jl80VarM146049r0;
        int i = this.f39234e;
        if (i == 2) {
            xc20.m210110v(jl80VarM146049r0, i);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m60652A2(final int i, bm5 bm5Var, View view) {
        if (NullChecker.m82486a(m60665q2())) {
            final Act actM60665q2 = m60665q2();
            l51.m152888H(actM60665q2, new Runnable() { // from class: l.b2l0
                @Override // java.lang.Runnable
                public final void run() {
                    hxf.m137587h(actM60665q2, i == 5 ? "verification_center" : "fromPicVerificationDlg");
                }
            }, 200L);
        }
        bm5Var.dismiss();
        m60664p2();
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m60653B2(CheckBox checkBox, VerificationAct verificationAct, View view) {
        sfj0.m185596c("e_prevention_verify_click", "p_prevention_verify", sfj0.C20032a.m185616i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            r1j0.m179420g(verificationAct.getResources().getString(R$string.f18345Bs));
            return;
        }
        if (NullChecker.m82486a(m60665q2())) {
            final Act actM60665q2 = m60665q2();
            l51.m152888H(actM60665q2, new Runnable() { // from class: l.a2l0
                @Override // java.lang.Runnable
                public final void run() {
                    hxf.m137587h(actM60665q2, "fromPicVerificationDlg");
                }
            }, 200L);
        }
        m60664p2();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m60654C2(VerificationAct verificationAct) {
        verificationAct.startActivity(VerificationSelectAct.m57203a2(verificationAct, "fromNameVerificationDlg"));
        sfj0.m185596c("e_prevention_verify_click", "p_prevention_verify", new sfj0.C20032a[0]);
        m60664p2();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m60655D2(String str) {
        if (TextUtils.equals(str, "fromPicVerificationDlg")) {
            sfj0.m185596c("e_verification_review_avatar_popup_confirm", "p_verification_review_avatar_popup", new sfj0.C20032a[0]);
        } else {
            sfj0.m185596c("e_verification_review_id_popup_confirm", "p_verification_review_id_popup", new sfj0.C20032a[0]);
        }
        m60664p2();
    }

    /* JADX INFO: renamed from: E2 */
    public final void m60656E2(Act act, View view) {
        VText vText = (VText) view.findViewById(adc0.f70593ub);
        String string = act.getString(R$string.f19877zs);
        String str = act.getString(R$string.f19846ys) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) q8g0.m175796b0(str, jyb.m147482M(string), act.getResources().getColor(c9c0.f80461u0), lyh0.m156283c(3)));
        spannableStringBuilder.setSpan(new C9314b(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(c9c0.f80383V1));
    }

    /* JADX INFO: renamed from: F2 */
    public final void m60657F2(Act act, View view) {
        VText vText = (VText) view.findViewById(adc0.f70593ub);
        String string = act.getString(R$string.f19877zs);
        String str = act.getString(R$string.f19846ys) + string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) q8g0.m175796b0(str, jyb.m147482M(string), act.getResources().getColor(c9c0.f80461u0), lyh0.m156283c(3)));
        spannableStringBuilder.setSpan(new C9315c(act), str.indexOf(string), str.indexOf(string) + string.length(), 33);
        vText.setText(spannableStringBuilder);
        vText.setMovementMethod(LinkMovementMethod.getInstance());
        vText.setHighlightColor(act.getResources().getColor(c9c0.f80383V1));
    }

    /* JADX INFO: renamed from: H2 */
    public final jl80.C17971a m60658H2(final Act act) {
        String string = act.getString(R$string.f18469Fs);
        String string2 = act.getString(R$string.f18438Es);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125375D8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70626wa);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70643xa);
        VText vText3 = (VText) viewInflate.findViewById(adc0.f70593ub);
        vText2.getPaint().setFakeBoldText(true);
        vText3.getPaint().setFakeBoldText(true);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70609va);
        VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f70575ta);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(adc0.f70329f1);
        vText.getPaint().setFakeBoldText(true);
        if (CoreModule.f18264c.f20381e0.m116593na().isFakeUser()) {
            vButton.setEnabled(false);
            vButton.setBackgroundResource(dbc0.f87399s);
            vButton.setTextColor(getResources().getColor(c9c0.f80330E));
        }
        vText.setText(q8g0.m175796b0(string + string2, jyb.m147482M(string2), getResources().getColor(c9c0.f80388X0), lyh0.m156283c(3)));
        m60656E2(act, viewInflate);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.g2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101856a.m60669y2(checkBox, act, view);
            }
        });
        bnl0.m105509E0(vButton2, new View.OnClickListener() { // from class: l.h2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107565a.m60670z2(view);
            }
        });
        return new jl80.C17971a(act).m146023R(viewInflate).m146021P(true);
    }

    /* JADX INFO: renamed from: I2 */
    public final jl80.C17971a m60659I2() {
        return m60663N2(this, "fromPicVerificationDlg");
    }

    /* JADX INFO: renamed from: K2 */
    public void m60660K2(Act act, final int i) {
        if (i == 5 && CoreModule.f18264c.f20381e0.m116593na().isFakeUser()) {
            return;
        }
        final bm5 bm5Var = new bm5(act, i == 5 ? 1 : 3);
        bm5Var.m104999D(new View.OnClickListener() { // from class: l.j2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118065a.m60652A2(i, bm5Var, view);
            }
        });
        bm5Var.show();
    }

    /* JADX INFO: renamed from: L2 */
    public final jl80.C17971a m60661L2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R$string.f18469Fs);
        String string2 = verificationAct.getString(R$string.f18438Es);
        View viewInflate = p9r.m171370a(verificationAct).inflate(kec0.f125358C8, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70626wa);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70643xa);
        VText vText3 = (VText) viewInflate.findViewById(adc0.f70593ub);
        vText2.getPaint().setFakeBoldText(true);
        vText3.getPaint().setFakeBoldText(true);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70609va);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(adc0.f70329f1);
        vText.getPaint().setFakeBoldText(true);
        vText.setText(q8g0.m175796b0(string + string2, jyb.m147482M(string2), getResources().getColor(c9c0.f80388X0), lyh0.m156283c(3)));
        m60657F2(verificationAct, viewInflate);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.i2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112654a.m60653B2(checkBox, verificationAct, view);
            }
        });
        return new jl80.C17971a(verificationAct).m146023R(viewInflate).m146021P(true);
    }

    /* JADX INFO: renamed from: M2 */
    public final jl80.C17971a m60662M2(final VerificationAct verificationAct) {
        String string = verificationAct.getString(R$string.f18684Mr);
        return new jl80.C17971a(verificationAct).m146055x0(R$string.f18500Gs, new Object[0]).m146051t0(q8g0.m175796b0(verificationAct.getString(R$string.f18469Fs) + string, jyb.m147482M(string), getResources().getColor(c9c0.f80388X0), lyh0.m156283c(3))).m146021P(true).m146034c0(verificationAct.getString(R$string.f18744Or), new Runnable() { // from class: l.f2l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96889a.m60654C2(verificationAct);
            }
        });
    }

    /* JADX INFO: renamed from: N2 */
    public final jl80.C17971a m60663N2(VerificationAct verificationAct, final String str) {
        return new jl80.C17971a(verificationAct).m146024S(dbc0.f87525vr).m146055x0(R$string.f19259fs, new Object[0]).m146050s0(R$string.f19228es, new Object[0]).m146021P(true).m146032a0(R$string.f18894Tr, new Runnable() { // from class: l.e2l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91797a.m60655D2(str);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(0, 0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f39234e = getIntent().getIntExtra("type", 1);
        this.pageHelper.m152782q(pageId());
        int i = this.f39234e;
        if (i == 1 || i == 2) {
            this.pageHelper.m152781p(jyb.m147494Y("verification_type", getIntent().getStringExtra("verification")));
        }
        v3l0.m199281e().m199288i(true);
        this.f39233d = lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.z1l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202568a.m60650u2((C4470c) obj);
            }
        }));
        l51.m152888H(this, new Runnable() { // from class: l.c2l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79502a.m60651w2();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: p2 */
    public void m60664p2() {
        if (NullChecker.m82486a(this.f39232c) && this.f39232c.isShowing()) {
            this.f39232c.dismiss();
        }
        v3l0.m199281e().m199288i(false);
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        int i = this.f39234e;
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
    public final Act m60665q2() {
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(this.act.getTaskId()));
        if (jyb.m147479J(arrayList)) {
            return null;
        }
        for (Act.C4450r c4450r : Lists.m15984q(arrayList)) {
            if (NullChecker.m82486a(c4450r.f16062a) && NullChecker.m82486a(c4450r.f16062a.get())) {
                Activity activity = c4450r.f16062a.get();
                if ((activity instanceof PutongAct) && !(activity instanceof VerificationAct)) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r2 */
    public final jl80.C17971a m60666r2(int i) {
        switch (i) {
            case 1:
                return m60661L2(this);
            case 2:
                return m60662M2(this);
            case 3:
                return m60663N2(this, "fromPicVerificationDlg");
            case 4:
                return m60663N2(this, "fromNameVerificationDlg");
            case 5:
                return m60658H2(this.act);
            case 6:
                return m60659I2();
            default:
                return new jl80.C17971a(this);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public boolean m60667s2() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return false;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        return !jyb.m147479J(next) && (next.get(next.size() - 1).f16062a.get() instanceof VerificationAct);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m60668v2(DialogInterface dialogInterface) {
        m60664p2();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m60669y2(CheckBox checkBox, Act act, View view) {
        sfj0.m185596c("e_prevention_verify_click", "p_prevention_verify", sfj0.C20032a.m185616i("is_checked", checkBox.isChecked()));
        if (!checkBox.isChecked()) {
            r1j0.m179420g(act.getResources().getString(R$string.f18345Bs));
            return;
        }
        if (NullChecker.m82486a(m60665q2())) {
            final Act actM60665q2 = m60665q2();
            l51.m152888H(actM60665q2, new Runnable() { // from class: l.k2l0
                @Override // java.lang.Runnable
                public final void run() {
                    hxf.m137587h(actM60665q2, "verification_center");
                }
            }, 200L);
        }
        m60664p2();
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m60670z2(View view) {
        this.f39235f = true;
        FakeHoldFragment.m37398z4(21862, a0g.m95349E(this), new C9313a()).m37399A4(getSupportFragmentManager());
    }
}
