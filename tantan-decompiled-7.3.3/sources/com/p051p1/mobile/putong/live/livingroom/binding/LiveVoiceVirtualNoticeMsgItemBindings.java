package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.LiveAvatarClipItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.LiveVoiceVirtualNoticeMsgItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceVirtualNoticeMsgItemBindings extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceVirtualNoticeMsgItemView f49237a;

    /* JADX INFO: renamed from: b */
    public LiveAvatarClipItemView f49238b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49239c;

    /* JADX INFO: renamed from: d */
    public VText f49240d;

    /* JADX INFO: renamed from: e */
    public VText f49241e;

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73259a(ViewGroup viewGroup) {
        this.f49237a = (LiveVoiceVirtualNoticeMsgItemView) viewGroup;
        LiveAvatarClipItemView liveAvatarClipItemView = (LiveAvatarClipItemView) viewGroup.getChildAt(0);
        this.f49238b = liveAvatarClipItemView;
        String str = liveAvatarClipItemView == null ? "_avatar_root" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f49239c = vDraweeView;
        if (vDraweeView == null) {
            str = "_avatar";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f49240d = vText;
        if (vText == null) {
            str = "_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f49241e = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceVirtualNoticeMsgItemView getRoot() {
        return this.f49237a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73259a(this);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
