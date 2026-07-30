package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.LiveAvatarClipItemView;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.LiveVoiceVirtualNoticeMsgItemView;
import l.jfd0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceVirtualNoticeMsgItemBindings extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceVirtualNoticeMsgItemView f4431a;

    /* JADX INFO: renamed from: b */
    public LiveAvatarClipItemView f4432b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4433c;

    /* JADX INFO: renamed from: d */
    public VText f4434d;

    /* JADX INFO: renamed from: e */
    public VText f4435e;

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5545a(ViewGroup viewGroup) {
        this.f4431a = (LiveVoiceVirtualNoticeMsgItemView) viewGroup;
        LiveAvatarClipItemView childAt = viewGroup.getChildAt(0);
        this.f4432b = childAt;
        String str = childAt == null ? "_avatar_root" : null;
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4433c = childAt2;
        if (childAt2 == null) {
            str = "_avatar";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f4434d = childAt3;
        if (childAt3 == null) {
            str = "_title";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f4435e = childAt4;
        if (childAt4 == null) {
            str = "_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceVirtualNoticeMsgItemView getRoot() {
        return this.f4431a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5545a(this);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualNoticeMsgItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
