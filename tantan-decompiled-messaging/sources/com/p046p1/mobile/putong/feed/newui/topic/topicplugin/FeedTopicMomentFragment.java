package com.p046p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.o7i;
import p149l.p7i;
import p149l.xaj0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTopicMomentFragment extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public o7i f43255A;

    /* JADX INFO: renamed from: z */
    public p7i f43256z;

    /* JADX INFO: renamed from: N4 */
    public static FeedTopicMomentFragment m66159N4(String str, String str2, String str3, int i) {
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
    public static FeedTopicMomentFragment m66160O4(String str, String str2, String str3, int i, Moment moment) {
        FeedTopicMomentFragment feedTopicMomentFragmentM66159N4 = m66159N4(str, str2, str3, i);
        Bundle arguments = feedTopicMomentFragmentM66159N4.getArguments();
        if (NullChecker.m81303a(arguments)) {
            arguments.putSerializable("single_topic_moment", moment);
        }
        feedTopicMomentFragmentM66159N4.setArguments(arguments);
        return feedTopicMomentFragmentM66159N4;
    }

    /* JADX INFO: renamed from: M4 */
    public void m66161M4(Moment moment) {
        this.f43255A.m162985g0(moment);
    }

    /* JADX INFO: renamed from: P4 */
    public void m66162P4() {
        this.f43256z = new p7i(this);
        o7i o7iVar = new o7i(this);
        this.f43255A = o7iVar;
        o7iVar.mo51532C(this.f43256z);
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedBaseFrag m66163Q4() {
        return this.f43256z.f147513e;
    }

    /* JADX INFO: renamed from: R4 */
    public o7i m66164R4() {
        if (this.f43255A == null) {
            m66162P4();
        }
        return this.f43255A;
    }

    /* JADX INFO: renamed from: S4 */
    public String m66165S4() {
        return this.f43255A.f142496e;
    }

    /* JADX INFO: renamed from: T4 */
    public void m66166T4() {
        m66163Q4().m64019Z4();
        this.f43256z.m167759k(true);
    }

    /* JADX INFO: renamed from: U4 */
    public void m66167U4(xaj0<Links, List<Moment>, List<TopicMoment>> xaj0Var) {
        this.f43255A.m162996r0(xaj0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        if (this.f43255A == null) {
            m66162P4();
        }
        this.f43255A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f43256z.m167757i(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43256z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        this.f43255A.m162990l0();
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        this.f43256z.m167754b();
    }
}
