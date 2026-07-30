package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import p151v.VDraweeView;
import p153l.a2k0;
import p153l.bnl0;
import p153l.d2k0;
import p153l.hre;
import p153l.izs;
import p153l.jhe;
import p153l.kdu;
import p153l.n1k0;
import p153l.qa00;
import p153l.vxr;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftPagerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f51076d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f51077e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51078f;

    /* JADX INFO: renamed from: g */
    public TextView f51079g;

    /* JADX INFO: renamed from: h */
    public MomoLayUpSVGAImageView f51080h;

    /* JADX INFO: renamed from: i */
    public XEGiftView f51081i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f51082j;

    /* JADX INFO: renamed from: k */
    public TextView f51083k;

    /* JADX INFO: renamed from: l */
    public TextView f51084l;

    /* JADX INFO: renamed from: m */
    public UpgradeGiftSelectButton f51085m;

    /* JADX INFO: renamed from: n */
    public a2k0 f51086n;

    /* JADX INFO: renamed from: o */
    public BLiveUpgradeGiftResLevel f51087o;

    /* JADX INFO: renamed from: p */
    public AnimatorSet f51088p;

    public UpgradeGiftPagerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: n0 */
    private void m75510n0() {
        boolean zM170973E1 = vxr.m203876d().m170973E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f51087o;
        if (zM170973E1) {
            jhe.m144897r(this.f51077e, new hre(bLiveUpgradeGiftResLevel.resources.shadowId));
        } else {
            String strM161123h = n1k0.m161123h(bLiveUpgradeGiftResLevel.resources.shadowId, 23000);
            this.f51076d.clearInsertData();
            this.f51076d.startSVGAAnimWithLayJson(strM161123h, -1, null, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m75511p0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM95710d = this.f51086n.m95710d();
        if (bLiveUpgradeGiftInfoItemM95710d.isEquipped() || bLiveUpgradeGiftInfoItemM95710d.isUnLocked()) {
            m75510n0();
            m75516l0();
            m75515k0();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75512h0(View view) {
        d2k0.m113704a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75513i0() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM95710d = this.f51086n.m95710d();
        if (bLiveUpgradeGiftInfoItemM95710d.isEquipped() || bLiveUpgradeGiftInfoItemM95710d.isUnLocked()) {
            this.f51076d.stopAnimation();
            this.f51080h.stopAnimation();
        }
        m75514j0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75514j0() {
        AnimatorSet animatorSet = this.f51088p;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.f51088p.end();
        this.f51088p.cancel();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75515k0() {
        if (this.f51088p == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51082j, (Property<VDraweeView, Float>) View.SCALE_X, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat.setDuration(1500L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f51082j, (Property<VDraweeView, Float>) View.SCALE_Y, 1.0f, 1.03f, 1.0f);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setDuration(1500L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51088p = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        m75519q0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m75516l0() {
        boolean zM170973E1 = vxr.m203876d().m170973E1();
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = this.f51087o;
        if (zM170973E1) {
            jhe.m144897r(this.f51081i, new hre(bLiveUpgradeGiftResLevel.resources.meteorId));
        } else {
            String strM161123h = n1k0.m161123h(bLiveUpgradeGiftResLevel.resources.meteorId, 23000);
            this.f51080h.clearInsertData();
            this.f51080h.startSVGAAnimWithLayJson(strM161123h, -1, null, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75517m0(a2k0 a2k0Var) {
        String str = a2k0Var.m95710d().name;
        this.f51079g.setTextSize(16.0f);
        float fMeasureText = this.f51079g.getPaint().measureText(str);
        float fM175859d = qa00.m175859d(101.0f);
        TextView textView = this.f51079g;
        if (fMeasureText > fM175859d) {
            textView.setTextSize(11.0f);
        } else {
            textView.setTextSize(16.0f);
        }
        this.f51079g.setText(str);
    }

    /* JADX INFO: renamed from: o0 */
    public void m75518o0(a2k0 a2k0Var) {
        this.f51086n = a2k0Var;
        BLiveUpgradeGiftResLevel targetRedLevel = a2k0Var.m95710d().getTargetRedLevel();
        this.f51087o = targetRedLevel;
        izs.m142868s("context_livingAct", this.f51078f, targetRedLevel.getStatusBgCardUrl(a2k0Var.m95710d().status));
        izs.m142868s("context_livingAct", this.f51082j, a2k0Var.m95710d().hdUrl);
        m75517m0(a2k0Var);
        this.f51083k.setText(String.valueOf(a2k0Var.m95710d().purchasePrice));
        bnl0.m105524M(this.f51084l, a2k0Var.m95710d().expiredTime > 0);
        this.f51084l.setText(kdu.m149275T(a2k0Var.m95710d().expiredTime));
        this.f51085m.m75540c(a2k0Var);
    }

    public void onDestroy() {
        m75513i0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75512h0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75519q0() {
        m75514j0();
        AnimatorSet animatorSet = this.f51088p;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m75520r0(boolean z) {
        if (z) {
            m75511p0();
        } else {
            m75513i0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m75521s0(boolean z) {
        this.f51086n.m95710d().status = z ? "equipped" : "unlocked";
        this.f51085m.m75540c(this.f51086n);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
