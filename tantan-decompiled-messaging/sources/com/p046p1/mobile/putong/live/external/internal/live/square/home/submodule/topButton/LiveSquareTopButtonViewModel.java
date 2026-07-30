package com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p149l.m4u;
import p149l.q0m;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareTopButtonViewModel extends VLinear implements s7m {

    /* JADX INFO: renamed from: c */
    public LiveSquareTopButtonViewModel f45036c;

    /* JADX INFO: renamed from: d */
    public LiveSquareTopButtonLiveView f45037d;

    /* JADX INFO: renamed from: e */
    public LiveSquareTopButtonVoiceView f45038e;

    /* JADX INFO: renamed from: f */
    public LiveSquareTopButtonVChatView f45039f;

    public LiveSquareTopButtonViewModel(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m69158P(View view) {
        m4u.m153104a(this, view);
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
        m69158P(this);
    }

    public LiveSquareTopButtonViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareTopButtonViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(q0m q0mVar) {
    }
}
