package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class xys extends a4s {

    @SerializedName("backgroundImage")
    private String backgroundImage;

    @SerializedName("giftImage")
    private String giftImage;

    @SerializedName("goAction")
    private LiveGoAction goAction;
    public boolean isFromLongLink = false;

    @SerializedName("receiveUser")
    private C21479a receiveUser;

    @SerializedName("sendUser")
    private C21479a sendUser;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("tabId")
    private String tabId;

    @SerializedName("timestamp")
    private long timestamp;

    @SerializedName("titleImage")
    private String titleImage;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    /* JADX INFO: renamed from: l.xys$a */
    public static class C21479a {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        private String name;

        /* JADX INFO: renamed from: a */
        public String m213648a() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: b */
        public String m213649b() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m213638a() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b */
    public String m213639b() {
        return this.giftImage;
    }

    /* JADX INFO: renamed from: c */
    public LiveGoAction m213640c() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: d */
    public C21479a m213641d() {
        return this.receiveUser;
    }

    /* JADX INFO: renamed from: e */
    public C21479a m213642e() {
        return this.sendUser;
    }

    /* JADX INFO: renamed from: f */
    public String m213643f() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: g */
    public String m213644g() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: h */
    public long m213645h() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: i */
    public String m213646i() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: j */
    public LiveCardTrackData m213647j() {
        return this.trackData;
    }
}
