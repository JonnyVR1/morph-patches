package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.bubble.GiftBubbleWithFlyView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.LiveCountdownView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import l.d30;
import l.s7m;
import l.t100;
import l.xdl0;
import p002l.fsj;
import p002l.ihs;
import p002l.ksj;
import p002l.mb0;
import p002l.yr50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftOperationView extends FrameLayout implements s7m<fsj<?>> {

    /* JADX INFO: renamed from: i */
    public static final int f5803i = t100.d(26.0f);

    /* JADX INFO: renamed from: a */
    public GiftBubbleWithFlyView f5804a;

    /* JADX INFO: renamed from: b */
    public LiveCountdownView f5805b;

    /* JADX INFO: renamed from: c */
    public GiftGearsLayerView f5806c;

    /* JADX INFO: renamed from: d */
    public LiveMultipleGiftView f5807d;

    /* JADX INFO: renamed from: e */
    public ViewGroup.MarginLayoutParams f5808e;

    /* JADX INFO: renamed from: f */
    public mb0 f5809f;

    /* JADX INFO: renamed from: g */
    public LiveMultipleGiftView.InterfaceC0400a f5810g;

    /* JADX INFO: renamed from: h */
    public fsj<?> f5811h;

    public GiftOperationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    private void m7239B() {
        mb0 mb0Var = this.f5809f;
        if (mb0Var == null || this.f5810g == null) {
            return;
        }
        LiveGiftItemView liveGiftItemViewM17796d = mb0Var.m17796d();
        ihs ihsVarM17795c = this.f5809f.m17795c();
        int iM17794b = this.f5809f.m17794b();
        if (!ihsVarM17795c.m15155c() && ihsVarM17795c.m15156d() && xdl0.O0(this.f5804a)) {
            this.f5807d.m7440t0(liveGiftItemViewM17796d, ihsVarM17795c, iM17794b, this.f5810g);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m7243i() {
        xdl0.M0(this.f5804a, false);
    }

    /* JADX INFO: renamed from: j */
    private void m7244j(boolean z) {
        GiftGearsLayerView giftGearsLayerView = this.f5806c;
        if (z) {
            giftGearsLayerView.m7391c(new d30() { // from class: l.jsj
                public final void call() {
                    this.f14002a.m7248q();
                }
            });
        } else {
            xdl0.M0(giftGearsLayerView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m7245k() {
        this.f5806c.m7392d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m7246l() {
        xdl0.M0(this.f5807d, false);
    }

    /* JADX INFO: renamed from: m */
    private void m7247m() {
        this.f5807d.m7442w0(new d30() { // from class: l.isj
            public final void call() {
                this.f13388a.m7246l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m7248q() {
        xdl0.M0(this.f5806c, false);
    }

    /* JADX INFO: renamed from: r */
    private void m7249r() {
        ViewGroup.LayoutParams layoutParams = this.f5805b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f5808e = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        this.f5805b.m7338i(new d30() { // from class: l.hsj
            public final void call() {
                this.f12259a.m7250s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7250s() {
        m7243i();
        m7244j(true);
        m7247m();
        this.f5811h.m13476N3(true);
    }

    /* JADX INFO: renamed from: x */
    private void m7251x() {
        this.f5804a.m7268d();
        this.f5805b.m7349t();
        this.f5806c.m7393e();
        this.f5807d.m7439r0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A */
    public final void m7252A(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, boolean z, LiveMultipleGiftView.InterfaceC0400a interfaceC0400a) {
        if (z) {
            if (xdl0.O0(this.f5807d) && liveGiftItemView.m7016E0()) {
                m7247m();
                return;
            }
            return;
        }
        boolean zM15156d = ihsVar.m15156d();
        ?? r0 = this.f5807d;
        if (zM15156d) {
            r0.m7440t0(liveGiftItemView, ihsVar, i, interfaceC0400a);
        } else if (xdl0.O0((View) r0)) {
            m7247m();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public Context m7253C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m7254d(View view) {
        ksj.m16773a(this, view);
    }

    public void destroy() {
        LiveCountdownView liveCountdownView = this.f5805b;
        if (liveCountdownView != null) {
            liveCountdownView.m7339j();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m7257i1(fsj<?> fsjVar) {
        this.f5811h = fsjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final int[] m7256f(LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return iArr;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m7258n() {
        this.f5805b.m7350u();
        m7243i();
        m7244j(false);
        m7246l();
        m7251x();
        this.f5811h.m13476N3(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7254d(this);
        m7249r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final boolean m7259p(LiveGiftItemView liveGiftItemView, ihs ihsVar) {
        int[] iArrM15162j = ihsVar.m15162j();
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        return (iArrM15162j[0] == iArr[0] && iArrM15162j[1] == iArr[1]) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public void m7260u(mb0 mb0Var, LiveMultipleGiftView.InterfaceC0400a interfaceC0400a) {
        LiveGiftItemView liveGiftItemViewM17796d = mb0Var.m17796d();
        ihs ihsVarM17795c = mb0Var.m17795c();
        int iM17794b = mb0Var.m17794b();
        boolean zM17797e = mb0Var.m17797e();
        yr50 yr50VarM17793a = mb0Var.m17793a();
        if (m7259p(liveGiftItemViewM17796d, ihsVarM17795c) || ihsVarM17795c.m15171s()) {
            return;
        }
        this.f5809f = mb0Var;
        this.f5810g = interfaceC0400a;
        m7263y(liveGiftItemViewM17796d, ihsVarM17795c, zM17797e, yr50VarM17793a.m26914b());
        m7264z(liveGiftItemViewM17796d, ihsVarM17795c, zM17797e);
        if (ihsVarM17795c.m15155c()) {
            m7246l();
            this.f5806c.m7394f(liveGiftItemViewM17796d, ihsVarM17795c, yr50VarM17793a.m26913a());
        } else {
            m7245k();
            m7252A(liveGiftItemViewM17796d, ihsVarM17795c, iM17794b, zM17797e, interfaceC0400a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m7261v() {
        this.f5805b.m7347r();
        m7239B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m7262w(LiveGiftItemView liveGiftItemView) {
        int[] iArrM7256f = m7256f(liveGiftItemView);
        int width = liveGiftItemView.getWidth() / 2;
        int height = liveGiftItemView.getHeight() / 2;
        int width2 = this.f5805b.getWidth() / 2;
        int height2 = this.f5805b.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f5808e;
        marginLayoutParams.leftMargin = (iArrM7256f[0] + width) - width2;
        marginLayoutParams.topMargin = ((iArrM7256f[1] + height) - height2) - f5803i;
        this.f5805b.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public final void m7263y(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z, int[] iArr) {
        xdl0.M0(this.f5804a, true);
        this.f5804a.m7269e(liveGiftItemView, ihsVar, z, iArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m7264z(LiveGiftItemView liveGiftItemView, ihs ihsVar, boolean z) {
        if (!ihsVar.m15159g().enableComboEffect) {
            m7258n();
            return;
        }
        m7262w(liveGiftItemView);
        xdl0.M0(this.f5805b, true);
        this.f5805b.m7351v(liveGiftItemView, ihsVar, z);
        this.f5811h.m13480U3();
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOperationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
