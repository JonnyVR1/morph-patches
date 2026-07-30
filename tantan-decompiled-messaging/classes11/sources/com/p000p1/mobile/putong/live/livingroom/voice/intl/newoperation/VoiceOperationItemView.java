package com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import l.c6o0;
import l.hxs;
import l.xdl0;
import p009l.m4o0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceOperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6911a;

    /* JADX INFO: renamed from: b */
    public m4o0 f6912b;

    public VoiceOperationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8506b(View view) {
        c6o0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m8507c(final BLiveVoiceCampaign bLiveVoiceCampaign, final m4o0 m4o0Var) {
        if (bLiveVoiceCampaign == null) {
            return;
        }
        this.f6912b = m4o0Var;
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.entranceImage)) {
            hxs.s("context_single_room", this.f6911a, bLiveVoiceCampaign.entranceImage);
        }
        xdl0.E0(this.f6911a, new View.OnClickListener() { // from class: l.b6o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m4o0Var.m18240b4(bLiveVoiceCampaign);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8506b(this);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
