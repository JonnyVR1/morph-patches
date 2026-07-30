package p149l;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class bcu extends z1s {

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
    public LiveGoAction m101125a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public String m101126b() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c */
    public String m101127c() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: d */
    public String m101128d() {
        return this.text;
    }

    /* JADX INFO: renamed from: e */
    public String m101129e() {
        return this.title;
    }

    /* JADX INFO: renamed from: f */
    public LiveCardTrackData m101130f() {
        return this.trackData;
    }
}
