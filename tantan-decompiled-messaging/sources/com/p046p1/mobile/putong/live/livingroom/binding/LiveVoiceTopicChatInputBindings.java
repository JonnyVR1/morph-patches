package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import p147v.VEditText;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceTopicChatInputBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceTopicInputView f48386a;

    /* JADX INFO: renamed from: b */
    public VEditText f48387b;

    /* JADX INFO: renamed from: c */
    public VText f48388c;

    public LiveVoiceTopicChatInputBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72075a(ViewGroup viewGroup) {
        this.f48386a = (LiveVoiceTopicInputView) viewGroup;
        VEditText vEditText = (VEditText) viewGroup.getChildAt(0);
        this.f48387b = vEditText;
        String str = vEditText == null ? "_edit_text" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48388c = vText;
        if (vText == null) {
            str = "_done";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceTopicInputView getRoot() {
        return this.f48386a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72075a(this);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
