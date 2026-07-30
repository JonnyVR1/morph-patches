package p007l;

import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hf00 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, RawFeed> f8685a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, PartialIdList> f8686b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f8687c;

    public hf00(int i) {
        this.f8687c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m10600a(List<RawFeed> list) {
        if (vwb.J(list)) {
            return;
        }
        for (RawFeed rawFeed : list) {
            this.f8685a.put(rawFeed.f704id, rawFeed);
        }
    }

    /* JADX INFO: renamed from: b */
    public PartialIdList m10601b(String str) {
        return this.f8686b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public RawFeed m10602c(String str) {
        return this.f8685a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public String m10603d(String str) {
        MomentFeedsExtra momentFeedsExtra;
        String str2;
        RawFeed rawFeed = this.f8685a.get(str);
        return (rawFeed == null || (momentFeedsExtra = rawFeed.extra) == null || (str2 = momentFeedsExtra.optionId) == null) ? "" : str2;
    }

    /* JADX INFO: renamed from: e */
    public final void m10604e(List<RawFeed> list, HashMap<String, RawFeed> map) {
        if (list == null) {
            return;
        }
        for (RawFeed rawFeed : list) {
            if ("moment".equals(rawFeed.type) || Channel.state.equals(rawFeed.type)) {
                map.put(rawFeed.f704id, rawFeed);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10605f(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f8686b.put(((DbObject) moment).id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10606g(String str, Envelope envelope) {
        if (envelope == null) {
            return;
        }
        this.f8686b.clear();
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (!NullChecker.a(feedData.moments) || feedData.moments.size() <= 0) {
            return;
        }
        for (Moment moment : feedData.moments) {
            this.f8686b.put(((DbObject) moment).id, moment.messages);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10607h(List<RawFeed> list) {
        m10604e(list, this.f8685a);
    }

    /* JADX INFO: renamed from: i */
    public void m10608i(List<RawFeed> list) {
        this.f8685a.clear();
        m10604e(list, this.f8685a);
    }
}
