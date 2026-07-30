package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class ags {

    @SerializedName("backgroundUrl")
    private String backgroundUrl;

    @SerializedName("gameType")
    private String gameType;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("iconUrl")
    private String iconUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: a */
    public String m97720a() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: b */
    public LiveGoAction m97721b() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: c */
    public String m97722c() {
        return this.title;
    }

    /* JADX INFO: renamed from: d */
    public LiveCardTrackData m97723d() {
        return this.trackData;
    }
}
