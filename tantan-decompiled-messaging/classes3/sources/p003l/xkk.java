package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.l6c0;
import l.s7m;
import l.xdl0;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xkk implements s7m<tkk> {

    /* JADX INFO: renamed from: a */
    public VLinear f8793a;

    /* JADX INFO: renamed from: b */
    public VFrame f8794b;

    /* JADX INFO: renamed from: c */
    public VFrame f8795c;

    /* JADX INFO: renamed from: d */
    public VText f8796d;

    /* JADX INFO: renamed from: e */
    public VFrame f8797e;

    /* JADX INFO: renamed from: f */
    public Act f8798f;

    /* JADX INFO: renamed from: g */
    public tkk f8799g;

    /* JADX INFO: renamed from: l.xkk$a */
    public static class C0640a {
        /* JADX INFO: renamed from: b */
        public static void m8726b(xkk xkkVar, View view) {
            xkkVar.f8793a = (VLinear) view;
            ViewGroup viewGroup = (ViewGroup) view;
            xkkVar.f8794b = (VFrame) viewGroup.getChildAt(0);
            xkkVar.f8795c = (VFrame) viewGroup.getChildAt(1);
            xkkVar.f8796d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            xkkVar.f8797e = (VFrame) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m8727c(xkk xkkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.z0, viewGroup, false);
            m8726b(xkkVar, viewInflate);
            return viewInflate;
        }
    }

    public xkk(Act act) {
        this.f8798f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m8717n(View view) {
        this.f8799g.m7818r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m8718q(View view) {
        this.f8799g.m7812l0();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8719C0() {
        return this.f8798f;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8721k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m8721k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0640a.m8727c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m8720i1(tkk tkkVar) {
        this.f8799g = tkkVar;
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
    /* JADX INFO: renamed from: m */
    public void m8723m(final ChatGroup chatGroup) {
        xdl0.E0(this.f8794b, new View.OnClickListener() { // from class: l.ukk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8005a.m8717n(view);
            }
        });
        xdl0.E0(this.f8795c, new View.OnClickListener() { // from class: l.vkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8344a.m8724p(chatGroup, view);
            }
        });
        xdl0.E0(this.f8797e, new View.OnClickListener() { // from class: l.wkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8574a.m8718q(view);
            }
        });
        xdl0.M(this.f8797e, false);
        if (TEnum.equals(chatGroup.joinCondition, "noApplyRequired")) {
            this.f8796d.setText(R.string.y0);
        } else if (TEnum.equals(chatGroup.joinCondition, "applyRequired")) {
            this.f8796d.setText(R.string.z0);
        }
        xdl0.M(this.f8795c, chatGroup.permissions.canChangeJoinCondition);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8724p(ChatGroup chatGroup, View view) {
        this.f8799g.m7813m0(chatGroup);
    }

    public void destroy() {
    }
}
