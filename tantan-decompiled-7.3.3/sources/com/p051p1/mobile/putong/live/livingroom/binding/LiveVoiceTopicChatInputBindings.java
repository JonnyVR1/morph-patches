package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import p151v.VEditText;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceTopicChatInputBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveVoiceTopicInputView f49234a;

    /* JADX INFO: renamed from: b */
    public VEditText f49235b;

    /* JADX INFO: renamed from: c */
    public VText f49236c;

    public LiveVoiceTopicChatInputBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73258a(ViewGroup viewGroup) {
        this.f49234a = (LiveVoiceTopicInputView) viewGroup;
        VEditText vEditText = (VEditText) viewGroup.getChildAt(0);
        this.f49235b = vEditText;
        String str = vEditText == null ? "_edit_text" : null;
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49236c = vText;
        if (vText == null) {
            str = "_done";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public LiveVoiceTopicInputView getRoot() {
        return this.f49234a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73258a(this);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceTopicChatInputBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
