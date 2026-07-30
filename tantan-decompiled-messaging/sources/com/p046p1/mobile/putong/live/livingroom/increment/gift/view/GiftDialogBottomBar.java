package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import p147v.VText;
import p149l.ahs;
import p149l.axj;
import p149l.elj;
import p149l.fnj;
import p149l.i3c0;
import p149l.kvc0;
import p149l.s7m;
import p149l.u6n;
import p149l.xdl0;
import p149l.ymj;
import p149l.zfv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogBottomBar extends ConstraintLayout implements s7m<fnj<?>> {

    /* JADX INFO: renamed from: d */
    public GiftDialogIndicator f50261d;

    /* JADX INFO: renamed from: e */
    public VText f50262e;

    /* JADX INFO: renamed from: f */
    public View f50263f;

    /* JADX INFO: renamed from: g */
    public TextView f50264g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f50265h;

    /* JADX INFO: renamed from: i */
    public VText f50266i;

    /* JADX INFO: renamed from: j */
    public Group f50267j;

    public GiftDialogBottomBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74369h0(fnj fnjVar, View view) {
        fnjVar.m122309W3(false, "liveGiftBarRechargeClick");
        axj.m99440n(fnjVar.mo77274R2());
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m74371j0(View view) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m74373l0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74372k0(View view) {
        ymj.m215362a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public View m74373l0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ymj.m215363b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(final fnj<?> fnjVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.vmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m74369h0(fnjVar, view);
            }
        };
        xdl0.m208329E0(this.f50264g, onClickListener);
        xdl0.m208329E0(this.f50266i, onClickListener);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftDialogBottomBar.m74371j0(view);
            }
        });
        this.f50262e.setOnClickListener(new View.OnClickListener() { // from class: l.xmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fnjVar.m122311Y3();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m74376o0(elj eljVar) {
        this.f50261d.m74454a(eljVar.getViewPager(), eljVar.getInitPosition());
        xdl0.m208344M(this.f50261d, eljVar.getDataSize() >= 2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74372k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m74377p0(ahs<?> ahsVar, boolean z) {
        m74378q0(z);
        xdl0.m208344M(this.f50264g, !z);
        xdl0.m208344M(this.f50263f, !z);
        this.f50263f.setBackground(kvc0.m147353b(u6n.m192015a() ? i3c0.f111060k2 : i3c0.f111048j2));
        if (z) {
            ahsVar.m206028F2().BootBubbleEvent.showBubbleByType().mo172463j("firstRechargeGiftDialogBubble");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m74378q0(boolean z) {
        xdl0.m208344M(this.f50267j, z);
        AnimEffectPlayer animEffectPlayer = this.f50265h;
        if (z) {
            animEffectPlayer.mo68502l("https://auto.tancdn.com/v1/raw/59f488f3-fb83-460e-bd89-828cb7dc684b10.pdf", -1, null);
        } else {
            animEffectPlayer.clearAnimation();
            xdl0.m208344M(this.f50267j, false);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void setAvailableCoin(Long l2) {
        xdl0.m208344M(this.f50263f, true);
        this.f50264g.setText(zfv.m218597r0(l2.longValue()));
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74375n0(ahs<?> ahsVar) {
    }
}
