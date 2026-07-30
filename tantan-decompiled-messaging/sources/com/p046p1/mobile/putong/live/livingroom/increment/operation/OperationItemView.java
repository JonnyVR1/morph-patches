package com.p046p1.mobile.putong.live.livingroom.increment.operation;

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
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemMask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.azl;
import p149l.bt0;
import p149l.dt0;
import p149l.e51;
import p149l.hxs;
import p149l.ku50;
import p149l.os50;
import p149l.qib0;
import p149l.s7m;
import p149l.t100;
import p149l.uep0;
import p149l.ut50;
import p149l.xdl0;
import p149l.zb2;
import p149l.zs50;

/* JADX INFO: loaded from: classes4.dex */
public class OperationItemView extends RelativeLayout implements s7m<os50>, azl {

    /* JADX INFO: renamed from: a */
    public OperationItemView f50830a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f50831b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50832c;

    /* JADX INFO: renamed from: d */
    public OperationCountDownCircleView f50833d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50834e;

    /* JADX INFO: renamed from: f */
    public VText f50835f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f50836g;

    /* JADX INFO: renamed from: h */
    public os50 f50837h;

    /* JADX INFO: renamed from: i */
    public xdl0.C21104g f50838i;

    /* JADX INFO: renamed from: j */
    public final int f50839j;

    /* JADX INFO: renamed from: k */
    public Animator f50840k;

    /* JADX INFO: renamed from: l */
    public Animator f50841l;

    /* JADX INFO: renamed from: m */
    public Animator f50842m;

    public OperationItemView(Context context) {
        super(context);
        this.f50839j = 150;
    }

    private int getOperationLeftMargin() {
        return (this.f50830a.getWidth() - this.f50831b.getWidth()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m75041u(View view) {
        this.f50837h.m165725l4();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m75042A(BLiveOperationItem bLiveOperationItem) {
        this.f50837h.m206028F2().OperationsEvent.messageOpen().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147256a());
    }

    /* JADX INFO: renamed from: B */
    public void m75043B(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        Pair<Float, Float> pairM165727o4 = this.f50837h.m165727o4(bLiveOperationItemCountDown);
        OperationCountDownCircleView operationCountDownCircleView = this.f50833d;
        if (pairM165727o4 == null) {
            xdl0.m208344M(operationCountDownCircleView, false);
            return;
        }
        xdl0.m208344M(operationCountDownCircleView, true);
        this.f50833d.setDuration(bLiveOperationItemCountDown.getTheRemainingTime());
        this.f50833d.m75022e(((Float) pairM165727o4.first).floatValue(), ((Float) pairM165727o4.second).floatValue());
        this.f50833d.setOnEnd(new Runnable() { // from class: l.us50
            @Override // java.lang.Runnable
            public final void run() {
                this.f177940a.m75059w(bLiveOperationItemCountDown);
            }
        });
        this.f50833d.m75023f();
    }

    /* JADX INFO: renamed from: C */
    public final void m75044C(BLiveOperationItem bLiveOperationItem) {
        hxs.m133407t("context_livingAct", this.f50832c, bLiveOperationItem.icon.iconUrl, t100.m186890d(32.0f));
        if (TEnum.equals(bLiveOperationItem.icon.iconType, "countdown")) {
            m75043B(bLiveOperationItem.icon.countdown);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m75045E(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemLabel bLiveOperationItemLabel = bLiveOperationItem.icon.label;
        if (bLiveOperationItemLabel == null) {
            xdl0.m208344M(this.f50835f, false);
        } else {
            e51.m114742G(new Runnable() { // from class: l.ws50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187865a.m75060x(bLiveOperationItemLabel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m75046F(BLiveOperationItem bLiveOperationItem) {
        final BLiveOperationItemMask bLiveOperationItemMask = bLiveOperationItem.icon.mask;
        if (bLiveOperationItemMask == null) {
            xdl0.m208344M(this.f50834e, false);
        } else {
            e51.m114742G(new Runnable() { // from class: l.vs50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182799a.m75061y(bLiveOperationItemMask);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m75047G() {
        this.f50833d.m75021d();
        dt0.m113501A(this.f50840k);
        dt0.m113501A(this.f50841l);
        dt0.m113501A(this.f50842m);
    }

    /* JADX INFO: renamed from: H */
    public void m75048H() {
        this.f50837h.m165721G4(true);
        setScaleX(0.1f);
        setScaleY(0.1f);
        setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: I */
    public void m75049I(final BLiveOperationItem bLiveOperationItem, xdl0.C21104g c21104g) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f50838i = xdl0.m208380i0(this.f50832c);
        Animator animatorM103733f = bt0.m103733f(bt0.m103751x(150L, bt0.m103739l(this.f50832c, bt0.f77162i, 0L, -1L, linearInterpolator, 1.0f, 0.75f), bt0.m103743p(this.f50836g, "alpha", 0L, -1L, new LinearInterpolator(), 1.0f, 0.0f), bt0.m103743p(this.f50832c, "translationX", 0L, -1L, linearInterpolator, 0.0f, c21104g.f192418a - this.f50838i.f192418a), bt0.m103743p(this.f50832c, "translationY", 0L, -1L, linearInterpolator, 0.0f, c21104g.f192419b - this.f50838i.f192419b)), new Runnable() { // from class: l.ss50
            @Override // java.lang.Runnable
            public final void run() {
                this.f166161a.m75042A(bLiveOperationItem);
            }
        });
        this.f50840k = animatorM103733f;
        animatorM103733f.start();
    }

    /* JADX INFO: renamed from: J */
    public void m75050J(boolean z) {
        xdl0.m208345M0(this.f50836g, z);
    }

    @Override // p149l.azl
    /* JADX INFO: renamed from: a */
    public void mo75051a(BLiveOperationItem bLiveOperationItem) {
        m75044C(bLiveOperationItem);
        m75046F(bLiveOperationItem);
        m75045E(bLiveOperationItem);
        this.f50837h.m165718C4(bLiveOperationItem);
        if (bLiveOperationItem.isForPrepare) {
            m75048H();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m75052l(View view) {
        zs50.m219999a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m75053m(xdl0.C21104g c21104g) {
        if (this.f50838i == null) {
            this.f50838i = xdl0.m208380i0(this.f50832c);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103733f = bt0.m103733f(bt0.m103751x(150L, bt0.m103739l(this.f50832c, bt0.f77162i, 0L, -1L, linearInterpolator, 0.75f, 1.0f), bt0.m103743p(this.f50836g, "alpha", 0L, -1L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103743p(this.f50832c, "translationX", 0L, -1L, linearInterpolator, c21104g.f192418a - this.f50838i.f192418a, 0.0f), bt0.m103743p(this.f50832c, "translationY", 0L, -1L, linearInterpolator, c21104g.f192419b - this.f50838i.f192419b, 0.0f)), new Runnable() { // from class: l.ts50
            @Override // java.lang.Runnable
            public final void run() {
                this.f171907a.m75057s();
            }
        });
        this.f50841l = animatorM103733f;
        animatorM103733f.start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(os50 os50Var) {
        this.f50837h = os50Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75052l(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.rs50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160810a.m75041u(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m75055p() {
        this.f50837h.mo69117n();
    }

    /* JADX INFO: renamed from: q */
    public void m75056q(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m75057s() {
        this.f50837h.m206028F2().OperationsEvent.refreshOperationMessage().mo172463j(new ku50.C18083a(8100).m147256a());
    }

    public void setCountDownText(String str) {
        xdl0.m208345M0(this.f50836g, true);
        this.f50836g.setText(str);
    }

    public void setViewForReady(boolean z) {
        if (!z) {
            setScaleX(1.0f);
            setScaleY(1.0f);
            setAlpha(1.0f);
            this.f50837h.m165721G4(false);
            return;
        }
        Animator animatorM103733f = bt0.m103733f(bt0.m103753z(bt0.m103739l(this, bt0.f77162i, 0L, 300L, bt0.f77157d, 0.1f, 1.0f), bt0.m103739l(this, View.ALPHA, 0L, 300L, new LinearInterpolator(), 0.0f, 255.0f)), new Runnable() { // from class: l.qs50
            @Override // java.lang.Runnable
            public final void run() {
                this.f156102a.m75062z();
            }
        });
        this.f50842m = animatorM103733f;
        animatorM103733f.start();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m75058v(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        xdl0.m208344M(this.f50833d, false);
        this.f50837h.m165723j4(bLiveOperationItemCountDown);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m75059w(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (NullChecker.m81303a(this.f50837h)) {
            this.f50837h.m129320z3(200L, new Runnable() { // from class: l.xs50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194202a.m75058v(bLiveOperationItemCountDown);
                }
            });
        } else {
            CrashHelper.m81296c(new IllegalArgumentException("OperationItemView: renderCircleCountDown presenter null"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m75060x(BLiveOperationItemLabel bLiveOperationItemLabel) {
        xdl0.m208344M(this.f50835f, true);
        this.f50835f.setText(bLiveOperationItemLabel.content);
        this.f50835f.setTextColor(Color.parseColor(uep0.m193328o(bLiveOperationItemLabel.foreColor, bLiveOperationItemLabel.foreTransparency)));
        this.f50835f.setBackground(zb2.m217814b(uep0.m193328o(bLiveOperationItemLabel.backColor, bLiveOperationItemLabel.backTransparency), 5));
        int operationLeftMargin = getOperationLeftMargin();
        xdl0.m208360X(this.f50835f, 0);
        boolean zIsTopLeft = bLiveOperationItemLabel.isTopLeft();
        VText vText = this.f50835f;
        if (zIsTopLeft) {
            xdl0.m208358V(vText, operationLeftMargin - t100.f167256e);
        } else {
            xdl0.m208358V(vText, operationLeftMargin + t100.m186890d(19.0f));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m75061y(BLiveOperationItemMask bLiveOperationItemMask) {
        xdl0.m208344M(this.f50834e, true);
        int iM186890d = t100.m186890d(bLiveOperationItemMask.size);
        xdl0.m208327D0(iM186890d, this.f50834e);
        xdl0.m208325C0(this.f50834e, iM186890d);
        this.f50834e.setHierarchy(qib0.f154691G.m184722l().m116870K(RoundingParams.m8249c(iM186890d / 2.0f)).m116872a());
        hxs.m133407t("context_livingAct", this.f50834e, bLiveOperationItemMask.maskUrl, iM186890d);
        int operationLeftMargin = getOperationLeftMargin();
        if (bLiveOperationItemMask.isTopLeft()) {
            xdl0.m208358V(this.f50834e, operationLeftMargin - t100.f167256e);
            xdl0.m208360X(this.f50834e, 0);
            return;
        }
        if (bLiveOperationItemMask.isTopRight()) {
            xdl0.m208358V(this.f50834e, (operationLeftMargin + t100.m186890d(36.0f)) - iM186890d);
            xdl0.m208360X(this.f50834e, 0);
            return;
        }
        boolean zIsTopMiddle = bLiveOperationItemMask.isTopMiddle();
        VDraweeView vDraweeView = this.f50834e;
        if (zIsTopMiddle) {
            xdl0.m208358V(vDraweeView, (operationLeftMargin + t100.m186890d(16.0f)) - (iM186890d / 2));
            xdl0.m208360X(this.f50834e, 0);
        } else {
            int i = iM186890d / 2;
            xdl0.m208358V(vDraweeView, (operationLeftMargin + t100.m186890d(16.0f)) - i);
            xdl0.m208360X(this.f50834e, (this.f50831b.getHeight() / 2) - i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m75062z() {
        os50 os50Var = this.f50837h;
        if (os50Var == null) {
            return;
        }
        os50Var.m165721G4(false);
        boolean zBooleanValue = ((Boolean) this.f50837h.m129297F3(new ut50(8100))).booleanValue();
        BLiveOperationItem bLiveOperationItemM165728p4 = this.f50837h.m165728p4();
        if (NullChecker.m81303a(bLiveOperationItemM165728p4) && bLiveOperationItemM165728p4.enableEntranceAnim() && !zBooleanValue) {
            this.f50837h.m165722H4();
        }
    }

    public OperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50839j = 150;
    }
}
