package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l.s7m;
import p002l.te80;
import p002l.ue80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PreOperationAnimView extends FrameLayout implements s7m<te80> {

    /* JADX INFO: renamed from: a */
    public PreOperationAnimView f6892a;

    /* JADX INFO: renamed from: b */
    public te80 f6893b;

    public PreOperationAnimView(Context context) {
        super(context);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8716C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: a */
    public final void m8717a(View view) {
        ue80.m23435a(this, view);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m8720i1(te80 te80Var) {
        this.f6893b = te80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m8719c(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8717a(this);
    }

    public PreOperationAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
