package p149l;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.OriginalSMSAct;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class by50 implements s7m<yx50> {

    /* JADX INFO: renamed from: a */
    public VLinear f77871a;

    /* JADX INFO: renamed from: b */
    public VImage f77872b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f77873c;

    /* JADX INFO: renamed from: d */
    public VText f77874d;

    /* JADX INFO: renamed from: e */
    public VImage f77875e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f77876f;

    /* JADX INFO: renamed from: g */
    public VText f77877g;

    /* JADX INFO: renamed from: h */
    public VImage f77878h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f77879i;

    /* JADX INFO: renamed from: j */
    public VText f77880j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f77881k;

    /* JADX INFO: renamed from: l */
    public final OriginalSMSAct f77882l;

    /* JADX INFO: renamed from: m */
    public yx50 f77883m;

    public by50(OriginalSMSAct originalSMSAct) {
        this.f77882l = originalSMSAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m104429e(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m104430f(View view) {
        this.f77883m.m216431g0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77882l;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f77882l;
    }

    /* JADX INFO: renamed from: c */
    public View m104431c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cy50.m109132b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yx50 yx50Var) {
        this.f77883m = yx50Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104431c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m104433r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.f15369e;
        int i = R$string.f16283t0;
        yx50 yx50Var = this.f77883m;
        spannableStringBuilder.append((CharSequence) application.getString(i, yx50Var.f200568b, yx50Var.f200567a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f77883m.f200568b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f77883m.f200568b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f77883m.f200568b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f77883m.f200567a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(RoundedDrawable.DEFAULT_BORDER_COLOR), iIndexOf2, this.f77883m.f200567a.length() + iIndexOf2, 33);
        }
        this.f77874d.setText(spannableStringBuilder);
        xdl0.m208329E0(this.f77872b, new View.OnClickListener() { // from class: l.zx50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205381a.m104429e(view);
            }
        });
        xdl0.m208329E0(this.f77881k, new View.OnClickListener() { // from class: l.ay50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72253a.m104430f(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
