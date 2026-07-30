package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction.AuctionView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceAuctionDialogViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48947a;

    /* JADX INFO: renamed from: b */
    public AuctionView f48948b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48949c;

    /* JADX INFO: renamed from: d */
    public VText f48950d;

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context) {
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

    /* JADX INFO: renamed from: f */
    public void m73219f(ViewGroup viewGroup) {
        this.f48948b = (AuctionView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48949c = vDraweeView;
        String str = vDraweeView == null ? "_description" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48950d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public AuctionView getRoot() {
        return this.f48948b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48947a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198986Y6, viewGroup, false);
        m73219f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73219f(this);
    }

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAuctionDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
