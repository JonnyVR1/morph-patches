package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;

/* JADX INFO: loaded from: classes12.dex */
public class qmh extends jq2<umh> {

    /* JADX INFO: renamed from: a */
    public String f155312a;

    /* JADX INFO: renamed from: b */
    public String f155313b;

    /* JADX INFO: renamed from: c */
    public boolean f155314c;

    public qmh(FeedPoiAggregationAct feedPoiAggregationAct) {
        super(feedPoiAggregationAct);
        m175570e0(feedPoiAggregationAct);
    }

    /* JADX INFO: renamed from: e0 */
    public void m175570e0(FeedPoiAggregationAct feedPoiAggregationAct) {
        Intent intent = feedPoiAggregationAct.getIntent();
        if (intent == null) {
            return;
        }
        this.f155312a = intent.getStringExtra(FeedPoiAggregationAct.f42278e);
        this.f155313b = intent.getStringExtra(FeedPoiAggregationAct.f42279f);
        this.f155314c = intent.getBooleanExtra(FeedPoiAggregationAct.f42280g, false);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
