package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueuePageBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48230d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionListPage f48231e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f48232f;

    /* JADX INFO: renamed from: g */
    public EmptyView f48233g;

    public LiveVoiceAuctionQueuePageBindings(Context context) {
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

    public LiveVoiceAuctionListPage getRoot() {
        return this.f48231e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72057h0(ViewGroup viewGroup) {
        this.f48231e = (LiveVoiceAuctionListPage) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(g5c0.f100749M2);
        this.f48232f = recyclerView;
        String str = recyclerView == null ? "_invite_list" : null;
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f48233g = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48230d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168051H7, viewGroup, false);
        m72057h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72057h0(this);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
