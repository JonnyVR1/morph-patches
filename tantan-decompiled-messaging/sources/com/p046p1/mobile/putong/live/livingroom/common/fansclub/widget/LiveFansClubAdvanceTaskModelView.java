package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.kas;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubAdvanceTaskModelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49068a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49069b;

    /* JADX INFO: renamed from: c */
    public VText f49070c;

    /* JADX INFO: renamed from: d */
    public VText f49071d;

    /* JADX INFO: renamed from: e */
    public VText f49072e;

    /* JADX INFO: renamed from: f */
    public View f49073f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f49074g;

    /* JADX INFO: renamed from: h */
    public VText f49075h;

    public LiveFansClubAdvanceTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72900a(View view) {
        kas.m145179a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72901b(@NonNull BLiveAdvanceTask bLiveAdvanceTask) {
        xdl0.m208345M0(this.f49069b, !TextUtils.isEmpty(bLiveAdvanceTask.iconUrl));
        hxs.m133406s("context_livingAct", this.f49069b, bLiveAdvanceTask.iconUrl);
        this.f49070c.setText(bLiveAdvanceTask.title);
        this.f49071d.setText(String.format("%d%s", Long.valueOf(bLiveAdvanceTask.score), bLiveAdvanceTask.unit));
        this.f49072e.setText(bLiveAdvanceTask.btnText);
        if ("invalid".equals(bLiveAdvanceTask.status) || "done".equals(bLiveAdvanceTask.status)) {
            this.f49072e.setBackgroundResource(i3c0.f110894W0);
            this.f49072e.setTextColor(-2130706433);
        } else {
            this.f49072e.setBackgroundResource(i3c0.f110927Z0);
            this.f49072e.setTextColor(-17664);
        }
        if (TextUtils.isEmpty(bLiveAdvanceTask.desc)) {
            this.f49073f.setVisibility(8);
            this.f49074g.setVisibility(8);
        } else {
            this.f49075h.setText(bLiveAdvanceTask.desc);
            this.f49073f.setVisibility(0);
            this.f49074g.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72900a(this);
    }

    public LiveFansClubAdvanceTaskModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
