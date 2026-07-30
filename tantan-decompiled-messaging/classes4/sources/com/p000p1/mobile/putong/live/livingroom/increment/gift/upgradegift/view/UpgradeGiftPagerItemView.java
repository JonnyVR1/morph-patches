package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.hxs;
import l.jbu;
import l.t100;
import l.uvr;
import l.xdl0;
import p002l.atj0;
import p002l.dqe;
import p002l.fge;
import p002l.ksj0;
import p002l.xsj0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftPagerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f6270d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f6271e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6272f;

    /* JADX INFO: renamed from: g */
    public TextView f6273g;

    /* JADX INFO: renamed from: h */
    public MomoLayUpSVGAImageView f6274h;

    /* JADX INFO: renamed from: i */
    public XEGiftView f6275i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f6276j;

    /* JADX INFO: renamed from: k */
    public TextView f6277k;

    /* JADX INFO: renamed from: l */
    public TextView f6278l;

    /* JADX INFO: renamed from: m */
    public UpgradeGiftSelectButton f6279m;

    /* JADX INFO: renamed from: n */
    public xsj0 f6280n;

    /* JADX INFO: renamed from: o */
    public BLiveUpgradeGiftResLevel f6281o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f6282p;

    public UpgradeGiftPagerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m7908n0() {
        boolean zE1 = uvr.d().E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f6281o;
        if (zE1) {
            fge.m13166r(this.f6271e, new dqe(bLiveUpgradeGiftResLevel.resources.shadowId));
        } else {
            String strM16781h = ksj0.m16781h(bLiveUpgradeGiftResLevel.resources.shadowId, 23000);
            this.f6270d.clearInsertData();
            this.f6270d.startSVGAAnimWithLayJson(strM16781h, -1, (SVGAClickAreaListener) null, (SVGAAnimListenerAdapter) null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m7909p0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM26104d = this.f6280n.m26104d();
        if (bLiveUpgradeGiftInfoItemM26104d.isEquipped() || bLiveUpgradeGiftInfoItemM26104d.isUnLocked()) {
            m7908n0();
            m7914l0();
            m7913k0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7910h0(View view) {
        atj0.m10073a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7911i0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM26104d = this.f6280n.m26104d();
        if (bLiveUpgradeGiftInfoItemM26104d.isEquipped() || bLiveUpgradeGiftInfoItemM26104d.isUnLocked()) {
            this.f6270d.stopAnimation();
            this.f6274h.stopAnimation();
        }
        m7912j0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7912j0() {
        AnimatorSet animatorSet = this.f6282p;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f6282p.end();
        this.f6282p.cancel();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7913k0() {
        if (this.f6282p == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6276j, (Property<VDraweeView, Float>) View.SCALE_X, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat.setDuration(1500L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6276j, (Property<VDraweeView, Float>) View.SCALE_Y, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setDuration(1500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6282p = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        m7917q0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7914l0() {
        boolean zE1 = uvr.d().E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f6281o;
        if (zE1) {
            fge.m13166r(this.f6275i, new dqe(bLiveUpgradeGiftResLevel.resources.meteorId));
        } else {
            String strM16781h = ksj0.m16781h(bLiveUpgradeGiftResLevel.resources.meteorId, 23000);
            this.f6274h.clearInsertData();
            this.f6274h.startSVGAAnimWithLayJson(strM16781h, -1, (SVGAClickAreaListener) null, (SVGAAnimListenerAdapter) null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7915m0(xsj0 xsj0Var) {
        String str = xsj0Var.m26104d().name;
        this.f6273g.setTextSize(16.0f);
        float fMeasureText = this.f6273g.getPaint().measureText(str);
        float fD = t100.d(101.0f);
        TextView textView = this.f6273g;
        if (fMeasureText > fD) {
            textView.setTextSize(11.0f);
        } else {
            textView.setTextSize(16.0f);
        }
        this.f6273g.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public void m7916o0(xsj0 xsj0Var) {
        this.f6280n = xsj0Var;
        BLiveUpgradeGiftResLevel targetRedLevel = xsj0Var.m26104d().getTargetRedLevel();
        this.f6281o = targetRedLevel;
        hxs.s("context_livingAct", this.f6272f, targetRedLevel.getStatusBgCardUrl(xsj0Var.m26104d().status));
        hxs.s("context_livingAct", this.f6276j, xsj0Var.m26104d().hdUrl);
        m7915m0(xsj0Var);
        this.f6277k.setText(String.valueOf(xsj0Var.m26104d().purchasePrice));
        xdl0.M(this.f6278l, xsj0Var.m26104d().expiredTime > 0);
        this.f6278l.setText(jbu.T(xsj0Var.m26104d().expiredTime));
        this.f6279m.m7938c(xsj0Var);
    }

    public void onDestroy() {
        m7911i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7910h0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m7917q0() {
        m7912j0();
        AnimatorSet animatorSet = this.f6282p;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m7918r0(boolean z) {
        if (z) {
            m7909p0();
        } else {
            m7911i0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m7919s0(boolean z) {
        this.f6280n.m26104d().status = z ? "equipped" : "unlocked";
        this.f6279m.m7938c(this.f6280n);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
