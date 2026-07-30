package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p104a.C14355f;
import com.tencent.open.p104a.InterfaceC14356g;
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
public class C14392j {

    /* JADX INFO: renamed from: a */
    private static Map<String, C14392j> f60333a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b */
    private static String f60334b = null;

    /* JADX INFO: renamed from: c */
    private Context f60335c;

    /* JADX INFO: renamed from: d */
    private String f60336d;

    /* JADX INFO: renamed from: e */
    private JSONObject f60337e = null;

    /* JADX INFO: renamed from: f */
    private long f60338f = 0;

    /* JADX INFO: renamed from: g */
    private int f60339g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f60340h = true;

    private C14392j(Context context, String str) {
        this.f60335c = null;
        this.f60336d = null;
        this.f60335c = context.getApplicationContext();
        this.f60336d = str;
        m84416a();
        m84420b();
    }

    /* JADX INFO: renamed from: a */
    private void m84418a(String str, String str2) {
        try {
            if (this.f60336d != null) {
                str = str + "." + this.f60336d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f60335c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m84420b() {
        if (this.f60339g != 0) {
            m84423d("update thread is running, return");
            return;
        }
        this.f60339g = 1;
        final HashMap map = new HashMap();
        map.put("appid", this.f60336d);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", C14389g.m84397a().m84402c());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", Constants.SDK_VERSION);
        map.put("sdkp", "a");
        C14395m.m84454a(new Runnable() { // from class: com.tencent.open.utils.j.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InterfaceC14356g interfaceC14356gM84231a = C14355f.m84227a().m84231a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", map);
                    String strMo84221a = interfaceC14356gM84231a.mo84221a();
                    SLog.m84309i("openSDK_LOG.OpenConfig", "update: get config statusCode " + interfaceC14356gM84231a.mo84224d());
                    C14392j.this.m84419a(C14396n.m84495d(strMo84221a));
                } catch (Exception e) {
                    SLog.m84308e("openSDK_LOG.OpenConfig", "get config error ", e);
                }
                C14392j.this.f60339g = 0;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private String m84421c(String str) {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String str2;
        String string = "";
        try {
            try {
                if (this.f60336d != null) {
                    str2 = str + "." + this.f60336d;
                } else {
                    str2 = str;
                }
                inputStreamOpen = this.f60335c.openFileInput(str2);
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
            inputStreamOpen = this.f60335c.getAssets().open(str);
        }
        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8")));
        stringBuffer = new StringBuffer();
        string = stringBuffer.toString();
        inputStreamOpen.close();
        bufferedReader.close();
        return string;
    }

    /* JADX INFO: renamed from: d */
    private void m84423d(String str) {
        if (this.f60340h) {
            SLog.m84313v("openSDK_LOG.OpenConfig", str + "; appid: " + this.f60336d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14392j m84415a(Context context, String str) {
        C14392j c14392j;
        synchronized (f60333a) {
            try {
                SLog.m84313v("openSDK_LOG.OpenConfig", "getInstance begin");
                if (str != null) {
                    f60334b = str;
                }
                if (str == null && (str = f60334b) == null) {
                    str = "0";
                }
                c14392j = f60333a.get(str);
                if (c14392j == null) {
                    c14392j = new C14392j(context, str);
                    f60333a.put(str, c14392j);
                }
                SLog.m84313v("openSDK_LOG.OpenConfig", "getInstance end");
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14392j;
    }

    /* JADX INFO: renamed from: a */
    private void m84416a() {
        try {
            this.f60337e = new JSONObject(m84421c("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f60337e = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84419a(JSONObject jSONObject) {
        m84423d("cgi back, do update");
        this.f60337e = jSONObject;
        m84418a("com.tencent.open.config.json", jSONObject.toString());
        this.f60338f = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public boolean m84425b(String str) {
        m84423d("get " + str);
        m84422c();
        Object objOpt = this.f60337e.opt(str);
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
    public int m84424a(String str) {
        m84423d("get " + str);
        m84422c();
        return this.f60337e.optInt(str);
    }

    /* JADX INFO: renamed from: c */
    private void m84422c() {
        int iOptInt = this.f60337e.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f60338f >= iOptInt * 3600000) {
            m84420b();
        }
    }
}
