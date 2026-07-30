package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueueItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionQueueItem f49071a;

    /* JADX INFO: renamed from: b */
    public MysteryAvatarView f49072b;

    /* JADX INFO: renamed from: c */
    public VText f49073c;

    /* JADX INFO: renamed from: d */
    public VText f49074d;

    /* JADX INFO: renamed from: e */
    public VText f49075e;

    /* JADX INFO: renamed from: f */
    public TextView f49076f;

    /* JADX INFO: renamed from: g */
    public TextView f49077g;

    public LiveVoiceAuctionQueueItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73239a(ViewGroup viewGroup) {
        this.f49071a = (LiveVoiceAuctionQueueItem) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f49072b = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49073c = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f49074d = vText2;
        if (vText2 == null) {
            str = "_user_age";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f49075e = vText3;
        if (vText3 == null) {
            str = "_user_tag";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f49076f = textView;
        if (textView == null) {
            str = "_live_operation_1";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(3);
        this.f49077g = textView2;
        if (textView2 == null) {
            str = "_live_operation_2";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionQueueItem getRoot() {
        return this.f49071a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73239a(this);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
