package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.OriginalSMSAct;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class g660 implements iam<d660> {

    /* JADX INFO: renamed from: a */
    public VLinear f102383a;

    /* JADX INFO: renamed from: b */
    public VImage f102384b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f102385c;

    /* JADX INFO: renamed from: d */
    public VText f102386d;

    /* JADX INFO: renamed from: e */
    public VImage f102387e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f102388f;

    /* JADX INFO: renamed from: g */
    public VText f102389g;

    /* JADX INFO: renamed from: h */
    public VImage f102390h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f102391i;

    /* JADX INFO: renamed from: j */
    public VText f102392j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f102393k;

    /* JADX INFO: renamed from: l */
    public final OriginalSMSAct f102394l;

    /* JADX INFO: renamed from: m */
    public d660 f102395m;

    public g660(OriginalSMSAct originalSMSAct) {
        this.f102394l = originalSMSAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m129093e(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m129094f(View view) {
        this.f102395m.m114420g0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102394l;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f102394l;
    }

    /* JADX INFO: renamed from: c */
    public View m129095c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h660.m133680b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d660 d660Var) {
        this.f102395m = d660Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m129095c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m129097r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.f16088e;
        int i = R$string.f17002t0;
        d660 d660Var = this.f102395m;
        spannableStringBuilder.append((CharSequence) application.getString(i, d660Var.f85303b, d660Var.f85302a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f102395m.f85303b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f102395m.f85303b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f102395m.f85303b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f102395m.f85302a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(RoundedDrawable.DEFAULT_BORDER_COLOR), iIndexOf2, this.f102395m.f85302a.length() + iIndexOf2, 33);
        }
        this.f102386d.setText(spannableStringBuilder);
        bnl0.m105509E0(this.f102384b, new View.OnClickListener() { // from class: l.e660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92259a.m129093e(view);
            }
        });
        bnl0.m105509E0(this.f102393k, new View.OnClickListener() { // from class: l.f660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97378a.m129094f(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
