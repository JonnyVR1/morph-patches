package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import p151v.VText;
import p153l.aiv;
import p153l.bjs;
import p153l.bnl0;
import p153l.iam;
import p153l.n3d0;
import p153l.obc0;
import p153l.opj;
import p153l.qzj;
import p153l.u8n;
import p153l.unj;
import p153l.vpj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogBottomBar extends ConstraintLayout implements iam<vpj<?>> {

    /* JADX INFO: renamed from: d */
    public GiftDialogIndicator f51109d;

    /* JADX INFO: renamed from: e */
    public VText f51110e;

    /* JADX INFO: renamed from: f */
    public View f51111f;

    /* JADX INFO: renamed from: g */
    public TextView f51112g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f51113h;

    /* JADX INFO: renamed from: i */
    public VText f51114i;

    /* JADX INFO: renamed from: j */
    public Group f51115j;

    public GiftDialogBottomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m75552h0(vpj vpjVar, View view) {
        vpjVar.m202251W3(false, "liveGiftBarRechargeClick");
        qzj.m178797n(vpjVar.mo78457R2());
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m75554j0(View view) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m75556l0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75555k0(View view) {
        opj.m168676a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public View m75556l0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return opj.m168677b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(final vpj<?> vpjVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.lpj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m75552h0(vpjVar, view);
            }
        };
        bnl0.m105509E0(this.f51112g, onClickListener);
        bnl0.m105509E0(this.f51114i, onClickListener);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.mpj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m75554j0(view);
            }
        });
        this.f51110e.setOnClickListener(new View.OnClickListener() { // from class: l.npj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vpjVar.m202253Y3();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m75559o0(unj unjVar) {
        this.f51109d.m75637a(unjVar.getViewPager(), unjVar.getInitPosition());
        bnl0.m105524M(this.f51109d, unjVar.getDataSize() >= 2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75555k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m75560p0(bjs<?> bjsVar, boolean z) {
        m75561q0(z);
        bnl0.m105524M(this.f51112g, !z);
        bnl0.m105524M(this.f51111f, !z);
        this.f51111f.setBackground(n3d0.m161278b(u8n.m195065a() ? obc0.f146388k2 : obc0.f146376j2));
        if (z) {
            bjsVar.m213811F2().BootBubbleEvent.showBubbleByType().mo199273j("firstRechargeGiftDialogBubble");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75561q0(boolean z) {
        bnl0.m105524M(this.f51115j, z);
        AnimEffectPlayer animEffectPlayer = this.f51113h;
        if (z) {
            animEffectPlayer.mo69685l("https://auto.tancdn.com/v1/raw/59f488f3-fb83-460e-bd89-828cb7dc684b10.pdf", -1, null);
        } else {
            animEffectPlayer.clearAnimation();
            bnl0.m105524M(this.f51115j, false);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void setAvailableCoin(Long l2) {
        bnl0.m105524M(this.f51111f, true);
        this.f51112g.setText(aiv.m98131r0(l2.longValue()));
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m75558n0(bjs<?> bjsVar) {
    }
}
