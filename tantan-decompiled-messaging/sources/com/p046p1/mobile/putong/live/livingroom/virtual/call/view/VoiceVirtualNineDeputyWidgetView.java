package com.p046p1.mobile.putong.live.livingroom.virtual.call.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.bt0;
import p149l.dt0;
import p149l.i54;
import p149l.mqv;
import p149l.nnn0;
import p149l.vwb;
import p149l.w6p0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualNineDeputyWidgetView extends BaseVoiceVirtualDeputyWidgetView<VoiceVirtualNineDeputyItemView> {

    /* JADX INFO: renamed from: f */
    public VoiceVirtualNineDeputyWidgetView f52265f;

    /* JADX INFO: renamed from: g */
    public VoiceVirtualNineDeputyItemView f52266g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f52267h;

    /* JADX INFO: renamed from: i */
    public ImageView f52268i;

    /* JADX INFO: renamed from: j */
    public TextView f52269j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f52270k;

    /* JADX INFO: renamed from: l */
    public VoiceVirtualNineDeputyItemView f52271l;

    /* JADX INFO: renamed from: m */
    public VoiceVirtualNineDeputyItemView f52272m;

    /* JADX INFO: renamed from: n */
    public VoiceVirtualNineDeputyItemView f52273n;

    /* JADX INFO: renamed from: o */
    public VoiceVirtualNineDeputyItemView f52274o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f52275p;

    /* JADX INFO: renamed from: q */
    public VoiceVirtualNineDeputyItemView f52276q;

    /* JADX INFO: renamed from: r */
    public VoiceVirtualNineDeputyItemView f52277r;

    /* JADX INFO: renamed from: s */
    public VoiceVirtualNineDeputyItemView f52278s;

    /* JADX INFO: renamed from: t */
    public VoiceVirtualNineDeputyItemView f52279t;

    /* JADX INFO: renamed from: u */
    public Animator f52280u;

    public VoiceVirtualNineDeputyWidgetView(Context context) {
        super(context);
        this.f52280u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m76913u0(View view) {
        if (NullChecker.m81303a(getPresenter())) {
            getPresenter().m162462g4();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView, p149l.s7m
    public void destroy() {
        super.destroy();
        dt0.m113503C(this.f52280u);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView
    public List<VoiceVirtualNineDeputyItemView> getDeputyViewList() {
        return vwb.m200324f0(this.f52266g, this.f52271l, this.f52272m, this.f52273n, this.f52274o, this.f52276q, this.f52277r, this.f52278s, this.f52279t);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m76915s0(layoutInflater, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76914r0(this);
        m76888n0();
        xdl0.m208329E0(this.f52267h, new View.OnClickListener() { // from class: l.v6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180223a.m76913u0(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76914r0(View view) {
        w6p0.m201956a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public View m76915s0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w6p0.m201957b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t0 */
    public void m76916t0() {
        dt0.m113503C(this.f52280u);
        setPivotX(xdl0.m208412y0() / 2);
        Animator animatorM103751x = bt0.m103751x(250L, bt0.m103741n(this, View.ALPHA, 0.0f, 1.0f));
        this.f52280u = animatorM103751x;
        animatorM103751x.setInterpolator(bt0.f77154a);
        this.f52280u.start();
    }

    /* JADX INFO: renamed from: v0 */
    public void m76917v0() {
        dt0.m113503C(this.f52280u);
        setPivotX(xdl0.m208412y0() / 2);
        setPivotY(0.0f);
        Animator animatorM103751x = bt0.m103751x(250L, bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f));
        this.f52280u = animatorM103751x;
        animatorM103751x.setInterpolator(bt0.f77154a);
        this.f52280u.start();
    }

    /* JADX INFO: renamed from: w0 */
    public void m76918w0(boolean z) {
        xdl0.m208344M(this.f52267h, z);
    }

    /* JADX INFO: renamed from: y0 */
    public void m76919y0(mqv<i54> mqvVar, BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < getDeputyViewList().size()) {
            getDeputyViewList().get(bLiveVoiceCall.position).m76911r(mqvVar, bLiveVoiceCall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public void m76920z0(mqv<i54> mqvVar) {
        nnn0 nnn0Var = (nnn0) this.f52245d.m206027E2();
        BLiveVoiceCall bLiveVoiceCallM102063l = nnn0Var.m160249P2().m102063l(mqvVar.f135304a.f111520a);
        if (bLiveVoiceCallM102063l == null) {
            return;
        }
        m76893t2(nnn0Var.m160249P2(), bLiveVoiceCallM102063l);
    }

    public VoiceVirtualNineDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52280u = null;
    }

    public VoiceVirtualNineDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52280u = null;
    }
}
