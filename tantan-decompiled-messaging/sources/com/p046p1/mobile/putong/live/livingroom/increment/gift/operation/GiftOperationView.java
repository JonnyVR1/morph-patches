package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p149l.d30;
import p149l.fsj;
import p149l.ihs;
import p149l.ksj;
import p149l.mb0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;
import p149l.yr50;

/* JADX INFO: loaded from: classes4.dex */
public class GiftOperationView extends FrameLayout implements s7m<fsj<?>> {

    /* JADX INFO: renamed from: i */
    public static final int f49761i = t100.m186890d(26.0f);

    /* JADX INFO: renamed from: a */
    public GiftBubbleWithFlyView f49762a;

    /* JADX INFO: renamed from: b */
    public LiveCountdownView f49763b;

    /* JADX INFO: renamed from: c */
    public GiftGearsLayerView f49764c;

    /* JADX INFO: renamed from: d */
    public LiveMultipleGiftView f49765d;

    /* JADX INFO: renamed from: e */
    public ViewGroup.MarginLayoutParams f49766e;

    /* JADX INFO: renamed from: f */
    public mb0 f49767f;

    /* JADX INFO: renamed from: g */
    public LiveMultipleGiftView.InterfaceC12811a f49768g;

    /* JADX INFO: renamed from: h */
    public fsj<?> f49769h;

    public GiftOperationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    private void m73691B() {
        mb0 mb0Var = this.f49767f;
        if (mb0Var == null || this.f49768g == null) {
            return;
        }
        LiveGiftItemView liveGiftItemViewM153858d = mb0Var.m153858d();
        ihs ihsVarM153857c = this.f49767f.m153857c();
        int iM153856b = this.f49767f.m153856b();
        if (!ihsVarM153857c.m136278c() && ihsVarM153857c.m136279d() && xdl0.m208349O0(this.f49762a)) {
            this.f49765d.m73884t0(liveGiftItemViewM153858d, ihsVarM153857c, iM153856b, this.f49768g);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m73695i() {
        xdl0.m208345M0(this.f49762a, false);
    }

    /* JADX INFO: renamed from: j */
    private void m73696j(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f49764c;
        if (z) {
            giftGearsLayerView.m73835c(new d30() { // from class: l.jsj
                @Override // p149l.d30
                public final void call() {
                    this.f119514a.m73700q();
                }
            });
        } else {
            xdl0.m208345M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m73697k() {
        this.f49764c.m73836d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m73698l() {
        xdl0.m208345M0(this.f49765d, false);
    }

    /* JADX INFO: renamed from: m */
    private void m73699m() {
        this.f49765d.m73886w0(new d30() { // from class: l.isj
            @Override // p149l.d30
            public final void call() {
                this.f114767a.m73698l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m73700q() {
        xdl0.m208345M0(this.f49764c, false);
    }

    /* JADX INFO: renamed from: r */
    private void m73701r() {
        ViewGroup.LayoutParams layoutParams = this.f49763b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f49766e = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        this.f49763b.m73784i(new d30() { // from class: l.hsj
            @Override // p149l.d30
            public final void call() {
                this.f109325a.m73702s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m73702s() {
        m73695i();
        m73696j(true);
        m73699m();
        this.f49769h.m122947N3(true);
    }

    /* JADX INFO: renamed from: x */
    private void m73703x() {
        this.f49762a.m73718d();
        this.f49763b.m73795t();
        this.f49764c.m73837e();
        this.f49765d.m73883r0();
    }

    /* JADX INFO: renamed from: A */
    public final void m73704A(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC12811a interfaceC12811a) {
        if (z) {
            if (xdl0.m208349O0(this.f49765d) && liveGiftItemView.m73474E0()) {
                m73699m();
                return;
            }
            return;
        }
        boolean zM136279d = ihsVar.m136279d();
        LiveMultipleGiftView liveMultipleGiftView = this.f49765d;
        if (zM136279d) {
            liveMultipleGiftView.m73884t0(liveGiftItemView, ihsVar, i, interfaceC12811a);
        } else if (xdl0.m208349O0(liveMultipleGiftView)) {
            m73699m();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m73705d(View view) {
        ksj.m147073a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        LiveCountdownView liveCountdownView = this.f49763b;
        if (liveCountdownView != null) {
            liveCountdownView.m73785j();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fsj<?> fsjVar) {
        this.f49769h = fsjVar;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m73707f(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return iArr;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m73708n() {
        this.f49763b.m73796u();
        m73695i();
        m73696j(false);
        m73698l();
        m73703x();
        this.f49769h.m122947N3(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73705d(this);
        m73701r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m73709p(LiveGiftItemView liveGiftItemView, ihs ihsVar) {
        int[] iArrM136285j = ihsVar.m136285j();
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return (iArrM136285j[0] == iArr[0] && iArrM136285j[1] == iArr[1]) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public void m73710u(mb0 mb0Var, LiveMultipleGiftView.InterfaceC12811a interfaceC12811a) {
        LiveGiftItemView liveGiftItemViewM153858d = mb0Var.m153858d();
        ihs ihsVarM153857c = mb0Var.m153857c();
        int iM153856b = mb0Var.m153856b();
        boolean zM153859e = mb0Var.m153859e();
        yr50 yr50VarM153855a = mb0Var.m153855a();
        if (m73709p(liveGiftItemViewM153858d, ihsVarM153857c) || ihsVarM153857c.m136294s()) {
            return;
        }
        this.f49767f = mb0Var;
        this.f49768g = interfaceC12811a;
        m73713y(liveGiftItemViewM153858d, ihsVarM153857c, zM153859e, yr50VarM153855a.m215783b());
        m73714z(liveGiftItemViewM153858d, ihsVarM153857c, zM153859e);
        if (ihsVarM153857c.m136278c()) {
            m73698l();
            this.f49764c.m73838f(liveGiftItemViewM153858d, ihsVarM153857c, yr50VarM153855a.m215782a());
        } else {
            m73697k();
            m73704A(liveGiftItemViewM153858d, ihsVarM153857c, iM153856b, zM153859e, interfaceC12811a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m73711v() {
        this.f49763b.m73793r();
        m73691B();
    }

    /* JADX INFO: renamed from: w */
    public final void m73712w(LiveGiftItemView liveGiftItemView) {
        int[] iArrM73707f = m73707f(liveGiftItemView);
        int width = liveGiftItemView.getWidth() / 2;
        int height = liveGiftItemView.getHeight() / 2;
        int width2 = this.f49763b.getWidth() / 2;
        int height2 = this.f49763b.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f49766e;
        marginLayoutParams.leftMargin = (iArrM73707f[0] + width) - width2;
        marginLayoutParams.topMargin = ((iArrM73707f[1] + height) - height2) - f49761i;
        this.f49763b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public final void m73713y(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        xdl0.m208345M0(this.f49762a, true);
        this.f49762a.m73719e(liveGiftItemView, ihsVar, z, iArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m73714z(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        if (!ihsVar.m136282g().enableComboEffect) {
            m73708n();
            return;
        }
        m73712w(liveGiftItemView);
        xdl0.m208345M0(this.f49763b, true);
        this.f49763b.m73797v(liveGiftItemView, ihsVar, z);
        this.f49769h.m122950U3();
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
