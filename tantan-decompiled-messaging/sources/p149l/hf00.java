package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class hf00 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, RawFeed> f107423a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, PartialIdList> f107424b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f107425c;

    public hf00(int i) {
        this.f107425c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m130719a(List<RawFeed> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (RawFeed rawFeed : list) {
            this.f107423a.put(rawFeed.f39243id, rawFeed);
        }
    }

    /* JADX INFO: renamed from: b */
    public PartialIdList m130720b(String str) {
        return this.f107424b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public RawFeed m130721c(String str) {
        return this.f107423a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public String m130722d(String str) {
        MomentFeedsExtra momentFeedsExtra;
        String str2;
        RawFeed rawFeed = this.f107423a.get(str);
        return (rawFeed == null || (momentFeedsExtra = rawFeed.extra) == null || (str2 = momentFeedsExtra.optionId) == null) ? "" : str2;
    }

    /* JADX INFO: renamed from: e */
    public final void m130723e(List<RawFeed> list, HashMap<String, RawFeed> map) {
        if (list == null) {
            return;
        }
        for (RawFeed rawFeed : list) {
            if ("moment".equals(rawFeed.type) || "state".equals(rawFeed.type)) {
                map.put(rawFeed.f39243id, rawFeed);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m130724f(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.m81303a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f107424b.put(moment.f56011id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m130725g(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        this.f107424b.clear();
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.m81303a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f107424b.put(moment.f56011id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m130726h(List<RawFeed> list) {
        m130723e(list, this.f107423a);
    }

    /* JADX INFO: renamed from: i */
    public void m130727i(List<RawFeed> list) {
        this.f107423a.clear();
        m130723e(list, this.f107423a);
    }
}
