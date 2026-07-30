package com.tencent.could.huiyansdk.operate;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.log.AiLog;
import com.tencent.could.component.common.p084ai.net.HttpMethod;
import com.tencent.could.component.common.p084ai.net.IJsonDataListener;
import com.tencent.could.component.common.p084ai.net.TXCHttp;
import com.tencent.could.component.common.p084ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.utils.C14091c;
import com.tencent.could.huiyansdk.utils.C14093e;
import com.tencent.could.huiyansdk.utils.C14098j;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14070a {

    /* JADX INFO: renamed from: a */
    public HuiYanOperateBody f58317a;

    /* JADX INFO: renamed from: b */
    public Map<String, Long> f58318b = new ArrayMap(10);

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a$a */
    public class a implements IJsonDataListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f58319a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f58320b;

        public a(C14070a c14070a, boolean z, File file) {
            this.f58319a = z;
            this.f58320b = file;
        }

        @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
        public void onFailed(String str) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "007 onFailed s:" + str);
        }

        @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
        public void onSuccess(String str) {
            File file;
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(1, "OperateInfoManager", "upload 007 info success! " + str);
            if (!this.f58319a || (file = this.f58320b) == null || file.delete()) {
                return;
            }
            c14068e.m83520a(2, "OperateInfoManager", "upload content success, but delete file error : path " + this.f58320b.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.operate.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C14070a f58321a = new C14070a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83547b(String str, boolean z, File file) {
        TwoTuple<String, String> twoTupleM83575a = C14091c.m83575a(false);
        if (twoTupleM83575a == null) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "getRequestConnectIp is null!");
            return;
        }
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(twoTupleM83575a.first + "/api/sdk/monitor/reportV1").setDeputyUrl(twoTupleM83575a.second + "/api/sdk/monitor/reportV1").setHttpMethod(HttpMethod.POST).setRequestHeaders(null).setGzip(true).setRequestData(str).createNetWorkParam(), new a(this, z, file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83548c() {
        String str;
        Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (contextM83423a == null) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "current context is null!");
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("cloud-huiyan");
            String str2 = File.separator;
            sb.append(str2);
            sb.append("operate");
            str = contextM83423a.getFilesDir() + str2 + sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "dirPath is empty!");
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
                        C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83552a(String str, int i, boolean z, String str2) {
        Exception exc;
        String str3;
        C14070a c14070a;
        try {
            if (i == 1) {
                this.f58318b.put(str, Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (i == 2) {
                try {
                    if (!this.f58318b.containsKey(str)) {
                        C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "not found event start:" + str);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f58318b.get(str).longValue();
                    if (jCurrentTimeMillis <= 0) {
                        return;
                    }
                    try {
                        if (z) {
                            c14070a = this;
                            str3 = str;
                            c14070a.m83551a(str3, -1, jCurrentTimeMillis, str2);
                        } else {
                            c14070a = this;
                            str3 = str;
                            c14070a.m83551a(str3, 1, jCurrentTimeMillis, str2);
                        }
                        c14070a.f58318b.remove(str3);
                        return;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str;
                }
                exc = e;
                C14093e c14093e = C14093e.a.f58356a;
                String str4 = "opOperateTimeEvent error! action: " + str3 + " exc: " + exc.getLocalizedMessage();
                if (c14093e.f58354a) {
                    AiLog.error("OperateInfoManager", str4);
                }
            }
        } catch (Exception e3) {
            exc = e3;
            str3 = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83554b() {
        String json;
        try {
            json = new Gson().toJson((HuiYanOperateBody) this.f58317a.clone());
        } catch (Exception e) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", e.getMessage());
            json = "";
        }
        m83553a(json, false, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m83549a() {
        C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.drq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90416a.m83548c();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m83553a(final String str, final boolean z, File file) {
        if (TextUtils.isEmpty(str)) {
            C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "doUploadInfo content is empty!");
            return;
        }
        C14068e.a.f58293a.m83520a(2, "OperateInfoManager", "real upload info!");
        final File file2 = null;
        C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.crq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f83355a.m83547b(str, z, file2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83550a(int i, String str) {
        String str2 = i + "";
        HuiYanOperateBody huiYanOperateBody = this.f58317a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.setErrorCode(str2);
            this.f58317a.setErrorMessage(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83551a(String str, int i, long j, String str2) {
        String str3;
        String str4;
        HuiYanOperateBody huiYanOperateBody = this.f58317a;
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
            if (C14093e.a.f58356a.f58354a) {
                AiLog.error("OperateInfoManager", str5);
            }
        }
    }
}
