package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hto0;
import p149l.hxs;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetTaskItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53618a;

    /* JADX INFO: renamed from: b */
    public VText f53619b;

    /* JADX INFO: renamed from: c */
    public VText f53620c;

    /* JADX INFO: renamed from: d */
    public VText f53621d;

    public VoiceSweetTaskItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78580a(View view) {
        hto0.m132931a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78581b(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask) {
        hxs.m133406s("context_single_room", this.f53618a, bLiveVoiceSweetCpTask.taskIcon);
        this.f53619b.setText(bLiveVoiceSweetCpTask.taskName);
        this.f53620c.setText(bLiveVoiceSweetCpTask.taskAwardDescribe);
        this.f53621d.setText(bLiveVoiceSweetCpTask.taskButtonName);
        VText vText = this.f53621d;
        int i = bLiveVoiceSweetCpTask.taskCpStatus;
        vText.setEnabled((i == 1 || i == 3) ? false : true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78580a(this);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
