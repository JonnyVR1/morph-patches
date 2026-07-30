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
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupNicknameSetAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.tantanapp.common.utils.NullChecker;
import l.j7c0;
import l.l6c0;
import l.qib0;
import l.s7m;
import l.xdl0;
import l.y4c0;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ofk implements s7m<lfk> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6113a;

    /* JADX INFO: renamed from: b */
    public VEditText f6114b;

    /* JADX INFO: renamed from: c */
    public VImage f6115c;

    /* JADX INFO: renamed from: d */
    public VText f6116d;

    /* JADX INFO: renamed from: e */
    public GroupNicknameSetAct f6117e;

    /* JADX INFO: renamed from: f */
    public lfk f6118f;

    /* JADX INFO: renamed from: g */
    public VText f6119g;

    /* JADX INFO: renamed from: h */
    public String f6120h;

    /* JADX INFO: renamed from: i */
    public ChatGroupMember f6121i;

    /* JADX INFO: renamed from: l.ofk$b */
    public static class C0449b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public VText f6123a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public VEditText f6124b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public VImage f6125c;

        public C0449b(VText vText, VEditText vEditText, VImage vImage) {
            this.f6123a = vText;
            this.f6124b = vEditText;
            this.f6125c = vImage;
        }
    }

    /* JADX INFO: renamed from: l.ofk$c */
    public static class C0450c {
        /* JADX INFO: renamed from: b */
        public static void m6643b(ofk ofkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            ofkVar.f6113a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            ofkVar.f6114b = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            ofkVar.f6115c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            ofkVar.f6116d = (VText) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m6644c(ofk ofkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.r0, viewGroup, false);
            m6643b(ofkVar, viewInflate);
            return viewInflate;
        }
    }

    public ofk(GroupNicknameSetAct groupNicknameSetAct) {
        this.f6117e = groupNicknameSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m6632s() {
        String strTrim = this.f6114b.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f6120h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m6633u(View view) {
        this.f6117e.hideInput(this.f6114b);
        this.f6118f.m6018q0(this.f6114b.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m6634v(View view) {
        this.f6114b.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m6635A3(String str) {
        this.f6120h = str;
        this.f6114b.setText(str);
        this.f6114b.addTextChangedListener(new C0448a());
        xdl0.E0(this.f6115c, new View.OnClickListener() { // from class: l.nfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5892a.m6634v(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6636C0() {
        return this.f6117e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6638n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m6638n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0450c.m6644c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m6637i1(lfk lfkVar) {
        this.f6118f = lfkVar;
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
    public boolean m6640q(Menu menu) {
        this.f6117e.getMenuInflater().inflate(j7c0.b, menu);
        this.f6119g = (VText) menu.findItem(y4c0.j2).getActionView().findViewById(y4c0.i5);
        boolean zM8552e = wdk.m8552e(this.f6121i);
        ?? r0 = this.f6119g;
        if (zM8552e) {
            wdk.m8553f(new C0449b(r0, this.f6114b, this.f6115c), this.f6121i.inModeration.nickName);
            return true;
        }
        r0.setEnabled(m6632s());
        xdl0.E0(this.f6119g, new View.OnClickListener() { // from class: l.mfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5624a.m6633u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m6641w(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        this.f6121i = chatGroupMember;
        if (tbk.m7725s(chatGroup)) {
            qib0.G.Z0(this.f6113a, tbk.m7716j(chatGroupMember));
        } else {
            qib0.G.Z0(this.f6113a, chatGroupMember.avatar);
        }
        if (wdk.m8552e(chatGroupMember)) {
            wdk.m8553f(new C0449b(this.f6119g, this.f6114b, this.f6115c), chatGroupMember.inModeration.nickName);
            return;
        }
        this.f6114b.setText(chatGroupMember.groupMemberName());
        VEditText vEditText = this.f6114b;
        vEditText.setSelection(vEditText.getText().length());
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ofk$a */
    public class C0448a implements TextWatcher {
        public C0448a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            ofk.this.f6116d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (wdk.m8552e(ofk.this.f6121i)) {
                return;
            }
            xdl0.M(ofk.this.f6115c, !TextUtils.isEmpty(string));
            if (NullChecker.a(ofk.this.f6119g)) {
                ofk.this.f6119g.setEnabled(ofk.this.m6632s());
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
