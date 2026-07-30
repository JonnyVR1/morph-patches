package p153l;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ljt {

    /* JADX INFO: renamed from: a */
    public String f132390a;

    /* JADX INFO: renamed from: b */
    public String f132391b;

    /* JADX INFO: renamed from: c */
    public String f132392c;

    /* JADX INFO: renamed from: d */
    public String f132393d;

    /* JADX INFO: renamed from: e */
    public String f132394e;

    /* JADX INFO: renamed from: f */
    public String f132395f;

    /* JADX INFO: renamed from: g */
    public String f132396g;

    /* JADX INFO: renamed from: h */
    public int f132397h;

    /* JADX INFO: renamed from: i */
    public String f132398i;

    /* JADX INFO: renamed from: j */
    public String f132399j;

    /* JADX INFO: renamed from: k */
    public String f132400k;

    /* JADX INFO: renamed from: l.ljt$a */
    public static class C18404a {

        /* JADX INFO: renamed from: a */
        public String f132401a;

        /* JADX INFO: renamed from: b */
        public String f132402b;

        /* JADX INFO: renamed from: c */
        public String f132403c;

        /* JADX INFO: renamed from: d */
        public String f132404d;

        /* JADX INFO: renamed from: e */
        public String f132405e;

        /* JADX INFO: renamed from: f */
        public String f132406f;

        /* JADX INFO: renamed from: g */
        public String f132407g;

        /* JADX INFO: renamed from: h */
        public int f132408h;

        /* JADX INFO: renamed from: i */
        public String f132409i;

        /* JADX INFO: renamed from: j */
        public String f132410j;

        /* JADX INFO: renamed from: k */
        public String f132411k;

        public C18404a() {
            this.f132401a = "";
            this.f132402b = "NA";
            this.f132403c = "NA";
            this.f132404d = "";
            this.f132405e = "NA";
            this.f132406f = "";
            this.f132407g = "";
            this.f132408h = -1;
            this.f132409i = "NA";
            this.f132410j = "";
            this.f132411k = "";
        }

        /* JADX INFO: renamed from: l */
        public ljt m154565l() {
            return new ljt(this);
        }

        /* JADX INFO: renamed from: m */
        public C18404a m154566m(@Nullable BLiveAbsData bLiveAbsData, @Nullable BLiveAbsData bLiveAbsData2) {
            if (bLiveAbsData != null) {
                m154569p(bLiveAbsData.f45171id);
                BLiveOwner bLiveOwner = bLiveAbsData.anchor;
                if (bLiveOwner != null) {
                    m154568o(bLiveOwner.f45267id);
                }
            }
            if (bLiveAbsData2 != null) {
                m154573t(bLiveAbsData2.f45171id);
                BLiveOwner bLiveOwner2 = bLiveAbsData2.anchor;
                if (bLiveOwner2 != null) {
                    m154567n(bLiveOwner2.f45267id);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18404a m154567n(String str) {
            this.f132401a = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18404a m154568o(String str) {
            this.f132402b = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18404a m154569p(String str) {
            this.f132403c = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18404a m154570q(String str) {
            this.f132405e = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18404a m154571r(int i) {
            this.f132408h = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18404a m154572s(String str) {
            this.f132406f = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18404a m154573t(String str) {
            this.f132404d = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18404a m154574u(String str) {
            this.f132410j = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18404a m154575v(String str) {
            this.f132409i = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18404a m154576w(String str) {
            this.f132411k = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18404a m154577x(long j) {
            return m154578y(String.valueOf(j));
        }

        /* JADX INFO: renamed from: y */
        public C18404a m154578y(String str) {
            this.f132407g = str;
            return this;
        }
    }

    public ljt(C18404a c18404a) {
        this.f132390a = c18404a.f132401a;
        this.f132391b = c18404a.f132402b;
        this.f132392c = c18404a.f132403c;
        this.f132393d = c18404a.f132404d;
        this.f132394e = c18404a.f132405e;
        this.f132395f = c18404a.f132406f;
        this.f132396g = c18404a.f132407g;
        this.f132397h = c18404a.f132408h;
        this.f132398i = c18404a.f132409i;
        this.f132399j = c18404a.f132410j;
        this.f132400k = c18404a.f132411k;
    }

    /* JADX INFO: renamed from: c */
    public static C18404a m154551c() {
        return new C18404a();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m154552a() {
        return new JSONObject(m154553b());
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m154553b() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f132390a);
        map.put("before_anchorId", this.f132391b);
        map.put("before_liveId", this.f132392c);
        map.put("enter_rec_category", this.f132394e);
        map.put(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f132397h));
        map.put("liveId", this.f132393d);
        map.put("liveRecommendCategory", this.f132398i);
        map.put("live_enter_source", this.f132395f);
        map.put("live_inter_source", this.f132399j);
        map.put("swipe_type", this.f132400k);
        map.put("trace_id", this.f132396g);
        return map;
    }

    public String toString() {
        return "LiveRoomSwipeTrackParams{anchorId='" + this.f132390a + "', beforeAnchorId='" + this.f132391b + "', beforeLiveId='" + this.f132392c + "', liveId='" + this.f132393d + "', enterRecCategory='" + this.f132394e + "', liveEnterSource='" + this.f132395f + "', traceId='" + this.f132396g + "', index=" + this.f132397h + ", liveRecommendCategory='" + this.f132398i + "', liveInnerSource='" + this.f132399j + "', swipeType='" + this.f132400k + "'}";
    }
}
