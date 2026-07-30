package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction.AuctionView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceAuctionDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4141a;

    /* JADX INFO: renamed from: b */
    public AuctionView f4142b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4143c;

    /* JADX INFO: renamed from: d */
    public VText f4144d;

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5467C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m5468f(ViewGroup viewGroup) {
        this.f4142b = (AuctionView) viewGroup;
        VDraweeView childAt = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4143c = childAt;
        String str = childAt == null ? "_description" : null;
        VText childAt2 = viewGroup.getChildAt(2);
        this.f4144d = childAt2;
        if (childAt2 == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public AuctionView getRoot() {
        return this.f4142b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5469i1(T t) {
        this.f4141a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19750Y6, viewGroup, false);
        m5468f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5468f(this);
    }

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
