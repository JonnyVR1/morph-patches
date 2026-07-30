package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveOperationMessageViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4095a;

    /* JADX INFO: renamed from: b */
    public OperationMessageView f4096b;

    /* JADX INFO: renamed from: c */
    public OperationMessageView f4097c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4098d;

    /* JADX INFO: renamed from: e */
    public HorizontalMarqueeView f4099e;

    public LiveOperationMessageViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context mo5447C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5448a(ViewGroup viewGroup) {
        OperationMessageView operationMessageView = (OperationMessageView) viewGroup;
        this.f4096b = operationMessageView;
        this.f4097c = operationMessageView;
        String str = operationMessageView == null ? "_root" : null;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4098d = childAt;
        if (childAt == null) {
            str = "_operation_icon";
        }
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) viewGroup.getChildAt(1);
        this.f4099e = horizontalMarqueeView;
        if (horizontalMarqueeView == null) {
            str = "_operation_text";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public OperationMessageView getRoot() {
        return this.f4096b;
    }

    /* JADX INFO: renamed from: i1 */
    public void mo5449i1(T t) {
        this.f4095a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19604M4, viewGroup, false);
        m5448a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5448a(this);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveOperationMessageViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
