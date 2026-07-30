package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceTopicDialogViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49010a;

    /* JADX INFO: renamed from: b */
    public TopicView f49011b;

    /* JADX INFO: renamed from: c */
    public FlowLayout f49012c;

    /* JADX INFO: renamed from: d */
    public LiveVoiceTopicInputView f49013d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f49014e;

    /* JADX INFO: renamed from: f */
    public EditText f49015f;

    /* JADX INFO: renamed from: g */
    public ImageView f49016g;

    /* JADX INFO: renamed from: h */
    public VText f49017h;

    public LiveVirtualVoiceTopicDialogViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m73230f(ViewGroup viewGroup) {
        this.f49011b = (TopicView) viewGroup;
        FlowLayout flowLayout = (FlowLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f49012c = flowLayout;
        String str = flowLayout == null ? "_tag_flow_layout" : null;
        LiveVoiceTopicInputView liveVoiceTopicInputView = (LiveVoiceTopicInputView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        this.f49013d = liveVoiceTopicInputView;
        if (liveVoiceTopicInputView == null) {
            str = "_topic_input";
        }
        FrameLayout frameLayout = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        this.f49014e = frameLayout;
        if (frameLayout == null) {
            str = "_edit_layout";
        }
        EditText editText = (EditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        this.f49015f = editText;
        if (editText == null) {
            str = "_edit_topic";
        }
        ImageView imageView = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        this.f49016g = imageView;
        if (imageView == null) {
            str = "_random_topic";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49017h = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public TopicView getRoot() {
        return this.f49011b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49010a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199154l7, viewGroup, false);
        m73230f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73230f(this);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
