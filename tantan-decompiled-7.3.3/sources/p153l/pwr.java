package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.tencent.open.SocialConstants;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pwr extends a4s {

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private List<C19458a> items;

    @SerializedName("title")
    private String title;

    /* JADX INFO: renamed from: l.pwr$a */
    public static class C19458a {

        @SerializedName(SocialConstants.PARAM_APP_DESC)
        private String desc;

        @SerializedName("entryId")
        private String entryId;

        @SerializedName("goAction")
        private LiveGoAction goAction;

        @SerializedName("imageUrl")
        private String imageUrl;
        private boolean localNeedShowRing = true;

        @SerializedName("ringColor")
        private String ringColor;

        @SerializedName("showRing")
        private boolean showRing;

        @SerializedName("sideIcon")
        private String sideIcon;

        @SerializedName("text")
        private String text;

        @SerializedName("trackData")
        private LiveCardTrackData trackData;

        /* JADX INFO: renamed from: a */
        public String m174078a() {
            return this.desc;
        }

        /* JADX INFO: renamed from: b */
        public String m174079b() {
            return this.entryId;
        }

        /* JADX INFO: renamed from: c */
        public LiveGoAction m174080c() {
            return this.goAction;
        }

        /* JADX INFO: renamed from: d */
        public String m174081d() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: e */
        public String m174082e() {
            return this.sideIcon;
        }

        /* JADX INFO: renamed from: f */
        public String m174083f() {
            return this.text;
        }

        /* JADX INFO: renamed from: g */
        public LiveCardTrackData m174084g() {
            return this.trackData;
        }

        /* JADX INFO: renamed from: h */
        public boolean m174085h() {
            return this.localNeedShowRing;
        }

        /* JADX INFO: renamed from: i */
        public void m174086i(boolean z) {
            this.localNeedShowRing = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C19458a> m174077a() {
        return this.items;
    }
}
