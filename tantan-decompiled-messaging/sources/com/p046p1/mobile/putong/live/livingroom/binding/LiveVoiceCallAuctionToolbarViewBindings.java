package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceCallAuctionToolbarViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48250a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionToolbarView f48251b;

    /* JADX INFO: renamed from: c */
    public VText f48252c;

    /* JADX INFO: renamed from: d */
    public VText f48253d;

    /* JADX INFO: renamed from: e */
    public VText f48254e;

    /* JADX INFO: renamed from: f */
    public VImage f48255f;

    public LiveVoiceCallAuctionToolbarViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72061a(ViewGroup viewGroup) {
        this.f48251b = (LiveVoiceCallAuctionToolbarView) viewGroup;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48252c = vText;
        String str = vText == null ? "_auction_queue" : null;
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48253d = vText2;
        if (vText2 == null) {
            str = "_auction_queue_apply_unread_count";
        }
        VText vText3 = (VText) viewGroup.getChildAt(1);
        this.f48254e = vText3;
        if (vText3 == null) {
            str = "_auction_room_action";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(3);
        this.f48255f = vImage;
        if (vImage == null) {
            str = "_auction_description";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveVoiceCallAuctionToolbarView getRoot() {
        return this.f48251b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48250a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168207U7, viewGroup, false);
        m72061a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72061a(this);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
