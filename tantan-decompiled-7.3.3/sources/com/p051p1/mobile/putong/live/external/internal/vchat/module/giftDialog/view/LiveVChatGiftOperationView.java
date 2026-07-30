package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble.LiveVChatGiftBubbleWithFlyView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.countdown.LiveVChatCountdownView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsLayerView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftView;
import p153l.bnl0;
import p153l.e060;
import p153l.iam;
import p153l.jb0;
import p153l.jjs;
import p153l.qa00;
import p153l.wuj;
import p153l.x20;
import p153l.zmu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftOperationView extends FrameLayout implements iam<wuj<?>> {

    /* JADX INFO: renamed from: i */
    public static final int f46060i = qa00.m175859d(26.0f);

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftBubbleWithFlyView f46061a;

    /* JADX INFO: renamed from: b */
    public LiveVChatCountdownView f46062b;

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftGearsLayerView f46063c;

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftView f46064d;

    /* JADX INFO: renamed from: e */
    public ViewGroup.MarginLayoutParams f46065e;

    /* JADX INFO: renamed from: f */
    public jb0 f46066f;

    /* JADX INFO: renamed from: g */
    public LiveVChatMultipleGiftView.InterfaceC12693a f46067g;

    /* JADX INFO: renamed from: h */
    public wuj<?> f46068h;

    public LiveVChatGiftOperationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m70655r() {
        ViewGroup.LayoutParams layoutParams = this.f46062b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f46065e = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        this.f46062b.m70766i(new x20() { // from class: l.wmu
            @Override // p153l.x20
            public final void call() {
                this.f189837a.m70656s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m70656s() {
        m70663i();
        m70664j(true);
        m70667m();
        this.f46068h.m207958V2(true);
    }

    /* JADX INFO: renamed from: x */
    private void m70657x() {
        this.f46061a.m70749d();
        this.f46062b.m70777t();
        this.f46063c.m70807e();
        this.f46064d.m70859r0();
    }

    /* JADX INFO: renamed from: A */
    public final void m70658A(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int i, boolean z, LiveVChatMultipleGiftView.InterfaceC12693a interfaceC12693a) {
        if (z) {
            if (bnl0.m105529O0(this.f46064d) && liveVChatGiftItemView.m70603B0()) {
                m70667m();
                return;
            }
            return;
        }
        boolean zM145118d = jjsVar.m145118d();
        LiveVChatMultipleGiftView liveVChatMultipleGiftView = this.f46064d;
        if (zM145118d) {
            liveVChatMultipleGiftView.m70861t0(liveVChatGiftItemView, jjsVar, i, interfaceC12693a);
        } else if (bnl0.m105529O0(liveVChatMultipleGiftView)) {
            m70667m();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m70659B() {
        jb0 jb0Var = this.f46066f;
        if (jb0Var == null || this.f46067g == null) {
            return;
        }
        LiveVChatGiftItemView liveVChatGiftItemViewM144176d = jb0Var.m144176d();
        jjs jjsVarM144175c = this.f46066f.m144175c();
        int iM144174b = this.f46066f.m144174b();
        if (!jjsVarM144175c.m145117c() && jjsVarM144175c.m145118d() && bnl0.m105529O0(this.f46061a)) {
            this.f46064d.m70861t0(liveVChatGiftItemViewM144176d, jjsVarM144175c, iM144174b, this.f46067g);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m70660d(View view) {
        zmu.m220478a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        LiveVChatCountdownView liveVChatCountdownView = this.f46062b;
        if (liveVChatCountdownView != null) {
            liveVChatCountdownView.m70767j();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wuj<?> wujVar) {
        this.f46068h = wujVar;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m70662f(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public final void m70663i() {
        bnl0.m105525M0(this.f46061a, false);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m70664j(boolean z) {
        LiveVChatGiftGearsLayerView liveVChatGiftGearsLayerView = this.f46063c;
        if (z) {
            liveVChatGiftGearsLayerView.m70805c(new x20() { // from class: l.ymu
                @Override // p153l.x20
                public final void call() {
                    this.f200714a.m70670q();
                }
            });
        } else {
            bnl0.m105525M0(liveVChatGiftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m70665k() {
        this.f46063c.m70806d();
    }

    /* JADX INFO: renamed from: l */
    public final void m70666l() {
        bnl0.m105525M0(this.f46064d, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m70667m() {
        this.f46064d.m70864w0(new x20() { // from class: l.xmu
            @Override // p153l.x20
            public final void call() {
                this.f195329a.m70666l();
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m70668n() {
        this.f46062b.m70778u();
        m70663i();
        m70664j(false);
        m70666l();
        m70657x();
        this.f46068h.m207958V2(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70660d(this);
        m70655r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m70669p(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar) {
        int[] iArrM145124j = jjsVar.m145124j();
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        return (iArrM145124j[0] == iArr[0] && iArrM145124j[1] == iArr[1]) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m70670q() {
        bnl0.m105525M0(this.f46063c, false);
    }

    /* JADX INFO: renamed from: u */
    public void m70671u(jb0 jb0Var, LiveVChatMultipleGiftView.InterfaceC12693a interfaceC12693a) {
        LiveVChatGiftItemView liveVChatGiftItemViewM144176d = jb0Var.m144176d();
        jjs jjsVarM144175c = jb0Var.m144175c();
        int iM144174b = jb0Var.m144174b();
        boolean zM144177e = jb0Var.m144177e();
        e060 e060VarM144173a = jb0Var.m144173a();
        if (m70669p(liveVChatGiftItemViewM144176d, jjsVarM144175c) || jjsVarM144175c.m145133s()) {
            return;
        }
        this.f46066f = jb0Var;
        this.f46067g = interfaceC12693a;
        m70674y(liveVChatGiftItemViewM144176d, jjsVarM144175c, zM144177e, e060VarM144173a.m118786b());
        m70675z(liveVChatGiftItemViewM144176d, jjsVarM144175c, zM144177e);
        if (jjsVarM144175c.m145117c()) {
            m70666l();
            this.f46063c.m70808f(liveVChatGiftItemViewM144176d, jjsVarM144175c, e060VarM144173a.m118785a());
        } else {
            m70665k();
            m70658A(liveVChatGiftItemViewM144176d, jjsVarM144175c, iM144174b, zM144177e, interfaceC12693a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m70672v() {
        this.f46062b.m70775r();
        m70659B();
    }

    /* JADX INFO: renamed from: w */
    public final void m70673w(LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArrM70662f = m70662f(liveVChatGiftItemView);
        int width = liveVChatGiftItemView.getWidth() / 2;
        int height = liveVChatGiftItemView.getHeight() / 2;
        int width2 = this.f46062b.getWidth() / 2;
        int height2 = this.f46062b.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f46065e;
        marginLayoutParams.leftMargin = (iArrM70662f[0] + width) - width2;
        marginLayoutParams.topMargin = ((iArrM70662f[1] + height) - height2) - f46060i;
        this.f46062b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public final void m70674y(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, boolean z, int[] iArr) {
        bnl0.m105525M0(this.f46061a, true);
        this.f46061a.m70750e(liveVChatGiftItemView, jjsVar, z, iArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m70675z(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, boolean z) {
        if (!jjsVar.m145121g().enableComboEffect) {
            m70668n();
            return;
        }
        m70673w(liveVChatGiftItemView);
        bnl0.m105525M0(this.f46062b, true);
        this.f46062b.m70779v(liveVChatGiftItemView, jjsVar, z);
        this.f46068h.m207961b3();
    }

    public LiveVChatGiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
