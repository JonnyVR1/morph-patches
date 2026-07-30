package com.p046p1.mobile.putong.feed.newui.topic.vote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p149l.h4j0;
import p149l.j760;
import p149l.xaj0;
import p149l.y3j0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicVoteAggregationFeedFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public y3j0 f43267A;

    /* JADX INFO: renamed from: z */
    public h4j0 f43268z;

    /* JADX INFO: renamed from: M4 */
    public static TopicVoteAggregationFeedFrag m66174M4(String str, String str2, String str3, int i) {
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
    private void m66175N4() {
        this.f43268z = new h4j0(this);
        y3j0 y3j0Var = new y3j0(this);
        this.f43267A = y3j0Var;
        y3j0Var.mo51532C(this.f43268z);
    }

    /* JADX INFO: renamed from: O4 */
    public void m66176O4(Throwable th) {
        this.f43268z.m129257B(th);
    }

    /* JADX INFO: renamed from: P4 */
    public void m66177P4(xaj0<Links, List<TopicMoment>, List<MomentMessage>> xaj0Var) {
        this.f43267A.m212842x0(xaj0Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m66178Q4(j760<Links, List<MomentMessage>> j760Var) {
        this.f43267A.m212843y0(j760Var);
    }

    /* JADX INFO: renamed from: R4 */
    public void m66179R4(String str, String str2) {
        this.f43268z.m129263I(str, str2);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f43268z.m129269q(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43268z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        m66175N4();
        this.f43267A.m212835n0();
    }
}
