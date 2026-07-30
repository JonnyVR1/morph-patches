package com.tencent.could.huiyansdk.operate;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p079ai.log.AiLog;
import com.tencent.could.component.common.p079ai.net.HttpMethod;
import com.tencent.could.component.common.p079ai.net.IJsonDataListener;
import com.tencent.could.component.common.p079ai.net.TXCHttp;
import com.tencent.could.component.common.p079ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.C13928c;
import com.tencent.could.huiyansdk.utils.C13930e;
import com.tencent.could.huiyansdk.utils.C13935j;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13907a {

    /* JADX INFO: renamed from: a */
    public HuiYanOperateBody f57469a;

    /* JADX INFO: renamed from: b */
    public Map<String, Long> f57470b = new ArrayMap(10);

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a$a */
    public class a implements IJsonDataListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f57471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f57472b;

        public a(C13907a c13907a, boolean z, File file) {
            this.f57471a = z;
            this.f57472b = file;
        }

        @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
        public void onFailed(String str) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "007 onFailed s:" + str);
        }

        @Override // com.tencent.could.component.common.p079ai.net.IJsonDataListener
        public void onSuccess(String str) {
            File file;
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(1, "OperateInfoManager", "upload 007 info success! " + str);
            if (!this.f57471a || (file = this.f57472b) == null || file.delete()) {
                return;
            }
            c13905e.m82337a(2, "OperateInfoManager", "upload content success, but delete file error : path " + this.f57472b.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C13907a f57473a = new C13907a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82364b(String str, boolean z, File file) {
        TwoTuple<String, String> twoTupleM82392a = C13928c.m82392a(false);
        if (twoTupleM82392a == null) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "getRequestConnectIp is null!");
            return;
        }
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(twoTupleM82392a.first + "/api/sdk/monitor/reportV1").setDeputyUrl(twoTupleM82392a.second + "/api/sdk/monitor/reportV1").setHttpMethod(HttpMethod.POST).setRequestHeaders(null).setGzip(true).setRequestData(str).createNetWorkParam(), new a(this, z, file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m82365c() {
        String str;
        Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (contextM82240a == null) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "current context is null!");
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("cloud-huiyan");
            String str2 = File.separator;
            sb.append(str2);
            sb.append("operate");
            str = contextM82240a.getFilesDir() + str2 + sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "dirPath is empty!");
            return;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory()) {
                try {
                    if (file.lastModified() < System.currentTimeMillis() - 259200000 && !file.delete()) {
                        C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82369a(String str, int i, boolean z, String str2) {
        Exception exc;
        String str3;
        C13907a c13907a;
        try {
            if (i == 1) {
                this.f57470b.put(str, Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (i == 2) {
                try {
                    if (!this.f57470b.containsKey(str)) {
                        C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "not found event start:" + str);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f57470b.get(str).longValue();
                    if (jCurrentTimeMillis <= 0) {
                        return;
                    }
                    try {
                        if (z) {
                            c13907a = this;
                            str3 = str;
                            c13907a.m82368a(str3, -1, jCurrentTimeMillis, str2);
                        } else {
                            c13907a = this;
                            str3 = str;
                            c13907a.m82368a(str3, 1, jCurrentTimeMillis, str2);
                        }
                        c13907a.f57470b.remove(str3);
                        return;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str;
                }
                exc = e;
                C13930e c13930e = C13930e.a.f57508a;
                String str4 = "opOperateTimeEvent error! action: " + str3 + " exc: " + exc.getLocalizedMessage();
                if (c13930e.f57506a) {
                    AiLog.error("OperateInfoManager", str4);
                }
            }
        } catch (Exception e3) {
            exc = e3;
            str3 = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82371b() {
        String json;
        try {
            json = new Gson().toJson((HuiYanOperateBody) this.f57469a.clone());
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", e.getMessage());
            json = "";
        }
        m82370a(json, false, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m82366a() {
        C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.yhq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198385a.m82365c();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m82370a(final String str, final boolean z, File file) {
        if (TextUtils.isEmpty(str)) {
            C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "doUploadInfo content is empty!");
            return;
        }
        C13905e.a.f57445a.m82337a(2, "OperateInfoManager", "real upload info!");
        final File file2 = null;
        C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.xhq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192905a.m82364b(str, z, file2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82367a(int i, String str) {
        String str2 = i + "";
        HuiYanOperateBody huiYanOperateBody = this.f57469a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.setErrorCode(str2);
            this.f57469a.setErrorMessage(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82368a(String str, int i, long j, String str2) {
        String str3;
        String str4;
        HuiYanOperateBody huiYanOperateBody = this.f57469a;
        if (huiYanOperateBody != null) {
            str3 = str;
            str4 = str2;
            huiYanOperateBody.updateInfo(str3, i, j, System.currentTimeMillis(), str4);
        } else {
            str3 = str;
            str4 = str2;
        }
        if ("Crash".equals(str3)) {
            String str5 = "get crash: " + str4;
            if (C13930e.a.f57508a.f57506a) {
                AiLog.error("OperateInfoManager", str5);
            }
        }
    }
}
