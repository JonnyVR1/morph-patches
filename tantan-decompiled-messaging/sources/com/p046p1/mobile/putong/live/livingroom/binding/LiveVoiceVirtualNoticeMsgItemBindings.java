package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.LiveAvatarClipItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.LiveVoiceVirtualNoticeMsgItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceVirtualNoticeMsgItemBindings extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceVirtualNoticeMsgItemView f48389a;

    /* JADX INFO: renamed from: b */
    public LiveAvatarClipItemView f48390b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48391c;

    /* JADX INFO: renamed from: d */
    public VText f48392d;

    /* JADX INFO: renamed from: e */
    public VText f48393e;

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72076a(ViewGroup viewGroup) {
        this.f48389a = (LiveVoiceVirtualNoticeMsgItemView) viewGroup;
        LiveAvatarClipItemView liveAvatarClipItemView = (LiveAvatarClipItemView) viewGroup.getChildAt(0);
        this.f48390b = liveAvatarClipItemView;
        String str = liveAvatarClipItemView == null ? "_avatar_root" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48391c = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f48392d = vText;
        if (vText == null) {
            str = "_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f48393e = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceVirtualNoticeMsgItemView getRoot() {
        return this.f48389a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72076a(this);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
