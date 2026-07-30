package com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import l.h8o0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoicePreviewFlowItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f6981a;

    public VoicePreviewFlowItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8607a(View view) {
        h8o0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8607a(this);
    }

    public void setData(BLiveVoiceTopic bLiveVoiceTopic) {
        if (bLiveVoiceTopic == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceTopic.name);
        VText vText = this.f6981a;
        if (zIsEmpty) {
            vText.setText("");
        } else {
            vText.setText(bLiveVoiceTopic.name);
        }
    }

    public VoicePreviewFlowItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoicePreviewFlowItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoicePreviewFlowItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
