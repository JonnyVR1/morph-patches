package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.LogLevel;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class su10 extends xgf0 {

    /* JADX INFO: renamed from: a */
    private long f166408a;

    /* JADX INFO: renamed from: b */
    private String f166409b;

    /* JADX INFO: renamed from: c */
    private String f166410c;

    /* JADX INFO: renamed from: d */
    private String f166411d;

    /* JADX INFO: renamed from: e */
    protected String f166412e;

    /* JADX INFO: renamed from: f */
    private String f166413f;

    /* JADX INFO: renamed from: g */
    private String f166414g;

    /* JADX INFO: renamed from: h */
    private String f166415h;

    /* JADX INFO: renamed from: i */
    private String f166416i;

    /* JADX INFO: renamed from: j */
    private String f166417j;

    /* JADX INFO: renamed from: k */
    private String f166418k;

    /* JADX INFO: renamed from: l */
    private String f166419l;

    /* JADX INFO: renamed from: m */
    private String f166420m;

    public su10(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f166408a = 0L;
        this.f166409b = "mdefault";
        this.f166408a = imx.m137112s();
        if (!TextUtils.isEmpty(str)) {
            this.f166409b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f166410c = str2;
        }
        this.f166411d = str3;
        this.f166412e = str4;
        this.f166413f = str5;
        this.f166414g = str6;
        this.f166415h = str7;
        this.f166416i = str8;
        this.f166417j = str9;
        this.f166418k = str10;
        hjx.m131421d("MyHttpMediaLogsUpload", "appid: " + str);
        hjx.m131421d("MyHttpMediaLogsUpload", "secretKey: " + str2);
        hjx.m131421d("MyHttpMediaLogsUpload", "userid: " + str3);
        hjx.m131421d("MyHttpMediaLogsUpload", "roomid: " + str4);
        hjx.m131421d("MyHttpMediaLogsUpload", "provider: " + str5);
        hjx.m131421d("MyHttpMediaLogsUpload", "businessType: " + str6);
        hjx.m131421d("MyHttpMediaLogsUpload", "userAgent: " + str7);
        hjx.m131421d("MyHttpMediaLogsUpload", "serviceType: " + str8);
        hjx.m131421d("MyHttpMediaLogsUpload", "UUID: " + this.f166417j);
    }

    @Override // p149l.xgf0
    /* JADX INFO: renamed from: a */
    public void mo19169a(String str, String str2, String str3) {
        mo185981b(str, str2, str3, this.f166412e, this.f166414g, this.f166413f);
    }

    @Override // p149l.xgf0
    /* JADX INFO: renamed from: b */
    public void mo185981b(String str, String str2, String str3, String str4, String str5, String str6) {
        m185989k(str, str2, str3, this.f166412e, str5, str6, this.f166416i);
    }

    /* JADX INFO: renamed from: d */
    public void m185982d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f166409b = str;
            this.f166410c = str2;
            return;
        }
        eyx.m118802c().m118803a("setAppidSecretKey", "appid is=" + str + ",key:" + str2, LogLevel.ERROR);
    }

    /* JADX INFO: renamed from: e */
    public void m185983e(String str) {
        this.f166419l = str;
    }

    /* JADX INFO: renamed from: f */
    public void m185984f(String str) {
        this.f166412e = str;
    }

    /* JADX INFO: renamed from: g */
    public void m185985g(String str) {
        this.f166418k = str;
    }

    /* JADX INFO: renamed from: h */
    public void m185986h(String str) {
        this.f166420m = str;
    }

    /* JADX INFO: renamed from: i */
    public void m185987i(String str) {
        this.f166415h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m185988j(String str) {
        this.f166411d = str;
    }

    /* JADX INFO: renamed from: k */
    public void m185989k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        hjx.m131418a("MyHttpMediaLogsUpload", "[" + this.f166408a + "] upload6: " + str2 + "[" + str3 + Constants.AES_SUFFIX);
        if ("v3.imWatch".equals(str2) || "v3.detailData".equals(str2)) {
            return;
        }
        String strValueOf = String.valueOf(dyx.m114098a().m114099b() / 1000);
        String strValueOf2 = String.valueOf(lll.m150502e().m150510f());
        String strValueOf3 = String.valueOf(imx.m137112s());
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", TextUtils.isEmpty(this.f166409b) ? "mdefault" : this.f166409b);
        concurrentHashMap.put("secret", TextUtils.isEmpty(this.f166410c) ? "1a738fb015fe0a8476c4e05a314156d2" : this.f166410c);
        concurrentHashMap.put(UserId.TYPE, TextUtils.isEmpty(this.f166411d) ? "" : this.f166411d);
        concurrentHashMap.put(BLivePkCategory.random, strValueOf3);
        concurrentHashMap.put("time", strValueOf);
        String strM211583L = xxx.m211572F().m211583L();
        if (TextUtils.isEmpty(strM211583L)) {
            strM211583L = "";
        }
        concurrentHashMap.put("net", strM211583L);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        concurrentHashMap.put("roomid", str4);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        concurrentHashMap.put("publisherType", str);
        concurrentHashMap.put("sessiontime", String.valueOf(hashCode()));
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        concurrentHashMap.put("provider", str6);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        concurrentHashMap.put("type", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        concurrentHashMap.put("body", str3);
        concurrentHashMap.put("msgID", strValueOf2);
        if (TextUtils.isEmpty(str5)) {
            str5 = "";
        }
        concurrentHashMap.put("businessType", str5);
        concurrentHashMap.put("retryTime", "0");
        concurrentHashMap.put("lat", "0");
        concurrentHashMap.put("lng", "0");
        concurrentHashMap.put("User-Agent", TextUtils.isEmpty(this.f166415h) ? "" : this.f166415h);
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        concurrentHashMap.put("servicetype", str7);
        concurrentHashMap.put("uuid", TextUtils.isEmpty(this.f166417j) ? "" : this.f166417j);
        concurrentHashMap.put("newlog", "1");
        concurrentHashMap.put("showid", TextUtils.isEmpty(this.f166418k) ? "" : this.f166418k);
        concurrentHashMap.put("mTag", TextUtils.isEmpty(this.f166419l) ? "" : this.f166419l);
        String strM111946f = dix.m111940d().m111946f();
        concurrentHashMap.put("appName", TextUtils.isEmpty(strM111946f) ? "" : strM111946f);
        lll.m150502e().m150511j(concurrentHashMap, TextUtils.isEmpty(this.f166409b) ? "mdefault" : this.f166409b);
    }

    /* JADX INFO: renamed from: l */
    public void m185990l(String str, String str2, String str3, String str4, String str5, String str6) {
        m185989k(str, str2, str3, this.f166412e, str4, str5, str6);
    }
}
