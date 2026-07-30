package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import l.d30;
import l.xdl0;
import p002l.bsm;
import p002l.s93;
import p002l.v93;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BoostStartView extends BasePreOperationView<s93> {

    /* JADX INFO: renamed from: f */
    public BoostStartView f6837f;

    /* JADX INFO: renamed from: g */
    public VImage f6838g;

    /* JADX INFO: renamed from: h */
    public VImage f6839h;

    /* JADX INFO: renamed from: i */
    public VImage f6840i;

    /* JADX INFO: renamed from: j */
    public VImage f6841j;

    /* JADX INFO: renamed from: k */
    public VText f6842k;

    /* JADX INFO: renamed from: l */
    public VText f6843l;

    public BoostStartView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8606B0(final xdl0.g gVar) {
        m8610w0(this.f6838g, new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f));
        m8610w0(this.f6839h, new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        ((s93) this.f6834d).m22256K3(5L, new d30() { // from class: l.u93
            public final void call() {
                this.f20547a.m8612z0(gVar);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public s93 mo8599n0(bsm bsmVar) {
        return new s93(bsmVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    public void destroy() {
        super.destroy();
        this.f6838g.clearAnimation();
        this.f6839h.clearAnimation();
        xdl0.M(this, false);
        clearAnimation();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8609v0(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8608u0(this);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo8602q0(final xdl0.g gVar) {
        super.mo8602q0(gVar);
        ((s93) this.f6834d).m25548F2().GiftDialogEventGroup.dismissGiftDialog().j(8100);
        ((s93) this.f6834d).m14207z3(480L, new Runnable() { // from class: l.t93
            @Override // java.lang.Runnable
            public final void run() {
                this.f20134a.m8606B0(gVar);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8608u0(View view) {
        v93.m23802a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public View m8609v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v93.m23803b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m8610w0(VImage vImage, RotateAnimation rotateAnimation) {
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3500L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        vImage.setAnimation(rotateAnimation);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void mo8594i1(s93 s93Var) {
        super.mo8594i1(s93Var);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8612z0(xdl0.g gVar) {
        mo8596k0(gVar);
    }

    public BoostStartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
