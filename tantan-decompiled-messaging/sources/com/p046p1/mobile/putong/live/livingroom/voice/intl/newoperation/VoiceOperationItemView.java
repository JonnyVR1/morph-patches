package com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import p147v.VDraweeView;
import p149l.c6o0;
import p149l.hxs;
import p149l.m4o0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceOperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53305a;

    /* JADX INFO: renamed from: b */
    public m4o0 f53306b;

    public VoiceOperationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78313b(View view) {
        c6o0.m105490a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m78314c(final BLiveVoiceCampaign bLiveVoiceCampaign, final m4o0 m4o0Var) {
        if (bLiveVoiceCampaign == null) {
            return;
        }
        this.f53306b = m4o0Var;
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.entranceImage)) {
            hxs.m133406s("context_single_room", this.f53305a, bLiveVoiceCampaign.entranceImage);
        }
        xdl0.m208329E0(this.f53305a, new View.OnClickListener() { // from class: l.b6o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m4o0Var.m153073b4(bLiveVoiceCampaign);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78313b(this);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
