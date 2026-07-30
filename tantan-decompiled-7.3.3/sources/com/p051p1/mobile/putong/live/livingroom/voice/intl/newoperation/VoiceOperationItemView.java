package com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gfo0;
import p153l.izs;
import p153l.qdo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceOperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54153a;

    /* JADX INFO: renamed from: b */
    public qdo0 f54154b;

    public VoiceOperationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79496b(View view) {
        gfo0.m130118a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m79497c(final BLiveVoiceCampaign bLiveVoiceCampaign, final qdo0 qdo0Var) {
        if (bLiveVoiceCampaign == null) {
            return;
        }
        this.f54154b = qdo0Var;
        if (!TextUtils.isEmpty(bLiveVoiceCampaign.entranceImage)) {
            izs.m142868s("context_single_room", this.f54153a, bLiveVoiceCampaign.entranceImage);
        }
        bnl0.m105509E0(this.f54153a, new View.OnClickListener() { // from class: l.ffo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qdo0Var.m176200b4(bLiveVoiceCampaign);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79496b(this);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
