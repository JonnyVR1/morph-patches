package com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import p151v.VText;
import p153l.lho0;

/* JADX INFO: loaded from: classes10.dex */
public class VoicePreviewFlowItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f54223a;

    public VoicePreviewFlowItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79589a(View view) {
        lho0.m154242a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79589a(this);
    }

    public void setData(BLiveVoiceTopic bLiveVoiceTopic) {
        if (bLiveVoiceTopic == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceTopic.name);
        VText vText = this.f54223a;
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
