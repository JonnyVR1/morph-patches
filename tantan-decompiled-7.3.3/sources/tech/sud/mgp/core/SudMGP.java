package tech.sud.mgp.core;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.List;
import p153l.arg0;
import p153l.chg0;
import p153l.dhg0;
import p153l.fug0;
import p153l.kfg0;
import p153l.tsg0;
import p153l.utg0;
import p153l.uyg0;
import p153l.wxg0;
import tech.sud.base.utils.Utils;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerGetMGList;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.core.ISudListenerReportStatsEvent;
import tech.sud.gip.core.ISudListenerUninitSDK;
import tech.sud.gip.core.ISudLogger;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.gip.core.SudLoadMGParamModel;
import tech.sud.gip.core.network.detection.INetworkDetectionFuture;
import tech.sud.gip.core.network.detection.INetworkDetectionListener;
import tech.sud.gip.core.network.detection.NetworkDetectionResult;
import tech.sud.gip.core.network.detection.SudNetworkDetectionParamModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SudMGP {
    private static final String FILE_TAG = "SudMGP";
    private static final String _TAG = "SudMGP SudMGP";

    public static void cancelPreloadMGPkgList(List<Long> list) {
        if (!ThreadUtils.checkUIThread()) {
            LogUtils.file(FILE_TAG, "cancelPreloadMGPkgList Please call on UI or Main thread");
            return;
        }
        wxg0 wxg0Var = wxg0.f191490c;
        if (wxg0Var == null) {
            LogUtils.file(FILE_TAG, "cancelPreloadMGPkgList preloader is null");
        } else {
            wxg0Var.cancelPreloadMGPkgList(list);
        }
    }

    public static boolean destroyMG(ISudFSTAPP iSudFSTAPP) {
        if (ThreadUtils.checkUIThread()) {
            if (iSudFSTAPP != null) {
                return iSudFSTAPP.destroyMG();
            }
            return true;
        }
        SudLogger.m222813e(FILE_TAG, "destroyMG Please call on UI or Main thread");
        LogUtils.file(FILE_TAG, "destroyMG Please call on UI or Main thread");
        return false;
    }

    public static ISudCfg getCfg() {
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(FILE_TAG, "Please call on UI or Main thread");
        }
        return arg0.f72934a;
    }

    public static String getLogDirPath(Context context) {
        return LogUtils.getLogDirPath(context);
    }

    public static void getMGList(ISudListenerGetMGList iSudListenerGetMGList) {
        if (!ThreadUtils.checkUIThread() && iSudListenerGetMGList != null) {
            iSudListenerGetMGList.onFailure(-1, "Please call on UI or Main thread");
        }
        String str = utg0.f180946a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (iSudListenerGetMGList != null) {
                iSudListenerGetMGList.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            return;
        }
        uyg0 uyg0Var = utg0.f180947b;
        if (uyg0Var.f181601a) {
            tsg0.f175997c.execute(new kfg0(uyg0Var, uyg0Var.f181609i, iSudListenerGetMGList));
        } else if (iSudListenerGetMGList != null) {
            iSudListenerGetMGList.onFailure(-10103, "Please call initSDK first successfully");
        }
    }

    public static String getVersion() {
        return "1.6.7.1286";
    }

    public static String getVersionAlias() {
        return "v1.6.7.1286-static";
    }

    @Deprecated
    public static void initSDK(Context context, String str, String str2, boolean z, ISudListenerInitSDK iSudListenerInitSDK) {
        SudInitSDKParamModel sudInitSDKParamModel = new SudInitSDKParamModel();
        sudInitSDKParamModel.context = context.getApplicationContext();
        sudInitSDKParamModel.appId = str;
        sudInitSDKParamModel.appKey = str2;
        sudInitSDKParamModel.isTestEnv = z;
        initSDK(sudInitSDKParamModel, iSudListenerInitSDK);
    }

    public static ISudFSTAPP loadMG(SudLoadMGParamModel sudLoadMGParamModel, ISudFSMMG iSudFSMMG) {
        String str = _TAG;
        SudLogger.m222815i(str, "loadMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(str, "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "loadMG Please call on UI or Main thread");
            return null;
        }
        if (sudLoadMGParamModel == null || !sudLoadMGParamModel.check() || iSudFSMMG == null) {
            SudLogger.m222813e(str, "Parameters cannot be null");
            LogUtils.file(FILE_TAG, "loadMG Parameters cannot be null");
            return null;
        }
        Utils.initContext(sudLoadMGParamModel.activity);
        fug0.f100911a = sudLoadMGParamModel.userId;
        utg0.f180949d = sudLoadMGParamModel.language;
        return new dhg0(sudLoadMGParamModel, iSudFSMMG);
    }

    public static void preloadMGPkgList(Context context, List<Long> list, ISudListenerPreloadMGPkg iSudListenerPreloadMGPkg) {
        if (!ThreadUtils.checkUIThread()) {
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -1, "Please call on UI or Main thread");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call on UI or Main thread");
            return;
        }
        wxg0 wxg0Var = wxg0.f191490c;
        if (wxg0Var == null) {
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -10103, "Please call initSDK first successfully");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call initSDK first successfully");
        } else {
            if (list != null && list.size() != 0) {
                wxg0Var.preloadMGPkgList(context, list, iSudListenerPreloadMGPkg);
                return;
            }
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -10104, "Parameters cannot be null");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call initSDK first successfully");
        }
    }

    public static void setLogLevel(int i) {
        LogUtils.file(FILE_TAG, "setLogLevel:" + i);
        if (ThreadUtils.checkUIThread()) {
            SudLogger.setLogLevel(i);
        } else {
            SudLogger.m222813e(FILE_TAG, "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "setLogLevel Please call on UI or Main thread");
        }
    }

    public static void setLogger(ISudLogger iSudLogger) {
        LogUtils.file(FILE_TAG, "setLogger:" + iSudLogger);
        if (ThreadUtils.checkUIThread()) {
            SudLogger.setLogger(iSudLogger);
        } else {
            SudLogger.m222813e(FILE_TAG, "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "setLogger Please call on UI or Main thread");
        }
    }

    public static boolean setReportStatsEventListener(ISudListenerReportStatsEvent iSudListenerReportStatsEvent) {
        if (ThreadUtils.checkUIThread()) {
            fug0.f100912b = iSudListenerReportStatsEvent;
            return true;
        }
        SudLogger.m222813e(FILE_TAG, "Please call on UI or Main thread");
        return false;
    }

    @Deprecated
    public static void setUserId(String str) {
    }

    public static INetworkDetectionFuture startNetworkDetection(SudNetworkDetectionParamModel sudNetworkDetectionParamModel, INetworkDetectionListener iNetworkDetectionListener) {
        if (sudNetworkDetectionParamModel != null && sudNetworkDetectionParamModel.check()) {
            chg0 chg0Var = new chg0(sudNetworkDetectionParamModel, iNetworkDetectionListener);
            new Thread(chg0Var).start();
            return chg0Var.f81805c;
        }
        LogUtils.file(FILE_TAG, "initSDK Parameters cannot be null");
        SudLogger.m222813e(_TAG, "initSDK Parameters cannot be null");
        if (iNetworkDetectionListener == null) {
            return null;
        }
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        networkDetectionResult.code = -10104;
        networkDetectionResult.msg = "Parameters cannot be null";
        iNetworkDetectionListener.onCompleted(networkDetectionResult);
        return null;
    }

    public static void uninitSDK(ISudListenerUninitSDK iSudListenerUninitSDK) {
        LogUtils.file(FILE_TAG, "uninitSDK");
        if (!ThreadUtils.checkUIThread()) {
            if (iSudListenerUninitSDK != null) {
                iSudListenerUninitSDK.onFailure(-1, "Please call on UI or Main thread");
            }
        } else {
            utg0.f180947b.m198637f();
            if (iSudListenerUninitSDK != null) {
                iSudListenerUninitSDK.onSuccess();
            }
        }
    }

    public static void initSDK(SudInitSDKParamModel sudInitSDKParamModel, ISudListenerInitSDK iSudListenerInitSDK) {
        utg0.m198034b(sudInitSDKParamModel, iSudListenerInitSDK, null, null);
    }

    @Deprecated
    public static ISudFSTAPP loadMG(Activity activity, String str, String str2, String str3, long j, String str4, ISudFSMMG iSudFSMMG) {
        SudLoadMGParamModel sudLoadMGParamModel = new SudLoadMGParamModel();
        sudLoadMGParamModel.activity = activity;
        sudLoadMGParamModel.userId = str;
        sudLoadMGParamModel.roomId = str2;
        sudLoadMGParamModel.code = str3;
        sudLoadMGParamModel.mgId = j;
        sudLoadMGParamModel.language = str4;
        return loadMG(sudLoadMGParamModel, iSudFSMMG);
    }
}
