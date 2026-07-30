package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import l.e51;
import l.xdl0;
import l.ypv;
import p002l.mpw;
import p002l.ors;
import p002l.zqs;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeActiveButton extends VLinear {

    /* JADX INFO: renamed from: c */
    public LiveGuardPrivilegeActiveButton f6523c;

    /* JADX INFO: renamed from: d */
    public VLinear f6524d;

    /* JADX INFO: renamed from: e */
    public TextView f6525e;

    /* JADX INFO: renamed from: f */
    public LiveTextRollView f6526f;

    /* JADX INFO: renamed from: g */
    public Runnable f6527g;

    /* JADX INFO: renamed from: h */
    public Runnable f6528h;

    /* JADX INFO: renamed from: i */
    public HorizontalMarqueeView f6529i;

    /* JADX INFO: renamed from: j */
    public final int f6530j;

    /* JADX INFO: renamed from: k */
    public final int f6531k;

    public LiveGuardPrivilegeActiveButton(Context context) {
        super(context);
        this.f6530j = 2000;
        this.f6531k = 400;
    }

    /* JADX INFO: renamed from: T */
    public final void m8270T(View view) {
        ors.m19696a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m8271V() {
        e51.H(getContext(), this.f6527g, 2000L);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m8272W(mpw.C0681a c0681a) {
        this.f6526f.setNextAnim(400L);
        this.f6526f.G(c0681a.f15550s, new Runnable() { // from class: l.nrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f16172a.m8271V();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m8273X() {
        this.f6526f.H(400);
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
    /* JADX INFO: renamed from: Y */
    public void m8274Y(final zqs zqsVar, final mpw.C0681a c0681a) {
        xdl0.E0(this.f6523c, new View.OnClickListener() { // from class: l.krs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqs zqsVar2 = zqsVar;
                mpw.C0681a c0681a2 = c0681a;
                zqsVar2.m27515I(c0681a2.f15532a, c0681a2.f15552u);
            }
        });
        this.f6523c.setBackgroundResource(c0681a.f15540i);
        this.f6524d.setBackgroundResource(c0681a.f15539h);
        this.f6525e.setText(c0681a.f15551t);
    }

    /* JADX INFO: renamed from: Z */
    public void m8275Z(String str, mpw.C0681a c0681a) {
        if (this.f6529i == null) {
            this.f6529i = (HorizontalMarqueeView) this.f6526f.getCurrentView();
            this.f6526f.E(17, true);
            m8277b0(c0681a);
        }
        this.f6529i.setMarqueeText(str);
    }

    /* JADX INFO: renamed from: a0 */
    public void m8276a0() {
        e51.J(this.f6528h);
        e51.J(this.f6527g);
        this.f6526f.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m8277b0(final mpw.C0681a c0681a) {
        if (TextUtils.isEmpty(c0681a.f15550s) || !ypv.k().nb()) {
            return;
        }
        this.f6526f.C(c0681a.f15550s, false);
        this.f6528h = new Runnable() { // from class: l.lrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f15010a.m8272W(c0681a);
            }
        };
        this.f6527g = new Runnable() { // from class: l.mrs
            @Override // java.lang.Runnable
            public final void run() {
                this.f15607a.m8273X();
            }
        };
        e51.H(getContext(), this.f6528h, 2000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8270T(this);
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6530j = 2000;
        this.f6531k = 400;
    }

    public LiveGuardPrivilegeActiveButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6530j = 2000;
        this.f6531k = 400;
    }
}
