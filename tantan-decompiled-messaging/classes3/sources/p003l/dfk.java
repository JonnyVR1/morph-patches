package p003l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupNameEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.utils.NullChecker;
import l.j7c0;
import l.l6c0;
import l.s7m;
import l.xdl0;
import l.y4c0;
import p028v.VEditText;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dfk implements s7m<afk> {

    /* JADX INFO: renamed from: a */
    public VEditText f2948a;

    /* JADX INFO: renamed from: b */
    public VImage f2949b;

    /* JADX INFO: renamed from: c */
    public VText f2950c;

    /* JADX INFO: renamed from: d */
    public VText f2951d;

    /* JADX INFO: renamed from: e */
    public GroupNameEditAct f2952e;

    /* JADX INFO: renamed from: f */
    public afk f2953f;

    /* JADX INFO: renamed from: g */
    public VText f2954g;

    /* JADX INFO: renamed from: h */
    public String f2955h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f2956i;

    /* JADX INFO: renamed from: l.dfk$b */
    public static class C0222b {
        /* JADX INFO: renamed from: b */
        public static void m3553b(dfk dfkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            dfkVar.f2948a = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            dfkVar.f2949b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            dfkVar.f2950c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            dfkVar.f2951d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m3554c(dfk dfkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.q0, viewGroup, false);
            m3553b(dfkVar, viewInflate);
            return viewInflate;
        }
    }

    public dfk(GroupNameEditAct groupNameEditAct) {
        this.f2952e = groupNameEditAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m3542s() {
        String strTrim = this.f2948a.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f2955h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m3543v(View view) {
        this.f2948a.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m3544A3(String str) {
        this.f2955h = str;
        this.f2948a.setText(str);
        this.f2948a.addTextChangedListener(new C0221a());
        if (!TextUtils.isEmpty(CoreModule.c.g0.Z6())) {
            this.f2950c.setText(CoreModule.c.g0.Z6());
        }
        xdl0.E0(this.f2949b, new View.OnClickListener() { // from class: l.cfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2637a.m3543v(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3545C0() {
        return this.f2952e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3547n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m3547n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0222b.m3554c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m3546i1(afk afkVar) {
        this.f2953f = afkVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, v.VText] */
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
    /* JADX INFO: renamed from: q */
    public boolean m3549q(Menu menu) {
        this.f2952e.getMenuInflater().inflate(j7c0.b, menu);
        this.f2954g = (VText) menu.findItem(y4c0.j2).getActionView().findViewById(y4c0.i5);
        boolean zM8550c = wdk.m8550c(this.f2956i);
        ?? r0 = this.f2954g;
        if (zM8550c) {
            wdk.m8553f(new ofk.C0449b(r0, this.f2948a, this.f2949b), this.f2956i.inModeration.name);
            return true;
        }
        r0.setEnabled(m3542s());
        xdl0.E0(this.f2954g, new View.OnClickListener() { // from class: l.bfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2387a.m3550u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3550u(View view) {
        this.f2952e.hideInput(this.f2948a);
        this.f2953f.m2864q0(this.f2948a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: w */
    public void m3551w(ChatGroup chatGroup) {
        this.f2956i = chatGroup;
        if (wdk.m8550c(chatGroup)) {
            wdk.m8553f(new ofk.C0449b(this.f2954g, this.f2948a, this.f2949b), chatGroup.inModeration.name);
            return;
        }
        this.f2948a.setText(chatGroup.name);
        VEditText vEditText = this.f2948a;
        vEditText.setSelection(vEditText.getText().length());
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dfk$a */
    public class C0221a implements TextWatcher {
        public C0221a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            dfk.this.f2951d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (wdk.m8550c(dfk.this.f2956i)) {
                return;
            }
            xdl0.M(dfk.this.f2949b, !TextUtils.isEmpty(string));
            if (NullChecker.a(dfk.this.f2954g)) {
                dfk.this.f2954g.setEnabled(dfk.this.m3542s());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
