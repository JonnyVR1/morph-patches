package com.tencent.open.p110b;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p109a.C14518f;
import com.tencent.open.p109a.InterfaceC14519g;
import com.tencent.open.utils.C14552g;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;
import com.tencent.open.utils.C14558m;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.HttpUtils;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14529h {

    /* JADX INFO: renamed from: a */
    protected static C14529h f61063a;

    /* JADX INFO: renamed from: e */
    protected HandlerThread f61067e;

    /* JADX INFO: renamed from: f */
    protected Handler f61068f;

    /* JADX INFO: renamed from: b */
    protected Random f61064b = new SecureRandom();

    /* JADX INFO: renamed from: d */
    protected List<Serializable> f61066d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    protected List<Serializable> f61065c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    protected Executor f61069g = C14558m.m85638b();

    /* JADX INFO: renamed from: h */
    protected Executor f61070h = C14558m.m85638b();

    private C14529h() {
        this.f61067e = null;
        if (this.f61067e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f61067e = handlerThread;
            handlerThread.start();
        }
        if (!this.f61067e.isAlive() || this.f61067e.getLooper() == null) {
            return;
        }
        this.f61068f = new Handler(this.f61067e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1000) {
                    C14529h.this.m85467b();
                } else if (i == 1001) {
                    C14529h.this.m85469d();
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public boolean m85466a(String str, String str2) {
        int iM85460a;
        SLog.m85488d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 100;
        if (!str.equals("report_cgi")) {
            if (str.equals("report_via")) {
                iM85460a = C14527f.m85454a(str2);
                if (this.f61064b.nextInt(100) < iM85460a) {
                    i = iM85460a;
                    z = true;
                }
            }
            SLog.m85488d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
            return z;
        }
        try {
            iM85460a = m85460a(Integer.parseInt(str2));
            if (this.f61064b.nextInt(100) < iM85460a) {
                z = true;
            }
        } catch (Exception unused) {
            return false;
        }
        i = iM85460a;
        SLog.m85488d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void m85467b() {
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m85468c() {
        List<Serializable> listM85458b = C14528g.m85458b("report_via");
        if (listM85458b != null) {
            this.f61066d.addAll(listM85458b);
        }
        SLog.m85488d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f61066d.size());
        if (this.f61066d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f61066d) {
            JSONObject jSONObject = new JSONObject();
            C14524c c14524c = (C14524c) serializable;
            for (String str : c14524c.f61059a.keySet()) {
                try {
                    String str2 = c14524c.f61059a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    SLog.m85491e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.m85496v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap map = new HashMap();
            map.put("data", jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            SLog.m85491e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85469d() {
        if (C14559n.m85671b(C14553h.m85587a())) {
            this.f61069g.execute(new Runnable() { // from class: com.tencent.open.b.h.3
                /* JADX WARN: Code duplicated, block: B:50:0x00f0 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #12 {all -> 0x007f, blocks: (B:3:0x0006, B:6:0x0010, B:9:0x0030, B:11:0x0066, B:14:0x0070, B:47:0x00dd, B:50:0x00f0, B:52:0x00fb, B:51:0x00f4, B:21:0x0084, B:41:0x00bf, B:44:0x00cc), top: B:67:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x007f, TryCatch #12 {all -> 0x007f, blocks: (B:3:0x0006, B:6:0x0010, B:9:0x0030, B:11:0x0066, B:14:0x0070, B:47:0x00dd, B:50:0x00f0, B:52:0x00fb, B:51:0x00f4, B:21:0x0084, B:41:0x00bf, B:44:0x00cc), top: B:67:0x0006 }] */
                /* JADX WARN: Code duplicated, block: B:74:0x00d4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:8:0x002d->B:78:?, LOOP_END, SYNTHETIC] */
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    long j;
                    long j2;
                    long j3;
                    int iMo85407d;
                    long j4;
                    long j5;
                    boolean z;
                    int i2;
                    try {
                        Map<String, String> mapM85468c = C14529h.this.m85468c();
                        if (mapM85468c == null) {
                            return;
                        }
                        SLog.m85488d("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM85468c.toString());
                        int iM85453a = C14527f.m85453a();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = 0;
                        int errorCodeFromException = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            try {
                                try {
                                    InterfaceC14519g interfaceC14519gM85418b = C14518f.m85410a().m85418b("https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", mapM85468c);
                                    SLog.m85492i("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC14519gM85418b.mo85407d());
                                    JSONObject jSONObjectM85678d = C14559n.m85678d(interfaceC14519gM85418b.mo85404a());
                                    long jMo85406c = (long) interfaceC14519gM85418b.mo85406c();
                                    i = i4;
                                    long jMo85405b = interfaceC14519gM85418b.mo85405b();
                                    try {
                                        j = 0;
                                        if (interfaceC14519gM85418b.mo85407d() != 200) {
                                            try {
                                                try {
                                                    j3 = jElapsedRealtime;
                                                    iMo85407d = interfaceC14519gM85418b.mo85407d();
                                                    j5 = jMo85405b;
                                                    j4 = jMo85406c;
                                                } catch (JSONException unused) {
                                                    i3 = i;
                                                    j2 = j;
                                                    errorCodeFromException = -4;
                                                    if (i3 >= iM85453a) {
                                                        j3 = jElapsedRealtime;
                                                        iMo85407d = errorCodeFromException;
                                                        j4 = j2;
                                                        j5 = j;
                                                    }
                                                }
                                            } catch (SocketTimeoutException unused2) {
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                                errorCodeFromException = -8;
                                                i3 = i;
                                                j2 = j;
                                                if (i3 >= iM85453a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo85407d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            } catch (IOException e) {
                                                e = e;
                                                errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                                i3 = i;
                                                j2 = j;
                                                if (i3 >= iM85453a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo85407d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            } catch (Exception unused3) {
                                                errorCodeFromException = -6;
                                                i3 = iM85453a;
                                                j2 = j;
                                                if (i3 >= iM85453a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo85407d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            }
                                            z = false;
                                        } else {
                                            try {
                                                i2 = jSONObjectM85678d.getInt("ret");
                                            } catch (JSONException unused4) {
                                                i2 = -4;
                                            }
                                            if (i2 == 0 || jMo85405b != 0) {
                                                j3 = jElapsedRealtime;
                                                iMo85407d = errorCodeFromException;
                                                j5 = jMo85405b;
                                                j4 = jMo85406c;
                                                z = true;
                                            } else {
                                                j = jMo85405b;
                                                j2 = jMo85406c;
                                                i3 = i;
                                                if (i3 >= iM85453a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo85407d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                    z = false;
                                                }
                                            }
                                        }
                                    } catch (SocketTimeoutException unused5) {
                                        j = 0;
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        errorCodeFromException = -8;
                                        i3 = i;
                                        j2 = j;
                                        if (i3 >= iM85453a) {
                                            j3 = jElapsedRealtime;
                                            iMo85407d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14529h.this.m85463a("mapp_apptrace_sdk", j3, j4, j5, iMo85407d, null, false);
                                            int i5 = iMo85407d;
                                            if (z) {
                                                C14528g.m85456a("report_via");
                                            } else {
                                                C14528g.m85457a("report_via", C14529h.this.f61066d);
                                            }
                                            C14529h.this.f61066d.clear();
                                            SLog.m85492i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
                                            return;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        j = 0;
                                        errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                        i3 = i;
                                        j2 = j;
                                        if (i3 >= iM85453a) {
                                            j3 = jElapsedRealtime;
                                            iMo85407d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14529h.this.m85463a("mapp_apptrace_sdk", j3, j4, j5, iMo85407d, null, false);
                                            int i6 = iMo85407d;
                                            if (z) {
                                                C14528g.m85456a("report_via");
                                            } else {
                                                C14528g.m85457a("report_via", C14529h.this.f61066d);
                                            }
                                            C14529h.this.f61066d.clear();
                                            SLog.m85492i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
                                            return;
                                        }
                                    } catch (JSONException unused6) {
                                        j = 0;
                                        i3 = i;
                                        j2 = j;
                                        errorCodeFromException = -4;
                                        if (i3 >= iM85453a) {
                                            j3 = jElapsedRealtime;
                                            iMo85407d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14529h.this.m85463a("mapp_apptrace_sdk", j3, j4, j5, iMo85407d, null, false);
                                            int i7 = iMo85407d;
                                            if (z) {
                                                C14528g.m85456a("report_via");
                                            } else {
                                                C14528g.m85457a("report_via", C14529h.this.f61066d);
                                            }
                                            C14529h.this.f61066d.clear();
                                            SLog.m85492i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i7);
                                            return;
                                        }
                                    }
                                } catch (Exception unused7) {
                                    j = 0;
                                }
                            } catch (SocketTimeoutException unused8) {
                                i = i4;
                            } catch (IOException e3) {
                                e = e3;
                                i = i4;
                            } catch (JSONException unused9) {
                                i = i4;
                            }
                            C14529h.this.m85463a("mapp_apptrace_sdk", j3, j4, j5, iMo85407d, null, false);
                            int i8 = iMo85407d;
                            if (z) {
                                C14528g.m85456a("report_via");
                            } else {
                                C14528g.m85457a("report_via", C14529h.this.f61066d);
                            }
                            C14529h.this.f61066d.clear();
                            SLog.m85492i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i8);
                            return;
                        }
                    } catch (Throwable th) {
                        SLog.m85491e("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85461a(final Bundle bundle, String str, final boolean z) {
        if (bundle == null) {
            return;
        }
        SLog.m85496v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (m85466a("report_via", str) || z) {
            this.f61069g.execute(new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", Constants.DEFAULT_UIN);
                        bundle2.putString("platform", "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("position", "");
                        bundle2.putString("network", C14522a.m85429a(C14553h.m85587a()));
                        bundle2.putString(IjkMediaMeta.IJKM_KEY_LANGUAGE, C14525d.m85446a());
                        bundle2.putString("resolution", C14525d.m85447a(C14553h.m85587a()));
                        bundle2.putString("apn", C14522a.m85430b(C14553h.m85587a()));
                        bundle2.putString(Constants.PARAM_MN, C14552g.m85580a().m85585c());
                        bundle2.putString("timezone", TimeZone.getDefault().getID());
                        bundle2.putString(Constants.PARAM_SDK_VER, Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", C14559n.m85677d(C14553h.m85587a(), Constants.PACKAGE_QZONE));
                        bundle2.putString(Constants.PARAM_QQ_VER, C14559n.m85674c(C14553h.m85587a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", C14559n.m85680e(C14553h.m85587a(), C14553h.m85590b()));
                        bundle2.putString("packagename", C14553h.m85590b());
                        bundle2.putString(Constants.PARAM_APP_VER, C14559n.m85677d(C14553h.m85587a(), C14553h.m85590b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        C14529h.this.f61066d.add(new C14524c(bundle2));
                        int size = C14529h.this.f61066d.size();
                        int iM85607a = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Agent_ReportTimeInterval");
                        if (iM85607a == 0) {
                            iM85607a = 10000;
                        }
                        if (!C14529h.this.m85465a("report_via", size) && !z) {
                            if (C14529h.this.f61068f.hasMessages(1001)) {
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1001;
                            C14529h.this.f61068f.sendMessageDelayed(messageObtain, iM85607a);
                            return;
                        }
                        C14529h.this.m85469d();
                        C14529h.this.f61068f.removeMessages(1001);
                    } catch (Exception e) {
                        SLog.m85491e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85462a(String str, long j, long j2, long j3, int i) {
        m85463a(str, j, j2, j3, i, "", false);
    }

    /* JADX INFO: renamed from: a */
    public void m85463a(String str, long j, long j2, long j3, int i, String str2, boolean z) {
        SLog.m85496v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14529h m85459a() {
        try {
            if (f61063a == null) {
                f61063a = new C14529h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61063a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c A[PHI: r3
      0x001c: PHI (r3v11 int) = (r3v7 int), (r3v14 int) binds: [B:11:0x0034, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m85465a(String str, int i) {
        int iM85607a;
        int i2 = 5;
        if (str.equals("report_cgi")) {
            iM85607a = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Common_CGIReportMaxcount");
            if (iM85607a != 0) {
                i2 = iM85607a;
            }
        } else if (str.equals("report_via")) {
            iM85607a = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Agent_ReportBatchCount");
            if (iM85607a != 0) {
                i2 = iM85607a;
            }
        } else {
            i2 = 0;
        }
        SLog.m85488d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + i2);
        return i >= i2;
    }

    /* JADX INFO: renamed from: a */
    public int m85460a(int i) {
        if (i == 0) {
            int iM85607a = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Common_CGIReportFrequencySuccess");
            if (iM85607a == 0) {
                return 10;
            }
            return iM85607a;
        }
        int iM85607a2 = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Common_CGIReportFrequencyFailed");
        if (iM85607a2 == 0) {
            return 100;
        }
        return iM85607a2;
    }

    /* JADX INFO: renamed from: a */
    public void m85464a(final String str, final Map<String, String> map) {
        if (C14559n.m85671b(C14553h.m85587a())) {
            C14558m.m85639b(new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int iM85453a = C14527f.m85453a();
                        if (iM85453a == 0) {
                            iM85453a = 3;
                        }
                        SLog.m85488d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iM85453a);
                        int i = 0;
                        do {
                            i++;
                            try {
                                try {
                                    SLog.m85492i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + C14518f.m85410a().m85414a(str, map).mo85407d());
                                    break;
                                } catch (SocketTimeoutException e) {
                                    SLog.m85491e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                                }
                            } catch (Exception e2) {
                                SLog.m85491e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e2);
                                break;
                            }
                        } while (i < iM85453a);
                    } catch (Exception e3) {
                        SLog.m85491e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e3);
                    }
                }
            });
        }
    }
}
