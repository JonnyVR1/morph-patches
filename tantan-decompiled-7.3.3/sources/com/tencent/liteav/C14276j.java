package com.tencent.liteav;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.liteav.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14276j {

    /* JADX INFO: renamed from: a */
    private String f60215a = "";

    /* JADX INFO: renamed from: b */
    private String f60216b = "";

    /* JADX INFO: renamed from: c */
    private int f60217c = 0;

    /* JADX INFO: renamed from: d */
    private String f60218d = "";

    /* JADX INFO: renamed from: e */
    private String f60219e = "";

    /* JADX INFO: renamed from: f */
    private long f60220f = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo84802a(long j);
    }

    /* JADX INFO: renamed from: a */
    public String m84801a(long j) {
        String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.f60220f + (j * 1000)));
        int i = this.f60217c;
        if (i >= 0) {
            return String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", this.f60215a, Integer.valueOf(i), this.f60216b, str, this.f60218d);
        }
        return String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=%d", this.f60215a, this.f60219e, this.f60216b, Long.valueOf(((System.currentTimeMillis() - this.f60220f) - j) / 1000));
    }

    /* JADX INFO: renamed from: a */
    public long m84800a() {
        return System.currentTimeMillis() - this.f60220f;
    }

    /* JADX INFO: renamed from: a */
    public int m84799a(final String str, final String str2, final int i, final a aVar) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String appID = TXCCommonUtil.getAppID();
        this.f60218d = appID;
        if (TextUtils.isEmpty(appID)) {
            return -2;
        }
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.j.1
            @Override // java.lang.Runnable
            public void run() {
                C14276j.this.f60220f = System.currentTimeMillis();
                String str3 = "";
                C14276j.this.f60216b = "";
                C14276j.this.f60217c = i;
                C14276j.this.f60215a = str2;
                C14276j.this.f60216b = TXCCommonUtil.getStreamIDByStreamUrl(str);
                C14276j.this.f60219e = TXCCommonUtil.getAppNameByStreamUrl(str);
                if (C14276j.this.f60219e == null) {
                    C14276j.this.f60219e = "live";
                }
                int i2 = C14276j.this.f60217c;
                C14276j c14276j = C14276j.this;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(i2 < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0", c14276j.f60215a, C14276j.this.f60219e, C14276j.this.f60216b) : String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", c14276j.f60215a, Integer.valueOf(C14276j.this.f60217c), C14276j.this.f60216b, C14276j.this.f60218d)).openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Charsert", "UTF-8");
                    httpURLConnection.setRequestProperty("Content-Type", "text/plain;");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str3 = str3 + line;
                    }
                    TXCLog.m84152i("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = " + str3);
                    String strM84790a = C14276j.this.m84790a(str3);
                    if (strM84790a != null) {
                        C14276j.this.f60220f = Long.parseLong(strM84790a) * 1000;
                    }
                } catch (Exception e) {
                    C14276j.this.f60220f = System.currentTimeMillis();
                    TXCLog.m84149e("TXCTimeShiftUtil", "prepareSeekTime error " + e.toString());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                TXCLog.m84152i("TXCTimeShiftUtil", "live start time:" + C14276j.this.f60220f + ",currentTime:" + jCurrentTimeMillis + ",diff:" + (jCurrentTimeMillis - C14276j.this.f60220f));
                final long j = jCurrentTimeMillis - C14276j.this.f60220f;
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.j.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.mo84802a(j);
                        }
                    });
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m84790a(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (!str.contains("#EXT-TX-TS-START-TIME") || (iIndexOf = str.indexOf("#EXT-TX-TS-START-TIME:") + 22) <= 0 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf)).indexOf("#")) <= 0) {
            return null;
        }
        return strSubstring.substring(0, iIndexOf2).replaceAll("\r\n", "");
    }
}
