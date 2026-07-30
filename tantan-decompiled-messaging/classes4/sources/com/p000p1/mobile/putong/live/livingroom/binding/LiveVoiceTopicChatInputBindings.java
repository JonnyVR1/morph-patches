package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import l.jfd0;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceTopicChatInputBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceTopicInputView f4428a;

    /* JADX INFO: renamed from: b */
    public VEditText f4429b;

    /* JADX INFO: renamed from: c */
    public VText f4430c;

    public LiveVoiceTopicChatInputBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5544a(ViewGroup viewGroup) {
        this.f4428a = (LiveVoiceTopicInputView) viewGroup;
        VEditText childAt = viewGroup.getChildAt(0);
        this.f4429b = childAt;
        String str = childAt == null ? "_edit_text" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4430c = childAt2;
        if (childAt2 == null) {
            str = "_done";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceTopicInputView getRoot() {
        return this.f4428a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5544a(this);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
