package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveTask;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bcs;
import p149l.hxs;
import p149l.i3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubTaskModelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49161a;

    /* JADX INFO: renamed from: b */
    public VText f49162b;

    /* JADX INFO: renamed from: c */
    public VText f49163c;

    /* JADX INFO: renamed from: d */
    public VText f49164d;

    public LiveFansClubTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73005a(View view) {
        bcs.m101122a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73006b(@NonNull BLiveTask bLiveTask) {
        xdl0.m208345M0(this.f49161a, !TextUtils.isEmpty(bLiveTask.iconUrl));
        hxs.m133406s("context_livingAct", this.f49161a, bLiveTask.iconUrl);
        this.f49162b.setText(bLiveTask.title);
        this.f49163c.setText(String.format("%d%s", Long.valueOf(bLiveTask.score), bLiveTask.unit));
        this.f49164d.setText(bLiveTask.btnText);
        boolean z = bLiveTask.done;
        VText vText = this.f49164d;
        if (z) {
            vText.setBackgroundResource(i3c0.f110849S);
            this.f49164d.setTextColor(-1);
        } else {
            vText.setBackgroundResource(i3c0.f110638A0);
            this.f49164d.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73005a(this);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
