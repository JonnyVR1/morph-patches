package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class wws extends z1s {

    @SerializedName("backgroundImage")
    private String backgroundImage;

    @SerializedName("giftImage")
    private String giftImage;

    @SerializedName("goAction")
    private LiveGoAction goAction;
    public boolean isFromLongLink = false;

    @SerializedName("receiveUser")
    private C20986a receiveUser;

    @SerializedName("sendUser")
    private C20986a sendUser;

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

    /* JADX INFO: renamed from: l.wws$a */
    public static class C20986a {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName(AuthenticationTokenClaims.JSON_KEY_NAME)
        private String name;

        /* JADX INFO: renamed from: a */
        public String m205885a() {
            return this.avatar;
        }

        /* JADX INFO: renamed from: b */
        public String m205886b() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m205875a() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b */
    public String m205876b() {
        return this.giftImage;
    }

    /* JADX INFO: renamed from: c */
    public LiveGoAction m205877c() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: d */
    public C20986a m205878d() {
        return this.receiveUser;
    }

    /* JADX INFO: renamed from: e */
    public C20986a m205879e() {
        return this.sendUser;
    }

    /* JADX INFO: renamed from: f */
    public String m205880f() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: g */
    public String m205881g() {
        return this.tabId;
    }

    /* JADX INFO: renamed from: h */
    public long m205882h() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: i */
    public String m205883i() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: j */
    public LiveCardTrackData m205884j() {
        return this.trackData;
    }
}
