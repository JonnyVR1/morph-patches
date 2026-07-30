package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.UserId;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class eyx implements Handler.Callback {

    /* JADX INFO: renamed from: q */
    public static int f93800q = 1;

    /* JADX INFO: renamed from: a */
    private volatile HandlerThread f93801a;

    /* JADX INFO: renamed from: b */
    private volatile Handler f93802b;

    /* JADX INFO: renamed from: f */
    private volatile su10 f93806f;

    /* JADX INFO: renamed from: m */
    private String f93813m;

    /* JADX INFO: renamed from: c */
    private int f93803c = 6;

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> f93804d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private final ArrayList<String> f93805e = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private String f93807g = "nonConf";

    /* JADX INFO: renamed from: h */
    private int f93808h = 111;

    /* JADX INFO: renamed from: i */
    private int f93809i = 0;

    /* JADX INFO: renamed from: j */
    private String f93810j = "";

    /* JADX INFO: renamed from: k */
    private Object f93811k = new Object();

    /* JADX INFO: renamed from: l */
    private String f93812l = "mlive";

    /* JADX INFO: renamed from: n */
    private String f93814n = "";

    /* JADX INFO: renamed from: o */
    private String f93815o = "";

    /* JADX INFO: renamed from: p */
    private String f93816p = "";

    /* JADX INFO: renamed from: l.eyx$a */
    public class C16724a {

        /* JADX INFO: renamed from: a */
        String f93817a;

        /* JADX INFO: renamed from: b */
        String f93818b;

        /* JADX INFO: renamed from: c */
        String f93819c;

        /* JADX INFO: renamed from: d */
        String f93820d;

        /* JADX INFO: renamed from: e */
        String f93821e;

        /* JADX INFO: renamed from: f */
        String f93822f;

        public C16724a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f93817a = str;
            this.f93818b = str2;
            this.f93819c = str3;
            this.f93820d = str4;
            this.f93821e = str5;
            this.f93822f = str6;
        }
    }

    /* JADX INFO: renamed from: l.eyx$b */
    public static class C16725b {

        /* JADX INFO: renamed from: a */
        public int f93824a;

        /* JADX INFO: renamed from: b */
        public int f93825b;

        /* JADX INFO: renamed from: c */
        public String f93826c;

        /* JADX INFO: renamed from: d */
        public String f93827d;

        /* JADX INFO: renamed from: e */
        public String f93828e;

        /* JADX INFO: renamed from: f */
        public int f93829f;

        /* JADX INFO: renamed from: g */
        public String f93830g;

        public C16725b(int i, int i2, String str, String str2, String str3, int i3, String str4) {
            this.f93824a = i;
            this.f93825b = i2;
            this.f93826c = str;
            this.f93827d = str2;
            this.f93828e = str3;
            this.f93829f = i3;
            this.f93830g = str4;
        }
    }

    /* JADX INFO: renamed from: l.eyx$c */
    public static class C16726c {

        /* JADX INFO: renamed from: a */
        private static eyx f93831a = new eyx();
    }

    public eyx() {
        this.f93813m = "ef75b8eb629d73f32fd98976ccdb667b";
        if (this.f93801a == null) {
            this.f93801a = new HandlerThread("MediaTraceLog");
            this.f93801a.start();
            this.f93802b = new Handler(this.f93801a.getLooper(), this);
        }
        String str = this.f93814n;
        String str2 = this.f93815o;
        dix.m111940d().m111947g(this.f93812l);
        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f93812l);
        if (c16387dM111948h != null) {
            this.f93813m = c16387dM111948h.f86449b;
            str = c16387dM111948h.f86450c;
        }
        String str3 = str;
        if (this.f93806f == null) {
            m118812k(new su10(this.f93812l, this.f93813m, str3, str2, String.valueOf(0), String.valueOf(0), this.f93816p, "", String.valueOf(hashCode()), ""));
        }
    }

    /* JADX INFO: renamed from: c */
    public static eyx m118802c() {
        return C16726c.f93831a;
    }

    /* JADX INFO: renamed from: a */
    public void m118803a(String str, String str2, LogLevel logLevel) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", logLevel.value());
            jSONObject.put("log_type", "object_null");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sFunc", str);
            jSONObject.put("sName", str2);
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m118804b(boolean z) {
        StringBuilder sb;
        ArrayList<String> arrayList;
        synchronized (this.f93804d) {
            try {
                if (this.f93804d.size() >= this.f93803c || z) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        int size = this.f93804d.size();
                        arrayList = this.f93804d;
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
        m118817p("v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), "fixedLog", "[" + sb.toString().replace(Constants.AES_SUFFIX, ")") + Constants.AES_SUFFIX));
    }

    /* JADX INFO: renamed from: d */
    public void m118805d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f93800q);
            jSONObject.put("log_type", "json_parse_err");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sJson", str);
            jSONObject.put("sFunc", str2);
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m118806e(String str, String str2, int i, String str3, int i2) {
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
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public void m118807f(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f93800q);
            jSONObject.put("log_type", "args_err");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("sFunc", str);
            jSONObject.put("sErrArg", str2);
            jSONObject.put("sErrVal", str3);
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public void m118808g(Object... objArr) {
        if (this.f93802b == null && this.f93801a == null) {
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
        synchronized (this.f93804d) {
            this.f93804d.add(sb.toString());
        }
        m118804b(true);
    }

    /* JADX INFO: renamed from: h */
    public void m118809h(C16725b c16725b) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f93800q);
            jSONObject.put("log_type", "rtc_mixstream");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("publisher", c16725b.f93826c);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", c16725b.f93824a);
            jSONObject2.put("code", c16725b.f93825b);
            jSONObject2.put("channelid", c16725b.f93828e);
            jSONObject2.put(UserId.TYPE, c16725b.f93829f);
            jSONObject2.put("url", c16725b.f93830g);
            jSONObject.put("smoonth_switch", c16725b.f93827d);
            jSONObject.put("mix_err_msg", jSONObject2);
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C16724a c16724a;
        if (message.what != 256 || (c16724a = (C16724a) message.obj) == null || c16724a.f93817a == null || c16724a.f93819c == null) {
            return false;
        }
        hjx.m131418a("MediaTrackLog", "SEND_LOGS [" + c16724a.f93817a + "], [" + c16724a.f93818b + "] -->");
        if (this.f93806f == null) {
            return false;
        }
        this.f93806f.m185990l(c16724a.f93817a, c16724a.f93818b, c16724a.f93819c, c16724a.f93820d, c16724a.f93821e, c16724a.f93822f);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m118810i(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("log_level", f93800q);
            jSONObject.put("log_type", "rtc_subtitle_trace");
            jSONObject.put("cctime", jCurrentTimeMillis);
            jSONObject.put("publisher", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errcode", i);
            jSONObject2.put("rtcErrCode", i);
            jSONObject2.put("rtcErrMsg", str2);
            jSONObject.put(BaseSei.INFO, jSONObject2);
            m118817p("v2.mediaTraceLog", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m118811j(int i) {
        this.f93808h = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m118812k(su10 su10Var) {
        this.f93806f = su10Var;
    }

    /* JADX INFO: renamed from: l */
    public void m118813l(String str) {
        if (this.f93806f != null) {
            this.f93806f.m185984f(str);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m118814m(String str) {
        this.f93816p = str;
        if (this.f93806f != null) {
            this.f93806f.m185987i(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m118815n(String str) {
        if (this.f93806f != null) {
            this.f93806f.m185988j(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m118816o(String str, String str2) {
        this.f93812l = str;
        this.f93813m = str2;
        if (this.f93806f != null) {
            this.f93806f.m185982d(str, str2);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m118817p(String str, String str2) {
        try {
            hjx.m131418a("MediaTrackLog", "  [" + str + "] " + str2);
            C16724a c16724a = new C16724a(this.f93807g, str, str2, String.valueOf(this.f93808h), String.valueOf(this.f93809i), this.f93810j);
            synchronized (this.f93811k) {
                try {
                    if (this.f93802b != null && this.f93801a != null) {
                        this.f93802b.obtainMessage(256, c16724a).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }
}
