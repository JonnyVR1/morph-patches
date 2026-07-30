package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.xdl0;
import p003l.nbk;
import p003l.tbk;
import p028v.VCheckBox;
import p028v.VDraweeView;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupRemoveMemberItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f1682a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f1683b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1684c;

    /* JADX INFO: renamed from: d */
    public VText f1685d;

    /* JADX INFO: renamed from: e */
    public VText f1686e;

    /* JADX INFO: renamed from: f */
    public nbk f1687f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0109b f1688g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$a */
    public static class C0108a {
        /* JADX INFO: renamed from: b */
        public static void m2234b(GroupRemoveMemberItemView groupRemoveMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupRemoveMemberItemView.f1682a = (VLinear) viewGroup.getChildAt(0);
            groupRemoveMemberItemView.f1683b = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupRemoveMemberItemView.f1684c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            groupRemoveMemberItemView.f1685d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            groupRemoveMemberItemView.f1686e = (VText) viewGroup.getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupRemoveMemberItemView$b */
    public interface InterfaceC0109b {
        /* JADX INFO: renamed from: d */
        void mo2235d(nbk nbkVar, boolean z);
    }

    public GroupRemoveMemberItemView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m2230g(View view) {
        C0108a.m2234b(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2231h(CompoundButton compoundButton, boolean z) {
        if (NullChecker.a(this.f1688g)) {
            this.f1688g.mo2235d(this.f1687f, z);
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
    /* JADX INFO: renamed from: i */
    public void m2232i(nbk nbkVar, int i, boolean z) {
        this.f1687f = nbkVar;
        xdl0.M(this.f1682a, false);
        xdl0.M(this.f1686e, false);
        if (i != 0) {
            if (i == 1) {
                xdl0.M(this.f1686e, true);
                this.f1686e.setText(nbkVar.f5863f);
                return;
            }
            return;
        }
        xdl0.M(this.f1682a, true);
        this.f1683b.setChecked(z);
        if (nbkVar.f5861d) {
            qib0.G.Z0(this.f1684c, tbk.m7716j(nbkVar.f5865h));
        } else {
            qib0.G.Z0(this.f1684c, nbkVar.f5860c);
        }
        this.f1685d.setText(nbkVar.f5859b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2230g(this);
        this.f1683b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ehk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f3275a.m2231h(compoundButton, z);
            }
        });
    }

    public void setOnGroupMemberRemoveChangeListener(InterfaceC0109b interfaceC0109b) {
        this.f1688g = interfaceC0109b;
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupRemoveMemberItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
