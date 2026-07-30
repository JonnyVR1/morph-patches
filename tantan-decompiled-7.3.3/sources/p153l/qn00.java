package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class qn00 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, RawFeed> f158452a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, PartialIdList> f158453b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f158454c;

    public qn00(int i) {
        this.f158454c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m177158a(List<RawFeed> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (RawFeed rawFeed : list) {
            this.f158452a.put(rawFeed.f40091id, rawFeed);
        }
    }

    /* JADX INFO: renamed from: b */
    public PartialIdList m177159b(String str) {
        return this.f158453b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public RawFeed m177160c(String str) {
        return this.f158452a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public String m177161d(String str) {
        MomentFeedsExtra momentFeedsExtra;
        String str2;
        RawFeed rawFeed = this.f158452a.get(str);
        return (rawFeed == null || (momentFeedsExtra = rawFeed.extra) == null || (str2 = momentFeedsExtra.optionId) == null) ? "" : str2;
    }

    /* JADX INFO: renamed from: e */
    public final void m177162e(List<RawFeed> list, HashMap<String, RawFeed> map) {
        if (list == null) {
            return;
        }
        for (RawFeed rawFeed : list) {
            if ("moment".equals(rawFeed.type) || "state".equals(rawFeed.type)) {
                map.put(rawFeed.f40091id, rawFeed);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m177163f(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.m82486a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f158453b.put(moment.f56859id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m177164g(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        this.f158453b.clear();
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.m82486a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f158453b.put(moment.f56859id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m177165h(List<RawFeed> list) {
        m177162e(list, this.f158452a);
    }

    /* JADX INFO: renamed from: i */
    public void m177166i(List<RawFeed> list) {
        this.f158452a.clear();
        m177162e(list, this.f158452a);
    }
}
