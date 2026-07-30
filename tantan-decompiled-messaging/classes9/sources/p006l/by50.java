package p006l;

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
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.OriginalSMSAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import l.s7m;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class by50 implements s7m<yx50> {

    /* JADX INFO: renamed from: a */
    public VLinear f9208a;

    /* JADX INFO: renamed from: b */
    public VImage f9209b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f9210c;

    /* JADX INFO: renamed from: d */
    public VText f9211d;

    /* JADX INFO: renamed from: e */
    public VImage f9212e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f9213f;

    /* JADX INFO: renamed from: g */
    public VText f9214g;

    /* JADX INFO: renamed from: h */
    public VImage f9215h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f9216i;

    /* JADX INFO: renamed from: j */
    public VText f9217j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f9218k;

    /* JADX INFO: renamed from: l */
    public final OriginalSMSAct f9219l;

    /* JADX INFO: renamed from: m */
    public yx50 f9220m;

    public by50(OriginalSMSAct originalSMSAct) {
        this.f9219l = originalSMSAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m13029e(View view) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m13030f(View view) {
        this.f9220m.m28453g0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13031C0() {
        return this.f9219l;
    }

    @Nullable
    public Act act() {
        return this.f9219l;
    }

    /* JADX INFO: renamed from: c */
    public View m13032c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cy50.m13687b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m13034i1(yx50 yx50Var) {
        this.f9220m = yx50Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13032c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m13035r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.e;
        int i = R$string.f272t0;
        yx50 yx50Var = this.f9220m;
        spannableStringBuilder.append((CharSequence) application.getString(i, yx50Var.f28462b, yx50Var.f28461a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f9220m.f28462b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f9220m.f28462b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f9220m.f28462b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f9220m.f28461a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), iIndexOf2, this.f9220m.f28461a.length() + iIndexOf2, 33);
        }
        this.f9211d.setText(spannableStringBuilder);
        xdl0.E0(this.f9209b, new View.OnClickListener() { // from class: l.zx50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29017a.m13029e(view);
            }
        });
        xdl0.E0(this.f9218k, new View.OnClickListener() { // from class: l.ay50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8593a.m13030f(view);
            }
        });
    }

    public void destroy() {
    }
}
