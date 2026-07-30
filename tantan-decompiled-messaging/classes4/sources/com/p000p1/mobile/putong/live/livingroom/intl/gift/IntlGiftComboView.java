package com.p000p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import l.d30;
import l.s7m;
import l.xdl0;
import p002l.bkn;
import p002l.ihs;
import p002l.mb0;
import p002l.njn;
import p002l.yr50;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlGiftComboView extends ConstraintLayout implements s7m<njn<?>> {

    /* JADX INFO: renamed from: d */
    public IntlLiveCountdownView f7046d;

    /* JADX INFO: renamed from: e */
    public GiftGearsLayerView f7047e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f7048f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f7049g;

    /* JADX INFO: renamed from: h */
    public IntlMultipleGiftItemView f7050h;

    /* JADX INFO: renamed from: i */
    public View f7051i;

    /* JADX INFO: renamed from: j */
    public VText f7052j;

    /* JADX INFO: renamed from: k */
    public mb0 f7053k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC0400a f7054l;

    /* JADX INFO: renamed from: m */
    public njn<?> f7055m;

    /* JADX INFO: renamed from: n */
    public C0470a f7056n;

    public IntlGiftComboView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m8914B0(View view) {
        m8941v0();
        this.f7055m.m18820Y3();
    }

    /* JADX INFO: renamed from: H0 */
    private void m8915H0() {
        this.f7046d.m8960r();
        this.f7047e.m7393e();
        this.f7056n.m8987k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private void m8916I0(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        if (!ihsVar.m15159g().enableComboEffect) {
            m8941v0();
            return;
        }
        xdl0.M(this, true);
        xdl0.M0(this.f7046d, true);
        this.f7046d.m8962t(liveGiftItemView, ihsVar, z);
    }

    /* JADX INFO: renamed from: J0 */
    private void m8917J0(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC0400a interfaceC0400a) {
        if (z) {
            if (this.f7056n.m8984h() && liveGiftItemView.m7016E0()) {
                m8929u0();
                return;
            }
            return;
        }
        boolean zM15156d = ihsVar.m15156d();
        C0470a c0470a = this.f7056n;
        if (zM15156d) {
            c0470a.m8989m(liveGiftItemView, ihsVar, i, interfaceC0400a);
        } else if (c0470a.m8984h()) {
            m8929u0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m8925r() {
        this.f7046d.m8950h(new d30() { // from class: l.ujn
            public final void call() {
                this.f20677a.m8931z0();
            }
        });
        xdl0.E0(this.f7046d.f7062f, new View.OnClickListener() { // from class: l.vjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21191a.m8914B0(view);
            }
        });
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: r0 */
    private void m8926r0(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f7047e;
        if (z) {
            giftGearsLayerView.m7391c(new d30() { // from class: l.wjn
                public final void call() {
                    this.f21804a.m8942w0();
                }
            });
        } else {
            xdl0.M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m8927s0() {
        this.f7047e.m7392d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m8928t0() {
        this.f7056n.m8991o(8);
    }

    /* JADX INFO: renamed from: u0 */
    private void m8929u0() {
        this.f7056n.m8992p(new d30() { // from class: l.yjn
            public final void call() {
                this.f22938a.m8928t0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m8930y0() {
        this.f7046d.m8963u();
        m8926r0(true);
        m8929u0();
        xdl0.M(this, false);
        this.f7055m.m25548F2().IntlGiftComboEvent.newComboVisible().j(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m8931z0() {
        this.f7055m.m18819X3((int) this.f7053k.m17795c().m15158f(), new d30() { // from class: l.xjn
            public final void call() {
                this.f22330a.m8930y0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public Context m8932C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8933D0(mb0 mb0Var, View view) {
        this.f7055m.m25548F2().GiftDialogEventGroup.intlNewComboClick().j(mb0Var);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m8934E0(mb0 mb0Var, View view) {
        this.f7055m.m25548F2().GiftDialogEventGroup.intlNewComboClick().j(mb0Var);
    }

    /* JADX INFO: renamed from: G0 */
    public void m8935G0(final mb0 mb0Var, LiveMultipleGiftView.InterfaceC0400a interfaceC0400a) {
        LiveGiftItemView liveGiftItemViewM17796d = mb0Var.m17796d();
        ihs ihsVarM17795c = mb0Var.m17795c();
        int iM17794b = mb0Var.m17794b();
        boolean zM17797e = mb0Var.m17797e();
        yr50 yr50VarM17793a = mb0Var.m17793a();
        m8940q0(false);
        this.f7053k = mb0Var;
        this.f7054l = interfaceC0400a;
        m8916I0(liveGiftItemViewM17796d, ihsVarM17795c, zM17797e);
        this.f7046d.f7060d.setOnClickListener(new View.OnClickListener() { // from class: l.zjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23453a.m8933D0(mb0Var, view);
            }
        });
        this.f7046d.f7065i.setOnClickListener(new View.OnClickListener() { // from class: l.akn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7671a.m8934E0(mb0Var, view);
            }
        });
        if (ihsVarM17795c.m15155c()) {
            m8928t0();
            this.f7047e.m7394f(liveGiftItemViewM17796d, ihsVarM17795c, yr50VarM17793a.m26913a());
        } else {
            m8927s0();
            m8917J0(liveGiftItemViewM17796d, ihsVarM17795c, iM17794b, zM17797e, interfaceC0400a);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m8936K0(int i) {
        this.f7046d.f7063g.setText(String.valueOf(i));
    }

    public void destroy() {
        IntlLiveCountdownView intlLiveCountdownView = this.f7046d;
        if (intlLiveCountdownView != null) {
            intlLiveCountdownView.m8951i();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8938o0(View view) {
        bkn.m10420a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8938o0(this);
        m8925r();
        this.f7056n = new C0470a(this.f7048f, this.f7049g, this.f7050h);
    }

    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void m8937i1(njn<?> njnVar) {
        this.f7055m = njnVar;
    }

    /* JADX INFO: renamed from: q0 */
    public void m8940q0(boolean z) {
        xdl0.M(this.f7046d.f7062f, !z);
        xdl0.M(this.f7046d.f7063g, z);
    }

    public void setAvailableCoin(Long l2) {
        this.f7052j.setText(String.valueOf(l2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public void m8941v0() {
        xdl0.M(this, false);
        this.f7046d.m8961s();
        m8926r0(false);
        m8928t0();
        m8915H0();
        this.f7055m.m25548F2().IntlGiftComboEvent.newComboVisible().j(Boolean.FALSE);
        this.f7055m.m18818W3();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8942w0() {
        xdl0.M0(this.f7047e, false);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGiftComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
