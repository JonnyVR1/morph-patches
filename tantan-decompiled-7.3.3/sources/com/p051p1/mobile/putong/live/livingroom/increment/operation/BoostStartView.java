package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dum;
import p153l.ha3;
import p153l.ka3;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class BoostStartView extends BasePreOperationView<ha3> {

    /* JADX INFO: renamed from: f */
    public BoostStartView f51643f;

    /* JADX INFO: renamed from: g */
    public VImage f51644g;

    /* JADX INFO: renamed from: h */
    public VImage f51645h;

    /* JADX INFO: renamed from: i */
    public VImage f51646i;

    /* JADX INFO: renamed from: j */
    public VImage f51647j;

    /* JADX INFO: renamed from: k */
    public VText f51648k;

    /* JADX INFO: renamed from: l */
    public VText f51649l;

    public BoostStartView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m76181B0(final bnl0.C16067g c16067g) {
        m76185w0(this.f51644g, new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f));
        m76185w0(this.f51645h, new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        ((ha3) this.f51640d).m134125K3(5L, new x20() { // from class: l.ja3
            @Override // p153l.x20
            public final void call() {
                this.f118935a.m76187z0(c16067g);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public ha3 mo76174n0(dum dumVar) {
        return new ha3(dumVar, this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView, p153l.iam
    public void destroy() {
        super.destroy();
        this.f51644g.clearAnimation();
        this.f51645h.clearAnimation();
        bnl0.m105524M(this, false);
        clearAnimation();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m76184v0(layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76183u0(this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo76177q0(final bnl0.C16067g c16067g) {
        super.mo76177q0(c16067g);
        ((ha3) this.f51640d).m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(8100);
        ((ha3) this.f51640d).m138879z3(480L, new Runnable() { // from class: l.ia3
            @Override // java.lang.Runnable
            public final void run() {
                this.f113543a.m76181B0(c16067g);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m76183u0(View view) {
        ka3.m148937a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public View m76184v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ka3.m148938b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m76185w0(VImage vImage, RotateAnimation rotateAnimation) {
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3500L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillAfter(true);
        vImage.setAnimation(rotateAnimation);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ha3 ha3Var) {
        super.mo22064i1(ha3Var);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m76187z0(bnl0.C16067g c16067g) {
        mo76171k0(c16067g);
    }

    public BoostStartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
