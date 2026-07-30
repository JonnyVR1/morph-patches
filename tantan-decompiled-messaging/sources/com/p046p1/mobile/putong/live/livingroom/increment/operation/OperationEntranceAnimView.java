package com.p046p1.mobile.putong.live.livingroom.increment.operation;

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
import p147v.VDraweeView;
import p149l.bsm;
import p149l.bt0;
import p149l.dt0;
import p149l.fld0;
import p149l.ggv;
import p149l.hxs;
import p149l.ir50;
import p149l.kr50;
import p149l.ku50;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class OperationEntranceAnimView extends BasePreOperationView<kr50> {

    /* JADX INFO: renamed from: f */
    public OperationEntranceAnimView f50826f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50827g;

    /* JADX INFO: renamed from: h */
    public Animator f50828h;

    /* JADX INFO: renamed from: i */
    public Animator f50829i;

    public OperationEntranceAnimView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView, p149l.s7m
    public void destroy() {
        super.destroy();
        dt0.m113501A(this.f50828h);
        dt0.m113501A(this.f50829i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m75026u0(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: k0 */
    public void mo74988k0(xdl0.C21104g c21104g) {
        Property<View, Float> property = bt0.f77162i;
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103733f = bt0.m103733f(bt0.m103746s(bt0.m103739l(this, property, 0L, 200L, interpolator, 1.0f, 1.1f), bt0.m103753z(bt0.m103739l(this, bt0.f77162i, 0L, 113L, interpolator, 1.1f, 0.6f), bt0.m103739l(this, View.ALPHA, 0L, 113L, null, 1.0f, 0.0f))), new Runnable() { // from class: l.hr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f109183a.mo74990m0();
            }
        });
        this.f50828h = animatorM103733f;
        animatorM103733f.setStartDelay(400L);
        this.f50828h.start();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: m0 */
    public void mo74990m0() {
        super.mo74990m0();
        ((kr50) this.f50792d).m146968L3(this.f50793e);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo74992o0(ku50 ku50Var) {
        super.mo74992o0(ku50Var);
        hxs.m133407t("context_livingAct", this.f50827g, this.f50793e.animation.enter.imageUrl, t100.m186890d(74.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75025t0(this);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: p0 */
    public void mo74993p0() {
        if (getParent() instanceof PreOperationAnimView) {
            ((PreOperationAnimView) getParent()).m75104c(48);
            this.f50826f.setX(-getWidth());
            this.f50826f.setY(getTargetPos().f192419b + t100.m186890d(30.0f));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo74994q0(xdl0.C21104g c21104g) {
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = true;
        Animator animatorM103733f = bt0.m103733f(bt0.m103753z(bt0.m103739l(this, View.TRANSLATION_X, 0L, 400L, bt0.f77155b, -getWidth(), t100.m186890d(5.0f)), bt0.m103739l(this, View.ALPHA, 0L, 270L, new LinearInterpolator(), 0.0f, 1.0f)), new Runnable() { // from class: l.gr50
            @Override // java.lang.Runnable
            public final void run() {
                this.f104030a.m75027v0();
            }
        });
        this.f50829i = animatorM103733f;
        animatorM103733f.start();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75025t0(View view) {
        ir50.m137821a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m75026u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ir50.m137822b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m75027v0() {
        mo74988k0(null);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public kr50 mo74991n0(bsm bsmVar) {
        return new kr50(bsmVar);
    }

    public OperationEntranceAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
