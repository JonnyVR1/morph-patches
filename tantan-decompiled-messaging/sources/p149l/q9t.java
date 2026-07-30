package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class q9t extends z1s {

    @SerializedName(OMSResourceType.background)
    public ArrayList<String> background;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("iconUrl")
    public String iconUrl;

    @SerializedName("subTitle")
    public String subTitle;

    @SerializedName("title")
    public String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: a */
    public LiveGoAction m173673a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public String m173674b() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c */
    public LiveCardTrackData m173675c() {
        return this.trackData;
    }
}
