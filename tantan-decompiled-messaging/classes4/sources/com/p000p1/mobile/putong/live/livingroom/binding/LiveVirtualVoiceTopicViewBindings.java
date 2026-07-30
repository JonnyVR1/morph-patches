package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceTopicViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4212a;

    /* JADX INFO: renamed from: b */
    public TopicView f4213b;

    /* JADX INFO: renamed from: c */
    public LiveVirtualVoicePanelCollapseView f4214c;

    /* JADX INFO: renamed from: d */
    public VLinear f4215d;

    /* JADX INFO: renamed from: e */
    public VText f4216e;

    /* JADX INFO: renamed from: f */
    public VText f4217f;

    /* JADX INFO: renamed from: g */
    public VText f4218g;

    public LiveVirtualVoiceTopicViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5501C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5502a(ViewGroup viewGroup) {
        this.f4213b = (TopicView) viewGroup;
        LiveVirtualVoicePanelCollapseView childAt = viewGroup.getChildAt(0);
        this.f4214c = childAt;
        String str = childAt == null ? "_collapse_view" : null;
        VLinear childAt2 = viewGroup.getChildAt(1);
        this.f4215d = childAt2;
        if (childAt2 == null) {
            str = "_content";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4216e = childAt3;
        if (childAt3 == null) {
            str = "_title";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f4217f = childAt4;
        if (childAt4 == null) {
            str = "_tag";
        }
        VText childAt5 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f4218g = childAt5;
        if (childAt5 == null) {
            str = "_edit";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public TopicView getRoot() {
        return this.f4213b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5503i1(T t) {
        this.f4212a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19931m7, viewGroup, false);
        m5502a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5502a(this);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
