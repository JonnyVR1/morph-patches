package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p151v.VLinear;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceAnnouncementViewBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48941a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f48942b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f48943c;

    /* JADX INFO: renamed from: d */
    public VLinear f48944d;

    /* JADX INFO: renamed from: e */
    public VText f48945e;

    /* JADX INFO: renamed from: f */
    public VText f48946f;

    public LiveVirtualVoiceAnnouncementViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73218a(ViewGroup viewGroup) {
        this.f48942b = (AnnouncementView) viewGroup;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(0);
        this.f48943c = liveVirtualVoicePanelCollapseView;
        String str = liveVirtualVoicePanelCollapseView == null ? "_collapse_view" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f48944d = vLinear;
        if (vLinear == null) {
            str = "_content";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48945e = vText;
        if (vText == null) {
            str = "_input_notice_text";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48946f = vText2;
        if (vText2 == null) {
            str = "_edit";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public AnnouncementView getRoot() {
        return this.f48942b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48941a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198962W6, viewGroup, false);
        m73218a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73218a(this);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
