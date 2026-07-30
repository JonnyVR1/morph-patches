package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveOperationWebViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4100d;

    /* JADX INFO: renamed from: e */
    public OperationWebView f4101e;

    /* JADX INFO: renamed from: f */
    public OperationWebView f4102f;

    /* JADX INFO: renamed from: g */
    public MKWebView f4103g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4104h;

    /* JADX INFO: renamed from: i */
    public VImage f4105i;

    public LiveOperationWebViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context mo5450C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public OperationWebView getRoot() {
        return this.f4101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public void m5451h0(ViewGroup viewGroup) {
        OperationWebView operationWebView = (OperationWebView) viewGroup;
        this.f4101e = operationWebView;
        this.f4102f = operationWebView;
        String str = operationWebView == null ? "_root" : null;
        MKWebView childAt = viewGroup.getChildAt(0);
        this.f4103g = childAt;
        if (childAt == null) {
            str = "_webView";
        }
        VDraweeView childAt2 = viewGroup.getChildAt(1);
        this.f4104h = childAt2;
        if (childAt2 == null) {
            str = "_close";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f4105i = childAt3;
        if (childAt3 == null) {
            str = "_loading";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void mo5452i1(T t) {
        this.f4100d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19616N4, viewGroup, false);
        m5451h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5451h0(this);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationWebViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
