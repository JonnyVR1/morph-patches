package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.MysteryAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionQueueItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceAuctionQueueItem f48223a;

    /* JADX INFO: renamed from: b */
    public MysteryAvatarView f48224b;

    /* JADX INFO: renamed from: c */
    public VText f48225c;

    /* JADX INFO: renamed from: d */
    public VText f48226d;

    /* JADX INFO: renamed from: e */
    public VText f48227e;

    /* JADX INFO: renamed from: f */
    public TextView f48228f;

    /* JADX INFO: renamed from: g */
    public TextView f48229g;

    public LiveVoiceAuctionQueueItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72056a(ViewGroup viewGroup) {
        this.f48223a = (LiveVoiceAuctionQueueItem) viewGroup;
        MysteryAvatarView mysteryAvatarView = (MysteryAvatarView) viewGroup.getChildAt(0);
        this.f48224b = mysteryAvatarView;
        String str = mysteryAvatarView == null ? "_real_avatar_view" : null;
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48225c = vText;
        if (vText == null) {
            str = "_name";
        }
        VText vText2 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f48226d = vText2;
        if (vText2 == null) {
            str = "_user_age";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f48227e = vText3;
        if (vText3 == null) {
            str = "_user_tag";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f48228f = textView;
        if (textView == null) {
            str = "_live_operation_1";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(3);
        this.f48229g = textView2;
        if (textView2 == null) {
            str = "_live_operation_2";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceAuctionQueueItem getRoot() {
        return this.f48223a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72056a(this);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionQueueItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
