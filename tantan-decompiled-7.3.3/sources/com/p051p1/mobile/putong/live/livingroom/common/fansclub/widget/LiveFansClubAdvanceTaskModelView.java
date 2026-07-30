package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.lcs;
import p153l.obc0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubAdvanceTaskModelView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49916a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49917b;

    /* JADX INFO: renamed from: c */
    public VText f49918c;

    /* JADX INFO: renamed from: d */
    public VText f49919d;

    /* JADX INFO: renamed from: e */
    public VText f49920e;

    /* JADX INFO: renamed from: f */
    public View f49921f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f49922g;

    /* JADX INFO: renamed from: h */
    public VText f49923h;

    public LiveFansClubAdvanceTaskModelView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74083a(View view) {
        lcs.m153690a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74084b(@NonNull BLiveAdvanceTask bLiveAdvanceTask) {
        bnl0.m105525M0(this.f49917b, !TextUtils.isEmpty(bLiveAdvanceTask.iconUrl));
        izs.m142868s("context_livingAct", this.f49917b, bLiveAdvanceTask.iconUrl);
        this.f49918c.setText(bLiveAdvanceTask.title);
        this.f49919d.setText(String.format("%d%s", Long.valueOf(bLiveAdvanceTask.score), bLiveAdvanceTask.unit));
        this.f49920e.setText(bLiveAdvanceTask.btnText);
        if ("invalid".equals(bLiveAdvanceTask.status) || "done".equals(bLiveAdvanceTask.status)) {
            this.f49920e.setBackgroundResource(obc0.f146222W0);
            this.f49920e.setTextColor(-2130706433);
        } else {
            this.f49920e.setBackgroundResource(obc0.f146255Z0);
            this.f49920e.setTextColor(-17664);
        }
        if (TextUtils.isEmpty(bLiveAdvanceTask.desc)) {
            this.f49921f.setVisibility(8);
            this.f49922g.setVisibility(8);
        } else {
            this.f49923h.setText(bLiveAdvanceTask.desc);
            this.f49921f.setVisibility(0);
            this.f49922g.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74083a(this);
    }

    public LiveFansClubAdvanceTaskModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
