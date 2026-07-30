package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceCallAuctionToolbarViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4292a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionToolbarView f4293b;

    /* JADX INFO: renamed from: c */
    public VText f4294c;

    /* JADX INFO: renamed from: d */
    public VText f4295d;

    /* JADX INFO: renamed from: e */
    public VText f4296e;

    /* JADX INFO: renamed from: f */
    public VImage f4297f;

    public LiveVoiceCallAuctionToolbarViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5522C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5523a(ViewGroup viewGroup) {
        this.f4293b = (LiveVoiceCallAuctionToolbarView) viewGroup;
        VText childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4294c = childAt;
        String str = childAt == null ? "_auction_queue" : null;
        VText childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f4295d = childAt2;
        if (childAt2 == null) {
            str = "_auction_queue_apply_unread_count";
        }
        VText childAt3 = viewGroup.getChildAt(1);
        this.f4296e = childAt3;
        if (childAt3 == null) {
            str = "_auction_room_action";
        }
        VImage childAt4 = viewGroup.getChildAt(3);
        this.f4297f = childAt4;
        if (childAt4 == null) {
            str = "_auction_description";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public LiveVoiceCallAuctionToolbarView getRoot() {
        return this.f4293b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5524i1(T t) {
        this.f4292a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19703U7, viewGroup, false);
        m5523a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5523a(this);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
