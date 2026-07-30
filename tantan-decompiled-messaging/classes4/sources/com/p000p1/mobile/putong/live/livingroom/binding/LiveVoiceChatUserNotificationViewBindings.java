package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceChatUserNotificationViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4363a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationView f4364b;

    /* JADX INFO: renamed from: c */
    public VoiceUserNotificationItemView f4365c;

    /* JADX INFO: renamed from: d */
    public VoiceUserNotificationItemView f4366d;

    public LiveVoiceChatUserNotificationViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context mo5531C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5532a(ViewGroup viewGroup) {
        this.f4364b = (VoiceUserNotificationView) viewGroup;
        VoiceUserNotificationItemView voiceUserNotificationItemView = (VoiceUserNotificationItemView) viewGroup.getChildAt(0);
        this.f4365c = voiceUserNotificationItemView;
        String str = voiceUserNotificationItemView == null ? "_notification_one" : null;
        VoiceUserNotificationItemView voiceUserNotificationItemView2 = (VoiceUserNotificationItemView) viewGroup.getChildAt(1);
        this.f4366d = voiceUserNotificationItemView2;
        if (voiceUserNotificationItemView2 == null) {
            str = "_notification_two";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VoiceUserNotificationView getRoot() {
        return this.f4364b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5533i1(T t) {
        this.f4363a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20010s8, viewGroup, false);
        m5532a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5532a(this);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
