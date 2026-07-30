package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLivePkScoreViewConfig;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gct;
import p153l.izs;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkDecorateView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52493a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52494b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52495c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52496d;

    public LivePkDecorateView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77325a(View view) {
        gct.m129902a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77325a(this);
    }

    public void setDecorateData(BLivePkScoreViewConfig bLivePkScoreViewConfig) {
        int i = qa00.f156339z;
        int i2 = qa00.f156306S;
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.leftUrl)) {
            uqb0.f180374G.m98798o(this.f52493a);
        } else {
            izs.m142870u("context_single_room", this.f52493a, bLivePkScoreViewConfig.leftUrl, i2, i);
        }
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.rightUrl)) {
            uqb0.f180374G.m98798o(this.f52495c);
        } else {
            izs.m142870u("context_single_room", this.f52495c, bLivePkScoreViewConfig.rightUrl, i2, i);
        }
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(240.0f);
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.centerUrl)) {
            uqb0.f180374G.m98798o(this.f52494b);
        } else {
            izs.m142870u("context_single_room", this.f52494b, bLivePkScoreViewConfig.centerUrl, iM105592y0, i);
        }
        if (TextUtils.isEmpty(bLivePkScoreViewConfig.topUrl)) {
            uqb0.f180374G.m98798o(this.f52496d);
        } else {
            izs.m142870u("context_single_room", this.f52496d, bLivePkScoreViewConfig.topUrl, iM105592y0, i);
        }
    }

    public LivePkDecorateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePkDecorateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
