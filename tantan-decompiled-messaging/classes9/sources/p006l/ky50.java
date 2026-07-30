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
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.OriginalSMSConfirmAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import l.s7m;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ky50 implements s7m<gy50> {

    /* JADX INFO: renamed from: a */
    public VLinear f16074a;

    /* JADX INFO: renamed from: b */
    public VImage f16075b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f16076c;

    /* JADX INFO: renamed from: d */
    public VText f16077d;

    /* JADX INFO: renamed from: e */
    public VText f16078e;

    /* JADX INFO: renamed from: f */
    public VLinear f16079f;

    /* JADX INFO: renamed from: g */
    public final OriginalSMSConfirmAct f16080g;

    /* JADX INFO: renamed from: h */
    public gy50 f16081h;

    public ky50(OriginalSMSConfirmAct originalSMSConfirmAct) {
        this.f16080g = originalSMSConfirmAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m18354i(View view) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m18355j(View view) {
        this.f16081h.m16015h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m18356k(View view) {
        this.f16081h.m16019n0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18357C0() {
        return this.f16080g;
    }

    @Nullable
    public Act act() {
        return this.f16080g;
    }

    /* JADX INFO: renamed from: d */
    public View m18358d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ly50.m19081b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m18361i1(gy50 gy50Var) {
        this.f16081h = gy50Var;
    }

    /* JADX INFO: renamed from: f */
    public void m18360f() {
        this.f16078e.setEnabled(true);
        this.f16078e.setAlpha(1.0f);
        this.f16080g.progressDismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18358d(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public void m18362l() {
        this.f16078e.setEnabled(false);
        this.f16078e.setAlpha(0.5f);
        Act act = this.f16080g;
        act.progress(act.getString(R$string.f216j0));
    }

    /* JADX INFO: renamed from: r */
    public void m18363r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Application application = App.e;
        int i = R$string.f272t0;
        gy50 gy50Var = this.f16081h;
        spannableStringBuilder.append((CharSequence) application.getString(i, gy50Var.f13576b, gy50Var.f13575a));
        int iIndexOf = spannableStringBuilder.toString().indexOf(this.f16081h.f13576b);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), iIndexOf, this.f16081h.f13576b.length() + iIndexOf, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), iIndexOf, this.f16081h.f13576b.length() + iIndexOf, 33);
        }
        int iIndexOf2 = spannableStringBuilder.toString().indexOf(this.f16081h.f13575a);
        if (iIndexOf2 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), iIndexOf2, this.f16081h.f13575a.length() + iIndexOf2, 33);
        }
        this.f16077d.setText(spannableStringBuilder);
        xdl0.E0(this.f16075b, new View.OnClickListener() { // from class: l.hy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14125a.m18354i(view);
            }
        });
        xdl0.E0(this.f16078e, new View.OnClickListener() { // from class: l.iy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14872a.m18355j(view);
            }
        });
        xdl0.E0(this.f16079f, new View.OnClickListener() { // from class: l.jy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15487a.m18356k(view);
            }
        });
    }

    public void destroy() {
    }
}
