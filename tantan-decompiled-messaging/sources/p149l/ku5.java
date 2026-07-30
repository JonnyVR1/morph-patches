package p149l;

import com.google.gson.annotations.SerializedName;
import com.immomo.medialog.safejson.RefereeConfig;

/* JADX INFO: loaded from: classes7.dex */
public class ku5 {

    @SerializedName("comm_config")
    public uf5 commConfig;

    @SerializedName("log_config")
    public rwv logConfig;

    @SerializedName("pull_config")
    public tza0 pullConfig;

    @SerializedName("push_config")
    public aeb0 pushConfig;

    @SerializedName("referee_config")
    RefereeConfig refereeConfig;

    @SerializedName("vod_config")
    public wam0 vodConfig;

    /* JADX INFO: renamed from: a */
    public uf5 m147239a() {
        return this.commConfig;
    }

    /* JADX INFO: renamed from: b */
    public rwv m147240b() {
        return this.logConfig;
    }

    /* JADX INFO: renamed from: c */
    public tza0 m147241c() {
        return this.pullConfig;
    }

    /* JADX INFO: renamed from: d */
    public aeb0 m147242d() {
        return this.pushConfig;
    }

    /* JADX INFO: renamed from: e */
    public wam0 m147243e() {
        return this.vodConfig;
    }
}
