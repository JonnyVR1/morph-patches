package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationEntryBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48895d;

    /* JADX INFO: renamed from: e */
    public OperationEntryView f48896e;

    /* JADX INFO: renamed from: f */
    public LiveOperationScrollView f48897f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f48898g;

    /* JADX INFO: renamed from: h */
    public OperationMessageView f48899h;

    /* JADX INFO: renamed from: i */
    public OperationWebView f48900i;

    public LiveOperationEntryBindings(Context context) {
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

    public OperationEntryView getRoot() {
        return this.f48896e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73210h0(ViewGroup viewGroup) {
        this.f48896e = (OperationEntryView) viewGroup;
        LiveOperationScrollView liveOperationScrollView = (LiveOperationScrollView) viewGroup.getChildAt(0);
        this.f48897f = liveOperationScrollView;
        String str = liveOperationScrollView == null ? "_live_operation_root" : null;
        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48898g = linearLayout;
        if (linearLayout == null) {
            str = "_live_operation_container";
        }
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup.getChildAt(1);
        this.f48899h = operationMessageView;
        if (operationMessageView == null) {
            str = "_live_operation_message";
        }
        OperationWebView operationWebView = (OperationWebView) viewGroup.getChildAt(2);
        this.f48900i = operationWebView;
        if (operationWebView == null) {
            str = "_live_campaign_drawer";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48895d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198816K4, viewGroup, false);
        m73210h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73210h0(this);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
