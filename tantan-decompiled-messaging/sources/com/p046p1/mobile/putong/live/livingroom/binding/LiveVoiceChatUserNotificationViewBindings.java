package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceChatUserNotificationViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48321a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationView f48322b;

    /* JADX INFO: renamed from: c */
    public VoiceUserNotificationItemView f48323c;

    /* JADX INFO: renamed from: d */
    public VoiceUserNotificationItemView f48324d;

    public LiveVoiceChatUserNotificationViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72064a(ViewGroup viewGroup) {
        this.f48322b = (VoiceUserNotificationView) viewGroup;
        VoiceUserNotificationItemView voiceUserNotificationItemView = (VoiceUserNotificationItemView) viewGroup.getChildAt(0);
        this.f48323c = voiceUserNotificationItemView;
        String str = voiceUserNotificationItemView == null ? "_notification_one" : null;
        VoiceUserNotificationItemView voiceUserNotificationItemView2 = (VoiceUserNotificationItemView) viewGroup.getChildAt(1);
        this.f48324d = voiceUserNotificationItemView2;
        if (voiceUserNotificationItemView2 == null) {
            str = "_notification_two";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VoiceUserNotificationView getRoot() {
        return this.f48322b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48321a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168514s8, viewGroup, false);
        m72064a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72064a(this);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
