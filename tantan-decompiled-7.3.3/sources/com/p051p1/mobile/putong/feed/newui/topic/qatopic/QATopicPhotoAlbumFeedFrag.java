package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag;
import p153l.dtb0;
import p153l.mtb0;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicPhotoAlbumFeedFrag extends FeedTopicAggregationBaseFrag {
    /* JADX INFO: renamed from: O4 */
    public static QATopicPhotoAlbumFeedFrag m67181O4(String str, String str2, String str3, int i, String str4) {
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

    @Override // com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo67088M4() {
        this.f43896z = new mtb0(this);
        dtb0 dtb0Var = new dtb0(this);
        this.f43895A = dtb0Var;
        dtb0Var.mo52715C(this.f43896z);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag
    /* JADX INFO: renamed from: o */
    public void mo67090o() {
        ((mtb0) this.f43896z).m159982w0();
        act().m68056e2();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.FeedTopicAggregationBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        ((mtb0) this.f43896z).m159970j0();
    }
}
