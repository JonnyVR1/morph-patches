package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p149l.ilb0;
import p149l.zkb0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static QATopicPhotoAlbumFeedFrag m65998O4(String str, String str2, String str3, int i, String str4) {
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

    @Override // com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo65905M4() {
        this.f43048z = new ilb0(this);
        zkb0 zkb0Var = new zkb0(this);
        this.f43047A = zkb0Var;
        zkb0Var.mo51532C(this.f43048z);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: o */
    public void mo65907o() {
        ((ilb0) this.f43048z).m136983w0();
        act().m66873d2();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        ((ilb0) this.f43048z).m136971j0();
    }
}
