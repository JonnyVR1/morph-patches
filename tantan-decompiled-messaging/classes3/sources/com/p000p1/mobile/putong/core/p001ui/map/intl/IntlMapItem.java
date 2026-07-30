package com.p000p1.mobile.putong.core.p001ui.map.intl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.i0g0;
import l.muw;
import l.u4c0;
import l.w0c0;
import l.ytw;
import p003l.e30;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IntlMapItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f271c;

    /* JADX INFO: renamed from: d */
    public VText f272d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f273e;

    /* JADX INFO: renamed from: f */
    public VText f274f;

    /* JADX INFO: renamed from: g */
    public VText f275g;

    /* JADX INFO: renamed from: h */
    public VImage f276h;

    /* JADX INFO: renamed from: i */
    public VText f277i;

    /* JADX INFO: renamed from: j */
    public int f278j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.map.intl.IntlMapItem$a */
    public static class C0024a {
        /* JADX INFO: renamed from: b */
        public static void m433b(IntlMapItem intlMapItem, View view) {
            intlMapItem.f271c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
            intlMapItem.f272d = (VText) view.findViewById(u4c0.I8);
            ViewGroup viewGroup = (ViewGroup) view;
            intlMapItem.f273e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            intlMapItem.f274f = (VText) view.findViewById(u4c0.t2);
            intlMapItem.f275g = (VText) view.findViewById(u4c0.p2);
            intlMapItem.f276h = (VImage) view.findViewById(u4c0.f1);
            intlMapItem.f277i = (VText) viewGroup.getChildAt(2);
        }
    }

    public IntlMapItem(Context context) {
        super(context);
        this.f278j = -1;
    }

    /* JADX INFO: renamed from: Y */
    public final void m428Y(View view) {
        C0024a.m433b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public IntlMapBaseAct m429Z() {
        return (IntlMapBaseAct) getContext();
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
    /* JADX INFO: renamed from: a0 */
    public void m430a0(ytw ytwVar, int i, int i2, boolean z) {
        this.f272d.setText(ytwVar.f());
        if (i2 == -1) {
            this.f275g.setText(ytwVar.c());
            this.f272d.setTextColor(m429Z().getResources().getColor(w0c0.w1));
            this.f274f.setText("");
        } else {
            this.f272d.setTextColor(-11447983);
            this.f274f.setText(i >= 0 ? i0g0.p(i, false) : null);
            this.f275g.setText(ytwVar.c());
        }
        this.f276h.setVisibility(z ? 0 : 4);
        this.f278j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m431b0(final muw muwVar, final e30<muw> e30Var) {
        this.f272d.setText(muwVar.d());
        this.f275g.setText(muwVar.b());
        this.f273e.setVisibility(0);
        setOnClickListener(new View.OnClickListener() { // from class: l.aao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(muwVar);
            }
        });
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f278j);
        super.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m428Y(this);
    }

    public IntlMapItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278j = -1;
    }

    public IntlMapItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f278j = -1;
    }
}
