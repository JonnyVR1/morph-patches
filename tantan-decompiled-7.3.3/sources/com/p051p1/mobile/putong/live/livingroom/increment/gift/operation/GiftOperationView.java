package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p153l.avj;
import p153l.bnl0;
import p153l.e060;
import p153l.iam;
import p153l.ib0;
import p153l.jjs;
import p153l.qa00;
import p153l.vuj;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class GiftOperationView extends FrameLayout implements iam<vuj<?>> {

    /* JADX INFO: renamed from: i */
    public static final int f50609i = qa00.m175859d(26.0f);

    /* JADX INFO: renamed from: a */
    public GiftBubbleWithFlyView f50610a;

    /* JADX INFO: renamed from: b */
    public LiveCountdownView f50611b;

    /* JADX INFO: renamed from: c */
    public GiftGearsLayerView f50612c;

    /* JADX INFO: renamed from: d */
    public LiveMultipleGiftView f50613d;

    /* JADX INFO: renamed from: e */
    public ViewGroup.MarginLayoutParams f50614e;

    /* JADX INFO: renamed from: f */
    public ib0 f50615f;

    /* JADX INFO: renamed from: g */
    public LiveMultipleGiftView.InterfaceC12974a f50616g;

    /* JADX INFO: renamed from: h */
    public vuj<?> f50617h;

    public GiftOperationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    private void m74874B() {
        ib0 ib0Var = this.f50615f;
        if (ib0Var == null || this.f50616g == null) {
            return;
        }
        LiveGiftItemView liveGiftItemViewM139231d = ib0Var.m139231d();
        jjs jjsVarM139230c = this.f50615f.m139230c();
        int iM139229b = this.f50615f.m139229b();
        if (!jjsVarM139230c.m145117c() && jjsVarM139230c.m145118d() && bnl0.m105529O0(this.f50610a)) {
            this.f50613d.m75067t0(liveGiftItemViewM139231d, jjsVarM139230c, iM139229b, this.f50616g);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m74878i() {
        bnl0.m105525M0(this.f50610a, false);
    }

    /* JADX INFO: renamed from: j */
    private void m74879j(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f50612c;
        if (z) {
            giftGearsLayerView.m75018c(new x20() { // from class: l.zuj
                @Override // p153l.x20
                public final void call() {
                    this.f206129a.m74883q();
                }
            });
        } else {
            bnl0.m105525M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m74880k() {
        this.f50612c.m75019d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m74881l() {
        bnl0.m105525M0(this.f50613d, false);
    }

    /* JADX INFO: renamed from: m */
    private void m74882m() {
        this.f50613d.m75069w0(new x20() { // from class: l.yuj
            @Override // p153l.x20
            public final void call() {
                this.f201621a.m74881l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m74883q() {
        bnl0.m105525M0(this.f50612c, false);
    }

    /* JADX INFO: renamed from: r */
    private void m74884r() {
        ViewGroup.LayoutParams layoutParams = this.f50611b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f50614e = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        this.f50611b.m74967i(new x20() { // from class: l.xuj
            @Override // p153l.x20
            public final void call() {
                this.f196287a.m74885s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m74885s() {
        m74878i();
        m74879j(true);
        m74882m();
        this.f50617h.m202801N3(true);
    }

    /* JADX INFO: renamed from: x */
    private void m74886x() {
        this.f50610a.m74901d();
        this.f50611b.m74978t();
        this.f50612c.m75020e();
        this.f50613d.m75066r0();
    }

    /* JADX INFO: renamed from: A */
    public final void m74887A(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC12974a interfaceC12974a) {
        if (z) {
            if (bnl0.m105529O0(this.f50613d) && liveGiftItemView.m74657E0()) {
                m74882m();
                return;
            }
            return;
        }
        boolean zM145118d = jjsVar.m145118d();
        LiveMultipleGiftView liveMultipleGiftView = this.f50613d;
        if (zM145118d) {
            liveMultipleGiftView.m75067t0(liveGiftItemView, jjsVar, i, interfaceC12974a);
        } else if (bnl0.m105529O0(liveMultipleGiftView)) {
            m74882m();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m74888d(View view) {
        avj.m100464a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        LiveCountdownView liveCountdownView = this.f50611b;
        if (liveCountdownView != null) {
            liveCountdownView.m74968j();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vuj<?> vujVar) {
        this.f50617h = vujVar;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m74890f(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return iArr;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m74891n() {
        this.f50611b.m74979u();
        m74878i();
        m74879j(false);
        m74881l();
        m74886x();
        this.f50617h.m202801N3(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74888d(this);
        m74884r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m74892p(LiveGiftItemView liveGiftItemView, jjs jjsVar) {
        int[] iArrM145124j = jjsVar.m145124j();
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return (iArrM145124j[0] == iArr[0] && iArrM145124j[1] == iArr[1]) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public void m74893u(ib0 ib0Var, LiveMultipleGiftView.InterfaceC12974a interfaceC12974a) {
        LiveGiftItemView liveGiftItemViewM139231d = ib0Var.m139231d();
        jjs jjsVarM139230c = ib0Var.m139230c();
        int iM139229b = ib0Var.m139229b();
        boolean zM139232e = ib0Var.m139232e();
        e060 e060VarM139228a = ib0Var.m139228a();
        if (m74892p(liveGiftItemViewM139231d, jjsVarM139230c) || jjsVarM139230c.m145133s()) {
            return;
        }
        this.f50615f = ib0Var;
        this.f50616g = interfaceC12974a;
        m74896y(liveGiftItemViewM139231d, jjsVarM139230c, zM139232e, e060VarM139228a.m118786b());
        m74897z(liveGiftItemViewM139231d, jjsVarM139230c, zM139232e);
        if (jjsVarM139230c.m145117c()) {
            m74881l();
            this.f50612c.m75021f(liveGiftItemViewM139231d, jjsVarM139230c, e060VarM139228a.m118785a());
        } else {
            m74880k();
            m74887A(liveGiftItemViewM139231d, jjsVarM139230c, iM139229b, zM139232e, interfaceC12974a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m74894v() {
        this.f50611b.m74976r();
        m74874B();
    }

    /* JADX INFO: renamed from: w */
    public final void m74895w(LiveGiftItemView liveGiftItemView) {
        int[] iArrM74890f = m74890f(liveGiftItemView);
        int width = liveGiftItemView.getWidth() / 2;
        int height = liveGiftItemView.getHeight() / 2;
        int width2 = this.f50611b.getWidth() / 2;
        int height2 = this.f50611b.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f50614e;
        marginLayoutParams.leftMargin = (iArrM74890f[0] + width) - width2;
        marginLayoutParams.topMargin = ((iArrM74890f[1] + height) - height2) - f50609i;
        this.f50611b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public final void m74896y(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z, int[] iArr) {
        bnl0.m105525M0(this.f50610a, true);
        this.f50610a.m74902e(liveGiftItemView, jjsVar, z, iArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m74897z(LiveGiftItemView liveGiftItemView, jjs jjsVar, boolean z) {
        if (!jjsVar.m145121g().enableComboEffect) {
            m74891n();
            return;
        }
        m74895w(liveGiftItemView);
        bnl0.m105525M0(this.f50611b, true);
        this.f50611b.m74980v(liveGiftItemView, jjsVar, z);
        this.f50617h.m202804U3();
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
