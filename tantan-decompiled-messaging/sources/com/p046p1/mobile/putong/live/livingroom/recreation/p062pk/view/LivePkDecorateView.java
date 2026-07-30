package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLivePkScoreViewConfig;
import p147v.VDraweeView;
import p149l.fat;
import p149l.hxs;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkDecorateView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51645a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51646b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51647c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51648d;

    public LivePkDecorateView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76142a(View view) {
        fat.m120304a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76142a(this);
    }

    public void setDecorateData(BLivePkScoreViewConfig bLivePkScoreViewConfig) {
        int i = t100.f167277z;
        int i2 = t100.f167244S;
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.leftUrl)) {
            qib0.f154691G.m184725o(this.f51645a);
        } else {
            hxs.m133408u("context_single_room", this.f51645a, bLivePkScoreViewConfig.leftUrl, i2, i);
        }
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.rightUrl)) {
            qib0.f154691G.m184725o(this.f51647c);
        } else {
            hxs.m133408u("context_single_room", this.f51647c, bLivePkScoreViewConfig.rightUrl, i2, i);
        }
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(240.0f);
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.centerUrl)) {
            qib0.f154691G.m184725o(this.f51646b);
        } else {
            hxs.m133408u("context_single_room", this.f51646b, bLivePkScoreViewConfig.centerUrl, iM208412y0, i);
        }
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.topUrl)) {
            qib0.f154691G.m184725o(this.f51648d);
        } else {
            hxs.m133408u("context_single_room", this.f51648d, bLivePkScoreViewConfig.topUrl, iM208412y0, i);
        }
    }

    public LivePkDecorateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkDecorateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
