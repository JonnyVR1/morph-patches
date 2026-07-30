package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.NameEditTextOpt;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.lsi0;
import l.t100;
import l.xdl0;
import p006l.djj0;
import p006l.toe;
import p006l.u0c0;
import p006l.v2c0;
import p006l.x320;
import v.VButton_FakeShadow;
import v.VEditText;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NameView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f398c;

    /* JADX INFO: renamed from: d */
    public NameEditTextOpt f399d;

    /* JADX INFO: renamed from: e */
    public VImage f400e;

    /* JADX INFO: renamed from: f */
    public VButton_FakeShadow f401f;

    /* JADX INFO: renamed from: g */
    public e30<String> f402g;

    /* JADX INFO: renamed from: h */
    public e30<String> f403h;

    public NameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m374r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m369X(String str, int i) {
        m373d0(str.length() > 0);
        this.f399d.setHintTextColor(getContext().getResources().getColor(u0c0.f22409p));
        m372c0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m370Y() {
        m372c0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m371Z(View view) {
        if (this.f399d.getText().length() == 0) {
            lsi0.B(getContext().getResources().getString(R$string.f110P3), false, true);
            return;
        }
        if (NullChecker.a(this.f403h)) {
            this.f403h.call(this.f399d.getText().toString());
        }
        this.f401f.setClickable(false);
        this.f399d.setFocusable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private void m372c0(int i) {
        if (NullChecker.a(this.f402g)) {
            if (i == 1) {
                this.f402g.call(getContext().getString(R$string.f291x));
                return;
            }
            if (i == 2) {
                this.f402g.call(getContext().getString(R$string.f286w));
                return;
            }
            e30<String> e30Var = this.f402g;
            if (i == 3) {
                e30Var.call(String.format(getContext().getString(R$string.f281v), 20));
            } else {
                e30Var.call("");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m373d0(boolean z) {
        VButton_FakeShadow vButton_FakeShadow = this.f401f;
        if (z) {
            vButton_FakeShadow.setBackgroundResource(v2c0.f23973K1);
        } else {
            vButton_FakeShadow.setBackgroundResource(v2c0.f24075t1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    private void m374r() {
        setOrientation(1);
        m375S(LayoutInflater.from(getContext()), this);
        m373d0(false);
        this.f399d.setNameWatcher(new NameEditTextOpt.InterfaceC0064b() { // from class: l.u320
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.NameEditTextOpt.InterfaceC0064b
            /* JADX INFO: renamed from: a */
            public final void mo538a(String str, int i) {
                this.f22446a.m369X(str, i);
            }
        });
        this.f399d.setFilters(new InputFilter[]{new toe(20, new toe.InterfaceC1317a() { // from class: l.v320
            @Override // p006l.toe.InterfaceC1317a
            /* JADX INFO: renamed from: a */
            public final void mo20531a() {
                this.f24107a.m370Y();
            }
        })});
        xdl0.E0(this.f401f, new View.OnClickListener() { // from class: l.w320
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24902a.m371Z(view);
            }
        });
        if (djj0.m14048f()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f399d.getLayoutParams();
            int i = t100.z;
            layoutParams.height = i;
            this.f399d.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f401f.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.topMargin = t100.j;
            this.f401f.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: S */
    public View m375S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x320.m27154b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public void m376T() {
        this.f401f.setClickable(true);
        this.f399d.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: V */
    public void m377V() {
        this.f399d.clearFocus();
        this.f399d.setCursorVisible(false);
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
    /* JADX INFO: renamed from: W */
    public void m378W(String str) {
        this.f399d.setText(str);
        VEditText vEditText = this.f399d;
        vEditText.setSelection(vEditText.getText().length());
        m373d0(this.f399d.getText().length() > 0);
    }

    /* JADX INFO: renamed from: a0 */
    public void m379a0(Act act) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        this.f399d.requestFocus();
        this.f399d.setCursorVisible(true);
        act.showInput(this.f399d, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public void m380b0(e30<String> e30Var, e30<String> e30Var2) {
        this.f402g = e30Var;
        this.f403h = e30Var2;
    }

    public String getLastName() {
        return this.f399d.getText().toString().trim();
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
    public void setEditViewPadding(boolean z) {
        VEditText vEditText = this.f399d;
        if (z) {
            vEditText.setPadding(xdl0.w(16.0f), 0, xdl0.w(64.0f), 0);
        } else {
            vEditText.setPadding(xdl0.w(16.0f), 0, xdl0.w(16.0f), 0);
        }
    }

    public NameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NameView(Context context) {
        this(context, null);
    }
}
