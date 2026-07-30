package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p149l.s7m;
import p149l.te80;
import p149l.ue80;

/* JADX INFO: loaded from: classes4.dex */
public class PreOperationAnimView extends FrameLayout implements s7m<te80> {

    /* JADX INFO: renamed from: a */
    public PreOperationAnimView f50850a;

    /* JADX INFO: renamed from: b */
    public te80 f50851b;

    public PreOperationAnimView(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: a */
    public final void m75102a(View view) {
        ue80.m193241a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(te80 te80Var) {
        this.f50851b = te80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m75104c(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
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
        m75102a(this);
    }

    public PreOperationAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
