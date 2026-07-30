package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n1s extends z1s {

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    public List<C18603a> items;
    public boolean localAutoScroll = true;

    /* JADX INFO: renamed from: l.n1s$a */
    public static class C18603a {

        @SerializedName("bgUrl")
        public String bgUrl;

        @SerializedName("btnText")
        public String btnText;

        @SerializedName("goAction")
        public LiveGoAction goAction;

        @SerializedName("mainTitle")
        public String mainTitle;

        @SerializedName(CreditScoreTaskType.pic)
        public String pic;

        @SerializedName("subTitle")
        public String subTitle;

        @SerializedName("trackData")
        public LiveCardTrackData trackData;

        @SerializedName("type")
        public String type;

        /* JADX INFO: renamed from: a */
        public LiveGoAction m157513a() {
            return this.goAction;
        }

        /* JADX INFO: renamed from: b */
        public LiveCardTrackData m157514b() {
            return this.trackData;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C18603a> m157512a() {
        return this.items;
    }
}
