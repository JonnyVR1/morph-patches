package p149l;

import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p041mm.mmfile.FileUploadConfig;
import com.p041mm.mmfile.MMFileHelper;
import com.p041mm.mmfile.Strategy;
import com.p041mm.mmfile.core.FileWriteConfig;
import com.p041mm.mmfile.core.MMLogInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class sic0 {
    static {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("common");
        String strM155720k = mow.m155709j().m155720k();
        MMFileHelper.install(new Strategy.Builder().businesses("mmrecorder-sdk").fileWriteConfig(new FileWriteConfig.Builder().cacheDir(m184321b().toString()).logDir(m184322c().toString()).filePrefix("recordermmlog_" + wkd0.m203659d(dv0.m113757a())).commonInfo(new MMLogInfo(arrayList, m184320a())).build()).fileUploadConfig(new FileUploadConfig.Builder().uploadClockTimeSeconds(3600L).uploader(new xod(strM155720k, ukd0.f176918a)).build()).build());
    }

    /* JADX INFO: renamed from: a */
    private static String m184320a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("useragent", pic0.m169591a());
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, ukd0.f176918a);
            if (n500.f137181a.m19609b() != null) {
                jSONObject.put(Oauth2AccessToken.KEY_UID, n500.f137181a.m19609b());
            }
            jSONObject.put(Constants.DEVICE_ID_TAG, mow.m155709j().m155720k());
        } catch (Throwable th) {
            MDLog.printErrStackTrace("Cosmos-Base", th);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    private static File m184321b() {
        File file = new File(dv0.m113757a().getFilesDir(), "mmfile_recordersdk_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    private static File m184322c() {
        File file = new File(dv0.m113757a().getFilesDir(), "mmfile_recordersdk_statistic");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static void m184323d(String str) {
        MMFileHelper.write("mmrecorder-sdk", str);
    }
}
