package com.p051p1.mobile.putong.live.livingroom.virtual.call.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.agp0;
import p153l.bnl0;
import p153l.gt0;
import p153l.h64;
import p153l.it0;
import p153l.jyb;
import p153l.nsv;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualNineDeputyWidgetView extends BaseVoiceVirtualDeputyWidgetView<VoiceVirtualNineDeputyItemView> {

    /* JADX INFO: renamed from: f */
    public VoiceVirtualNineDeputyWidgetView f53113f;

    /* JADX INFO: renamed from: g */
    public VoiceVirtualNineDeputyItemView f53114g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f53115h;

    /* JADX INFO: renamed from: i */
    public ImageView f53116i;

    /* JADX INFO: renamed from: j */
    public TextView f53117j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f53118k;

    /* JADX INFO: renamed from: l */
    public VoiceVirtualNineDeputyItemView f53119l;

    /* JADX INFO: renamed from: m */
    public VoiceVirtualNineDeputyItemView f53120m;

    /* JADX INFO: renamed from: n */
    public VoiceVirtualNineDeputyItemView f53121n;

    /* JADX INFO: renamed from: o */
    public VoiceVirtualNineDeputyItemView f53122o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f53123p;

    /* JADX INFO: renamed from: q */
    public VoiceVirtualNineDeputyItemView f53124q;

    /* JADX INFO: renamed from: r */
    public VoiceVirtualNineDeputyItemView f53125r;

    /* JADX INFO: renamed from: s */
    public VoiceVirtualNineDeputyItemView f53126s;

    /* JADX INFO: renamed from: t */
    public VoiceVirtualNineDeputyItemView f53127t;

    /* JADX INFO: renamed from: u */
    public Animator f53128u;

    public VoiceVirtualNineDeputyWidgetView(Context context) {
        super(context);
        this.f53128u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m78096u0(View view) {
        if (NullChecker.m82486a(getPresenter())) {
            getPresenter().m185382g4();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView, p153l.iam
    public void destroy() {
        super.destroy();
        it0.m142009C(this.f53128u);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView
    public List<VoiceVirtualNineDeputyItemView> getDeputyViewList() {
        return jyb.m147507f0(this.f53114g, this.f53119l, this.f53120m, this.f53121n, this.f53122o, this.f53124q, this.f53125r, this.f53126s, this.f53127t);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m78098s0(layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78097r0(this);
        m78071n0();
        bnl0.m105509E0(this.f53115h, new View.OnClickListener() { // from class: l.zfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204189a.m78096u0(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m78097r0(View view) {
        agp0.m97716a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public View m78098s0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return agp0.m97717b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t0 */
    public void m78099t0() {
        it0.m142009C(this.f53128u);
        setPivotX(bnl0.m105592y0() / 2);
        Animator animatorM132178x = gt0.m132178x(250L, gt0.m132168n(this, View.ALPHA, 0.0f, 1.0f));
        this.f53128u = animatorM132178x;
        animatorM132178x.setInterpolator(gt0.f106346a);
        this.f53128u.start();
    }

    /* JADX INFO: renamed from: v0 */
    public void m78100v0() {
        it0.m142009C(this.f53128u);
        setPivotX(bnl0.m105592y0() / 2);
        setPivotY(0.0f);
        Animator animatorM132178x = gt0.m132178x(250L, gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f));
        this.f53128u = animatorM132178x;
        animatorM132178x.setInterpolator(gt0.f106346a);
        this.f53128u.start();
    }

    /* JADX INFO: renamed from: w0 */
    public void m78101w0(boolean z) {
        bnl0.m105524M(this.f53115h, z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m78102y0(nsv<h64> nsvVar, BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < getDeputyViewList().size()) {
            getDeputyViewList().get(bLiveVoiceCall.position).m78094r(nsvVar, bLiveVoiceCall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public void m78103z0(nsv<h64> nsvVar) {
        rwn0 rwn0Var = (rwn0) this.f53093d.m213810E2();
        BLiveVoiceCall bLiveVoiceCallM136873l = rwn0Var.m183411P2().m136873l(nsvVar.f143542a.f107997a);
        if (bLiveVoiceCallM136873l == null) {
            return;
        }
        m78076t2(rwn0Var.m183411P2(), bLiveVoiceCallM136873l);
    }

    public VoiceVirtualNineDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53128u = null;
    }

    public VoiceVirtualNineDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53128u = null;
    }
}
