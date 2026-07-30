package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p153l.bnl0;
import p153l.bug;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterTextView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public bug f42725B;

    public FeedCenterTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m65808l0() {
        return act() instanceof QATopicAggregationActivity;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo65780C() {
        bug bugVar = new bug();
        this.f42725B = bugVar;
        bugVar.m106533p(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo65781Z(i, moment, map);
        CharSequence charSequenceM65819E = m65819E(moment.momentValue);
        bnl0.m105524M(this.f42740g, true);
        bnl0.m105524M(this.f42739f, false);
        this.f42740g.setText(charSequenceM65819E);
        if (NullChecker.m82486a(this.f42725B.m106530m())) {
            bnl0.m105524M(this.f42725B.m106530m(), false);
        }
        boolean zM65808l0 = m65808l0();
        View view = this.f42738e;
        if (zM65808l0) {
            bnl0.m105538V(view, qa00.m175859d(52.0f));
            bnl0.m105539W(this.f42738e, qa00.m175859d(12.0f));
        } else {
            bnl0.m105538V(view, qa00.m175859d(64.0f));
            bnl0.m105539W(this.f42738e, qa00.m175859d(16.0f));
        }
        m65830X(this.f42725B.m106528k(), moment);
        m65831Y(moment);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo65785r() {
        this.f42734a = this.f42725B.m106523f();
        this.f42735b = this.f42725B.m106526i();
        this.f42736c = this.f42725B.m106531n();
        this.f42737d = this.f42725B.m106532o();
        this.f42740g = this.f42725B.m106529l();
        this.f42739f = this.f42725B.m106527j();
        this.f42741h = this.f42725B.m106525h();
        this.f42738e = this.f42725B.m106522e();
        this.f42739f.setLineLimit(4);
        this.f42756w = this.f42725B.m106524g();
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
