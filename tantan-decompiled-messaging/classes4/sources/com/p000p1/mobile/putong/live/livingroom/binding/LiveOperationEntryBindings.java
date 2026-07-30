package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveOperationEntryBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4089d;

    /* JADX INFO: renamed from: e */
    public OperationEntryView f4090e;

    /* JADX INFO: renamed from: f */
    public LiveOperationScrollView f4091f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f4092g;

    /* JADX INFO: renamed from: h */
    public OperationMessageView f4093h;

    /* JADX INFO: renamed from: i */
    public OperationWebView f4094i;

    public LiveOperationEntryBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5444C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public OperationEntryView getRoot() {
        return this.f4090e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public void m5445h0(ViewGroup viewGroup) {
        this.f4090e = (OperationEntryView) viewGroup;
        LiveOperationScrollView liveOperationScrollView = (LiveOperationScrollView) viewGroup.getChildAt(0);
        this.f4091f = liveOperationScrollView;
        String str = liveOperationScrollView == null ? "_live_operation_root" : null;
        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4092g = linearLayout;
        if (linearLayout == null) {
            str = "_live_operation_container";
        }
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup.getChildAt(1);
        this.f4093h = operationMessageView;
        if (operationMessageView == null) {
            str = "_live_operation_message";
        }
        OperationWebView operationWebView = (OperationWebView) viewGroup.getChildAt(2);
        this.f4094i = operationWebView;
        if (operationWebView == null) {
            str = "_live_campaign_drawer";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5446i1(T t) {
        this.f4089d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19580K4, viewGroup, false);
        m5445h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5445h0(this);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
