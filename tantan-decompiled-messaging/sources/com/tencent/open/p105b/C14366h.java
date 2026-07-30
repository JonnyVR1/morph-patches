package com.tencent.open.p105b;

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
import com.tencent.open.p104a.C14355f;
import com.tencent.open.p104a.InterfaceC14356g;
import com.tencent.open.utils.C14389g;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14392j;
import com.tencent.open.utils.C14395m;
import com.tencent.open.utils.C14396n;
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
public class C14366h {

    /* JADX INFO: renamed from: a */
    protected static C14366h f60215a;

    /* JADX INFO: renamed from: e */
    protected HandlerThread f60219e;

    /* JADX INFO: renamed from: f */
    protected Handler f60220f;

    /* JADX INFO: renamed from: b */
    protected Random f60216b = new SecureRandom();

    /* JADX INFO: renamed from: d */
    protected List<Serializable> f60218d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    protected List<Serializable> f60217c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    protected Executor f60221g = C14395m.m84455b();

    /* JADX INFO: renamed from: h */
    protected Executor f60222h = C14395m.m84455b();

    private C14366h() {
        this.f60219e = null;
        if (this.f60219e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f60219e = handlerThread;
            handlerThread.start();
        }
        if (!this.f60219e.isAlive() || this.f60219e.getLooper() == null) {
            return;
        }
        this.f60220f = new Handler(this.f60219e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1000) {
                    C14366h.this.m84284b();
                } else if (i == 1001) {
                    C14366h.this.m84286d();
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public boolean m84283a(String str, String str2) {
        int iM84277a;
        SLog.m84305d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 100;
        if (!str.equals("report_cgi")) {
            if (str.equals("report_via")) {
                iM84277a = C14364f.m84271a(str2);
                if (this.f60216b.nextInt(100) < iM84277a) {
                    i = iM84277a;
                    z = true;
                }
            }
            SLog.m84305d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
            return z;
        }
        try {
            iM84277a = m84277a(Integer.parseInt(str2));
            if (this.f60216b.nextInt(100) < iM84277a) {
                z = true;
            }
        } catch (Exception unused) {
            return false;
        }
        i = iM84277a;
        SLog.m84305d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void m84284b() {
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m84285c() {
        List<Serializable> listM84275b = C14365g.m84275b("report_via");
        if (listM84275b != null) {
            this.f60218d.addAll(listM84275b);
        }
        SLog.m84305d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f60218d.size());
        if (this.f60218d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f60218d) {
            JSONObject jSONObject = new JSONObject();
            C14361c c14361c = (C14361c) serializable;
            for (String str : c14361c.f60211a.keySet()) {
                try {
                    String str2 = c14361c.f60211a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    SLog.m84308e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.m84313v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap map = new HashMap();
            map.put("data", jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            SLog.m84308e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84286d() {
        if (C14396n.m84488b(C14390h.m84404a())) {
            this.f60221g.execute(new Runnable() { // from class: com.tencent.open.b.h.3
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
                    int iMo84224d;
                    long j4;
                    long j5;
                    boolean z;
                    int i2;
                    try {
                        Map<String, String> mapM84285c = C14366h.this.m84285c();
                        if (mapM84285c == null) {
                            return;
                        }
                        SLog.m84305d("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapM84285c.toString());
                        int iM84270a = C14364f.m84270a();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = 0;
                        int errorCodeFromException = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            try {
                                try {
                                    InterfaceC14356g interfaceC14356gM84235b = C14355f.m84227a().m84235b("https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", mapM84285c);
                                    SLog.m84309i("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + interfaceC14356gM84235b.mo84224d());
                                    JSONObject jSONObjectM84495d = C14396n.m84495d(interfaceC14356gM84235b.mo84221a());
                                    long jMo84223c = (long) interfaceC14356gM84235b.mo84223c();
                                    i = i4;
                                    long jMo84222b = interfaceC14356gM84235b.mo84222b();
                                    try {
                                        j = 0;
                                        if (interfaceC14356gM84235b.mo84224d() != 200) {
                                            try {
                                                try {
                                                    j3 = jElapsedRealtime;
                                                    iMo84224d = interfaceC14356gM84235b.mo84224d();
                                                    j5 = jMo84222b;
                                                    j4 = jMo84223c;
                                                } catch (JSONException unused) {
                                                    i3 = i;
                                                    j2 = j;
                                                    errorCodeFromException = -4;
                                                    if (i3 >= iM84270a) {
                                                        j3 = jElapsedRealtime;
                                                        iMo84224d = errorCodeFromException;
                                                        j4 = j2;
                                                        j5 = j;
                                                    }
                                                }
                                            } catch (SocketTimeoutException unused2) {
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                                errorCodeFromException = -8;
                                                i3 = i;
                                                j2 = j;
                                                if (i3 >= iM84270a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo84224d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            } catch (IOException e) {
                                                e = e;
                                                errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                                i3 = i;
                                                j2 = j;
                                                if (i3 >= iM84270a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo84224d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            } catch (Exception unused3) {
                                                errorCodeFromException = -6;
                                                i3 = iM84270a;
                                                j2 = j;
                                                if (i3 >= iM84270a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo84224d = errorCodeFromException;
                                                    j4 = j2;
                                                    j5 = j;
                                                }
                                            }
                                            z = false;
                                        } else {
                                            try {
                                                i2 = jSONObjectM84495d.getInt("ret");
                                            } catch (JSONException unused4) {
                                                i2 = -4;
                                            }
                                            if (i2 == 0 || jMo84222b != 0) {
                                                j3 = jElapsedRealtime;
                                                iMo84224d = errorCodeFromException;
                                                j5 = jMo84222b;
                                                j4 = jMo84223c;
                                                z = true;
                                            } else {
                                                j = jMo84222b;
                                                j2 = jMo84223c;
                                                i3 = i;
                                                if (i3 >= iM84270a) {
                                                    j3 = jElapsedRealtime;
                                                    iMo84224d = errorCodeFromException;
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
                                        if (i3 >= iM84270a) {
                                            j3 = jElapsedRealtime;
                                            iMo84224d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14366h.this.m84280a("mapp_apptrace_sdk", j3, j4, j5, iMo84224d, null, false);
                                            int i5 = iMo84224d;
                                            if (z) {
                                                C14365g.m84273a("report_via");
                                            } else {
                                                C14365g.m84274a("report_via", C14366h.this.f60218d);
                                            }
                                            C14366h.this.f60218d.clear();
                                            SLog.m84309i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i5);
                                            return;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        j = 0;
                                        errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                        i3 = i;
                                        j2 = j;
                                        if (i3 >= iM84270a) {
                                            j3 = jElapsedRealtime;
                                            iMo84224d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14366h.this.m84280a("mapp_apptrace_sdk", j3, j4, j5, iMo84224d, null, false);
                                            int i6 = iMo84224d;
                                            if (z) {
                                                C14365g.m84273a("report_via");
                                            } else {
                                                C14365g.m84274a("report_via", C14366h.this.f60218d);
                                            }
                                            C14366h.this.f60218d.clear();
                                            SLog.m84309i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i6);
                                            return;
                                        }
                                    } catch (JSONException unused6) {
                                        j = 0;
                                        i3 = i;
                                        j2 = j;
                                        errorCodeFromException = -4;
                                        if (i3 >= iM84270a) {
                                            j3 = jElapsedRealtime;
                                            iMo84224d = errorCodeFromException;
                                            j4 = j2;
                                            j5 = j;
                                            z = false;
                                            C14366h.this.m84280a("mapp_apptrace_sdk", j3, j4, j5, iMo84224d, null, false);
                                            int i7 = iMo84224d;
                                            if (z) {
                                                C14365g.m84273a("report_via");
                                            } else {
                                                C14365g.m84274a("report_via", C14366h.this.f60218d);
                                            }
                                            C14366h.this.f60218d.clear();
                                            SLog.m84309i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i7);
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
                            C14366h.this.m84280a("mapp_apptrace_sdk", j3, j4, j5, iMo84224d, null, false);
                            int i8 = iMo84224d;
                            if (z) {
                                C14365g.m84273a("report_via");
                            } else {
                                C14365g.m84274a("report_via", C14366h.this.f60218d);
                            }
                            C14366h.this.f60218d.clear();
                            SLog.m84309i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + i8);
                            return;
                        }
                    } catch (Throwable th) {
                        SLog.m84308e("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84278a(final Bundle bundle, String str, final boolean z) {
        if (bundle == null) {
            return;
        }
        SLog.m84313v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (m84283a("report_via", str) || z) {
            this.f60221g.execute(new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", Constants.DEFAULT_UIN);
                        bundle2.putString("platform", "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("position", "");
                        bundle2.putString("network", C14359a.m84246a(C14390h.m84404a()));
                        bundle2.putString(IjkMediaMeta.IJKM_KEY_LANGUAGE, C14362d.m84263a());
                        bundle2.putString("resolution", C14362d.m84264a(C14390h.m84404a()));
                        bundle2.putString("apn", C14359a.m84247b(C14390h.m84404a()));
                        bundle2.putString(Constants.PARAM_MN, C14389g.m84397a().m84402c());
                        bundle2.putString("timezone", TimeZone.getDefault().getID());
                        bundle2.putString(Constants.PARAM_SDK_VER, Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", C14396n.m84494d(C14390h.m84404a(), Constants.PACKAGE_QZONE));
                        bundle2.putString(Constants.PARAM_QQ_VER, C14396n.m84491c(C14390h.m84404a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", C14396n.m84497e(C14390h.m84404a(), C14390h.m84407b()));
                        bundle2.putString("packagename", C14390h.m84407b());
                        bundle2.putString(Constants.PARAM_APP_VER, C14396n.m84494d(C14390h.m84404a(), C14390h.m84407b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        C14366h.this.f60218d.add(new C14361c(bundle2));
                        int size = C14366h.this.f60218d.size();
                        int iM84424a = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Agent_ReportTimeInterval");
                        if (iM84424a == 0) {
                            iM84424a = 10000;
                        }
                        if (!C14366h.this.m84282a("report_via", size) && !z) {
                            if (C14366h.this.f60220f.hasMessages(1001)) {
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1001;
                            C14366h.this.f60220f.sendMessageDelayed(messageObtain, iM84424a);
                            return;
                        }
                        C14366h.this.m84286d();
                        C14366h.this.f60220f.removeMessages(1001);
                    } catch (Exception e) {
                        SLog.m84308e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84279a(String str, long j, long j2, long j3, int i) {
        m84280a(str, j, j2, j3, i, "", false);
    }

    /* JADX INFO: renamed from: a */
    public void m84280a(String str, long j, long j2, long j3, int i, String str2, boolean z) {
        SLog.m84313v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14366h m84276a() {
        try {
            if (f60215a == null) {
                f60215a = new C14366h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60215a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c A[PHI: r3
      0x001c: PHI (r3v11 int) = (r3v7 int), (r3v14 int) binds: [B:11:0x0034, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public boolean m84282a(String str, int i) {
        int iM84424a;
        int i2 = 5;
        if (str.equals("report_cgi")) {
            iM84424a = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Common_CGIReportMaxcount");
            if (iM84424a != 0) {
                i2 = iM84424a;
            }
        } else if (str.equals("report_via")) {
            iM84424a = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Agent_ReportBatchCount");
            if (iM84424a != 0) {
                i2 = iM84424a;
            }
        } else {
            i2 = 0;
        }
        SLog.m84305d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + i2);
        return i >= i2;
    }

    /* JADX INFO: renamed from: a */
    public int m84277a(int i) {
        if (i == 0) {
            int iM84424a = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Common_CGIReportFrequencySuccess");
            if (iM84424a == 0) {
                return 10;
            }
            return iM84424a;
        }
        int iM84424a2 = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Common_CGIReportFrequencyFailed");
        if (iM84424a2 == 0) {
            return 100;
        }
        return iM84424a2;
    }

    /* JADX INFO: renamed from: a */
    public void m84281a(final String str, final Map<String, String> map) {
        if (C14396n.m84488b(C14390h.m84404a())) {
            C14395m.m84456b(new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int iM84270a = C14364f.m84270a();
                        if (iM84270a == 0) {
                            iM84270a = 3;
                        }
                        SLog.m84305d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iM84270a);
                        int i = 0;
                        do {
                            i++;
                            try {
                                try {
                                    SLog.m84309i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + C14355f.m84227a().m84231a(str, map).mo84224d());
                                    break;
                                } catch (SocketTimeoutException e) {
                                    SLog.m84308e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                                }
                            } catch (Exception e2) {
                                SLog.m84308e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e2);
                                break;
                            }
                        } while (i < iM84270a);
                    } catch (Exception e3) {
                        SLog.m84308e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e3);
                    }
                }
            });
        }
    }
}
