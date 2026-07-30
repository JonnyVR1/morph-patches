package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.byu;
import p153l.efu;
import p153l.ft5;
import p153l.jdc0;
import p153l.ner;
import p153l.qa00;
import p153l.ynp0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTvLineCardView extends FrameLayout {
    private static final int MARGIN = qa00.f156318e;
    private LiveTvLineCardExtItemView ext1LiveView;
    private LiveTvLineCardExtItemView ext2LiveView;
    private LiveTvLineCardMainItemView mainLiveView;

    public LiveTvLineCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m68718a(efu efuVar, ner nerVar, ft5 ft5Var) {
        this.mainLiveView.m68717g(efuVar.m120717a(), efuVar.m120717a().live, nerVar, ft5Var);
        byu byuVarM120718b = efuVar.m120718b();
        LiveTvLineCardExtItemView liveTvLineCardExtItemView = this.ext1LiveView;
        if (byuVarM120718b != null) {
            liveTvLineCardExtItemView.m68710e(efuVar.m120718b(), efuVar.m120718b().live, nerVar, ft5Var, 2);
        } else {
            liveTvLineCardExtItemView.m68709d();
        }
        byu byuVarM120719c = efuVar.m120719c();
        LiveTvLineCardExtItemView liveTvLineCardExtItemView2 = this.ext2LiveView;
        if (byuVarM120719c != null) {
            liveTvLineCardExtItemView2.m68710e(efuVar.m120719c(), efuVar.m120719c().live, nerVar, ft5Var, 3);
        } else {
            liveTvLineCardExtItemView2.m68709d();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mainLiveView = (LiveTvLineCardMainItemView) findViewById(jdc0.f120204j0);
        this.ext1LiveView = (LiveTvLineCardExtItemView) findViewById(jdc0.f120146L);
        this.ext2LiveView = (LiveTvLineCardExtItemView) findViewById(jdc0.f120148M);
        int iM105592y0 = bnl0.m105592y0();
        int i = MARGIN;
        int i2 = (iM105592y0 - (i * 8)) / 3;
        int i3 = i2 * 2;
        bnl0.m105505C0(this.mainLiveView, (i * 2) + i3);
        bnl0.m105507D0(i3 + (i * 2), this.mainLiveView);
        bnl0.m105505C0(this.ext1LiveView, i2);
        bnl0.m105507D0(i2, this.ext1LiveView);
        bnl0.m105505C0(this.ext2LiveView, i2);
        bnl0.m105507D0(i2, this.ext2LiveView);
        int i4 = i2 / 2;
        bnl0.m105505C0(this.mainLiveView._cover, i4);
        bnl0.m105505C0(this.ext1LiveView._cover, i4);
        bnl0.m105505C0(this.ext2LiveView._cover, i4);
        LiveTvLineCardMainItemView liveTvLineCardMainItemView = this.mainLiveView;
        int i5 = qa00.f156322i;
        ynp0.m216936m(liveTvLineCardMainItemView, i5);
        ynp0.m216936m(this.ext1LiveView, i5);
        ynp0.m216936m(this.ext2LiveView, i5);
    }

    public LiveTvLineCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveTvLineCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
