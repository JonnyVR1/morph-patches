package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.ces;
import p153l.izs;
import p153l.obc0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubTaskModelView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50009a;

    /* JADX INFO: renamed from: b */
    public VText f50010b;

    /* JADX INFO: renamed from: c */
    public VText f50011c;

    /* JADX INFO: renamed from: d */
    public VText f50012d;

    public LiveFansClubTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74188a(View view) {
        ces.m109452a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74189b(@NonNull BLiveTask bLiveTask) {
        bnl0.m105525M0(this.f50009a, !TextUtils.isEmpty(bLiveTask.iconUrl));
        izs.m142868s("context_livingAct", this.f50009a, bLiveTask.iconUrl);
        this.f50010b.setText(bLiveTask.title);
        this.f50011c.setText(String.format("%d%s", Long.valueOf(bLiveTask.score), bLiveTask.unit));
        this.f50012d.setText(bLiveTask.btnText);
        boolean z = bLiveTask.done;
        VText vText = this.f50012d;
        if (z) {
            vText.setBackgroundResource(obc0.f146177S);
            this.f50012d.setTextColor(-1);
        } else {
            vText.setBackgroundResource(obc0.f145966A0);
            this.f50012d.setTextColor(-1);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74188a(this);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubTaskModelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
