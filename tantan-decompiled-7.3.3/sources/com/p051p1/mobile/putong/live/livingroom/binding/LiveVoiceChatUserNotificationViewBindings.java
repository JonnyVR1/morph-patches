package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceChatUserNotificationViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49169a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationView f49170b;

    /* JADX INFO: renamed from: c */
    public VoiceUserNotificationItemView f49171c;

    /* JADX INFO: renamed from: d */
    public VoiceUserNotificationItemView f49172d;

    public LiveVoiceChatUserNotificationViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73247a(ViewGroup viewGroup) {
        this.f49170b = (VoiceUserNotificationView) viewGroup;
        VoiceUserNotificationItemView voiceUserNotificationItemView = (VoiceUserNotificationItemView) viewGroup.getChildAt(0);
        this.f49171c = voiceUserNotificationItemView;
        String str = voiceUserNotificationItemView == null ? "_notification_one" : null;
        VoiceUserNotificationItemView voiceUserNotificationItemView2 = (VoiceUserNotificationItemView) viewGroup.getChildAt(1);
        this.f49172d = voiceUserNotificationItemView2;
        if (voiceUserNotificationItemView2 == null) {
            str = "_notification_two";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VoiceUserNotificationView getRoot() {
        return this.f49170b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49169a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199246s8, viewGroup, false);
        m73247a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73247a(this);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
