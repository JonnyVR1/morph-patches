package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceTopicDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48162a;

    /* JADX INFO: renamed from: b */
    public TopicView f48163b;

    /* JADX INFO: renamed from: c */
    public FlowLayout f48164c;

    /* JADX INFO: renamed from: d */
    public LiveVoiceTopicInputView f48165d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f48166e;

    /* JADX INFO: renamed from: f */
    public EditText f48167f;

    /* JADX INFO: renamed from: g */
    public ImageView f48168g;

    /* JADX INFO: renamed from: h */
    public VText f48169h;

    public LiveVirtualVoiceTopicDialogViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m72047f(ViewGroup viewGroup) {
        this.f48163b = (TopicView) viewGroup;
        FlowLayout flowLayout = (FlowLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f48164c = flowLayout;
        String str = flowLayout == null ? "_tag_flow_layout" : null;
        LiveVoiceTopicInputView liveVoiceTopicInputView = (LiveVoiceTopicInputView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        this.f48165d = liveVoiceTopicInputView;
        if (liveVoiceTopicInputView == null) {
            str = "_topic_input";
        }
        FrameLayout frameLayout = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        this.f48166e = frameLayout;
        if (frameLayout == null) {
            str = "_edit_layout";
        }
        EditText editText = (EditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        this.f48167f = editText;
        if (editText == null) {
            str = "_edit_topic";
        }
        ImageView imageView = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        this.f48168g = imageView;
        if (imageView == null) {
            str = "_random_topic";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48169h = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public TopicView getRoot() {
        return this.f48163b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48162a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168422l7, viewGroup, false);
        m72047f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72047f(this);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
