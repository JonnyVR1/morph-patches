package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationWebViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48906d;

    /* JADX INFO: renamed from: e */
    public OperationWebView f48907e;

    /* JADX INFO: renamed from: f */
    public OperationWebView f48908f;

    /* JADX INFO: renamed from: g */
    public MKWebView f48909g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48910h;

    /* JADX INFO: renamed from: i */
    public VImage f48911i;

    public LiveOperationWebViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public OperationWebView getRoot() {
        return this.f48907e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73212h0(ViewGroup viewGroup) {
        OperationWebView operationWebView = (OperationWebView) viewGroup;
        this.f48907e = operationWebView;
        this.f48908f = operationWebView;
        String str = operationWebView == null ? "_root" : null;
        MKWebView mKWebView = (MKWebView) viewGroup.getChildAt(0);
        this.f48909g = mKWebView;
        if (mKWebView == null) {
            str = "_webView";
        }
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(1);
        this.f48910h = vDraweeView;
        if (vDraweeView == null) {
            str = "_close";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48911i = vImage;
        if (vImage == null) {
            str = "_loading";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48906d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198852N4, viewGroup, false);
        m73212h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73212h0(this);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
