package p153l;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class f4m {

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
    public int m123991a() {
        return this.dependChecker;
    }

    /* JADX INFO: renamed from: b */
    public long m123992b() {
        return this.detectInterval;
    }

    /* JADX INFO: renamed from: c */
    public String m123993c() {
        return this.detectUrl;
    }

    /* JADX INFO: renamed from: d */
    public int m123994d() {
        return this.enable;
    }

    /* JADX INFO: renamed from: e */
    public int m123995e() {
        return this.enableDetect;
    }

    /* JADX INFO: renamed from: f */
    public int m123996f() {
        return this.enableLocalV6;
    }

    /* JADX INFO: renamed from: g */
    public int m123997g() {
        return this.enableRootDetect;
    }

    /* JADX INFO: renamed from: h */
    public int m123998h() {
        return this.enableV6First;
    }

    /* JADX INFO: renamed from: i */
    public int m123999i() {
        return this.failedPerUrlLimit;
    }

    /* JADX INFO: renamed from: j */
    public int m124000j() {
        return this.failedPushUrlsLimit;
    }

    /* JADX INFO: renamed from: k */
    public int m124001k() {
        return this.failedUrlsLimit;
    }

    /* JADX INFO: renamed from: l */
    public int m124002l() {
        return this.noResponseCount;
    }

    /* JADX INFO: renamed from: m */
    public long m124003m() {
        return this.retryTime;
    }

    /* JADX INFO: renamed from: n */
    public int m124004n() {
        return this.rootDependChecker;
    }

    /* JADX INFO: renamed from: o */
    public int m124005o() {
        return this.rootEnableV6First;
    }

    /* JADX INFO: renamed from: p */
    public int m124006p() {
        return this.rootFailedPerUrlLimit;
    }

    /* JADX INFO: renamed from: q */
    public int m124007q() {
        return this.rootFailedPushUrlsLimit;
    }

    /* JADX INFO: renamed from: r */
    public int m124008r() {
        return this.rootFailedUrlsLimit;
    }

    /* JADX INFO: renamed from: s */
    public long m124009s() {
        return this.rootRetryTime;
    }

    /* JADX INFO: renamed from: t */
    public long m124010t() {
        return this.rootUrlIntervalLimit;
    }

    @NonNull
    public String toString() {
        return "enable === " + this.enable + " \nenableDetect === " + this.enableDetect + " \nenableRootDetect === " + this.enableRootDetect + " \ndetectInterval === " + this.detectInterval + " \ndetectUrl === " + this.detectUrl + " \nenableV6First === " + this.enableV6First + " \nretryTime === " + this.retryTime + " \nrootRetryTime === " + this.rootRetryTime + " \nnoResponseCount === " + this.noResponseCount + " \nenableLocalV6 === " + this.enableLocalV6;
    }

    /* JADX INFO: renamed from: u */
    public long m124011u() {
        return this.urlIntervalLimit;
    }

    /* JADX INFO: renamed from: v */
    public int m124012v() {
        return this.vodEnable;
    }
}
