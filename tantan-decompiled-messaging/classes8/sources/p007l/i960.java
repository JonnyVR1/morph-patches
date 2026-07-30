package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.putong.core.p006ui.account.PasswordChangeAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import l.c1c0;
import l.d30;
import l.e30;
import l.j960;
import l.xdl0;
import l.yij0;
import v.VButton_FakeShadow;
import v.VButton_FakeShadowSmall;
import v.VMaterialEdit;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class i960 implements s7m<z860> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f2866a;

    /* JADX INFO: renamed from: b */
    public TextView f2867b;

    /* JADX INFO: renamed from: c */
    public TextView f2868c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadowSmall f2869d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f2870e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f2871f;

    /* JADX INFO: renamed from: g */
    public VText f2872g;

    /* JADX INFO: renamed from: h */
    public VText f2873h;

    /* JADX INFO: renamed from: i */
    public VButton_FakeShadow f2874i;

    /* JADX INFO: renamed from: j */
    public z860 f2875j;

    /* JADX INFO: renamed from: k */
    public PasswordChangeAct f2876k;

    public i960(PasswordChangeAct passwordChangeAct) {
        this.f2876k = passwordChangeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m9359A(CharSequence charSequence) {
        if (charSequence.length() < CoreModule.H().N9() && charSequence.length() > 0) {
            this.f2871f.setError(it6.m9424c(this.f2876k.string(R.string.K3)));
        }
        m9384u();
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m9360B(CharSequence charSequence) {
        if (charSequence.length() != CoreModule.H().eq() && charSequence.length() > 0) {
            this.f2870e.setError(this.f2876k.string(R.string.v3));
        }
        m9384u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m9361C(View view) {
        this.f2875j.m11982j0();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9365d(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    private void m9370v() {
        xdl0.y(this.f2869d, false);
        xdl0.M0(this.f2867b, true);
        this.f2869d.setTextColor(this.f2876k.getResources().getColor(c1c0.l));
        PutongAct putongAct = this.f2876k;
        putongAct.duringCreated(e51.m9031N(putongAct.getLocalClassName(), 60)).subscribe(mkd0.m9876I(new e30() { // from class: l.f960
            public final void call(Object obj) {
                this.f2669a.m9385w((Long) obj);
            }
        }, new e30() { // from class: l.g960
            public final void call(Object obj) {
                i960.m9365d((Throwable) obj);
            }
        }, new d30() { // from class: l.h960
            public final void call() {
                this.f2811a.m9386x();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m9371y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m9372z(View view) {
        this.f2875j.m11983k0();
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f2876k;
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
    /* JADX INFO: renamed from: E */
    public void m9373E() {
        this.f2876k.progressDismiss();
        this.f2870e.setText("");
        this.f2869d.setText(this.f2876k.getString(R.string.z3, 60));
        m9370v();
    }

    /* JADX INFO: renamed from: F */
    public void m9374F(String str) {
        this.f2868c.setText(str);
    }

    /* JADX INFO: renamed from: G */
    public void m9375G() {
        this.f2870e.requestFocus();
        act().showInput(this.f2870e, 0);
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f2876k;
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9376k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m9376k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j960.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m9377l() {
        act().hideInput();
        e51.m9028K(act().getLocalClassName());
        act().progressDismiss();
        act().lambda$debugItems$19();
        lsi0.m9850x(R.string.x0, false);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(z860 z860Var) {
        this.f2875j = z860Var;
    }

    /* JADX INFO: renamed from: n */
    public void m9379n(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: p */
    public int m9380p() {
        return yij0.I(this.f2870e);
    }

    /* JADX INFO: renamed from: q */
    public void m9381q(Throwable th) {
        xdl0.y(this.f2869d, true);
        this.f2876k.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: r */
    public void m9382r() {
        this.f2866a.setTitle(R.string.p0);
        this.f2866a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.a960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1839a.m9371y(view);
            }
        });
        this.f2869d.setOnClickListener(new View.OnClickListener() { // from class: l.b960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1941a.m9372z(view);
            }
        });
        this.f2871f.I(false).subscribe(mkd0.m9874G(new e30() { // from class: l.c960
            public final void call(Object obj) {
                this.f2453a.m9359A((CharSequence) obj);
            }
        }));
        this.f2870e.I(false).subscribe(mkd0.m9874G(new e30() { // from class: l.d960
            public final void call(Object obj) {
                this.f2514a.m9360B((CharSequence) obj);
            }
        }));
        xdl0.y(this.f2874i, false);
        if (e51.m9019B(this.f2876k.getLocalClassName())) {
            this.f2875j.f5493c = true;
            m9370v();
        } else {
            xdl0.y(this.f2869d, true);
            xdl0.M0(this.f2867b, false);
        }
        this.f2874i.setOnClickListener(new View.OnClickListener() { // from class: l.e960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2616a.m9361C(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m9383s() {
        return this.f2871f.getText().toString().trim();
    }

    /* JADX INFO: renamed from: u */
    public final void m9384u() {
        xdl0.y(this.f2874i, this.f2875j.f5493c && this.f2871f.getError() == null && this.f2870e.getError() == null && !TextUtils.isEmpty(this.f2871f.getText()) && this.f2871f.getText().length() >= CoreModule.H().N9() && !TextUtils.isEmpty(this.f2870e.getText()) && this.f2870e.getText().length() == 4);
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
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m9385w(Long l2) {
        this.f2869d.setText(this.f2876k.getString(R.string.z3, Long.valueOf(59 - l2.longValue())));
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
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9386x() {
        xdl0.y(this.f2869d, true);
        xdl0.M0(this.f2867b, false);
        this.f2869d.setTextColor(this.f2876k.getResources().getColor(c1c0.o));
        this.f2869d.setText(this.f2876k.getString(R.string.F3));
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
