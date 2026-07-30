package com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p153l.iam;
import p153l.k3m;
import p153l.n6u;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareTopButtonViewModel extends VLinear implements iam {

    /* JADX INFO: renamed from: c */
    public LiveSquareTopButtonViewModel f45884c;

    /* JADX INFO: renamed from: d */
    public LiveSquareTopButtonLiveView f45885d;

    /* JADX INFO: renamed from: e */
    public LiveSquareTopButtonVoiceView f45886e;

    /* JADX INFO: renamed from: f */
    public LiveSquareTopButtonVChatView f45887f;

    public LiveSquareTopButtonViewModel(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m70341P(View view) {
        n6u.m161804a(this, view);
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
        m70341P(this);
    }

    public LiveSquareTopButtonViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareTopButtonViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(k3m k3mVar) {
    }
}
