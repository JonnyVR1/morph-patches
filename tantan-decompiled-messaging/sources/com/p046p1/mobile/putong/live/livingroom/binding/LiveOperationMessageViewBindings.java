package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import p147v.VDraweeView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationMessageViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48053a;

    /* JADX INFO: renamed from: b */
    public OperationMessageView f48054b;

    /* JADX INFO: renamed from: c */
    public OperationMessageView f48055c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48056d;

    /* JADX INFO: renamed from: e */
    public HorizontalMarqueeView f48057e;

    public LiveOperationMessageViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72028a(ViewGroup viewGroup) {
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup;
        this.f48054b = operationMessageView;
        this.f48055c = operationMessageView;
        String str = operationMessageView == null ? "_root" : null;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48056d = vDraweeView;
        if (vDraweeView == null) {
            str = "_operation_icon";
        }
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f48057e = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_operation_text";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public OperationMessageView getRoot() {
        return this.f48054b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48053a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168108M4, viewGroup, false);
        m72028a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72028a(this);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
