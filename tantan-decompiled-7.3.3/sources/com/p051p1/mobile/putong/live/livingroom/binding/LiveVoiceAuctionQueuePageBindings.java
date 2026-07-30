package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueuePageBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f49078d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionListPage f49079e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f49080f;

    /* JADX INFO: renamed from: g */
    public EmptyView f49081g;

    public LiveVoiceAuctionQueuePageBindings(Context context) {
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

    public LiveVoiceAuctionListPage getRoot() {
        return this.f49079e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73240h0(ViewGroup viewGroup) {
        this.f49079e = (LiveVoiceAuctionListPage) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(mdc0.f135994M2);
        this.f49080f = recyclerView;
        String str = recyclerView == null ? "_invite_list" : null;
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f49081g = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49078d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198783H7, viewGroup, false);
        m73240h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73240h0(this);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
