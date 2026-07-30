package com.p046p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p149l.vl10;
import p149l.y6i;

/* JADX INFO: loaded from: classes12.dex */
public class MultiTabTopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static MultiTabTopicPhotoAlbumFeedFrag m66168O4(String str, String str2, String str3, int i, String str4) {
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

    @Override // com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo65905M4() {
        this.f43047A = new y6i(this);
        vl10 vl10Var = new vl10(this);
        this.f43048z = vl10Var;
        this.f43047A.mo51532C(vl10Var);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        ((vl10) this.f43048z).m198758d0();
    }
}
