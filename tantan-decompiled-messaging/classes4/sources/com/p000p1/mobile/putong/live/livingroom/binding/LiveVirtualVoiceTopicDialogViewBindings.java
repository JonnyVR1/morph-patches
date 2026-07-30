package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import l.jfd0;
import l.q0m;
import l.s7m;
import org.apmem.tools.layouts.FlowLayout;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceTopicDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4204a;

    /* JADX INFO: renamed from: b */
    public TopicView f4205b;

    /* JADX INFO: renamed from: c */
    public FlowLayout f4206c;

    /* JADX INFO: renamed from: d */
    public LiveVoiceTopicInputView f4207d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f4208e;

    /* JADX INFO: renamed from: f */
    public EditText f4209f;

    /* JADX INFO: renamed from: g */
    public ImageView f4210g;

    /* JADX INFO: renamed from: h */
    public VText f4211h;

    public LiveVirtualVoiceTopicDialogViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5498C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m5499f(ViewGroup viewGroup) {
        this.f4205b = (TopicView) viewGroup;
        FlowLayout childAt = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        this.f4206c = childAt;
        String str = childAt == null ? "_tag_flow_layout" : null;
        LiveVoiceTopicInputView childAt2 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        this.f4207d = childAt2;
        if (childAt2 == null) {
            str = "_topic_input";
        }
        FrameLayout frameLayout = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        this.f4208e = frameLayout;
        if (frameLayout == null) {
            str = "_edit_layout";
        }
        EditText editText = (EditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        this.f4209f = editText;
        if (editText == null) {
            str = "_edit_topic";
        }
        ImageView imageView = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        this.f4210g = imageView;
        if (imageView == null) {
            str = "_random_topic";
        }
        VText childAt3 = viewGroup.getChildAt(1);
        this.f4211h = childAt3;
        if (childAt3 == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public TopicView getRoot() {
        return this.f4205b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5500i1(T t) {
        this.f4204a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19918l7, viewGroup, false);
        m5499f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5499f(this);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceTopicDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
