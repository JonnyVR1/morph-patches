package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.kvc0;
import l.s7m;
import l.u6n;
import l.xdl0;
import p002l.ahs;
import p002l.axj;
import p002l.elj;
import p002l.fnj;
import p002l.i3c0;
import p002l.ymj;
import p002l.zfv;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogBottomBar extends ConstraintLayout implements s7m<fnj<?>> {

    /* JADX INFO: renamed from: d */
    public GiftDialogIndicator f6303d;

    /* JADX INFO: renamed from: e */
    public VText f6304e;

    /* JADX INFO: renamed from: f */
    public View f6305f;

    /* JADX INFO: renamed from: g */
    public TextView f6306g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f6307h;

    /* JADX INFO: renamed from: i */
    public VText f6308i;

    /* JADX INFO: renamed from: j */
    public Group f6309j;

    public GiftDialogBottomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m7950h0(fnj fnjVar, View view) {
        fnjVar.m13386W3(false, "liveGiftBarRechargeClick");
        axj.m10100n(fnjVar.mo21430R2());
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m7952j0(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public Context m7953C0() {
        return getContext();
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7956l0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7955k0(View view) {
        ymj.m26811a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public View m7956l0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ymj.m26812b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void m7954i1(final fnj<?> fnjVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.vmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m7950h0(fnjVar, view);
            }
        };
        xdl0.E0(this.f6306g, onClickListener);
        xdl0.E0(this.f6308i, onClickListener);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.wmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m7952j0(view);
            }
        });
        this.f6304e.setOnClickListener(new View.OnClickListener() { // from class: l.xmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fnjVar.m13388Y3();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m7959o0(elj eljVar) {
        this.f6303d.m8038a(eljVar.getViewPager(), eljVar.getInitPosition());
        xdl0.M(this.f6303d, eljVar.getDataSize() >= 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7955k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m7960p0(ahs<?> ahsVar, boolean z) {
        m7961q0(z);
        xdl0.M(this.f6306g, !z);
        xdl0.M(this.f6305f, !z);
        this.f6305f.setBackground(kvc0.b(u6n.a() ? i3c0.f12845k2 : i3c0.f12833j2));
        if (z) {
            ahsVar.m25548F2().BootBubbleEvent.showBubbleByType().j("firstRechargeGiftDialogBubble");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m7961q0(boolean z) {
        xdl0.M(this.f6309j, z);
        AnimEffectPlayer animEffectPlayer = this.f6307h;
        if (z) {
            animEffectPlayer.l("https://auto.tancdn.com/v1/raw/59f488f3-fb83-460e-bd89-828cb7dc684b10.pdf", -1, (ap0) null);
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.M(this.f6309j, false);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void setAvailableCoin(Long l2) {
        xdl0.M(this.f6305f, true);
        this.f6306g.setText(zfv.m27300r0(l2.longValue()));
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m7958n0(ahs<?> ahsVar) {
    }
}
