package p153l;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ug5 {

    @SerializedName("enable_apm_plugin")
    private int enableApmPlugin;

    @SerializedName("enable_medialog")
    private int enableMedialog;

    @SerializedName("enable_roomconfig")
    private int enableRoomconfig;

    @SerializedName("ipv6_detector")
    private f4m ipv6DetectorConfig;

    @SerializedName("V6detectInterval")
    private int v6detectInterval;

    @SerializedName("v6pburl")
    private List<String> v6pburl;

    /* JADX INFO: renamed from: a */
    public int m195885a() {
        return this.enableApmPlugin;
    }

    /* JADX INFO: renamed from: b */
    public f4m m195886b() {
        return this.ipv6DetectorConfig;
    }

    public String toString() {
        return "CommConfig{enableRoomconfig=" + this.enableRoomconfig + ", enableMedialog=" + this.enableMedialog + ", v6pburl=" + this.v6pburl + ", v6detectInterval=" + this.v6detectInterval + ", enableApmPlugin=" + this.enableApmPlugin + '}';
    }
}
