package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class kfd0 {

    /* JADX INFO: renamed from: a */
    public String f126288a;

    /* JADX INFO: renamed from: b */
    public String f126289b;

    /* JADX INFO: renamed from: c */
    public String f126290c;

    /* JADX INFO: renamed from: d */
    public String f126291d;

    /* JADX INFO: renamed from: e */
    public String f126292e;

    /* JADX INFO: renamed from: f */
    public String f126293f;

    /* JADX INFO: renamed from: g */
    public String f126294g;

    /* JADX INFO: renamed from: h */
    public Object f126295h;

    /* JADX INFO: renamed from: i */
    public String f126296i;

    /* JADX INFO: renamed from: j */
    public String f126297j;

    /* JADX INFO: renamed from: k */
    public String f126298k;

    /* JADX INFO: renamed from: l */
    public String f126299l;

    /* JADX INFO: renamed from: m */
    public String f126300m;

    /* JADX INFO: renamed from: n */
    public int f126301n;

    /* JADX INFO: renamed from: o */
    public String f126302o;

    /* JADX INFO: renamed from: p */
    public String f126303p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public String f126304q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public String f126305r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public String f126306s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public String f126307t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f126308u;

    /* JADX INFO: renamed from: v */
    public String f126309v = "NA";

    /* JADX INFO: renamed from: l.kfd0$a */
    public static final class C18147a {

        /* JADX INFO: renamed from: a */
        public String f126310a;

        /* JADX INFO: renamed from: b */
        public String f126311b;

        /* JADX INFO: renamed from: c */
        public String f126312c;

        /* JADX INFO: renamed from: d */
        public String f126313d;

        /* JADX INFO: renamed from: e */
        public String f126314e;

        /* JADX INFO: renamed from: f */
        public String f126315f;

        /* JADX INFO: renamed from: g */
        public Object f126316g;

        /* JADX INFO: renamed from: h */
        public String f126317h;

        /* JADX INFO: renamed from: i */
        public String f126318i;

        /* JADX INFO: renamed from: j */
        public String f126319j;

        /* JADX INFO: renamed from: k */
        public String f126320k;

        /* JADX INFO: renamed from: l */
        public int f126321l;

        /* JADX INFO: renamed from: m */
        public String f126322m;

        /* JADX INFO: renamed from: n */
        public String f126323n;

        /* JADX INFO: renamed from: o */
        public String f126324o;

        /* JADX INFO: renamed from: p */
        public String f126325p;

        /* JADX INFO: renamed from: q */
        @Nullable
        public String f126326q;

        /* JADX INFO: renamed from: r */
        @Nullable
        public String f126327r;

        /* JADX INFO: renamed from: s */
        @Nullable
        public String f126328s;

        /* JADX INFO: renamed from: t */
        @Nullable
        public String f126329t;

        /* JADX INFO: renamed from: u */
        @Nullable
        public String f126330u;

        public C18147a() {
            this.f126310a = "NA";
            this.f126311b = "NA";
            this.f126312c = "NA";
            this.f126313d = "NA";
            this.f126314e = OMSTemplateModeType.page;
            this.f126315f = "";
            this.f126316g = "";
            this.f126317h = "";
            this.f126318i = "";
            this.f126320k = "";
            this.f126321l = -1;
            this.f126322m = "NA";
            this.f126324o = "0";
        }

        /* JADX INFO: renamed from: A */
        public C18147a m149388A(Object obj) {
            this.f126316g = obj;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C18147a m149389B(long j) {
            this.f126317h = String.valueOf(j);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C18147a m149390C(String str) {
            this.f126317h = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C18147a m149391D(String str) {
            this.f126318i = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public kfd0 m149392a() {
            kfd0 kfd0Var = new kfd0();
            kfd0Var.f126290c = this.f126312c;
            kfd0Var.f126294g = this.f126315f;
            kfd0Var.f126289b = this.f126311b;
            kfd0Var.f126288a = this.f126310a;
            kfd0Var.f126295h = this.f126316g;
            kfd0Var.f126296i = this.f126317h;
            kfd0Var.f126291d = this.f126313d;
            kfd0Var.f126293f = this.f126314e;
            kfd0Var.f126297j = this.f126318i;
            kfd0Var.f126298k = this.f126319j;
            kfd0Var.f126300m = this.f126320k;
            kfd0Var.f126301n = this.f126321l;
            kfd0Var.f126302o = this.f126323n;
            kfd0Var.f126303p = this.f126324o;
            kfd0Var.f126304q = this.f126326q;
            kfd0Var.f126305r = this.f126327r;
            kfd0Var.f126306s = this.f126328s;
            kfd0Var.f126307t = this.f126329t;
            kfd0Var.f126308u = this.f126330u;
            kfd0Var.f126309v = this.f126322m;
            kfd0Var.f126292e = this.f126325p;
            return kfd0Var;
        }

        /* JADX INFO: renamed from: b */
        public C18147a m149393b(BLiveAbsData bLiveAbsData) {
            if (bLiveAbsData == null) {
                return this;
            }
            this.f126312c = bLiveAbsData.f45171id;
            this.f126313d = bLiveAbsData.getRecommendCategoryForTrack();
            BLiveOwner bLiveOwner = bLiveAbsData.anchor;
            if (bLiveOwner != null) {
                this.f126310a = bLiveOwner.f45267id;
            }
            if ((bLiveAbsData instanceof BLive) && "NA".equals(this.f126322m)) {
                this.f126322m = m149395d(bLiveAbsData.state.toString(), ((BLive) bLiveAbsData).multiCallInfo);
            }
            m149412u(bLiveAbsData.state.toString());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18147a m149394c(BLiveSuggestLive bLiveSuggestLive) {
            if (bLiveSuggestLive == null) {
                return this;
            }
            this.f126312c = bLiveSuggestLive.f45298id;
            this.f126313d = bLiveSuggestLive.getRecommendCategoryForTrack();
            BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = bLiveSuggestLive.anchor;
            if (bLiveSuggestLiveAnchor != null) {
                this.f126310a = bLiveSuggestLiveAnchor.f45299id;
            }
            if (TextUtils.isEmpty(this.f126322m)) {
                this.f126322m = m149395d(bLiveSuggestLive.state, bLiveSuggestLive.multiCallInfo);
            }
            m149412u(bLiveSuggestLive.state);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final String m149395d(String str, BLiveMultiCallInfo bLiveMultiCallInfo) {
            return mfd0.m158164a(bLiveMultiCallInfo, str);
        }

        /* JADX INFO: renamed from: e */
        public final String m149396e(BLive bLive) {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = bLive.officialShowCurrentAnchorInfo;
            if (bLiveOfficialShowCurrentAnchorInfo == null) {
                return "NA";
            }
            if (!TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.anchorId)) {
                return bLive.officialShowCurrentAnchorInfo.anchorId;
            }
            BLiveOwner bLiveOwner = bLive.anchor;
            return bLiveOwner != null ? bLiveOwner.f45267id : "NA";
        }

        /* JADX INFO: renamed from: f */
        public final boolean m149397f(BLiveAbsData bLiveAbsData) {
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
        public C18147a m149398g(String str) {
            if (str != null) {
                this.f126310a = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18147a m149399h(@Nullable String str) {
            this.f126326q = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C18147a m149400i(@Nullable String str) {
            this.f126327r = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C18147a m149401j(@Nullable String str) {
            this.f126330u = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C18147a m149402k(String str) {
            this.f126320k = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C18147a m149403l(int i) {
            this.f126311b = String.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18147a m149404m(String str) {
            this.f126311b = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18147a m149405n(boolean z) {
            this.f126328s = z ? "1" : "0";
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18147a m149406o(boolean z) {
            this.f126323n = z ? "1" : "0";
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18147a m149407p(String str) {
            this.f126324o = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18147a m149408q(@Nullable String str) {
            this.f126329t = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18147a m149409r(String str) {
            if (str != null) {
                this.f126312c = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18147a m149410s(String str) {
            this.f126313d = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18147a m149411t(String str) {
            this.f126322m = str;
            return this;
        }

        public String toString() {
            return "RoomEnterTrackParamsBuilder{anchorId='" + this.f126310a + "', index='" + this.f126311b + "', liveId='" + this.f126312c + "', liveRecommendCategory='" + this.f126313d + "', module='" + this.f126314e + "', rightRecommendType='" + this.f126315f + "', showLabel=" + this.f126316g + ", traceId='" + this.f126317h + "', windowType='" + this.f126318i + "', liveStatus='" + this.f126319j + "', from='" + this.f126320k + "', subIndex=" + this.f126321l + ", isGif='" + this.f126323n + "', isRedPacket='" + this.f126324o + "', currentAnchorId='" + this.f126326q + "', currentLiveId='" + this.f126327r + "', isAutoShow='" + this.f126328s + "', liveEnterSource='" + this.f126329t + "'}";
        }

        /* JADX INFO: renamed from: u */
        public C18147a m149412u(String str) {
            this.f126319j = TextUtils.equals(str, "stopped") ? BLiveOperationTitleShowType.off : "on";
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18147a m149413v(String str) {
            this.f126325p = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18147a m149414w(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f126314e = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18147a m149415x(BLiveAbsData bLiveAbsData) {
            if (m149397f(bLiveAbsData)) {
                this.f126310a = m149396e((BLive) bLiveAbsData);
                this.f126322m = "perform_room";
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C18147a m149416y(BLiveSuggestLive bLiveSuggestLive) {
            if ("officialShow".equals(bLiveSuggestLive.liveMode)) {
                this.f126310a = "NA";
                this.f126322m = "perform_room";
            }
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C18147a m149417z(String str) {
            this.f126315f = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C18147a m149385x() {
        return new C18147a();
    }

    public String toString() {
        return "RoomEnterTrackParams{anchorId='" + this.f126288a + "', index='" + this.f126289b + "', liveId='" + this.f126290c + "', liveRecommendCategory='" + this.f126291d + "', module='" + this.f126293f + "', rightRecommendType='" + this.f126294g + "', showLabel=" + this.f126295h + ", traceId='" + this.f126296i + "', windowType='" + this.f126297j + "', liveStatus='" + this.f126298k + "', from='" + this.f126300m + "', subIndex=" + this.f126301n + ", isGif='" + this.f126302o + "', isRedPacket='" + this.f126303p + "', currentAnchorId='" + this.f126304q + "', currentLiveId='" + this.f126305r + "', isAutoShow='" + this.f126306s + "', liveEnterSource='" + this.f126307t + "'}";
    }

    /* JADX INFO: renamed from: v */
    public Map<String, Object> m149386v() {
        HashMap map = new HashMap();
        map.put("anchorId", this.f126288a);
        map.put(FirebaseAnalytics.Param.INDEX, this.f126289b);
        map.put("liveId", this.f126290c);
        map.put("liveRecommendCategory", this.f126291d);
        map.put("module", this.f126293f);
        map.put("right_recommend_type", this.f126294g);
        map.put("show_label", this.f126295h);
        map.put("trace_id", this.f126296i);
        map.put("window_type", this.f126297j);
        map.put("live_status", this.f126298k);
        map.put("from", this.f126300m);
        if (!TextUtils.isEmpty(this.f126299l)) {
            map.put("source", this.f126299l);
        }
        int i = this.f126301n;
        if (i >= 0) {
            map.put("sub_index", Integer.valueOf(i));
        }
        if (!TextUtils.isEmpty(this.f126302o)) {
            map.put("is_gif", this.f126302o);
        }
        if (!TextUtils.isEmpty(this.f126303p)) {
            map.put("redpacket_icon", this.f126303p);
        }
        if (!TextUtils.isEmpty(this.f126304q)) {
            map.put("current_anchorid", this.f126304q);
        }
        if (!TextUtils.isEmpty(this.f126305r)) {
            map.put("current_liveid", this.f126305r);
        }
        if (!TextUtils.isEmpty(this.f126306s)) {
            map.put("is_auto_show", this.f126306s);
        }
        if (!TextUtils.isEmpty(this.f126307t)) {
            map.put("live_enter_source", this.f126307t);
        }
        if (!TextUtils.isEmpty(this.f126308u)) {
            map.put("enter_rec_category", this.f126308u);
        }
        if (!TextUtils.isEmpty(this.f126292e)) {
            map.put("test_group_name", this.f126292e);
        }
        map.put("live_room_live_type", this.f126309v);
        return map;
    }

    /* JADX INFO: renamed from: w */
    public Map<String, Object> m149387w(Map<String, ?> map) {
        Map<String, Object> mapM149386v = m149386v();
        if (map != null) {
            mapM149386v.putAll(map);
        }
        return mapM149386v;
    }
}
