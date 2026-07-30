package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceChatUserNotificationItemViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49162a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationItemView f49163b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49164c;

    /* JADX INFO: renamed from: d */
    public VText f49165d;

    /* JADX INFO: renamed from: e */
    public VImage f49166e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49167f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49168g;

    public LiveVoiceChatUserNotificationItemViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73246a(ViewGroup viewGroup) {
        this.f49163b = (VoiceUserNotificationItemView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
        this.f49164c = vDraweeView;
        String str = vDraweeView == null ? "_startIcon" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49165d = vText;
        if (vText == null) {
            str = "_content";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f49166e = vImage;
        if (vImage == null) {
            str = "_arrow";
        }
        VDraweeView vDraweeView2 = (VDraweeView) viewGroup.getChildAt(3);
        this.f49167f = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_button";
        }
        VDraweeView vDraweeView3 = (VDraweeView) viewGroup.getChildAt(4);
        this.f49168g = vDraweeView3;
        if (vDraweeView3 == null) {
            str = "_dynamic_button";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VoiceUserNotificationItemView getRoot() {
        return this.f49163b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49162a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199233r8, viewGroup, false);
        m73246a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73246a(this);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
