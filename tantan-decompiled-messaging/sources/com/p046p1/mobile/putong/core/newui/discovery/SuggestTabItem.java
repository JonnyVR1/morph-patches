package com.p046p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;
import p149l.qib0;
import p149l.rgj;
import p149l.utg0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestTabItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f21363d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f21364e;

    /* JADX INFO: renamed from: f */
    public VText f21365f;

    /* JADX INFO: renamed from: g */
    public View f21366g;

    public SuggestTabItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36288p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m36288p(View view) {
        utg0.m195306a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m36289q(int i) {
        this.f21365f.setTextColor(getResources().getColor(w0c0.f183831b));
        xdl0.m208344M(this.f21364e, false);
        qib0.f154691G.m102354Y0(this.f21363d, i);
        xdl0.m208345M0(this.f21366g, true);
    }

    /* JADX INFO: renamed from: z */
    public void m36290z(GPTopicCard gPTopicCard) {
        xdl0.m208345M0(this.f21366g, false);
        xdl0.m208344M(this.f21364e, true);
        if (!NullChecker.m81303a(gPTopicCard) || vwb.m200296J(gPTopicCard.pictures)) {
            qib0.f154691G.m102354Y0(this.f21364e, x2c0.f190569su);
            qib0.f154691G.m102354Y0(this.f21363d, x2c0.f190569su);
        } else {
            int size = gPTopicCard.pictures.size();
            String str = gPTopicCard.name;
            if (size == 1) {
                if (rgj.m179167a(str)) {
                    qib0.f154691G.m102336O(this.f21364e, gPTopicCard.pictures.get(0).url, 2, 40);
                } else {
                    qib0.f154691G.m102331L0(this.f21364e, gPTopicCard.pictures.get(0).url);
                }
                qib0.f154691G.m102354Y0(this.f21363d, x2c0.f190569su);
            } else if (rgj.m179167a(str)) {
                qib0.f154691G.m102336O(this.f21364e, gPTopicCard.pictures.get(0).url, 2, 40);
                qib0.f154691G.m102336O(this.f21363d, gPTopicCard.pictures.get(1).url, 2, 40);
            } else {
                qib0.f154691G.m102331L0(this.f21364e, gPTopicCard.pictures.get(0).url);
                qib0.f154691G.m102331L0(this.f21363d, gPTopicCard.pictures.get(1).url);
            }
        }
        this.f21365f.setTextColor(getResources().getColor(w0c0.f183883r1));
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
