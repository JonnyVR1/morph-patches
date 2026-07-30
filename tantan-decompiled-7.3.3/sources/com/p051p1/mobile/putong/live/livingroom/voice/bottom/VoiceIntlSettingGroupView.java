package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.xnn0;
import p153l.ynn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53768d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f53769e;

    /* JADX INFO: renamed from: f */
    public xnn0 f53770f;

    public VoiceIntlSettingGroupView(Context context) {
        super(context);
        this.f53770f = new xnn0();
    }

    /* JADX INFO: renamed from: i0 */
    private void m78961i0() {
        this.f53769e.addItemDecoration(new xnn0.C21394a());
        this.f53769e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f53769e.setAdapter(this.f53770f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78962h0(View view) {
        ynn0.m216882a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78962h0(this);
        m78961i0();
    }

    public VoiceIntlSettingGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53770f = new xnn0();
    }

    public VoiceIntlSettingGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53770f = new xnn0();
    }
}
