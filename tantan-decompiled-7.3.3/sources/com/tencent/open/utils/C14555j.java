package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p109a.C14518f;
import com.tencent.open.p109a.InterfaceC14519g;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.utils.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14555j {

    /* JADX INFO: renamed from: a */
    private static Map<String, C14555j> f61181a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    private static String f61182b = null;

    /* JADX INFO: renamed from: c */
    private Context f61183c;

    /* JADX INFO: renamed from: d */
    private String f61184d;

    /* JADX INFO: renamed from: e */
    private JSONObject f61185e = null;

    /* JADX INFO: renamed from: f */
    private long f61186f = 0;

    /* JADX INFO: renamed from: g */
    private int f61187g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f61188h = true;

    private C14555j(Context context, String str) {
        this.f61183c = null;
        this.f61184d = null;
        this.f61183c = context.getApplicationContext();
        this.f61184d = str;
        m85599a();
        m85603b();
    }

    /* JADX INFO: renamed from: a */
    private void m85601a(String str, String str2) {
        try {
            if (this.f61184d != null) {
                str = str + "." + this.f61184d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f61183c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m85603b() {
        if (this.f61187g != 0) {
            m85606d("update thread is running, return");
            return;
        }
        this.f61187g = 1;
        final HashMap map = new HashMap();
        map.put("appid", this.f61184d);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C14552g.m85580a().m85585c());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", Constants.SDK_VERSION);
        map.put("sdkp", "a");
        C14558m.m85637a(new Runnable() { // from class: com.tencent.open.utils.j.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InterfaceC14519g interfaceC14519gM85414a = C14518f.m85410a().m85414a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", map);
                    String strMo85404a = interfaceC14519gM85414a.mo85404a();
                    SLog.m85492i("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC14519gM85414a.mo85407d());
                    C14555j.this.m85602a(C14559n.m85678d(strMo85404a));
                } catch (Exception e) {
                    SLog.m85491e("openSDK_LOG.OpenConfig", "get config error ", e);
                }
                C14555j.this.f61187g = 0;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private String m85604c(String str) {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String str2;
        String string = "";
        try {
            try {
                if (this.f61184d != null) {
                    str2 = str + "." + this.f61184d;
                } else {
                    str2 = str;
                }
                inputStreamOpen = this.f61183c.openFileInput(str2);
                while (true) {
                    try {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                            } catch (IOException e) {
                                e.printStackTrace();
                                inputStreamOpen.close();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamOpen.close();
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return "";
            }
        } catch (FileNotFoundException unused) {
            inputStreamOpen = this.f61183c.getAssets().open(str);
        }
        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8")));
        stringBuffer = new StringBuffer();
        string = stringBuffer.toString();
        inputStreamOpen.close();
        bufferedReader.close();
        return string;
    }

    /* JADX INFO: renamed from: d */
    private void m85606d(String str) {
        if (this.f61188h) {
            SLog.m85496v("openSDK_LOG.OpenConfig", str + "; appid: " + this.f61184d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14555j m85598a(Context context, String str) {
        C14555j c14555j;
        synchronized (f61181a) {
            try {
                SLog.m85496v("openSDK_LOG.OpenConfig", "getInstance begin");
                if (str != null) {
                    f61182b = str;
                }
                if (str == null && (str = f61182b) == null) {
                    str = "0";
                }
                c14555j = f61181a.get(str);
                if (c14555j == null) {
                    c14555j = new C14555j(context, str);
                    f61181a.put(str, c14555j);
                }
                SLog.m85496v("openSDK_LOG.OpenConfig", "getInstance end");
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14555j;
    }

    /* JADX INFO: renamed from: a */
    private void m85599a() {
        try {
            this.f61185e = new JSONObject(m85604c("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f61185e = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85602a(JSONObject jSONObject) {
        m85606d("cgi back, do update");
        this.f61185e = jSONObject;
        m85601a("com.tencent.open.config.json", jSONObject.toString());
        this.f61186f = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public boolean m85608b(String str) {
        m85606d("get " + str);
        m85605c();
        Object objOpt = this.f61185e.opt(str);
        if (objOpt == null) {
            return false;
        }
        if (objOpt instanceof Integer) {
            return !objOpt.equals(0);
        }
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public int m85607a(String str) {
        m85606d("get " + str);
        m85605c();
        return this.f61185e.optInt(str);
    }

    /* JADX INFO: renamed from: c */
    private void m85605c() {
        int iOptInt = this.f61185e.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f61186f >= iOptInt * 3600000) {
            m85603b();
        }
    }
}
