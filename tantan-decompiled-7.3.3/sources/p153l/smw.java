package p153l;

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
import com.p046mm.mmfile.FileUploadConfig;
import com.p046mm.mmfile.MMFileHelper;
import com.p046mm.mmfile.Strategy;
import com.p046mm.mmfile.core.FileWriteConfig;
import com.p046mm.mmfile.core.IMMFileEventListener;
import com.p046mm.mmfile.core.MMLogInfo;
import com.p051p1.mobile.putong.app.media.MediaFrontService;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class smw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f169624a = false;

    /* JADX INFO: renamed from: l.smw$a */
    public static class C20109a extends t6e {
        public C20109a(String str, String str2) {
            super(str, str2);
        }

        @Override // p153l.t6e, com.p046mm.mmfile.IMMFileUploader
        public boolean upload(File file) {
            boolean zUpload = super.upload(file);
            MLog.m20458d("CVCENTER_-API", " --> upload Log result:%b", String.valueOf(zUpload));
            return zUpload;
        }
    }

    static {
        m186852g();
    }

    /* JADX INFO: renamed from: a */
    public static void m186846a() {
        try {
            if (f169624a) {
                MMFileHelper.forceUploadMMFile();
            }
        } catch (Exception e) {
            MLog.m20460e("MMfileLog", "forceUploadMMFile exception :" + e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m186847b(Context context) {
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
    private static String m186848c() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = l3d0.f129860b;
            String strM186851f = m186851f();
            MLog.m20458d("MMfileLog", strM186851f, new Object[0]);
            jSONObject.put("useragent", strM186851f);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            jSONObject.put(Constants.DEVICE_ID_TAG, l3d0.f129867i);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("CVCENTER_", th);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: d */
    private static long m186849d() {
        try {
            return (new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes() / 1024) / 1024;
        } catch (Exception e) {
            MLog.printErrStackTrace("CVCENTER_", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m186850e(Context context) {
        return context != null ? context.getPackageName() : "noPackageName";
    }

    /* JADX INFO: renamed from: f */
    private static String m186851f() {
        StringBuffer stringBuffer = new StringBuffer();
        Context context = l3d0.f129865g;
        stringBuffer.append(context == null ? "context.null" : m186850e(context));
        stringBuffer.append("/");
        stringBuffer.append(context == null ? "contextNull" : m186847b(context));
        stringBuffer.append(" Android/");
        stringBuffer.append(l3d0.f129864f + 10000);
        stringBuffer.append(" (");
        stringBuffer.append(atd0.m100177c());
        stringBuffer.append("; Android ");
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("; Gapps 0; ");
        stringBuffer.append(Locale.getDefault().getLanguage());
        stringBuffer.append("_");
        stringBuffer.append(Locale.getDefault().getCountry());
        stringBuffer.append("; 1; ");
        stringBuffer.append(atd0.m100176b());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m186852g() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("common");
        Context context = l3d0.f129865g;
        if (context == null) {
            return;
        }
        MMFileHelper.install(new Strategy.Builder().businesses("mmface-sdk").fileWriteConfig(new FileWriteConfig.Builder().cacheDir(context.getCacheDir().getAbsolutePath()).logDir(context.getFilesDir().getAbsolutePath()).filePrefix("cv_log_").commonInfo(new MMLogInfo(arrayList, m186848c())).eventListener(new C20110b()).build()).fileUploadConfig(new FileUploadConfig.Builder().uploader(new C20109a(l3d0.f129867i, l3d0.f129860b)).uploadClockTimeSeconds(3600L).build()).build());
        f169624a = true;
        MLog.m20460e("CVCENTER_", "MMFileHelper install: true");
    }

    /* JADX INFO: renamed from: h */
    public static void m186853h(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("business_category", 2);
            jSONObject.put("log_type", "cvcenter_log_error");
            jSONObject.put("perfStatType", 10);
            jSONObject.put("business_id", "cvcenter_sdk");
            if (!TextUtils.isEmpty(l3d0.f129861c)) {
                jSONObject.put(MediaFrontService.BUSINESS_TYPE, l3d0.f129861c);
            }
            jSONObject.put("model_name", str);
            jSONObject.put("model_error_type", i);
            jSONObject.put("model_error_msg", str2);
            jSONObject.put("model_sd_free", m186849d());
        } catch (JSONException e) {
            MLog.printErrStackTrace("CVCENTER_", e);
        }
        m186854i(jSONObject.toString());
    }

    /* JADX INFO: renamed from: i */
    private static void m186854i(String str) {
        MLog.m20458d("MMfileLog", str, new Object[0]);
        if (f169624a) {
            try {
                MMFileHelper.write("mmface-sdk", str);
                m186846a();
            } catch (Exception e) {
                MLog.m20460e("MMfileLog", " exception :" + e);
            }
        }
    }

    /* JADX INFO: renamed from: l.smw$b */
    public static class C20110b implements IMMFileEventListener {
        @Override // com.p046mm.mmfile.core.IMMFileEventListener
        public void onEvent(int i, String str) {
        }
    }
}
