package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wxf {

    /* JADX INFO: renamed from: l.wxf$a */
    public class C21199a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f191487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f191488b;

        public C21199a(Act act, Runnable runnable) {
            this.f191487a = act;
            this.f191488b = runnable;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            i4g0.m138520r("e_fake_avatar_star_caseshow", "p_fake_avatar_star");
            ks90.m151153e(this.f191487a, CoreModule.f18264c.f20381e0.m116600p9().gender, this.f191488b, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.wxf$b */
    public static class C21200b {
        private static final wxf INSTANCE = new wxf();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m208404a(jl80 jl80Var, uxj0 uxj0Var) {
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m208405b(kcg0 kcg0Var, DialogInterface dialogInterface) {
        fph0.m126689t();
        psd0.m173633z(kcg0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m208406c(AppealInfo appealInfo, Act act, View view) {
        i4g0.m138520r("e_fake_avatar_star_appeal", "p_fake_avatar_star");
        if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.m37174Z1(act));
        } else {
            new dyf(act).show();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m208407d(Runnable runnable, jl80 jl80Var, View view) {
        i4g0.m138520r("e_fake_avatar_star_change", "p_fake_avatar_star");
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static wxf m208408e() {
        return C21200b.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m208409f(Act act, VText vText, int i, Runnable runnable) {
        if (NullChecker.m82486a(act) && NullChecker.m82486a(vText)) {
            String string = act.getString(i);
            String string2 = act.getString(R$string.f18569J4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.append((CharSequence) string2);
            spannableStringBuilder.setSpan(new C21199a(act, runnable), string.length(), string.length() + string2.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), string.length(), string.length() + string2.length(), 33);
            vText.setText(spannableStringBuilder);
            vText.setMovementMethod(LinkMovementMethod.getInstance());
            vText.setHighlightColor(CoreModule.f18263b.getResources().getColor(c9c0.f80383V1));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m208410g(final Act act, final Runnable runnable, final AppealInfo appealInfo) {
        if (NullChecker.m82486a(act) && NullChecker.m82486a(appealInfo)) {
            View viewInflate = act.getLayoutInflater().inflate(kec0.f125859h3, (ViewGroup) null);
            final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146020O();
            jl80VarM146020O.setCanceledOnTouchOutside(false);
            uqb0.f180374G.m127111J0((VDraweeView) viewInflate.findViewById(adc0.f70042O), CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle(), false);
            ((VText) viewInflate.findViewById(adc0.f70409je)).setText(act.getText(R$string.f18600K4));
            VText vText = (VText) viewInflate.findViewById(adc0.f70061P1);
            int i = appealInfo.appeal_count;
            if (i == 0) {
                m208409f(act, vText, R$string.f18476G4, runnable);
            } else if (i == 1) {
                m208409f(act, vText, R$string.f18507H4, runnable);
            } else {
                m208409f(act, vText, R$string.f18538I4, runnable);
            }
            VButton vButton = (VButton) viewInflate.findViewById(adc0.f70211Y0);
            vButton.setText(act.getText(R$string.f19221el));
            bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.sxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wxf.m208407d(runnable, jl80VarM146020O, view);
                }
            });
            VText vText2 = (VText) viewInflate.findViewById(adc0.f69974K);
            int i2 = appealInfo.appeal_count;
            if (i2 == 0) {
                bnl0.m105524M(vText2, true);
                vText2.setText(act.getText(R$string.f18414E4));
            } else if (i2 == 1) {
                bnl0.m105524M(vText2, true);
                vText2.setText(act.getText(R$string.f18445F4));
            } else {
                bnl0.m105524M(vText2, false);
            }
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.txf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wxf.m208406c(appealInfo, act, view);
                }
            });
            final kcg0 kcg0VarSubscribe = act.duringCreated((C22421c) C7997b.m37423r().m37437q(), false).subscribe(psd0.m173596G(new y20() { // from class: l.uxf
                @Override // p153l.y20
                public final void call(Object obj) {
                    wxf.m208404a(jl80VarM146020O, (uxj0) obj);
                }
            }));
            jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vxf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    wxf.m208405b(kcg0VarSubscribe, dialogInterface);
                }
            });
            if (act.isFinishing()) {
                return;
            }
            jl80VarM146020O.show();
            fph0.m126690u(appealInfo.appeal_count);
        }
    }

    public wxf() {
    }
}
