package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.LogLevel;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a320 extends fpf0 {

    /* JADX INFO: renamed from: a */
    private long f68251a;

    /* JADX INFO: renamed from: b */
    private String f68252b;

    /* JADX INFO: renamed from: c */
    private String f68253c;

    /* JADX INFO: renamed from: d */
    private String f68254d;

    /* JADX INFO: renamed from: e */
    protected String f68255e;

    /* JADX INFO: renamed from: f */
    private String f68256f;

    /* JADX INFO: renamed from: g */
    private String f68257g;

    /* JADX INFO: renamed from: h */
    private String f68258h;

    /* JADX INFO: renamed from: i */
    private String f68259i;

    /* JADX INFO: renamed from: j */
    private String f68260j;

    /* JADX INFO: renamed from: k */
    private String f68261k;

    /* JADX INFO: renamed from: l */
    private String f68262l;

    /* JADX INFO: renamed from: m */
    private String f68263m;

    public a320(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f68251a = 0L;
        this.f68252b = "mdefault";
        this.f68251a = fvx.m127733s();
        if (!TextUtils.isEmpty(str)) {
            this.f68252b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f68253c = str2;
        }
        this.f68254d = str3;
        this.f68255e = str4;
        this.f68256f = str5;
        this.f68257g = str6;
        this.f68258h = str7;
        this.f68259i = str8;
        this.f68260j = str9;
        this.f68261k = str10;
        esx.m122399d("MyHttpMediaLogsUpload", "appid: " + str);
        esx.m122399d("MyHttpMediaLogsUpload", "secretKey: " + str2);
        esx.m122399d("MyHttpMediaLogsUpload", "userid: " + str3);
        esx.m122399d("MyHttpMediaLogsUpload", "roomid: " + str4);
        esx.m122399d("MyHttpMediaLogsUpload", "provider: " + str5);
        esx.m122399d("MyHttpMediaLogsUpload", "businessType: " + str6);
        esx.m122399d("MyHttpMediaLogsUpload", "userAgent: " + str7);
        esx.m122399d("MyHttpMediaLogsUpload", "serviceType: " + str8);
        esx.m122399d("MyHttpMediaLogsUpload", "UUID: " + this.f68260j);
    }

    @Override // p153l.fpf0
    /* JADX INFO: renamed from: a */
    public void mo20149a(String str, String str2, String str3) {
        mo95755b(str, str2, str3, this.f68255e, this.f68257g, this.f68256f);
    }

    @Override // p153l.fpf0
    /* JADX INFO: renamed from: b */
    public void mo95755b(String str, String str2, String str3, String str4, String str5, String str6) {
        m95763k(str, str2, str3, this.f68255e, str5, str6, this.f68259i);
    }

    /* JADX INFO: renamed from: d */
    public void m95756d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f68252b = str;
            this.f68253c = str2;
            return;
        }
        b7y.m102882c().m102883a("setAppidSecretKey", "appid is=" + str + ",key:" + str2, LogLevel.ERROR);
    }

    /* JADX INFO: renamed from: e */
    public void m95757e(String str) {
        this.f68262l = str;
    }

    /* JADX INFO: renamed from: f */
    public void m95758f(String str) {
        this.f68255e = str;
    }

    /* JADX INFO: renamed from: g */
    public void m95759g(String str) {
        this.f68261k = str;
    }

    /* JADX INFO: renamed from: h */
    public void m95760h(String str) {
        this.f68263m = str;
    }

    /* JADX INFO: renamed from: i */
    public void m95761i(String str) {
        this.f68258h = str;
    }

    /* JADX INFO: renamed from: j */
    public void m95762j(String str) {
        this.f68254d = str;
    }

    /* JADX INFO: renamed from: k */
    public void m95763k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        esx.m122396a("MyHttpMediaLogsUpload", "[" + this.f68251a + "] upload6: " + str2 + "[" + str3 + Constants.AES_SUFFIX);
        if ("v3.imWatch".equals(str2) || "v3.detailData".equals(str2)) {
            return;
        }
        String strValueOf = String.valueOf(a7y.m96388a().m96389b() / 1000);
        String strValueOf2 = String.valueOf(aol.m99098e().m99106f());
        String strValueOf3 = String.valueOf(fvx.m127733s());
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("appid", TextUtils.isEmpty(this.f68252b) ? "mdefault" : this.f68252b);
        concurrentHashMap.put("secret", TextUtils.isEmpty(this.f68253c) ? "1a738fb015fe0a8476c4e05a314156d2" : this.f68253c);
        concurrentHashMap.put(UserId.TYPE, TextUtils.isEmpty(this.f68254d) ? "" : this.f68254d);
        concurrentHashMap.put(BLivePkCategory.random, strValueOf3);
        concurrentHashMap.put("time", strValueOf);
        String strM194733L = u6y.m194722F().m194733L();
        if (TextUtils.isEmpty(strM194733L)) {
            strM194733L = "";
        }
        concurrentHashMap.put("net", strM194733L);
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
        concurrentHashMap.put("User-Agent", TextUtils.isEmpty(this.f68258h) ? "" : this.f68258h);
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        concurrentHashMap.put("servicetype", str7);
        concurrentHashMap.put("uuid", TextUtils.isEmpty(this.f68260j) ? "" : this.f68260j);
        concurrentHashMap.put("newlog", "1");
        concurrentHashMap.put("showid", TextUtils.isEmpty(this.f68261k) ? "" : this.f68261k);
        concurrentHashMap.put("mTag", TextUtils.isEmpty(this.f68262l) ? "" : this.f68262l);
        String strM99795f = arx.m99789d().m99795f();
        concurrentHashMap.put("appName", TextUtils.isEmpty(strM99795f) ? "" : strM99795f);
        aol.m99098e().m99107j(concurrentHashMap, TextUtils.isEmpty(this.f68252b) ? "mdefault" : this.f68252b);
    }

    /* JADX INFO: renamed from: l */
    public void m95764l(String str, String str2, String str3, String str4, String str5, String str6) {
        m95763k(str, str2, str3, this.f68255e, str4, str5, str6);
    }
}
