package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import l.jfd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionQueueItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionQueueItem f4265a;

    /* JADX INFO: renamed from: b */
    public MysteryAvatarView f4266b;

    /* JADX INFO: renamed from: c */
    public VText f4267c;

    /* JADX INFO: renamed from: d */
    public VText f4268d;

    /* JADX INFO: renamed from: e */
    public VText f4269e;

    /* JADX INFO: renamed from: f */
    public TextView f4270f;

    /* JADX INFO: renamed from: g */
    public TextView f4271g;

    public LiveVoiceAuctionQueueItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5515a(ViewGroup viewGroup) {
        this.f4265a = (LiveVoiceAuctionQueueItem) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f4266b = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText childAt = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4267c = childAt;
        if (childAt == null) {
            str = "_name";
        }
        VText childAt2 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f4268d = childAt2;
        if (childAt2 == null) {
            str = "_user_age";
        }
        VText childAt3 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f4269e = childAt3;
        if (childAt3 == null) {
            str = "_user_tag";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f4270f = textView;
        if (textView == null) {
            str = "_live_operation_1";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(3);
        this.f4271g = textView2;
        if (textView2 == null) {
            str = "_live_operation_2";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionQueueItem getRoot() {
        return this.f4265a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5515a(this);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
