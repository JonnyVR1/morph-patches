package com.tencent.could.huiyansdk.helper;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.exception.C14053a;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.utils.C14098j;
import com.tencent.youtu.liveness.YTCommonInterface;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFrameworkTool;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.Primes;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.helper.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14063b {

    /* JADX INFO: renamed from: a */
    public JSONObject f58250a;

    /* JADX INFO: renamed from: b */
    public YtSDKKitFramework.IYtSDKKitNetResponseParser f58251b;

    /* JADX INFO: renamed from: c */
    public boolean f58252c = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.helper.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14063b f58253a = new C14063b();
    }

    public C14063b() {
        System.loadLibrary("YTCommonLiveness");
    }

    /* JADX INFO: renamed from: a */
    public final int m83494a(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        C14050a c14050a = C14050a.a.f58212a;
        YtSDKKitFrameworkTool.setHuiYanVersion(c14050a.f58208c);
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "YouTuSdkHelper", "[huiyan version]: " + c14050a.f58208c);
        c14068e.m83520a(1, "YouTuSdkHelper", "[yt version]: " + YtSDKKitFramework.getInstance().version());
        if (c14050a.f58211f) {
            YtLogger.setLogLevel(-1000);
        } else if (this.f58252c) {
            YtLogger.setLogLevel(4);
        } else {
            YtLogger.setLogLevel(0);
        }
        YtLogger.setLoggerListener(new YtLogger.IYtLoggerListener() { // from class: l.ytq0
            @Override // com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener
            public final void log(String str, String str2) {
                C14063b.m83493a(str, str2);
            }
        });
        try {
            return YtSDKKitFramework.getInstance().init(ytSDKPlatformContext, YtSDKKitConfigHelper.getSDKConfig(ytSDKKitFrameworkWorkMode, this.f58250a), ytSDKKitFrameworkWorkMode, YtSDKKitConfigHelper.getPipleStateNames(ytSDKKitFrameworkWorkMode), iYtSDKKitFrameworkEventListener);
        } catch (Exception e) {
            C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "startCheckAuth init error: " + e.getLocalizedMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83504b(String str, boolean z) {
        if (this.f58250a == null) {
            return;
        }
        String strM83496a = m83496a();
        if (this.f58250a.has(strM83496a)) {
            JSONObject jSONObject = this.f58250a.getJSONObject(strM83496a);
            jSONObject.put(str, z);
            this.f58250a.put(strM83496a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: b */
    public final YtSDKKitFramework.YtSDKKitFrameworkWorkMode m83501b() {
        int iOrdinal = HuiYanBaseApi.C14044a.f58205a.m83426b().ordinal();
        if (iOrdinal == 0) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        }
        if (iOrdinal != 1) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        }
        return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE;
    }

    /* JADX INFO: renamed from: b */
    public final void m83502b(final Context context) {
        C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.cuq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f83868a.m83491a(context);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m83503b(String str, String str2) throws JSONException {
        if (this.f58250a == null) {
            return;
        }
        String strM83496a = m83496a();
        if (this.f58250a.has(strM83496a)) {
            JSONObject jSONObject = this.f58250a.getJSONObject(strM83496a);
            jSONObject.put(str, str2);
            this.f58250a.put(strM83496a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m83496a() {
        int iOrdinal = HuiYanBaseApi.C14044a.f58205a.m83426b().ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? "action+reflect_settings" : "silent_settings";
        }
        return "action_settings";
    }

    /* JADX INFO: renamed from: a */
    public int m83495a(String str, boolean z) throws C14053a {
        int iInitAuthByAssets;
        Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
        if (contextM83423a == null) {
            C14053a c14053a = new C14053a("init youtu with null context");
            c14053a.f58213a = Primes.SMALL_FACTOR_LIMIT;
            throw c14053a;
        }
        if (z) {
            iInitAuthByAssets = YTCommonInterface.initAuthByString(str, "");
        } else {
            iInitAuthByAssets = YTCommonInterface.initAuthByAssets(str, "");
        }
        if (iInitAuthByAssets == 0) {
            m83502b(contextM83423a);
            return iInitAuthByAssets;
        }
        throw new C14053a(Primes.SMALL_FACTOR_LIMIT, "init youtu init auth return code : " + iInitAuthByAssets);
    }

    /* JADX INFO: renamed from: a */
    public static void m83493a(String str, String str2) {
        C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "YT_TAG: " + str + ", Msg: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83491a(Context context) {
        try {
            this.f58250a = new JSONObject(FileUtils.readAssetFile(context, "configs/TxyHyYtSDKSettings.json").toString()).getJSONObject("sdk_settings");
            Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
            if (contextM83423a != null) {
                try {
                    m83503b("video_path", contextM83423a.getCacheDir().getCanonicalPath() + File.separator + "temp.mp4");
                } catch (IOException unused) {
                    C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "failed to get cache path.");
                }
            }
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.mo83410b();
            }
        } catch (JSONException unused2) {
            C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "init youtu sdk config error!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83498a(String str, float f) throws JSONException {
        if (this.f58250a == null) {
            return;
        }
        String strM83496a = m83496a();
        if (this.f58250a.has(strM83496a)) {
            JSONObject jSONObject = this.f58250a.getJSONObject(strM83496a);
            jSONObject.put(str, f);
            this.f58250a.put(strM83496a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83499a(String str, long j) throws JSONException {
        if (this.f58250a == null) {
            return;
        }
        String strM83496a = m83496a();
        if (this.f58250a.has(strM83496a)) {
            JSONObject jSONObject = this.f58250a.getJSONObject(strM83496a);
            jSONObject.put(str, j);
            this.f58250a.put(strM83496a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83500a(String str, int[] iArr) throws JSONException {
        if (this.f58250a == null) {
            return;
        }
        String strM83496a = m83496a();
        if (!this.f58250a.has(strM83496a) || iArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i : iArr) {
            jSONArray.put(i);
        }
        JSONObject jSONObject = this.f58250a.getJSONObject(strM83496a);
        jSONObject.put(str, jSONArray);
        this.f58250a.put(strM83496a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m83497a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("event_id") ? jSONObject.getString("event_id") : "";
            if ("".equals(string)) {
                C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "get a empty action");
                return;
            }
            HuiYanBaseApi.C14044a.f58205a.m83425a(string, jSONObject.has("Done") ? jSONObject.getInt("Done") : 1, jSONObject.has("value") ? jSONObject.getLong("value") : 0L, jSONObject.has(BaseSei.INFO) ? jSONObject.getString(BaseSei.INFO) : "");
        } catch (NullPointerException e) {
            e = e;
            Throwable th = e;
            C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th.getLocalizedMessage());
            th.printStackTrace();
        } catch (JSONException e2) {
            e = e2;
            Throwable th2 = e;
            C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th2.getLocalizedMessage());
            th2.printStackTrace();
        }
    }
}
