package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.ten0;
import p149l.uen0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f52920d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f52921e;

    /* JADX INFO: renamed from: f */
    public ten0 f52922f;

    public VoiceIntlSettingGroupView(Context context) {
        super(context);
        this.f52922f = new ten0();
    }

    /* JADX INFO: renamed from: i0 */
    private void m77778i0() {
        this.f52921e.addItemDecoration(new ten0.C20161a());
        this.f52921e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f52921e.setAdapter(this.f52922f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77779h0(View view) {
        uen0.m193272a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77779h0(this);
        m77778i0();
    }

    public VoiceIntlSettingGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52922f = new ten0();
    }

    public VoiceIntlSettingGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52922f = new ten0();
    }
}
