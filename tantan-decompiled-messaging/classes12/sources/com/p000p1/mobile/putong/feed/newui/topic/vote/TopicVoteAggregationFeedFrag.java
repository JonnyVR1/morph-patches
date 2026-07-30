package com.p000p1.mobile.putong.feed.newui.topic.vote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.putong.app.PutongFrag;
import java.util.List;
import l.j760;
import l.xaj0;
import p007l.h4j0;
import p007l.y3j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicVoteAggregationFeedFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public y3j0 f4728A;

    /* JADX INFO: renamed from: z */
    public h4j0 f4729z;

    /* JADX INFO: renamed from: M4 */
    public static TopicVoteAggregationFeedFrag m7330M4(String str, String str2, String str3, int i) {
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
    private void m7331N4() {
        this.f4729z = new h4j0(this);
        y3j0 y3j0Var = new y3j0(this);
        this.f4728A = y3j0Var;
        y3j0Var.C(this.f4729z);
    }

    /* JADX INFO: renamed from: O4 */
    public void m7332O4(Throwable th) {
        this.f4729z.m10531B(th);
    }

    /* JADX INFO: renamed from: P4 */
    public void m7333P4(xaj0<Links, List<TopicMoment>, List<MomentMessage>> xaj0Var) {
        this.f4728A.m16918x0(xaj0Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m7334Q4(j760<Links, List<MomentMessage>> j760Var) {
        this.f4728A.m16919y0(j760Var);
    }

    /* JADX INFO: renamed from: R4 */
    public void m7335R4(String str, String str2) {
        this.f4729z.m10538I(str, str2);
    }

    /* JADX INFO: renamed from: g4 */
    public void m7336g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f4729z.m10545q(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4729z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m7337n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        m7331N4();
        this.f4728A.m16911n0();
    }
}
