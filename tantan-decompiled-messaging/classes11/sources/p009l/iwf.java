package p009l;

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
import com.p000p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p000p1.mobile.putong.core.newui.fake.C0010b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.dd80;
import l.e30;
import l.f6c0;
import l.gk90;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.u4c0;
import l.w0c0;
import l.xdl0;
import l.ygh0;
import l.zvf0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class iwf {

    /* JADX INFO: renamed from: l.iwf$a */
    public class C0965a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f14840a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f14841b;

        public C0965a(Act act, Runnable runnable) {
            this.f14840a = act;
            this.f14841b = runnable;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.r("e_fake_avatar_star_caseshow", "p_fake_avatar_star");
            gk90.e(this.f14840a, CoreModule.c.e0.p9().gender, this.f14841b, (d30) null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.iwf$b */
    public static class C0966b {
        private static final iwf INSTANCE = new iwf();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16772a(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16773b(c4g0 c4g0Var, DialogInterface dialogInterface) {
        ygh0.t();
        mkd0.z(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16774c(AppealInfo appealInfo, Act act, View view) {
        zvf0.r("e_fake_avatar_star_appeal", "p_fake_avatar_star");
        if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.m70Y1(act));
        } else {
            new pwf(act).show();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16775d(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.r("e_fake_avatar_star_change", "p_fake_avatar_star");
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static iwf m16776e() {
        return C0966b.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m16777f(Act act, VText vText, int i, Runnable runnable) {
        if (NullChecker.a(act) && NullChecker.a(vText)) {
            String string = act.getString(i);
            String string2 = act.getString(R.string.H4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.append((CharSequence) string2);
            spannableStringBuilder.setSpan(new C0965a(act, runnable), string.length(), string.length() + string2.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), string.length(), string.length() + string2.length(), 33);
            vText.setText(spannableStringBuilder);
            vText.setMovementMethod(LinkMovementMethod.getInstance());
            vText.setHighlightColor(CoreModule.b.getResources().getColor(w0c0.U1));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m16778g(final Act act, final Runnable runnable, final AppealInfo appealInfo) {
        if (NullChecker.a(act) && NullChecker.a(appealInfo)) {
            View viewInflate = act.getLayoutInflater().inflate(f6c0.h3, (ViewGroup) null);
            final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(true).O();
            dd80VarO.setCanceledOnTouchOutside(false);
            qib0.G.J0(viewInflate.findViewById(u4c0.O), CoreModule.c.e0.p9().fp().profileMiddle(), false);
            viewInflate.findViewById(u4c0.ge).setText(act.getText(R.string.I4));
            VText vText = (VText) viewInflate.findViewById(u4c0.P1);
            int i = appealInfo.appeal_count;
            if (i == 0) {
                m16777f(act, vText, R.string.E4, runnable);
            } else if (i == 1) {
                m16777f(act, vText, R.string.F4, runnable);
            } else {
                m16777f(act, vText, R.string.G4, runnable);
            }
            VButton vButtonFindViewById = viewInflate.findViewById(u4c0.Y0);
            vButtonFindViewById.setText(act.getText(R.string.Ik));
            xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.ewf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iwf.m16775d(runnable, dd80VarO, view);
                }
            });
            VText vTextFindViewById = viewInflate.findViewById(u4c0.K);
            int i2 = appealInfo.appeal_count;
            if (i2 == 0) {
                xdl0.M(vTextFindViewById, true);
                vTextFindViewById.setText(act.getText(R.string.C4));
            } else if (i2 == 1) {
                xdl0.M(vTextFindViewById, true);
                vTextFindViewById.setText(act.getText(R.string.D4));
            } else {
                xdl0.M(vTextFindViewById, false);
            }
            xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.fwf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iwf.m16774c(appealInfo, act, view);
                }
            });
            final c4g0 c4g0VarSubscribe = act.duringCreated(C0010b.m349r().m363q(), false).subscribe(mkd0.G(new e30() { // from class: l.gwf
                public final void call(Object obj) {
                    iwf.m16772a(dd80VarO, (roj0) obj);
                }
            }));
            dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hwf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    iwf.m16773b(c4g0VarSubscribe, dialogInterface);
                }
            });
            if (act.isFinishing()) {
                return;
            }
            dd80VarO.show();
            ygh0.u(appealInfo.appeal_count);
        }
    }

    public iwf() {
    }
}
