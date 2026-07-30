package com.p051p1.mobile.putong.core.newui.discovery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.c2h0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jyb;
import p153l.ljj;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestTabItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public VDraweeView f22105d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f22106e;

    /* JADX INFO: renamed from: f */
    public VText f22107f;

    /* JADX INFO: renamed from: g */
    public View f22108g;

    public SuggestTabItem(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37291p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m37291p(View view) {
        c2h0.m107687a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m37292q(int i) {
        this.f22107f.setTextColor(getResources().getColor(c9c0.f80400b));
        bnl0.m105524M(this.f22106e, false);
        uqb0.f180374G.m127138Y0(this.f22105d, i);
        bnl0.m105525M0(this.f22108g, true);
    }

    /* JADX INFO: renamed from: z */
    public void m37293z(GPTopicCard gPTopicCard) {
        bnl0.m105525M0(this.f22108g, false);
        bnl0.m105524M(this.f22106e, true);
        if (!NullChecker.m82486a(gPTopicCard) || jyb.m147479J(gPTopicCard.pictures)) {
            uqb0.f180374G.m127138Y0(this.f22106e, dbc0.f87037gv);
            uqb0.f180374G.m127138Y0(this.f22105d, dbc0.f87037gv);
        } else {
            int size = gPTopicCard.pictures.size();
            String str = gPTopicCard.name;
            if (size == 1) {
                if (ljj.m154509a(str)) {
                    uqb0.f180374G.m127120O(this.f22106e, gPTopicCard.pictures.get(0).url, 2, 40);
                } else {
                    uqb0.f180374G.m127115L0(this.f22106e, gPTopicCard.pictures.get(0).url);
                }
                uqb0.f180374G.m127138Y0(this.f22105d, dbc0.f87037gv);
            } else if (ljj.m154509a(str)) {
                uqb0.f180374G.m127120O(this.f22106e, gPTopicCard.pictures.get(0).url, 2, 40);
                uqb0.f180374G.m127120O(this.f22105d, gPTopicCard.pictures.get(1).url, 2, 40);
            } else {
                uqb0.f180374G.m127115L0(this.f22106e, gPTopicCard.pictures.get(0).url);
                uqb0.f180374G.m127115L0(this.f22105d, gPTopicCard.pictures.get(1).url);
            }
        }
        this.f22107f.setTextColor(getResources().getColor(c9c0.f80456s1));
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestTabItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
