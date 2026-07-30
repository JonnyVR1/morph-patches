package com.p051p1.mobile.putong.live.livingroom.voice.intl.close;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;
import p151v.VImage;
import p153l.bae0;
import p153l.bnl0;
import p153l.c4p0;
import p153l.cmp0;
import p153l.han0;
import p153l.iam;
import p153l.jkp0;
import p153l.nan0;
import p153l.obc0;
import p153l.qag0;
import p153l.rwn0;
import p153l.wft;
import p153l.y6s;
import p153l.yec0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCloseView extends ConstraintLayout implements iam<han0> {

    /* JADX INFO: renamed from: d */
    public VoiceCloseView f53950d;

    /* JADX INFO: renamed from: e */
    public VImage f53951e;

    /* JADX INFO: renamed from: f */
    public VImage f53952f;

    /* JADX INFO: renamed from: g */
    public VImage f53953g;

    /* JADX INFO: renamed from: h */
    public han0 f53954h;

    /* JADX INFO: renamed from: i */
    public c4p0 f53955i;

    public VoiceCloseView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m79290q0(View view) {
        m79294v0();
    }

    /* JADX INFO: renamed from: r */
    private void m79291r() {
        bnl0.m105509E0(this.f53951e, new View.OnClickListener() { // from class: l.ian0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113609a.m79290q0(view);
            }
        });
        bnl0.m105509E0(this.f53952f, new View.OnClickListener() { // from class: l.jan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119001a.m79292r0(view);
            }
        });
        bnl0.m105509E0(this.f53953g, new View.OnClickListener() { // from class: l.kan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124702a.m79293s0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m79292r0(View view) {
        this.f53954h.m134183T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m79293s0(View view) {
        this.f53954h.m134186W3();
    }

    /* JADX INFO: renamed from: v0 */
    private void m79294v0() {
        List<BLiveCommonViewConfig> listM203564Y5 = zrv.m221193k().m203564Y5();
        if (this.f53954h.m213815L2()) {
            this.f53954h.m134184U3();
            return;
        }
        if (this.f53955i == null) {
            this.f53955i = new c4p0(this.f53954h, yec0.f198810Ja, qag0.m175927h());
        }
        this.f53955i.m107953r(new z20() { // from class: l.lan0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f130719a.m79300u0((BLiveCommonViewConfig) obj, ((Integer) obj2).intValue());
            }
        });
        this.f53955i.m107955t(listM203564Y5);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79295m0(View view) {
        nan0.m162097a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(han0 han0Var) {
        this.f53954h = han0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final void m79297o0() {
        if (!wft.m206159b(3)) {
            bnl0.m105524M(this.f53952f, false);
        } else {
            bnl0.m105524M(this.f53952f, cmp0.m111300g((rwn0) this.f53954h.m213810E2()));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79295m0(this);
        m79291r();
    }

    /* JADX INFO: renamed from: p0 */
    public void m79298p0() {
        c4p0 c4p0Var = this.f53955i;
        if (c4p0Var != null) {
            c4p0Var.m107947k();
        }
    }

    public void setCollapseView(String str) {
        bnl0.m105524M(this.f53951e, true);
        if (!y6s.m214494b(str)) {
            this.f53951e.setImageResource(obc0.f146252Y8);
            bnl0.m105525M0(this.f53953g, false);
        } else {
            m79297o0();
            this.f53951e.setImageResource(obc0.f146000Ca);
            bnl0.m105525M0(this.f53953g, true);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m79299t0(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.scheme) && bLiveCommonViewConfig.scheme.startsWith("tantanapp://")) {
            this.f53954h.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7006).m103154e(bLiveCommonViewConfig.scheme).m103152c());
        }
        String str = bLiveCommonViewConfig.type;
        str.getClass();
        switch (str) {
            case "report":
                this.f53954h.m134188Y3();
                break;
            case "feedback":
                this.f53954h.m134187X3();
                break;
            case "exit":
                this.f53954h.m134181R3();
                break;
            case "share":
                this.f53954h.m134185V3();
                break;
            case "stopRoom":
                this.f53954h.m134183T3();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m79300u0(final BLiveCommonViewConfig bLiveCommonViewConfig, int i) {
        han0 han0Var = this.f53954h;
        if (han0Var == null || bLiveCommonViewConfig == null) {
            m79298p0();
            return;
        }
        if (han0Var.m213810E2() != 0) {
            jkp0.m145890u((rwn0) this.f53954h.m213810E2(), bLiveCommonViewConfig.type, i);
        }
        this.f53955i.m107954s(new c4p0.InterfaceC16183a() { // from class: l.man0
            @Override // p153l.c4p0.InterfaceC16183a
            public final void onDismiss() {
                this.f135563a.m79299t0(bLiveCommonViewConfig);
            }
        });
        m79298p0();
    }

    public VoiceCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
