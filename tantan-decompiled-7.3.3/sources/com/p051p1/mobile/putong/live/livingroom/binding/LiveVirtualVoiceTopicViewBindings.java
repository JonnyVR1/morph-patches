package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import p151v.VLinear;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceTopicViewBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49018a;

    /* JADX INFO: renamed from: b */
    public TopicView f49019b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f49020c;

    /* JADX INFO: renamed from: d */
    public VLinear f49021d;

    /* JADX INFO: renamed from: e */
    public VText f49022e;

    /* JADX INFO: renamed from: f */
    public VText f49023f;

    /* JADX INFO: renamed from: g */
    public VText f49024g;

    public LiveVirtualVoiceTopicViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73231a(ViewGroup viewGroup) {
        this.f49019b = (TopicView) viewGroup;
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = (LiveVirtualVoicePanelCollapseView) viewGroup.getChildAt(0);
        this.f49020c = liveVirtualVoicePanelCollapseView;
        String str = liveVirtualVoicePanelCollapseView == null ? "_collapse_view" : null;
        VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
        this.f49021d = vLinear;
        if (vLinear == null) {
            str = "_content";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49022e = vText;
        if (vText == null) {
            str = "_title";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f49023f = vText2;
        if (vText2 == null) {
            str = "_tag";
        }
        VText vText3 = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f49024g = vText3;
        if (vText3 == null) {
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

    public TopicView getRoot() {
        return this.f49019b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49018a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199167m7, viewGroup, false);
        m73231a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73231a(this);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
