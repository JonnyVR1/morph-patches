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
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.OriginalSMSConfirmAct;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class p660 implements iam<l660> {

    /* JADX INFO: renamed from: a */
    public VLinear f150739a;

    /* JADX INFO: renamed from: b */
    public VImage f150740b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f150741c;

    /* JADX INFO: renamed from: d */
    public VText f150742d;

    /* JADX INFO: renamed from: e */
    public VText f150743e;

    /* JADX INFO: renamed from: f */
    public VLinear f150744f;

    /* JADX INFO: renamed from: g */
    public final OriginalSMSConfirmAct f150745g;

    /* JADX INFO: renamed from: h */
    public l660 f150746h;

    public p660(OriginalSMSConfirmAct originalSMSConfirmAct) {
        this.f150745g = originalSMSConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m170728i(View view) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m170729j(View view) {
        this.f150746h.m153053h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m170730k(View view) {
        this.f150746h.m153057n0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150745g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f150745g;
    }

    /* JADX INFO: renamed from: d */
    public View m170731d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q660.m175542b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l660 l660Var) {
        this.f150746h = l660Var;
    }

    /* JADX INFO: renamed from: f */
    public void m170733f() {
        this.f150743e.setEnabled(true);
        this.f150743e.setAlpha(1.0f);
        this.f150745g.progressDismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m170731d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m170734l() {
        this.f150743e.setEnabled(false);
        this.f150743e.setAlpha(0.5f);
        OriginalSMSConfirmAct originalSMSConfirmAct = this.f150745g;
        originalSMSConfirmAct.progress(originalSMSConfirmAct.getString(R$string.f16946j0));
    }

    /* JADX INFO: renamed from: r */
    public void m170735r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.f16088e;
        int i = R$string.f17002t0;
        l660 l660Var = this.f150746h;
        spannableStringBuilder.append((CharSequence) application.getString(i, l660Var.f130231b, l660Var.f130230a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f150746h.f130231b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f150746h.f130231b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f150746h.f130231b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f150746h.f130230a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(RoundedDrawable.DEFAULT_BORDER_COLOR), iIndexOf2, this.f150746h.f130230a.length() + iIndexOf2, 33);
        }
        this.f150742d.setText(spannableStringBuilder);
        bnl0.m105509E0(this.f150740b, new View.OnClickListener() { // from class: l.m660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134972a.m170728i(view);
            }
        });
        bnl0.m105509E0(this.f150743e, new View.OnClickListener() { // from class: l.n660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140432a.m170729j(view);
            }
        });
        bnl0.m105509E0(this.f150744f, new View.OnClickListener() { // from class: l.o660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145142a.m170730k(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
