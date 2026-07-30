package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemLabel;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemMask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.dt0;
import l.e51;
import l.hxs;
import l.qib0;
import l.s7m;
import l.t100;
import l.uep0;
import l.xdl0;
import l.zb2;
import p002l.azl;
import p002l.ku50;
import p002l.os50;
import p002l.ut50;
import p002l.zs50;
import v.VDraweeView;
import v.VMarqueeText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationItemView extends RelativeLayout implements s7m<os50>, azl {

    /* JADX INFO: renamed from: a */
    public OperationItemView f6872a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f6873b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6874c;

    /* JADX INFO: renamed from: d */
    public OperationCountDownCircleView f6875d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6876e;

    /* JADX INFO: renamed from: f */
    public VText f6877f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f6878g;

    /* JADX INFO: renamed from: h */
    public os50 f6879h;

    /* JADX INFO: renamed from: i */
    public xdl0.g f6880i;

    /* JADX INFO: renamed from: j */
    public final int f6881j;

    /* JADX INFO: renamed from: k */
    public Animator f6882k;

    /* JADX INFO: renamed from: l */
    public Animator f6883l;

    /* JADX INFO: renamed from: m */
    public Animator f6884m;

    public OperationItemView(Context context) {
        super(context);
        this.f6881j = 150;
    }

    private int getOperationLeftMargin() {
        return (this.f6872a.getWidth() - this.f6873b.getWidth()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m8651u(View view) {
        this.f6879h.m19724l4();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8652A(BLiveOperationItem bLiveOperationItem) {
        this.f6879h.m25548F2().OperationsEvent.messageOpen().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16799a());
    }

    /* JADX INFO: renamed from: B */
    public void m8653B(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        Pair<Float, Float> pairM19726o4 = this.f6879h.m19726o4(bLiveOperationItemCountDown);
        OperationCountDownCircleView operationCountDownCircleView = this.f6875d;
        if (pairM19726o4 == null) {
            xdl0.M(operationCountDownCircleView, false);
            return;
        }
        xdl0.M(operationCountDownCircleView, true);
        this.f6875d.setDuration(bLiveOperationItemCountDown.getTheRemainingTime());
        this.f6875d.m8632e(((Float) pairM19726o4.first).floatValue(), ((Float) pairM19726o4.second).floatValue());
        this.f6875d.setOnEnd(new Runnable() { // from class: l.us50
            @Override // java.lang.Runnable
            public final void run() {
                this.f20773a.m8671w(bLiveOperationItemCountDown);
            }
        });
        this.f6875d.m8633f();
    }

    /* JADX INFO: renamed from: C */
    public final void m8654C(BLiveOperationItem bLiveOperationItem) {
        hxs.t("context_livingAct", this.f6874c, bLiveOperationItem.icon.iconUrl, t100.d(32.0f));
        if (TEnum.equals(bLiveOperationItem.icon.iconType, "countdown")) {
            m8653B(bLiveOperationItem.icon.countdown);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8655C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m8656E(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemLabel bLiveOperationItemLabel = bLiveOperationItem.icon.label;
        if (bLiveOperationItemLabel == null) {
            xdl0.M(this.f6877f, false);
        } else {
            e51.G(new Runnable() { // from class: l.ws50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21963a.m8672x(bLiveOperationItemLabel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8657F(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemMask bLiveOperationItemMask = bLiveOperationItem.icon.mask;
        if (bLiveOperationItemMask == null) {
            xdl0.M(this.f6876e, false);
        } else {
            e51.G(new Runnable() { // from class: l.vs50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21284a.m8673y(bLiveOperationItemMask);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m8658G() {
        this.f6875d.m8631d();
        dt0.A(this.f6882k);
        dt0.A(this.f6883l);
        dt0.A(this.f6884m);
    }

    /* JADX INFO: renamed from: H */
    public void m8659H() {
        this.f6879h.m19719G4(true);
        setScaleX(0.1f);
        setScaleY(0.1f);
        setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: I */
    public void m8660I(final BLiveOperationItem bLiveOperationItem, xdl0.g gVar) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f6880i = xdl0.i0(this.f6874c);
        Animator animatorF = bt0.f(bt0.x(150L, new Animator[]{bt0.l(this.f6874c, bt0.i, 0L, -1L, linearInterpolator, new float[]{1.0f, 0.75f}), bt0.p(this.f6878g, "alpha", 0L, -1L, new LinearInterpolator(), new float[]{1.0f, 0.0f}), bt0.p(this.f6874c, "translationX", 0L, -1L, linearInterpolator, new float[]{0.0f, gVar.a - this.f6880i.a}), bt0.p(this.f6874c, "translationY", 0L, -1L, linearInterpolator, new float[]{0.0f, gVar.b - this.f6880i.b})}), new Runnable() { // from class: l.ss50
            @Override // java.lang.Runnable
            public final void run() {
                this.f19260a.m8652A(bLiveOperationItem);
            }
        });
        this.f6882k = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: J */
    public void m8661J(boolean z) {
        xdl0.M0(this.f6878g, z);
    }

    @Override // p002l.azl
    /* JADX INFO: renamed from: a */
    public void mo8662a(BLiveOperationItem bLiveOperationItem) {
        m8654C(bLiveOperationItem);
        m8657F(bLiveOperationItem);
        m8656E(bLiveOperationItem);
        this.f6879h.m19716C4(bLiveOperationItem);
        if (bLiveOperationItem.isForPrepare) {
            m8659H();
        }
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m8664l(View view) {
        zs50.m27528a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m8665m(xdl0.g gVar) {
        if (this.f6880i == null) {
            this.f6880i = xdl0.i0(this.f6874c);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorF = bt0.f(bt0.x(150L, new Animator[]{bt0.l(this.f6874c, bt0.i, 0L, -1L, linearInterpolator, new float[]{0.75f, 1.0f}), bt0.p(this.f6878g, "alpha", 0L, -1L, new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.p(this.f6874c, "translationX", 0L, -1L, linearInterpolator, new float[]{gVar.a - this.f6880i.a, 0.0f}), bt0.p(this.f6874c, "translationY", 0L, -1L, linearInterpolator, new float[]{gVar.b - this.f6880i.b, 0.0f})}), new Runnable() { // from class: l.ts50
            @Override // java.lang.Runnable
            public final void run() {
                this.f20365a.m8669s();
            }
        });
        this.f6883l = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m8663i1(os50 os50Var) {
        this.f6879h = os50Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8664l(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.rs50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18666a.m8651u(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m8667p() {
        this.f6879h.mo5949n();
    }

    /* JADX INFO: renamed from: q */
    public void m8668q(boolean z) {
        xdl0.M(this, z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8669s() {
        this.f6879h.m25548F2().OperationsEvent.refreshOperationMessage().j(new ku50.C0652a(8100).m16799a());
    }

    public void setCountDownText(String str) {
        xdl0.M0(this.f6878g, true);
        this.f6878g.setText(str);
    }

    public void setViewForReady(boolean z) {
        if (!z) {
            setScaleX(1.0f);
            setScaleY(1.0f);
            setAlpha(1.0f);
            this.f6879h.m19719G4(false);
            return;
        }
        Animator animatorF = bt0.f(bt0.z(new Animator[]{bt0.l(this, bt0.i, 0L, 300L, bt0.d, new float[]{0.1f, 1.0f}), bt0.l(this, View.ALPHA, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, 255.0f})}), new Runnable() { // from class: l.qs50
            @Override // java.lang.Runnable
            public final void run() {
                this.f18200a.m8674z();
            }
        });
        this.f6884m = animatorF;
        animatorF.start();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8670v(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        xdl0.M(this.f6875d, false);
        this.f6879h.m19722j4(bLiveOperationItemCountDown);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8671w(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (NullChecker.a(this.f6879h)) {
            this.f6879h.m14207z3(200L, new Runnable() { // from class: l.xs50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22437a.m8670v(bLiveOperationItemCountDown);
                }
            });
        } else {
            CrashHelper.c(new IllegalArgumentException("OperationItemView: renderCircleCountDown presenter null"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8672x(BLiveOperationItemLabel bLiveOperationItemLabel) {
        xdl0.M(this.f6877f, true);
        this.f6877f.setText(bLiveOperationItemLabel.content);
        this.f6877f.setTextColor(Color.parseColor(uep0.o(bLiveOperationItemLabel.foreColor, bLiveOperationItemLabel.foreTransparency)));
        this.f6877f.setBackground(zb2.b(uep0.o(bLiveOperationItemLabel.backColor, bLiveOperationItemLabel.backTransparency), 5));
        int operationLeftMargin = getOperationLeftMargin();
        xdl0.X(this.f6877f, 0);
        boolean zIsTopLeft = bLiveOperationItemLabel.isTopLeft();
        VText vText = this.f6877f;
        if (zIsTopLeft) {
            xdl0.V(vText, operationLeftMargin - t100.e);
        } else {
            xdl0.V(vText, operationLeftMargin + t100.d(19.0f));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8673y(BLiveOperationItemMask bLiveOperationItemMask) {
        xdl0.M(this.f6876e, true);
        int iD = t100.d(bLiveOperationItemMask.size);
        xdl0.D0(iD, new View[]{this.f6876e});
        xdl0.C0(this.f6876e, iD);
        this.f6876e.setHierarchy(qib0.G.l().K(RoundingParams.c(iD / 2.0f)).a());
        hxs.t("context_livingAct", this.f6876e, bLiveOperationItemMask.maskUrl, iD);
        int operationLeftMargin = getOperationLeftMargin();
        if (bLiveOperationItemMask.isTopLeft()) {
            xdl0.V(this.f6876e, operationLeftMargin - t100.e);
            xdl0.X(this.f6876e, 0);
            return;
        }
        if (bLiveOperationItemMask.isTopRight()) {
            xdl0.V(this.f6876e, (operationLeftMargin + t100.d(36.0f)) - iD);
            xdl0.X(this.f6876e, 0);
            return;
        }
        boolean zIsTopMiddle = bLiveOperationItemMask.isTopMiddle();
        VDraweeView vDraweeView = this.f6876e;
        if (zIsTopMiddle) {
            xdl0.V(vDraweeView, (operationLeftMargin + t100.d(16.0f)) - (iD / 2));
            xdl0.X(this.f6876e, 0);
        } else {
            int i = iD / 2;
            xdl0.V(vDraweeView, (operationLeftMargin + t100.d(16.0f)) - i);
            xdl0.X(this.f6876e, (this.f6873b.getHeight() / 2) - i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8674z() {
        os50 os50Var = this.f6879h;
        if (os50Var == null) {
            return;
        }
        os50Var.m19719G4(false);
        boolean zBooleanValue = ((Boolean) this.f6879h.m14184F3(new ut50(8100))).booleanValue();
        BLiveOperationItem bLiveOperationItemM19727p4 = this.f6879h.m19727p4();
        if (NullChecker.a(bLiveOperationItemM19727p4) && bLiveOperationItemM19727p4.enableEntranceAnim() && !zBooleanValue) {
            this.f6879h.m19720H4();
        }
    }

    public OperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6881j = 150;
    }
}
