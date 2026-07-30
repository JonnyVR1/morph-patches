package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class zds {

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
    public String m218195a() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: b */
    public LiveGoAction m218196b() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: c */
    public String m218197c() {
        return this.title;
    }

    /* JADX INFO: renamed from: d */
    public LiveCardTrackData m218198d() {
        return this.trackData;
    }
}
