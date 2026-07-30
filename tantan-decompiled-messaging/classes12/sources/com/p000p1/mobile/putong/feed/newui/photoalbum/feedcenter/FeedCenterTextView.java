package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.t100;
import l.xdl0;
import p007l.msg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterTextView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public msg f3338B;

    public FeedCenterTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m5719l0() {
        return act() instanceof QATopicAggregationActivity;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo5691C() {
        msg msgVar = new msg();
        this.f3338B = msgVar;
        msgVar.m12025p(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo5692Z(i, moment, map);
        CharSequence charSequenceM5730E = m5730E(moment.momentValue);
        xdl0.M(this.f3353g, true);
        xdl0.M(this.f3352f, false);
        this.f3353g.setText(charSequenceM5730E);
        if (NullChecker.a(this.f3338B.m12022m())) {
            xdl0.M(this.f3338B.m12022m(), false);
        }
        boolean zM5719l0 = m5719l0();
        View view = this.f3351e;
        if (zM5719l0) {
            xdl0.V(view, t100.d(52.0f));
            xdl0.W(this.f3351e, t100.d(12.0f));
        } else {
            xdl0.V(view, t100.d(64.0f));
            xdl0.W(this.f3351e, t100.d(16.0f));
        }
        m5741X(this.f3338B.m12020k(), moment);
        m5742Y(moment);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo5696r() {
        this.f3347a = this.f3338B.m12015f();
        this.f3348b = this.f3338B.m12018i();
        this.f3349c = this.f3338B.m12023n();
        this.f3350d = this.f3338B.m12024o();
        this.f3353g = this.f3338B.m12021l();
        this.f3352f = this.f3338B.m12019j();
        this.f3354h = this.f3338B.m12017h();
        this.f3351e = this.f3338B.m12014e();
        this.f3352f.setLineLimit(4);
        this.f3369w = this.f3338B.m12016g();
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
