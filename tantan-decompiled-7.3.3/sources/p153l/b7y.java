package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.UserId;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b7y implements Handler.Callback {

    /* JADX INFO: renamed from: q */
    public static int f75347q = 1;

    /* JADX INFO: renamed from: a */
    private volatile HandlerThread f75348a;

    /* JADX INFO: renamed from: b */
    private volatile Handler f75349b;

    /* JADX INFO: renamed from: f */
    private volatile a320 f75353f;

    /* JADX INFO: renamed from: m */
    private String f75360m;

    /* JADX INFO: renamed from: c */
    private int f75350c = 6;

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> f75351d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private final ArrayList<String> f75352e = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private String f75354g = "nonConf";

    /* JADX INFO: renamed from: h */
    private int f75355h = 111;

    /* JADX INFO: renamed from: i */
    private int f75356i = 0;

    /* JADX INFO: renamed from: j */
    private String f75357j = "";

    /* JADX INFO: renamed from: k */
    private Object f75358k = new Object();

    /* JADX INFO: renamed from: l */
    private String f75359l = "mlive";

    /* JADX INFO: renamed from: n */
    private String f75361n = "";

    /* JADX INFO: renamed from: o */
    private String f75362o = "";

    /* JADX INFO: renamed from: p */
    private String f75363p = "";

    /* JADX INFO: renamed from: l.b7y$a */
    public class C15942a {

        /* JADX INFO: renamed from: a */
        String f75364a;

        /* JADX INFO: renamed from: b */
        String f75365b;

        /* JADX INFO: renamed from: c */
        String f75366c;

        /* JADX INFO: renamed from: d */
        String f75367d;

        /* JADX INFO: renamed from: e */
        String f75368e;

        /* JADX INFO: renamed from: f */
        String f75369f;

        public C15942a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f75364a = str;
            this.f75365b = str2;
            this.f75366c = str3;
            this.f75367d = str4;
            this.f75368e = str5;
            this.f75369f = str6;
        }
    }

    /* JADX INFO: renamed from: l.b7y$b */
    public static class C15943b {

        /* JADX INFO: renamed from: a */
        public int f75371a;

        /* JADX INFO: renamed from: b */
        public int f75372b;

        /* JADX INFO: renamed from: c */
        public String f75373c;

        /* JADX INFO: renamed from: d */
        public String f75374d;

        /* JADX INFO: renamed from: e */
        public String f75375e;

        /* JADX INFO: renamed from: f */
        public int f75376f;

        /* JADX INFO: renamed from: g */
        public String f75377g;

        public C15943b(int i, int i2, String str, String str2, String str3, int i3, String str4) {
            this.f75371a = i;
            this.f75372b = i2;
            this.f75373c = str;
            this.f75374d = str2;
            this.f75375e = str3;
            this.f75376f = i3;
            this.f75377g = str4;
        }
    }

    /* JADX INFO: renamed from: l.b7y$c */
    public static class C15944c {

        /* JADX INFO: renamed from: a */
        private static b7y f75378a = new b7y();
    }

    public b7y() {
        this.f75360m = "ef75b8eb629d73f32fd98976ccdb667b";
        if (this.f75348a == null) {
            this.f75348a = new HandlerThread("MediaTraceLog");
            this.f75348a.start();
            this.f75349b = new Handler(this.f75348a.getLooper(), this);
        }
        String str = this.f75361n;
        String str2 = this.f75362o;
        arx.m99789d().m99796g(this.f75359l);
        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f75359l);
        if (c15814dM99797h != null) {
            this.f75360m = c15814dM99797h.f73009b;
            str = c15814dM99797h.f73010c;
        }
        String str3 = str;
        if (this.f75353f == null) {
            m102892k(new a320(this.f75359l, this.f75360m, str3, str2, String.valueOf(0), String.valueOf(0), this.f75363p, "", String.valueOf(hashCode()), ""));
        }
    }

    /* JADX INFO: renamed from: c */
    public static b7y m102882c() {
        return C15944c.f75378a;
    }

    /* JADX INFO: renamed from: a */
    public void m102883a(String str, String str2, LogLevel logLevel) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", logLevel.value());
            jSONObject.put("log_type", "object_null");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sFunc", str);
            jSONObject.put("sName", str2);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m102884b(boolean z) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f75351d) {
            try {
                if (this.f75351d.size() >= this.f75350c || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f75351d.size();
                        arrayList = this.f75351d;
                        if (i >= size) {
                            break;
                        }
                        sb.append(arrayList.get(i));
                        i++;
                    }
                    arrayList.clear();
                } else {
                    sb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb == null || sb.length() <= 0) {
            return;
        }
        m102897p("v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), "fixedLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: d */
    public void m102885d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f75347q);
            jSONObject.put("log_type", "json_parse_err");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sJson", str);
            jSONObject.put("sFunc", str2);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m102886e(String str, String str2, int i, String str3, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_level", i2);
            jSONObject.put("log_type", "media_process_err");
            jSONObject.put("cctime", System.currentTimeMillis());
            jSONObject.put("stage", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", str2);
            jSONObject2.put("ec", i);
            jSONObject2.put("msg", str3);
            jSONObject.put(BaseSei.INFO, jSONObject2);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public void m102887f(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f75347q);
            jSONObject.put("log_type", "args_err");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sFunc", str);
            jSONObject.put("sErrArg", str2);
            jSONObject.put("sErrVal", str3);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public void m102888g(Object... objArr) {
        if (this.f75349b == null && this.f75348a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{" + new SimpleDateFormat("HH:mm:ss.SSS", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis())) + Constants.SEPARATOR_COMMA);
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        synchronized (this.f75351d) {
            this.f75351d.add(sb.toString());
        }
        m102884b(true);
    }

    /* JADX INFO: renamed from: h */
    public void m102889h(C15943b c15943b) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f75347q);
            jSONObject.put("log_type", "rtc_mixstream");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("publisher", c15943b.f75373c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", c15943b.f75371a);
            jSONObject2.put("code", c15943b.f75372b);
            jSONObject2.put("channelid", c15943b.f75375e);
            jSONObject2.put(UserId.TYPE, c15943b.f75376f);
            jSONObject2.put("url", c15943b.f75377g);
            jSONObject.put("smoonth_switch", c15943b.f75374d);
            jSONObject.put("mix_err_msg", jSONObject2);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C15942a c15942a;
        if (message.what != 256 || (c15942a = (C15942a) message.obj) == null || c15942a.f75364a == null || c15942a.f75366c == null) {
            return false;
        }
        esx.m122396a("MediaTrackLog", "SEND_LOGS [" + c15942a.f75364a + "], [" + c15942a.f75365b + "] -->");
        if (this.f75353f == null) {
            return false;
        }
        this.f75353f.m95764l(c15942a.f75364a, c15942a.f75365b, c15942a.f75366c, c15942a.f75367d, c15942a.f75368e, c15942a.f75369f);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m102890i(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f75347q);
            jSONObject.put("log_type", "rtc_subtitle_trace");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("publisher", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errcode", i);
            jSONObject2.put("rtcErrCode", i);
            jSONObject2.put("rtcErrMsg", str2);
            jSONObject.put(BaseSei.INFO, jSONObject2);
            m102897p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m102891j(int i) {
        this.f75355h = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m102892k(a320 a320Var) {
        this.f75353f = a320Var;
    }

    /* JADX INFO: renamed from: l */
    public void m102893l(String str) {
        if (this.f75353f != null) {
            this.f75353f.m95758f(str);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m102894m(String str) {
        this.f75363p = str;
        if (this.f75353f != null) {
            this.f75353f.m95761i(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m102895n(String str) {
        if (this.f75353f != null) {
            this.f75353f.m95762j(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m102896o(String str, String str2) {
        this.f75359l = str;
        this.f75360m = str2;
        if (this.f75353f != null) {
            this.f75353f.m95756d(str, str2);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m102897p(String str, String str2) {
        try {
            esx.m122396a("MediaTrackLog", "  [" + str + "] " + str2);
            C15942a c15942a = new C15942a(this.f75354g, str, str2, String.valueOf(this.f75355h), String.valueOf(this.f75356i), this.f75357j);
            synchronized (this.f75358k) {
                try {
                    if (this.f75349b != null && this.f75348a != null) {
                        this.f75349b.obtainMessage(256, c15942a).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }
}
