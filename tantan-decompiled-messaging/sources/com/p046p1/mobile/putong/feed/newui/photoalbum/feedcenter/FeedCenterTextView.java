package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p149l.msg;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterTextView extends FeedCenterView {

    /* JADX INFO: renamed from: B */
    public msg f41877B;

    public FeedCenterTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m64625l0() {
        return act() instanceof QATopicAggregationActivity;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: C */
    public void mo64597C() {
        msg msgVar = new msg();
        this.f41877B = msgVar;
        msgVar.m156146p(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, Moment moment, HashMap<String, Boolean> map) {
        super.mo64598Z(i, moment, map);
        CharSequence charSequenceM64636E = m64636E(moment.momentValue);
        xdl0.m208344M(this.f41892g, true);
        xdl0.m208344M(this.f41891f, false);
        this.f41892g.setText(charSequenceM64636E);
        if (NullChecker.m81303a(this.f41877B.m156143m())) {
            xdl0.m208344M(this.f41877B.m156143m(), false);
        }
        boolean zM64625l0 = m64625l0();
        View view = this.f41890e;
        if (zM64625l0) {
            xdl0.m208358V(view, t100.m186890d(52.0f));
            xdl0.m208359W(this.f41890e, t100.m186890d(12.0f));
        } else {
            xdl0.m208358V(view, t100.m186890d(64.0f));
            xdl0.m208359W(this.f41890e, t100.m186890d(16.0f));
        }
        m64647X(this.f41877B.m156141k(), moment);
        m64648Y(moment);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView
    /* JADX INFO: renamed from: r */
    public void mo64602r() {
        this.f41886a = this.f41877B.m156136f();
        this.f41887b = this.f41877B.m156139i();
        this.f41888c = this.f41877B.m156144n();
        this.f41889d = this.f41877B.m156145o();
        this.f41892g = this.f41877B.m156142l();
        this.f41891f = this.f41877B.m156140j();
        this.f41893h = this.f41877B.m156138h();
        this.f41890e = this.f41877B.m156135e();
        this.f41891f.setLineLimit(4);
        this.f41908w = this.f41877B.m156137g();
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
