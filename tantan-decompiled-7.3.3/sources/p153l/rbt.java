package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class rbt extends a4s {

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
    public LiveGoAction m180761a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public String m180762b() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c */
    public LiveCardTrackData m180763c() {
        return this.trackData;
    }
}
