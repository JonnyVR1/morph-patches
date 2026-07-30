package com.p046p1.mobile.putong.live.livingroom.voice.intl.heatbox;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p149l.bt0;
import p149l.dt0;
import p149l.hxs;
import p149l.i3c0;
import p149l.s7m;
import p149l.xdl0;
import p149l.xpn0;
import p149l.zpn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveHeatBoxEntryView extends ConstraintLayout implements s7m<xpn0> {

    /* JADX INFO: renamed from: d */
    public VoiceLiveHeatBoxEntryView f53183d;

    /* JADX INFO: renamed from: e */
    public View f53184e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53185f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f53186g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f53187h;

    /* JADX INFO: renamed from: i */
    public boolean f53188i;

    /* JADX INFO: renamed from: j */
    public xpn0 f53189j;

    /* JADX INFO: renamed from: k */
    public Animator f53190k;

    /* JADX INFO: renamed from: l */
    public Animator f53191l;

    public VoiceLiveHeatBoxEntryView(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78182i0(View view) {
        zpn0.m219699a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xpn0 xpn0Var) {
        this.f53189j = xpn0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m78184k0(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, View view) {
        this.f53189j.m210521M3(this.f53188i ? bLiveVoiceHeatBoxEntrance.giftSchema : bLiveVoiceHeatBoxEntrance.h5JumpUrl);
    }

    /* JADX INFO: renamed from: l0 */
    public void m78185l0(final BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, boolean z) {
        if (!bLiveVoiceHeatBoxEntrance.showEntrance) {
            xdl0.m208344M(this, false);
            this.f53188i = false;
            return;
        }
        xdl0.m208344M(this, true);
        this.f53186g.setText(bLiveVoiceHeatBoxEntrance.giftContent);
        this.f53187h.setText(bLiveVoiceHeatBoxEntrance.content);
        dt0.m113502B(this.f53190k);
        dt0.m113502B(this.f53191l);
        if (!z || bLiveVoiceHeatBoxEntrance.distribute) {
            if (this.f53188i) {
                m78187n0(this.f53187h);
                m78188o0(this.f53186g);
            }
            this.f53188i = false;
            m78186m0(false);
        } else {
            if (!this.f53188i) {
                m78187n0(this.f53186g);
                m78188o0(this.f53187h);
            }
            this.f53188i = true;
            m78186m0(true);
            xdl0.m208344M(this.f53186g, true);
        }
        hxs.m133406s("context_livingAct", this.f53185f, bLiveVoiceHeatBoxEntrance.iconUrl);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ypn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199470a.m78184k0(bLiveVoiceHeatBoxEntrance, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78186m0(boolean z) {
        View view = this.f53184e;
        if (z) {
            view.setBackgroundResource(i3c0.f110674D0);
        } else {
            view.setBackgroundResource(i3c0.f110816P);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78187n0(View view) {
        Animator animatorM103741n = bt0.m103741n(view, View.TRANSLATION_Y, getHeight(), 0.0f);
        this.f53190k = animatorM103741n;
        animatorM103741n.setDuration(400L);
        this.f53190k.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78188o0(View view) {
        Animator animatorM103741n = bt0.m103741n(view, View.TRANSLATION_Y, 0.0f, -getHeight());
        this.f53191l = animatorM103741n;
        animatorM103741n.setDuration(400L);
        this.f53191l.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78182i0(this);
    }

    public VoiceLiveHeatBoxEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveHeatBoxEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
