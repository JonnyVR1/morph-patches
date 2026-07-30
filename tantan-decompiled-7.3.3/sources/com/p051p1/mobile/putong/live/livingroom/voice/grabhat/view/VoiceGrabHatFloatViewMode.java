package com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p153l.bnl0;
import p153l.hln0;
import p153l.iam;
import p153l.qa00;
import p153l.w8k;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGrabHatFloatViewMode extends VLinear implements iam<w8k> {

    /* JADX INFO: renamed from: c */
    public w8k f53937c;

    public VoiceGrabHatFloatViewMode(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m79271S(View view) {
        this.f53937c.m205410K3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo22061C0() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final void m79272Q(View view) {
        hln0.m135760a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w8k w8kVar) {
        this.f53937c = w8kVar;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79272Q(this);
        bnl0.m105507D0(qa00.m175859d(118.0f), this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.gln0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104874a.m79271S(view);
            }
        });
    }

    public void setVisible(boolean z) {
        bnl0.m105524M(this, z);
    }

    public VoiceGrabHatFloatViewMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGrabHatFloatViewMode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
