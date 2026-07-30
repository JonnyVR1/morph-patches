package p153l;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardIntimacy;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class lwu extends a4s {

    @SerializedName("anchorId")
    private String anchorId;

    @SerializedName("coverUrl")
    private String coverUrl;

    @SerializedName("discountPrice")
    private String discountPrice;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("intimacy")
    private LiveCardIntimacy intimacy;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private C18477a label;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private String price;

    @SerializedName("roomId")
    private String roomId;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("personalityLabels")
    private ArrayList<C18478b> tags;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: l.lwu$a */
    public static class C18477a {

        @SerializedName(OMSResourceType.background)
        public List<String> background;

        @SerializedName("icon")
        public String icon;

        @SerializedName("text")
        public String text;
    }

    /* JADX INFO: renamed from: l.lwu$b */
    public static class C18478b {

        @SerializedName(OMSResourceType.background)
        public String background;

        @SerializedName("text")
        public String text;

        @SerializedName("textColor")
        public String textColor;
    }

    /* JADX INFO: renamed from: a */
    public String m156101a() {
        return this.anchorId;
    }

    /* JADX INFO: renamed from: b */
    public String m156102b() {
        return this.coverUrl;
    }

    /* JADX INFO: renamed from: c */
    public String m156103c() {
        return this.discountPrice;
    }

    /* JADX INFO: renamed from: d */
    public LiveGoAction m156104d() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: e */
    public LiveCardIntimacy m156105e() {
        return this.intimacy;
    }

    /* JADX INFO: renamed from: f */
    public C18477a m156106f() {
        return this.label;
    }

    /* JADX INFO: renamed from: g */
    public String m156107g() {
        return this.price;
    }

    /* JADX INFO: renamed from: h */
    public String m156108h() {
        return this.status;
    }

    /* JADX INFO: renamed from: i */
    public String m156109i() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: j */
    public ArrayList<C18478b> m156110j() {
        return this.tags;
    }

    /* JADX INFO: renamed from: k */
    public String m156111k() {
        return this.title;
    }

    /* JADX INFO: renamed from: l */
    public LiveCardTrackData m156112l() {
        return this.trackData;
    }

    /* JADX INFO: renamed from: m */
    public void m156113m(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }
}
