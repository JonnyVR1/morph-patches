package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.immomo.resdownloader.log.MLog;
import com.p041mm.mmfile.FileUploadConfig;
import com.p041mm.mmfile.MMFileHelper;
import com.p041mm.mmfile.Strategy;
import com.p041mm.mmfile.core.FileWriteConfig;
import com.p041mm.mmfile.core.IMMFileEventListener;
import com.p041mm.mmfile.core.MMLogInfo;
import com.p046p1.mobile.putong.app.media.MediaFrontService;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class tjw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f170801a = false;

    /* JADX INFO: renamed from: l.tjw$a */
    public static class C20195a extends f5e {
        public C20195a(String str, String str2) {
            super(str, str2);
        }

        @Override // p149l.f5e, com.p041mm.mmfile.IMMFileUploader
        public boolean upload(File file) {
            boolean zUpload = super.upload(file);
            MLog.m19459d("CVCENTER_-API", " --> upload Log result:%b", String.valueOf(zUpload));
            return zUpload;
        }
    }

    static {
        m189412g();
    }

    /* JADX INFO: renamed from: a */
    public static void m189406a() {
        try {
            if (f170801a) {
                MMFileHelper.forceUploadMMFile();
            }
        } catch (Exception e) {
            MLog.m19461e("MMfileLog", "forceUploadMMFile exception :" + e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m189407b(Context context) {
        if (context == null) {
            return "noAppVersionName";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + "";
        } catch (PackageManager.NameNotFoundException e) {
            MLog.printErrStackTrace("CVCENTER_", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m189408c() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = ivc0.f115113b;
            String strM189411f = m189411f();
            MLog.m19459d("MMfileLog", strM189411f, new Object[0]);
            jSONObject.put("useragent", strM189411f);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            jSONObject.put(Constants.DEVICE_ID_TAG, ivc0.f115120i);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("CVCENTER_", th);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: d */
    private static long m189409d() {
        try {
            return (new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes() / 1024) / 1024;
        } catch (Exception e) {
            MLog.printErrStackTrace("CVCENTER_", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m189410e(Context context) {
        return context != null ? context.getPackageName() : "noPackageName";
    }

    /* JADX INFO: renamed from: f */
    private static String m189411f() {
        StringBuffer stringBuffer = new StringBuffer();
        Context context = ivc0.f115118g;
        stringBuffer.append(context == null ? "context.null" : m189410e(context));
        stringBuffer.append("/");
        stringBuffer.append(context == null ? "contextNull" : m189407b(context));
        stringBuffer.append(" Android/");
        stringBuffer.append(ivc0.f115117f + 10000);
        stringBuffer.append(" (");
        stringBuffer.append(xkd0.m209770c());
        stringBuffer.append("; Android ");
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("; Gapps 0; ");
        stringBuffer.append(Locale.getDefault().getLanguage());
        stringBuffer.append("_");
        stringBuffer.append(Locale.getDefault().getCountry());
        stringBuffer.append("; 1; ");
        stringBuffer.append(xkd0.m209769b());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m189412g() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("common");
        Context context = ivc0.f115118g;
        if (context == null) {
            return;
        }
        MMFileHelper.install(new Strategy.Builder().businesses("mmface-sdk").fileWriteConfig(new FileWriteConfig.Builder().cacheDir(context.getCacheDir().getAbsolutePath()).logDir(context.getFilesDir().getAbsolutePath()).filePrefix("cv_log_").commonInfo(new MMLogInfo(arrayList, m189408c())).eventListener(new C20196b()).build()).fileUploadConfig(new FileUploadConfig.Builder().uploader(new C20195a(ivc0.f115120i, ivc0.f115113b)).uploadClockTimeSeconds(3600L).build()).build());
        f170801a = true;
        MLog.m19461e("CVCENTER_", "MMFileHelper install: true");
    }

    /* JADX INFO: renamed from: h */
    public static void m189413h(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("business_category", 2);
            jSONObject.put("log_type", "cvcenter_log_error");
            jSONObject.put("perfStatType", 10);
            jSONObject.put("business_id", "cvcenter_sdk");
            if (!TextUtils.isEmpty(ivc0.f115114c)) {
                jSONObject.put(MediaFrontService.BUSINESS_TYPE, ivc0.f115114c);
            }
            jSONObject.put("model_name", str);
            jSONObject.put("model_error_type", i);
            jSONObject.put("model_error_msg", str2);
            jSONObject.put("model_sd_free", m189409d());
        } catch (JSONException e) {
            MLog.printErrStackTrace("CVCENTER_", e);
        }
        m189414i(jSONObject.toString());
    }

    /* JADX INFO: renamed from: i */
    private static void m189414i(String str) {
        MLog.m19459d("MMfileLog", str, new Object[0]);
        if (f170801a) {
            try {
                MMFileHelper.write("mmface-sdk", str);
                m189406a();
            } catch (Exception e) {
                MLog.m19461e("MMfileLog", " exception :" + e);
            }
        }
    }

    /* JADX INFO: renamed from: l.tjw$b */
    public static class C20196b implements IMMFileEventListener {
        @Override // com.p041mm.mmfile.core.IMMFileEventListener
        public void onEvent(int i, String str) {
        }
    }
}
