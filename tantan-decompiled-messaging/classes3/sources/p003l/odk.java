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
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupDescriptionEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.utils.NullChecker;
import l.j7c0;
import l.l6c0;
import l.s7m;
import l.xdl0;
import l.y4c0;
import org.eclipse.jetty.http.HttpStatus;
import p028v.VEditText;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class odk implements s7m<mdk> {

    /* JADX INFO: renamed from: a */
    public VEditText f6099a;

    /* JADX INFO: renamed from: b */
    public VText f6100b;

    /* JADX INFO: renamed from: c */
    public VText f6101c;

    /* JADX INFO: renamed from: d */
    public GroupDescriptionEditAct f6102d;

    /* JADX INFO: renamed from: e */
    public mdk f6103e;

    /* JADX INFO: renamed from: f */
    public VText f6104f;

    /* JADX INFO: renamed from: g */
    public String f6105g;

    /* JADX INFO: renamed from: h */
    public ChatGroup f6106h;

    /* JADX INFO: renamed from: l.odk$b */
    public static class C0447b {
        /* JADX INFO: renamed from: b */
        public static void m6619b(odk odkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            odkVar.f6099a = (VEditText) viewGroup.getChildAt(0);
            odkVar.f6100b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            odkVar.f6101c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m6620c(odk odkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.l0, viewGroup, false);
            m6619b(odkVar, viewInflate);
            return viewInflate;
        }
    }

    public odk(GroupDescriptionEditAct groupDescriptionEditAct) {
        this.f6102d = groupDescriptionEditAct;
    }

    /* JADX INFO: renamed from: A3 */
    public void m6609A3(String str) {
        this.f6105g = str;
        this.f6099a.setText(str);
        this.f6099a.addTextChangedListener(new C0446a());
        if (TextUtils.isEmpty(CoreModule.c.g0.Q6())) {
            return;
        }
        this.f6100b.setText(CoreModule.c.g0.Q6());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6610C0() {
        return this.f6102d;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6612k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m6612k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0447b.m6620c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m6611i1(mdk mdkVar) {
        this.f6103e = mdkVar;
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
    /* JADX INFO: renamed from: m */
    public boolean m6614m(Menu menu) {
        this.f6102d.getMenuInflater().inflate(j7c0.b, menu);
        this.f6104f = (VText) menu.findItem(y4c0.j2).getActionView().findViewById(y4c0.i5);
        boolean zM8549b = wdk.m8549b(this.f6106h);
        ?? r0 = this.f6104f;
        if (zM8549b) {
            wdk.m8553f(new ofk.C0449b(r0, this.f6099a, null), this.f6106h.inModeration.description);
            return true;
        }
        r0.setEnabled(m6615n());
        xdl0.E0(this.f6104f, new View.OnClickListener() { // from class: l.ndk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5878a.m6616p(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6615n() {
        String strTrim = this.f6099a.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return false;
        }
        return !TextUtils.equals(strTrim, this.f6105g);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6616p(View view) {
        this.f6102d.hideInput(this.f6099a);
        this.f6103e.m6346q0(this.f6099a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: q */
    public void m6617q(ChatGroup chatGroup) {
        this.f6106h = chatGroup;
        if (wdk.m8549b(chatGroup)) {
            wdk.m8553f(new ofk.C0449b(this.f6104f, this.f6099a, null), chatGroup.inModeration.description);
            return;
        }
        this.f6099a.setText(chatGroup.description);
        VEditText vEditText = this.f6099a;
        vEditText.setSelection(vEditText.getText().length());
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.odk$a */
    public class C0446a implements TextWatcher {
        public C0446a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            odk.this.f6101c.setText(String.format("%1$s/%2$s", Integer.valueOf(editable.toString().length()), Integer.valueOf(HttpStatus.MULTIPLE_CHOICES_300)));
            if (!wdk.m8549b(odk.this.f6106h) && NullChecker.a(odk.this.f6104f)) {
                odk.this.f6104f.setEnabled(odk.this.m6615n());
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
