package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceChatUserNotificationItemViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48314a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationItemView f48315b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48316c;

    /* JADX INFO: renamed from: d */
    public VText f48317d;

    /* JADX INFO: renamed from: e */
    public VImage f48318e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48319f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48320g;

    public LiveVoiceChatUserNotificationItemViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72063a(ViewGroup viewGroup) {
        this.f48315b = (VoiceUserNotificationItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f48316c = vDraweeView;
        String str = vDraweeView == null ? "_startIcon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48317d = vText;
        if (vText == null) {
            str = "_content";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f48318e = vImage;
        if (vImage == null) {
            str = "_arrow";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(3);
        this.f48319f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_button";
        }
        VDraweeView vDraweeView3 = (VDraweeView) viewGroup.getChildAt(4);
        this.f48320g = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_dynamic_button";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VoiceUserNotificationItemView getRoot() {
        return this.f48315b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48314a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168501r8, viewGroup, false);
        m72063a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72063a(this);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
