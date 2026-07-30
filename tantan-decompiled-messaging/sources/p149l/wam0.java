package p149l;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class wam0 {

    @SerializedName("enable_proxy")
    private int enableProxy = 0;

    @SerializedName("enable_gpu_decode")
    private int enableGpuDecode = 0;

    @SerializedName("player_option")
    private Map<String, Integer> playerOptions = new HashMap();

    @SerializedName("enable_new_connection_probe")
    private int newConnectionProbe = 0;

    /* JADX INFO: renamed from: a */
    public int m202445a() {
        return this.enableGpuDecode;
    }

    /* JADX INFO: renamed from: b */
    public int m202446b() {
        return this.enableProxy;
    }

    /* JADX INFO: renamed from: c */
    public int m202447c() {
        return this.newConnectionProbe;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Integer> m202448d() {
        return this.playerOptions;
    }
}
