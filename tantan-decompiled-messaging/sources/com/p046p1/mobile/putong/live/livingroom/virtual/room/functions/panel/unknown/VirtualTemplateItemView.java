package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.gvl0;
import p149l.hxs;
import p149l.kvc0;
import p149l.t100;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualTemplateItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f52696c;

    /* JADX INFO: renamed from: d */
    public VText f52697d;

    public VirtualTemplateItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m77408P(View view) {
        gvl0.m128261a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m77409Q(BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate) {
        hxs.m133406s("context_livingAct", this.f52696c, bLiveVoiceGuideTemplate.icon);
        setBackground(yb2.m213876a(kvc0.m147358g(bLiveVoiceGuideTemplate.bgColor), t100.m186890d(10.0f), false));
        this.f52697d.setText(bLiveVoiceGuideTemplate.text);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77408P(this);
    }

    public VirtualTemplateItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualTemplateItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
