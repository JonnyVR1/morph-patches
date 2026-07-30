package com.p051p1.mobile.putong.live.livingroom.voice.intl.heatbox;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.bzn0;
import p153l.dzn0;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.obc0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveHeatBoxEntryView extends ConstraintLayout implements iam<bzn0> {

    /* JADX INFO: renamed from: d */
    public VoiceLiveHeatBoxEntryView f54031d;

    /* JADX INFO: renamed from: e */
    public View f54032e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54033f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f54034g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f54035h;

    /* JADX INFO: renamed from: i */
    public boolean f54036i;

    /* JADX INFO: renamed from: j */
    public bzn0 f54037j;

    /* JADX INFO: renamed from: k */
    public Animator f54038k;

    /* JADX INFO: renamed from: l */
    public Animator f54039l;

    public VoiceLiveHeatBoxEntryView(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public final void m79365i0(View view) {
        dzn0.m118755a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bzn0 bzn0Var) {
        this.f54037j = bzn0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m79367k0(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, View view) {
        this.f54037j.m107240M3(this.f54036i ? bLiveVoiceHeatBoxEntrance.giftSchema : bLiveVoiceHeatBoxEntrance.h5JumpUrl);
    }

    /* JADX INFO: renamed from: l0 */
    public void m79368l0(final BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, boolean z) {
        if (!bLiveVoiceHeatBoxEntrance.showEntrance) {
            bnl0.m105524M(this, false);
            this.f54036i = false;
            return;
        }
        bnl0.m105524M(this, true);
        this.f54034g.setText(bLiveVoiceHeatBoxEntrance.giftContent);
        this.f54035h.setText(bLiveVoiceHeatBoxEntrance.content);
        it0.m142008B(this.f54038k);
        it0.m142008B(this.f54039l);
        if (!z || bLiveVoiceHeatBoxEntrance.distribute) {
            if (this.f54036i) {
                m79370n0(this.f54035h);
                m79371o0(this.f54034g);
            }
            this.f54036i = false;
            m79369m0(false);
        } else {
            if (!this.f54036i) {
                m79370n0(this.f54034g);
                m79371o0(this.f54035h);
            }
            this.f54036i = true;
            m79369m0(true);
            bnl0.m105524M(this.f54034g, true);
        }
        izs.m142868s("context_livingAct", this.f54033f, bLiveVoiceHeatBoxEntrance.iconUrl);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.czn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84487a.m79367k0(bLiveVoiceHeatBoxEntrance, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79369m0(boolean z) {
        View view = this.f54032e;
        if (z) {
            view.setBackgroundResource(obc0.f146002D0);
        } else {
            view.setBackgroundResource(obc0.f146144P);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m79370n0(View view) {
        Animator animatorM132168n = gt0.m132168n(view, View.TRANSLATION_Y, getHeight(), 0.0f);
        this.f54038k = animatorM132168n;
        animatorM132168n.setDuration(400L);
        this.f54038k.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m79371o0(View view) {
        Animator animatorM132168n = gt0.m132168n(view, View.TRANSLATION_Y, 0.0f, -getHeight());
        this.f54039l = animatorM132168n;
        animatorM132168n.setDuration(400L);
        this.f54039l.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79365i0(this);
    }

    public VoiceLiveHeatBoxEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveHeatBoxEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
