package com.p000p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p007l.vl10;
import p007l.y6i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MultiTabTopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static MultiTabTopicPhotoAlbumFeedFrag m7324O4(String str, String str2, String str3, int i, String str4) {
        MultiTabTopicPhotoAlbumFeedFrag multiTabTopicPhotoAlbumFeedFrag = new MultiTabTopicPhotoAlbumFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        bundle.putString("single_topic_moment", str4);
        multiTabTopicPhotoAlbumFeedFrag.setArguments(bundle);
        return multiTabTopicPhotoAlbumFeedFrag;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo7053M4() {
        this.f4508A = new y6i(this);
        vl10 vl10Var = new vl10(this);
        this.f4509z = vl10Var;
        this.f4508A.C(vl10Var);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: y4 */
    public void mo7059y4() {
        ((vl10) this.f4509z).m15432d0();
    }
}
