package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.tantanapp.foxstatistics.ntp.SntpClient;

/* JADX INFO: loaded from: classes13.dex */
public class ou40 {

    /* JADX INFO: renamed from: g */
    public static ou40 f145656g;

    /* JADX INFO: renamed from: h */
    public static Context f145657h;

    /* JADX INFO: renamed from: i */
    public static String[] f145658i = {"ntp1.aliyun.com", "cn.ntp.org.cn", "1.android.pool.ntp.org", "ntp2.aliyun.com", "1.pool.ntp.org", "2.android.pool.ntp.org", "ntp3.aliyun.com", "ntp4.aliyun.com", "ntp5.aliyun.com", "ntp6.aliyun.com", "ntp7.aliyun.com", "edu.ntp.org.cn", "hk.ntp.org.cn", "tw.ntp.org.cn", "us.ntp.org.cn", "sgp.ntp.org.cn", "kr.ntp.org.cn", "jp.ntp.org.cn", "de.ntp.org.cn", "ina.ntp.org.cn", "sim.ntp.org.cn", "cn.pool.ntp.org", "hk.pool.ntp.org", "tw.ntp.org.cn", "asia.pool.ntp.org", "3.asia.pool.ntp.org", "0.centos.pool.ntp.org", "1.centos.pool.ntp.org", "time.asia.apple.com", "clock.cuhk.edu.hk", "133.100.11.8", "time.windows.com", "time.google.com"};

    /* JADX INFO: renamed from: a */
    public final long f145659a;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f145660b;

    /* JADX INFO: renamed from: c */
    public boolean f145661c;

    /* JADX INFO: renamed from: d */
    public long f145662d;

    /* JADX INFO: renamed from: e */
    public long f145663e;

    /* JADX INFO: renamed from: f */
    public long f145664f;

    public ou40(String str, long j) {
        this.f145659a = j;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized ou40 m165977d(Context context) {
        try {
            if (f145656g == null) {
                f145656g = new ou40("2.android.pool.ntp.org", 2000L);
                f145657h = context;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f145656g;
    }

    /* JADX INFO: renamed from: a */
    public long m165978a() {
        return !this.f145661c ? System.currentTimeMillis() : this.f145662d + m165980c();
    }

    /* JADX INFO: renamed from: b */
    public boolean m165979b() {
        if (this.f145660b == null) {
            this.f145660b = (ConnectivityManager) f145657h.getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = this.f145660b;
        NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            SntpClient sntpClient = new SntpClient();
            for (String str : f145658i) {
                if (sntpClient.m81338g(str, (int) this.f145659a)) {
                    this.f145661c = true;
                    this.f145662d = sntpClient.m81333b();
                    this.f145663e = sntpClient.m81334c();
                    this.f145664f = sntpClient.m81335d() / 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public long m165980c() {
        if (this.f145661c) {
            return SystemClock.elapsedRealtime() - this.f145663e;
        }
        return Long.MAX_VALUE;
    }
}
