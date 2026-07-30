package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p147v.VLinear;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceTopicViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48170a;

    /* JADX INFO: renamed from: b */
    public TopicView f48171b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f48172c;

    /* JADX INFO: renamed from: d */
    public VLinear f48173d;

    /* JADX INFO: renamed from: e */
    public VText f48174e;

    /* JADX INFO: renamed from: f */
    public VText f48175f;

    /* JADX INFO: renamed from: g */
    public VText f48176g;

    public LiveVirtualVoiceTopicViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72048a(ViewGroup viewGroup) {
        this.f48171b = (TopicView) viewGroup;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(0);
        this.f48172c = liveVirtualVoicePanelCollapseView;
        String str = liveVirtualVoicePanelCollapseView == null ? "_collapse_view" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f48173d = vLinear;
        if (vLinear == null) {
            str = "_content";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48174e = vText;
        if (vText == null) {
            str = "_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f48175f = vText2;
        if (vText2 == null) {
            str = "_tag";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f48176g = vText3;
        if (vText3 == null) {
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

    public TopicView getRoot() {
        return this.f48171b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48170a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168435m7, viewGroup, false);
        m72048a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72048a(this);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
