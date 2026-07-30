package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.l2p0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetTaskItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54466a;

    /* JADX INFO: renamed from: b */
    public VText f54467b;

    /* JADX INFO: renamed from: c */
    public VText f54468c;

    /* JADX INFO: renamed from: d */
    public VText f54469d;

    public VoiceSweetTaskItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79763a(View view) {
        l2p0.m152629a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79764b(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask) {
        izs.m142868s("context_single_room", this.f54466a, bLiveVoiceSweetCpTask.taskIcon);
        this.f54467b.setText(bLiveVoiceSweetCpTask.taskName);
        this.f54468c.setText(bLiveVoiceSweetCpTask.taskAwardDescribe);
        this.f54469d.setText(bLiveVoiceSweetCpTask.taskButtonName);
        VText vText = this.f54469d;
        int i = bLiveVoiceSweetCpTask.taskCpStatus;
        vText.setEnabled((i == 1 || i == 3) ? false : true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79763a(this);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTaskItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
