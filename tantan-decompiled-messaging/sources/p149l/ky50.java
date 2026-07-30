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
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.OriginalSMSConfirmAct;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class ky50 implements s7m<gy50> {

    /* JADX INFO: renamed from: a */
    public VLinear f125244a;

    /* JADX INFO: renamed from: b */
    public VImage f125245b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f125246c;

    /* JADX INFO: renamed from: d */
    public VText f125247d;

    /* JADX INFO: renamed from: e */
    public VText f125248e;

    /* JADX INFO: renamed from: f */
    public VLinear f125249f;

    /* JADX INFO: renamed from: g */
    public final OriginalSMSConfirmAct f125250g;

    /* JADX INFO: renamed from: h */
    public gy50 f125251h;

    public ky50(OriginalSMSConfirmAct originalSMSConfirmAct) {
        this.f125250g = originalSMSConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m147825i(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m147826j(View view) {
        this.f125251h.m128681h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m147827k(View view) {
        this.f125251h.m128685n0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f125250g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f125250g;
    }

    /* JADX INFO: renamed from: d */
    public View m147828d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ly50.m152118b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gy50 gy50Var) {
        this.f125251h = gy50Var;
    }

    /* JADX INFO: renamed from: f */
    public void m147830f() {
        this.f125248e.setEnabled(true);
        this.f125248e.setAlpha(1.0f);
        this.f125250g.progressDismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147828d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m147831l() {
        this.f125248e.setEnabled(false);
        this.f125248e.setAlpha(0.5f);
        OriginalSMSConfirmAct originalSMSConfirmAct = this.f125250g;
        originalSMSConfirmAct.progress(originalSMSConfirmAct.getString(R$string.f16227j0));
    }

    /* JADX INFO: renamed from: r */
    public void m147832r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.f15369e;
        int i = R$string.f16283t0;
        gy50 gy50Var = this.f125251h;
        spannableStringBuilder.append((CharSequence) application.getString(i, gy50Var.f104966b, gy50Var.f104965a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f125251h.f104966b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f125251h.f104966b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f125251h.f104966b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f125251h.f104965a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(RoundedDrawable.DEFAULT_BORDER_COLOR), iIndexOf2, this.f125251h.f104965a.length() + iIndexOf2, 33);
        }
        this.f125247d.setText(spannableStringBuilder);
        xdl0.m208329E0(this.f125245b, new View.OnClickListener() { // from class: l.hy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110030a.m147825i(view);
            }
        });
        xdl0.m208329E0(this.f125248e, new View.OnClickListener() { // from class: l.iy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115429a.m147826j(view);
            }
        });
        xdl0.m208329E0(this.f125249f, new View.OnClickListener() { // from class: l.jy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120284a.m147827k(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
