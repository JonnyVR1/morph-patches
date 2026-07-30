package com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p149l.dcn0;
import p149l.e6k;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGrabHatFloatViewMode extends VLinear implements s7m<e6k> {

    /* JADX INFO: renamed from: c */
    public e6k f53089c;

    public VoiceGrabHatFloatViewMode(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m78088S(View view) {
        this.f53089c.m115067K3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final void m78089Q(View view) {
        dcn0.m110864a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e6k e6kVar) {
        this.f53089c = e6kVar;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78089Q(this);
        xdl0.m208327D0(t100.m186890d(118.0f), this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ccn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80282a.m78088S(view);
            }
        });
    }

    public void setVisible(boolean z) {
        xdl0.m208344M(this, z);
    }

    public VoiceGrabHatFloatViewMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGrabHatFloatViewMode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
