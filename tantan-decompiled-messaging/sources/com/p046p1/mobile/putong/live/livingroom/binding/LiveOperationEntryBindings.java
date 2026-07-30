package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationEntryBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48047d;

    /* JADX INFO: renamed from: e */
    public OperationEntryView f48048e;

    /* JADX INFO: renamed from: f */
    public LiveOperationScrollView f48049f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f48050g;

    /* JADX INFO: renamed from: h */
    public OperationMessageView f48051h;

    /* JADX INFO: renamed from: i */
    public OperationWebView f48052i;

    public LiveOperationEntryBindings(Context context) {
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

    public OperationEntryView getRoot() {
        return this.f48048e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72027h0(ViewGroup viewGroup) {
        this.f48048e = (OperationEntryView) viewGroup;
        LiveOperationScrollView liveOperationScrollView = (LiveOperationScrollView) viewGroup.getChildAt(0);
        this.f48049f = liveOperationScrollView;
        String str = liveOperationScrollView == null ? "_live_operation_root" : null;
        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48050g = linearLayout;
        if (linearLayout == null) {
            str = "_live_operation_container";
        }
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup.getChildAt(1);
        this.f48051h = operationMessageView;
        if (operationMessageView == null) {
            str = "_live_operation_message";
        }
        OperationWebView operationWebView = (OperationWebView) viewGroup.getChildAt(2);
        this.f48052i = operationWebView;
        if (operationWebView == null) {
            str = "_live_campaign_drawer";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48047d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168084K4, viewGroup, false);
        m72027h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72027h0(this);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
