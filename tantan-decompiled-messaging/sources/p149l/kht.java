package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class kht {

    /* JADX INFO: renamed from: a */
    public String f123208a;

    /* JADX INFO: renamed from: b */
    public String f123209b;

    /* JADX INFO: renamed from: c */
    public String f123210c;

    /* JADX INFO: renamed from: d */
    public String f123211d;

    /* JADX INFO: renamed from: e */
    public String f123212e;

    /* JADX INFO: renamed from: f */
    public String f123213f;

    /* JADX INFO: renamed from: g */
    public String f123214g;

    /* JADX INFO: renamed from: h */
    public int f123215h;

    /* JADX INFO: renamed from: i */
    public String f123216i;

    /* JADX INFO: renamed from: j */
    public String f123217j;

    /* JADX INFO: renamed from: k */
    public String f123218k;

    /* JADX INFO: renamed from: l.kht$a */
    public static class C18020a {

        /* JADX INFO: renamed from: a */
        public String f123219a;

        /* JADX INFO: renamed from: b */
        public String f123220b;

        /* JADX INFO: renamed from: c */
        public String f123221c;

        /* JADX INFO: renamed from: d */
        public String f123222d;

        /* JADX INFO: renamed from: e */
        public String f123223e;

        /* JADX INFO: renamed from: f */
        public String f123224f;

        /* JADX INFO: renamed from: g */
        public String f123225g;

        /* JADX INFO: renamed from: h */
        public int f123226h;

        /* JADX INFO: renamed from: i */
        public String f123227i;

        /* JADX INFO: renamed from: j */
        public String f123228j;

        /* JADX INFO: renamed from: k */
        public String f123229k;

        public C18020a() {
            this.f123219a = "";
            this.f123220b = "NA";
            this.f123221c = "NA";
            this.f123222d = "";
            this.f123223e = "NA";
            this.f123224f = "";
            this.f123225g = "";
            this.f123226h = -1;
            this.f123227i = "NA";
            this.f123228j = "";
            this.f123229k = "";
        }

        /* JADX INFO: renamed from: l */
        public kht m146009l() {
            return new kht(this);
        }

        /* JADX INFO: renamed from: m */
        public C18020a m146010m(@Nullable BLiveAbsData bLiveAbsData, @Nullable BLiveAbsData bLiveAbsData2) {
            if (bLiveAbsData != null) {
                m146013p(bLiveAbsData.f44323id);
                BLiveOwner bLiveOwner = bLiveAbsData.anchor;
                if (bLiveOwner != null) {
                    m146012o(bLiveOwner.f44419id);
                }
            }
            if (bLiveAbsData2 != null) {
                m146017t(bLiveAbsData2.f44323id);
                BLiveOwner bLiveOwner2 = bLiveAbsData2.anchor;
                if (bLiveOwner2 != null) {
                    m146011n(bLiveOwner2.f44419id);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18020a m146011n(String str) {
            this.f123219a = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18020a m146012o(String str) {
            this.f123220b = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18020a m146013p(String str) {
            this.f123221c = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18020a m146014q(String str) {
            this.f123223e = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18020a m146015r(int i) {
            this.f123226h = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18020a m146016s(String str) {
            this.f123224f = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18020a m146017t(String str) {
            this.f123222d = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18020a m146018u(String str) {
            this.f123228j = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18020a m146019v(String str) {
            this.f123227i = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18020a m146020w(String str) {
            this.f123229k = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18020a m146021x(long j) {
            return m146022y(String.valueOf(j));
        }

        /* JADX INFO: renamed from: y */
        public C18020a m146022y(String str) {
            this.f123225g = str;
            return this;
        }
    }

    public kht(C18020a c18020a) {
        this.f123208a = c18020a.f123219a;
        this.f123209b = c18020a.f123220b;
        this.f123210c = c18020a.f123221c;
        this.f123211d = c18020a.f123222d;
        this.f123212e = c18020a.f123223e;
        this.f123213f = c18020a.f123224f;
        this.f123214g = c18020a.f123225g;
        this.f123215h = c18020a.f123226h;
        this.f123216i = c18020a.f123227i;
        this.f123217j = c18020a.f123228j;
        this.f123218k = c18020a.f123229k;
    }

    /* JADX INFO: renamed from: c */
    public static C18020a m145995c() {
        return new C18020a();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m145996a() {
        return new JSONObject(m145997b());
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m145997b() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f123208a);
        map.put("before_anchorId", this.f123209b);
        map.put("before_liveId", this.f123210c);
        map.put("enter_rec_category", this.f123212e);
        map.put(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f123215h));
        map.put("liveId", this.f123211d);
        map.put("liveRecommendCategory", this.f123216i);
        map.put("live_enter_source", this.f123213f);
        map.put("live_inter_source", this.f123217j);
        map.put("swipe_type", this.f123218k);
        map.put("trace_id", this.f123214g);
        return map;
    }

    public String toString() {
        return "LiveRoomSwipeTrackParams{anchorId='" + this.f123208a + "', beforeAnchorId='" + this.f123209b + "', beforeLiveId='" + this.f123210c + "', liveId='" + this.f123211d + "', enterRecCategory='" + this.f123212e + "', liveEnterSource='" + this.f123213f + "', traceId='" + this.f123214g + "', index=" + this.f123215h + ", liveRecommendCategory='" + this.f123216i + "', liveInnerSource='" + this.f123217j + "', swipeType='" + this.f123218k + "'}";
    }
}
