package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class mes extends a4s {
    public static final int DYNAMIC_BG_TYPE = 2;
    public static final int STATIC_BG_TYPE = 1;

    @SerializedName("backgroundUrl")
    private String backgroundUrl;

    @SerializedName("bgPicType")
    private int bgPicType;

    @SerializedName("count")
    private String count;

    @SerializedName("images")
    private ArrayList<vzk> images;

    @SerializedName("labels")
    private ArrayList<c4s> labels;

    @SerializedName("goAction")
    private LiveGoAction liveGoAction;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("subTitleIcon")
    private String subTitleIcon;

    @SerializedName("title")
    private String title;

    @SerializedName("titleLabelPicUrl")
    private String titleLabelPicUrl;

    @SerializedName("topDesc")
    private String topDesc;

    @SerializedName("topIcon")
    private String topIcon;

    @SerializedName("topSvgIcon")
    private String topSvgIcon;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: a */
    public String m158077a() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: b */
    public int m158078b() {
        return this.bgPicType;
    }

    /* JADX INFO: renamed from: c */
    public String m158079c() {
        return this.count;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<vzk> m158080d() {
        return this.images;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<c4s> m158081e() {
        return this.labels;
    }

    /* JADX INFO: renamed from: f */
    public LiveGoAction m158082f() {
        return this.liveGoAction;
    }

    /* JADX INFO: renamed from: g */
    public String m158083g() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: h */
    public String m158084h() {
        return this.subTitleIcon;
    }

    /* JADX INFO: renamed from: i */
    public String m158085i() {
        return this.title;
    }

    /* JADX INFO: renamed from: j */
    public String m158086j() {
        return this.titleLabelPicUrl;
    }

    /* JADX INFO: renamed from: k */
    public String m158087k() {
        return this.topDesc;
    }

    /* JADX INFO: renamed from: l */
    public String m158088l() {
        return this.topIcon;
    }

    /* JADX INFO: renamed from: m */
    public LiveCardTrackData m158089m() {
        return this.trackData;
    }
}
