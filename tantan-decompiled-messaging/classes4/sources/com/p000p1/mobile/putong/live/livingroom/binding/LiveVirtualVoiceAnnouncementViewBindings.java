package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceAnnouncementViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4135a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f4136b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f4137c;

    /* JADX INFO: renamed from: d */
    public VLinear f4138d;

    /* JADX INFO: renamed from: e */
    public VText f4139e;

    /* JADX INFO: renamed from: f */
    public VText f4140f;

    public LiveVirtualVoiceAnnouncementViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5464C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5465a(ViewGroup viewGroup) {
        this.f4136b = (AnnouncementView) viewGroup;
        LiveVirtualVoicePanelCollapseView childAt = viewGroup.getChildAt(0);
        this.f4137c = childAt;
        String str = childAt == null ? "_collapse_view" : null;
        VLinear childAt2 = viewGroup.getChildAt(1);
        this.f4138d = childAt2;
        if (childAt2 == null) {
            str = "_content";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4139e = childAt3;
        if (childAt3 == null) {
            str = "_input_notice_text";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f4140f = childAt4;
        if (childAt4 == null) {
            str = "_edit";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public AnnouncementView getRoot() {
        return this.f4136b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5466i1(T t) {
        this.f4135a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19726W6, viewGroup, false);
        m5465a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5465a(this);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
