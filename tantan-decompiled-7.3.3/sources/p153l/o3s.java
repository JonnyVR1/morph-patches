package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o3s extends a4s {

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    public List<C19019a> items;
    public boolean localAutoScroll = true;

    /* JADX INFO: renamed from: l.o3s$a */
    public static class C19019a {

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
        public LiveGoAction m165885a() {
            return this.goAction;
        }

        /* JADX INFO: renamed from: b */
        public LiveCardTrackData m165886b() {
            return this.trackData;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C19019a> m165884a() {
        return this.items;
    }
}
