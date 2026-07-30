package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p007l.ilb0;
import p007l.zkb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static QATopicPhotoAlbumFeedFrag m7150O4(String str, String str2, String str3, int i, String str4) {
        QATopicPhotoAlbumFeedFrag qATopicPhotoAlbumFeedFrag = new QATopicPhotoAlbumFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        bundle.putString("single_topic_moment", str4);
        qATopicPhotoAlbumFeedFrag.setArguments(bundle);
        return qATopicPhotoAlbumFeedFrag;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo7053M4() {
        this.f4509z = new ilb0(this);
        zkb0 zkb0Var = new zkb0(this);
        this.f4508A = zkb0Var;
        zkb0Var.C(this.f4509z);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: o */
    public void mo7058o() {
        ((ilb0) this.f4509z).m10980w0();
        act().finish();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: y4 */
    public void mo7059y4() {
        ((ilb0) this.f4509z).m10968j0();
    }
}
