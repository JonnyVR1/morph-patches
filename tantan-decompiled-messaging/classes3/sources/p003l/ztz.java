package p003l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageNicknameSettingAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.message.R;
import l.a1c0;
import l.auz;
import l.j7c0;
import l.lsi0;
import l.qib0;
import l.s7m;
import l.xtz;
import l.y4c0;
import l.zvf0;
import p028v.VMaterialEdit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ztz implements s7m<xtz> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f9429a;

    /* JADX INFO: renamed from: b */
    public xtz f9430b;

    /* JADX INFO: renamed from: c */
    public MessageNicknameSettingAct f9431c;

    public ztz(MessageNicknameSettingAct messageNicknameSettingAct) {
        this.f9431c = messageNicknameSettingAct;
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
    /* JADX INFO: renamed from: A3 */
    public void m9472A3(String str) {
        this.f9429a.setFloatingLabel(0);
        this.f9429a.setPrimaryColor(this.f9431c.getResources().getColor(a1c0.k));
        this.f9429a.setFloatingLabelAlwaysShown(false);
        this.f9429a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        this.f9429a.requestFocus();
        this.f9429a.setText(str);
        this.f9429a.setSelection(Math.min(str.length(), 15));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9473C0() {
        return this.f9431c;
    }

    /* JADX INFO: renamed from: a */
    public View m9474a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return auz.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f9431c;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m9478i1(xtz xtzVar) {
        this.f9430b = xtzVar;
    }

    /* JADX INFO: renamed from: c */
    public boolean m9476c(Menu menu) {
        this.f9431c.getMenuInflater().inflate(j7c0.c, menu);
        View actionView = menu.findItem(y4c0.x0).getActionView();
        actionView.setClickable(true);
        actionView.setOnClickListener(new View.OnClickListener() { // from class: l.ytz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9144a.m9477d(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m9477d(View view) {
        zvf0.r("e_save_nickname", "p_set_nickname");
        String string = this.f9429a.getEditableText().toString();
        if (qib0.Z.K(string) || (!TextUtils.isEmpty(string) && TextUtils.isEmpty(string.trim()))) {
            lsi0.w(R.string.U5);
        } else if (!Network.isConnected(view.getContext())) {
            lsi0.h(R.string.B2);
        } else {
            this.f9430b.k0(string.trim());
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9474a(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
