package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import p147v.VImage;
import p147v.VText;
import p149l.bsm;
import p149l.d30;
import p149l.s93;
import p149l.v93;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class BoostStartView extends BasePreOperationView<s93> {

    /* JADX INFO: renamed from: f */
    public BoostStartView f50795f;

    /* JADX INFO: renamed from: g */
    public VImage f50796g;

    /* JADX INFO: renamed from: h */
    public VImage f50797h;

    /* JADX INFO: renamed from: i */
    public VImage f50798i;

    /* JADX INFO: renamed from: j */
    public VImage f50799j;

    /* JADX INFO: renamed from: k */
    public VText f50800k;

    /* JADX INFO: renamed from: l */
    public VText f50801l;

    public BoostStartView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m74998B0(final xdl0.C21104g c21104g) {
        m75002w0(this.f50796g, new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f));
        m75002w0(this.f50797h, new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        ((s93) this.f50792d).m182692K3(5L, new d30() { // from class: l.u93
            @Override // p149l.d30
            public final void call() {
                this.f175188a.m75004z0(c21104g);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public s93 mo74991n0(bsm bsmVar) {
        return new s93(bsmVar, this);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView, p149l.s7m
    public void destroy() {
        super.destroy();
        this.f50796g.clearAnimation();
        this.f50797h.clearAnimation();
        xdl0.m208344M(this, false);
        clearAnimation();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m75001v0(layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75000u0(this);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo74994q0(final xdl0.C21104g c21104g) {
        super.mo74994q0(c21104g);
        ((s93) this.f50792d).m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(8100);
        ((s93) this.f50792d).m129320z3(480L, new Runnable() { // from class: l.t93
            @Override // java.lang.Runnable
            public final void run() {
                this.f168985a.m74998B0(c21104g);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75000u0(View view) {
        v93.m197525a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public View m75001v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v93.m197526b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m75002w0(VImage vImage, RotateAnimation rotateAnimation) {
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3500L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        vImage.setAnimation(rotateAnimation);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(s93 s93Var) {
        super.mo21065i1(s93Var);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m75004z0(xdl0.C21104g c21104g) {
        mo74988k0(c21104g);
    }

    public BoostStartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
