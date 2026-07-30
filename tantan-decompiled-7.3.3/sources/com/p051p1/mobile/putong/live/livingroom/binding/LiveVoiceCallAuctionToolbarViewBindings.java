package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import p151v.VImage;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceCallAuctionToolbarViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49098a;

    /* JADX INFO: renamed from: b */
    public LiveVoiceCallAuctionToolbarView f49099b;

    /* JADX INFO: renamed from: c */
    public VText f49100c;

    /* JADX INFO: renamed from: d */
    public VText f49101d;

    /* JADX INFO: renamed from: e */
    public VText f49102e;

    /* JADX INFO: renamed from: f */
    public VImage f49103f;

    public LiveVoiceCallAuctionToolbarViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73244a(ViewGroup viewGroup) {
        this.f49099b = (LiveVoiceCallAuctionToolbarView) viewGroup;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f49100c = vText;
        String str = vText == null ? "_auction_queue" : null;
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f49101d = vText2;
        if (vText2 == null) {
            str = "_auction_queue_apply_unread_count";
        }
        VText vText3 = (VText) viewGroup.getChildAt(1);
        this.f49102e = vText3;
        if (vText3 == null) {
            str = "_auction_room_action";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(3);
        this.f49103f = vImage;
        if (vImage == null) {
            str = "_auction_description";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveVoiceCallAuctionToolbarView getRoot() {
        return this.f49099b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49098a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198939U7, viewGroup, false);
        m73244a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73244a(this);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceCallAuctionToolbarViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
