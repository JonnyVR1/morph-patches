package com.p051p1.mobile.putong.live.livingroom.increment.operation;

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
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemMask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.a260;
import p153l.bnl0;
import p153l.f160;
import p153l.gc2;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.l51;
import p153l.q260;
import p153l.qa00;
import p153l.u060;
import p153l.uqb0;
import p153l.v1m;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class OperationItemView extends RelativeLayout implements iam<u060>, v1m {

    /* JADX INFO: renamed from: a */
    public OperationItemView f51678a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f51679b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51680c;

    /* JADX INFO: renamed from: d */
    public OperationCountDownCircleView f51681d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51682e;

    /* JADX INFO: renamed from: f */
    public VText f51683f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f51684g;

    /* JADX INFO: renamed from: h */
    public u060 f51685h;

    /* JADX INFO: renamed from: i */
    public bnl0.C16067g f51686i;

    /* JADX INFO: renamed from: j */
    public final int f51687j;

    /* JADX INFO: renamed from: k */
    public Animator f51688k;

    /* JADX INFO: renamed from: l */
    public Animator f51689l;

    /* JADX INFO: renamed from: m */
    public Animator f51690m;

    public OperationItemView(Context context) {
        super(context);
        this.f51687j = 150;
    }

    private int getOperationLeftMargin() {
        return (this.f51678a.getWidth() - this.f51679b.getWidth()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m76224u(View view) {
        this.f51685h.m193780l4();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m76225A(BLiveOperationItem bLiveOperationItem) {
        this.f51685h.m213811F2().OperationsEvent.messageOpen().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175002a());
    }

    /* JADX INFO: renamed from: B */
    public void m76226B(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        Pair<Float, Float> pairM193782o4 = this.f51685h.m193782o4(bLiveOperationItemCountDown);
        OperationCountDownCircleView operationCountDownCircleView = this.f51681d;
        if (pairM193782o4 == null) {
            bnl0.m105524M(operationCountDownCircleView, false);
            return;
        }
        bnl0.m105524M(operationCountDownCircleView, true);
        this.f51681d.setDuration(bLiveOperationItemCountDown.getTheRemainingTime());
        this.f51681d.m76205e(((Float) pairM193782o4.first).floatValue(), ((Float) pairM193782o4.second).floatValue());
        this.f51681d.setOnEnd(new Runnable() { // from class: l.a160
            @Override // java.lang.Runnable
            public final void run() {
                this.f67785a.m76242w(bLiveOperationItemCountDown);
            }
        });
        this.f51681d.m76206f();
    }

    /* JADX INFO: renamed from: C */
    public final void m76227C(BLiveOperationItem bLiveOperationItem) {
        izs.m142869t("context_livingAct", this.f51680c, bLiveOperationItem.icon.iconUrl, qa00.m175859d(32.0f));
        if (TEnum.equals(bLiveOperationItem.icon.iconType, "countdown")) {
            m76226B(bLiveOperationItem.icon.countdown);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m76228E(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemLabel bLiveOperationItemLabel = bLiveOperationItem.icon.label;
        if (bLiveOperationItemLabel == null) {
            bnl0.m105524M(this.f51683f, false);
        } else {
            l51.m152887G(new Runnable() { // from class: l.c160
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79336a.m76243x(bLiveOperationItemLabel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m76229F(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemMask bLiveOperationItemMask = bLiveOperationItem.icon.mask;
        if (bLiveOperationItemMask == null) {
            bnl0.m105524M(this.f51682e, false);
        } else {
            l51.m152887G(new Runnable() { // from class: l.b160
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74324a.m76244y(bLiveOperationItemMask);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m76230G() {
        this.f51681d.m76204d();
        it0.m142007A(this.f51688k);
        it0.m142007A(this.f51689l);
        it0.m142007A(this.f51690m);
    }

    /* JADX INFO: renamed from: H */
    public void m76231H() {
        this.f51685h.m193776G4(true);
        setScaleX(0.1f);
        setScaleY(0.1f);
        setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: I */
    public void m76232I(final BLiveOperationItem bLiveOperationItem, bnl0.C16067g c16067g) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f51686i = bnl0.m105560i0(this.f51680c);
        Animator animatorM132160f = gt0.m132160f(gt0.m132178x(150L, gt0.m132166l(this.f51680c, gt0.f106354i, 0L, -1L, linearInterpolator, 1.0f, 0.75f), gt0.m132170p(this.f51684g, "alpha", 0L, -1L, new LinearInterpolator(), 1.0f, 0.0f), gt0.m132170p(this.f51680c, "translationX", 0L, -1L, linearInterpolator, 0.0f, c16067g.f77559a - this.f51686i.f77559a), gt0.m132170p(this.f51680c, "translationY", 0L, -1L, linearInterpolator, 0.0f, c16067g.f77560b - this.f51686i.f77560b)), new Runnable() { // from class: l.y060
            @Override // java.lang.Runnable
            public final void run() {
                this.f196947a.m76225A(bLiveOperationItem);
            }
        });
        this.f51688k = animatorM132160f;
        animatorM132160f.start();
    }

    /* JADX INFO: renamed from: J */
    public void m76233J(boolean z) {
        bnl0.m105525M0(this.f51684g, z);
    }

    @Override // p153l.v1m
    /* JADX INFO: renamed from: a */
    public void mo76234a(BLiveOperationItem bLiveOperationItem) {
        m76227C(bLiveOperationItem);
        m76229F(bLiveOperationItem);
        m76228E(bLiveOperationItem);
        this.f51685h.m193773C4(bLiveOperationItem);
        if (bLiveOperationItem.isForPrepare) {
            m76231H();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m76235l(View view) {
        f160.m123556a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m76236m(bnl0.C16067g c16067g) {
        if (this.f51686i == null) {
            this.f51686i = bnl0.m105560i0(this.f51680c);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132160f = gt0.m132160f(gt0.m132178x(150L, gt0.m132166l(this.f51680c, gt0.f106354i, 0L, -1L, linearInterpolator, 0.75f, 1.0f), gt0.m132170p(this.f51684g, "alpha", 0L, -1L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132170p(this.f51680c, "translationX", 0L, -1L, linearInterpolator, c16067g.f77559a - this.f51686i.f77559a, 0.0f), gt0.m132170p(this.f51680c, "translationY", 0L, -1L, linearInterpolator, c16067g.f77560b - this.f51686i.f77560b, 0.0f)), new Runnable() { // from class: l.z060
            @Override // java.lang.Runnable
            public final void run() {
                this.f202285a.m76240s();
            }
        });
        this.f51689l = animatorM132160f;
        animatorM132160f.start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u060 u060Var) {
        this.f51685h = u060Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76235l(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.x060
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191870a.m76224u(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m76238p() {
        this.f51685h.mo70300n();
    }

    /* JADX INFO: renamed from: q */
    public void m76239q(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m76240s() {
        this.f51685h.m213811F2().OperationsEvent.refreshOperationMessage().mo199273j(new q260.C19505a(8100).m175002a());
    }

    public void setCountDownText(String str) {
        bnl0.m105525M0(this.f51684g, true);
        this.f51684g.setText(str);
    }

    public void setViewForReady(boolean z) {
        if (!z) {
            setScaleX(1.0f);
            setScaleY(1.0f);
            setAlpha(1.0f);
            this.f51685h.m193776G4(false);
            return;
        }
        Animator animatorM132160f = gt0.m132160f(gt0.m132180z(gt0.m132166l(this, gt0.f106354i, 0L, 300L, gt0.f106349d, 0.1f, 1.0f), gt0.m132166l(this, View.ALPHA, 0L, 300L, new LinearInterpolator(), 0.0f, 255.0f)), new Runnable() { // from class: l.w060
            @Override // java.lang.Runnable
            public final void run() {
                this.f186543a.m76245z();
            }
        });
        this.f51690m = animatorM132160f;
        animatorM132160f.start();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m76241v(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        bnl0.m105524M(this.f51681d, false);
        this.f51685h.m193778j4(bLiveOperationItemCountDown);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m76242w(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (NullChecker.m82486a(this.f51685h)) {
            this.f51685h.m138879z3(200L, new Runnable() { // from class: l.d160
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84651a.m76241v(bLiveOperationItemCountDown);
                }
            });
        } else {
            CrashHelper.m82479c(new IllegalArgumentException("OperationItemView: renderCircleCountDown presenter null"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m76243x(BLiveOperationItemLabel bLiveOperationItemLabel) {
        bnl0.m105524M(this.f51683f, true);
        this.f51683f.setText(bLiveOperationItemLabel.content);
        this.f51683f.setTextColor(Color.parseColor(ynp0.m216938o(bLiveOperationItemLabel.foreColor, bLiveOperationItemLabel.foreTransparency)));
        this.f51683f.setBackground(gc2.m129823b(ynp0.m216938o(bLiveOperationItemLabel.backColor, bLiveOperationItemLabel.backTransparency), 5));
        int operationLeftMargin = getOperationLeftMargin();
        bnl0.m105540X(this.f51683f, 0);
        boolean zIsTopLeft = bLiveOperationItemLabel.isTopLeft();
        VText vText = this.f51683f;
        if (zIsTopLeft) {
            bnl0.m105538V(vText, operationLeftMargin - qa00.f156318e);
        } else {
            bnl0.m105538V(vText, operationLeftMargin + qa00.m175859d(19.0f));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m76244y(BLiveOperationItemMask bLiveOperationItemMask) {
        bnl0.m105524M(this.f51682e, true);
        int iM175859d = qa00.m175859d(bLiveOperationItemMask.size);
        bnl0.m105507D0(iM175859d, this.f51682e);
        bnl0.m105505C0(this.f51682e, iM175859d);
        this.f51682e.setHierarchy(uqb0.f180374G.m98795l().m211636K(RoundingParams.m8303c(iM175859d / 2.0f)).m211638a());
        izs.m142869t("context_livingAct", this.f51682e, bLiveOperationItemMask.maskUrl, iM175859d);
        int operationLeftMargin = getOperationLeftMargin();
        if (bLiveOperationItemMask.isTopLeft()) {
            bnl0.m105538V(this.f51682e, operationLeftMargin - qa00.f156318e);
            bnl0.m105540X(this.f51682e, 0);
            return;
        }
        if (bLiveOperationItemMask.isTopRight()) {
            bnl0.m105538V(this.f51682e, (operationLeftMargin + qa00.m175859d(36.0f)) - iM175859d);
            bnl0.m105540X(this.f51682e, 0);
            return;
        }
        boolean zIsTopMiddle = bLiveOperationItemMask.isTopMiddle();
        VDraweeView vDraweeView = this.f51682e;
        if (zIsTopMiddle) {
            bnl0.m105538V(vDraweeView, (operationLeftMargin + qa00.m175859d(16.0f)) - (iM175859d / 2));
            bnl0.m105540X(this.f51682e, 0);
        } else {
            int i = iM175859d / 2;
            bnl0.m105538V(vDraweeView, (operationLeftMargin + qa00.m175859d(16.0f)) - i);
            bnl0.m105540X(this.f51682e, (this.f51679b.getHeight() / 2) - i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m76245z() {
        u060 u060Var = this.f51685h;
        if (u060Var == null) {
            return;
        }
        u060Var.m193776G4(false);
        boolean zBooleanValue = ((Boolean) this.f51685h.m138856F3(new a260(8100))).booleanValue();
        BLiveOperationItem bLiveOperationItemM193783p4 = this.f51685h.m193783p4();
        if (NullChecker.m82486a(bLiveOperationItemM193783p4) && bLiveOperationItemM193783p4.enableEntranceAnim() && !zBooleanValue) {
            this.f51685h.m193777H4();
        }
    }

    public OperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51687j = 150;
    }
}
