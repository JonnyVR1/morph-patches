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
public class C14113j {

    /* JADX INFO: renamed from: a */
    private String f59367a = "";

    /* JADX INFO: renamed from: b */
    private String f59368b = "";

    /* JADX INFO: renamed from: c */
    private int f59369c = 0;

    /* JADX INFO: renamed from: d */
    private String f59370d = "";

    /* JADX INFO: renamed from: e */
    private String f59371e = "";

    /* JADX INFO: renamed from: f */
    private long f59372f = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo83619a(long j);
    }

    /* JADX INFO: renamed from: a */
    public String m83618a(long j) {
        String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.f59372f + (j * 1000)));
        int i = this.f59369c;
        if (i >= 0) {
            return String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", this.f59367a, Integer.valueOf(i), this.f59368b, str, this.f59370d);
        }
        return String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=%d", this.f59367a, this.f59371e, this.f59368b, Long.valueOf(((System.currentTimeMillis() - this.f59372f) - j) / 1000));
    }

    /* JADX INFO: renamed from: a */
    public long m83617a() {
        return System.currentTimeMillis() - this.f59372f;
    }

    /* JADX INFO: renamed from: a */
    public int m83616a(final String str, final String str2, final int i, final a aVar) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String appID = TXCCommonUtil.getAppID();
        this.f59370d = appID;
        if (TextUtils.isEmpty(appID)) {
            return -2;
        }
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.j.1
            @Override // java.lang.Runnable
            public void run() {
                C14113j.this.f59372f = System.currentTimeMillis();
                String str3 = "";
                C14113j.this.f59368b = "";
                C14113j.this.f59369c = i;
                C14113j.this.f59367a = str2;
                C14113j.this.f59368b = TXCCommonUtil.getStreamIDByStreamUrl(str);
                C14113j.this.f59371e = TXCCommonUtil.getAppNameByStreamUrl(str);
                if (C14113j.this.f59371e == null) {
                    C14113j.this.f59371e = "live";
                }
                int i2 = C14113j.this.f59369c;
                C14113j c14113j = C14113j.this;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(i2 < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0", c14113j.f59367a, C14113j.this.f59371e, C14113j.this.f59368b) : String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", c14113j.f59367a, Integer.valueOf(C14113j.this.f59369c), C14113j.this.f59368b, C14113j.this.f59370d)).openConnection();
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
                    TXCLog.m82969i("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = " + str3);
                    String strM83607a = C14113j.this.m83607a(str3);
                    if (strM83607a != null) {
                        C14113j.this.f59372f = Long.parseLong(strM83607a) * 1000;
                    }
                } catch (Exception e) {
                    C14113j.this.f59372f = System.currentTimeMillis();
                    TXCLog.m82966e("TXCTimeShiftUtil", "prepareSeekTime error " + e.toString());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                TXCLog.m82969i("TXCTimeShiftUtil", "live start time:" + C14113j.this.f59372f + ",currentTime:" + jCurrentTimeMillis + ",diff:" + (jCurrentTimeMillis - C14113j.this.f59372f));
                final long j = jCurrentTimeMillis - C14113j.this.f59372f;
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.j.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.mo83619a(j);
                        }
                    });
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m83607a(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (!str.contains("#EXT-TX-TS-START-TIME") || (iIndexOf = str.indexOf("#EXT-TX-TS-START-TIME:") + 22) <= 0 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf)).indexOf("#")) <= 0) {
            return null;
        }
        return strSubstring.substring(0, iIndexOf2).replaceAll("\r\n", "");
    }
}
