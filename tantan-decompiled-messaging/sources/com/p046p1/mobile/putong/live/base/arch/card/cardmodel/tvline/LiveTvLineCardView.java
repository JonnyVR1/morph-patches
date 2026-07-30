package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p149l.awu;
import p149l.bs5;
import p149l.d5c0;
import p149l.ddu;
import p149l.mcr;
import p149l.t100;
import p149l.uep0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTvLineCardView extends FrameLayout {
    private static final int MARGIN = t100.f167256e;
    private LiveTvLineCardExtItemView ext1LiveView;
    private LiveTvLineCardExtItemView ext2LiveView;
    private LiveTvLineCardMainItemView mainLiveView;

    public LiveTvLineCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m67535a(ddu dduVar, mcr mcrVar, bs5 bs5Var) {
        this.mainLiveView.m67534g(dduVar.m111061a(), dduVar.m111061a().live, mcrVar, bs5Var);
        awu awuVarM111062b = dduVar.m111062b();
        LiveTvLineCardExtItemView liveTvLineCardExtItemView = this.ext1LiveView;
        if (awuVarM111062b != null) {
            liveTvLineCardExtItemView.m67527e(dduVar.m111062b(), dduVar.m111062b().live, mcrVar, bs5Var, 2);
        } else {
            liveTvLineCardExtItemView.m67526d();
        }
        awu awuVarM111063c = dduVar.m111063c();
        LiveTvLineCardExtItemView liveTvLineCardExtItemView2 = this.ext2LiveView;
        if (awuVarM111063c != null) {
            liveTvLineCardExtItemView2.m67527e(dduVar.m111063c(), dduVar.m111063c().live, mcrVar, bs5Var, 3);
        } else {
            liveTvLineCardExtItemView2.m67526d();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mainLiveView = (LiveTvLineCardMainItemView) findViewById(d5c0.f84486j0);
        this.ext1LiveView = (LiveTvLineCardExtItemView) findViewById(d5c0.f84428L);
        this.ext2LiveView = (LiveTvLineCardExtItemView) findViewById(d5c0.f84430M);
        int iM208412y0 = xdl0.m208412y0();
        int i = MARGIN;
        int i2 = (iM208412y0 - (i * 8)) / 3;
        int i3 = i2 * 2;
        xdl0.m208325C0(this.mainLiveView, (i * 2) + i3);
        xdl0.m208327D0(i3 + (i * 2), this.mainLiveView);
        xdl0.m208325C0(this.ext1LiveView, i2);
        xdl0.m208327D0(i2, this.ext1LiveView);
        xdl0.m208325C0(this.ext2LiveView, i2);
        xdl0.m208327D0(i2, this.ext2LiveView);
        int i4 = i2 / 2;
        xdl0.m208325C0(this.mainLiveView._cover, i4);
        xdl0.m208325C0(this.ext1LiveView._cover, i4);
        xdl0.m208325C0(this.ext2LiveView._cover, i4);
        LiveTvLineCardMainItemView liveTvLineCardMainItemView = this.mainLiveView;
        int i5 = t100.f167260i;
        uep0.m193326m(liveTvLineCardMainItemView, i5);
        uep0.m193326m(this.ext1LiveView, i5);
        uep0.m193326m(this.ext2LiveView, i5);
    }

    public LiveTvLineCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveTvLineCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
