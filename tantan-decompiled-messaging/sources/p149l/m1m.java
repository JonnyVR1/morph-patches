package p149l;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class m1m {

    @SerializedName("enable")
    private int enable = 0;

    @SerializedName("vod_enable")
    private int vodEnable = 0;

    @SerializedName("enable_detect")
    private int enableDetect = 0;

    @SerializedName("enable_root_detect")
    private int enableRootDetect = 1;

    @SerializedName("detect_interval")
    private long detectInterval = 180;

    @SerializedName("detect_url")
    private String detectUrl = "http://ipv6-detect-a1.immomo.com/check,http://ipv6-detect-a2.immomo.com/check";

    @SerializedName("enable_v6_first")
    private int enableV6First = 0;

    @SerializedName("root_enable_v6_first")
    private int rootEnableV6First = 1;

    @SerializedName("retry_time")
    private long retryTime = 900;

    @SerializedName("root_retry_time")
    private long rootRetryTime = 300;

    @SerializedName("no_response_count")
    private int noResponseCount = 2;

    @SerializedName("enable_local_v6")
    private int enableLocalV6 = 0;

    @SerializedName("depend_checker")
    private int dependChecker = 1;

    @SerializedName("root_depend_checker")
    private int rootDependChecker = 0;

    @SerializedName("failed_urls_limit")
    private int failedUrlsLimit = 1;

    @SerializedName("root_failed_urls_limit")
    private int rootFailedUrlsLimit = 10;

    @SerializedName("failed_per_url_limit")
    private int failedPerUrlLimit = 1;

    @SerializedName("root_failed_per_url_limit")
    private int rootFailedPerUrlLimit = 2;

    @SerializedName("failed_push_urls_limit")
    private int failedPushUrlsLimit = 1;

    @SerializedName("root_failed_push_urls_limit")
    private int rootFailedPushUrlsLimit = 2;

    @SerializedName("get_url_interval_limit")
    private long urlIntervalLimit = 3600;

    @SerializedName("root_get_url_interval_limit")
    private long rootUrlIntervalLimit = 3600;

    /* JADX INFO: renamed from: a */
    public int m152599a() {
        return this.dependChecker;
    }

    /* JADX INFO: renamed from: b */
    public long m152600b() {
        return this.detectInterval;
    }

    /* JADX INFO: renamed from: c */
    public String m152601c() {
        return this.detectUrl;
    }

    /* JADX INFO: renamed from: d */
    public int m152602d() {
        return this.enable;
    }

    /* JADX INFO: renamed from: e */
    public int m152603e() {
        return this.enableDetect;
    }

    /* JADX INFO: renamed from: f */
    public int m152604f() {
        return this.enableLocalV6;
    }

    /* JADX INFO: renamed from: g */
    public int m152605g() {
        return this.enableRootDetect;
    }

    /* JADX INFO: renamed from: h */
    public int m152606h() {
        return this.enableV6First;
    }

    /* JADX INFO: renamed from: i */
    public int m152607i() {
        return this.failedPerUrlLimit;
    }

    /* JADX INFO: renamed from: j */
    public int m152608j() {
        return this.failedPushUrlsLimit;
    }

    /* JADX INFO: renamed from: k */
    public int m152609k() {
        return this.failedUrlsLimit;
    }

    /* JADX INFO: renamed from: l */
    public int m152610l() {
        return this.noResponseCount;
    }

    /* JADX INFO: renamed from: m */
    public long m152611m() {
        return this.retryTime;
    }

    /* JADX INFO: renamed from: n */
    public int m152612n() {
        return this.rootDependChecker;
    }

    /* JADX INFO: renamed from: o */
    public int m152613o() {
        return this.rootEnableV6First;
    }

    /* JADX INFO: renamed from: p */
    public int m152614p() {
        return this.rootFailedPerUrlLimit;
    }

    /* JADX INFO: renamed from: q */
    public int m152615q() {
        return this.rootFailedPushUrlsLimit;
    }

    /* JADX INFO: renamed from: r */
    public int m152616r() {
        return this.rootFailedUrlsLimit;
    }

    /* JADX INFO: renamed from: s */
    public long m152617s() {
        return this.rootRetryTime;
    }

    /* JADX INFO: renamed from: t */
    public long m152618t() {
        return this.rootUrlIntervalLimit;
    }

    @NonNull
    public String toString() {
        return "enable === " + this.enable + " \nenableDetect === " + this.enableDetect + " \nenableRootDetect === " + this.enableRootDetect + " \ndetectInterval === " + this.detectInterval + " \ndetectUrl === " + this.detectUrl + " \nenableV6First === " + this.enableV6First + " \nretryTime === " + this.retryTime + " \nrootRetryTime === " + this.rootRetryTime + " \nnoResponseCount === " + this.noResponseCount + " \nenableLocalV6 === " + this.enableLocalV6;
    }

    /* JADX INFO: renamed from: u */
    public long m152619u() {
        return this.urlIntervalLimit;
    }

    /* JADX INFO: renamed from: v */
    public int m152620v() {
        return this.vodEnable;
    }
}
