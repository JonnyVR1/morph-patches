package com.tencent.could.huiyansdk.helper;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.exception.C13890a;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.C13935j;
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
/* JADX INFO: loaded from: classes2.dex */
public class C13900b {

    /* JADX INFO: renamed from: a */
    public JSONObject f57402a;

    /* JADX INFO: renamed from: b */
    public YtSDKKitFramework.IYtSDKKitNetResponseParser f57403b;

    /* JADX INFO: renamed from: c */
    public boolean f57404c = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.helper.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13900b f57405a = new C13900b();
    }

    public C13900b() {
        System.loadLibrary("YTCommonLiveness");
    }

    /* JADX INFO: renamed from: a */
    public final int m82311a(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        C13887a c13887a = C13887a.a.f57364a;
        YtSDKKitFrameworkTool.setHuiYanVersion(c13887a.f57360c);
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "YouTuSdkHelper", "[huiyan version]: " + c13887a.f57360c);
        c13905e.m82337a(1, "YouTuSdkHelper", "[yt version]: " + YtSDKKitFramework.getInstance().version());
        if (c13887a.f57363f) {
            YtLogger.setLogLevel(-1000);
        } else if (this.f57404c) {
            YtLogger.setLogLevel(4);
        } else {
            YtLogger.setLogLevel(0);
        }
        YtLogger.setLoggerListener(new YtLogger.IYtLoggerListener() { // from class: l.skq0
            @Override // com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener
            public final void log(String str, String str2) {
                C13900b.m82310a(str, str2);
            }
        });
        try {
            return YtSDKKitFramework.getInstance().init(ytSDKPlatformContext, YtSDKKitConfigHelper.getSDKConfig(ytSDKKitFrameworkWorkMode, this.f57402a), ytSDKKitFrameworkWorkMode, YtSDKKitConfigHelper.getPipleStateNames(ytSDKKitFrameworkWorkMode), iYtSDKKitFrameworkEventListener);
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "startCheckAuth init error: " + e.getLocalizedMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82321b(String str, boolean z) {
        if (this.f57402a == null) {
            return;
        }
        String strM82313a = m82313a();
        if (this.f57402a.has(strM82313a)) {
            JSONObject jSONObject = this.f57402a.getJSONObject(strM82313a);
            jSONObject.put(str, z);
            this.f57402a.put(strM82313a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: b */
    public final YtSDKKitFramework.YtSDKKitFrameworkWorkMode m82318b() {
        int iOrdinal = HuiYanBaseApi.C13881a.f57357a.m82243b().ordinal();
        if (iOrdinal == 0) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        }
        if (iOrdinal != 1) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        }
        return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE;
    }

    /* JADX INFO: renamed from: b */
    public final void m82319b(final Context context) {
        C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.wkq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186798a.m82308a(context);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m82320b(String str, String str2) throws JSONException {
        if (this.f57402a == null) {
            return;
        }
        String strM82313a = m82313a();
        if (this.f57402a.has(strM82313a)) {
            JSONObject jSONObject = this.f57402a.getJSONObject(strM82313a);
            jSONObject.put(str, str2);
            this.f57402a.put(strM82313a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m82313a() {
        int iOrdinal = HuiYanBaseApi.C13881a.f57357a.m82243b().ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? "action+reflect_settings" : "silent_settings";
        }
        return "action_settings";
    }

    /* JADX INFO: renamed from: a */
    public int m82312a(String str, boolean z) throws C13890a {
        int iInitAuthByAssets;
        Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        if (contextM82240a == null) {
            C13890a c13890a = new C13890a("init youtu with null context");
            c13890a.f57365a = Primes.SMALL_FACTOR_LIMIT;
            throw c13890a;
        }
        if (z) {
            iInitAuthByAssets = YTCommonInterface.initAuthByString(str, "");
        } else {
            iInitAuthByAssets = YTCommonInterface.initAuthByAssets(str, "");
        }
        if (iInitAuthByAssets == 0) {
            m82319b(contextM82240a);
            return iInitAuthByAssets;
        }
        throw new C13890a(Primes.SMALL_FACTOR_LIMIT, "init youtu init auth return code : " + iInitAuthByAssets);
    }

    /* JADX INFO: renamed from: a */
    public static void m82310a(String str, String str2) {
        C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "YT_TAG: " + str + ", Msg: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82308a(Context context) {
        try {
            this.f57402a = new JSONObject(FileUtils.readAssetFile(context, "configs/TxyHyYtSDKSettings.json").toString()).getJSONObject("sdk_settings");
            Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
            if (contextM82240a != null) {
                try {
                    m82320b("video_path", contextM82240a.getCacheDir().getCanonicalPath() + File.separator + "temp.mp4");
                } catch (IOException unused) {
                    C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "failed to get cache path.");
                }
            }
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.mo82227b();
            }
        } catch (JSONException unused2) {
            C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "init youtu sdk config error!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82315a(String str, float f) throws JSONException {
        if (this.f57402a == null) {
            return;
        }
        String strM82313a = m82313a();
        if (this.f57402a.has(strM82313a)) {
            JSONObject jSONObject = this.f57402a.getJSONObject(strM82313a);
            jSONObject.put(str, f);
            this.f57402a.put(strM82313a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82316a(String str, long j) throws JSONException {
        if (this.f57402a == null) {
            return;
        }
        String strM82313a = m82313a();
        if (this.f57402a.has(strM82313a)) {
            JSONObject jSONObject = this.f57402a.getJSONObject(strM82313a);
            jSONObject.put(str, j);
            this.f57402a.put(strM82313a, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82317a(String str, int[] iArr) throws JSONException {
        if (this.f57402a == null) {
            return;
        }
        String strM82313a = m82313a();
        if (!this.f57402a.has(strM82313a) || iArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i : iArr) {
            jSONArray.put(i);
        }
        JSONObject jSONObject = this.f57402a.getJSONObject(strM82313a);
        jSONObject.put(str, jSONArray);
        this.f57402a.put(strM82313a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m82314a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("event_id") ? jSONObject.getString("event_id") : "";
            if ("".equals(string)) {
                C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "get a empty action");
                return;
            }
            HuiYanBaseApi.C13881a.f57357a.m82242a(string, jSONObject.has("Done") ? jSONObject.getInt("Done") : 1, jSONObject.has("value") ? jSONObject.getLong("value") : 0L, jSONObject.has(BaseSei.INFO) ? jSONObject.getString(BaseSei.INFO) : "");
        } catch (NullPointerException e) {
            e = e;
            Throwable th = e;
            C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th.getLocalizedMessage());
            th.printStackTrace();
        } catch (JSONException e2) {
            e = e2;
            Throwable th2 = e;
            C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th2.getLocalizedMessage());
            th2.printStackTrace();
        }
    }
}
