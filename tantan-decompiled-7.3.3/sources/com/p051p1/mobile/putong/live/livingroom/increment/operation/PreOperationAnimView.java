package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p153l.an80;
import p153l.iam;
import p153l.zm80;

/* JADX INFO: loaded from: classes4.dex */
public class PreOperationAnimView extends FrameLayout implements iam<zm80> {

    /* JADX INFO: renamed from: a */
    public PreOperationAnimView f51698a;

    /* JADX INFO: renamed from: b */
    public zm80 f51699b;

    public PreOperationAnimView(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo22061C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: a */
    public final void m76285a(View view) {
        an80.m98954a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zm80 zm80Var) {
        this.f51699b = zm80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m76287c(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
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
        m76285a(this);
    }

    public PreOperationAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
