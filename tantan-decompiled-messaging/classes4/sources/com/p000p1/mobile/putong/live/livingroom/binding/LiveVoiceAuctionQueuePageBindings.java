package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.view.EmptyView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionQueuePageBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4272d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionListPage f4273e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f4274f;

    /* JADX INFO: renamed from: g */
    public EmptyView f4275g;

    public LiveVoiceAuctionQueuePageBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5516C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public LiveVoiceAuctionListPage getRoot() {
        return this.f4273e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5517h0(ViewGroup viewGroup) {
        this.f4273e = (LiveVoiceAuctionListPage) viewGroup;
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f10899M2);
        this.f4274f = recyclerViewFindViewById;
        String str = recyclerViewFindViewById == null ? "_invite_list" : null;
        EmptyView childAt = viewGroup.getChildAt(1);
        this.f4275g = childAt;
        if (childAt == null) {
            str = "_rv_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5518i1(T t) {
        this.f4272d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19547H7, viewGroup, false);
        m5517h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5517h0(this);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueuePageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
