package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xwr extends a4s {

    @SerializedName("bannerList")
    private List<C21468a> bannerList;
    private String bannerType;

    /* JADX INFO: renamed from: id */
    private String f196540id;
    public boolean localAutoScroll;

    /* JADX INFO: renamed from: l.xwr$a */
    public static class C21468a {

        @SerializedName("goAction")
        private LiveGoAction goAction;

        @SerializedName("imageUrl")
        private String imageUrl;

        @SerializedName("title")
        private String title;

        @SerializedName("trackData")
        private LiveCardTrackData trackData;

        @SerializedName("type")
        private String type;

        /* JADX INFO: renamed from: a */
        public LiveGoAction m213427a() {
            return this.goAction;
        }

        /* JADX INFO: renamed from: b */
        public String m213428b() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: c */
        public LiveCardTrackData m213429c() {
            return this.trackData;
        }

        /* JADX INFO: renamed from: d */
        public String m213430d() {
            return this.type;
        }

        /* JADX INFO: renamed from: e */
        public void m213431e(LiveGoAction liveGoAction) {
            this.goAction = liveGoAction;
        }

        /* JADX INFO: renamed from: f */
        public void m213432f(String str) {
            this.imageUrl = str;
        }

        /* JADX INFO: renamed from: g */
        public void m213433g(String str) {
            this.title = str;
        }

        /* JADX INFO: renamed from: h */
        public void m213434h(LiveCardTrackData liveCardTrackData) {
            this.trackData = liveCardTrackData;
        }

        /* JADX INFO: renamed from: i */
        public void m213435i(String str) {
            this.type = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m213422a() {
        return this.f196540id;
    }

    /* JADX INFO: renamed from: b */
    public List<C21468a> m213423b() {
        return this.bannerList;
    }

    /* JADX INFO: renamed from: c */
    public void m213424c(String str) {
        this.bannerType = str;
    }

    /* JADX INFO: renamed from: d */
    public void m213425d(String str) {
        this.f196540id = str;
    }

    /* JADX INFO: renamed from: e */
    public void m213426e(List<C21468a> list) {
        this.bannerList = list;
    }
}
