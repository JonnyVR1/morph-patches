package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationItemView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceChatUserNotificationItemViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4356a;

    /* JADX INFO: renamed from: b */
    public VoiceUserNotificationItemView f4357b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4358c;

    /* JADX INFO: renamed from: d */
    public VText f4359d;

    /* JADX INFO: renamed from: e */
    public VImage f4360e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4361f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4362g;

    public LiveVoiceChatUserNotificationItemViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5528C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5529a(ViewGroup viewGroup) {
        this.f4357b = (VoiceUserNotificationItemView) viewGroup;
        VDraweeView childAt = viewGroup.getChildAt(0);
        this.f4358c = childAt;
        String str = childAt == null ? "_startIcon" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4359d = childAt2;
        if (childAt2 == null) {
            str = "_content";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f4360e = childAt3;
        if (childAt3 == null) {
            str = "_arrow";
        }
        VDraweeView childAt4 = viewGroup.getChildAt(3);
        this.f4361f = childAt4;
        if (childAt4 == null) {
            str = "_button";
        }
        VDraweeView childAt5 = viewGroup.getChildAt(4);
        this.f4362g = childAt5;
        if (childAt5 == null) {
            str = "_dynamic_button";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VoiceUserNotificationItemView getRoot() {
        return this.f4357b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5530i1(T t) {
        this.f4356a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19997r8, viewGroup, false);
        m5529a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5529a(this);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceChatUserNotificationItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
