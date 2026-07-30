package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import p151v.VDraweeView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveOperationMessageViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48901a;

    /* JADX INFO: renamed from: b */
    public OperationMessageView f48902b;

    /* JADX INFO: renamed from: c */
    public OperationMessageView f48903c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f48904d;

    /* JADX INFO: renamed from: e */
    public HorizontalMarqueeView f48905e;

    public LiveOperationMessageViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73211a(ViewGroup viewGroup) {
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup;
        this.f48902b = operationMessageView;
        this.f48903c = operationMessageView;
        String str = operationMessageView == null ? "_root" : null;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48904d = vDraweeView;
        if (vDraweeView == null) {
            str = "_operation_icon";
        }
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f48905e = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_operation_text";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public OperationMessageView getRoot() {
        return this.f48902b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48901a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198840M4, viewGroup, false);
        m73211a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73211a(this);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
