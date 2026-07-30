package p007l;

import android.content.Intent;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import l.jq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qmh extends jq2<umh> {

    /* JADX INFO: renamed from: a */
    public String f12276a;

    /* JADX INFO: renamed from: b */
    public String f12277b;

    /* JADX INFO: renamed from: c */
    public boolean f12278c;

    public qmh(FeedPoiAggregationAct feedPoiAggregationAct) {
        super(feedPoiAggregationAct);
        m13588e0(feedPoiAggregationAct);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public void m13588e0(FeedPoiAggregationAct feedPoiAggregationAct) {
        Intent intent = feedPoiAggregationAct.getIntent();
        if (intent == null) {
            return;
        }
        this.f12276a = intent.getStringExtra(FeedPoiAggregationAct.f3739e);
        this.f12277b = intent.getStringExtra(FeedPoiAggregationAct.f3740f);
        this.f12278c = intent.getBooleanExtra(FeedPoiAggregationAct.f3741g, false);
    }

    public void destroy() {
    }
}
