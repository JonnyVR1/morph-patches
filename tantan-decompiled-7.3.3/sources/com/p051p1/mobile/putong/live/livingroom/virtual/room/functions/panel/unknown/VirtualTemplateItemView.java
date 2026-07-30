package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.fc2;
import p153l.izs;
import p153l.k4m0;
import p153l.n3d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualTemplateItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f53544c;

    /* JADX INFO: renamed from: d */
    public VText f53545d;

    public VirtualTemplateItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m78591P(View view) {
        k4m0.m148267a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m78592Q(BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate) {
        izs.m142868s("context_livingAct", this.f53544c, bLiveVoiceGuideTemplate.icon);
        setBackground(fc2.m124971a(n3d0.m161283g(bLiveVoiceGuideTemplate.bgColor), qa00.m175859d(10.0f), false));
        this.f53545d.setText(bLiveVoiceGuideTemplate.text);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78591P(this);
    }

    public VirtualTemplateItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualTemplateItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
