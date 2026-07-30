package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wur extends z1s {

    @SerializedName("bannerList")
    private List<C20965a> bannerList;
    private String bannerType;

    /* JADX INFO: renamed from: id */
    private String f188156id;
    public boolean localAutoScroll;

    /* JADX INFO: renamed from: l.wur$a */
    public static class C20965a {

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
        public LiveGoAction m205659a() {
            return this.goAction;
        }

        /* JADX INFO: renamed from: b */
        public String m205660b() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: c */
        public LiveCardTrackData m205661c() {
            return this.trackData;
        }

        /* JADX INFO: renamed from: d */
        public String m205662d() {
            return this.type;
        }

        /* JADX INFO: renamed from: e */
        public void m205663e(LiveGoAction liveGoAction) {
            this.goAction = liveGoAction;
        }

        /* JADX INFO: renamed from: f */
        public void m205664f(String str) {
            this.imageUrl = str;
        }

        /* JADX INFO: renamed from: g */
        public void m205665g(String str) {
            this.title = str;
        }

        /* JADX INFO: renamed from: h */
        public void m205666h(LiveCardTrackData liveCardTrackData) {
            this.trackData = liveCardTrackData;
        }

        /* JADX INFO: renamed from: i */
        public void m205667i(String str) {
            this.type = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m205654a() {
        return this.f188156id;
    }

    /* JADX INFO: renamed from: b */
    public List<C20965a> m205655b() {
        return this.bannerList;
    }

    /* JADX INFO: renamed from: c */
    public void m205656c(String str) {
        this.bannerType = str;
    }

    /* JADX INFO: renamed from: d */
    public void m205657d(String str) {
        this.f188156id = str;
    }

    /* JADX INFO: renamed from: e */
    public void m205658e(List<C20965a> list) {
        this.bannerList = list;
    }
}
