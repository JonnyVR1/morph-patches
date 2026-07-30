package com.p051p1.mobile.putong.feed.newui.topic.topicplugin;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p153l.fu10;
import p153l.n8i;

/* JADX INFO: loaded from: classes13.dex */
public class MultiTabTopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static MultiTabTopicPhotoAlbumFeedFrag m67351O4(String str, String str2, String str3, int i, String str4) {
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

    @Override // com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo67088M4() {
        this.f43895A = new n8i(this);
        fu10 fu10Var = new fu10(this);
        this.f43896z = fu10Var;
        this.f43895A.mo52715C(fu10Var);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        ((fu10) this.f43896z).m127417d0();
    }
}
