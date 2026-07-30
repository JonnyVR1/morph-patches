package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import p147v.VDraweeView;
import p149l.atj0;
import p149l.dqe;
import p149l.fge;
import p149l.hxs;
import p149l.jbu;
import p149l.ksj0;
import p149l.t100;
import p149l.uvr;
import p149l.xdl0;
import p149l.xsj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftPagerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f50228d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f50229e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50230f;

    /* JADX INFO: renamed from: g */
    public TextView f50231g;

    /* JADX INFO: renamed from: h */
    public MomoLayUpSVGAImageView f50232h;

    /* JADX INFO: renamed from: i */
    public XEGiftView f50233i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f50234j;

    /* JADX INFO: renamed from: k */
    public TextView f50235k;

    /* JADX INFO: renamed from: l */
    public TextView f50236l;

    /* JADX INFO: renamed from: m */
    public UpgradeGiftSelectButton f50237m;

    /* JADX INFO: renamed from: n */
    public xsj0 f50238n;

    /* JADX INFO: renamed from: o */
    public BLiveUpgradeGiftResLevel f50239o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f50240p;

    public UpgradeGiftPagerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m74327n0() {
        boolean zM162666E1 = uvr.m196087d().m162666E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f50239o;
        if (zM162666E1) {
            fge.m121214r(this.f50229e, new dqe(bLiveUpgradeGiftResLevel.resources.shadowId));
        } else {
            String strM147081h = ksj0.m147081h(bLiveUpgradeGiftResLevel.resources.shadowId, 23000);
            this.f50228d.clearInsertData();
            this.f50228d.startSVGAAnimWithLayJson(strM147081h, -1, null, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m74328p0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM210777d = this.f50238n.m210777d();
        if (bLiveUpgradeGiftInfoItemM210777d.isEquipped() || bLiveUpgradeGiftInfoItemM210777d.isUnLocked()) {
            m74327n0();
            m74333l0();
            m74332k0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74329h0(View view) {
        atj0.m98816a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74330i0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM210777d = this.f50238n.m210777d();
        if (bLiveUpgradeGiftInfoItemM210777d.isEquipped() || bLiveUpgradeGiftInfoItemM210777d.isUnLocked()) {
            this.f50228d.stopAnimation();
            this.f50232h.stopAnimation();
        }
        m74331j0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74331j0() {
        AnimatorSet animatorSet = this.f50240p;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f50240p.end();
        this.f50240p.cancel();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74332k0() {
        if (this.f50240p == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50234j, (Property<VDraweeView, Float>) View.SCALE_X, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat.setDuration(1500L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50234j, (Property<VDraweeView, Float>) View.SCALE_Y, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setDuration(1500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50240p = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        m74336q0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74333l0() {
        boolean zM162666E1 = uvr.m196087d().m162666E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f50239o;
        if (zM162666E1) {
            fge.m121214r(this.f50233i, new dqe(bLiveUpgradeGiftResLevel.resources.meteorId));
        } else {
            String strM147081h = ksj0.m147081h(bLiveUpgradeGiftResLevel.resources.meteorId, 23000);
            this.f50232h.clearInsertData();
            this.f50232h.startSVGAAnimWithLayJson(strM147081h, -1, null, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74334m0(xsj0 xsj0Var) {
        String str = xsj0Var.m210777d().name;
        this.f50231g.setTextSize(16.0f);
        float fMeasureText = this.f50231g.getPaint().measureText(str);
        float fM186890d = t100.m186890d(101.0f);
        TextView textView = this.f50231g;
        if (fMeasureText > fM186890d) {
            textView.setTextSize(11.0f);
        } else {
            textView.setTextSize(16.0f);
        }
        this.f50231g.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public void m74335o0(xsj0 xsj0Var) {
        this.f50238n = xsj0Var;
        BLiveUpgradeGiftResLevel targetRedLevel = xsj0Var.m210777d().getTargetRedLevel();
        this.f50239o = targetRedLevel;
        hxs.m133406s("context_livingAct", this.f50230f, targetRedLevel.getStatusBgCardUrl(xsj0Var.m210777d().status));
        hxs.m133406s("context_livingAct", this.f50234j, xsj0Var.m210777d().hdUrl);
        m74334m0(xsj0Var);
        this.f50235k.setText(String.valueOf(xsj0Var.m210777d().purchasePrice));
        xdl0.m208344M(this.f50236l, xsj0Var.m210777d().expiredTime > 0);
        this.f50236l.setText(jbu.m140812T(xsj0Var.m210777d().expiredTime));
        this.f50237m.m74357c(xsj0Var);
    }

    public void onDestroy() {
        m74330i0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74329h0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m74336q0() {
        m74331j0();
        AnimatorSet animatorSet = this.f50240p;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m74337r0(boolean z) {
        if (z) {
            m74328p0();
        } else {
            m74330i0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m74338s0(boolean z) {
        this.f50238n.m210777d().status = z ? "equipped" : "unlocked";
        this.f50237m.m74357c(this.f50238n);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
