package com.p051p1.mobile.putong.feed.newui.topic.vote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p153l.bkj0;
import p153l.cdj0;
import p153l.ldj0;
import p153l.pf60;

/* JADX INFO: loaded from: classes13.dex */
public class TopicVoteAggregationFeedFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public cdj0 f44115A;

    /* JADX INFO: renamed from: z */
    public ldj0 f44116z;

    /* JADX INFO: renamed from: M4 */
    public static TopicVoteAggregationFeedFrag m67357M4(String str, String str2, String str3, int i) {
        TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag = new TopicVoteAggregationFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("topic_id", str);
        bundle.putString("topic_owner", str2);
        bundle.putString("moment_id", str3);
        bundle.putInt("vote_index", i);
        topicVoteAggregationFeedFrag.setArguments(bundle);
        return topicVoteAggregationFeedFrag;
    }

    /* JADX INFO: renamed from: N4 */
    private void m67358N4() {
        this.f44116z = new ldj0(this);
        cdj0 cdj0Var = new cdj0(this);
        this.f44115A = cdj0Var;
        cdj0Var.mo52715C(this.f44116z);
    }

    /* JADX INFO: renamed from: O4 */
    public void m67359O4(Throwable th) {
        this.f44116z.m153763B(th);
    }

    /* JADX INFO: renamed from: P4 */
    public void m67360P4(bkj0<Links, List<TopicMoment>, List<MomentMessage>> bkj0Var) {
        this.f44115A.m109222x0(bkj0Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m67361Q4(pf60<Links, List<MomentMessage>> pf60Var) {
        this.f44115A.m109223y0(pf60Var);
    }

    /* JADX INFO: renamed from: R4 */
    public void m67362R4(String str, String str2) {
        this.f44116z.m153769I(str, str2);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f44116z.m153775q(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44116z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        m67358N4();
        this.f44115A.m109215n0();
    }
}
