package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class ceu extends a4s {

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("icon")
    private String icon;
    private boolean inWhiteBackground;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("text")
    private String text;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: a */
    public LiveGoAction m109455a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public String m109456b() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c */
    public String m109457c() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: d */
    public String m109458d() {
        return this.text;
    }

    /* JADX INFO: renamed from: e */
    public String m109459e() {
        return this.title;
    }

    /* JADX INFO: renamed from: f */
    public LiveCardTrackData m109460f() {
        return this.trackData;
    }
}
