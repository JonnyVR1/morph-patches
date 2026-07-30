package com.p046p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p147v.VText;
import p149l.bkn;
import p149l.d30;
import p149l.ihs;
import p149l.mb0;
import p149l.njn;
import p149l.s7m;
import p149l.xdl0;
import p149l.yr50;

/* JADX INFO: loaded from: classes4.dex */
public class IntlGiftComboView extends ConstraintLayout implements s7m<njn<?>> {

    /* JADX INFO: renamed from: d */
    public IntlLiveCountdownView f51004d;

    /* JADX INFO: renamed from: e */
    public GiftGearsLayerView f51005e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f51006f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f51007g;

    /* JADX INFO: renamed from: h */
    public IntlMultipleGiftItemView f51008h;

    /* JADX INFO: renamed from: i */
    public View f51009i;

    /* JADX INFO: renamed from: j */
    public VText f51010j;

    /* JADX INFO: renamed from: k */
    public mb0 f51011k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC12811a f51012l;

    /* JADX INFO: renamed from: m */
    public njn<?> f51013m;

    /* JADX INFO: renamed from: n */
    public C12881a f51014n;

    public IntlGiftComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m75295B0(View view) {
        m75320v0();
        this.f51013m.m159761Y3();
    }

    /* JADX INFO: renamed from: H0 */
    private void m75296H0() {
        this.f51004d.m75339r();
        this.f51005e.m73837e();
        this.f51014n.m75364k();
    }

    /* JADX INFO: renamed from: I0 */
    private void m75297I0(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        if (!ihsVar.m136282g().enableComboEffect) {
            m75320v0();
            return;
        }
        xdl0.m208344M(this, true);
        xdl0.m208345M0(this.f51004d, true);
        this.f51004d.m75341t(liveGiftItemView, ihsVar, z);
    }

    /* JADX INFO: renamed from: J0 */
    private void m75298J0(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC12811a interfaceC12811a) {
        if (z) {
            if (this.f51014n.m75361h() && liveGiftItemView.m73474E0()) {
                m75310u0();
                return;
            }
            return;
        }
        boolean zM136279d = ihsVar.m136279d();
        C12881a c12881a = this.f51014n;
        if (zM136279d) {
            c12881a.m75366m(liveGiftItemView, ihsVar, i, interfaceC12811a);
        } else if (c12881a.m75361h()) {
            m75310u0();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m75306r() {
        this.f51004d.m75329h(new d30() { // from class: l.ujn
            @Override // p149l.d30
            public final void call() {
                this.f176782a.m75312z0();
            }
        });
        xdl0.m208329E0(this.f51004d.f51020f, new View.OnClickListener() { // from class: l.vjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181741a.m75295B0(view);
            }
        });
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m75307r0(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f51005e;
        if (z) {
            giftGearsLayerView.m73835c(new d30() { // from class: l.wjn
                @Override // p149l.d30
                public final void call() {
                    this.f186666a.m75321w0();
                }
            });
        } else {
            xdl0.m208345M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m75308s0() {
        this.f51005e.m73836d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m75309t0() {
        this.f51014n.m75368o(8);
    }

    /* JADX INFO: renamed from: u0 */
    private void m75310u0() {
        this.f51014n.m75369p(new d30() { // from class: l.yjn
            @Override // p149l.d30
            public final void call() {
                this.f198647a.m75309t0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m75311y0() {
        this.f51004d.m75342u();
        m75307r0(true);
        m75310u0();
        xdl0.m208344M(this, false);
        this.f51013m.m206028F2().IntlGiftComboEvent.newComboVisible().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m75312z0() {
        this.f51013m.m159760X3((int) this.f51011k.m153857c().m136281f(), new d30() { // from class: l.xjn
            @Override // p149l.d30
            public final void call() {
                this.f193233a.m75311y0();
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m75313D0(mb0 mb0Var, View view) {
        this.f51013m.m206028F2().GiftDialogEventGroup.intlNewComboClick().mo172463j(mb0Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m75314E0(mb0 mb0Var, View view) {
        this.f51013m.m206028F2().GiftDialogEventGroup.intlNewComboClick().mo172463j(mb0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public void m75315G0(final mb0 mb0Var, LiveMultipleGiftView.InterfaceC12811a interfaceC12811a) {
        LiveGiftItemView liveGiftItemViewM153858d = mb0Var.m153858d();
        ihs ihsVarM153857c = mb0Var.m153857c();
        int iM153856b = mb0Var.m153856b();
        boolean zM153859e = mb0Var.m153859e();
        yr50 yr50VarM153855a = mb0Var.m153855a();
        m75319q0(false);
        this.f51011k = mb0Var;
        this.f51012l = interfaceC12811a;
        m75297I0(liveGiftItemViewM153858d, ihsVarM153857c, zM153859e);
        this.f51004d.f51018d.setOnClickListener(new View.OnClickListener() { // from class: l.zjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203431a.m75313D0(mb0Var, view);
            }
        });
        this.f51004d.f51023i.setOnClickListener(new View.OnClickListener() { // from class: l.akn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70288a.m75314E0(mb0Var, view);
            }
        });
        if (ihsVarM153857c.m136278c()) {
            m75309t0();
            this.f51005e.m73838f(liveGiftItemViewM153858d, ihsVarM153857c, yr50VarM153855a.m215782a());
        } else {
            m75308s0();
            m75298J0(liveGiftItemViewM153858d, ihsVarM153857c, iM153856b, zM153859e, interfaceC12811a);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m75316K0(int i) {
        this.f51004d.f51021g.setText(String.valueOf(i));
    }

    @Override // p149l.s7m
    public void destroy() {
        IntlLiveCountdownView intlLiveCountdownView = this.f51004d;
        if (intlLiveCountdownView != null) {
            intlLiveCountdownView.m75330i();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75317o0(View view) {
        bkn.m102415a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75317o0(this);
        m75306r();
        this.f51014n = new C12881a(this.f51006f, this.f51007g, this.f51008h);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(njn<?> njnVar) {
        this.f51013m = njnVar;
    }

    /* JADX INFO: renamed from: q0 */
    public void m75319q0(boolean z) {
        xdl0.m208344M(this.f51004d.f51020f, !z);
        xdl0.m208344M(this.f51004d.f51021g, z);
    }

    public void setAvailableCoin(Long l2) {
        this.f51010j.setText(String.valueOf(l2));
    }

    /* JADX INFO: renamed from: v0 */
    public void m75320v0() {
        xdl0.m208344M(this, false);
        this.f51004d.m75340s();
        m75307r0(false);
        m75309t0();
        m75296H0();
        this.f51013m.m206028F2().IntlGiftComboEvent.newComboVisible().mo172463j(Boolean.FALSE);
        this.f51013m.m159759W3();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m75321w0() {
        xdl0.m208345M0(this.f51005e, false);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
