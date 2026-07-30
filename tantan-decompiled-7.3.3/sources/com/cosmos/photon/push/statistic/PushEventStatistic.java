package com.cosmos.photon.push.statistic;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.EventUploaderImpl;
import com.cosmos.photon.push.PhotonPushManager;
import com.cosmos.photon.push.PushApi;
import com.cosmos.photon.push.PushPreferenceUtils;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.log.LogUtil;
import com.cosmos.photon.push.util.AppContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046mm.mmfile.FileUploadConfig;
import com.p046mm.mmfile.LibraryLoader;
import com.p046mm.mmfile.MMFileHelper;
import com.p046mm.mmfile.Strategy;
import com.p046mm.mmfile.core.FileWriteConfig;
import com.p046mm.mmfile.core.IMMFileEventListener;
import com.p046mm.mmfile.core.MMLogInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p153l.ylc0;

/* JADX INFO: loaded from: classes.dex */
public class PushEventStatistic {
    static {
        MMFileHelper.setLibraryLoader(new LibraryLoader() { // from class: com.cosmos.photon.push.statistic.PushEventStatistic.1
            @Override // com.p046mm.mmfile.LibraryLoader
            public boolean loadLibrary(String str) {
                try {
                    System.loadLibrary(str);
                    MDLog.m7452v(LogTag.STATISTIC, "System.loadLibrary(%s) success", str);
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                    if (AppContext.getContext() != null) {
                        try {
                            ylc0.m216566a(AppContext.getContext(), str);
                            return true;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            MDLog.m7446e(LogTag.STATISTIC, "System.loadLibrary(%s) failed,", str);
                            return false;
                        }
                    }
                    MDLog.m7446e(LogTag.STATISTIC, "System.loadLibrary(%s) failed,", str);
                    return false;
                } catch (Throwable unused) {
                    MDLog.m7446e(LogTag.STATISTIC, "System.loadLibrary(%s) failed,", str);
                    return false;
                }
            }
        });
    }

    public static void forceUpload() {
        MMFileHelper.forceUploadMMFile();
    }

    private static String getCommonBody() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("useragent", AppContext.getUserAgent());
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.STATISTIC, th);
        }
        return jSONObject.toString();
    }

    private static List<String> getCommonHeaders() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("common");
        return arrayList;
    }

    private static MMLogInfo getCommonInfo() {
        return new MMLogInfo(getCommonHeaders(), getCommonBody());
    }

    private static File getMMFileCacheHome(Context context) {
        File file = new File(context.getFilesDir(), "mmfile_push_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File getMMFileSaveDir(Context context) {
        File file = new File(context.getFilesDir(), "mmfile_push_statistic");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void init(Context context) {
        MMFileHelper.install(new Strategy.Builder().businesses(LogUtil.STATISTIC_LOG).fileWriteConfig(new FileWriteConfig.Builder().isCrypt(false).isCompress(true).cacheDir(getMMFileCacheHome(context).getAbsolutePath()).logDir(getMMFileSaveDir(context).getAbsolutePath()).filePrefix("mmpush_sdk_" + LogUtil.getProcessSuffix(context)).commonInfo(getCommonInfo()).eventListener(new IMMFileEventListener() { // from class: com.cosmos.photon.push.statistic.PushEventStatistic.2
            @Override // com.p046mm.mmfile.core.IMMFileEventListener
            public void onEvent(int i, String str) {
                MDLog.m7444d(LogTag.STATISTIC, "mmfile event : %d %s", Integer.valueOf(i), str);
            }
        }).build()).fileUploadConfig(new FileUploadConfig.Builder().uploadClockTimeSeconds(900L).deleteAfterUploaded(true).uploader(new EventUploaderImpl()).build()).build());
    }

    public static void logPushEventInfo(EventLogBody eventLogBody) {
        if (eventLogBody == null) {
            return;
        }
        String string = eventLogBody.toString();
        MDLog.m7450i(LogTag.API, "[%d]%s", Integer.valueOf(eventLogBody.uploadType), string);
        int i = eventLogBody.uploadType;
        if (i == 0) {
            try {
                MMFileHelper.write(LogUtil.STATISTIC_LOG, string);
                return;
            } catch (Throwable th) {
                MDLog.printErrStackTrace(LogTag.STATISTIC, th);
                return;
            }
        }
        if (i == 1) {
            try {
                MMFileHelper.write(LogUtil.STATISTIC_LOG, string);
            } catch (Throwable th2) {
                MDLog.printErrStackTrace(LogTag.STATISTIC, th2);
            }
            PushApi.log(PushPreferenceUtils.getPToken(), PhotonPushManager.APP_ID, string);
            return;
        }
        if (i == 2) {
            PushApi.log(PushPreferenceUtils.getPToken(), PhotonPushManager.APP_ID, string);
            return;
        }
        try {
            MMFileHelper.write(LogUtil.STATISTIC_LOG, string);
        } catch (Throwable th3) {
            MDLog.printErrStackTrace(LogTag.STATISTIC, th3);
        }
    }

    public static void logRegCallback(String str, String str2, JSONObject[] jSONObjectArr) {
        if (jSONObjectArr == null || jSONObjectArr.length == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            jSONObject.put("action", "registFailedAndTryReferee");
            jSONObject.put("type", 10001);
            jSONObject.put(Constants.DEVICE_ID_TAG, str2);
            int i = 0;
            for (JSONObject jSONObject2 : jSONObjectArr) {
                jSONObject.put(String.format("content %d", Integer.valueOf(i)), jSONObject2);
                i++;
            }
            try {
                MMFileHelper.write(LogUtil.STATISTIC_LOG, jSONObject.toString());
            } catch (Throwable th) {
                MDLog.printErrStackTrace(LogTag.STATISTIC, th);
            }
        } catch (Throwable unused) {
        }
    }

    public static void logPushEventInfo(String str) {
        if (str == null) {
            return;
        }
        try {
            MDLog.m7449i(LogTag.STATISTIC, str);
            MMFileHelper.write(LogUtil.STATISTIC_LOG, str);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.STATISTIC, th);
        }
    }
}
