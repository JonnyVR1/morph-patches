package p153l;

import com.google.gson.annotations.SerializedName;
import com.immomo.medialog.safejson.RefereeConfig;

/* JADX INFO: loaded from: classes7.dex */
public class ov5 {

    @SerializedName("comm_config")
    public ug5 commConfig;

    @SerializedName("log_config")
    public ryv logConfig;

    @SerializedName("pull_config")
    public x7b0 pullConfig;

    @SerializedName("push_config")
    public emb0 pushConfig;

    @SerializedName("referee_config")
    RefereeConfig refereeConfig;

    @SerializedName("vod_config")
    public akm0 vodConfig;

    /* JADX INFO: renamed from: a */
    public ug5 m169422a() {
        return this.commConfig;
    }

    /* JADX INFO: renamed from: b */
    public ryv m169423b() {
        return this.logConfig;
    }

    /* JADX INFO: renamed from: c */
    public x7b0 m169424c() {
        return this.pullConfig;
    }

    /* JADX INFO: renamed from: d */
    public emb0 m169425d() {
        return this.pushConfig;
    }

    /* JADX INFO: renamed from: e */
    public akm0 m169426e() {
        return this.vodConfig;
    }
}
