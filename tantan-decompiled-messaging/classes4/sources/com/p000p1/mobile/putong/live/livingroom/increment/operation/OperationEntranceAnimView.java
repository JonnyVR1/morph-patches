package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.bt0;
import l.dt0;
import l.fld0;
import l.ggv;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.bsm;
import p002l.ir50;
import p002l.kr50;
import p002l.ku50;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationEntranceAnimView extends BasePreOperationView<kr50> {

    /* JADX INFO: renamed from: f */
    public OperationEntranceAnimView f6868f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6869g;

    /* JADX INFO: renamed from: h */
    public Animator f6870h;

    /* JADX INFO: renamed from: i */
    public Animator f6871i;

    public OperationEntranceAnimView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    public void destroy() {
        super.destroy();
        dt0.A(this.f6870h);
        dt0.A(this.f6871i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8636u0(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: k0 */
    public void mo8596k0(xdl0.g gVar) {
        Property property = bt0.i;
        Interpolator interpolator = bt0.d;
        Animator animatorF = bt0.f(bt0.s(new Animator[]{bt0.l(this, property, 0L, 200L, interpolator, new float[]{1.0f, 1.1f}), bt0.z(new Animator[]{bt0.l(this, bt0.i, 0L, 113L, interpolator, new float[]{1.1f, 0.6f}), bt0.l(this, View.ALPHA, 0L, 113L, (Interpolator) null, new float[]{1.0f, 0.0f})})}), new Runnable() { // from class: l.hr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f12238a.mo8598m0();
            }
        });
        this.f6870h = animatorF;
        animatorF.setStartDelay(400L);
        this.f6870h.start();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: m0 */
    public void mo8598m0() {
        super.mo8598m0();
        ((kr50) this.f6834d).m16770L3(this.f6835e);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo8600o0(ku50 ku50Var) {
        super.mo8600o0(ku50Var);
        hxs.t("context_livingAct", this.f6869g, this.f6835e.animation.enter.imageUrl, t100.d(74.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8635t0(this);
    }

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
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: p0 */
    public void mo8601p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m8719c(48);
            this.f6868f.setX(-getWidth());
            this.f6868f.setY(getTargetPos().b + t100.d(30.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo8602q0(xdl0.g gVar) {
        ((ggv) ypv.l(fld0.c)).i = true;
        Animator animatorF = bt0.f(bt0.z(new Animator[]{bt0.l(this, View.TRANSLATION_X, 0L, 400L, bt0.b, new float[]{-getWidth(), t100.d(5.0f)}), bt0.l(this, View.ALPHA, 0L, 270L, new LinearInterpolator(), new float[]{0.0f, 1.0f})}), new Runnable() { // from class: l.gr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f11598a.m8637v0();
            }
        });
        this.f6871i = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8635t0(View view) {
        ir50.m15312a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m8636u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ir50.m15313b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8637v0() {
        mo8596k0(null);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public kr50 mo8599n0(bsm bsmVar) {
        return new kr50(bsmVar);
    }

    public OperationEntranceAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
