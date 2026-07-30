package com.p000p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.utg0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import p009l.rgj;
import v.VDraweeView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuggestTabItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f141d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f142e;

    /* JADX INFO: renamed from: f */
    public VText f143f;

    /* JADX INFO: renamed from: g */
    public View f144g;

    public SuggestTabItem(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m206p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m206p(View view) {
        utg0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m207q(int i) {
        this.f143f.setTextColor(getResources().getColor(w0c0.b));
        xdl0.M(this.f142e, false);
        qib0.G.Y0(this.f141d, i);
        xdl0.M0(this.f144g, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m208z(GPTopicCard gPTopicCard) {
        xdl0.M0(this.f144g, false);
        xdl0.M(this.f142e, true);
        if (!NullChecker.a(gPTopicCard) || vwb.J(gPTopicCard.pictures)) {
            qib0.G.Y0(this.f142e, x2c0.su);
            qib0.G.Y0(this.f141d, x2c0.su);
        } else {
            int size = gPTopicCard.pictures.size();
            String str = gPTopicCard.name;
            if (size == 1) {
                if (rgj.m21658a(str)) {
                    qib0.G.O(this.f142e, ((Media) gPTopicCard.pictures.get(0)).url, 2, 40);
                } else {
                    qib0.G.L0(this.f142e, ((Media) gPTopicCard.pictures.get(0)).url);
                }
                qib0.G.Y0(this.f141d, x2c0.su);
            } else if (rgj.m21658a(str)) {
                qib0.G.O(this.f142e, ((Media) gPTopicCard.pictures.get(0)).url, 2, 40);
                qib0.G.O(this.f141d, ((Media) gPTopicCard.pictures.get(1)).url, 2, 40);
            } else {
                qib0.G.L0(this.f142e, ((Media) gPTopicCard.pictures.get(0)).url);
                qib0.G.L0(this.f141d, ((Media) gPTopicCard.pictures.get(1)).url);
            }
        }
        this.f143f.setTextColor(getResources().getColor(w0c0.r1));
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
