package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble.LiveVChatGiftBubbleWithFlyView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsLayerView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;
import p149l.d30;
import p149l.gsj;
import p149l.ihs;
import p149l.nb0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;
import p149l.yku;
import p149l.yr50;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftOperationView extends FrameLayout implements s7m<gsj<?>> {

    /* JADX INFO: renamed from: i */
    public static final int f45212i = t100.m186890d(26.0f);

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftBubbleWithFlyView f45213a;

    /* JADX INFO: renamed from: b */
    public LiveVChatCountdownView f45214b;

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftGearsLayerView f45215c;

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftView f45216d;

    /* JADX INFO: renamed from: e */
    public ViewGroup.MarginLayoutParams f45217e;

    /* JADX INFO: renamed from: f */
    public nb0 f45218f;

    /* JADX INFO: renamed from: g */
    public LiveVChatMultipleGiftView.InterfaceC12530a f45219g;

    /* JADX INFO: renamed from: h */
    public gsj<?> f45220h;

    public LiveVChatGiftOperationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m69472r() {
        ViewGroup.LayoutParams layoutParams = this.f45214b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f45217e = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        this.f45214b.m69583i(new d30() { // from class: l.vku
            @Override // p149l.d30
            public final void call() {
                this.f181846a.m69473s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m69473s() {
        m69480i();
        m69481j(true);
        m69484m();
        this.f45220h.m127801V2(true);
    }

    /* JADX INFO: renamed from: x */
    private void m69474x() {
        this.f45213a.m69566d();
        this.f45214b.m69594t();
        this.f45215c.m69624e();
        this.f45216d.m69676r0();
    }

    /* JADX INFO: renamed from: A */
    public final void m69475A(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int i, boolean z, LiveVChatMultipleGiftView.InterfaceC12530a interfaceC12530a) {
        if (z) {
            if (xdl0.m208349O0(this.f45216d) && liveVChatGiftItemView.m69420B0()) {
                m69484m();
                return;
            }
            return;
        }
        boolean zM136279d = ihsVar.m136279d();
        LiveVChatMultipleGiftView liveVChatMultipleGiftView = this.f45216d;
        if (zM136279d) {
            liveVChatMultipleGiftView.m69678t0(liveVChatGiftItemView, ihsVar, i, interfaceC12530a);
        } else if (xdl0.m208349O0(liveVChatMultipleGiftView)) {
            m69484m();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m69476B() {
        nb0 nb0Var = this.f45218f;
        if (nb0Var == null || this.f45219g == null) {
            return;
        }
        LiveVChatGiftItemView liveVChatGiftItemViewM158730d = nb0Var.m158730d();
        ihs ihsVarM158729c = this.f45218f.m158729c();
        int iM158728b = this.f45218f.m158728b();
        if (!ihsVarM158729c.m136278c() && ihsVarM158729c.m136279d() && xdl0.m208349O0(this.f45213a)) {
            this.f45216d.m69678t0(liveVChatGiftItemViewM158730d, ihsVarM158729c, iM158728b, this.f45219g);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m69477d(View view) {
        yku.m215209a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        LiveVChatCountdownView liveVChatCountdownView = this.f45214b;
        if (liveVChatCountdownView != null) {
            liveVChatCountdownView.m69584j();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gsj<?> gsjVar) {
        this.f45220h = gsjVar;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m69479f(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public final void m69480i() {
        xdl0.m208345M0(this.f45213a, false);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m69481j(boolean z) {
        LiveVChatGiftGearsLayerView liveVChatGiftGearsLayerView = this.f45215c;
        if (z) {
            liveVChatGiftGearsLayerView.m69622c(new d30() { // from class: l.xku
                @Override // p149l.d30
                public final void call() {
                    this.f193361a.m69487q();
                }
            });
        } else {
            xdl0.m208345M0(liveVChatGiftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m69482k() {
        this.f45215c.m69623d();
    }

    /* JADX INFO: renamed from: l */
    public final void m69483l() {
        xdl0.m208345M0(this.f45216d, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m69484m() {
        this.f45216d.m69681w0(new d30() { // from class: l.wku
            @Override // p149l.d30
            public final void call() {
                this.f186829a.m69483l();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m69485n() {
        this.f45214b.m69595u();
        m69480i();
        m69481j(false);
        m69483l();
        m69474x();
        this.f45220h.m127801V2(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69477d(this);
        m69472r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m69486p(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar) {
        int[] iArrM136285j = ihsVar.m136285j();
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        return (iArrM136285j[0] == iArr[0] && iArrM136285j[1] == iArr[1]) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m69487q() {
        xdl0.m208345M0(this.f45215c, false);
    }

    /* JADX INFO: renamed from: u */
    public void m69488u(nb0 nb0Var, LiveVChatMultipleGiftView.InterfaceC12530a interfaceC12530a) {
        LiveVChatGiftItemView liveVChatGiftItemViewM158730d = nb0Var.m158730d();
        ihs ihsVarM158729c = nb0Var.m158729c();
        int iM158728b = nb0Var.m158728b();
        boolean zM158731e = nb0Var.m158731e();
        yr50 yr50VarM158727a = nb0Var.m158727a();
        if (m69486p(liveVChatGiftItemViewM158730d, ihsVarM158729c) || ihsVarM158729c.m136294s()) {
            return;
        }
        this.f45218f = nb0Var;
        this.f45219g = interfaceC12530a;
        m69491y(liveVChatGiftItemViewM158730d, ihsVarM158729c, zM158731e, yr50VarM158727a.m215783b());
        m69492z(liveVChatGiftItemViewM158730d, ihsVarM158729c, zM158731e);
        if (ihsVarM158729c.m136278c()) {
            m69483l();
            this.f45215c.m69625f(liveVChatGiftItemViewM158730d, ihsVarM158729c, yr50VarM158727a.m215782a());
        } else {
            m69482k();
            m69475A(liveVChatGiftItemViewM158730d, ihsVarM158729c, iM158728b, zM158731e, interfaceC12530a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m69489v() {
        this.f45214b.m69592r();
        m69476B();
    }

    /* JADX INFO: renamed from: w */
    public final void m69490w(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArrM69479f = m69479f(liveVChatGiftItemView);
        int width = liveVChatGiftItemView.getWidth() / 2;
        int height = liveVChatGiftItemView.getHeight() / 2;
        int width2 = this.f45214b.getWidth() / 2;
        int height2 = this.f45214b.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f45217e;
        marginLayoutParams.leftMargin = (iArrM69479f[0] + width) - width2;
        marginLayoutParams.topMargin = ((iArrM69479f[1] + height) - height2) - f45212i;
        this.f45214b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public final void m69491y(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        xdl0.m208345M0(this.f45213a, true);
        this.f45213a.m69567e(liveVChatGiftItemView, ihsVar, z, iArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m69492z(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, boolean z) {
        if (!ihsVar.m136282g().enableComboEffect) {
            m69485n();
            return;
        }
        m69490w(liveVChatGiftItemView);
        xdl0.m208345M0(this.f45214b, true);
        this.f45214b.m69596v(liveVChatGiftItemView, ihsVar, z);
        this.f45220h.m127804b3();
    }

    public LiveVChatGiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
