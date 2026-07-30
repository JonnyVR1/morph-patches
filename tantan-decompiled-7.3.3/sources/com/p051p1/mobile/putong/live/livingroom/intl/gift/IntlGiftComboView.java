package com.p051p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p151v.VText;
import p153l.bmn;
import p153l.bnl0;
import p153l.e060;
import p153l.iam;
import p153l.ib0;
import p153l.jjs;
import p153l.nln;
import p153l.x20;

/* JADX INFO: loaded from: classes5.dex */
public class IntlGiftComboView extends ConstraintLayout implements iam<nln<?>> {

    /* JADX INFO: renamed from: d */
    public IntlLiveCountdownView f51852d;

    /* JADX INFO: renamed from: e */
    public GiftGearsLayerView f51853e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f51854f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f51855g;

    /* JADX INFO: renamed from: h */
    public IntlMultipleGiftItemView f51856h;

    /* JADX INFO: renamed from: i */
    public View f51857i;

    /* JADX INFO: renamed from: j */
    public VText f51858j;

    /* JADX INFO: renamed from: k */
    public ib0 f51859k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC12974a f51860l;

    /* JADX INFO: renamed from: m */
    public nln<?> f51861m;

    /* JADX INFO: renamed from: n */
    public C13044a f51862n;

    public IntlGiftComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m76478B0(View view) {
        m76503v0();
        this.f51861m.m163757Y3();
    }

    /* JADX INFO: renamed from: H0 */
    private void m76479H0() {
        this.f51852d.m76522r();
        this.f51853e.m75020e();
        this.f51862n.m76547k();
    }

    /* JADX INFO: renamed from: I0 */
    private void m76480I0(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z) {
        if (!jjsVar.m145121g().enableComboEffect) {
            m76503v0();
            return;
        }
        bnl0.m105524M(this, true);
        bnl0.m105525M0(this.f51852d, true);
        this.f51852d.m76524t(liveGiftItemView, jjsVar, z);
    }

    /* JADX INFO: renamed from: J0 */
    private void m76481J0(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC12974a interfaceC12974a) {
        if (z) {
            if (this.f51862n.m76544h() && liveGiftItemView.m74657E0()) {
                m76493u0();
                return;
            }
            return;
        }
        boolean zM145118d = jjsVar.m145118d();
        C13044a c13044a = this.f51862n;
        if (zM145118d) {
            c13044a.m76549m(liveGiftItemView, jjsVar, i, interfaceC12974a);
        } else if (c13044a.m76544h()) {
            m76493u0();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m76489r() {
        this.f51852d.m76512h(new x20() { // from class: l.uln
            @Override // p153l.x20
            public final void call() {
                this.f179524a.m76495z0();
            }
        });
        bnl0.m105509E0(this.f51852d.f51868f, new View.OnClickListener() { // from class: l.vln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184618a.m76478B0(view);
            }
        });
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m76490r0(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f51853e;
        if (z) {
            giftGearsLayerView.m75018c(new x20() { // from class: l.wln
                @Override // p153l.x20
                public final void call() {
                    this.f189713a.m76504w0();
                }
            });
        } else {
            bnl0.m105525M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m76491s0() {
        this.f51853e.m75019d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m76492t0() {
        this.f51862n.m76551o(8);
    }

    /* JADX INFO: renamed from: u0 */
    private void m76493u0() {
        this.f51862n.m76552p(new x20() { // from class: l.yln
            @Override // p153l.x20
            public final void call() {
                this.f200568a.m76492t0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m76494y0() {
        this.f51852d.m76525u();
        m76490r0(true);
        m76493u0();
        bnl0.m105524M(this, false);
        this.f51861m.m213811F2().IntlGiftComboEvent.newComboVisible().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m76495z0() {
        this.f51861m.m163756X3((int) this.f51859k.m139230c().m145120f(), new x20() { // from class: l.xln
            @Override // p153l.x20
            public final void call() {
                this.f195002a.m76494y0();
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m76496D0(ib0 ib0Var, View view) {
        this.f51861m.m213811F2().GiftDialogEventGroup.intlNewComboClick().mo199273j(ib0Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m76497E0(ib0 ib0Var, View view) {
        this.f51861m.m213811F2().GiftDialogEventGroup.intlNewComboClick().mo199273j(ib0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public void m76498G0(final ib0 ib0Var, LiveMultipleGiftView.InterfaceC12974a interfaceC12974a) {
        LiveGiftItemView liveGiftItemViewM139231d = ib0Var.m139231d();
        jjs jjsVarM139230c = ib0Var.m139230c();
        int iM139229b = ib0Var.m139229b();
        boolean zM139232e = ib0Var.m139232e();
        e060 e060VarM139228a = ib0Var.m139228a();
        m76502q0(false);
        this.f51859k = ib0Var;
        this.f51860l = interfaceC12974a;
        m76480I0(liveGiftItemViewM139231d, jjsVarM139230c, zM139232e);
        this.f51852d.f51866d.setOnClickListener(new View.OnClickListener() { // from class: l.zln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204982a.m76496D0(ib0Var, view);
            }
        });
        this.f51852d.f51871i.setOnClickListener(new View.OnClickListener() { // from class: l.amn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72237a.m76497E0(ib0Var, view);
            }
        });
        if (jjsVarM139230c.m145117c()) {
            m76492t0();
            this.f51853e.m75021f(liveGiftItemViewM139231d, jjsVarM139230c, e060VarM139228a.m118785a());
        } else {
            m76491s0();
            m76481J0(liveGiftItemViewM139231d, jjsVarM139230c, iM139229b, zM139232e, interfaceC12974a);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m76499K0(int i) {
        this.f51852d.f51869g.setText(String.valueOf(i));
    }

    @Override // p153l.iam
    public void destroy() {
        IntlLiveCountdownView intlLiveCountdownView = this.f51852d;
        if (intlLiveCountdownView != null) {
            intlLiveCountdownView.m76513i();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76500o0(View view) {
        bmn.m105212a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76500o0(this);
        m76489r();
        this.f51862n = new C13044a(this.f51854f, this.f51855g, this.f51856h);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nln<?> nlnVar) {
        this.f51861m = nlnVar;
    }

    /* JADX INFO: renamed from: q0 */
    public void m76502q0(boolean z) {
        bnl0.m105524M(this.f51852d.f51868f, !z);
        bnl0.m105524M(this.f51852d.f51869g, z);
    }

    public void setAvailableCoin(Long l2) {
        this.f51858j.setText(String.valueOf(l2));
    }

    /* JADX INFO: renamed from: v0 */
    public void m76503v0() {
        bnl0.m105524M(this, false);
        this.f51852d.m76523s();
        m76490r0(false);
        m76492t0();
        m76479H0();
        this.f51861m.m213811F2().IntlGiftComboEvent.newComboVisible().mo199273j(Boolean.FALSE);
        this.f51861m.m163755W3();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m76504w0() {
        bnl0.m105525M0(this.f51853e, false);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
