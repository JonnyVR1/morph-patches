package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import l.hxs;
import l.xdl0;
import p002l.i3c0;
import p002l.kas;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubAdvanceTaskModelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5110a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5111b;

    /* JADX INFO: renamed from: c */
    public VText f5112c;

    /* JADX INFO: renamed from: d */
    public VText f5113d;

    /* JADX INFO: renamed from: e */
    public VText f5114e;

    /* JADX INFO: renamed from: f */
    public View f5115f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5116g;

    /* JADX INFO: renamed from: h */
    public VText f5117h;

    public LiveFansClubAdvanceTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6419a(View view) {
        kas.m16586a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6420b(@NonNull BLiveAdvanceTask bLiveAdvanceTask) {
        xdl0.M0(this.f5111b, !TextUtils.isEmpty(bLiveAdvanceTask.iconUrl));
        hxs.s("context_livingAct", this.f5111b, bLiveAdvanceTask.iconUrl);
        this.f5112c.setText(bLiveAdvanceTask.title);
        this.f5113d.setText(String.format("%d%s", Long.valueOf(bLiveAdvanceTask.score), bLiveAdvanceTask.unit));
        this.f5114e.setText(bLiveAdvanceTask.btnText);
        if ("invalid".equals(bLiveAdvanceTask.status) || "done".equals(bLiveAdvanceTask.status)) {
            this.f5114e.setBackgroundResource(i3c0.f12679W0);
            this.f5114e.setTextColor(-2130706433);
        } else {
            this.f5114e.setBackgroundResource(i3c0.f12712Z0);
            this.f5114e.setTextColor(-17664);
        }
        if (TextUtils.isEmpty(bLiveAdvanceTask.desc)) {
            this.f5115f.setVisibility(8);
            this.f5116g.setVisibility(8);
        } else {
            this.f5117h.setText(bLiveAdvanceTask.desc);
            this.f5115f.setVisibility(0);
            this.f5116g.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6419a(this);
    }

    public LiveFansClubAdvanceTaskModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
