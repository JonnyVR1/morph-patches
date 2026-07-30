package p153l;

import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046mm.mmfile.FileUploadConfig;
import com.p046mm.mmfile.MMFileHelper;
import com.p046mm.mmfile.Strategy;
import com.p046mm.mmfile.core.FileWriteConfig;
import com.p046mm.mmfile.core.MMLogInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class zqc0 {
    static {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("common");
        String strM155664k = lrw.m155653j().m155664k();
        MMFileHelper.install(new Strategy.Builder().businesses("mmrecorder-sdk").fileWriteConfig(new FileWriteConfig.Builder().cacheDir(m221004b().toString()).logDir(m221005c().toString()).filePrefix("recordermmlog_" + zsd0.m221337d(kv0.m151647a())).commonInfo(new MMLogInfo(arrayList, m221003a())).build()).fileUploadConfig(new FileUploadConfig.Builder().uploadClockTimeSeconds(3600L).uploader(new cqd(strM155664k, xsd0.f196082a)).build()).build());
    }

    /* JADX INFO: renamed from: a */
    private static String m221003a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("useragent", wqc0.m207503a());
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, xsd0.f196082a);
            if (be00.f76323a.m20608b() != null) {
                jSONObject.put(Oauth2AccessToken.KEY_UID, be00.f76323a.m20608b());
            }
            jSONObject.put(Constants.DEVICE_ID_TAG, lrw.m155653j().m155664k());
        } catch (Throwable th) {
            MDLog.printErrStackTrace("Cosmos-Base", th);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    private static File m221004b() {
        File file = new File(kv0.m151647a().getFilesDir(), "mmfile_recordersdk_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    private static File m221005c() {
        File file = new File(kv0.m151647a().getFilesDir(), "mmfile_recordersdk_statistic");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static void m221006d(String str) {
        MMFileHelper.write("mmrecorder-sdk", str);
    }
}
