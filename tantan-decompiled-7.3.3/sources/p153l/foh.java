package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;

/* JADX INFO: loaded from: classes13.dex */
public class foh extends ar2<joh> {

    /* JADX INFO: renamed from: a */
    public String f100057a;

    /* JADX INFO: renamed from: b */
    public String f100058b;

    /* JADX INFO: renamed from: c */
    public boolean f100059c;

    public foh(FeedPoiAggregationAct feedPoiAggregationAct) {
        super(feedPoiAggregationAct);
        m126455e0(feedPoiAggregationAct);
    }

    /* JADX INFO: renamed from: e0 */
    public void m126455e0(FeedPoiAggregationAct feedPoiAggregationAct) {
        Intent intent = feedPoiAggregationAct.getIntent();
        if (intent == null) {
            return;
        }
        this.f100057a = intent.getStringExtra(FeedPoiAggregationAct.f43126e);
        this.f100058b = intent.getStringExtra(FeedPoiAggregationAct.f43127f);
        this.f100059c = intent.getBooleanExtra(FeedPoiAggregationAct.f43128g, false);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
