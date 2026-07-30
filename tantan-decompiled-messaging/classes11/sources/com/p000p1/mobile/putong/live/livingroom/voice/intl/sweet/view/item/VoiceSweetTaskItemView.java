package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import l.hto0;
import l.hxs;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetTaskItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7224a;

    /* JADX INFO: renamed from: b */
    public VText f7225b;

    /* JADX INFO: renamed from: c */
    public VText f7226c;

    /* JADX INFO: renamed from: d */
    public VText f7227d;

    public VoiceSweetTaskItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8793a(View view) {
        hto0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8794b(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask) {
        hxs.s("context_single_room", this.f7224a, bLiveVoiceSweetCpTask.taskIcon);
        this.f7225b.setText(bLiveVoiceSweetCpTask.taskName);
        this.f7226c.setText(bLiveVoiceSweetCpTask.taskAwardDescribe);
        this.f7227d.setText(bLiveVoiceSweetCpTask.taskButtonName);
        VText vText = this.f7227d;
        int i = bLiveVoiceSweetCpTask.taskCpStatus;
        vText.setEnabled((i == 1 || i == 3) ? false : true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8793a(this);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
