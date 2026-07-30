package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class iwf {

    /* JADX INFO: renamed from: l.iwf$a */
    public class C17637a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f115266a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f115267b;

        public C17637a(Act act, Runnable runnable) {
            this.f115266a = act;
            this.f115267b = runnable;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.m220396r("e_fake_avatar_star_caseshow", "p_fake_avatar_star");
            gk90.m126611e(this.f115266a, CoreModule.f17545c.f19639e0.m169527p9().gender, this.f115267b, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.iwf$b */
    public static class C17638b {
        private static final iwf INSTANCE = new iwf();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m138734a(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m138735b(c4g0 c4g0Var, DialogInterface dialogInterface) {
        ygh0.m214701t();
        mkd0.m154992z(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m138736c(AppealInfo appealInfo, Act act, View view) {
        zvf0.m220396r("e_fake_avatar_star_appeal", "p_fake_avatar_star");
        if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.m36171Y1(act));
        } else {
            new pwf(act).show();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m138737d(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.m220396r("e_fake_avatar_star_change", "p_fake_avatar_star");
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static iwf m138738e() {
        return C17638b.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m138739f(Act act, VText vText, int i, Runnable runnable) {
        if (NullChecker.m81303a(act) && NullChecker.m81303a(vText)) {
            String string = act.getString(i);
            String string2 = act.getString(R$string.f17781H4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.append((CharSequence) string2);
            spannableStringBuilder.setSpan(new C17637a(act, runnable), string.length(), string.length() + string2.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), string.length(), string.length() + string2.length(), 33);
            vText.setText(spannableStringBuilder);
            vText.setMovementMethod(LinkMovementMethod.getInstance());
            vText.setHighlightColor(CoreModule.f17544b.getResources().getColor(w0c0.f183811U1));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m138740g(final Act act, final Runnable runnable, final AppealInfo appealInfo) {
        if (NullChecker.m81303a(act) && NullChecker.m81303a(appealInfo)) {
            View viewInflate = act.getLayoutInflater().inflate(f6c0.f95805h3, (ViewGroup) null);
            final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110960O();
            dd80VarM110960O.setCanceledOnTouchOutside(false);
            qib0.f154691G.m102327J0((VDraweeView) viewInflate.findViewById(u4c0.f173954O), CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle(), false);
            ((VText) viewInflate.findViewById(u4c0.f174268ge)).setText(act.getText(R$string.f17811I4));
            VText vText = (VText) viewInflate.findViewById(u4c0.f173973P1);
            int i = appealInfo.appeal_count;
            if (i == 0) {
                m138739f(act, vText, R$string.f17691E4, runnable);
            } else if (i == 1) {
                m138739f(act, vText, R$string.f17721F4, runnable);
            } else {
                m138739f(act, vText, R$string.f17751G4, runnable);
            }
            VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174120Y0);
            vButton.setText(act.getText(R$string.f17827Ik));
            xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.ewf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iwf.m138737d(runnable, dd80VarM110960O, view);
                }
            });
            VText vText2 = (VText) viewInflate.findViewById(u4c0.f173886K);
            int i2 = appealInfo.appeal_count;
            if (i2 == 0) {
                xdl0.m208344M(vText2, true);
                vText2.setText(act.getText(R$string.f17631C4));
            } else if (i2 == 1) {
                xdl0.m208344M(vText2, true);
                vText2.setText(act.getText(R$string.f17661D4));
            } else {
                xdl0.m208344M(vText2, false);
            }
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.fwf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iwf.m138736c(appealInfo, act, view);
                }
            });
            final c4g0 c4g0VarSubscribe = act.duringCreated((C22306c) C7846b.m36420r().m36434q(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.gwf
                @Override // p149l.e30
                public final void call(Object obj) {
                    iwf.m138734a(dd80VarM110960O, (roj0) obj);
                }
            }));
            dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hwf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    iwf.m138735b(c4g0VarSubscribe, dialogInterface);
                }
            });
            if (act.isFinishing()) {
                return;
            }
            dd80VarM110960O.show();
            ygh0.m214702u(appealInfo.appeal_count);
        }
    }

    public iwf() {
    }
}
