package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationWebViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48058d;

    /* JADX INFO: renamed from: e */
    public OperationWebView f48059e;

    /* JADX INFO: renamed from: f */
    public OperationWebView f48060f;

    /* JADX INFO: renamed from: g */
    public MKWebView f48061g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f48062h;

    /* JADX INFO: renamed from: i */
    public VImage f48063i;

    public LiveOperationWebViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public OperationWebView getRoot() {
        return this.f48059e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72029h0(ViewGroup viewGroup) {
        OperationWebView operationWebView = (OperationWebView) viewGroup;
        this.f48059e = operationWebView;
        this.f48060f = operationWebView;
        String str = operationWebView == null ? "_root" : null;
        MKWebView mKWebView = (MKWebView) viewGroup.getChildAt(0);
        this.f48061g = mKWebView;
        if (mKWebView == null) {
            str = "_webView";
        }
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(1);
        this.f48062h = vDraweeView;
        if (vDraweeView == null) {
            str = "_close";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48063i = vImage;
        if (vImage == null) {
            str = "_loading";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48058d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168120N4, viewGroup, false);
        m72029h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72029h0(this);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
