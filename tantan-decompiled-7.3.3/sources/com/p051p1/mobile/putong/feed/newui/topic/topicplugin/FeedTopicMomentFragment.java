package com.p051p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.bkj0;
import p153l.d9i;
import p153l.e9i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTopicMomentFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public d9i f44103A;

    /* JADX INFO: renamed from: z */
    public e9i f44104z;

    /* JADX INFO: renamed from: N4 */
    public static FeedTopicMomentFragment m67342N4(String str, String str2, String str3, int i) {
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
    public static FeedTopicMomentFragment m67343O4(String str, String str2, String str3, int i, Moment moment) {
        FeedTopicMomentFragment feedTopicMomentFragmentM67342N4 = m67342N4(str, str2, str3, i);
        Bundle arguments = feedTopicMomentFragmentM67342N4.getArguments();
        if (NullChecker.m82486a(arguments)) {
            arguments.putSerializable("single_topic_moment", moment);
        }
        feedTopicMomentFragmentM67342N4.setArguments(arguments);
        return feedTopicMomentFragmentM67342N4;
    }

    /* JADX INFO: renamed from: M4 */
    public void m67344M4(Moment moment) {
        this.f44103A.m115068g0(moment);
    }

    /* JADX INFO: renamed from: P4 */
    public void m67345P4() {
        this.f44104z = new e9i(this);
        d9i d9iVar = new d9i(this);
        this.f44103A = d9iVar;
        d9iVar.mo52715C(this.f44104z);
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedBaseFrag m67346Q4() {
        return this.f44104z.f92640e;
    }

    /* JADX INFO: renamed from: R4 */
    public d9i m67347R4() {
        if (this.f44103A == null) {
            m67345P4();
        }
        return this.f44103A;
    }

    /* JADX INFO: renamed from: S4 */
    public String m67348S4() {
        return this.f44103A.f85781e;
    }

    /* JADX INFO: renamed from: T4 */
    public void m67349T4() {
        m67346Q4().m65202Z4();
        this.f44104z.m119894k(true);
    }

    /* JADX INFO: renamed from: U4 */
    public void m67350U4(bkj0<Links, List<Moment>, List<TopicMoment>> bkj0Var) {
        this.f44103A.m115079r0(bkj0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        if (this.f44103A == null) {
            m67345P4();
        }
        this.f44103A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f44104z.m119892i(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44104z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        this.f44103A.m115073l0();
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        this.f44104z.m119889b();
    }
}
