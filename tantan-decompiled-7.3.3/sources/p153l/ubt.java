package p153l;

import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class ubt extends a4s {

    @SerializedName(SeeTextDynamicParam.age)
    private String age;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("distance")
    private String distance;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("title")
    private String title;

    @SerializedName("titlePicUrl")
    private String titlePicUrl;

    @SerializedName("topDesc")
    private String topDesc;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: a */
    public String m195295a() {
        return this.age;
    }

    /* JADX INFO: renamed from: b */
    public String m195296b() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: c */
    public String m195297c() {
        return this.distance;
    }

    /* JADX INFO: renamed from: d */
    public LiveGoAction m195298d() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: e */
    public String m195299e() {
        return this.title;
    }

    /* JADX INFO: renamed from: f */
    public String m195300f() {
        return this.titlePicUrl;
    }

    /* JADX INFO: renamed from: g */
    public String m195301g() {
        return this.topDesc;
    }

    /* JADX INFO: renamed from: h */
    public LiveCardTrackData m195302h() {
        return this.trackData;
    }
}
