package com.p051p1.mobile.putong.live.livingroom.increment.operation;

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
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dum;
import p153l.gt0;
import p153l.hiv;
import p153l.htd0;
import p153l.it0;
import p153l.izs;
import p153l.oz50;
import p153l.q260;
import p153l.qa00;
import p153l.qz50;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class OperationEntranceAnimView extends BasePreOperationView<qz50> {

    /* JADX INFO: renamed from: f */
    public OperationEntranceAnimView f51674f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51675g;

    /* JADX INFO: renamed from: h */
    public Animator f51676h;

    /* JADX INFO: renamed from: i */
    public Animator f51677i;

    public OperationEntranceAnimView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView, p153l.iam
    public void destroy() {
        super.destroy();
        it0.m142007A(this.f51676h);
        it0.m142007A(this.f51677i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m76209u0(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: k0 */
    public void mo76171k0(bnl0.C16067g c16067g) {
        Property<View, Float> property = gt0.f106354i;
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132160f = gt0.m132160f(gt0.m132173s(gt0.m132166l(this, property, 0L, 200L, interpolator, 1.0f, 1.1f), gt0.m132180z(gt0.m132166l(this, gt0.f106354i, 0L, 113L, interpolator, 1.1f, 0.6f), gt0.m132166l(this, View.ALPHA, 0L, 113L, null, 1.0f, 0.0f))), new Runnable() { // from class: l.nz50
            @Override // java.lang.Runnable
            public final void run() {
                this.f144407a.mo76173m0();
            }
        });
        this.f51676h = animatorM132160f;
        animatorM132160f.setStartDelay(400L);
        this.f51676h.start();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: m0 */
    public void mo76173m0() {
        super.mo76173m0();
        ((qz50) this.f51640d).m178764L3(this.f51641e);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo76175o0(q260 q260Var) {
        super.mo76175o0(q260Var);
        izs.m142869t("context_livingAct", this.f51675g, this.f51641e.animation.enter.imageUrl, qa00.m175859d(74.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76208t0(this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: p0 */
    public void mo76176p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m76287c(48);
            this.f51674f.setX(-getWidth());
            this.f51674f.setY(getTargetPos().f77560b + qa00.m175859d(30.0f));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo76177q0(bnl0.C16067g c16067g) {
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = true;
        Animator animatorM132160f = gt0.m132160f(gt0.m132180z(gt0.m132166l(this, View.TRANSLATION_X, 0L, 400L, gt0.f106347b, -getWidth(), qa00.m175859d(5.0f)), gt0.m132166l(this, View.ALPHA, 0L, 270L, new LinearInterpolator(), 0.0f, 1.0f)), new Runnable() { // from class: l.mz50
            @Override // java.lang.Runnable
            public final void run() {
                this.f139479a.m76210v0();
            }
        });
        this.f51677i = animatorM132160f;
        animatorM132160f.start();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m76208t0(View view) {
        oz50.m169914a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m76209u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oz50.m169915b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m76210v0() {
        mo76171k0(null);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public qz50 mo76174n0(dum dumVar) {
        return new qz50(dumVar);
    }

    public OperationEntranceAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
