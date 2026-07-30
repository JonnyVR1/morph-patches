package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p147v.VLinear;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceAnnouncementViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48093a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f48094b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f48095c;

    /* JADX INFO: renamed from: d */
    public VLinear f48096d;

    /* JADX INFO: renamed from: e */
    public VText f48097e;

    /* JADX INFO: renamed from: f */
    public VText f48098f;

    public LiveVirtualVoiceAnnouncementViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72035a(ViewGroup viewGroup) {
        this.f48094b = (AnnouncementView) viewGroup;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(0);
        this.f48095c = liveVirtualVoicePanelCollapseView;
        String str = liveVirtualVoicePanelCollapseView == null ? "_collapse_view" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f48096d = vLinear;
        if (vLinear == null) {
            str = "_content";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48097e = vText;
        if (vText == null) {
            str = "_input_notice_text";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48098f = vText2;
        if (vText2 == null) {
            str = "_edit";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public AnnouncementView getRoot() {
        return this.f48094b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48093a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168230W6, viewGroup, false);
        m72035a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72035a(this);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
