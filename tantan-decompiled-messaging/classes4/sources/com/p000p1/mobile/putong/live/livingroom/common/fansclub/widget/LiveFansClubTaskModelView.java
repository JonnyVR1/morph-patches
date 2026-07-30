package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveTask;
import l.hxs;
import l.xdl0;
import p002l.bcs;
import p002l.i3c0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubTaskModelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5203a;

    /* JADX INFO: renamed from: b */
    public VText f5204b;

    /* JADX INFO: renamed from: c */
    public VText f5205c;

    /* JADX INFO: renamed from: d */
    public VText f5206d;

    public LiveFansClubTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6528a(View view) {
        bcs.m10225a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6529b(@NonNull BLiveTask bLiveTask) {
        xdl0.M0(this.f5203a, !TextUtils.isEmpty(bLiveTask.iconUrl));
        hxs.s("context_livingAct", this.f5203a, bLiveTask.iconUrl);
        this.f5204b.setText(bLiveTask.title);
        this.f5205c.setText(String.format("%d%s", Long.valueOf(bLiveTask.score), bLiveTask.unit));
        this.f5206d.setText(bLiveTask.btnText);
        boolean z = bLiveTask.done;
        VText vText = this.f5206d;
        if (z) {
            vText.setBackgroundResource(i3c0.f12634S);
            this.f5206d.setTextColor(-1);
        } else {
            vText.setBackgroundResource(i3c0.f12423A0);
            this.f5206d.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6528a(this);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
