package com.p000p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.xaj0;
import p007l.o7i;
import p007l.p7i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTopicMomentFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public o7i f4716A;

    /* JADX INFO: renamed from: z */
    public p7i f4717z;

    /* JADX INFO: renamed from: N4 */
    public static FeedTopicMomentFragment m7311N4(String str, String str2, String str3, int i) {
        FeedTopicMomentFragment feedTopicMomentFragment = new FeedTopicMomentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        feedTopicMomentFragment.setArguments(bundle);
        return feedTopicMomentFragment;
    }

    /* JADX INFO: renamed from: O4 */
    public static FeedTopicMomentFragment m7312O4(String str, String str2, String str3, int i, Moment moment) {
        FeedTopicMomentFragment feedTopicMomentFragmentM7311N4 = m7311N4(str, str2, str3, i);
        Bundle arguments = feedTopicMomentFragmentM7311N4.getArguments();
        if (NullChecker.a(arguments)) {
            arguments.putSerializable("single_topic_moment", moment);
        }
        feedTopicMomentFragmentM7311N4.setArguments(arguments);
        return feedTopicMomentFragmentM7311N4;
    }

    /* JADX INFO: renamed from: M4 */
    public void m7313M4(Moment moment) {
        this.f4716A.m12451g0(moment);
    }

    /* JADX INFO: renamed from: P4 */
    public void m7314P4() {
        this.f4717z = new p7i(this);
        o7i o7iVar = new o7i(this);
        this.f4716A = o7iVar;
        o7iVar.C(this.f4717z);
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedBaseFrag m7315Q4() {
        return this.f4717z.f11721e;
    }

    /* JADX INFO: renamed from: R4 */
    public o7i m7316R4() {
        if (this.f4716A == null) {
            m7314P4();
        }
        return this.f4716A;
    }

    /* JADX INFO: renamed from: S4 */
    public String m7317S4() {
        return this.f4716A.f11368e;
    }

    /* JADX INFO: renamed from: T4 */
    public void m7318T4() {
        m7315Q4().m5062Z4();
        this.f4717z.m12939k(true);
    }

    /* JADX INFO: renamed from: U4 */
    public void m7319U4(xaj0<Links, List<Moment>, List<TopicMoment>> xaj0Var) {
        this.f4716A.m12462r0(xaj0Var);
    }

    /* JADX INFO: renamed from: f4 */
    public void m7320f4() {
        super.f4();
        if (this.f4716A == null) {
            m7314P4();
        }
        this.f4716A.a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m7321g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f4717z.m12936i(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4717z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m7322n4(Bundle bundle) {
        this.f4716A.m12456l0();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    /* JADX INFO: renamed from: y4 */
    public void m7323y4() {
        this.f4717z.m12933b();
    }
}
