package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.tantanapp.foxstatistics.ntp.SntpClient;

/* JADX INFO: loaded from: classes11.dex */
public class d350 {

    /* JADX INFO: renamed from: g */
    public static d350 f84854g;

    /* JADX INFO: renamed from: h */
    public static Context f84855h;

    /* JADX INFO: renamed from: i */
    public static String[] f84856i = {"ntp1.aliyun.com", "cn.ntp.org.cn", "1.android.pool.ntp.org", "ntp2.aliyun.com", "1.pool.ntp.org", "2.android.pool.ntp.org", "ntp3.aliyun.com", "ntp4.aliyun.com", "ntp5.aliyun.com", "ntp6.aliyun.com", "ntp7.aliyun.com", "edu.ntp.org.cn", "hk.ntp.org.cn", "tw.ntp.org.cn", "us.ntp.org.cn", "sgp.ntp.org.cn", "kr.ntp.org.cn", "jp.ntp.org.cn", "de.ntp.org.cn", "ina.ntp.org.cn", "sim.ntp.org.cn", "cn.pool.ntp.org", "hk.pool.ntp.org", "tw.ntp.org.cn", "asia.pool.ntp.org", "3.asia.pool.ntp.org", "0.centos.pool.ntp.org", "1.centos.pool.ntp.org", "time.asia.apple.com", "clock.cuhk.edu.hk", "133.100.11.8", "time.windows.com", "time.google.com"};

    /* JADX INFO: renamed from: a */
    public final long f84857a;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f84858b;

    /* JADX INFO: renamed from: c */
    public boolean f84859c;

    /* JADX INFO: renamed from: d */
    public long f84860d;

    /* JADX INFO: renamed from: e */
    public long f84861e;

    /* JADX INFO: renamed from: f */
    public long f84862f;

    public d350(String str, long j) {
        this.f84857a = j;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized d350 m113782d(Context context) {
        try {
            if (f84854g == null) {
                f84854g = new d350("2.android.pool.ntp.org", 2000L);
                f84855h = context;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f84854g;
    }

    /* JADX INFO: renamed from: a */
    public long m113783a() {
        return !this.f84859c ? System.currentTimeMillis() : this.f84860d + m113785c();
    }

    /* JADX INFO: renamed from: b */
    public boolean m113784b() {
        if (this.f84858b == null) {
            this.f84858b = (ConnectivityManager) f84855h.getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = this.f84858b;
        NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            SntpClient sntpClient = new SntpClient();
            for (String str : f84856i) {
                if (sntpClient.m82521g(str, (int) this.f84857a)) {
                    this.f84859c = true;
                    this.f84860d = sntpClient.m82516b();
                    this.f84861e = sntpClient.m82517c();
                    this.f84862f = sntpClient.m82518d() / 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public long m113785c() {
        if (this.f84859c) {
            return SystemClock.elapsedRealtime() - this.f84861e;
        }
        return Long.MAX_VALUE;
    }
}
