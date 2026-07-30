package com.p000p1.mobile.putong.account.p002ui.accountai.frag;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.NameEditTextOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.lsi0;
import l.xdl0;
import l.zvf0;
import p006l.c6c0;
import p006l.q4c0;
import p006l.toe;
import p006l.u0c0;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpNameFrag extends Frag {

    /* JADX INFO: renamed from: A */
    public e30<String> f357A;

    /* JADX INFO: renamed from: B */
    public e30<Boolean> f358B;

    /* JADX INFO: renamed from: C */
    public NameEditTextOpt f359C;

    /* JADX INFO: renamed from: D */
    public Group f360D;

    /* JADX INFO: renamed from: E */
    public VText f361E;

    /* JADX INFO: renamed from: F */
    public VImage f362F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f363G;

    /* JADX INFO: renamed from: H */
    public boolean f364H;

    /* JADX INFO: renamed from: I */
    public String f365I;

    /* JADX INFO: renamed from: z */
    public View f366z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public /* synthetic */ void m312H4() {
        m325M4(3);
    }

    /* JADX INFO: renamed from: I4 */
    public static SignUpNameFrag m313I4() {
        SignUpNameFrag signUpNameFrag = new SignUpNameFrag();
        signUpNameFrag.setArguments(new Bundle());
        return signUpNameFrag;
    }

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
    private void m314r() {
        this.f359C = (NameEditTextOpt) this.f366z.findViewById(q4c0.f19588V);
        this.f360D = this.f366z.findViewById(q4c0.f19582P);
        this.f361E = this.f366z.findViewById(q4c0.f19583Q);
        this.f362F = this.f366z.findViewById(q4c0.f19594a0);
        this.f359C.setNameWatcher(new NameEditTextOpt.InterfaceC0064b() { // from class: l.ndf0
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.NameEditTextOpt.InterfaceC0064b
            /* JADX INFO: renamed from: a */
            public final void mo538a(String str, int i) {
                this.f17615a.m321G4(str, i);
            }
        });
        this.f359C.setFilters(new InputFilter[]{new toe(20, new toe.InterfaceC1317a() { // from class: l.odf0
            @Override // p006l.toe.InterfaceC1317a
            /* JADX INFO: renamed from: a */
            public final void mo20531a() {
                this.f18166a.m312H4();
            }
        })});
        if (this.f363G != null) {
            m327O4();
        }
        if (TextUtils.isEmpty(this.f365I)) {
            return;
        }
        m328P4();
    }

    /* JADX INFO: renamed from: B4 */
    public void m316B4() {
        this.f359C.setFocusableInTouchMode(true);
    }

    /* JADX INFO: renamed from: C4 */
    public void m317C4() {
        if (this.f359C.getText().length() == 0) {
            lsi0.B(getContext().getResources().getString(R$string.f110P3), false, true);
            return;
        }
        if (NullChecker.a(this.f357A)) {
            this.f357A.call(this.f359C.getText().toString());
        }
        this.f359C.setFocusable(false);
    }

    /* JADX INFO: renamed from: D4 */
    public void m318D4() {
        this.f359C.clearFocus();
        this.f359C.setCursorVisible(false);
    }

    /* JADX INFO: renamed from: E4 */
    public String m319E4() {
        if (NullChecker.a(this.f359C)) {
            return this.f359C.getText().toString().trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public void m320F4(String str) {
        this.f365I = str;
        m328P4();
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
    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m321G4(String str, int i) {
        if (NullChecker.a(this.f358B)) {
            this.f358B.call(Boolean.valueOf(!TextUtils.isEmpty(str)));
        }
        this.f359C.setHintTextColor(getContext().getResources().getColor(u0c0.f22409p));
        m325M4(i);
    }

    /* JADX INFO: renamed from: J4 */
    public void m322J4(Act act) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        this.f359C.requestFocus();
        this.f359C.setCursorVisible(true);
        act.showInput(this.f359C, 0);
    }

    /* JADX INFO: renamed from: K4 */
    public void m323K4(boolean z, View.OnClickListener onClickListener) {
        this.f363G = onClickListener;
        this.f364H = z;
        if (this.f362F != null) {
            m327O4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m324L4(e30<String> e30Var, e30<Boolean> e30Var2) {
        this.f357A = e30Var;
        this.f358B = e30Var2;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m325M4(int i) {
        if (i == 1) {
            m326N4("仅支持中英文和空格");
            return;
        }
        if (i == 2) {
            m326N4("不允许仅输入空格");
        } else if (i == 3) {
            m326N4("最多支持20个字符");
        } else {
            m326N4("");
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m326N4(String str) {
        if (TextUtils.isEmpty(str)) {
            zvf0.v("e_ai_signup_name", "p_ai_signup", new j760[0]);
        } else {
            this.f361E.setText(str);
        }
        xdl0.M(this.f360D, !TextUtils.isEmpty(str));
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
    /* JADX INFO: renamed from: O4 */
    public final void m327O4() {
        VImage vImage = this.f362F;
        if (vImage != null) {
            xdl0.M(vImage, this.f364H);
            xdl0.E0(this.f362F, this.f363G);
        }
        VEditText vEditText = this.f359C;
        if (vEditText != null) {
            vEditText.setPadding(xdl0.w(20.0f), 0, this.f364H ? xdl0.w(52.0f) : xdl0.w(20.0f), 0);
        }
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
    /* JADX INFO: renamed from: P4 */
    public final void m328P4() {
        VEditText vEditText = this.f359C;
        if (vEditText != null) {
            vEditText.setText(this.f365I);
            VEditText vEditText2 = this.f359C;
            vEditText2.setSelection(vEditText2.getText().length());
        }
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f366z == null) {
            this.f366z = layoutInflater.inflate(c6c0.f9414X, viewGroup, false);
        }
        m314r();
        return this.f366z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
