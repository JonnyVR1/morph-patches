package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class h7d0 {

    /* JADX INFO: renamed from: a */
    public String f106226a;

    /* JADX INFO: renamed from: b */
    public String f106227b;

    /* JADX INFO: renamed from: c */
    public String f106228c;

    /* JADX INFO: renamed from: d */
    public String f106229d;

    /* JADX INFO: renamed from: e */
    public String f106230e;

    /* JADX INFO: renamed from: f */
    public String f106231f;

    /* JADX INFO: renamed from: g */
    public String f106232g;

    /* JADX INFO: renamed from: h */
    public Object f106233h;

    /* JADX INFO: renamed from: i */
    public String f106234i;

    /* JADX INFO: renamed from: j */
    public String f106235j;

    /* JADX INFO: renamed from: k */
    public String f106236k;

    /* JADX INFO: renamed from: l */
    public String f106237l;

    /* JADX INFO: renamed from: m */
    public String f106238m;

    /* JADX INFO: renamed from: n */
    public int f106239n;

    /* JADX INFO: renamed from: o */
    public String f106240o;

    /* JADX INFO: renamed from: p */
    public String f106241p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public String f106242q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public String f106243r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public String f106244s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public String f106245t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f106246u;

    /* JADX INFO: renamed from: v */
    public String f106247v = "NA";

    /* JADX INFO: renamed from: l.h7d0$a */
    public static final class C17241a {

        /* JADX INFO: renamed from: a */
        public String f106248a;

        /* JADX INFO: renamed from: b */
        public String f106249b;

        /* JADX INFO: renamed from: c */
        public String f106250c;

        /* JADX INFO: renamed from: d */
        public String f106251d;

        /* JADX INFO: renamed from: e */
        public String f106252e;

        /* JADX INFO: renamed from: f */
        public String f106253f;

        /* JADX INFO: renamed from: g */
        public Object f106254g;

        /* JADX INFO: renamed from: h */
        public String f106255h;

        /* JADX INFO: renamed from: i */
        public String f106256i;

        /* JADX INFO: renamed from: j */
        public String f106257j;

        /* JADX INFO: renamed from: k */
        public String f106258k;

        /* JADX INFO: renamed from: l */
        public int f106259l;

        /* JADX INFO: renamed from: m */
        public String f106260m;

        /* JADX INFO: renamed from: n */
        public String f106261n;

        /* JADX INFO: renamed from: o */
        public String f106262o;

        /* JADX INFO: renamed from: p */
        public String f106263p;

        /* JADX INFO: renamed from: q */
        @Nullable
        public String f106264q;

        /* JADX INFO: renamed from: r */
        @Nullable
        public String f106265r;

        /* JADX INFO: renamed from: s */
        @Nullable
        public String f106266s;

        /* JADX INFO: renamed from: t */
        @Nullable
        public String f106267t;

        /* JADX INFO: renamed from: u */
        @Nullable
        public String f106268u;

        public C17241a() {
            this.f106248a = "NA";
            this.f106249b = "NA";
            this.f106250c = "NA";
            this.f106251d = "NA";
            this.f106252e = OMSTemplateModeType.page;
            this.f106253f = "";
            this.f106254g = "";
            this.f106255h = "";
            this.f106256i = "";
            this.f106258k = "";
            this.f106259l = -1;
            this.f106260m = "NA";
            this.f106262o = "0";
        }

        /* JADX INFO: renamed from: A */
        public C17241a m129658A(Object obj) {
            this.f106254g = obj;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C17241a m129659B(long j) {
            this.f106255h = String.valueOf(j);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C17241a m129660C(String str) {
            this.f106255h = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C17241a m129661D(String str) {
            this.f106256i = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h7d0 m129662a() {
            h7d0 h7d0Var = new h7d0();
            h7d0Var.f106228c = this.f106250c;
            h7d0Var.f106232g = this.f106253f;
            h7d0Var.f106227b = this.f106249b;
            h7d0Var.f106226a = this.f106248a;
            h7d0Var.f106233h = this.f106254g;
            h7d0Var.f106234i = this.f106255h;
            h7d0Var.f106229d = this.f106251d;
            h7d0Var.f106231f = this.f106252e;
            h7d0Var.f106235j = this.f106256i;
            h7d0Var.f106236k = this.f106257j;
            h7d0Var.f106238m = this.f106258k;
            h7d0Var.f106239n = this.f106259l;
            h7d0Var.f106240o = this.f106261n;
            h7d0Var.f106241p = this.f106262o;
            h7d0Var.f106242q = this.f106264q;
            h7d0Var.f106243r = this.f106265r;
            h7d0Var.f106244s = this.f106266s;
            h7d0Var.f106245t = this.f106267t;
            h7d0Var.f106246u = this.f106268u;
            h7d0Var.f106247v = this.f106260m;
            h7d0Var.f106230e = this.f106263p;
            return h7d0Var;
        }

        /* JADX INFO: renamed from: b */
        public C17241a m129663b(BLiveAbsData bLiveAbsData) {
            if (bLiveAbsData == null) {
                return this;
            }
            this.f106250c = bLiveAbsData.f44323id;
            this.f106251d = bLiveAbsData.getRecommendCategoryForTrack();
            BLiveOwner bLiveOwner = bLiveAbsData.anchor;
            if (bLiveOwner != null) {
                this.f106248a = bLiveOwner.f44419id;
            }
            if ((bLiveAbsData instanceof BLive) && "NA".equals(this.f106260m)) {
                this.f106260m = m129665d(bLiveAbsData.state.toString(), ((BLive) bLiveAbsData).multiCallInfo);
            }
            m129682u(bLiveAbsData.state.toString());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17241a m129664c(BLiveSuggestLive bLiveSuggestLive) {
            if (bLiveSuggestLive == null) {
                return this;
            }
            this.f106250c = bLiveSuggestLive.f44450id;
            this.f106251d = bLiveSuggestLive.getRecommendCategoryForTrack();
            BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
            if (bLiveSuggestLiveAnchor != null) {
                this.f106248a = bLiveSuggestLiveAnchor.f44451id;
            }
            if (TextUtils.isEmpty(this.f106260m)) {
                this.f106260m = m129665d(bLiveSuggestLive.state, bLiveSuggestLive.multiCallInfo);
            }
            m129682u(bLiveSuggestLive.state);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final String m129665d(String str, BLiveMultiCallInfo bLiveMultiCallInfo) {
            return j7d0.m140090a(bLiveMultiCallInfo, str);
        }

        /* JADX INFO: renamed from: e */
        public final String m129666e(BLive bLive) {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = bLive.officialShowCurrentAnchorInfo;
            if (bLiveOfficialShowCurrentAnchorInfo == null) {
                return "NA";
            }
            if (!TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.anchorId)) {
                return bLive.officialShowCurrentAnchorInfo.anchorId;
            }
            BLiveOwner bLiveOwner = bLive.anchor;
            return bLiveOwner != null ? bLiveOwner.f44419id : "NA";
        }

        /* JADX INFO: renamed from: f */
        public final boolean m129667f(BLiveAbsData bLiveAbsData) {
            if (bLiveAbsData != null && (bLiveAbsData instanceof BLive)) {
                BLive bLive = (BLive) bLiveAbsData;
                BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = bLive.officialShowCurrentAnchorInfo;
                if (bLiveOfficialShowCurrentAnchorInfo != null && !TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.showId)) {
                    return true;
                }
                BLiveOfficialShowInfo bLiveOfficialShowInfo = bLive.officialShowLiveInfo;
                if (bLiveOfficialShowInfo != null && !TextUtils.isEmpty(bLiveOfficialShowInfo.showLiveId)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public C17241a m129668g(String str) {
            if (str != null) {
                this.f106248a = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C17241a m129669h(@Nullable String str) {
            this.f106264q = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C17241a m129670i(@Nullable String str) {
            this.f106265r = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C17241a m129671j(@Nullable String str) {
            this.f106268u = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C17241a m129672k(String str) {
            this.f106258k = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C17241a m129673l(int i) {
            this.f106249b = String.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C17241a m129674m(String str) {
            this.f106249b = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C17241a m129675n(boolean z) {
            this.f106266s = z ? "1" : "0";
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C17241a m129676o(boolean z) {
            this.f106261n = z ? "1" : "0";
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C17241a m129677p(String str) {
            this.f106262o = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C17241a m129678q(@Nullable String str) {
            this.f106267t = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C17241a m129679r(String str) {
            if (str != null) {
                this.f106250c = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C17241a m129680s(String str) {
            this.f106251d = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C17241a m129681t(String str) {
            this.f106260m = str;
            return this;
        }

        public String toString() {
            return "RoomEnterTrackParamsBuilder{anchorId='" + this.f106248a + "', index='" + this.f106249b + "', liveId='" + this.f106250c + "', liveRecommendCategory='" + this.f106251d + "', module='" + this.f106252e + "', rightRecommendType='" + this.f106253f + "', showLabel=" + this.f106254g + ", traceId='" + this.f106255h + "', windowType='" + this.f106256i + "', liveStatus='" + this.f106257j + "', from='" + this.f106258k + "', subIndex=" + this.f106259l + ", isGif='" + this.f106261n + "', isRedPacket='" + this.f106262o + "', currentAnchorId='" + this.f106264q + "', currentLiveId='" + this.f106265r + "', isAutoShow='" + this.f106266s + "', liveEnterSource='" + this.f106267t + "'}";
        }

        /* JADX INFO: renamed from: u */
        public C17241a m129682u(String str) {
            this.f106257j = TextUtils.equals(str, "stopped") ? BLiveOperationTitleShowType.off : "on";
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C17241a m129683v(String str) {
            this.f106263p = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C17241a m129684w(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f106252e = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C17241a m129685x(BLiveAbsData bLiveAbsData) {
            if (m129667f(bLiveAbsData)) {
                this.f106248a = m129666e((BLive) bLiveAbsData);
                this.f106260m = "perform_room";
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C17241a m129686y(BLiveSuggestLive bLiveSuggestLive) {
            if ("officialShow".equals(bLiveSuggestLive.liveMode)) {
                this.f106248a = "NA";
                this.f106260m = "perform_room";
            }
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C17241a m129687z(String str) {
            this.f106253f = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C17241a m129655x() {
        return new C17241a();
    }

    public String toString() {
        return "RoomEnterTrackParams{anchorId='" + this.f106226a + "', index='" + this.f106227b + "', liveId='" + this.f106228c + "', liveRecommendCategory='" + this.f106229d + "', module='" + this.f106231f + "', rightRecommendType='" + this.f106232g + "', showLabel=" + this.f106233h + ", traceId='" + this.f106234i + "', windowType='" + this.f106235j + "', liveStatus='" + this.f106236k + "', from='" + this.f106238m + "', subIndex=" + this.f106239n + ", isGif='" + this.f106240o + "', isRedPacket='" + this.f106241p + "', currentAnchorId='" + this.f106242q + "', currentLiveId='" + this.f106243r + "', isAutoShow='" + this.f106244s + "', liveEnterSource='" + this.f106245t + "'}";
    }

    /* JADX INFO: renamed from: v */
    public Map<String, Object> m129656v() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f106226a);
        map.put(FirebaseAnalytics.Param.INDEX, this.f106227b);
        map.put("liveId", this.f106228c);
        map.put("liveRecommendCategory", this.f106229d);
        map.put("module", this.f106231f);
        map.put("right_recommend_type", this.f106232g);
        map.put("show_label", this.f106233h);
        map.put("trace_id", this.f106234i);
        map.put("window_type", this.f106235j);
        map.put("live_status", this.f106236k);
        map.put("from", this.f106238m);
        if (!TextUtils.isEmpty(this.f106237l)) {
            map.put("source", this.f106237l);
        }
        int i = this.f106239n;
        if (i >= 0) {
            map.put("sub_index", Integer.valueOf(i));
        }
        if (!TextUtils.isEmpty(this.f106240o)) {
            map.put("is_gif", this.f106240o);
        }
        if (!TextUtils.isEmpty(this.f106241p)) {
            map.put("redpacket_icon", this.f106241p);
        }
        if (!TextUtils.isEmpty(this.f106242q)) {
            map.put("current_anchorid", this.f106242q);
        }
        if (!TextUtils.isEmpty(this.f106243r)) {
            map.put("current_liveid", this.f106243r);
        }
        if (!TextUtils.isEmpty(this.f106244s)) {
            map.put("is_auto_show", this.f106244s);
        }
        if (!TextUtils.isEmpty(this.f106245t)) {
            map.put("live_enter_source", this.f106245t);
        }
        if (!TextUtils.isEmpty(this.f106246u)) {
            map.put("enter_rec_category", this.f106246u);
        }
        if (!TextUtils.isEmpty(this.f106230e)) {
            map.put("test_group_name", this.f106230e);
        }
        map.put("live_room_live_type", this.f106247v);
        return map;
    }

    /* JADX INFO: renamed from: w */
    public Map<String, Object> m129657w(Map<String, ?> map) {
        Map<String, Object> mapM129656v = m129656v();
        if (map != null) {
            mapM129656v.putAll(map);
        }
        return mapM129656v;
    }
}
