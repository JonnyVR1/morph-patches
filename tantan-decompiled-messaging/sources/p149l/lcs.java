package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class lcs extends z1s {
    public static final int DYNAMIC_BG_TYPE = 2;
    public static final int STATIC_BG_TYPE = 1;

    @SerializedName("backgroundUrl")
    private String backgroundUrl;

    @SerializedName("bgPicType")
    private int bgPicType;

    @SerializedName("count")
    private String count;

    @SerializedName("images")
    private ArrayList<fxk> images;

    @SerializedName("labels")
    private ArrayList<b2s> labels;

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
    public String m149351a() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: b */
    public int m149352b() {
        return this.bgPicType;
    }

    /* JADX INFO: renamed from: c */
    public String m149353c() {
        return this.count;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<fxk> m149354d() {
        return this.images;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<b2s> m149355e() {
        return this.labels;
    }

    /* JADX INFO: renamed from: f */
    public LiveGoAction m149356f() {
        return this.liveGoAction;
    }

    /* JADX INFO: renamed from: g */
    public String m149357g() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: h */
    public String m149358h() {
        return this.subTitleIcon;
    }

    /* JADX INFO: renamed from: i */
    public String m149359i() {
        return this.title;
    }

    /* JADX INFO: renamed from: j */
    public String m149360j() {
        return this.titleLabelPicUrl;
    }

    /* JADX INFO: renamed from: k */
    public String m149361k() {
        return this.topDesc;
    }

    /* JADX INFO: renamed from: l */
    public String m149362l() {
        return this.topIcon;
    }

    /* JADX INFO: renamed from: m */
    public LiveCardTrackData m149363m() {
        return this.trackData;
    }
}
